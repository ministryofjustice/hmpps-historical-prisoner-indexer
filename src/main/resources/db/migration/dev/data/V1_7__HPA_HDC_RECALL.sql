SET IDENTITY_INSERT HPA.HDC_RECALL ON;
INSERT INTO HPA.HDC_RECALL (PK_HDC_RECALL, PRISON_NUMBER, CREATED_DATE, CURFEW_END_DATE, OUTCOME_DATE, OUTCOME, REASON) VALUES (1, N'AB111111', N'2001-01-01', N'2001-01-02', N'2001-01-02', N'Licence revoked: recalled', N'BREACH CONDITIONS 38A1(a)');
INSERT INTO HPA.HDC_RECALL (PK_HDC_RECALL, PRISON_NUMBER, CREATED_DATE, CURFEW_END_DATE, OUTCOME_DATE, OUTCOME, REASON) VALUES (2, N'AB111111', N'2001-01-04', N'2001-01-05', N'2001-01-02', N'Re-released following recall', N'CHANGE OF CIRCS 38A1(b)');
INSERT INTO HPA.HDC_RECALL (PK_HDC_RECALL, PRISON_NUMBER, CREATED_DATE, CURFEW_END_DATE, OUTCOME_DATE, OUTCOME, REASON) VALUES (3, N'AB111112', N'2001-01-02', N'2001-01-03', N'2001-01-02', N'Licence breach: rec rejected', N'INABILITY & CHARGE 38A1(b)');
SET IDENTITY_INSERT HPA.HDC_RECALL OFF;