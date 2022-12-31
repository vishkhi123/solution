const express=require('express');
const app=express();


const bodyParser=require('body-parser');
app.use(bodyParser());

app.get('/',(req,res)=>{

    res.sendFile(__dirname+('/index.html'))

})

app.post('/piyush',(req,res)=>{
    var name=req.body.str1+" "+req.body.str2+" "+req.body.str3
    res.send(name)


})




app.listen(3000,()=>{
    console.log('server is connect')
})