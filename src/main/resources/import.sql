


INSERT INTO aula( idaaula, capacidad, modalidad, nombre, ubicacion) VALUES (1, 12, 'Presencial', 'Laborario 1', 'Hermano Miguel 12-22');
INSERT INTO aula( idaaula, capacidad, modalidad, nombre, ubicacion) VALUES (2, 12, 'Virtual', 'Laborario virtual 1', 'Hermano Miguel 12-22');

INSERT INTO paralelo(id_paralelo, descripcion, id_aula) VALUES (1, 'PA1', 1);
INSERT INTO paralelo(id_paralelo, descripcion, id_aula) VALUES (2, 'PA2', 2);
	
INSERT INTO materia(id_materia, contenido, nombre)	VALUES (1, 'Casos de Factoreo','Algebra' );
INSERT INTO materia(id_materia, contenido, nombre)	VALUES (2, 'Programacion orientada a objetos','Programacion' );

INSERT INTO horario(id_horario, dias, hora_fin, hora_inicio)VALUES (1, 'Lunes - miercoles - viernes', '20:00', '18:00');
INSERT INTO horario(id_horario, dias, hora_fin, hora_inicio)VALUES (2, 'Lunes - miercoles - viernes', '22:00', '20:00');

INSERT INTO matricula(id_matricula, valor_curso, valor_matricula) VALUES (1, 75.00, 15.00);
INSERT INTO matricula(id_matricula, valor_curso, valor_matricula) VALUES (2, 100.00, 15.00);

INSERT INTO forma_pago(	id_forma_pago, pago, periodo_pago, tipo_pago)	VALUES (1, 20, 'semanal', 'Efectivo');
INSERT INTO forma_pago(	id_forma_pago, pago, periodo_pago, tipo_pago)	VALUES (2, 50, 'mensual', 'Efectivo');


INSERT INTO persona( id, apellido_primer, apellido_segundo, correo, direccion, fecha_nacimiento, identificacion, nombre_primer, nombre_segundo, sexo, telefono) VALUES (1, 'Rodriguez', 'Valverde', 'icrv93@gmail.com', 'Cuenca', '1993-02-13', '1401202492', 'Isaias', 'Cornelio', 'Masculino', '0983873885');
INSERT INTO persona( id, apellido_primer, apellido_segundo, correo, direccion, fecha_nacimiento, identificacion, nombre_primer, nombre_segundo, sexo, telefono) VALUES (2, 'Villa', 'Arpi', 'villa@gmail.com', 'Cuenca', '1998-02-13', '012435689', 'Angel', 'Efrain', 'Masculino', '0983873885');
INSERT INTO persona( id, apellido_primer, apellido_segundo, correo, direccion, fecha_nacimiento, identificacion, nombre_primer, nombre_segundo, sexo, telefono) VALUES (3, 'Hernandez', 'Vasquez', 'vasquez@gmail.com', 'Cuenca', '1993-02-13', '014789562', 'Kevin', 'Alexander', 'Masculino', '098765431');
INSERT INTO persona( id, apellido_primer, apellido_segundo, correo, direccion, fecha_nacimiento, identificacion, nombre_primer, nombre_segundo, sexo, telefono) VALUES (4, 'Condo', 'Vasquez', 'vasquez@gmail.com', 'Cuenca', '1998-02-13', '014789562', 'Jefferson', 'Ismael', 'Masculino', '098765431');
INSERT INTO persona( id, apellido_primer, apellido_segundo, correo, direccion, fecha_nacimiento, identificacion, nombre_primer, nombre_segundo, sexo, telefono) VALUES (5, 'Espinoza', 'Guevara', 'mateo@gmail.com', 'Cuenca', '1998-05-13', '014787562', 'Mateo', 'Sebastian', 'Masculino', '098763431');

INSERT INTO alumno(cargo, ocupacion, id)	VALUES ('Asistente', 'Empleado', 1);
INSERT INTO alumno(cargo, ocupacion, id)	VALUES ('Estudiante', 'Estudiante', 2);

INSERT INTO docente(	especialidad, id)	VALUES ('Programador', 3);

INSERT INTO representante(id)VALUES (4);

INSERT INTO parentezco(	id, parentezco, id_alumno, id_representante)	VALUES (1, 'Padre', 1, 4);
INSERT INTO parentezco(	id, parentezco, id_alumno, id_representante)	VALUES (2, 'Abuelo', 2, 4);


INSERT INTO curso(	id_curso, categoria, cupos, descripcion, duracion, fecha_fin, fecha_inicio,  fecha_inscripcion, img, pdf, seminarios, titulo, id_docente, id_horario, id_materia, id_paralelo)	VALUES (1, 'Informatica', 10, 'aaaaaaaaaaaaaaaaa', 40, '25-05-2022','25-06-2022','25-5-2022','aaaa', 'aaa', 'aaaaaaaa', 'Talleres Empresariales', 3 , 1, 1, 1);


	
INSERT INTO contrato(id_contrato, estado, fecha_contrato, observacion, id_alumno, id_curso, id_forma_pago, id_matricula, id_representante)VALUES (1, 'activo', '24-05-2022', 'aa', 1, 1, 1, 1, 4);
INSERT INTO contrato(id_contrato, estado, fecha_contrato, observacion, id_alumno, id_curso, id_forma_pago, id_matricula, id_representante)VALUES (2, 'activo', '24-05-2022', 'bb', 2, 1, 1, 1, 4);
	

	


INSERT INTO asistencia(id_asignatura, fecha_asistencia, id_alumno, id_curso)	VALUES (1, '26-05-2022', 1, 1);


INSERT INTO calificacion(id_calificacion, observaciones, valor_calificacion, id_alumno, id_curso)VALUES (1, '', 9, 1, 1);
INSERT INTO calificacion(id_calificacion, observaciones, valor_calificacion, id_alumno, id_curso)VALUES (2, '', 8, 2, 1);

INSERT INTO certificado(	id_certificado, codigoqr, detalle, estado,id_alumno, idcurso)	VALUES (1, 'aaa', 'bbbbbbb', 'Entregado',1, 1);
INSERT INTO certificado(	id_certificado, codigoqr, detalle, estado,id_alumno, idcurso)	VALUES (2, 'aaa', 'bbbbbbb', 'Pendiente',2, 1);

INSERT INTO rol(id_rol, rol) VALUES (1, 'Administrador');
INSERT INTO rol(id_rol, rol) VALUES (2, 'Docente');

INSERT INTO usuario(id_usuario, password, username, id, id_rol) VALUES (1, '1234', 'Admin', 5, 1);
INSERT INTO usuario(id_usuario, password, username, id, id_rol) VALUES (2, '12345', 'Docente', 3, 2);


