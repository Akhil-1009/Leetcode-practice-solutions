class StockSpanner {
    static class Pair{
        int x;
        int span;
        Pair(int x, int span){
            this.x =x;
            this.span =span;
        }
    }
    private Stack<Pair> st;
    public StockSpanner() {
        st=new Stack<Pair>();
    }
    
    public int next(int price) {
        int spanc=1;
        while(!st.isEmpty()&&st.peek().x<=price)
        {
            Pair p=st.pop();
            spanc+=p.span;
        }
        Pair p1=new Pair(price,spanc);
        st.push(p1);
        return spanc;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */