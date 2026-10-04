package oOo00OoO;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.Oooo000;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import ooOOoOOO.C35146OooO00o;

/* JADX INFO: renamed from: oOo00OoO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34542OooOo0O implements InterfaceC34525OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f123776OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34548OooOoo0 f123777OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f123778OooOoO0;

    public C34542OooOo0O(InterfaceC34548OooOoo0 source) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        this.f123777OooOo0o = source;
        this.f123776OooOo = new C34524OooO0Oo();
    }

    public final long OooO00o(byte b, long j, long j2) {
        if (this.f123778OooOoO0) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jOooo000 = this.f123776OooOo.Oooo000(b2, jMax, j3);
            if (jOooo000 != -1) {
                return jOooo000;
            }
            C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
            long j4 = c34524OooO0Oo.f123723OooOo;
            if (j4 >= j3 || this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final long OooO0OO(C34527OooO0oO targetBytes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetBytes, "targetBytes");
        if (this.f123778OooOoO0) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
            long jOoOO = c34524OooO0Oo.ooOO(targetBytes, jMax);
            if (jOoOO != -1) {
                return jOoOO;
            }
            long j = c34524OooO0Oo.f123723OooOo;
            if (this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o, oOo00OoO.InterfaceC34526OooO0o0
    public final C34524OooO0Oo OooOO0() {
        return this.f123776OooOo;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o, oOo00OoO.InterfaceC34526OooO0o0
    public final C34524OooO0Oo OooOO0O() {
        return this.f123776OooOo;
    }

    public final void OooOOO0(C34524OooO0Oo sink, long j) throws IOException {
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        try {
            o0000OOO(j);
            c34524OooO0Oo.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
            long j2 = c34524OooO0Oo.f123723OooOo;
            if (j2 >= j) {
                sink.write(c34524OooO0Oo, j);
            } else {
                sink.write(c34524OooO0Oo, j2);
                throw new EOFException();
            }
        } catch (EOFException e) {
            sink.o0000O00(c34524OooO0Oo);
            throw e;
        }
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final C34527OooO0oO OoooO0O(long j) throws EOFException {
        o0000OOO(j);
        return this.f123776OooOo.OoooO0O(j);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final String OooooOo(Charset charset) throws IOException {
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        c34524OooO0Oo.o0000O00(this.f123777OooOo0o);
        return c34524OooO0Oo.OooooOo(charset);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final C34527OooO0oO OoooooO() throws IOException {
        InterfaceC34548OooOoo0 interfaceC34548OooOoo0 = this.f123777OooOo0o;
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        c34524OooO0Oo.o0000O00(interfaceC34548OooOoo0);
        return c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f123778OooOoO0) {
            return;
        }
        this.f123778OooOoO0 = true;
        this.f123777OooOo0o.close();
        this.f123776OooOo.OooO00o();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f123778OooOoO0;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final String o000000o(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "limit < 0: ").toString());
        }
        long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        long jOooO00o = OooO00o((byte) 10, 0L, j2);
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        if (jOooO00o != -1) {
            return C35146OooO00o.OooO00o(c34524OooO0Oo, jOooO00o);
        }
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && request(j2) && c34524OooO0Oo.OooOooo(j2 - 1) == 13 && request(j2 + 1) && c34524OooO0Oo.OooOooo(j2) == 10) {
            return C35146OooO00o.OooO00o(c34524OooO0Oo, j2);
        }
        C34524OooO0Oo c34524OooO0Oo2 = new C34524OooO0Oo();
        c34524OooO0Oo.OooOOoo(c34524OooO0Oo2, 0L, Math.min(32, c34524OooO0Oo.f123723OooOo));
        throw new EOFException("\\n not found: limit=" + Math.min(c34524OooO0Oo.f123723OooOo, j) + " content=" + c34524OooO0Oo2.OoooO0O(c34524OooO0Oo2.f123723OooOo).OooO0Oo() + (char) 8230);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final String o00000oo() {
        return o000000o(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final void o0000OOO(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final boolean o0000o0O() {
        if (this.f123778OooOoO0) {
            throw new IllegalStateException("closed");
        }
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        return c34524OooO0Oo.o0000o0O() && this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final byte[] o0000oo(long j) throws EOFException {
        o0000OOO(j);
        return this.f123776OooOo.o0000oo(j);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final InputStream o000OO00() {
        return new OooO00o();
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final byte[] o000oOoO() throws IOException {
        InterfaceC34548OooOoo0 interfaceC34548OooOoo0 = this.f123777OooOo0o;
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        c34524OooO0Oo.o0000O00(interfaceC34548OooOoo0);
        return c34524OooO0Oo.o0000oo(c34524OooO0Oo.f123723OooOo);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final long o00oO0O() throws EOFException {
        C34524OooO0Oo c34524OooO0Oo;
        byte bOooOooo;
        o0000OOO(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            c34524OooO0Oo = this.f123776OooOo;
            if (!zRequest) {
                break;
            }
            bOooOooo = c34524OooO0Oo.OooOooo(i);
            if ((bOooOooo < 48 || bOooOooo > 57) && ((bOooOooo < 97 || bOooOooo > 102) && (bOooOooo < 65 || bOooOooo > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            Oooo000.OooO0O0(16);
            Oooo000.OooO0O0(16);
            String string = Integer.toString(bOooOooo, 16);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c34524OooO0Oo.o00oO0O();
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final long o0O0O00(C34524OooO0Oo c34524OooO0Oo) {
        C34524OooO0Oo c34524OooO0Oo2;
        long j = 0;
        while (true) {
            InterfaceC34548OooOoo0 interfaceC34548OooOoo0 = this.f123777OooOo0o;
            c34524OooO0Oo2 = this.f123776OooOo;
            if (interfaceC34548OooOoo0.read(c34524OooO0Oo2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long jOooOOO0 = c34524OooO0Oo2.OooOOO0();
            if (jOooOOO0 > 0) {
                j += jOooOOO0;
                c34524OooO0Oo.write(c34524OooO0Oo2, jOooOOO0);
            }
        }
        long j2 = c34524OooO0Oo2.f123723OooOo;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c34524OooO0Oo.write(c34524OooO0Oo2, j2);
        return j3;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final int o0OOO0o(C34536OooOOo options) throws EOFException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(options, "options");
        if (this.f123778OooOoO0) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
            int iOooO0O0 = C35146OooO00o.OooO0O0(c34524OooO0Oo, options, true);
            if (iOooO0O0 != -2) {
                if (iOooO0O0 != -1) {
                    c34524OooO0Oo.skip(options.f123759OooOo0o[iOooO0O0].OooO0OO());
                    return iOooO0O0;
                }
            } else if (this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final C34542OooOo0O peek() {
        return C34535OooOOOo.OooO0O0(new C34541OooOo00(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        if (c34524OooO0Oo.f123723OooOo == 0 && this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return c34524OooO0Oo.read(sink);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final byte readByte() throws EOFException {
        o0000OOO(1L);
        return this.f123776OooOo.readByte();
    }

    public final void readFully(byte[] sink) throws EOFException {
        C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        try {
            o0000OOO(sink.length);
            c34524OooO0Oo.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c34524OooO0Oo.f123723OooOo;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c34524OooO0Oo.read(sink, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final int readInt() throws EOFException {
        o0000OOO(4L);
        return this.f123776OooOo.readInt();
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final short readShort() throws EOFException {
        o0000OOO(2L);
        return this.f123776OooOo.readShort();
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final boolean request(long j) {
        C34524OooO0Oo c34524OooO0Oo;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        if (this.f123778OooOoO0) {
            throw new IllegalStateException("closed");
        }
        do {
            c34524OooO0Oo = this.f123776OooOo;
            if (c34524OooO0Oo.f123723OooOo >= j) {
                return true;
            }
        } while (this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final void skip(long j) throws EOFException {
        if (this.f123778OooOoO0) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
            if (c34524OooO0Oo.f123723OooOo == 0 && this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c34524OooO0Oo.f123723OooOo);
            c34524OooO0Oo.skip(jMin);
            j -= jMin;
        }
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        return this.f123777OooOo0o.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f123777OooOo0o + ')';
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final long read(C34524OooO0Oo sink, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (j >= 0) {
            if (!this.f123778OooOoO0) {
                C34524OooO0Oo c34524OooO0Oo = this.f123776OooOo;
                if (c34524OooO0Oo.f123723OooOo == 0 && this.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return c34524OooO0Oo.read(sink, Math.min(j, c34524OooO0Oo.f123723OooOo));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
    }

    /* JADX INFO: renamed from: oOo00OoO.OooOo0O$OooO00o */
    public static final class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            C34542OooOo0O c34542OooOo0O = C34542OooOo0O.this;
            if (c34542OooOo0O.f123778OooOoO0) {
                throw new IOException("closed");
            }
            return (int) Math.min(c34542OooOo0O.f123776OooOo.f123723OooOo, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C34542OooOo0O.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            C34542OooOo0O c34542OooOo0O = C34542OooOo0O.this;
            if (c34542OooOo0O.f123778OooOoO0) {
                throw new IOException("closed");
            }
            C34524OooO0Oo c34524OooO0Oo = c34542OooOo0O.f123776OooOo;
            if (c34524OooO0Oo.f123723OooOo == 0 && c34542OooOo0O.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return c34524OooO0Oo.readByte() & 255;
        }

        public final String toString() {
            return C34542OooOo0O.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] data, int i, int i2) throws IOException {
            kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
            C34542OooOo0O c34542OooOo0O = C34542OooOo0O.this;
            if (!c34542OooOo0O.f123778OooOoO0) {
                C34522OooO0O0.OooO0O0(data.length, i, i2);
                C34524OooO0Oo c34524OooO0Oo = c34542OooOo0O.f123776OooOo;
                if (c34524OooO0Oo.f123723OooOo == 0 && c34542OooOo0O.f123777OooOo0o.read(c34524OooO0Oo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return c34524OooO0Oo.read(data, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
