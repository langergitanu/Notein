package com.aspose.slides.internal.p349q3;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9676m9 {

    /* JADX INFO: renamed from: k4 */
    private byte f35000k4;

    /* JADX INFO: renamed from: kk */
    private byte f35001kk;

    /* JADX INFO: renamed from: to */
    private byte f35002to;

    /* JADX INFO: renamed from: x1 */
    private byte f35003x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.q3.m9$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Byte.class) { // from class: com.aspose.slides.internal.q3.m9.k4.1
                {
                    addConstant("NotTransparency", 0L);
                    addConstant("AC_SRC_ALPHA", 1L);
                }
            });
        }

        private k4() {
        }
    }

    public C9676m9(long j) {
        m47445k4((byte) (255 & j));
        m47452x1((byte) 0);
        m47448kk((byte) (((16711680 & j) >> 16) & 4294967295L));
        m47450to((byte) ((j & 4278190080L) >> 24));
    }

    /* JADX INFO: renamed from: du */
    public final byte m47443du() {
        return this.f35002to;
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
        return m47446k4((C9676m9) obj);
    }

    public int hashCode() {
        return (((((C14098up.m67317k4(this.f35000k4) * 397) ^ C14098up.m67317k4(this.f35003x1)) * 397) ^ C14098up.m67317k4(this.f35001kk)) * 397) ^ (this.f35002to & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47444k4() {
        return (((long) ((m47451x1() & 255) | ((m47447kk() & 255) << 8) | ((m47449to() & 255) << 16))) | ((((long) (m47443du() & 255)) & 4294967295L) << 24)) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m47447kk() {
        return this.f35003x1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m47449to() {
        return this.f35001kk;
    }

    public String toString() {
        return C14113y2.m67402k4("Data: {0}, BlendOperation: {1}, BlendFlags: {2}, SrcConstantAlpha: {3}, AlphaFormat: {4}", Long.valueOf(m47444k4()), Byte.valueOf(m47451x1()), Byte.valueOf(m47447kk()), Byte.valueOf(m47449to()), C14042ak.m66410k4(k4.class, m47443du()));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m47451x1() {
        return this.f35000k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47445k4(byte b) {
        this.f35000k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47448kk(byte b) {
        this.f35001kk = b;
    }

    /* JADX INFO: renamed from: to */
    public final void m47450to(byte b) {
        this.f35002to = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47452x1(byte b) {
        if ((b & 255) != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f35003x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47446k4(C9676m9 c9676m9) {
        return this.f35000k4 == c9676m9.f35000k4 && this.f35003x1 == c9676m9.f35003x1 && this.f35001kk == c9676m9.f35001kk && this.f35002to == c9676m9.f35002to;
    }
}
