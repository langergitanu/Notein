package oO0o0Oo;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import oO0o0OoO.AbstractC33791OooO0O0;
import oO0o0OoO.AbstractC33793OooO0Oo;
import oO0o0OoO.C33792OooO0OO;

/* JADX INFO: renamed from: oO0o0Oo.oo000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33787oo000o extends AbstractC33793OooO0Oo<C33781o00o0O<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<Object> f121817OooO00o = new AtomicReference<>(null);

    @Override // oO0o0OoO.AbstractC33793OooO0Oo
    public final boolean OooO00o(AbstractC33791OooO0O0 abstractC33791OooO0O0) {
        AtomicReference<Object> atomicReference = this.f121817OooO00o;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(C33784o00ooo.f121810OooO00o);
        return true;
    }

    @Override // oO0o0OoO.AbstractC33793OooO0Oo
    public final Continuation[] OooO0O0(AbstractC33791OooO0O0 abstractC33791OooO0O0) {
        this.f121817OooO00o.set(null);
        return C33792OooO0OO.f121826OooO00o;
    }
}
