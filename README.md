Because the summer season is already here, the Toyota Motors Philippines is offering a maximum of 12% discount for its 2021 models (also because of the COVID-19 pandemic). To make sure that all sales agents follow the highest 12% sales discount, your objective is to create a program that will check if the lowest price given by a sales agent conforms to the 12% highest possible discount. If the application found out that the discount given by the agent is more than 12%, it should be flagged by displaying an error message.

 

Your job is to create a Java application that will request three input String and two input numbers from the user.:

 

Customer Name
Sales Agent
Vehicle Name
Original Sales Price
Discounted Sales Price
 

Your program must detect if the discounted price exceeds the 12% discount. The computation is as follows:

 

Sales Discount =  (Original Sales Price - Discounted Sales Price)

                             _________________________________             x 100

    Original Sales Price

 

If the sales agent is caught exceeding the 12% maximum sales discount, he will be suspended by the company for 6 months and all company benefits will be removed.

 

Example program execution:

 

Enter Customer Name: Juan dela Cruz

Enter Sales Agent: Pedro Penduko

Enter item name: 2021 TOYOTA FORTUNER 4x4 V 2.8 Dsl A/T​

Enter Sales Retail Price: 2126000

Enter Target Sales Price: 1800000

 

Selecting the submit button will determine if the target sales is valid on the maximum of 12% discount based on its retail price. 




Sample output:

 

Your Discounted Sales Price is INVALID. You have a sales discount is 15.3339%. You are suspended for 6 months. All company benefits will be put on hold as well.




-----------------------------

 

Total of Valid Sales: 0

Total of Invalid Sales: 1

 

Do you want to continue [Y/N]: y

 

Selecting Y or y goes will repeat the program execution. Entering N or n terminates the application and will display the total computed sales amount. 

 

Another example program execution:

 

Enter Customer Name: Juan dela Cruz

Enter Sales Agent: Pedro Penduko

Enter item name: 2021 TOYOTA FORTUNER 4x4 V 2.8 Dsl A/T​

Enter Sales Retail Price: 2126000

Enter Target Sales Price: 2000000

 

Sample output:

 

Your discounted sales price is VALID. You only have a sales markup of 5.926622%. 

 

<< GO BACK >>

 

-----------------------------

 

Total of Valid Sales: 1

Total of Invalid Sales: 1
