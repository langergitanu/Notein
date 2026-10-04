package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C3152yj extends AbstractC3150x6 {

    /* JADX INFO: renamed from: a */
    private boolean f9354a;

    /* JADX INFO: renamed from: b */
    private boolean f9355b;

    /* JADX INFO: renamed from: c */
    private int f9356c;

    /* JADX INFO: renamed from: d */
    private int f9357d;

    /* JADX INFO: renamed from: e */
    private byte[] f9358e;

    /* JADX INFO: renamed from: f */
    private int f9359f;

    /* JADX INFO: renamed from: g */
    private boolean f9360g;

    /* JADX INFO: renamed from: h */
    private boolean f9361h;

    /* JADX INFO: renamed from: i */
    private int f9362i;

    /* JADX INFO: renamed from: j */
    private int f9363j;

    public C3152yj() {
        this(0);
    }

    /* JADX INFO: renamed from: a */
    private int m13463a(int i) {
        if (i < 256) {
            i = 256;
        }
        int i2 = this.f9356c;
        return i < i2 * 2 ? i2 * 2 : i;
    }

    /* JADX INFO: renamed from: b */
    private void m13466b(int i) {
        if (i > this.f9356c) {
            setCapacity(m13463a(i));
            return;
        }
        int i2 = this.f9363j;
        if (i2 > 0) {
            AbstractC14092to.m67225k4(this.f9358e, this.f9357d, i2);
            this.f9363j = 0;
        }
    }

    public static C3152yj fromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return new C3152yj(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return !this.f9361h;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return !this.f9361h;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return !this.f9361h && this.f9354a;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        this.f9361h = true;
        this.f9360g = false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    public byte[] getBuffer() {
        if (this.f9355b) {
            return this.f9358e;
        }
        throw new com.aspose.slides.exceptions.IOException();
    }

    public int getCapacity() {
        m13464a();
        return this.f9356c - this.f9359f;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        m13464a();
        return this.f9357d - this.f9359f;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        m13464a();
        return this.f9362i - this.f9359f;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException("offset or count less than zero.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("offset+count", "The size of the buffer is less than offset + count.");
        }
        m13464a();
        int i3 = this.f9362i;
        int i4 = this.f9357d;
        if (i3 >= i4 || i2 == 0) {
            return 0;
        }
        if (i3 > i4 - i2) {
            i2 = i4 - i3;
        }
        System.arraycopy(this.f9358e, i3, bArr, i, i2);
        this.f9362i += i2;
        return i2;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        m13464a();
        int i = this.f9362i;
        if (i >= this.f9357d) {
            return -1;
        }
        byte[] bArr = this.f9358e;
        this.f9362i = i + 1;
        return bArr[i] & 255;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        int i2;
        m13464a();
        if (j > 2147483647L) {
            throw new ArgumentOutOfRangeException(C14113y2.m67407k4("Offset out of range. ", Long.valueOf(j)));
        }
        if (i != 0) {
            if (i == 1) {
                i2 = this.f9362i;
            } else {
                if (i != 2) {
                    throw new ArgumentException("loc", "Invalid SeekOrigin");
                }
                i2 = this.f9357d;
            }
        } else {
            if (j < 0) {
                throw new com.aspose.slides.exceptions.IOException("Attempted to seek before start of MemoryStream.");
            }
            i2 = this.f9359f;
        }
        int i3 = i2 + ((int) j);
        if (i3 < this.f9359f) {
            throw new com.aspose.slides.exceptions.IOException("Attempted to seek before start of MemoryStream.");
        }
        this.f9362i = i3;
        return i3;
    }

    public void setCapacity(int i) {
        int i2;
        byte[] bArr;
        m13464a();
        if (!this.f9360g) {
            throw new NotSupportedException("Cannot expand this MemoryStream");
        }
        if (i < 0 || i < (i2 = this.f9357d)) {
            throw new ArgumentOutOfRangeException("value", C14113y2.m67407k4("New capacity cannot be negative or less than the current capacity ", Integer.valueOf(i), " ", Integer.valueOf(this.f9356c)));
        }
        byte[] bArr2 = this.f9358e;
        if (bArr2 == null || i != bArr2.length) {
            if (i != 0) {
                bArr = new byte[i];
                if (bArr2 != null) {
                    System.arraycopy(bArr2, 0, bArr, 0, i2);
                }
            } else {
                bArr = null;
            }
            this.f9363j = 0;
            this.f9358e = bArr;
            this.f9356c = i;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        if (!this.f9360g && j > this.f9356c) {
            throw new NotSupportedException("Expanding this MemoryStream is not supported");
        }
        m13464a();
        if (!this.f9354a) {
            throw new NotSupportedException("Cannot write to this MemoryStream");
        }
        if (j >= 0) {
            int i = this.f9359f;
            if (((long) i) + j <= 2147483647L) {
                int i2 = ((int) j) + i;
                int i3 = this.f9357d;
                if (i2 > i3) {
                    m13466b(i2);
                } else if (i2 < i3) {
                    this.f9363j = (i3 - i2) + this.f9363j;
                }
                this.f9357d = i2;
                if (this.f9362i > i2) {
                    this.f9362i = i2;
                    return;
                }
                return;
            }
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        m13464a();
        if (j < 0) {
            throw new ArgumentOutOfRangeException("value", "Position cannot be negative");
        }
        if (j > 2147483647L) {
            throw new ArgumentOutOfRangeException("value", "Position must be non-negative and less than 2^31 - 1 - origin");
        }
        this.f9362i = this.f9359f + ((int) j);
    }

    public byte[] toArray() {
        int i = this.f9357d;
        int i2 = this.f9359f;
        int i3 = i - i2;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = this.f9358e;
        if (bArr2 != null) {
            System.arraycopy(bArr2, i2, bArr, 0, i3);
        }
        return bArr;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (!this.f9354a) {
            throw new NotSupportedException("Cannot write to this stream.");
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("offset+count", "The size of the buffer is less than offset + count.");
        }
        m13464a();
        int i3 = this.f9362i;
        if (i3 > this.f9357d - i2) {
            m13466b(i3 + i2);
        }
        System.arraycopy(bArr, i, this.f9358e, this.f9362i, i2);
        int i4 = this.f9362i + i2;
        this.f9362i = i4;
        if (i4 >= this.f9357d) {
            this.f9357d = i4;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        m13464a();
        if (!this.f9354a) {
            throw new NotSupportedException("Cannot write to this stream.");
        }
        int i = this.f9362i;
        if (i >= this.f9357d) {
            m13466b(i + 1);
            this.f9357d = this.f9362i + 1;
        }
        byte[] bArr = this.f9358e;
        int i2 = this.f9362i;
        this.f9362i = i2 + 1;
        bArr[i2] = b;
    }

    public void writeTo(AbstractC3150x6 abstractC3150x6) {
        m13464a();
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        byte[] bArr = this.f9358e;
        int i = this.f9359f;
        abstractC3150x6.write(bArr, i, this.f9357d - i);
    }

    public C3152yj(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity");
        }
        this.f9354a = true;
        this.f9356c = i;
        this.f9358e = new byte[i];
        this.f9360g = true;
        this.f9355b = true;
    }

    /* JADX INFO: renamed from: a */
    private void m13464a() {
        if (this.f9361h) {
            throw new ObjectDisposedException("MemoryStream");
        }
    }

    public C3152yj(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        m13465a(bArr, 0, bArr.length, true, false);
    }

    /* JADX INFO: renamed from: a */
    private void m13465a(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException("index or count is less than 0.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("index+count", "The size of the buffer is less than index + count.");
        }
        this.f9354a = z;
        this.f9358e = bArr;
        int i3 = i2 + i;
        this.f9356c = i3;
        this.f9357d = i3;
        this.f9362i = i;
        this.f9359f = i;
        this.f9355b = z2;
        this.f9360g = false;
    }

    public C3152yj(byte[] bArr, int i, int i2) {
        m13465a(bArr, i, i2, true, false);
    }

    public C3152yj(byte[] bArr, int i, int i2, boolean z) {
        m13465a(bArr, i, i2, z, false);
    }

    public C3152yj(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        m13465a(bArr, i, i2, z, z2);
    }

    public C3152yj(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        m13465a(bArr, 0, bArr.length, z, false);
    }
}
