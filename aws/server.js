const express=require("express");
const app=express();

app.get('/',function(req,res){
    res.sendFile(__dirname + '/Assign3b.html')
})

app.listen(3000)
console.log("Connected.....")

