package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.google.firebase.vertexai.common.util.KtorKt;

/* JADX INFO: loaded from: classes3.dex */
class t9l extends C14367qz<Table> {
    public t9l(TemplateContext<Table> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m71035k4(ICell iCell) {
        ICellFormatEffectiveData effective = iCell.getCellFormat().getEffective();
        return C14113y2.m67403k4(" ", new String[]{C14442sb.m70498k4(effective.getFillFormat(), m69966kk()), C14113y2.m67402k4("border-left: {0};", gau.m6461k4(effective.getBorderLeft())), C14113y2.m67402k4("border-top: {0};", gau.m6461k4(effective.getBorderTop())), C14113y2.m67402k4("border-right: {0};", gau.m6461k4(effective.getBorderRight())), C14113y2.m67402k4("border-bottom: {0};", gau.m6461k4(effective.getBorderBottom())), htp.m7294k4(iCell.getTextAnchorType())});
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        int i;
        Table object = m69966kk().getObject();
        ((C12016rv) m69966kk().getLocal().get("origin")).Clone();
        String strM67402k4 = C14113y2.m67402k4("left: {0}px; top: {1}px; width: {2}px; height: {3}px;", Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getX()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getY()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getWidth()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(object.getHeight()), 13)));
        String strM67408k4 = C14113y2.m67408k4("slide-", C14114y9.m67465x1(object.getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(object.getUniqueId()));
        String str = m69966kk().getLocal().containsKey("animationAttributes") ? (String) m69966kk().getLocal().get("animationAttributes") : "";
        m69969x1(KtorKt.SSE_SEPARATOR);
        m69969x1("\r\n<table");
        m69969x1(" class=\"table\"");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" id=\"", 1753);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 1761);
        t8o t8oVarM63325k43 = jii.m63325k4("", 1758);
        t8o t8oVarM63325k44 = jii.m63325k4(strM67408k4, 1758);
        Boolean bool = Boolean.FALSE;
        m69965k4("id", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        m69965k4("style", jii.m63325k4(" style=\"", 1762), jii.m63325k4("\"", 1784), jii.m63324k4(jii.m63325k4("", 1770), jii.m63325k4(strM67402k4, 1770), bool));
        m69969x1(" ");
        m69967kk(m69962k4(str));
        m69969x1(">\r\n");
        for (int i2 = 0; i2 < object.getRows().size(); i2++) {
            int i3 = 14;
            String strM67402k42 = C14113y2.m67402k4("height: {0}px", Integer.valueOf(C7019kk.m27462to(Double.valueOf(object.getRows().get_Item(i2).getHeight()), 14)));
            m69969x1("        <tr");
            m69965k4("style", jii.m63325k4(" style=\"", 1983), jii.m63325k4("\"", 2001), jii.m63324k4(jii.m63325k4("", 1991), jii.m63325k4(strM67402k42, 1991), Boolean.FALSE));
            m69969x1(">\r\n");
            int i4 = 0;
            while (i4 < object.getColumns().size()) {
                ICell iCell = object.get_Item(i4, i2);
                if (iCell.getFirstRowIndex() == i2 && iCell.getFirstColumnIndex() == i4) {
                    String strM67402k43 = iCell.isMergedCell() ? C14113y2.m67402k4("rowspan=\"{0}\" colspan=\"{1}\"", Integer.valueOf(iCell.getRowSpan()), Integer.valueOf(iCell.getColSpan())) : "";
                    String strM67408k42 = C14113y2.m67408k4(C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(iCell.getWidth()), i3)), " px");
                    m69969x1("                <td");
                    i = i4;
                    m69965k4("width", jii.m63325k4(" width=\"", 2424), jii.m63325k4("\"", 2442), jii.m63324k4(jii.m63325k4("", 2432), jii.m63325k4(strM67408k42, 2432), Boolean.FALSE));
                    m69969x1(" ");
                    m69967kk(m69962k4(strM67402k43));
                    m69969x1(" style=\"");
                    m69967kk(m71035k4(iCell));
                    m69969x1("\">\r\n");
                    for (int i5 = 0; i5 < iCell.getTextFrame().getParagraphs().getCount(); i5++) {
                        TemplateContext<TSubModel> templateContextSubModel = m69966kk().subModel((Paragraph) iCell.getTextFrame().getParagraphs().get_Item(i5));
                        templateContextSubModel.getLocal().put("margins", new double[]{iCell.getMarginLeft(), iCell.getMarginTop(), iCell.getMarginRight(), iCell.getMarginBottom()});
                        templateContextSubModel.getLocal().put("parent", iCell.getTextFrame());
                        templateContextSubModel.getLocal().put("parentContainerSize", new C12015qq((float) iCell.getWidth(), (float) iCell.getHeight()));
                        templateContextSubModel.getLocal().put("tableContent", Boolean.TRUE);
                        m69967kk(nci.m67958k4(Paragraph.class, this.f50311k4, "paragraph", templateContextSubModel));
                    }
                    m69969x1("\r\n                </td>\r\n");
                } else {
                    i = i4;
                }
                i4 = i + 1;
                i3 = 14;
            }
            m69969x1("        </tr>\r\n");
        }
        m69969x1("</table>");
    }
}
