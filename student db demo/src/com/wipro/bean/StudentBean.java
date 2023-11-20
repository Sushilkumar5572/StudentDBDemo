package com.wipro.bean;

public class StudentBean {
        int roll_no;
        String name;
        String email;
        String addr;
        public int getRoll_no() {
                return roll_no;
        }
        public void setRoll_no(int roll_no) {
                this.roll_no = roll_no;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public String getEmail() {
                return email;
        }
        public void setEmail(String email) {
                this.email = email;
        }
        public String getAddress() {
                return addr;
        }
        public void setAddress(String addr) {
                this.addr = addr;
        }
        public StudentBean(int roll_no, String name, String email, String addr) {
                this.roll_no = roll_no;
                this.name = name;
                this.email = email;
                this.addr = addr;
        }

        

}
