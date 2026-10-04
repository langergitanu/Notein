package com.aspose.slides.internal.p184ik;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C5098m9 extends AbstractC10925du implements InterfaceC13896f9 {

    /* JADX INFO: renamed from: c5 */
    private String f14026c5;

    /* JADX INFO: renamed from: du */
    private C5092dy[] f14027du;

    /* JADX INFO: renamed from: dy */
    private int f14028dy;

    /* JADX INFO: renamed from: h4 */
    private C5092dy[] f14029h4;

    /* JADX INFO: renamed from: m9 */
    private int f14030m9;

    public C5098m9(C5098m9 c5098m9) {
        this(c5098m9.f14027du, c5098m9.f14030m9, c5098m9.f14029h4, c5098m9.f14028dy);
        this.f14026c5 = c5098m9.f14026c5;
    }

    /* JADX INFO: renamed from: b3 */
    private int m21836b3() {
        if (this.f14028dy == 0) {
            return Integer.MIN_VALUE;
        }
        int iM21781k4 = this.f14027du[this.f14030m9].m21781k4();
        if (iM21781k4 == 2) {
            return AbstractC5089c5.m21750k4(this.f14027du, this.f14030m9);
        }
        if (iM21781k4 != 3) {
            return Integer.MAX_VALUE;
        }
        return AbstractC5089c5.m21750k4(this.f14027du, this.f14030m9) - Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: k4 */
    private int m21837k4(C5098m9 c5098m9, boolean z, C5092dy[][] c5092dyArr) {
        if (c5098m9 == null || this.f14027du[this.f14030m9].m21778h4() != c5098m9.f14027du[c5098m9.f14030m9].m21778h4()) {
            c5092dyArr[0] = null;
            return 0;
        }
        int i = c5098m9.f14028dy;
        if (i == 0) {
            c5092dyArr[0] = c5098m9.f14027du;
            return c5098m9.f14030m9;
        }
        c5092dyArr[0] = c5098m9.f14029h4;
        return z ? i : i + 1;
    }

    /* JADX INFO: renamed from: yd */
    private int m21838yd() {
        int i = this.f14028dy;
        return i == 0 ? AbstractC5089c5.m21750k4(this.f14027du, this.f14030m9) : AbstractC5089c5.m21750k4(this.f14029h4, i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final boolean ag_() {
        return this.f14027du[this.f14030m9].m21778h4().m52717x1();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ah_() {
        return ((this.f14028dy == 0 || mo21857kk() != 4) ? this.f14027du[this.f14030m9] : this.f14029h4[this.f14028dy]).m21776dy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ai_() {
        return (this.f14028dy == 0 || mo21857kk() != 4) ? this.f14027du[this.f14030m9].m21773c5() : this.f14029h4[this.f14028dy].m21780jd();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: c5 */
    public String mo21839c5() {
        C5092dy[] c5092dyArr;
        int iM21805x1 = this.f14028dy;
        if (iM21805x1 != 0) {
            c5092dyArr = this.f14029h4;
        } else {
            c5092dyArr = this.f14027du;
            iM21805x1 = this.f14030m9;
        }
        do {
            int iM21781k4 = c5092dyArr[iM21805x1].m21781k4();
            if (iM21781k4 == 0 || iM21781k4 == 1 || iM21781k4 == 7) {
                return c5092dyArr[iM21805x1].m21795m9();
            }
            C5092dy[][] c5092dyArr2 = {c5092dyArr};
            iM21805x1 = c5092dyArr2[0][iM21805x1].m21805x1(c5092dyArr2);
            c5092dyArr = c5092dyArr2[0];
        } while (iM21805x1 != 0);
        return C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: du */
    public AbstractC10929m9 mo21840du(String str, String str2) {
        return (str == null || str.length() == 0) ? super.mo21840du(str, str2) : new C5097kk(this, str, str2);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10930to
    /* JADX INFO: renamed from: dy */
    public String mo21843dy() {
        String strM21797qq = this.f14027du[this.f14030m9].m21797qq();
        if (strM21797qq != null) {
            return strM21797qq;
        }
        int i = this.f14028dy;
        if (i != 0) {
            return this.f14029h4[i].m21797qq();
        }
        String strM21797qq2 = C14113y2.f47374k4;
        C5092dy[] c5092dyArr = this.f14027du;
        int i2 = this.f14030m9;
        C5092dy[][] c5092dyArr2 = {c5092dyArr};
        int[] iArr = {i2};
        boolean zM21749h4 = AbstractC5089c5.m21749h4(c5092dyArr2, iArr);
        C5092dy[] c5092dyArr3 = c5092dyArr2[0];
        int i3 = iArr[0];
        C6765kp c6765kpOooO00o = null;
        if (!zM21749h4) {
            i3 = 0;
            c5092dyArr3 = null;
        }
        C5092dy[][] c5092dyArr4 = {c5092dyArr};
        int[] iArr2 = {i2};
        while (AbstractC5089c5.m21755k4(c5092dyArr4, iArr2, c5092dyArr3, i3)) {
            if (strM21797qq2.length() == 0) {
                strM21797qq2 = c5092dyArr[iArr2[0]].m21797qq();
            } else {
                if (c6765kpOooO00o == null) {
                    c6765kpOooO00o = OooO00o.OooO00o(strM21797qq2);
                }
                c6765kpOooO00o.m26792k4(c5092dyArr[iArr2[0]].m21797qq());
            }
        }
        return c6765kpOooO00o != null ? c6765kpOooO00o.toString() : strM21797qq2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: fa */
    public Object mo21844fa() {
        return deepClone();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: h4 */
    public AbstractC10929m9 mo21845h4(int i) {
        return new C5091du(this, i);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ix */
    public void mo21848ix() {
        if (this.f14028dy != 0) {
            this.f14029h4 = null;
            this.f14028dy = 0;
        }
        C5092dy[][] c5092dyArr = {this.f14027du};
        this.f14030m9 = c5092dyArr[0][this.f14030m9].m21782k4(c5092dyArr);
        this.f14027du = c5092dyArr[0];
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: jd */
    public boolean mo21849jd() {
        return this.f14027du[this.f14030m9].m21803uz();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public int mo21857kk() {
        return this.f14027du[this.f14030m9].m21781k4();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ks */
    public boolean mo21861ks() {
        C5092dy[][] c5092dyArr = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21763x1 = AbstractC5089c5.m21763x1(c5092dyArr, iArr);
        this.f14027du = c5092dyArr[0];
        this.f14030m9 = iArr[0];
        return zM21763x1;
    }

    /* JADX INFO: renamed from: lr */
    public final int m21862lr() {
        return this.f14030m9 ^ this.f14028dy;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: m9 */
    public String mo21863m9() {
        return this.f14027du[this.f14030m9].m21806x1();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ne */
    public boolean mo21864ne() {
        int i = this.f14028dy;
        if (i != 0) {
            this.f14027du = this.f14029h4;
            this.f14030m9 = i;
            this.f14029h4 = null;
            this.f14028dy = 0;
            return true;
        }
        C5092dy[][] c5092dyArr = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21748du = AbstractC5089c5.m21748du(c5092dyArr, iArr);
        this.f14027du = c5092dyArr[0];
        this.f14030m9 = iArr[0];
        return zM21748du;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: rv */
    public boolean mo21865rv() {
        C5092dy[][] c5092dyArr = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21761to = AbstractC5089c5.m21761to(c5092dyArr, iArr);
        this.f14027du = c5092dyArr[0];
        this.f14030m9 = iArr[0];
        return zM21761to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public int mo21866to(AbstractC10925du abstractC10925du) {
        C5098m9 c5098m9 = (C5098m9) C7019kk.m27452k4((Object) abstractC10925du, C5098m9.class);
        if (c5098m9 == null || this.f14027du[this.f14030m9].m21778h4() != c5098m9.f14027du[c5098m9.f14030m9].m21778h4()) {
            return 3;
        }
        int iM21838yd = m21838yd();
        int iM21838yd2 = c5098m9.m21838yd();
        if (iM21838yd == iM21838yd2 && (iM21838yd = m21836b3()) == (iM21838yd2 = c5098m9.m21836b3())) {
            return 2;
        }
        return iM21838yd < iM21838yd2 ? 0 : 1;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: u4 */
    public boolean mo21871u4() {
        return this.f14027du[this.f14030m9].m21798rv();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: up */
    public boolean mo21872up() {
        return this.f14027du[this.f14030m9].m21794ks();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: v4 */
    public String mo21873v4() {
        int i;
        int i2;
        char[] cArr = new char[16];
        cArr[0] = AbstractC10925du.f38010x1[this.f14027du[this.f14030m9].m21781k4()];
        if (this.f14028dy != 0) {
            int iM21814k4 = ((this.f14029h4[0].m21774ck().m21814k4() - 1) << 16) | (this.f14028dy - 1);
            int i3 = 1;
            while (true) {
                i2 = i3 + 1;
                cArr[i3] = AbstractC10925du.f38008kk[iM21814k4 & 31];
                iM21814k4 >>= 5;
                if (iM21814k4 == 0) {
                    break;
                }
                i3 = i2;
            }
            i = i3 + 2;
            cArr[i2] = '0';
        } else {
            i = 1;
        }
        int iM21814k42 = ((this.f14027du[0].m21774ck().m21814k4() - 1) << 16) | (this.f14030m9 - 1);
        while (true) {
            int i4 = i + 1;
            cArr[i] = AbstractC10925du.f38008kk[iM21814k42 & 31];
            iM21814k42 >>= 5;
            if (iM21814k42 == 0) {
                return C14113y2.m67406k4(cArr, 0, i4);
            }
            i = i4;
        }
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public AbstractC13883dt mo21874x1() {
        return this.f14027du[this.f14030m9].m21778h4().m52707k4();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x6 */
    public boolean mo21878x6() {
        if (!this.f14027du[this.f14030m9].m21813yj()) {
            C5092dy[][] c5092dyArr = {this.f14027du};
            int[] iArr = {this.f14030m9};
            boolean zM21758kk = AbstractC5089c5.m21758kk(c5092dyArr, iArr);
            this.f14027du = c5092dyArr[0];
            this.f14030m9 = iArr[0];
            return zM21758kk;
        }
        C5092dy[] c5092dyArr2 = this.f14027du;
        this.f14029h4 = c5092dyArr2;
        int i = this.f14030m9;
        this.f14028dy = i;
        C5092dy[][] c5092dyArr3 = {c5092dyArr2};
        this.f14030m9 = c5092dyArr3[0][i].m21778h4().m52706k4(c5092dyArr3);
        this.f14027du = c5092dyArr3[0];
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: yj */
    public boolean mo21879yj() {
        C5092dy[] c5092dyArr = this.f14027du;
        int i = this.f14030m9;
        C5092dy[][] c5092dyArr2 = {c5092dyArr};
        int[] iArr = {i};
        boolean zM21752k4 = AbstractC5089c5.m21752k4(c5092dyArr2, iArr);
        this.f14027du = c5092dyArr2[0];
        this.f14030m9 = iArr[0];
        if (!zM21752k4) {
            return false;
        }
        this.f14029h4 = c5092dyArr;
        this.f14028dy = i;
        return true;
    }

    public C5098m9(C5092dy[] c5092dyArr, int i, C5092dy[] c5092dyArr2, int i2) {
        this.f14027du = c5092dyArr;
        this.f14029h4 = c5092dyArr2;
        this.f14030m9 = i;
        this.f14028dy = i2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: du */
    public String mo21841du() {
        return this.f14027du[this.f14030m9].m21775du();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: h4 */
    public String mo21846h4() {
        return this.f14027du[this.f14030m9].m21800to();
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m21850jd(int i) {
        return (AbstractC10925du.m52682dy(i) & (1 << this.f14027du[this.f14030m9].m21781k4())) != 0;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du deepClone() {
        return new C5098m9(this.f14027du, this.f14030m9, this.f14029h4, this.f14028dy);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo21858kk(int i) {
        C5092dy[] c5092dyArr = this.f14027du;
        int iM21792kk = this.f14030m9;
        if (c5092dyArr[iM21792kk].m21781k4() != 3) {
            return false;
        }
        while (true) {
            C5092dy[][] c5092dyArr2 = {c5092dyArr};
            iM21792kk = c5092dyArr2[0][iM21792kk].m21792kk(c5092dyArr2);
            c5092dyArr = c5092dyArr2[0];
            if (iM21792kk != 0) {
                if (i == 1) {
                    if (!c5092dyArr[iM21792kk].m21777fa()) {
                        break;
                    }
                } else if (i == 2) {
                    C5092dy[][] c5092dyArr3 = {null};
                    int iM21805x1 = c5092dyArr[iM21792kk].m21805x1(c5092dyArr3);
                    C5092dy[] c5092dyArr4 = c5092dyArr3[0];
                    if (iM21805x1 != this.f14028dy || c5092dyArr4 != this.f14029h4) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        this.f14027du = c5092dyArr;
        this.f14030m9 = iM21792kk;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public String mo21867to() {
        return this.f14027du[this.f14030m9].m21793kk();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public boolean mo21875x1(int i) {
        int iM21762x1;
        C5092dy[] c5092dyArr;
        if (i == 2) {
            C5092dy[][] c5092dyArr2 = {null};
            iM21762x1 = AbstractC5089c5.m21751k4(this.f14027du, this.f14030m9, c5092dyArr2);
            c5092dyArr = c5092dyArr2[0];
        } else {
            C5092dy[][] c5092dyArr3 = {null};
            iM21762x1 = AbstractC5089c5.m21762x1(this.f14027du, this.f14030m9, c5092dyArr3);
            c5092dyArr = c5092dyArr3[0];
        }
        while (iM21762x1 != 0) {
            if (i != 1 || !c5092dyArr[iM21762x1].m21777fa()) {
                this.f14029h4 = this.f14027du;
                this.f14028dy = this.f14030m9;
                this.f14027du = c5092dyArr;
                this.f14030m9 = iM21762x1;
                return true;
            }
            C5092dy[][] c5092dyArr4 = {c5092dyArr};
            iM21762x1 = c5092dyArr4[0][iM21762x1].m21792kk(c5092dyArr4);
            c5092dyArr = c5092dyArr4[0];
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: du */
    public boolean mo21842du(int i) {
        C5092dy[][] c5092dyArr = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21764x1 = AbstractC5089c5.m21764x1(c5092dyArr, iArr, i);
        this.f14027du = c5092dyArr[0];
        this.f14030m9 = iArr[0];
        return zM21764x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m21847h4(String str, String str2) {
        if (str != this.f14026c5) {
            this.f14026c5 = str != null ? mo21874x1().mo65268x1(str) : null;
        }
        if (this.f14028dy != 0) {
            return false;
        }
        return this.f14027du[this.f14030m9].m21811x1(this.f14026c5, str2);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 mo21852k4(int i, boolean z) {
        return new C5094h4(this, i, z);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo21859kk(AbstractC10925du abstractC10925du) {
        C5092dy[] c5092dyArr;
        C5098m9 c5098m9 = (C5098m9) C7019kk.m27452k4((Object) abstractC10925du, C5098m9.class);
        if (c5098m9 != null) {
            int iM21805x1 = c5098m9.f14028dy;
            if (iM21805x1 != 0) {
                c5092dyArr = c5098m9.f14029h4;
            } else {
                C5092dy[][] c5092dyArr2 = {null};
                int iM21805x12 = c5098m9.f14027du[c5098m9.f14030m9].m21805x1(c5092dyArr2);
                C5092dy[] c5092dyArr3 = c5092dyArr2[0];
                iM21805x1 = iM21805x12;
                c5092dyArr = c5092dyArr3;
            }
            while (iM21805x1 != 0) {
                if (iM21805x1 == this.f14030m9 && c5092dyArr == this.f14027du) {
                    return true;
                }
                C5092dy[][] c5092dyArr4 = {c5092dyArr};
                iM21805x1 = c5092dyArr4[0][iM21805x1].m21805x1(c5092dyArr4);
                c5092dyArr = c5092dyArr4[0];
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public boolean mo21868to(int i) {
        if (!this.f14027du[this.f14030m9].m21813yj()) {
            C5092dy[][] c5092dyArr = {this.f14027du};
            int[] iArr = {this.f14030m9};
            boolean zM21753k4 = AbstractC5089c5.m21753k4(c5092dyArr, iArr, i);
            this.f14027du = c5092dyArr[0];
            this.f14030m9 = iArr[0];
            return zM21753k4;
        }
        if (i != 4 && i != 9) {
            return false;
        }
        C5092dy[] c5092dyArr2 = this.f14027du;
        this.f14029h4 = c5092dyArr2;
        int i2 = this.f14030m9;
        this.f14028dy = i2;
        C5092dy[][] c5092dyArr3 = {c5092dyArr2};
        this.f14030m9 = c5092dyArr3[0][i2].m21778h4().m52706k4(c5092dyArr3);
        this.f14027du = c5092dyArr3[0];
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public boolean mo21876x1(AbstractC10925du abstractC10925du) {
        C5098m9 c5098m9 = (C5098m9) C7019kk.m27452k4((Object) abstractC10925du, C5098m9.class);
        return c5098m9 != null && this.f14030m9 == c5098m9.f14030m9 && this.f14027du == c5098m9.f14027du && this.f14028dy == c5098m9.f14028dy && this.f14029h4 == c5098m9.f14029h4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 mo21853k4(String str, String str2, boolean z) {
        return (str == null || str.length() == 0) ? super.mo21853k4(str, str2, z) : new C5099to(this, str, str2, z);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo21860kk(String str, String str2) {
        if (str != this.f14026c5) {
            this.f14026c5 = str != null ? mo21874x1().mo65268x1(str) : null;
        }
        C5092dy[][] c5092dyArr = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21754k4 = AbstractC5089c5.m21754k4(c5092dyArr, iArr, this.f14026c5, str2);
        this.f14027du = c5092dyArr[0];
        this.f14030m9 = iArr[0];
        return zM21754k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public boolean mo21869to(String str) {
        C5092dy[][] c5092dyArr = {null};
        int iM52704k4 = this.f14027du[this.f14030m9].m21778h4().m52704k4(str, c5092dyArr);
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        if (iM52704k4 == 0) {
            return false;
        }
        this.f14027du = c5092dyArr2;
        this.f14030m9 = iM52704k4;
        this.f14029h4 = null;
        this.f14028dy = 0;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public boolean mo21877x1(String str, String str2) {
        C5092dy[] c5092dyArr = this.f14027du;
        int i = this.f14030m9;
        if (str != this.f14026c5) {
            this.f14026c5 = str != null ? mo21874x1().mo65268x1(str) : null;
        }
        C5092dy[][] c5092dyArr2 = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21759kk = AbstractC5089c5.m21759kk(c5092dyArr2, iArr, this.f14026c5, str2);
        this.f14027du = c5092dyArr2[0];
        this.f14030m9 = iArr[0];
        if (!zM21759kk) {
            return false;
        }
        this.f14029h4 = c5092dyArr;
        this.f14028dy = i;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public boolean mo21854k4(int i, AbstractC10925du abstractC10925du) {
        C5092dy[] c5092dyArr;
        C5098m9 c5098m9 = (C5098m9) C7019kk.m27452k4((Object) abstractC10925du, C5098m9.class);
        if (i == 4 || i == 9) {
            if (this.f14027du[this.f14030m9].m21813yj()) {
                if (c5098m9 != null && this.f14030m9 == c5098m9.f14028dy && this.f14027du == c5098m9.f14029h4) {
                    return false;
                }
                C5092dy[] c5092dyArr2 = this.f14027du;
                this.f14029h4 = c5092dyArr2;
                int i2 = this.f14030m9;
                this.f14028dy = i2;
                C5092dy[][] c5092dyArr3 = {c5092dyArr2};
                this.f14030m9 = c5092dyArr3[0][i2].m21778h4().m52706k4(c5092dyArr3);
                this.f14027du = c5092dyArr3[0];
                return true;
            }
            if (i == 4) {
                C5092dy[][] c5092dyArr4 = {null};
                int iM21837k4 = m21837k4(c5098m9, true, c5092dyArr4);
                C5092dy[] c5092dyArr5 = c5092dyArr4[0];
                int i3 = this.f14028dy;
                if (i3 != 0) {
                    c5092dyArr = this.f14029h4;
                } else {
                    c5092dyArr = this.f14027du;
                    i3 = this.f14030m9;
                }
                if (c5098m9 != null && c5098m9.f14028dy != 0 && i3 == iM21837k4 && c5092dyArr == c5092dyArr5) {
                    return false;
                }
                C5092dy[][] c5092dyArr6 = {c5092dyArr};
                int[] iArr = {i3};
                boolean zM21755k4 = AbstractC5089c5.m21755k4(c5092dyArr6, iArr, c5092dyArr5, iM21837k4);
                C5092dy[] c5092dyArr7 = c5092dyArr6[0];
                int i4 = iArr[0];
                if (!zM21755k4) {
                    return false;
                }
                if (c5092dyArr7[i4].m21781k4() == 1) {
                    C5092dy[][] c5092dyArr8 = {this.f14027du};
                    this.f14030m9 = c5092dyArr7[i4].m21778h4().m52706k4(c5092dyArr8);
                    this.f14027du = c5092dyArr8[0];
                    this.f14029h4 = c5092dyArr7;
                    this.f14028dy = i4;
                } else {
                    this.f14027du = c5092dyArr7;
                    this.f14030m9 = i4;
                    this.f14029h4 = null;
                    this.f14028dy = 0;
                }
                return true;
            }
        }
        C5092dy[][] c5092dyArr9 = {null};
        int iM21837k42 = m21837k4(c5098m9, false, c5092dyArr9);
        C5092dy[] c5092dyArr10 = c5092dyArr9[0];
        int i5 = this.f14028dy;
        if (i5 == 0) {
            C5092dy[][] c5092dyArr11 = {this.f14027du};
            int[] iArr2 = {this.f14030m9};
            boolean zM21756k4 = AbstractC5089c5.m21756k4(c5092dyArr11, iArr2, c5092dyArr10, iM21837k42, i);
            this.f14027du = c5092dyArr11[0];
            this.f14030m9 = iArr2[0];
            return zM21756k4;
        }
        C5092dy[][] c5092dyArr12 = {this.f14029h4};
        int[] iArr3 = {i5};
        boolean zM21756k42 = AbstractC5089c5.m21756k4(c5092dyArr12, iArr3, c5092dyArr10, iM21837k42, i);
        C5092dy[] c5092dyArr13 = c5092dyArr12[0];
        this.f14029h4 = c5092dyArr13;
        int i6 = iArr3[0];
        this.f14028dy = i6;
        if (!zM21756k42) {
            return false;
        }
        this.f14027du = c5092dyArr13;
        this.f14030m9 = i6;
        this.f14029h4 = null;
        this.f14028dy = 0;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public boolean mo21870to(String str, String str2) {
        if (str != this.f14026c5) {
            this.f14026c5 = str != null ? mo21874x1().mo65268x1(str) : null;
        }
        C5092dy[][] c5092dyArr = {this.f14027du};
        int[] iArr = {this.f14030m9};
        boolean zM21765x1 = AbstractC5089c5.m21765x1(c5092dyArr, iArr, this.f14026c5, str2);
        this.f14027du = c5092dyArr[0];
        this.f14030m9 = iArr[0];
        return zM21765x1;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public boolean mo21855k4(AbstractC10925du abstractC10925du) {
        C5098m9 c5098m9 = (C5098m9) C7019kk.m27452k4((Object) abstractC10925du, C5098m9.class);
        if (c5098m9 == null) {
            return false;
        }
        this.f14027du = c5098m9.f14027du;
        this.f14030m9 = c5098m9.f14030m9;
        this.f14029h4 = c5098m9.f14029h4;
        this.f14028dy = c5098m9.f14028dy;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public boolean mo21856k4(String str, String str2, AbstractC10925du abstractC10925du) {
        if (str != this.f14026c5) {
            this.f14026c5 = str != null ? mo21874x1().mo65268x1(str) : null;
        }
        C5092dy[][] c5092dyArr = {null};
        int iM21837k4 = m21837k4((C5098m9) C7019kk.m27452k4((Object) abstractC10925du, C5098m9.class), false, c5092dyArr);
        C5092dy[] c5092dyArr2 = c5092dyArr[0];
        int i = this.f14028dy;
        if (i == 0) {
            C5092dy[][] c5092dyArr3 = {this.f14027du};
            int[] iArr = {this.f14030m9};
            boolean zM21757k4 = AbstractC5089c5.m21757k4(c5092dyArr3, iArr, c5092dyArr2, iM21837k4, this.f14026c5, str2);
            this.f14027du = c5092dyArr3[0];
            this.f14030m9 = iArr[0];
            return zM21757k4;
        }
        C5092dy[][] c5092dyArr4 = {this.f14029h4};
        int[] iArr2 = {i};
        boolean zM21757k42 = AbstractC5089c5.m21757k4(c5092dyArr4, iArr2, c5092dyArr2, iM21837k4, this.f14026c5, str2);
        C5092dy[] c5092dyArr5 = c5092dyArr4[0];
        this.f14029h4 = c5092dyArr5;
        int i2 = iArr2[0];
        this.f14028dy = i2;
        if (!zM21757k42) {
            return false;
        }
        this.f14027du = c5092dyArr5;
        this.f14030m9 = i2;
        this.f14029h4 = null;
        this.f14028dy = 0;
        return true;
    }
}
