package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14043ar;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.Xml.C13936m9;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.zs */
/* JADX INFO: loaded from: classes5.dex */
public class C13333zs extends AbstractC7020m9<C13333zs> {

    /* JADX INFO: renamed from: ar */
    private static final int f44652ar = 5;

    /* JADX INFO: renamed from: c5 */
    private static final int f44653c5 = 2;

    /* JADX INFO: renamed from: ck */
    private static final int f44654ck = 5;

    /* JADX INFO: renamed from: du */
    private static final int f44655du = 7;

    /* JADX INFO: renamed from: dy */
    private static final int f44656dy = 11;

    /* JADX INFO: renamed from: fa */
    private static final int f44657fa = 6;

    /* JADX INFO: renamed from: h4 */
    private static final int f44658h4 = 8;

    /* JADX INFO: renamed from: ix */
    private static final int f44659ix = 4;

    /* JADX INFO: renamed from: jd */
    private static final int f44660jd = 3;

    /* JADX INFO: renamed from: kk */
    private static final int f44661kk = 4;

    /* JADX INFO: renamed from: ks */
    private static final int f44662ks = 3;

    /* JADX INFO: renamed from: m9 */
    private static final int f44663m9 = 10;

    /* JADX INFO: renamed from: ne */
    private static final int f44664ne = 2;

    /* JADX INFO: renamed from: qq */
    private static final int f44665qq = 3;

    /* JADX INFO: renamed from: rv */
    private static final int f44666rv = 4;

    /* JADX INFO: renamed from: to */
    private static final int f44667to = 5;

    /* JADX INFO: renamed from: u4 */
    private static final int f44668u4 = 5;

    /* JADX INFO: renamed from: um */
    private static final int[] f44669um = {18, 19, 20, 21, 22, 23, 24, 25};

    /* JADX INFO: renamed from: up */
    private static final int f44670up = 8;

    /* JADX INFO: renamed from: uz */
    private static final int f44671uz = 6;

    /* JADX INFO: renamed from: wl */
    private static final int f44672wl = 7;

    /* JADX INFO: renamed from: x6 */
    private static final int f44673x6 = 6;

    /* JADX INFO: renamed from: yj */
    private static final int f44674yj = 1;

    /* JADX INFO: renamed from: k4 */
    private C14084qq f44675k4;

    /* JADX INFO: renamed from: x1 */
    private long f44676x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.zs$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: yj */
        private static int[] f44677yj = {-1, 10, 100, 1000, 10000, 100000, 1000000};

        /* JADX INFO: renamed from: c5 */
        public int f44678c5;

        /* JADX INFO: renamed from: ck */
        public int f44679ck;

        /* JADX INFO: renamed from: du */
        public int f44680du;

        /* JADX INFO: renamed from: dy */
        public int f44681dy;

        /* JADX INFO: renamed from: fa */
        private String f44682fa;

        /* JADX INFO: renamed from: h4 */
        public int f44683h4;

        /* JADX INFO: renamed from: jd */
        public int f44684jd;

        /* JADX INFO: renamed from: k4 */
        public int f44685k4;

        /* JADX INFO: renamed from: kk */
        public int f44686kk;

        /* JADX INFO: renamed from: m9 */
        public int f44687m9;

        /* JADX INFO: renamed from: to */
        public int f44688to;

        /* JADX INFO: renamed from: up */
        private int f44689up;

        /* JADX INFO: renamed from: x1 */
        public int f44690x1;

