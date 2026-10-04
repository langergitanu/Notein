package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4308x1 {

    /* JADX INFO: renamed from: k4 */
    public float f11742k4 = 0.0f;

    /* JADX INFO: renamed from: x1 */
    public float f11746x1 = 0.0f;

    /* JADX INFO: renamed from: kk */
    public float f11743kk = 0.0f;

    /* JADX INFO: renamed from: to */
    public float f11745to = 0.0f;

    /* JADX INFO: renamed from: du */
    public float f11739du = 0.0f;

    /* JADX INFO: renamed from: h4 */
    public float f11741h4 = 0.0f;

    /* JADX INFO: renamed from: m9 */
    public float f11744m9 = 0.0f;

    /* JADX INFO: renamed from: dy */
    public float f11740dy = 0.0f;

    /* JADX INFO: renamed from: k4 */
    private static float m17281k4(AbstractC3533um abstractC3533um, int i) {
        AbstractC4282kp abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(i);
        if (abstractC4282kpMo14065x1 != null) {
            return ((float) abstractC4282kpMo14065x1.mo9877dy().mo9879k4()) / 1000.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17283k4(AbstractC3533um abstractC3533um) {
        this.f11742k4 = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_3_ACCENT_2);
        float fM17281k4 = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_4_ACCENT_2);
        this.f11746x1 = fM17281k4;
        float[] fArr = {this.f11742k4};
        float[] fArr2 = {fM17281k4};
        m17282k4(fArr, fArr2);
        this.f11742k4 = fArr[0];
        this.f11746x1 = fArr2[0];
        this.f11743kk = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2);
        float fM17281k42 = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2);
        this.f11745to = fM17281k42;
        float[] fArr3 = {this.f11743kk};
        float[] fArr4 = {fM17281k42};
        m17282k4(fArr3, fArr4);
        this.f11743kk = fArr3[0];
        this.f11745to = fArr4[0];
        this.f11739du = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2);
        float fM17281k43 = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3);
        this.f11741h4 = fM17281k43;
        float[] fArr5 = {this.f11739du};
        float[] fArr6 = {fM17281k43};
        m17282k4(fArr5, fArr6);
        this.f11739du = fArr5[0];
        this.f11741h4 = fArr6[0];
        this.f11744m9 = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_2_ACCENT_3);
        float fM17281k44 = m17281k4(abstractC3533um, StyleIdentifier.GRID_TABLE_3_ACCENT_3);
        this.f11740dy = fM17281k44;
        float[] fArr7 = {this.f11744m9};
        float[] fArr8 = {fM17281k44};
        m17282k4(fArr7, fArr8);
        this.f11744m9 = fArr7[0];
        this.f11740dy = fArr8[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17282k4(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        if (f == 0.0f && fArr2[0] == 0.0f) {
            return;
        }
        if (f == 0.0f || fArr2[0] == 0.0f) {
            if (f == 0.0f) {
                fArr[0] = fArr2[0];
            } else if (fArr2[0] == 0.0f) {
                fArr2[0] = f;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m17284k4() {
        return (this.f11742k4 == 0.0f && this.f11746x1 == 0.0f && this.f11743kk == 0.0f && this.f11745to == 0.0f && this.f11739du == 0.0f && this.f11741h4 == 0.0f && this.f11744m9 == 0.0f && this.f11740dy == 0.0f) ? false : true;
    }
}
