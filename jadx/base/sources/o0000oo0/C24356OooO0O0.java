package o0000oo0;

import java.util.concurrent.CancellationException;
import o00000.OooOO0;
import o0000oOO.C24335OooO0OO;
import oO00o00.OooO0OO;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oO0o.C32409OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33632Oooo;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0O.C33862OooO0o;
import oO0o0o0O.C33868OooOO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0000oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24356OooO0O0<T> implements InterfaceC32925OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33822OooO0OO f82134OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24335OooO0OO f82135OooOo0o;

    public C24356OooO0O0(C24335OooO0OO c24335OooO0OO, C33822OooO0OO c33822OooO0OO) {
        this.f82135OooOo0o = c24335OooO0OO;
        this.f82134OooOo = c33822OooO0OO;
    }

    public final C32409OooO00o OooO00o(InterfaceC32403OooO0OO interfaceC32403OooO0OO) {
        C33664o00000Oo c33664o00000OoOooO00o = OooOO0.OooO00o();
        C24355OooO00o c24355OooO00o = new C24355OooO00o(this, interfaceC32403OooO0OO, null);
        C33822OooO0OO c33822OooO0OO = this.f82134OooOo;
        C33632Oooo c33632OoooOooO00o = C33609OooO0oo.OooO00o(c33822OooO0OO, c33664o00000OoOooO00o, c24355OooO00o, 2);
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = c33822OooO0OO.f121916OooOo0o;
        InterfaceC33672o00ooo.OooO00o oooO00o = InterfaceC33672o00ooo.OooO00o.f121379OooOo0o;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooMinusKey = interfaceC34415OooO0oo.minusKey(oooO00o);
        C33862OooO0o c33862OooO0o = new C33862OooO0o(c33632OoooOooO00o, null);
        if (interfaceC34415OooO0ooMinusKey.get(oooO00o) == null) {
            return new C32409OooO00o(new C33868OooOO0o(interfaceC34415OooO0ooMinusKey, c33862OooO0o));
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + interfaceC34415OooO0ooMinusKey).toString());
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        OooO0OO.OooO0Oo(this.f82134OooOo.f121916OooOo0o).cancel((CancellationException) null);
    }
}
