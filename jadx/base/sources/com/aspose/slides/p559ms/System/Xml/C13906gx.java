package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p343pr.C9483k4;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.gx */
/* JADX INFO: loaded from: classes5.dex */
public final class C13906gx implements Cloneable {

    /* JADX INFO: renamed from: wl */
    private static C14093tq<Boolean> f46524wl = new C14093tq<>();

    /* JADX INFO: renamed from: c5 */
    private long f46525c5;

    /* JADX INFO: renamed from: ck */
    private boolean f46526ck;

    /* JADX INFO: renamed from: du */
    private int f46527du;

    /* JADX INFO: renamed from: dy */
    private boolean f46528dy;

    /* JADX INFO: renamed from: fa */
    private boolean f46529fa;

    /* JADX INFO: renamed from: h4 */
    private int f46530h4;

    /* JADX INFO: renamed from: ix */
    private boolean f46531ix;

    /* JADX INFO: renamed from: jd */
    private long f46532jd;

    /* JADX INFO: renamed from: k4 */
    AbstractC13319z7 f46533k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13883dt f46534kk;

    /* JADX INFO: renamed from: ks */
    private int f46535ks;

    /* JADX INFO: renamed from: m9 */
    private int f46536m9;

    /* JADX INFO: renamed from: ne */
    private AbstractC13319z7 f46537ne;

    /* JADX INFO: renamed from: rv */
    private int f46538rv;

    /* JADX INFO: renamed from: to */
    private AbstractC13943n5 f46539to;

    /* JADX INFO: renamed from: u4 */
    private boolean f46540u4;

    /* JADX INFO: renamed from: up */
    private boolean f46541up;

    /* JADX INFO: renamed from: uz */
    private boolean f46542uz;

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7018k4<AbstractC13319z7> f46543x1 = new C14032z1(this);

    /* JADX INFO: renamed from: x6 */
    private C13129ny f46544x6;

    /* JADX INFO: renamed from: yj */
    private int f46545yj;

    public C13906gx() {
        m65364qq();
    }

    /* JADX INFO: renamed from: ar */
    private static AbstractC13943n5 m65359ar() {
        return new C14010x0();
    }

    /* JADX INFO: renamed from: qq */
    private void m65364qq() {
        m65367x1((AbstractC13943n5) null);
    }

    /* JADX INFO: renamed from: to */
    private C13849aa m65365to(AbstractC13912i5 abstractC13912i5) {
        return new C13849aa(abstractC13912i5, m65403u4(), (m65411x6() & 8) != 0);
    }

    /* JADX INFO: renamed from: uz */
    public static boolean m65366uz() {
        C14093tq<Boolean> c14093tq;
        if (f46524wl.m67302x1()) {
            c14093tq = f46524wl;
        } else {
            c14093tq = !C13884du.m65269k4() ? new C14093tq<>(Boolean.TRUE) : new C14093tq<>(Boolean.FALSE);
            f46524wl = c14093tq;
        }
        return c14093tq.m67297k4().booleanValue();
    }

