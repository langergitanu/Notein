package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class rrr extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f29473jd = new C7017h4("draw:name", "draw:display-name", "draw:style", "draw:cx", "draw:cy", "draw:angle", "draw:border", "draw:start", "draw:end");

    /* JADX INFO: renamed from: c5 */
    private String f29474c5;

    /* JADX INFO: renamed from: du */
    private String f29475du;

    /* JADX INFO: renamed from: dy */
    private String f29476dy;

    /* JADX INFO: renamed from: h4 */
    private String f29477h4;

    /* JADX INFO: renamed from: k4 */
    private String f29478k4;

    /* JADX INFO: renamed from: kk */
    private int f29479kk;

    /* JADX INFO: renamed from: m9 */
    private String f29480m9;

    /* JADX INFO: renamed from: to */
    private String f29481to;

    /* JADX INFO: renamed from: x1 */
    private String f29482x1;

    public rrr() {
        m40197du();
    }

    /* JADX INFO: renamed from: kk */
    public final String m40210kk() {
        return this.f29474c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40213x1() {
        return this.f29476dy;
    }

    public rrr(AbstractC13912i5 abstractC13912i5) {
        m40197du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rrr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (rrr.f29473jd.m27428k4(str)) {
                    case 0:
                        rrr.this.f29478k4 = str2;
                        break;
                    case 1:
                        rrr.this.f29482x1 = str2;
                        break;
                    case 2:
                        rrr.this.f29479kk = ofw.m38240k4(str2);
                        break;
                    case 3:
                        rrr.this.f29481to = str2;
                        break;
                    case 4:
                        rrr.this.f29475du = str2;
                        break;
                    case 5:
                        rrr.this.f29477h4 = str2;
                        break;
                    case 6:
                        rrr.this.f29480m9 = str2;
                        break;
                    case 7:
                        rrr.this.f29476dy = str2;
                        break;
                    case 8:
                        rrr.this.f29474c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: du */
    private void m40197du() {
        this.f29479kk = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40207k4() {
        return this.f29478k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m40211kk(String str) {
        this.f29476dy = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m40212to(String str) {
        this.f29474c5 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40214x1(String str) {
        this.f29482x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40208k4(int i) {
        this.f29479kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40209k4(String str) {
        this.f29478k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:name", this.f29478k4);
        String str3 = this.f29482x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:display-name", str3);
        }
        c3059ii.m12955x1("draw:style", ofw.m38241k4(this.f29479kk));
        String str4 = this.f29481to;
        if (str4 != null) {
            c3059ii.m12955x1("draw:cx", str4);
        }
        String str5 = this.f29475du;
        if (str5 != null) {
            c3059ii.m12955x1("draw:cy", str5);
        }
        String str6 = this.f29477h4;
        if (str6 != null) {
            c3059ii.m12955x1("draw:angle", str6);
        }
        String str7 = this.f29480m9;
        if (str7 != null) {
            c3059ii.m12955x1("draw:border", str7);
        }
        String str8 = this.f29476dy;
        if (str8 != null) {
            c3059ii.m12955x1("draw:start", str8);
        }
        String str9 = this.f29474c5;
        if (str9 != null) {
            c3059ii.m12955x1("draw:end", str9);
        }
        c3059ii.mo21898jd();
    }
}
