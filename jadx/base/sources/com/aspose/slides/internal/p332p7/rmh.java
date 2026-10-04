package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class rmh extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f29366m9 = new C7017h4("draw:name", "draw:display-name", "draw:style", "draw:color", "draw:distance", "draw:rotation");

    /* JADX INFO: renamed from: du */
    private String f29367du;

    /* JADX INFO: renamed from: h4 */
    private int f29368h4;

    /* JADX INFO: renamed from: k4 */
    private String f29369k4;

    /* JADX INFO: renamed from: kk */
    private int f29370kk;

    /* JADX INFO: renamed from: to */
    private String f29371to;

    /* JADX INFO: renamed from: x1 */
    private String f29372x1;

    public rmh() {
        m40067m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m40067m9() {
        this.f29370kk = 0;
        this.f29368h4 = 0;
    }

    /* JADX INFO: renamed from: du */
    public final int m40071du() {
        return this.f29368h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m40073kk() {
        return this.f29371to;
    }

    /* JADX INFO: renamed from: to */
    public final String m40074to() {
        return this.f29367du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m40075x1() {
        return this.f29370kk;
    }

    public rmh(AbstractC13912i5 abstractC13912i5) {
        m40067m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rmh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rmh.f29366m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    rmh.this.f29369k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    rmh.this.f29372x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    rmh.this.f29370kk = vlf.m43164k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    rmh.this.f29371to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    rmh.this.f29367du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                rmh.this.f29368h4 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40072k4() {
        return this.f29369k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:name", this.f29369k4);
        String str3 = this.f29372x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:display-name", str3);
        }
        c3059ii.m12955x1("draw:style", vlf.m43165k4(this.f29370kk));
        String str4 = this.f29371to;
        if (str4 != null) {
            c3059ii.m12955x1("draw:color", str4);
        }
        String str5 = this.f29367du;
        if (str5 != null) {
            c3059ii.m12955x1("draw:distance", str5);
        }
        int i = this.f29368h4;
        if (i != 0) {
            c3059ii.m12955x1("draw:rotation", C13850af.m65103k4(i));
        }
        c3059ii.mo21898jd();
    }
}
