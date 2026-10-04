package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12332ck extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private int f41213k4;

    /* JADX INFO: renamed from: kk */
    private int f41214kk;

    /* JADX INFO: renamed from: x1 */
    private C12334dy f41215x1;

    /* JADX INFO: renamed from: k4 */
    public final int m57641k4() {
        return this.f41213k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57644kk() {
        return this.f41214kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC12024x1 m57645to() {
        int i = this.f41213k4;
        if (i == 0) {
            return new C11999ar(m57646x1().m57666h4().Clone());
        }
        if (i != 1) {
            return i != 2 ? new C11999ar(C12003du.m56460uz().Clone()) : new C11900jd(m57644kk() & 65535, m57646x1().m57666h4().Clone());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12334dy m57646x1() {
        return this.f41215x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57642k4(int i) {
        this.f41213k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57647x1(int i) {
        this.f41214kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57643k4(C12334dy c12334dy) {
        this.f41215x1 = c12334dy;
    }
}
