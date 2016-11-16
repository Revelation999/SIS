import java.util.*;
import java.io.*;
public class Method
	{
		public static ArrayList <Student> generate() throws IOException
		{
			ArrayList <Student> studentList = new ArrayList <Student>();
			Scanner reader = new Scanner(new File("studentInformation.txt"));
			while (reader.hasNextLine())
				{
					String line = reader.nextLine();
					int ind = line.indexOf(' ');
					String firstName = line.substring(0, ind);
					int ind2 = line.indexOf(' ', ind+1);
					String lastName = line.substring(ind+1, ind2);
					ind = line.indexOf(' ', ind2+1);
					String class1Name = line.substring(ind2+1, ind);
					ind2 = line.indexOf(' ', ind+1);
					String class1Grade = line.substring(ind+1, ind2);
					ind = line.indexOf(' ', ind2+1);
					String class2Name = line.substring(ind2+1, ind);
					ind2 = line.indexOf(' ', ind+1);
					String class2Grade = line.substring(ind+1, ind2);
					ind = line.indexOf(' ', ind2+1);
					String class3Name = line.substring(ind2+1, ind);
					String class3Grade = line.substring(ind+1);
					String grades[] = {class1Grade,class2Grade,class3Grade};
					double GPA = GPACalc(grades);
					Course class1 = new Course(class1Name, 1, class1Grade);
					Course class2 = new Course(class2Name, 2, class2Grade);
					Course class3 = new Course(class3Name, 3, class3Grade);
					studentList.add(new Student(firstName, lastName, GPA, class1, class2, class3));
				}
			return studentList;
		}
		public static double GPACalc(String[] grades)
		{
			double count = 0;
			for (int i = 0; i < grades.length; i++)
				{
					switch (grades[i].substring(0,1))
					{
						case "A":{count+=4;break;}
						case "B":{count+=3;break;}
						case "C":{count+=2;break;}
						case "D":{count+=1;break;}
						default:{break;}
					}
					if (grades[i].length()>1)
						{
							if (grades[i].substring(1).equals("+")) count+=0.3;
							else count-=0.3;
						}
				}
			return count/(grades.length);
		}
		public static void SortAlphabetically()
		{
			
		}
		public static void SortGPA()
		{
			
		}
		public static void SortClass()
		{
			
		}
	}
