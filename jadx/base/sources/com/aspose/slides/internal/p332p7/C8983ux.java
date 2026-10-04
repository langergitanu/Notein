package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ux */
/* JADX INFO: loaded from: classes4.dex */
public class C8983ux extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31447k4 = C7399cd.m29565k4("std");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31448kk = new C7017h4("val");

    /* JADX INFO: renamed from: x1 */
    private int f31449x1;

    public C8983ux() {
        m42589kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m42589kk() {
        this.f31449x1 = f31447k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m42591k4() {
        return this.f31449x1;
    }

    public C8983ux(AbstractC13912i5 abstractC13912i5) {
        m42589kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ux.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8983ux.f31448kk.m27428k4(str) != 0) {
                    return false;
                }
                C8983ux.this.f31449x1 = C7399cd.m29565k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42592k4(int i) {
        this.f31449x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31449x1;
        if (i != f31447k4) {
            c3059ii.m12955x1("val", C7399cd.m29566k4(i));
        }
        c3059ii.mo21898jd();
    }
}
