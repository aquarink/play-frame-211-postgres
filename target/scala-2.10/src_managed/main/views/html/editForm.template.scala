
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Computer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, computerForm: Form[Computer]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Computer name"))),format.raw/*15.73*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Introduced date"))),format.raw/*16.81*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date"))),format.raw/*17.85*/("""
            
            """),_display_(Seq[Any](/*19.14*/select(
                computerForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*24.14*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*30.23*/routes/*30.29*/.Application.list())),format.raw/*30.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*33.6*/("""
    
    """),_display_(Seq[Any](/*35.6*/form(routes.Application.delete(id), 'class -> "topRight")/*35.63*/ {_display_(Seq[Any](format.raw/*35.65*/("""
        <input type="submit" value="Delete this computer" class="btn danger">
    """)))})),format.raw/*37.6*/("""
    
""")))})),format.raw/*39.2*/("""
"""))}
    }
    
    def render(id:Long,computerForm:Form[Computer]): play.api.templates.Html = apply(id,computerForm)
    
    def f:((Long,Form[Computer]) => play.api.templates.Html) = (id,computerForm) => apply(id,computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 10 13:48:46 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/editForm.scala.html
                    HASH: 5de231189f456ec9a95d442450306433bd90a50c
                    MATRIX: 739->1|864->62|896->86|980->41|1008->60|1036->140|1074->144|1085->148|1123->150|1201->193|1245->228|1285->230|1372->281|1453->340|1503->354|1592->421|1642->435|1735->506|1798->533|2049->762|2261->938|2276->944|2317->963|2403->1018|2449->1029|2515->1086|2555->1088|2670->1172|2708->1179
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|47->19|52->24|58->30|58->30|58->30|61->33|63->35|63->35|63->35|65->37|67->39
                    -- GENERATED --
                */
            