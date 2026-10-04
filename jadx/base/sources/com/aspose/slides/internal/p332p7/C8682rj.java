package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rj */
/* JADX INFO: loaded from: classes4.dex */
public class C8682rj extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29335kk = new C7017h4(BackupFile.PREFIX_NOTE_DIR, "d");

    /* JADX INFO: renamed from: k4 */
    private long f29336k4;

    /* JADX INFO: renamed from: x1 */
    private long f29337x1;

    public C8682rj() {
    }

    public C8682rj(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8682rj.f29335kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8682rj.this.f29336k4 = C13850af.m65074ix(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8682rj.this.f29337x1 = C13850af.m65074ix(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(BackupFile.PREFIX_NOTE_DIR, C13850af.m65119kk(this.f29336k4));
        c3059ii.m12955x1("d", C13850af.m65119kk(this.f29337x1));
        c3059ii.mo21898jd();
    }
}
