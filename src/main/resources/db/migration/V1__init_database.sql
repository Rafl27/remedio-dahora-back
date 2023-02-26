CREATE TABLE if not exists Meds (
  med_id BIGINT NOT NULL AUTO_INCREMENT,
  med_name VARCHAR(255) NOT NULL,
  med_desc VARCHAR(255) NOT NULL,
  med_type VARCHAR(255) NOT NULL,
  med_status VARCHAR(255) NOT NULL,
  PRIMARY KEY (med_id)
);

INSERT INTO Meds (med_name, med_desc, med_type, med_status)
VALUES
  ('Med 1', 'Description for Med 1', 'Type A', 'Active'),
  ('Med 2', 'Description for Med 2', 'Type B', 'Inactive'),
  ('Med 3', 'Description for Med 3', 'Type A', 'Active'),
  ('Med 4', 'Description for Med 4', 'Type C', 'Inactive'),
  ('Med 5', 'Description for Med 5', 'Type B', 'Active');
