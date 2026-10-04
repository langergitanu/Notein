package com.aspose.slides.internal.p164hc;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3135kk;
import com.aspose.slides.internal.p482wr.C12249c5;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.C13450to;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.hc.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4516h4 implements InterfaceC13443dy {

    /* JADX INFO: renamed from: k4 */
    private final C13452x1.k4 f12583k4;

    /* JADX INFO: renamed from: kk */
    private final C12262lr f12584kk;

    /* JADX INFO: renamed from: to */
    private C4517k4 f12585to;

    /* JADX INFO: renamed from: x1 */
    private final C13450to f12586x1;

    public C4516h4(C12262lr c12262lr, C13450to c13450to, C13452x1.k4 k4Var) {
        if (c12262lr == null) {
            throw new ArgumentNullException("zipEntry");
        }
        this.f12584kk = c12262lr;
        this.f12586x1 = c13450to;
        this.f12583k4 = k4Var;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        C4517k4 c4517k4 = this.f12585to;
        if (c4517k4 != null) {
            c4517k4.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m18616du() {
        C12249c5 c12249c5M57327bv = this.f12584kk.m57327bv();
        try {
            C4517k4 c4517k4 = new C4517k4(c12249c5M57327bv, this.f12586x1, this.f12583k4);
            this.f12585to = c4517k4;
            c4517k4.m18620to();
        } finally {
            if (c12249c5M57327bv != null) {
                c12249c5M57327bv.dispose();
            }
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo18611k4() {
        if (this.f12585to == null) {
            m18616du();
        }
        return this.f12585to.mo18611k4();
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: kk */
    public final long mo18612kk() {
        C4517k4 c4517k4 = this.f12585to;
        if (c4517k4 == null) {
            return 0L;
        }
        return c4517k4.mo18612kk();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m18617to() {
        return this.f12585to == null;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo18614x1() {
        C4517k4 c4517k4 = this.f12585to;
        return c4517k4 != null ? c4517k4.mo18614x1() : new C3135kk(this.f12584kk.m57327bv(), (int) C13447k4.f45030k4);
    }
}
