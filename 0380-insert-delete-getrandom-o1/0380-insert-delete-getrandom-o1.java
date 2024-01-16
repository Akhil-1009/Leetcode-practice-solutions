class RandomizedSet {
    Set<Integer> s;
    public RandomizedSet() {
        s=new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return s.add(val);
        // return p;
        
    }
    
    public boolean remove(int val) {
       return s.remove(val);
    }
    
    public int getRandom() {
        ArrayList<Integer> ar=new ArrayList<Integer>(s);
        int p=((int)(Math.random()*10))%s.size();
        // system.out.println(p);
        return ar.get(p);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */