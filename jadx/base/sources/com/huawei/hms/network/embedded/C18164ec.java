package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.concurrent.futures.OooO00o;
import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ec */
/* JADX INFO: loaded from: classes9.dex */
public final class C18164ec implements InterfaceC18289nb {

    /* JADX INFO: renamed from: a */
    public final C18261lb f54699a = new C18261lb();

    /* JADX INFO: renamed from: b */
    public final InterfaceC18234jc f54700b;

    /* JADX INFO: renamed from: c */
    public boolean f54701c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ec$a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C18164ec c18164ec = C18164ec.this;
            if (c18164ec.f54701c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c18164ec.f54699a.f55631b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C18164ec.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C18164ec c18164ec = C18164ec.this;
            if (c18164ec.f54701c) {
                throw new IOException("closed");
            }
            C18261lb c18261lb = c18164ec.f54699a;
            if (c18261lb.f55631b == 0 && c18164ec.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return C18164ec.this.f54699a.readByte() & 255;
        }

        public String toString() {
            return C18164ec.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (C18164ec.this.f54701c) {
                throw new IOException("closed");
            }
            C18276mc.m79202a(bArr.length, i, i2);
            C18164ec c18164ec = C18164ec.this;
            C18261lb c18261lb = c18164ec.f54699a;
            if (c18261lb.f55631b == 0 && c18164ec.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return C18164ec.this.f54699a.read(bArr, i, i2);
        }
    }

    public C18164ec(InterfaceC18234jc interfaceC18234jc) {
        if (interfaceC18234jc == null) {
            throw new NullPointerException("source == null");
        }
        this.f54700b = interfaceC18234jc;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public int mo78367a(C18446zb c18446zb) throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iM79078a = this.f54699a.m79078a(c18446zb, true);
            if (iM79078a == -1) {
                return -1;
            }
            if (iM79078a != -2) {
                this.f54699a.skip(c18446zb.f56866a[iM79078a].mo78736j());
                return iM79078a;
            }
        } while (this.f54700b.mo77914c(this.f54699a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: b */
    public int mo78381b() throws IOException {
        mo78393i(4L);
        return this.f54699a.mo78381b();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: c */
    public long mo78383c() throws IOException {
        mo78393i(8L);
        return this.f54699a.mo78383c();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f54701c) {
            return;
        }
        this.f54701c = true;
        this.f54700b.close();
        this.f54699a.m79095s();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: d */
    public C18261lb mo78386d() {
        return this.f54699a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: e */
    public int mo78387e() throws IOException {
        long j;
        mo78393i(1L);
        byte bM79093j = this.f54699a.m79093j(0L);
        if ((bM79093j & 224) == 192) {
            j = 2;
        } else {
            if ((bM79093j & 240) != 224) {
                if ((bM79093j & 248) == 240) {
                    j = 4;
                }
                return this.f54699a.mo78387e();
            }
            j = 3;
        }
        mo78393i(j);
        return this.f54699a.mo78387e();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: f */
    public boolean mo78389f() throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        return this.f54699a.mo78389f() && this.f54700b.mo77914c(this.f54699a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: g */
    public boolean mo78391g(long j) throws IOException {
        C18261lb c18261lb;
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        do {
            c18261lb = this.f54699a;
            if (c18261lb.f55631b >= j) {
                return true;
            }
        } while (this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: i */
    public short mo78392i() throws IOException {
        mo78393i(2L);
        return this.f54699a.mo78392i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f54701c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: j */
    public long mo78394j() throws IOException {
        byte bM79093j;
        mo78393i(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo78391g(i2)) {
                break;
            }
            bM79093j = this.f54699a.m79093j(i);
            if ((bM79093j < 48 || bM79093j > 57) && ((bM79093j < 97 || bM79093j > 102) && (bM79093j < 65 || bM79093j > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM79093j)));
        }
        return this.f54699a.mo78394j();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: k */
    public String mo78395k() throws IOException {
        long jMo78368a = mo78368a((byte) 10);
        if (jMo78368a != -1) {
            return this.f54699a.m79094k(jMo78368a);
        }
        long j = this.f54699a.f55631b;
        if (j != 0) {
            return mo78388e(j);
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: l */
    public InputStream mo78396l() {
        return new a();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: m */
    public String mo78397m() throws IOException {
        return mo78385c(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: o */
    public String mo78398o() throws IOException {
        this.f54699a.mo78257a(this.f54700b);
        return this.f54699a.mo78398o();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: p */
    public long mo78399p() throws IOException {
        byte bM79093j;
        mo78393i(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo78391g(i2)) {
                break;
            }
            bM79093j = this.f54699a.m79093j(i);
            if ((bM79093j < 48 || bM79093j > 57) && !(i == 0 && bM79093j == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bM79093j)));
        }
        return this.f54699a.mo78399p();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public InterfaceC18289nb peek() {
        return C18433yb.m80007a(new C18108ac(this));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: q */
    public byte[] mo78400q() throws IOException {
        this.f54699a.mo78257a(this.f54700b);
        return this.f54699a.mo78400q();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: r */
    public C18303ob mo78401r() throws IOException {
        this.f54699a.mo78257a(this.f54700b);
        return this.f54699a.mo78401r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C18261lb c18261lb = this.f54699a;
        if (c18261lb.f55631b == 0 && this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f54699a.read(byteBuffer);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public byte readByte() throws IOException {
        mo78393i(1L);
        return this.f54699a.readByte();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public void readFully(byte[] bArr) throws IOException {
        try {
            mo78393i(bArr.length);
            this.f54699a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C18261lb c18261lb = this.f54699a;
                long j = c18261lb.f55631b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = c18261lb.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public int readInt() throws IOException {
        mo78393i(4L);
        return this.f54699a.readInt();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public long readLong() throws IOException {
        mo78393i(8L);
        return this.f54699a.readLong();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public short readShort() throws IOException {
        mo78393i(2L);
        return this.f54699a.readShort();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public void skip(long j) throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C18261lb c18261lb = this.f54699a;
            if (c18261lb.f55631b == 0 && this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f54699a.m79076B());
            this.f54699a.skip(jMin);
            j -= jMin;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    public C18248kc timeout() {
        return this.f54700b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f54700b + ")";
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78368a(byte b) throws IOException {
        return mo78370a(b, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: b */
    public long mo78382b(C18303ob c18303ob, long j) throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jMo78382b = this.f54699a.mo78382b(c18303ob, j);
            if (jMo78382b != -1) {
                return jMo78382b;
            }
            C18261lb c18261lb = this.f54699a;
            long j2 = c18261lb.f55631b;
            if (this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) throws IOException {
        if (c18261lb == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        C18261lb c18261lb2 = this.f54699a;
        if (c18261lb2.f55631b == 0 && this.f54700b.mo77914c(c18261lb2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f54699a.mo77914c(c18261lb, Math.min(j, this.f54699a.f55631b));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: e */
    public String mo78388e(long j) throws IOException {
        mo78393i(j);
        return this.f54699a.mo78388e(j);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: f */
    public byte[] mo78390f(long j) throws IOException {
        mo78393i(j);
        return this.f54699a.mo78390f(j);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: i */
    public void mo78393i(long j) throws IOException {
        if (!mo78391g(j)) {
            throw new EOFException();
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78369a(byte b, long j) throws IOException {
        return mo78370a(b, j, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = i2;
        C18276mc.m79202a(bArr.length, i, j);
        C18261lb c18261lb = this.f54699a;
        if (c18261lb.f55631b == 0 && this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f54699a.read(bArr, i, (int) Math.min(j, this.f54699a.f55631b));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78370a(byte b, long j, long j2) throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "fromIndex=", " toIndex=");
            sbOooO00o.append(j2);
            throw new IllegalArgumentException(sbOooO00o.toString());
        }
        long jMax = j;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jMo78370a = this.f54699a.mo78370a(b2, jMax, j3);
            if (jMo78370a != -1) {
                return jMo78370a;
            }
            C18261lb c18261lb = this.f54699a;
            long j4 = c18261lb.f55631b;
            if (j4 >= j3 || this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: c */
    public long mo78384c(C18303ob c18303ob) throws IOException {
        return mo78382b(c18303ob, 0L);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: c */
    public String mo78385c(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "limit < 0: "));
        }
        long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        long jMo78370a = mo78370a((byte) 10, 0L, j2);
        if (jMo78370a != -1) {
            return this.f54699a.m79094k(jMo78370a);
        }
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && mo78391g(j2) && this.f54699a.m79093j(j2 - 1) == 13 && mo78391g(j2 + 1) && this.f54699a.m79093j(j2) == 10) {
            return this.f54699a.m79094k(j2);
        }
        C18261lb c18261lb = new C18261lb();
        C18261lb c18261lb2 = this.f54699a;
        c18261lb2.m79080a(c18261lb, 0L, Math.min(32L, c18261lb2.m79076B()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f54699a.m79076B(), j) + " content=" + c18261lb.mo78401r().mo78731d() + (char) 8230);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78371a(InterfaceC18220ic interfaceC18220ic) throws IOException {
        if (interfaceC18220ic == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.f54700b.mo77914c(this.f54699a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jM79096t = this.f54699a.m79096t();
            if (jM79096t > 0) {
                j += jM79096t;
                interfaceC18220ic.mo78029b(this.f54699a, jM79096t);
            }
        }
        if (this.f54699a.m79076B() <= 0) {
            return j;
        }
        long jM79076B = this.f54699a.m79076B() + j;
        C18261lb c18261lb = this.f54699a;
        interfaceC18220ic.mo78029b(c18261lb, c18261lb.m79076B());
        return jM79076B;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78372a(C18303ob c18303ob) throws IOException {
        return mo78373a(c18303ob, 0L);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public long mo78373a(C18303ob c18303ob, long j) throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jMo78373a = this.f54699a.mo78373a(c18303ob, j);
            if (jMo78373a != -1) {
                return jMo78373a;
            }
            C18261lb c18261lb = this.f54699a;
            long j2 = c18261lb.f55631b;
            if (this.f54700b.mo77914c(c18261lb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - ((long) c18303ob.mo78736j())) + 1);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public C18261lb mo78374a() {
        return this.f54699a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public C18303ob mo78375a(long j) throws IOException {
        mo78393i(j);
        return this.f54699a.mo78375a(j);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public String mo78376a(long j, Charset charset) throws IOException {
        mo78393i(j);
        if (charset != null) {
            return this.f54699a.mo78376a(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public String mo78377a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f54699a.mo78257a(this.f54700b);
        return this.f54699a.mo78377a(charset);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public void mo78378a(C18261lb c18261lb, long j) throws IOException {
        try {
            mo78393i(j);
            this.f54699a.mo78378a(c18261lb, j);
        } catch (EOFException e) {
            c18261lb.mo78257a((InterfaceC18234jc) this.f54699a);
            throw e;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public boolean mo78379a(long j, C18303ob c18303ob) throws IOException {
        return mo78380a(j, c18303ob, 0, c18303ob.mo78736j());
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18289nb
    /* JADX INFO: renamed from: a */
    public boolean mo78380a(long j, C18303ob c18303ob, int i, int i2) throws IOException {
        if (this.f54701c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || c18303ob.mo78736j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!mo78391g(1 + j2) || this.f54699a.m79093j(j2) != c18303ob.mo78716a(i + i3)) {
                return false;
            }
        }
        return true;
    }
}
