package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.cz */
/* JADX INFO: loaded from: classes5.dex */
public class C13876cz extends AbstractC13912i5 implements InterfaceC13896f9 {

    /* JADX INFO: renamed from: c5 */
    private boolean f46380c5;

    /* JADX INFO: renamed from: ck */
    private int f46381ck;

    /* JADX INFO: renamed from: du */
    private C14028yn f46382du;

    /* JADX INFO: renamed from: dy */
    private int f46383dy;

    /* JADX INFO: renamed from: fa */
    private int f46384fa;

    /* JADX INFO: renamed from: h4 */
    private int f46385h4;

    /* JADX INFO: renamed from: jd */
    private AbstractC13869c5 f46386jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13912i5 f46387k4;

    /* JADX INFO: renamed from: ks */
    private C14028yn f46389ks;

    /* JADX INFO: renamed from: m9 */
    private int f46390m9;

    /* JADX INFO: renamed from: up */
    private boolean f46392up;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13883dt f46393x1;

    /* JADX INFO: renamed from: yj */
    private InterfaceC13896f9 f46394yj;

    /* JADX INFO: renamed from: to */
    private C14028yn[] f46391to = new C14028yn[8];

    /* JADX INFO: renamed from: kk */
    private C14028yn[] f46388kk = new C14028yn[4];

    public C13876cz(AbstractC13912i5 abstractC13912i5, InterfaceC13896f9 interfaceC13896f9, AbstractC13869c5 abstractC13869c5) {
        this.f46387k4 = abstractC13912i5;
        this.f46394yj = interfaceC13896f9;
        this.f46386jd = abstractC13869c5;
        m65226ss();
    }

    /* JADX INFO: renamed from: gi */
    private void m65220gi() {
        this.f46383dy = this.f46387k4.mo65041qq();
        if (this.f46387k4.mo65035kk()) {
            int i = 0;
            do {
                C14028yn c14028ynM65222k4 = m65222k4(i);
                c14028ynM65222k4.m66389k4(this.f46387k4.mo65023fa(), this.f46387k4.mo65060yj(), this.f46387k4.mo65050up(), this.f46387k4.mo65058x6());
                c14028ynM65222k4.m66385k4(this.f46394yj);
                c14028ynM65222k4.m66395to(this.f46387k4.mo65042rv());
                i++;
            } while (this.f46387k4.mo65047to());
            this.f46387k4.mo65020du();
        }
    }

