package kihons;

import framework.exceptions.NotImplementedYetException;
import framework.bases.SqlKihonBase;

public class SqlKihon extends SqlKihonBase {

    /* Given SQL Tables defined as:
     * ----------------------------
     * CREATE TABLE Person
       (
         PersonId int not null PRIMARY KEY,
         FirstName varchar(50),
         LastName varchar(50),
         Age int
       )
     *
     * CREATE TABLE Address
       (
         AddressId int not null PRIMARY KEY,
         PersonId int,
         Line1 varchar(50),
         Line2 varchar(50),
         City varchar(50),
         State varchar(50),
         Zip varchar(9)
       )
     */

    @Override
    protected String Select_All_Fields_And_Rows_From_Person() {
        return "SELECT * FROM Person";
    }

    @Override
    protected String selectAllFieldsFromPersonJoinedToAddress() {
        return "SELECT * FROM Person JOIN Address ON Address.PersonId = Person.PersonId";
    }

    @Override
    protected String selectFirstNameFromPersonWhereLastNameEqualsRayburn() {
        return "SELECT FirstName FROM Person WHERE LastName = 'Rayburn'";
    }

    @Override
    protected String selectAllFieldsFromPersonLeftOuterJoinedToAddress() {
        return "SELECT * FROM Person LEFT JOIN Address ON Address.PersonId = Person.PersonId";
    }

    @Override
    protected String insertPersonId4NamedMikeJohnsonAge5ToPerson() {
        return "INSERT Person (PersonId, FirstName, LastName, Age) VALUES (4, 'Mike', 'Johnson', 5)";
    }

    @Override
    protected String updateAllLastNamesRayburnToJohnsonInPerson() {
        throw new NotImplementedYetException();
    }
}
