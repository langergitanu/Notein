package com.aspose.slides.internal.p183ij;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5014m9 {

    /* JADX INFO: renamed from: k4 */
    private byte f13753k4;

    /* JADX INFO: renamed from: kk */
    private byte f13754kk;

    /* JADX INFO: renamed from: to */
    private byte f13755to;

    /* JADX INFO: renamed from: x1 */
    private byte f13756x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ij.m9$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Byte.class) { // from class: com.aspose.slides.internal.ij.m9.k4.1
                {
                    addConstant("NotTransparency", 0L);
                    addConstant("AC_SRC_ALPHA", 1L);
                }
            });
        }

        private k4() {
        }
    }

    public C5014m9(long j) {
        m21258k4((byte) (255 & j));
        m21265x1((byte) (((65280 & j) >> 8) & 4294967295L));
        m21261kk((byte) (((16711680 & j) >> 16) & 4294967295L));
        m21263to((byte) ((j & 4278190080L) >> 24));
    }

    /* JADX INFO: renamed from: du */
    public final byte m21256du() {
        return this.f13755to;
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
        return m21259k4((C5014m9) obj);
    }

    public int hashCode() {
        return (((((C14098up.m67317k4(this.f13753k4) * 397) ^ C14098up.m67317k4(this.f13756x1)) * 397) ^ C14098up.m67317k4(this.f13754kk)) * 397) ^ (this.f13755to & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21257k4() {
        return (((long) ((m21264x1() & 255) | ((m21260kk() & 255) << 8) | ((m21262to() & 255) << 16))) | ((((long) (m21256du() & 255)) & 4294967295L) << 24)) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m21260kk() {
        return this.f13756x1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m21262to() {
        return this.f13754kk;
    }

    public String toString() {
        return C14113y2.m67402k4("Data: {0}, BlendOperation: {1}, BlendFlags: {2}, SrcConstantAlpha: {3}, AlphaFormat: {4}", Long.valueOf(m21257k4()), Byte.valueOf(m21264x1()), Byte.valueOf(m21260kk()), Byte.valueOf(m21262to()), C14042ak.m66410k4(k4.class, m21256du()));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m21264x1() {
        return this.f13753k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21258k4(byte b) {
        this.f13753k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21261kk(byte b) {
        this.f13754kk = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m21263to(byte b) {
        this.f13755to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21265x1(byte b) {
        if ((b & 255) != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f13756x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21259k4(C5014m9 c5014m9) {
        return this.f13753k4 == c5014m9.f13753k4 && this.f13756x1 == c5014m9.f13756x1 && this.f13754kk == c5014m9.f13754kk && this.f13755to == c5014m9.f13755to;
    }
}
