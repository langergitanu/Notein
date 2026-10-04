package com.aspose.slides.internal.p184ik;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.C10931x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13965r5;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13888e0;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13899g8;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13984ts;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5101x1 extends AbstractC13965r5 {

    /* JADX INFO: renamed from: c5 */
    private boolean f14037c5;

    /* JADX INFO: renamed from: ck */
    private int f14038ck;

    /* JADX INFO: renamed from: du */
    private C5090ck f14039du;

    /* JADX INFO: renamed from: dy */
    private AbstractC13883dt f14040dy;

    /* JADX INFO: renamed from: fa */
    private C5092dy[] f14041fa;

    /* JADX INFO: renamed from: h4 */
    private C10931x1 f14042h4;

    /* JADX INFO: renamed from: ix */
    private Hashtable f14043ix;

    /* JADX INFO: renamed from: jd */
    private C5092dy[] f14044jd;

    /* JADX INFO: renamed from: ks */
    private int f14047ks;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC13896f9 f14048m9;

    /* JADX INFO: renamed from: ne */
    private C13890ei f14049ne;

    /* JADX INFO: renamed from: rv */
    private int f14050rv;

    /* JADX INFO: renamed from: to */
    private Stack<C5100up> f14051to;

    /* JADX INFO: renamed from: u4 */
    private C5100up[] f14052u4;

    /* JADX INFO: renamed from: up */
    private int f14053up;

    /* JADX INFO: renamed from: x6 */
    private int f14055x6;

    /* JADX INFO: renamed from: yj */
    private C5092dy[] f14056yj;

    /* JADX INFO: renamed from: k4 */
    private k4 f14045k4 = new k4();

    /* JADX INFO: renamed from: x1 */
    private k4 f14054x1 = new k4();

    /* JADX INFO: renamed from: kk */
    private x1 f14046kk = new x1();

    /* JADX INFO: renamed from: com.aspose.slides.internal.ik.x1$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        private C5092dy[] f14057k4;

        /* JADX INFO: renamed from: kk */
        private int f14058kk;

        /* JADX INFO: renamed from: x1 */
        private C5093fa f14059x1;

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m21921x1((k4) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m21922k4(int i) {
            this.f14058kk = i;
            this.f14057k4 = (C5092dy[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C5092dy.class), this.f14058kk));
            C5093fa c5093fa = new C5093fa(null, 1);
            this.f14059x1 = c5093fa;
            this.f14057k4[0].m21787k4(c5093fa);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m21927x1() {
            return this.f14059x1.m21818x1();
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m21921x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f14057k4, this.f14057k4) && C14067j2.m66728k4(k4Var.f14059x1, this.f14059x1) && k4Var.f14058kk == this.f14058kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f14057k4 = this.f14057k4;
            k4Var.f14059x1 = this.f14059x1;
            k4Var.f14058kk = this.f14058kk;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m21924k4(C5092dy[][] c5092dyArr, int[] iArr) {
            c5092dyArr[0] = this.f14057k4;
            iArr[0] = this.f14059x1.m21818x1();
            int iM21818x1 = this.f14059x1.m21818x1() + 1;
            this.f14059x1.m21815k4(iM21818x1);
            if (iM21818x1 >= this.f14057k4.length) {
                int i = this.f14058kk;
                if (i < 65536) {
                    this.f14058kk = i * 2;
                }
                C5092dy[] c5092dyArr2 = (C5092dy[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C5092dy.class), this.f14058kk));
                this.f14057k4 = c5092dyArr2;
                this.f14059x1.m21816k4(c5092dyArr2);
                C5093fa c5093fa = new C5093fa(c5092dyArr[0], this.f14059x1.m21814k4() + 1);
                this.f14059x1 = c5093fa;
                this.f14057k4[0].m21787k4(c5093fa);
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final C5092dy[] m21925k4() {
            return this.f14057k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ik.x1$x1 */
    public static class x1 extends AbstractC7020m9<x1> {

        /* JADX INFO: renamed from: du */
        private int f14060du;

        /* JADX INFO: renamed from: k4 */
        private InterfaceC13896f9 f14061k4;

        /* JADX INFO: renamed from: kk */
        private String f14062kk;

        /* JADX INFO: renamed from: to */
        private int f14063to;

        /* JADX INFO: renamed from: x1 */
        private int f14064x1;

        public Object clone() {
            return Clone();
        }

        /* JADX INFO: renamed from: du */
        public final String m21929du() {
            if (this.f14064x1 == 0) {
                return C14113y2.f47374k4;
            }
            this.f14064x1 = 0;
            return this.f14062kk;
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof x1) {
                return m21928x1((x1) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
        public x1 Clone() {
            x1 x1Var = new x1();
            CloneTo(x1Var);
            return x1Var;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m21931k4() {
            return this.f14064x1;
        }

        /* JADX INFO: renamed from: kk */
        public final int m21935kk() {
            return this.f14063to;
        }

        /* JADX INFO: renamed from: to */
        public final int m21936to() {
            return this.f14060du;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m21937x1() {
            return this.f14064x1 != 0;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m21928x1(x1 x1Var) {
            return C14067j2.m66728k4(x1Var.f14061k4, this.f14061k4) && x1Var.f14064x1 == this.f14064x1 && C14067j2.m66728k4(x1Var.f14062kk, this.f14062kk) && x1Var.f14063to == this.f14063to && x1Var.f14060du == this.f14060du;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(x1 x1Var) {
            if (x1Var == null) {
                x1Var = new x1();
            }
            x1Var.f14061k4 = this.f14061k4;
            x1Var.f14064x1 = this.f14064x1;
            x1Var.f14062kk = this.f14062kk;
            x1Var.f14063to = this.f14063to;
            x1Var.f14060du = this.f14060du;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m21933k4(InterfaceC13896f9 interfaceC13896f9) {
            this.f14061k4 = interfaceC13896f9;
            this.f14064x1 = 0;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m21934k4(String str, int i) {
            if (str.length() != 0) {
                if (this.f14064x1 != 0) {
                    this.f14062kk = C14113y2.m67408k4(this.f14062kk, str);
                    if (i < this.f14064x1) {
                        this.f14064x1 = i;
                        return;
                    }
                    return;
                }
                this.f14062kk = str;
                this.f14064x1 = i;
                InterfaceC13896f9 interfaceC13896f9 = this.f14061k4;
                if (interfaceC13896f9 != null) {
                    this.f14063to = interfaceC13896f9.ah_();
                    this.f14060du = this.f14061k4.ai_();
                }
            }
        }
    }

    public C5101x1(C10931x1 c10931x1, InterfaceC13896f9 interfaceC13896f9, String str, int i) {
        this.f14045k4.m21922k4(256);
        this.f14054x1.m21922k4(16);
        this.f14051to = new Stack<>();
        m21903k4(c10931x1, interfaceC13896f9, str, i);
    }

    /* JADX INFO: renamed from: k4 */
    private int m21885k4(C5092dy[][] c5092dyArr, int i, String str, String str2, String str3, String str4) {
        C5092dy[][] c5092dyArr2 = {null};
        int[] iArr = {0};
        this.f14045k4.m21924k4(c5092dyArr2, iArr);
        C5092dy[] c5092dyArr3 = c5092dyArr2[0];
        int i2 = iArr[0];
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        m21889k4(AbstractC10925du.m52680c5(i), iArr2, iArr3);
        int i3 = iArr2[0];
        int i4 = iArr3[0];
        c5092dyArr3[i2].m21788k4(this.f14039du.m21768k4(str, str2, str3, str4, this.f14041fa, c5092dyArr3, c5092dyArr3, this.f14042h4, this.f14050rv, this.f14055x6), i, this.f14053up);
        c5092dyArr3[i2].m21784k4(i3, i4);
        c5092dyArr[0] = c5092dyArr3;
        return i2;
    }

    /* JADX INFO: renamed from: m9 */
    private void m21890m9() {
        int iM21931k4 = this.f14046kk.m21931k4();
        String strM21929du = this.f14046kk.m21929du();
        String str = C14113y2.f47374k4;
        m21888k4(iM21931k4, str, str, str, str);
        this.f14056yj[this.f14047ks].m21789k4(strM21929du);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        m21906k4(C14113y2.m67406k4(cArr, i, i2), 4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: ck */
    public void mo21892ck() {
        m21912kk(false);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        if (this.f14046kk.m21937x1()) {
            m21890m9();
        }
        C5092dy[][] c5092dyArr = {null};
        int iM52715x1 = this.f14042h4.m52715x1(c5092dyArr);
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        if (iM52715x1 == this.f14045k4.m21927x1() && c5092dyArr2 == this.f14045k4.m21925k4()) {
            String str = C14113y2.f47374k4;
            m21888k4(4, str, str, str, str);
            this.f14056yj[this.f14047ks].m21789k4(C14113y2.f47374k4);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        m21906k4(str, 4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: jd */
    public void mo21898jd() {
        m21912kk(true);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (this.f14037c5) {
            str = this.f14040dy.mo65266k4(str);
            str2 = this.f14040dy.mo65266k4(str2);
            str3 = this.f14040dy.mo65266k4(str3);
        }
        m21888k4(2, str2, str3, str, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        this.f14056yj[this.f14047ks].m21789k4(this.f14046kk.m21929du());
        if (this.f14049ne != null && C14113y2.m67363du(this.f14056yj[this.f14047ks].m21793kk(), this.f14049ne.m65289x1()) && C14113y2.m67363du(this.f14056yj[this.f14047ks].m21806x1(), this.f14049ne.m65284k4())) {
            this.f14042h4.m52710k4(this.f14056yj[this.f14047ks].m21797qq(), this.f14041fa, this.f14053up);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m21886k4(C5092dy[][] c5092dyArr, String str, String str2, C5092dy[] c5092dyArr2, int i) {
        C5092dy[][] c5092dyArr3 = {null};
        int[] iArr = {0};
        this.f14054x1.m21924k4(c5092dyArr3, iArr);
        C5092dy[] c5092dyArr4 = c5092dyArr3[0];
        int i2 = iArr[0];
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        m21889k4(false, iArr2, iArr3);
        int i3 = iArr2[0];
        int i4 = iArr3[0];
        C5090ck c5090ck = this.f14039du;
        String str3 = C14113y2.f47374k4;
        c5092dyArr4[i2].m21788k4(c5090ck.m21768k4(str, str3, str3, str3, c5092dyArr2, c5092dyArr4, null, this.f14042h4, this.f14050rv, this.f14055x6), 3, i);
        c5092dyArr4[i2].m21789k4(str2);
        c5092dyArr4[i2].m21784k4(i3, i4);
        c5092dyArr[0] = c5092dyArr4;
        return i2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        m21906k4(str, 4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        String str2 = C14113y2.f47374k4;
        m21888k4(8, str2, str2, str2, str2);
        this.f14056yj[this.f14047ks].m21789k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        m21912kk(false);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        m21906k4(str, 6);
    }

    /* JADX INFO: renamed from: to */
    public final void m21916to(String str, String str2, String str3, String str4) {
        if (this.f14037c5) {
            str = this.f14040dy.mo65266k4(str);
            str2 = this.f14040dy.mo65266k4(str2);
            str3 = this.f14040dy.mo65266k4(str3);
        }
        String str5 = str;
        String str6 = str2;
        m21888k4(1, str6, str3, str5, str4);
        C5092dy[] c5092dyArr = this.f14056yj;
        this.f14041fa = c5092dyArr;
        int i = this.f14047ks;
        this.f14053up = i;
        this.f14047ks = 0;
        int iM21804wl = c5092dyArr[i].m21804wl() & 63;
        m21887k4(this.f14052u4[iM21804wl].m21882k4(), this.f14052u4[iM21804wl].m21884x1(), this.f14041fa, this.f14053up).CloneTo(this.f14052u4[iM21804wl]);
        Hashtable hashtable = this.f14043ix;
        if (hashtable != null) {
            this.f14049ne = (C13890ei) hashtable.get_Item(new C13890ei(str6, str5));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        m21906k4(str, 4);
    }

    /* JADX INFO: renamed from: k4 */
    private C5100up m21887k4(C5092dy[] c5092dyArr, int i, C5092dy[] c5092dyArr2, int i2) {
        if (c5092dyArr != null) {
            c5092dyArr[i].m21808x1(this.f14039du, c5092dyArr2, i2);
        }
        return new C5100up(c5092dyArr2, i2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m21912kk(boolean z) {
        int iM21936to;
        C5092dy c5092dy;
        C5092dy c5092dy2;
        C5100up c5100up = new C5100up();
        if (!this.f14041fa[this.f14053up].m21798rv()) {
            int iM21931k4 = this.f14046kk.m21931k4();
            if (iM21931k4 == 4) {
                if (this.f14048m9 != null) {
                    if (this.f14046kk.m21935kk() == this.f14041fa[this.f14053up].m21776dy() && (iM21936to = this.f14046kk.m21936to() - this.f14041fa[this.f14053up].m21773c5()) >= 0 && iM21936to <= 255) {
                        this.f14041fa[this.f14053up].m21783k4(iM21936to);
                    } else {
                        m21890m9();
                        c5092dy = this.f14041fa[this.f14053up];
                        c5092dy2 = this.f14056yj[this.f14047ks];
                        c5092dy.m21789k4(c5092dy2.m21797qq());
                    }
                }
                this.f14041fa[this.f14053up].m21809x1(this.f14046kk.m21929du());
            } else if (iM21931k4 == 5 || iM21931k4 == 6) {
                m21890m9();
                c5092dy = this.f14041fa[this.f14053up];
                c5092dy2 = this.f14056yj[this.f14047ks];
                c5092dy.m21789k4(c5092dy2.m21797qq());
            } else {
                this.f14041fa[this.f14053up].m21810x1(z);
            }
        } else if (this.f14046kk.m21937x1()) {
            m21890m9();
        }
        if (this.f14041fa[this.f14053up].m21801u4()) {
            this.f14042h4.m52712k4(this.f14041fa, this.f14053up, this.f14044jd, this.f14038ck);
            this.f14051to.pop().CloneTo(c5100up);
            this.f14044jd = c5100up.m21882k4();
            this.f14038ck = c5100up.m21884x1();
        }
        C5092dy[] c5092dyArr = this.f14041fa;
        this.f14056yj = c5092dyArr;
        int i = this.f14053up;
        this.f14047ks = i;
        C5092dy[][] c5092dyArr2 = {c5092dyArr};
        this.f14053up = c5092dyArr2[0][i].m21805x1(c5092dyArr2);
        this.f14041fa = c5092dyArr2[0];
    }

    /* JADX INFO: renamed from: m9 */
    public final void m21914m9(String str, String str2, String str3) {
        if (this.f14037c5) {
            str = this.f14040dy.mo65266k4(str);
        }
        String str4 = C14113y2.f47374k4;
        m21888k4(7, str, str4, str4, str3);
        this.f14056yj[this.f14047ks].m21789k4(str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21919x1(String str, String str2) {
        String strMo65266k4 = this.f14037c5 ? this.f14040dy.mo65266k4(str) : str;
        String strMo65266k42 = this.f14040dy.mo65266k4(str2);
        C5092dy[] c5092dyArr = this.f14044jd;
        int iM21792kk = this.f14038ck;
        while (iM21792kk != 0 && c5092dyArr[iM21792kk].m21793kk() != strMo65266k4) {
            C5092dy[][] c5092dyArr2 = {c5092dyArr};
            iM21792kk = c5092dyArr2[0][iM21792kk].m21792kk(c5092dyArr2);
            c5092dyArr = c5092dyArr2[0];
        }
        C5092dy[][] c5092dyArr3 = {null};
        int iM21886k4 = m21886k4(c5092dyArr3, strMo65266k4, strMo65266k42, this.f14041fa, this.f14053up);
        C5092dy[] c5092dyArr4 = c5092dyArr3[0];
        if (iM21792kk != 0) {
            C5092dy[] c5092dyArr5 = this.f14044jd;
            C5092dy[] c5092dyArr6 = null;
            int iM21792kk2 = this.f14038ck;
            int i = iM21886k4;
            C5092dy[] c5092dyArr7 = c5092dyArr4;
            while (true) {
                if (iM21792kk2 == iM21792kk && c5092dyArr5 == c5092dyArr) {
                    break;
                }
                C5092dy[][] c5092dyArr8 = {c5092dyArr6};
                int iM21805x1 = c5092dyArr5[iM21792kk2].m21805x1(c5092dyArr8);
                c5092dyArr8[0] = c5092dyArr8[0];
                int iM21886k42 = m21886k4(c5092dyArr8, c5092dyArr5[iM21792kk2].m21793kk(), c5092dyArr5[iM21792kk2].m21797qq(), c5092dyArr8[0], iM21805x1);
                c5092dyArr6 = c5092dyArr8[0];
                c5092dyArr7[i].m21785k4(this.f14039du, c5092dyArr6, iM21886k42);
                C5092dy[][] c5092dyArr9 = {c5092dyArr5};
                iM21792kk2 = c5092dyArr9[0][iM21792kk2].m21792kk(c5092dyArr9);
                c5092dyArr5 = c5092dyArr9[0];
                c5092dyArr7 = c5092dyArr6;
                i = iM21886k42;
            }
            C5092dy[][] c5092dyArr10 = {c5092dyArr};
            int iM21792kk3 = c5092dyArr10[0][iM21792kk].m21792kk(c5092dyArr10);
            C5092dy[] c5092dyArr11 = c5092dyArr10[0];
            if (iM21792kk3 != 0) {
                c5092dyArr7[i].m21785k4(this.f14039du, c5092dyArr11, iM21792kk3);
            }
        } else if (this.f14053up != 0) {
            c5092dyArr4[iM21886k4].m21785k4(this.f14039du, this.f14044jd, this.f14038ck);
        } else {
            this.f14042h4.m52716x1(c5092dyArr4, iM21886k4);
        }
        int i2 = this.f14053up;
        if (i2 != 0) {
            if (!this.f14041fa[i2].m21801u4()) {
                this.f14051to.push(new C5100up(this.f14044jd, this.f14038ck));
                this.f14041fa[this.f14053up].m21790k4(true);
            }
            this.f14044jd = c5092dyArr4;
            this.f14038ck = iM21886k4;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        m21912kk(true);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        m21906k4(C14113y2.m67405k4(new char[]{c}), 4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        m21906k4(C14113y2.m67405k4(new char[]{c2, c}), 4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m21888k4(int i, String str, String str2, String str3, String str4) {
        if (this.f14046kk.m21937x1()) {
            m21890m9();
        }
        C5092dy[][] c5092dyArr = {null};
        int iM21885k4 = m21885k4(c5092dyArr, i, str, str2, str3, str4);
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i2 = this.f14053up;
        if (i2 != 0) {
            this.f14041fa[i2].m21807x1(i);
            int i3 = this.f14047ks;
            if (i3 != 0) {
                this.f14056yj[i3].m21785k4(this.f14039du, c5092dyArr2, iM21885k4);
            }
        }
        this.f14056yj = c5092dyArr2;
        this.f14047ks = iM21885k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21903k4(C10931x1 c10931x1, InterfaceC13896f9 interfaceC13896f9, String str, int i) {
        this.f14042h4 = c10931x1;
        this.f14040dy = c10931x1.m52707k4();
        this.f14037c5 = (i & 1) != 0;
        this.f14047ks = 0;
        this.f14053up = 0;
        this.f14052u4 = (C5100up[]) C22200OooO0o0.OooO00o(C5100up.class, 64);
        this.f14046kk.m21933k4(interfaceC13896f9);
        this.f14048m9 = interfaceC13896f9;
        this.f14050rv = 0;
        this.f14055x6 = 0;
        this.f14039du = new C5090ck();
        C5092dy[][] c5092dyArr = {null};
        String str2 = C14113y2.f47374k4;
        this.f14042h4.m52711k4(c5092dyArr[0], m21885k4(c5092dyArr, 4, str2, str2, str2, str2));
        C5092dy[][] c5092dyArr2 = {this.f14044jd};
        int iM21886k4 = m21886k4(c5092dyArr2, this.f14040dy.mo65266k4("xml"), this.f14040dy.mo65266k4("http://www.w3.org/XML/1998/namespace"), (C5092dy[]) null, 0);
        this.f14038ck = iM21886k4;
        C5092dy[] c5092dyArr3 = c5092dyArr2[0];
        this.f14044jd = c5092dyArr3;
        this.f14042h4.m52714kk(c5092dyArr3, iM21886k4);
        if ((i & 2) != 0) {
            this.f14042h4.m52716x1(this.f14045k4.m21925k4(), this.f14045k4.m21927x1());
            return;
        }
        C5092dy[][] c5092dyArr4 = {this.f14041fa};
        String str3 = C14113y2.f47374k4;
        int iM21885k4 = m21885k4(c5092dyArr4, 0, str3, str3, str3, str);
        this.f14053up = iM21885k4;
        C5092dy[] c5092dyArr5 = c5092dyArr4[0];
        this.f14041fa = c5092dyArr5;
        this.f14042h4.m52716x1(c5092dyArr5, iM21885k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21904k4(InterfaceC13899g8 interfaceC13899g8) {
        IGenericEnumerator<InterfaceC13888e0> it = interfaceC13899g8.mo61870du().iterator();
        while (it.hasNext()) {
            try {
                InterfaceC13888e0 next = it.next();
                InterfaceC13984ts interfaceC13984tsMo61255du = next.mo61255du();
                if (interfaceC13984tsMo61255du != null) {
                    if (this.f14043ix == null) {
                        this.f14043ix = new Hashtable();
                    }
                    this.f14043ix.addItem(new C13890ei(next.mo61284x1(), next.mo61263k4()), new C13890ei(interfaceC13984tsMo61255du.mo61050x1(), interfaceC13984tsMo61255du.mo61033k4()));
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21906k4(String str, int i) {
        this.f14046kk.m21934k4(str, i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        m21914m9(str, str2, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        m21916to(str, str2, str3, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m21889k4(boolean z, int[] iArr, int[] iArr2) {
        int iAh_;
        int iAi_;
        InterfaceC13896f9 interfaceC13896f9 = this.f14048m9;
        if (interfaceC13896f9 == null) {
            iArr[0] = 0;
            iArr2[0] = 0;
            return;
        }
        if (z) {
            iAh_ = this.f14046kk.m21935kk();
            iAi_ = this.f14046kk.m21936to();
        } else {
            iAh_ = interfaceC13896f9.ah_();
            iAi_ = this.f14048m9.ai_();
        }
        int i = iAh_ - this.f14050rv;
        iArr[0] = i;
        if (i < 0 || i > 16383) {
            this.f14050rv = iAh_;
            iArr[0] = 0;
        }
        int i2 = iAi_ - this.f14055x6;
        iArr2[0] = i2;
        if (i2 < 0 || i2 > 65535) {
            this.f14055x6 = iAi_;
            iArr2[0] = 0;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        m21906k4(C14113y2.m67406k4(cArr, i, i2), 4);
    }
}
