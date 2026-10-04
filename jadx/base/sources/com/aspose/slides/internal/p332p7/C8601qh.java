package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qh */
/* JADX INFO: loaded from: classes4.dex */
public class C8601qh extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28871du = new C7017h4("lnRef", "fillRef", "effectRef", "fontRef");

    /* JADX INFO: renamed from: k4 */
    private C8740s4 f28872k4;

    /* JADX INFO: renamed from: kk */
    private C8740s4 f28873kk;

    /* JADX INFO: renamed from: to */
    private C7803gv f28874to;

    /* JADX INFO: renamed from: x1 */
    private C8740s4 f28875x1;

    public C8601qh() {
        this.f28872k4 = new C8740s4();
        this.f28875x1 = new C8740s4();
        this.f28873kk = new C8740s4();
        this.f28874to = new C7803gv();
    }

    /* JADX INFO: renamed from: kk */
    public final C8740s4 m39496kk() {
        return this.f28873kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7803gv m39497to() {
        return this.f28874to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8740s4 m39498x1() {
        return this.f28875x1;
    }

    public C8601qh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8601qh.f28871du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8601qh.this.f28872k4 = new C8740s4(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8601qh.this.f28875x1 = new C8740s4(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8601qh.this.f28873kk = new C8740s4(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8601qh.this.f28874to = new C7803gv(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8740s4 m39495k4() {
        return this.f28872k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f28872k4.mo6846k4("a", c3059ii, "lnRef");
        this.f28875x1.mo6846k4("a", c3059ii, "fillRef");
        this.f28873kk.mo6846k4("a", c3059ii, "effectRef");
        this.f28874to.mo6846k4("a", c3059ii, "fontRef");
        c3059ii.mo21898jd();
    }
}
