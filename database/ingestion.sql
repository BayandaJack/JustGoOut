USE JustGoOut;
GO

-- Insert Users
INSERT INTO Users (userName, userEmail, userProfilePic)
VALUES 
('Retshepile', 'retshepile@example.com', NULL),
('Bayanda', 'bayanda@example.com', NULL);

-- Insert Outings for Retshepile (userId = 1)
INSERT INTO Outings (outingName, outingDesc, outingDate, outingStatus, userId)
VALUES
('Movie Night', 'Watch latest blockbuster at the cinema', NULL, 'INCOMPLETE', 1),
('Sunday Brunch', 'Brunch at a local cafe', NULL, 'INCOMPLETE', 1);

-- Insert Outings for Bayanda (userId = 2)
INSERT INTO Outings (outingName, outingDesc, outingDate, outingStatus, userId)
VALUES
('Hiking at Groenkloof', 'Morning hike and picnic', NULL, 'INCOMPLETE', 2),
('Bowling Night', 'Friendly bowling competition', NULL, 'INCOMPLETE', 2);