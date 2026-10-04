package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hm */
/* JADX INFO: loaded from: classes4.dex */
public class C7865hm extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f24209m9 = new C7017h4("projectionType", "viewedRegionType", "cultureLanguage", "cultureRegion", "attribution", "geoCache");

    /* JADX INFO: renamed from: du */
    private String f24210du;

    /* JADX INFO: renamed from: h4 */
    private C9004v7 f24211h4;

    /* JADX INFO: renamed from: k4 */
    private int f24212k4;

    /* JADX INFO: renamed from: kk */
    private String f24213kk;

    /* JADX INFO: renamed from: to */
    private String f24214to;

    /* JADX INFO: renamed from: x1 */
    private int f24215x1;

    public C7865hm() {
        m33516x1();
    }

    public C7865hm(final AbstractC13912i5 abstractC13912i5) {
        m33516x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7865hm.f24209m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7865hm.this.f24212k4 = C7941im.m34218k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7865hm.this.f24215x1 = C8423ob.m38171k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7865hm.this.f24213kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7865hm.this.f24214to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C7865hm.this.f24210du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7865hm.f24209m9.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                C7865hm.this.f24211h4 = new C9004v7(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m33516x1() {
        this.f24212k4 = 0;
        this.f24215x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24212k4;
        if (i != 0) {
            c3059ii.m12955x1("projectionType", C7941im.m34219k4(i));
        }
        int i2 = this.f24215x1;
        if (i2 != 0) {
            c3059ii.m12955x1("viewedRegionType", C8423ob.m38172k4(i2));
        }
        c3059ii.m12955x1("cultureLanguage", this.f24213kk);
        c3059ii.m12955x1("cultureRegion", this.f24214to);
        c3059ii.m12955x1("attribution", this.f24210du);
        C9004v7 c9004v7 = this.f24211h4;
        if (c9004v7 != null) {
            c9004v7.mo6846k4("cx", c3059ii, "geoCache");
        }
        c3059ii.mo21898jd();
    }
}
