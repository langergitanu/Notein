package oO00Oo0;

import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;
import Ooooo0o.C21282OooOooO;
import Ooooo0o.Oooo000;
import OooooO0.C21289OooO0o;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;

/* JADX INFO: renamed from: oO00Oo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32268OooO0oO implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C32271OooO00o f115964OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO00Oo0o.OooO0o<C32271OooO00o> f115965OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f115966OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ByteBuffer f115967OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f115968OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f115969OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f115970OooOoo0;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC32268OooO0oO() {
        C32271OooO00o c32271OooO00o = C32271OooO00o.f115978OooOOO0;
        this(c32271OooO00o, C21289OooO0o.OooO0oo(c32271OooO00o), C32271OooO00o.f115976OooOO0O);
    }

    public final void OooO00o(int i) throws EOFException {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Negative discard is not allowed: ").toString());
        }
        int i2 = 0;
        int i3 = i;
        while (i3 != 0) {
            C32271OooO00o c32271OooO00oOooo0OO = Oooo0OO();
            if (c32271OooO00oOooo0OO == null) {
                break;
            }
            int iMin = Math.min(c32271OooO00oOooo0OO.f115946OooO0OO - c32271OooO00oOooo0OO.f115945OooO0O0, i3);
            c32271OooO00oOooo0OO.OooO0OO(iMin);
            this.f115966OooOoO += iMin;
            if (c32271OooO00oOooo0OO.f115946OooO0OO - c32271OooO00oOooo0OO.f115945OooO0O0 == 0) {
                o0Oo0oo(c32271OooO00oOooo0OO);
            }
            i3 -= iMin;
            i2 += iMin;
        }
        if (i2 != i) {
            throw new EOFException(o0Oo0oo.OooO0O0(i, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    public final C32271OooO00o OooO0OO() {
        if (this.f115969OooOoo) {
            return null;
        }
        C32271OooO00o c32271OooO00oOooOOo0 = OooOOo0();
        if (c32271OooO00oOooOOo0 == null) {
            this.f115969OooOoo = true;
            return null;
        }
        C32271OooO00o c32271OooO00oOooO0Oo = C21289OooO0o.OooO0Oo(this.f115964OooOo);
        if (c32271OooO00oOooO0Oo != C32271OooO00o.f115978OooOOO0) {
            c32271OooO00oOooO0Oo.OooOO0o(c32271OooO00oOooOOo0);
            o00000OO(C21289OooO0o.OooO0oo(c32271OooO00oOooOOo0) + this.f115970OooOoo0);
            return c32271OooO00oOooOOo0;
        }
        o00000oO(c32271OooO00oOooOOo0);
        if (this.f115970OooOoo0 != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        C32271OooO00o c32271OooO00oOooO0oo = c32271OooO00oOooOOo0.OooO0oo();
        o00000OO(c32271OooO00oOooO0oo != null ? C21289OooO0o.OooO0oo(c32271OooO00oOooO0oo) : 0L);
        return c32271OooO00oOooOOo0;
    }

    public final C32271OooO00o OooOOO0(C32271OooO00o current) {
        OooOOO0.OooO0oO(current, "current");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C32271OooO00o.f115974OooO;
        C32271OooO00o c32271OooO00o = C32271OooO00o.f115978OooOOO0;
        while (current != c32271OooO00o) {
            C32271OooO00o c32271OooO00oOooO0o = current.OooO0o();
            current.OooOO0(this.f115965OooOo0o);
            if (c32271OooO00oOooO0o == null) {
                o00000oO(c32271OooO00o);
                o00000OO(0L);
                current = c32271OooO00o;
            } else {
                if (c32271OooO00oOooO0o.f115946OooO0OO > c32271OooO00oOooO0o.f115945OooO0O0) {
                    o00000oO(c32271OooO00oOooO0o);
                    o00000OO(this.f115970OooOoo0 - ((long) (c32271OooO00oOooO0o.f115946OooO0OO - c32271OooO00oOooO0o.f115945OooO0O0)));
                    return c32271OooO00oOooO0o;
                }
                current = c32271OooO00oOooO0o;
            }
        }
        return OooO0OO();
    }

    public C32271OooO00o OooOOo0() {
        oO00Oo0o.OooO0o<C32271OooO00o> oooO0o = this.f115965OooOo0o;
        C32271OooO00o c32271OooO00oO0000OoO = oooO0o.o0000OoO();
        try {
            c32271OooO00oO0000OoO.OooO0o0();
            OooOOoo(c32271OooO00oO0000OoO.f115944OooO00o);
            this.f115969OooOoo = true;
            if (c32271OooO00oO0000OoO.f115946OooO0OO > c32271OooO00oO0000OoO.f115945OooO0O0) {
                c32271OooO00oO0000OoO.OooO00o(0);
                return c32271OooO00oO0000OoO;
            }
            c32271OooO00oO0000OoO.OooOO0(oooO0o);
            return null;
        } catch (Throwable th) {
            c32271OooO00oO0000OoO.OooOO0(oooO0o);
            throw th;
        }
    }

    public abstract void OooOOoo(ByteBuffer byteBuffer);

    public final void OooOooo(C32271OooO00o c32271OooO00o) {
        if (this.f115969OooOoo && c32271OooO00o.OooO0oo() == null) {
            this.f115966OooOoO = c32271OooO00o.f115945OooO0O0;
            this.f115968OooOoOO = c32271OooO00o.f115946OooO0OO;
            o00000OO(0L);
            return;
        }
        int i = c32271OooO00o.f115946OooO0OO - c32271OooO00o.f115945OooO0O0;
        int iMin = Math.min(i, 8 - (c32271OooO00o.f115948OooO0o - c32271OooO00o.f115949OooO0o0));
        oO00Oo0o.OooO0o<C32271OooO00o> oooO0o = this.f115965OooOo0o;
        if (i > iMin) {
            C32271OooO00o c32271OooO00oO0000OoO = oooO0o.o0000OoO();
            C32271OooO00o c32271OooO00oO0000OoO2 = oooO0o.o0000OoO();
            c32271OooO00oO0000OoO.OooO0o0();
            c32271OooO00oO0000OoO2.OooO0o0();
            c32271OooO00oO0000OoO.OooOO0o(c32271OooO00oO0000OoO2);
            c32271OooO00oO0000OoO2.OooOO0o(c32271OooO00o.OooO0o());
            C21282OooOooO.OooO0oO(c32271OooO00oO0000OoO, c32271OooO00o, i - iMin);
            C21282OooOooO.OooO0oO(c32271OooO00oO0000OoO2, c32271OooO00o, iMin);
            o00000oO(c32271OooO00oO0000OoO);
            o00000OO(C21289OooO0o.OooO0oo(c32271OooO00oO0000OoO2));
        } else {
            C32271OooO00o c32271OooO00oO0000OoO3 = oooO0o.o0000OoO();
            c32271OooO00oO0000OoO3.OooO0o0();
            c32271OooO00oO0000OoO3.OooOO0o(c32271OooO00o.OooO0o());
            C21282OooOooO.OooO0oO(c32271OooO00oO0000OoO3, c32271OooO00o, i);
            o00000oO(c32271OooO00oO0000OoO3);
        }
        c32271OooO00o.OooOO0(oooO0o);
    }

    public final long Oooo0() {
        return ((long) (this.f115968OooOoOO - this.f115966OooOoO)) + this.f115970OooOoo0;
    }

    public final boolean Oooo000() {
        if (this.f115968OooOoOO - this.f115966OooOoO == 0 && this.f115970OooOoo0 == 0) {
            return this.f115969OooOoo || OooO0OO() == null;
        }
        return false;
    }

    public final C32271OooO00o Oooo00o() {
        C32271OooO00o c32271OooO00o = this.f115964OooOo;
        int i = this.f115966OooOoO;
        if (i < 0 || i > c32271OooO00o.f115946OooO0OO) {
            int i2 = c32271OooO00o.f115945OooO0O0;
            Oooo000.OooO0o0(i - i2, c32271OooO00o.f115946OooO0OO - i2);
            throw null;
        }
        if (c32271OooO00o.f115945OooO0O0 != i) {
            c32271OooO00o.f115945OooO0O0 = i;
        }
        return c32271OooO00o;
    }

    public final C32271OooO00o Oooo0OO() {
        C32271OooO00o c32271OooO00oOooo00o = Oooo00o();
        return this.f115968OooOoOO - this.f115966OooOoO >= 1 ? c32271OooO00oOooo00o : o00Oo0(1, c32271OooO00oOooo00o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
        if (this.f115969OooOoo) {
            return;
        }
        this.f115969OooOoo = true;
    }

    public final void o00000OO(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "tailRemaining shouldn't be negative: ").toString());
        }
        this.f115970OooOoo0 = j;
    }

    public final void o00000oO(C32271OooO00o c32271OooO00o) {
        this.f115964OooOo = c32271OooO00o;
        this.f115967OooOoO0 = c32271OooO00o.f115944OooO00o;
        this.f115966OooOoO = c32271OooO00o.f115945OooO0O0;
        this.f115968OooOoOO = c32271OooO00o.f115946OooO0OO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32271OooO00o o00Oo0(int i, C32271OooO00o c32271OooO00o) {
        while (true) {
            int i2 = this.f115968OooOoOO - this.f115966OooOoO;
            if (i2 >= i) {
                break;
            }
            C32271OooO00o c32271OooO00oOooO0oo = c32271OooO00o.OooO0oo();
            if (c32271OooO00oOooO0oo == null && (c32271OooO00oOooO0oo = OooO0OO()) == null) {
                return null;
            }
            if (i2 == 0) {
                if (c32271OooO00o != C32271OooO00o.f115978OooOOO0) {
                    o0Oo0oo(c32271OooO00o);
                }
                c32271OooO00o = c32271OooO00oOooO0oo;
            } else {
                int iOooO0oO = C21282OooOooO.OooO0oO(c32271OooO00o, c32271OooO00oOooO0oo, i - i2);
                this.f115968OooOoOO = c32271OooO00o.f115946OooO0OO;
                o00000OO(this.f115970OooOoo0 - ((long) iOooO0oO));
                int i3 = c32271OooO00oOooO0oo.f115946OooO0OO;
                int i4 = c32271OooO00oOooO0oo.f115945OooO0O0;
                if (i3 <= i4) {
                    c32271OooO00o.OooO0o();
                    c32271OooO00o.OooOO0o(c32271OooO00oOooO0oo.OooO0o());
                    c32271OooO00oOooO0oo.OooOO0(this.f115965OooOo0o);
                } else {
                    if (iOooO0oO < 0) {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iOooO0oO, "startGap shouldn't be negative: ").toString());
                    }
                    if (i4 >= iOooO0oO) {
                        c32271OooO00oOooO0oo.f115947OooO0Oo = iOooO0oO;
                    } else {
                        if (i4 != i3) {
                            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iOooO0oO, "Unable to reserve ", " start gap: there are already ");
                            sbOooO0OO.append(c32271OooO00oOooO0oo.f115946OooO0OO - c32271OooO00oOooO0oo.f115945OooO0O0);
                            sbOooO0OO.append(" content bytes starting at offset ");
                            sbOooO0OO.append(c32271OooO00oOooO0oo.f115945OooO0O0);
                            throw new IllegalStateException(sbOooO0OO.toString());
                        }
                        if (iOooO0oO > c32271OooO00oOooO0oo.f115949OooO0o0) {
                            int i5 = c32271OooO00oOooO0oo.f115948OooO0o;
                            if (iOooO0oO > i5) {
                                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(iOooO0oO, i5, "Start gap ", " is bigger than the capacity "));
                            }
                            StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(iOooO0oO, "Unable to reserve ", " start gap: there are already ");
                            sbOooO0OO2.append(i5 - c32271OooO00oOooO0oo.f115949OooO0o0);
                            sbOooO0OO2.append(" bytes reserved in the end");
                            throw new IllegalStateException(sbOooO0OO2.toString());
                        }
                        c32271OooO00oOooO0oo.f115946OooO0OO = iOooO0oO;
                        c32271OooO00oOooO0oo.f115945OooO0O0 = iOooO0oO;
                        c32271OooO00oOooO0oo.f115947OooO0Oo = iOooO0oO;
                    }
                }
                if (c32271OooO00o.f115946OooO0OO - c32271OooO00o.f115945OooO0O0 >= i) {
                    break;
                }
                if (i > 8) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "minSize of ", " is too big (should be less than 8)"));
                }
            }
        }
    }

    public final void o0Oo0oo(C32271OooO00o c32271OooO00o) {
        C32271OooO00o c32271OooO00oOooO0o = c32271OooO00o.OooO0o();
        if (c32271OooO00oOooO0o == null) {
            c32271OooO00oOooO0o = C32271OooO00o.f115978OooOOO0;
        }
        o00000oO(c32271OooO00oOooO0o);
        o00000OO(this.f115970OooOoo0 - ((long) (c32271OooO00oOooO0o.f115946OooO0OO - c32271OooO00oOooO0o.f115945OooO0O0)));
        c32271OooO00o.OooOO0(this.f115965OooOo0o);
    }

    public final C32271OooO00o ooOO(int i) {
        return o00Oo0(i, Oooo00o());
    }

    public final byte readByte() throws EOFException {
        int i = this.f115966OooOoO;
        int i2 = i + 1;
        int i3 = this.f115968OooOoOO;
        if (i2 < i3) {
            this.f115966OooOoO = i2;
            return this.f115967OooOoO0.get(i);
        }
        if (i >= i3) {
            C32271OooO00o c32271OooO00oOooo0OO = Oooo0OO();
            if (c32271OooO00oOooo0OO == null) {
                C25150OooO00o.OooO0o0(1);
                throw null;
            }
            int i4 = c32271OooO00oOooo0OO.f115945OooO0O0;
            if (i4 == c32271OooO00oOooo0OO.f115946OooO0OO) {
                throw new EOFException("No readable bytes available.");
            }
            c32271OooO00oOooo0OO.f115945OooO0O0 = i4 + 1;
            byte b = c32271OooO00oOooo0OO.f115944OooO00o.get(i4);
            C32273OooO0Oo.OooO00o(this, c32271OooO00oOooo0OO);
            return b;
        }
        byte b2 = this.f115967OooOoO0.get(i);
        this.f115966OooOoO = i;
        C32271OooO00o c32271OooO00o = this.f115964OooOo;
        if (i < 0 || i > c32271OooO00o.f115946OooO0OO) {
            int i5 = c32271OooO00o.f115945OooO0O0;
            Oooo000.OooO0o0(i - i5, c32271OooO00o.f115946OooO0OO - i5);
            throw null;
        }
        if (c32271OooO00o.f115945OooO0O0 != i) {
            c32271OooO00o.f115945OooO0O0 = i;
        }
        OooOOO0(c32271OooO00o);
        return b2;
    }

    public final void release() {
        C32271OooO00o c32271OooO00oOooo00o = Oooo00o();
        C32271OooO00o c32271OooO00o = C32271OooO00o.f115978OooOOO0;
        if (c32271OooO00oOooo00o != c32271OooO00o) {
            o00000oO(c32271OooO00o);
            o00000OO(0L);
            oO00Oo0o.OooO0o<C32271OooO00o> pool = this.f115965OooOo0o;
            OooOOO0.OooO0oO(pool, "pool");
            while (c32271OooO00oOooo00o != null) {
                C32271OooO00o c32271OooO00oOooO0o = c32271OooO00oOooo00o.OooO0o();
                c32271OooO00oOooo00o.OooOO0(pool);
                c32271OooO00oOooo00o = c32271OooO00oOooO0o;
            }
        }
    }

    public AbstractC32268OooO0oO(C32271OooO00o head, long j, oO00Oo0o.OooO0o<C32271OooO00o> pool) {
        OooOOO0.OooO0oO(head, "head");
        OooOOO0.OooO0oO(pool, "pool");
        this.f115965OooOo0o = pool;
        this.f115964OooOo = head;
        this.f115967OooOoO0 = head.f115944OooO00o;
        int i = head.f115945OooO0O0;
        this.f115966OooOoO = i;
        int i2 = head.f115946OooO0OO;
        this.f115968OooOoOO = i2;
        this.f115970OooOoo0 = j - ((long) (i2 - i));
    }
}
