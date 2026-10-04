package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.et */
/* JADX INFO: loaded from: classes4.dex */
public class C7599et extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22411du = new C7017h4(NoteMeta.PROPERTY_TITLE, "plotArea", "legend", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8107km f22412k4;

    /* JADX INFO: renamed from: kk */
    private C7245ag f22413kk;

    /* JADX INFO: renamed from: to */
    private C7249ah f22414to;

    /* JADX INFO: renamed from: x1 */
    private C7809gy f22415x1;

    public C7599et() {
        this.f22415x1 = new C7809gy();
    }

    /* JADX INFO: renamed from: du */
    public final C7245ag m31295du() {
        return this.f22413kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8107km m31297kk() {
        return this.f22412k4;
    }

    /* JADX INFO: renamed from: to */
    public final C7809gy m31298to() {
        return this.f22415x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7245ag m31299x1() {
        if (this.f22413kk != null) {
            throw new Exception("Only one <legend> element can be added.");
        }
        C7245ag c7245ag = new C7245ag();
        this.f22413kk = c7245ag;
        return c7245ag;
    }

    public C7599et(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.et.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7599et.f22411du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7599et.this.f22412k4 = new C8107km(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7599et.this.f22415x1 = new C7809gy(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7599et.this.f22413kk = new C7245ag(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7599et.this.f22414to = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8107km m31296k4() {
        if (this.f22412k4 != null) {
            throw new Exception("Only one <title> element can be added.");
        }
        C8107km c8107km = new C8107km();
        this.f22412k4 = c8107km;
        return c8107km;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8107km c8107km = this.f22412k4;
        if (c8107km != null) {
            c8107km.mo6846k4("cx", c3059ii, NoteMeta.PROPERTY_TITLE);
        }
        this.f22415x1.mo6846k4("cx", c3059ii, "plotArea");
        C7245ag c7245ag = this.f22413kk;
        if (c7245ag != null) {
            c7245ag.mo6846k4("cx", c3059ii, "legend");
        }
        C7249ah c7249ah = this.f22414to;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
