package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.pz */
/* JADX INFO: loaded from: classes3.dex */
class C14321pz {

    /* JADX INFO: renamed from: du */
    public static final C14321pz f48203du = new C14321pz(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: h4 */
    public static final C14321pz f48204h4 = new C14321pz(1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: k4 */
    float f48205k4;

    /* JADX INFO: renamed from: kk */
    float f48206kk;

    /* JADX INFO: renamed from: to */
    float f48207to;

    /* JADX INFO: renamed from: x1 */
    float f48208x1;

    public C14321pz(float f, float f2, float f3) {
        this.f48205k4 = 1.0f;
        this.f48208x1 = f;
        this.f48206kk = f2;
        this.f48207to = f3;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m69334k4(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) f;
    }

    /* JADX INFO: renamed from: kk */
    public static float m69335kk(float f, float f2, float f3) {
        if (f < f2) {
            f = f2;
        }
        return f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: to */
    private static float m69336to(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (f3 >= 360.0f) {
            f3 -= 360.0f;
        }
        if (f3 < 180.0f) {
            return f3 < 60.0f ? (((f2 - f) * f3) / 60.0f) + f : f2;
        }
        if (f3 < 240.0f) {
            return (((240.0f - f3) * (f2 - f)) / 60.0f) + f;
        }
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    private static float m69337x1(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public boolean equals(Object obj) {
        if (obj == null || C14067j2.m66727k4(this) != C14067j2.m66727k4(obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return m69341k4((C14321pz) obj);
    }

    public int hashCode() {
        return ((m69334k4(this.f48205k4) ^ m69334k4(this.f48208x1)) ^ m69334k4(this.f48206kk)) ^ m69334k4(this.f48207to);
    }

    public C14321pz(float f, float f2, float f3, float f4) {
        this.f48205k4 = f;
        this.f48208x1 = f2;
        this.f48206kk = f3;
        this.f48207to = f4;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14321pz m69338x1(float f, float f2, float f3) {
        C14321pz c14321pz = new C14321pz(0.0f, 0.0f, 0.0f);
        c14321pz.m69340k4(f, f2, f3);
        return c14321pz;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m69339k4() {
        return (C14064he.m66715kk(this.f48208x1) || C14064he.m66715kk(this.f48206kk) || C14064he.m66715kk(this.f48207to) || C14064he.m66715kk(this.f48205k4)) ? C12003du.f40505to.Clone() : C12003du.m56398k4(OooO.OooO00o(m69337x1(this.f48205k4) * 255.0f, 14), OooO.OooO00o(m69337x1(this.f48208x1) * 255.0f, 14), OooO.OooO00o(m69337x1(this.f48206kk) * 255.0f, 14), OooO.OooO00o(m69337x1(this.f48207to) * 255.0f, 14));
    }

    public C14321pz(C12003du c12003du) {
        this.f48205k4 = 1.0f;
        if (c12003du.m56504dy()) {
            this.f48207to = 0.0f;
            this.f48206kk = 0.0f;
            this.f48208x1 = 0.0f;
            this.f48205k4 = 1.0f;
            return;
        }
        this.f48205k4 = (c12003du.m56501c5() & 255) / 255.0f;
        this.f48208x1 = (c12003du.m56507jd() & 255) / 255.0f;
        this.f48206kk = (c12003du.m56502ck() & 255) / 255.0f;
        this.f48207to = (c12003du.m56505fa() & 255) / 255.0f;
    }

    public C14321pz(C14321pz c14321pz) {
        this.f48205k4 = 1.0f;
        if (c14321pz != null) {
            this.f48205k4 = c14321pz.f48205k4;
            this.f48208x1 = c14321pz.f48208x1;
            this.f48206kk = c14321pz.f48206kk;
            this.f48207to = c14321pz.f48207to;
            return;
        }
        this.f48207to = 0.0f;
        this.f48206kk = 0.0f;
        this.f48208x1 = 0.0f;
        this.f48205k4 = 1.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69340k4(float f, float f2, float f3) {
        if (f2 < 1.0E-4d) {
            this.f48207to = f3;
            this.f48206kk = f3;
            this.f48208x1 = f3;
        } else {
            float fOooO0O0 = ((double) f3) < 0.5d ? (f2 + 1.0f) * f3 : OooOO0.OooO0OO.OooO0O0(1.0f, f2, f3, f2);
            float f4 = (f3 * 2.0f) - fOooO0O0;
            this.f48208x1 = m69335kk(m69336to(f4, fOooO0O0, f + 120.0f), 0.0f, 1.0f);
            this.f48206kk = m69335kk(m69336to(f4, fOooO0O0, f), 0.0f, 1.0f);
            this.f48207to = m69335kk(m69336to(f4, fOooO0O0, f - 120.0f), 0.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69341k4(C14321pz c14321pz) {
        return c14321pz != null && this.f48205k4 == c14321pz.f48205k4 && this.f48208x1 == c14321pz.f48208x1 && this.f48206kk == c14321pz.f48206kk && this.f48207to == c14321pz.f48207to;
    }
}
