package oO00O;

import oO00ooO.C32442OooOO0o;
import ooOOoOoO.C35150OooO00o;
import ooOOoOoO.C35155OooO0o0;
import ooOOoOoO.InterfaceC35154OooO0o;

/* JADX INFO: renamed from: oO00O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32147OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC35154OooO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115302OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32147OooOOoo(C32161Oooo0O0 c32161Oooo0O0) {
        super(0);
        this.f115302OooOo0o = c32161Oooo0O0;
    }

    @Override // oO0O000o.OooO00o
    public final InterfaceC35154OooO0o invoke() {
        C32161Oooo0O0 c32161Oooo0O0 = this.f115302OooOo0o;
        C32167OoooO c32167OoooO = c32161Oooo0O0.serverHello;
        if (c32167OoooO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
            throw null;
        }
        byte[] keyMaterial = (byte[]) c32161Oooo0O0.f115371OooOoOO.getValue();
        C32139OooO0Oo suite = c32167OoooO.f115394OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(suite, "suite");
        kotlin.jvm.internal.OooOOO0.OooO0oO(keyMaterial, "keyMaterial");
        int iOrdinal = suite.f115257OooOOO.ordinal();
        if (iOrdinal == 0) {
            return new C35155OooO0o0(suite, keyMaterial);
        }
        if (iOrdinal == 1) {
            return new C35150OooO00o(suite, keyMaterial);
        }
        throw new C32442OooOO0o();
    }
}
