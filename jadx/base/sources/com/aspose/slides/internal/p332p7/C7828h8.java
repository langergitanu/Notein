package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7828h8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f23978dy = new C7017h4("gdRefR", "minR", "maxR", "gdRefAng", "minAng", "maxAng", "pos");

    /* JADX INFO: renamed from: du */
    private String f23979du;

    /* JADX INFO: renamed from: h4 */
    private String f23980h4;

    /* JADX INFO: renamed from: k4 */
    private String f23981k4;

    /* JADX INFO: renamed from: kk */
    private String f23982kk;

    /* JADX INFO: renamed from: m9 */
    private C7836hc f23983m9;

    /* JADX INFO: renamed from: to */
    private String f23984to;

    /* JADX INFO: renamed from: x1 */
    private String f23985x1;

    public C7828h8() {
        this.f23983m9 = new C7836hc();
    }

    /* JADX INFO: renamed from: du */
    public final String m33212du() {
        return this.f23979du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m33214h4() {
        return this.f23980h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m33218kk() {
        return this.f23982kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7836hc m33220m9() {
        return this.f23983m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m33221to() {
        return this.f23984to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33223x1() {
        return this.f23985x1;
    }

    public C7828h8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7828h8.f23978dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7828h8.this.f23981k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7828h8.this.f23985x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7828h8.this.f23982kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7828h8.this.f23984to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7828h8.this.f23979du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7828h8.this.f23980h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7828h8.f23978dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                C7828h8.this.f23983m9 = new C7836hc(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m33216k4() {
        return this.f23981k4;
    }

    /* JADX INFO: renamed from: du */
    public final void m33213du(String str) {
        this.f23979du = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m33215h4(String str) {
        this.f23980h4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m33219kk(String str) {
        this.f23982kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m33222to(String str) {
        this.f23984to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33224x1(String str) {
        this.f23985x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33217k4(String str) {
        this.f23981k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23981k4;
        if (str3 != null) {
            c3059ii.m12955x1("gdRefR", str3);
        }
        String str4 = this.f23985x1;
        if (str4 != null) {
            c3059ii.m12955x1("minR", str4);
        }
        String str5 = this.f23982kk;
        if (str5 != null) {
            c3059ii.m12955x1("maxR", str5);
        }
        String str6 = this.f23984to;
        if (str6 != null) {
            c3059ii.m12955x1("gdRefAng", str6);
        }
        String str7 = this.f23979du;
        if (str7 != null) {
            c3059ii.m12955x1("minAng", str7);
        }
        String str8 = this.f23980h4;
        if (str8 != null) {
            c3059ii.m12955x1("maxAng", str8);
        }
        this.f23983m9.mo6846k4("a", c3059ii, "pos");
        c3059ii.mo21898jd();
    }
}
