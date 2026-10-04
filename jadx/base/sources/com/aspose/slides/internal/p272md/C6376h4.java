package com.aspose.slides.internal.p272md;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14052dq;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.md.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6376h4 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f18158k4;

    public C6376h4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (bArr.length != 10) {
            throw new ArgumentException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        this.f18158k4 = bArr;
    }

    /* JADX INFO: renamed from: c5 */
    public int m26195c5() {
        return this.f18158k4[8] & 255;
    }

    /* JADX INFO: renamed from: du */
    public int m26196du() {
        return this.f18158k4[4] & 255;
    }

    /* JADX INFO: renamed from: dy */
    public int m26197dy() {
        return this.f18158k4[7] & 255;
    }

    /* JADX INFO: renamed from: h4 */
    public int m26198h4() {
        return this.f18158k4[5] & 255;
    }

    /* JADX INFO: renamed from: jd */
    public int m26199jd() {
        return this.f18158k4[9] & 255;
    }

    /* JADX INFO: renamed from: k4 */
    public int m26200k4() {
        return this.f18158k4[0] & 255;
    }

    /* JADX INFO: renamed from: kk */
    public int m26201kk() {
        return this.f18158k4[2] & 255;
    }

    /* JADX INFO: renamed from: m9 */
    public int m26202m9() {
        return this.f18158k4[6] & 255;
    }

    /* JADX INFO: renamed from: to */
    public int m26203to() {
        return this.f18158k4[3] & 255;
    }

    public String toString() {
        return "FamilyType: " + AbstractC14106wy.getName((Class<?>) C6379kk.class, m26200k4()) + C14052dq.f47188k4 + "SerifStyle: " + AbstractC14106wy.getName((Class<?>) C6375dy.class, m26204x1()) + C14052dq.f47188k4 + "Weight: " + AbstractC14106wy.getName((Class<?>) C6377jd.class, m26201kk()) + C14052dq.f47188k4 + "Proportion: " + AbstractC14106wy.getName((Class<?>) C6380m9.class, m26203to()) + C14052dq.f47188k4 + "Contrast: " + AbstractC14106wy.getName((Class<?>) C6382x1.class, m26196du()) + C14052dq.f47188k4 + "StrokeVariation: " + AbstractC14106wy.getName((Class<?>) C6372c5.class, m26198h4()) + C14052dq.f47188k4 + "ArmStyle: " + AbstractC14106wy.getName((Class<?>) C6378k4.class, m26202m9()) + C14052dq.f47188k4 + "Letterform: " + AbstractC14106wy.getName((Class<?>) C6381to.class, m26197dy()) + C14052dq.f47188k4 + "Midline: " + AbstractC14106wy.getName((Class<?>) C6374du.class, m26195c5()) + C14052dq.f47188k4 + "XHeight: " + AbstractC14106wy.getName((Class<?>) C6373ck.class, m26199jd()) + C14052dq.f47188k4;
    }

    /* JADX INFO: renamed from: x1 */
    public int m26204x1() {
        return this.f18158k4[1] & 255;
    }
}
