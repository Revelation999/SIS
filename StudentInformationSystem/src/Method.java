import java.util.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Method
	{
		static JFrame frame = new JFrame();
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
		public static void printList(ArrayList <Student> list)
		{
			for (Student l: list)
				{
					System.out.printf("%10s",l.getFirstName());
					System.out.printf("%10s",l.getLastName());
					System.out.printf("%5f",l.getGPA());
					System.out.printf("%3d",l.getClass1().getPeriod());
					System.out.printf("%10s",l.getClass1().getClassName());
					System.out.printf("%3s",l.getClass1().getGrade());
					System.out.printf("%3d",l.getClass2().getPeriod());
					System.out.printf("%10s",l.getClass2().getClassName());
					System.out.printf("%3s",l.getClass2().getGrade());
					System.out.printf("%5P:d",l.getClass3().getPeriod());
					System.out.printf("%10s",l.getClass3().getClassName());
					System.out.printf("%3s",l.getClass3().getGrade());
					System.out.println();
				}
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
		public static void changeGrade(Student a)
		{
			Object classes[] = {a.getClass1().getClassName(), a.getClass2().getClassName(), a.getClass3().getClassName()};
			int choiceClass = JOptionPane.showOptionDialog(null, "Which class?", "Changing grade", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, classes, classes[0]);
			Object grades[] = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
			int gradesChoice = JOptionPane.showOptionDialog(null, "What grade?", "Changing grade", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, grades, grades[0]);
			if (choiceClass == 0){a.getClass1().setGrade((String) grades[gradesChoice]);}
			if (choiceClass == 1){a.getClass2().setGrade((String) grades[gradesChoice]);}
			if (choiceClass == 2){a.getClass3().setGrade((String) grades[gradesChoice]);}
		}
		public static void switchClass(Student a)
		{
			Object classes[] = {a.getClass1().getClassName(), a.getClass2().getClassName(), a.getClass3().getClassName()};
			int fromClass = JOptionPane.showOptionDialog(null, "Which class?", "Switching class", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, classes, classes[0]);
			int toClass = JOptionPane.showOptionDialog(null, "Which class?", "Switching class", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, classes, classes[0]);
			Course x = null;
			if (fromClass == 0)
				{
					if (toClass == 1){x = a.getClass1(); a.setClass1(a.getClass2()); a.setClass2(x);}
					else{x = a.getClass1(); a.setClass1(a.getClass3());a.setClass3(x);}
				}
			else if (fromClass == 1)
				{
					if (toClass == 0){x = a.getClass2(); a.setClass2(a.getClass1()); a.setClass1(x);}
					else{x = a.getClass2(); a.setClass2(a.getClass3());a.setClass3(x);}
				}
			else
				{
					if (toClass == 0){x = a.getClass3(); a.setClass3(a.getClass1()); a.setClass1(x);}
					else{x = a.getClass3(); a.setClass3(a.getClass2());a.setClass2(x);}
				}
		}
		public static Student findStudent(ArrayList <Student> studentList)
		{
			String lookingFor = (String) JOptionPane.showInputDialog(frame, "Input Student first name.", "Student finder", JOptionPane.PLAIN_MESSAGE, null, null, null);
			for (Student i : studentList)
				{
					if (i.getFirstName().equalsIgnoreCase(lookingFor))
						{
							return i;
						}
				}
			return null;
		}
		public static void addStudent()
		{
//Kaitlin commit 2
				 
		}
		public static void deleteStudent()
		{
			
		}
	}
