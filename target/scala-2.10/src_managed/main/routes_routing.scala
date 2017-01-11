// @SOURCE:/Users/pebri/Documents/play-2.1.1/play-postgres/conf/routes
// @HASH:709e89846f3de2f32307179dee175f5e04fbd830
// @DATE:Wed Jan 11 16:48:23 WIB 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_list1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:11
private[this] lazy val controllers_Compctrl_companysingle2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companysingle"))))
        

// @LINE:12
private[this] lazy val controllers_Compctrl_companylist3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companylist"))))
        

// @LINE:15
private[this] lazy val controllers_Application_create4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/new"))))
        

// @LINE:16
private[this] lazy val controllers_Application_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:18
private[this] lazy val controllers_Application_jsons6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jsons"))))
        

// @LINE:21
private[this] lazy val controllers_Compctrl_companycreate7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("company/new"))))
        

// @LINE:22
private[this] lazy val controllers_Compctrl_companysave8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("company"))))
        

// @LINE:25
private[this] lazy val controllers_Application_edit9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Application_update10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Compctrl_companyedit11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("company/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_Compctrl_companyupdate12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("company/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:33
private[this] lazy val controllers_Application_delete13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:36
private[this] lazy val controllers_Compctrl_companydelete14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("company/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:39
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companysingle""","""controllers.Compctrl.companysingle(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companylist""","""controllers.Compctrl.companylist(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/new""","""controllers.Application.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jsons""","""controllers.Application.jsons()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """company/new""","""controllers.Compctrl.companycreate()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """company""","""controllers.Compctrl.companysave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """company/$id<[^/]+>""","""controllers.Compctrl.companyedit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """company/$id<[^/]+>""","""controllers.Compctrl.companyupdate(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """company/$id<[^/]+>/delete""","""controllers.Compctrl.companydelete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Default path will just redirect to the computer list""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Computers list (look at the default values for pagination parameters)""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:11
case controllers_Compctrl_companysingle2(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Compctrl.companysingle(p, s, o, f), HandlerDef(this, "controllers.Compctrl", "companysingle", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """companysingle"""))
   }
}
        

// @LINE:12
case controllers_Compctrl_companylist3(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Compctrl.companylist(p, s, o, f), HandlerDef(this, "controllers.Compctrl", "companylist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """companylist"""))
   }
}
        

// @LINE:15
case controllers_Application_create4(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"GET", """ Add computer""", Routes.prefix + """computers/new"""))
   }
}
        

// @LINE:16
case controllers_Application_save5(params) => {
   call { 
        invokeHandler(controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil,"POST", """""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:18
case controllers_Application_jsons6(params) => {
   call { 
        invokeHandler(controllers.Application.jsons(), HandlerDef(this, "controllers.Application", "jsons", Nil,"GET", """""", Routes.prefix + """jsons"""))
   }
}
        

// @LINE:21
case controllers_Compctrl_companycreate7(params) => {
   call { 
        invokeHandler(controllers.Compctrl.companycreate(), HandlerDef(this, "controllers.Compctrl", "companycreate", Nil,"GET", """ Add company""", Routes.prefix + """company/new"""))
   }
}
        

// @LINE:22
case controllers_Compctrl_companysave8(params) => {
   call { 
        invokeHandler(controllers.Compctrl.companysave(), HandlerDef(this, "controllers.Compctrl", "companysave", Nil,"POST", """""", Routes.prefix + """company"""))
   }
}
        

// @LINE:25
case controllers_Application_edit9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]),"GET", """ Edit existing computer""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Application_update10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Compctrl_companyedit11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Compctrl.companyedit(id), HandlerDef(this, "controllers.Compctrl", "companyedit", Seq(classOf[Long]),"GET", """ Edit existing company""", Routes.prefix + """company/$id<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_Compctrl_companyupdate12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Compctrl.companyupdate(id), HandlerDef(this, "controllers.Compctrl", "companyupdate", Seq(classOf[Long]),"POST", """""", Routes.prefix + """company/$id<[^/]+>"""))
   }
}
        

// @LINE:33
case controllers_Application_delete13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]),"POST", """ Delete a computer""", Routes.prefix + """computers/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:36
case controllers_Compctrl_companydelete14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Compctrl.companydelete(id), HandlerDef(this, "controllers.Compctrl", "companydelete", Seq(classOf[Long]),"POST", """ Delete a company""", Routes.prefix + """company/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:39
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        