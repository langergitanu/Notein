package com.aspose.slides.internal.p541z6;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C13444fa implements IDisposable {

    /* JADX INFO: renamed from: du */
    private String f45018du;

    /* JADX INFO: renamed from: h4 */
    private C3130fa f45019h4;

    /* JADX INFO: renamed from: k4 */
    private final C13452x1 f45020k4;

    /* JADX INFO: renamed from: kk */
    private final k4 f45021kk;

    /* JADX INFO: renamed from: to */
    private AbstractC3150x6 f45022to;

    /* JADX INFO: renamed from: x1 */
    private final String f45023x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.z6.fa$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo2401k4(AbstractC3150x6 abstractC3150x6);
    }

    public C13444fa(C13452x1 c13452x1, AbstractC3150x6 abstractC3150x6, String str, k4 k4Var) {
        this.f45020k4 = c13452x1;
        this.f45022to = abstractC3150x6;
        this.f45021kk = k4Var;
        this.f45023x1 = C3141rv.m13406kk(str);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m62549kk() {
        return !C14113y2.m67411k4(this.f45018du) && C3131h4.m13361kk(this.f45018du);
    }

    /* JADX INFO: renamed from: to */
    private void m62550to() {
        if (!this.f45020k4.m62575k4().getInitialized()) {
            this.f45020k4.m62575k4().init();
        }
        this.f45018du = this.f45020k4.m62575k4().getNextTempFilePath();
    }

    /* JADX INFO: renamed from: x1 */
    private void m62551x1(String str) {
        C3130fa c3130fa = new C3130fa(str, 3, 1, 1);
        this.f45022to = c3130fa;
        this.f45021kk.mo2401k4(c3130fa);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() throws Throwable {
        C3130fa c3130fa = this.f45019h4;
        if (c3130fa != null) {
            c3130fa.dispose();
        }
        if (m62549kk()) {
            this.f45022to.dispose();
            C3131h4.m13357k4(this.f45018du, this.f45023x1, true);
            C3131h4.m13365x1(this.f45018du);
            m62551x1(this.f45023x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3130fa m62553k4() {
        String str;
        if (m62552x1()) {
            this.f45020k4.m62583x1();
            m62550to();
            str = this.f45018du;
        } else {
            str = this.f45023x1;
        }
        return m62548k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    private C3130fa m62548k4(String str) {
        C3130fa c3130fa = new C3130fa(str, 2, 2);
        this.f45019h4 = c3130fa;
        return c3130fa;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m62552x1() {
        return C7019kk.m27469x1(this.f45022to, C3130fa.class) && C14113y2.m67363du(C3141rv.m13406kk(((C3130fa) this.f45022to).m13345k4()), this.f45023x1);
    }
}
