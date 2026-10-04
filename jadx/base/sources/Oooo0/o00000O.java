package Oooo0;

import Oooo0O0.InterfaceC20926OooOoO;
import OooooOO.InterfaceC21342OoooOOO;
import Oooooo0.InterfaceC21402OooO0o0;
import java.util.Map;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34694OooOOo;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21402OooO0o0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20861o000000o f59998OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(C20861o000000o c20861o000000o) {
        super(1);
        this.f59998OooOo0o = c20861o000000o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC21402OooO0o0 interfaceC21402OooO0o0) {
        Map<Long, Oooo0O0.OooOOO> mapOooO0Oo;
        InterfaceC21402OooO0o0 drawBehind = interfaceC21402OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawBehind, "$this$drawBehind");
        C20861o000000o c20861o000000o = this.f59998OooOo0o;
        o000OO0O o000oo0o2 = c20861o000000o.f59987OooOo0o;
        C34695OooOOo0 c34695OooOOo0 = o000oo0o2.f60167OooO0o0;
        if (c34695OooOOo0 != null) {
            o000oo0o2.f60168OooO0oO.getValue();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            InterfaceC20926OooOoO interfaceC20926OooOoO = c20861o000000o.f59986OooOo;
            if (((interfaceC20926OooOoO == null || (mapOooO0Oo = interfaceC20926OooOoO.OooO0Oo()) == null) ? null : mapOooO0Oo.get(Long.valueOf(c20861o000000o.f59987OooOo0o.f60162OooO00o))) != null) {
                throw null;
            }
            InterfaceC21342OoooOOO canvas = drawBehind.OoooOo0().OooO00o();
            kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
            C34694OooOOo.OooO00o(canvas, c34695OooOOo0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
