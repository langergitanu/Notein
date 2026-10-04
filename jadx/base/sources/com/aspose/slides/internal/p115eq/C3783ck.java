package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p248lf.C6035x1;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p321on.C7125kk;
import com.aspose.slides.internal.p535yz.AbstractC13340dy;
import com.aspose.slides.internal.p535yz.C13338c5;
import com.aspose.slides.internal.p535yz.C13341h4;
import com.aspose.slides.internal.p535yz.C13343k4;
import com.aspose.slides.internal.p535yz.C13347x1;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.ck */
/* JADX INFO: loaded from: classes.dex */
public class C3783ck {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f10300kk = new C7017h4("font-face", "missing-glyph", "glyph", "hkern", "vkern");

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, List<C6035x1>> f10301k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, C3181c5> f10302x1 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, List<C6035x1>> m15115k4() {
        return this.f10301k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, C3181c5> m15119x1() {
        return this.f10302x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3181c5 m15116k4(String str) {
        return m15117k4(str, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3181c5 m15117k4(String str, boolean z) {
        String strM15166kk = C3794up.m15166kk(str);
        if (!m15119x1().containsKey(strM15166kk)) {
            return null;
        }
        C3181c5 c3181c5Mo13644yd = m15119x1().get_Item(strM15166kk).mo13644yd();
        if (z && c3181c5Mo13644yd != null && c3181c5Mo13644yd.m13643wl()) {
            C7125kk.m27660k4(c3181c5Mo13644yd, true);
        }
        return c3181c5Mo13644yd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15118k4(C13343k4 c13343k4) {
        IGenericCollection iGenericCollection;
        C3182du c3182du;
        C6035x1 c6035x1 = new C6035x1();
        c6035x1.m24369k4(c13343k4);
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c13343k4.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                C3181c5 value = it.next().getValue();
                int iM27428k4 = f10300kk.m27428k4(value.f9456h4);
                if (iM27428k4 == 0) {
                    c6035x1.m24370k4((C13347x1) value);
                } else if (iM27428k4 != 1) {
                    if (iM27428k4 == 2) {
                        iGenericCollection = c6035x1.f17119k4;
                        c3182du = (C13341h4) value;
                    } else if (iM27428k4 == 3) {
                        iGenericCollection = c6035x1.f17122x1;
                        c3182du = (AbstractC13340dy) value;
                    } else if (iM27428k4 == 4) {
                        iGenericCollection = c6035x1.f17120kk;
                        c3182du = (AbstractC13340dy) value;
                    }
                    iGenericCollection.addItem(c3182du);
                } else {
                    c6035x1.m24368k4((C13338c5) value);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        String strM62010b3 = c6035x1.m24367k4().m62010b3();
        if (!this.f10301k4.containsKey(strM62010b3)) {
            this.f10301k4.addItem(strM62010b3, new List<>());
        }
        this.f10301k4.get_Item(strM62010b3).addItem(c6035x1);
    }
}
