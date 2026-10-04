package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.rs */
/* JADX INFO: loaded from: classes4.dex */
public class C10624rs extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private short f37357k4;

    /* JADX INFO: renamed from: x1 */
    private int f37358x1;

    public C10624rs() {
        m51409um().m51917k4(4058);
        this.f37358x1 = 2;
    }

    /* JADX INFO: renamed from: du */
    public final void m51645du(boolean z) {
        this.f37358x1 = z ? (this.f37358x1 & (-3)) | 4 : (this.f37358x1 & (-5)) | 2;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m51647h4() {
        return (this.f37358x1 & 32) != 0;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51650kk(boolean z) {
        this.f37358x1 = z ? this.f37358x1 | 16 : this.f37358x1 & (-17);
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m51652m9() {
        return (this.f37358x1 & 4) != 0;
    }

    /* JADX INFO: renamed from: to */
    public final void m51653to(boolean z) {
        this.f37358x1 = z ? this.f37358x1 | 32 : this.f37358x1 & (-33);
    }

    /* JADX INFO: renamed from: x1 */
    public final short m51655x1() {
        return this.f37357k4;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m51646du() {
        return (this.f37358x1 & 16) != 0;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37357k4 = c3134k4.m13381rv();
        this.f37358x1 = c3134k4.m13382u4() & 65535;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51651kk() {
        return (this.f37358x1 & 1) != 0;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m51654to() {
        return (this.f37358x1 & 8) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51656x1(boolean z) {
        this.f37358x1 = z ? this.f37358x1 | 8 : this.f37358x1 & (-9);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13448k4(this.f37357k4);
        c3149x1.m13448k4((short) this.f37358x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51648k4(short s) {
        this.f37357k4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51649k4(boolean z) {
        this.f37358x1 = z ? this.f37358x1 | 1 : this.f37358x1 & (-2);
    }
}
