package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.fa */
/* JADX INFO: loaded from: classes.dex */
public class C3786fa {

    /* JADX INFO: renamed from: k4 */
    public int f10318k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, Float> f10322x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final List<String> f10319kk = new List<>(AbstractC14092to.m67204k4((Object[]) new String[]{"x", "x1", "x2", "cx", "rx", "width"}));

    /* JADX INFO: renamed from: to */
    private final List<String> f10321to = new List<>(AbstractC14092to.m67204k4((Object[]) new String[]{"y", "y1", "y2", TranslateLanguage.WELSH, "ry", "height"}));

    /* JADX INFO: renamed from: du */
    private final List<String> f10316du = new List<>(AbstractC14092to.m67204k4((Object[]) new String[]{"xy"}));

    /* JADX INFO: renamed from: h4 */
    private float f10317h4 = 0.0f;

    /* JADX INFO: renamed from: m9 */
    private float f10320m9 = 0.0f;

    /* JADX INFO: renamed from: k4 */
    public static float m15121k4() {
        return (float) C12566m9.f42081k4;
    }

    /* JADX INFO: renamed from: kk */
    public static float m15122kk() {
        return 96.0f / m15121k4();
    }

    /* JADX INFO: renamed from: x1 */
    public static float m15123x1() {
        return m15121k4() / 96.0f;
    }

