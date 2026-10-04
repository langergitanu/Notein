package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes4.dex */
public class u9b extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31083k4 = C8937ub.m42238k4(BackupFile.EXTENSION_NOTEIN_FILE);

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31084to = new C7017h4("dir", "hasBounce");

    /* JADX INFO: renamed from: kk */
    private boolean f31085kk;

    /* JADX INFO: renamed from: x1 */
    private int f31086x1;

    public u9b() {
        m42157to();
    }

    /* JADX INFO: renamed from: to */
    private void m42157to() {
        this.f31086x1 = f31083k4;
        this.f31085kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m42158k4() {
        return this.f31086x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m42161x1() {
        return this.f31085kk;
    }

    public u9b(AbstractC13912i5 abstractC13912i5) {
        m42157to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u9b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = u9b.f31084to.m27428k4(str);
                if (iM27428k4 == 0) {
                    u9b.this.f31086x1 = C8937ub.m42238k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                u9b.this.f31085kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42159k4(int i) {
        this.f31086x1 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31086x1;
        if (i != f31083k4) {
            c3059ii.m12955x1("dir", C8937ub.m42239k4(i));
        }
        boolean z = this.f31085kk;
        if (z) {
            c3059ii.m12955x1("hasBounce", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42160k4(boolean z) {
        this.f31085kk = z;
    }
}
