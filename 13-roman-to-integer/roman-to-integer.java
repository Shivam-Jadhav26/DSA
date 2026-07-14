class Solution { 
    public int romanToInt(String s) { 
        int size = s.length(); 
        int num = 0; 
        //sub if val is small 
            for (int i = 0; i < size; i++) { 
            int val = getValue(s.charAt(i)); 
            
            
            if (i + 1 < size && val < getValue(s.charAt(i + 1))) { 
                num -= val; 
            } else { 
                num += val; 
            } 
        } 
        return num; 
    } 

    private int getValue(char c) { 
        switch (c) { 
            case 'I': return 1; 
            case 'V': return 5; 
            case 'X': return 10; 
            case 'L': return 50; 
            case 'C': return 100; 
            case 'D': return 500; 
            case 'M': return 1000; 
            default: return 0; 
        } 
    } 
}
