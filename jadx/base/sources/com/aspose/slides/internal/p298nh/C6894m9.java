package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.m9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6894m9 extends AbstractC6897x1 {

    /* JADX INFO: renamed from: k4 */
    private C11900jd f18844k4;

    private C6894m9() {
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C6894m9 c6894m9 = new C6894m9();
        c6894m9.f18844k4 = (C11900jd) this.f18844k4.deepClone();
        return c6894m9;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f18844k4.dispose();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C6894m9.class) && m27018k4((C6894m9) obj);
    }

    public int hashCode() {
        C11900jd c11900jd = this.f18844k4;
        if (c11900jd != null) {
            return c11900jd.hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC12024x1 mo26959k4() {
        return this.f18844k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12003du m27019kk() {
        return this.f18844k4.m55652m9();
    }

    /* JADX INFO: renamed from: to */
    public final int m27020to() {
        return this.f18844k4.m55650dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m27021x1() {
        return this.f18844k4.m55651h4();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m27018k4(C6894m9 c6894m9) {
        return C14067j2.m66728k4(this.f18844k4, c6894m9.f18844k4);
    }
}
