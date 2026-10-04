package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class qca {
    /* JADX INFO: renamed from: k4 */
    private static int m69533k4(byte b) {
        if (b == 0) {
            return 1;
        }
        if (b != 1) {
            return b != 2 ? 4 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: kk */
    private static void m69538kk(Table table, com.aspose.slides.internal.p332p7.n6p n6pVar, pkv pkvVar) {
        int size = table.getColumns().size();
        for (int i = 0; i < table.getRows().size(); i++) {
            Row row = (Row) table.getRows().get_Item(i);
            com.aspose.slides.internal.p332p7.exz exzVar = (com.aspose.slides.internal.p332p7.exz) n6pVar.m37289x1("table-row").m29542x1();
            com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4(TranslateLanguage.ROMANIAN, 7);
            exzVar.m31424x1(lzcVarM69128k4.m36546k4());
            ((com.aspose.slides.internal.p332p7.hj8) lzcVarM69128k4.m36545k4("table-row-properties").m29542x1()).m33498k4(wgi.m72717k4(row.getHeight()));
            int i2 = 0;
            while (i2 < size) {
                Cell cellM2869k4 = table.m2869k4(i2, i);
                i2++;
                if (cellM2869k4.m463dy()) {
                    exzVar.m31420k4("covered-table-cell");
                } else {
                    final com.aspose.slides.internal.p332p7.t1m t1mVar = (com.aspose.slides.internal.p332p7.t1m) exzVar.m31420k4("table-cell").m29542x1();
                    dcz.m5048k4((TextFrame) cellM2869k4.getTextFrame(), new C7394ca.k4() { // from class: com.aspose.slides.qca.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(t1mVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odftbl_CT_TableCellElementData.AddContentElements(System.String)";
                        }

                        @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                        /* JADX INFO: renamed from: k4 */
                        public C7394ca mo2788k4(String str) {
                            return t1mVar.m41496k4(str);
                        }
                    }, exzVar.m31421k4(), pkvVar);
                    t1mVar.m41498k4(((long) cellM2869k4.getColSpan()) & 4294967295L);
                    t1mVar.m41503x1(((long) cellM2869k4.getRowSpan()) & 4294967295L);
                    m69534k4(cellM2869k4, t1mVar, pkvVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69539x1(Table table, com.aspose.slides.internal.p332p7.n6p n6pVar, pkv pkvVar) {
        IGenericEnumerator<IColumn> it = table.getColumns().iterator();
        while (it.hasNext()) {
            try {
                Column column = (Column) it.next();
                com.aspose.slides.internal.p332p7.k6w k6wVar = (com.aspose.slides.internal.p332p7.k6w) n6pVar.m37283k4("table-column").m29542x1();
                com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("co", 6);
                k6wVar.m35168k4(lzcVarM69128k4.m36546k4());
                ((com.aspose.slides.internal.p332p7.enf) lzcVarM69128k4.m36545k4("table-column-properties").m29542x1()).m31172k4(wgi.m72717k4(column.getWidth()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69534k4(Cell cell, com.aspose.slides.internal.p332p7.t1m t1mVar, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("ce", 8);
        t1mVar.m41504x1(lzcVarM69128k4.m36546k4());
        IFillFormatEffectiveData effective = cell.getCellFormat().getFillFormat().getEffective();
        com.aspose.slides.internal.p332p7.v9h v9hVar = (com.aspose.slides.internal.p332p7.v9h) wgi.m72713k4(com.aspose.slides.internal.p332p7.v9h.class, "table-cell-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.qca.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        if (effective.getFillType() == 1) {
            C14176nc c14176nc = (C14176nc) effective;
            if ((c14176nc.m67938m9().m56501c5() & 255) > 0) {
                v9hVar.m42808k4(wgi.m72720k4(c14176nc.m67938m9().Clone()));
            }
        }
        v9hVar.m42807k4(m69533k4(cell.getTextAnchorType()));
        if (!C14044b3.m66437kk(cell.getMarginTop())) {
            v9hVar.m42804h4(wgi.m72717k4(cell.getMarginTop()));
        }
        if (!C14044b3.m66437kk(cell.getMarginRight())) {
            v9hVar.m42796c5(wgi.m72717k4(cell.getMarginRight()));
        }
        if (!C14044b3.m66437kk(cell.getMarginBottom())) {
            v9hVar.m42812m9(wgi.m72717k4(cell.getMarginBottom()));
        }
        if (!C14044b3.m66437kk(cell.getMarginLeft())) {
            v9hVar.m42801dy(wgi.m72717k4(cell.getMarginLeft()));
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.qca.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        C14909zq.m74729k4(effective, new jlf(rsvVar), pkvVar.m69130x1());
        if (!C14044b3.m66437kk(cell.getMarginTop())) {
            rsvVar.m40503u4(wgi.m72717k4(cell.getMarginTop()));
        }
        if (!C14044b3.m66437kk(cell.getMarginRight())) {
            rsvVar.m40495qq(wgi.m72717k4(cell.getMarginRight()));
        }
        if (!C14044b3.m66437kk(cell.getMarginBottom())) {
            rsvVar.m40509uz(wgi.m72717k4(cell.getMarginBottom()));
        }
        if (!C14044b3.m66437kk(cell.getMarginLeft())) {
            rsvVar.m40513wl(wgi.m72717k4(cell.getMarginLeft()));
        }
        rsvVar.m40519x1(dcz.m5045k4(cell.getTextAnchorType()));
        com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72713k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.qca.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        if (cell.getTextVerticalType() == 1) {
            mdpVar.m36883to(3);
        }
        m69535k4(cell, v9hVar, mdpVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69535k4(Cell cell, com.aspose.slides.internal.p332p7.v9h v9hVar, com.aspose.slides.internal.p332p7.mdp mdpVar) {
        ICellFormatEffectiveData effective = cell.m461ck().getEffective();
        String str = C14113y2.f47374k4;
        String[] strArr = {str};
        String[] strArr2 = {str};
        m69536k4(effective.getBorderTop(), strArr, strArr2);
        String str2 = strArr[0];
        String str3 = strArr2[0];
        if (!C14113y2.m67411k4(str2)) {
            v9hVar.m42816x1(str2);
        }
        if (!C14113y2.m67411k4(str3)) {
            mdpVar.m36856c5(str3);
        }
        strArr[0] = str2;
        strArr2[0] = str3;
        m69536k4(effective.getBorderLeft(), strArr, strArr2);
        String str4 = strArr[0];
        String str5 = strArr2[0];
        if (!C14113y2.m67411k4(str4)) {
            v9hVar.m42814to(str4);
        }
        if (!C14113y2.m67411k4(str5)) {
            mdpVar.m36858ck(str5);
        }
        strArr[0] = str4;
        strArr2[0] = str5;
        m69536k4(effective.getBorderBottom(), strArr, strArr2);
        String str6 = strArr[0];
        String str7 = strArr2[0];
        if (!C14113y2.m67411k4(str6)) {
            v9hVar.m42810kk(str6);
        }
        if (!C14113y2.m67411k4(str7)) {
            mdpVar.m36869jd(str7);
        }
        strArr[0] = str6;
        strArr2[0] = str7;
        m69536k4(effective.getBorderRight(), strArr, strArr2);
        String str8 = strArr[0];
        String str9 = strArr2[0];
        if (!C14113y2.m67411k4(str8)) {
            v9hVar.m42799du(str8);
        }
        if (C14113y2.m67411k4(str9)) {
            return;
        }
        mdpVar.m36864fa(str9);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69536k4(ILineFormatEffectiveData iLineFormatEffectiveData, String[] strArr, String[] strArr2) {
        byte fillType = iLineFormatEffectiveData.getFillFormat().getFillType();
        if (fillType == 0) {
            strArr[0] = "none";
            strArr2[0] = "none";
        } else if (fillType != 1) {
            String str = C14113y2.f47374k4;
            strArr[0] = str;
            strArr2[0] = str;
        } else {
            double width = C14044b3.m66437kk(iLineFormatEffectiveData.getWidth()) ? 1.0d : iLineFormatEffectiveData.getWidth();
            strArr[0] = C14113y2.m67402k4("{0} {1} {2}", wgi.m72730kk(width), "solid", wgi.m72720k4(((erk) iLineFormatEffectiveData.getFillFormat()).m5654x1().Clone()));
            strArr2[0] = C14113y2.m67402k4("{0} {1} {2}", wgi.m72730kk(width * 0.5d), "solid", wgi.m72720k4(((erk) iLineFormatEffectiveData.getFillFormat()).m5654x1().Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69537k4(Table table, com.aspose.slides.internal.p332p7.n6p n6pVar, pkv pkvVar) {
        if (table == null) {
            throw new ArgumentNullException("table");
        }
        if (n6pVar == null) {
            throw new ArgumentNullException("tableElement");
        }
        n6pVar.m37285kk(table.getName());
        m69539x1(table, n6pVar, pkvVar);
        m69538kk(table, n6pVar, pkvVar);
    }
}
