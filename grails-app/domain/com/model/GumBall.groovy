package com.model
import grails.rest.*

@Resource(uri="/machines", formats=['json','xml'])
class GumBall {
	String serialNumber
	String modelNumber
	String count
	
    static constraints = {
    	serialNumber unique:true, blank :false
		modelNumber unique:true, blank:false
		count blank:false
	}
}
