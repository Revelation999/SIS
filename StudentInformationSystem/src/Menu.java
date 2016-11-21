import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Menu
	{
		public static void main(String[] args) throws IOException
		{
			JFrame frame = new JFrame();
			ArrayList <Student> studentList = Method.generate();
			do
				{
					Method.printList(studentList);
					Object choice[] = {"Add/delete", "Change grade/class", "Sort", "Exit"};
					int answer = JOptionPane.showOptionDialog(null, "Choose your action", "SIS", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
					switch (answer)
					{
						case 0: 
							{
								int addDeleteAnswer = addOrDelete(studentList);
								if (addDeleteAnswer == 2){continue;}
								break;
							}
						case 1: 
							{
								int changeClassAnswer = changeClass(studentList);
								if (changeClassAnswer == 2){continue;}
								break;
							}
						case 2: {break;}
						default: {System.exit(0);}
					}
				}while(true);
		}
		public static int addOrDelete(ArrayList <Student> studentList)
		{
			Object choice[] = {"Add student", "Delete student", "Return"};
			int answer = JOptionPane.showOptionDialog(null, "Choose your action", "SIS", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
			if (answer == 0)
				{
					Method.addStudent(studentList);
				}
			if (answer == 1)
				{
					Method.deleteStudent(studentList);
				}
			return answer;
		}
		public static int changeClass(ArrayList <Student> studentList)
		{
			Object choice[] = {"Change grade", "Change class", "Return"};
			int answer = JOptionPane.showOptionDialog(null, "Choose your action", "SIS", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
			if (answer == 0)
				{
					int a = Method.findStudent(studentList);
					Student b = Method.changeGrade(studentList.get(a));
					studentList.set(a, b);
				}
			if (answer == 1)
				{
					int a = Method.findStudent(studentList);
					Student b = Method.switchClass(studentList.get(a));
					studentList.set(a, b);
				}
			return answer;
		}

	}
//sample change
//Kaitlin change