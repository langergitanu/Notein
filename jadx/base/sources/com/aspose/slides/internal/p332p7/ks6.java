package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ks6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f25922h4 = new C7017h4("manifest:checksum-type", "manifest:checksum", "algorithm", "start-key-generation", "key-derivation");

    /* JADX INFO: renamed from: du */
    private cm5 f25923du;

    /* JADX INFO: renamed from: k4 */
    private String f25924k4;

    /* JADX INFO: renamed from: kk */
    private yh6 f25925kk;

    /* JADX INFO: renamed from: to */
    private ls9 f25926to;

    /* JADX INFO: renamed from: x1 */
    private String f25927x1;

    public ks6() {
        this.f25925kk = new yh6();
        this.f25923du = new cm5();
    }

    /* JADX INFO: renamed from: du */
    public final ls9 m35672du() {
        return this.f25926to;
    }

    /* JADX INFO: renamed from: h4 */
    public final cm5 m35673h4() {
        return this.f25923du;
    }

    /* JADX INFO: renamed from: kk */
    public final String m35676kk() {
        return this.f25927x1;
    }

    /* JADX INFO: renamed from: to */
    public final yh6 m35677to() {
        return this.f25925kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35678x1() {
        return this.f25924k4;
    }

    public ks6(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ks6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ks6.f25922h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    ks6.this.f25924k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                ks6.this.f25927x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ks6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ks6.f25922h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    ks6.this.f25925kk = new yh6(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    ks6.this.f25926to = new ls9(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ks6.this.f25923du = new cm5(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final ls9 m35674k4() {
        if (this.f25926to != null) {
            throw new Exception("Only one <start_key_generation> element can be added.");
        }
        ls9 ls9Var = new ls9();
        this.f25926to = ls9Var;
        return ls9Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35679x1(String str) {
        this.f25927x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35675k4(String str) {
        this.f25924k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("manifest:checksum-type", this.f25924k4);
        c3059ii.m12955x1("manifest:checksum", this.f25927x1);
        this.f25925kk.mo6846k4("manifest", c3059ii, "algorithm");
        ls9 ls9Var = this.f25926to;
        if (ls9Var != null) {
            ls9Var.mo6846k4("manifest", c3059ii, "start-key-generation");
        }
        this.f25923du.mo6846k4("manifest", c3059ii, "key-derivation");
        c3059ii.mo21898jd();
    }
}
