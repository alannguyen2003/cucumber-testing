Feature: Demo login function
  #Kịch bản cho một tình huống nào đó trong tính năng này
  Scenario: Login succesfully, expected redirect to home page
	#Given: Từ khóa này dùng để đánh dấu trước khi thực hiện kịch bản thì mình sẽ có những gì
	Given User is at login page
	#When : từ khóa này dùng để đánh dấu các bước mà nó sẽ thao tác với trình duyệt
	When User enters username and password
	#Then : dùng để đánh dấu sau khi thực hiện xong thì mình sẽ có những gì
	Then User is navigated to home page

  Scenario Outline: Login succesfully, expected redirect to home page DDT
	#Given: Từ khóa này dùng để đánh dấu trước khi thực hiện kịch bản thì mình sẽ có những gì
	Given User is at login page DDT
	#When : từ khóa này dùng để đánh dấu các bước mà nó sẽ thao tác với trình duyệt
	When User enters <username> and <password> DDT
	#Then : dùng để đánh dấu sau khi thực hiện xong thì mình sẽ có những gì
	Then <name> is navigated to home page DDT
	Examples:
	  | name                | username        | password |
	  | Nguyễn Thị Thu      | thu1@gmail.com  | 123456   |
	  | Trần Thanh Tùng     | tung@gmail.com  | 123456   |
	  | Vũ Anh Tuấn         | tuan@gmail.com  | 123456   |
	  | Lê Thị Hồng Anh     | anh@gmail.com   | 123456   |
	  | Ðỗ Thành Nam        | nam@gmail.com   | 123456   |
