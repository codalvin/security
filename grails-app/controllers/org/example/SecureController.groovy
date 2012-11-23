package org.example

class SecureController {

    def index() {
		render "ini bisa kalo di block juga lho sih"
	}
	
	def block = {
		"sama ini jugali"
	}
	
}
