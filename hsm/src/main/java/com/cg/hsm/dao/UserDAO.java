package com.cg.hsm.dao;

import com.cg.hsm.domain.User;
/**
 * This UserDAO interface will perform the admin and user authentication
 * @author ANJUM
 *
 */
public interface UserDAO 
{
   void addAuthentication(User user);
   boolean checkAdminAuthentication(String username,String password);
   boolean checkAuthentication(String username,String password);
}
