package javaQuestionPractise;

public class ComparetoFunction {

	public static void main(String[] args) {
		 String chars[] = {"a", "b", "c", "a", "c"};
         for (int i = 0; i < chars.length; ++i)
         {
             for (int j = i + 1; j < chars.length; ++j){
             int b= chars[i].compareTo(chars[j]);
             System.out.println("char of "+chars[i]+" compareto "+chars[j]+"= "+b);
             }
                    
	}
	}

}
