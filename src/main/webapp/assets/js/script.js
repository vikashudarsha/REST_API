// step 01
async function submit() {
 try {
     const  response  = await  fetch("api/test/2",{
     method:"PUT",
         headers:{
          "Content-Type":"application/json"
     },
     body:JSON.stringify({
         name:"Sahan",
         email:"sahan@gmail.com"
     })
 });
if (response.ok){
   const json = await response.json();
   console.log(json.status);
}else {
    console.log("BAD RESPONSE");
}
}catch(e){
    console.log(e);
    }
}
//step 02
// function submit(){
//     fetch("test")
//         .then(response => response.json())
//         .then(data=> console.log(data))
//         .catch(error => console.log(error))
// }