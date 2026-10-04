package com.aspose.slides.internal.p397sd;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p116ev.C3801kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10225x1 {

    /* JADX INFO: renamed from: k4 */
    private final C3123ar f36666k4;

    public C10225x1() {
        C3123ar c3123ar = new C3123ar(new C3152yj());
        this.f36666k4 = c3123ar;
        c3123ar.m13305k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50085k4(C3801kk c3801kk) {
        AbstractC3150x6 abstractC3150x6M13301k4;
        int i;
        int iM15191du = c3801kk.m15191du();
        this.f36666k4.m13301k4().writeByte((byte) (iM15191du >> 8));
        this.f36666k4.m13301k4().writeByte((byte) (iM15191du & 255));
        int i2 = 0;
        int i3 = 0;
        while (i2 < iM15191du) {
            int iM15192k4 = c3801kk.m15192k4(i2 * 2);
            short s = (short) (iM15192k4 - i3);
            int iM67482k4 = C14116yg.m67482k4((int) s);
            int i4 = iM67482k4 / 238;
            if (i4 <= 8) {
                if (s < 0) {
                    abstractC3150x6M13301k4 = this.f36666k4.m13301k4();
                    i = i4 + 239;
                } else {
                    if (i4 > 0) {
                        abstractC3150x6M13301k4 = this.f36666k4.m13301k4();
                        i = i4 + StyleIdentifier.LIGHT_LIST_ACCENT_6;
                    }
                    this.f36666k4.m13301k4().writeByte((byte) (iM67482k4 - (i4 * 238)));
                }
                abstractC3150x6M13301k4.writeByte((byte) i);
                this.f36666k4.m13301k4().writeByte((byte) (iM67482k4 - (i4 * 238)));
            } else {
                this.f36666k4.m13301k4().writeByte((byte) -18);
                this.f36666k4.m13301k4().writeByte((byte) (s >> 8));
                this.f36666k4.m13301k4().writeByte((byte) (s & 255));
            }
            i2++;
            i3 = iM15192k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m50086k4() {
        return ((C3152yj) this.f36666k4.m13301k4()).toArray();
    }
}
