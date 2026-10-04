package oO00Oo0;

import Oooo0.C20855OooooOO;
import Oooo0.o000000;
import Ooooo0o.C21282OooOooO;
import OooooO0.C21289OooO0o;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;
import oO0OOo0o.C33074OooOoO;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements Appendable, Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C32271OooO00o f115951OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO00Oo0o.OooO0o f115952OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ByteBuffer f115953OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C32271OooO00o f115954OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f115955OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f115956OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f115957OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f115958OooOooO;

    public OooO0OO() {
        this(null);
    }

    public final void OooO00o() {
        C32271OooO00o c32271OooO00o = this.f115954OooOoO0;
        if (c32271OooO00o != null) {
            this.f115955OooOoOO = c32271OooO00o.f115946OooO0OO;
        }
    }

    public /* bridge */ /* synthetic */ OooO0OO OooO0OO(char c) {
        OooOooo(c);
        return this;
    }

    public /* bridge */ /* synthetic */ OooO0OO OooOOO0(CharSequence charSequence) {
        Oooo000(charSequence);
        return this;
    }

    public final OooO0OO OooOOo0(CharSequence charSequence, int i, int i2) {
        OooO0OO oooO0OOOooo00o = Oooo00o(charSequence, i, i2);
        OooOOO0.OooO0o0(oooO0OOOooo00o, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return oooO0OOOooo00o;
    }

    public final void OooOOoo(String str) {
        Oooo000(str);
    }

    public final OooO0OO OooOooo(char c) {
        int i = this.f115955OooOoOO;
        int i2 = 4;
        if (this.f115957OooOoo0 - i >= 3) {
            ByteBuffer byteBuffer = this.f115953OooOoO;
            if (c >= 0 && c < 128) {
                byteBuffer.put(i, (byte) c);
                i2 = 1;
            } else if (128 <= c && c < 2048) {
                byteBuffer.put(i, (byte) (((c >> 6) & 31) | 192));
                byteBuffer.put(i + 1, (byte) ((c & '?') | 128));
                i2 = 2;
            } else if (2048 <= c && c < 0) {
                byteBuffer.put(i, (byte) (((c >> '\f') & 15) | 224));
                byteBuffer.put(i + 1, (byte) (((c >> 6) & 63) | 128));
                byteBuffer.put(i + 2, (byte) ((c & '?') | 128));
                i2 = 3;
            } else {
                if (0 > c || c >= 0) {
                    o000000.OooO0Oo(c);
                    throw null;
                }
                byteBuffer.put(i, (byte) (((c >> 18) & 7) | 240));
                byteBuffer.put(i + 1, (byte) (((c >> '\f') & 63) | 128));
                byteBuffer.put(i + 2, (byte) (((c >> 6) & 63) | 128));
                byteBuffer.put(i + 3, (byte) ((c & '?') | 128));
            }
            this.f115955OooOoOO = i + i2;
            return this;
        }
        C32271OooO00o c32271OooO00oO0Oo0oo = o0Oo0oo(3);
        try {
            ByteBuffer byteBuffer2 = c32271OooO00oO0Oo0oo.f115944OooO00o;
            int i3 = c32271OooO00oO0Oo0oo.f115946OooO0OO;
            if (c >= 0 && c < 128) {
                byteBuffer2.put(i3, (byte) c);
                i2 = 1;
            } else if (128 <= c && c < 2048) {
                byteBuffer2.put(i3, (byte) (((c >> 6) & 31) | 192));
                byteBuffer2.put(i3 + 1, (byte) ((c & '?') | 128));
                i2 = 2;
            } else if (2048 <= c && c < 0) {
                byteBuffer2.put(i3, (byte) (((c >> '\f') & 15) | 224));
                byteBuffer2.put(i3 + 1, (byte) (((c >> 6) & 63) | 128));
                byteBuffer2.put(i3 + 2, (byte) ((c & '?') | 128));
                i2 = 3;
            } else {
                if (0 > c || c >= 0) {
                    o000000.OooO0Oo(c);
                    throw null;
                }
                byteBuffer2.put(i3, (byte) (((c >> 18) & 7) | 240));
                byteBuffer2.put(i3 + 1, (byte) (((c >> '\f') & 63) | 128));
                byteBuffer2.put(i3 + 2, (byte) (((c >> 6) & 63) | 128));
                byteBuffer2.put(i3 + 3, (byte) ((c & '?') | 128));
            }
            c32271OooO00oO0Oo0oo.OooO00o(i2);
            if (i2 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            OooO00o();
            return this;
        } catch (Throwable th) {
            OooO00o();
            throw th;
        }
    }

    public final void Oooo0(C32271OooO00o c32271OooO00o) {
        C32271OooO00o c32271OooO00oOooO0Oo = C21289OooO0o.OooO0Oo(c32271OooO00o);
        long jOooO0oo = C21289OooO0o.OooO0oo(c32271OooO00o) - ((long) (c32271OooO00oOooO0Oo.f115946OooO0OO - c32271OooO00oOooO0Oo.f115945OooO0O0));
        if (jOooO0oo < 2147483647L) {
            Oooo0OO(c32271OooO00o, c32271OooO00oOooO0Oo, (int) jOooO0oo);
        } else {
            C33074OooOoO.OooO0o0(jOooO0oo, "total size increase");
            throw null;
        }
    }

    public final OooO0OO Oooo000(CharSequence charSequence) {
        if (charSequence == null) {
            OooOOo0(CloudMetaExtra.DEFINE_NON_PARENT_ID, 0, 4);
            return this;
        }
        OooOOo0(charSequence, 0, charSequence.length());
        return this;
    }

    public final OooO0OO Oooo00o(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return OooOOo0(CloudMetaExtra.DEFINE_NON_PARENT_ID, i, i2);
        }
        C25150OooO00o.OooO(this, charSequence, i, i2, C33580OooO00o.f121231OooO0O0);
        return this;
    }

    public final void Oooo0OO(C32271OooO00o c32271OooO00o, C32271OooO00o c32271OooO00o2, int i) {
        C32271OooO00o c32271OooO00o3 = this.f115954OooOoO0;
        if (c32271OooO00o3 == null) {
            this.f115951OooOo = c32271OooO00o;
            this.f115958OooOooO = 0;
        } else {
            c32271OooO00o3.OooOO0o(c32271OooO00o);
            int i2 = this.f115955OooOoOO;
            c32271OooO00o3.OooO0O0(i2);
            this.f115958OooOooO = (i2 - this.f115956OooOoo) + this.f115958OooOooO;
        }
        this.f115954OooOoO0 = c32271OooO00o2;
        this.f115958OooOooO += i;
        this.f115953OooOoO = c32271OooO00o2.f115944OooO00o;
        this.f115955OooOoOO = c32271OooO00o2.f115946OooO0OO;
        this.f115956OooOoo = c32271OooO00o2.f115945OooO0O0;
        this.f115957OooOoo0 = c32271OooO00o2.f115949OooO0o0;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        OooOooo(c);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oO00Oo0o.OooO0o<C32271OooO00o> pool = this.f115952OooOo0o;
        C32271OooO00o c32271OooO00oO00000OO = o00000OO();
        if (c32271OooO00oO00000OO == null) {
            return;
        }
        C32271OooO00o c32271OooO00oOooO0oo = c32271OooO00oO00000OO;
        do {
            try {
                ByteBuffer source = c32271OooO00oOooO0oo.f115944OooO00o;
                OooOOO0.OooO0oO(source, "source");
                c32271OooO00oOooO0oo = c32271OooO00oOooO0oo.OooO0oo();
            } finally {
                OooOOO0.OooO0oO(pool, "pool");
                while (c32271OooO00oO00000OO != null) {
                    C32271OooO00o c32271OooO00oOooO0o = c32271OooO00oO00000OO.OooO0o();
                    c32271OooO00oO00000OO.OooOO0(pool);
                    c32271OooO00oO00000OO = c32271OooO00oOooO0o;
                }
            }
        } while (c32271OooO00oOooO0oo != null);
    }

    public final C32271OooO00o o00000OO() {
        C32271OooO00o c32271OooO00o = this.f115951OooOo;
        if (c32271OooO00o == null) {
            return null;
        }
        C32271OooO00o c32271OooO00o2 = this.f115954OooOoO0;
        if (c32271OooO00o2 != null) {
            c32271OooO00o2.OooO0O0(this.f115955OooOoOO);
        }
        this.f115951OooOo = null;
        this.f115954OooOoO0 = null;
        this.f115955OooOoOO = 0;
        this.f115957OooOoo0 = 0;
        this.f115956OooOoo = 0;
        this.f115958OooOooO = 0;
        this.f115953OooOoO = C32250OooO0O0.f115830OooO00o;
        return c32271OooO00o;
    }

    public final void o00000oO(byte b) throws C32269OooO0oo {
        int i = this.f115955OooOoOO;
        if (i < this.f115957OooOoo0) {
            this.f115955OooOoOO = i + 1;
            this.f115953OooOoO.put(i, b);
            return;
        }
        C32271OooO00o c32271OooO00o = (C32271OooO00o) this.f115952OooOo0o.o0000OoO();
        c32271OooO00o.OooO0o0();
        if (c32271OooO00o.OooO0oo() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        Oooo0OO(c32271OooO00o, c32271OooO00o, 0);
        int i2 = c32271OooO00o.f115946OooO0OO;
        if (i2 == c32271OooO00o.f115949OooO0o0) {
            throw new C32269OooO0oo("No free space in the buffer to write a byte");
        }
        c32271OooO00o.f115944OooO00o.put(i2, b);
        c32271OooO00o.f115946OooO0OO = i2 + 1;
        this.f115955OooOoOO++;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0000oO(C32266OooO0Oo packet) {
        OooOOO0.OooO0oO(packet, "packet");
        C32271OooO00o c32271OooO00oOooo00o = packet.Oooo00o();
        C32271OooO00o c32271OooO00o = C32271OooO00o.f115978OooOOO0;
        if (c32271OooO00oOooo00o == c32271OooO00o) {
            c32271OooO00oOooo00o = null;
        } else {
            packet.o00000oO(c32271OooO00o);
            packet.o00000OO(0L);
        }
        if (c32271OooO00oOooo00o == null) {
            packet.release();
            return;
        }
        C32271OooO00o c32271OooO00o2 = this.f115954OooOoO0;
        if (c32271OooO00o2 == null) {
            Oooo0(c32271OooO00oOooo00o);
            return;
        }
        c32271OooO00o2.OooO0O0(this.f115955OooOoOO);
        int i = c32271OooO00o2.f115946OooO0OO;
        int i2 = i - c32271OooO00o2.f115945OooO0O0;
        int i3 = c32271OooO00oOooo00o.f115946OooO0OO - c32271OooO00oOooo00o.f115945OooO0O0;
        int i4 = OooO.f115943OooO00o;
        int i5 = c32271OooO00o2.f115948OooO0o;
        if (i3 < i4) {
            int i6 = c32271OooO00o2.f115949OooO0o0;
            if (i3 > (i6 - i) + (i5 - i6)) {
                i3 = -1;
            }
        }
        if (i2 >= i4 || i2 > c32271OooO00oOooo00o.f115947OooO0Oo || c32271OooO00oOooo00o.OooO() != 1) {
            i2 = -1;
        }
        if (i3 == -1 && i2 == -1) {
            Oooo0(c32271OooO00oOooo00o);
            return;
        }
        if (i2 == -1 || i3 <= i2) {
            int i7 = c32271OooO00o2.f115949OooO0o0;
            C21282OooOooO.OooO0oO(c32271OooO00o2, c32271OooO00oOooo00o, (i5 - i7) + (i7 - c32271OooO00o2.f115946OooO0OO));
            OooO00o();
            C32271OooO00o c32271OooO00oOooO0o = c32271OooO00oOooo00o.OooO0o();
            if (c32271OooO00oOooO0o != null) {
                Oooo0(c32271OooO00oOooO0o);
            }
            c32271OooO00oOooo00o.OooOO0(packet.f115965OooOo0o);
            return;
        }
        if (i3 != -1 && i2 >= i3) {
            throw new IllegalStateException(C20855OooooOO.OooO0OO(i2, i3, "prep = ", ", app = "));
        }
        int i8 = c32271OooO00o2.f115946OooO0OO;
        int i9 = c32271OooO00o2.f115945OooO0O0;
        int i10 = i8 - i9;
        int i11 = c32271OooO00oOooo00o.f115945OooO0O0;
        if (i11 < i10) {
            throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
        }
        int i12 = i11 - i10;
        C32250OooO0O0.OooO00o(c32271OooO00o2.f115944OooO00o, c32271OooO00oOooo00o.f115944OooO00o, i9, i10, i12);
        c32271OooO00o2.OooO0OO(i10);
        c32271OooO00oOooo00o.OooO0Oo(i12);
        C32271OooO00o c32271OooO00o3 = this.f115951OooOo;
        if (c32271OooO00o3 == null) {
            throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
        }
        if (c32271OooO00o3 == c32271OooO00o2) {
            this.f115951OooOo = c32271OooO00oOooo00o;
        } else {
            while (true) {
                C32271OooO00o c32271OooO00oOooO0oo = c32271OooO00o3.OooO0oo();
                OooOOO0.OooO0Oo(c32271OooO00oOooO0oo);
                if (c32271OooO00oOooO0oo == c32271OooO00o2) {
                    break;
                } else {
                    c32271OooO00o3 = c32271OooO00oOooO0oo;
                }
            }
            c32271OooO00o3.OooOO0o(c32271OooO00oOooo00o);
        }
        c32271OooO00o2.OooOO0(this.f115952OooOo0o);
        this.f115954OooOoO0 = C21289OooO0o.OooO0Oo(c32271OooO00oOooo00o);
    }

    public final int o00Oo0() {
        return (this.f115955OooOoOO - this.f115956OooOoo) + this.f115958OooOooO;
    }

    public final C32271OooO00o o0Oo0oo(int i) {
        C32271OooO00o c32271OooO00o;
        int i2 = this.f115957OooOoo0;
        int i3 = this.f115955OooOoOO;
        if (i2 - i3 >= i && (c32271OooO00o = this.f115954OooOoO0) != null) {
            c32271OooO00o.OooO0O0(i3);
            return c32271OooO00o;
        }
        C32271OooO00o c32271OooO00o2 = (C32271OooO00o) this.f115952OooOo0o.o0000OoO();
        c32271OooO00o2.OooO0o0();
        if (c32271OooO00o2.OooO0oo() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        Oooo0OO(c32271OooO00o2, c32271OooO00o2, 0);
        return c32271OooO00o2;
    }

    public final C32266OooO0Oo ooOO() {
        int iO00Oo0 = o00Oo0();
        C32271OooO00o c32271OooO00oO00000OO = o00000OO();
        if (c32271OooO00oO00000OO != null) {
            return new C32266OooO0Oo(c32271OooO00oO00000OO, iO00Oo0, this.f115952OooOo0o);
        }
        C32266OooO0Oo c32266OooO0Oo = C32266OooO0Oo.f115959OooOooO;
        return C32266OooO0Oo.f115959OooOooO;
    }

    public final String toString() {
        return "BytePacketBuilder(" + o00Oo0() + " bytes written)";
    }

    public OooO0OO(Object obj) {
        this.f115952OooOo0o = C32271OooO00o.f115976OooOO0O;
        this.f115953OooOoO = C32250OooO0O0.f115830OooO00o;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        Oooo000(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        OooO0OO oooO0OOOooo00o = Oooo00o(charSequence, i, i2);
        OooOOO0.OooO0o0(oooO0OOOooo00o, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return oooO0OOOooo00o;
    }
}
