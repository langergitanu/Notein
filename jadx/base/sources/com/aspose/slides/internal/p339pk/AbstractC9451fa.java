package com.aspose.slides.internal.p339pk;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p460vf.C11639kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.fa */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9451fa {

    /* JADX INFO: renamed from: du */
    private C9455kk f34361du;

    /* JADX INFO: renamed from: h4 */
    private Stack<C9455kk> f34363h4;

    /* JADX INFO: renamed from: k4 */
    protected AbstractC9448ck f34364k4;

    /* JADX INFO: renamed from: kk */
    private C11639kk f34365kk;

    /* JADX INFO: renamed from: m9 */
    private C9459to f34366m9;

    /* JADX INFO: renamed from: to */
    private C1937to f34367to;

    /* JADX INFO: renamed from: x1 */
    protected boolean f34368x1;

    /* JADX INFO: renamed from: dy */
    private C12007ix f34362dy = C12007ix.f40519k4.Clone();

    /* JADX INFO: renamed from: c5 */
    private C12025x6 f34360c5 = C12025x6.f40591k4.Clone();

    /* JADX INFO: renamed from: ck */
    private void m46271ck() {
        for (long j = 0; (4294967295L & j) < this.f34367to.m9998x6(); j++) {
            this.f34366m9.m46400k4((InterfaceC9461x1) null);
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m46272fa() {
        this.f34366m9.m46400k4(new C9452h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC9451fa m46273k4(int i) {
        if (i == 1 || i == 2) {
            return new C9463yj();
        }
        if (i == 3 || i == 4 || i == 5) {
            return new C9460up();
        }
        throw new InvalidOperationException("Unknown metafile type.");
    }

    /* JADX INFO: renamed from: m9 */
    public static int m46276m9(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Unknown GDI fill mode[{0}].", C14042ak.m66410k4(C9454k4.class, i)));
    }

    /* JADX INFO: renamed from: up */
    private void m46279up() {
        C5656k4 c5656k4 = C5656k4.f15627z7;
        m46275kk(c5656k4);
        C5656k4 c5656k42 = C5656k4.f15518dy;
        m46275kk(c5656k42);
        m46275kk(C5656k4.f15601vj);
        m46275kk(new C5656k4(64, 64, 64));
        m46275kk(c5656k42);
        C5656k4 c5656k43 = C5656k4.f15629ze;
        m46275kk(c5656k43);
        m46278to(c5656k4);
        m46278to(c5656k42);
        m46278to(c5656k43);
        m46278to(c5656k43);
        m46280x1("Microsoft Sans Serif");
        m46280x1("Courier New");
        m46280x1("Microsoft Sans Serif");
        m46280x1("Tahoma");
        m46280x1("Microsoft Sans Serif");
        this.f34366m9.m46400k4(new C9450dy());
        m46280x1("Microsoft Sans Serif");
        m46280x1("Microsoft Sans Serif");
        m46272fa();
        m46272fa();
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m46281c5() {
        return this.f34368x1;
    }

    /* JADX INFO: renamed from: du */
    public final C9455kk m46282du() {
        return this.f34361du;
    }

    /* JADX INFO: renamed from: dy */
    public final C9459to m46286dy() {
        return this.f34366m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12007ix m46287h4() {
        return this.f34362dy;
    }

    /* JADX INFO: renamed from: jd */
    public final C11639kk m46290jd() {
        return this.f34365kk;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo46291k4();

    /* JADX INFO: renamed from: kk */
    public final void m46299kk() {
        this.f34364k4.mo46255fa();
        C9455kk c9455kkPop = this.f34363h4.pop();
        this.f34361du = c9455kkPop;
        c9455kkPop.m46359yj().CloneTo(this.f34362dy);
    }

    /* JADX INFO: renamed from: to */
    public final C1937to m46305to() {
        return this.f34367to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46309x1() {
        this.f34361du.m46340k4(this.f34362dy.Clone());
        this.f34363h4.push(this.f34361du);
        this.f34361du = this.f34361du.m46334k4();
        this.f34364k4.mo46257jd();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m46274k4(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] cArr = new char[str.length()];
        int i = 0;
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if (cCharAt == '(') {
                cArr[0] = ')';
            } else if (cCharAt == ')') {
                cArr[0] = '(';
            }
        } else {
            int length = str.length() - 1;
            while (i < str.length()) {
                if (str.charAt(length) < 56320 || str.charAt(length) > 57343 || length <= 0) {
                    cArr[i] = str.charAt(length);
                } else {
                    int i2 = length - 1;
                    if (str.charAt(i2) >= 55296 && str.charAt(i2) <= 56319) {
                        int i3 = i + 1;
                        cArr[i3] = str.charAt(length);
                        cArr[i] = str.charAt(i2);
                        length--;
                        i = i3;
                    }
                }
                i++;
                length--;
            }
        }
        return C14113y2.m67405k4(cArr);
    }

    /* JADX INFO: renamed from: to */
    private C12007ix m46277to(C12007ix c12007ix) {
        C12025x6[] c12025x6Arr = {new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())};
        m46282du().m46350rv().m17342k4(c12025x6Arr);
        return C12007ix.m56541k4(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk(), c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk());
    }

    /* JADX INFO: renamed from: du */
    public final void m46283du(int i) {
        m46282du().m46345kk(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m46288h4(int i) {
        m46282du().m46352to(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m46300kk(int i) {
        m46282du().m46336k4(i);
    }

    /* JADX INFO: renamed from: m9 */
    public final C12025x6 m46304m9() {
        return this.f34360c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46310x1(int i) {
        m46282du().m46325du(i);
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: kk */
    private void m46275kk(C5656k4 c5656k4) {
        C9449du c9449du = new C9449du();
        if (C5656k4.m23096kk(c5656k4, C5656k4.f15629ze)) {
            c9449du.m46266x1(1);
        } else {
            c9449du.m46261k4(c5656k4);
        }
        this.f34366m9.m46400k4(c9449du);
    }

    /* JADX INFO: renamed from: du */
    public final void m46284du(C12015qq c12015qq) {
        C12015qq c12015qqClone = c12015qq.Clone();
        m46297k4(c12015qqClone.Clone());
        m46282du().m46357x1(c12015qqClone.Clone());
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m46289h4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f34360c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46292k4(C1937to c1937to, AbstractC9448ck abstractC9448ck, C11639kk c11639kk, C12007ix c12007ix) {
        AbstractC9448ck abstractC9448ck2;
        m46295k4(c11639kk);
        this.f34367to = c1937to;
        this.f34364k4 = abstractC9448ck;
        int iM9994rv = c1937to.m9994rv();
        if (iM9994rv == 1 || iM9994rv == 2) {
            this.f34366m9 = new C9459to(false);
            m46271ck();
        } else {
            if (iM9994rv != 3 && iM9994rv != 4 && iM9994rv != 5) {
                throw new InvalidOperationException("Unknown metafile type.");
            }
            this.f34366m9 = new C9459to(true);
            m46279up();
        }
        this.f34361du = new C9455kk(this, c1937to);
        this.f34363h4 = new Stack<>();
        c12007ix.CloneTo(this.f34362dy);
        if (this.f34367to.m9994rv() != 1 && (abstractC9448ck2 = this.f34364k4) != null) {
            abstractC9448ck2.mo46258k4();
        }
        mo46291k4();
        c11639kk.m54743k4(m46281c5());
    }

    /* JADX INFO: renamed from: to */
    public final void m46306to(int i) {
        m46286dy().m46401x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46311x1(C5656k4 c5656k4) {
        m46282du().m46356x1(c5656k4);
    }

    /* JADX INFO: renamed from: to */
    private void m46278to(C5656k4 c5656k4) {
        C9447c5 c9447c5 = new C9447c5();
        if (C5656k4.m23096kk(c5656k4, C5656k4.f15629ze)) {
            c9447c5.m46250x1(5);
        } else {
            c9447c5.m46251x1(c5656k4);
        }
        this.f34366m9.m46400k4(c9447c5);
    }

    /* JADX INFO: renamed from: du */
    public final void m46285du(C12025x6 c12025x6) {
        this.f34364k4.mo9945k4(c12025x6.Clone());
        m46289h4(c12025x6.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46293k4(C5656k4 c5656k4) {
        m46282du().m46339k4(c5656k4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m46301kk(C12007ix c12007ix) {
        this.f34364k4.mo9940k4(c12007ix.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46312x1(C12007ix c12007ix) {
        this.f34364k4.mo46256h4(m46277to(c12007ix.Clone()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46294k4(InterfaceC9461x1 interfaceC9461x1) {
        m46286dy().m46400k4(interfaceC9461x1);
    }

    /* JADX INFO: renamed from: kk */
    public final void m46302kk(C12015qq c12015qq) {
        m46282du().m46341k4(c12015qq.Clone());
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: to */
    public final void m46307to(C12015qq c12015qq) {
        m46297k4(c12015qq.Clone());
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46313x1(C12015qq c12015qq) {
        m46282du().m46358x6().m56769x1(m46282du().m46350rv().m17347to() * c12015qq.m56699x1(), m46282du().m46350rv().m17346m9() * c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46295k4(C11639kk c11639kk) {
        this.f34365kk = c11639kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m46303kk(C12025x6 c12025x6) {
        m46298k4(c12025x6.Clone());
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: to */
    public final void m46308to(C12025x6 c12025x6) {
        m46289h4(c12025x6.Clone());
        this.f34364k4.mo9950k4(false);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46314x1(C12025x6 c12025x6) {
        m46282du().m46343k4(c12025x6.Clone());
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: x1 */
    private void m46280x1(String str) {
        C9457m9 c9457m9 = new C9457m9();
        c9457m9.m46383k4(str);
        this.f34366m9.m46400k4(c9457m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46296k4(C12007ix c12007ix) {
        this.f34364k4.mo46254du(m46277to(c12007ix.Clone()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46297k4(C12015qq c12015qq) {
        this.f34362dy = new C12007ix(this.f34362dy.m56557jd(), this.f34362dy.m56551ck(), c12015qq.m56699x1(), c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46298k4(C12025x6 c12025x6) {
        this.f34362dy = new C12007ix(c12025x6.m56897x1(), c12025x6.m56895kk(), this.f34362dy.m56550c5(), this.f34362dy.m56575x1());
    }
}
