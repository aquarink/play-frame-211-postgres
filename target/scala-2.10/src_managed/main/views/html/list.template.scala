
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Computer],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Computer], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
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
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("computers.list.title", currentPage.getTotalRowCount))),format.raw/*40.87*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Application.create())),format.raw/*55.75*/("""">Add a new computer</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Computer name"))),format.raw/*70.53*/("""
                    """),_display_(Seq[Any](/*71.22*/header("introduced", "Introduced"))),format.raw/*71.56*/("""
                    """),_display_(Seq[Any](/*72.22*/header("discontinued", "Discontinued"))),format.raw/*72.60*/("""
                    """),_display_(Seq[Any](/*73.22*/header("company.name", "Company"))),format.raw/*73.55*/("""
                    """),_display_(Seq[Any](/*74.22*/header("description", "Description"))),format.raw/*74.58*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*79.18*/for(computer <- currentPage.getList) yield /*79.54*/ {_display_(Seq[Any](format.raw/*79.56*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*81.39*/routes/*81.45*/.Application.edit(computer.id))),format.raw/*81.75*/("""">"""),_display_(Seq[Any](/*81.78*/computer/*81.86*/.name)),format.raw/*81.91*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*83.30*/if(computer.introduced == null)/*83.61*/ {_display_(Seq[Any](format.raw/*83.63*/("""
                                <em>-</em>
                            """)))}/*85.31*/else/*85.36*/{_display_(Seq[Any](format.raw/*85.37*/("""
                                """),_display_(Seq[Any](/*86.34*/computer/*86.42*/.introduced.format("dd MMM yyyy"))),format.raw/*86.75*/("""
                            """)))})),format.raw/*87.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*90.30*/if(computer.discontinued == null)/*90.63*/ {_display_(Seq[Any](format.raw/*90.65*/("""
                                <em>-</em>
                            """)))}/*92.31*/else/*92.36*/{_display_(Seq[Any](format.raw/*92.37*/("""
                                """),_display_(Seq[Any](/*93.34*/computer/*93.42*/.discontinued.format("dd MMM yyyy"))),format.raw/*93.77*/("""
                            """)))})),format.raw/*94.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*97.30*/if(computer.company == null)/*97.58*/ {_display_(Seq[Any](format.raw/*97.60*/("""
                                <em>-</em>
                            """)))}/*99.31*/else/*99.36*/{_display_(Seq[Any](format.raw/*99.37*/("""
                                """),_display_(Seq[Any](/*100.34*/computer/*100.42*/.company.name)),format.raw/*100.55*/("""
                            """)))})),format.raw/*101.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*104.30*/if(computer.description == null)/*104.62*/ {_display_(Seq[Any](format.raw/*104.64*/("""
                                <em>-</em>
                            """)))}/*106.31*/else/*106.36*/{_display_(Seq[Any](format.raw/*106.37*/("""
                                """),_display_(Seq[Any](/*107.34*/computer/*107.42*/.description)),format.raw/*107.54*/("""
                            """)))})),format.raw/*108.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*111.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*118.18*/if(currentPage.hasPrev)/*118.41*/ {_display_(Seq[Any](format.raw/*118.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*120.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*120.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*122.19*/else/*122.24*/{_display_(Seq[Any](format.raw/*122.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*126.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*128.36*/currentPage/*128.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*128.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*130.18*/if(currentPage.hasNext)/*130.41*/ {_display_(Seq[Any](format.raw/*130.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*132.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*132.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*134.19*/else/*134.24*/{_display_(Seq[Any](format.raw/*134.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*138.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*142.6*/("""
        
""")))})),format.raw/*144.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Computer],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.Html = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Computer],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 10 14:39:34 WIB 2017
                    SOURCE: /Users/pebri/Documents/play-2.1.1/play-postgres/app/views/list.scala.html
                    HASH: 9bf6a22e4c91eb13afa335b621ad2e4da0203377
                    MATRIX: 767->1|941->860|955->866|1049->896|1102->913|1114->916|1153->933|1198->942|1232->968|1320->1032|1377->1053|1411->1065|1450->1068|1477->1073|1515->243|1526->247|2058->114|2087->241|2115->748|2145->858|2173->1089|2211->1092|2223->1096|2262->1098|2328->1128|2412->1190|2459->1202|2500->1234|2540->1236|2657->1317|2671->1322|2708->1337|2760->1358|2854->1416|2891->1431|3008->1512|3043->1525|3290->1736|3305->1742|3348->1763|3438->1818|3484->1855|3524->1857|3648->1964|3661->1969|3700->1970|3856->2090|3909->2121|3967->2143|4023->2177|4081->2199|4141->2237|4199->2259|4254->2292|4312->2314|4370->2350|4488->2432|4540->2468|4580->2470|4680->2534|4695->2540|4747->2570|4786->2573|4803->2581|4830->2586|4934->2654|4974->2685|5014->2687|5106->2761|5119->2766|5158->2767|5228->2801|5245->2809|5300->2842|5362->2872|5487->2961|5529->2994|5569->2996|5661->3070|5674->3075|5713->3076|5783->3110|5800->3118|5857->3153|5919->3183|6044->3272|6081->3300|6121->3302|6213->3376|6226->3381|6265->3382|6336->3416|6354->3424|6390->3437|6453->3467|6579->3556|6621->3588|6662->3590|6755->3664|6769->3669|6809->3670|6880->3704|6898->3712|6933->3724|6996->3754|7103->3828|7264->3952|7297->3975|7338->3977|7448->4050|7511->4090|7596->4156|7610->4161|7650->4162|7821->4300|7931->4373|7952->4384|8008->4417|8089->4461|8122->4484|8163->4486|8273->4559|8336->4599|8417->4661|8431->4666|8471->4667|8638->4801|8718->4849|8761->4860
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|130->104|130->104|132->106|132->106|132->106|133->107|133->107|133->107|134->108|137->111|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|154->128|154->128|154->128|156->130|156->130|156->130|158->132|158->132|160->134|160->134|160->134|164->138|168->142|170->144
                    -- GENERATED --
                */
            