package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C12014ne extends AbstractC7020m9<C12014ne> {

    /* JADX INFO: renamed from: k4 */
    public static C12014ne f40546k4 = new C12014ne();

    /* JADX INFO: renamed from: x1 */
    static final /* synthetic */ boolean f40547x1 = true;

    /* JADX INFO: renamed from: du */
    private int f40548du;

    /* JADX INFO: renamed from: h4 */
    private int f40549h4;

    /* JADX INFO: renamed from: kk */
    private int f40550kk;

    /* JADX INFO: renamed from: to */
    private int f40551to;

    public C12014ne() {
    }

    /* JADX INFO: renamed from: kk */
    public static C12014ne m56657kk(C12007ix c12007ix) {
        return new C12014ne((int) c12007ix.m56557jd(), (int) c12007ix.m56551ck(), (int) c12007ix.m56550c5(), (int) c12007ix.m56575x1());
    }

    /* JADX INFO: renamed from: c5 */
    public int m56663c5() {
        return this.f40548du;
    }

    /* JADX INFO: renamed from: ck */
    public int m56664ck() {
        return this.f40551to;
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public C12016rv m56665du() {
        return new C12016rv(m56669jd(), m56664ck());
    }

    /* JADX INFO: renamed from: dy */
    public int m56666dy() {
        return m56664ck();
    }

    public boolean equals(Object obj) {
        if (!f40547x1 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12014ne) {
            return m56653du((C12014ne) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: fa, reason: merged with bridge method [inline-methods] */
    public C12014ne Clone() {
        C12014ne c12014ne = new C12014ne();
        CloneTo(c12014ne);
        return c12014ne;
    }

    /* JADX INFO: renamed from: h4 */
    public int m56668h4() {
        return m56663c5() + m56669jd();
    }

    public int hashCode() {
        return (m56663c5() + m56683x1()) ^ (m56664ck() + m56669jd());
    }

    /* JADX INFO: renamed from: jd */
    public int m56669jd() {
        return this.f40550kk;
    }

    /* JADX INFO: renamed from: k4 */
    public int m56670k4() {
        return m56683x1() + m56664ck();
    }

    /* JADX INFO: renamed from: m9 */
    public C12023wl m56680m9() {
        return new C12023wl(m56663c5(), m56683x1());
    }

    /* JADX INFO: renamed from: to */
    public int m56681to() {
        return m56669jd();
    }

    public String toString() {
        return C14113y2.m67402k4("{{X={0},Y={1},Width={2},Height={3}}}", Integer.valueOf(m56669jd()), Integer.valueOf(m56664ck()), Integer.valueOf(m56663c5()), Integer.valueOf(m56683x1()));
    }

    /* JADX INFO: renamed from: x1 */
    public int m56683x1() {
        return this.f40549h4;
    }

    public C12014ne(int i, int i2, int i3, int i4) {
        this.f40550kk = i;
        this.f40551to = i2;
        this.f40548du = i3;
        this.f40549h4 = i4;
    }

    /* JADX INFO: renamed from: du */
    private boolean m56653du(C12014ne c12014ne) {
        return c12014ne.m56669jd() == m56669jd() && c12014ne.m56664ck() == m56664ck() && c12014ne.m56663c5() == m56663c5() && c12014ne.m56683x1() == m56683x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m56654k4(int i, int i2, int i3, int i4) {
        return new C12014ne(i, i2, i3 - i, i4 - i2);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12014ne m56661x1(C12007ix c12007ix) {
        return new C12014ne((int) C14116yg.m67497to(c12007ix.m56557jd()), (int) C14116yg.m67497to(c12007ix.m56551ck()), (int) C14116yg.m67497to(c12007ix.m56550c5()), (int) C14116yg.m67497to(c12007ix.m56575x1()));
    }

    /* JADX INFO: renamed from: kk */
    public void m56676kk(int i) {
        this.f40550kk = i;
    }

    /* JADX INFO: renamed from: to */
    public void m56682to(int i) {
        this.f40551to = i;
    }

    public C12014ne(C12016rv c12016rv, C12023wl c12023wl) {
        this(c12016rv.m56708k4(), c12016rv.m56713x1(), c12023wl.m56865x1(), c12023wl.m56862kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m56655k4(C12007ix c12007ix) {
        return new C12014ne((int) Math.ceil(c12007ix.m56557jd()), (int) Math.ceil(c12007ix.m56551ck()), (int) Math.ceil(c12007ix.m56550c5()), (int) Math.ceil(c12007ix.m56575x1()));
    }

    /* JADX INFO: renamed from: to */
    private boolean m56659to(C12014ne c12014ne) {
        return m56681to() <= c12014ne.m56668h4() && m56668h4() >= c12014ne.m56681to() && m56666dy() <= c12014ne.m56670k4() && m56670k4() >= c12014ne.m56666dy();
    }

    /* JADX INFO: renamed from: x1 */
    public static C12014ne m56662x1(C12014ne c12014ne, C12014ne c12014ne2) {
        return m56654k4(Math.min(c12014ne.m56681to(), c12014ne2.m56681to()), Math.min(c12014ne.m56666dy(), c12014ne2.m56666dy()), Math.max(c12014ne.m56668h4(), c12014ne2.m56668h4()), Math.max(c12014ne.m56670k4(), c12014ne2.m56670k4()));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12014ne c12014ne) {
        c12014ne.m56676kk(m56669jd());
        c12014ne.m56682to(m56664ck());
        c12014ne.m56684x1(m56663c5());
        c12014ne.m56671k4(m56683x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m56656k4(C12014ne c12014ne, C12014ne c12014ne2) {
        return !c12014ne.m56659to(c12014ne2.Clone()) ? f40546k4 : m56654k4(Math.max(c12014ne.m56681to(), c12014ne2.m56681to()), Math.max(c12014ne.m56666dy(), c12014ne2.m56666dy()), Math.min(c12014ne.m56668h4(), c12014ne2.m56668h4()), Math.min(c12014ne.m56670k4(), c12014ne2.m56670k4()));
    }

    /* JADX INFO: renamed from: to */
    public static boolean m56660to(C12014ne c12014ne, C12014ne c12014ne2) {
        return (C12016rv.m56704k4(c12014ne.m56665du(), c12014ne2.m56665du()) && C12023wl.m56859x1(c12014ne.m56680m9(), c12014ne2.m56680m9())) ? false : true;
    }

    /* JADX INFO: renamed from: kk */
    public void m56678kk(C12016rv c12016rv) {
        m56685x1(c12016rv.m56708k4(), c12016rv.m56713x1());
    }

    /* JADX INFO: renamed from: x1 */
    public void m56684x1(int i) {
        this.f40548du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56671k4(int i) {
        this.f40549h4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56679kk() {
        return m56669jd() == 0 && m56664ck() == 0 && m56663c5() == 0 && m56683x1() == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56685x1(int i, int i2) {
        this.f40550kk += i;
        this.f40551to += i2;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m56658kk(C12014ne c12014ne, C12014ne c12014ne2) {
        return C12016rv.m56704k4(c12014ne.m56665du(), c12014ne2.m56665du()) && C12023wl.m56859x1(c12014ne.m56680m9(), c12014ne2.m56680m9());
    }

    /* JADX INFO: renamed from: k4 */
    public void m56672k4(C12014ne c12014ne) {
        m56656k4(Clone(), c12014ne.Clone()).CloneTo(this);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m56686x1(C12014ne c12014ne) {
        return m56681to() < c12014ne.m56668h4() && m56668h4() > c12014ne.m56681to() && m56666dy() < c12014ne.m56670k4() && m56670k4() > c12014ne.m56666dy();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56673k4(C12016rv c12016rv) {
        this.f40550kk = c12016rv.m56708k4();
        this.f40551to = c12016rv.m56713x1();
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m56687x1(C12016rv c12016rv) {
        return m56675k4(c12016rv.m56708k4(), c12016rv.m56713x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m56674k4(C12023wl c12023wl) {
        m56684x1(c12023wl.m56865x1());
        m56671k4(c12023wl.m56862kk());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56675k4(int i, int i2) {
        return i >= m56681to() && i < m56668h4() && i2 >= m56666dy() && i2 < m56670k4();
    }
}
