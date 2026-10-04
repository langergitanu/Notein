package oOo00OoO;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: oOo00OoO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34533OooOOO0 implements InterfaceC34548OooOoo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34542OooOo0O f123751OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public byte f123752OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34532OooOOO f123753OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Inflater f123754OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final CRC32 f123755OooOoOO;

    public C34533OooOOO0(InterfaceC34548OooOoo0 source) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        C34542OooOo0O c34542OooOo0O = new C34542OooOo0O(source);
        this.f123751OooOo = c34542OooOo0O;
        Inflater inflater = new Inflater(true);
        this.f123754OooOoO0 = inflater;
        this.f123753OooOoO = new C34532OooOOO(c34542OooOo0O, inflater);
        this.f123755OooOoOO = new CRC32();
    }

    public static void OooO00o(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void OooO0OO(C34524OooO0Oo c34524OooO0Oo, long j, long j2) {
        C34543OooOo0o c34543OooOo0o = c34524OooO0Oo.f123724OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        while (true) {
            int i = c34543OooOo0o.f123782OooO0OO;
            int i2 = c34543OooOo0o.f123781OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c34543OooOo0o.f123781OooO0O0) + j);
            int iMin = (int) Math.min(c34543OooOo0o.f123782OooO0OO - i3, j2);
            this.f123755OooOoOO.update(c34543OooOo0o.f123780OooO00o, i3, iMin);
            j2 -= (long) iMin;
            c34543OooOo0o = c34543OooOo0o.f123784OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f123753OooOoO.close();
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final long read(C34524OooO0Oo sink, long j) throws IOException {
        long j2;
        C34524OooO0Oo c34524OooO0Oo;
        long j3;
        C34533OooOOO0 c34533OooOOO0 = this;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c34533OooOOO0.f123752OooOo0o;
        CRC32 crc32 = c34533OooOOO0.f123755OooOoOO;
        C34542OooOo0O c34542OooOo0O = c34533OooOOO0.f123751OooOo;
        if (b == 0) {
            c34542OooOo0O.o0000OOO(10L);
            C34524OooO0Oo c34524OooO0Oo2 = c34542OooOo0O.f123776OooOo;
            byte bOooOooo = c34524OooO0Oo2.OooOooo(3L);
            boolean z = ((bOooOooo >> 1) & 1) == 1;
            if (z) {
                c34524OooO0Oo = c34524OooO0Oo2;
                c34533OooOOO0.OooO0OO(c34542OooOo0O.f123776OooOo, 0L, 10L);
            } else {
                c34524OooO0Oo = c34524OooO0Oo2;
            }
            OooO00o(8075, c34542OooOo0O.readShort(), "ID1ID2");
            c34542OooOo0O.skip(8L);
            if (((bOooOooo >> 2) & 1) == 1) {
                c34542OooOo0O.o0000OOO(2L);
                if (z) {
                    j2 = -1;
                    j3 = 2;
                    OooO0OO(c34542OooOo0O.f123776OooOo, 0L, 2L);
                } else {
                    j3 = 2;
                    j2 = -1;
                }
                short s = c34524OooO0Oo.readShort();
                C34524OooO0Oo.OooO00o oooO00o = C34522OooO0O0.f123717OooO00o;
                long j4 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c34542OooOo0O.o0000OOO(j4);
                if (z) {
                    OooO0OO(c34542OooOo0O.f123776OooOo, 0L, j4);
                }
                c34542OooOo0O.skip(j4);
            } else {
                j3 = 2;
                j2 = -1;
            }
            if (((bOooOooo >> 3) & 1) == 1) {
                long jOooO00o = c34542OooOo0O.OooO00o((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
                if (jOooO00o == j2) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0OO(c34542OooOo0O.f123776OooOo, 0L, jOooO00o + 1);
                }
                c34542OooOo0O.skip(jOooO00o + 1);
            }
            if (((bOooOooo >> 4) & 1) == 1) {
                long jOooO00o2 = c34542OooOo0O.OooO00o((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
                if (jOooO00o2 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    c34533OooOOO0 = this;
                    c34533OooOOO0.OooO0OO(c34542OooOo0O.f123776OooOo, 0L, jOooO00o2 + 1);
                } else {
                    c34533OooOOO0 = this;
                }
                c34542OooOo0O.skip(jOooO00o2 + 1);
            } else {
                c34533OooOOO0 = this;
            }
            if (z) {
                c34542OooOo0O.o0000OOO(j3);
                short s2 = c34524OooO0Oo.readShort();
                C34524OooO0Oo.OooO00o oooO00o2 = C34522OooO0O0.f123717OooO00o;
                OooO00o((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c34533OooOOO0.f123752OooOo0o = (byte) 1;
        } else {
            j2 = -1;
        }
        if (c34533OooOOO0.f123752OooOo0o == 1) {
            long j5 = sink.f123723OooOo;
            long j6 = c34533OooOOO0.f123753OooOoO.read(sink, j);
            if (j6 != j2) {
                c34533OooOOO0.OooO0OO(sink, j5, j6);
                return j6;
            }
            c34533OooOOO0.f123752OooOo0o = (byte) 2;
        }
        if (c34533OooOOO0.f123752OooOo0o == 2) {
            c34542OooOo0O.o0000OOO(4L);
            C34524OooO0Oo c34524OooO0Oo3 = c34542OooOo0O.f123776OooOo;
            OooO00o(C34522OooO0O0.OooO0OO(c34524OooO0Oo3.readInt()), (int) crc32.getValue(), "CRC");
            c34542OooOo0O.o0000OOO(4L);
            OooO00o(C34522OooO0O0.OooO0OO(c34524OooO0Oo3.readInt()), (int) c34533OooOOO0.f123754OooOoO0.getBytesWritten(), "ISIZE");
            c34533OooOOO0.f123752OooOo0o = (byte) 3;
            if (!c34542OooOo0O.o0000o0O()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j2;
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        return this.f123751OooOo.f123777OooOo0o.timeout();
    }
}
