package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fc */
/* JADX INFO: loaded from: classes4.dex */
public class C7660fc extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22786kk = new C7017h4("clrScheme", "clrMap");

    /* JADX INFO: renamed from: k4 */
    private C7238ae f22787k4;

    /* JADX INFO: renamed from: x1 */
    private C7341br f22788x1;

    public C7660fc() {
        this.f22787k4 = new C7238ae();
    }

    /* JADX INFO: renamed from: kk */
    public final C7341br m31735kk() {
        return this.f22788x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7238ae m31736x1() {
        return this.f22787k4;
    }

    public C7660fc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7660fc.f22786kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7660fc.this.f22787k4 = new C7238ae(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7660fc.this.f22788x1 = new C7341br(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7341br m31734k4() {
        if (this.f22788x1 != null) {
            throw new Exception("Only one <clrMap> element can be added.");
        }
        C7341br c7341br = new C7341br();
        this.f22788x1 = c7341br;
        return c7341br;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f22787k4.mo6846k4("a", c3059ii, "clrScheme");
        C7341br c7341br = this.f22788x1;
        if (c7341br != null) {
            c7341br.mo6846k4("a", c3059ii, "clrMap");
        }
        c3059ii.mo21898jd();
    }
}
