package o00oO0O;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00oO0O.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25546o00ooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C25503OooOoOO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25546o00ooo f87133OooOo0o = new C25546o00ooo(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(C25503OooOoOO c25503OooOoOO) {
        C25503OooOoOO layoutNode = c25503OooOoOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        if (!layoutNode.OooOoO()) {
            return C32460OooOooO.f116667OooO00o;
        }
        layoutNode.getClass();
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout");
    }
}
