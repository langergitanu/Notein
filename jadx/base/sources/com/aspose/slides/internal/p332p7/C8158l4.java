package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l4 */
/* JADX INFO: loaded from: classes4.dex */
public class C8158l4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f26115k4 = syu.m41448k4("default");

    /* JADX INFO: renamed from: x1 */
    public static final int f26116x1 = pyy.m39203k4("custom");

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f26117x6 = new C7017h4("presentation:node-type", "presentation:preset-id", "presentation:preset-sub-type", "presentation:preset-class", "presentation:master-element", "presentation:group-id", "anim:id", "xlink:href", "anim:audio-level", "smil:begin", "smil:end", "smil:dur", "smil:repeatDur", "smil:repeatCount");

    /* JADX INFO: renamed from: c5 */
    private String f26118c5;

    /* JADX INFO: renamed from: ck */
    private double f26119ck;

    /* JADX INFO: renamed from: du */
    private String f26120du;

    /* JADX INFO: renamed from: dy */
    private String f26121dy;

    /* JADX INFO: renamed from: fa */
    private String f26122fa;

    /* JADX INFO: renamed from: h4 */
    private int f26123h4;

    /* JADX INFO: renamed from: jd */
    private String f26124jd;

    /* JADX INFO: renamed from: kk */
    private int f26125kk;

    /* JADX INFO: renamed from: ks */
    private String f26126ks;

    /* JADX INFO: renamed from: m9 */
    private String f26127m9;

    /* JADX INFO: renamed from: rv */
    private String f26128rv;

    /* JADX INFO: renamed from: to */
    private String f26129to;

    /* JADX INFO: renamed from: up */
    private String f26130up;

    /* JADX INFO: renamed from: yj */
    private String f26131yj;

    public C8158l4() {
        m35908x1();
    }

    public C8158l4(AbstractC13912i5 abstractC13912i5) {
        m35908x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8158l4.f26117x6.m27428k4(str)) {
                    case 0:
                        C8158l4.this.f26125kk = syu.m41448k4(str2);
                        break;
                    case 1:
                        C8158l4.this.f26129to = str2;
                        break;
                    case 2:
                        C8158l4.this.f26120du = str2;
                        break;
                    case 3:
                        C8158l4.this.f26123h4 = pyy.m39203k4(str2);
                        break;
                    case 4:
                        C8158l4.this.f26127m9 = str2;
                        break;
                    case 5:
                        C8158l4.this.f26121dy = str2;
                        break;
                    case 6:
                        C8158l4.this.f26118c5 = str2;
                        break;
                    case 7:
                        C8158l4.this.f26124jd = str2;
                        break;
                    case 8:
                        C8158l4.this.f26119ck = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 9:
                        C8158l4.this.f26122fa = str2;
                        break;
                    case 10:
                        C8158l4.this.f26130up = str2;
                        break;
                    case 11:
                        C8158l4.this.f26131yj = str2;
                        break;
                    case 12:
                        C8158l4.this.f26126ks = str2;
                        break;
                    case 13:
                        C8158l4.this.f26128rv = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35908x1() {
        this.f26125kk = f26115k4;
        this.f26123h4 = f26116x1;
        this.f26119ck = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26125kk;
        if (i != f26115k4) {
            c3059ii.m12955x1("presentation:node-type", syu.m41449k4(i));
        }
        String str3 = this.f26129to;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:preset-id", str3);
        }
        String str4 = this.f26120du;
        if (str4 != null) {
            c3059ii.m12955x1("presentation:preset-sub-type", str4);
        }
        int i2 = this.f26123h4;
        if (i2 != f26116x1) {
            c3059ii.m12955x1("presentation:preset-class", pyy.m39204k4(i2));
        }
        String str5 = this.f26127m9;
        if (str5 != null) {
            c3059ii.m12955x1("presentation:master-element", str5);
        }
        String str6 = this.f26121dy;
        if (str6 != null) {
            c3059ii.m12955x1("presentation:group-id", str6);
        }
        String str7 = this.f26118c5;
        if (str7 != null) {
            c3059ii.m12955x1("anim:id", str7);
        }
        String str8 = this.f26124jd;
        if (str8 != null) {
            c3059ii.m12955x1("xlink:href", str8);
        }
        if (!C14044b3.m66437kk(this.f26119ck)) {
            c3059ii.m12955x1("anim:audio-level", C13850af.m65101k4(this.f26119ck));
        }
        String str9 = this.f26122fa;
        if (str9 != null) {
            c3059ii.m12955x1("smil:begin", str9);
        }
        String str10 = this.f26130up;
        if (str10 != null) {
            c3059ii.m12955x1("smil:end", str10);
        }
        String str11 = this.f26131yj;
        if (str11 != null) {
            c3059ii.m12955x1("smil:dur", str11);
        }
        String str12 = this.f26126ks;
        if (str12 != null) {
            c3059ii.m12955x1("smil:repeatDur", str12);
        }
        String str13 = this.f26128rv;
        if (str13 != null) {
            c3059ii.m12955x1("smil:repeatCount", str13);
        }
        c3059ii.mo21898jd();
    }
}
