package com.aspose.slides.internal.p184ik;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p418tf.C10931x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.ck */
/* JADX INFO: loaded from: classes.dex */
public final class C5090ck {

    /* JADX INFO: renamed from: kk */
    private C5095jd f13991kk;

    /* JADX INFO: renamed from: k4 */
    private C5095jd[] f13990k4 = new C5095jd[32];

    /* JADX INFO: renamed from: x1 */
    private int f13992x1 = 0;

    /* JADX INFO: renamed from: k4 */
    private C5095jd m21766k4(C5095jd c5095jd) {
        for (C5095jd c5095jdM21832up = this.f13990k4[c5095jd.hashCode() & (this.f13990k4.length - 1)]; c5095jdM21832up != null; c5095jdM21832up = c5095jdM21832up.m21832up()) {
            if (c5095jd.equals(c5095jdM21832up)) {
                c5095jd.m21827k4(this.f13991kk);
                this.f13991kk = c5095jd;
                return c5095jdM21832up;
            }
        }
        int i = this.f13992x1;
        C5095jd[] c5095jdArr = this.f13990k4;
        if (i >= c5095jdArr.length) {
            this.f13990k4 = new C5095jd[c5095jdArr.length * 2];
            for (C5095jd c5095jd2 : c5095jdArr) {
                while (c5095jd2 != null) {
                    C5095jd c5095jdM21832up2 = c5095jd2.m21832up();
                    m21767x1(c5095jd2);
                    c5095jd2 = c5095jdM21832up2;
                }
            }
        }
        m21767x1(c5095jd);
        return c5095jd;
    }

    /* JADX INFO: renamed from: x1 */
    private void m21767x1(C5095jd c5095jd) {
        int iHashCode = c5095jd.hashCode();
        int length = iHashCode & (r1.length - 1);
        c5095jd.m21827k4(this.f13990k4[length]);
        this.f13990k4[length] = c5095jd;
        this.f13992x1++;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < this.f13990k4.length; i++) {
            c6765kp.m26796k4("{0,4}: ", Integer.valueOf(i));
            for (C5095jd c5095jdM21832up = this.f13990k4[i]; c5095jdM21832up != null; c5095jdM21832up = c5095jdM21832up.m21832up()) {
                if (c5095jdM21832up != this.f13990k4[i]) {
                    c6765kp.m26792k4("\n      ");
                }
                c6765kp.m26791k4(c5095jdM21832up);
            }
            c6765kp.m26780k4('\n');
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final C5095jd m21768k4(String str, String str2, String str3, String str4, C5092dy[] c5092dyArr, C5092dy[] c5092dyArr2, C5092dy[] c5092dyArr3, C10931x1 c10931x1, int i, int i2) {
        C5095jd c5095jd = this.f13991kk;
        if (c5095jd == null) {
            c5095jd = new C5095jd(str, str2, str3, str4, c5092dyArr, c5092dyArr2, c5092dyArr3, c10931x1, i, i2);
        } else {
            this.f13991kk = c5095jd.m21832up();
            c5095jd.m21828k4(str, str2, str3, str4, c5092dyArr, c5092dyArr2, c5092dyArr3, c10931x1, i, i2);
        }
        return m21766k4(c5095jd);
    }
}
