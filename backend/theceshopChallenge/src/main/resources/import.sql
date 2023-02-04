INSERT INTO course(name, total_questions) VALUES('Python Advanced', 20); -- 1
INSERT INTO course(name, total_questions) VALUES('Python Django from Novice to Expert', 25); -- 2
INSERT INTO course(name, total_questions) VALUES('Problem solving skills', 70); -- 3
INSERT INTO course(name, total_questions) VALUES('Angular 15 advance course', 30); -- 4
INSERT INTO course(name, total_questions) VALUES('Flutter Web', 55); -- 5

INSERT INTO student(first_name, last_name) VALUES('Andres', 'Frias'); -- 1
INSERT INTO student(first_name, last_name) VALUES('Sammy', 'Sossa'); -- 2
INSERT INTO student(first_name, last_name) VALUES('Daniel', 'Estevez'); -- 3
INSERT INTO student(first_name, last_name) VALUES('Santiago', 'Aponte'); -- 4

INSERT INTO progress(student_id, course_id, completed_questions) VALUES(1,1,13);
INSERT INTO progress(student_id, course_id, completed_questions) VALUES(3,2,20);
INSERT INTO progress(student_id, course_id, completed_questions) VALUES(2,3,55);
INSERT INTO progress(student_id, course_id, completed_questions) VALUES(5,4,10);
INSERT INTO progress(student_id, course_id, completed_questions) VALUES(1,5,52);