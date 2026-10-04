package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes3.dex */
class bdg {

    /* JADX INFO: renamed from: du */
    private boolean f4174du;

    /* JADX INFO: renamed from: dy */
    private boolean f4175dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f4176h4;

    /* JADX INFO: renamed from: k4 */
    private double f4177k4;

    /* JADX INFO: renamed from: kk */
    private double f4178kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f4179m9;

    /* JADX INFO: renamed from: to */
    private double f4180to;

    /* JADX INFO: renamed from: x1 */
    private double f4181x1;

    public bdg(String str) {
        C12380dy c12380dy = new C12380dy("[-]?[0-9]+([^ ,\\)`]*)");
        for (int i = 0; i < 4; i++) {
            C12385to c12385toM57989x1 = c12380dy.m57989x1(str);
            if (!c12385toM57989x1.mo58006to()) {
                return;
            }
            int iMo57996x1 = c12385toM57989x1.mo57996x1() + c12385toM57989x1.mo57994k4();
            str = OooO0OO.OooO00o(iMo57996x1, iMo57996x1, str, str);
            if (i == 0) {
                this.f4174du = C14113y2.m67364dy(c12385toM57989x1.mo57995kk(), BackupFile.EXTENSION_NOTEIN_FILE) > 0;
                this.f4177k4 = C14044b3.m66428k4(C14113y2.m67443x1(c12385toM57989x1.mo57995kk(), 0, c12385toM57989x1.mo57995kk().length() - 2), C11697x1.m55250kk());
            } else if (i == 1) {
                this.f4179m9 = C14113y2.m67364dy(c12385toM57989x1.mo57995kk(), BackupFile.EXTENSION_NOTEIN_FILE) > 0;
                this.f4178kk = C14044b3.m66428k4(C14113y2.m67443x1(c12385toM57989x1.mo57995kk(), 0, c12385toM57989x1.mo57995kk().length() - 2), C11697x1.m55250kk());
            } else if (i == 2) {
                this.f4176h4 = C14113y2.m67364dy(c12385toM57989x1.mo57995kk(), BackupFile.EXTENSION_NOTEIN_FILE) > 0;
                this.f4181x1 = C14044b3.m66428k4(C14113y2.m67443x1(c12385toM57989x1.mo57995kk(), 0, c12385toM57989x1.mo57995kk().length() - 2), C11697x1.m55250kk());
            } else if (i == 3) {
                this.f4175dy = C14113y2.m67364dy(c12385toM57989x1.mo57995kk(), BackupFile.EXTENSION_NOTEIN_FILE) > 0;
                this.f4180to = C14044b3.m66428k4(C14113y2.m67443x1(c12385toM57989x1.mo57995kk(), 0, c12385toM57989x1.mo57995kk().length() - 2), C11697x1.m55250kk());
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m4151c5() {
        return this.f4177k4 == 0.0d && this.f4181x1 == 0.0d && this.f4178kk == 0.0d && this.f4180to == 0.0d;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m4152du() {
        return this.f4174du;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m4153dy() {
        return this.f4176h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m4154h4() {
        return this.f4175dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m4155k4() {
        return this.f4177k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m4156kk() {
        return this.f4178kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m4157m9() {
        return this.f4179m9;
    }

    /* JADX INFO: renamed from: to */
    public final double m4158to() {
        return this.f4180to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m4159x1() {
        return this.f4181x1;
    }
}
