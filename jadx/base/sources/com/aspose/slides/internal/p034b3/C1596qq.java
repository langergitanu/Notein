package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.qq */
/* JADX INFO: loaded from: classes3.dex */
public class C1596qq extends C1606x1 {

    /* JADX INFO: renamed from: dy */
    private C1586fa f6182dy;

    /* JADX INFO: renamed from: c5 */
    private List<C1577ak> f6181c5 = new List<>();

    /* JADX INFO: renamed from: jd */
    private boolean f6183jd = true;

    public C1596qq(C1586fa c1586fa) {
        this.f6182dy = c1586fa;
        m8667k4(31, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ar */
    public final int m8614ar() {
        return this.f6182dy.m8571wl();
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8475k4(InterfaceC1380to interfaceC1380to) {
        List.Enumerator<C1577ak> it = m8616u4().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo8475k4(interfaceC1380to);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: qq */
    public final int m8615qq() {
        return this.f6182dy.m8569uz();
    }

    /* JADX INFO: renamed from: u4 */
    public final List<C1577ak> m8616u4() {
        return this.f6181c5;
    }

    /* JADX INFO: renamed from: uz */
    public final C1577ak m8617uz() {
        return (C1577ak) OooO0O0.OooO00o(this.f6181c5, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r3.f6183jd = false;
     */
    /* JADX INFO: renamed from: wl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8618wl() {
        List<C1577ak> list;
        if (this.f6183jd && (list = this.f6181c5) != null) {
            List.Enumerator<C1577ak> it = list.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().m8476lr()) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f6183jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1577ak m8619x1(boolean z) {
        if (this.f6181c5.size() > 0 && m8617uz().m8476lr()) {
            List<C1577ak> list = this.f6181c5;
            list.removeAt(list.size() - 1);
        }
        C1608yd c1608ydM8596lr = this.f6182dy.m8596lr();
        this.f6181c5.addItem(new C1577ak(z ? 1 : m8615qq(), m8614ar(), (this.f6182dy.m8678x1() - c1608ydM8596lr.m8660fa()) - c1608ydM8596lr.m8677up()));
        return m8617uz();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8620x1(List<C1577ak> list) {
        this.f6181c5 = new List<>(list);
    }
}
