let currentTheme = getTheme();
changeTheme(currentTheme);

// Change theme
function changeTheme() {
    document.querySelector("html").classList.add(currentTheme);

    const changeThemeBtn = document.querySelector("#theme_mode");
    
    changeThemeBtn.addEventListener("click",(event)=>{

        const oldTheme = currentTheme;
        console.log("I clicked");
        if(currentTheme==="dark"){
            currentTheme="light";
        }else{
            currentTheme="dark";
        }

        setTheme(currentTheme);
        document.querySelector("html").classList.remove(oldTheme);
        document.querySelector("html").classList.add(currentTheme);


        //change button text
        changeThemeBtn.querySelector('span').textContent=currentTheme=="light"?" Dark":" Light";


    })
}

// Set theme in local storage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

// Get theme from local storage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}
