package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5565yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.xw */
/* JADX INFO: loaded from: classes.dex */
public class C4946xw extends C1569kk implements InterfaceC4915m2 {

    /* JADX INFO: renamed from: kk */
    private C4918ne f13519kk;

    /* JADX INFO: renamed from: to */
    private int f13520to;

    public C4946xw(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5565yj, c5552rv);
        this.f13520to = -1;
    }

    /* JADX INFO: renamed from: ai */
    public final boolean m20754ai() {
        return mo22698c5("multiple");
    }

    /* JADX INFO: renamed from: bs */
    public final int m20755bs() {
        return ((Integer) m59497k4("tabindex", 0, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: ca */
    public final int m20756ca() {
        return ((Integer) m59497k4("size", 1, (Class<int>) Integer.class)).intValue();
    }

    /* JADX INFO: renamed from: em */
    public final AbstractC4941wp m20757em() {
        return new C4926ss(m59505uz("OPTION"));
    }

    /* JADX INFO: renamed from: j2 */
    public final String m20758j2() {
        return this.f13520to == -1 ? C14113y2.f47374k4 : m20757em().mo20314k4(this.f13520to).mo22607e0();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20759k4(int i) {
        if (i < 0 || i > m20769w6() - 1) {
            this.f13520to = -1;
        }
        this.f13520to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20761kk(int i) {
        m59500k4("size", i);
    }

    /* JADX INFO: renamed from: os */
    public final C4918ne m20763os() {
        if (this.f13519kk == null) {
            this.f13519kk = (C4918ne) m8440k4(C4918ne.class);
        }
        return this.f13519kk;
    }

    /* JADX INFO: renamed from: qq */
    public final void m20764qq(String str) {
        mo22708k4("name", str);
    }

    /* JADX INFO: renamed from: qw */
    public final String m20765qw() {
        return m20754ai() ? "select-multiple" : "select-one";
    }

    /* JADX INFO: renamed from: ri */
    public final String m20766ri() {
        return m59490c5("name", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: to */
    public final void m20767to(int i) {
        m59500k4("tabindex", i);
    }

    /* JADX INFO: renamed from: tq */
    public final int m20768tq() {
        return this.f13520to;
    }

    /* JADX INFO: renamed from: w6 */
    public final int m20769w6() {
        return m20757em().mo20312k4();
    }

    /* JADX INFO: renamed from: wl */
    public final void m20770wl(String str) {
        int i;
        IGenericEnumerator<InterfaceC12777qq> it = m20757em().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C14113y2.m67363du(it.next().mo22607e0(), str)) {
                i = 0;
                break;
            }
        }
        this.f13520to = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final void m20771x1(int i) {
        if (i == m20757em().mo20312k4()) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= m20757em().mo20312k4()) {
            for (int iMo20312k4 = i - m20757em().mo20312k4(); iMo20312k4 != 0; iMo20312k4--) {
                m22655to(mo22660v4().mo22775du("OPTION"));
            }
            return;
        }
        IGenericEnumerator<InterfaceC12777qq> it = m20757em().iterator();
        List list = new List();
        while (it.hasNext()) {
            if (i == 0) {
                list.addItem(it.next());
            } else {
                i--;
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                m22663x1((AbstractC5535bv) it2.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: zj */
    public final boolean m20772zj() {
        return mo22698c5("disabled");
    }

    @Override // com.aspose.slides.internal.p032b1.C1569kk
    /* JADX INFO: renamed from: k4 */
    public void mo8441k4(InterfaceC1566du interfaceC1566du) {
        InterfaceC1566du interfaceC1566duMo8372k4 = interfaceC1566du.mo8372k4(this);
        if (interfaceC1566duMo8372k4 == null) {
            return;
        }
        m8451x1(interfaceC1566duMo8372k4);
        interfaceC1566du.mo8397k4(this, interfaceC1566duMo8372k4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m20762kk(boolean z) {
        m8444kk("multiple", z);
    }

    @Override // com.aspose.slides.internal.p182ii.InterfaceC4915m2
    /* JADX INFO: renamed from: k4 */
    public final void mo20231k4(C4918ne c4918ne) {
        this.f13519kk = c4918ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20760k4(boolean z) {
        m8444kk("disabled", z);
    }
}
