package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12503ck extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private int f41837k4;

    /* JADX INFO: renamed from: kk */
    private int f41838kk;

    /* JADX INFO: renamed from: x1 */
    private C12505dy f41839x1;

    /* JADX INFO: renamed from: k4 */
    public final int m58078k4() {
        return this.f41837k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m58081kk() {
        return this.f41838kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC12024x1 m58082to() {
        int i = this.f41837k4;
        if (i == 0) {
            return new C11999ar(m58083x1().m58099k4().Clone());
        }
        if (i != 1) {
            return i != 2 ? new C11999ar(C12003du.m56460uz().Clone()) : new C11900jd(m58081kk() & 65535, m58083x1().m58099k4().Clone());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12505dy m58083x1() {
        return this.f41839x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58079k4(int i) {
        this.f41837k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58084x1(int i) {
        this.f41838kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58080k4(C12505dy c12505dy) {
        this.f41839x1 = c12505dy;
    }
}
