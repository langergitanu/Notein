package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class tiw extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f30767du;

    /* JADX INFO: renamed from: dy */
    private gwj f30768dy;

    /* JADX INFO: renamed from: h4 */
    private int f30769h4;

    /* JADX INFO: renamed from: kk */
    private String f30770kk;

    /* JADX INFO: renamed from: m9 */
    private String f30771m9;

    /* JADX INFO: renamed from: to */
    private int f30772to;

    /* JADX INFO: renamed from: x1 */
    private long f30773x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f30766k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f30765c5 = new C7017h4("text:level", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data", "list-level-properties");

    public tiw() {
        m41747h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m41747h4() {
        this.f30772to = f30766k4;
        this.f30767du = 0;
        this.f30769h4 = 0;
    }

    /* JADX INFO: renamed from: to */
    public final gwj m41762to() {
        return this.f30768dy;
    }

    public tiw(final AbstractC13912i5 abstractC13912i5) {
        m41747h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tiw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tiw.f30765c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    tiw.this.f30773x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tiw.this.f30770kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    tiw.this.f30772to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    tiw.this.f30767du = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                tiw.this.f30769h4 = qs5.m39644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tiw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = tiw.f30765c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 5) {
                    if (iM27428k4 != 6) {
                        return false;
                    }
                    tiw.this.f30768dy = new gwj(abstractC13912i5);
                    return true;
                }
                tiw.this.f30771m9 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    tiw tiwVar = tiw.this;
                    tiwVar.f30771m9 = C14113y2.m67400k4(tiwVar.f30771m9, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final String m41760kk() {
        return this.f30770kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m41763x1() {
        return this.f30773x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final gwj m41756k4() {
        if (this.f30768dy != null) {
            throw new Exception("Only one <list_level_properties> element can be added.");
        }
        gwj gwjVar = new gwj();
        this.f30768dy = gwjVar;
        return gwjVar;
    }

    /* JADX INFO: renamed from: kk */
    public final void m41761kk(int i) {
        this.f30769h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41764x1(int i) {
        this.f30767du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41757k4(int i) {
        this.f30772to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41758k4(long j) {
        this.f30773x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41759k4(String str) {
        this.f30770kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        tiw tiwVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:level", C13850af.m65147x1(this.f30773x1));
        String str3 = this.f30770kk;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i = this.f30772to;
        if (i != f30766k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f30767du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f30769h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        String str4 = this.f30771m9;
        if (str4 != null) {
            tiwVar = this;
            c3059ii2 = c3059ii;
            tiwVar.m29301k4("office", c3059ii2, "binary-data", str4, false);
        } else {
            tiwVar = this;
            c3059ii2 = c3059ii;
        }
        gwj gwjVar = tiwVar.f30768dy;
        if (gwjVar != null) {
            gwjVar.mo6846k4("style", c3059ii2, "list-level-properties");
        }
        c3059ii2.mo21898jd();
    }
}
