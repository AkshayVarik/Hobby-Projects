from Student import *
from TA import *
def main():
    student1 = Student('alpha', 2018)
    student1.takeCourse('cis110')
    ta110 = TA('beta', 'cis110')
    ta110.pickOfficeHours('Monday', 3)
    ta110.pickRecitationTime(11)
    student1.assignRecitationTA(ta110)
    ta110.gradeStudent(student1, 'A')
    student1.printReport()
    student1.takeCourse('cis120')
    ta120 = TA('gamma', 'cis120')
    ta120.pickOfficeHours('Tuesday', 1)
    ta120.pickRecitationTime(3)
    student1.assignRecitationTA(ta120)
    ta120.gradeStudent(student1, 'B+')
    student1.printReport()

    #change ta110's office hour time
    #display the changed office hour time
    #display whether or not student1 is eligible for the dean's list 

    

if __name__ == '__main__':
    main()
    
