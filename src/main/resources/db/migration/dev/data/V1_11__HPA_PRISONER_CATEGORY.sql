SET IDENTITY_INSERT HPA.PRISONER_CATEGORY ON;
INSERT INTO HPA.PRISONER_CATEGORY (PK_PRISONER_CATEGORY, PRISON_NUMBER, DATE, CATEGORY) VALUES (1, N'AB111111', N'2001-01-01', N'CATEGORY D');
INSERT INTO HPA.PRISONER_CATEGORY (PK_PRISONER_CATEGORY, PRISON_NUMBER, DATE, CATEGORY) VALUES (2, N'AB111111', N'2001-01-02', N'UNCATEGORISED (SENT MALES)');
INSERT INTO HPA.PRISONER_CATEGORY (PK_PRISONER_CATEGORY, PRISON_NUMBER, DATE, CATEGORY) VALUES (3, N'AB111112', N'2001-01-01', N'CATEGORY C');
SET IDENTITY_INSERT HPA.PRISONER_CATEGORY OFF;
