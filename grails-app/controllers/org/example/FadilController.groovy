package org.example

import grails.plugins.springsecurity.Secured;

class FadilController {

    def index() {
		render "ini bisa diakses kalo udah login"
	}
	
	@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
	def fis = {
		render "ini juga kalo udah login"
	}
}