        /* JADX INFO: renamed from: kk */
        private boolean m61960kk(int i) {
            int i2;
            int[] iArr = {i};
            boolean zM61959k4 = m61959k4(iArr);
            int i3 = iArr[0];
            if (zM61959k4) {
                while (true) {
                    i2 = this.f44689up;
                    if (i3 >= i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: to */
        private boolean m61961to(int i) {
            int i2;
            if (i < this.f44689up) {
                char cCharAt = this.f44682fa.charAt(i);
                if (cCharAt == 'Z' || cCharAt == 'z') {
                    this.f44678c5 = 1;
                    i++;
                } else if (i + 5 < this.f44689up) {
                    int[] iArr = {this.f44684jd};
                    int[] iArr2 = {this.f44679ck};
                    boolean z = m61963x1(C13333zs.f44674yj + i, iArr) && iArr[0] <= 99 && m61956k4(C13333zs.f44662ks + i, ':') && m61963x1(C13333zs.f44666rv + i, iArr2) && iArr2[0] <= 99;
                    this.f44684jd = iArr[0];
                    this.f44679ck = iArr2[0];
                    if (z) {
                        if (cCharAt != '-') {
                            i2 = cCharAt == '+' ? 3 : 2;
                        }
                        this.f44678c5 = i2;
                        i += C13333zs.f44673x6;
                    }
                }
            }
            while (i < this.f44689up && C14117yj.m67534ks(this.f44682fa.charAt(i))) {
                i++;
            }
            return i == this.f44689up;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m61962x1(int i) {
            int[] iArr = {i};
            return m61959k4(iArr) && m61961to(iArr[0]);
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m61964x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m61963x1(int i, int[] iArr) {
            int i2 = i + 1;
            if (i2 < this.f44689up) {
                int iCharAt = this.f44682fa.charAt(i) - '0';
                int iCharAt2 = this.f44682fa.charAt(i2) - '0';
                if (iCharAt >= 0 && iCharAt < 10 && iCharAt2 >= 0 && iCharAt2 < 10) {
                    iArr[0] = (iCharAt * 10) + iCharAt2;
                    return true;
                }
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f44685k4 = this.f44685k4;
            k4Var.f44690x1 = this.f44690x1;
            k4Var.f44686kk = this.f44686kk;
            k4Var.f44688to = this.f44688to;
            k4Var.f44680du = this.f44680du;
            k4Var.f44683h4 = this.f44683h4;
            k4Var.f44687m9 = this.f44687m9;
            k4Var.f44681dy = this.f44681dy;
            k4Var.f44678c5 = this.f44678c5;
            k4Var.f44684jd = this.f44684jd;
            k4Var.f44679ck = this.f44679ck;
            k4Var.f44682fa = this.f44682fa;
            k4Var.f44689up = this.f44689up;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX INFO: renamed from: k4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean m61955k4(int i) {
            boolean z;
            int i2;
            int i3;
            int[] iArr = {this.f44690x1};
            int[] iArr2 = {this.f44686kk};
            int[] iArr3 = {this.f44688to};
            if (m61958k4(i, iArr)) {
                z = 1 <= iArr[0] && m61956k4(C13333zs.f44661kk + i, '-') && m61963x1(C13333zs.f44667to + i, iArr2) && 1 <= (i2 = iArr2[0]) && i2 <= 12 && m61956k4(C13333zs.f44655du + i, '-') && m61963x1(C13333zs.f44658h4 + i, iArr3) && 1 <= (i3 = iArr3[0]) && i3 <= C14084qq.m67082k4(iArr[0], iArr2[0]);
            }
            this.f44690x1 = iArr[0];
            this.f44686kk = iArr2[0];
            this.f44688to = iArr3[0];
            return z;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m61964x1(k4 k4Var) {
            return k4Var.f44685k4 == this.f44685k4 && k4Var.f44690x1 == this.f44690x1 && k4Var.f44686kk == this.f44686kk && k4Var.f44688to == this.f44688to && k4Var.f44680du == this.f44680du && k4Var.f44683h4 == this.f44683h4 && k4Var.f44687m9 == this.f44687m9 && k4Var.f44681dy == this.f44681dy && k4Var.f44678c5 == this.f44678c5 && k4Var.f44684jd == this.f44684jd && k4Var.f44679ck == this.f44679ck && C14067j2.m66728k4(k4Var.f44682fa, this.f44682fa) && k4Var.f44689up == this.f44689up;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m61956k4(int i, char c) {
            return i < this.f44689up && this.f44682fa.charAt(i) == c;
        }

        /* JADX INFO: renamed from: k4 */
        private static boolean m61957k4(int i, int i2) {
            return (i & i2) != 0;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m61958k4(int i, int[] iArr) {
            int i2 = i + 3;
            if (i2 < this.f44689up) {
                int iCharAt = this.f44682fa.charAt(i) - '0';
                int iCharAt2 = this.f44682fa.charAt(i + 1) - '0';
                int iCharAt3 = this.f44682fa.charAt(i + 2) - '0';
                int iCharAt4 = this.f44682fa.charAt(i2) - '0';
                if (iCharAt >= 0 && iCharAt < 10 && iCharAt2 >= 0 && iCharAt2 < 10 && iCharAt3 >= 0 && iCharAt3 < 10 && iCharAt4 >= 0 && iCharAt4 < 10) {
                    iArr[0] = (((((iCharAt * 10) + iCharAt2) * 10) + iCharAt3) * 10) + iCharAt4;
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m61967k4(String str, int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            this.f44682fa = str;
            this.f44689up = str.length();
            int i6 = 0;
            while (i6 < this.f44689up && C14117yj.m67534ks(str.charAt(i6))) {
                i6++;
            }
            if (m61957k4(i, 773) && m61955k4(i6)) {
                if (m61957k4(i, 1) && m61956k4(C13333zs.f44663m9 + i6, 'T') && m61962x1(C13333zs.f44656dy + i6)) {
                    this.f44685k4 = 0;
                    return true;
                }
                if (m61957k4(i, 4) && m61961to(C13333zs.f44663m9 + i6)) {
                    this.f44685k4 = 2;
                    return true;
                }
                if (m61957k4(i, 512) && (m61961to(C13333zs.f44663m9 + i6) || (m61956k4(C13333zs.f44663m9 + i6, 'T') && m61962x1(C13333zs.f44656dy + i6)))) {
                    this.f44685k4 = 8;
                    return true;
                }
                if (m61957k4(i, 256)) {
                    if (!m61956k4(C13333zs.f44663m9 + i6, 'T')) {
                        this.f44685k4 = 8;
                        return true;
                    }
                    if (m61960kk(C13333zs.f44656dy + i6)) {
                        this.f44685k4 = 8;
                        return true;
                    }
                }
            }
            if (m61957k4(i, 2) && m61962x1(i6)) {
                this.f44690x1 = 1904;
                this.f44686kk = 1;
                this.f44688to = 1;
                this.f44685k4 = 1;
                return true;
            }
            if (m61957k4(i, 1024) && m61960kk(i6)) {
                this.f44690x1 = 1904;
                this.f44686kk = 1;
                this.f44688to = 1;
                this.f44685k4 = 1;
                return true;
            }
            if (m61957k4(i, 24)) {
                int[] iArr = {this.f44690x1};
                boolean z = m61958k4(i6, iArr) && 1 <= iArr[0];
                this.f44690x1 = iArr[0];
                if (z) {
                    if (m61957k4(i, 8)) {
                        int[] iArr2 = {this.f44686kk};
                        boolean z2 = m61956k4(C13333zs.f44661kk + i6, '-') && m61963x1(C13333zs.f44667to + i6, iArr2) && 1 <= (i5 = iArr2[0]) && i5 <= 12 && m61961to(C13333zs.f44655du + i6);
                        this.f44686kk = iArr2[0];
                        if (z2) {
                            this.f44688to = 1;
                            this.f44685k4 = 3;
                            return true;
                        }
                    }
                    if (m61957k4(i, 16) && m61961to(C13333zs.f44661kk + i6)) {
                        this.f44686kk = 1;
                        this.f44688to = 1;
                        this.f44685k4 = 4;
                        return true;
                    }
                }
            }
            if (m61957k4(i, 160)) {
                int[] iArr3 = {this.f44686kk};
                boolean z3 = m61956k4(i6, '-') && m61956k4(C13333zs.f44674yj + i6, '-') && m61963x1(C13333zs.f44664ne + i6, iArr3) && 1 <= (i4 = iArr3[0]) && i4 <= 12;
                this.f44686kk = iArr3[0];
                if (z3) {
                    if (m61957k4(i, 32) && m61956k4(C13333zs.f44659ix + i6, '-')) {
                        int[] iArr4 = {this.f44688to};
                        boolean z4 = m61963x1(C13333zs.f44668u4 + i6, iArr4) && 1 <= (i3 = iArr4[0]) && i3 <= C14084qq.m67082k4(1904, this.f44686kk) && m61961to(C13333zs.f44672wl + i6);
                        this.f44688to = iArr4[0];
                        if (z4) {
                            this.f44690x1 = 1904;
                            this.f44685k4 = 5;
                            return true;
                        }
                    }
                    if (m61957k4(i, 128) && (m61961to(C13333zs.f44659ix + i6) || (m61956k4(C13333zs.f44659ix + i6, '-') && m61956k4(C13333zs.f44668u4 + i6, '-') && m61961to(C13333zs.f44671uz + i6)))) {
                        this.f44690x1 = 1904;
                        this.f44688to = 1;
                        this.f44685k4 = 7;
                        return true;
                    }
                }
            }
            if (m61957k4(i, 64)) {
                int[] iArr5 = {this.f44688to};
                boolean z5 = m61956k4(i6, '-') && m61956k4(C13333zs.f44674yj + i6, '-') && m61956k4(C13333zs.f44664ne + i6, '-') && m61963x1(C13333zs.f44665qq + i6, iArr5) && 1 <= (i2 = iArr5[0]) && i2 <= C14084qq.m67082k4(1904, 1) && m61961to(C13333zs.f44652ar + i6);
                this.f44688to = iArr5[0];
                if (z5) {
                    this.f44690x1 = 1904;
                    this.f44686kk = 1;
                    this.f44685k4 = 6;
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
        /* JADX INFO: renamed from: k4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean m61959k4(int[] iArr) {
            boolean z;
            int i;
            int[] iArr2 = {this.f44680du};
            int[] iArr3 = {this.f44683h4};
            int[] iArr4 = {this.f44687m9};
            if (!m61963x1(iArr[0], iArr2) || iArr2[0] >= 24) {
                z = false;
            } else {
                if (m61956k4(C13333zs.f44653c5 + iArr[0], ':')) {
                    if (m61963x1(C13333zs.f44660jd + iArr[0], iArr3) && iArr3[0] < 60) {
                        if (m61956k4(C13333zs.f44654ck + iArr[0], ':')) {
                            if (m61963x1(C13333zs.f44657fa + iArr[0], iArr4) && iArr4[0] < 60) {
                                z = true;
                            }
                        }
                    }
                }
            }
            this.f44680du = iArr2[0];
            this.f44683h4 = iArr3[0];
            this.f44687m9 = iArr4[0];
            if (!z) {
                this.f44680du = 0;
                return false;
            }
            int i2 = C13333zs.f44670up + iArr[0];
            iArr[0] = i2;
            if (m61956k4(i2, FilenameUtils.EXTENSION_SEPARATOR)) {
                this.f44681dy = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = iArr[0] + 1;
                    iArr[0] = i5;
                    if (i5 >= this.f44689up) {
                        break;
                    }
                    int iCharAt = this.f44682fa.charAt(i5) - '0';
                    if (9 < (((long) iCharAt) & 4294967295L)) {
                        break;
                    }
                    if (i3 < 7) {
                        this.f44681dy = (this.f44681dy * 10) + iCharAt;
                    } else if (i3 == 7) {
                        if (5 < iCharAt) {
                            i4 = 1;
                        } else if (iCharAt == 5) {
                            i4 = -1;
                        }
                    } else if (i4 >= 0 || iCharAt == 0) {
                    }
                    i3++;
                }
                if (i3 >= 7) {
                    if (i4 < 0) {
                        i4 = this.f44681dy & 1;
                    }
                    i = this.f44681dy + i4;
                } else {
                    if (i3 == 0) {
                        return false;
                    }
                    i = this.f44681dy * f44677yj[7 - i3];
                }
                this.f44681dy = i;
            }
            return true;
        }
    }

    public C13333zs() {
        this.f44675k4 = new C14084qq();
    }

    /* JADX INFO: renamed from: dq */
    private int m61915dq() {
        return (int) ((this.f44676x1 & 4278190080L) >> 24);
    }

    /* JADX INFO: renamed from: xk */
    private int m61941xk() {
        return (int) ((this.f44676x1 & 16711680) >> 16);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m61944c5() {
        return (int) (this.f44676x1 & 255);
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final int m61945du() {
        return this.f44675k4.m67144m9();
    }

    /* JADX INFO: renamed from: dy */
    public final int m61946dy() {
        return (int) (((this.f44676x1 & 65280) >> 8) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C13333zs) {
            return m61930to((C13333zs) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m61947h4() {
        return this.f44675k4.m67126ck();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: jd, reason: merged with bridge method [inline-methods] */
    public C13333zs Clone() {
        C13333zs c13333zs = new C13333zs();
        CloneTo(c13333zs);
        return c13333zs;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61949k4() {
        return this.f44675k4.m67158yj();
    }

    /* JADX INFO: renamed from: kk */
    public final int m61950kk() {
        return this.f44675k4.m67153x1();
    }

    /* JADX INFO: renamed from: m9 */
    public final int m61952m9() {
        return (int) (this.f44675k4.m67130fa() - new C14084qq(this.f44675k4.m67158yj(), this.f44675k4.m67129dy(), this.f44675k4.m67153x1(), this.f44675k4.m67147to(), this.f44675k4.m67144m9(), this.f44675k4.m67126ck()).m67130fa());
    }

    /* JADX INFO: renamed from: to */
    public final int m61953to() {
        return this.f44675k4.m67147to();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(64);
        switch (m61915dq()) {
            case 0:
                m61919k4(c6765kp);
                c6765kp.m26780k4('T');
            case 1:
                m61939x1(c6765kp);
                break;
            case 2:
                m61919k4(c6765kp);
                break;
            case 3:
                char[] cArr = new char[f44655du];
                m61922k4(cArr, 0, m61949k4(), 4);
                cArr[f44661kk] = '-';
                m61921k4(cArr, f44667to, m61954x1());
                c6765kp.m26798k4(cArr);
                break;
            case 4:
                char[] cArr2 = new char[f44661kk];
                m61922k4(cArr2, 0, m61949k4(), 4);
                c6765kp.m26798k4(cArr2);
                break;
            case 5:
                char[] cArr3 = {'-', '-', 0, 0, '-', 0, 0};
                m61921k4(cArr3, f44664ne, m61954x1());
                m61921k4(cArr3, f44668u4, m61950kk());
                c6765kp.m26798k4(cArr3);
                break;
            case 6:
                char[] cArr4 = {'-', '-', '-', 0, 0};
                m61921k4(cArr4, f44665qq, m61950kk());
                c6765kp.m26798k4(cArr4);
                break;
            case 7:
                char[] cArr5 = {'-', '-', 0, 0, '-', '-'};
                m61921k4(cArr5, f44664ne, m61954x1());
                c6765kp.m26798k4(cArr5);
                break;
        }
        m61924kk(c6765kp);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m61954x1() {
        return this.f44675k4.m67129dy();
    }

    private C13333zs(k4 k4Var) {
        this();
        m61920k4(k4Var.Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C14084qq m61918k4(C13333zs c13333zs) {
        C14084qq c14084qqM67138k4;
        int iM61941xk;
        C14084qq c14084qq;
        C14084qq c14084qq2 = new C14084qq();
        int iM61915dq = c13333zs.m61915dq();
        if (iM61915dq == 1) {
            C14084qq c14084qqClone = C14084qq.m67081jd().Clone();
            c14084qqM67138k4 = c13333zs.f44675k4.m67138k4(C14084qq.m67073c5(new C14084qq(c14084qqClone.m67158yj(), c14084qqClone.m67129dy(), c14084qqClone.m67153x1()), new C14084qq(c13333zs.m61949k4(), c13333zs.m61954x1(), c13333zs.m61950kk())).Clone().Clone());
        } else {
            if (iM61915dq == 6 || iM61915dq == 7) {
                c14084qq2 = new C14084qq(C14084qq.m67081jd().m67158yj(), c13333zs.m61954x1(), c13333zs.m61950kk());
                iM61941xk = c13333zs.m61941xk();
                if (iM61941xk != 1) {
                    return new C14084qq(c14084qq2.m67130fa(), 1L);
                }
                if (iM61941xk == 2) {
                    c14084qq = new C14084qq(new C14077m4(c13333zs.m61946dy(), c13333zs.m61944c5(), 0).m66813du() + c14084qq2.m67130fa(), 1L);
                } else {
                    if (iM61941xk != 3) {
                        return c14084qq2;
                    }
                    long jM67130fa = c14084qq2.m67130fa() - new C14077m4(c13333zs.m61946dy(), c13333zs.m61944c5(), 0).m66813du();
                    if (jM67130fa < C14084qq.f47299x1.m67130fa()) {
                        return new C14084qq(jM67130fa, 2L);
                    }
                    c14084qq = new C14084qq(jM67130fa, 1L);
                }
                c14084qq.m67145ne().CloneTo(c14084qq2);
                return c14084qq2;
            }
            c14084qqM67138k4 = c13333zs.f44675k4;
        }
        c14084qqM67138k4.CloneTo(c14084qq2);
        iM61941xk = c13333zs.m61941xk();
        if (iM61941xk != 1) {
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m61924kk(C6765kp c6765kp) {
        int iM61941xk = m61941xk();
        if (iM61941xk == 1) {
            c6765kp.m26780k4('Z');
            return;
        }
        if (iM61941xk == 2) {
            char[] cArr = new char[f44673x6];
            cArr[0] = '-';
            m61921k4(cArr, f44674yj, m61946dy());
            cArr[f44662ks] = ':';
            m61921k4(cArr, f44666rv, m61944c5());
            c6765kp.m26798k4(cArr);
            return;
        }
        if (iM61941xk != 3) {
            return;
        }
        char[] cArr2 = new char[f44673x6];
        cArr2[0] = '+';
        m61921k4(cArr2, f44674yj, m61946dy());
        cArr2[f44662ks] = ':';
        m61921k4(cArr2, f44666rv, m61944c5());
        c6765kp.m26798k4(cArr2);
    }

    /* JADX INFO: renamed from: to */
    private boolean m61930to(C13333zs c13333zs) {
        return C14067j2.m66728k4(c13333zs.f44675k4, this.f44675k4) && c13333zs.f44676x1 == this.f44676x1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C14043ar m61938x1(C13333zs c13333zs) {
        C14084qq c14084qqM67138k4;
        C14084qq c14084qq = new C14084qq();
        int iM61915dq = c13333zs.m61915dq();
        if (iM61915dq == 1) {
            C14084qq c14084qqClone = C14084qq.m67081jd().Clone();
            c14084qqM67138k4 = c13333zs.f44675k4.m67138k4(C14084qq.m67073c5(new C14084qq(c14084qqClone.m67158yj(), c14084qqClone.m67129dy(), c14084qqClone.m67153x1()), new C14084qq(c13333zs.m61949k4(), c13333zs.m61954x1(), c13333zs.m61950kk())).Clone().Clone());
        } else {
            if (iM61915dq == 6 || iM61915dq == 7) {
                c14084qq = new C14084qq(C14084qq.m67081jd().m67158yj(), c13333zs.m61954x1(), c13333zs.m61950kk());
                C14043ar c14043ar = new C14043ar();
                int iM61941xk = c13333zs.m61941xk();
                return iM61941xk == 1 ? iM61941xk != 2 ? iM61941xk != 3 ? c14043ar : new C14043ar(c14084qq.Clone(), new C14077m4(c13333zs.m61946dy(), c13333zs.m61944c5(), 0)) : new C14043ar(c14084qq.Clone(), new C14077m4(-c13333zs.m61946dy(), -c13333zs.m61944c5(), 0)) : new C14043ar(c14084qq.Clone(), new C14077m4(0L));
            }
            c14084qqM67138k4 = c13333zs.f44675k4;
        }
        c14084qqM67138k4.CloneTo(c14084qq);
        C14043ar c14043ar2 = new C14043ar();
        int iM61941xk2 = c13333zs.m61941xk();
        if (iM61941xk2 == 1) {
        }
    }

    public C13333zs(C14043ar c14043ar, int i) {
        this.f44675k4 = new C14084qq();
        c14043ar.m66418k4().CloneTo(this.f44675k4);
        C14077m4 c14077m4M66815fa = c14043ar.m66420kk().Clone();
        int i2 = 1;
        int iM65611x1 = C13936m9.m65611x1(((long) i) & 4294967295L) - 1;
        if (c14077m4M66815fa.m66814dy() < 0.0d) {
            c14077m4M66815fa.m66812ck().CloneTo(c14077m4M66815fa);
            i2 = 2;
        } else if (c14077m4M66815fa.m66814dy() > 0.0d) {
            i2 = 3;
        }
        this.f44676x1 = ((long) (c14077m4M66815fa.m66820kk() | (iM65611x1 << 24) | (i2 << 16) | (c14077m4M66815fa.m66825x1() << 8))) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61919k4(C6765kp c6765kp) {
        char[] cArr = new char[f44663m9];
        m61922k4(cArr, 0, m61949k4(), 4);
        cArr[f44661kk] = '-';
        m61921k4(cArr, f44667to, m61954x1());
        cArr[f44655du] = '-';
        m61921k4(cArr, f44658h4, m61950kk());
        c6765kp.m26798k4(cArr);
    }

    /* JADX INFO: renamed from: x1 */
    private void m61939x1(C6765kp c6765kp) {
        char[] cArr = new char[f44670up];
        m61921k4(cArr, 0, m61953to());
        cArr[f44653c5] = ':';
        m61921k4(cArr, f44660jd, m61945du());
        cArr[f44654ck] = ':';
        m61921k4(cArr, f44657fa, m61947h4());
        c6765kp.m26798k4(cArr);
        int iM61952m9 = m61952m9();
        if (iM61952m9 != 0) {
            int i = 7;
            while (iM61952m9 % 10 == 0) {
                i--;
                iM61952m9 /= 10;
            }
            char[] cArr2 = new char[i + 1];
            cArr2[0] = FilenameUtils.EXTENSION_SEPARATOR;
            m61922k4(cArr2, 1, iM61952m9, i);
            c6765kp.m26798k4(cArr2);
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13333zs c13333zs) {
        if (c13333zs == null) {
            c13333zs = new C13333zs();
        }
        this.f44675k4.CloneTo(c13333zs.f44675k4);
        c13333zs.f44676x1 = this.f44676x1;
    }

    public C13333zs(C14084qq c14084qq, int i) {
        C14084qq c14084qq2 = new C14084qq();
        this.f44675k4 = c14084qq2;
        c14084qq.CloneTo(c14084qq2);
        int iM65611x1 = C13936m9.m65611x1(((long) i) & 4294967295L) - 1;
        int iM67127du = (int) c14084qq.m67127du();
        this.f44676x1 = ((long) ((iM65611x1 << 24) | (((iM67127du == 0 || iM67127du != 1) ? 0 : 1) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61920k4(k4 k4Var) {
        C14084qq c14084qq = new C14084qq(k4Var.f44690x1, k4Var.f44686kk, k4Var.f44688to, k4Var.f44680du, k4Var.f44683h4, k4Var.f44687m9);
        this.f44675k4 = c14084qq;
        int i = k4Var.f44681dy;
        if (i != 0) {
            c14084qq.m67137k4(i).CloneTo(this.f44675k4);
        }
        this.f44676x1 = ((long) (k4Var.f44679ck | (k4Var.f44685k4 << 24) | (k4Var.f44678c5 << 16) | (k4Var.f44684jd << 8))) & 4294967295L;
    }

    public C13333zs(String str, int i) {
        this();
        k4 k4Var = new k4();
        if (!k4Var.m61967k4(str, i)) {
            throw new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, Integer.valueOf(i)));
        }
        m61920k4(k4Var.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m61921k4(char[] cArr, int i, int i2) {
        cArr[i] = (char) ((i2 / 10) + 48);
        cArr[i + 1] = (char) ((i2 % 10) + 48);
    }

    /* JADX INFO: renamed from: k4 */
    private void m61922k4(char[] cArr, int i, int i2, int i3) {
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            cArr[i + i4] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m61923k4(String str, int i, C13333zs[] c13333zsArr) {
        k4 k4Var = new k4();
        if (k4Var.m61967k4(str, i)) {
            c13333zsArr[0] = new C13333zs(k4Var.Clone());
            return true;
        }
        c13333zsArr[0] = new C13333zs();
        return false;
    }
}
