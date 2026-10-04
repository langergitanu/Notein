package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class mfs extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f26836ck = new C7017h4("dr3d:min-edge", "dr3d:max-edge", "draw:z-index", "draw:id", "draw:layer", "draw:style-name", "draw:class-names", "presentation:style-name", "presentation:class-names", "dr3d:transform");

    /* JADX INFO: renamed from: c5 */
    private String f26837c5;

    /* JADX INFO: renamed from: du */
    private String f26838du;

    /* JADX INFO: renamed from: dy */
    private String f26839dy;

    /* JADX INFO: renamed from: h4 */
    private String f26840h4;

    /* JADX INFO: renamed from: jd */
    private String f26841jd;

    /* JADX INFO: renamed from: k4 */
    private String f26842k4;

    /* JADX INFO: renamed from: kk */
    private long f26843kk;

    /* JADX INFO: renamed from: m9 */
    private String f26844m9;

    /* JADX INFO: renamed from: to */
    private String f26845to;

    /* JADX INFO: renamed from: x1 */
    private String f26846x1;

    public mfs() {
        m36926x1();
    }

    public mfs(AbstractC13912i5 abstractC13912i5) {
        m36926x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mfs.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (mfs.f26836ck.m27428k4(str)) {
                    case 0:
                        mfs.this.f26842k4 = str2;
                        break;
                    case 1:
                        mfs.this.f26846x1 = str2;
                        break;
                    case 2:
                        mfs.this.f26843kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        mfs.this.f26845to = str2;
                        break;
                    case 4:
                        mfs.this.f26838du = str2;
                        break;
                    case 5:
                        mfs.this.f26840h4 = str2;
                        break;
                    case 6:
                        mfs.this.f26844m9 = str2;
                        break;
                    case 7:
                        mfs.this.f26839dy = str2;
                        break;
                    case 8:
                        mfs.this.f26837c5 = str2;
                        break;
                    case 9:
                        mfs.this.f26841jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m36926x1() {
        this.f26843kk = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26842k4;
        if (str3 != null) {
            c3059ii.m12955x1("dr3d:min-edge", str3);
        }
        String str4 = this.f26846x1;
        if (str4 != null) {
            c3059ii.m12955x1("dr3d:max-edge", str4);
        }
        long j = this.f26843kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("draw:z-index", C13850af.m65147x1(j));
        }
        String str5 = this.f26845to;
        if (str5 != null) {
            c3059ii.m12955x1("draw:id", str5);
        }
        String str6 = this.f26838du;
        if (str6 != null) {
            c3059ii.m12955x1("draw:layer", str6);
        }
        String str7 = this.f26840h4;
        if (str7 != null) {
            c3059ii.m12955x1("draw:style-name", str7);
        }
        String str8 = this.f26844m9;
        if (str8 != null) {
            c3059ii.m12955x1("draw:class-names", str8);
        }
        String str9 = this.f26839dy;
        if (str9 != null) {
            c3059ii.m12955x1("presentation:style-name", str9);
        }
        String str10 = this.f26837c5;
        if (str10 != null) {
            c3059ii.m12955x1("presentation:class-names", str10);
        }
        String str11 = this.f26841jd;
        if (str11 != null) {
            c3059ii.m12955x1("dr3d:transform", str11);
        }
        c3059ii.mo21898jd();
    }
}
