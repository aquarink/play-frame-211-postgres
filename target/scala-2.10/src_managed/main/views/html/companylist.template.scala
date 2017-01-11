
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
object companylist extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[models.Jsondatalist,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: models.Jsondatalist, currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
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
    routes.Compctrl.companysingle(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by company name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Compctrl.companycreate())),format.raw/*55.79*/("""">Add a new company</a>
        
    </div>
	"""),_display_(Seq[Any](/*58.3*/if(currentPage.getJsonlist().size == 0)/*58.42*/ {_display_(Seq[Any](format.raw/*58.44*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*64.7*/else/*64.12*/{_display_(Seq[Any](format.raw/*64.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*69.22*/header("name", "Title"))),format.raw/*69.45*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*74.18*/for(computer <- currentPage.getJsonlist()) yield /*74.60*/ {_display_(Seq[Any](format.raw/*74.62*/("""
                    <tr>
                        <td><a href="#">"""),_display_(Seq[Any](/*76.42*/computer/*76.50*/.getTitle())),format.raw/*76.61*/("""</a></td>
                    </tr>
                """)))})),format.raw/*78.18*/("""

            </tbody>
        </table>


        
    """)))})),format.raw/*85.6*/("""
""")))})))}
    }
    
    def render(currentPage:models.Jsondatalist,currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.Html = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((models.Jsondatalist,String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 11 16:48:23 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/companylist.scala.html
                    HASH: 2516b6dd10adce7d03844302481c5987e9792241
                    MATRIX: 763->1|926->855|940->861|1034->891|1087->908|1099->911|1138->928|1183->937|1217->963|1305->1027|1362->1048|1396->1060|1435->1063|1462->1068|1500->232|1511->236|2049->103|2078->230|2106->743|2136->853|2164->1084|2202->1087|2214->1091|2253->1093|2305->1110|2346->1142|2386->1144|2503->1225|2517->1230|2554->1245|2606->1266|2700->1324|2737->1339|2854->1420|2889->1433|3135->1643|3150->1649|3197->1674|3278->1720|3326->1759|3366->1761|3490->1868|3503->1873|3542->1874|3698->1994|3743->2017|3861->2099|3919->2141|3959->2143|4062->2210|4079->2218|4112->2229|4197->2282|4284->2338
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|84->58|84->58|84->58|90->64|90->64|90->64|95->69|95->69|100->74|100->74|100->74|102->76|102->76|102->76|104->78|111->85
                    -- GENERATED --
                */
            