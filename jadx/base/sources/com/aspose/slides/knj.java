package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
final class knj {

    /* JADX INFO: renamed from: k4 */
    private int f45797k4;

    /* JADX INFO: renamed from: kk */
    private C10536m5 f45798kk;

    /* JADX INFO: renamed from: x1 */
    private rpo f45799x1;

    public knj(int i, rpo rpoVar) {
        this.f45799x1 = rpoVar;
        this.f45797k4 = i;
        C10536m5 c10536m5 = new C10536m5();
        this.f45798kk = c10536m5;
        c10536m5.m51272k4(this.f45797k4, false);
        if (this.f45798kk.m51276to().size() > 0) {
            this.f45798kk.m51276to().get_Item(0).m52151x1().m51524k4(new C14093tq<>((byte) 0));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64050k4() {
        for (int i = 4; i > 0; i--) {
            if (this.f45798kk.m51276to().get_Item(i) != null) {
                int i2 = i - 1;
                if (this.f45798kk.m51276to().get_Item(i2) != null) {
                    this.f45798kk.m51276to().get_Item(i).m52152x1(this.f45798kk.m51276to().get_Item(i2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C10536m5 m64051x1() {
        return this.f45798kk;
    }
}
