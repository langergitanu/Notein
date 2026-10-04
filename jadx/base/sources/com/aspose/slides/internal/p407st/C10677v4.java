package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10677v4 extends AbstractC10376bv implements InterfaceC10673uw {

    /* JADX INFO: renamed from: k4 */
    private C10530lv f37438k4;

    /* JADX INFO: renamed from: x1 */
    private long f37439x1;

    public C10677v4() {
        m51409um().m51917k4(12052);
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: dy */
    public final long mo51092dy() {
        return this.f37439x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f37438k4.m51227x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final C10530lv m51839x1() {
        return this.f37438k4;
    }

    public C10677v4(String str) {
        m51409um().m51917k4(12052);
        m51409um().m51920k4((short) 0);
        m51409um().m51916k4((byte) 15);
        this.f37438k4 = new C10530lv(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10677v4 m51838k4(AbstractC3150x6 abstractC3150x6) {
        return (C10677v4) C10576og.m51431k4(new C3134k4(abstractC3150x6), null);
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: k4 */
    public final void mo51093k4(long j) {
        this.f37439x1 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37438k4 = C10530lv.m51222k4(c3134k4.m13371ck());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        this.f37438k4.m51225k4(c3149x1);
    }
}
