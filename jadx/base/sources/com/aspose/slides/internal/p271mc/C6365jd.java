package com.aspose.slides.internal.p271mc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6365jd {

    /* JADX INFO: renamed from: k4 */
    private final List<C6370up> f18136k4 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final void m26154k4(C6370up c6370up) {
        this.f18136k4.addItem(c6370up);
    }

    /* JADX INFO: renamed from: kk */
    public final C12007ix m26156kk() {
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        List.Enumerator<C6370up> it = this.f18136k4.iterator();
        while (it.hasNext()) {
            try {
                C12007ix c12007ixClone2 = it.next().m26181ck().Clone();
                if (!C12007ix.m56546kk(c12007ixClone, C12007ix.f40519k4)) {
                    c12007ixClone2 = C12007ix.m56549x1(c12007ixClone.Clone(), c12007ixClone2.Clone());
                }
                c12007ixClone2.CloneTo(c12007ixClone);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c12007ixClone;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m26157x1() {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C6370up> it = this.f18136k4.iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(it.next().m26186k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final C6370up[] m26155k4() {
        return this.f18136k4.toArray(new C6370up[0]);
    }
}
