USE JustGoOut;
GO


--Clean up
DROP TABLE IF EXISTS Outings;
DROP TABLE IF EXISTS Users;

-- table creation
CREATE TABLE Users (
    userId INT IDENTITY(1,1) PRIMARY KEY,
    userName VARCHAR(50) NOT NULL,
    userEmail VARCHAR(255) NOT NULL,
    userProfilePic NVARCHAR(MAX)

	-- unique constraints
	CONSTRAINT UQ_Users_userName UNIQUE (userName),
	CONSTRAINT UQ_Users_userEmail UNIQUE (userEmail)
);

CREATE TABLE Outings (
    outingId INT IDENTITY(1,1) PRIMARY KEY,
    outingName VARCHAR(50) NOT NULL,
    outingDesc VARCHAR(255),
    outingDate DATE,
    outingStatus VARCHAR(10) NOT NULL CHECK (outingStatus IN ('INCOMPLETE','COMPLETE')),
    userId INT NOT NULL

	-- Foreign Keys
	CONSTRAINT FK_EmploymentInformation_EmployerDetails FOREIGN KEY (userId) REFERENCES Users(userId)
);