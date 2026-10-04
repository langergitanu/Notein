package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7311bb;
import com.aspose.slides.internal.p332p7.C7374c3;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7565ef;
import com.aspose.slides.internal.p332p7.C7636f5;
import com.aspose.slides.internal.p332p7.C7687fp;
import com.aspose.slides.internal.p332p7.C8459oo;
import com.aspose.slides.internal.p332p7.C9087w5;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class rvh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48701k4 = new C7017h4("tableStyle", "tableStyleId");

    /* JADX INFO: renamed from: k4 */
    public static ITable m70354k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        if (pijVar == null) {
            return null;
        }
        C7636f5 c7636f5M43893fa = pijVar.mo31678kk().m33836k4().m43893fa();
        int length = c7636f5M43893fa.m31620to().m31942x1().length;
        int length2 = c7636f5M43893fa.m31617du().length;
        double[] dArr = new double[length];
        double[] dArr2 = new double[length2];
        for (int i = 0; i < length; i++) {
            dArr[i] = c7636f5M43893fa.m31620to().m31942x1()[i].m29403k4();
        }
        for (int i2 = 0; i2 < length2; i2++) {
            dArr2[i2] = c7636f5M43893fa.m31617du()[i2].m38392x1();
        }
        if (length == 0 || length2 == 0) {
            return null;
        }
        final Table[] tableArr = {shapeCollection.m2631k4(dArr, dArr2)};
        ycb ycbVarMo271kk = tableArr[0].mo271kk();
        C14297pp.m69181k4(tableArr[0], pijVar, bjsVar);
        C7311bb c7311bbM31619kk = c7636f5M43893fa.m31619kk();
        if (c7311bbM31619kk != null) {
            C1169h1.m6958k4(tableArr[0].getTableFormat().getFillFormat(), c7311bbM31619kk.m28788dy(), bjsVar.m4229k4());
            C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.rvh.1
                @Override // com.aspose.slides.C1158gq.k4
                /* JADX INFO: renamed from: k4 */
                public IEffectFormat mo3774k4() {
                    return tableArr[0].getEffectFormat();
                }
            }, c7311bbM31619kk.m28784c5(), bjsVar.m4229k4());
            tableArr[0].setRightToLeft(c7311bbM31619kk.m28796k4());
            tableArr[0].setFirstRow(c7311bbM31619kk.m28806x1());
            tableArr[0].setFirstCol(c7311bbM31619kk.m28799kk());
            tableArr[0].setLastRow(c7311bbM31619kk.m28803to());
            tableArr[0].setLastCol(c7311bbM31619kk.m28787du());
            tableArr[0].setHorizontalBanding(c7311bbM31619kk.m28790h4());
            tableArr[0].setVerticalBanding(c7311bbM31619kk.m28801m9());
            if (c7311bbM31619kk.m28791jd() != null) {
                int iM27428k4 = f48701k4.m27428k4(c7311bbM31619kk.m28791jd().m29539k4());
                if (iM27428k4 == 0) {
                    C7565ef c7565ef = (C7565ef) c7311bbM31619kk.m28791jd().m29542x1();
                    tableArr[0].setStylePreset(-1);
                    lrc.m64526k4(tableArr[0].m2875to(), c7565ef, bjsVar.m4229k4());
                } else {
                    if (iM27428k4 != 1) {
                        throw new Exception(C14113y2.m67408k4("Unknown element \"", c7311bbM31619kk.m28791jd().m29539k4(), "\""));
                    }
                    C14047bz c14047bzClone = ((C14047bz) C7019kk.m27464to(c7311bbM31619kk.m28791jd().m29541kk(), C14047bz.class)).Clone();
                    int iM68915x1 = ((Presentation) tableArr[0].getPresentation()).m2351fa().m68389u4().m68915x1(c14047bzClone.Clone());
                    tableArr[0].setStylePreset(iM68915x1);
                    if (iM68915x1 == -1) {
                        Table table = tableArr[0];
                        table.m2871k4(((Presentation) table.getPresentation()).m2351fa().m68389u4().m68912k4(c14047bzClone.Clone()));
                    }
                }
            } else {
                tableArr[0].setStylePreset(0);
            }
            ycbVarMo271kk.m73838k4(c7311bbM31619kk.m28785ck());
        }
        if (tableArr[0].m2875to() == null) {
            tableArr[0].setStylePreset(0);
        }
        C7374c3[] c7374c3ArrM31942x1 = c7636f5M43893fa.m31620to().m31942x1();
        for (int i3 = 0; i3 < c7374c3ArrM31942x1.length; i3++) {
            tableArr[0].f3496x1.m1147k4(i3).m483du().m69121k4(c7374c3ArrM31942x1[i3].m29406x1());
        }
        C8459oo[] c8459ooArrM31617du = c7636f5M43893fa.m31617du();
        for (int i4 = 0; i4 < c8459ooArrM31617du.length; i4++) {
            tableArr[0].f3493k4.m2491k4(i4).m483du().m69121k4(c8459ooArrM31617du[i4].m38391to());
        }
        int size = tableArr[0].getRows().size();
        int size2 = tableArr[0].getColumns().size();
        int i5 = size;
        while (i5 > 0) {
            int i6 = i5 - 1;
            Row rowM2491k4 = tableArr[0].f3493k4.m2491k4(i6);
            C9087w5[] c9087w5ArrM38390kk = c8459ooArrM31617du[i6].m38390kk();
            int i7 = size2;
            while (i7 > 0) {
                int i8 = i7 - 1;
                Cell cellMo484k4 = rowM2491k4.mo484k4(i8);
                C1206hj.m7194k4(cellMo484k4, c9087w5ArrM38390kk[i8], i6, size, i8, size2, bjsVar.m4229k4());
                cellMo484k4.f1263x1 = c9087w5ArrM38390kk[i8].m43507to();
                cellMo484k4.f1258k4 = c9087w5ArrM38390kk[i8].m43505kk();
                cellMo484k4.f1259kk = null;
                if (cellMo484k4.m474m9()) {
                    cellMo484k4.m479x1(false);
                }
                i7 = i8;
            }
            i5 = i6;
        }
        tableArr[0].mo277dy();
        return tableArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x017c A[PHI: r10
      0x017c: PHI (r10v9 double) = (r10v8 double), (r10v11 double) binds: [B:35:0x017a, B:28:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m70355k4(Table table, com.aspose.slides.internal.p332p7.pij pijVar, u8s u8sVar) {
        C7394ca c7394ca;
        double marginRight;
        ycb ycbVarMo271kk = table.mo271kk();
        C7636f5 c7636f5M43897k4 = pijVar.mo31678kk().m33836k4().m43897k4();
        final C7311bb c7311bbM31618k4 = c7636f5M43897k4.m31618k4();
        c7311bbM31618k4.m28794k4(ycbVarMo271kk.m73840x1());
        C1169h1.m6956k4(table.getTableFormat().getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.rvh.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7311bbM31618k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TablePropertiesElementData.AddFillProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c7311bbM31618k4.m28804x1(str);
            }
        }, u8sVar);
        C1158gq.m6877k4(table.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.rvh.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7311bbM31618k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TablePropertiesElementData.AddEffectProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c7311bbM31618k4.m28792k4(str);
            }
        }, u8sVar);
        if (table.getStylePreset() == -1) {
            if (((Presentation) table.getPresentation()).m2351fa().m68389u4().m68912k4(table.m2875to().m73127k4().m74873k4().Clone()) != null) {
                c7394ca = new C7394ca("tableStyleId", table.m2875to().m73127k4().m74873k4().Clone().Clone());
                c7311bbM31618k4.m28793k4(c7394ca);
            } else {
                lrc.m64527k4(table.m2875to(), (C7565ef) c7311bbM31618k4.m28797kk("tableStyle").m29542x1(), u8sVar);
            }
        } else if (table.getStylePreset() != 0) {
            c7394ca = new C7394ca("tableStyleId", ((Presentation) table.getPresentation()).m2351fa().m68389u4().m68911k4(table.getStylePreset()).Clone().Clone());
            c7311bbM31618k4.m28793k4(c7394ca);
        }
        c7311bbM31618k4.m28795k4(table.getRightToLeft());
        c7311bbM31618k4.m28805x1(table.getFirstRow());
        c7311bbM31618k4.m28798kk(table.getFirstCol());
        c7311bbM31618k4.m28802to(table.getLastRow());
        c7311bbM31618k4.m28786du(table.getLastCol());
        c7311bbM31618k4.m28789h4(table.getHorizontalBanding());
        c7311bbM31618k4.m28800m9(table.getVerticalBanding());
        int size = table.getColumns().size();
        int size2 = table.getRows().size();
        C7687fp c7687fpM31620to = c7636f5M43897k4.m31620to();
        int i = 0;
        while (true) {
            double d = 0.0d;
            if (i >= size) {
                break;
            }
            C7374c3 c7374c3M31941k4 = c7687fpM31620to.m31941k4();
            Column columnM1147k4 = table.f3496x1.m1147k4(i);
            for (int i2 = 0; i2 < size2; i2++) {
                Cell cellM2869k4 = table.m2869k4(i, i2);
                if (!cellM2869k4.m463dy() && cellM2869k4.getColSpan() == 1) {
                    double marginRight2 = cellM2869k4.getMarginRight() + cellM2869k4.getMarginLeft() + 2.0d;
                    if (d < marginRight2) {
                        d = marginRight2;
                    }
                } else if (cellM2869k4.m463dy()) {
                    Cell cellM462du = cellM2869k4.m462du();
                    if (cellM462du.getColSpan() <= i + 1 && cellM462du.getFirstColumn() == table.getColumns().get_Item((i - cellM462du.getColSpan()) + 1)) {
                        marginRight = cellM462du.getMarginRight() + 2.0d;
                        if (d < marginRight) {
                        }
                    }
                } else {
                    marginRight = cellM2869k4.getMarginLeft() + 2.0d;
                    if (d < marginRight) {
                        d = marginRight;
                    }
                }
            }
            c7374c3M31941k4.m29404k4(C14116yg.m67502x1(columnM1147k4.getWidth(), d));
            c7374c3M31941k4.m29405k4(columnM1147k4.m483du().m69120k4());
            i++;
        }
        for (int i3 = 0; i3 < size2; i3++) {
            final C8459oo c8459ooM31621x1 = c7636f5M43897k4.m31621x1();
            Row rowM2491k4 = table.f3493k4.m2491k4(i3);
            c8459ooM31621x1.m38388k4(rowM2491k4.getMinimalHeight());
            for (int i4 = 0; i4 < size; i4++) {
                Cell cellMo484k4 = rowM2491k4.mo484k4(i4);
                if (rowM2491k4.getMinimalHeight() < cellMo484k4.getMarginBottom() + cellMo484k4.getMarginTop() + 2.0d) {
                    c8459ooM31621x1.m38388k4(0.0d);
                }
                C1206hj.m7193k4(cellMo484k4, new AbstractC4685kk<C9087w5>() { // from class: com.aspose.slides.rvh.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8459ooM31621x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableRowElementData.AddTc()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C9087w5 invoke() {
                        return c8459ooM31621x1.m38387k4();
                    }
                }, u8sVar);
            }
            c8459ooM31621x1.m38389k4(rowM2491k4.m483du().m69120k4());
        }
        C14297pp.m69182k4(table, pijVar, u8sVar);
    }
}
