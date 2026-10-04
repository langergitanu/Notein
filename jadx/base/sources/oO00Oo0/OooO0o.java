package oO00Oo0;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import oO00OOoo.C32249OooO00o;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0o.AbstractC32276OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends AbstractC32276OooO0OO<C32271OooO00o> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C32249OooO00o f115960OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f115961OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o() {
        super(1000);
        C32249OooO00o c32249OooO00o = C32249OooO00o.f115829OooO00o;
        this.f115961OooOoo0 = 4096;
        this.f115960OooOoo = c32249OooO00o;
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final C32271OooO00o OooO0OO(C32271OooO00o c32271OooO00o) {
        C32271OooO00o c32271OooO00o2 = c32271OooO00o;
        c32271OooO00o2.OooOOO0();
        c32271OooO00o2.OooOO0O();
        return c32271OooO00o2;
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final void OooOOO0(C32271OooO00o c32271OooO00o) {
        C32271OooO00o instance = c32271OooO00o;
        OooOOO0.OooO0oO(instance, "instance");
        C32249OooO00o c32249OooO00o = this.f115960OooOoo;
        ByteBuffer instance2 = instance.f115944OooO00o;
        c32249OooO00o.getClass();
        OooOOO0.OooO0oO(instance2, "instance");
        if (!C32271OooO00o.f115975OooOO0.compareAndSet(instance, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        instance.OooO0o();
        instance.f115980OooO0oo = null;
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final C32271OooO00o OooOOo0() {
        C32249OooO00o c32249OooO00o = this.f115960OooOoo;
        int i = this.f115961OooOoo0;
        c32249OooO00o.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        OooOOO0.OooO0o(byteBufferAllocate, "allocate(size)");
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        return new C32271OooO00o(byteBufferAllocate, null, this);
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final void OooOooo(C32271OooO00o c32271OooO00o) {
        C32271OooO00o instance = c32271OooO00o;
        OooOOO0.OooO0oO(instance, "instance");
        long jLimit = instance.f115944OooO00o.limit();
        int i = this.f115961OooOoo0;
        if (jLimit != i) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Buffer size mismatch. Expected: ", ", actual: ");
            sbOooO0OO.append(r0.limit());
            throw new IllegalStateException(sbOooO0OO.toString().toString());
        }
        C32271OooO00o c32271OooO00o2 = C32271OooO00o.f115978OooOOO0;
        if (instance == c32271OooO00o2) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == c32271OooO00o2) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.OooO() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.OooO0oo() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.f115980OooO0oo != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }
}
