package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes4.dex */
public class kup extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private int f25985kk;

    /* JADX INFO: renamed from: to */
    private int f25986to;

    /* JADX INFO: renamed from: k4 */
    public static final int f25983k4 = C8659r9.m39908k4("strip");

    /* JADX INFO: renamed from: x1 */
    public static final int f25984x1 = C8937ub.m42238k4(BackupFile.EXTENSION_NOTEIN_FILE);

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25982du = new C7017h4("pattern", "dir");

    public kup() {
        m35732to();
    }

    /* JADX INFO: renamed from: to */
    private void m35732to() {
        this.f25985kk = f25983k4;
        this.f25986to = f25984x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m35734k4() {
        return this.f25985kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m35736x1() {
        return this.f25986to;
    }

    public kup(AbstractC13912i5 abstractC13912i5) {
        m35732to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kup.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kup.f25982du.m27428k4(str);
                if (iM27428k4 == 0) {
                    kup.this.f25985kk = C8659r9.m39908k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                kup.this.f25986to = C8937ub.m42238k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35735k4(int i) {
        this.f25985kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35737x1(int i) {
        this.f25986to = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25985kk;
        if (i != f25983k4) {
            c3059ii.m12955x1("pattern", C8659r9.m39909k4(i));
        }
        int i2 = this.f25986to;
        if (i2 != f25984x1) {
            c3059ii.m12955x1("dir", C8937ub.m42239k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
