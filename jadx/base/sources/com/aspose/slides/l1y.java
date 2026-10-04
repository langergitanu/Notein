package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10357al;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10532m1;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10679ve;
import com.aspose.slides.internal.p407st.C10742z2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class l1y {
    /* JADX INFO: renamed from: k4 */
    private static byte m64240k4(long j) {
        int i = (int) j;
        if (i != 0) {
            return i != 1 ? (byte) 0 : (byte) 2;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64246x1(com.aspose.slides.internal.p332p7.no7 no7Var, C10486iy c10486iy) {
        C10679ve c10679ve = new C10679ve();
        if (c10486iy == null) {
            throw new NullReferenceException("TimeNode couldn't be empty.");
        }
        c10486iy.m50513yj().addItem(c10679ve);
        if (no7Var == null || no7Var.m37764dy() == null || no7Var.m37764dy().m40904k4().length == 0) {
            return;
        }
        for (String str : no7Var.m37764dy().m40904k4()) {
            c10679ve.m50513yj().addItem(new C10742z2(str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static long m64241k4(byte b) {
        return b != 2 ? 0L : 1L;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64242k4(final com.aspose.slides.internal.p332p7.no7 no7Var, C10357al c10357al, C10486iy c10486iy, m4c m4cVar) {
        if (c10357al == null || c10486iy == null) {
            return;
        }
        ubb.m71605k4(no7Var.m37765h4(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.l1y.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(no7Var.m37765h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.ei2 invoke() {
                return no7Var.m37765h4().m36293k4();
            }
        }, new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.l1y.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(no7Var.m37765h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.ei2 invoke() {
                return no7Var.m37765h4().m36323x1();
            }
        }, c10357al, m4cVar);
        m64244k4(no7Var, c10486iy, m4cVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64243k4(com.aspose.slides.internal.p332p7.no7 no7Var, C10486iy c10486iy) {
        if (no7Var == null) {
            throw new InvalidOperationException();
        }
        if (c10486iy == null) {
            throw new InvalidOperationException();
        }
        C10532m1 c10532m1 = new C10532m1();
        c10486iy.m50513yj().addItem(c10532m1);
        if (no7Var.m37774x1() != -1) {
            c10532m1.m51231k4(true);
            c10532m1.m51230k4(m64241k4(no7Var.m37774x1()));
        } else {
            c10532m1.m51231k4(false);
            c10532m1.m51230k4(0L);
        }
        if (no7Var.m37764dy() == null || no7Var.m37764dy().m40904k4().length <= 0) {
            c10532m1.m51235x1(false);
        } else {
            c10532m1.m51235x1(true);
        }
        c10532m1.m51234x1(0L);
        c10532m1.m51233kk(0L);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64244k4(com.aspose.slides.internal.p332p7.no7 no7Var, C10486iy c10486iy, m4c m4cVar) {
        if (c10486iy == null) {
            return;
        }
        if (c10486iy.m50975h4() != null) {
            fut.m6324k4(no7Var.m37771m9(), c10486iy.m50975h4().m50973x1(), m4cVar);
        }
        if (c10486iy.m50976to() != null && c10486iy.m50976to().m51414yd() > 0) {
            com.aspose.slides.internal.p332p7.sd0 sd0VarM37766k4 = no7Var.m37766k4();
            List.Enumerator<AbstractC10571o4> it = c10486iy.m50976to().m50513yj().iterator();
            while (it.hasNext()) {
                try {
                    C10742z2 c10742z2 = (C10742z2) C7019kk.m27452k4((Object) it.next(), C10742z2.class);
                    if (c10742z2 != null) {
                        sd0VarM37766k4.m40903k4(c10742z2.m52123du());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (c10486iy.m50977x1().m51236x1()) {
            no7Var.m37767k4(m64240k4(c10486iy.m50977x1().m51232kk()));
        }
        no7Var.m37775x1((byte) -1);
        no7Var.m37770kk((byte) -1);
        no7Var.m37773to((byte) -1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64245k4(final com.aspose.slides.internal.p332p7.no7 no7Var, C10562nk c10562nk, C10486iy c10486iy, m4c m4cVar) {
        if (c10562nk == null || c10486iy == null) {
            return;
        }
        ubb.m71605k4(no7Var.m37765h4(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.l1y.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(no7Var.m37765h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.ei2 invoke() {
                return no7Var.m37765h4().m36293k4();
            }
        }, new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.l1y.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(no7Var.m37765h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.ei2 invoke() {
                return no7Var.m37765h4().m36323x1();
            }
        }, c10562nk, m4cVar);
        m64244k4(no7Var, c10486iy, m4cVar);
    }
}
