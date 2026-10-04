package com.aspose.slides.internal.p080dd;

import OooOoo.C20593OooO0Oo;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p468vz.C11880to;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import com.huawei.hms.network.embedded.C18293o1;
import java.io.File;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C3130fa extends AbstractC3150x6 {

    /* JADX INFO: renamed from: du */
    private C11880to f9274du;

    /* JADX INFO: renamed from: h4 */
    private final String f9275h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f9276k4;

    /* JADX INFO: renamed from: kk */
    private boolean f9277kk;

    /* JADX INFO: renamed from: to */
    private boolean f9278to;

    /* JADX INFO: renamed from: x1 */
    private boolean f9279x1;

    private C3130fa(int i, String str, int i2, int i3) {
        String str2;
        this.f9276k4 = false;
        if (i != -2 && i <= 0) {
            throw new ArgumentOutOfRangeException("bufferSize", "Positive number required.");
        }
        boolean z = i > 0;
        this.f9275h4 = str;
        if (str == null) {
            throw new ArgumentNullException("path", "Path cannot be null.");
        }
        if (C14113y2.m67440x1(str).length() == 0) {
            throw new ArgumentException("Empty path name is not legal.");
        }
        if (i2 < 1 || i2 > 6) {
            throw new ArgumentOutOfRangeException("mode", "Enum value was out of legal range.");
        }
        if (i3 < 1 || i3 > 3) {
            throw new ArgumentOutOfRangeException("access", "Enum value was out of legal range.");
        }
        if (i3 == 1) {
            this.f9277kk = false;
            this.f9279x1 = true;
            str2 = "r";
        } else {
            this.f9277kk = true;
            if (i3 == 2) {
                this.f9279x1 = false;
            } else {
                this.f9279x1 = true;
            }
            str2 = "rw";
        }
        File file = new File(str);
        if (i2 == 6) {
            if (i3 == 3) {
                throw new ArgumentException("Append access can be requested only in write-only mode.");
            }
            if (i3 == 1) {
                throw new ArgumentException(C14113y2.m67402k4("Combining FileMode: {0} with FileAccess: {1} is invalid.", AbstractC14106wy.getName((Class<?>) C3133jd.class, i2), AbstractC14106wy.getName((Class<?>) C3138m9.class, i3)));
            }
        }
        if ((i2 == 2 || i2 == 1 || i2 == 5) && i3 == 1) {
            throw new ArgumentException(C14113y2.m67402k4("Combining FileMode: {0} with FileAccess: {1} is invalid.", AbstractC14106wy.getName((Class<?>) C3133jd.class, i2), AbstractC14106wy.getName((Class<?>) C3138m9.class, i3)));
        }
        if (file.exists()) {
            if (i2 == 1) {
                throw new IOException(C20593OooO0Oo.OooO0O0("Can't create new file. File '", str, "' already exist."));
            }
            if (i2 == 2 || i2 == 5) {
                file.delete();
            }
            if (z) {
                this.f9274du = new C11880to(file, str2, i);
            } else {
                this.f9274du = new C11880to(file, str2);
            }
            if (i2 == 6) {
                C11880to c11880to = this.f9274du;
                c11880to.m55469k4(c11880to.m55474to());
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                throw new FileNotFoundException(C20593OooO0Oo.OooO0O0("Can't find file: ", str, "."), str);
            }
            if (z) {
                this.f9274du = new C11880to(file, str2, i);
            } else if (str2.equals("r") && i2 == 4) {
                C11880to c11880to2 = new C11880to(file, "rw");
                this.f9274du = c11880to2;
                c11880to2.m55470k4(true);
            } else {
                this.f9274du = new C11880to(file, str2);
            }
        }
        this.f9278to = true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginRead(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("numBytes", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        return super.beginRead(bArr, i, i2, abstractC14078m9, obj);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginWrite(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        if (bArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("numBytes", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        return super.beginWrite(bArr, i, i2, abstractC14078m9, obj);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f9279x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f9278to;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f9277kk;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        try {
            C11880to c11880to = this.f9274du;
            if (c11880to != null && !c11880to.m55477x1()) {
                this.f9274du.m55468k4();
            }
        } finally {
            this.f9279x1 = false;
            this.f9277kk = false;
            this.f9278to = false;
            super.dispose(z);
            this.f9276k4 = true;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int endRead(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm != null) {
            return super.endRead(interfaceC14083qm);
        }
        throw new ArgumentNullException("asyncResult");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void endWrite(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("asyncResult");
        }
        super.endWrite(interfaceC14083qm);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        this.f9274du.m55464du();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (canSeek()) {
            return this.f9274du.m55474to();
        }
        throw new NotSupportedException("Stream does not support seeking.");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (canSeek()) {
            return this.f9274du.m55471kk();
        }
        throw new NotSupportedException("Stream does not support seeking.");
    }

    /* JADX INFO: renamed from: k4 */
    public String m13345k4() {
        return this.f9275h4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("array", "Buffer cannot be null.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (!this.f9279x1) {
            throw new NotSupportedException("Stream does not support reading.");
        }
        int iM55475x1 = this.f9274du.m55475x1(bArr, i, i2);
        if (iM55475x1 == -1) {
            return 0;
        }
        return iM55475x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (this.f9279x1) {
            return this.f9274du.m55465h4();
        }
        throw new NotSupportedException("Stream does not support reading.");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        C11880to c11880to;
        long jM55471kk;
        if (i < 0 || i > 2) {
            throw new ArgumentException("Invalid seek origin.");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (!canSeek()) {
            throw new NotSupportedException("Stream does not support seeking.");
        }
        if (i != 0) {
            if (i == 1) {
                c11880to = this.f9274du;
                jM55471kk = c11880to.m55471kk();
            } else if (i == 2) {
                c11880to = this.f9274du;
                jM55471kk = c11880to.m55474to();
            }
            c11880to.m55469k4(jM55471kk + j);
        } else {
            this.f9274du.m55469k4(j);
        }
        return this.f9274du.m55471kk();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        if (j < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            throw new ArgumentOutOfRangeException("length", "file length too big");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (!canSeek()) {
            throw new NotSupportedException("Stream does not support seeking.");
        }
        if (!this.f9277kk) {
            throw new NotSupportedException("Stream does not support writing.");
        }
        this.f9274du.m55472kk(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        if (j < 0) {
            throw new ArgumentOutOfRangeException("value", "Non-negative number required.");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (!canSeek()) {
            throw new NotSupportedException("Stream does not support seeking.");
        }
        this.f9274du.m55469k4(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("array", "Buffer cannot be null.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (!this.f9277kk) {
            throw new NotSupportedException("Stream does not support writing.");
        }
        this.f9274du.write(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        if (this.f9276k4) {
            throw new ObjectDisposedException("Cannot access a closed file.");
        }
        if (!this.f9277kk) {
            throw new NotSupportedException("Stream does not support writing.");
        }
        this.f9274du.write(b);
    }

    public C3130fa(String str, int i) {
        this(str, i, i == 6 ? 2 : 3);
    }

    public C3130fa(String str, int i, int i2) {
        this(-2, str, i, i2);
    }

    public C3130fa(String str, int i, int i2, int i3) {
        this(str, i, i2);
    }

    public C3130fa(String str, int i, int i2, int i3, int i4) {
        this(i4, str, i, i2);
    }
}
