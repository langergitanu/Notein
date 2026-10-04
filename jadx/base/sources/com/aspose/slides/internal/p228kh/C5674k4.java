package com.aspose.slides.internal.p228kh;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p226kf.InterfaceC5670kk;
import com.aspose.slides.internal.p226kf.InterfaceC5671to;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.kh.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5674k4 {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC5671to f15673k4;

    /* JADX INFO: renamed from: kk */
    private final int f15674kk;

    /* JADX INFO: renamed from: to */
    private final int f15675to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5670kk f15676x1;

    public C5674k4(InterfaceC5671to interfaceC5671to, int i, int i2) {
        this.f15673k4 = interfaceC5671to;
        this.f15674kk = i;
        this.f15675to = i2;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5670kk m23134x1() {
        if (this.f15676x1 == null) {
            this.f15676x1 = this.f15673k4.mo23090k4(this.f15674kk, this.f15675to);
        }
        return this.f15676x1;
    }

    /* JADX INFO: renamed from: k4 */
    public float m23135k4() {
        return m23134x1().mo23078k4();
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 m23136k4(C11913yj c11913yj) {
        return m23134x1().mo23079k4(c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public void m23137k4(InterfaceC14122k4 interfaceC14122k4, float f, float f2) {
        m23134x1().mo23080k4(interfaceC14122k4, f, f2);
    }
}
