package oO0O0O;

import oO0O0Oo0.C32692Oooo0o0;
import oO0Ooo0.C33361OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooOOO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33361OooO0Oo f116853OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32524OooO0oo f116854OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(C32524OooO0oo c32524OooO0oo, C33361OooO0Oo c33361OooO0Oo) {
        super(0);
        this.f116854OooOo0o = c32524OooO0oo;
        this.f116853OooOo = c33361OooO0Oo;
    }

    @Override // oO0O000o.OooO00o
    public final OooOOO invoke() {
        C32524OooO0oo c32524OooO0oo = this.f116854OooOo0o;
        C32692Oooo0o0 builtInsModule = c32524OooO0oo.OooOO0O();
        kotlin.jvm.internal.OooOOO0.OooO0o(builtInsModule, "builtInsModule");
        return new OooOOO(builtInsModule, this.f116853OooOo, new OooO(c32524OooO0oo));
    }
}
