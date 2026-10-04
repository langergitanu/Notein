package com.aspose.slides.internal.p099e3;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.C3184h4;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10312kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.e3.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3554m9 extends C3182du {
    public C3554m9() {
        this.f9456h4 = AbstractJwtRequest.ClaimNames.USE;
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m14457ak() {
        return C10307du.m50262k4(this.f9461x1.get_Item("width"), C10307du.m50264x1(100.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m14458b3() {
        return C10307du.m50262k4(this.f9461x1.get_Item("x"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m14459dq() {
        return C10307du.m50262k4(this.f9461x1.get_Item("height"), C10307du.m50264x1(100.0f));
    }

    /* JADX INFO: renamed from: du */
    public final void m14460du(C10307du c10307du) {
        this.f9461x1.set_Item("height", c10307du.toString());
    }

    /* JADX INFO: renamed from: jd */
    public final void m14461jd(String str) {
        this.f9461x1.set_Item("xlink:href", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3181c5 m14462k4(C3783ck c3783ck) {
        C3181c5 c3181c5M13677k4 = C3184h4.m13677k4("g");
        C3181c5 c3181c5M13677k42 = C3184h4.m13677k4("g");
        C3181c5 c3181c5M15116k4 = c3783ck.m15116k4(C3794up.m15166kk(m14468xk()));
        if (c3181c5M15116k4 == null) {
            return c3181c5M13677k42;
        }
        List list = new List();
        list.addItem("id");
        list.addItem("x");
        list.addItem("y");
        list.addItem("width");
        list.addItem("height");
        list.addItem("xlink:href");
        IGenericEnumerator<KeyValuePair<String, String>> it = this.f9461x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                if (!list.containsItem(next.getKey())) {
                    c3181c5M13677k42.f9461x1.m13684k4(next.getKey(), next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27469x1(c3181c5M15116k4, C3551h4.class)) {
            C3181c5 c3181c5M13677k43 = C3184h4.m13677k4("svg");
            C3187kk c3187kk = c3181c5M15116k4.f9461x1;
            c3181c5M13677k43.f9461x1 = c3187kk;
            c3187kk.set_Item("x", m14458b3().toString());
            c3181c5M13677k43.f9461x1.set_Item("y", m14466wy().toString());
            c3181c5M13677k43.f9461x1.set_Item("width", m14457ak().toString());
            c3181c5M13677k43.f9461x1.set_Item("height", m14459dq().toString());
            IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it2 = c3181c5M15116k4.m13628ar().iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair<Integer, C3181c5> next2 = it2.next();
                    c3181c5M13677k43.m13628ar().m13699k4(next2.getKey().intValue(), next2.getValue());
                    next2.getValue().f9457k4 = c3181c5M13677k43;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            c3181c5M13677k42.m13628ar().m13703x1(0, c3181c5M13677k43);
            c3181c5M13677k43.f9457k4 = c3181c5M13677k42;
        } else {
            if (C7019kk.m27469x1(c3181c5M15116k4, C3550du.class)) {
                c3181c5M15116k4.f9461x1.set_Item("x", m14458b3().toString());
                c3181c5M15116k4.f9461x1.set_Item("y", m14466wy().toString());
                c3181c5M15116k4.f9461x1.set_Item("width", m14457ak().toString());
                c3181c5M15116k4.f9461x1.set_Item("height", m14459dq().toString());
            } else {
                String strM67402k4 = C14113y2.m67402k4("translate({0}, {1})", m14458b3(), m14466wy());
                if (C14113y2.m67411k4(c3181c5M13677k42.f9461x1.get_Item("transform"))) {
                    c3181c5M13677k42.f9461x1.m13684k4("transform", strM67402k4);
                } else {
                    C3187kk c3187kk2 = c3181c5M13677k42.f9461x1;
                    c3187kk2.set_Item("transform", C14113y2.m67408k4(c3187kk2.get_Item("transform"), " ", strM67402k4));
                }
            }
            c3181c5M13677k42.m13628ar().m13703x1(0, c3181c5M15116k4);
            c3181c5M15116k4.f9457k4 = c3181c5M13677k42;
        }
        c3181c5M13677k42.f9457k4 = c3181c5M13677k4;
        c3181c5M13677k4.f9457k4 = this.f9457k4;
        c3181c5M13677k4.m13628ar().m13703x1(0, c3181c5M13677k42);
        if (!C14113y2.m67411k4(m13641uz()) && c3783ck.m15119x1().containsKey(m13641uz())) {
            c3783ck.m15119x1().set_Item(m13641uz(), c3181c5M13677k42);
        }
        return c3181c5M13677k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m14464kk(C10307du c10307du) {
        this.f9461x1.set_Item("y", c10307du.toString());
    }

    /* JADX INFO: renamed from: to */
    public final void m14465to(C10307du c10307du) {
        this.f9461x1.set_Item("width", c10307du.toString());
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m14466wy() {
        return C10307du.m50262k4(this.f9461x1.get_Item("y"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14467x1(C10307du c10307du) {
        this.f9461x1.set_Item("x", c10307du.toString());
    }

    /* JADX INFO: renamed from: xk */
    public final String m14468xk() {
        return this.f9461x1.m13692to("xlink:href");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14463k4(C10312kk c10312kk) {
        this.f9461x1.set_Item("preserveAspectRatio", c10312kk.toString());
    }
}
