package com.aspose.slides.internal.p536z0;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.z0.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C13349x1 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f44706k4;

    /* JADX INFO: renamed from: kk */
    private int f44707kk;

    /* JADX INFO: renamed from: to */
    private long f44708to;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f44709x1;

    public C13349x1(AbstractC3150x6 abstractC3150x6, int i) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("sourceStream");
        }
        this.f44706k4 = abstractC3150x6;
        this.f44709x1 = m62018k4(abstractC3150x6, i);
        this.f44708to = 0L;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m62019k4() {
        return this.f44709x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f44708to >= m62019k4().length) {
            return this.f44706k4.read(bArr, i, i2);
        }
        long j = i2;
        if (((long) m62019k4().length) - this.f44708to >= j) {
            C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) m62019k4()), (int) this.f44708to, AbstractC14092to.m67208k4((Object) bArr), 0, i2);
            this.f44708to += j;
            return i2;
        }
        long length = ((long) m62019k4().length) - this.f44708to;
        int i3 = (int) length;
        byte[] bArr2 = new byte[i3];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) m62019k4()), (int) this.f44708to, AbstractC14092to.m67208k4((Object) bArr2), 0, i3);
        int i4 = (int) (j - length);
        byte[] bArr3 = new byte[i4];
        int i5 = this.f44706k4.read(bArr3, 0, i4);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr2), 0, AbstractC14092to.m67208k4((Object) bArr), i, i3);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr3), 0, AbstractC14092to.m67208k4((Object) bArr), i + i3, i5);
        this.f44708to = m62019k4().length;
        return (int) (length + ((long) i5));
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m62018k4(AbstractC3150x6 abstractC3150x6, int i) {
        byte[] bArr = new byte[i];
        int i2 = abstractC3150x6.read(bArr, 0, i);
        this.f44707kk = i2;
        byte[] bArr2 = new byte[i2];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, this.f44707kk);
        return bArr2;
    }
}
