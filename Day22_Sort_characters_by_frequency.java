class Solution {
    public String frequencySort(String s) {
        List<String> list=Arrays.asList(s.split(""));
        Collections.sort(list);
        List<List<String>> list1=new ArrayList();
        List list2=new ArrayList();
        int k=0;
        int count=1;
        int i=0;
        for(i=1;i<list.size();i++) {
        	if(list.get(i).equals(list.get(i-1))){
        		count++;
        		
        	}
        	else {
        		list1.add(list.subList(k, i));
        		list2.add(count);
        		count=1;
        		k=i;
        	}
        }
        list1.add(list.subList(k, i));
		list2.add(count);
		String st="";
		for(int j=0;j<list2.size();j++) {
			int ind=list2.indexOf(Collections.max(list2));
			
			st=st+ String.join("",list1.get(ind));
			list2.set(ind, 0);
		}
        return st;
    }
}