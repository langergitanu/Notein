package com.aspose.slides.internal.p133fk;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fk.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4076kk implements InterfaceC4077to {

    /* JADX INFO: renamed from: k4 */
    protected C12007ix f11137k4;

    /* JADX INFO: renamed from: kk */
    protected float f11138kk;

    /* JADX INFO: renamed from: x1 */
    protected float f11139x1;

    public C4076kk(C12007ix c12007ix) {
        C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
        this.f11137k4 = c12007ix2;
        this.f11139x1 = (this.f11137k4.m56550c5() + c12007ix2.m56557jd()) - 1.0f;
        this.f11138kk = (this.f11137k4.m56575x1() + this.f11137k4.m56551ck()) - 1.0f;
    }

    /* JADX INFO: renamed from: du */
    public int m16232du(C12025x6 c12025x6) {
        return c12025x6.m56895kk() < this.f11137k4.m56551ck() ? (int) Math.ceil((this.f11137k4.m56551ck() - c12025x6.m56895kk()) / this.f11137k4.m56575x1()) : (int) ((c12025x6.m56895kk() - this.f11137k4.m56551ck()) / this.f11137k4.m56575x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m16233k4(C12025x6 c12025x6) {
        m16238x1(c12025x6);
        m16234kk(c12025x6);
    }

    /* JADX INFO: renamed from: kk */
    public void m16234kk(C12025x6 c12025x6) {
        if (c12025x6.m56895kk() < this.f11137k4.m56551ck()) {
            c12025x6.m56898x1(this.f11137k4.m56551ck());
        }
        float fM56895kk = c12025x6.m56895kk();
        float f = this.f11138kk;
        if (fM56895kk > f) {
            c12025x6.m56898x1(f);
        }
    }

    /* JADX INFO: renamed from: to */
    public int m16236to(C12025x6 c12025x6) {
        return c12025x6.m56897x1() < this.f11137k4.m56557jd() ? (int) Math.ceil((this.f11137k4.m56557jd() - c12025x6.m56897x1()) / this.f11137k4.m56550c5()) : (int) ((c12025x6.m56897x1() - this.f11137k4.m56557jd()) / this.f11137k4.m56550c5());
    }

    /* JADX INFO: renamed from: x1 */
    public void m16238x1(C12025x6 c12025x6) {
        if (c12025x6.m56897x1() < this.f11137k4.m56557jd()) {
            c12025x6.m56891k4(this.f11137k4.m56557jd());
        }
        float fM56897x1 = c12025x6.m56897x1();
        float f = this.f11139x1;
        if (fM56897x1 > f) {
            c12025x6.m56891k4(f);
        }
    }

    @Override // com.aspose.slides.internal.p133fk.InterfaceC4077to
    /* JADX INFO: renamed from: k4 */
    public void mo16231k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        if (this.f11137k4.m56580x1(c12025x6.m56897x1(), c12025x6.m56895kk())) {
            c12025x62.m56891k4(c12025x6.m56897x1());
            c12025x62.m56898x1(c12025x6.m56895kk());
        } else {
            mo16239x1(c12025x6, c12025x62);
        }
        m16233k4(c12025x62);
    }

    /* JADX INFO: renamed from: kk */
    public void m16235kk(C12025x6 c12025x6, C12025x6 c12025x62) {
        if (c12025x6.m56897x1() < this.f11137k4.m56557jd()) {
            c12025x62.m56891k4((this.f11137k4.m56550c5() * m16236to(c12025x6)) + c12025x6.m56897x1());
            return;
        }
        float fM56897x1 = (c12025x6.m56897x1() - this.f11137k4.m56557jd()) % this.f11137k4.m56550c5();
        if (Math.abs(fM56897x1 - this.f11137k4.m56550c5()) < 1.0E-5d) {
            fM56897x1 = 0.0f;
        }
        c12025x62.m56891k4(this.f11137k4.m56557jd() + fM56897x1);
    }

    /* JADX INFO: renamed from: to */
    public void m16237to(C12025x6 c12025x6, C12025x6 c12025x62) {
        if (c12025x6.m56895kk() < this.f11137k4.m56551ck()) {
            c12025x62.m56898x1((this.f11137k4.m56575x1() * m16232du(c12025x6)) + c12025x6.m56895kk());
            return;
        }
        float fM56895kk = (c12025x6.m56895kk() - this.f11137k4.m56551ck()) % this.f11137k4.m56575x1();
        if (Math.abs(fM56895kk - this.f11137k4.m56575x1()) < 1.0E-5d) {
            fM56895kk = 0.0f;
        }
        c12025x62.m56898x1(this.f11137k4.m56551ck() + fM56895kk);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo16239x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        m16235kk(c12025x6, c12025x62);
        m16237to(c12025x6, c12025x62);
    }
}
