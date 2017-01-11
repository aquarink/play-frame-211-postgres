
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
object companycreate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Company],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(companyFrm: Form[Company]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Add a Company</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Compctrl.companysave())/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(companyFrm("name"), '_label -> "Company name"))),format.raw/*15.70*/("""
            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this Company" class="btn primary"> or 
            <a href="#" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*25.6*/("""
    
""")))})))}
    }
    
    def render(companyFrm:Form[Company]): play.api.templates.Html = apply(companyFrm)
    
    def f:((Form[Company]) => play.api.templates.Html) = (companyFrm) => apply(companyFrm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 11 16:45:06 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/companycreate.scala.html
                    HASH: 1644db0082ef84715dd78fda97300e364622eef0
                    MATRIX: 738->1|850->49|882->73|966->28|994->47|1022->127|1060->131|1071->135|1109->137|1187->180|1231->215|1271->217|1358->268|1436->324|1704->561
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|53->25
                    -- GENERATED --
                */
            