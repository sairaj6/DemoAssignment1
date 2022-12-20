// create a class

//Paramaterized Constructor
// class Student {
//     constructor(name, classes, age, gender, location){
//         this.name = name;
//         this.classes = classes;
//         this.age = age;
//         this.gender = gender;
//         this.location = location;
//     }
// }

let Students = [];

//Defauly Connstructor
class Student {
    constructor(){
        this.id = undefined;
        this.name = undefined;
        this.age = undefined;
        this.gender = undefined;
        this.location = undefined;
    }

    //add
    add(id, name, age, gender, location){
        let newRecord = {
            id : id,
            name : name,
            age : age,
            gender : gender,
            location : location
        }

        //add to array
        Students.push(newRecord)
        console.log(Students[0])
    }

    //list all students
    list(){
        Students.forEach(_student =>{
            console.log("Id : " + _student.id)
            console.log("Name : " + _student.name)
            console.log("Age : " + _student.age)
            console.log("Gender : " + _student.gender)
            console.log("Location : " + _student.location)
        });
    }

    //edit


    //deleteById
    deleteById(){
        var sid = window.prompt("Enter Id of student to delete: ");
        let index;
        Students.forEach(_student =>{
           if(sid === _student.id)
           {
                index = Students.indexOf(sid);
            }
        });
        console.log(index);
        Students.pop(index);
    }

    //delete
    delete(){
            Students.pop();
        }


    //update
    update(id, name1, location1){
        Students.forEach(_student => {
            if(id === _student.id)
           {
                index = Students.indexOf(sid);
                Students[index].name=name1;
                Students[index].location=location1;
            }
            else{
                alert("Invalid Student ID")
            }
        });
        
    }



}


Student = new Student();
var flag =true;
while(flag){
    choice = parseInt(window.prompt("1. Add \n2. List \n3. Update  \n4. Delete \n5. Delete By Id \n6. Exit"));

    //Switch case
    switch(choice)
    {
        case 1:
            var innerflag = true;
            while(innerflag)
            {
                sid = window.prompt("Enter Id: ");
                sName = window.prompt("Enter Name: ");
                sAge = window.prompt("Enter Age: ");
                sGender = window.prompt("Enter Gender: ");
                sLocation = window.prompt("Enter Location: ");

                if(sid == null || sName ==null|| sAge == null ||sGender == null || sLocation==null)
                {
                    alert("Enter all the fields")
                }
                else{
                    Student.add(sid, sName, sAge, sGender, sLocation);
                    innerflag = false;
                    console.log(Student);

                }

                
            }
            
            break;
        case 2:
            Student.list();
            console.log(Student);
            break;
        case 3:
            sid = window.prompt("Enter Id");
            sname = window.prompt("Enter Name to Update");
            sLocation = window.prompt("Enter Location to Update");
            Student.update(sid, sname, sLocation);
        case 4:
            Student.delete();
            console.log(Student);
            break;
        case 5:
            Student.deleteById();
            console.log(Student);
            break;
        case 6:
            flag = false;
            break;
        default:
            alert("Invalid Input")


    }
}




























































