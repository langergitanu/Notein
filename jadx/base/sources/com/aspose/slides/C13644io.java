package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.io */
/* JADX INFO: loaded from: classes3.dex */
class C13644io extends C14856yp {
    /* JADX INFO: renamed from: k4 */
    public static void m63019k4(qah qahVar) {
        ri7 ri7VarM69481du = qahVar.m69481du();
        C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) qahVar.m69489kk(), C10462h9.class);
        Connector connectorM2644rv = (Connector) C7019kk.m27452k4((Object) ri7VarM69481du.m70148u4(), Connector.class);
        if (connectorM2644rv == null) {
            connectorM2644rv = qahVar.m69491m9().m2644rv();
            ri7VarM69481du.m70143k4(connectorM2644rv);
        }
        C14856yp.m73972x1(qahVar);
        connectorM2644rv.m1591yj().m3331x1(f6b.m5902k4(c10462h9.mo50864to().m52025c5()));
        C14680vi.m72289k4(connectorM2644rv.getFillFormat(), ri7VarM69481du);
        IShapeFrame frame = connectorM2644rv.getFrame();
        tcp.m71097k4(connectorM2644rv.getLineFormat(), (byte) 2, (frame.getFlipH() == 1) ^ (frame.getFlipV() == 1), ri7VarM69481du);
        C14200nt.m68199k4(connectorM2644rv.getEffectFormat(), ri7VarM69481du);
        if (connectorM2644rv.m1591yj().m3334x1() != null) {
            for (int i = 0; i < connectorM2644rv.m1591yj().m3334x1().length; i++) {
                C10609qn c10609qn = c10462h9.mo50859du() != null ? (C10609qn) C7019kk.m27452k4((Object) c10462h9.mo50859du().m51263x1().m50923k4(i + StyleIdentifier.LIST_TABLE_6_COLORFUL), C10609qn.class) : null;
                C13791lr c13791lr = connectorM2644rv.m1591yj().m3334x1()[i];
                if (c10609qn != null) {
                    connectorM2644rv.m1591yj().m3334x1()[i] = new C13791lr(c13791lr != null ? c13791lr.m64509kk() : C14113y2.m67408k4("adj", C14057f9.m66591x1(i)), com.aspose.slides.Collections.Generic.OooO00o.OooO00o(((double) ((int) c10609qn.m51597ar())) / 21600.0d, 100000.0d, 14));
                } else if (c13791lr == null) {
                    connectorM2644rv.m1591yj().m3334x1()[i] = new C13791lr(C14113y2.m67408k4("adj", C14057f9.m66591x1(i)), 0L);
                }
            }
        }
    }
}
