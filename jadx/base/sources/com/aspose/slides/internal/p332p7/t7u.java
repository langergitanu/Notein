package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class t7u extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30599to = new C7017h4("meta:name", "meta:value-type");

    /* JADX INFO: renamed from: k4 */
    private String f30600k4;

    /* JADX INFO: renamed from: kk */
    private String f30601kk;

    /* JADX INFO: renamed from: x1 */
    private int f30602x1;

    public t7u() {
        m41557du();
    }

    /* JADX INFO: renamed from: du */
    private void m41557du() {
        this.f30602x1 = 0;
    }

    /* JADX INFO: renamed from: kk */
    public final String m41564kk() {
        return this.f30601kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m41565x1() {
        return this.f30602x1;
    }

    public t7u(AbstractC13912i5 abstractC13912i5) {
        m41557du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.t7u.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = t7u.f30599to.m27428k4(str);
                if (iM27428k4 == 0) {
                    t7u.this.f30600k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                t7u.this.f30602x1 = x5k.m44205k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f30599to)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f30601kk = C14113y2.m67400k4(this.f30601kk, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m41561k4() {
        return this.f30600k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41566x1(String str) {
        this.f30601kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41562k4(int i) {
        this.f30602x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41563k4(String str) {
        this.f30600k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("meta:name", this.f30600k4);
        int i = this.f30602x1;
        if (i != 0) {
            c3059ii.m12955x1("meta:value-type", x5k.m44206k4(i));
        }
        String str3 = this.f30601kk;
        if (str3 != null) {
            c3059ii.mo21918x1(str3);
        }
        c3059ii.mo21898jd();
    }
}
