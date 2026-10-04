package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lu */
/* JADX INFO: loaded from: classes4.dex */
public class C8212lu extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f26513k4 = C8858tc.m41662k4("col");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26514to = new C7017h4("dir");

    /* JADX INFO: renamed from: kk */
    private String f26515kk;

    /* JADX INFO: renamed from: x1 */
    private int f26516x1;

    public C8212lu() {
        m36435kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m36435kk() {
        this.f26516x1 = f26513k4;
    }

    public C8212lu(AbstractC13912i5 abstractC13912i5) {
        m36435kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8212lu.f26514to.m27428k4(str) != 0) {
                    return false;
                }
                C8212lu.this.f26516x1 = C8858tc.m41662k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f26515kk = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36437k4() {
        return this.f26515kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36438k4(String str) {
        this.f26515kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26516x1;
        if (i != f26513k4) {
            c3059ii.m12955x1("dir", C8858tc.m41663k4(i));
        }
        c3059ii.mo21918x1(this.f26515kk);
        c3059ii.mo21898jd();
    }
}
