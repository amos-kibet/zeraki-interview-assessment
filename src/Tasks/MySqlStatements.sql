INSERT INTO institution (name)
                VALUES (University College Dublin),
                       (University College London);

INSERT INTO course (name)
                VALUES (Bsc Actuarial Science),
                       (MPhil Genomics);

SELECT institution.name, course.name, COUNT(*)
    FROM  institution, course, students
    WHERE student.studentid = course.courseid AND student.studentid = institutionid