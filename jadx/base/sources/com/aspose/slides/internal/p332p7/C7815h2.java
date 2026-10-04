package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h2 */
/* JADX INFO: loaded from: classes4.dex */
public class C7815h2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f23813fa = new C7017h4("v:ext", "dgmstyle", "autoformat", "reverse", "autolayout", "dgmscalex", "dgmscaley", "dgmfontsize", "constrainbounds", "dgmbasetextscale", "relationtable");

    /* JADX INFO: renamed from: c5 */
    private String f23814c5;

    /* JADX INFO: renamed from: ck */
    private C8655r6 f23815ck;

    /* JADX INFO: renamed from: du */
    private int f23816du;

    /* JADX INFO: renamed from: dy */
    private int f23817dy;

    /* JADX INFO: renamed from: h4 */
    private int f23818h4;

    /* JADX INFO: renamed from: jd */
    private int f23819jd;

    /* JADX INFO: renamed from: k4 */
    private int f23820k4;

    /* JADX INFO: renamed from: kk */
    private int f23821kk;

    /* JADX INFO: renamed from: m9 */
    private int f23822m9;

    /* JADX INFO: renamed from: to */
    private int f23823to;

    /* JADX INFO: renamed from: x1 */
    private int f23824x1;

    public C7815h2() {
        m33028to();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m33031k4() {
        return this.f23823to;
    }

    public C7815h2(final AbstractC13912i5 abstractC13912i5) {
        m33028to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7815h2.f23813fa.m27428k4(str)) {
                    case 0:
                        C7815h2.this.f23820k4 = dmv.m30455k4(str2);
                        break;
                    case 1:
                        C7815h2.this.f23824x1 = C13850af.m65151yj(str2);
                        break;
                    case 2:
                        C7815h2.this.f23821kk = C9369zh.m45616k4(str2);
                        break;
                    case 3:
                        C7815h2.this.f23823to = C9369zh.m45616k4(str2);
                        break;
                    case 4:
                        C7815h2.this.f23816du = C9369zh.m45616k4(str2);
                        break;
                    case 5:
                        C7815h2.this.f23818h4 = C13850af.m65151yj(str2);
                        break;
                    case 6:
                        C7815h2.this.f23822m9 = C13850af.m65151yj(str2);
                        break;
                    case 7:
                        C7815h2.this.f23817dy = C13850af.m65151yj(str2);
                        break;
                    case 8:
                        C7815h2.this.f23814c5 = str2;
                        break;
                    case 9:
                        C7815h2.this.f23819jd = C13850af.m65151yj(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7815h2.f23813fa.m27428k4(abstractC13912i5.mo65023fa()) != 10) {
                    return false;
                }
                C7815h2.this.f23815ck = new C8655r6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: to */
    private void m33028to() {
        this.f23820k4 = 0;
        this.f23824x1 = 0;
        this.f23821kk = 0;
        this.f23823to = 0;
        this.f23816du = 0;
        this.f23818h4 = 0;
        this.f23822m9 = 0;
        this.f23817dy = 0;
        this.f23819jd = 0;
    }

    /* JADX INFO: renamed from: du */
    public final void m33030du(int i) {
        this.f23817dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8655r6 m33037x1() {
        return this.f23815ck;
    }

    /* JADX INFO: renamed from: kk */
    public final void m33035kk(int i) {
        this.f23818h4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m33036to(int i) {
        this.f23822m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33038x1(int i) {
        this.f23824x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33032k4(int i) {
        this.f23820k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33033k4(C8655r6 c8655r6) {
        this.f23815ck = c8655r6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33034k4(String str) {
        this.f23814c5 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23820k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        int i2 = this.f23824x1;
        if (i2 != 0) {
            c3059ii.m12955x1("dgmstyle", C13850af.m65103k4(i2));
        }
        int i3 = this.f23821kk;
        if (i3 != 0) {
            c3059ii.m12955x1("autoformat", C9369zh.m45617k4(i3));
        }
        int i4 = this.f23823to;
        if (i4 != 0) {
            c3059ii.m12955x1("reverse", C9369zh.m45617k4(i4));
        }
        int i5 = this.f23816du;
        if (i5 != 0) {
            c3059ii.m12955x1("autolayout", C9369zh.m45617k4(i5));
        }
        int i6 = this.f23818h4;
        if (i6 != 0) {
            c3059ii.m12955x1("dgmscalex", C13850af.m65103k4(i6));
        }
        int i7 = this.f23822m9;
        if (i7 != 0) {
            c3059ii.m12955x1("dgmscaley", C13850af.m65103k4(i7));
        }
        int i8 = this.f23817dy;
        if (i8 != 0) {
            c3059ii.m12955x1("dgmfontsize", C13850af.m65103k4(i8));
        }
        String str3 = this.f23814c5;
        if (str3 != null) {
            c3059ii.m12955x1("constrainbounds", str3);
        }
        int i9 = this.f23819jd;
        if (i9 != 0) {
            c3059ii.m12955x1("dgmbasetextscale", C13850af.m65103k4(i9));
        }
        C8655r6 c8655r6 = this.f23815ck;
        if (c8655r6 != null) {
            c8655r6.mo6846k4("o", c3059ii, "relationtable");
        }
        c3059ii.mo21898jd();
    }
}
