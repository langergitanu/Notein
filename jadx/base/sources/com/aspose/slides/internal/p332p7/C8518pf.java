package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pf */
/* JADX INFO: loaded from: classes4.dex */
public class C8518pf extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28399to = new C7017h4("sSupPr", "e", "sup");

    /* JADX INFO: renamed from: k4 */
    private C7577ej f28400k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f28401kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f28402x1;

    public C8518pf() {
        this.f28402x1 = new C9085w3();
        this.f28401kk = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7577ej m38890k4() {
        if (this.f28400k4 != null) {
            throw new Exception("Only one <sSupPr> element can be added.");
        }
        C7577ej c7577ej = new C7577ej();
        this.f28400k4 = c7577ej;
        return c7577ej;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m38891kk() {
        return this.f28402x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m38892to() {
        return this.f28401kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7577ej m38893x1() {
        return this.f28400k4;
    }

    public C8518pf(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8518pf.f28399to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8518pf.this.f28400k4 = new C7577ej(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8518pf.this.f28402x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8518pf.this.f28401kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7577ej c7577ej = this.f28400k4;
        if (c7577ej != null) {
            c7577ej.mo6846k4("m", c3059ii, "sSupPr");
        }
        this.f28402x1.mo6846k4("m", c3059ii, "e");
        this.f28401kk.mo6846k4("m", c3059ii, "sup");
        c3059ii.mo21898jd();
    }
}
