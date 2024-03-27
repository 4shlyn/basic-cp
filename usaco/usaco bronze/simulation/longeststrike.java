import java.util.*;
class longeststrike{
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Scanner lines = new Scanner(System.in);
    int tests = sc.nextInt();
    HashMap<Integer, Integer> hits = new HashMap<Integer, Integer>();
    for (int i = 0; i < tests; i++){
        int n = sc.nextInt();
        List<Integer> valid = new ArrayList<Integer>();
        int k = sc.nextInt();

        String[] e = lines.nextLine().split(" ");
        for (int j = 0; j < e.length; j++){
            int gary = Integer.parseInt(e[j]);
            if (hits.keySet().contains(gary)) hits.put(gary,hits.get(gary) + 1);
            else hits.put(gary,1);

            if (hits.get(gary) == k)valid.add(gary);
        }
        int l=0;
        int r=1;
        int max = 0;
        int cur=0;
        // now just find longest consecutive substring
        
        for (int j=0;j<valid.size();j++){
            

        }
        System.out.println(l+" "+r);
    }
    

    }
}