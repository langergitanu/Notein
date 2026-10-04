package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zi */
/* JADX INFO: loaded from: classes4.dex */
public class C9373zi extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33914x1 = new C7017h4("fillRect");

    /* JADX INFO: renamed from: k4 */
    private C8629qv f33915k4;

    public C9373zi() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8629qv m45631k4() {
        if (this.f33915k4 != null) {
            throw new Exception("Only one <fillRect> element can be added.");
        }
        C8629qv c8629qv = new C8629qv();
        this.f33915k4 = c8629qv;
        return c8629qv;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8629qv m45632x1() {
        return this.f33915k4;
    }

    public C9373zi(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9373zi.f33914x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9373zi.this.f33915k4 = new C8629qv(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        C8629qv c8629qv = this.f33915k4;
        if (c8629qv != null) {
            c8629qv.mo6846k4("a", c3059ii, "fillRect");
        }
        c3059ii.mo21898jd();
    }
}
