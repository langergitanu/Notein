package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.lt */
/* JADX INFO: loaded from: classes4.dex */
public final class C8210lt extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26505du = new C7017h4(C18437z2.f56754h, "encoding", "href");

    /* JADX INFO: renamed from: k4 */
    private String f26506k4;

    /* JADX INFO: renamed from: kk */
    private String f26507kk;

    /* JADX INFO: renamed from: to */
    private List<C8249m9> f26508to;

    /* JADX INFO: renamed from: x1 */
    private String f26509x1;

    public C8210lt() {
        this.f26508to = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36425k4() {
        return this.f26506k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m36428kk() {
        return this.f26507kk;
    }

    /* JADX INFO: renamed from: to */
    public final C8249m9[] m36430to() {
        return this.f26508to.toArray(new C8249m9[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m36431x1() {
        return this.f26509x1;
    }

    public C8210lt(AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8210lt.f26505du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8210lt.this.f26506k4 = str2;
                } else if (iM27428k4 == 1) {
                    C8210lt.this.f26509x1 = str2;
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8210lt.this.f26507kk = str2;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                return;
            }
            if (abstractC13912i5.mo65028jd() == 1) {
                f26505du.m27428k4(abstractC13912i5.mo65023fa());
                this.f26508to.addItem(new C8249m9(abstractC13912i5));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36426k4(C8249m9 c8249m9) {
        this.f26508to.addItem(c8249m9);
    }

    /* JADX INFO: renamed from: kk */
    public final void m36429kk(String str) {
        this.f26507kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m36432x1(String str) {
        this.f26509x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36427k4(String str) {
        this.f26506k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26506k4;
        if (str3 != null) {
            c3059ii.m12955x1(C18437z2.f56754h, str3);
        }
        String str4 = this.f26509x1;
        if (str4 != null) {
            c3059ii.m12955x1("encoding", str4);
        }
        String str5 = this.f26507kk;
        if (str5 != null) {
            c3059ii.m12955x1("href", str5);
        }
        List.Enumerator<C8249m9> it = this.f26508to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
