class Student:
    def __init__(self,name,graduation_year):
        self.name = name
        self.graduation_year = graduation_year
        self.GPA = 0
        self.numCoursesCompleted = 0
        #all students are initially in good standing
        self.inGoodStanding = True
        self.recitationTA = None

    def getName(self):
        return name

    def getGraduationYear(self):
        return graduation_year

    def setGraduationYear(self, year):
        self.graduation_year = year

    def getGPA(self):
        return self.GPA

    def isEligibleForDeanList(self):
        if self.GPA > 3.7 and self.inGoodStanding:
            return True
        return False

    def takeCourse(self, course_name):
        print(self.name, 'is now enrolled in', course_name)

    def receiveGrade(self, course_name, grade):
        print(self.name, 'got', grade, 'in', course_name)
        if grade == 'A':
            numeric_value = 4
        elif grade == 'A-':
            numeric_value = 3.7
        elif grade == 'B+':
            numeric_value = 3.3
        elif grade == 'B':
            numeric_value = 3
        elif grade == 'B-':
            numeric_value = 2.7
        elif grade == 'C+':
            numeric_value = 2.3
        elif grade == 'C':
            numeric_value = 2
        elif grade == 'C-':
            numeric_value = 1.3
        elif grade == 'D+':
            numeric_value = 1.0    
        self.GPA = (self.GPA * self.numCoursesCompleted + numeric_value) / (self.numCoursesCompleted + 1)
        self.numCoursesCompleted += 1

    def caughtCheating(self):
        self.inGoodStanding = False

    def printReport(self):
        print('This is', self.name, ',UPENN', self.graduation_year)
        print('Their GPA is', self.GPA)
        if self.numCoursesCompleted == 1:
            numcourses_string = 'course'
        else:
            numcourses_string = 'courses'
        print('They have taken', self.numCoursesCompleted, numcourses_string)

    def assignRecitationTA(self, TA):
        self.recitationTA = TA
        print(self.name, 'your TA is', TA.getName(), 'whose recitation is at', TA.getRecitationTime())
        
