package oOo00OoO;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: oOo00OoO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34540OooOo0 implements InterfaceC34526OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f123766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34544OooOoO f123767OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f123768OooOoO0;

    public C34540OooOo0(InterfaceC34544OooOoO sink) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        this.f123767OooOo0o = sink;
        this.f123766OooOo = new C34524OooO0Oo();
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final C34524OooO0Oo OooOO0() {
        return this.f123766OooOo;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final C34524OooO0Oo OooOO0O() {
        return this.f123766OooOo;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 Oooo0O0(C34527OooO0oO byteString) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(byteString, "byteString");
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o0000o0(byteString);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 Oooo0oo(long j) throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o000OO0o(j);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 Oooooo(long j) throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o000OOO(j);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC34544OooOoO interfaceC34544OooOoO = this.f123767OooOo0o;
        if (this.f123768OooOoO0) {
            return;
        }
        try {
            C34524OooO0Oo c34524OooO0Oo = this.f123766OooOo;
            long j = c34524OooO0Oo.f123723OooOo;
            if (j > 0) {
                interfaceC34544OooOoO.write(c34524OooO0Oo, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC34544OooOoO.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f123768OooOoO0 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0, oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        C34524OooO0Oo c34524OooO0Oo = this.f123766OooOo;
        long j = c34524OooO0Oo.f123723OooOo;
        InterfaceC34544OooOoO interfaceC34544OooOoO = this.f123767OooOo0o;
        if (j > 0) {
            interfaceC34544OooOoO.write(c34524OooO0Oo, j);
        }
        interfaceC34544OooOoO.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f123768OooOoO0;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 o000000() throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        C34524OooO0Oo c34524OooO0Oo = this.f123766OooOo;
        long jOooOOO0 = c34524OooO0Oo.OooOOO0();
        if (jOooOOO0 > 0) {
            this.f123767OooOo0o.write(c34524OooO0Oo, jOooOOO0);
        }
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 o00000Oo(String string) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o000Oo0o(string);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final long o0000O00(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) throws IOException {
        long j = 0;
        while (true) {
            long j2 = ((C34534OooOOOO) interfaceC34548OooOoo0).read(this.f123766OooOo, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            o000000();
        }
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 o000O0o0(int i, int i2, byte[] source) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o000O00O(source, i, i2);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final OutputStream o000O0oo() {
        return new OooO00o();
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final C34547OooOoo timeout() {
        return this.f123767OooOo0o.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f123767OooOo0o + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f123766OooOo.write(source);
        o000000();
        return iWrite;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 writeByte(int i) throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o0OoO0o(i);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 writeInt(int i) throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o000OOo0(i);
        o000000();
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 writeShort(int i) throws IOException {
        if (this.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        this.f123766OooOo.o000OOoO(i);
        o000000();
        return this;
    }

    /* JADX INFO: renamed from: oOo00OoO.OooOo0$OooO00o */
    public static final class OooO00o extends OutputStream {
        public OooO00o() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            C34540OooOo0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            C34540OooOo0 c34540OooOo0 = C34540OooOo0.this;
            if (c34540OooOo0.f123768OooOoO0) {
                return;
            }
            c34540OooOo0.flush();
        }

        public final String toString() {
            return C34540OooOo0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            C34540OooOo0 c34540OooOo0 = C34540OooOo0.this;
            if (c34540OooOo0.f123768OooOoO0) {
                throw new IOException("closed");
            }
            c34540OooOo0.f123766OooOo.o0OoO0o((byte) i);
            c34540OooOo0.o000000();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] data, int i, int i2) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
            C34540OooOo0 c34540OooOo0 = C34540OooOo0.this;
            if (!c34540OooOo0.f123768OooOoO0) {
                c34540OooOo0.f123766OooOo.o000O00O(data, i, i2);
                c34540OooOo0.o000000();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo source, long j) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        if (!this.f123768OooOoO0) {
            this.f123766OooOo.write(source, j);
            o000000();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 write(byte[] source) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        if (!this.f123768OooOoO0) {
            this.f123766OooOo.o0000ooO(source);
            o000000();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