    /* JADX INFO: renamed from: h4 */
    private C14028yn m65221h4(int i) {
        C14028yn[] c14028ynArr = this.f46388kk;
        int i2 = this.f46390m9;
        C14028yn c14028yn = c14028ynArr[i2];
        if (c14028yn != null) {
            c14028yn.m66391kk(i);
            this.f46390m9++;
            return c14028yn;
        }
        if (i2 >= c14028ynArr.length - 1) {
            C14028yn[] c14028ynArr2 = new C14028yn[c14028ynArr.length * 2];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c14028ynArr), 0, AbstractC14092to.m67208k4((Object) c14028ynArr2), 0, this.f46388kk.length);
            this.f46388kk = c14028ynArr2;
        }
        C14028yn c14028yn2 = this.f46388kk[this.f46390m9];
        if (c14028yn2 == null) {
            c14028yn2 = new C14028yn(i);
            this.f46388kk[this.f46390m9] = c14028yn2;
        }
        this.f46390m9++;
        return c14028yn2;
    }

    /* JADX INFO: renamed from: kp */
    private void m65224kp() {
        this.f46383dy = 0;
        this.f46381ck = -1;
    }

    /* JADX INFO: renamed from: ss */
    private void m65226ss() {
        this.f46393x1 = this.f46387k4.mo65059yd();
        this.f46385h4 = 1;
        this.f46390m9 = 0;
        this.f46381ck = -1;
        this.f46384fa = -1;
        this.f46383dy = 0;
        this.f46382du = null;
        this.f46392up = false;
        if (this.f46387k4.mo65028jd() == 1) {
            C14028yn c14028ynM65221h4 = m65221h4(this.f46387k4.mo65028jd());
            c14028ynM65221h4.m66389k4(this.f46387k4.mo65023fa(), this.f46387k4.mo65060yj(), this.f46387k4.mo65050up(), this.f46387k4.mo65058x6());
            c14028ynM65221h4.m66385k4(this.f46394yj);
            m65220gi();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m65227x1(String str) {
        String strMo65268x1 = this.f46393x1.mo65268x1(str);
        if (strMo65268x1 == null) {
            return -1;
        }
        for (int i = 0; i < this.f46383dy; i++) {
            C14028yn c14028yn = this.f46391to[i];
            if (C13851ai.m65152k4(c14028yn.m66381k4(), strMo65268x1) && c14028yn.m66390kk().length() == 0) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final boolean ag_() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ah_() {
        return this.f46382du.m66375c5();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13896f9
    public final int ai_() {
        return this.f46382du.m66380jd();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ak */
    public char mo65014ak() {
        return this.f46387k4.mo65014ak();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ar */
    public boolean mo65015ar() {
        return this.f46385h4 == 4 && this.f46387k4.mo65015ar();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: b3 */
    public void mo65016b3() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: bv */
    public void mo65208bv() {
        int iM66393m9 = this.f46382du.m66393m9();
        if (iM66393m9 != 1) {
            if (iM66393m9 != 2) {
                mo65026h4();
                return;
            }
            mo65020du();
            if (this.f46387k4.mo65028jd() != 15 && !this.f46392up) {
                int iMo65058x6 = this.f46387k4.mo65058x6() - 1;
                while (this.f46387k4.mo65026h4() && this.f46387k4.mo65058x6() > iMo65058x6) {
                }
            }
        } else if (this.f46387k4.mo65028jd() != 15 && !this.f46392up) {
            int iMo65058x62 = this.f46387k4.mo65058x6() - 1;
            while (this.f46387k4.mo65026h4() && this.f46387k4.mo65058x6() > iMo65058x62) {
            }
        }
        this.f46387k4.mo65026h4();
        this.f46385h4 = 4;
        this.f46386jd.mo65212k4(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m65228c5() {
        C14028yn c14028ynM65221h4 = m65221h4(15);
        c14028ynM65221h4.m66389k4(this.f46387k4.mo65023fa(), this.f46387k4.mo65060yj(), this.f46387k4.mo65050up(), this.f46387k4.mo65058x6());
        c14028ynM65221h4.m66385k4((InterfaceC13896f9) C7019kk.m27452k4((Object) this.f46387k4, InterfaceC13896f9.class));
        if (this.f46387k4.mo65048u4()) {
            this.f46392up = true;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ck */
    public String mo65019ck() {
        return this.f46382du.m66382k4(this.f46393x1);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: du */
    public boolean mo65020du() {
        if (this.f46385h4 != 3 || this.f46382du.m66393m9() != 2) {
            return false;
        }
        this.f46384fa = 0;
        this.f46381ck = -1;
        mo65026h4();
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: dy */
    public boolean mo65021dy() {
        if (this.f46382du.m66393m9() != 2) {
            return false;
        }
        this.f46382du = m65223k4(this.f46382du.m66376du(), this.f46382du.m66394to() + 1);
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: fa */
    public String mo65023fa() {
        return this.f46382du.m66381k4();
    }

    /* JADX INFO: renamed from: g8 */
    public final void m65229g8() {
        this.f46385h4 = 3;
        this.f46384fa = 0;
        this.f46381ck = -1;
        mo65026h4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: jd */
    public int mo65028jd() {
        return this.f46382du.m66393m9();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: k4 */
    public C13906gx mo65029k4() {
        return this.f46387k4.mo65029k4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public String mo65034kk(int i) {
        if (i < 0 || i >= this.f46383dy) {
            throw new ArgumentOutOfRangeException(ContextChain.TAG_INFRA);
        }
        return this.f46391to[i].m66376du();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ks */
    public boolean mo65038ks() {
        return AbstractC13912i5.m65460du(this.f46382du.m66393m9());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: m9 */
    public int mo65039m9() {
        return this.f46387k4.mo65039m9();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ne */
    public String mo65040ne() {
        return this.f46387k4.mo65040ne();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: qq */
    public int mo65041qq() {
        return this.f46383dy;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: rv */
    public String mo65042rv() {
        return this.f46380c5 ? this.f46382du.m66379h4() : this.f46382du.m66376du();
    }

    /* JADX INFO: renamed from: sv */
    public final AbstractC13912i5 m65231sv() {
        return this.f46387k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public String mo65046to(String str) {
        int iM65227x1 = C14113y2.m67429to(str, ':') == -1 ? m65227x1(str) : m65225m9(str);
        if (iM65227x1 >= 0) {
            return this.f46391to[iM65227x1].m66376du();
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: u4 */
    public boolean mo65048u4() {
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: um */
    public void mo65049um() {
        this.f46387k4.mo65049um();
        this.f46385h4 = 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: up */
    public String mo65050up() {
        return this.f46382du.m66396x1();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: uz */
    public int mo65051uz() {
        return this.f46387k4.mo65051uz();
    }

    /* JADX INFO: renamed from: wp */
    public final InterfaceC13896f9 m65232wp() {
        return this.f46394yj;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x6 */
    public int mo65058x6() {
        return this.f46382du.m66394to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yd */
    public AbstractC13883dt mo65059yd() {
        return this.f46393x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yj */
    public String mo65060yj() {
        return this.f46382du.m66390kk();
    }

    /* JADX INFO: renamed from: k4 */
    private C14028yn m65222k4(int i) {
        C14028yn[] c14028ynArr = this.f46391to;
        C14028yn c14028yn = c14028ynArr[i];
        if (c14028yn != null) {
            c14028yn.m66391kk(2);
            return c14028yn;
        }
        if (i >= c14028ynArr.length - 1) {
            C14028yn[] c14028ynArr2 = new C14028yn[c14028ynArr.length * 2];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c14028ynArr), 0, AbstractC14092to.m67208k4((Object) c14028ynArr2), 0, this.f46391to.length);
            this.f46391to = c14028ynArr2;
        }
        C14028yn c14028yn2 = this.f46391to[i];
        if (c14028yn2 != null) {
            return c14028yn2;
        }
        C14028yn c14028yn3 = new C14028yn(2);
        this.f46391to[i] = c14028yn3;
        return c14028yn3;
    }

    /* JADX INFO: renamed from: m9 */
    private int m65225m9(String str) {
        String strMo65268x1 = this.f46393x1.mo65268x1(str);
        if (strMo65268x1 == null) {
            return -1;
        }
        for (int i = 0; i < this.f46383dy; i++) {
            if (C13851ai.m65152k4(this.f46391to[i].m66382k4(this.f46393x1), strMo65268x1)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo65026h4() {
        int i = this.f46385h4;
        C14028yn c14028ynM65221h4 = null;
        if (i == 1) {
            this.f46385h4 = 2;
            if (!this.f46387k4.mo65026h4()) {
                this.f46385h4 = 4;
                return false;
            }
            int iMo65028jd = this.f46387k4.mo65028jd();
            if (iMo65028jd == 1) {
                this.f46385h4 = 4;
                return false;
            }
            if (iMo65028jd != 3 && iMo65028jd != 4 && iMo65028jd != 7 && iMo65028jd != 8) {
                switch (iMo65028jd) {
                    case 15:
                        c14028ynM65221h4 = m65221h4(this.f46387k4.mo65028jd());
                        c14028ynM65221h4.m66389k4(this.f46387k4.mo65023fa(), this.f46387k4.mo65060yj(), this.f46387k4.mo65050up(), this.f46387k4.mo65058x6());
                        c14028ynM65221h4.m66385k4(this.f46394yj);
                        break;
                }
            } else {
                c14028ynM65221h4 = m65221h4(this.f46387k4.mo65028jd());
                c14028ynM65221h4.m66377du(this.f46387k4.mo65042rv());
                c14028ynM65221h4.m66385k4(this.f46394yj);
                c14028ynM65221h4.m66383k4(this.f46387k4.mo65058x6());
            }
            this.f46382du = c14028ynM65221h4;
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            int i2 = this.f46384fa;
            if (i2 < this.f46390m9) {
                this.f46382du = this.f46388kk[i2];
                if (i2 > 0) {
                    m65224kp();
                }
                this.f46384fa++;
                return true;
            }
            this.f46385h4 = 4;
            this.f46386jd.mo65212k4(this);
            if (this.f46387k4.mo65028jd() != 1 || this.f46392up) {
                return this.f46387k4.mo65026h4();
            }
            return true;
        }
        if (!this.f46387k4.mo65026h4()) {
            this.f46385h4 = 4;
            return false;
        }
        int iMo65028jd2 = this.f46387k4.mo65028jd();
        if (iMo65028jd2 == 1) {
            this.f46385h4 = 4;
            return false;
        }
        if (iMo65028jd2 != 3 && iMo65028jd2 != 4 && iMo65028jd2 != 7 && iMo65028jd2 != 8) {
            switch (iMo65028jd2) {
                case 15:
                    c14028ynM65221h4 = m65221h4(this.f46387k4.mo65028jd());
                    c14028ynM65221h4.m66389k4(this.f46387k4.mo65023fa(), this.f46387k4.mo65060yj(), this.f46387k4.mo65050up(), this.f46387k4.mo65058x6());
                    c14028ynM65221h4.m66385k4(this.f46394yj);
                    break;
            }
        } else {
            c14028ynM65221h4 = m65221h4(this.f46387k4.mo65028jd());
            c14028ynM65221h4.m66377du(this.f46387k4.mo65042rv());
            c14028ynM65221h4.m66385k4(this.f46394yj);
            c14028ynM65221h4.m66383k4(this.f46387k4.mo65058x6());
        }
        this.f46382du = c14028ynM65221h4;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65035kk() {
        if (this.f46383dy == 0) {
            return false;
        }
        this.f46381ck = 0;
        this.f46382du = this.f46391to[0];
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public boolean mo65047to() {
        int i = this.f46381ck;
        if (i + 1 >= this.f46383dy) {
            return false;
        }
        C14028yn[] c14028ynArr = this.f46391to;
        int i2 = i + 1;
        this.f46381ck = i2;
        this.f46382du = c14028ynArr[i2];
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public void mo65055x1(int i) {
        if (i < 0 || i >= this.f46383dy) {
            throw new ArgumentOutOfRangeException(ContextChain.TAG_INFRA);
        }
        this.f46381ck = i;
        this.f46382du = this.f46391to[i];
    }

    /* JADX INFO: renamed from: k4 */
    private C14028yn m65223k4(String str, int i) {
        if (this.f46389ks == null) {
            this.f46389ks = new C14028yn(3);
        }
        this.f46389ks.m66383k4(i);
        this.f46389ks.m66395to(str);
        return this.f46389ks;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65036kk(String str) {
        int iM65227x1 = C14113y2.m67429to(str, ':') == -1 ? m65227x1(str) : m65225m9(str);
        if (iM65227x1 < 0) {
            return false;
        }
        this.f46381ck = iM65227x1;
        this.f46382du = this.f46391to[iM65227x1];
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65233x1(AbstractC13912i5 abstractC13912i5) {
        this.f46387k4 = abstractC13912i5;
        m65226ss();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14028yn m65230k4(String str, String str2, int i, int i2, int i3) {
        C14028yn c14028ynM65221h4 = m65221h4(3);
        c14028ynM65221h4.m66388k4(str, str2);
        c14028ynM65221h4.m66384k4(i2, i3);
        c14028ynM65221h4.m66383k4(i);
        return c14028ynM65221h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65234x1(String str, String str2) {
        C14028yn c14028ynM65230k4 = m65230k4(str, str2, this.f46387k4.mo65058x6() + 1, 0, 0);
        int i = this.f46390m9;
        int i2 = i - 2;
        C14028yn[] c14028ynArr = this.f46388kk;
        C14028yn c14028yn = c14028ynArr[i2];
        c14028ynArr[i2] = c14028ynM65230k4;
        c14028ynArr[i - 1] = c14028yn;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        return this.f46387k4.mo13292k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public boolean mo65057x1() {
        return false;
    }
}
