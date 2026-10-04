package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;

/* JADX INFO: loaded from: classes4.dex */
public class oss extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f28084h4 = new C7017h4("office:version", "scripts", "font-face-decls", "automatic-styles", "body");

    /* JADX INFO: renamed from: du */
    private yxj f28085du;

    /* JADX INFO: renamed from: k4 */
    private String f28086k4;

    /* JADX INFO: renamed from: kk */
    private rgn f28087kk;

    /* JADX INFO: renamed from: to */
    private j4l f28088to;

    /* JADX INFO: renamed from: x1 */
    private e3c f28089x1;

    public oss() {
        this.f28085du = new yxj();
    }

    /* JADX INFO: renamed from: kk */
    public final yxj m38436kk() {
        return this.f28085du;
    }

    /* JADX INFO: renamed from: x1 */
    public final j4l m38437x1() {
        return this.f28088to;
    }

    public oss(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oss.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (oss.f28084h4.m27428k4(str) != 0) {
                    return false;
                }
                oss.this.f28086k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oss.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = oss.f28084h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    oss.this.f28089x1 = new e3c(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    oss.this.f28087kk = new rgn(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    oss.this.f28088to = new j4l(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    oss.this.f28085du = new yxj(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final j4l m38435k4() {
        if (this.f28088to != null) {
            throw new Exception("Only one <automatic_styles> element can be added.");
        }
        j4l j4lVar = new j4l();
        this.f28088to = j4lVar;
        return j4lVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("office", str2, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
        c3059ii.m12954to("xmlns", "ooo", null, "http://openoffice.org/2004/office");
        c3059ii.m12954to("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:script:1.0") == null) {
            c3059ii.m12954to("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
        }
        if (c3059ii.mo12952k4("http://www.w3.org/1999/xlink") == null) {
            c3059ii.m12954to("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0") == null) {
            c3059ii.m12954to("xmlns", "presentation", null, "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:style:1.0") == null) {
            c3059ii.m12954to("xmlns", "style", null, "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0") == null) {
            c3059ii.m12954to("xmlns", "svg", null, "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:chart:1.0") == null) {
            c3059ii.m12954to("xmlns", "chart", null, "urn:oasis:names:tc:opendocument:xmlns:chart:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            c3059ii.m12954to("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:drawing:1.0") == null) {
            c3059ii.m12954to("xmlns", "draw", null, "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0") == null) {
            c3059ii.m12954to("xmlns", "fo", null, "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0") == null) {
            c3059ii.m12954to("xmlns", "dr3d", null, "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:table:1.0") == null) {
            c3059ii.m12954to("xmlns", "table", null, "urn:oasis:names:tc:opendocument:xmlns:table:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0") == null) {
            c3059ii.m12954to("xmlns", "smil", null, "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
            c3059ii.m12954to("xmlns", "number", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:form:1.0") == null) {
            c3059ii.m12954to("xmlns", "form", null, "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
        }
        if (c3059ii.mo12952k4("http://www.w3.org/2002/xforms") == null) {
            c3059ii.m12954to("xmlns", "xforms", null, "http://www.w3.org/2002/xforms");
        }
        if (c3059ii.mo12952k4("http://purl.org/dc/elements/1.1/") == null) {
            c3059ii.m12954to("xmlns", AzureActiveDirectorySlice.DC_PARAMETER, null, "http://purl.org/dc/elements/1.1/");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:meta:1.0") == null) {
            c3059ii.m12954to("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
        }
        if (c3059ii.mo12952k4("http://openoffice.org/2010/draw") == null) {
            c3059ii.m12954to("xmlns", "drawooo", null, "http://openoffice.org/2010/draw");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:config:1.0") == null) {
            c3059ii.m12954to("xmlns", NetworkService.Constants.CONFIG_SERVICE, null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:animation:1.0") == null) {
            c3059ii.m12954to("xmlns", "anim", null, "urn:oasis:names:tc:opendocument:xmlns:animation:1.0");
        }
        if (c3059ii.mo12952k4("urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0") == null) {
            c3059ii.m12954to("xmlns", "loext", null, "urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0");
        }
        String str3 = this.f28086k4;
        if (str3 != null) {
            c3059ii.m12955x1("office:version", str3);
        }
        e3c e3cVar = this.f28089x1;
        if (e3cVar != null) {
            e3cVar.mo6846k4("office", c3059ii, "scripts");
        }
        rgn rgnVar = this.f28087kk;
        if (rgnVar != null) {
            rgnVar.mo6846k4("office", c3059ii, "font-face-decls");
        }
        j4l j4lVar = this.f28088to;
        if (j4lVar != null) {
            j4lVar.mo6846k4("office", c3059ii, "automatic-styles");
        }
        this.f28085du.mo6846k4("office", c3059ii, "body");
        c3059ii.mo21898jd();
    }
}
