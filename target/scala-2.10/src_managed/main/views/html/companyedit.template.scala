
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
object companyedit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Company],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, companyFrm: Form[Company]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit computer</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Compctrl.companyupdate(id))/*11.45*/ {_display_(Seq[Any](format.raw/*11.47*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(companyFrm("name"), '_label -> "Company name"))),format.raw/*15.70*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Update this Company" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Application.list())),format.raw/*21.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*24.6*/("""
    
    """),_display_(Seq[Any](/*26.6*/form(routes.Compctrl.companydelete(id), 'class -> "topRight")/*26.67*/ {_display_(Seq[Any](format.raw/*26.69*/("""
        <input type="submit" value="Delete this Company" class="btn danger">
    """)))})),format.raw/*28.6*/("""
    
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(id:Long,companyFrm:Form[Company]): play.api.templates.Html = apply(id,companyFrm)
    
    def f:((Long,Form[Company]) => play.api.templates.Html) = (id,companyFrm) => apply(id,companyFrm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 11 16:45:06 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/companyedit.scala.html
                    HASH: 6b58e1459083d693df79f90f3a4988d3c9fa4ef8
                    MATRIX: 741->1|863->59|895->83|979->38|1007->57|1035->137|1073->141|1084->145|1122->147|1200->190|1248->229|1288->231|1375->282|1453->338|1666->515|1681->521|1722->540|1808->595|1854->606|1924->667|1964->669|2078->752|2116->759
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|49->21|49->21|49->21|52->24|54->26|54->26|54->26|56->28|58->30
                    -- GENERATED --
                */
            