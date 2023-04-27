insert into fullname (firstname, lastname) values ('Mahesh', 'Mahadeva'); 
insert into fullname (firstname, lastname) values ('caramel', 'wabi'); 
insert into fullname (firstname, lastname) values ('cruze', 'alena'); 
insert into fullname (firstname, lastname) values ('moica', 'jaws'); 
insert into fullname (firstname, lastname) values ('ob', 'brian'); 
//insert into FULLNAME values (hibernate_sequence.NEXTVAL,'scott', 'turner');  

insert into technology (technologyType, category) values ('Java', 'EJB');
insert into technology (technologyType, category) values ('Java', 'Spring');

insert into problem (problem, reasonForProblem, solution, technology) values ('asdfs', 'asdfsaffsd', 'asdfsf', 1);
insert into problem (problem, reasonForProblem, solution, technology) values ('asdf', 'asdfsaaffsd', 'adfsadfsafds', 1);
insert into problem (problem, reasonForProblem, solution, technology) values ('asdfs', 'asdfsaffsd', 'asdfsf', 2);
insert into problem (problem, reasonForProblem, solution, technology) values ('asdf', 'asdfsaaffsd', '', 2);

insert into info (id,description, subject, technology) values (1,'asdf', 'pulate H2 database', 2);
insert into info (id,description, subject, technology) values (2,'add a file called data.sql at the same location as application.properties', 'how to populate H2 database', 2);
