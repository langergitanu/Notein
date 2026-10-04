package com.aspose.slides.internal.p393s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10156k4 {

    /* JADX INFO: renamed from: du */
    private char[] f36543du;

    /* JADX INFO: renamed from: h4 */
    private String[] f36544h4;

    /* JADX INFO: renamed from: k4 */
    private String f36545k4;

    /* JADX INFO: renamed from: kk */
    private char[] f36546kk;

    /* JADX INFO: renamed from: m9 */
    private char f36547m9 = 0;

    /* JADX INFO: renamed from: to */
    private char[] f36548to;

    /* JADX INFO: renamed from: x1 */
    private char[] f36549x1;

    public C10156k4(String str, int[] iArr, String[] strArr) {
        this.f36545k4 = str;
        m49943k4(iArr);
        if (strArr != null) {
            this.f36544h4 = new String[256];
            for (int i = 0; i < 256; i++) {
                String str2 = strArr[i];
                if (str2 == null) {
                    this.f36544h4[i] = ".notdef";
                } else {
                    this.f36544h4[i] = str2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49941k4(int i) {
        char c;
        if (i < 256 && (c = this.f36549x1[i]) > 0) {
            return c;
        }
        int length = this.f36546kk.length - 1;
        int i2 = 0;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            char c2 = this.f36546kk[i3];
            if (i == c2) {
                return this.f36548to[i3];
            }
            if (i < c2) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return this.f36547m9;
    }

    public String toString() {
        return m49942k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m49942k4() {
        return this.f36545k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49943k4(int[] iArr) {
        char[] cArr;
        int i;
        char c;
        this.f36549x1 = new char[256];
        this.f36543du = new char[256];
        int i2 = 0;
        while (true) {
            char[] cArr2 = this.f36543du;
            if (i2 >= cArr2.length) {
                break;
            }
            cArr2[i2] = 65535;
            i2++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            char c2 = (char) iArr[i4 + 1];
            if (c2 < 256) {
                char[] cArr3 = this.f36549x1;
                if (cArr3[c2] == 0) {
                    cArr3[c2] = (char) iArr[i4];
                }
            } else {
                i3++;
            }
            char[] cArr4 = this.f36543du;
            int i5 = iArr[i4];
            if (cArr4[i5] == 65535) {
                cArr4[i5] = c2;
            }
        }
        this.f36546kk = new char[i3];
        this.f36548to = new char[i3];
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length; i7 += 2) {
            char c3 = (char) iArr[i7 + 1];
            if (c3 >= 256) {
                int i8 = i6 + 1;
                while (i6 >= 0) {
                    if (i6 <= 0 || (c = (cArr = this.f36546kk)[i6 - 1]) < c3) {
                        this.f36546kk[i6] = c3;
                        this.f36548to[i6] = (char) iArr[i7];
                        break;
                    } else {
                        cArr[i6] = c;
                        char[] cArr5 = this.f36548to;
                        cArr5[i6] = cArr5[i];
                        i6--;
                    }
                }
                i6 = i8;
            }
        }
    }
}
