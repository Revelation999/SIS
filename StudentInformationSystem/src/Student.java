
public class Student
	{
		private String firstName;
		private String lastName;
		private double GPA;
		private Course class1;
		private Course class2;
		private Course class3;
		public Student(String fn, String ln, double g, Course c1, Course c2, Course c3)
		{
			firstName = fn;
			lastName = ln;
			GPA = g;
			class1 = c1;
			class2 = c2;
			class3 = c3;
		}
		public String getFirstName()
			{
				return firstName;
			}
		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
		public String getLastName()
			{
				return lastName;
			}
		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		public double getGPA()
			{
				return GPA;
			}
		public void setGPA(double gPA)
			{
				GPA = gPA;
			}
		public Course getClass1()
			{
				return class1;
			}
		public void setClass1(Course class1)
			{
				this.class1 = class1;
			}
		public Course getClass2()
			{
				return class2;
			}
		public void setClass2(Course class2)
			{
				this.class2 = class2;
			}
		public Course getClass3()
			{
				return class3;
			}
		public void setClass3(Course class3)
			{
				this.class3 = class3;//good?
			}
	}
