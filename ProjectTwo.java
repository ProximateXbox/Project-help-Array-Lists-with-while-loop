import java.util.ArrayList;
import java.util.Scanner;

public class ProjectTwo 
{
	
			Scanner console = new Scanner(System.in);
			ArrayList<String> course = new ArrayList<>();
			ArrayList<String> letterGrade = new ArrayList<>();//received error with char
			ArrayList<Integer> score = new ArrayList<>();
			ArrayList<Integer> creditHours = new ArrayList<>();
			
			while true
			{
				System.out.println("Enter y to contunie typing or press q to quit");
				Scanner input = console;
				if (Scanner = input.equals("q"));
				break;
				

				System.out.println("Course:");
				course = console.nextLine();
				System.out.println("Credit Hours:");
				creditHours = Integer.parseInt(console.nextLine());
				System.out.println("Score:");
				score = Integer.parseInt(console.nextLine());
				System.out.println();
				letterGrade = '';	
			
				for(int j = 0; j < 3; j++)
				{
					if (score[j] >= 90)
					{
						letterGrade[j] = "A";
					}
					else if(score[j] < 90 && score[j] >= 80)
					{
						letterGrade[j] = "B";
					}
					else if(score[j] < 80 && score[j] >= 70)
					{
						letterGrade[j] = "C";
					}
					else if(score[j] < 70 && score[j] >= 60)
					{
						letterGrade[j] = "D";
					}
					else if (score[j] < 60) 
					{
						letterGrade[j] = "F";
					}
				}

		
				System.out.printf("%s %s %s %s\n","course", "Credit Hours", "Score", "Grade");
				for(int i = 0; i < course.length; i++)
				{
					System.out.printf("%-5s     %-5d     %-5d     %-5s\n", course[i], creditHours[i], score[i], letterGrade[i]);
				}
				console.close();
		}
}

