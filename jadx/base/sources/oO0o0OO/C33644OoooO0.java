package oO0o0OO;

import androidx.core.location.LocationRequestCompat;
import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33644OoooO0 {
    public static final Object OooO00o(long j, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        if (j <= 0) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        if (j < LocationRequestCompat.PASSIVE_INTERVAL) {
            OooO0O0(c33614OooOOO0.f121299OooOoOO).o0000o0(j, c33614OooOOO0);
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }

    public static final InterfaceC33645OoooO00 OooO0O0(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC34415OooO0oo.get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
        InterfaceC33645OoooO00 interfaceC33645OoooO00 = oooO0O0 instanceof InterfaceC33645OoooO00 ? (InterfaceC33645OoooO00) oooO0O0 : null;
        return interfaceC33645OoooO00 == null ? C33641Oooo0oO.f121324OooO00o : interfaceC33645OoooO00;
    }
}
