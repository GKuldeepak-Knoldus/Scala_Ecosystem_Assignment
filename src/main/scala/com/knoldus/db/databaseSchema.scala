package com.knoldus.db
import com.knoldus.models
import com.knoldus.models.Users
import slick.driver.H2Driver.api._
import slick.lifted.ProvenShape

trait databaseSchema {
  class User(tag: Tag) extends Table[Users](tag , "users") {
    def id = column[Int]("uuid", O.PrimaryKey)

    def name = column[String]("name")

    def emailId = column[String]("emailid")

    def password = column[String]("password")

    def usertype = column[String]("usertype")

    def * : ProvenShape[Users] =  (id , name , emailId , password ,usertype) <> (Users.tupled , Users.unapply)


  }


}
