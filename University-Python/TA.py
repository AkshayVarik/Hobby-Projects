class TA:
    def __init__(self,name,course_name):
        self.name = name
        self.course = course_name
        self.officeHourDay = 'unknown'
        self.officeHourTime = 0
        #assume all recitations are on Friday. recitation time is an integer.
        self.recitationTime = 0

    #this makes the assumption that TAs hold office hours in 2hr slots
    def pickOfficeHours(self, day, start):
        self.officeHourDay = day
        self.officeHourTime = start

    def pickRecitationTime(self, start):
        self.recitationTime = start

    def getName(self):
        return self.name

    def getCourse(self):
        return self.course

    def getRecitationTime(self):
        return self.recitationTime

    def displayOfficeHours(self):
        print('office hours ', self.officeHourDay, 'from', str(self.officeHourTime), 'to', str(self.officeHourTime + 2))


    #in this model, the TA gives the student their final grade
    def gradeStudent(self, student, grade):
        student.receiveGrade(self.course,grade)
