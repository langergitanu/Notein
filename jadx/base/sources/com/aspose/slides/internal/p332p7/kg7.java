package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class kg7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25650to = new C7017h4("text:ref-name", "text:reference-format");

    /* JADX INFO: renamed from: k4 */
    private String f25651k4;

    /* JADX INFO: renamed from: kk */
    private String f25652kk;

    /* JADX INFO: renamed from: x1 */
    private int f25653x1;

    public kg7() {
        m35356x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35356x1() {
        this.f25653x1 = 0;
    }

    public kg7(AbstractC13912i5 abstractC13912i5) {
        m35356x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kg7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kg7.f25650to.m27428k4(str);
                if (iM27428k4 == 0) {
                    kg7.this.f25651k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                kg7.this.f25653x1 = alc.m28300k4(str2);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f25650to)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f25652kk = C14113y2.m67400k4(this.f25652kk, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25651k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:ref-name", str3);
        }
        int i = this.f25653x1;
        if (i != 0) {
            c3059ii.m12955x1("text:reference-format", alc.m28301k4(i));
        }
        String str4 = this.f25652kk;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
