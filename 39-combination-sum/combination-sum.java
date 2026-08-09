class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }

    void backtrack(int[] candidates, int target, int i, int sum, List<Integer> list) {

        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (i == candidates.length || sum > target) {
            return;
        }

        // Take the current number
        list.add(candidates[i]);
        backtrack(candidates, target, i, sum + candidates[i], list);

        // Remove it
        list.remove(list.size() - 1);

        // Skip the current number
        backtrack(candidates, target, i + 1, sum, list);
    }
}