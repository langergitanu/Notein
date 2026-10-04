package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;

/* JADX INFO: loaded from: classes4.dex */
public class jb7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25065kk = new C7017h4("office:version", "meta");

    /* JADX INFO: renamed from: k4 */
    private String f25066k4;

    /* JADX INFO: renamed from: x1 */
    private xyf f25067x1;

    public jb7() {
    }

    /* JADX INFO: renamed from: k4 */
    public final xyf m34622k4() {
        if (this.f25067x1 != null) {
            throw new Exception("Only one <meta> element can be added.");
        }
        xyf xyfVar = new xyf();
        this.f25067x1 = xyfVar;
        return xyfVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final xyf m34623x1() {
        return this.f25067x1;
    }

    public jb7(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jb7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (jb7.f25065kk.m27428k4(str) != 0) {
                    return false;
                }
                jb7.this.f25066k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jb7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (jb7.f25065kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                jb7.this.f25067x1 = new xyf(abstractC13912i5);
                return true;
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
        String str3 = this.f25066k4;
        if (str3 != null) {
            c3059ii.m12955x1("office:version", str3);
        }
        xyf xyfVar = this.f25067x1;
        if (xyfVar != null) {
            xyfVar.mo6846k4("office", c3059ii, "meta");
        }
        c3059ii.mo21898jd();
    }
}
