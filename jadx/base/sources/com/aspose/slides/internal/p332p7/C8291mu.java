package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mu */
/* JADX INFO: loaded from: classes4.dex */
public class C8291mu extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27022kk = new C7017h4(BackupFile.PREFIX_NOTE_DIR, "d");

    /* JADX INFO: renamed from: k4 */
    private long f27023k4;

    /* JADX INFO: renamed from: x1 */
    private long f27024x1;

    public C8291mu() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m37132k4() {
        return this.f27023k4;
    }

    public C8291mu(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8291mu.f27022kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8291mu.this.f27023k4 = C13850af.m65122ks(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8291mu.this.f27024x1 = C13850af.m65122ks(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37133k4(long j) {
        this.f27023k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37134x1(long j) {
        this.f27024x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(BackupFile.PREFIX_NOTE_DIR, C13850af.m65104k4(this.f27023k4));
        c3059ii.m12955x1("d", C13850af.m65104k4(this.f27024x1));
        c3059ii.mo21898jd();
    }
}
