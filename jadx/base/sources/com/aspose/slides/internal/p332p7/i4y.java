package com.aspose.slides.internal.p332p7;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class i4y extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f24481h4 = new C7017h4("transition", "filter", "prLst", "cBhvr", NotificationCompat.CATEGORY_PROGRESS);

    /* JADX INFO: renamed from: du */
    private ijy f24482du;

    /* JADX INFO: renamed from: k4 */
    private byte f24483k4;

    /* JADX INFO: renamed from: kk */
    private String f24484kk;

    /* JADX INFO: renamed from: to */
    private no7 f24485to;

    /* JADX INFO: renamed from: x1 */
    private String f24486x1;

    public i4y() {
        m33849m9();
        this.f24485to = new no7();
    }

    /* JADX INFO: renamed from: m9 */
    private void m33849m9() {
        this.f24483k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final ijy m33851du() {
        return this.f24482du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m33852k4() {
        return this.f24483k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m33855kk() {
        return this.f24484kk;
    }

    /* JADX INFO: renamed from: to */
    public final no7 m33856to() {
        return this.f24485to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33857x1() {
        return this.f24486x1;
    }

    public i4y(final AbstractC13912i5 abstractC13912i5) {
        m33849m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.i4y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = i4y.f24481h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    i4y.this.f24483k4 = C8901tw.m41957k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    i4y.this.f24486x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                i4y.this.f24484kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i4y.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = i4y.f24481h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    i4y.this.f24485to = new no7(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                i4y.this.f24482du = new ijy(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33858x1(String str) {
        this.f24484kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33853k4(byte b) {
        this.f24483k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33854k4(String str) {
        this.f24486x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f24483k4;
        if (b != -1) {
            c3059ii.m12955x1("transition", C8901tw.m41958k4(b));
        }
        String str3 = this.f24486x1;
        if (str3 != null) {
            c3059ii.m12955x1("filter", str3);
        }
        String str4 = this.f24484kk;
        if (str4 != null) {
            c3059ii.m12955x1("prLst", str4);
        }
        this.f24485to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        ijy ijyVar = this.f24482du;
        if (ijyVar != null) {
            ijyVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, NotificationCompat.CATEGORY_PROGRESS);
        }
        c3059ii.mo21898jd();
    }
}
