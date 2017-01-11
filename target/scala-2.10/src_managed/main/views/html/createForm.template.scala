
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
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Add a computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            """),_display_(Seq[Any](/*18.14*/inputText(computerForm("description"), '_label -> "Description"))),format.raw/*18.78*/("""

            """),_display_(Seq[Any](/*20.14*/select(
                computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*25.14*/("""
            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*32.23*/routes/*32.29*/.Application.list())),format.raw/*32.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*35.6*/("""
    
""")))})))}
    }
    
    def render(computerForm:Form[Computer]): play.api.templates.Html = apply(computerForm)
    
    def f:((Form[Computer]) => play.api.templates.Html) = (computerForm) => apply(computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 11 16:45:07 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/createForm.scala.html
                    HASH: 4b3931ac6c95fb118d550ece56696806187572f1
                    MATRIX: 736->1|851->52|883->76|967->31|995->50|1023->130|1061->134|1072->138|1110->140|1189->184|1229->215|1269->217|1356->268|1437->327|1487->341|1576->408|1626->422|1719->493|1769->507|1855->571|1906->586|2157->815|2376->998|2391->1004|2432->1023|2518->1078
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|48->20|53->25|60->32|60->32|60->32|63->35
                    -- GENERATED --
                */
            