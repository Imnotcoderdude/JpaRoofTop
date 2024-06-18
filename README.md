1. 학번과 이메일로 학생을 조회한다.
   SELECT *
   FROM student
   WHERE student_number = '2020-020202-02' AND email = '2abcdef@123.com';

2. 김씨 성의 학생들을 조회한다.
   SELECT *
   FROM student
   WHERE name like '김%';
   
3. 점수가 70점 이상이고 80점 이하인 시험들을 내림차순으로 정렬하여 조회한다.
   SELECT * 
   FROM exam 
   WHERE score BETWEEN 70 AND 80 
   ORDER BY score DESC;
   
