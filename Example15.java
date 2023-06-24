import domain.Student;

public class Example15{

    public static void main(String[] args) {

        String[] studentNames = {
            "Luis Torres",
            "Carlos Mancía",
            "Ingeniera América",
            "Roberto",
            "Andrés",
            "Gerard",
            "Neymar",
            "Xavi",
            "Iniesta",
            "Sofia",
            "Ana",
            "Enzo",
            "Eric",
            "Hugo",
            "Eva"     
        };

        Student [][] groups = new Student[3][5];
            int x = 0;
            for(int i = 0; i < groups.length; i++){
                for( int j = 0; j < groups[i].length; j++){
                    String name = studentNames[x];
                    groups[i][j] = new Student (name);
                    x++;
                    System.out.println(name);
            }       
    }
}
}