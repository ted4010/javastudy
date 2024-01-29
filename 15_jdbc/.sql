DROP TABLE SAMPLE_T;
CREATE TABLE SAMPLE_T (
    SAMPLE_NO NUMBER NOT NULL,
    SAMPLE_CONTENT VARCHAR2(100 BYTE),
    SAMPLE_EDITOR VARCHAR2(100 BYTE),
    SAMPLE_DT DATE,
    CONSTRAINT PK_SAMPLE PRIMARY KEY(SAMPLE_NO)
);

DROP SEQUENCE SAMPLE_SEQ;
CREATE SEQUENCE SAMPLE_SEQ NOCACHE;

INSERT INTO SAMPLE_T(SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_DT) VALUES(SAMPLE_SEQ.NEXTVAL, '내용', CURRENT_DATE);
COMMIT;