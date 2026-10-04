package com.aspose.slides.internal.p164hc;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p536z0.C13348k4;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.hc.to */
/* JADX INFO: loaded from: classes.dex */
public class C4519to implements InterfaceC13443dy {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f12595k4;

    /* JADX INFO: renamed from: kk */
    private C13348k4 f12596kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f12597x1;

    public C4519to(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("sourceStream");
        }
        if (!abstractC3150x6.canSeek()) {
            throw new ArgumentException("Stream should be seekable", "sourceStream");
        }
        this.f12595k4 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: to */
    private void m18621to() {
        this.f12595k4.seek(0L, 0);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        C13348k4 c13348k4 = this.f12596kk;
        if (c13348k4 != null && !c13348k4.m62017x1()) {
            this.f12596kk.dispose();
        }
        this.f12596kk = null;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo18611k4() {
        if (this.f12597x1 == null) {
            m18621to();
            this.f12597x1 = C13447k4.m62559k4(this.f12595k4);
        }
        return this.f12597x1;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: kk */
    public final long mo18612kk() {
        byte[] bArr = this.f12597x1;
        return C7019kk.m27461m9(Integer.valueOf(bArr == null ? 0 : bArr.length), 9);
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo18614x1() {
        C13348k4 c13348k4 = this.f12596kk;
        if (c13348k4 != null && !c13348k4.m62017x1()) {
            throw new InvalidOperationException("Stream is already opened and not closed");
        }
        m18621to();
        C13348k4 c13348k42 = new C13348k4(this.f12595k4);
        this.f12596kk = c13348k42;
        return c13348k42;
    }
}
