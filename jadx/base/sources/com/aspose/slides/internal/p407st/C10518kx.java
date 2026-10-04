package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.kx */
/* JADX INFO: loaded from: classes4.dex */
public class C10518kx extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f37164k4 = false;

    /* JADX INFO: renamed from: x1 */
    private boolean f37165x1 = false;

    public C10518kx() {
        m51409um().m51917k4(1022);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 3;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51146x1() {
        this.f37164k4 = true;
        this.f37165x1 = false;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        c3134k4.m13387yj();
        this.f37164k4 = (c3134k4.m13387yj() & 255) != 0;
        this.f37165x1 = (c3134k4.m13387yj() & 255) != 0;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4(this.f37164k4 ? (byte) 1 : (byte) 0);
        c3149x1.m13443k4(this.f37165x1 ? (byte) 1 : (byte) 0);
    }
}
