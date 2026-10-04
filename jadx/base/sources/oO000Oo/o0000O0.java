package oO000Oo;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import oO0OOo0o.InterfaceC33085Oooo0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f114502OooO00o = new OooO0O0(new byte[0], 0, 0);

    public static class OooO0O0 extends oO000Oo.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f114504OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f114505OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f114506OooOoO = -1;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final byte[] f114507OooOoO0;

        public OooO0O0(byte[] bArr, int i, int i2) {
            Preconditions.checkArgument(i >= 0, "offset must be >= 0");
            Preconditions.checkArgument(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            Preconditions.checkArgument(i3 <= bArr.length, "offset + length exceeds array boundary");
            this.f114507OooOoO0 = (byte[]) Preconditions.checkNotNull(bArr, "bytes");
            this.f114505OooOo0o = i;
            this.f114504OooOo = i3;
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final int OooO0O0() {
            return this.f114504OooOo - this.f114505OooOo0o;
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final InterfaceC32047o0000oO OooOo0O(int i) {
            OooO00o(i);
            int i2 = this.f114505OooOo0o;
            this.f114505OooOo0o = i2 + i;
            return new OooO0O0(this.f114507OooOoO0, i2, i);
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final void Oooo0oO(ByteBuffer byteBuffer) {
            Preconditions.checkNotNull(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            OooO00o(iRemaining);
            byteBuffer.put(this.f114507OooOoO0, this.f114505OooOo0o, iRemaining);
            this.f114505OooOo0o += iRemaining;
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final void o0000o(int i, int i2, byte[] bArr) {
            System.arraycopy(this.f114507OooOoO0, this.f114505OooOo0o, bArr, i, i2);
            this.f114505OooOo0o += i2;
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final void o000O0(OutputStream outputStream, int i) throws IOException {
            OooO00o(i);
            outputStream.write(this.f114507OooOoO0, this.f114505OooOo0o, i);
            this.f114505OooOo0o += i;
        }

        @Override // oO000Oo.OooO0O0, oO000Oo.InterfaceC32047o0000oO
        public final void o0OoOo0() {
            this.f114506OooOoO = this.f114505OooOo0o;
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final int readUnsignedByte() {
            OooO00o(1);
            int i = this.f114505OooOo0o;
            this.f114505OooOo0o = i + 1;
            return this.f114507OooOoO0[i] & 255;
        }

        @Override // oO000Oo.OooO0O0, oO000Oo.InterfaceC32047o0000oO
        public final void reset() {
            int i = this.f114506OooOoO;
            if (i == -1) {
                throw new InvalidMarkException();
            }
            this.f114505OooOo0o = i;
        }

        @Override // oO000Oo.InterfaceC32047o0000oO
        public final void skipBytes(int i) {
            OooO00o(i);
            this.f114505OooOo0o += i;
        }
    }

    public static final class OooO00o extends InputStream implements InterfaceC33085Oooo0OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC32047o0000oO f114503OooOo0o;

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f114503OooOo0o.OooO0O0();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f114503OooOo0o.close();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.f114503OooOo0o.o0OoOo0();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.f114503OooOo0o.markSupported();
        }

        @Override // java.io.InputStream
        public final int read() {
            InterfaceC32047o0000oO interfaceC32047o0000oO = this.f114503OooOo0o;
            if (interfaceC32047o0000oO.OooO0O0() == 0) {
                return -1;
            }
            return interfaceC32047o0000oO.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            this.f114503OooOo0o.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            InterfaceC32047o0000oO interfaceC32047o0000oO = this.f114503OooOo0o;
            int iMin = (int) Math.min(interfaceC32047o0000oO.OooO0O0(), j);
            interfaceC32047o0000oO.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            InterfaceC32047o0000oO interfaceC32047o0000oO = this.f114503OooOo0o;
            if (interfaceC32047o0000oO.OooO0O0() == 0) {
                return -1;
            }
            int iMin = Math.min(interfaceC32047o0000oO.OooO0O0(), i2);
            interfaceC32047o0000oO.o0000o(i, iMin, bArr);
            return iMin;
        }
    }
}
