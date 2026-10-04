package com.aspose.slides.internal.p066cl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import java.io.IOException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cl.dy */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2621dy {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC3150x6 f8432k4;

    /* JADX INFO: renamed from: k4 */
    public abstract int mo8278k4(boolean z) throws IOException;

    /* JADX INFO: renamed from: k4 */
    public abstract InterfaceC2624k4 mo8279k4(int i) throws IOException;

    /* JADX INFO: renamed from: k4 */
    public void m11964k4() {
        this.f8432k4 = null;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract InterfaceC2626m9 mo8280x1(int i);

    /* JADX INFO: renamed from: x1 */
    public C3152yj m11966x1(AbstractC3150x6 abstractC3150x6) {
        C3152yj c3152yj = new C3152yj((int) abstractC3150x6.getLength());
        m11965k4(abstractC3150x6, c3152yj);
        c3152yj.seek(0L, 0);
        return c3152yj;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8285k4(AbstractC3150x6 abstractC3150x6) {
        this.f8432k4 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    public void m11965k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 1024);
            if (i <= 0) {
                return;
            } else {
                abstractC3150x62.write(bArr, 0, i);
            }
        }
    }
}
