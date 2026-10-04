package com.aspose.slides.internal.p184ik;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.C10931x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C5095jd {

    /* JADX INFO: renamed from: c5 */
    private int f14008c5;

    /* JADX INFO: renamed from: ck */
    private int f14009ck;

    /* JADX INFO: renamed from: du */
    private C5092dy[] f14010du;

    /* JADX INFO: renamed from: dy */
    private C10931x1 f14011dy;

    /* JADX INFO: renamed from: fa */
    private int f14012fa;

    /* JADX INFO: renamed from: h4 */
    private C5092dy[] f14013h4;

    /* JADX INFO: renamed from: jd */
    private int f14014jd;

    /* JADX INFO: renamed from: k4 */
    private String f14015k4;

    /* JADX INFO: renamed from: kk */
    private String f14016kk;

    /* JADX INFO: renamed from: m9 */
    private C5092dy[] f14017m9;

    /* JADX INFO: renamed from: to */
    private String f14018to;

    /* JADX INFO: renamed from: up */
    private C5095jd f14019up;

    /* JADX INFO: renamed from: x1 */
    private String f14020x1;

    /* JADX INFO: renamed from: yj */
    private C5093fa f14021yj;

    public C5095jd(C5093fa c5093fa) {
        this.f14021yj = c5093fa;
    }

    /* JADX INFO: renamed from: c5 */
    public final C10931x1 m21819c5() {
        return this.f14011dy;
    }

    /* JADX INFO: renamed from: ck */
    public final int m21820ck() {
        return this.f14014jd;
    }

    /* JADX INFO: renamed from: du */
    public final String m21821du() {
        return this.f14018to;
    }

    /* JADX INFO: renamed from: dy */
    public final C5092dy[] m21822dy() {
        return this.f14010du;
    }

    public boolean equals(Object obj) {
        C5095jd c5095jd = (C5095jd) C7019kk.m27452k4(obj, C5095jd.class);
        return hashCode() == c5095jd.hashCode() && this.f14015k4 == c5095jd.f14015k4 && this.f14013h4 == c5095jd.f14013h4 && this.f14020x1 == c5095jd.f14020x1 && this.f14010du == c5095jd.f14010du && this.f14017m9 == c5095jd.f14017m9 && this.f14016kk == c5095jd.f14016kk && this.f14018to == c5095jd.f14018to && this.f14008c5 == c5095jd.f14008c5 && this.f14014jd == c5095jd.f14014jd;
    }

    /* JADX INFO: renamed from: fa */
    public final int m21823fa() {
        return this.f14012fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final C5092dy[] m21824h4() {
        return this.f14013h4;
    }

    public int hashCode() {
        if (this.f14009ck == 0) {
            int iM21814k4 = this.f14012fa;
            C5092dy[] c5092dyArr = this.f14013h4;
            if (c5092dyArr != null) {
                iM21814k4 += c5092dyArr[0].m21774ck().m21814k4() ^ (iM21814k4 << 7);
            }
            C5092dy[] c5092dyArr2 = this.f14010du;
            if (c5092dyArr2 != null) {
                iM21814k4 += c5092dyArr2[0].m21774ck().m21814k4() ^ (iM21814k4 << 7);
            }
            C5092dy[] c5092dyArr3 = this.f14017m9;
            if (c5092dyArr3 != null) {
                iM21814k4 += c5092dyArr3[0].m21774ck().m21814k4() ^ (iM21814k4 << 7);
            }
            if (iM21814k4 == 0) {
                iM21814k4 = 1;
            }
            this.f14009ck = iM21814k4;
        }
        return this.f14009ck;
    }

    /* JADX INFO: renamed from: jd */
    public final int m21825jd() {
        return this.f14008c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5093fa m21826k4() {
        return this.f14021yj;
    }

    /* JADX INFO: renamed from: kk */
    public final String m21829kk() {
        return this.f14020x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C5092dy[] m21830m9() {
        return this.f14017m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m21831to() {
        return this.f14016kk;
    }

    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("hash=");
        c6765kpOooO00o.m26805kk(hashCode());
        c6765kpOooO00o.m26792k4(", ");
        if (this.f14015k4.length() != 0) {
            c6765kpOooO00o.m26780k4('{');
            c6765kpOooO00o.m26792k4(this.f14020x1);
            c6765kpOooO00o.m26780k4('}');
            if (this.f14016kk.length() != 0) {
                c6765kpOooO00o.m26792k4(this.f14016kk);
                c6765kpOooO00o.m26780k4(':');
            }
            c6765kpOooO00o.m26792k4(this.f14015k4);
            c6765kpOooO00o.m26792k4(", ");
        }
        if (this.f14010du != null) {
            c6765kpOooO00o.m26792k4("parent=");
            c6765kpOooO00o.m26805kk(this.f14010du[0].m21774ck().m21814k4());
            c6765kpOooO00o.m26792k4(", ");
        }
        if (this.f14013h4 != null) {
            c6765kpOooO00o.m26792k4("sibling=");
            c6765kpOooO00o.m26805kk(this.f14013h4[0].m21774ck().m21814k4());
            c6765kpOooO00o.m26792k4(", ");
        }
        if (this.f14017m9 != null) {
            c6765kpOooO00o.m26792k4("similar=");
            c6765kpOooO00o.m26805kk(this.f14017m9[0].m21774ck().m21814k4());
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("lineNum=");
        c6765kpOooO00o.m26805kk(this.f14008c5);
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26792k4("linePos=");
        c6765kpOooO00o.m26805kk(this.f14014jd);
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: up */
    public final C5095jd m21832up() {
        return this.f14019up;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m21833x1() {
        return this.f14015k4;
    }

    public C5095jd(String str, String str2, String str3, String str4, C5092dy[] c5092dyArr, C5092dy[] c5092dyArr2, C5092dy[] c5092dyArr3, C10931x1 c10931x1, int i, int i2) {
        m21828k4(str, str2, str3, str4, c5092dyArr, c5092dyArr2, c5092dyArr3, c10931x1, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21827k4(C5095jd c5095jd) {
        this.f14019up = c5095jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21828k4(String str, String str2, String str3, String str4, C5092dy[] c5092dyArr, C5092dy[] c5092dyArr2, C5092dy[] c5092dyArr3, C10931x1 c10931x1, int i, int i2) {
        this.f14015k4 = str;
        this.f14020x1 = str2;
        this.f14016kk = str3;
        this.f14018to = str4;
        this.f14010du = c5092dyArr;
        this.f14013h4 = c5092dyArr2;
        this.f14017m9 = c5092dyArr3;
        this.f14011dy = c10931x1;
        this.f14008c5 = i;
        this.f14014jd = i2;
        this.f14019up = null;
        this.f14021yj = null;
        this.f14009ck = 0;
        this.f14012fa = 0;
        for (int i3 = 0; i3 < this.f14015k4.length(); i3++) {
            int i4 = this.f14012fa;
            this.f14012fa = i4 + ((i4 << 7) ^ this.f14015k4.charAt(i3));
        }
    }
}
