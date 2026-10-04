package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ubs extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f31176du;

    /* JADX INFO: renamed from: dy */
    private String f31177dy;

    /* JADX INFO: renamed from: h4 */
    private int f31178h4;

    /* JADX INFO: renamed from: kk */
    private String f31179kk;

    /* JADX INFO: renamed from: m9 */
    private String f31180m9;

    /* JADX INFO: renamed from: to */
    private String f31181to;

    /* JADX INFO: renamed from: x1 */
    private String f31182x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f31175k4 = hom.m33559k4("left");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f31174c5 = new C7017h4("style:width", "style:rel-width", "style:color", "style:line-style", "style:adjustment", "style:distance-before-sep", "style:distance-after-sep");

    public ubs() {
        m42252x1();
    }

    public ubs(AbstractC13912i5 abstractC13912i5) {
        m42252x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ubs.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ubs.f31174c5.m27428k4(str)) {
                    case 0:
                        ubs.this.f31182x1 = str2;
                        break;
                    case 1:
                        ubs.this.f31179kk = str2;
                        break;
                    case 2:
                        ubs.this.f31181to = str2;
                        break;
                    case 3:
                        ubs.this.f31176du = jrz.m34917k4(str2);
                        break;
                    case 4:
                        ubs.this.f31178h4 = hom.m33559k4(str2);
                        break;
                    case 5:
                        ubs.this.f31180m9 = str2;
                        break;
                    case 6:
                        ubs.this.f31177dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m42252x1() {
        this.f31176du = 0;
        this.f31178h4 = f31175k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:width", this.f31182x1);
        c3059ii.m12955x1("style:rel-width", this.f31179kk);
        String str3 = this.f31181to;
        if (str3 != null) {
            c3059ii.m12955x1("style:color", str3);
        }
        int i = this.f31176du;
        if (i != 0) {
            c3059ii.m12955x1("style:line-style", jrz.m34918k4(i));
        }
        int i2 = this.f31178h4;
        if (i2 != f31175k4) {
            c3059ii.m12955x1("style:adjustment", hom.m33560k4(i2));
        }
        String str4 = this.f31180m9;
        if (str4 != null) {
            c3059ii.m12955x1("style:distance-before-sep", str4);
        }
        String str5 = this.f31177dy;
        if (str5 != null) {
            c3059ii.m12955x1("style:distance-after-sep", str5);
        }
        c3059ii.mo21898jd();
    }
}
