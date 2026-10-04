package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.dc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18150dc implements InterfaceC18275mb {

    /* JADX INFO: renamed from: a */
    public final C18261lb f54591a = new C18261lb();

    /* JADX INFO: renamed from: b */
    public final InterfaceC18220ic f54592b;

    /* JADX INFO: renamed from: c */
    public boolean f54593c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.dc$a */
    public class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            C18150dc.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            C18150dc c18150dc = C18150dc.this;
            if (c18150dc.f54593c) {
                return;
            }
            c18150dc.flush();
        }

        public String toString() {
            return C18150dc.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            C18150dc c18150dc = C18150dc.this;
            if (c18150dc.f54593c) {
                throw new IOException("closed");
            }
            c18150dc.f54591a.writeByte((int) ((byte) i));
            C18150dc.this.mo78273n();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            C18150dc c18150dc = C18150dc.this;
            if (c18150dc.f54593c) {
                throw new IOException("closed");
            }
            c18150dc.f54591a.write(bArr, i, i2);
            C18150dc.this.mo78273n();
        }
    }

    public C18150dc(InterfaceC18220ic interfaceC18220ic) {
        if (interfaceC18220ic == null) {
            throw new NullPointerException("sink == null");
        }
        this.f54592b = interfaceC18220ic;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public long mo78257a(InterfaceC18234jc interfaceC18234jc) throws IOException {
        if (interfaceC18234jc == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long jMo77914c = interfaceC18234jc.mo77914c(this.f54591a, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jMo77914c == -1) {
                return j;
            }
            j += jMo77914c;
            mo78273n();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: b */
    public InterfaceC18275mb mo78265b(int i) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78265b(i);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: c */
    public InterfaceC18275mb mo78268c(int i) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78268c(i);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f54593c) {
            return;
        }
        try {
            C18261lb c18261lb = this.f54591a;
            long j = c18261lb.f55631b;
            if (j > 0) {
                this.f54592b.mo78029b(c18261lb, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f54592b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f54593c = true;
        if (th != null) {
            C18276mc.m79203a(th);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: d */
    public InterfaceC18275mb mo78269d(long j) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78269d(j);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    public void flush() throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        C18261lb c18261lb = this.f54591a;
        long j = c18261lb.f55631b;
        if (j > 0) {
            this.f54592b.mo78029b(c18261lb, j);
        }
        this.f54592b.flush();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: g */
    public OutputStream mo78270g() {
        return new a();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: h */
    public InterfaceC18275mb mo78271h() throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        long jM79076B = this.f54591a.m79076B();
        if (jM79076B > 0) {
            this.f54592b.mo78029b(this.f54591a, jM79076B);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f54593c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: n */
    public InterfaceC18275mb mo78273n() throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        long jM79096t = this.f54591a.m79096t();
        if (jM79096t > 0) {
            this.f54592b.mo78029b(this.f54591a, jM79096t);
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    public C18248kc timeout() {
        return this.f54592b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f54592b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f54591a.write(byteBuffer);
        mo78273n();
        return iWrite;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public InterfaceC18275mb writeByte(int i) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.writeByte(i);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public InterfaceC18275mb writeInt(int i) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.writeInt(i);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public InterfaceC18275mb writeLong(long j) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.writeLong(j);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public InterfaceC18275mb writeShort(int i) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.writeShort(i);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78258a() {
        return this.f54591a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: b */
    public InterfaceC18275mb mo78266b(long j) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78266b(j);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: h */
    public InterfaceC18275mb mo78272h(long j) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78272h(j);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public InterfaceC18275mb write(byte[] bArr) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.write(bArr);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78259a(int i) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78259a(i);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: b */
    public InterfaceC18275mb mo78267b(C18303ob c18303ob) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78267b(c18303ob);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public InterfaceC18275mb write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.write(bArr, i, i2);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78260a(InterfaceC18234jc interfaceC18234jc, long j) throws IOException {
        while (j > 0) {
            long jMo77914c = interfaceC18234jc.mo77914c(this.f54591a, j);
            if (jMo77914c == -1) {
                throw new EOFException();
            }
            j -= jMo77914c;
            mo78273n();
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78029b(c18261lb, j);
        mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78261a(String str) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78261a(str);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78262a(String str, int i, int i2) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78262a(str, i, i2);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78263a(String str, int i, int i2, Charset charset) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78263a(str, i, i2, charset);
        return mo78273n();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78264a(String str, Charset charset) throws IOException {
        if (this.f54593c) {
            throw new IllegalStateException("closed");
        }
        this.f54591a.mo78264a(str, charset);
        return mo78273n();
    }
}
