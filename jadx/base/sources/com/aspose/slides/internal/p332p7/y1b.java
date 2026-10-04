package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class y1b extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f33167ck = new C7017h4("dr3d:center", "dr3d:size", "draw:z-index", "draw:id", "draw:layer", "draw:style-name", "draw:class-names", "presentation:style-name", "presentation:class-names", "dr3d:transform");

    /* JADX INFO: renamed from: c5 */
    private String f33168c5;

    /* JADX INFO: renamed from: du */
    private String f33169du;

    /* JADX INFO: renamed from: dy */
    private String f33170dy;

    /* JADX INFO: renamed from: h4 */
    private String f33171h4;

    /* JADX INFO: renamed from: jd */
    private String f33172jd;

    /* JADX INFO: renamed from: k4 */
    private String f33173k4;

    /* JADX INFO: renamed from: kk */
    private long f33174kk;

    /* JADX INFO: renamed from: m9 */
    private String f33175m9;

    /* JADX INFO: renamed from: to */
    private String f33176to;

    /* JADX INFO: renamed from: x1 */
    private String f33177x1;

    public y1b() {
        m44776x1();
    }

    public y1b(AbstractC13912i5 abstractC13912i5) {
        m44776x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.y1b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (y1b.f33167ck.m27428k4(str)) {
                    case 0:
                        y1b.this.f33173k4 = str2;
                        break;
                    case 1:
                        y1b.this.f33177x1 = str2;
                        break;
                    case 2:
                        y1b.this.f33174kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        y1b.this.f33176to = str2;
                        break;
                    case 4:
                        y1b.this.f33169du = str2;
                        break;
                    case 5:
                        y1b.this.f33171h4 = str2;
                        break;
                    case 6:
                        y1b.this.f33175m9 = str2;
                        break;
                    case 7:
                        y1b.this.f33170dy = str2;
                        break;
                    case 8:
                        y1b.this.f33168c5 = str2;
                        break;
                    case 9:
                        y1b.this.f33172jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m44776x1() {
        this.f33174kk = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33173k4;
        if (str3 != null) {
            c3059ii.m12955x1("dr3d:center", str3);
        }
        String str4 = this.f33177x1;
        if (str4 != null) {
            c3059ii.m12955x1("dr3d:size", str4);
        }
        long j = this.f33174kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("draw:z-index", C13850af.m65147x1(j));
        }
        String str5 = this.f33176to;
        if (str5 != null) {
            c3059ii.m12955x1("draw:id", str5);
        }
        String str6 = this.f33169du;
        if (str6 != null) {
            c3059ii.m12955x1("draw:layer", str6);
        }
        String str7 = this.f33171h4;
        if (str7 != null) {
            c3059ii.m12955x1("draw:style-name", str7);
        }
        String str8 = this.f33175m9;
        if (str8 != null) {
            c3059ii.m12955x1("draw:class-names", str8);
        }
        String str9 = this.f33170dy;
        if (str9 != null) {
            c3059ii.m12955x1("presentation:style-name", str9);
        }
        String str10 = this.f33168c5;
        if (str10 != null) {
            c3059ii.m12955x1("presentation:class-names", str10);
        }
        String str11 = this.f33172jd;
        if (str11 != null) {
            c3059ii.m12955x1("dr3d:transform", str11);
        }
        c3059ii.mo21898jd();
    }
}
