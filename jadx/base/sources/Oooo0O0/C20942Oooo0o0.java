package Oooo0O0;

import OooOoOO.C20557OoooO0O;
import OooOoo0.o000000;
import OooOoo0.o000000O;
import OooOoo0.o00000O0;
import OooOoo0.o0000O0;
import OooOoo0.o0000O0O;
import OooOoo0.o0ooOOo;
import Oooo0oO.o00oO0O;
import OoooOoO.C21234OooO0o0;
import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21290OooO0o0;
import android.os.Build;
import o0000Ooo.C24237OooOO0o;
import o0000Ooo.InterfaceC24229OooO0OO;
import o0ooOO0.C31604o0ooOoO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0O0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20942Oooo0o0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<oO0O000o.OooO00o<? extends C21290OooO0o0>, InterfaceC21233OooO0o> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00oO0O<C24237OooOO0o> f60430OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24229OooO0OO f60431OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20942Oooo0o0(InterfaceC24229OooO0OO interfaceC24229OooO0OO, o00oO0O<C24237OooOO0o> o00oo0o) {
        super(1);
        this.f60431OooOo0o = interfaceC24229OooO0OO;
        this.f60430OooOo = o00oo0o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC21233OooO0o invoke(oO0O000o.OooO00o<? extends C21290OooO0o0> oooO00o) {
        InterfaceC21233OooO0o interfaceC21233OooO0oOooO00o;
        oO0O000o.OooO00o<? extends C21290OooO0o0> center = oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(center, "center");
        InterfaceC21233OooO0o.OooO00o oooO00o2 = InterfaceC21233OooO0o.OooO00o.f61602OooOo0o;
        o00000O0 style = o00000O0.f59436OooO0Oo;
        C20940Oooo0OO c20940Oooo0OO = new C20940Oooo0OO(center);
        C20557OoooO0O c20557OoooO0O = new C20557OoooO0O(1, this.f60431OooOo0o, this.f60430OooOo);
        o0Oo0oo.OooOo<oO0O000o.OooO00o<C21290OooO0o0>> oooOo = o000000O.f59431OooO00o;
        o0ooOOo magnifierCenter = o0ooOOo.f59535OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(style, "style");
        C31604o0ooOoO.OooO00o oooO00o3 = C31604o0ooOoO.f112933OooO00o;
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            interfaceC21233OooO0oOooO00o = oooO00o2;
        } else {
            if (i < 28) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            interfaceC21233OooO0oOooO00o = C21234OooO0o0.OooO00o(oooO00o2, oooO00o3, new o000000(c20940Oooo0OO, magnifierCenter, c20557OoooO0O, i == 28 ? o0000O0.f59461OooO00o : o0000O0O.f59463OooO00o, style));
        }
        return C31604o0ooOoO.OooO00o(oooO00o2, oooO00o3, interfaceC21233OooO0oOooO00o);
    }
}
