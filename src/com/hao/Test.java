package com.hao;

import com.alibaba.fastjson.*;

public class Test {

	public static void main(String[] args) {	
		
		// "formula": "IF($..swjszybGridlb[#].IsTianxie=='1',$..swjszybGridlb[#].zspmDm!=''&&$..swjszybGridlb[#].zspmDm!=null?IF(formCT.zspmCT[$..swjszybGridlb[#].zspmDm].nsqxDm!='11',new Date( new Date(($..swjszybGridlb[#].skssqz).replace(/\-/, '/ ')).getTime()+24*60*60*1000).getMonth()!=new Date(($..swjszybGridlb[#].skssqz).replace(/\-/, '/ ')).getMonth(),true):true,true)",
		 String json = "{\"data\":\"IF($..swjszybGridlb[#].IsTianxie=='1',$..swjszybGridlb[#].zspmDm!=''&&$..swjszybGridlb[#].zspmDm!=null?IF(formCT.zspmCT[$..swjszybGridlb[#].zspmDm].nsqxDm!='11',new Date( new Date(($..swjszybGridlb[#].skssqz).replace(/-/, '/ '))  \"}";
		 JSONObject jsonObject =  (JSONObject) JSON.parse(json);
		
		System.out.println(json);
	}

}
