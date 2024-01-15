 class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        List<List<Integer>> al_final = new ArrayList<>();

        //getting all elements
        for(int i = 0; i < matches.length; i++){
            for(int j = 0; j < 2; j++){
                set.add(matches[i][j]);
            }
        }

        //incrementing count of matches lost by every player
        for(int i = 0; i < matches.length; i++){
            if(set.contains(matches[i][1])){
                map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
            }
        }

        //putting elements which havent lost at all in map with count of matches lost as 0
        for(Integer ele: set){
            if(map.containsKey(ele)){
                continue;
            }
            else{
                map.put(ele, 0);
            }
        }

        //segregating people who lost one match, and those who lost none
        for(Integer i: map.keySet()){
            if(map.get(i) == 0){
                al1.add(i);
            }

            else if(map.get(i) == 1){
                al2.add(i);
            }
        }

        //satisfying problem statement condition, sorting players in ascending order
        Collections.sort(al1);
        Collections.sort(al2);

        //adding both lists of 0 wins and 1 wins and adding to a final arraylist to return
        al_final.add(al1);
        al_final.add(al2);

        return al_final;
    }
}