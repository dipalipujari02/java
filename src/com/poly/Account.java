package com.poly;

public class Account {
     Integer accNo;
     private String accType;

     public Account(Integer accNo, String accType) {
          this.accNo = accNo;
          this.accType = accType;
     }

     // getters to get the values
     public Integer getAccNo() {
          return accNo;
     }

     public String getAccType() {

          return accType;
     }

}