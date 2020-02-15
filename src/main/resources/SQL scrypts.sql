CREATE TABLE IF NOT EXISTS Address (
  id_address INT NOT NULL AUTO_INCREMENT,
  street_name VARCHAR(45) NOT NULL,
  street_number VARCHAR(45) NULL,
  country VARCHAR(45) NULL,
  version INT NOT NULL DEFAULT 0,
  deleted INT NOT NULL DEFAULT 0,
  PRIMARY KEY (id_address));
  
  CREATE TABLE IF NOT EXISTS Student (
  id_student INT NOT NULL AUTO_INCREMENT,
  id_address INT NOT NULL,
  name VARCHAR(45) NOT NULL,
  version INT NOT NULL DEFAULT 0,
  deleted INT NOT NULL DEFAULT 0,
  PRIMARY KEY (id_student),
  CONSTRAINT fk_student_address
    FOREIGN KEY (id_address)
    REFERENCES Address (id_address)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)