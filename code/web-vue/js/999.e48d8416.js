"use strict";(self["webpackChunkweb_vue"]=self["webpackChunkweb_vue"]||[]).push([[999],{1999:function(e,a,s){s.r(a),s.d(a,{default:function(){return m}});var t=function(){var e=this,a=e._self._c;return a("div",{attrs:{id:"a"}},[a("div",{attrs:{id:"login_box"}},[a("h2",[e._v("LOGIN")]),a("div",{attrs:{id:"input_box"}},[a("input",{directives:[{name:"model",rawName:"v-model",value:e.username,expression:"username"}],attrs:{type:"text",placeholder:"请输入用户名"},domProps:{value:e.username},on:{input:function(a){a.target.composing||(e.username=a.target.value)}}})]),a("div",{staticClass:"input_box"},[a("input",{directives:[{name:"model",rawName:"v-model",value:e.password,expression:"password"}],attrs:{type:"password",placeholder:"请输入密码"},domProps:{value:e.password},on:{input:function(a){a.target.composing||(e.password=a.target.value)}}})]),a("button",{on:{click:e.handleLogin}},[e._v("登录")]),a("br")])])},n=[],r=(s(4114),s(4373)),o=s(9325),i=s(9143),u={name:"LoginComponent",data(){return{username:"admin",password:"123456"}},methods:{handleLogin(){r.A.post("/api/login",{username:this.username,password:this.password}).then((e=>{1==e.data.code?o.A.push({path:"/main"}):i.Message.error(e.data.msg)})).catch((e=>{i.Message.error("登录失败",e.data.msg)}))}}},d=u,p=s(1656),l=(0,p.A)(d,t,n,!1,null,"c8b5c160",null),m=l.exports}}]);
//# sourceMappingURL=999.e48d8416.js.map