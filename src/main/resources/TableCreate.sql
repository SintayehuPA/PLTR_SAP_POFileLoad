Drop TABLE
    SAPPOFILELINE;
CREATE TABLE
    SAPPOFILELINE
    (
        ID INTEGER NOT NULL,
        FILENAME VARCHAR2(50),
        RECEIVEDT TIMESTAMP(6),
        VECD VARCHAR2(8),
        STORECD VARCHAR2(6),
        SAPDC VARCHAR2(6),
        FOB VARCHAR2(6),
        UPCCD VARCHAR2(14),
        QTY INTEGER,
        SHIPDT DATE,
        SHIPCMPLTDT DATE,
        CANCELDT DATE,
        PONUM VARCHAR2(12),
        POLNITEM VARCHAR2(8),
        EMPINIT VARCHAR2(10),
        STATUS VARCHAR2(8),
        SKUNUM VARCHAR2(12),
        ITMCD VARCHAR2(8),
        VSNUM VARCHAR2(20),
        LPRC NUMBER(13,2),
        VCST NUMBER(13,2),
        TERMSKEY NUMBER(5),
        TERMSPCT NUMBER(6,3),
        TERMSDAYS NUMBER(4),
        DIVCD VARCHAR2(6),
        DEPTCD VARCHAR2(6),
        CLASSCD VARCHAR2(6),
        SUBCLASSCD VARCHAR2(6),
        SAPPOLINESKUDISTRID INTEGER,
        FRTTERMS VARCHAR2(5),
        PRIMARY KEY (ID)
    );
    drop TABLE
    SAPPOHD;  
   CREATE TABLE
    SAPPOHD
    (
        ID INTEGER NOT NULL,
        SAPPONUM VARCHAR2(12),
        GERSPONUM VARCHAR2(12),
        VECD VARCHAR2(8),
        TERMSKEY NUMBER(5),
        TERMSPCT NUMBER(6,3),
        TERMSDAYS NUMBER(4),
        FOB VARCHAR2(6),
        SHIPDT DATE,
        SHIPCMPLTDT DATE,
        CANCELDT DATE,
        STATUS VARCHAR2(8),
        POTYPE VARCHAR2(8),
        FRTTERMS VARCHAR2(5),
        PRIMARY KEY (ID)
    );
    Drop  TABLE
    SAPPOLINEITEM;
    CREATE TABLE
    SAPPOLINEITEM
    (
        ID INTEGER NOT NULL,
        SAPPOHDID INTEGER,
        SAPPONUM VARCHAR2(12),
        GERSPONUM VARCHAR2(12),
        ITMCD VARCHAR2(8),
        DIVCD VARCHAR2(6),
        DEPTCD VARCHAR2(6),
        CLASSCD VARCHAR2(6),
        SUBCLASSCD VARCHAR2(6),
        VSNUM VARCHAR2(20),
        VCST NUMBER(13,2),
        NUMOFVARIENT NUMBER(10),
        ITEMSEQNUM NUMBER(10),
        POLNSEQSTART NUMBER(10),
        POLNSEQEND NUMBER(10),
        STATUS VARCHAR2(8),
        POTYPE VARCHAR2(8),
        PRIMARY KEY (ID)
    );
    Drop  TABLE
    SAPPOLINESKU;
    CREATE TABLE
    SAPPOLINESKU
    (
        ID INTEGER NOT NULL,
        SAPPOLINEITEMID INTEGER,
        SAPPONUM VARCHAR2(12),
        GERSPONUM VARCHAR2(12),
        ITMCD VARCHAR2(8),
        SKUNUM VARCHAR2(12),
        SEQNUM NUMBER(10),
        POLNSEQ NUMBER(10),
        LPRC NUMBER(13,2),
        netbuy NUMBER(13,2),
        STATUS VARCHAR2(8),
        POTYPE VARCHAR2(8),
        PRIMARY KEY (ID)
    );
    Drop TABLE
    SAPPOLINESKUDISTR;
    CREATE TABLE
    SAPPOLINESKUDISTR
    (
        ID INTEGER NOT NULL,
        SAPPOLINESKUID INTEGER,
        SAPPONUM VARCHAR2(12),
        GERSPONUM VARCHAR2(12),
        SKUNUM VARCHAR2(12),
        STORECD VARCHAR2(6),
        SAPDC VARCHAR2(6),
        POLNITEM VARCHAR2(8),
        QTY INTEGER,
        STATUS VARCHAR2(8),
        POTYPE VARCHAR2(8),
        PRIMARY KEY (ID)
    );
    
CREATE sequence CUSTOM.poimportseqNum START WITH 1 increment BY 1 nomaxvalue nominvalue cache 20 ORDER;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappofileline TO public;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappofilelog TO public;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappofile TO public;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappohd TO public;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappolineitem TO public;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappolinesku TO public;
GRANT SELECT, DELETE ,INSERT, UPDATE ON CUSTOM.sappolineskudistr TO public;