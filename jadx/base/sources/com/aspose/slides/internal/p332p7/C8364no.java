package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.no */
/* JADX INFO: loaded from: classes4.dex */
public class C8364no extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f27482k4 = C9369zh.m45616k4("f");

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f27483rv = new C7017h4("v:ext", "on", C18437z2.f56754h, "gap", "angle", "dropauto", "drop", "distance", "lengthspecified", "length", "accentbar", "textborder", "minusx", "minusy");

    /* JADX INFO: renamed from: c5 */
    private String f27484c5;

    /* JADX INFO: renamed from: ck */
    private String f27485ck;

    /* JADX INFO: renamed from: du */
    private String f27486du;

    /* JADX INFO: renamed from: dy */
    private String f27487dy;

    /* JADX INFO: renamed from: fa */
    private int f27488fa;

    /* JADX INFO: renamed from: h4 */
    private int f27489h4;

    /* JADX INFO: renamed from: jd */
    private int f27490jd;

    /* JADX INFO: renamed from: kk */
    private int f27491kk;

    /* JADX INFO: renamed from: ks */
    private int f27492ks;

    /* JADX INFO: renamed from: m9 */
    private int f27493m9;

    /* JADX INFO: renamed from: to */
    private String f27494to;

    /* JADX INFO: renamed from: up */
    private int f27495up;

    /* JADX INFO: renamed from: x1 */
    private int f27496x1;

    /* JADX INFO: renamed from: yj */
    private int f27497yj;

    public C8364no() {
        m37749x1();
    }

    public C8364no(AbstractC13912i5 abstractC13912i5) {
        m37749x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.no.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8364no.f27483rv.m27428k4(str)) {
                    case 0:
                        C8364no.this.f27496x1 = dmv.m30455k4(str2);
                        break;
                    case 1:
                        C8364no.this.f27491kk = C9369zh.m45616k4(str2);
                        break;
                    case 2:
                        C8364no.this.f27494to = str2;
                        break;
                    case 3:
                        C8364no.this.f27486du = str2;
                        break;
                    case 4:
                        C8364no.this.f27489h4 = C7427co.m29703k4(str2);
                        break;
                    case 5:
                        C8364no.this.f27493m9 = C9369zh.m45616k4(str2);
                        break;
                    case 6:
                        C8364no.this.f27487dy = str2;
                        break;
                    case 7:
                        C8364no.this.f27484c5 = str2;
                        break;
                    case 8:
                        C8364no.this.f27490jd = C9369zh.m45616k4(str2);
                        break;
                    case 9:
                        C8364no.this.f27485ck = str2;
                        break;
                    case 10:
                        C8364no.this.f27488fa = C9369zh.m45616k4(str2);
                        break;
                    case 11:
                        C8364no.this.f27495up = C9369zh.m45616k4(str2);
                        break;
                    case 12:
                        C8364no.this.f27497yj = C9369zh.m45616k4(str2);
                        break;
                    case 13:
                        C8364no.this.f27492ks = C9369zh.m45616k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m37749x1() {
        this.f27496x1 = 0;
        this.f27491kk = 0;
        this.f27489h4 = 0;
        this.f27493m9 = 0;
        this.f27490jd = f27482k4;
        this.f27488fa = 0;
        this.f27495up = 0;
        this.f27497yj = 0;
        this.f27492ks = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f27496x1;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        int i2 = this.f27491kk;
        if (i2 != 0) {
            c3059ii.m12955x1("on", C9369zh.m45617k4(i2));
        }
        String str3 = this.f27494to;
        if (str3 != null) {
            c3059ii.m12955x1(C18437z2.f56754h, str3);
        }
        String str4 = this.f27486du;
        if (str4 != null) {
            c3059ii.m12955x1("gap", str4);
        }
        int i3 = this.f27489h4;
        if (i3 != 0) {
            c3059ii.m12955x1("angle", C7427co.m29704k4(i3));
        }
        int i4 = this.f27493m9;
        if (i4 != 0) {
            c3059ii.m12955x1("dropauto", C9369zh.m45617k4(i4));
        }
        String str5 = this.f27487dy;
        if (str5 != null) {
            c3059ii.m12955x1("drop", str5);
        }
        String str6 = this.f27484c5;
        if (str6 != null) {
            c3059ii.m12955x1("distance", str6);
        }
        int i5 = this.f27490jd;
        if (i5 != f27482k4) {
            c3059ii.m12955x1("lengthspecified", C9369zh.m45617k4(i5));
        }
        String str7 = this.f27485ck;
        if (str7 != null) {
            c3059ii.m12955x1("length", str7);
        }
        int i6 = this.f27488fa;
        if (i6 != 0) {
            c3059ii.m12955x1("accentbar", C9369zh.m45617k4(i6));
        }
        int i7 = this.f27495up;
        if (i7 != 0) {
            c3059ii.m12955x1("textborder", C9369zh.m45617k4(i7));
        }
        int i8 = this.f27497yj;
        if (i8 != 0) {
            c3059ii.m12955x1("minusx", C9369zh.m45617k4(i8));
        }
        int i9 = this.f27492ks;
        if (i9 != 0) {
            c3059ii.m12955x1("minusy", C9369zh.m45617k4(i9));
        }
        c3059ii.mo21898jd();
    }
}
