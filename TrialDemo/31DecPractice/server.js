const express=require('express');
const app=express();

const mongoose=require('mongoose')
const url='mongodb://127.0.0.1:27017/vishuDB'  // always check that there should be no space at all in url or it will throw errors., and start mongo and mongod form cmd .
mongoose.connect(url,{useNewUrlParser:true})
const con=mongoose.connection;
con.on('open',()=>{
    console.log('conneted to mongo.....');
})

app.listen(3000)
console.log("server is listening at 3000.");