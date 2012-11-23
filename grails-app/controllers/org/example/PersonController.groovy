package org.example

class PersonController {
	def scaffold = true
    def index() {
		redirect (action:'list')
	}
}
