package com.aspose.slides.internal.p135fp;

import com.aspose.slides.internal.p550zi.C13618wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.ix */
/* JADX INFO: loaded from: classes.dex */
public class C4094ix {

    /* JADX INFO: renamed from: c5 */
    private int f11180c5;

    /* JADX INFO: renamed from: dy */
    private int f11182dy;

    /* JADX INFO: renamed from: h4 */
    private int f11183h4;

    /* JADX INFO: renamed from: jd */
    private int f11184jd;

    /* JADX INFO: renamed from: kk */
    private final C13618wy f11186kk;

    /* JADX INFO: renamed from: m9 */
    private int f11187m9;

    /* JADX INFO: renamed from: x1 */
    private byte[] f11189x1;

    /* JADX INFO: renamed from: to */
    private byte f11188to = 0;

    /* JADX INFO: renamed from: du */
    private byte f11181du = 0;

    /* JADX INFO: renamed from: k4 */
    private byte[] f11185k4 = new byte[4096];

    public C4094ix(C13618wy c13618wy) {
        this.f11186kk = c13618wy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r1 = r6.f11184jd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r1 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r6.f11184jd = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r6.f11182dy = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m16294dy() {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            int[] iArr = {i3};
            boolean zM16309x1 = m16309x1(iArr);
            int i4 = iArr[0];
            if (!zM16309x1) {
                return false;
            }
            while (i4 != 255) {
                this.f11184jd++;
                iArr[0] = i4;
                boolean zM16309x12 = m16309x1(iArr);
                i4 = iArr[0];
                if (!zM16309x12) {
                    return false;
                }
            }
            while (true) {
                iArr[0] = i4;
                boolean zM16309x13 = m16309x1(iArr);
                i = iArr[0];
                if (!zM16309x13) {
                    return false;
                }
                if (i != 255) {
                    break;
                }
                i4 = i;
            }
            this.f11184jd = i2 + 2;
            i3 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r5 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        r1 = (byte) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (com.aspose.slides.p559ms.System.AbstractC14106wy.isDefined(com.aspose.slides.internal.p314oc.C7019kk.m27443k4((java.lang.Class<?>) com.aspose.slides.internal.p225ke.C5662du.class), com.aspose.slides.internal.p314oc.C7019kk.m27445k4(r1)) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte m16297du() {
        int i;
        int i2 = this.f11182dy;
        if (i2 != 0) {
            byte b = (byte) i2;
            this.f11182dy = 0;
            return b;
        }
        if (!m16304kk()) {
            return (byte) -39;
        }
        int i3 = 0;
        while (true) {
            int[] iArr = {i3};
            boolean zM16309x1 = m16309x1(iArr);
            int i4 = iArr[0];
            if (!zM16309x1) {
                return (byte) 1;
            }
            while (i4 != 255) {
                iArr[0] = i4;
                boolean zM16309x12 = m16309x1(iArr);
                i4 = iArr[0];
                if (!zM16309x12) {
                    return (byte) 1;
                }
            }
            while (true) {
                iArr[0] = i4;
                boolean zM16309x13 = m16309x1(iArr);
                i = iArr[0];
                if (!zM16309x13) {
                    return (byte) 1;
                }
                if (i != 255) {
                    break;
                }
                i4 = i;
            }
            i3 = i;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m16298h4() {
        this.f11186kk.m62851jd();
        this.f11187m9 = 0;
        this.f11183h4 = 0;
        m16296x1(null, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m16299k4() {
        return this.f11182dy;
    }

    /* JADX INFO: renamed from: kk */
    public void m16303kk(int i) {
        if (i > 0) {
            do {
                int i2 = this.f11187m9;
                if (i > i2) {
                    i -= i2;
                }
            } while (m16306to());
            return;
        }
        this.f11183h4 += i;
        this.f11187m9 -= i;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m16305m9() {
        if (this.f11182dy == 0 && !m16294dy()) {
            return false;
        }
        int i = this.f11182dy;
        int i2 = this.f11180c5;
        if (i == i2 + 208) {
            this.f11182dy = 0;
        } else if (!m16295to(i2)) {
            return false;
        }
        this.f11180c5 = (this.f11180c5 + 1) & 7;
        return true;
    }

    /* JADX INFO: renamed from: to */
    public boolean m16306to() {
        int iM62852k4 = this.f11186kk.m62852k4(this.f11185k4, 0, 4096);
        if (iM62852k4 <= 0) {
            this.f11187m9 = 0;
            return false;
        }
        m16296x1(this.f11185k4, iM62852k4);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16307x1() {
        this.f11180c5 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m16295to(int i) {
        char c;
        do {
            int i2 = this.f11182dy;
            do {
                if (i2 >= 192) {
                    c = (i2 < 208 || i2 > 215 || i2 == ((i + 1) & 7) + 208 || i2 == ((i + 2) & 7) + 208) ? (char) 3 : (i2 == ((i + (-1)) & 7) + 208 || i2 == ((i + (-2)) & 7) + 208) ? (char) 2 : (char) 1;
                }
                if (c == 1) {
                    this.f11182dy = 0;
                    return true;
                }
                if (c != 2) {
                }
            } while (c != 3);
            return true;
        } while (m16294dy());
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public int m16300k4(byte[] bArr, int i) {
        int i2 = this.f11187m9;
        if (i > i2) {
            i = i2;
        }
        System.arraycopy(this.f11189x1, this.f11183h4, bArr, 0, i);
        this.f11183h4 += i;
        this.f11187m9 -= i;
        return i;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m16304kk() {
        return this.f11187m9 != 0 || m16306to();
    }

    /* JADX INFO: renamed from: x1 */
    public void m16308x1(int i) {
        this.f11184jd += i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m16296x1(byte[] bArr, int i) {
        this.f11189x1 = bArr;
        this.f11187m9 = i;
        this.f11183h4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16301k4(int i) {
        this.f11182dy = i;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m16302k4(int[] iArr) {
        if (!m16304kk()) {
            iArr[0] = 0;
            return false;
        }
        this.f11187m9--;
        byte[] bArr = this.f11189x1;
        int i = this.f11183h4;
        iArr[0] = (bArr[i] & 255) << 8;
        this.f11183h4 = i + 1;
        if (!m16304kk()) {
            return false;
        }
        this.f11187m9--;
        int i2 = iArr[0];
        byte[] bArr2 = this.f11189x1;
        int i3 = this.f11183h4;
        iArr[0] = i2 + (bArr2[i3] & 255);
        this.f11183h4 = i3 + 1;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m16309x1(int[] iArr) {
        if (!m16304kk()) {
            iArr[0] = 0;
            return false;
        }
        this.f11187m9--;
        byte[] bArr = this.f11189x1;
        int i = this.f11183h4;
        iArr[0] = bArr[i] & 255;
        this.f11183h4 = i + 1;
        return true;
    }
}
