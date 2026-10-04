package com.aspose.slides;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class ls9 {

    /* JADX INFO: renamed from: k4 */
    public final a5d f46088k4;

    public ls9(int i, int i2) {
        this.f46088k4 = new a5d(i, i2);
    }

    /* JADX INFO: renamed from: du */
    public final String m64554du(String str) {
        return C14113y2.m67402k4(this.f46088k4.m3279rv(), str);
    }

    /* JADX INFO: renamed from: dy */
    public final String m64556dy(String str) {
        C6765kp c6765kp = new C6765kp();
        String strM64558k4 = m64558k4();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (C14113y2.m67359c5("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~", C14117yj.m67537ne(cCharAt))) {
                c6765kp.m26792k4(strM64558k4);
            }
            c6765kp.m26780k4(cCharAt);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m64557h4(String str) {
        return C14113y2.m67402k4(this.f46088k4.m3272h4(), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64558k4() {
        return this.f46088k4.m3275kk();
    }

    /* JADX INFO: renamed from: kk */
    public final String m64566kk() {
        return this.f46088k4.m3271fa();
    }

    /* JADX INFO: renamed from: m9 */
    public final String m64570m9(String str) {
        return C14113y2.m67402k4("{1}{0}  {1}", str, this.f46088k4.m3271fa());
    }

    /* JADX INFO: renamed from: to */
    public final String m64571to(String str) {
        return C14113y2.m67402k4("{0}  {1}", str, this.f46088k4.m3271fa());
    }

    /* JADX INFO: renamed from: x1 */
    public final String m64573x1() {
        return this.f46088k4.m3270dy();
    }

    /* JADX INFO: renamed from: du */
    public final String m64555du(String str, String str2) {
        return C14113y2.m67402k4("{0}: \"{1}\"", str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64559k4(String str) {
        return C14113y2.m67402k4("**{0}**", str);
    }

    /* JADX INFO: renamed from: kk */
    public final String m64567kk(String str) {
        return C14113y2.m67402k4(this.f46088k4.m3276ks(), str);
    }

    /* JADX INFO: renamed from: to */
    public final String m64572to(String str, String str2) {
        return C14113y2.m67402k4(this.f46088k4.m3268ck(), str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m64574x1(String str) {
        return C14113y2.m67402k4(this.f46088k4.m3269du(), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64560k4(String str, byte b) {
        float f;
        if (b == 0 || b == 2) {
            f = 40.0f;
        } else if (b == 3) {
            f = 24.0f;
        } else {
            if (b != 6 && b != 7) {
                return str;
            }
            f = 10.0f;
        }
        return m64561k4(str, f);
    }

    /* JADX INFO: renamed from: kk */
    public final String m64568kk(String str, int i) {
        String strM67389k4 = C14113y2.m67389k4(this.f46088k4.m3282x1(), i);
        return C14113y2.m67402k4("{0} {1} {2}", strM67389k4, str, strM67389k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m64575x1(String str, int i) {
        return m64553k4(this.f46088k4.m3278ne(), str, this.f46088k4.m3283x6(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64561k4(String str, float f) {
        if (f <= 0.0f) {
            return str;
        }
        return m64568kk(str, f > 36.0f ? 1 : 6 - C7019kk.m27462to(Float.valueOf(f / 6.0f), 13));
    }

    /* JADX INFO: renamed from: kk */
    public final String m64569kk(String str, String str2) {
        return C14113y2.m67402k4(this.f46088k4.m3273jd(), str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m64576x1(String str, String str2) {
        return C14113y2.m67402k4(this.f46088k4.m3277m9(), str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64562k4(String str, int i) {
        return m64553k4(this.f46088k4.m3284yj(), str, this.f46088k4.m3281up(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64563k4(String str, int i, int i2) {
        return C14113y2.m67402k4("{0}{1}{2}", C14113y2.m67389k4(ControlChar.SPACE_CHAR, i), str, C14113y2.m67389k4(ControlChar.SPACE_CHAR, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64564k4(String str, String str2) {
        return C14113y2.m67402k4(this.f46088k4.m3280to(), str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    private String m64553k4(String str, String str2, char c, int i) {
        return C14113y2.m67402k4(str, C14113y2.m67389k4(c, i * this.f46088k4.m3267c5()), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64565k4(int i) {
        return (i & this.f46088k4.m3274k4()) == 0;
    }
}
