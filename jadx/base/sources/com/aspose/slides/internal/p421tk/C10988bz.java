package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1474c6;
import com.aspose.slides.internal.p058c7.C1988k4;
import com.aspose.slides.internal.p227kg.C5673k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C10988bz extends C1988k4 {

    /* JADX INFO: renamed from: du */
    private int f38294du;

    /* JADX INFO: renamed from: h4 */
    private long f38295h4;

    /* JADX INFO: renamed from: k4 */
    private C5673k4 f38296k4;

    /* JADX INFO: renamed from: kk */
    private short f38297kk;

    /* JADX INFO: renamed from: to */
    private int f38298to;

    /* JADX INFO: renamed from: x1 */
    private short f38299x1;

    public C10988bz() {
    }

    public short au_() {
        return this.f38297kk;
    }

    public int av_() {
        return this.f38294du;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m53202k4((C10988bz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public int mo53197h4() {
        return this.f38298to;
    }

    public int hashCode() {
        C5673k4 c5673k4 = this.f38296k4;
        return ((((((((c5673k4 != null ? c5673k4.hashCode() : 0) * 397) ^ this.f38299x1) * 397) ^ C14088s7.m67172k4(this.f38297kk)) * 397) ^ this.f38298to) * 397) ^ this.f38294du;
    }

    /* JADX INFO: renamed from: ix */
    public final byte m53199ix() {
        return (byte) (this.f38297kk & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53200k4(int i) {
        this.f38294du = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53203kk(long j) {
        this.f38295h4 = j;
    }

    /* JADX INFO: renamed from: ks */
    public final C5673k4 m53204ks() {
        return this.f38296k4;
    }

    /* JADX INFO: renamed from: ne */
    public final byte m53205ne() {
        return (byte) ((this.f38297kk & 65280) >> 8);
    }

    /* JADX INFO: renamed from: rv */
    public final short m53206rv() {
        return this.f38299x1;
    }

    public String toString() {
        return C14113y2.m67402k4("Type: {0}, Flags: {1}, Size: {2}, DataSize: {3}, Offset: {4}", C14042ak.m66410k4(C1474c6.class, this.f38299x1), Short.valueOf(this.f38297kk), Integer.valueOf(this.f38298to), Integer.valueOf(this.f38294du), Long.valueOf(this.f38295h4));
    }

    /* JADX INFO: renamed from: x1 */
    public void mo53207x1(int i) {
        this.f38298to = i;
    }

    /* JADX INFO: renamed from: x6 */
    public final byte m53209x6() {
        return (byte) (this.f38297kk & 255);
    }

    public C10988bz(C5673k4 c5673k4) {
        this.f38296k4 = c5673k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m53198h4(int i) {
        int i2 = 1 << i;
        return (this.f38297kk & i2) == i2;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo53201k4(short s) {
        this.f38297kk = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53208x1(short s) {
        this.f38299x1 = s;
    }

    public C10988bz(C10988bz c10988bz) {
        this(c10988bz.m53204ks());
        m53208x1(c10988bz.m53206rv());
        this.f38297kk = c10988bz.au_();
        this.f38298to = c10988bz.mo53197h4();
        this.f38294du = c10988bz.av_();
        this.f38295h4 = c10988bz.f38295h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53202k4(C10988bz c10988bz) {
        return this.f38299x1 == c10988bz.f38299x1 && this.f38297kk == c10988bz.f38297kk && this.f38298to == c10988bz.f38298to && this.f38294du == c10988bz.f38294du;
    }
}
