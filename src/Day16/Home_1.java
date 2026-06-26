package Day16;
/*
-- Insert 5 records into INSTRUCTORS
INSERT INTO INSTRUCTORS (INSTRUCTOR_ID, INSTRUCTOR_NAME, SPECIALIZATION)
VALUES
        (1, 'Anjali Sinha', 'Guitar'),
(2, 'Dev Sharma', 'Piano'),
        (3, 'Ritu Mehra', 'Drums'),
        (4, 'Arman Yadav', 'Violin'),
        (5, 'Kavya Nair', 'Flute');

        -- Insert 5 records into INSTRUMENTS
INSERT INTO INSTRUMENTS (INSTRUMENT_ID, TYPE, QUALITY, INSTRUCTOR_ID)
VALUES
        (501, 'Acoustic', 'Good', 1),
(502, 'Electric', 'Average', 2),
        (503, 'Bass', 'Good', 3),
        (504, 'Grand', 'Damaged', 2),
        (505, 'Violin', 'Good', 4);

        -- Types of instruments managed by instructors whose specialization starts with 'P'
SELECT I.TYPE
FROM INSTRUCTORS T
JOIN INSTRUMENTS I
ON T.INSTRUCTOR_ID = I.INSTRUCTOR_ID
WHERE T.SPECIALIZATION LIKE 'P%';

        -- Names of instructors handling Acoustic or Electric instruments
SELECT DISTINCT T.INSTRUCTOR_NAME
FROM INSTRUCTORS T
JOIN INSTRUMENTS I
ON T.INSTRUCTOR_ID = I.INSTRUCTOR_ID
WHERE I.TYPE IN ('Acoustic', 'Electric');

-- Rename SPECIALIZATION column to INSTRUMENTS
ALTER TABLE INSTRUCTORS
CHANGE COLUMN SPECIALIZATION INSTRUMENTS VARCHAR(50);

-- Given in the question
DESCRIBE INSTRUCTORS;

SELECT * FROM INSTRUCTORS;

SELECT * FROM INSTRUMENTS;

 */