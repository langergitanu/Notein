package oO00Oo0;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import oO00Oo0O.C32271OooO00o;

/* JADX INFO: renamed from: oO00Oo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32266OooO0Oo extends AbstractC32268OooO0oO {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final C32266OooO0Oo f115959OooOooO = new C32266OooO0Oo(C32271OooO00o.f115978OooOOO0, 0, C32271OooO00o.f115977OooOO0o);

    public C32266OooO0Oo() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32266OooO0Oo(C32271OooO00o head, long j, oO00Oo0o.OooO0o<C32271OooO00o> pool) {
        super(head, j, pool);
        OooOOO0.OooO0oO(head, "head");
        OooOOO0.OooO0oO(pool, "pool");
        if (this.f115969OooOoo) {
            return;
        }
        this.f115969OooOoo = true;
    }

    @Override // oO00Oo0.AbstractC32268OooO0oO
    public final C32271OooO00o OooOOo0() {
        return null;
    }

    @Override // oO00Oo0.AbstractC32268OooO0oO
    public final void OooOOoo(ByteBuffer destination) {
        OooOOO0.OooO0oO(destination, "destination");
    }

    public final C32266OooO0Oo o0000oO() {
        C32271OooO00o c32271OooO00oOooo00o = Oooo00o();
        C32271OooO00o c32271OooO00oOooO0oO = c32271OooO00oOooo00o.OooO0oO();
        C32271OooO00o c32271OooO00oOooO0oo = c32271OooO00oOooo00o.OooO0oo();
        if (c32271OooO00oOooO0oo != null) {
            C32271OooO00o c32271OooO00o = c32271OooO00oOooO0oO;
            while (true) {
                C32271OooO00o c32271OooO00oOooO0oO2 = c32271OooO00oOooO0oo.OooO0oO();
                c32271OooO00o.OooOO0o(c32271OooO00oOooO0oO2);
                c32271OooO00oOooO0oo = c32271OooO00oOooO0oo.OooO0oo();
                if (c32271OooO00oOooO0oo == null) {
                    break;
                }
                c32271OooO00o = c32271OooO00oOooO0oO2;
            }
        }
        return new C32266OooO0Oo(c32271OooO00oOooO0oO, Oooo0(), this.f115965OooOo0o);
    }

    public final String toString() {
        return "ByteReadPacket(" + Oooo0() + " bytes remaining)";
    }
}
