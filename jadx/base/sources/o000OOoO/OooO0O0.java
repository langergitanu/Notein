package o000OOoO;

import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24019OooOO0o f82889OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f82890OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(oO0O000o.OooO00o<Long> pointerAlloc, InterfaceC32507OooOO0o<? super Long, C32460OooOooO> interfaceC32507OooOO0o) {
        OooOOO0.OooO0oO(pointerAlloc, "pointerAlloc");
        this.f82889OooO00o = (C24019OooOO0o) interfaceC32507OooOO0o;
        long jLongValue = pointerAlloc.invoke().longValue();
        this.f82890OooO0O0 = jLongValue;
        if (jLongValue == 0) {
            throw new IllegalStateException("Native allocation failed, should throw an exception in pointerAlloc in that case.");
        }
    }

    public final long OooO00o(Object thisRef, InterfaceC34602OooOO0o<?> property) {
        OooOOO0.OooO0oO(thisRef, "thisRef");
        OooOOO0.OooO0oO(property, "property");
        return this.f82890OooO0O0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOO0o] */
    public final void finalize() {
        long j = this.f82890OooO0O0;
        if (j != 0) {
            this.f82889OooO00o.invoke(Long.valueOf(j));
        }
    }
}
