package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kp */
/* JADX INFO: loaded from: classes3.dex */
class C2165kp implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f7500k4;

    /* JADX INFO: renamed from: kk */
    private long f7501kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2011be f7502x1;

    public C2165kp(AbstractC2011be abstractC2011be, long j) {
        this.f7500k4 = abstractC2011be.mo10245x1();
        this.f7502x1 = abstractC2011be;
        this.f7501kk = j;
        m10961k4(0L);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f7502x1.m10244to()) {
            this.f7500k4.close();
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m10957du() {
        byte[] bArr = new byte[2];
        int i = this.f7500k4.read(bArr, 0, 2);
        if (i == 0 || i < 2) {
            throw new EndOfStreamException();
        }
        return C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) + (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) << 8)), 9);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m10958h4() {
        int i = this.f7500k4.readByte();
        if (i != -1) {
            return (byte) i;
        }
        throw new EndOfStreamException();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10959k4(int i) {
        int iM27462to = 0;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return iM27462to;
            }
            iM27462to = C7019kk.m27462to(Byte.valueOf(m10962kk()), 6) | (iM27462to << 8);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final byte m10962kk() {
        int i = this.f7500k4.readByte();
        if (i != -1) {
            return (byte) i;
        }
        throw new EndOfStreamException();
    }

    /* JADX INFO: renamed from: to */
    public final int m10963to() {
        byte[] bArr = new byte[2];
        int i = this.f7500k4.read(bArr, 0, 2);
        if (i == 0 || i < 2) {
            throw new EndOfStreamException();
        }
        return C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) + (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) << 8)), 9);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m10964x1() {
        return this.f7500k4.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m10960k4() {
        return this.f7500k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m10965x1(int i) {
        byte[] bArr = new byte[i];
        int i2 = m10960k4().read(bArr, 0, i);
        if (i2 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10961k4(long j) {
        this.f7500k4.seek(j + this.f7501kk, 0);
    }
}
