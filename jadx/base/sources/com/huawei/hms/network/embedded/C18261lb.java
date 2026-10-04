package com.huawei.hms.network.embedded;

import OooO0O0.OooO0o;
import Oooo0.C20855OooooOO;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.concurrent.futures.OooO00o;
import androidx.core.graphics.OooO0O0;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.PatternStyle;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.lb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18261lb implements InterfaceC18289nb, InterfaceC18275mb, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c */
    public static final byte[] f55628c = {PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: d */
    public static final int f55629d = 65533;

    /* JADX INFO: renamed from: a */
    public C18178fc f55630a;

    /* JADX INFO: renamed from: b */
    public long f55631b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.lb$a */
    public class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C18261lb.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C18261lb.this.writeByte((int) ((byte) i));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C18261lb.this.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.lb$b */
    public class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C18261lb.this.f55631b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C18261lb c18261lb = C18261lb.this;
            if (c18261lb.f55631b > 0) {
                return c18261lb.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C18261lb.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C18261lb.this.read(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.lb$c */
    public static final class c implements Closeable {

        /* JADX INFO: renamed from: a */
        public C18261lb f55634a;

        /* JADX INFO: renamed from: b */
        public boolean f55635b;

        /* JADX INFO: renamed from: c */
        public C18178fc f55636c;

        /* JADX INFO: renamed from: e */
        public byte[] f55638e;

        /* JADX INFO: renamed from: d */
        public long f55637d = -1;

        /* JADX INFO: renamed from: f */
        public int f55639f = -1;

        /* JADX INFO: renamed from: g */
        public int f55640g = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f55634a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f55634a = null;
            this.f55636c = null;
            this.f55637d = -1L;
            this.f55638e = null;
            this.f55639f = -1;
            this.f55640g = -1;
        }

        /* JADX INFO: renamed from: d */
        public final long m79103d(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "minByteCount <= 0: "));
            }
            if (i > 8192) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "minByteCount > Segment.SIZE: "));
            }
            C18261lb c18261lb = this.f55634a;
            if (c18261lb == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f55635b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j = c18261lb.f55631b;
            C18178fc c18178fcM79090e = c18261lb.m79090e(i);
            int i2 = 8192 - c18178fcM79090e.f54867c;
            c18178fcM79090e.f54867c = 8192;
            long j2 = i2;
            this.f55634a.f55631b = j + j2;
            this.f55636c = c18178fcM79090e;
            this.f55637d = j;
            this.f55638e = c18178fcM79090e.f54865a;
            this.f55639f = 8192 - i2;
            this.f55640g = 8192;
            return j2;
        }

        /* JADX INFO: renamed from: j */
        public final long m79104j(long j) {
            C18261lb c18261lb = this.f55634a;
            if (c18261lb == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f55635b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = c18261lb.f55631b;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(OooO00o.OooO0O0(j, "newSize < 0: "));
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    C18261lb c18261lb2 = this.f55634a;
                    C18178fc c18178fc = c18261lb2.f55630a.f54871g;
                    int i = c18178fc.f54867c;
                    long j4 = i - c18178fc.f54866b;
                    if (j4 > j3) {
                        c18178fc.f54867c = (int) (((long) i) - j3);
                        break;
                    }
                    c18261lb2.f55630a = c18178fc.m78512b();
                    C18192gc.m78640a(c18178fc);
                    j3 -= j4;
                }
                this.f55636c = null;
                this.f55637d = j;
                this.f55638e = null;
                this.f55639f = -1;
                this.f55640g = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    C18178fc c18178fcM79090e = this.f55634a.m79090e(1);
                    int iMin = (int) Math.min(j5, 8192 - c18178fcM79090e.f54867c);
                    int i2 = c18178fcM79090e.f54867c + iMin;
                    c18178fcM79090e.f54867c = i2;
                    j5 -= (long) iMin;
                    if (z) {
                        this.f55636c = c18178fcM79090e;
                        this.f55637d = j2;
                        this.f55638e = c18178fcM79090e.f54865a;
                        this.f55639f = i2 - iMin;
                        this.f55640g = i2;
                        z = false;
                    }
                }
            }
            this.f55634a.f55631b = j;
            return j2;
        }

        /* JADX INFO: renamed from: k */
        public final int m79105k(long j) {
            if (j >= -1) {
                C18261lb c18261lb = this.f55634a;
                long j2 = c18261lb.f55631b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f55636c = null;
                        this.f55637d = j;
                        this.f55638e = null;
                        this.f55639f = -1;
                        this.f55640g = -1;
                        return -1;
                    }
                    C18178fc c18178fc = c18261lb.f55630a;
                    C18178fc c18178fcM78509a = this.f55636c;
                    long j3 = 0;
                    if (c18178fcM78509a != null) {
                        long j4 = this.f55637d - ((long) (this.f55639f - c18178fcM78509a.f54866b));
                        if (j4 > j) {
                            c18178fcM78509a = c18178fc;
                            c18178fc = c18178fcM78509a;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        c18178fcM78509a = c18178fc;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = ((long) (c18178fcM78509a.f54867c - c18178fcM78509a.f54866b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            c18178fcM78509a = c18178fcM78509a.f54870f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            c18178fc = c18178fc.f54871g;
                            j2 -= (long) (c18178fc.f54867c - c18178fc.f54866b);
                        }
                        c18178fcM78509a = c18178fc;
                        j3 = j2;
                    }
                    if (this.f55635b && c18178fcM78509a.f54868d) {
                        C18178fc c18178fcM78514d = c18178fcM78509a.m78514d();
                        C18261lb c18261lb2 = this.f55634a;
                        if (c18261lb2.f55630a == c18178fcM78509a) {
                            c18261lb2.f55630a = c18178fcM78514d;
                        }
                        c18178fcM78509a = c18178fcM78509a.m78509a(c18178fcM78514d);
                        c18178fcM78509a.f54871g.m78512b();
                    }
                    this.f55636c = c18178fcM78509a;
                    this.f55637d = j;
                    this.f55638e = c18178fcM78509a.f54865a;
                    int i = c18178fcM78509a.f54866b + ((int) (j - j3));
                    this.f55639f = i;
                    int i2 = c18178fcM78509a.f54867c;
                    this.f55640g = i2;
                    return i2 - i;
                }
            }
            long j6 = this.f55634a.f55631b;
            StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "offset=", " > size=");
            sbOooO00o.append(j6);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }

        /* JADX INFO: renamed from: s */
        public final int m79106s() {
            long j = this.f55637d;
            if (j != this.f55634a.f55631b) {
                return m79105k(j == -1 ? 0L : j + ((long) (this.f55640g - this.f55639f)));
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: A */
    public final C18303ob m79075A() {
        return m79074b("SHA-512");
    }

    /* JADX INFO: renamed from: B */
    public final long m79076B() {
        return this.f55631b;
    }

    /* JADX INFO: renamed from: C */
    public final C18303ob m79077C() {
        long j = this.f55631b;
        if (j <= 2147483647L) {
            return m79088d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f55631b);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public int mo78367a(C18446zb c18446zb) {
        int iM79078a = m79078a(c18446zb, false);
        if (iM79078a == -1) {
            return -1;
        }
        try {
            skip(c18446zb.f56866a[iM79078a].mo78736j());
            return iM79078a;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: b */
    public int mo78381b() {
        return C18276mc.m79199a(readInt());
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: c */
    public long mo78383c() {
        return C18276mc.m79200a(readLong());
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C18261lb m80717clone() {
        C18261lb c18261lb = new C18261lb();
        if (this.f55631b == 0) {
            return c18261lb;
        }
        C18178fc c18178fcM78513c = this.f55630a.m78513c();
        c18261lb.f55630a = c18178fcM78513c;
        c18178fcM78513c.f54871g = c18178fcM78513c;
        c18178fcM78513c.f54870f = c18178fcM78513c;
        C18178fc c18178fc = this.f55630a;
        while (true) {
            c18178fc = c18178fc.f54870f;
            if (c18178fc == this.f55630a) {
                c18261lb.f55631b = this.f55631b;
                return c18261lb;
            }
            c18261lb.f55630a.f54871g.m78509a(c18178fc.m78513c());
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: d */
    public C18261lb mo78386d() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: e */
    public int mo78387e() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f55631b == 0) {
            throw new EOFException();
        }
        byte bM79093j = m79093j(0L);
        if ((bM79093j & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i = bM79093j & Ascii.DEL;
            i3 = 0;
            i2 = 1;
        } else if ((bM79093j & 224) == 192) {
            i = bM79093j & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM79093j & 240) == 224) {
            i = bM79093j & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM79093j & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bM79093j & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f55631b < j) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i2, "size < ", ": ");
            sbOooO0OO.append(this.f55631b);
            sbOooO0OO.append(" (to read code point prefixed 0x");
            sbOooO0OO.append(Integer.toHexString(bM79093j));
            sbOooO0OO.append(")");
            throw new EOFException(sbOooO0OO.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM79093j2 = m79093j(j2);
            if ((bM79093j2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bM79093j2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18261lb)) {
            return false;
        }
        C18261lb c18261lb = (C18261lb) obj;
        long j = this.f55631b;
        if (j != c18261lb.f55631b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C18178fc c18178fc = this.f55630a;
        C18178fc c18178fc2 = c18261lb.f55630a;
        int i = c18178fc.f54866b;
        int i2 = c18178fc2.f54866b;
        while (j2 < this.f55631b) {
            long jMin = Math.min(c18178fc.f54867c - i, c18178fc2.f54867c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c18178fc.f54865a[i] != c18178fc2.f54865a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c18178fc.f54867c) {
                c18178fc = c18178fc.f54870f;
                i = c18178fc.f54866b;
            }
            if (i2 == c18178fc2.f54867c) {
                c18178fc2 = c18178fc2.f54870f;
                i2 = c18178fc2.f54866b;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final C18303ob m79092f(C18303ob c18303ob) {
        return m79071a("HmacSHA512", c18303ob);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb, com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    public void flush() {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: g */
    public OutputStream mo78270g() {
        return new a();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: h */
    public C18261lb mo78272h(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C18178fc c18178fcM79090e = m79090e(iNumberOfTrailingZeros);
        byte[] bArr = c18178fcM79090e.f54865a;
        int i = c18178fcM79090e.f54867c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f55628c[(int) (15 & j)];
            j >>>= 4;
        }
        c18178fcM79090e.f54867c += iNumberOfTrailingZeros;
        this.f55631b += (long) iNumberOfTrailingZeros;
        return this;
    }

    public int hashCode() {
        C18178fc c18178fc = this.f55630a;
        if (c18178fc == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c18178fc.f54867c;
            for (int i3 = c18178fc.f54866b; i3 < i2; i3++) {
                i = (i * 31) + c18178fc.f54865a[i3];
            }
            c18178fc = c18178fc.f54870f;
        } while (c18178fc != this.f55630a);
        return i;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: i */
    public short mo78392i() {
        return C18276mc.m79201a(readShort());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final byte m79093j(long j) {
        int i;
        C18276mc.m79202a(this.f55631b, j, 1L);
        long j2 = this.f55631b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            C18178fc c18178fc = this.f55630a;
            do {
                c18178fc = c18178fc.f54871g;
                int i2 = c18178fc.f54867c;
                i = c18178fc.f54866b;
                j3 += (long) (i2 - i);
            } while (j3 < 0);
            return c18178fc.f54865a[i + ((int) j3)];
        }
        C18178fc c18178fc2 = this.f55630a;
        long j4 = j;
        while (true) {
            int i3 = c18178fc2.f54867c;
            int i4 = c18178fc2.f54866b;
            long j5 = i3 - i4;
            if (j4 < j5) {
                return c18178fc2.f54865a[i4 + ((int) j4)];
            }
            j4 -= j5;
            c18178fc2 = c18178fc2.f54870f;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: k */
    public String mo78395k() throws EOFException {
        long jMo78368a = mo78368a((byte) 10);
        if (jMo78368a != -1) {
            return m79094k(jMo78368a);
        }
        long j = this.f55631b;
        if (j != 0) {
            return mo78388e(j);
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: l */
    public InputStream mo78396l() {
        return new b();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: m */
    public String mo78397m() throws EOFException {
        return mo78385c(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: n */
    public C18261lb mo78273n() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: o */
    public String mo78398o() {
        try {
            return mo78376a(this.f55631b, C18276mc.f55722a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[EDGE_INSN: B:48:0x009f->B:38:0x009f BREAK  A[LOOP:0: B:5:0x000f->B:50:?], SYNTHETIC] */
    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo78399p() {
        if (this.f55631b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        boolean z = false;
        long j = -7;
        long j2 = 0;
        boolean z2 = false;
        do {
            C18178fc c18178fc = this.f55630a;
            byte[] bArr = c18178fc.f54865a;
            int i2 = c18178fc.f54866b;
            int i3 = c18178fc.f54867c;
            while (i2 < i3) {
                byte b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j2 < -922337203685477580L || (j2 == -922337203685477580L && i4 < j)) {
                        C18261lb c18261lbWriteByte = new C18261lb().mo78266b(j2).writeByte((int) b2);
                        if (!z) {
                            c18261lbWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + c18261lbWriteByte.mo78398o());
                    }
                    j2 = (j2 * 10) + ((long) i4);
                } else if (b2 == 45 && i == 0) {
                    j--;
                    z = true;
                } else {
                    if (i == 0) {
                        throw new NumberFormatException(OooO0O0.OooO00o(b2, new StringBuilder("Expected leading [0-9] or '-' character but was 0x")));
                    }
                    z2 = true;
                    if (i2 != i3) {
                        this.f55630a = c18178fc.m78512b();
                        C18192gc.m78640a(c18178fc);
                    } else {
                        c18178fc.f54866b = i2;
                    }
                    if (!z2) {
                        break;
                    }
                }
                i2++;
                i++;
            }
            if (i2 != i3) {
            }
            if (!z2) {
            }
        } while (this.f55630a != null);
        this.f55631b -= (long) i;
        return z ? j2 : -j2;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public InterfaceC18289nb peek() {
        return C18433yb.m80007a(new C18108ac(this));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: q */
    public byte[] mo78400q() {
        try {
            return mo78390f(this.f55631b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: r */
    public C18303ob mo78401r() {
        return new C18303ob(mo78400q());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C18178fc c18178fc = this.f55630a;
        if (c18178fc == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c18178fc.f54867c - c18178fc.f54866b);
        byteBuffer.put(c18178fc.f54865a, c18178fc.f54866b, iMin);
        int i = c18178fc.f54866b + iMin;
        c18178fc.f54866b = i;
        this.f55631b -= (long) iMin;
        if (i == c18178fc.f54867c) {
            this.f55630a = c18178fc.m78512b();
            C18192gc.m78640a(c18178fc);
        }
        return iMin;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public byte readByte() {
        long j = this.f55631b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C18178fc c18178fc = this.f55630a;
        int i = c18178fc.f54866b;
        int i2 = c18178fc.f54867c;
        int i3 = i + 1;
        byte b2 = c18178fc.f54865a[i];
        this.f55631b = j - 1;
        if (i3 != i2) {
            c18178fc.f54866b = i3;
            return b2;
        }
        this.f55630a = c18178fc.m78512b();
        C18192gc.m78640a(c18178fc);
        return b2;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public int readInt() {
        long j = this.f55631b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f55631b);
        }
        C18178fc c18178fc = this.f55630a;
        int i = c18178fc.f54866b;
        int i2 = c18178fc.f54867c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c18178fc.f54865a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f55631b = j - 4;
        if (i5 != i2) {
            c18178fc.f54866b = i5;
            return i6;
        }
        this.f55630a = c18178fc.m78512b();
        C18192gc.m78640a(c18178fc);
        return i6;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public long readLong() {
        long j = this.f55631b;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f55631b);
        }
        C18178fc c18178fc = this.f55630a;
        int i = c18178fc.f54866b;
        int i2 = c18178fc.f54867c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c18178fc.f54865a;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f55631b = j - 8;
        if (i4 != i2) {
            c18178fc.f54866b = i4;
            return j3;
        }
        this.f55630a = c18178fc.m78512b();
        C18192gc.m78640a(c18178fc);
        return j3;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public short readShort() {
        long j = this.f55631b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f55631b);
        }
        C18178fc c18178fc = this.f55630a;
        int i = c18178fc.f54866b;
        int i2 = c18178fc.f54867c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c18178fc.f54865a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f55631b = j - 2;
        if (i5 == i2) {
            this.f55630a = c18178fc.m78512b();
            C18192gc.m78640a(c18178fc);
        } else {
            c18178fc.f54866b = i5;
        }
        return (short) i6;
    }

    /* JADX INFO: renamed from: s */
    public final void m79095s() {
        try {
            skip(this.f55631b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public void skip(long j) throws EOFException {
        while (j > 0) {
            if (this.f55630a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.f54867c - r0.f54866b);
            long j2 = iMin;
            this.f55631b -= j2;
            j -= j2;
            C18178fc c18178fc = this.f55630a;
            int i = c18178fc.f54866b + iMin;
            c18178fc.f54866b = i;
            if (i == c18178fc.f54867c) {
                this.f55630a = c18178fc.m78512b();
                C18192gc.m78640a(c18178fc);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m79096t() {
        long j = this.f55631b;
        if (j == 0) {
            return 0L;
        }
        C18178fc c18178fc = this.f55630a.f54871g;
        int i = c18178fc.f54867c;
        return (i >= 8192 || !c18178fc.f54869e) ? j : j - ((long) (i - c18178fc.f54866b));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    public C18248kc timeout() {
        return C18248kc.f55445d;
    }

    public String toString() {
        return m79077C().toString();
    }

    /* JADX INFO: renamed from: u */
    public final C18303ob m79097u() {
        return m79074b("MD5");
    }

    /* JADX INFO: renamed from: v */
    public final c m79098v() {
        return m79079a(new c());
    }

    /* JADX INFO: renamed from: w */
    public final c m79099w() {
        return m79086b(new c());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C18178fc c18178fcM79090e = m79090e(1);
            int iMin = Math.min(i, 8192 - c18178fcM79090e.f54867c);
            byteBuffer.get(c18178fcM79090e.f54865a, c18178fcM79090e.f54867c, iMin);
            i -= iMin;
            c18178fcM79090e.f54867c += iMin;
        }
        this.f55631b += (long) iRemaining;
        return iRemaining;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public C18261lb writeByte(int i) {
        C18178fc c18178fcM79090e = m79090e(1);
        byte[] bArr = c18178fcM79090e.f54865a;
        int i2 = c18178fcM79090e.f54867c;
        c18178fcM79090e.f54867c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f55631b++;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public C18261lb writeInt(int i) {
        C18178fc c18178fcM79090e = m79090e(4);
        byte[] bArr = c18178fcM79090e.f54865a;
        int i2 = c18178fcM79090e.f54867c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c18178fcM79090e.f54867c = i2 + 4;
        this.f55631b += 4;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public C18261lb writeLong(long j) {
        C18178fc c18178fcM79090e = m79090e(8);
        byte[] bArr = c18178fcM79090e.f54865a;
        int i = c18178fcM79090e.f54867c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        c18178fcM79090e.f54867c = i + 8;
        this.f55631b += 8;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public C18261lb writeShort(int i) {
        C18178fc c18178fcM79090e = m79090e(2);
        byte[] bArr = c18178fcM79090e.f54865a;
        int i2 = c18178fcM79090e.f54867c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c18178fcM79090e.f54867c = i2 + 2;
        this.f55631b += 2;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public List<Integer> m79100x() {
        if (this.f55630a == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        C18178fc c18178fc = this.f55630a;
        arrayList.add(Integer.valueOf(c18178fc.f54867c - c18178fc.f54866b));
        C18178fc c18178fc2 = this.f55630a;
        while (true) {
            c18178fc2 = c18178fc2.f54870f;
            if (c18178fc2 == this.f55630a) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(c18178fc2.f54867c - c18178fc2.f54866b));
        }
    }

    /* JADX INFO: renamed from: y */
    public final C18303ob m79101y() {
        return m79074b(IDevicePopManager.SHA_1);
    }

    /* JADX INFO: renamed from: z */
    public final C18303ob m79102z() {
        return m79074b(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        return r10;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m79078a(C18446zb c18446zb, boolean z) {
        int i;
        int i2;
        C18178fc c18178fc;
        int i3;
        int i4;
        C18178fc c18178fc2 = this.f55630a;
        int i5 = -2;
        if (c18178fc2 != null) {
            byte[] bArr = c18178fc2.f54865a;
            int i6 = c18178fc2.f54866b;
            int i7 = c18178fc2.f54867c;
            int[] iArr = c18446zb.f56867b;
            C18178fc c18178fc3 = c18178fc2;
            int i8 = 0;
            int i9 = -1;
            loop0: while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i8 + 2;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (c18178fc3 == null) {
                    break;
                }
                if (i11 >= 0) {
                    int i14 = i6 + 1;
                    int i15 = bArr[i6] & 255;
                    int i16 = i12 + i11;
                    while (i12 != i16) {
                        if (i15 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i14 == i7) {
                                c18178fc3 = c18178fc3.f54870f;
                                i2 = c18178fc3.f54866b;
                                bArr = c18178fc3.f54865a;
                                i7 = c18178fc3.f54867c;
                                if (c18178fc3 == c18178fc2) {
                                    c18178fc3 = null;
                                }
                            } else {
                                i2 = i14;
                            }
                            if (i >= 0) {
                                return i;
                            }
                            i8 = -i;
                            i6 = i2;
                            i5 = -2;
                        } else {
                            i12++;
                        }
                    }
                    break loop0;
                }
                int i17 = (i11 * (-1)) + i12;
                while (true) {
                    int i18 = i6 + 1;
                    int i19 = i12 + 1;
                    if ((bArr[i6] & 255) != iArr[i12]) {
                        break loop0;
                    }
                    boolean z2 = i19 == i17;
                    if (i18 == i7) {
                        C18178fc c18178fc4 = c18178fc3.f54870f;
                        i4 = c18178fc4.f54866b;
                        byte[] bArr2 = c18178fc4.f54865a;
                        i3 = c18178fc4.f54867c;
                        if (c18178fc4 != c18178fc2) {
                            c18178fc = c18178fc4;
                            bArr = bArr2;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            c18178fc = null;
                        }
                    } else {
                        c18178fc = c18178fc3;
                        i3 = i7;
                        i4 = i18;
                    }
                    if (z2) {
                        i = iArr[i19];
                        i2 = i4;
                        i7 = i3;
                        c18178fc3 = c18178fc;
                        break;
                    }
                    i6 = i4;
                    i7 = i3;
                    c18178fc3 = c18178fc;
                    i12 = i19;
                }
            }
        } else {
            if (z) {
                return -2;
            }
            return c18446zb.indexOf(C18303ob.f55843f);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: b */
    public long mo78382b(C18303ob c18303ob, long j) {
        int i;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C18178fc c18178fc = this.f55630a;
        if (c18178fc == null) {
            return -1L;
        }
        long j3 = this.f55631b;
        if (j3 - j < j) {
            while (j3 > j) {
                c18178fc = c18178fc.f54871g;
                j3 -= (long) (c18178fc.f54867c - c18178fc.f54866b);
            }
        } else {
            while (true) {
                long j4 = ((long) (c18178fc.f54867c - c18178fc.f54866b)) + j2;
                if (j4 >= j) {
                    break;
                }
                c18178fc = c18178fc.f54870f;
                j2 = j4;
            }
            j3 = j2;
        }
        if (c18303ob.mo78736j() == 2) {
            byte bMo78716a = c18303ob.mo78716a(0);
            byte bMo78716a2 = c18303ob.mo78716a(1);
            while (j3 < this.f55631b) {
                byte[] bArr = c18178fc.f54865a;
                i = (int) ((((long) c18178fc.f54866b) + j) - j3);
                int i2 = c18178fc.f54867c;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 == bMo78716a || b2 == bMo78716a2) {
                        return ((long) (i - c18178fc.f54866b)) + j3;
                    }
                    i++;
                }
                j3 += (long) (c18178fc.f54867c - c18178fc.f54866b);
                c18178fc = c18178fc.f54870f;
                j = j3;
            }
            return -1L;
        }
        byte[] bArrMo78732e = c18303ob.mo78732e();
        while (j3 < this.f55631b) {
            byte[] bArr2 = c18178fc.f54865a;
            i = (int) ((((long) c18178fc.f54866b) + j) - j3);
            int i3 = c18178fc.f54867c;
            while (i < i3) {
                byte b3 = bArr2[i];
                for (byte b4 : bArrMo78732e) {
                    if (b3 == b4) {
                        return ((long) (i - c18178fc.f54866b)) + j3;
                    }
                }
                i++;
            }
            j3 += (long) (c18178fc.f54867c - c18178fc.f54866b);
            c18178fc = c18178fc.f54870f;
            j = j3;
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) {
        if (c18261lb == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        long j2 = this.f55631b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c18261lb.mo78029b(this, j);
        return j;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: d */
    public C18261lb mo78269d(long j) {
        return writeLong(C18276mc.m79200a(j));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: f */
    public boolean mo78389f() {
        return this.f55631b == 0;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: g */
    public boolean mo78391g(long j) {
        return this.f55631b >= j;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: h */
    public InterfaceC18275mb mo78271h() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: i */
    public void mo78393i(long j) throws EOFException {
        if (this.f55631b < j) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[EDGE_INSN: B:43:0x0095->B:37:0x0095 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo78394j() {
        int i;
        if (this.f55631b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C18178fc c18178fc = this.f55630a;
            byte[] bArr = c18178fc.f54865a;
            int i3 = c18178fc.f54866b;
            int i4 = c18178fc.f54867c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i = b2 - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException(OooO0O0.OooO00o(b2, new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x")));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.f55630a = c18178fc.m78512b();
                        C18192gc.m78640a(c18178fc);
                    } else {
                        c18178fc.f54866b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new C18261lb().mo78272h(j).writeByte((int) b2).mo78398o());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f55630a != null);
        this.f55631b -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: k */
    public String m79094k(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m79093j(j2) == 13) {
                String strMo78388e = mo78388e(j2);
                skip(2L);
                return strMo78388e;
            }
        }
        String strMo78388e2 = mo78388e(j);
        skip(1L);
        return strMo78388e2;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public C18261lb write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78368a(byte b2) {
        return mo78370a(b2, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    /* JADX INFO: renamed from: b */
    public final c m79086b(c cVar) {
        if (cVar.f55634a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        cVar.f55634a = this;
        cVar.f55635b = false;
        return cVar;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: f */
    public byte[] mo78390f(long j) throws EOFException {
        C18276mc.m79202a(this.f55631b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public int read(byte[] bArr, int i, int i2) {
        C18276mc.m79202a(bArr.length, i, i2);
        C18178fc c18178fc = this.f55630a;
        if (c18178fc == null) {
            return -1;
        }
        int iMin = Math.min(i2, c18178fc.f54867c - c18178fc.f54866b);
        System.arraycopy(c18178fc.f54865a, c18178fc.f54866b, bArr, i, iMin);
        int i3 = c18178fc.f54866b + iMin;
        c18178fc.f54866b = i3;
        this.f55631b -= (long) iMin;
        if (i3 == c18178fc.f54867c) {
            this.f55630a = c18178fc.m78512b();
            C18192gc.m78640a(c18178fc);
        }
        return iMin;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    public C18261lb write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C18276mc.m79202a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C18178fc c18178fcM79090e = m79090e(1);
            int iMin = Math.min(i3 - i, 8192 - c18178fcM79090e.f54867c);
            System.arraycopy(bArr, i, c18178fcM79090e.f54865a, c18178fcM79090e.f54867c, iMin);
            i += iMin;
            c18178fcM79090e.f54867c += iMin;
        }
        this.f55631b += j;
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78369a(byte b2, long j) {
        return mo78370a(b2, j, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: b */
    public C18261lb mo78265b(int i) {
        return writeShort((int) C18276mc.m79201a((short) i));
    }

    /* JADX INFO: renamed from: d */
    public final C18303ob m79088d(int i) {
        return i == 0 ? C18303ob.f55843f : new C18206hc(this, i);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78370a(byte b2, long j, long j2) {
        C18178fc c18178fc;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j4 < j3) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o(this.f55631b, "size=", " fromIndex=");
            sbOooO00o.append(j3);
            sbOooO00o.append(" toIndex=");
            sbOooO00o.append(j4);
            throw new IllegalArgumentException(sbOooO00o.toString());
        }
        long j6 = this.f55631b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (c18178fc = this.f55630a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                c18178fc = c18178fc.f54871g;
                j6 -= (long) (c18178fc.f54867c - c18178fc.f54866b);
            }
        } else {
            while (true) {
                long j7 = ((long) (c18178fc.f54867c - c18178fc.f54866b)) + j5;
                if (j7 >= j3) {
                    break;
                }
                c18178fc = c18178fc.f54870f;
                j5 = j7;
            }
            j6 = j5;
        }
        while (j6 < j4) {
            byte[] bArr = c18178fc.f54865a;
            int iMin = (int) Math.min(c18178fc.f54867c, (((long) c18178fc.f54866b) + j4) - j6);
            for (int i = (int) ((((long) c18178fc.f54866b) + j3) - j6); i < iMin; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - c18178fc.f54866b)) + j6;
                }
            }
            j6 += (long) (c18178fc.f54867c - c18178fc.f54866b);
            c18178fc = c18178fc.f54870f;
            j3 = j6;
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: b */
    public C18261lb mo78266b(long j) {
        boolean z;
        if (j == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return mo78261a("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C18178fc c18178fcM79090e = m79090e(i);
        byte[] bArr = c18178fcM79090e.f54865a;
        int i2 = c18178fcM79090e.f54867c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f55628c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = PatternStyle.DottedGrid;
        }
        c18178fcM79090e.f54867c += i;
        this.f55631b += (long) i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C18303ob m79089d(C18303ob c18303ob) {
        return m79071a("HmacSHA1", c18303ob);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: b */
    public C18261lb mo78267b(C18303ob c18303ob) {
        if (c18303ob == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c18303ob.mo78721a(this);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C18261lb m79087b(OutputStream outputStream) throws IOException {
        return m79084a(outputStream, this.f55631b);
    }

    /* JADX INFO: renamed from: e */
    public C18178fc m79090e(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C18178fc c18178fc = this.f55630a;
        if (c18178fc != null) {
            C18178fc c18178fc2 = c18178fc.f54871g;
            return (c18178fc2.f54867c + i > 8192 || !c18178fc2.f54869e) ? c18178fc2.m78509a(C18192gc.m78639a()) : c18178fc2;
        }
        C18178fc c18178fcM78639a = C18192gc.m78639a();
        this.f55630a = c18178fcM78639a;
        c18178fcM78639a.f54871g = c18178fcM78639a;
        c18178fcM78639a.f54870f = c18178fcM78639a;
        return c18178fcM78639a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: c */
    public long mo78384c(C18303ob c18303ob) {
        return mo78382b(c18303ob, 0L);
    }

    /* JADX INFO: renamed from: e */
    public final C18303ob m79091e(C18303ob c18303ob) {
        return m79071a(KeyUtil.HMAC_ALGORITHM, c18303ob);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: c */
    public C18261lb mo78268c(int i) {
        int i2;
        int i3;
        if (i < 128) {
            writeByte(i);
            return this;
        }
        if (i < 2048) {
            i3 = (i >> 6) | 192;
        } else {
            if (i < 65536) {
                if (i >= 55296 && i <= 57343) {
                    writeByte(63);
                    return this;
                }
                i2 = (i >> 12) | 224;
            } else {
                if (i > 1114111) {
                    throw new IllegalArgumentException(OooO0O0.OooO00o(i, new StringBuilder("Unexpected code point: ")));
                }
                writeByte((i >> 18) | 240);
                i2 = ((i >> 12) & 63) | 128;
            }
            writeByte(i2);
            i3 = ((i >> 6) & 63) | 128;
        }
        writeByte(i3);
        writeByte((i & 63) | 128);
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: e */
    public String mo78388e(long j) throws EOFException {
        return mo78376a(j, C18276mc.f55722a);
    }

    /* JADX INFO: renamed from: b */
    private C18303ob m79074b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            C18178fc c18178fc = this.f55630a;
            if (c18178fc != null) {
                byte[] bArr = c18178fc.f54865a;
                int i = c18178fc.f54866b;
                messageDigest.update(bArr, i, c18178fc.f54867c - i);
                C18178fc c18178fc2 = this.f55630a;
                while (true) {
                    c18178fc2 = c18178fc2.f54870f;
                    if (c18178fc2 == this.f55630a) {
                        break;
                    }
                    byte[] bArr2 = c18178fc2.f54865a;
                    int i2 = c18178fc2.f54866b;
                    messageDigest.update(bArr2, i2, c18178fc2.f54867c - i2);
                }
            }
            return C18303ob.m79300e(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78371a(InterfaceC18220ic interfaceC18220ic) throws IOException {
        long j = this.f55631b;
        if (j > 0) {
            interfaceC18220ic.mo78029b(this, j);
        }
        return j;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public long mo78257a(InterfaceC18234jc interfaceC18234jc) throws IOException {
        if (interfaceC18234jc == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long jMo77914c = interfaceC18234jc.mo77914c(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jMo77914c == -1) {
                return j;
            }
            j += jMo77914c;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic
    /* JADX INFO: renamed from: b */
    public void mo78029b(C18261lb c18261lb, long j) {
        if (c18261lb == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c18261lb == this) {
            throw new IllegalArgumentException("source == this");
        }
        C18276mc.m79202a(c18261lb.f55631b, 0L, j);
        while (j > 0) {
            C18178fc c18178fc = c18261lb.f55630a;
            if (j < c18178fc.f54867c - c18178fc.f54866b) {
                C18178fc c18178fc2 = this.f55630a;
                C18178fc c18178fc3 = c18178fc2 != null ? c18178fc2.f54871g : null;
                if (c18178fc3 != null && c18178fc3.f54869e) {
                    if ((((long) c18178fc3.f54867c) + j) - ((long) (c18178fc3.f54868d ? 0 : c18178fc3.f54866b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        c18178fc.m78511a(c18178fc3, (int) j);
                        c18261lb.f55631b -= j;
                        this.f55631b += j;
                        return;
                    }
                }
                c18261lb.f55630a = c18178fc.m78508a((int) j);
            }
            C18178fc c18178fc4 = c18261lb.f55630a;
            long j2 = c18178fc4.f54867c - c18178fc4.f54866b;
            c18261lb.f55630a = c18178fc4.m78512b();
            C18178fc c18178fc5 = this.f55630a;
            if (c18178fc5 == null) {
                this.f55630a = c18178fc4;
                c18178fc4.f54871g = c18178fc4;
                c18178fc4.f54870f = c18178fc4;
            } else {
                c18178fc5.f54871g.m78509a(c18178fc4).m78510a();
            }
            c18261lb.f55631b -= j2;
            this.f55631b += j2;
            j -= j2;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78372a(C18303ob c18303ob) throws IOException {
        return mo78373a(c18303ob, 0L);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78373a(C18303ob c18303ob, long j) throws IOException {
        C18261lb c18261lb = this;
        if (c18303ob.mo78736j() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C18178fc c18178fc = c18261lb.f55630a;
        long j3 = -1;
        if (c18178fc == null) {
            return -1L;
        }
        long j4 = c18261lb.f55631b;
        if (j4 - j < j) {
            while (j4 > j) {
                c18178fc = c18178fc.f54871g;
                j4 -= (long) (c18178fc.f54867c - c18178fc.f54866b);
            }
        } else {
            while (true) {
                long j5 = ((long) (c18178fc.f54867c - c18178fc.f54866b)) + j2;
                if (j5 >= j) {
                    break;
                }
                c18178fc = c18178fc.f54870f;
                j2 = j5;
            }
            j4 = j2;
        }
        byte bMo78716a = c18303ob.mo78716a(0);
        long j6 = j4;
        int iMo78736j = c18303ob.mo78736j();
        long j7 = (c18261lb.f55631b - ((long) iMo78736j)) + 1;
        C18178fc c18178fc2 = c18178fc;
        long j8 = j;
        while (j6 < j7) {
            byte[] bArr = c18178fc2.f54865a;
            long j9 = j3;
            int iMin = (int) Math.min(c18178fc2.f54867c, (((long) c18178fc2.f54866b) + j7) - j6);
            int i = (int) ((((long) c18178fc2.f54866b) + j8) - j6);
            while (i < iMin) {
                if (bArr[i] == bMo78716a && c18261lb.m79073a(c18178fc2, i + 1, c18303ob, 1, iMo78736j)) {
                    return ((long) (i - c18178fc2.f54866b)) + j6;
                }
                i++;
                c18261lb = this;
            }
            j6 += (long) (c18178fc2.f54867c - c18178fc2.f54866b);
            c18178fc2 = c18178fc2.f54870f;
            c18261lb = this;
            j8 = j6;
            j3 = j9;
        }
        return j3;
    }

    /* JADX INFO: renamed from: a */
    public final c m79079a(c cVar) {
        if (cVar.f55634a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        cVar.f55634a = this;
        cVar.f55635b = true;
        return cVar;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: c */
    public String mo78385c(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "limit < 0: "));
        }
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            j2 = j + 1;
        }
        long j3 = j2;
        long jMo78370a = mo78370a((byte) 10, 0L, j3);
        if (jMo78370a != -1) {
            return m79094k(jMo78370a);
        }
        if (j3 < m79076B() && m79093j(j3 - 1) == 13 && m79093j(j3) == 10) {
            return m79094k(j3);
        }
        C18261lb c18261lb = new C18261lb();
        m79080a(c18261lb, 0L, Math.min(32L, m79076B()));
        throw new EOFException("\\n not found: limit=" + Math.min(m79076B(), j) + " content=" + c18261lb.mo78401r().mo78731d() + (char) 8230);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78374a() {
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78259a(int i) {
        return writeInt(C18276mc.m79199a(i));
    }

    /* JADX INFO: renamed from: a */
    public final C18261lb m79080a(C18261lb c18261lb, long j, long j2) {
        if (c18261lb == null) {
            throw new IllegalArgumentException("out == null");
        }
        long j3 = j;
        C18276mc.m79202a(this.f55631b, j3, j2);
        if (j2 != 0) {
            c18261lb.f55631b += j2;
            C18178fc c18178fc = this.f55630a;
            while (true) {
                long j4 = c18178fc.f54867c - c18178fc.f54866b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                c18178fc = c18178fc.f54870f;
            }
            C18178fc c18178fc2 = c18178fc;
            long j5 = j2;
            while (j5 > 0) {
                C18178fc c18178fcM78513c = c18178fc2.m78513c();
                int i = (int) (((long) c18178fcM78513c.f54866b) + j3);
                c18178fcM78513c.f54866b = i;
                c18178fcM78513c.f54867c = Math.min(i + ((int) j5), c18178fcM78513c.f54867c);
                C18178fc c18178fc3 = c18261lb.f55630a;
                if (c18178fc3 == null) {
                    c18178fcM78513c.f54871g = c18178fcM78513c;
                    c18178fcM78513c.f54870f = c18178fcM78513c;
                    c18261lb.f55630a = c18178fcM78513c;
                } else {
                    c18178fc3.f54871g.m78509a(c18178fcM78513c);
                }
                j5 -= (long) (c18178fcM78513c.f54867c - c18178fcM78513c.f54866b);
                c18178fc2 = c18178fc2.f54870f;
                j3 = 0;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C18261lb m79081a(InputStream inputStream) throws IOException {
        m79072a(inputStream, LocationRequestCompat.PASSIVE_INTERVAL, true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C18261lb m79082a(InputStream inputStream, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        m79072a(inputStream, j, false);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C18261lb m79083a(OutputStream outputStream) throws IOException {
        return m79085a(outputStream, 0L, this.f55631b);
    }

    /* JADX INFO: renamed from: a */
    public final C18261lb m79084a(OutputStream outputStream, long j) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        C18276mc.m79202a(this.f55631b, 0L, j);
        C18178fc c18178fc = this.f55630a;
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, c18178fc.f54867c - c18178fc.f54866b);
            outputStream.write(c18178fc.f54865a, c18178fc.f54866b, iMin);
            int i = c18178fc.f54866b + iMin;
            c18178fc.f54866b = i;
            long j3 = iMin;
            this.f55631b -= j3;
            j2 -= j3;
            if (i == c18178fc.f54867c) {
                C18178fc c18178fcM78512b = c18178fc.m78512b();
                this.f55630a = c18178fcM78512b;
                C18192gc.m78640a(c18178fc);
                c18178fc = c18178fcM78512b;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C18261lb m79085a(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        long j3 = j;
        C18276mc.m79202a(this.f55631b, j3, j2);
        if (j2 != 0) {
            C18178fc c18178fc = this.f55630a;
            while (true) {
                long j4 = c18178fc.f54867c - c18178fc.f54866b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                c18178fc = c18178fc.f54870f;
            }
            C18178fc c18178fc2 = c18178fc;
            long j5 = j2;
            while (j5 > 0) {
                int i = (int) (((long) c18178fc2.f54866b) + j3);
                int iMin = (int) Math.min(c18178fc2.f54867c - i, j5);
                outputStream.write(c18178fc2.f54865a, i, iMin);
                j5 -= (long) iMin;
                c18178fc2 = c18178fc2.f54870f;
                j3 = 0;
            }
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78261a(String str) {
        return mo78262a(str, 0, str.length());
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78262a(String str, int i, int i2) {
        char cCharAt;
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i2, "endIndex > string.length: ", " > ");
            sbOooO0OO.append(str.length());
            throw new IllegalArgumentException(sbOooO0OO.toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C18178fc c18178fcM79090e = m79090e(1);
                byte[] bArr = c18178fcM79090e.f54865a;
                int i4 = c18178fcM79090e.f54867c - i;
                int iMin = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) cCharAt2;
                while (true) {
                    i = i5;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[i + i4] = (byte) cCharAt;
                }
                int i6 = c18178fcM79090e.f54867c;
                int i7 = (i4 + i) - i6;
                c18178fcM79090e.f54867c = i6 + i7;
                this.f55631b += (long) i7;
            } else {
                if (cCharAt2 < 2048) {
                    i3 = (cCharAt2 >> 6) | 192;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    writeByte((cCharAt2 >> '\f') | 224);
                    i3 = ((cCharAt2 >> 6) & 63) | 128;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        writeByte(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        writeByte((i9 >> 18) | 240);
                        writeByte(((i9 >> 12) & 63) | 128);
                        writeByte(((i9 >> 6) & 63) | 128);
                        writeByte((i9 & 63) | 128);
                        i += 2;
                    }
                }
                writeByte(i3);
                writeByte((cCharAt2 & '?') | 128);
                i++;
            }
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78263a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError(C21532OooOOo.OooO0OO(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i2, "endIndex > string.length: ", " > ");
            sbOooO0OO.append(str.length());
            throw new IllegalArgumentException(sbOooO0OO.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C18276mc.f55722a)) {
            return mo78262a(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return write(bytes, 0, bytes.length);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78264a(String str, Charset charset) {
        return mo78263a(str, 0, str.length(), charset);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18275mb
    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb mo78260a(InterfaceC18234jc interfaceC18234jc, long j) throws IOException {
        while (j > 0) {
            long jMo77914c = interfaceC18234jc.mo77914c(this, j);
            if (jMo77914c == -1) {
                throw new EOFException();
            }
            j -= jMo77914c;
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public C18303ob mo78375a(long j) throws EOFException {
        return new C18303ob(mo78390f(j));
    }

    /* JADX INFO: renamed from: a */
    private C18303ob m79071a(String str, C18303ob c18303ob) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c18303ob.mo78739m(), str));
            C18178fc c18178fc = this.f55630a;
            if (c18178fc != null) {
                byte[] bArr = c18178fc.f54865a;
                int i = c18178fc.f54866b;
                mac.update(bArr, i, c18178fc.f54867c - i);
                C18178fc c18178fc2 = this.f55630a;
                while (true) {
                    c18178fc2 = c18178fc2.f54870f;
                    if (c18178fc2 == this.f55630a) {
                        break;
                    }
                    byte[] bArr2 = c18178fc2.f54865a;
                    int i2 = c18178fc2.f54866b;
                    mac.update(bArr2, i2, c18178fc2.f54867c - i2);
                }
            }
            return C18303ob.m79300e(mac.doFinal());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public String mo78376a(long j, Charset charset) throws EOFException {
        C18276mc.m79202a(this.f55631b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j == 0) {
            return "";
        }
        C18178fc c18178fc = this.f55630a;
        int i = c18178fc.f54866b;
        if (((long) i) + j > c18178fc.f54867c) {
            return new String(mo78390f(j), charset);
        }
        String str = new String(c18178fc.f54865a, i, (int) j, charset);
        int i2 = (int) (((long) c18178fc.f54866b) + j);
        c18178fc.f54866b = i2;
        this.f55631b -= j;
        if (i2 == c18178fc.f54867c) {
            this.f55630a = c18178fc.m78512b();
            C18192gc.m78640a(c18178fc);
        }
        return str;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public String mo78377a(Charset charset) {
        try {
            return mo78376a(this.f55631b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public void mo78378a(C18261lb c18261lb, long j) throws EOFException {
        long j2 = this.f55631b;
        if (j2 >= j) {
            c18261lb.mo78029b(this, j);
        } else {
            c18261lb.mo78029b(this, j2);
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79072a(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            C18178fc c18178fcM79090e = m79090e(1);
            int i = inputStream.read(c18178fcM79090e.f54865a, c18178fcM79090e.f54867c, (int) Math.min(j, 8192 - c18178fcM79090e.f54867c));
            if (i == -1) {
                if (c18178fcM79090e.f54866b == c18178fcM79090e.f54867c) {
                    this.f55630a = c18178fcM79090e.m78512b();
                    C18192gc.m78640a(c18178fcM79090e);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            c18178fcM79090e.f54867c += i;
            long j2 = i;
            this.f55631b += j2;
            j -= j2;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public boolean mo78379a(long j, C18303ob c18303ob) {
        return mo78380a(j, c18303ob, 0, c18303ob.mo78736j());
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public boolean mo78380a(long j, C18303ob c18303ob, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f55631b - j < i2 || c18303ob.mo78736j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m79093j(((long) i3) + j) != c18303ob.mo78716a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m79073a(C18178fc c18178fc, int i, C18303ob c18303ob, int i2, int i3) {
        int i4 = c18178fc.f54867c;
        byte[] bArr = c18178fc.f54865a;
        while (i2 < i3) {
            if (i == i4) {
                c18178fc = c18178fc.f54870f;
                byte[] bArr2 = c18178fc.f54865a;
                bArr = bArr2;
                i = c18178fc.f54866b;
                i4 = c18178fc.f54867c;
            }
            if (bArr[i] != c18303ob.mo78716a(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
