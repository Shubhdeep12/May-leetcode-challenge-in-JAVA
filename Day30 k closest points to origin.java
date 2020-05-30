class Solution {
    public  int[][] kClosest(int[][] points, int K) {
        int[][] an = new int[K][2];
        PriorityQueue<int[]> pque = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                double d1 = Dist(p1);
                double d2 = Dist(p2);
                if (d1 > d2) 
                    return 1;
                
                else if (d1 < d2)
                    return -1;
                
                else 
                    return 0;
                
            }
        });

        for (int[] point : points)
            pque.add(point);
        

        for (int i=0; i<K; i++)
            an[i] = pque.poll();
        
        
        return an;
    }

    public double Dist(int[] p) {
        return Math.sqrt(Math.pow(p[0], 2) + Math.pow(p[1], 2));
    }
}