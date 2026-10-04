package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11911x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.ck */
/* JADX INFO: loaded from: classes4.dex */
public final class C6886ck extends AbstractC6897x1 {

    /* JADX INFO: renamed from: du */
    private C11896dy f18830du;

    /* JADX INFO: renamed from: to */
    private C11906rv f18833to;

    /* JADX INFO: renamed from: k4 */
    public boolean f18831k4 = false;

    /* JADX INFO: renamed from: x1 */
    public boolean f18834x1 = false;

    /* JADX INFO: renamed from: kk */
    public boolean f18832kk = false;

    private C6886ck() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C11913yj m26954c5() {
        return this.f18833to.m55685fa();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C6886ck c6886ck = new C6886ck();
        c6886ck.f18833to = (C11906rv) this.f18833to.deepClone();
        c6886ck.f18830du = (C11896dy) this.f18830du.deepClone();
        return c6886ck;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f18833to.dispose();
        this.f18830du.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final C12025x6 m26955du() {
        return this.f18833to.m55684dy();
    }

    /* JADX INFO: renamed from: dy */
    public final C12003du[] m26956dy() {
        return this.f18833to.m55682ck();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C6886ck.class) && m26953k4((C6886ck) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12025x6 m26957h4() {
        return this.f18833to.m55681c5();
    }

    public int hashCode() {
        C11906rv c11906rv = this.f18833to;
        int iHashCode = (c11906rv != null ? c11906rv.hashCode() : 0) * 397;
        C11896dy c11896dy = this.f18830du;
        return ((((((iHashCode ^ (c11896dy != null ? c11896dy.hashCode() : 0)) * 397) ^ C14051ck.m66552k4(this.f18831k4)) * 397) ^ C14051ck.m66552k4(this.f18834x1)) * 397) ^ C14051ck.m66552k4(this.f18832kk);
    }

    /* JADX INFO: renamed from: jd */
    public final int m26958jd() {
        return this.f18833to.m55700up();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC12024x1 mo26959k4() {
        return this.f18833to;
    }

    /* JADX INFO: renamed from: kk */
    public final C11911x1 m26962kk() {
        return this.f18833to.m55686h4();
    }

    /* JADX INFO: renamed from: m9 */
    public final C11902kk m26963m9() {
        return this.f18833to.m55687jd();
    }

    /* JADX INFO: renamed from: to */
    public final C12003du m26964to() {
        return this.f18833to.m55698m9();
    }

    /* JADX INFO: renamed from: x1 */
    public final C11896dy m26965x1() {
        return this.f18830du;
    }

    public C6886ck(C11896dy c11896dy) {
        this.f18833to = new C11906rv(c11896dy);
        this.f18830du = (C11896dy) c11896dy.deepClone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26960k4(C11902kk c11902kk) {
        this.f18833to.m55690k4(c11902kk);
        this.f18831k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26961k4(C12025x6 c12025x6) {
        this.f18833to.m55693k4(c12025x6.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m26953k4(C6886ck c6886ck) {
        return C14067j2.m66728k4(this.f18833to, c6886ck.f18833to) && C14067j2.m66728k4(this.f18830du, c6886ck.f18830du) && C14051ck.m66558x1(this.f18831k4, c6886ck.f18831k4) && C14051ck.m66558x1(this.f18834x1, c6886ck.f18834x1) && C14051ck.m66558x1(this.f18832kk, c6886ck.f18832kk);
    }
}
