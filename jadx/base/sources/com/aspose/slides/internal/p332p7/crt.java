package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class crt extends AbstractC7361bz {

    /* JADX INFO: renamed from: uz */
    private static final C7017h4 f21184uz = new C7017h4("style:width", "style:rel-width", "table:align", "fo:margin-left", "fo:margin-right", "fo:margin-top", "fo:margin-bottom", "fo:margin", "style:page-number", "fo:break-before", "fo:break-after", "fo:background-color", "style:shadow", "fo:keep-with-next", "style:may-break-between-rows", "table:border-model", "style:writing-mode", "table:display", "background-image");

    /* JADX INFO: renamed from: c5 */
    private String f21185c5;

    /* JADX INFO: renamed from: ck */
    private int f21186ck;

    /* JADX INFO: renamed from: du */
    private String f21187du;

    /* JADX INFO: renamed from: dy */
    private String f21188dy;

    /* JADX INFO: renamed from: fa */
    private String f21189fa;

    /* JADX INFO: renamed from: h4 */
    private String f21190h4;

    /* JADX INFO: renamed from: ix */
    private fq4 f21191ix;

    /* JADX INFO: renamed from: jd */
    private int f21192jd;

    /* JADX INFO: renamed from: k4 */
    private String f21193k4;

    /* JADX INFO: renamed from: kk */
    private int f21194kk;

    /* JADX INFO: renamed from: ks */
    private byte f21195ks;

    /* JADX INFO: renamed from: m9 */
    private String f21196m9;

    /* JADX INFO: renamed from: ne */
    private byte f21197ne;

    /* JADX INFO: renamed from: rv */
    private int f21198rv;

    /* JADX INFO: renamed from: to */
    private String f21199to;

    /* JADX INFO: renamed from: u4 */
    private List<C8249m9> f21200u4;

    /* JADX INFO: renamed from: up */
    private String f21201up;

    /* JADX INFO: renamed from: x1 */
    private String f21202x1;

    /* JADX INFO: renamed from: x6 */
    private int f21203x6;

    /* JADX INFO: renamed from: yj */
    private int f21204yj;

    public crt() {
        m29751x1();
    }

    public crt(AbstractC13912i5 abstractC13912i5) {
        m29751x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.crt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (crt.f21184uz.m27428k4(str)) {
                    case 0:
                        crt.this.f21193k4 = str2;
                        break;
                    case 1:
                        crt.this.f21202x1 = str2;
                        break;
                    case 2:
                        crt.this.f21194kk = b8y.m28750k4(str2);
                        break;
                    case 3:
                        crt.this.f21199to = str2;
                        break;
                    case 4:
                        crt.this.f21187du = str2;
                        break;
                    case 5:
                        crt.this.f21190h4 = str2;
                        break;
                    case 6:
                        crt.this.f21196m9 = str2;
                        break;
                    case 7:
                        crt.this.f21188dy = str2;
                        break;
                    case 8:
                        crt.this.f21185c5 = str2;
                        break;
                    case 9:
                        crt.this.f21192jd = klc.m35482k4(str2);
                        break;
                    case 10:
                        crt.this.f21186ck = ev2.m31399k4(str2);
                        break;
                    case 11:
                        crt.this.f21189fa = str2;
                        break;
                    case 12:
                        crt.this.f21201up = str2;
                        break;
                    case 13:
                        crt.this.f21204yj = bbd.m28807k4(str2);
                        break;
                    case 14:
                        crt.this.f21195ks = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 15:
                        crt.this.f21198rv = jjy.m34731k4(str2);
                        break;
                    case 16:
                        crt.this.f21203x6 = fon.m31926k4(str2);
                        break;
                    case 17:
                        crt.this.f21197ne = AbstractC7361bz.m29296rv(str2);
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        if (f21184uz.m27428k4(abstractC13912i5.mo65023fa()) == 18) {
                            this.f21191ix = new fq4(abstractC13912i5);
                            break;
                        }
                        this.f21200u4.addItem(new C8249m9(abstractC13912i5));
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m29751x1() {
        this.f21194kk = 0;
        this.f21192jd = 0;
        this.f21186ck = 0;
        this.f21204yj = 0;
        this.f21195ks = (byte) -1;
        this.f21198rv = 0;
        this.f21203x6 = 0;
        this.f21197ne = (byte) -1;
        this.f21200u4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:width", this.f21193k4);
        c3059ii.m12955x1("style:rel-width", this.f21202x1);
        int i = this.f21194kk;
        if (i != 0) {
            c3059ii.m12955x1("table:align", b8y.m28751k4(i));
        }
        String str3 = this.f21199to;
        if (str3 != null) {
            c3059ii.m12955x1("fo:margin-left", str3);
        }
        String str4 = this.f21187du;
        if (str4 != null) {
            c3059ii.m12955x1("fo:margin-right", str4);
        }
        String str5 = this.f21190h4;
        if (str5 != null) {
            c3059ii.m12955x1("fo:margin-top", str5);
        }
        String str6 = this.f21196m9;
        if (str6 != null) {
            c3059ii.m12955x1("fo:margin-bottom", str6);
        }
        String str7 = this.f21188dy;
        if (str7 != null) {
            c3059ii.m12955x1("fo:margin", str7);
        }
        String str8 = this.f21185c5;
        if (str8 != null) {
            c3059ii.m12955x1("style:page-number", str8);
        }
        int i2 = this.f21192jd;
        if (i2 != 0) {
            c3059ii.m12955x1("fo:break-before", klc.m35483k4(i2));
        }
        int i3 = this.f21186ck;
        if (i3 != 0) {
            c3059ii.m12955x1("fo:break-after", ev2.m31400k4(i3));
        }
        String str9 = this.f21189fa;
        if (str9 != null) {
            c3059ii.m12955x1("fo:background-color", str9);
        }
        String str10 = this.f21201up;
        if (str10 != null) {
            c3059ii.m12955x1("style:shadow", str10);
        }
        int i4 = this.f21204yj;
        if (i4 != 0) {
            c3059ii.m12955x1("fo:keep-with-next", bbd.m28808k4(i4));
        }
        byte b = this.f21195ks;
        String str11 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("style:may-break-between-rows", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i5 = this.f21198rv;
        if (i5 != 0) {
            c3059ii.m12955x1("table:border-model", jjy.m34732k4(i5));
        }
        int i6 = this.f21203x6;
        if (i6 != 0) {
            c3059ii.m12955x1("style:writing-mode", fon.m31927k4(i6));
        }
        byte b2 = this.f21197ne;
        if (b2 != -1) {
            if (b2 == 1) {
                str11 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:display", str11);
        }
        fq4 fq4Var = this.f21191ix;
        if (fq4Var != null) {
            fq4Var.mo6846k4("style", c3059ii, "background-image");
        }
        List.Enumerator<C8249m9> it = this.f21200u4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
