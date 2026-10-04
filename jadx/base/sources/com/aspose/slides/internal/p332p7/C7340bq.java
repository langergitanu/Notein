package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bq */
/* JADX INFO: loaded from: classes4.dex */
public class C7340bq extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f20648dy = new C7017h4("gdRefX", "minX", "maxX", "gdRefY", "minY", "maxY", "pos");

    /* JADX INFO: renamed from: du */
    private String f20649du;

    /* JADX INFO: renamed from: h4 */
    private String f20650h4;

    /* JADX INFO: renamed from: k4 */
    private String f20651k4;

    /* JADX INFO: renamed from: kk */
    private String f20652kk;

    /* JADX INFO: renamed from: m9 */
    private C7836hc f20653m9;

    /* JADX INFO: renamed from: to */
    private String f20654to;

    /* JADX INFO: renamed from: x1 */
    private String f20655x1;

    public C7340bq() {
        this.f20653m9 = new C7836hc();
    }

    /* JADX INFO: renamed from: du */
    public final String m29033du() {
        return this.f20649du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m29035h4() {
        return this.f20650h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m29039kk() {
        return this.f20652kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7836hc m29041m9() {
        return this.f20653m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m29042to() {
        return this.f20654to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29044x1() {
        return this.f20655x1;
    }

    public C7340bq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7340bq.f20648dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7340bq.this.f20651k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7340bq.this.f20655x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7340bq.this.f20652kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7340bq.this.f20654to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7340bq.this.f20649du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7340bq.this.f20650h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7340bq.f20648dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                C7340bq.this.f20653m9 = new C7836hc(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29037k4() {
        return this.f20651k4;
    }

    /* JADX INFO: renamed from: du */
    public final void m29034du(String str) {
        this.f20649du = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m29036h4(String str) {
        this.f20650h4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m29040kk(String str) {
        this.f20652kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m29043to(String str) {
        this.f20654to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29045x1(String str) {
        this.f20655x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29038k4(String str) {
        this.f20651k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20651k4;
        if (str3 != null) {
            c3059ii.m12955x1("gdRefX", str3);
        }
        String str4 = this.f20655x1;
        if (str4 != null) {
            c3059ii.m12955x1("minX", str4);
        }
        String str5 = this.f20652kk;
        if (str5 != null) {
            c3059ii.m12955x1("maxX", str5);
        }
        String str6 = this.f20654to;
        if (str6 != null) {
            c3059ii.m12955x1("gdRefY", str6);
        }
        String str7 = this.f20649du;
        if (str7 != null) {
            c3059ii.m12955x1("minY", str7);
        }
        String str8 = this.f20650h4;
        if (str8 != null) {
            c3059ii.m12955x1("maxY", str8);
        }
        this.f20653m9.mo6846k4("a", c3059ii, "pos");
        c3059ii.mo21898jd();
    }
}
