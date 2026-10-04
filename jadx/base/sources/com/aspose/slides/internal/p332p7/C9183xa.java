package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xa */
/* JADX INFO: loaded from: classes4.dex */
public class C9183xa extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32767x1 = new C7017h4("v:ext");

    /* JADX INFO: renamed from: k4 */
    private int f32768k4;

    public C9183xa() {
        m44273x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m44273x1() {
        this.f32768k4 = 0;
    }

    public C9183xa(AbstractC13912i5 abstractC13912i5) {
        m44273x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9183xa.f32767x1.m27428k4(str) != 0) {
                    return false;
                }
                C9183xa.this.f32768k4 = dmv.m30455k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32768k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        c3059ii.mo21898jd();
    }
}
