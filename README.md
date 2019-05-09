# stock-profit-finder

This application contains a StockProfitFinder class that provide method to calculate the best profit a person can make by doing one purchase and sale transaction of stock in a day.

#### Assumptions

1. If Stock Price continuously declined throughout the day and never went up, then the solution will return 0 profit value. For eg int[] stockPrice = {5,4,3,2,1}
2. If Stock Price list is empty or null then a 0 profit value will be returned.
3. StockPrice list can contain non-negative values.
4. If the StockPrice list contains only only stockPrice value, then 0 profit value would be returned.

#### Prerequisite
1. Java 8
2. Maven 3

#### Running the build
* Go to the project root directory and run ``` mvn clean test```
* To import the project into Eclipse Workspace, go to the project root directory and run ``` mvn eclipse:clean eclipse:eclipse```

#### Source code and test classes

* Application code can be found under src/main/java directory
* Test classes can be found under src/test/java directory
