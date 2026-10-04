package com.aspose.slides.internal.p118ex;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p419tg.C10935dy;
import com.aspose.slides.internal.p419tg.C10944up;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.ck */
/* JADX INFO: loaded from: classes.dex */
public class C3813ck {

    /* JADX INFO: renamed from: k4 */
    static C3826rv[] f10370k4 = (C3826rv[]) C22200OooO0o0.OooO00o(C3826rv.class, 0);

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f10371x6 = new C7017h4("2.5.29.15", "2.5.29.19", "2.5.29.20", "2.5.29.35", "2.5.29.21");

    /* JADX INFO: renamed from: c5 */
    private C3816fa f10372c5;

    /* JADX INFO: renamed from: ck */
    private C3815dy f10373ck;

    /* JADX INFO: renamed from: du */
    private C3826rv[] f10374du;

    /* JADX INFO: renamed from: dy */
    private AbstractC4709du f10375dy;

    /* JADX INFO: renamed from: fa */
    private C3811ar f10376fa;

    /* JADX INFO: renamed from: h4 */
    private int f10377h4;

    /* JADX INFO: renamed from: jd */
    private C3815dy f10378jd;

    /* JADX INFO: renamed from: kk */
    private C3830up f10379kk;

    /* JADX INFO: renamed from: ks */
    private C3811ar f10380ks;

    /* JADX INFO: renamed from: m9 */
    private C3827to f10381m9;

    /* JADX INFO: renamed from: rv */
    private C3815dy f10382rv;

    /* JADX INFO: renamed from: to */
    private C3822ks f10383to;

    /* JADX INFO: renamed from: up */
    private C3811ar f10384up;

    /* JADX INFO: renamed from: x1 */
    private int f10385x1;

    /* JADX INFO: renamed from: yj */
    private C3811ar f10386yj;

    public C3813ck() {
        this(false);
    }

    /* JADX INFO: renamed from: c5 */
    private C3815dy m15224c5() {
        if (this.f10382rv == null) {
            C3815dy c3815dy = new C3815dy(m15253k4().m15304k4());
            this.f10382rv = c3815dy;
            c3815dy.m15265k4(m15243kk());
            this.f10382rv.m15265k4(m15247to());
        }
        return this.f10382rv;
    }

    /* JADX INFO: renamed from: du */
    private C3811ar m15225du() {
        if (this.f10376fa == null) {
            C3811ar c3811ar = new C3811ar((short) 6, 2);
            this.f10376fa = c3811ar;
            try {
                c3811ar.m15220k4(4);
            } catch (RuntimeException unused) {
            }
        }
        return this.f10376fa;
    }

    /* JADX INFO: renamed from: dy */
    private C3811ar m15227dy() {
        if (this.f10380ks == null) {
            C3811ar c3811ar = new C3811ar((short) 3, 1);
            this.f10380ks = c3811ar;
            try {
                c3811ar.m15220k4(4);
            } catch (RuntimeException unused) {
            }
        }
        return this.f10380ks;
    }

    /* JADX INFO: renamed from: h4 */
    private C3811ar m15229h4() {
        if (this.f10386yj == null) {
            C3811ar c3811ar = new C3811ar((short) 6, 1);
            this.f10386yj = c3811ar;
            try {
                c3811ar.m15220k4(4);
            } catch (RuntimeException unused) {
            }
        }
        return this.f10386yj;
    }

