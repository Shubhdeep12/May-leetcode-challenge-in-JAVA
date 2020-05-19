class StockSpanner {
    private int[] list;
    private int[] count;
    private int i; 
    public StockSpanner() {
        list =new int[10000];
        count =new int[10000];
        i=-1;
    }
    
    public int next(int price) {
        int p=1;
        
        while(i>=0 && this.list[i]<=price){
            p+=this.count[i--];
             
        }
        i++;
        this.list[i]=price;
        this.count[i]=p;
        return p;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */