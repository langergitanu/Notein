package oO0o0Ooo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.AbstractC33655OooooO0;
import oO0o0OO.C33620OooOo;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o0000O0;
import oO0o0OO.o0000Ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33826OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33839OooOo0 f121924OooO00o = new C33839OooOo0("UNDEFINED");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33839OooOo0 f121925OooO0O0 = new C33839OooOo0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #1 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008f, B:23:0x006b, B:25:0x0079, B:30:0x0086, B:32:0x008c, B:38:0x009c, B:41:0x00a5, B:40:0x00a2, B:28:0x007f), top: B:52:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO00o(Object obj, Continuation continuation) {
        InterfaceC33672o00ooo interfaceC33672o00ooo;
        if (!(continuation instanceof C33824OooO0o)) {
            continuation.resumeWith(obj);
            return;
        }
        C33824OooO0o c33824OooO0o = (C33824OooO0o) continuation;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        Object c33620OooOo = thOooO00o == null ? obj : new C33620OooOo(false, thOooO00o);
        AbstractC32479OooO0OO abstractC32479OooO0OO = c33824OooO0o.f121920OooOoOO;
        InterfaceC34415OooO0oo context = abstractC32479OooO0OO.getContext();
        AbstractC33630OooOooO abstractC33630OooOooO = c33824OooO0o.f121919OooOoO;
        if (abstractC33630OooOooO.o000OOO(context)) {
            c33824OooO0o.f121922OooOoo0 = c33620OooOo;
            c33824OooO0o.f121326OooOoO0 = 1;
            abstractC33630OooOooO.o0OoO0o(abstractC32479OooO0OO.getContext(), c33824OooO0o);
            return;
        }
        AbstractC33655OooooO0 abstractC33655OooooO0OooO00o = o0000Ooo.OooO00o();
        if (abstractC33655OooooO0OooO00o.f121336OooOoO0 >= 4294967296L) {
            c33824OooO0o.f121922OooOoo0 = c33620OooOo;
            c33824OooO0o.f121326OooOoO0 = 1;
            abstractC33655OooooO0OooO00o.o000Oo00(c33824OooO0o);
            return;
        }
        abstractC33655OooooO0OooO00o.o000Oo0O(true);
        try {
            interfaceC33672o00ooo = (InterfaceC33672o00ooo) abstractC32479OooO0OO.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC33672o00ooo == null || interfaceC33672o00ooo.isActive()) {
            Object obj2 = c33824OooO0o.f121921OooOoo;
            InterfaceC34415OooO0oo context2 = abstractC32479OooO0OO.getContext();
            Object objOooO0OO = C33844OooOoO0.OooO0OO(context2, obj2);
            o0000O0<?> o0000o0OooO0OO = objOooO0OO != C33844OooOoO0.f121957OooO00o ? C33628OooOoo.OooO0OO(abstractC32479OooO0OO, context2, objOooO0OO) : null;
            try {
                abstractC32479OooO0OO.resumeWith(obj);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } finally {
                if (o0000o0OooO0OO == null || o0000o0OooO0OO.o0OoOo0()) {
                    C33844OooOoO0.OooO00o(context2, objOooO0OO);
                }
            }
        }
        c33824OooO0o.resumeWith(C32446OooOOOo.OooO00o(interfaceC33672o00ooo.getCancellationException()));
        while (abstractC33655OooooO0OooO00o.o000Oo()) {
        }
    }
}
