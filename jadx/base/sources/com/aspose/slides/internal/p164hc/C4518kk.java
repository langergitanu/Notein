package com.aspose.slides.internal.p164hc;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.hc.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4518kk implements InterfaceC13443dy {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f12594k4;

    public C4518kk(byte[] bArr) {
        this.f12594k4 = bArr;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo18611k4() {
        return this.f12594k4;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: kk */
    public final long mo18612kk() {
        byte[] bArr = this.f12594k4;
        return C7019kk.m27461m9(Integer.valueOf(bArr == null ? 0 : bArr.length), 9);
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo18614x1() {
        return new C3152yj(this.f12594k4);
    }
}
