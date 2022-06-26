# QCUtilLib

## Description
My Minecraft Plugin Utill lib.


## API

### Error Message
> *send error message to player*

- sendError(Player p, String Message)


### User's Info
> *get User Info ( UUID, Name )*

- String getUserInfo(String Type, String condition)
  - Type -> uuid or name  *(need datatype)*
  - condition -> name = 'QC03'  *(SQL Query WHERE)*
  - **This Method is Get the User's Info Data**
 
- Boolean isUser(String type, String value)
  - type -> uuid or name  *(need datatype)*
  - value -> type's value
  - **This Method to Verify that Value are User**

> Advanced api

- void addUserInfo(String name, String uuid)
  - name -> user's name
  - uuid -> user's uuid
  - **This Method for Add User Info Data to Database**
  
