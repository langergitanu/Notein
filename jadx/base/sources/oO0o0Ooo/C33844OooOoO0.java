package oO0o0Ooo;

import o0OoOOO0.C29046OooO0o0;
import oO0o0OO.InterfaceC33665o00000o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33844OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33839OooOo0 f121957OooO00o = new C33839OooOo0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33842OooOo0o f121958OooO0O0 = new C33842OooOo0o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C29046OooO0o0 f121959OooO0OO = new C29046OooO0o0(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33838OooOo f121960OooO0Oo = new C33838OooOo();

    public static final void OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Object obj) {
        if (obj == f121957OooO00o) {
            return;
        }
        if (!(obj instanceof C33848OooOooO)) {
            Object objFold = interfaceC34415OooO0oo.fold(null, f121959OooO0OO);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((InterfaceC33665o00000o0) objFold).Oooo0OO(obj);
            return;
        }
        C33848OooOooO c33848OooOooO = (C33848OooOooO) obj;
        InterfaceC33665o00000o0<Object>[] interfaceC33665o00000o0Arr = c33848OooOooO.f121966OooO0OO;
        int length = interfaceC33665o00000o0Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC33665o00000o0<Object> interfaceC33665o00000o0 = interfaceC33665o00000o0Arr[length];
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC33665o00000o0);
            interfaceC33665o00000o0.Oooo0OO(c33848OooOooO.f121965OooO0O0[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object OooO0O0(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        Object objFold = interfaceC34415OooO0oo.fold(0, f121958OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objFold);
        return objFold;
    }

    public static final Object OooO0OO(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Object obj) {
        if (obj == null) {
            obj = OooO0O0(interfaceC34415OooO0oo);
        }
        return obj == 0 ? f121957OooO00o : obj instanceof Integer ? interfaceC34415OooO0oo.fold(new C33848OooOooO(((Number) obj).intValue(), interfaceC34415OooO0oo), f121960OooO0Oo) : ((InterfaceC33665o00000o0) obj).o00Oo0(interfaceC34415OooO0oo);
    }
}
