$.ajax({
    url:"/resource/errorAjaxPage",
    type:"post",
    async:false,
    success:function(data){
        if(data.status == 200 && data.msg=="OK"){
            alert("success");
        } else  {
            alert("发生异常："+data.msg);
        }
    },
    error:function(response,ajaxOptions,throwError){
        alert("error");
    }
});