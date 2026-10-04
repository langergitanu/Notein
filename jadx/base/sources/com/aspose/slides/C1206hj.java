package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8017jl;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9087w5;

/* JADX INFO: renamed from: com.aspose.slides.hj */
/* JADX INFO: loaded from: classes3.dex */
class C1206hj {
    /* JADX INFO: renamed from: k4 */
    public static void m7193k4(ICell iCell, AbstractC4685kk<C9087w5> abstractC4685kk, u8s u8sVar) {
        int rowSpan;
        final C9087w5 c9087w5Invoke = abstractC4685kk.invoke();
        Cell cell = (Cell) iCell;
        C1163gv c1163gvM478x1 = cell.m478x1();
        hn7.m7240k4(iCell.getTextFrame(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.hj.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9087w5Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellElementData.AddTxBody()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c9087w5Invoke.m43501k4();
            }
        }, u8sVar);
        Cell cellM462du = cell.m463dy() ? cell.m462du() : null;
        final C8017jl c8017jlM43508x1 = c9087w5Invoke.m43508x1();
        euh.m5726k4(cell.getCellFormat().getBorderLeft(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.hj.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddLnL()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8017jlM43508x1.m34776k4();
            }
        });
        euh.m5726k4(cell.getCellFormat().getBorderRight(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.hj.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddLnR()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8017jlM43508x1.m34796x1();
            }
        });
        euh.m5726k4(cell.getCellFormat().getBorderTop(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.hj.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddLnT()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8017jlM43508x1.m34782kk();
            }
        });
        euh.m5726k4(cell.getCellFormat().getBorderBottom(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.hj.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddLnB()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8017jlM43508x1.m34790to();
            }
        });
        euh.m5726k4(cell.getCellFormat().getBorderDiagonalDown(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.hj.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddLnTlToBr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8017jlM43508x1.m34769du();
            }
        });
        euh.m5726k4(cell.getCellFormat().getBorderDiagonalUp(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.hj.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddLnBlToTr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8017jlM43508x1.m34772h4();
            }
        });
        C1169h1.m6956k4(cell.getCellFormat().getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.hj.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8017jlM43508x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TableCellPropertiesElementData.AddFillProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8017jlM43508x1.m34775k4(str);
            }
        }, u8sVar);
        c8017jlM43508x1.m34778k4(iCell.getMarginLeft());
        c8017jlM43508x1.m34798x1(iCell.getMarginRight());
        c8017jlM43508x1.m34784kk(iCell.getMarginTop());
        c8017jlM43508x1.m34791to(iCell.getMarginBottom());
        c8017jlM43508x1.m34777k4(iCell.getTextVerticalType());
        c8017jlM43508x1.m34797x1(iCell.getTextAnchorType());
        c8017jlM43508x1.m34781k4(iCell.getAnchorCenter());
        c8017jlM43508x1.m34783kk(c1163gvM478x1.m6908k4());
        c8017jlM43508x1.m34780k4(c1163gvM478x1.m6915x1());
        c8017jlM43508x1.m34779k4(c1163gvM478x1.m6914to());
        if (cellM462du != null) {
            if (cellM462du.m475to().m1139m9() != cell.m475to().m1139m9()) {
                c9087w5Invoke.m43504k4(true);
            } else {
                c9087w5Invoke.m43509x1(cellM462du.getColSpan());
            }
            if (cellM462du.m465h4().m2483m9() != cell.m465h4().m2483m9()) {
                c9087w5Invoke.m43510x1(true);
                c9087w5Invoke.m43503k4(c1163gvM478x1.m6913kk());
            }
            rowSpan = cellM462du.getRowSpan();
        } else {
            c9087w5Invoke.m43509x1(iCell.getColSpan());
            rowSpan = iCell.getRowSpan();
        }
        c9087w5Invoke.m43502k4(rowSpan);
        c9087w5Invoke.m43503k4(c1163gvM478x1.m6913kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7194k4(ICell iCell, C9087w5 c9087w5, int i, int i2, int i3, int i4, gnb gnbVar) {
        if (c9087w5 == null) {
            return;
        }
        Cell cell = (Cell) iCell;
        C1163gv c1163gvM478x1 = cell.m478x1();
        hn7.m7241k4(iCell.getTextFrame(), c9087w5.m43499du(), gnbVar);
        iCell.getTextFrame().getTextFrameFormat().setWrapText((byte) 1);
        C8017jl c8017jlM43500h4 = c9087w5.m43500h4();
        if (c8017jlM43500h4 != null) {
            ((CellFormat) cell.getCellFormat()).m499to();
            euh.m5728k4(cell.getCellFormat().getBorderLeft(), c8017jlM43500h4.m34785ks());
            euh.m5728k4(cell.getCellFormat().getBorderTop(), c8017jlM43500h4.m34799x6());
            euh.m5728k4(cell.getCellFormat().getBorderDiagonalDown(), c8017jlM43500h4.m34773ix());
            euh.m5728k4(cell.getCellFormat().getBorderDiagonalUp(), c8017jlM43500h4.m34792u4());
            euh.m5728k4(cell.getCellFormat().getBorderRight(), c8017jlM43500h4.m34789rv());
            euh.m5728k4(cell.getCellFormat().getBorderBottom(), c8017jlM43500h4.m34787ne());
            C1169h1.m6958k4(cell.getCellFormat().getFillFormat(), c8017jlM43500h4.m34795wl(), gnbVar);
            iCell.setMarginLeft(c8017jlM43500h4.m34786m9());
            iCell.setMarginRight(c8017jlM43500h4.m34770dy());
            iCell.setMarginTop(c8017jlM43500h4.m34767c5());
            iCell.setMarginBottom(c8017jlM43500h4.m34774jd());
            iCell.setTextVerticalType(c8017jlM43500h4.m34768ck() == -1 ? (byte) 0 : c8017jlM43500h4.m34768ck());
            iCell.setTextAnchorType(c8017jlM43500h4.m34771fa() != -1 ? c8017jlM43500h4.m34771fa() : (byte) 0);
            iCell.setAnchorCenter(c8017jlM43500h4.m34793up());
            c1163gvM478x1.m6909k4(c8017jlM43500h4.m34800yj());
            c1163gvM478x1.m6912k4(c8017jlM43500h4.m34794uz());
            c1163gvM478x1.m6916x1(c8017jlM43500h4.m34788qq());
            ((CellFormat) cell.getCellFormat()).m495du();
        }
        iCell.getTextFrame().getTextFrameFormat().setTextVerticalType(iCell.getTextVerticalType());
        c1163gvM478x1.m6911k4(c9087w5.m43506m9());
    }
}
