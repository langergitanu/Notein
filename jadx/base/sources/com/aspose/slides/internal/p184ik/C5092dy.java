package com.aspose.slides.internal.p184ik;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.C10931x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5092dy extends AbstractC7020m9<C5092dy> {

    /* JADX INFO: renamed from: du */
    private int f13994du;

    /* JADX INFO: renamed from: h4 */
    private long f13995h4;

    /* JADX INFO: renamed from: k4 */
    private C5095jd f13996k4;

    /* JADX INFO: renamed from: kk */
    private int f13997kk;

    /* JADX INFO: renamed from: m9 */
    private String f13998m9;

    /* JADX INFO: renamed from: to */
    private int f13999to;

    /* JADX INFO: renamed from: x1 */
    private int f14000x1;

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: ar, reason: merged with bridge method [inline-methods] */
    public C5092dy Clone() {
        C5092dy c5092dy = new C5092dy();
        CloneTo(c5092dy);
        return c5092dy;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m21773c5() {
        return this.f13996k4.m21820ck() + (this.f13994du & 65535);
    }

    /* JADX INFO: renamed from: ck */
    public final C5093fa m21774ck() {
        return this.f13996k4.m21826k4();
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final String m21775du() {
        return this.f13996k4.m21829kk();
    }

    /* JADX INFO: renamed from: dy */
    public final int m21776dy() {
        return this.f13996k4.m21825jd() + ((int) ((this.f13995h4 & 16776192) >> 10));
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C5092dy) {
            return m21771x1((C5092dy) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m21777fa() {
        String strM21833x1 = this.f13996k4.m21833x1();
        return m21781k4() == 3 && strM21833x1.length() == 3 && "xml".equals(strM21833x1);
    }

    /* JADX INFO: renamed from: h4 */
    public final C10931x1 m21778h4() {
        return this.f13996k4.m21819c5();
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m21779ix() {
        return AbstractC10925du.m52680c5(m21781k4());
    }

    /* JADX INFO: renamed from: jd */
    public final int m21780jd() {
        return m21773c5() + ((int) ((this.f13995h4 & 4294967295L) >> 24));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21781k4() {
        return (int) (this.f13995h4 & 15);
    }

    /* JADX INFO: renamed from: kk */
    public final int m21792kk(C5092dy[][] c5092dyArr) {
        c5092dyArr[0] = this.f13996k4.m21824h4();
        return this.f14000x1 & 65535;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m21794ks() {
        return (this.f13995h4 & 16) != 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m21795m9() {
        return this.f13996k4.m21821du();
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m21796ne() {
        int iM21781k4 = m21781k4();
        return iM21781k4 == 2 || iM21781k4 == 3;
    }

    /* JADX INFO: renamed from: qq */
    public final String m21797qq() {
        return this.f13998m9;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m21798rv() {
        return (this.f13995h4 & 32) != 0;
    }

    /* JADX INFO: renamed from: to */
    public final int m21799to(C5092dy[][] c5092dyArr) {
        c5092dyArr[0] = this.f13996k4.m21830m9();
        return this.f13999to & 65535;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m21801u4() {
        return (this.f13995h4 & 512) != 0;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m21802up() {
        return (this.f14000x1 & 65535) != 0;
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m21803uz() {
        return (this.f13995h4 & 256) != 0;
    }

    /* JADX INFO: renamed from: wl */
    public final int m21804wl() {
        return this.f13996k4.m21823fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m21805x1(C5092dy[][] c5092dyArr) {
        c5092dyArr[0] = this.f13996k4.m21822dy();
        return this.f13997kk & 65535;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m21812x6() {
        return (this.f13995h4 & 64) != 0;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m21813yj() {
        return (this.f13995h4 & 128) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21782k4(C5092dy[][] c5092dyArr) {
        return this.f13996k4.m21819c5().m52715x1(c5092dyArr);
    }

    /* JADX INFO: renamed from: kk */
    public final String m21793kk() {
        return this.f13996k4.m21833x1();
    }

    /* JADX INFO: renamed from: to */
    public final String m21800to() {
        return m21806x1().length() == 0 ? m21793kk() : C14113y2.m67408k4(m21806x1(), C18241k5.f55433h, m21793kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final String m21806x1() {
        return this.f13996k4.m21831to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21783k4(int i) {
        this.f13995h4 = (this.f13995h4 | ((((long) i) & 4294967295L) << 24)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21807x1(int i) {
        long j;
        long j2 = this.f13995h4;
        if (i == 2) {
            j = 16;
        } else {
            j2 = (j2 | 32) & 4294967295L;
            this.f13995h4 = j2;
            if (i != 1) {
                return;
            } else {
                j = 64;
            }
        }
        this.f13995h4 = (j2 | j) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21784k4(int i, int i2) {
        this.f13995h4 = (this.f13995h4 | ((((long) i) & 4294967295L) << 10)) & 4294967295L;
        this.f13994du = 65535 & i2;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21808x1(C5090ck c5090ck, C5092dy[] c5092dyArr, int i) {
        this.f13999to = i & 65535;
        if (c5092dyArr != this.f13996k4.m21830m9()) {
            this.f13996k4 = c5090ck.m21768k4(this.f13996k4.m21833x1(), this.f13996k4.m21829kk(), this.f13996k4.m21831to(), this.f13996k4.m21821du(), this.f13996k4.m21822dy(), this.f13996k4.m21824h4(), c5092dyArr, this.f13996k4.m21819c5(), this.f13996k4.m21825jd(), this.f13996k4.m21820ck());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21785k4(C5090ck c5090ck, C5092dy[] c5092dyArr, int i) {
        this.f14000x1 = i & 65535;
        if (c5092dyArr != this.f13996k4.m21824h4()) {
            this.f13996k4 = c5090ck.m21768k4(this.f13996k4.m21833x1(), this.f13996k4.m21829kk(), this.f13996k4.m21831to(), this.f13996k4.m21821du(), this.f13996k4.m21822dy(), c5092dyArr, this.f13996k4.m21830m9(), this.f13996k4.m21819c5(), this.f13996k4.m21825jd(), this.f13996k4.m21820ck());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21809x1(String str) {
        this.f13998m9 = str;
        this.f13995h4 = (this.f13995h4 | 160) & 4294967295L;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C5092dy c5092dy) {
        if (c5092dy == null) {
            c5092dy = new C5092dy();
        }
        c5092dy.f13996k4 = this.f13996k4;
        c5092dy.f14000x1 = this.f14000x1;
        c5092dy.f13997kk = this.f13997kk;
        c5092dy.f13999to = this.f13999to;
        c5092dy.f13994du = this.f13994du;
        c5092dy.f13995h4 = this.f13995h4;
        c5092dy.f13998m9 = this.f13998m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21810x1(boolean z) {
        this.f13998m9 = C14113y2.f47374k4;
        if (z) {
            this.f13995h4 = (this.f13995h4 | 256) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m21771x1(C5092dy c5092dy) {
        return C14067j2.m66728k4(c5092dy.f13996k4, this.f13996k4) && c5092dy.f14000x1 == this.f14000x1 && c5092dy.f13997kk == this.f13997kk && c5092dy.f13999to == this.f13999to && c5092dy.f13994du == this.f13994du && c5092dy.f13995h4 == this.f13995h4 && C14067j2.m66728k4(c5092dy.f13998m9, this.f13998m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21787k4(C5093fa c5093fa) {
        this.f13996k4 = new C5095jd(c5093fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21788k4(C5095jd c5095jd, int i, int i2) {
        this.f13996k4 = c5095jd;
        this.f13995h4 = ((long) i) & 4294967295L;
        this.f13997kk = 65535 & i2;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m21811x1(String str, String str2) {
        return m21781k4() == 1 && this.f13996k4.m21833x1() == str && C14113y2.m67363du(this.f13996k4.m21829kk(), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21789k4(String str) {
        this.f13998m9 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21790k4(boolean z) {
        long j;
        long j2 = this.f13995h4;
        if (z) {
            j2 |= 512;
            j = 4294967295L;
        } else {
            j = 255;
        }
        this.f13995h4 = j2 & j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21791k4(String str, String str2) {
        return this.f13996k4.m21833x1() == str && C14113y2.m67363du(this.f13996k4.m21829kk(), str2);
    }
}
