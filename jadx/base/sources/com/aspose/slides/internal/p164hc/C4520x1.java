package com.aspose.slides.internal.p164hc;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.hc.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4520x1 implements InterfaceC13443dy {

    /* JADX INFO: renamed from: k4 */
    private final String f12598k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f12599x1;

    public C4520x1(String str) {
        this.f12598k4 = str;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    /* JADX INFO: renamed from: du */
    public final boolean m18622du() {
        return C3131h4.m13361kk(this.f12598k4);
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo18611k4() {
        if (this.f12599x1 == null) {
            this.f12599x1 = C3131h4.m13362m9(this.f12598k4);
        }
        return this.f12599x1;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: kk */
    public final long mo18612kk() {
        byte[] bArr = this.f12599x1;
        return C7019kk.m27461m9(Integer.valueOf(bArr == null ? 0 : bArr.length), 9);
    }

    /* JADX INFO: renamed from: to */
    public final String m18623to() {
        return this.f12598k4;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo18614x1() {
        return new C3130fa(this.f12598k4, 3, 1);
    }
}
