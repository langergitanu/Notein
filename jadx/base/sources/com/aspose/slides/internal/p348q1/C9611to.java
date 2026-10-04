package com.aspose.slides.internal.p348q1;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.q1.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9611to extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private IGenericEnumerator<AbstractC3150x6> f34766k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3150x6 f34767x1;

    public C9611to(IGenericEnumerable<AbstractC3150x6> iGenericEnumerable) {
        this.f34766k4 = iGenericEnumerable.iterator();
        m46939x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m46938k4() {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 != null) {
            abstractC3150x6.dispose();
        }
        m46939x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m46939x1() {
        if (!this.f34766k4.hasNext()) {
            this.f34767x1 = null;
            return;
        }
        AbstractC3150x6 next = this.f34766k4.next();
        this.f34767x1 = next;
        if (next == null) {
            throw new NullReferenceException("The next stream in the collection has null pointer");
        }
        next.seek(0L, 0);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 == null) {
            return false;
        }
        return abstractC3150x6.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 == null) {
            return false;
        }
        return abstractC3150x6.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        while (true) {
            AbstractC3150x6 abstractC3150x6 = this.f34767x1;
            if (abstractC3150x6 == null) {
                return;
            }
            abstractC3150x6.close();
            m46939x1();
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 == null) {
            return 0L;
        }
        return abstractC3150x6.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 == null) {
            return 0L;
        }
        return abstractC3150x6.getPosition();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f34767x1 == null) {
            return -1;
        }
        if (bArr == null) {
            throw new NullReferenceException();
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfRangeException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.f34767x1.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            m46938k4();
        } while (this.f34767x1 != null);
        return -1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        while (true) {
            AbstractC3150x6 abstractC3150x6 = this.f34767x1;
            if (abstractC3150x6 == null) {
                return -1;
            }
            int i = abstractC3150x6.readByte();
            if (i != -1) {
                return i;
            }
            m46938k4();
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 == null) {
            return 0L;
        }
        return abstractC3150x6.seek(j, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        AbstractC3150x6 abstractC3150x6 = this.f34767x1;
        if (abstractC3150x6 != null) {
            abstractC3150x6.setPosition(j);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        throw new NotImplementedException();
    }
}
