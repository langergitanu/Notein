package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class him extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f24164c5 = new C7017h4("text:level", "text:style-name", "text:bullet-char", "style:num-prefix", "style:num-suffix", "text:bullet-relative-size", "list-level-properties", "text-properties");

    /* JADX INFO: renamed from: du */
    private String f24165du;

    /* JADX INFO: renamed from: dy */
    private zob f24166dy;

    /* JADX INFO: renamed from: h4 */
    private String f24167h4;

    /* JADX INFO: renamed from: k4 */
    private long f24168k4;

    /* JADX INFO: renamed from: kk */
    private char f24169kk;

    /* JADX INFO: renamed from: m9 */
    private gwj f24170m9;

    /* JADX INFO: renamed from: to */
    private String f24171to;

    /* JADX INFO: renamed from: x1 */
    private String f24172x1;

    public him() {
        m33450dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m33450dy() {
        this.f24169kk = (char) 0;
    }

    /* JADX INFO: renamed from: du */
    public final gwj m33460du() {
        return this.f24170m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final zob m33461h4() {
        return this.f24166dy;
    }

    /* JADX INFO: renamed from: kk */
    public final long m33465kk() {
        return this.f24168k4;
    }

    /* JADX INFO: renamed from: to */
    public final char m33466to() {
        return this.f24169kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final zob m33467x1() {
        if (this.f24166dy != null) {
            throw new Exception("Only one <text_properties> element can be added.");
        }
        zob zobVar = new zob();
        this.f24166dy = zobVar;
        return zobVar;
    }

    public him(final AbstractC13912i5 abstractC13912i5) {
        m33450dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.him.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = him.f24164c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    him.this.f24168k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    him.this.f24172x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    him.this.f24169kk = C13850af.m65075jd(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    him.this.f24171to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    him.this.f24165du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                him.this.f24167h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.him.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = him.f24164c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    him.this.f24170m9 = new gwj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                him.this.f24166dy = new zob(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final gwj m33462k4() {
        if (this.f24170m9 != null) {
            throw new Exception("Only one <list_level_properties> element can be added.");
        }
        gwj gwjVar = new gwj();
        this.f24170m9 = gwjVar;
        return gwjVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33463k4(char c) {
        this.f24169kk = c;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33464k4(long j) {
        this.f24168k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:level", C13850af.m65147x1(this.f24168k4));
        String str3 = this.f24172x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:bullet-char", C13850af.m65100k4(this.f24169kk));
        String str4 = this.f24171to;
        if (str4 != null) {
            c3059ii.m12955x1("style:num-prefix", str4);
        }
        String str5 = this.f24165du;
        if (str5 != null) {
            c3059ii.m12955x1("style:num-suffix", str5);
        }
        String str6 = this.f24167h4;
        if (str6 != null) {
            c3059ii.m12955x1("text:bullet-relative-size", str6);
        }
        gwj gwjVar = this.f24170m9;
        if (gwjVar != null) {
            gwjVar.mo6846k4("style", c3059ii, "list-level-properties");
        }
        zob zobVar = this.f24166dy;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        c3059ii.mo21898jd();
    }
}
