package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.z2 */
/* JADX INFO: loaded from: classes3.dex */
final class C14870z2 implements IColorSchemeEffectiveData, InterfaceC14672vc {

    /* JADX INFO: renamed from: k4 */
    String f50438k4;

    /* JADX INFO: renamed from: kk */
    C13714k6 f50439kk;

    /* JADX INFO: renamed from: x1 */
    ColorFormat[] f50440x1;

    public C14870z2() {
        this(null);
    }

    /* JADX INFO: renamed from: c5 */
    public C12003du m74196c5() {
        return m74204k4((byte) 8);
    }

    /* JADX INFO: renamed from: ck */
    public C12003du m74197ck() {
        return m74204k4((byte) 10);
    }

    /* JADX INFO: renamed from: du */
    public C12003du m74198du() {
        return m74204k4((byte) 4);
    }

    /* JADX INFO: renamed from: dy */
    public C12003du m74199dy() {
        return m74204k4((byte) 7);
    }

    public boolean equals(Object obj) {
        C14870z2 c14870z2 = (C14870z2) C7019kk.m27452k4(obj, C14870z2.class);
        if (c14870z2 == null) {
            return false;
        }
        return m74206k4(c14870z2);
    }

    /* JADX INFO: renamed from: fa */
    public C12003du m74200fa() {
        return m74204k4((byte) 11);
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getAccent1() {
        return (Integer) C12003du.m56473x1(m74198du());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getAccent2() {
        return (Integer) C12003du.m56473x1(m74201h4());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getAccent3() {
        return (Integer) C12003du.m56473x1(m74208m9());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getAccent4() {
        return (Integer) C12003du.m56473x1(m74199dy());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getAccent5() {
        return (Integer) C12003du.m56473x1(m74196c5());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getAccent6() {
        return (Integer) C12003du.m56473x1(m74202jd());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getByColorSchemeIndex(byte b) {
        return (Integer) C12003du.m56473x1(m74204k4(b));
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getDark1() {
        return (Integer) C12003du.m56473x1(m74203k4());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getDark2() {
        return (Integer) C12003du.m56473x1(m74207kk());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getFollowedHyperlink() {
        return (Integer) C12003du.m56473x1(m74200fa());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getHyperlink() {
        return (Integer) C12003du.m56473x1(m74197ck());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getLight1() {
        return (Integer) C12003du.m56473x1(m74212x1());
    }

    @Override // com.aspose.slides.IColorSchemeEffectiveData
    public final Integer getLight2() {
        return (Integer) C12003du.m56473x1(m74209to());
    }

    /* JADX INFO: renamed from: h4 */
    public C12003du m74201h4() {
        return m74204k4((byte) 5);
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: jd */
    public C12003du m74202jd() {
        return m74204k4((byte) 9);
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m74203k4() {
        return m74204k4((byte) 0);
    }

    /* JADX INFO: renamed from: kk */
    public C12003du m74207kk() {
        return m74204k4((byte) 2);
    }

    /* JADX INFO: renamed from: m9 */
    public C12003du m74208m9() {
        return m74204k4((byte) 6);
    }

    /* JADX INFO: renamed from: to */
    public C12003du m74209to() {
        return m74204k4((byte) 3);
    }

    /* JADX INFO: renamed from: up */
    public final String m74210up() {
        return this.f50438k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final ColorFormat m74211x1(byte b) {
        int i = b & 255;
        if (i >= 0) {
            ColorFormat[] colorFormatArr = this.f50440x1;
            if (i < colorFormatArr.length) {
                return colorFormatArr[i];
            }
        }
        throw new PptException("ColorScheme: wrong index");
    }

    public C14870z2(ColorScheme colorScheme) {
        this.f50438k4 = null;
        this.f50440x1 = new ColorFormat[12];
        int i = 0;
        if (colorScheme == null) {
            this.f50439kk = new C13714k6();
            while (i < 12) {
                this.f50440x1[i] = null;
                i++;
            }
            return;
        }
        if (!C14113y2.m67411k4(colorScheme.m1127k4())) {
            this.f50438k4 = colorScheme.m1127k4();
        }
        while (i < 12) {
            ColorFormat colorFormat = colorScheme.f1989x1[i];
            if (colorFormat.getColorType() != -1) {
                this.f50440x1[i] = colorFormat;
            }
            i++;
        }
        C13714k6 c13714k6 = new C13714k6();
        this.f50439kk = c13714k6;
        c13714k6.m63655k4(colorScheme.m1133x1());
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m74204k4(byte b) {
        int i = b & 255;
        if (i >= 0) {
            ColorFormat[] colorFormatArr = this.f50440x1;
            if (i < colorFormatArr.length) {
                return colorFormatArr[i].m1084to();
            }
        }
        return C12003du.m56460uz();
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m74212x1() {
        return m74204k4((byte) 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74205k4(C14870z2 c14870z2, ColorScheme colorScheme) {
        ColorFormat colorFormat;
        if (c14870z2 != null) {
            this.f50438k4 = c14870z2.f50438k4;
            System.arraycopy(c14870z2.f50440x1, 0, this.f50440x1, 0, 12);
            this.f50439kk.m63655k4(c14870z2.f50439kk);
        }
        if (colorScheme != null) {
            if (!C14113y2.m67411k4(colorScheme.m1127k4())) {
                this.f50438k4 = colorScheme.m1127k4();
            }
            for (int i = 0; i <= 11; i++) {
                if (colorScheme.f1989x1[i].getColorType() != -1 && (colorFormat = colorScheme.f1989x1[i]) != null) {
                    this.f50440x1[i] = colorFormat;
                }
            }
            this.f50439kk.m63655k4(colorScheme.m1133x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74206k4(C14870z2 c14870z2) {
        if (c14870z2 == null) {
            return false;
        }
        for (int i = 0; i <= 11; i++) {
            if (!C14067j2.m66728k4(this.f50440x1[i], c14870z2.f50440x1[i])) {
                return false;
            }
        }
        return true;
    }
}
