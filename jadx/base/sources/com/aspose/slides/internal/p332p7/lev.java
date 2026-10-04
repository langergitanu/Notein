package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class lev extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f26223du;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f26224h4;

    /* JADX INFO: renamed from: kk */
    private int f26225kk;

    /* JADX INFO: renamed from: m9 */
    private ltr f26226m9;

    /* JADX INFO: renamed from: to */
    private String f26227to;

    /* JADX INFO: renamed from: x1 */
    private boolean f26228x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f26222k4 = w0x.m43450k4("v3v4");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f26221dy = new C7017h4("showSpeakerNotes", "pubBrowser", NoteMeta.PROPERTY_TITLE, "r:id", "sldAll", "sldRg", "custShow", "extLst");

    public lev() {
        m36023x1();
    }

    public lev(final AbstractC13912i5 abstractC13912i5) {
        m36023x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lev.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lev.f26221dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    lev.this.f26228x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    lev.this.f26225kk = w0x.m43450k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    lev.this.f26227to = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                lev.this.f26223du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lev.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                lev levVar;
                C7394ca c7394ca;
                int iM27428k4 = lev.f26221dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    levVar = lev.this;
                    c7394ca = new C7394ca("sldAll", new qu9(abstractC13912i5));
                } else if (iM27428k4 == 5) {
                    levVar = lev.this;
                    c7394ca = new C7394ca("sldRg", new a9h(abstractC13912i5));
                } else {
                    if (iM27428k4 != 6) {
                        if (iM27428k4 != 7) {
                            return false;
                        }
                        lev.this.f26226m9 = new ltr(abstractC13912i5);
                        return true;
                    }
                    levVar = lev.this;
                    c7394ca = new C7394ca("custShow", new nkv(abstractC13912i5));
                }
                levVar.f26224h4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m36023x1() {
        this.f26228x1 = true;
        this.f26225kk = f26222k4;
        this.f26227to = "";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f26228x1;
        if (!z) {
            c3059ii.m12955x1("showSpeakerNotes", z ? "1" : "0");
        }
        int i = this.f26225kk;
        if (i != f26222k4) {
            c3059ii.m12955x1("pubBrowser", w0x.m43451k4(i));
        }
        if (!"".equals(this.f26227to)) {
            c3059ii.m12955x1(NoteMeta.PROPERTY_TITLE, this.f26227to);
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f26223du);
        C7394ca c7394ca = this.f26224h4;
        if (c7394ca != null) {
            int iM27428k4 = f26221dy.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 4) {
                ((qu9) this.f26224h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f26224h4.m29539k4());
            } else if (iM27428k4 == 5) {
                ((a9h) this.f26224h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f26224h4.m29539k4());
            } else if (iM27428k4 == 6) {
                ((nkv) this.f26224h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f26224h4.m29539k4());
            }
        }
        ltr ltrVar = this.f26226m9;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
