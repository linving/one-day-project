
define({
	error:{
		"ACT_REMOVE_CONFIRM":"确定要删除吗？",
		"ACT_REMOVE_FAILURE":"发生错误，没有成功删除！",
		
		"FORM_INVALID":"请按照要求填写！",
		
		"SERVER_ERROR":"<i class='fa fa-exclamation-triangle'>  错误：",
		"MOBILE_NUM_ERROR":"请输入正确的手机号码",
		
		"remote.unavailable":"服务器发生错误"
	},
	get:function(k){
		console.log("Error undefined, key is "+k);
		return this.error[k]||this.error["remote.unavailable"];
	}
});