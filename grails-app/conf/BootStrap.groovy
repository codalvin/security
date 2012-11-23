import org.example.SecRole
import org.example.SecUserSecRole;
import org.example.User

class BootStrap {
	
	def springSecurityService
    def init = { servletContext ->
		
		
		def userRole = SecRole.findByAuthority("ROLE_USER") ?: new SecRole(authority:"ROLE_USER").save()
		def adminRole = SecRole.findByAuthority("ROLE_ADMIN") ?: new SecRole(authority:"ROLE_ADMIN").save()
		
		def user = new User(username:"superadmin",password:"1234",enabled:true)
		user.accountExpired = false
		user.accountLocked = false
		user.passwordExpired = false
		user.save()
		SecUserSecRole.create(user, adminRole)
    }
    def destroy = {
    }
}
