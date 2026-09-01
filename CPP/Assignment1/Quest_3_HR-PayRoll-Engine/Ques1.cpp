#include <iostream>
#include <string>
using namespace std;

class Employee
{
private:
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int nextId;
    static int employeeCount;

public:

    Employee()
    {
        empId = nextId;
        nextId++;

        employeeCount++;

        isActive = true;
        name = "";
        department = "";
        grade = 'D';
        basicSalary = 10001;
    }

    void setName(const string& n)
    {
        if(n != "")
            name = n;
        else
            cout << "ERROR: Name cannot be empty." << endl;
    }

    void setDepartment(const string& dept)
    {
        if(dept == "Engineering" ||
           dept == "HR" ||
           dept == "Finance" ||
           dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << "ERROR: '" << dept
                 << "' is not a registered department."
                 << endl;
        }
    }

    void setGrade(char g)
    {
        if(g=='A' || g=='B' || g=='C' || g=='D')
        {
            grade = g;
        }
        else
        {
            cout << "ERROR: Invalid grade '"
                 << g
                 << "'. Accepted values: A, B, C, D."
                 << endl;
        }
    }

    void setBasicSalary(double salary)
    {
        if(salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between Rs.10,000 and Rs.5,00,000. Value rejected."
                 << endl;
        }
    }

    void deactivate()
    {
        isActive = false;
    }

    int getEmpId() const
    {
        return empId;
    }

    string getName() const
    {
        return name;
    }

    string getDepartment() const
    {
        return department;
    }

    char getGrade() const
    {
        return grade;
    }

    double getBasicSalary() const
    {
        return basicSalary;
    }

    bool getIsActive() const
    {
        return isActive;
    }

    double computeAllowances() const
    {
        if(grade == 'A')
            return basicSalary * 0.40;

        if(grade == 'B')
            return basicSalary * 0.30;

        if(grade == 'C')
            return basicSalary * 0.20;

        return basicSalary * 0.10;
    }

    double computeGrossSalary() const
    {
        return basicSalary + computeAllowances();
    }

    double computeTax() const
    {
        double gross = computeGrossSalary();

        if(gross <= 50000)
        {
            return 0;
        }
        else if(gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }

    void printPayslip() const
    {
        cout << "============================================" << endl;
        cout << "EMPLOYEE PAYSLIP — AUG 2026" << endl;
        cout << "============================================" << endl;

        cout << "Emp ID      : " << empId << endl;
        cout << "Name        : " << name << endl;
        cout << "Department  : " << department << endl;
        cout << "Grade       : " << grade << endl;

        if(isActive)
            cout << "Status      : Active" << endl;
        else
            cout << "Status      : Inactive" << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Basic Salary     : Rs. "
             << basicSalary << endl;

        cout << "Allowances       : Rs. "
             << computeAllowances() << endl;

        cout << "Gross Salary     : Rs. "
             << computeGrossSalary() << endl;

        cout << "--------------------------------------------" << endl;

        cout << "Tax Deduction    : Rs. "
             << computeTax() << endl;

        cout << "Net Salary       : Rs. "
             << computeNetSalary() << endl;

        cout << "============================================" << endl;
    }

    static int getEmployeeCount()
    {
        return employeeCount;
    }

    void acceptDetails()
    {
        string n;
        string dept;
        char g;
        double salary;

        cin.ignore();

        cout << "Enter Name: ";
        getline(cin, n);
        setName(n);

        cout << "Enter Department: ";
        getline(cin, dept);
        setDepartment(dept);

        cout << "Enter Grade: ";
        cin >> g;
        setGrade(g);

        cout << "Enter Basic Salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }
};

int Employee::nextId = 1001;
int Employee::employeeCount = 0;

int main()
{
    Employee e1;

    Employee* e2 = new Employee();
    Employee* e3 = new Employee();

    e1.acceptDetails();
    e2->acceptDetails();
    e3->acceptDetails();

    // e1.empId = 999;
    // e1.basicSalary = -1000;

    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();

    e3->deactivate();

    if(!e3->getIsActive())
    {
        cout << e3->getName()
             << " is no longer active. Payroll skipped."
             << endl;
    }

    cout << "Total Employees : "
         << Employee::getEmployeeCount()
         << endl;

    delete e2;
    delete e3;

    return 0;
}