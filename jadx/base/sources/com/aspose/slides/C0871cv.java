package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7314bd;
import com.aspose.slides.internal.p332p7.C7752ge;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8367np;
import com.aspose.slides.internal.p332p7.C8952ug;

/* JADX INFO: renamed from: com.aspose.slides.cv */
/* JADX INFO: loaded from: classes3.dex */
class C0871cv {
    /* JADX INFO: renamed from: k4 */
    public static void m4819k4(IDataLabel iDataLabel, AbstractC4685kk<C8367np> abstractC4685kk, long j, IDataLabelFormat iDataLabelFormat, u8s u8sVar) {
        int i;
        if (C14624u9.m71577k4(iDataLabel, iDataLabelFormat)) {
            final C8367np c8367npInvoke = abstractC4685kk.invoke();
            C0799b6 c0799b6M1305x1 = ((DataLabel) iDataLabel).m1305x1();
            c8367npInvoke.m37796k4(j);
            if (C13691jl.m63403k4(iDataLabel.getTextFormat())) {
                C13691jl.m63395k4(iDataLabel.getDataLabelFormat().getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.cv.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8367npInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataLabelElementData.AddTxPr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8952ug invoke() {
                        return c8367npInvoke.m37799kk();
                    }
                }, u8sVar);
            }
            C14864yx.m74127k4(iDataLabel.getDataLabelFormat().getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.cv.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8367npInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataLabelElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8367npInvoke.m37802x1();
                }
            }, u8sVar, null, false);
            if (iDataLabel.getDataLabelFormat().getPosition() != -1) {
                switch (iDataLabel.getDataLabelFormat().getPosition()) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    case 8:
                        i = 9;
                        break;
                }
                c8367npInvoke.m37795k4(i);
            }
            C7752ge c7752geM37801to = c8367npInvoke.m37801to();
            c7752geM37801to.m32482x1(iDataLabel.getDataLabelFormat().getShowCategoryName() ? (byte) 1 : (byte) 0);
            c7752geM37801to.m32478k4(iDataLabel.getDataLabelFormat().getShowSeriesName() ? (byte) 1 : (byte) 0);
            c7752geM37801to.m32480kk(iDataLabel.getDataLabelFormat().getShowValue() ? (byte) 1 : (byte) 0);
            if (!"".equals(iDataLabel.getDataLabelFormat().getNumberFormat())) {
                C7314bd c7314bdM37794k4 = c8367npInvoke.m37794k4();
                c7314bdM37794k4.m28823k4(iDataLabel.getDataLabelFormat().getNumberFormat());
                c7314bdM37794k4.m28822k4(iDataLabel.getDataLabelFormat().isNumberFormatLinkedToSource() ? (byte) 1 : (byte) 0);
            }
            if (!"".equals(iDataLabel.getDataLabelFormat().getSeparator())) {
                c8367npInvoke.m37798k4(iDataLabel.getDataLabelFormat().getSeparator());
            }
            if (c0799b6M1305x1.m4029x1() != null) {
                c8367npInvoke.m37797k4(c0799b6M1305x1.m4029x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4820k4(IDataLabel iDataLabel, C8367np c8367np, gnb gnbVar) {
        DataLabelFormat dataLabelFormat;
        if (c8367np == null) {
            return;
        }
        ((DataLabel) C7019kk.m27452k4((Object) iDataLabel, DataLabel.class)).m1305x1().m4024k4(c8367np.m37791fa());
        int i = 0;
        if (c8367np.m37800m9() != null) {
            iDataLabel.getDataLabelFormat().setNumberFormat(c8367np.m37800m9().m28821k4());
            iDataLabel.getDataLabelFormat().setNumberFormatLinkedToSource(c8367np.m37800m9().m28824x1() == 1);
        }
        if (c8367np.m37793jd() != null) {
            iDataLabel.getDataLabelFormat().setShowCategoryName(c8367np.m37793jd().m32481x1() == 1);
            iDataLabel.getDataLabelFormat().setShowSeriesName(c8367np.m37793jd().m32477k4() == 1);
            iDataLabel.getDataLabelFormat().setShowValue(c8367np.m37793jd().m32479kk() == 1);
        }
        switch (c8367np.m37792h4()) {
            case 0:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = -1;
                dataLabelFormat.m1316k4(i);
                break;
            case 1:
                ((DataLabelFormat) iDataLabel.getDataLabelFormat()).m1316k4(1);
                break;
            case 2:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                dataLabelFormat.m1316k4(i);
                break;
            case 3:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 2;
                dataLabelFormat.m1316k4(i);
                break;
            case 4:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 3;
                dataLabelFormat.m1316k4(i);
                break;
            case 5:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 4;
                dataLabelFormat.m1316k4(i);
                break;
            case 6:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 5;
                dataLabelFormat.m1316k4(i);
                break;
            case 7:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 6;
                dataLabelFormat.m1316k4(i);
                break;
            case 8:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 7;
                dataLabelFormat.m1316k4(i);
                break;
            case 9:
                dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
                i = 8;
                dataLabelFormat.m1316k4(i);
                break;
        }
        if (c8367np.m37788ck() != null) {
            ((DataLabelFormat) iDataLabel.getDataLabelFormat()).setSeparator(c8367np.m37788ck());
        }
        if (c8367np.m37790dy() != null) {
            C14864yx.m74128k4(iDataLabel.getDataLabelFormat().getFormat(), c8367np.m37790dy(), gnbVar);
        }
        if (c8367np.m37787c5() != null) {
            C13691jl.m63398k4(iDataLabel.getDataLabelFormat().getTextFormat(), c8367np.m37787c5(), gnbVar);
        }
    }
}
