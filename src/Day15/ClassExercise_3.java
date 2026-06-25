package Day15;
/*
                         +------------------+
                                 |      BRANCH      |
        +------------------+
        | PK b_name        |
        | b_city           |
        | Assets           |
        +------------------+
        |           |
        1  |           | 1
        |           |
        |           |
N           N
                    +------------+   +------------+
                            |  ACCOUNT   |   |    LOAN    |
        +------------+   +------------+
        | PK Ac_no   |   | PK Loan_no |
        | Balance    |   | Amt        |
        | FK b_name  |   | FK b_name  |
        +------------+   +------------+
        |               |
        | N         N   |
        |               |
        |               |
M               M
                    +---------------------------+
                            |         CUSTOMER          |
        +---------------------------+
        | PK c_name                |
        | c_city                   |
        | c_street                 |
        +---------------------------+

        (Depositor)            (Borrower)
CUSTOMER M:N ACCOUNT   CUSTOMER M:N LOAN

 */