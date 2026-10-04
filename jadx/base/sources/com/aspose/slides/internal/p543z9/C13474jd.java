package com.aspose.slides.internal.p543z9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.z9.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C13474jd extends C4047sv {

    /* JADX INFO: renamed from: k4 */
    private List<C13464ck> f45079k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f45080x1;

    public C13474jd() {
        m16061kk(65535);
        this.f45079k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62657k4(C13464ck c13464ck) {
        this.f45079k4.addItem(c13464ck);
        m62656k4((c13464ck.m62618ck() & 4294967295L) == 0 && ((long) this.f45079k4.size()) == (4294967295L & c13464ck.m62616c5()));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: x1 */
    public final byte[] m62659x1() {
        if (!m62658k4()) {
            return null;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            List.Enumerator<C13464ck> it = this.f45079k4.iterator();
            while (it.hasNext()) {
                try {
                    C13464ck next = it.next();
                    c3152yj.write(next.m62638up(), 0, next.m62638up().length);
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
            byte[] array = c3152yj.toArray();
            c3152yj.dispose();
            return array;
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m62656k4(boolean z) {
        this.f45080x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62658k4() {
        return this.f45080x1;
    }
}
