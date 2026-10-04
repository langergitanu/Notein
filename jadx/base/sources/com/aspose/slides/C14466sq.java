package com.aspose.slides;

import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7208a2;
import com.aspose.slides.internal.p332p7.C7314bd;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7884hw;
import com.aspose.slides.internal.p332p7.C7913i8;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8166l9;
import com.aspose.slides.internal.p332p7.C8534pn;
import com.aspose.slides.internal.p332p7.C8766se;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9255y3;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.sq */
/* JADX INFO: loaded from: classes3.dex */
class C14466sq {
    /* JADX INFO: renamed from: k4 */
    private static int m70725k4(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 2;
        }
        throw new SerializationException("TickMarkType value");
    }

    /* JADX INFO: renamed from: k4 */
    private static int m70726k4(C7884hw c7884hw) {
        int iM33638k4 = c7884hw.m33638k4();
        int i = 1;
        if (iM33638k4 != 1) {
            i = 3;
            if (iM33638k4 != 2) {
                if (iM33638k4 == 3) {
                    return 0;
                }
                if (iM33638k4 == 4) {
                    return 2;
                }
                throw new SerializationException("Not supported element value");
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70727k4(IAxis iAxis, C7913i8 c7913i8, C14144mu c14144mu) {
        if (c7913i8 == null) {
            return;
        }
        C14252ou c14252ouM319k4 = ((Axis) iAxis).m319k4();
        c14252ouM319k4.m68843k4(c7913i8.m33949uz());
        gnb gnbVarM4229k4 = c14144mu.m67731k4().m4229k4();
        iAxis.setVisible(!c7913i8.m33927c5());
        if (C7019kk.m27469x1(c7913i8.m33934jd().m29542x1(), C8766se.class)) {
            C8766se c8766se = (C8766se) C7019kk.m27452k4((Object) c7913i8.m33934jd().m29542x1(), C8766se.class);
            if (c8766se.m40982k4() != null) {
                iAxis.setAutomaticMaxValue(false);
                double[] dArr = {0.0d};
                boolean zM66436k4 = C14044b3.m66436k4(c8766se.m40982k4(), dArr);
                double d = dArr[0];
                if (zM66436k4) {
                    iAxis.setMaxValue(d);
                }
            }
            if (c8766se.m40988x1() != null) {
                iAxis.setAutomaticMinValue(false);
                double[] dArr2 = {0.0d};
                boolean zM66436k42 = C14044b3.m66436k4(c8766se.m40988x1(), dArr2);
                double d2 = dArr2[0];
                if (zM66436k42) {
                    iAxis.setMinValue(d2);
                }
            }
            if (c8766se.m40984kk() != null) {
                iAxis.setAutomaticMajorUnit(true);
                double[] dArr3 = {0.0d};
                boolean zM66436k43 = C14044b3.m66436k4(c8766se.m40984kk(), dArr3);
                double d3 = dArr3[0];
                if (zM66436k43) {
                    iAxis.setMajorUnit(d3);
                }
            }
            if (c8766se.m40986to() != null) {
                iAxis.setAutomaticMinorUnit(true);
                double[] dArr4 = {0.0d};
                boolean zM66436k44 = C14044b3.m66436k4(c8766se.m40986to(), dArr4);
                double d4 = dArr4[0];
                if (zM66436k44) {
                    iAxis.setMajorUnit(d4);
                }
            }
        }
        m70729k4(iAxis.getMajorGridLinesFormat(), c7913i8.m33948up(), c14144mu);
        m70729k4(iAxis.getMinorGridLinesFormat(), c7913i8.m33952yj(), c14144mu);
        if (c7913i8.m33942ks() != null) {
            iAxis.setMajorTickMark(m70726k4(c7913i8.m33942ks()));
            c14252ouM319k4.m68848kk(c7913i8.m33942ks().m33641x1());
        } else {
            iAxis.setMajorTickMark(2);
        }
        if (c7913i8.m33945rv() != null) {
            iAxis.setMinorTickMark(m70726k4(c7913i8.m33945rv()));
            c14252ouM319k4.m68853to(c7913i8.m33945rv().m33641x1());
        } else {
            iAxis.setMinorTickMark(2);
        }
        C14616u5.m71486k4(iAxis.getFormat(), c7913i8.m33933ix(), gnbVarM4229k4);
        C13691jl.m63398k4(iAxis.getTextFormat(), c7913i8.m33947u4(), gnbVarM4229k4);
        if (c7913i8.m33944ne() != null) {
            iAxis.setNumberFormatLinkedToSource(c7913i8.m33944ne().m28824x1() != 0);
            iAxis.setNumberFormat(C13831md.m64850k4(c7913i8.m33944ne().m28821k4()));
        }
        if (c7913i8.m33951x6() != null) {
            c14252ouM319k4.m68857x1(c7913i8.m33951x6().m32311k4());
        }
        C14181nh.m68022k4(iAxis.getTitle(), c7913i8.m33928ck(), gnbVarM4229k4);
        iAxis.setTitle(c7913i8.m33928ck() != null);
        if (c7913i8.m33931fa() != null) {
            if (c7913i8.m33931fa().m27907kk() != null) {
                C14384re.m70081k4(((Axis) iAxis).m327x1(), c7913i8.m33931fa().m27907kk(), gnbVarM4229k4);
            }
            switch (c7913i8.m33931fa().m27908x1()) {
                case 0:
                    iAxis.setDisplayUnit(0);
                    break;
                case 1:
                    iAxis.setDisplayUnit(1);
                    break;
                case 2:
                    iAxis.setDisplayUnit(2);
                    break;
                case 3:
                    iAxis.setDisplayUnit(3);
                    break;
                case 4:
                    iAxis.setDisplayUnit(4);
                    break;
                case 5:
                    iAxis.setDisplayUnit(5);
                    break;
                case 6:
                    iAxis.setDisplayUnit(6);
                    break;
                case 7:
                    iAxis.setDisplayUnit(7);
                    break;
                case 8:
                    iAxis.setDisplayUnit(8);
                    break;
                case 9:
                    iAxis.setDisplayUnit(9);
                    break;
                case 10:
                    iAxis.setNumberFormat("0%");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70728k4(IAxis iAxis, final C7913i8 c7913i8, u8s u8sVar, long j) {
        C7208a2 c7208a2M33931fa;
        int i;
        if (iAxis == null) {
            return;
        }
        c7913i8.m33937k4(j);
        Axis axis = (Axis) iAxis;
        C14252ou c14252ouM319k4 = axis.m319k4();
        c7913i8.m33938k4(c14252ouM319k4.m68834ck());
        c7913i8.m33940k4(!iAxis.isVisible());
        if (!"".equals(C14113y2.m67440x1(iAxis.getNumberFormat()))) {
            C7314bd c7314bdM33932h4 = c7913i8.m33932h4();
            c7314bdM33932h4.m28822k4(iAxis.isNumberFormatLinkedToSource() ? (byte) 1 : (byte) 0);
            c7314bdM33932h4.m28823k4(iAxis.getNumberFormat());
        }
        if (iAxis.hasTitle()) {
            C14181nh.m68023k4(iAxis.getTitle(), c7913i8.m33936k4(), u8sVar);
        }
        C14616u5.m71484k4(iAxis.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.sq.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7913i8) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_AxisElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c7913i8.m33943m9();
            }
        }, u8sVar);
        C13691jl.m63395k4(iAxis.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.sq.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7913i8) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_AxisElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c7913i8.m33930dy();
            }
        }, u8sVar);
        if (m70731k4(iAxis.getMajorGridLinesFormat()) || iAxis.getMajorGridLinesFormat().getLine().getFillFormat().getFillType() == -1) {
            m70730k4(iAxis.getMajorGridLinesFormat(), c7913i8.m33941kk(), u8sVar);
        }
        if (m70731k4(iAxis.getMinorGridLinesFormat()) || iAxis.getMinorGridLinesFormat().getLine().getFillFormat().getFillType() == -1) {
            m70730k4(iAxis.getMinorGridLinesFormat(), c7913i8.m33946to(), u8sVar);
        }
        if (iAxis.getMajorTickMark() != 2) {
            C7884hw c7884hw = new C7884hw();
            c7884hw.m33639k4(m70725k4(iAxis.getMajorTickMark()));
            c7884hw.m33640k4(c14252ouM319k4.m68854up());
            c7913i8.m33939k4(c7884hw);
        }
        if (iAxis.getMinorTickMark() != 2) {
            C7884hw c7884hw2 = new C7884hw();
            c7884hw2.m33639k4(m70725k4(iAxis.getMinorTickMark()));
            c7884hw2.m33640k4(c14252ouM319k4.m68860yj());
            c7913i8.m33939k4(c7884hw2);
        }
        if (iAxis.getTickLabelPosition() != 3) {
            c7913i8.m33929du();
            if (c14252ouM319k4.m68837fa() != null) {
                c7913i8.m33951x6().m32312k4(c14252ouM319k4.m68837fa());
            }
        }
        if (C7019kk.m27469x1(c7913i8.m33934jd().m29542x1(), C8766se.class)) {
            if (iAxis.getDisplayUnit() != 0) {
                c7913i8.m33950x1();
                C14384re.m70080k4(axis.m327x1(), new AbstractC4685kk<C8534pn>() { // from class: com.aspose.slides.sq.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c7913i8.m33931fa()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_AxisUnitsElementData.AddUnitsLabel()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8534pn invoke() {
                        return c7913i8.m33931fa().m27905k4();
                    }
                }, u8sVar);
                switch (iAxis.getDisplayUnit()) {
                    case 1:
                        c7913i8.m33931fa().m27906k4(1);
                        break;
                    case 2:
                        c7913i8.m33931fa().m27906k4(2);
                        break;
                    case 3:
                        c7913i8.m33931fa().m27906k4(3);
                        break;
                    case 4:
                        c7208a2M33931fa = c7913i8.m33931fa();
                        i = 4;
                        c7208a2M33931fa.m27906k4(i);
                        break;
                    case 5:
                        c7208a2M33931fa = c7913i8.m33931fa();
                        i = 5;
                        c7208a2M33931fa.m27906k4(i);
                        break;
                    case 6:
                        c7208a2M33931fa = c7913i8.m33931fa();
                        i = 6;
                        c7208a2M33931fa.m27906k4(i);
                        break;
                    case 7:
                        c7208a2M33931fa = c7913i8.m33931fa();
                        i = 7;
                        c7208a2M33931fa.m27906k4(i);
                        break;
                    case 8:
                        c7208a2M33931fa = c7913i8.m33931fa();
                        i = 8;
                        c7208a2M33931fa.m27906k4(i);
                        break;
                    case 9:
                        c7208a2M33931fa = c7913i8.m33931fa();
                        i = 9;
                        c7208a2M33931fa.m27906k4(i);
                        break;
                }
            }
            C8766se c8766se = (C8766se) C7019kk.m27452k4((Object) c7913i8.m33934jd().m29542x1(), C8766se.class);
            if (!iAxis.isAutomaticMaxValue()) {
                c8766se.m40983k4(C13850af.m65101k4(iAxis.getMaxValue()));
            }
            if (!iAxis.isAutomaticMinValue()) {
                c8766se.m40989x1(C13850af.m65101k4(iAxis.getMinValue()));
            }
            if (!iAxis.isAutomaticMajorUnit()) {
                c8766se.m40985kk(C13850af.m65101k4(iAxis.getMajorUnit()));
            }
            if (!iAxis.isAutomaticMinorUnit()) {
                c8766se.m40987to(C13850af.m65101k4(iAxis.getMinorUnit()));
            }
        }
        if (C7019kk.m27469x1(c7913i8.m33934jd().m29542x1(), C8166l9.class)) {
            C8166l9 c8166l9 = (C8166l9) C7019kk.m27452k4((Object) c7913i8.m33934jd().m29542x1(), C8166l9.class);
            if (iAxis.getChart().getChartData().getSeries().size() > 0) {
                c8166l9.m35944k4(C14064he.m66704h4(iAxis.getChart().getChartData().getSeries().get_Item(0).getGapWidth() / 100.0f));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70729k4(IChartLinesFormat iChartLinesFormat, C9255y3 c9255y3, C14144mu c14144mu) {
        C8087kh c8087khM44788x1;
        iChartLinesFormat.getLine().getFillFormat().setFillType(c9255y3 == null ? (byte) 0 : (byte) -1);
        if (c9255y3 == null || (c8087khM44788x1 = c9255y3.m44788x1()) == null) {
            return;
        }
        euh.m5728k4(iChartLinesFormat.getLine(), c8087khM44788x1.m35368c5());
        C1158gq.m6878k4(iChartLinesFormat.getEffect(), c8087khM44788x1.m35374jd(), c14144mu.m67731k4().m4229k4());
        ((ChartLinesFormat) iChartLinesFormat).m708k4().m74514k4(c8087khM44788x1.m35389up());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70730k4(IChartLinesFormat iChartLinesFormat, C9255y3 c9255y3, u8s u8sVar) {
        if (m70731k4(iChartLinesFormat)) {
            final C8087kh c8087khM44787k4 = c9255y3.m44787k4();
            euh.m5726k4(iChartLinesFormat.getLine(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.sq.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44787k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8985uy invoke() {
                    return c8087khM44787k4.m35391x1();
                }
            });
            C1158gq.m6877k4(iChartLinesFormat.getEffect(), new C7394ca.k4() { // from class: com.aspose.slides.sq.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44787k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8087khM44787k4.m35375k4(str);
                }
            }, u8sVar);
            c8087khM44787k4.m35379k4(((ChartLinesFormat) iChartLinesFormat).m708k4().m74513k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m70731k4(IChartLinesFormat iChartLinesFormat) {
        if (iChartLinesFormat != null) {
            return (iChartLinesFormat.getLine().isFormatNotDefined() && iChartLinesFormat.getEffect().isNoEffects()) ? false : true;
        }
        return false;
    }
}
