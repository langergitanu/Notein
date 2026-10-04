package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class y9j extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private byte f33262kk;

    /* JADX INFO: renamed from: to */
    private int f33263to;

    /* JADX INFO: renamed from: k4 */
    public static final byte f33260k4 = C9317yw.m45190k4("horz");

    /* JADX INFO: renamed from: x1 */
    public static final int f33261x1 = C8937ub.m42238k4("out");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33259du = new C7017h4("orient", "dir");

    public y9j() {
        m44863to();
    }

    /* JADX INFO: renamed from: to */
    private void m44863to() {
        this.f33262kk = f33260k4;
        this.f33263to = f33261x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m44864k4() {
        return this.f33262kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m44867x1() {
        return this.f33263to;
    }

    public y9j(AbstractC13912i5 abstractC13912i5) {
        m44863to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.y9j.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = y9j.f33259du.m27428k4(str);
                if (iM27428k4 == 0) {
                    y9j.this.f33262kk = C9317yw.m45190k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                y9j.this.f33263to = C8937ub.m42238k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44865k4(byte b) {
        this.f33262kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44866k4(int i) {
        this.f33263to = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f33262kk;
        if (b != f33260k4) {
            c3059ii.m12955x1("orient", C9317yw.m45191k4(b));
        }
        int i = this.f33263to;
        if (i != f33261x1) {
            c3059ii.m12955x1("dir", C8937ub.m42239k4(i));
        }
        c3059ii.mo21898jd();
    }
}
