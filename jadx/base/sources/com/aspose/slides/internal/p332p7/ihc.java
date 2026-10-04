package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ihc extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f24696k4 = bjb.m28917k4("objectBoundingBox");

    /* JADX INFO: renamed from: x1 */
    public static final int f24697x1 = jwp.m35046k4("pad");

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f24698yj = new C7017h4("svg:gradientUnits", "svg:gradientTransform", "svg:spreadMethod", "draw:name", "draw:display-name", "svg:cx", "svg:cy", "svg:r", "svg:fx", "svg:fy", "stop");

    /* JADX INFO: renamed from: c5 */
    private String f24699c5;

    /* JADX INFO: renamed from: ck */
    private String f24700ck;

    /* JADX INFO: renamed from: du */
    private int f24701du;

    /* JADX INFO: renamed from: dy */
    private String f24702dy;

    /* JADX INFO: renamed from: fa */
    private String f24703fa;

    /* JADX INFO: renamed from: h4 */
    private String f24704h4;

    /* JADX INFO: renamed from: jd */
    private String f24705jd;

    /* JADX INFO: renamed from: kk */
    private int f24706kk;

    /* JADX INFO: renamed from: m9 */
    private String f24707m9;

    /* JADX INFO: renamed from: to */
    private String f24708to;

    /* JADX INFO: renamed from: up */
    private List<odi> f24709up;

    public ihc() {
        m34152x1();
    }

    public ihc(final AbstractC13912i5 abstractC13912i5) {
        m34152x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ihc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ihc.f24698yj.m27428k4(str)) {
                    case 0:
                        ihc.this.f24706kk = bjb.m28917k4(str2);
                        break;
                    case 1:
                        ihc.this.f24708to = str2;
                        break;
                    case 2:
                        ihc.this.f24701du = jwp.m35046k4(str2);
                        break;
                    case 3:
                        ihc.this.f24704h4 = str2;
                        break;
                    case 4:
                        ihc.this.f24707m9 = str2;
                        break;
                    case 5:
                        ihc.this.f24702dy = str2;
                        break;
                    case 6:
                        ihc.this.f24699c5 = str2;
                        break;
                    case 7:
                        ihc.this.f24705jd = str2;
                        break;
                    case 8:
                        ihc.this.f24700ck = str2;
                        break;
                    case 9:
                        ihc.this.f24703fa = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ihc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ihc.f24698yj.m27428k4(abstractC13912i5.mo65023fa()) != 10) {
                    return false;
                }
                ihc.this.f24709up.addItem(new odi(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m34152x1() {
        this.f24706kk = f24696k4;
        this.f24701du = f24697x1;
        this.f24702dy = "50%";
        this.f24699c5 = "50%";
        this.f24705jd = "50%";
        this.f24709up = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24706kk;
        if (i != f24696k4) {
            c3059ii.m12955x1("svg:gradientUnits", bjb.m28918k4(i));
        }
        String str3 = this.f24708to;
        if (str3 != null) {
            c3059ii.m12955x1("svg:gradientTransform", str3);
        }
        int i2 = this.f24701du;
        if (i2 != f24697x1) {
            c3059ii.m12955x1("svg:spreadMethod", jwp.m35047k4(i2));
        }
        c3059ii.m12955x1("draw:name", this.f24704h4);
        String str4 = this.f24707m9;
        if (str4 != null) {
            c3059ii.m12955x1("draw:display-name", str4);
        }
        if (!"50%".equals(this.f24702dy)) {
            c3059ii.m12955x1("svg:cx", this.f24702dy);
        }
        if (!"50%".equals(this.f24699c5)) {
            c3059ii.m12955x1("svg:cy", this.f24699c5);
        }
        if (!"50%".equals(this.f24705jd)) {
            c3059ii.m12955x1("svg:r", this.f24705jd);
        }
        String str5 = this.f24700ck;
        if (str5 != null) {
            c3059ii.m12955x1("svg:fx", str5);
        }
        String str6 = this.f24703fa;
        if (str6 != null) {
            c3059ii.m12955x1("svg:fy", str6);
        }
        List.Enumerator<odi> it = this.f24709up.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("svg", c3059ii, "stop");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
