package com.aspose.slides.internal.p289n2;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p205ji.C5463qq;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.n2.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6690h4 extends AbstractC3150x6 implements IDisposable {

    /* JADX INFO: renamed from: du */
    private boolean f18485du;

    /* JADX INFO: renamed from: h4 */
    private boolean f18486h4;

    /* JADX INFO: renamed from: k4 */
    private int f18487k4;

    /* JADX INFO: renamed from: kk */
    private boolean f18488kk;

    /* JADX INFO: renamed from: to */
    private boolean f18489to;

    /* JADX INFO: renamed from: x1 */
    private C6695m9 f18490x1;

    public C6690h4(C6695m9 c6695m9, int i, boolean z) {
        this.f18486h4 = false;
        if (c6695m9 == null) {
            throw new ArgumentNullException("socket is null");
        }
        if (c6695m9.m26485kk() != 1) {
            throw new ArgumentException("Socket is not of type Stream", "socket");
        }
        if (!c6695m9.m26494x1()) {
            throw new IOException("Not connected");
        }
        if (!c6695m9.m26483k4()) {
            throw new IOException("Operation not allowed on a non-blocking socket.");
        }
        this.f18490x1 = c6695m9;
        this.f18488kk = z;
        this.f18487k4 = i;
        this.f18489to = canRead();
        this.f18485du = canWrite();
    }

    /* JADX INFO: renamed from: k4 */
    private void m26446k4() {
        if (this.f18486h4) {
            throw new ObjectDisposedException(C14067j2.m66727k4(this).mo48629x6());
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginRead(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        m26446k4();
        if (bArr == null) {
            throw new ArgumentNullException("buffer is null");
        }
        int iM67265du = AbstractC14092to.m67208k4((Object) bArr).m67265du();
        if (i < 0 || i > iM67265du) {
            throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
        }
        if (i2 < 0 || i + i2 > iM67265du) {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
        }
        C6695m9 c6695m9 = this.f18490x1;
        if (c6695m9 == null) {
            throw new IOException("Connection closed");
        }
        try {
            return c6695m9.m26478k4(bArr, i, i2, 0, abstractC14078m9, obj);
        } catch (RuntimeException e) {
            throw new IOException("BeginReceive failure", e);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginWrite(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        m26446k4();
        if (bArr == null) {
            throw new ArgumentNullException("buffer is null");
        }
        int iM67265du = AbstractC14092to.m67208k4((Object) bArr).m67265du();
        if (i < 0 || i > iM67265du) {
            throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
        }
        if (i2 < 0 || i + i2 > iM67265du) {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
        }
        C6695m9 c6695m9 = this.f18490x1;
        if (c6695m9 == null) {
            throw new IOException("Connection closed");
        }
        try {
            return c6695m9.m26490x1(bArr, i, i2, 0, abstractC14078m9, obj);
        } catch (RuntimeException e) {
            throw new IOException("BeginWrite failure", e);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        int i = this.f18487k4;
        return i == 3 || i == 1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canTimeout() {
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        int i = this.f18487k4;
        return i == 3 || i == 2;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        C6695m9 c6695m9;
        if (this.f18486h4) {
            return;
        }
        this.f18486h4 = true;
        if (this.f18488kk && (c6695m9 = this.f18490x1) != null) {
            c6695m9.m26487m9();
        }
        this.f18490x1 = null;
        this.f18487k4 = 0;
        if (z) {
            C14094ts.m67303k4(this);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int endRead(InterfaceC14083qm interfaceC14083qm) {
        m26446k4();
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("async result is null");
        }
        C6695m9 c6695m9 = this.f18490x1;
        if (c6695m9 == null) {
            throw new IOException("Connection closed");
        }
        try {
            return c6695m9.m26476k4(interfaceC14083qm);
        } catch (RuntimeException e) {
            throw new IOException("EndRead failure", e);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void endWrite(InterfaceC14083qm interfaceC14083qm) {
        m26446k4();
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("async result is null");
        }
        C6695m9 c6695m9 = this.f18490x1;
        if (c6695m9 == null) {
            throw new IOException("Connection closed");
        }
        try {
            c6695m9.m26488x1(interfaceC14083qm);
        } catch (RuntimeException e) {
            throw new IOException("EndWrite failure", e);
        }
    }

    public void finalize() {
        dispose(false);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int getReadTimeout() {
        int iM26474dy = this.f18490x1.m26474dy();
        return iM26474dy <= 0 ? C5463qq.f15028k4 : iM26474dy;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int getWriteTimeout() {
        int iM26473c5 = this.f18490x1.m26473c5();
        return iM26473c5 <= 0 ? C5463qq.f15028k4 : iM26473c5;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        m26446k4();
        if (bArr == null) {
            throw new ArgumentNullException("buffer is null");
        }
        if (i < 0 || i > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
        }
        if (i2 < 0 || i + i2 > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
        }
        C6695m9 c6695m9 = this.f18490x1;
        if (c6695m9 == null) {
            throw new IOException("Connection closed");
        }
        try {
            return c6695m9.m26477k4(bArr, i, i2, 0);
        } catch (RuntimeException e) {
            throw new IOException("Read failure", e);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setReadTimeout(int i) {
        if (i <= 0 && i != C5463qq.f15028k4) {
            throw new ArgumentOutOfRangeException("value", "The value specified is less than or equal to zero and is not Infinite.");
        }
        this.f18490x1.m26479k4(i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setWriteTimeout(int i) {
        if (i <= 0 && i != C5463qq.f15028k4) {
            throw new ArgumentOutOfRangeException("value", "The value specified is less than or equal to zero and is not Infinite");
        }
        this.f18490x1.m26491x1(i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        m26446k4();
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0 || i > AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
            throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
        }
        if (i2 < 0 || i2 > AbstractC14092to.m67208k4((Object) bArr).m67265du() - i) {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
        }
        C6695m9 c6695m9 = this.f18490x1;
        if (c6695m9 == null) {
            throw new IOException("Connection closed");
        }
        int iM26489x1 = 0;
        while (true) {
            int i3 = i2 - iM26489x1;
            if (i3 <= 0) {
                return;
            }
            try {
                iM26489x1 += c6695m9.m26489x1(bArr, i + iM26489x1, i3, 0);
            } catch (RuntimeException e) {
                throw new IOException("Write failure", e);
            }
        }
    }

    public C6690h4(C6695m9 c6695m9, boolean z) {
        this(c6695m9, 3, z);
    }
}
