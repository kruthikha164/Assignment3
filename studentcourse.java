public class studentcourse extends student2 {
    void course()
    {
        String[] subjects = { "C#","Machine Learning","DevOps",};
        int[][] marks = {
            {52, 34, 62}
            
        };

        // Assuming each row represents a student and each column represents a subject
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println("kruthikha " + (i + 1) + " scored less than 40 in the  " + subjects[j]);
                }
            }     
        }
        }
    public static void main(String args[])
    {
        studentcourse sc = new studentcourse();
        sc.stud_det();
        sc.course();
        
    }
}
