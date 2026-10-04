package oOo00OoO;

import Oooo0.C20855OooooOO;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.PatternStyle;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import o00oO0O.o0OoOo0;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import ooOOoOOO.C35146OooO00o;
import ooOOoOOO.C35147OooO0O0;

/* JADX INFO: renamed from: oOo00OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34524OooO0Oo implements InterfaceC34525OooO0o, InterfaceC34526OooO0o0, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f123723OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34543OooOo0o f123724OooOo0o;

    /* JADX INFO: renamed from: oOo00OoO.OooO0Oo$OooO00o */
    public static final class OooO00o implements Closeable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f123725OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C34524OooO0Oo f123726OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C34543OooOo0o f123728OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public byte[] f123729OooOoOO;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f123727OooOoO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f123731OooOoo0 = -1;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f123730OooOoo = -1;

        public final void OooO00o(long j) {
            C34524OooO0Oo c34524OooO0Oo = this.f123726OooOo0o;
            if (c34524OooO0Oo == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f123725OooOo) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = c34524OooO0Oo.f123723OooOo;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    C34543OooOo0o c34543OooOo0o = c34524OooO0Oo.f123724OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                    C34543OooOo0o c34543OooOo0o2 = c34543OooOo0o.f123786OooO0oO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
                    int i = c34543OooOo0o2.f123782OooO0OO;
                    long j4 = i - c34543OooOo0o2.f123781OooO0O0;
                    if (j4 > j3) {
                        c34543OooOo0o2.f123782OooO0OO = i - ((int) j3);
                        break;
                    } else {
                        c34524OooO0Oo.f123724OooOo0o = c34543OooOo0o2.OooO00o();
                        C34539OooOo.OooO00o(c34543OooOo0o2);
                        j3 -= j4;
                    }
                }
                this.f123728OooOoO0 = null;
                this.f123727OooOoO = j;
                this.f123729OooOoOO = null;
                this.f123731OooOoo0 = -1;
                this.f123730OooOoo = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    C34543OooOo0o c34543OooOo0oO0000Oo0 = c34524OooO0Oo.o0000Oo0(i2);
                    int iMin = (int) Math.min(j5, 8192 - c34543OooOo0oO0000Oo0.f123782OooO0OO);
                    int i3 = c34543OooOo0oO0000Oo0.f123782OooO0OO + iMin;
                    c34543OooOo0oO0000Oo0.f123782OooO0OO = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.f123728OooOoO0 = c34543OooOo0oO0000Oo0;
                        this.f123727OooOoO = j2;
                        this.f123729OooOoOO = c34543OooOo0oO0000Oo0.f123780OooO00o;
                        this.f123731OooOoo0 = i3 - iMin;
                        this.f123730OooOoo = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            c34524OooO0Oo.f123723OooOo = j;
        }

        public final int OooO0OO(long j) {
            C34524OooO0Oo c34524OooO0Oo = this.f123726OooOo0o;
            if (c34524OooO0Oo == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = c34524OooO0Oo.f123723OooOo;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f123728OooOoO0 = null;
                        this.f123727OooOoO = j;
                        this.f123729OooOoOO = null;
                        this.f123731OooOoo0 = -1;
                        this.f123730OooOoo = -1;
                        return -1;
                    }
                    C34543OooOo0o c34543OooOo0o = c34524OooO0Oo.f123724OooOo0o;
                    C34543OooOo0o c34543OooOo0o2 = this.f123728OooOoO0;
                    long j3 = 0;
                    if (c34543OooOo0o2 != null) {
                        long j4 = this.f123727OooOoO - ((long) (this.f123731OooOoo0 - c34543OooOo0o2.f123781OooO0O0));
                        if (j4 > j) {
                            c34543OooOo0o2 = c34543OooOo0o;
                            c34543OooOo0o = c34543OooOo0o2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        c34543OooOo0o2 = c34543OooOo0o;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
                            long j5 = ((long) (c34543OooOo0o2.f123782OooO0OO - c34543OooOo0o2.f123781OooO0O0)) + j3;
                            if (j < j5) {
                                break;
                            }
                            c34543OooOo0o2 = c34543OooOo0o2.f123784OooO0o;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                            c34543OooOo0o = c34543OooOo0o.f123786OooO0oO;
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                            j2 -= (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
                        }
                        c34543OooOo0o2 = c34543OooOo0o;
                        j3 = j2;
                    }
                    if (this.f123725OooOo) {
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
                        if (c34543OooOo0o2.f123783OooO0Oo) {
                            byte[] bArr = c34543OooOo0o2.f123780OooO00o;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, size)");
                            C34543OooOo0o c34543OooOo0o3 = new C34543OooOo0o(bArrCopyOf, c34543OooOo0o2.f123781OooO0O0, c34543OooOo0o2.f123782OooO0OO, false, true);
                            if (c34524OooO0Oo.f123724OooOo0o == c34543OooOo0o2) {
                                c34524OooO0Oo.f123724OooOo0o = c34543OooOo0o3;
                            }
                            c34543OooOo0o2.OooO0O0(c34543OooOo0o3);
                            C34543OooOo0o c34543OooOo0o4 = c34543OooOo0o3.f123786OooO0oO;
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o4);
                            c34543OooOo0o4.OooO00o();
                            c34543OooOo0o2 = c34543OooOo0o3;
                        }
                    }
                    this.f123728OooOoO0 = c34543OooOo0o2;
                    this.f123727OooOoO = j;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
                    this.f123729OooOoOO = c34543OooOo0o2.f123780OooO00o;
                    int i = c34543OooOo0o2.f123781OooO0O0 + ((int) (j - j3));
                    this.f123731OooOoo0 = i;
                    int i2 = c34543OooOo0o2.f123782OooO0OO;
                    this.f123730OooOoo = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "offset=", " > size=");
            sbOooO00o.append(c34524OooO0Oo.f123723OooOo);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f123726OooOo0o == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f123726OooOo0o = null;
            this.f123728OooOoO0 = null;
            this.f123727OooOoO = -1L;
            this.f123729OooOoOO = null;
            this.f123731OooOoo0 = -1;
            this.f123730OooOoo = -1;
        }
    }

    /* JADX INFO: renamed from: oOo00OoO.OooO0Oo$OooO0OO */
    public static final class OooO0OO extends OutputStream {
        public OooO0OO() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return C34524OooO0Oo.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            C34524OooO0Oo.this.o0OoO0o(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] data, int i, int i2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
            C34524OooO0Oo.this.o000O00O(data, i, i2);
        }
    }

    public final void OooO00o() throws EOFException {
        skip(this.f123723OooOo);
    }

    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final C34524OooO0Oo clone() {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        if (this.f123723OooOo == 0) {
            return c34524OooO0Oo;
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        C34543OooOo0o c34543OooOo0oOooO0OO = c34543OooOo0o.OooO0OO();
        c34524OooO0Oo.f123724OooOo0o = c34543OooOo0oOooO0OO;
        c34543OooOo0oOooO0OO.f123786OooO0oO = c34543OooOo0oOooO0OO;
        c34543OooOo0oOooO0OO.f123784OooO0o = c34543OooOo0oOooO0OO;
        for (C34543OooOo0o c34543OooOo0o2 = c34543OooOo0o.f123784OooO0o; c34543OooOo0o2 != c34543OooOo0o; c34543OooOo0o2 = c34543OooOo0o2.f123784OooO0o) {
            C34543OooOo0o c34543OooOo0o3 = c34543OooOo0oOooO0OO.f123786OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o3);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
            c34543OooOo0o3.OooO0O0(c34543OooOo0o2.OooO0OO());
        }
        c34524OooO0Oo.f123723OooOo = this.f123723OooOo;
        return c34524OooO0Oo;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o, oOo00OoO.InterfaceC34526OooO0o0
    public final C34524OooO0Oo OooOO0() {
        return this;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o, oOo00OoO.InterfaceC34526OooO0o0
    public final C34524OooO0Oo OooOO0O() {
        return this;
    }

    public final long OooOOO0() {
        long j = this.f123723OooOo;
        if (j == 0) {
            return 0L;
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        C34543OooOo0o c34543OooOo0o2 = c34543OooOo0o.f123786OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
        int i = c34543OooOo0o2.f123782OooO0OO;
        return (i >= 8192 || !c34543OooOo0o2.f123785OooO0o0) ? j : j - ((long) (i - c34543OooOo0o2.f123781OooO0O0));
    }

    public final void OooOOoo(C34524OooO0Oo out, long j, long j2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(out, "out");
        long j3 = j;
        C34522OooO0O0.OooO0O0(this.f123723OooOo, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.f123723OooOo += j2;
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        while (true) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            long j4 = c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
        }
        C34543OooOo0o c34543OooOo0o2 = c34543OooOo0o;
        long j5 = j2;
        while (j5 > 0) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
            C34543OooOo0o c34543OooOo0oOooO0OO = c34543OooOo0o2.OooO0OO();
            int i = c34543OooOo0oOooO0OO.f123781OooO0O0 + ((int) j3);
            c34543OooOo0oOooO0OO.f123781OooO0O0 = i;
            c34543OooOo0oOooO0OO.f123782OooO0OO = Math.min(i + ((int) j5), c34543OooOo0oOooO0OO.f123782OooO0OO);
            C34543OooOo0o c34543OooOo0o3 = out.f123724OooOo0o;
            if (c34543OooOo0o3 == null) {
                c34543OooOo0oOooO0OO.f123786OooO0oO = c34543OooOo0oOooO0OO;
                c34543OooOo0oOooO0OO.f123784OooO0o = c34543OooOo0oOooO0OO;
                out.f123724OooOo0o = c34543OooOo0oOooO0OO;
            } else {
                C34543OooOo0o c34543OooOo0o4 = c34543OooOo0o3.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o4);
                c34543OooOo0o4.OooO0O0(c34543OooOo0oOooO0OO);
            }
            j5 -= (long) (c34543OooOo0oOooO0OO.f123782OooO0OO - c34543OooOo0oOooO0OO.f123781OooO0O0);
            c34543OooOo0o2 = c34543OooOo0o2.f123784OooO0o;
            j3 = 0;
        }
    }

    public final byte OooOooo(long j) {
        C34522OooO0O0.OooO0O0(this.f123723OooOo, j, 1L);
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        if (c34543OooOo0o == null) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(null);
            throw null;
        }
        long j2 = this.f123723OooOo;
        if (j2 - j < j) {
            while (j2 > j) {
                c34543OooOo0o = c34543OooOo0o.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                j2 -= (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            }
            return c34543OooOo0o.f123780OooO00o[(int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c34543OooOo0o.f123782OooO0OO;
            int i2 = c34543OooOo0o.f123781OooO0O0;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c34543OooOo0o.f123780OooO00o[(int) ((((long) i2) + j) - j3)];
            }
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            j3 = j4;
        }
    }

    public final long Oooo000(byte b, long j, long j2) {
        C34543OooOo0o c34543OooOo0o;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.f123723OooOo);
            C22205OooOOo.OooO0OO(j, " fromIndex=", " toIndex=", sb);
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.f123723OooOo;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c34543OooOo0o = this.f123724OooOo0o) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c34543OooOo0o = c34543OooOo0o.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                j4 -= (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            }
            while (j4 < j2) {
                int iMin = (int) Math.min(c34543OooOo0o.f123782OooO0OO, (((long) c34543OooOo0o.f123781OooO0O0) + j2) - j4);
                for (int i = (int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j4); i < iMin; i++) {
                    if (c34543OooOo0o.f123780OooO00o[i] == b) {
                        return ((long) (i - c34543OooOo0o.f123781OooO0O0)) + j4;
                    }
                }
                j4 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
                c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0)) + j3;
            if (j5 > j) {
                break;
            }
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            j3 = j5;
        }
        while (j3 < j2) {
            int iMin2 = (int) Math.min(c34543OooOo0o.f123782OooO0OO, (((long) c34543OooOo0o.f123781OooO0O0) + j2) - j3);
            for (int i2 = (int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j3); i2 < iMin2; i2++) {
                if (c34543OooOo0o.f123780OooO00o[i2] == b) {
                    return ((long) (i2 - c34543OooOo0o.f123781OooO0O0)) + j3;
                }
            }
            j3 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            j = j3;
        }
        return -1L;
    }

    public final long Oooo00o(C34527OooO0oO targetBytes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetBytes, "targetBytes");
        return ooOO(targetBytes, 0L);
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 Oooo0O0(C34527OooO0oO c34527OooO0oO) {
        o0000o0(c34527OooO0oO);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 Oooo0oo(long j) {
        o000OO0o(j);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final C34527OooO0oO OoooO0O(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount: ").toString());
        }
        if (this.f123723OooOo < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C34527OooO0oO(o0000oo(j));
        }
        C34527OooO0oO c34527OooO0oOO0000O = o0000O((int) j);
        skip(j);
        return c34527OooO0oOO0000O;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final String OooooOo(Charset charset) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
        return o0Oo0oo(this.f123723OooOo, charset);
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 Oooooo(long j) {
        o000OOO(j);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final C34527OooO0oO OoooooO() {
        return OoooO0O(this.f123723OooOo);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, oOo00OoO.InterfaceC34544OooOoO
    public final void close() {
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        boolean z2 = false;
        if (!(obj instanceof C34524OooO0Oo)) {
            return false;
        }
        long j = this.f123723OooOo;
        C34524OooO0Oo c34524OooO0Oo = (C34524OooO0Oo) obj;
        if (j != c34524OooO0Oo.f123723OooOo) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        C34543OooOo0o c34543OooOo0o2 = c34524OooO0Oo.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
        int i = c34543OooOo0o.f123781OooO0O0;
        int i2 = c34543OooOo0o2.f123781OooO0O0;
        long j2 = 0;
        while (j2 < this.f123723OooOo) {
            long jMin = Math.min(c34543OooOo0o.f123782OooO0OO - i, c34543OooOo0o2.f123782OooO0OO - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                boolean z3 = z;
                byte b = c34543OooOo0o.f123780OooO00o[i];
                int i4 = i2 + 1;
                boolean z4 = z2;
                if (b != c34543OooOo0o2.f123780OooO00o[i2]) {
                    return z4;
                }
                j3++;
                i2 = i4;
                i = i3;
                z = z3;
                z2 = z4;
            }
            boolean z5 = z;
            boolean z6 = z2;
            if (i == c34543OooOo0o.f123782OooO0OO) {
                C34543OooOo0o c34543OooOo0o3 = c34543OooOo0o.f123784OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o3);
                i = c34543OooOo0o3.f123781OooO0O0;
                c34543OooOo0o = c34543OooOo0o3;
            }
            if (i2 == c34543OooOo0o2.f123782OooO0OO) {
                c34543OooOo0o2 = c34543OooOo0o2.f123784OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
                i2 = c34543OooOo0o2.f123781OooO0O0;
            }
            j2 += jMin;
            z = z5;
            z2 = z6;
        }
        return z;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0, oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        if (c34543OooOo0o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c34543OooOo0o.f123782OooO0OO;
            for (int i3 = c34543OooOo0o.f123781OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + c34543OooOo0o.f123780OooO00o[i3];
            }
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        } while (c34543OooOo0o != this.f123724OooOo0o);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final InterfaceC34526OooO0o0 o000000() {
        return this;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final String o000000o(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "limit < 0: ").toString());
        }
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            j2 = j + 1;
        }
        long j3 = j2;
        long jOooo000 = Oooo000((byte) 10, 0L, j3);
        if (jOooo000 != -1) {
            return C35146OooO00o.OooO00o(this, jOooo000);
        }
        if (j3 < this.f123723OooOo && OooOooo(j3 - 1) == 13 && OooOooo(j3) == 10) {
            return C35146OooO00o.OooO00o(this, j3);
        }
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        OooOOoo(c34524OooO0Oo, 0L, Math.min(32, this.f123723OooOo));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f123723OooOo, j) + " content=" + c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo).OooO0Oo() + (char) 8230);
    }

    public final String o00000OO() {
        return o0Oo0oo(this.f123723OooOo, C33580OooO00o.f121231OooO0O0);
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 o00000Oo(String str) {
        o000Oo0o(str);
        return this;
    }

    public final int o00000oO() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f123723OooOo == 0) {
            throw new EOFException();
        }
        byte bOooOooo = OooOooo(0L);
        if ((bOooOooo & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i = bOooOooo & Ascii.DEL;
            i3 = 0;
            i2 = 1;
        } else if ((bOooOooo & 224) == 192) {
            i = bOooOooo & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bOooOooo & 240) == 224) {
            i = bOooOooo & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bOooOooo & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bOooOooo & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f123723OooOo < j) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i2, "size < ", ": ");
            sbOooO0OO.append(this.f123723OooOo);
            sbOooO0OO.append(" (to read code point prefixed 0x");
            sbOooO0OO.append(C34522OooO0O0.OooO0Oo(bOooOooo));
            sbOooO0OO.append(')');
            throw new EOFException(sbOooO0OO.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bOooOooo2 = OooOooo(j2);
            if ((bOooOooo2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bOooOooo2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final String o00000oo() throws EOFException {
        return o000000o(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    public final C34527OooO0oO o0000O(int i) {
        if (i == 0) {
            return C34527OooO0oO.f123734OooOoO;
        }
        C34522OooO0O0.OooO0O0(this.f123723OooOo, 0L, i);
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            int i5 = c34543OooOo0o.f123782OooO0OO;
            int i6 = c34543OooOo0o.f123781OooO0O0;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C34543OooOo0o c34543OooOo0o2 = this.f123724OooOo0o;
        int i7 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
            bArr[i7] = c34543OooOo0o2.f123780OooO00o;
            i2 += c34543OooOo0o2.f123782OooO0OO - c34543OooOo0o2.f123781OooO0O0;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c34543OooOo0o2.f123781OooO0O0;
            c34543OooOo0o2.f123783OooO0Oo = true;
            i7++;
            c34543OooOo0o2 = c34543OooOo0o2.f123784OooO0o;
        }
        return new C34545OooOoO0(bArr, iArr);
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final long o0000O00(InterfaceC34548OooOoo0 source) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final void o0000OOO(long j) throws EOFException {
        if (this.f123723OooOo < j) {
            throw new EOFException();
        }
    }

    public final C34543OooOo0o o0000Oo0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        if (c34543OooOo0o == null) {
            C34543OooOo0o c34543OooOo0oOooO0O0 = C34539OooOo.OooO0O0();
            this.f123724OooOo0o = c34543OooOo0oOooO0O0;
            c34543OooOo0oOooO0O0.f123786OooO0oO = c34543OooOo0oOooO0O0;
            c34543OooOo0oOooO0O0.f123784OooO0o = c34543OooOo0oOooO0O0;
            return c34543OooOo0oOooO0O0;
        }
        C34543OooOo0o c34543OooOo0o2 = c34543OooOo0o.f123786OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
        if (c34543OooOo0o2.f123782OooO0OO + i <= 8192 && c34543OooOo0o2.f123785OooO0o0) {
            return c34543OooOo0o2;
        }
        C34543OooOo0o c34543OooOo0oOooO0O02 = C34539OooOo.OooO0O0();
        c34543OooOo0o2.OooO0O0(c34543OooOo0oOooO0O02);
        return c34543OooOo0oOooO0O02;
    }

    public final void o0000o0(C34527OooO0oO byteString) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(byteString, "byteString");
        byteString.OooOOO(this, byteString.OooO0OO());
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final boolean o0000o0O() {
        return this.f123723OooOo == 0;
    }

    public final C34527OooO0oO o0000oO() {
        long j = this.f123723OooOo;
        if (j <= 2147483647L) {
            return o0000O((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f123723OooOo).toString());
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final byte[] o0000oo(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount: ").toString());
        }
        if (this.f123723OooOo < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final void o0000ooO(byte[] source) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        o000O00O(source, 0, source.length);
    }

    public final void o000O00O(byte[] source, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        long j = i2;
        C34522OooO0O0.OooO0O0(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(1);
            int iMin = Math.min(i3 - i, 8192 - c34543OooOo0oO0000Oo0.f123782OooO0OO);
            int i4 = i + iMin;
            Oooo.OooO0OO.OooO0o0(c34543OooOo0oO0000Oo0.f123782OooO0OO, i, i4, source, c34543OooOo0oO0000Oo0.f123780OooO00o);
            c34543OooOo0oO0000Oo0.f123782OooO0OO += iMin;
            i = i4;
        }
        this.f123723OooOo += j;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 o000O0o0(int i, int i2, byte[] bArr) {
        o000O00O(bArr, i, i2);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final OutputStream o000O0oo() {
        return new OooO0OO();
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final InputStream o000OO00() {
        return new OooO0O0();
    }

    public final void o000OO0o(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            o0OoO0o(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                o000Oo0o("-9223372036854775808");
                return;
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
        C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(i);
        int i2 = c34543OooOo0oO0000Oo0.f123782OooO0OO + i;
        while (true) {
            bArr = c34543OooOo0oO0000Oo0.f123780OooO00o;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = C35146OooO00o.f126202OooO00o[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = PatternStyle.DottedGrid;
        }
        c34543OooOo0oO0000Oo0.f123782OooO0OO += i;
        this.f123723OooOo += (long) i;
    }

    public final void o000OOO(long j) {
        if (j == 0) {
            o0OoO0o(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(i);
        int i2 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            c34543OooOo0oO0000Oo0.f123780OooO00o[i3] = C35146OooO00o.f126202OooO00o[(int) (15 & j)];
            j >>>= 4;
        }
        c34543OooOo0oO0000Oo0.f123782OooO0OO += i;
        this.f123723OooOo += (long) i;
    }

    public final void o000OOo0(int i) {
        C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(4);
        int i2 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
        byte[] bArr = c34543OooOo0oO0000Oo0.f123780OooO00o;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c34543OooOo0oO0000Oo0.f123782OooO0OO = i2 + 4;
        this.f123723OooOo += 4;
    }

    public final void o000OOoO(int i) {
        C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(2);
        int i2 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
        byte[] bArr = c34543OooOo0oO0000Oo0.f123780OooO00o;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c34543OooOo0oO0000Oo0.f123782OooO0OO = i2 + 2;
        this.f123723OooOo += 2;
    }

    public final void o000Oo(int i) {
        String strOooOOOO;
        int i2 = 0;
        if (i < 128) {
            o0OoO0o(i);
            return;
        }
        if (i < 2048) {
            C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(2);
            int i3 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
            byte[] bArr = c34543OooOo0oO0000Oo0.f123780OooO00o;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            c34543OooOo0oO0000Oo0.f123782OooO0OO = i3 + 2;
            this.f123723OooOo += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            o0OoO0o(63);
            return;
        }
        if (i < 65536) {
            C34543OooOo0o c34543OooOo0oO0000Oo02 = o0000Oo0(3);
            int i4 = c34543OooOo0oO0000Oo02.f123782OooO0OO;
            byte[] bArr2 = c34543OooOo0oO0000Oo02.f123780OooO00o;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            c34543OooOo0oO0000Oo02.f123782OooO0OO = i4 + 3;
            this.f123723OooOo += 3;
            return;
        }
        if (i <= 1114111) {
            C34543OooOo0o c34543OooOo0oO0000Oo03 = o0000Oo0(4);
            int i5 = c34543OooOo0oO0000Oo03.f123782OooO0OO;
            byte[] bArr3 = c34543OooOo0oO0000Oo03.f123780OooO00o;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            c34543OooOo0oO0000Oo03.f123782OooO0OO = i5 + 4;
            this.f123723OooOo += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        OooO00o oooO00o = C34522OooO0O0.f123717OooO00o;
        if (i != 0) {
            char[] cArr = C35147OooO0O0.f126203OooO00o;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            strOooOOOO = C33595OooOOo.OooOOOO(cArr2, i2, 8);
        } else {
            strOooOOOO = "0";
        }
        sb.append(strOooOOOO);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void o000Oo00(String string, int i, int i2, Charset charset) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i2, "endIndex > string.length: ", " > ");
            sbOooO0OO.append(string.length());
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
        if (charset.equals(C33580OooO00o.f121231OooO0O0)) {
            o000Oo0O(i, i2, string);
            return;
        }
        String strSubstring = string.substring(i, i2);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
        o000O00O(bytes, 0, bytes.length);
    }

    public final void o000Oo0O(int i, int i2, String string) {
        char cCharAt;
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i2, "endIndex > string.length: ", " > ");
            sbOooO0OO.append(string.length());
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(1);
                int i3 = c34543OooOo0oO0000Oo0.f123782OooO0OO - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = c34543OooOo0oO0000Oo0.f123780OooO00o;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
                int i6 = (i3 + i) - i5;
                c34543OooOo0oO0000Oo0.f123782OooO0OO = i5 + i6;
                this.f123723OooOo += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    C34543OooOo0o c34543OooOo0oO0000Oo02 = o0000Oo0(2);
                    int i7 = c34543OooOo0oO0000Oo02.f123782OooO0OO;
                    byte[] bArr2 = c34543OooOo0oO0000Oo02.f123780OooO00o;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c34543OooOo0oO0000Oo02.f123782OooO0OO = i7 + 2;
                    this.f123723OooOo += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C34543OooOo0o c34543OooOo0oO0000Oo03 = o0000Oo0(3);
                    int i8 = c34543OooOo0oO0000Oo03.f123782OooO0OO;
                    byte[] bArr3 = c34543OooOo0oO0000Oo03.f123780OooO00o;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c34543OooOo0oO0000Oo03.f123782OooO0OO = i8 + 3;
                    this.f123723OooOo += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        o0OoO0o(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C34543OooOo0o c34543OooOo0oO0000Oo04 = o0000Oo0(4);
                        int i11 = c34543OooOo0oO0000Oo04.f123782OooO0OO;
                        byte[] bArr4 = c34543OooOo0oO0000Oo04.f123780OooO00o;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c34543OooOo0oO0000Oo04.f123782OooO0OO = i11 + 4;
                        this.f123723OooOo += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void o000Oo0o(String string) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
        o000Oo0O(0, string.length(), string);
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final byte[] o000oOoO() {
        return o0000oo(this.f123723OooOo);
    }

    public final OooO00o o00Oo0(OooO00o unsafeCursor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(unsafeCursor, "unsafeCursor");
        byte[] bArr = C35146OooO00o.f126202OooO00o;
        if (unsafeCursor == C34522OooO0O0.f123717OooO00o) {
            unsafeCursor = new OooO00o();
        }
        if (unsafeCursor.f123726OooOo0o != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f123726OooOo0o = this;
        unsafeCursor.f123725OooOo = true;
        return unsafeCursor;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // oOo00OoO.InterfaceC34525OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o00oO0O() throws EOFException {
        int i;
        if (this.f123723OooOo == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            int i3 = c34543OooOo0o.f123781OooO0O0;
            int i4 = c34543OooOo0o.f123782OooO0OO;
            while (i3 < i4) {
                byte b = c34543OooOo0o.f123780OooO00o[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(C34522OooO0O0.OooO0Oo(b)));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.f123724OooOo0o = c34543OooOo0o.OooO00o();
                        C34539OooOo.OooO00o(c34543OooOo0o);
                    } else {
                        c34543OooOo0o.f123781OooO0O0 = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                    c34524OooO0Oo.o000OOO(j);
                    c34524OooO0Oo.o0OoO0o(b);
                    throw new NumberFormatException("Number too large: ".concat(c34524OooO0Oo.o00000OO()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f123724OooOo0o != null);
        this.f123723OooOo -= (long) i2;
        return j;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final long o0O0O00(C34524OooO0Oo c34524OooO0Oo) throws IOException {
        long j = this.f123723OooOo;
        if (j > 0) {
            c34524OooO0Oo.write(this, j);
        }
        return j;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final int o0OOO0o(C34536OooOOo options) throws EOFException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(options, "options");
        int iOooO0O0 = C35146OooO00o.OooO0O0(this, options, false);
        if (iOooO0O0 == -1) {
            return -1;
        }
        skip(options.f123759OooOo0o[iOooO0O0].OooO0OO());
        return iOooO0O0;
    }

    public final String o0Oo0oo(long j, Charset charset) throws EOFException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount: ").toString());
        }
        if (this.f123723OooOo < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        int i = c34543OooOo0o.f123781OooO0O0;
        if (((long) i) + j > c34543OooOo0o.f123782OooO0OO) {
            return new String(o0000oo(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c34543OooOo0o.f123780OooO00o, i, i2, charset);
        int i3 = c34543OooOo0o.f123781OooO0O0 + i2;
        c34543OooOo0o.f123781OooO0O0 = i3;
        this.f123723OooOo -= j;
        if (i3 == c34543OooOo0o.f123782OooO0OO) {
            this.f123724OooOo0o = c34543OooOo0o.OooO00o();
            C34539OooOo.OooO00o(c34543OooOo0o);
        }
        return str;
    }

    public final void o0OoO0o(int i) {
        C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(1);
        int i2 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
        c34543OooOo0oO0000Oo0.f123782OooO0OO = i2 + 1;
        c34543OooOo0oO0000Oo0.f123780OooO00o[i2] = (byte) i;
        this.f123723OooOo++;
    }

    public final long ooOO(C34527OooO0oO targetBytes, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "fromIndex < 0: ").toString());
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        if (c34543OooOo0o == null) {
            return -1L;
        }
        long j3 = this.f123723OooOo;
        if (j3 - j < j) {
            while (j3 > j) {
                c34543OooOo0o = c34543OooOo0o.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                j3 -= (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            }
            byte[] bArr = targetBytes.f123736OooOo0o;
            if (bArr.length == 2) {
                byte b = bArr[0];
                byte b2 = bArr[1];
                while (j3 < this.f123723OooOo) {
                    int i = c34543OooOo0o.f123782OooO0OO;
                    for (int i2 = (int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j3); i2 < i; i2++) {
                        byte b3 = c34543OooOo0o.f123780OooO00o[i2];
                        if (b3 == b || b3 == b2) {
                            return ((long) (i2 - c34543OooOo0o.f123781OooO0O0)) + j3;
                        }
                    }
                    j3 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
                    c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                    j = j3;
                }
                return -1L;
            }
            while (j3 < this.f123723OooOo) {
                int i3 = c34543OooOo0o.f123782OooO0OO;
                for (int i4 = (int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j3); i4 < i3; i4++) {
                    byte b4 = c34543OooOo0o.f123780OooO00o[i4];
                    for (byte b5 : bArr) {
                        if (b4 == b5) {
                            return ((long) (i4 - c34543OooOo0o.f123781OooO0O0)) + j3;
                        }
                    }
                }
                j3 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
                c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0)) + j2;
            if (j4 > j) {
                break;
            }
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            j2 = j4;
        }
        byte[] bArr2 = targetBytes.f123736OooOo0o;
        if (bArr2.length == 2) {
            byte b6 = bArr2[0];
            byte b7 = bArr2[1];
            while (j2 < this.f123723OooOo) {
                int i5 = c34543OooOo0o.f123782OooO0OO;
                for (int i6 = (int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j2); i6 < i5; i6++) {
                    byte b8 = c34543OooOo0o.f123780OooO00o[i6];
                    if (b8 == b6 || b8 == b7) {
                        return ((long) (i6 - c34543OooOo0o.f123781OooO0O0)) + j2;
                    }
                }
                j2 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
                c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
                j = j2;
            }
            return -1L;
        }
        while (j2 < this.f123723OooOo) {
            int i7 = c34543OooOo0o.f123782OooO0OO;
            for (int i8 = (int) ((((long) c34543OooOo0o.f123781OooO0O0) + j) - j2); i8 < i7; i8++) {
                byte b9 = c34543OooOo0o.f123780OooO00o[i8];
                for (byte b10 : bArr2) {
                    if (b9 == b10) {
                        return ((long) (i8 - c34543OooOo0o.f123781OooO0O0)) + j2;
                    }
                }
            }
            j2 += (long) (c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            j = j2;
        }
        return -1L;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final C34542OooOo0O peek() {
        return C34535OooOOOo.OooO0O0(new C34541OooOo00(this));
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final long read(C34524OooO0Oo sink, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f123723OooOo;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.write(this, j);
        return j;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final byte readByte() throws EOFException {
        if (this.f123723OooOo == 0) {
            throw new EOFException();
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        int i = c34543OooOo0o.f123781OooO0O0;
        int i2 = c34543OooOo0o.f123782OooO0OO;
        int i3 = i + 1;
        byte b = c34543OooOo0o.f123780OooO00o[i];
        this.f123723OooOo--;
        if (i3 != i2) {
            c34543OooOo0o.f123781OooO0O0 = i3;
            return b;
        }
        this.f123724OooOo0o = c34543OooOo0o.OooO00o();
        C34539OooOo.OooO00o(c34543OooOo0o);
        return b;
    }

    public final void readFully(byte[] sink) throws EOFException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final int readInt() throws EOFException {
        if (this.f123723OooOo < 4) {
            throw new EOFException();
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        int i = c34543OooOo0o.f123781OooO0O0;
        int i2 = c34543OooOo0o.f123782OooO0OO;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c34543OooOo0o.f123780OooO00o;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f123723OooOo -= 4;
        if (i5 != i2) {
            c34543OooOo0o.f123781OooO0O0 = i5;
            return i6;
        }
        this.f123724OooOo0o = c34543OooOo0o.OooO00o();
        C34539OooOo.OooO00o(c34543OooOo0o);
        return i6;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final short readShort() throws EOFException {
        if (this.f123723OooOo < 2) {
            throw new EOFException();
        }
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        int i = c34543OooOo0o.f123781OooO0O0;
        int i2 = c34543OooOo0o.f123782OooO0OO;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = c34543OooOo0o.f123780OooO00o;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f123723OooOo -= 2;
        if (i5 == i2) {
            this.f123724OooOo0o = c34543OooOo0o.OooO00o();
            C34539OooOo.OooO00o(c34543OooOo0o);
        } else {
            c34543OooOo0o.f123781OooO0O0 = i5;
        }
        return (short) i6;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final boolean request(long j) {
        return this.f123723OooOo >= j;
    }

    @Override // oOo00OoO.InterfaceC34525OooO0o
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
            if (c34543OooOo0o == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
            long j2 = iMin;
            this.f123723OooOo -= j2;
            j -= j2;
            int i = c34543OooOo0o.f123781OooO0O0 + iMin;
            c34543OooOo0o.f123781OooO0O0 = i;
            if (i == c34543OooOo0o.f123782OooO0OO) {
                this.f123724OooOo0o = c34543OooOo0o.OooO00o();
                C34539OooOo.OooO00o(c34543OooOo0o);
            }
        }
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        return C34547OooOoo.NONE;
    }

    public final String toString() {
        return o0000oO().toString();
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 write(byte[] bArr) {
        o0000ooO(bArr);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 writeByte(int i) {
        o0OoO0o(i);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 writeInt(int i) {
        o000OOo0(i);
        return this;
    }

    @Override // oOo00OoO.InterfaceC34526OooO0o0
    public final /* bridge */ /* synthetic */ InterfaceC34526OooO0o0 writeShort(int i) {
        o000OOoO(i);
        return this;
    }

    /* JADX INFO: renamed from: oOo00OoO.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends InputStream {
        public OooO0O0() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C34524OooO0Oo.this.f123723OooOo, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            C34524OooO0Oo c34524OooO0Oo = C34524OooO0Oo.this;
            if (c34524OooO0Oo.f123723OooOo > 0) {
                return c34524OooO0Oo.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return C34524OooO0Oo.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] sink, int i, int i2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
            return C34524OooO0Oo.this.read(sink, i, i2);
        }
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo source, long j) {
        C34543OooOo0o c34543OooOo0oOooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C34522OooO0O0.OooO0O0(source.f123723OooOo, 0L, j);
        while (j > 0) {
            C34543OooOo0o c34543OooOo0o = source.f123724OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            int i = c34543OooOo0o.f123782OooO0OO;
            C34543OooOo0o c34543OooOo0o2 = source.f123724OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
            long j2 = i - c34543OooOo0o2.f123781OooO0O0;
            int i2 = 0;
            if (j < j2) {
                C34543OooOo0o c34543OooOo0o3 = this.f123724OooOo0o;
                C34543OooOo0o c34543OooOo0o4 = c34543OooOo0o3 != null ? c34543OooOo0o3.f123786OooO0oO : null;
                if (c34543OooOo0o4 != null && c34543OooOo0o4.f123785OooO0o0) {
                    if ((((long) c34543OooOo0o4.f123782OooO0OO) + j) - ((long) (c34543OooOo0o4.f123783OooO0Oo ? 0 : c34543OooOo0o4.f123781OooO0O0)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        C34543OooOo0o c34543OooOo0o5 = source.f123724OooOo0o;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o5);
                        c34543OooOo0o5.OooO0Oo(c34543OooOo0o4, (int) j);
                        source.f123723OooOo -= j;
                        this.f123723OooOo += j;
                        return;
                    }
                }
                C34543OooOo0o c34543OooOo0o6 = source.f123724OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > c34543OooOo0o6.f123782OooO0OO - c34543OooOo0o6.f123781OooO0O0) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    c34543OooOo0oOooO0O0 = c34543OooOo0o6.OooO0OO();
                } else {
                    c34543OooOo0oOooO0O0 = C34539OooOo.OooO0O0();
                    int i4 = c34543OooOo0o6.f123781OooO0O0;
                    Oooo.OooO0OO.OooO0o0(0, i4, i4 + i3, c34543OooOo0o6.f123780OooO00o, c34543OooOo0oOooO0O0.f123780OooO00o);
                }
                c34543OooOo0oOooO0O0.f123782OooO0OO = c34543OooOo0oOooO0O0.f123781OooO0O0 + i3;
                c34543OooOo0o6.f123781OooO0O0 += i3;
                C34543OooOo0o c34543OooOo0o7 = c34543OooOo0o6.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o7);
                c34543OooOo0o7.OooO0O0(c34543OooOo0oOooO0O0);
                source.f123724OooOo0o = c34543OooOo0oOooO0O0;
            }
            C34543OooOo0o c34543OooOo0o8 = source.f123724OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o8);
            long j3 = c34543OooOo0o8.f123782OooO0OO - c34543OooOo0o8.f123781OooO0O0;
            source.f123724OooOo0o = c34543OooOo0o8.OooO00o();
            C34543OooOo0o c34543OooOo0o9 = this.f123724OooOo0o;
            if (c34543OooOo0o9 == null) {
                this.f123724OooOo0o = c34543OooOo0o8;
                c34543OooOo0o8.f123786OooO0oO = c34543OooOo0o8;
                c34543OooOo0o8.f123784OooO0o = c34543OooOo0o8;
            } else {
                C34543OooOo0o c34543OooOo0o10 = c34543OooOo0o9.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o10);
                c34543OooOo0o10.OooO0O0(c34543OooOo0o8);
                C34543OooOo0o c34543OooOo0o11 = c34543OooOo0o8.f123786OooO0oO;
                if (c34543OooOo0o11 == c34543OooOo0o8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o11);
                if (c34543OooOo0o11.f123785OooO0o0) {
                    int i5 = c34543OooOo0o8.f123782OooO0OO - c34543OooOo0o8.f123781OooO0O0;
                    C34543OooOo0o c34543OooOo0o12 = c34543OooOo0o8.f123786OooO0oO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o12);
                    int i6 = 8192 - c34543OooOo0o12.f123782OooO0OO;
                    C34543OooOo0o c34543OooOo0o13 = c34543OooOo0o8.f123786OooO0oO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o13);
                    if (!c34543OooOo0o13.f123783OooO0Oo) {
                        C34543OooOo0o c34543OooOo0o14 = c34543OooOo0o8.f123786OooO0oO;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o14);
                        i2 = c34543OooOo0o14.f123781OooO0O0;
                    }
                    if (i5 <= i6 + i2) {
                        C34543OooOo0o c34543OooOo0o15 = c34543OooOo0o8.f123786OooO0oO;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o15);
                        c34543OooOo0o8.OooO0Oo(c34543OooOo0o15, i5);
                        c34543OooOo0o8.OooO00o();
                        C34539OooOo.OooO00o(c34543OooOo0o8);
                    }
                }
            }
            source.f123723OooOo -= j3;
            this.f123723OooOo += j3;
            j -= j3;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        if (c34543OooOo0o == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
        sink.put(c34543OooOo0o.f123780OooO00o, c34543OooOo0o.f123781OooO0O0, iMin);
        int i = c34543OooOo0o.f123781OooO0O0 + iMin;
        c34543OooOo0o.f123781OooO0O0 = i;
        this.f123723OooOo -= (long) iMin;
        if (i == c34543OooOo0o.f123782OooO0OO) {
            this.f123724OooOo0o = c34543OooOo0o.OooO00o();
            C34539OooOo.OooO00o(c34543OooOo0o);
        }
        return iMin;
    }

    public final int read(byte[] sink, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        C34522OooO0O0.OooO0O0(sink.length, i, i2);
        C34543OooOo0o c34543OooOo0o = this.f123724OooOo0o;
        if (c34543OooOo0o == null) {
            return -1;
        }
        int iMin = Math.min(i2, c34543OooOo0o.f123782OooO0OO - c34543OooOo0o.f123781OooO0O0);
        int i3 = c34543OooOo0o.f123781OooO0O0;
        Oooo.OooO0OO.OooO0o0(i, i3, i3 + iMin, c34543OooOo0o.f123780OooO00o, sink);
        int i4 = c34543OooOo0o.f123781OooO0O0 + iMin;
        c34543OooOo0o.f123781OooO0O0 = i4;
        this.f123723OooOo -= (long) iMin;
        if (i4 == c34543OooOo0o.f123782OooO0OO) {
            this.f123724OooOo0o = c34543OooOo0o.OooO00o();
            C34539OooOo.OooO00o(c34543OooOo0o);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            C34543OooOo0o c34543OooOo0oO0000Oo0 = o0000Oo0(1);
            int iMin = Math.min(i, 8192 - c34543OooOo0oO0000Oo0.f123782OooO0OO);
            source.get(c34543OooOo0oO0000Oo0.f123780OooO00o, c34543OooOo0oO0000Oo0.f123782OooO0OO, iMin);
            i -= iMin;
            c34543OooOo0oO0000Oo0.f123782OooO0OO += iMin;
        }
        this.f123723OooOo += (long) iRemaining;
        return iRemaining;
    }
}
