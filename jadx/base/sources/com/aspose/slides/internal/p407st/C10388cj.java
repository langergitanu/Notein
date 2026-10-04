package com.aspose.slides.internal.p407st;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.cj */
/* JADX INFO: loaded from: classes4.dex */
public class C10388cj extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f36900k4;

    /* JADX INFO: renamed from: x1 */
    private int f36901x1;

    public C10388cj() {
        m51409um().m51917k4(PointerIconCompat.TYPE_ZOOM_OUT);
        m51409um().m51920k4((short) 7);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50553k4(int i) {
        int i2;
        if (i == 0) {
            this.f36900k4 = 0L;
            i2 = 2160;
        } else {
            if (i != 1) {
                return;
            }
            this.f36900k4 = 1L;
            i2 = 2880;
        }
        this.f36901x1 = i2;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36900k4 = c3134k4.m13384uz();
        this.f36901x1 = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36900k4);
        c3149x1.m13455x1(this.f36901x1);
    }
}
