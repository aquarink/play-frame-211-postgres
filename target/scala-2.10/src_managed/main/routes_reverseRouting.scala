// @SOURCE:/Users/pebri/Documents/play-2.1.1/play-postgres/conf/routes
// @HASH:709e89846f3de2f32307179dee175f5e04fbd830
// @DATE:Wed Jan 11 16:48:23 WIB 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:36
// @LINE:30
// @LINE:29
// @LINE:22
// @LINE:21
// @LINE:12
// @LINE:11
class ReverseCompctrl {
    

// @LINE:11
def companysingle(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companysingle" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:29
def companyedit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "company/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:30
def companyupdate(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "company/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def companylist(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companylist" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:21
def companycreate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "company/new")
}
                                                

// @LINE:36
def companydelete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "company/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:22
def companysave(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "company")
}
                                                
    
}
                          

// @LINE:33
// @LINE:26
// @LINE:25
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:33
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:18
def jsons(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jsons")
}
                                                

// @LINE:15
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/new")
}
                                                

// @LINE:9
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:26
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:16
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:25
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:36
// @LINE:30
// @LINE:29
// @LINE:22
// @LINE:21
// @LINE:12
// @LINE:11
class ReverseCompctrl {
    

// @LINE:11
def companysingle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companysingle",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companysingle" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:29
def companyedit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companyedit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "company/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def companyupdate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companyupdate",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "company/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def companylist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companylist",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companylist" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:21
def companycreate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companycreate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "company/new"})
      }
   """
)
                        

// @LINE:36
def companydelete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companydelete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "company/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:22
def companysave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Compctrl.companysave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "company"})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:26
// @LINE:25
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:33
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:18
def jsons : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsons",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jsons"})
      }
   """
)
                        

// @LINE:15
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/new"})
      }
   """
)
                        

// @LINE:9
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:26
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:16
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:25
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:36
// @LINE:30
// @LINE:29
// @LINE:22
// @LINE:21
// @LINE:12
// @LINE:11
class ReverseCompctrl {
    

// @LINE:11
def companysingle(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companysingle(p, s, o, f), HandlerDef(this, "controllers.Compctrl", "companysingle", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """companysingle""")
)
                      

// @LINE:29
def companyedit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companyedit(id), HandlerDef(this, "controllers.Compctrl", "companyedit", Seq(classOf[Long]), "GET", """ Edit existing company""", _prefix + """company/$id<[^/]+>""")
)
                      

// @LINE:30
def companyupdate(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companyupdate(id), HandlerDef(this, "controllers.Compctrl", "companyupdate", Seq(classOf[Long]), "POST", """""", _prefix + """company/$id<[^/]+>""")
)
                      

// @LINE:12
def companylist(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companylist(p, s, o, f), HandlerDef(this, "controllers.Compctrl", "companylist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """companylist""")
)
                      

// @LINE:21
def companycreate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companycreate(), HandlerDef(this, "controllers.Compctrl", "companycreate", Seq(), "GET", """ Add company""", _prefix + """company/new""")
)
                      

// @LINE:36
def companydelete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companydelete(id), HandlerDef(this, "controllers.Compctrl", "companydelete", Seq(classOf[Long]), "POST", """ Delete a company""", _prefix + """company/$id<[^/]+>/delete""")
)
                      

// @LINE:22
def companysave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Compctrl.companysave(), HandlerDef(this, "controllers.Compctrl", "companysave", Seq(), "POST", """""", _prefix + """company""")
)
                      
    
}
                          

// @LINE:33
// @LINE:26
// @LINE:25
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:33
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]), "POST", """ Delete a computer""", _prefix + """computers/$id<[^/]+>/delete""")
)
                      

// @LINE:18
def jsons(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsons(), HandlerDef(this, "controllers.Application", "jsons", Seq(), "GET", """""", _prefix + """jsons""")
)
                      

// @LINE:15
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq(), "GET", """ Add computer""", _prefix + """computers/new""")
)
                      

// @LINE:9
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Computers list (look at the default values for pagination parameters)""", _prefix + """computers""")
)
                      

// @LINE:26
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]), "POST", """""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:16
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq(), "POST", """""", _prefix + """computers""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Default path will just redirect to the computer list""", _prefix + """""")
)
                      

// @LINE:25
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]), "GET", """ Edit existing computer""", _prefix + """computers/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      