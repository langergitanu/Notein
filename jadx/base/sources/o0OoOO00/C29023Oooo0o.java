package o0OoOO00;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OoO.C33817OooOoo0;
import oO0o0Ooo.C33844OooOoO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0OoOO00.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29023Oooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f102833OooO00o = 0;

    public static final Object OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Object obj, Object obj2, InterfaceC32508OooOOOo interfaceC32508OooOOOo, Continuation frame) {
        Object objInvoke;
        Object objOooO0OO = C33844OooOoO0.OooO0OO(interfaceC34415OooO0oo, obj2);
        try {
            C33817OooOoo0 c33817OooOoo0 = new C33817OooOoo0(frame, interfaceC34415OooO0oo);
            if (interfaceC32508OooOOOo == null) {
                objInvoke = C21904OooOoo0.OooO0oo(interfaceC32508OooOOOo, obj, c33817OooOoo0);
            } else {
                C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
                objInvoke = interfaceC32508OooOOOo.invoke(obj, c33817OooOoo0);
            }
            C33844OooOoO0.OooO00o(interfaceC34415OooO0oo, objOooO0OO);
            if (objInvoke == EnumC32485OooO00o.f116726OooOo0o) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            C33844OooOoO0.OooO00o(interfaceC34415OooO0oo, objOooO0OO);
            throw th;
        }
    }
}
