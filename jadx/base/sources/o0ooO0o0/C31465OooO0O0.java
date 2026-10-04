package o0ooO0o0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o0ooO0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31465OooO0O0 extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f112532OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112533OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[] f112534OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f112535OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte[] f112536OooOoOO;

    public C31465OooO0O0(InputStream inputStream) {
        super(inputStream);
        this.f112533OooOo0o = 0;
        this.f112532OooOo = 0;
        this.f112535OooOoO0 = false;
        this.f112534OooOoO = new byte[5];
        this.f112536OooOoOO = new byte[4];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112534OooOoO = null;
        this.f112535OooOoO0 = true;
        this.f112536OooOoOO = null;
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r13 = r14.f112534OooOoO;
        r13[r2] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r12 != 126) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        r13[r2] = 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        r4 = r2 - 1;
        r14.f112532OooOo = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r4 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        r14.f112535OooOoO0 = true;
        r14.f112534OooOoO = null;
        r14.f112536OooOoOO = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r2 >= 5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r2 >= 5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        r14.f112534OooOoO[r2] = 117;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        r14.f112535OooOoO0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if (r4 >= 5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
    
        r5 = (byte) (r14.f112534OooOoO[r4] - 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r5 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
    
        if (r5 > 93) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
    
        r1 = (r1 * 85) + ((long) r5);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        r14.f112532OooOo = 0;
        r14.f112535OooOoO0 = true;
        r14.f112534OooOoO = null;
        r14.f112536OooOoOO = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        throw new java.io.IOException("Invalid data in Ascii85 stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r10 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        r14.f112536OooOoOO[r10] = (byte) (255 & r1);
        r1 = r1 >>> 8;
        r10 = r10 - 1;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read() throws IOException {
        if (this.f112533OooOo0o >= this.f112532OooOo) {
            if (this.f112535OooOoO0) {
                return -1;
            }
            this.f112533OooOo0o = 0;
            while (true) {
                byte b = (byte) ((FilterInputStream) this).in.read();
                if (b == -1) {
                    this.f112535OooOoO0 = true;
                    return -1;
                }
                byte b2 = b;
                if (b2 != 10 && b2 != 13 && b2 != 32) {
                    if (b2 == 126) {
                        this.f112535OooOoO0 = true;
                        this.f112536OooOoOO = null;
                        this.f112534OooOoO = null;
                        this.f112532OooOo = 0;
                        return -1;
                    }
                    int i = 3;
                    if (b2 == 122) {
                        byte[] bArr = this.f112536OooOoOO;
                        bArr[3] = 0;
                        bArr[2] = 0;
                        bArr[1] = 0;
                        bArr[0] = 0;
                        this.f112532OooOo = 4;
                    } else {
                        this.f112534OooOoO[0] = b2;
                        int i2 = 1;
                        while (true) {
                            if (i2 >= 5) {
                                break;
                            }
                            while (true) {
                                byte b3 = (byte) ((FilterInputStream) this).in.read();
                                if (b3 != -1) {
                                    byte b4 = b3;
                                    if (b4 != 10 && b4 != 13 && b4 != 32) {
                                        break;
                                    }
                                } else {
                                    this.f112535OooOoO0 = true;
                                    return -1;
                                }
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        byte[] bArr2 = this.f112536OooOoOO;
        int i3 = this.f112533OooOo0o;
        this.f112533OooOo0o = i3 + 1;
        return bArr2[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        throw new IOException("Reset is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f112535OooOoO0 && this.f112533OooOo0o >= this.f112532OooOo) {
            return -1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f112533OooOo0o;
            if (i4 < this.f112532OooOo) {
                byte[] bArr2 = this.f112536OooOoOO;
                this.f112533OooOo0o = i4 + 1;
                bArr[i3 + i] = bArr2[i4];
            } else {
                int i5 = read();
                if (i5 == -1) {
                    return i3;
                }
                bArr[i3 + i] = (byte) i5;
            }
        }
        return i2;
    }
}
