package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C10694wl extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37469k4;

    /* JADX INFO: renamed from: x1 */
    private C10700wy f37471x1 = new C10700wy();

    /* JADX INFO: renamed from: kk */
    private C12016rv f37470kk = new C12016rv();

    public C10694wl() {
        m51409um().m51917k4(12001);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 28;
    }

    /* JADX INFO: renamed from: kk */
    public final C12016rv m51912kk() {
        return this.f37470kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14084qq m51913x1() {
        return this.f37471x1.m51952k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51909k4(int i) {
        this.f37469k4 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37469k4 = c3134k4.m13386x6();
        this.f37471x1.m51953k4(c3134k4);
        this.f37470kk = new C12016rv(c3134k4.m13386x6(), c3134k4.m13386x6());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(((long) this.f37469k4) & 4294967295L);
        this.f37471x1.m51954k4(c3149x1);
        c3149x1.m13455x1(this.f37470kk.m56708k4());
        c3149x1.m13455x1(this.f37470kk.m56713x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51910k4(C12016rv c12016rv) {
        c12016rv.CloneTo(this.f37470kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51911k4(C14084qq c14084qq) {
        this.f37471x1.m51955k4(c14084qq.Clone());
    }
}
