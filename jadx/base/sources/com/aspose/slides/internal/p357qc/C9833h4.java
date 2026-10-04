package com.aspose.slides.internal.p357qc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qc.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9833h4 extends C10894bv {

    /* JADX INFO: renamed from: k4 */
    private int f35630k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Integer, C9837to> f35631kk;

    public C9833h4(C10898dy c10898dy) {
        super(c10898dy);
        this.f35631kk = new Dictionary<>();
        m48500x1(0);
    }

    /* JADX INFO: renamed from: x1 */
    private void m48500x1(int i) {
        this.f35630k4 = i;
    }

    /* JADX INFO: renamed from: du */
    public final int m48501du() {
        return this.f35630k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m48503h4() {
        C9835kk c9835kk = new C9835kk(m52569m9());
        this.f35631kk.addItem(Integer.valueOf(m48501du()), new C9837to(c9835kk.m52565c5(), c9835kk));
        int iM48501du = m48501du();
        m48500x1(iM48501du + 1);
        return iM48501du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48504k4(int i) {
        return this.f35631kk.get_Item(Integer.valueOf(i)).m48511x1().m48507du();
    }

    /* JADX INFO: renamed from: du */
    public final int m48502du(String str) {
        this.f35631kk.addItem(Integer.valueOf(m48501du()), new C9837to(str, null));
        int iM48501du = m48501du();
        m48500x1(iM48501du + 1);
        return iM48501du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48505k4(int i, String str) {
        return this.f35631kk.get_Item(Integer.valueOf(i)).m48511x1().m48508du(str);
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52650k4("/Nums");
        c10922yj.m52650k4("[");
        Dictionary.Enumerator<Integer, C9837to> it = this.f35631kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                c10922yj.m52646k4(((Integer) next.getKey()).intValue());
                c10922yj.m52644h4();
                c10922yj.m52650k4(((C9837to) next.getValue()).m48510k4());
                c10922yj.m52644h4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c10922yj.m52650k4("]");
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        Dictionary.ValueCollection.Enumerator<Integer, C9837to> it2 = this.f35631kk.getValues().iterator();
        while (it2.hasNext()) {
            try {
                C9837to next2 = it2.next();
                if (next2.m48511x1() != null) {
                    next2.m48511x1().mo9082k4(c10922yj);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }
}
