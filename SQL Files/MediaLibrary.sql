use cs320stu43;

CREATE TABLE IF NOT EXISTS MediaLibrary (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(50) NOT NULL,
  Type varchar(20) NOT NULL,
  DateAdded date DEFAULT NULL,
  OnLoan tinyint(1) DEFAULT NULL,
  DateBorrowed date DEFAULT NULL,
  Borrower varchar(25) DEFAULT NULL,
  PRIMARY KEY (Id)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

INSERT INTO MediaLibrary (`Id`, `Type`, `Name`, `DateAdded`, `OnLoan`, `DateBorrowed`, `Borrower`) VALUES
(1, 'CD', 'TITANIC', '2015-03-19', 0, '2015-03-19', 'James'),
(2, 'DVD', 'PIRATES OF THE CARRABIAN', '2015-03-19', 0, '2015-03-19', 'Suzane'),
(3, 'DVD', '3 IDIOTS', '2015-03-19', 1, NULL, NULL),
(4, 'BluRay', 'SHERLOCK HOLMES', '2015-03-19', 0, '2015-03-19', 'Jennifer'),
(5, 'BluRay', 'A JOURNEY OF A PROGRAMMER', '2015-03-19', 0, '2015-03-19', 'Smith');