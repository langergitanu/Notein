package com.aspose.slides.internal.p472w8;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C11902kk {

    /* JADX INFO: renamed from: k4 */
    private float[] f40085k4;

    /* JADX INFO: renamed from: x1 */
    private C12003du[] f40086x1;

    public C11902kk() {
        this.f40085k4 = new float[1];
        this.f40086x1 = new C12003du[]{new C12003du()};
    }

    /* JADX INFO: renamed from: k4 */
    public void m55666k4(float[] fArr) {
        this.f40085k4 = fArr;
    }

    /* JADX INFO: renamed from: x1 */
    public float[] m55669x1() {
        return this.f40085k4;
    }

    public C11902kk(int i) {
        if (i < 0) {
            throw new OverflowException("Arithmetic operation resulted in an overflow");
        }
        this.f40085k4 = new float[i];
        this.f40086x1 = (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55667k4(C12003du[] c12003duArr) {
        this.f40086x1 = c12003duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du[] m55668k4() {
        return this.f40086x1;
    }
}
