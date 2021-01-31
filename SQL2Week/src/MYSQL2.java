Q1.I want to know how many employees with each title were born after 1965-01-01.
		Select employees.*, titles.* FROM employees INNER JOIN titles ON 
		employees.emp_no = titles.emp_no WHERE birth_date > "1965-01-01";
	
Q2.I want to know the average salary per title.
		Select title, AVG (salary) FROM salaries
		INNER JOIN titles ON salaries.emp_no = titles.emp_no
		Group BY title;

Q.3 How much money was spent on salary for the marketing department between the years 1990 and 1992
		Select d.dept_name , sum(salary)
		From dept_emp de
		INNER JOIN departments d ON d.dept_no = de.dept_no
		INNER JOIN salaries s ON s.emp_no = de.emp_no
		WHERE d.dept_name = "Marketing" AND
		s.from_date >= "1901-01-01" and s.to_date <= "1992-12-31"
		Group BY d,dept_name;
		
		
		
		
		
		
		