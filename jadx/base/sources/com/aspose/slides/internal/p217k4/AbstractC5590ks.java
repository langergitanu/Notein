package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.ks */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5590ks extends AbstractC5596to implements InterfaceC5606yd {

    /* JADX INFO: renamed from: x1 */
    protected InterfaceC5585h4 f15409x1;

    public AbstractC5590ks() {
    }

    /* JADX INFO: renamed from: c5 */
    public InterfaceC5591lr mo22961c5() {
        InterfaceC5585h4 interfaceC5585h4 = this.f15409x1;
        C5579bv c5579bv = this.f15418k4;
        C5580c5 c5580c5 = new C5580c5(interfaceC5585h4, c5579bv.f15365yj, c5579bv.f15363up, c5579bv.f15357jd, m22962ck() - 1);
        c5580c5.mo22916k4(this.f15418k4.f15352ck);
        c5580c5.mo22918k4(this.f15418k4.f15360ks);
        c5580c5.mo22925x1(this.f15418k4.f15355fa);
        m22971x1(c5580c5);
        return c5580c5;
    }

    /* JADX INFO: renamed from: ck */
    public int m22962ck() {
        return this.f15409x1.mo22958x1();
    }

    /* JADX INFO: renamed from: dy */
    public abstract void mo22303dy() throws C5598um;

    /* JADX INFO: renamed from: jd */
    public void m22963jd() {
        this.f15409x1.mo22952k4();
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5596to
    /* JADX INFO: renamed from: k4 */
    public String mo22964k4(C5598um c5598um, String[] strArr) {
        if (c5598um instanceof C5586ix) {
            StringBuffer stringBuffer = new StringBuffer("mismatched character ");
            stringBuffer.append(m22970x1(c5598um.f15423dy));
            stringBuffer.append(" expecting ");
            stringBuffer.append(m22970x1(((C5586ix) c5598um).f15392k4));
            return stringBuffer.toString();
        }
        if (c5598um instanceof C5602wl) {
            StringBuffer stringBuffer2 = new StringBuffer("no viable alternative at character ");
            stringBuffer2.append(m22970x1(c5598um.f15423dy));
            return stringBuffer2.toString();
        }
        if (c5598um instanceof C5584fa) {
            StringBuffer stringBuffer3 = new StringBuffer("required (...)+ loop did not match anything at character ");
            stringBuffer3.append(m22970x1(c5598um.f15423dy));
            return stringBuffer3.toString();
        }
        if (c5598um instanceof C5595rv) {
            StringBuffer stringBuffer4 = new StringBuffer("mismatched character ");
            stringBuffer4.append(m22970x1(c5598um.f15423dy));
            stringBuffer4.append(" expecting set ");
            stringBuffer4.append(((C5595rv) c5598um).f15416k4);
            return stringBuffer4.toString();
        }
        if (c5598um instanceof C5593ne) {
            StringBuffer stringBuffer5 = new StringBuffer("mismatched character ");
            stringBuffer5.append(m22970x1(c5598um.f15423dy));
            stringBuffer5.append(" expecting set ");
            stringBuffer5.append(((C5593ne) c5598um).f15416k4);
            return stringBuffer5.toString();
        }
        if (!(c5598um instanceof C5605x6)) {
            return super.mo22964k4(c5598um, strArr);
        }
        C5605x6 c5605x6 = (C5605x6) c5598um;
        StringBuffer stringBuffer6 = new StringBuffer("mismatched character ");
        stringBuffer6.append(m22970x1(c5598um.f15423dy));
        stringBuffer6.append(" expecting set ");
        stringBuffer6.append(m22970x1(c5605x6.f15434k4));
        stringBuffer6.append("..");
        stringBuffer6.append(m22970x1(c5605x6.f15435x1));
        return stringBuffer6.toString();
    }

    /* JADX INFO: renamed from: kk */
    public void mo22969kk(C5598um c5598um) {
        this.f15409x1.mo22952k4();
    }

    /* JADX INFO: renamed from: m9 */
    public InterfaceC5591lr mo22339m9() {
        InterfaceC5591lr interfaceC5591lr;
        while (true) {
            C5579bv c5579bv = this.f15418k4;
            c5579bv.f15351c5 = null;
            c5579bv.f15363up = 0;
            c5579bv.f15357jd = this.f15409x1.mo22958x1();
            this.f15418k4.f15355fa = this.f15409x1.mo22947m9();
            this.f15418k4.f15352ck = this.f15409x1.mo22945h4();
            this.f15418k4.f15360ks = null;
            if (this.f15409x1.mo22951k4(1) == -1) {
                return InterfaceC5591lr.f15412jd;
            }
            try {
                mo22303dy();
                interfaceC5591lr = this.f15418k4.f15351c5;
            } catch (C5602wl e) {
                mo22968k4(e);
                mo22969kk(e);
            } catch (C5598um e2) {
                mo22968k4(e2);
            }
            if (interfaceC5591lr == null) {
                mo22961c5();
            } else if (interfaceC5591lr == InterfaceC5591lr.f15411fa) {
            }
            return this.f15418k4.f15351c5;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public String m22970x1(int i) {
        String strValueOf = String.valueOf((char) i);
        if (i == -1) {
            strValueOf = "<EOF>";
        } else if (i == 13) {
            strValueOf = "\\r";
        } else if (i == 9) {
            strValueOf = "\\t";
        } else if (i == 10) {
            strValueOf = "\\n";
        }
        StringBuffer stringBuffer = new StringBuffer("'");
        stringBuffer.append(strValueOf);
        stringBuffer.append("'");
        return stringBuffer.toString();
    }

    public AbstractC5590ks(InterfaceC5585h4 interfaceC5585h4, C5579bv c5579bv) {
        super(c5579bv);
        this.f15409x1 = interfaceC5585h4;
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5596to
    /* JADX INFO: renamed from: k4 */
    public void mo22965k4() {
        super.mo22965k4();
        InterfaceC5585h4 interfaceC5585h4 = this.f15409x1;
        if (interfaceC5585h4 != null) {
            interfaceC5585h4.mo22957to(0);
        }
        C5579bv c5579bv = this.f15418k4;
        if (c5579bv == null) {
            return;
        }
        c5579bv.f15351c5 = null;
        c5579bv.f15365yj = 0;
        c5579bv.f15363up = 0;
        c5579bv.f15357jd = -1;
        c5579bv.f15355fa = -1;
        c5579bv.f15352ck = -1;
        c5579bv.f15360ks = null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m22971x1(InterfaceC5591lr interfaceC5591lr) {
        this.f15418k4.f15351c5 = interfaceC5591lr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m22966k4(int i) throws C5586ix {
        if (this.f15409x1.mo22951k4(1) == i) {
            this.f15409x1.mo22952k4();
            this.f15418k4.f15353du = false;
            return;
        }
        C5579bv c5579bv = this.f15418k4;
        if (c5579bv.f15361m9 > 0) {
            c5579bv.f15353du = true;
        } else {
            C5586ix c5586ix = new C5586ix(i, this.f15409x1);
            mo22969kk(c5586ix);
            throw c5586ix;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m22972x1(String str) throws C5586ix {
        int i = 0;
        while (i < str.length()) {
            if (this.f15409x1.mo22951k4(1) != str.charAt(i)) {
                C5579bv c5579bv = this.f15418k4;
                if (c5579bv.f15361m9 > 0) {
                    c5579bv.f15353du = true;
                    return;
                } else {
                    C5586ix c5586ix = new C5586ix(str.charAt(i), this.f15409x1);
                    mo22969kk(c5586ix);
                    throw c5586ix;
                }
            }
            i++;
            this.f15409x1.mo22952k4();
            this.f15418k4.f15353du = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m22967k4(int i, int i2) throws C5605x6 {
        if (this.f15409x1.mo22951k4(1) >= i && this.f15409x1.mo22951k4(1) <= i2) {
            this.f15409x1.mo22952k4();
            this.f15418k4.f15353du = false;
            return;
        }
        C5579bv c5579bv = this.f15418k4;
        if (c5579bv.f15361m9 > 0) {
            c5579bv.f15353du = true;
        } else {
            C5605x6 c5605x6 = new C5605x6(i, i2, this.f15409x1);
            mo22969kk(c5605x6);
            throw c5605x6;
        }
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5596to
    /* JADX INFO: renamed from: k4 */
    public void mo22968k4(C5598um c5598um) {
        mo22464k4(mo22453h4(), c5598um);
    }
}
