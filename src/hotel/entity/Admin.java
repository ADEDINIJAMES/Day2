package hotel.entity;
import hotel.entity.enums.Roles;



    public class Admin extends User {

        private Roles roles;

        public Roles getRoles() {
            return roles;
        }

        public void setRoles(Roles roles) {
            this.roles = roles;
        }

}
