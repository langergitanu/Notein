package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pv */
/* JADX INFO: loaded from: classes3.dex */
class C14317pv {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, C14744wn> f48162k4;

    public C14317pv() {
        this.f48162k4 = null;
        this.f48162k4 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14744wn> m69259k4(C1205hi c1205hi, String str) {
        List<C14744wn> list = new List<>();
        Dictionary.Enumerator<String, C14744wn> it = this.f48162k4.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                C14744wn c14744wn = (C14744wn) it.next().getValue();
                if (c14744wn.m72838x1().m7160ck()) {
                    list.addItem(c14744wn);
                } else if (c1205hi.m7168k4(c14744wn.m72838x1())) {
                    list.insertItem(i, c14744wn);
                    i++;
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
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14744wn m69260k4(String str) {
        String strM67440x1 = C14113y2.m67440x1(str);
        if (C14113y2.m67411k4(strM67440x1)) {
            return null;
        }
        C14744wn[] c14744wnArr = {null};
        boolean zTryGetValue = this.f48162k4.tryGetValue(strM67440x1, c14744wnArr);
        C14744wn c14744wn = c14744wnArr[0];
        if (zTryGetValue) {
            return c14744wn;
        }
        C14744wn c14744wn2 = new C14744wn(C14113y2.m67440x1(str));
        this.f48162k4.addItem(strM67440x1, c14744wn2);
        return c14744wn2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69257k4(List<C14744wn> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14744wn c14744wn = list.get_Item(i);
            if (!c14744wn.m72837kk()) {
                c14744wn.m72836k4(true);
                C14744wn[] c14744wnArr = {null};
                boolean zTryGetValue = this.f48162k4.tryGetValue(c14744wn.m72835k4(), c14744wnArr);
                C14744wn c14744wn2 = c14744wnArr[0];
                if (zTryGetValue) {
                    list.set_Item(i, c14744wn2);
                } else {
                    m69258k4(c14744wn);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69261k4(FontFallBackRule fontFallBackRule) {
        m69257k4(fontFallBackRule.m1493k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69262k4(C0757ao c0757ao) {
        m69257k4(c0757ao.m3685x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m69258k4(C14744wn c14744wn) {
        this.f48162k4.addItem(c14744wn.m72835k4(), c14744wn);
    }
}
