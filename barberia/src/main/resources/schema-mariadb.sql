CREATE TABLE cliente(
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre_apellidos VARCHAR(400) NOT NULL,
    estado BIT  
);

INSERT INTO `cliente`(
    `nombre_apellidos`,
    `estado`
)
VALUES(
    'Camila Torres',
    '1'    
),
VALUES(
    'Jorge Grajales',
    '1'   
),
VALUES(
    'Oscar Gomez',
    '1' 
),

CREATE TABLE empleado(
    id_empleado INT PRIMARY KEY AUTO_INCREMENT,
    nombre_apellidos VARCHAR(400) NOT NULL,
    especialidad VARCHAR(200) NOT NULL,
    estado BIT  
);
INSERT INTO `empleado`(
    `nombre_apellidos`,
    `especialidad`,
    `estado`
)
VALUES(
    'Fabian Zuluaga',
    'Barbero',
    '1' 
),

VALUES(
    'Melisa Rio',
    'Estilista',
    '1' 
),

VALUES(
    'Maia Benitez',
    'Manicurista',
    '1' 
),

CREATE TABLE reserva (
    id_reserva INT NOT NULL AUTO_INCREMENT,
    id_empleado INT NOT NULL,
    id_cliente INT NOT NULL,
    fecha_hora DATETIME,
    valor REAL,
    estado BIT,    
    PRIMARY KEY (id_reserva),
    FOREIGN KEY (id_empleado) REFERENCES empleado(id_empleado),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
);

INSERT INTO `reserva`(
    `id_empleado`,
    `id_cliente`,
    `fecha_hora`,
    `valor`,
    `estado`
)
VALUES(
    '1',
    '2',
    '2014-10-25 18:00:00',
    20000,
    '1'
),
VALUES(
    '2',
    '1',
    '2022-10-25 18:00:00',
    15000,
    '1'
);
