package com.aspose.slides.internal.p077d8;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.yj */
/* JADX INFO: loaded from: classes3.dex */
class C3112yj {

    /* JADX INFO: renamed from: k4 */
    private C3093up[] f9244k4 = new C3093up[64];

    /* JADX INFO: renamed from: x1 */
    private int f9245x1;

    /* JADX INFO: renamed from: k4 */
    public final int m13266k4() {
        return this.f9245x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C3093up m13271kk() {
        return this.f9244k4[this.f9245x1 - 1];
    }

    /* JADX INFO: renamed from: to */
    public final boolean m13273to(String str) {
        String strM13268k4 = m13268k4(str);
        int i = 0;
        while (true) {
            C3034ar c3034ar = C3083s7.f9152k4;
            if (i >= c3034ar.m12771k4()) {
                return false;
            }
            if (C14113y2.m67363du(strM13268k4, c3034ar.m12772k4(i).m13026x1())) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13274x1() {
        this.f9245x1--;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3093up m13267k4(int i) {
        return this.f9244k4[(this.f9245x1 - 1) - i];
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m13272kk(String str) {
        if (C3083s7.f9152k4.m12773k4(str)) {
            return false;
        }
        for (int i = this.f9245x1 - 1; i >= 0; i--) {
            if (this.f9244k4[i].m13142kk(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m13275x1(String str) {
        String strM13268k4 = m13268k4(str);
        if ("http://schemas.openxmlformats.org/markup-compatibility/2006".equals(strM13268k4)) {
            return true;
        }
        return m13272kk(strM13268k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13268k4(String str) {
        for (int i = this.f9245x1 - 1; i >= 0; i--) {
            String strM13144x1 = this.f9244k4[i].m13144x1(str);
            if (strM13144x1 != null) {
                return strM13144x1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13269k4(C3093up c3093up) {
        int i = this.f9245x1;
        C3093up[] c3093upArr = this.f9244k4;
        if (i >= c3093upArr.length) {
            C3093up[] c3093upArr2 = new C3093up[(c3093upArr.length / 2) + c3093upArr.length + 8];
            System.arraycopy(c3093upArr, 0, c3093upArr2, 0, c3093upArr.length);
            this.f9244k4 = c3093upArr2;
        }
        C3093up[] c3093upArr3 = this.f9244k4;
        int i2 = this.f9245x1;
        this.f9245x1 = i2 + 1;
        c3093upArr3[i2] = c3093up;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13270k4(String str, String str2) {
        String strM13268k4 = m13268k4(str);
        int i = this.f9245x1 - 1;
        while (true) {
            if (i < 0) {
                return "http://schemas.openxmlformats.org/markup-compatibility/2006".equals(strM13268k4) && ("AlternateContent".equals(str2) || "Choice".equals(str2) || "Fallback".equals(str2));
            }
            for (int i2 = 0; i2 < this.f9244k4[i].m13137k4(); i2++) {
                if (this.f9244k4[i].m13143kk(strM13268k4, str2)) {
                    return true;
                }
            }
            i--;
        }
    }
}
