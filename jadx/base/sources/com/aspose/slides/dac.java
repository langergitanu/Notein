package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7325bj;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C7838hd;
import com.aspose.slides.internal.p332p7.C8168lb;
import com.aspose.slides.internal.p332p7.C8338ng;
import com.aspose.slides.internal.p332p7.C8481oy;
import com.aspose.slides.internal.p332p7.C8717rw;
import com.aspose.slides.internal.p332p7.C8836t5;
import com.aspose.slides.internal.p332p7.C8842t8;
import com.aspose.slides.internal.p332p7.C8880tn;
import com.aspose.slides.internal.p332p7.C9085w3;
import com.aspose.slides.internal.p332p7.C9247xy;
import com.aspose.slides.internal.p332p7.C9404zv;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dac {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MathMatrix m5022k4(C8842t8 c8842t8, gnb gnbVar) {
        int i;
        if (c8842t8 == null) {
            throw new ArgumentNullException("elementData");
        }
        int length = c8842t8.m41573kk().length;
        List list = new List();
        if (c8842t8.m41574x1() != null) {
            C8481oy c8481oyM41574x1 = c8842t8.m41574x1();
            if (c8481oyM41574x1.m38507c5() != null) {
                i = 0;
                for (C8338ng c8338ng : c8481oyM41574x1.m38507c5().m45960x1()) {
                    if (c8338ng.m37495x1() == null || c8338ng.m37495x1().m44744k4() == null) {
                        i++;
                        list.addItem(2);
                    } else {
                        byte bM41540k4 = c8338ng.m37495x1().m44744k4().m41540k4();
                        int iM71886c5 = c8338ng.m37495x1().m44747x1() != null ? C14649ut.m71886c5(c8338ng.m37495x1().m44747x1().m33289k4()) : 2;
                        int i2 = bM41540k4 & 255;
                        i += i2;
                        for (int i3 = 0; i3 < i2; i3++) {
                            list.addItem(Integer.valueOf(iM71886c5));
                        }
                    }
                }
            } else {
                i = 1;
            }
        }
        MathMatrix mathMatrix = new MathMatrix(length, i);
        List.Enumerator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            try {
                int i5 = i4 + 1;
                mathMatrix.setColumnAlignment(i4, ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue());
                i4 = i5;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (c8842t8.m41574x1() != null) {
            C8481oy c8481oyM41574x12 = c8842t8.m41574x1();
            if (c8481oyM41574x12.m38522x1() != null) {
                mathMatrix.setBaseJustification(C14649ut.m71896m9(c8481oyM41574x12.m38522x1().m41812k4()));
            }
            if (c8481oyM41574x12.m38518kk() != null) {
                mathMatrix.setHidePlaceholders(diq.m5108k4(c8481oyM41574x12.m38518kk()));
            }
            if (c8481oyM41574x12.m38521to() != null) {
                mathMatrix.setRowGapRule(c8481oyM41574x12.m38521to().m35975k4() & 255);
            }
            if (c8481oyM41574x12.m38510h4() != null) {
                mathMatrix.setRowGap(c8481oyM41574x12.m38510h4().m40587k4());
            }
            if (c8481oyM41574x12.m38508du() != null) {
                mathMatrix.setColumnGapRule(c8481oyM41574x12.m38508du().m35975k4() & 255);
            }
            if (c8481oyM41574x12.m38509dy() != null) {
                mathMatrix.setColumnGap(c8481oyM41574x12.m38509dy().m40587k4());
            }
            if (c8481oyM41574x12.m38520m9() != null) {
                mathMatrix.setMinColumnWidth(c8481oyM41574x12.m38520m9().m40587k4());
            }
            C13727kg.m63827k4(mathMatrix.f2781k4, c8481oyM41574x12.m38511jd(), gnbVar);
        }
        int i6 = 0;
        for (C7325bj c7325bj : c8842t8.m41573kk()) {
            int i7 = 0;
            for (C9085w3 c9085w3 : c7325bj.m28916x1()) {
                mathMatrix.set_Item(i6, i7, jz7.m63584k4(c9085w3, gnbVar));
                i7++;
            }
            i6++;
        }
        return mathMatrix;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5023k4(MathMatrix mathMatrix, C8842t8 c8842t8, u8s u8sVar) {
        if (mathMatrix == null) {
            throw new ArgumentNullException("matrix");
        }
        if (c8842t8 == null) {
            throw new ArgumentNullException("elementData");
        }
        final C8481oy c8481oy = new C8481oy();
        c8842t8.m41572k4(c8481oy);
        C9404zv c9404zv = new C9404zv();
        c8481oy.m38516k4(c9404zv);
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= mathMatrix.getColumnCount()) {
                break;
            }
            int i3 = i + 1;
            int columnAlignment = mathMatrix.getColumnAlignment(i);
            while (i3 < mathMatrix.getColumnCount() && mathMatrix.getColumnAlignment(i3) == columnAlignment) {
                i2++;
                i3++;
            }
            C9247xy c9247xyM37494k4 = c9404zv.m45959k4().m37494k4();
            C8836t5 c8836t5 = new C8836t5();
            c8836t5.m41541k4((byte) i2);
            c9247xyM37494k4.m44746k4(c8836t5);
            C7838hd c7838hd = new C7838hd();
            c7838hd.m33290k4(C14649ut.m71892jd(columnAlignment));
            c9247xyM37494k4.m44745k4(c7838hd);
            i = i3;
        }
        MathMatrix mathMatrix2 = new MathMatrix(1, 1);
        if (mathMatrix.getBaseJustification() != mathMatrix2.getBaseJustification()) {
            C8880tn c8880tn = new C8880tn();
            c8880tn.m41813k4(C14649ut.m71889dy(mathMatrix.getBaseJustification()));
            c8481oy.m38515k4(c8880tn);
        }
        if (mathMatrix.getHidePlaceholders() != mathMatrix2.getHidePlaceholders()) {
            c8481oy.m38517k4(diq.m5107k4(mathMatrix.getHidePlaceholders()));
        }
        if (mathMatrix.getRowGapRule() != mathMatrix2.getRowGapRule()) {
            C8168lb c8168lb = new C8168lb();
            c8168lb.m35976k4((byte) mathMatrix.getRowGapRule());
            c8481oy.m38513k4(c8168lb);
        }
        if ((mathMatrix.getRowGap() & 4294967295L) != (mathMatrix2.getRowGap() & 4294967295L)) {
            C8717rw c8717rw = new C8717rw();
            c8717rw.m40588k4(mathMatrix.getRowGap());
            c8481oy.m38514k4(c8717rw);
        }
        if (mathMatrix.getColumnGapRule() != mathMatrix2.getColumnGapRule()) {
            C8168lb c8168lb2 = new C8168lb();
            c8168lb2.m35976k4((byte) mathMatrix.getColumnGapRule());
            c8481oy.m38523x1(c8168lb2);
        }
        if ((mathMatrix.getColumnGap() & 4294967295L) != (mathMatrix2.getColumnGap() & 4294967295L)) {
            C8717rw c8717rw2 = new C8717rw();
            c8717rw2.m40588k4(mathMatrix.getColumnGap());
            c8481oy.m38519kk(c8717rw2);
        }
        if ((mathMatrix.getMinColumnWidth() & 4294967295L) != (4294967295L & mathMatrix2.getMinColumnWidth())) {
            C8717rw c8717rw3 = new C8717rw();
            c8717rw3.m40588k4(mathMatrix.getMinColumnWidth());
            c8481oy.m38524x1(c8717rw3);
        }
        C13727kg.m63826k4(mathMatrix.f2781k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.dac.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8481oy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_MPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c8481oy.m38512k4();
            }
        }, u8sVar);
        for (int i4 = 0; i4 < mathMatrix.getRowCount(); i4++) {
            C7325bj c7325bjM41571k4 = c8842t8.m41571k4();
            for (int i5 = 0; i5 < mathMatrix.getColumnCount(); i5++) {
                jz7.m63588k4(c7325bjM41571k4.m28915k4(), ue7.m71677x1(mathMatrix.get_Item(i4, i5)), u8sVar);
            }
        }
    }
}
