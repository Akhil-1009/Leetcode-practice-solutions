class Solution {
    public List<String> commonChars(String[] words) {
        int  []arr=new int[26*(words.length-1)];
        for(int i=1;i<words.length;i++)
        {
            String temp=words[i];
            for(int j=0;j<temp.length();j++)
            {
                int index=((i-1)*26)+(temp.charAt(j)-97);
                arr[index]++;
            }
        }
        List<String> list=new ArrayList<>();
        String first=words[0];
        for(int i=0;i<first.length();i++)
        {   int j=0;
            for(j=0;j<words.length-1;j++)
            {
                int index=(j*26)+(first.charAt(i)-97);
                if(arr[index]==0)
                {
                    break;
                }
                else{
                    arr[index]--;
                }
            }
            if(j==words.length-1)
            {
                String ans=Character.toString(first.charAt(i));
                list.add(ans);
            }
        }
        return list;
        
    }
}