    /* JADX INFO: renamed from: jd */
    private void m15231jd() {
        C3816fa c3816faM15351k4 = this.f10379kk.m15351k4(0);
        m15230h4(c3816faM15351k4.m15270k4());
        m15239k4(c3816faM15351k4);
        for (int size = this.f10379kk.size() - 1; size >= 0; size--) {
            this.f10379kk.m15351k4(size).m15273to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m15232k4(C3823m9 c3823m9, int i, boolean z) {
        C3823m9 c3823m9M15270k4 = this.f10379kk.m15351k4(i).m15270k4();
        int iM15233k4 = 64;
        while (m15230h4(c3823m9M15270k4) && i < this.f10379kk.size() - 1 && (iM15233k4 = m15233k4(c3823m9, c3823m9M15270k4, z)) == 64) {
            i++;
            c3823m9M15270k4 = this.f10379kk.m15351k4(i).m15270k4();
        }
        return iM15233k4 == 64 ? m15233k4(c3823m9, c3823m9M15270k4, z) : iM15233k4;
    }

    /* JADX INFO: renamed from: kk */
    private int m15242kk(C3823m9 c3823m9) {
        do {
            this.f10379kk.m15353k4(c3823m9);
            if (m15226du(c3823m9)) {
                if (m15243kk().m15267x1(c3823m9)) {
                    return 0;
                }
                this.f10379kk.m15351k4(r3.size() - 1).m15271k4(this.f10379kk.m15351k4(r0.size() - 1).m15272kk() | 32);
                return 0;
            }
            c3823m9 = m15248to(c3823m9);
            if (c3823m9 == null) {
                return 65536;
            }
        } while (!this.f10379kk.m15355x1(c3823m9));
        return 128;
    }

    /* JADX INFO: renamed from: m9 */
    private C3811ar m15245m9() {
        if (this.f10384up == null) {
            C3811ar c3811ar = new C3811ar((short) 3, 2);
            this.f10384up = c3811ar;
            try {
                c3811ar.m15220k4(4);
            } catch (RuntimeException unused) {
            }
        }
        return this.f10384up;
    }

    /* JADX INFO: renamed from: to */
    private C3815dy m15247to() {
        if (this.f10373ck == null) {
            C3815dy c3815dy = new C3815dy();
            C3811ar c3811arM15245m9 = m15245m9();
            if (this.f10385x1 == 1) {
                c3815dy.m15265k4(m15227dy().m15219k4());
            }
            c3815dy.m15265k4(c3811arM15245m9.m15219k4());
            this.f10373ck = c3815dy;
        }
        return this.f10373ck;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m15250x1(C3823m9 c3823m9) {
        return m15236k4(c3823m9.m15314bv().m52845x1().m52730x1("2.5.29.35"));
    }

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.X509Certificates.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    public C3813ck(boolean z) {
        this.f10385x1 = z ? 2 : 1;
        this.f10379kk = new C3830up();
        this.f10383to = new C3822ks();
    }

    /* JADX INFO: renamed from: du */
    private boolean m15226du(C3823m9 c3823m9) {
        if (!m15230h4(c3823m9)) {
            return false;
        }
        if (c3823m9.m15313ar() < 3) {
            return true;
        }
        String strM15246m9 = m15246m9(c3823m9);
        if (C14113y2.m67411k4(strM15246m9)) {
            return true;
        }
        String strM15250x1 = m15250x1(c3823m9);
        if (C14113y2.m67411k4(strM15250x1)) {
            return true;
        }
        return C14113y2.m67363du(strM15250x1, strM15246m9);
    }

    /* JADX INFO: renamed from: dy */
    private C10944up m15228dy(C3823m9 c3823m9) {
        C10944up c10944upM15235k4;
        C10944up c10944upM15235k42;
        String strM15343k4 = c3823m9.m15326wl().m15343k4(0);
        String strM15246m9 = m15246m9(c3823m9);
        C10944up c10944upM15235k43 = m15245m9().m15222x1() == null ? null : m15235k4(strM15343k4, strM15246m9, m15245m9().m15222x1().m52857x1());
        if (c10944upM15235k43 != null) {
            return c10944upM15235k43;
        }
        if (this.f10385x1 == 1 && (c10944upM15235k42 = m15235k4(strM15343k4, strM15246m9, m15227dy().m15222x1().m52857x1())) != null) {
            return c10944upM15235k42;
        }
        C10944up c10944upM15235k44 = m15225du().m15222x1() == null ? null : m15235k4(strM15343k4, strM15246m9, m15225du().m15222x1().m52857x1());
        if (c10944upM15235k44 != null) {
            return c10944upM15235k44;
        }
        if (this.f10385x1 != 1 || (c10944upM15235k4 = m15235k4(strM15343k4, strM15246m9, m15229h4().m15222x1().m52857x1())) == null) {
            return null;
        }
        return c10944upM15235k4;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m15230h4(C3823m9 c3823m9) {
        return C14113y2.m67363du(c3823m9.m15284k4(), c3823m9.m15292x1());
    }

    /* JADX INFO: renamed from: k4 */
    private int m15233k4(C3823m9 c3823m9, C3823m9 c3823m92, boolean z) {
        C10944up c10944upM15228dy;
        C3825qq c3825qq = (C3825qq) C7019kk.m27452k4((Object) c3823m92.m15324up().m15356k4("2.5.29.15"), C3825qq.class);
        if ((c3825qq != null && (c3825qq.m15330kk() & 2) != 2) || (c10944upM15228dy = m15228dy(c3823m92)) == null || !c10944upM15228dy.m52811k4(c3823m92.m15319ne().m15300kk())) {
            return 64;
        }
        C10944up.k4 k4VarM52809k4 = c10944upM15228dy.m52809k4(c3823m9.m15314bv());
        if (k4VarM52809k4 != null && (!m15241k4(k4VarM52809k4) || C14084qq.m67116to(k4VarM52809k4.m52819x1(), m15253k4().m15302du()))) {
            return 4;
        }
        if (C14084qq.m67110kk(c10944upM15228dy.m52815to(), m15253k4().m15302du())) {
            return 16777280;
        }
        return !m15252x1(c10944upM15228dy) ? 64 : 0;
    }

    /* JADX INFO: renamed from: kk */
    private C3815dy m15243kk() {
        if (this.f10378jd == null) {
            C3815dy c3815dy = new C3815dy();
            C3811ar c3811arM15225du = m15225du();
            if (this.f10385x1 == 1) {
                c3815dy.m15265k4(m15229h4().m15219k4());
            }
            c3815dy.m15265k4(c3811arM15225du.m15219k4());
            this.f10378jd = c3815dy;
        }
        return this.f10378jd;
    }

    /* JADX INFO: renamed from: m9 */
    private String m15246m9(C3823m9 c3823m9) {
        C3829um c3829um = (C3829um) C7019kk.m27452k4((Object) c3823m9.m15324up().m15356k4("2.5.29.14"), C3829um.class);
        return c3829um == null ? C14113y2.f47374k4 : c3829um.m15349kk();
    }

    /* JADX INFO: renamed from: to */
    private C3823m9 m15248to(C3823m9 c3823m9) {
        C3815dy c3815dyM15263k4 = m15224c5().m15263k4(2, c3823m9.m15284k4(), false);
        String strM15250x1 = m15250x1(c3823m9);
        if (strM15250x1 != null && strM15250x1.length() > 0) {
            c3815dyM15263k4.m15265k4(m15224c5().m15263k4(14, strM15250x1, false));
        }
        C3823m9 c3823m9M15234k4 = m15234k4(c3823m9, c3815dyM15263k4);
        if (c3823m9.m15288k4(c3823m9M15234k4)) {
            return null;
        }
        return c3823m9M15234k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m15255x1() {
        C3826rv[] c3826rvArr = this.f10374du;
        if (c3826rvArr != null && c3826rvArr.length != 0) {
            this.f10374du = null;
        }
        if (this.f10379kk.size() > 0) {
            this.f10379kk.m15354x1();
        }
        C3811ar c3811ar = this.f10386yj;
        if (c3811ar != null) {
            c3811ar.m15221kk();
            this.f10386yj = null;
        }
        C3811ar c3811ar2 = this.f10376fa;
        if (c3811ar2 != null) {
            c3811ar2.m15221kk();
            this.f10376fa = null;
        }
        C3811ar c3811ar3 = this.f10380ks;
        if (c3811ar3 != null) {
            c3811ar3.m15221kk();
            this.f10380ks = null;
        }
        C3811ar c3811ar4 = this.f10384up;
        if (c3811ar4 != null) {
            c3811ar4.m15221kk();
            this.f10384up = null;
        }
        this.f10378jd = null;
        this.f10373ck = null;
        this.f10382rv = null;
        this.f10372c5 = null;
        this.f10375dy = null;
    }

    /* JADX INFO: renamed from: kk */
    private void m15244kk(int i) {
        C3816fa c3816faM15351k4 = this.f10379kk.m15351k4(i);
        C3823m9 c3823m9M15270k4 = c3816faM15351k4.m15270k4();
        this.f10381m9 = c3823m9M15270k4.m15326wl();
        this.f10375dy = c3823m9M15270k4.m15319ne().m15300kk();
        C3814du c3814du = (C3814du) C7019kk.m27452k4((Object) c3823m9M15270k4.m15324up().m15356k4("2.5.29.19"), C3814du.class);
        if (c3814du == null ? c3823m9M15270k4.m15313ar() >= 3 : !c3814du.m15258kk()) {
            c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 1024);
        }
        if (!m15230h4(c3823m9M15270k4)) {
            int i2 = this.f10377h4;
            if (i2 > 0) {
                this.f10377h4 = i2 - 1;
            } else {
                C3816fa c3816fa = this.f10372c5;
                if (c3816fa != null) {
                    c3816fa.m15271k4(c3816fa.m15272kk() | 1024);
                }
            }
        }
        if (c3814du != null && c3814du.m15259to() && c3814du.m15256du() < this.f10377h4) {
            this.f10377h4 = c3814du.m15256du();
            this.f10372c5 = c3816faM15351k4;
        }
        C3825qq c3825qq = (C3825qq) C7019kk.m27452k4((Object) c3823m9M15270k4.m15324up().m15356k4("2.5.29.15"), C3825qq.class);
        if (c3825qq != null && (c3825qq.m15330kk() & 4) != 4) {
            c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 16);
        }
        m15239k4(c3816faM15351k4);
    }

    /* JADX INFO: renamed from: to */
    private void m15249to(int i) {
        boolean z;
        boolean z2 = (i & 65536) != 0;
        int iM15305kk = m15253k4().m15305kk();
        if (iM15305kk != 0) {
            if (iM15305kk == 1) {
                z = true;
            } else {
                if (iM15305kk != 2) {
                    throw new InvalidOperationException(C14113y2.m67402k4("Invalid revocation mode.", new Object[0]));
                }
                z = false;
            }
            int size = this.f10379kk.size() - 1;
            boolean z3 = z2;
            while (size >= 0) {
                int iM15307x1 = m15253k4().m15307x1();
                boolean z4 = iM15307x1 == 0 ? size == 0 : !(iM15307x1 != 1 && iM15307x1 == 2 && size == this.f10379kk.size() - 1);
                C3816fa c3816faM15351k4 = this.f10379kk.m15351k4(size);
                if (!z3) {
                    z3 |= (c3816faM15351k4.m15272kk() & 8) != 0;
                }
                if (z3) {
                    c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 64);
                    c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 16777216);
                } else if (z4 && !z2 && !m15230h4(c3816faM15351k4.m15270k4())) {
                    c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | m15232k4(c3816faM15351k4.m15270k4(), size + 1, z));
                    z3 |= (c3816faM15351k4.m15272kk() & 4) != 0;
                }
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m15251x1(int i) {
        C3816fa c3816faM15351k4 = this.f10379kk.m15351k4(i);
        C3823m9 c3823m9M15270k4 = c3816faM15351k4.m15270k4();
        if (i != this.f10379kk.size() - 1 && "1.2.840.10040.4.1".equals(c3823m9M15270k4.m15314bv().m52825du()) && c3823m9M15270k4.m15314bv().m52828h4() == null) {
            c3823m9M15270k4.m15314bv().m52834k4(this.f10379kk.m15351k4(i + 1).m15270k4().m15314bv().m52828h4());
        }
        AbstractC4709du abstractC4709duM15300kk = this.f10375dy;
        boolean z = abstractC4709duM15300kk == null;
        if (z) {
            abstractC4709duM15300kk = c3823m9M15270k4.m15319ne().m15300kk();
        }
        if (!m15240k4(c3823m9M15270k4, abstractC4709duM15300kk) && (z || i != this.f10379kk.size() - 1 || m15230h4(c3823m9M15270k4))) {
            c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 8);
        }
        if (C14084qq.m67110kk(m15253k4().m15302du(), c3823m9M15270k4.m15321rv()) || C14084qq.m67094k4(m15253k4().m15302du(), c3823m9M15270k4.m15318ks())) {
            c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 1);
        }
        if (z) {
            return;
        }
        if (!C3827to.m15340k4(c3823m9M15270k4.m15328yj(), this.f10381m9)) {
            c3816faM15351k4.m15271k4(c3816faM15351k4.m15272kk() | 2048);
        }
        m15230h4(c3823m9M15270k4);
    }

    /* JADX INFO: renamed from: k4 */
    public C3822ks m15253k4() {
        return this.f10383to;
    }

    /* JADX INFO: renamed from: k4 */
    private C3823m9 m15234k4(C3823m9 c3823m9, C3815dy c3815dy) {
        int size = c3815dy.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return c3815dy.get_Item(0);
        }
        C3815dy c3815dyM15263k4 = c3815dy.m15263k4(6, C7019kk.m27451k4(m15253k4().m15302du()), false);
        int size2 = c3815dyM15263k4.size();
        if (size2 != 0) {
            if (size2 == 1) {
                return c3815dyM15263k4.get_Item(0);
            }
            c3815dy = c3815dyM15263k4;
        }
        String strM15250x1 = m15250x1(c3823m9);
        if (C14113y2.m67411k4(strM15250x1)) {
            return c3815dy.get_Item(0);
        }
        for (C3823m9 c3823m92 : c3815dy) {
            if (C14113y2.m67363du(strM15250x1, m15246m9(c3823m92))) {
                return c3823m92;
            }
        }
        return c3815dy.get_Item(0);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m15252x1(C10944up c10944up) {
        int iM27428k4;
        for (C10934du c10934du : c10944up.m52808k4()) {
            if (c10934du.m52723to() && (iM27428k4 = f10371x6.m27428k4(c10934du.m52722kk())) != 2 && iM27428k4 != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10944up m15235k4(String str, String str2, ArrayList arrayList) {
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            C10944up c10944up = (C10944up) it.next();
            if (C14113y2.m67363du(c10944up.m52814kk(), str) && (str2.length() == 0 || C14113y2.m67363du(str2, m15237k4(c10944up)))) {
                return c10944up;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m15236k4(C10934du c10934du) {
        byte[] bArrM52724h4;
        if (c10934du != null && (bArrM52724h4 = new C10935dy(c10934du).m52724h4()) != null) {
            C6765kp c6765kp = new C6765kp();
            for (byte b : bArrM52724h4) {
                c6765kp.m26792k4(C14098up.m67320k4(b, "X02"));
            }
            return c6765kp.toString();
        }
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m15237k4(C10944up c10944up) {
        return m15236k4(c10944up.m52808k4().m52730x1("2.5.29.35"));
    }

    /* JADX INFO: renamed from: k4 */
    private void m15238k4(int i) {
        int size = this.f10379kk.size();
        int i2 = size - 1;
        C3823m9 c3823m9M15270k4 = this.f10379kk.m15351k4(i2).m15270k4();
        if ((65536 & i) == 0) {
            m15251x1(i2);
            if (i2 == 0) {
                this.f10379kk.m15351k4(0).m15273to();
                return;
            }
            i2 = size - 2;
        }
        this.f10375dy = c3823m9M15270k4.m15319ne().m15300kk();
        this.f10381m9 = c3823m9M15270k4.m15328yj();
        this.f10377h4 = i2;
        while (i2 > 0) {
            m15251x1(i2);
            m15244kk(i2);
            i2--;
        }
        m15251x1(0);
        m15249to(i);
        m15231jd();
    }

    /* JADX INFO: renamed from: k4 */
    private void m15239k4(C3816fa c3816fa) {
        int iM27428k4;
        for (C3828u4 c3828u4 : c3816fa.m15270k4().m15324up()) {
            if (c3828u4.m15346h4() && (iM27428k4 = f10371x6.m27428k4(c3828u4.m19730k4().m19795x1())) != 0 && iM27428k4 != 1) {
                c3816fa.m15271k4(c3816fa.m15272kk() | 256);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0091. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112 A[LOOP:2: B:23:0x0084->B:61:0x0112, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m15254k4(C3823m9 c3823m9) {
        boolean z;
        if (c3823m9 != null) {
            m15255x1();
            try {
                int iM15242kk = m15242kk(c3823m9);
                m15238k4(iM15242kk);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.f10379kk.iterator();
                int iM15334k4 = 0;
                while (it.hasNext()) {
                    for (C3826rv c3826rv : ((C3816fa) it.next()).m15274x1()) {
                        if ((c3826rv.m15334k4() & iM15334k4) != c3826rv.m15334k4()) {
                            arrayList.addItem(C7019kk.m27451k4(c3826rv));
                            iM15334k4 |= c3826rv.m15334k4();
                        }
                    }
                }
                if (iM15242kk != 0) {
                    arrayList.insertItem(0, C7019kk.m27451k4(new C3826rv(iM15242kk)));
                }
                C3826rv[] c3826rvArr = (C3826rv[]) C7019kk.m27458kk(arrayList.toArray(C7019kk.m27443k4((Class<?>) C3826rv.class)), C3826rv[].class);
                this.f10374du = c3826rvArr;
                if (c3826rvArr.length != 0 && m15253k4().m15306to() != 4095) {
                    boolean z2 = true;
                    for (C3826rv c3826rv2 : this.f10374du) {
                        int iM15334k42 = c3826rv2.m15334k4();
                        if (iM15334k42 != 1) {
                            if (iM15334k42 != 2) {
                                switch (iM15334k42) {
                                    case 32:
                                    case 65536:
                                        z = (m15253k4().m15306to() & 16) != 0;
                                        break;
                                    case 256:
                                        if ((m15253k4().m15306to() & 32) != 0) {
                                        }
                                        break;
                                    case 512:
                                    case 33554432:
                                        if ((m15253k4().m15306to() & 128) != 0) {
                                        }
                                        break;
                                    case 1024:
                                        if ((m15253k4().m15306to() & 8) != 0) {
                                        }
                                        break;
                                    case 2048:
                                    case 4096:
                                    case 16384:
                                    case 32768:
                                        if ((m15253k4().m15306to() & 64) != 0) {
                                        }
                                        break;
                                    case 131072:
                                        if ((m15253k4().m15306to() & 2) != 0) {
                                        }
                                        break;
                                    case 262144:
                                        break;
                                    case 524288:
                                        if ((m15253k4().m15306to() & 32) != 0) {
                                        }
                                        break;
                                    default:
                                        z2 = false;
                                        break;
                                }
                                if (z2) {
                                    return false;
                                }
                            } else if ((m15253k4().m15306to() & 4) != 0) {
                            }
                        } else if ((m15253k4().m15306to() & 1) != 0) {
                        }
                        z2 &= z;
                        if (z2) {
                        }
                    }
                }
                return true;
            } catch (CryptographicException e) {
                throw new ArgumentException("certificate", e);
            }
        }
        throw new ArgumentException("certificate");
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m15240k4(C3823m9 c3823m9, AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            return false;
        }
        return c3823m9.m15314bv().m52835k4(abstractC4709du);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m15241k4(C10944up.k4 k4Var) {
        for (C10934du c10934du : k4Var.m52818kk()) {
            if (c10934du.m52723to() && f10371x6.m27428k4(c10934du.m52722kk()) != 4) {
                return false;
            }
        }
        return true;
    }
}
