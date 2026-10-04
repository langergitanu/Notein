package com.aspose.slides.internal.p477wk;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p495x7.InterfaceC12463ck;
import com.aspose.slides.internal.p495x7.InterfaceC12471jd;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wk.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12084x1 {

    /* JADX INFO: renamed from: kk */
    private C12009k4 f40628kk;

    /* JADX INFO: renamed from: to */
    private C12083kk f40629to;

    /* JADX INFO: renamed from: k4 */
    private final Object f40627k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private Boolean f40630x1 = Boolean.FALSE;

    public C12084x1(C12009k4 c12009k4) {
        this.f40628kk = c12009k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m56961kk() {
        this.f40630x1 = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12463ck m56962x1(C3983k4 c3983k4) {
        return AbstractC14124to.m67610c5().mo67649k4(this.f40628kk, this.f40629to, c3983k4);
    }

    /* JADX INFO: renamed from: k4 */
    public C3983k4 m56964k4(C12014ne c12014ne, int i, int i2, boolean z) {
        C3983k4 c3983k4Mo58027k4;
        synchronized (this.f40627k4) {
            try {
                if (m56966k4()) {
                    throw new InvalidOperationException("Bitmap is already locked");
                }
                C12083kk c12083kk = new C12083kk(c12014ne.Clone(), i, i2);
                this.f40628kk.m56608x1().mo11979jd();
                c3983k4Mo58027k4 = m56960k4(this.f40628kk, c12083kk).mo58027k4(z);
                m56963x1();
                this.f40629to = c12083kk;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3983k4Mo58027k4;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12471jd m56960k4(C12009k4 c12009k4, C12083kk c12083kk) {
        return AbstractC14124to.m67610c5().mo67650k4(c12009k4, c12083kk);
    }

    /* JADX INFO: renamed from: x1 */
    private void m56963x1() {
        this.f40630x1 = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56965k4(C3983k4 c3983k4) {
        if (c3983k4 == null) {
            throw new ArgumentException("Parameter is not valid");
        }
        synchronized (this.f40627k4) {
            try {
                if (!m56966k4()) {
                    throw new ExternalException("Image is not locked");
                }
                m56962x1(c3983k4).mo58024ck();
                this.f40628kk.m56608x1().mo11974ck();
                m56961kk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56966k4() {
        return this.f40630x1.booleanValue();
    }
}
