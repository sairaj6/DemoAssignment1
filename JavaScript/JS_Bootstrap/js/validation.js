

let nameError = false;
let EmailError = false;
let MobileError = false;
let GenderError = false;
let HobbiesError = false;
let dateError = false;
let cityError = false;
let ConfirmError = false;

document.getElementById("txt_name").onblur = checkName;
document.getElementById("txt_email").onblur = checkEmail;
document.getElementById("txt_mobile").onblur = checkMobile;
//document.getElementsByName("gender").onblur = checkGender;
//document.getElementsByName("chbx_hobbies").onblur=function(){ console.log("hello")}
document.getElementById("date").onblur = checkDate;
document.getElementById("drpdwn_city").onchange = checkCity;
document.getElementById("txt_password").onchange = checkPassword;
document.getElementById("txt_confirmpassword").onchange = confirmPassword;



document.getElementById("btn_sign_up").onclick = function ($event) {
  checkName(),
    checkEmail(),
    checkMobile(),
    checkGender(),
    checkHobbies(),
    checkDate(),
    checkCity(),
    checkPassword(),
    confirmPassword();

  if (
    nameError == false &&
    EmailError == false &&
    MobileError == false &&
    HobbiesError == false &&
    captchaError == false &&
    dateError == false &&
    cityError == false &&
    PasswordError == false &&
    ConfirmError == false

  )
    alert("data submitted successfully");
  else $event.preventDefault();
};

function checkName() {
  let pattern = /^[a-z_A-Z' ]+$/;

  let name = document.getElementById("txt_name").value;
  if (name.length === 0) {
    document.getElementById("spn_name").innerHTML = "enter name";
    nameError = true;
  } else if (!name.match(pattern)) {
    document.getElementById("spn_name").innerHTML = "enter valid name";
    nameError = true;
  } else {
    document.getElementById("spn_name").innerHTML = "";
    nameError = false;
  }
}

function checkEmail() {
  let pattern = /^[a-z0-9.%+-]+@[a-z0-9.-]+\.[a-z]{2,}$/;
  let email = document.getElementById("txt_email").value;
  if (email.length === 0) {
    document.getElementById("spn_email").innerHTML = "enter email";
    EmailError = true;
  } else if (!email.match(pattern)) {
    document.getElementById("spn_email").innerHTML = "enter valid email";
    EmailError = true;
  } else {
    document.getElementById("spn_email").innerHTML = "";
    EmailError = false;
  }
}

function checkMobile() {
  let pattern = /^[0-9]{10}$/;
  let mobile = document.getElementById("txt_mobile").value;

  if (mobile.length === 0) {
    document.getElementById("spn_mobile").innerHTML = "enter mobile";
    MobileError = true;
  } else if (!mobile.match(pattern)) {
    document.getElementById("spn_mobile").innerHTML = "enter valid mobile";
    MobileError = true;
  } else {
    document.getElementById("spn_mobile").innerHTML = "";
    MobileError = false;
  }
}

function checkGender() {
  let g;
  let gender = document.getElementsByName("gender");

  if (!gender[0].checked && !gender[1].checked) {
    document.getElementById("spn_gender").innerHTML = "enter gender";
    GenderError = true;
  } else if (gender[0].checked) {
    g = gender[0].value;
    console.log(g);
    // if(!g.length==0)
    document.getElementById("spn_gender").innerHTML = " ";
    GenderError = false;
  } else if (gender[1].checked) {
    g = gender[1].value;
    console.log(g);
    document.getElementById("spn_gender").innerHTML = " ";
    GenderError = false;
  } else {
    document.getElementById("spn_gender").innerHTML = " ";
    GenderError = false;
  }
}

function checkHobbies() {
  let hobbies = document.getElementsByName("chbx_hobbies");
  //console.log(hobbies.values)
  let bool = false;
  for (let i = 0; i < hobbies.length; i++) {
    if (hobbies[i].checked == true) {
      bool = true;
    }
  }
  if (bool == false) {
    document.getElementById("spn_hobbies").innerHTML = "check checkbox";
    HobbiesError = true;
  } else {
    HobbiesError = false;
    document.getElementById("spn_hobbies").innerHTML = "";
  }
}

function checkDate()
{
    let date = document.getElementById("date").value;
    let today = new Date().toISOString().slice(0, 10);
    console.log(typeof date);
   // console.log(`date=${date} today=${today}`)
    if(date=="")
    {
        document.getElementById("spn_date").innerHTML="enter valid date";
        dateError=true;
    }
    else if(date>=today)
    {
        document.getElementById("spn_date").innerHTML="enter valid date";
        dateError=true;
    }
    else{
        document.getElementById("spn_date").innerHTML=" ";
    }
}

function checkCity(){
    let city = document.getElementById("drpdwn_city").value
    if(city=="select state")
    {
        document.getElementById("spn_city").innerHTML= "enter city";
        cityError = true;
    }
    else if(city == "Kolhapur")
    {
        drpdwn_taluka.style.visibility="visible"

        document.getElementById("drpdwn_taluka").onchange=function()
        {
            let taluka = document.getElementById("drpdwn_taluka").value
            //console.log("inside taluka function")

            if(taluka == "select taluka")
            {
                document.getElementById("spn_city").innerHTML= "enter taluka";
               // console.log("inside taluka if")
                cityError = true;
            }
            else if(taluka=="others")
            {
                // createtxt();
                //     function createtxt(){
                //         let txt=document.createElement("input")
                //         txt.setAttribute("type","text")
                //         txt.setAttribute("id","uname")
                //         txt.setAttribute("placeHolder","enter name")
                //         document.body.appendChild(txt)
                //         document.getElementById("drpdwn_taluka").appendChild(txt)
                //     }
                txt_others.style.visibility="visible"
                txt_others.focus()

                document.getElementById("txt_others").onblur=function(){
                    let othercity=document.getElementById("txt_others").value
                    if(othercity.length == 0)
                    {
                        document.getElementById("spn_city").innerHTML= "write taluka";
                        cityError = true;
                    }
                    else
                    {
                        document.getElementById("spn_city").innerHTML= " ";
                        cityError = false;
                    }
                }
        }
        else
        {
            document.getElementById("spn_city").innerHTML= " ";
            cityError = false;
        }
        }

    }
    else
    {
        document.getElementById("spn_city").innerHTML= " ";
        cityError = false;
    }
}


function checkPassword()
{
    let pattern = /^[a-z_A-Z_0-9]+$/;
    let password = document.getElementById("txt_password").value;

    if (password.length < 4 ) {
        document.getElementById("spn_password").innerHTML = "password should be more than 4 digits";
        PasswordError = true;
      } else if (!password.match(pattern)) {
        document.getElementById("spn_password").innerHTML = "enter valid Password";
        PasswordError = true;
      } else {
            document.getElementById("spn_password").innerHTML = "";
            PasswordError = false;
        }

}
function confirmPassword()
{
    let password = document.getElementById("txt_password").value;
    let confirmpassword = document.getElementById("txt_confirmpassword").value;

    if(password !== confirmpassword)
        {
           
            document.getElementById("spn_confirmpassword").innerHTML = "enter correct Password";
            ConfirmError = true;
        }
    else{
            document.getElementById("spn_confirmpassword").innerHTML = "";
            ConfirmError = false;

        }

}
