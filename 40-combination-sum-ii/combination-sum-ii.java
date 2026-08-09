class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] candidates, int target, int start,
                   List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Skip duplicate numbers at the same level
            if (i > start && candidates[i] == candidates[i - 1])
                continue;

            // Since array is sorted
            if (candidates[i] > target)
                break;

            list.add(candidates[i]);

            // i + 1 because each number can be used only once
            backtrack(candidates, target - candidates[i],
                      i + 1, list, ans);

            list.remove(list.size() - 1);
        }
    }
}