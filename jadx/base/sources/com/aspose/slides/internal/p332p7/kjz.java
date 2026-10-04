package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;

/* JADX INFO: loaded from: classes4.dex */
public class kjz extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f25721ck = new C7017h4("office:mimetype", "office:version", "meta", "settings", "scripts", "font-face-decls", "styles", "automatic-styles", "master-styles", "body");

    /* JADX INFO: renamed from: c5 */
    private yq7 f25722c5;

    /* JADX INFO: renamed from: du */
    private e3c f25723du;

    /* JADX INFO: renamed from: dy */
    private j4l f25724dy;

    /* JADX INFO: renamed from: h4 */
    private rgn f25725h4;

    /* JADX INFO: renamed from: jd */
    private yxj f25726jd;

    /* JADX INFO: renamed from: k4 */
    private String f25727k4;

    /* JADX INFO: renamed from: kk */
    private xyf f25728kk;

    /* JADX INFO: renamed from: m9 */
    private mbw f25729m9;

    /* JADX INFO: renamed from: to */
    private v1c f25730to;

    /* JADX INFO: renamed from: x1 */
    private String f25731x1;

    public kjz() {
        this.f25726jd = new yxj();
    }

    public kjz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kjz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kjz.f25721ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    kjz.this.f25727k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                kjz.this.f25731x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kjz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (kjz.f25721ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        kjz.this.f25728kk = new xyf(abstractC13912i5);
                        return true;
                    case 3:
                        kjz.this.f25730to = new v1c(abstractC13912i5);
                        return true;
                    case 4:
                        kjz.this.f25723du = new e3c(abstractC13912i5);
                        return true;
                    case 5:
                        kjz.this.f25725h4 = new rgn(abstractC13912i5);
                        return true;
                    case 6:
                        kjz.this.f25729m9 = new mbw(abstractC13912i5);
                        return true;
                    case 7:
                        kjz.this.f25724dy = new j4l(abstractC13912i5);
                        return true;
                    case 8:
                        kjz.this.f25722c5 = new yq7(abstractC13912i5);
                        return true;
                    case 9:
                        kjz.this.f25726jd = new yxj(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("office", str2, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
        c3059ii.m12954to("xmlns", "ooo", null, "http://openoffice.org/2004/office");
        c3059ii.m12954to("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:meta:1.0") == null) {
            c3059ii.m12954to("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
        }
        if (c3059ii.mo12952k4("http://purl.org/dc/elements/1.1/") == null) {
            c3059ii.m12954to("xmlns", AzureActiveDirectorySlice.DC_PARAMETER, null, "http://purl.org/dc/elements/1.1/");
        }
        if (c3059ii.mo12952k4("http://www.w3.org/1999/xlink") == null) {
            c3059ii.m12954to("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            c3059ii.m12954to("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:config:1.0") == null) {
            c3059ii.m12954to("xmlns", NetworkService.Constants.CONFIG_SERVICE, null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:script:1.0") == null) {
            c3059ii.m12954to("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
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
        if (c3059ii.mo12952k4("http://openoffice.org/2010/draw") == null) {
            c3059ii.m12954to("xmlns", "drawooo", null, "http://openoffice.org/2010/draw");
        }
        if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:animation:1.0") == null) {
            c3059ii.m12954to("xmlns", "anim", null, "urn:oasis:names:tc:opendocument:xmlns:animation:1.0");
        }
        if (c3059ii.mo12952k4("urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0") == null) {
            c3059ii.m12954to("xmlns", "loext", null, "urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0");
        }
        c3059ii.m12955x1("office:mimetype", this.f25727k4);
        String str3 = this.f25731x1;
        if (str3 != null) {
            c3059ii.m12955x1("office:version", str3);
        }
        xyf xyfVar = this.f25728kk;
        if (xyfVar != null) {
            xyfVar.mo6846k4("office", c3059ii, "meta");
        }
        v1c v1cVar = this.f25730to;
        if (v1cVar != null) {
            v1cVar.mo6846k4("office", c3059ii, "settings");
        }
        e3c e3cVar = this.f25723du;
        if (e3cVar != null) {
            e3cVar.mo6846k4("office", c3059ii, "scripts");
        }
        rgn rgnVar = this.f25725h4;
        if (rgnVar != null) {
            rgnVar.mo6846k4("office", c3059ii, "font-face-decls");
        }
        mbw mbwVar = this.f25729m9;
        if (mbwVar != null) {
            mbwVar.mo6846k4("office", c3059ii, "styles");
        }
        j4l j4lVar = this.f25724dy;
        if (j4lVar != null) {
            j4lVar.mo6846k4("office", c3059ii, "automatic-styles");
        }
        yq7 yq7Var = this.f25722c5;
        if (yq7Var != null) {
            yq7Var.mo6846k4("office", c3059ii, "master-styles");
        }
        this.f25726jd.mo6846k4("office", c3059ii, "body");
        c3059ii.mo21898jd();
    }
}
