package com.aspose.slides.internal.p261m0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p248lf.AbstractC6032kk;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p248lf.C6035x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p324oq.C7138x1;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p535yz.C13341h4;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6294dy extends AbstractC6032kk {

    /* JADX INFO: renamed from: du */
    private final C10951c5 f17918du;

    /* JADX INFO: renamed from: k4 */
    private final C6300to f17919k4;

    /* JADX INFO: renamed from: kk */
    private C6035x1 f17920kk;

    /* JADX INFO: renamed from: to */
    private C6029du f17921to;

    /* JADX INFO: renamed from: x1 */
    private final C3786fa f17922x1;

    public C6294dy(C10951c5 c10951c5, C6300to c6300to, C3786fa c3786fa, C6035x1 c6035x1, C6029du c6029du) {
        super(c6035x1, c6029du);
        this.f17920kk = null;
        this.f17921to = null;
        this.f17918du = c10951c5;
        this.f17919k4 = c6300to;
        this.f17922x1 = c3786fa;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public float mo6762k4(C3181c5 c3181c5, char c, float f, float f2, float f3, C12015qq c12015qq) {
        m25752k4(c3181c5, m24358x1(c), f, f2, f3, m24357k4(), this.f17918du, c12015qq.Clone());
        return mo24354k4(c);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25752k4(C3181c5 c3181c5, C13341h4 c13341h4, float f, float f2, float f3, float f4, C10951c5 c10951c5, C12015qq c12015qq) {
        float fM15122kk = C3786fa.m15122kk();
        float f5 = f * fM15122kk;
        float f6 = f2 * fM15122kk;
        float f7 = f4 * fM15122kk;
        Dictionary dictionary = new Dictionary();
        dictionary.addItem("d", c13341h4.m62000ak());
        String strM67400k4 = C14113y2.f47374k4;
        if (c3181c5.f9461x1.containsKey("transform")) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, c3181c5.f9461x1.get_Item("transform"));
        }
        String strM67400k42 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(" translate(", C14080ne.m66947k4(Float.valueOf(f5), (InterfaceC14073kp) C11697x1.m55250kk()), ",", C14080ne.m66947k4(Float.valueOf(f6), (InterfaceC14073kp) C11697x1.m55250kk()), ")"));
        if (c3181c5.f9461x1.containsKey("rotate")) {
            strM67400k42 = C14113y2.m67400k4(strM67400k42, C14113y2.m67408k4(" rotate(", C10308dy.m50272k4(f3), ")"));
        }
        String strM67400k43 = C14113y2.m67400k4(strM67400k42, C14113y2.m67402k4(" scale({0},-{0})", C14080ne.m66947k4(Float.valueOf(f7), (InterfaceC14073kp) C11697x1.m55250kk())));
        if (c3181c5.f9457k4.f9461x1.containsKey("glyph-orientation-horizontal")) {
            strM67400k43 = C14113y2.m67400k4(strM67400k43, C14113y2.m67408k4(" rotate(", C14064he.m66704h4(this.f17922x1.m15128k4(c3181c5.f9457k4.f9461x1.get_Item("glyph-orientation-horizontal"), C14113y2.f47374k4, c3181c5) * (-1.0f)), ")"));
        }
        dictionary.addItem("transform", strM67400k43);
        IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                if (!dictionary.containsKey(next.getKey()) && !"rotate".equals(next.getKey())) {
                    dictionary.addItem(C14113y2.m67440x1(next.getKey()), C14113y2.m67440x1(next.getValue()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f17919k4.m25794k4(new C7138x1("path", new C3187kk(dictionary), null), c10951c5, c12015qq.Clone());
    }
}
