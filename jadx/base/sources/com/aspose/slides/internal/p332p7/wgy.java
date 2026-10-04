package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class wgy extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32302du = new C7017h4("current", "show", "sqref", "scenario");

    /* JADX INFO: renamed from: k4 */
    private long f32303k4;

    /* JADX INFO: renamed from: kk */
    private String f32304kk;

    /* JADX INFO: renamed from: to */
    private List<y4s> f32305to;

    /* JADX INFO: renamed from: x1 */
    private long f32306x1;

    public wgy() {
        m43669x1();
    }

    public wgy(final AbstractC13912i5 abstractC13912i5) {
        m43669x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wgy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wgy.f32302du.m27428k4(str);
                if (iM27428k4 == 0) {
                    wgy.this.f32303k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    wgy.this.f32306x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                wgy.this.f32304kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wgy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (wgy.f32302du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                wgy.this.f32305to.addItem(new y4s(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m43669x1() {
        this.f32303k4 = 4294967295L;
        this.f32306x1 = 4294967295L;
        this.f32305to = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f32303k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("current", C13850af.m65147x1(j));
        }
        long j2 = this.f32306x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("show", C13850af.m65147x1(j2));
        }
        String str3 = this.f32304kk;
        if (str3 != null) {
            c3059ii.m12955x1("sqref", str3);
        }
        List.Enumerator<y4s> it = this.f32305to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "scenario");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
