package com.aspose.slides.internal.p475wh;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p156gw.AbstractC4415wy;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12007ix extends AbstractC7020m9<C12007ix> {

    /* JADX INFO: renamed from: k4 */
    public static C12007ix f40519k4 = new C12007ix();

    /* JADX INFO: renamed from: x1 */
    static final /* synthetic */ boolean f40520x1 = true;

    /* JADX INFO: renamed from: du */
    private float f40521du;

    /* JADX INFO: renamed from: h4 */
    private float f40522h4;

    /* JADX INFO: renamed from: kk */
    private float f40523kk;

    /* JADX INFO: renamed from: to */
    private float f40524to;

    public C12007ix() {
    }

    /* JADX INFO: renamed from: c5 */
    public float m56550c5() {
        return this.f40521du;
    }

    /* JADX INFO: renamed from: ck */
    public float m56551ck() {
        return this.f40524to;
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public C12025x6 m56552du() {
        return new C12025x6(m56557jd(), m56551ck());
    }

    /* JADX INFO: renamed from: dy */
    public float m56554dy() {
        return m56551ck();
    }

    public boolean equals(Object obj) {
        if (!f40520x1 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12007ix) {
            return m56547m9((C12007ix) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: fa, reason: merged with bridge method [inline-methods] */
    public C12007ix Clone() {
        C12007ix c12007ix = new C12007ix();
        CloneTo(c12007ix);
        return c12007ix;
    }

    /* JADX INFO: renamed from: h4 */
    public float m56556h4() {
        return m56550c5() + m56557jd();
    }

    public int hashCode() {
        return (int) (m56575x1() + m56550c5() + m56551ck() + m56557jd());
    }

    /* JADX INFO: renamed from: jd */
    public float m56557jd() {
        return this.f40523kk;
    }

    /* JADX INFO: renamed from: k4 */
    public float m56558k4() {
        return m56575x1() + m56551ck();
    }

    /* JADX INFO: renamed from: kk */
    public void m56566kk(float f) {
        this.f40523kk = f;
    }

    /* JADX INFO: renamed from: m9 */
    public C12015qq m56570m9() {
        return new C12015qq(m56550c5(), m56575x1());
    }

    /* JADX INFO: renamed from: to */
    public float m56571to() {
        return m56557jd();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{X=");
        sb.append(m56539du(m56557jd()));
        sb.append(",Y=");
        sb.append(m56539du(m56551ck()));
        sb.append(",Width=");
        sb.append(m56539du(m56550c5()));
        sb.append(",Height=");
        return OooO00o.OooO0OO(sb, m56539du(m56575x1()), "}");
    }

    /* JADX INFO: renamed from: up */
    public AbstractC4415wy m56574up() {
        return new AbstractC4415wy.x1(this.f40523kk, this.f40524to, this.f40521du, this.f40522h4);
    }

    /* JADX INFO: renamed from: x1 */
    public float m56575x1() {
        return this.f40522h4;
    }

    public C12007ix(float f, float f2, float f3, float f4) {
        this.f40523kk = f;
        this.f40524to = f2;
        this.f40521du = f3;
        this.f40522h4 = f4;
    }

    /* JADX INFO: renamed from: du */
    private static String m56539du(float f) {
        return C14064he.m66704h4(f);
    }

    /* JADX INFO: renamed from: h4 */
    public static <T> T m56540h4(C12007ix c12007ix) {
        if (c12007ix == null) {
            return null;
        }
        return (T) AbstractC14124to.m67616kk().mo67637k4(c12007ix);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m56541k4(float f, float f2, float f3, float f4) {
        return new C12007ix(f, f2, f3 - f, f4 - f2);
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m56547m9(C12007ix c12007ix) {
        return c12007ix.m56557jd() == m56557jd() && c12007ix.m56551ck() == m56551ck() && c12007ix.m56550c5() == m56550c5() && c12007ix.m56575x1() == m56575x1();
    }

    /* JADX INFO: renamed from: x1 */
    public static C12007ix m56549x1(C12007ix c12007ix, C12007ix c12007ix2) {
        return m56541k4(Math.min(c12007ix.m56571to(), c12007ix2.m56571to()), Math.min(c12007ix.m56554dy(), c12007ix2.m56554dy()), Math.max(c12007ix.m56556h4(), c12007ix2.m56556h4()), Math.max(c12007ix.m56558k4(), c12007ix2.m56558k4()));
    }

    /* JADX INFO: renamed from: kk */
    public void m56567kk(float f, float f2) {
        m56566kk(m56557jd() + f);
        m56572to(m56551ck() + f2);
    }

    /* JADX INFO: renamed from: to */
    public void m56572to(float f) {
        this.f40524to = f;
    }

    public C12007ix(C12025x6 c12025x6, C12015qq c12015qq) {
        this(c12025x6.m56897x1(), c12025x6.m56895kk(), c12015qq.m56699x1(), c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m56542k4(C12007ix c12007ix, float f, float f2) {
        C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
        c12007ix2.m56561k4(f, f2);
        return c12007ix2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12007ix c12007ix) {
        c12007ix.m56566kk(m56557jd());
        c12007ix.m56572to(m56551ck());
        c12007ix.m56576x1(m56550c5());
        c12007ix.m56560k4(m56575x1());
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56568kk() {
        return m56550c5() <= 0.0f || m56575x1() <= 0.0f;
    }

    /* JADX INFO: renamed from: to */
    public boolean m56573to(C12007ix c12007ix) {
        return m56571to() <= c12007ix.m56556h4() && m56556h4() >= c12007ix.m56571to() && m56554dy() <= c12007ix.m56558k4() && m56558k4() >= c12007ix.m56554dy();
    }

    /* JADX INFO: renamed from: x1 */
    public void m56576x1(float f) {
        this.f40521du = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m56543k4(C12007ix c12007ix, C12007ix c12007ix2) {
        return !c12007ix.m56573to(c12007ix2.Clone()) ? f40519k4 : m56541k4(Math.max(c12007ix.m56571to(), c12007ix2.m56571to()), Math.max(c12007ix.m56554dy(), c12007ix2.m56554dy()), Math.min(c12007ix.m56556h4(), c12007ix2.m56556h4()), Math.min(c12007ix.m56558k4(), c12007ix2.m56558k4()));
    }

    /* JADX INFO: renamed from: to */
    public static boolean m56548to(C12007ix c12007ix, C12007ix c12007ix2) {
        return (c12007ix.m56557jd() == c12007ix2.m56557jd() && c12007ix.m56551ck() == c12007ix2.m56551ck() && c12007ix.m56550c5() == c12007ix2.m56550c5() && c12007ix.m56575x1() == c12007ix2.m56575x1()) ? false : true;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56569kk(C12007ix c12007ix) {
        return m56571to() < c12007ix.m56556h4() && m56556h4() > c12007ix.m56571to() && m56554dy() < c12007ix.m56558k4() && m56558k4() > c12007ix.m56554dy();
    }

    /* JADX INFO: renamed from: x1 */
    public void m56577x1(float f, float f2, float f3, float f4) {
        this.f40523kk = f;
        this.f40524to = f2;
        this.f40521du = f3;
        this.f40522h4 = f4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m56544k4(C12014ne c12014ne) {
        return new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m56546kk(C12007ix c12007ix, C12007ix c12007ix2) {
        return c12007ix.m56557jd() == c12007ix2.m56557jd() && c12007ix.m56551ck() == c12007ix2.m56551ck() && c12007ix.m56550c5() == c12007ix2.m56550c5() && c12007ix.m56575x1() == c12007ix2.m56575x1();
    }

    /* JADX INFO: renamed from: x1 */
    public void m56578x1(C12015qq c12015qq) {
        m56576x1(c12015qq.m56699x1());
        m56560k4(c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C12007ix m56545k4(T t) {
        return t == null ? new C12007ix() : AbstractC14124to.m67616kk().mo67636k4(t);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m56579x1(double d, double d2, double d3, double d4) {
        return ((double) m56557jd()) <= d && d + d3 <= ((double) m56556h4()) && ((double) m56551ck()) <= d2 && d2 + d4 <= ((double) m56558k4());
    }

    /* JADX INFO: renamed from: k4 */
    public void m56559k4(double d, double d2) {
        double dMin = Math.min(m56571to(), d);
        double dMax = Math.max(m56556h4(), d);
        double dMin2 = Math.min(m56554dy(), d2);
        double dMax2 = Math.max(m56558k4(), d2);
        this.f40523kk = (float) dMin;
        this.f40524to = (float) dMin2;
        this.f40521du = (float) (dMax - dMin);
        this.f40522h4 = (float) (dMax2 - dMin2);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m56580x1(float f, float f2) {
        return f >= m56571to() && f < m56556h4() && f2 >= m56554dy() && f2 < m56558k4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56560k4(float f) {
        this.f40522h4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m56581x1(C12007ix c12007ix) {
        return m56557jd() <= c12007ix.m56557jd() && c12007ix.m56556h4() <= m56556h4() && m56551ck() <= c12007ix.m56551ck() && c12007ix.m56558k4() <= m56558k4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56561k4(float f, float f2) {
        m56563k4(new C12015qq(f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public void m56562k4(C12007ix c12007ix) {
        m56543k4(Clone(), c12007ix.Clone()).CloneTo(this);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56563k4(C12015qq c12015qq) {
        this.f40523kk -= c12015qq.m56699x1();
        this.f40524to -= c12015qq.m56697kk();
        this.f40521du = (c12015qq.m56699x1() * 2.0f) + this.f40521du;
        this.f40522h4 = (c12015qq.m56697kk() * 2.0f) + this.f40522h4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56564k4(C12025x6 c12025x6) {
        m56566kk(c12025x6.m56897x1());
        m56572to(c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56565k4(double d, double d2, double d3, double d4) {
        if (!m56568kk() && d3 > 0.0d && d4 > 0.0d) {
            double dM56557jd = m56557jd();
            double dM56551ck = m56551ck();
            if (d3 + d > dM56557jd && d4 + d2 > dM56551ck && d < dM56557jd + ((double) m56550c5()) && d2 < dM56551ck + ((double) m56575x1())) {
                return true;
            }
        }
        return false;
    }
}
