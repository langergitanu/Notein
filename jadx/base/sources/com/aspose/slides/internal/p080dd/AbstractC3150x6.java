package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p205ji.C5457k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p395sa.C10167k4;
import com.aspose.slides.internal.p468vz.C11878k4;
import com.aspose.slides.internal.p468vz.C11879kk;
import com.aspose.slides.internal.p468vz.C11881x1;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.x6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3150x6 implements IDisposable {
    public static AbstractC3150x6 Null = new C3136ks();

    /* JADX INFO: renamed from: a */
    private AtomicInteger f9347a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private C5457k4 f9348b;

    /* JADX INFO: renamed from: c */
    private k4 f9349c;

    /* JADX INFO: renamed from: d */
    private x1 f9350d;

    /* JADX INFO: renamed from: com.aspose.slides.internal.dd.x6$k4 */
    public abstract class k4 extends AbstractC14085qw {
        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public final int m13459k4(InterfaceC14083qm interfaceC14083qm) {
            C10167k4.m50008k4(this, interfaceC14083qm);
            return ((Integer) C7019kk.m27464to(peekResult(), Integer.TYPE)).intValue();
        }

        /* JADX INFO: renamed from: k4 */
        public abstract int mo13394k4(byte[] bArr, int i, int i2);

        public /* synthetic */ k4(AbstractC3150x6 abstractC3150x6, C3139ne c3139ne) {
            this();
        }

        /* JADX INFO: renamed from: k4 */
        public final InterfaceC14083qm m13460k4(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
            return C10167k4.m50006k4(new C3143u4(this, this, abstractC14078m9, obj, bArr, i, i2));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.dd.x6$x1 */
    public abstract class x1 extends AbstractC14085qw {
        private x1() {
        }

        /* JADX INFO: renamed from: k4 */
        public final InterfaceC14083qm m13461k4(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
            return C10167k4.m50006k4(new C3146uz(this, this, abstractC14078m9, obj, bArr, i, i2));
        }

        /* JADX INFO: renamed from: k4 */
        public abstract void mo13367k4(byte[] bArr, int i, int i2);

        public /* synthetic */ x1(AbstractC3150x6 abstractC3150x6, C3139ne c3139ne) {
            this();
        }

        /* JADX INFO: renamed from: k4 */
        public final void m13462k4(InterfaceC14083qm interfaceC14083qm) {
            C10167k4.m50008k4(this, interfaceC14083qm);
        }
    }

    public static AbstractC3150x6 _synchronized(AbstractC3150x6 abstractC3150x6) {
        return new C3147v4(abstractC3150x6);
    }

    /* JADX INFO: renamed from: a */
    private void m13457a(int i) {
        C5457k4 c5457k4 = this.f9348b;
        if (c5457k4 == null || i != 0) {
            return;
        }
        c5457k4.m22562to();
        this.f9348b = null;
    }

    public static AbstractC3150x6 fromJava(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return inputStream instanceof C11881x1 ? ((C11881x1) inputStream).m55478k4() : new C11878k4(inputStream);
    }

    public static InputStream toJava(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            return null;
        }
        return abstractC3150x6 instanceof C11878k4 ? ((C11878k4) abstractC3150x6).m55462k4() : abstractC3150x6.toInputStream();
    }

    public InterfaceC14083qm beginRead(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        if (!canRead()) {
            throw new NotSupportedException("Stream does not support reading.");
        }
        this.f9347a.incrementAndGet();
        C3139ne c3139ne = new C3139ne(this);
        if (this.f9348b == null) {
            synchronized (this) {
                try {
                    if (this.f9348b == null) {
                        this.f9348b = new C5457k4(true);
                    }
                } finally {
                }
            }
        }
        this.f9348b.m22558du();
        this.f9349c = c3139ne;
        return c3139ne.m13460k4(bArr, i, i2, abstractC14078m9, obj);
    }

    public InterfaceC14083qm beginWrite(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        if (!canWrite()) {
            throw new NotSupportedException("Stream does not support writing.");
        }
        this.f9347a.incrementAndGet();
        C3132ix c3132ix = new C3132ix(this);
        if (this.f9348b == null) {
            synchronized (this) {
                try {
                    if (this.f9348b == null) {
                        this.f9348b = new C5457k4(true);
                    }
                } finally {
                }
            }
        }
        this.f9348b.m22558du();
        this.f9350d = c3132ix;
        return c3132ix.m13461k4(bArr, i, i2, abstractC14078m9, obj);
    }

    public abstract boolean canRead();

    public abstract boolean canSeek();

    public boolean canTimeout() {
        return false;
    }

    public abstract boolean canWrite();

    public void close() {
        dispose(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        close();
    }

    public int endRead(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("asyncResult");
        }
        k4 k4Var = this.f9349c;
        if (k4Var == null) {
            throw new ArgumentException("Either the IAsyncResult object did not come from the corresponding async method on this type, or EndRead was called multiple times with the same IAsyncResult.");
        }
        try {
            return k4Var.m13459k4(interfaceC14083qm);
        } finally {
            this.f9349c = null;
            this.f9348b.mo22555x1();
            m13457a(this.f9347a.decrementAndGet());
        }
    }

    public void endWrite(InterfaceC14083qm interfaceC14083qm) {
        if (interfaceC14083qm == null) {
            throw new ArgumentNullException("asyncResult");
        }
        x1 x1Var = this.f9350d;
        if (x1Var == null) {
            throw new ArgumentException("Either the IAsyncResult object did not come from the corresponding async method on this type, or EndWrite was called multiple times with the same IAsyncResult.");
        }
        try {
            x1Var.m13462k4(interfaceC14083qm);
        } finally {
            this.f9350d = null;
            this.f9348b.mo22555x1();
            m13457a(this.f9347a.decrementAndGet());
        }
    }

    public abstract void flush();

    public abstract long getLength();

    public abstract long getPosition();

    public int getReadTimeout() {
        throw new InvalidOperationException("Timeouts are not supported on this stream.");
    }

    public int getWriteTimeout() {
        throw new InvalidOperationException("Timeouts are not supported on this stream.");
    }

    public abstract int read(byte[] bArr, int i, int i2);

    public int readByte() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    public abstract long seek(long j, int i);

    public abstract void setLength(long j);

    public abstract void setPosition(long j);

    public void setReadTimeout(int i) {
        throw new InvalidOperationException("Timeouts are not supported on this stream.");
    }

    public void setWriteTimeout(int i) {
        throw new InvalidOperationException("Timeouts are not supported on this stream.");
    }

    public InputStream toInputStream() {
        return new C11881x1(this);
    }

    public OutputStream toOutputStream() {
        return new C11879kk(this);
    }

    public abstract void write(byte[] bArr, int i, int i2);

    public void writeByte(byte b) {
        write(new byte[]{b}, 0, 1);
    }

    public void dispose(boolean z) {
        if (!z || this.f9348b == null) {
            return;
        }
        m13457a(this.f9347a.decrementAndGet());
    }
}
