import java.util.Comparator;

public class Course implements Comparator<Course>
	{
		private String className;
		private int period;
		private String grade;
		public Course(String cn, int p, String g)
		{
			className = cn;
			period = p;
			grade = g;
		}
		public String getClassName()
			{
				return className;
			}
		public void setClassName(String className)
			{
				this.className = className;
			}
		public int getPeriod()
			{
				return period;
			}
		public void setPeriod(int period)
			{
				this.period = period;
			}
		public String getGrade()
			{
				return grade;
			}
		public void setGrade(String grade)
			{
				this.grade = grade;
			}
		@Override
		public int compare(Course arg0, Course arg1)
			{
				// TODO Auto-generated method stub
				return 0;
			}
	}
//Kaitlin commit 1
