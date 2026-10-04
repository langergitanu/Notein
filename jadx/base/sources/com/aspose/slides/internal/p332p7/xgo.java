package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;

/* JADX INFO: loaded from: classes4.dex */
public class xgo extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32820h4 = new C7017h4("office:version", "font-face-decls", "styles", "automatic-styles", "master-styles");

    /* JADX INFO: renamed from: du */
    private yq7 f32821du;

    /* JADX INFO: renamed from: k4 */
    private String f32822k4;

    /* JADX INFO: renamed from: kk */
    private mbw f32823kk;

    /* JADX INFO: renamed from: to */
    private j4l f32824to;

    /* JADX INFO: renamed from: x1 */
    private rgn f32825x1;

    public xgo() {
    }

    /* JADX INFO: renamed from: du */
    public final j4l m44343du() {
        return this.f32824to;
    }

    /* JADX INFO: renamed from: h4 */
    public final yq7 m44344h4() {
        return this.f32821du;
    }

    /* JADX INFO: renamed from: kk */
    public final yq7 m44346kk() {
        if (this.f32821du != null) {
            throw new Exception("Only one <master_styles> element can be added.");
        }
        yq7 yq7Var = new yq7();
        this.f32821du = yq7Var;
        return yq7Var;
    }

    /* JADX INFO: renamed from: to */
    public final mbw m44347to() {
        return this.f32823kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final j4l m44348x1() {
        if (this.f32824to != null) {
            throw new Exception("Only one <automatic_styles> element can be added.");
        }
        j4l j4lVar = new j4l();
        this.f32824to = j4lVar;
        return j4lVar;
    }

    public xgo(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xgo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (xgo.f32820h4.m27428k4(str) != 0) {
                    return false;
                }
                xgo.this.f32822k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xgo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xgo.f32820h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    xgo.this.f32825x1 = new rgn(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    xgo.this.f32823kk = new mbw(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    xgo.this.f32824to = new j4l(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    xgo.this.f32821du = new yq7(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final mbw m44345k4() {
        if (this.f32823kk != null) {
            throw new Exception("Only one <styles> element can be added.");
        }
        mbw mbwVar = new mbw();
        this.f32823kk = mbwVar;
        return mbwVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("office", str2, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
        c3059ii.m12954to("xmlns", "ooo", null, "http://openoffice.org/2004/office");
        c3059ii.m12954to("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:style:1.0") == null) {
            c3059ii.m12954to("xmlns", "style", null, "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0") == null) {
            c3059ii.m12954to("xmlns", "svg", null, "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
        }
        if (c3059ii.mo12952k4("http://www.w3.org/1999/xlink") == null) {
            c3059ii.m12954to("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
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
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0") == null) {
            c3059ii.m12954to("xmlns", "presentation", null, "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0") == null) {
            c3059ii.m12954to("xmlns", "smil", null, "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
            c3059ii.m12954to("xmlns", "number", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
        }
        if (c3059ii.mo12952k4("http://purl.org/dc/elements/1.1/") == null) {
            c3059ii.m12954to("xmlns", AzureActiveDirectorySlice.DC_PARAMETER, null, "http://purl.org/dc/elements/1.1/");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:script:1.0") == null) {
            c3059ii.m12954to("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:meta:1.0") == null) {
            c3059ii.m12954to("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:form:1.0") == null) {
            c3059ii.m12954to("xmlns", "form", null, "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
        }
        if (c3059ii.mo12952k4("http://www.w3.org/2002/xforms") == null) {
            c3059ii.m12954to("xmlns", "xforms", null, "http://www.w3.org/2002/xforms");
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
        String str3 = this.f32822k4;
        if (str3 != null) {
            c3059ii.m12955x1("office:version", str3);
        }
        rgn rgnVar = this.f32825x1;
        if (rgnVar != null) {
            rgnVar.mo6846k4("office", c3059ii, "font-face-decls");
        }
        mbw mbwVar = this.f32823kk;
        if (mbwVar != null) {
            mbwVar.mo6846k4("office", c3059ii, "styles");
        }
        j4l j4lVar = this.f32824to;
        if (j4lVar != null) {
            j4lVar.mo6846k4("office", c3059ii, "automatic-styles");
        }
        yq7 yq7Var = this.f32821du;
        if (yq7Var != null) {
            yq7Var.mo6846k4("office", c3059ii, "master-styles");
        }
        c3059ii.mo21898jd();
    }
}
