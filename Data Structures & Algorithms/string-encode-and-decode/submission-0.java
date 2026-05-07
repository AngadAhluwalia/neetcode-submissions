class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();


    }

    public List<String> decode(String str) {
        List<String> strs=new LinkedList<>();
        char [] arr= str.toCharArray();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder();
            while(arr[i]!='#'){
                sb.append(arr[i++]);
            }
            i++;
            int numOfChars= Integer.parseInt(sb.toString());
            int end =i+numOfChars;
            sb= new StringBuilder();
            while(i<end){
                sb.append(arr[i++]);
            }
            i--;
            strs.add(sb.toString());
        }


        return strs;

    }
}
