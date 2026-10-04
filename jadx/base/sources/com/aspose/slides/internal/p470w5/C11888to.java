package com.aspose.slides.internal.p470w5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p245la.AbstractC6016k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.w5.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11888to extends AbstractC6016k4 {

    /* JADX INFO: renamed from: k4 */
    private int f40044k4;

    /* JADX INFO: renamed from: kk */
    private byte f40045kk;

    /* JADX INFO: renamed from: x1 */
    private byte f40046x1;

    public C11888to() {
    }

    /* JADX INFO: renamed from: k4 */
    public byte m55497k4() {
        return this.f40045kk;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55498x1() {
        return (C7019kk.m27462to(Byte.valueOf(this.f40046x1), 6) & 1) > 0;
    }

    public C11888to(byte b, int i, byte b2) {
        this.f40046x1 = b;
        this.f40044k4 = i;
        this.f40045kk = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static byte m55496k4(boolean z, boolean z2, int i) {
        byte bM27462to = z;
        if (z2) {
            bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf((byte) z), 6) | 2);
        }
        byte b = (byte) i;
        if (C7019kk.m27462to(Byte.valueOf(b), 6) <= 7) {
            return (byte) (C7019kk.m27462to(Byte.valueOf(bM27462to), 6) | C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(b), 6) << 2), 9)), 6));
        }
        throw new ArgumentOutOfRangeException("disposalMethod", "The disposal method value is not supported.");
    }

    public C11888to(int i, boolean z, byte b, boolean z2, int i2) {
        this.f40046x1 = m55496k4(z, z2, i2);
        this.f40044k4 = i;
        this.f40045kk = b;
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6018m9
    /* JADX INFO: renamed from: k4 */
    public void mo24316k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        abstractC3150x6.writeByte((byte) 33);
        abstractC3150x6.writeByte((byte) -7);
        abstractC3150x6.writeByte((byte) 4);
        abstractC3150x6.writeByte(this.f40046x1);
        byte[] bArrM66775k4 = C14069jd.m66775k4(this.f40044k4);
        abstractC3150x6.write(bArrM66775k4, 0, bArrM66775k4.length);
        abstractC3150x6.writeByte(this.f40045kk);
        abstractC3150x6.writeByte((byte) 0);
    }
}
