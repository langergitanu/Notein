package com.aspose.slides.internal.p115eq;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3789k4 {

    /* JADX INFO: renamed from: h4 */
    private boolean f10325h4;

    /* JADX INFO: renamed from: k4 */
    private String f10326k4;

    /* JADX INFO: renamed from: x1 */
    private int f10329x1 = 0;

    /* JADX INFO: renamed from: kk */
    private int f10327kk = 1;

    /* JADX INFO: renamed from: to */
    private int f10328to = 1;

    /* JADX INFO: renamed from: du */
    private int f10324du = 0;

    public C3789k4(String str) {
        this.f10325h4 = true;
        this.f10326k4 = str;
        if (C14113y2.m67411k4(str)) {
            this.f10325h4 = false;
        }
        if (C14117yj.m67519h4(str.charAt(0))) {
            this.f10324du++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m15139k4() {
        return !this.f10325h4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m15140kk() {
        float fM66706k4;
        char cCharAt;
        while (this.f10324du < this.f10326k4.length() && this.f10325h4) {
            switch (this.f10327kk) {
                case 1:
                    if (!C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        if (!m15137k4(this.f10326k4.charAt(this.f10324du))) {
                            char cCharAt2 = this.f10326k4.charAt(this.f10324du);
                            if (cCharAt2 != '+' && cCharAt2 != '-') {
                                if (cCharAt2 == '.') {
                                    this.f10328to = 4;
                                } else {
                                    this.f10328to = 0;
                                }
                            }
                            this.f10328to = 2;
                        }
                        this.f10328to = 1;
                    }
                    this.f10328to = 3;
                    break;
                case 2:
                    if (!C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        if (this.f10326k4.charAt(this.f10324du) == '.') {
                        }
                    }
                    this.f10328to = 3;
                    break;
                case 3:
                    if (!C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        if (!m15137k4(this.f10326k4.charAt(this.f10324du))) {
                            char cCharAt3 = this.f10326k4.charAt(this.f10324du);
                            if (cCharAt3 != '+') {
                                if (cCharAt3 != 'E' && cCharAt3 != 'e') {
                                    if (cCharAt3 != '-') {
                                        if (cCharAt3 != '.') {
                                        }
                                    }
                                }
                                this.f10328to = 6;
                            }
                            this.f10328to = 2;
                        }
                        this.f10328to = 1;
                    }
                    this.f10328to = 3;
                    break;
                case 4:
                    if (!C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        if (!m15137k4(this.f10326k4.charAt(this.f10324du))) {
                            char cCharAt4 = this.f10326k4.charAt(this.f10324du);
                            if (cCharAt4 != '+' && cCharAt4 != '-') {
                                if (cCharAt4 == 'E' || cCharAt4 == 'e') {
                                    this.f10328to = 6;
                                    break;
                                }
                            }
                            this.f10328to = 2;
                        }
                        this.f10328to = 1;
                    }
                    this.f10328to = 5;
                    break;
                case 5:
                    if (!C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        if (!m15137k4(this.f10326k4.charAt(this.f10324du))) {
                            char cCharAt5 = this.f10326k4.charAt(this.f10324du);
                            if (cCharAt5 != '+') {
                                if (cCharAt5 != 'E' && cCharAt5 != 'e') {
                                    if (cCharAt5 != '-') {
                                        if (cCharAt5 != '.') {
                                        }
                                    }
                                }
                                this.f10328to = 6;
                            }
                            this.f10328to = 2;
                        }
                        this.f10328to = 1;
                    }
                    this.f10328to = 5;
                    break;
                case 6:
                    if (C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        this.f10328to = 8;
                        break;
                    } else if (!m15137k4(this.f10326k4.charAt(this.f10324du)) && ((cCharAt = this.f10326k4.charAt(this.f10324du)) == '+' || cCharAt == '-')) {
                        this.f10328to = 7;
                        break;
                    }
                    break;
                case 7:
                    if (C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                    }
                    break;
                case 8:
                    if (!C14117yj.m67522jd(this.f10326k4.charAt(this.f10324du))) {
                        if (!m15137k4(this.f10326k4.charAt(this.f10324du))) {
                            char cCharAt6 = this.f10326k4.charAt(this.f10324du);
                            if (cCharAt6 != '+' && cCharAt6 != '-') {
                                if (cCharAt6 != '.') {
                                }
                            }
                            this.f10328to = 2;
                        }
                        this.f10328to = 1;
                    }
                    this.f10328to = 8;
                    break;
            }
            int i = this.f10328to;
            int i2 = this.f10327kk;
            if (i < i2) {
                String str = this.f10326k4;
                int i3 = this.f10329x1;
                fM66706k4 = C14064he.m66706k4(C14113y2.m67443x1(str, i3, this.f10324du - i3), 167, C11697x1.m55250kk());
                this.f10329x1 = this.f10324du;
                this.f10327kk = this.f10328to;
                m15138k4(true);
                return fM66706k4;
            }
            if (i != i2 && i2 == 1) {
                this.f10329x1 = this.f10324du;
            }
            if (i == 0) {
                m15138k4(false);
                return -3.4028235E38f;
            }
            this.f10327kk = i;
            this.f10324du++;
        }
        if (this.f10327kk == 1 || !this.f10325h4 || this.f10329x1 >= this.f10326k4.length()) {
            m15138k4(false);
            return -3.4028235E38f;
        }
        String str2 = this.f10326k4;
        fM66706k4 = C14064he.m66706k4(C14113y2.m67443x1(str2, this.f10329x1, str2.length() - this.f10329x1), 167, C11697x1.m55250kk());
        this.f10329x1 = this.f10326k4.length();
        m15138k4(true);
        return fM66706k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m15141x1() {
        while (this.f10324du < this.f10326k4.length() && this.f10325h4) {
            if (this.f10327kk != 1) {
                m15138k4(false);
                return false;
            }
            if (!m15137k4(this.f10326k4.charAt(this.f10324du))) {
                if (this.f10326k4.charAt(this.f10324du) == '0') {
                    this.f10328to = 1;
                    this.f10329x1 = this.f10324du + 1;
                    m15138k4(true);
                    return false;
                }
                if (this.f10326k4.charAt(this.f10324du) != '1') {
                    m15138k4(false);
                    return false;
                }
                this.f10328to = 1;
                this.f10329x1 = this.f10324du + 1;
                m15138k4(true);
                return true;
            }
            this.f10328to = 1;
            this.f10324du++;
        }
        m15138k4(false);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m15137k4(char c) {
        return c == '\t' || c == '\n' || c == '\r' || c == ' ' || c == ',';
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m15138k4(boolean z) {
        this.f10325h4 = z;
        this.f10324du++;
        return z;
    }
}
