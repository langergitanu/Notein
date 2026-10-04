package oO0O0O;

import oO0O0O.C32524OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32524OooO0oo.OooO00o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32524OooO0oo f116818OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(C32524OooO0oo c32524OooO0oo) {
        super(0);
        this.f116818OooOo0o = c32524OooO0oo;
    }

    @Override // oO0O000o.OooO00o
    public final C32524OooO0oo.OooO00o invoke() {
        C32524OooO0oo c32524OooO0oo = this.f116818OooOo0o;
        OooOO0O oooOO0O = c32524OooO0oo.f116850OooO0o;
        if (oooOO0O == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        C32524OooO0oo.OooO00o oooO00o = (C32524OooO0oo.OooO00o) oooOO0O.invoke();
        c32524OooO0oo.f116850OooO0o = null;
        return oooO00o;
    }
}
