package com.aspose.slides.internal.p164hc;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.C13450to;
import com.aspose.slides.internal.p541z6.C13451up;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hc.du */
/* JADX INFO: loaded from: classes.dex */
public class C4515du implements InterfaceC13443dy {

    /* JADX INFO: renamed from: du */
    private C4520x1 f12576du;

    /* JADX INFO: renamed from: k4 */
    private final C13450to f12577k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f12578kk;

    /* JADX INFO: renamed from: to */
    private byte[] f12579to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC3150x6 f12580x1;

    public C4515du(C13450to c13450to, AbstractC3150x6 abstractC3150x6, byte[] bArr) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("sourceStream");
        }
        this.f12577k4 = c13450to;
        this.f12578kk = bArr;
        this.f12580x1 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: du */
    private void m18607du() {
        try {
            C3131h4.m13365x1(this.f12576du.m18623to());
            this.f12576du.dispose();
            this.f12576du = null;
        } catch (RuntimeException e) {
            this.f12577k4.m62569kk().mo62542k4(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m18608dy() {
        C3152yj c3152yj = new C3152yj();
        try {
            byte[] bArr = this.f12578kk;
            if (bArr != null) {
                c3152yj.write(bArr, 0, bArr.length);
            }
            byte[] bArrM62559k4 = C13447k4.m62559k4(this.f12580x1);
            c3152yj.write(bArrM62559k4, 0, bArrM62559k4.length);
            this.f12579to = c3152yj.toArray();
            this.f12578kk = null;
            c3152yj.dispose();
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m18609h4() {
        C4520x1 c4520x1 = this.f12576du;
        return c4520x1 != null && c4520x1.m18622du();
    }

    /* JADX INFO: renamed from: m9 */
    private void m18610m9() {
        if (this.f12576du != null) {
            return;
        }
        if (!this.f12577k4.m62566k4().getInitialized()) {
            this.f12577k4.m62566k4().init();
        }
        this.f12576du = new C4520x1(this.f12577k4.m62566k4().getNextTempFilePath());
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (m18609h4()) {
            m18607du();
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo18611k4() {
        if (this.f12579to == null) {
            if (!m18609h4()) {
                m18613to();
            }
            this.f12579to = this.f12576du.mo18611k4();
            m18607du();
        }
        return this.f12579to;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: kk */
    public final long mo18612kk() {
        byte[] bArr = this.f12579to;
        return C7019kk.m27461m9(Integer.valueOf(bArr == null ? 0 : bArr.length), 9);
    }

    /* JADX INFO: renamed from: to */
    public final void m18613to() {
        if (this.f12577k4.m62565h4()) {
            m18608dy();
            return;
        }
        m18610m9();
        final C3130fa[] c3130faArr = {null};
        try {
            C3130fa c3130fa = new C3130fa(this.f12576du.m18623to(), 1, 2);
            c3130faArr[0] = c3130fa;
            try {
                byte[] bArr = this.f12578kk;
                if (bArr != null) {
                    c3130fa.write(bArr, 0, bArr.length);
                }
                C13447k4.m62558k4(this.f12580x1, new C13447k4.k4() { // from class: com.aspose.slides.internal.hc.du.1
                    @Override // com.aspose.slides.internal.p541z6.C13447k4.k4
                    /* JADX INFO: renamed from: k4 */
                    public boolean mo18615k4(byte[] bArr2, int i) {
                        c3130faArr[0].write(bArr2, 0, i);
                        return true;
                    }
                }, this.f12577k4.m62570to());
                c3130faArr[0].dispose();
            } catch (Throwable th) {
                c3130faArr[0].dispose();
                throw th;
            }
        } catch (RuntimeException e) {
            C3130fa c3130fa2 = c3130faArr[0];
            if (c3130fa2 != null) {
                c3130fa2.dispose();
            }
            throw new C13451up(C14113y2.m67402k4("Temp file '{0}' could not be created", this.f12576du.m18623to()), e);
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo18614x1() {
        if (this.f12579to != null) {
            return new C3152yj(this.f12579to);
        }
        if (!m18609h4()) {
            m18613to();
        }
        return this.f12576du.mo18614x1();
    }
}
