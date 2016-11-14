
public class Course
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
				this.grade = grade;//good?
			}
	}
