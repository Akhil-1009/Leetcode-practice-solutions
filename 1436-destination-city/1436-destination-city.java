class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map=new HashMap<String,String>();
        for(int i=0;i<paths.size();i++)
        {   List<String> l=paths.get(i);   
            String key=l.get(0);
                String value=l.get(1);
            map.put(key,value);
        }
        String find=paths.get(0).get(0);
        while(map.containsKey(find))
        {
            find=map.get(find);
        }
        return find;
            
    }
}