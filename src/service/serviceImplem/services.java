package service.serviceImplem;

import hotel.entity.Admin;
import hotel.entity.Customers;
import hotel.entity.Staff;

public interface services {
   void book(Staff staff, Admin admin, Customers customer);
   void record(Staff staff, Admin admin);
   void clear(Staff staff, Customers customer);


    }

