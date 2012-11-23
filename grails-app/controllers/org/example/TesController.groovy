package org.example

import grails.plugins.springsecurity.Secured;


class TesController {
	//@Secured(['ROLE_USER'])
    def index() {
		render("tess")
	}
	
	def block = {
		render("bisa kalo user")
	}
}
