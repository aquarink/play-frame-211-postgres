
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object companylist extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Company],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Company], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*33.2*/header/*33.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*33.38*/("""
    <th class=""""),_display_(Seq[Any](/*34.17*/key/*34.20*/.replace(".","_"))),format.raw/*34.37*/(""" header """),_display_(Seq[Any](/*34.46*/if(currentSortBy == key){/*34.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*34.136*/("""">
        <a href=""""),_display_(Seq[Any](/*35.19*/link(0, key))),format.raw/*35.31*/("""">"""),_display_(Seq[Any](/*35.34*/title)),format.raw/*35.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Compctrl.companylist(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.114*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""

"""),format.raw/*37.2*/("""

"""),_display_(Seq[Any](/*39.2*/main/*39.6*/ {_display_(Seq[Any](format.raw/*39.8*/("""
	<h1>Test</h1>
""")))})))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Company],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.Html = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Company],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 10 16:14:42 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/companylist.scala.html
                    HASH: a3c814480fffbdea4172fef173e3e7ade2a3632c
                    MATRIX: 773->1|946->864|960->870|1054->900|1107->917|1119->920|1158->937|1203->946|1237->972|1325->1036|1382->1057|1416->1069|1455->1072|1482->1077|1520->242|1531->246|2067->113|2096->240|2124->751|2154->861|2183->1093|2221->1096|2233->1100|2272->1102
                    LINES: 26->1|28->33|28->33|30->33|31->34|31->34|31->34|31->34|31->34|31->34|32->35|32->35|32->35|32->35|34->6|34->6|56->1|58->5|59->27|61->31|63->37|65->39|65->39|65->39
                    -- GENERATED --
                */
            