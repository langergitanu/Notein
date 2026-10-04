package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11911x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.jd */
/* JADX INFO: loaded from: classes4.dex */
public final class C6891jd extends AbstractC6897x1 {

    /* JADX INFO: renamed from: k4 */
    private C11909up f18840k4;

    private C6891jd() {
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C6891jd c6891jd = new C6891jd();
        c6891jd.f18840k4 = (C11909up) this.f18840k4.deepClone();
        return c6891jd;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f18840k4.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final C11902kk m26994du() {
        return this.f18840k4.m55721dy();
    }

    /* JADX INFO: renamed from: dy */
    public final int m26995dy() {
        return this.f18840k4.m55722fa();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C6891jd.class) && m26993k4((C6891jd) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12007ix m26996h4() {
        return this.f18840k4.m55724jd();
    }

    public int hashCode() {
        C11909up c11909up = this.f18840k4;
        if (c11909up != null) {
            return c11909up.hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC12024x1 mo26959k4() {
        return this.f18840k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m27001kk() {
        return this.f18840k4.m55732m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final C11913yj m27002m9() {
        return this.f18840k4.m55719ck();
    }

    /* JADX INFO: renamed from: to */
    public final C12003du[] m27003to() {
        return this.f18840k4.m55718c5();
    }

    /* JADX INFO: renamed from: x1 */
    public final C11911x1 m27004x1() {
        return this.f18840k4.m55723h4();
    }

    public C6891jd(C12007ix c12007ix, C12003du c12003du, C12003du c12003du2, float f) {
        this.f18840k4 = new C11909up(c12007ix.Clone(), c12003du.Clone(), c12003du2.Clone(), f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26997k4(int i) {
        this.f18840k4.m55725k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26998k4(C11902kk c11902kk) {
        this.f18840k4.m55726k4(c11902kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26999k4(C11913yj c11913yj) {
        this.f18840k4.m55730kk(c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27000k4(boolean z) {
        this.f18840k4.m55738x1(z);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26993k4(C6891jd c6891jd) {
        return C14067j2.m66728k4(this.f18840k4, c6891jd.f18840k4);
    }
}
