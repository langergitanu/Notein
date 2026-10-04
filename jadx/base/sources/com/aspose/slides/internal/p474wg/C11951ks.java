package com.aspose.slides.internal.p474wg;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.ks */
/* JADX INFO: loaded from: classes5.dex */
class C11951ks {

    /* JADX INFO: renamed from: k4 */
    static String[] f40277k4 = {"realm", "opaque", "nonce", "algorithm", "qop"};

    /* JADX INFO: renamed from: du */
    private String[] f40278du = new String[f40277k4.length];

    /* JADX INFO: renamed from: kk */
    private int f40279kk;

    /* JADX INFO: renamed from: to */
    private int f40280to;

    /* JADX INFO: renamed from: x1 */
    private String f40281x1;

    public C11951ks(String str) {
        this.f40281x1 = C14113y2.m67440x1(str);
    }

    /* JADX INFO: renamed from: dy */
    private String m56004dy() {
        m56006m9();
        int i = this.f40280to;
        while (true) {
            int i2 = this.f40280to;
            if (i2 >= this.f40279kk || this.f40281x1.charAt(i2) == '=') {
                break;
            }
            this.f40280to++;
        }
        return C14113y2.m67368h4(C14113y2.m67440x1(C14113y2.m67443x1(this.f40281x1, i, this.f40280to - i)));
    }

    /* JADX INFO: renamed from: m9 */
    private void m56006m9() {
        int i;
        char cCharAt = ' ';
        while (true) {
            i = this.f40280to;
            if (i >= this.f40279kk || !(cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                break;
            }
            String str = this.f40281x1;
            this.f40280to = i + 1;
            cCharAt = str.charAt(i);
        }
        this.f40280to = i - 1;
    }

    /* JADX INFO: renamed from: du */
    public String m56007du() {
        return this.f40278du[4];
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m56008h4() {
        if (!C14113y2.m67448x1(C14113y2.m67368h4(this.f40281x1), "digest ")) {
            return false;
        }
        this.f40280to = 6;
        this.f40279kk = this.f40281x1.length();
        while (this.f40280to < this.f40279kk) {
            String[] strArr = {null};
            String[] strArr2 = {null};
            boolean zM56005k4 = m56005k4(strArr, strArr2);
            String str = strArr[0];
            String str2 = strArr2[0];
            if (!zM56005k4) {
                return false;
            }
            m56006m9();
            int i = this.f40280to;
            if (i < this.f40279kk && this.f40281x1.charAt(i) == ',') {
                this.f40280to++;
            }
            int iM67201k4 = AbstractC14092to.m67201k4(f40277k4, str);
            if (iM67201k4 != -1) {
                String[] strArr3 = this.f40278du;
                if (strArr3[iM67201k4] != null) {
                    return false;
                }
                strArr3[iM67201k4] = str2;
            }
        }
        return (m56009k4() == null || m56010kk() == null) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public String m56009k4() {
        return this.f40278du[0];
    }

    /* JADX INFO: renamed from: kk */
    public String m56010kk() {
        return this.f40278du[2];
    }

    /* JADX INFO: renamed from: to */
    public String m56011to() {
        return this.f40278du[3];
    }

    /* JADX INFO: renamed from: x1 */
    public String m56012x1() {
        return this.f40278du[1];
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56005k4(String[] strArr, String[] strArr2) {
        boolean z;
        int i;
        strArr[0] = null;
        strArr2[0] = null;
        strArr[0] = m56004dy();
        if (this.f40280to >= this.f40279kk) {
            return false;
        }
        m56006m9();
        int i2 = this.f40280to;
        if (i2 + 1 < this.f40279kk) {
            String str = this.f40281x1;
            this.f40280to = i2 + 1;
            if (str.charAt(i2) == '=') {
                m56006m9();
                int i3 = this.f40280to;
                if (i3 + 1 >= this.f40279kk) {
                    return false;
                }
                if (this.f40281x1.charAt(i3) == '\"') {
                    this.f40280to++;
                    z = true;
                } else {
                    z = false;
                }
                int i4 = this.f40280to;
                if (z) {
                    int iM67434x1 = C14113y2.m67434x1(this.f40281x1, '\"', i4);
                    this.f40280to = iM67434x1;
                    if (iM67434x1 == -1) {
                        return false;
                    }
                } else {
                    do {
                        char cCharAt = this.f40281x1.charAt(this.f40280to);
                        if (cCharAt == ',' || cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                            break;
                        }
                        i = this.f40280to + 1;
                        this.f40280to = i;
                    } while (i < this.f40279kk);
                    int i5 = this.f40280to;
                    if (i5 >= this.f40279kk && i4 == i5) {
                        return false;
                    }
                }
                strArr2[0] = C14113y2.m67443x1(this.f40281x1, i4, this.f40280to - i4);
                this.f40280to += z ? 2 : 1;
                return true;
            }
        }
        return false;
    }
}
