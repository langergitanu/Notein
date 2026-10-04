package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3149x1 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public static C3149x1 f9342k4 = new C3149x1();

    /* JADX INFO: renamed from: du */
    private boolean f9343du;

    /* JADX INFO: renamed from: kk */
    private AbstractC6747ar f9344kk;

    /* JADX INFO: renamed from: to */
    private byte[] f9345to;

    /* JADX INFO: renamed from: x1 */
    protected AbstractC3150x6 f9346x1;

    public C3149x1() {
        this(AbstractC3150x6.Null, AbstractC6747ar.m26635ix());
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m13449k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public long m13441k4(int i, int i2) {
        if (this.f9343du) {
            throw new ObjectDisposedException("BinaryWriter", "Cannot seek a closed BinaryWriter");
        }
        return this.f9346x1.seek(i, i2);
    }

    /* JADX INFO: renamed from: kk */
    public void m13452kk() {
        this.f9346x1.flush();
    }

    /* JADX INFO: renamed from: x1 */
    public void m13454x1() {
        m13449k4(true);
    }

    public C3149x1(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, AbstractC6747ar.m26635ix());
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 m13442k4() {
        m13452kk();
        return this.f9346x1;
    }

    /* JADX INFO: renamed from: kk */
    public void m13453kk(long j) {
        m13447k4(4294967295L & j);
        m13447k4(j >>> 32);
    }

    /* JADX INFO: renamed from: x1 */
    public void m13455x1(int i) {
        if (this.f9343du) {
            throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
        }
        byte[] bArr = this.f9345to;
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) (i >> 24);
        this.f9346x1.write(bArr, 0, 4);
    }

    public C3149x1(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("output");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        if (!abstractC3150x6.canWrite()) {
            throw new ArgumentException("Stream does not support writing or already closed.");
        }
        this.f9346x1 = abstractC3150x6;
        this.f9344kk = abstractC6747ar;
        this.f9345to = new byte[16];
    }

    /* JADX INFO: renamed from: k4 */
    public void m13443k4(byte b) {
        byte[] bArr = this.f9345to;
        bArr[0] = b;
        this.f9346x1.write(bArr, 0, 1);
    }

    /* JADX INFO: renamed from: x1 */
    public void m13456x1(long j) {
        m13447k4(4294967295L & j);
        m13447k4(j >> 32);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13444k4(char c) {
        if (this.f9343du) {
            throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
        }
        byte[] bArrM26684x1 = this.f9344kk.m26684x1(new char[]{c}, 0, 1);
        this.f9346x1.write(bArrM26684x1, 0, bArrM26684x1.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13445k4(float f) {
        m13455x1(Float.floatToIntBits(f));
    }

    /* JADX INFO: renamed from: k4 */
    public void m13446k4(int i) {
        m13448k4((short) i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13447k4(long j) {
        m13455x1((int) j);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13448k4(short s) {
        byte[] bArr = this.f9345to;
        bArr[0] = (byte) s;
        bArr[1] = (byte) (s >> 8);
        this.f9346x1.write(bArr, 0, 2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13449k4(boolean z) {
        AbstractC3150x6 abstractC3150x6;
        if (z && (abstractC3150x6 = this.f9346x1) != null) {
            abstractC3150x6.close();
        }
        this.f9345to = null;
        this.f9344kk = null;
        this.f9343du = true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m13450k4(byte[] bArr) {
        this.f9346x1.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13451k4(byte[] bArr, int i, int i2) {
        if (this.f9343du) {
            throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        this.f9346x1.write(bArr, i, i2);
    }
}
