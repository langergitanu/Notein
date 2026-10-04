package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2362x4 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f8204k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f8205x1;

    public C2362x4(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, true);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f8205x1) {
            this.f8204k4.close();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11645k4(double d) {
        m11651k4(C7019kk.m27468x1(Double.valueOf(C14116yg.m67497to(d * 16384.0d)), 14));
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m11659kk(int i) {
        return m11647k4(i);
    }

    /* JADX INFO: renamed from: to */
    public final int m11661to(long j) {
        this.f8204k4.writeByte((byte) (j >> 56));
        this.f8204k4.writeByte((byte) (j >> 48));
        this.f8204k4.writeByte((byte) (j >> 40));
        this.f8204k4.writeByte((byte) (j >> 32));
        this.f8204k4.writeByte((byte) (j >> 24));
        this.f8204k4.writeByte((byte) (j >> 16));
        this.f8204k4.writeByte((byte) (j >> 8));
        this.f8204k4.writeByte((byte) j);
        return 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11662x1(int i) {
        this.f8204k4.writeByte((byte) (i >> 24));
        this.f8204k4.writeByte((byte) (i >> 16));
        this.f8204k4.writeByte((byte) (i >> 8));
        this.f8204k4.writeByte((byte) i);
        return 4;
    }

    public C2362x4(AbstractC3150x6 abstractC3150x6, boolean z) {
        this.f8204k4 = abstractC3150x6;
        this.f8205x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11646k4(float f) {
        m11651k4(C7019kk.m27468x1(Float.valueOf(f), 13));
        m11651k4(C7019kk.m27468x1(Float.valueOf((f - C7019kk.m27468x1(Float.valueOf(f), 13)) * 65536.0f), 13));
        return 2;
    }

    /* JADX INFO: renamed from: kk */
    public final int m11660kk(long j) {
        long j2 = j & 4294967295L;
        this.f8204k4.writeByte((byte) ((j2 >> 24) & 4294967295L));
        this.f8204k4.writeByte((byte) ((j2 >> 16) & 4294967295L));
        this.f8204k4.writeByte((byte) (4294967295L & (j2 >> 8)));
        this.f8204k4.writeByte((byte) j);
        return 4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11663x1(long j) {
        long j2 = j & 4294967295L;
        this.f8204k4.writeByte((byte) ((j2 >> 24) & 4294967295L));
        this.f8204k4.writeByte((byte) ((j2 >> 16) & 4294967295L));
        this.f8204k4.writeByte((byte) (4294967295L & (j2 >> 8)));
        this.f8204k4.writeByte((byte) j);
        return 4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11647k4(int i) {
        this.f8204k4.writeByte((byte) ((65535 & i) >> 8));
        this.f8204k4.writeByte((byte) i);
        return 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11664x1(short s) {
        return m11651k4(s);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11648k4(C14084qq c14084qq) {
        m11661to(C7019kk.m27438h4(Double.valueOf(C14084qq.m67073c5(c14084qq, new C14084qq(1904, 1, 1)).m66811c5()), 14));
        return 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11665x1(byte b) {
        m11655k4(b);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11649k4(String str) {
        byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(str);
        this.f8204k4.write(bArrMo26677to, 0, bArrMo26677to.length);
        return bArrMo26677to.length;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11650k4(String str, String str2) {
        byte[] bArrMo26677to = C2266qq.m11310k4(str2).mo26677to(str);
        this.f8204k4.write(bArrMo26677to, 0, bArrMo26677to.length);
        return bArrMo26677to.length;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11651k4(short s) {
        this.f8204k4.writeByte((byte) (s >> 8));
        this.f8204k4.writeByte((byte) s);
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11652k4(int[] iArr) {
        int iM11647k4 = 0;
        for (int i : iArr) {
            iM11647k4 += m11647k4(i);
        }
        return iM11647k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11653k4(short[] sArr) {
        int iM11651k4 = 0;
        for (short s : sArr) {
            iM11651k4 += m11651k4(s);
        }
        return iM11651k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m11654k4() {
        return this.f8204k4.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11655k4(byte b) {
        this.f8204k4.writeByte(b);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11656k4(long j) {
        this.f8204k4.setPosition(j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11657k4(byte[] bArr) {
        this.f8204k4.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11658k4(byte[] bArr, int i) {
        this.f8204k4.write(bArr, 0, i);
    }
}