    /* JADX INFO: renamed from: du */
    public final float m15124du() {
        return this.f10320m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m15132to() {
        return this.f10317h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m15125k4(C10307du c10307du, String str, C3181c5 c3181c5, C12015qq c12015qq) {
        float fM15121k4;
        float f;
        try {
            float fM50265k4 = c10307du.m50265k4();
            float fM15127k4 = 1.0f;
            if (C14116yg.m67480k4(fM50265k4) <= 1.0f && this.f10318k4 == 1) {
                fM50265k4 *= 100.0f;
                c10307du.m50266k4(fM50265k4);
                c10307du.m50267k4(2);
            }
            int iM50269x1 = c10307du.m50269x1();
            if (iM50269x1 == 13) {
                return fM50265k4 * 10.0f;
            }
            switch (iM50269x1) {
                case 1:
                case 5:
                    return m15131kk(fM50265k4);
                case 2:
                    if (c12015qq.m56696k4()) {
                        c12015qq = new C12015qq(this.f10317h4, this.f10320m9);
                    }
                    C12015qq c12015qqClone = c12015qq.Clone();
                    if (this.f10319kk.containsItem(str)) {
                        fM50265k4 = (fM50265k4 * c12015qqClone.m56699x1()) / 100.0f;
                    }
                    if (this.f10321to.containsItem(str)) {
                        fM50265k4 = (fM50265k4 * c12015qqClone.m56697kk()) / 100.0f;
                    }
                    if (!this.f10316du.containsItem(str)) {
                        return fM50265k4;
                    }
                    return (fM50265k4 * ((float) (C14116yg.m67496rv((c12015qqClone.m56697kk() * c12015qqClone.m56697kk()) + (c12015qqClone.m56699x1() * c12015qqClone.m56699x1())) / C14116yg.m67496rv(2.0d)))) / 100.0f;
                case 3:
                    if (!"font-size".equals(str) && c3181c5 != null && c3181c5.f9461x1.containsKey("font-size")) {
                        fM15127k4 = m15127k4(c3181c5.f9461x1.get_Item("font-size"), c3181c5, 10.0f);
                    }
                    return fM50265k4 * fM15127k4;
                case 4:
                    return fM50265k4 / 4.30554f;
                case 6:
                    fM15121k4 = m15121k4();
                    f = 2.54f;
                    break;
                case 7:
                    fM15121k4 = m15121k4();
                    f = 25.4f;
                    break;
                case 8:
                    return fM50265k4 * m15121k4();
                case 9:
                    return (fM50265k4 / 72.0f) * m15121k4();
                case 10:
                    return ((fM50265k4 * 12.0f) / 72.0f) * m15121k4();
                default:
                    return fM50265k4;
            }
            return (fM15121k4 / f) * fM50265k4;
        } catch (RuntimeException e) {
            if (C4113k4.f11284k4) {
                return 0.0f;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final float m15131kk(float f) {
        return m15123x1() * f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m15133x1(float f) {
        this.f10320m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m15126k4(C12007ix c12007ix, float f, boolean z) {
        return ((z ? c12007ix.m56575x1() : c12007ix.m56550c5()) / 100.0f) * f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m15127k4(String str, C3181c5 c3181c5, float f) {
        float fM50265k4;
        int iM50269x1;
        float fM15121k4;
        float fM15121k42;
        float f2;
        float fM15131kk = 0.0f;
        Float[] fArr = {Float.valueOf(0.0f)};
        boolean zTryGetValue = this.f10322x1.tryGetValue(str, fArr);
        float fFloatValue = fArr[0].floatValue();
        if (zTryGetValue) {
            return fFloatValue;
        }
        C10307du c10307duM50262k4 = C10307du.m50262k4(str, C10307du.m50263kk(0.0f));
        try {
            fM50265k4 = c10307duM50262k4.m50265k4();
            if (C14116yg.m67480k4(fM50265k4) <= 1.0f && this.f10318k4 == 1) {
                fM50265k4 *= 100.0f;
                c10307duM50262k4.m50266k4(fM50265k4);
                c10307duM50262k4.m50267k4(2);
            }
            iM50269x1 = c10307duM50262k4.m50269x1();
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
        if (iM50269x1 != 13) {
            switch (iM50269x1) {
                case 1:
                case 5:
                    fM15131kk = m15131kk(fM50265k4);
                    break;
                case 2:
                    fM50265k4 /= 100.0f;
                    fM50265k4 *= f;
                    fM15131kk = fM50265k4;
                    break;
                case 3:
                    fM50265k4 *= f;
                    fM15131kk = fM50265k4;
                    break;
                case 4:
                    fM50265k4 /= 4.30554f;
                    fM15131kk = fM50265k4;
                    break;
                case 6:
                    fM15121k42 = m15121k4();
                    f2 = 2.54f;
                    fM15131kk = (fM15121k42 / f2) * fM50265k4;
                    break;
                case 7:
                    fM15121k42 = m15121k4();
                    f2 = 25.4f;
                    fM15131kk = (fM15121k42 / f2) * fM50265k4;
                    break;
                case 8:
                    fM15121k4 = m15121k4();
                    break;
                case 9:
                    fM50265k4 /= 72.0f;
                    fM15121k4 = m15121k4();
                    break;
                case 10:
                    fM50265k4 = (fM50265k4 * 12.0f) / 72.0f;
                    fM15121k4 = m15121k4();
                    break;
                default:
                    fM15131kk = fM50265k4;
                    break;
            }
            if (c10307duM50262k4.m50269x1() != 2) {
                this.f10322x1.addItem(str, Float.valueOf(fM15131kk));
            }
            return fM15131kk;
        }
        fM15121k4 = 10.0f;
        fM50265k4 *= fM15121k4;
        fM15131kk = fM50265k4;
        if (c10307duM50262k4.m50269x1() != 2) {
        }
        return fM15131kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m15128k4(String str, String str2, C3181c5 c3181c5) {
        return m15129k4(str, str2, c3181c5, C12015qq.f40552k4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final float m15129k4(String str, String str2, C3181c5 c3181c5, C12015qq c12015qq) {
        Float[] fArr = {Float.valueOf(0.0f)};
        boolean zTryGetValue = this.f10322x1.tryGetValue(str, fArr);
        float fFloatValue = fArr[0].floatValue();
        if (zTryGetValue) {
            return fFloatValue;
        }
        C10307du c10307duM50262k4 = C10307du.m50262k4(str, C10307du.m50263kk(0.0f));
        float fM15125k4 = m15125k4(c10307duM50262k4, str2, c3181c5, c12015qq.Clone());
        if (c10307duM50262k4.m50269x1() != 2) {
            this.f10322x1.addItem(str, Float.valueOf(fM15125k4));
        }
        return fM15125k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15130k4(float f) {
        this.f10317h4 = f;
    }
}
