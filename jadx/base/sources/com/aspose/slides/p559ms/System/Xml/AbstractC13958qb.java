package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.qb */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13958qb implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private char[] f46782k4;

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13958qb m65798k4(AbstractC3124b3 abstractC3124b3, C13907h0 c13907h0) {
        if (c13907h0 == null) {
            c13907h0 = new C13907h0();
        }
        return c13907h0.m65425k4(abstractC3124b3);
    }

    /* JADX INFO: renamed from: a_ */
    public abstract void mo21891a_(char[] cArr, int i, int i2);

    /* JADX INFO: renamed from: b_ */
    public void mo65654b_(boolean z) {
        if (!z || mo65743fa() == 5) {
            return;
        }
        mo21893du();
    }

    /* JADX INFO: renamed from: c5 */
    public abstract void mo65742c5();

    /* JADX INFO: renamed from: c5 */
    public void mo65655c5(String str) {
        if (str == null) {
            return;
        }
        mo21918x1(str);
    }

    /* JADX INFO: renamed from: ck */
    public abstract void mo21892ck();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        mo65654b_(true);
    }

    /* JADX INFO: renamed from: du */
    public void mo21893du() {
    }

    /* JADX INFO: renamed from: du */
    public abstract void mo21894du(String str);

    /* JADX INFO: renamed from: dy */
    public abstract void mo21895dy(String str);

    /* JADX INFO: renamed from: fa */
    public abstract int mo65743fa();

    /* JADX INFO: renamed from: h4 */
    public abstract void mo21896h4();

    /* JADX INFO: renamed from: h4 */
    public abstract void mo21897h4(String str);

    /* JADX INFO: renamed from: h4 */
    public final void m65802h4(String str, String str2, String str3) {
        m65804kk(str, str2);
        if (str3 != null && str3.length() != 0) {
            mo21918x1(str3);
        }
        mo21898jd();
    }

    /* JADX INFO: renamed from: jd */
    public abstract void mo21898jd();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo21900k4(char c);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo21901k4(char c, char c2);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo21907k4(String str, String str2);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo12953k4(String str, String str2, String str3);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo21908k4(String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo65186k4(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo21909k4(char[] cArr, int i, int i2);

    /* JADX INFO: renamed from: kk */
    public abstract void mo21910kk(String str);

    /* JADX INFO: renamed from: kk */
    public final void m65804kk(String str, String str2) {
        mo12953k4((String) null, str, str2);
    }

    /* JADX INFO: renamed from: m9 */
    public abstract void mo21913m9(String str);

    /* JADX INFO: renamed from: to */
    public final void m65806to(String str, String str2) {
        mo21915to(null, str, null);
        mo21918x1(str2);
        mo21917x1();
    }

    /* JADX INFO: renamed from: to */
    public abstract void mo21915to(String str, String str2, String str3);

    /* JADX INFO: renamed from: up */
    public final void m65807up(String str) {
        mo12953k4((String) null, str, (String) null);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo21917x1();

    /* JADX INFO: renamed from: x1 */
    public void mo65808x1(AbstractC13912i5 abstractC13912i5, boolean z) {
        if (abstractC13912i5 == null) {
            throw new ArgumentNullException("reader");
        }
        boolean zMo65479dq = abstractC13912i5.mo65479dq();
        int iMo65058x6 = abstractC13912i5.mo65028jd() == 0 ? -1 : abstractC13912i5.mo65058x6();
        while (true) {
            switch (abstractC13912i5.mo65028jd()) {
                case 1:
                    mo12953k4(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
                    mo65803k4(abstractC13912i5, z);
                    if (abstractC13912i5.mo65048u4()) {
                        mo21898jd();
                    }
                    break;
                case 3:
                    if (!zMo65479dq) {
                        mo21918x1(abstractC13912i5.mo65042rv());
                    } else {
                        if (this.f46782k4 == null) {
                            this.f46782k4 = new char[1024];
                        }
                        while (true) {
                            int iMo65482k4 = abstractC13912i5.mo65482k4(this.f46782k4, 0, 1024);
                            if (iMo65482k4 > 0) {
                                mo21909k4(this.f46782k4, 0, iMo65482k4);
                            }
                        }
                    }
                    break;
                case 4:
                    mo21894du(abstractC13912i5.mo65042rv());
                    break;
                case 5:
                    mo21910kk(abstractC13912i5.mo65019ck());
                    break;
                case 7:
                case 17:
                    mo21907k4(abstractC13912i5.mo65019ck(), abstractC13912i5.mo65042rv());
                    break;
                case 8:
                    mo21897h4(abstractC13912i5.mo65042rv());
                    break;
                case 10:
                    mo21908k4(abstractC13912i5.mo65019ck(), abstractC13912i5.mo65046to("PUBLIC"), abstractC13912i5.mo65046to("SYSTEM"), abstractC13912i5.mo65042rv());
                    break;
                case 13:
                case 14:
                    mo21913m9(abstractC13912i5.mo65042rv());
                    break;
                case 15:
                    mo21892ck();
                    break;
            }
            if (!abstractC13912i5.mo65026h4()) {
                return;
            }
            if (iMo65058x6 >= abstractC13912i5.mo65058x6() && (iMo65058x6 != abstractC13912i5.mo65058x6() || abstractC13912i5.mo65028jd() != 15)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo21918x1(String str);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo65747x1(boolean z);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13958qb m65799k4(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        if (c13907h0 == null) {
            c13907h0 = new C13907h0();
        }
        return c13907h0.m65426k4(abstractC3150x6);
    }

    /* JADX INFO: renamed from: du */
    public final void m65800du(String str, String str2) {
        m65802h4(str, null, str2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m65805kk(String str, String str2, String str3, String str4) {
        mo12953k4(str, str2, str3);
        if (str4 != null && str4.length() != 0) {
            mo21918x1(str4);
        }
        mo21898jd();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65809x1(String str, String str2, String str3, String str4) {
        mo21915to(str, str2, str3);
        mo21918x1(str4);
        mo21917x1();
    }

    /* JADX INFO: renamed from: du */
    public final void m65801du(String str, String str2, String str3) {
        mo21915to(null, str, str2);
        mo21918x1(str3);
        mo21917x1();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo65803k4(AbstractC13912i5 abstractC13912i5, boolean z) {
        if (abstractC13912i5 == null) {
            throw new ArgumentNullException("reader");
        }
        if (abstractC13912i5.mo65028jd() == 1 || abstractC13912i5.mo65028jd() == 17) {
            if (abstractC13912i5.mo65035kk()) {
                mo65803k4(abstractC13912i5, z);
                abstractC13912i5.mo65020du();
                return;
            }
            return;
        }
        if (abstractC13912i5.mo65028jd() != 2) {
            throw new XmlException("The current position on the Reader is neither an element nor an attribute.", C14113y2.f47374k4);
        }
        do {
            if (z || !abstractC13912i5.m65485qm()) {
                mo21915to(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
                while (abstractC13912i5.mo65021dy()) {
                    if (abstractC13912i5.mo65028jd() == 5) {
                        mo21910kk(abstractC13912i5.mo65019ck());
                    } else {
                        mo21918x1(abstractC13912i5.mo65042rv());
                    }
                }
                mo21917x1();
            }
        } while (abstractC13912i5.mo65047to());
    }

    /* JADX INFO: renamed from: x1 */
    public void mo65659x1(byte[] bArr, int i, int i2) {
        C13982to.m65918k4(bArr, i, i2, this);
    }
}
