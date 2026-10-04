package o00o0O0;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o00o0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25308OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicReference<byte[]> f86137OooO00o = new AtomicReference<>();

    /* JADX INFO: renamed from: o00o0O0.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f86140OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f86141OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f86142OooO0OO;

        public OooO0O0(byte[] bArr, int i, int i2) {
            this.f86142OooO0OO = bArr;
            this.f86140OooO00o = i;
            this.f86141OooO0O0 = i2;
        }
    }

    public static MappedByteBuffer OooO00o(File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer OooO0O0(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f86137OooO00o;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return OooO0OO(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    public static ByteBuffer OooO0OO(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void OooO0Oo(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        OooO0OO(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: o00o0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19693OooO00o extends InputStream {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f86138OooOo = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ByteBuffer f86139OooOo0o;

        public C19693OooO00o(ByteBuffer byteBuffer) {
            this.f86139OooOo0o = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f86139OooOo0o.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.f86138OooOo = this.f86139OooOo0o.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f86139OooOo0o;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i = this.f86138OooOo;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f86139OooOo0o.position(i);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.f86139OooOo0o;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, byteBuffer.remaining());
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            ByteBuffer byteBuffer = this.f86139OooOo0o;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, byteBuffer.remaining());
            byteBuffer.get(bArr, i, iMin);
            return iMin;
        }
    }
}
