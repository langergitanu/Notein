package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;

/* JADX INFO: loaded from: classes4.dex */
public class aa8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f19919kk = new C7017h4("office:version", "settings");

    /* JADX INFO: renamed from: k4 */
    private String f19920k4;

    /* JADX INFO: renamed from: x1 */
    private v1c f19921x1;

    public aa8() {
    }

    /* JADX INFO: renamed from: k4 */
    public final v1c m28089k4() {
        if (this.f19921x1 != null) {
            throw new Exception("Only one <settings> element can be added.");
        }
        v1c v1cVar = new v1c();
        this.f19921x1 = v1cVar;
        return v1cVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final v1c m28091x1() {
        return this.f19921x1;
    }

    public aa8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.aa8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (aa8.f19919kk.m27428k4(str) != 0) {
                    return false;
                }
                aa8.this.f19920k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.aa8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (aa8.f19919kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                aa8.this.f19921x1 = new v1c(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28090k4(v1c v1cVar) {
        this.f19921x1 = v1cVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("office", str2, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
        c3059ii.m12954to("xmlns", "ooo", null, "http://openoffice.org/2004/office");
        c3059ii.m12954to("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:config:1.0") == null) {
            c3059ii.m12954to("xmlns", NetworkService.Constants.CONFIG_SERVICE, null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
        }
        String str3 = this.f19920k4;
        if (str3 != null) {
            c3059ii.m12955x1("office:version", str3);
        }
        v1c v1cVar = this.f19921x1;
        if (v1cVar != null) {
            v1cVar.mo6846k4("office", c3059ii, "settings");
        }
        c3059ii.mo21898jd();
    }
}
