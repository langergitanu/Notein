package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ro */
/* JADX INFO: loaded from: classes4.dex */
public class C8692ro extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f29389du = new C7017h4("gapWidth", "upBars", "downBars", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8274mm f29390k4;

    /* JADX INFO: renamed from: kk */
    private C8833t4 f29391kk;

    /* JADX INFO: renamed from: to */
    private C7683fo f29392to;

    /* JADX INFO: renamed from: x1 */
    private C8833t4 f29393x1;

    public C8692ro() {
    }

    /* JADX INFO: renamed from: du */
    public final C8833t4 m40095du() {
        return this.f29393x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8833t4 m40096h4() {
        return this.f29391kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8833t4 m40099kk() {
        if (this.f29391kk != null) {
            throw new Exception("Only one <downBars> element can be added.");
        }
        C8833t4 c8833t4 = new C8833t4();
        this.f29391kk = c8833t4;
        return c8833t4;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m40100m9() {
        return this.f29392to;
    }

    /* JADX INFO: renamed from: to */
    public final C8274mm m40101to() {
        return this.f29390k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8833t4 m40102x1() {
        if (this.f29393x1 != null) {
            throw new Exception("Only one <upBars> element can be added.");
        }
        C8833t4 c8833t4 = new C8833t4();
        this.f29393x1 = c8833t4;
        return c8833t4;
    }

    public C8692ro(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ro.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8692ro.f29389du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8692ro.this.f29390k4 = new C8274mm(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8692ro.this.f29393x1 = new C8833t4(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8692ro.this.f29391kk = new C8833t4(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8692ro.this.f29392to = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8274mm m40097k4() {
        if (this.f29390k4 != null) {
            throw new Exception("Only one <gapWidth> element can be added.");
        }
        C8274mm c8274mm = new C8274mm();
        this.f29390k4 = c8274mm;
        return c8274mm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40098k4(AbstractC7414ck abstractC7414ck) {
        this.f29392to = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8274mm c8274mm = this.f29390k4;
        if (c8274mm != null) {
            c8274mm.mo6846k4("c", c3059ii, "gapWidth");
        }
        C8833t4 c8833t4 = this.f29393x1;
        if (c8833t4 != null) {
            c8833t4.mo6846k4("c", c3059ii, "upBars");
        }
        C8833t4 c8833t42 = this.f29391kk;
        if (c8833t42 != null) {
            c8833t42.mo6846k4("c", c3059ii, "downBars");
        }
        C7683fo c7683fo = this.f29392to;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
