package InterviewPrograms;

public class AlternateCharCapital {

    public static void main(String[] args) {
        String str = "java is the object oriented language";
        char ar[] = str.toCharArray();

        for(int i=0; i<ar.length; i+=2)
        {
            ar[i]=Character.toUpperCase(ar[i]);
        }
        System.out.println(ar);
    }
}
