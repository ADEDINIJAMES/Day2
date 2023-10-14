package hotel.entity;

public class User {
        private String name;
        private Long phone;
        private String address;
        private String email;
        private String nextOfKin;

        @Override
        public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", phone=" + phone +
                        ", address='" + address + '\'' +
                        ", email='" + email + '\'' +
                        ", nextOfKin='" + nextOfKin + '\'' +
                        ", nextOfKinNo=" + nextOfKinNo +
                        '}';
        }

        private Long nextOfKinNo;

        public String getName() {
                return name;
        }

        public String setName(String name) {
                this.name = name;
            return name;
        }

        public Long getPhone() {
                return phone;
        }

        public void setPhone(Long phone) {
                this.phone = phone;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getNextOfKin() {
                return nextOfKin;
        }

        public void setNextOfKin(String nextOfKin) {
                this.nextOfKin = nextOfKin;
        }

        public Long getNextOfKinNo() {
                return nextOfKinNo;
        }

        public void setNextOfKinNo(Long nextOfKinNo) {
                this.nextOfKinNo = nextOfKinNo;
        }
}
