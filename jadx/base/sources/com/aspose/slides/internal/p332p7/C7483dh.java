package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dh */
/* JADX INFO: loaded from: classes4.dex */
public class C7483dh extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f21639k4;

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f21640rv;

    /* JADX INFO: renamed from: x1 */
    public static final C14047bz f21641x1;

    /* JADX INFO: renamed from: c5 */
    private int f21642c5;

    /* JADX INFO: renamed from: ck */
    private String f21643ck;

    /* JADX INFO: renamed from: dy */
    private int f21645dy;

    /* JADX INFO: renamed from: fa */
    private String f21646fa;

    /* JADX INFO: renamed from: jd */
    private String f21648jd;

    /* JADX INFO: renamed from: kk */
    private int f21649kk;

    /* JADX INFO: renamed from: ks */
    private String f21650ks;

    /* JADX INFO: renamed from: m9 */
    private int f21651m9;

    /* JADX INFO: renamed from: to */
    private int f21652to;

    /* JADX INFO: renamed from: up */
    private String f21653up;

    /* JADX INFO: renamed from: yj */
    private String f21654yj;

    /* JADX INFO: renamed from: du */
    private C14047bz f21644du = new C14047bz();

    /* JADX INFO: renamed from: h4 */
    private C14047bz f21647h4 = new C14047bz();

    static {
        C14047bz c14047bz = C14047bz.f47172k4;
        f21639k4 = c14047bz.Clone();
        f21641x1 = c14047bz.Clone();
        f21640rv = new C7017h4("v:ext", "issignatureline", "id", "provid", "signinginstructionsset", "allowcomments", "showsigndate", "o:suggestedsigner", "o:suggestedsigner2", "o:suggestedsigneremail", "signinginstructions", "addlxml", "sigprovurl");
    }

    public C7483dh() {
        m30356x1();
    }

    public C7483dh(AbstractC13912i5 abstractC13912i5) {
        m30356x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7483dh.f21640rv.m27428k4(str)) {
                    case 0:
                        C7483dh.this.f21649kk = dmv.m30455k4(str2);
                        break;
                    case 1:
                        C7483dh.this.f21652to = C9369zh.m45616k4(str2);
                        break;
                    case 2:
                        C7483dh.this.f21644du = new C14047bz(str2);
                        break;
                    case 3:
                        C7483dh.this.f21647h4 = new C14047bz(str2);
                        break;
                    case 4:
                        C7483dh.this.f21651m9 = C9369zh.m45616k4(str2);
                        break;
                    case 5:
                        C7483dh.this.f21645dy = C9369zh.m45616k4(str2);
                        break;
                    case 6:
                        C7483dh.this.f21642c5 = C9369zh.m45616k4(str2);
                        break;
                    case 7:
                        C7483dh.this.f21648jd = str2;
                        break;
                    case 8:
                        C7483dh.this.f21643ck = str2;
                        break;
                    case 9:
                        C7483dh.this.f21646fa = str2;
                        break;
                    case 10:
                        C7483dh.this.f21653up = str2;
                        break;
                    case 11:
                        C7483dh.this.f21654yj = str2;
                        break;
                    case 12:
                        C7483dh.this.f21650ks = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m30356x1() {
        this.f21649kk = 0;
        this.f21652to = 0;
        f21639k4.CloneTo(this.f21644du);
        f21641x1.CloneTo(this.f21647h4);
        this.f21651m9 = 0;
        this.f21645dy = 0;
        this.f21642c5 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21649kk;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        int i2 = this.f21652to;
        if (i2 != 0) {
            c3059ii.m12955x1("issignatureline", C9369zh.m45617k4(i2));
        }
        if (C14047bz.m66537x1(this.f21644du, f21639k4)) {
            c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f21644du), "}"));
        }
        if (C14047bz.m66537x1(this.f21647h4, f21641x1)) {
            c3059ii.m12955x1("provid", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f21647h4), "}"));
        }
        int i3 = this.f21651m9;
        if (i3 != 0) {
            c3059ii.m12955x1("signinginstructionsset", C9369zh.m45617k4(i3));
        }
        int i4 = this.f21645dy;
        if (i4 != 0) {
            c3059ii.m12955x1("allowcomments", C9369zh.m45617k4(i4));
        }
        int i5 = this.f21642c5;
        if (i5 != 0) {
            c3059ii.m12955x1("showsigndate", C9369zh.m45617k4(i5));
        }
        String str3 = this.f21648jd;
        if (str3 != null) {
            c3059ii.m12955x1("o:suggestedsigner", str3);
        }
        String str4 = this.f21643ck;
        if (str4 != null) {
            c3059ii.m12955x1("o:suggestedsigner2", str4);
        }
        String str5 = this.f21646fa;
        if (str5 != null) {
            c3059ii.m12955x1("o:suggestedsigneremail", str5);
        }
        String str6 = this.f21653up;
        if (str6 != null) {
            c3059ii.m12955x1("signinginstructions", str6);
        }
        String str7 = this.f21654yj;
        if (str7 != null) {
            c3059ii.m12955x1("addlxml", str7);
        }
        String str8 = this.f21650ks;
        if (str8 != null) {
            c3059ii.m12955x1("sigprovurl", str8);
        }
        c3059ii.mo21898jd();
    }
}
