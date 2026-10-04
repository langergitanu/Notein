package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.am */
/* JADX INFO: loaded from: classes4.dex */
public class C7259am extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    private String[] f20119k4 = {"http://schemas.microsoft.com/office/powerpoint/2010/main", "http://schemas.openxmlformats.org/presentationml/2006/main", "http://schemas.openxmlformats.org/drawingml/2006/main", "http://schemas.openxmlformats.org/drawingml/2006/chart", "http://schemas.openxmlformats.org/officeDocument/2006/relationships"};

    /* JADX INFO: renamed from: x1 */
    private String f20120x1;

    public C7259am() {
    }

    /* JADX INFO: renamed from: k4 */
    public String mo28309k4() {
        return this.f20120x1;
    }

    public C7259am(AbstractC13912i5 abstractC13912i5) {
        m28308k4(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m28308k4(AbstractC13912i5 abstractC13912i5) {
        this.f20120x1 = abstractC13912i5.m65481e0();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo28310k4(String str) {
        this.f20120x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String strMo28309k4 = mo28309k4();
        for (String str3 : this.f20119k4) {
            String strMo12952k4 = c3059ii.mo12952k4(str3);
            if (strMo12952k4 != null) {
                strMo28309k4 = C14113y2.m67401k4(strMo28309k4, C14113y2.m67408k4(" xmlns:", strMo12952k4, "=\"", str3, "\""), C14113y2.f47374k4);
            }
        }
        c3059ii.mo21895dy(strMo28309k4);
    }
}