    /* JADX INFO: renamed from: c5 */
    public final long m65368c5() {
        return this.f46525c5;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m65369ck() {
        return this.f46526ck;
    }

    /* JADX INFO: renamed from: du */
    public final int m65370du() {
        return this.f46527du;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m65373dy() {
        return this.f46528dy;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m65374fa() {
        return this.f46529fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m65375h4() {
        return this.f46530h4;
    }

    /* JADX INFO: renamed from: ix */
    public final C13906gx m65378ix() {
        C13906gx c13906gx = (C13906gx) C7019kk.m27452k4(m65405wl(), C13906gx.class);
        c13906gx.m65397m9(false);
        return c13906gx;
    }

    /* JADX INFO: renamed from: jd */
    public final long m65379jd() {
        return this.f46532jd;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC13912i5 m65391kk(AbstractC13912i5 abstractC13912i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        C13986tu c13986tu;
        C13906gx c13906gxMo65029k4 = abstractC13912i5.mo65029k4();
        boolean z10 = true;
        boolean z11 = false;
        int i3 = -1;
        if (c13906gxMo65029k4 == null) {
            int i4 = this.f46536m9;
            if (i4 != 0 && i4 != AbstractC13912i5.m65462k4(abstractC13912i5)) {
                throw new InvalidOperationException(C13968ri.m65819k4("Cannot change conformance checking to {0}. Make sure the ConformanceLevel in XmlReaderSettings is set to Auto for wrapping scenarios.", C14042ak.m66410k4(C13897fa.class, this.f46536m9)));
            }
            C13938ms c13938ms = (C13938ms) C7019kk.m27452k4((Object) abstractC13912i5, C13938ms.class);
            if (c13938ms == null && (c13986tu = (C13986tu) C7019kk.m27452k4((Object) abstractC13912i5, C13986tu.class)) != null) {
                c13938ms = (C13938ms) c13986tu.m66193c5();
            }
            if (this.f46526ck) {
                if ((c13938ms != null ? c13938ms.m65613g8() : 0) == 0) {
                    z7 = true;
                }
                z8 = z7;
                z9 = this.f46541up;
                if (z9) {
                }
                z6 = this.f46529fa;
                if (z6) {
                }
                if (c13938ms == null) {
                }
                i2 = this.f46545yj;
                if (i2 == 0) {
                    z10 = z8;
                    z4 = z7;
                    z3 = false;
                    i = i3;
                    z5 = z9;
                } else {
                    z10 = z8;
                    z4 = z7;
                    z3 = false;
                    i = i3;
                    z5 = z9;
                }
            } else {
                z7 = false;
                z8 = z7;
                z9 = this.f46541up;
                if (z9) {
                    z8 = true;
                }
                z6 = this.f46529fa;
                if (z6) {
                    z8 = true;
                }
                int iM65618sv = c13938ms == null ? c13938ms.m65618sv() : 2;
                i2 = this.f46545yj;
                if ((i2 == 0 || iM65618sv == 0) && !(i2 == 1 && iM65618sv == 2)) {
                    z10 = z8;
                } else {
                    i3 = i2;
                }
                z4 = z7;
                z3 = false;
                i = i3;
                z5 = z9;
            }
        } else {
            if (this.f46536m9 != c13906gxMo65029k4.m65396m9() && this.f46536m9 != 0) {
                throw new InvalidOperationException(C13968ri.m65819k4("Cannot change conformance checking to {0}. Make sure the ConformanceLevel in XmlReaderSettings is set to Auto for wrapping scenarios.", C14042ak.m66410k4(C13897fa.class, this.f46536m9)));
            }
            boolean z12 = this.f46528dy && !c13906gxMo65029k4.m65373dy();
            boolean z13 = z12;
            if (!this.f46526ck || c13906gxMo65029k4.m65369ck()) {
                z = false;
            } else {
                z12 = true;
                z = true;
            }
            if (!this.f46541up || c13906gxMo65029k4.m65404up()) {
                z2 = false;
            } else {
                z12 = true;
                z2 = true;
            }
            if (this.f46529fa && !c13906gxMo65029k4.m65374fa()) {
                z12 = true;
                z11 = true;
            }
            if ((this.f46545yj != 0 || c13906gxMo65029k4.m65412yj() == 0) && !(this.f46545yj == 1 && c13906gxMo65029k4.m65412yj() == 2)) {
                z10 = z12;
            } else {
                i3 = this.f46545yj;
            }
            z3 = z13;
            z4 = z;
            z5 = z2;
            z6 = z11;
            i = i3;
        }
        if (!z10) {
            return abstractC13912i5;
        }
        InterfaceC13980t6 interfaceC13980t6 = (InterfaceC13980t6) C7019kk.m27452k4((Object) abstractC13912i5, InterfaceC13980t6.class);
        boolean z14 = z5;
        return interfaceC13980t6 != null ? new C13878d4(abstractC13912i5, interfaceC13980t6, z3, z4, z14, z6, i) : new C13879dc(abstractC13912i5, z3, z4, z14, z6, i);
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m65395ks() {
        return this.f46531ix;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m65396m9() {
        return this.f46536m9;
    }

    /* JADX INFO: renamed from: ne */
    public final C13129ny m65398ne() {
        if (this.f46544x6 == null) {
            this.f46544x6 = new C13129ny();
        }
        return this.f46544x6;
    }

    /* JADX INFO: renamed from: rv */
    public final int m65399rv() {
        return this.f46535ks;
    }

    /* JADX INFO: renamed from: u4 */
    public final AbstractC13319z7 m65403u4() {
        return this.f46537ne;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m65404up() {
        return this.f46541up;
    }

    /* JADX INFO: renamed from: wl */
    public Object m65405wl() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC13912i5 m65406x1(AbstractC13912i5 abstractC13912i5) {
        int i = this.f46535ks;
        if (i != 4) {
            return i == 2 ? m65365to(abstractC13912i5) : abstractC13912i5;
        }
        AbstractC13943n5 abstractC13943n5M65400to = m65400to();
        if (abstractC13943n5M65400to == null && !m65410x1() && !m65366uz()) {
            abstractC13943n5M65400to = new C14010x0();
        }
        return new C13880dk(abstractC13912i5, abstractC13943n5M65400to, this);
    }

    /* JADX INFO: renamed from: x6 */
    public final int m65411x6() {
        return this.f46538rv;
    }

    /* JADX INFO: renamed from: yj */
    public final int m65412yj() {
        return this.f46545yj;
    }

    /* JADX INFO: renamed from: du */
    public final void m65371du(int i) {
        m65363k4("ValidationType");
        if ((((long) i) & 4294967295L) > 4) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f46535ks = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m65376h4(int i) {
        m65363k4("ValidationFlags");
        if ((((long) i) & 4294967295L) > 31) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f46538rv = i;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13943n5 m65392kk() {
        return this.f46539to;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m65397m9(boolean z) {
        this.f46540u4 = z;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC13943n5 m65400to() {
        if (!C9483k4.m46679k4() || m65410x1()) {
            return this.f46539to;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65407x1(int i) {
        m65363k4("LinePositionOffset");
        this.f46530h4 = i;
    }

    /* JADX INFO: renamed from: du */
    public final void m65372du(boolean z) {
        m65363k4("IgnoreComments");
        this.f46541up = z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m65377h4(boolean z) {
        m65363k4("CloseInput");
        this.f46531ix = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13883dt m65380k4() {
        return this.f46534kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m65393kk(int i) {
        m65363k4("ConformanceLevel");
        if ((((long) i) & 4294967295L) > 2) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f46536m9 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m65401to(int i) {
        m65363k4("DtdProcessing");
        if ((((long) i) & 4294967295L) > 2) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f46545yj = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65408x1(long j) {
        m65363k4("MaxCharactersFromEntities");
        if (j < 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f46532jd = j;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65367x1(AbstractC13943n5 abstractC13943n5) {
        this.f46534kk = null;
        if (m65366uz()) {
            if (abstractC13943n5 == null) {
                abstractC13943n5 = m65359ar();
            }
            this.f46539to = abstractC13943n5;
            this.f46532jd = 0L;
        } else {
            this.f46539to = abstractC13943n5;
            this.f46532jd = C7019kk.m27438h4(Double.valueOf(1.0E7d), 14);
        }
        this.f46527du = 0;
        this.f46530h4 = 0;
        this.f46528dy = true;
        this.f46536m9 = 2;
        this.f46526ck = false;
        this.f46529fa = false;
        this.f46541up = false;
        this.f46545yj = 0;
        this.f46531ix = false;
        this.f46525c5 = 0L;
        this.f46544x6 = null;
        this.f46535ks = 0;
        this.f46538rv = 8 | 16;
        this.f46540u4 = false;
        m65390k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13912i5 m65381k4(AbstractC3150x6 abstractC3150x6, C14062gk c14062gk, String str, C14015xb c14015xb) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("input");
        }
        if (str == null) {
            str = c14062gk == null ? C14113y2.f47374k4 : c14062gk.toString();
        }
        C13985tt c13985tt = new C13985tt(abstractC3150x6, null, 0, this, c14062gk, str, c14015xb, this.f46531ix);
        return m65399rv() != 0 ? m65406x1(c13985tt) : c13985tt;
    }

    /* JADX INFO: renamed from: kk */
    public final void m65394kk(boolean z) {
        m65363k4("IgnoreWhitespace");
        this.f46526ck = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m65402to(boolean z) {
        m65363k4("IgnoreProcessingInstructions");
        this.f46529fa = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13912i5 m65382k4(AbstractC3151yd abstractC3151yd, String str, C14015xb c14015xb) {
        if (abstractC3151yd == null) {
            throw new ArgumentNullException("input");
        }
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        C13985tt c13985tt = new C13985tt(abstractC3151yd, this, str, c14015xb);
        return m65399rv() != 0 ? m65406x1(c13985tt) : c13985tt;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65409x1(boolean z) {
        m65363k4("CheckCharacters");
        this.f46528dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13912i5 m65383k4(AbstractC13912i5 abstractC13912i5) {
        if (abstractC13912i5 != null) {
            return m65391kk(abstractC13912i5);
        }
        throw new ArgumentNullException("reader");
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m65410x1() {
        return this.f46542uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13912i5 m65384k4(String str, C14015xb c14015xb) {
        if (str == null) {
            throw new ArgumentNullException("inputUri");
        }
        if (str.length() == 0) {
            throw new ArgumentException(C13968ri.m65818k4("The string was not recognized as a valid Uri."), "inputUri");
        }
        AbstractC13943n5 abstractC13943n5M65392kk = m65392kk();
        if (abstractC13943n5M65392kk == null) {
            abstractC13943n5M65392kk = m65359ar();
        }
        C13985tt c13985tt = new C13985tt(str, this, c14015xb, abstractC13943n5M65392kk);
        return m65399rv() != 0 ? m65406x1(c13985tt) : c13985tt;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65385k4(int i) {
        m65363k4("LineNumberOffset");
        this.f46527du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65386k4(long j) {
        m65363k4("MaxCharactersInDocument");
        if (j < 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f46525c5 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65387k4(C13129ny c13129ny) {
        m65363k4("Schemas");
        this.f46544x6 = c13129ny;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65388k4(AbstractC13883dt abstractC13883dt) {
        m65363k4("NameTable");
        this.f46534kk = abstractC13883dt;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65389k4(AbstractC13943n5 abstractC13943n5) {
        m65363k4("XmlResolver");
        this.f46539to = abstractC13943n5;
        m65390k4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m65363k4(String str) {
        if (this.f46540u4) {
            throw new XmlException("The '{0}' property is read only and cannot be set.", C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65390k4(boolean z) {
        this.f46542uz = z;
    }
}
