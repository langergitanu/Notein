package oO0o0OO;

import androidx.core.location.LocationRequestCompat;
import androidx.fragment.app.C21904OooOoo0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31071OoooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33835OooOOo;
import oO0o0Ooo.C33844OooOoO0;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33609OooO0oo {
    public static C33632Oooo OooO00o(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i) {
        EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121316OooOo;
        if ((i & 1) != 0) {
            interfaceC34415OooO0oo = oOo0000O.OooO.f123416OooOo0o;
        }
        EnumC33637Oooo0O0 enumC33637Oooo0O02 = (i & 2) != 0 ? EnumC33637Oooo0O0.f121317OooOo0o : enumC33637Oooo0O0;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0O0 = C33628OooOoo.OooO0O0(interfaceC33636Oooo00o, interfaceC34415OooO0oo);
        C33632Oooo o0oo00o2 = enumC33637Oooo0O02 == enumC33637Oooo0O0 ? new o0OO00O(interfaceC34415OooO0ooOooO0O0, interfaceC32508OooOOOo) : new C33632Oooo(interfaceC34415OooO0ooOooO0O0, true, true);
        o0oo00o2.Ooooooo(enumC33637Oooo0O02, o0oo00o2, interfaceC32508OooOOOo);
        return o0oo00o2;
    }

    public static final o00000OO OooO0O0(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, EnumC33637Oooo0O0 enumC33637Oooo0O0, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0O0 = C33628OooOoo.OooO0O0(interfaceC33636Oooo00o, interfaceC34415OooO0oo);
        enumC33637Oooo0O0.getClass();
        o00000OO oo0o0oo = enumC33637Oooo0O0 == EnumC33637Oooo0O0.f121316OooOo ? new oo0o0Oo(interfaceC34415OooO0ooOooO0O0, interfaceC32508OooOOOo) : new o00000OO(interfaceC34415OooO0ooOooO0O0, true, true);
        oo0o0oo.Ooooooo(enumC33637Oooo0O0, oo0o0oo, interfaceC32508OooOOOo);
        return oo0o0oo;
    }

    public static /* synthetic */ o00000OO OooO0OO(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, EnumC33637Oooo0O0 enumC33637Oooo0O0, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i) {
        if ((i & 1) != 0) {
            interfaceC34415OooO0oo = oOo0000O.OooO.f123416OooOo0o;
        }
        if ((i & 2) != 0) {
            enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121317OooOo0o;
        }
        return OooO0O0(interfaceC33636Oooo00o, interfaceC34415OooO0oo, enumC33637Oooo0O0, interfaceC32508OooOOOo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T OooO0Oo(InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super T>, ? extends Object> interfaceC32508OooOOOo) throws Throwable {
        AbstractC33655OooooO0 abstractC33655OooooO0OooO00o;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC34412OooO0o.OooO00o oooO00o = InterfaceC34412OooO0o.OooO00o.f123422OooOo0o;
        InterfaceC34412OooO0o interfaceC34412OooO0o = (InterfaceC34412OooO0o) interfaceC34415OooO0oo.get(oooO00o);
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        if (interfaceC34412OooO0o == null) {
            abstractC33655OooooO0OooO00o = o0000Ooo.OooO00o();
            interfaceC34415OooO0ooOooO00o = C33628OooOoo.OooO00o(oooO, interfaceC34415OooO0oo.plus(abstractC33655OooooO0OooO00o), true);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (interfaceC34415OooO0ooOooO00o != c33874OooO0OO && interfaceC34415OooO0ooOooO00o.get(oooO00o) == null) {
                interfaceC34415OooO0ooOooO00o = interfaceC34415OooO0ooOooO00o.plus(c33874OooO0OO);
            }
        } else {
            if (interfaceC34412OooO0o instanceof AbstractC33655OooooO0) {
            }
            abstractC33655OooooO0OooO00o = o0000Ooo.f121365OooO00o.get();
            interfaceC34415OooO0ooOooO00o = C33628OooOoo.OooO00o(oooO, interfaceC34415OooO0oo, true);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            if (interfaceC34415OooO0ooOooO00o != c33874OooO0OO2 && interfaceC34415OooO0ooOooO00o.get(oooO00o) == null) {
                interfaceC34415OooO0ooOooO00o = interfaceC34415OooO0ooOooO00o.plus(c33874OooO0OO2);
            }
        }
        C33606OooO0o c33606OooO0o = new C33606OooO0o(interfaceC34415OooO0ooOooO00o, threadCurrentThread, abstractC33655OooooO0OooO00o);
        c33606OooO0o.Ooooooo(EnumC33637Oooo0O0.f121317OooOo0o, c33606OooO0o, interfaceC32508OooOOOo);
        AbstractC33655OooooO0 abstractC33655OooooO0 = c33606OooO0o.f121287OooOoOO;
        if (abstractC33655OooooO0 != null) {
            int i = AbstractC33655OooooO0.f121334OooOoo0;
            abstractC33655OooooO0.o000Oo0O(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jO000Oo0o = abstractC33655OooooO0 != null ? abstractC33655OooooO0.o000Oo0o() : LocationRequestCompat.PASSIVE_INTERVAL;
                if (c33606OooO0o.isCompleted()) {
                    if (abstractC33655OooooO0 != null) {
                        int i2 = AbstractC33655OooooO0.f121334OooOoo0;
                        abstractC33655OooooO0.o000OOoO(false);
                    }
                    T t = (T) o0Oo0oo.OooO00o(o0ooOOo.f121392OooOo0o.get(c33606OooO0o));
                    C33620OooOo c33620OooOo = t instanceof C33620OooOo ? (C33620OooOo) t : null;
                    if (c33620OooOo == null) {
                        return t;
                    }
                    throw c33620OooOo.f121304OooO00o;
                }
                LockSupport.parkNanos(c33606OooO0o, jO000Oo0o);
            } catch (Throwable th) {
                if (abstractC33655OooooO0 != null) {
                    int i3 = AbstractC33655OooooO0.f121334OooOoo0;
                    abstractC33655OooooO0.o000OOoO(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c33606OooO0o.OooOo0(interruptedException);
        throw interruptedException;
    }

    public static final <T> Object OooO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super T>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super T> continuation) throws Throwable {
        Object objOooO00o;
        InterfaceC34415OooO0oo context = continuation.getContext();
        InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = !((Boolean) interfaceC34415OooO0oo.fold(Boolean.FALSE, new C31071OoooO(1))).booleanValue() ? context.plus(interfaceC34415OooO0oo) : C33628OooOoo.OooO00o(context, interfaceC34415OooO0oo, false);
        oO00o00.OooO0OO.OooO0OO(interfaceC34415OooO0ooPlus);
        if (interfaceC34415OooO0ooPlus == context) {
            C33835OooOOo c33835OooOOo = new C33835OooOOo(continuation, interfaceC34415OooO0ooPlus);
            objOooO00o = o00OO00O.OooO0O0.OooO0o0(c33835OooOOo, c33835OooOOo, interfaceC32508OooOOOo);
        } else {
            InterfaceC34412OooO0o.OooO00o oooO00o = InterfaceC34412OooO0o.OooO00o.f123422OooOo0o;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34415OooO0ooPlus.get(oooO00o), context.get(oooO00o))) {
                o0000O0 o0000o0 = new o0000O0(continuation, interfaceC34415OooO0ooPlus);
                InterfaceC34415OooO0oo interfaceC34415OooO0oo2 = o0000o0.f121272OooOoO0;
                Object objOooO0OO = C33844OooOoO0.OooO0OO(interfaceC34415OooO0oo2, null);
                try {
                    Object objOooO0o0 = o00OO00O.OooO0O0.OooO0o0(o0000o0, o0000o0, interfaceC32508OooOOOo);
                    C33844OooOoO0.OooO00o(interfaceC34415OooO0oo2, objOooO0OO);
                    objOooO00o = objOooO0o0;
                } catch (Throwable th) {
                    C33844OooOoO0.OooO00o(interfaceC34415OooO0oo2, objOooO0OO);
                    throw th;
                }
            } else {
                C33643OoooO c33643OoooO = new C33643OoooO(continuation, interfaceC34415OooO0ooPlus);
                try {
                    C33826OooO0oO.OooO00o(C32460OooOooO.f116667OooO00o, C21904OooOoo0.OooO0o0(C21904OooOoo0.OooO0O0(c33643OoooO, c33643OoooO, interfaceC32508OooOOOo)));
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C33643OoooO.f121325OooOoOO;
                        int i = atomicIntegerFieldUpdater.get(c33643OoooO);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objOooO00o = o0Oo0oo.OooO00o(o0ooOOo.f121392OooOo0o.get(c33643OoooO));
                            if (objOooO00o instanceof C33620OooOo) {
                                throw ((C33620OooOo) objOooO00o).f121304OooO00o;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c33643OoooO, 0, 1)) {
                            objOooO00o = EnumC32485OooO00o.f116726OooOo0o;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c33643OoooO.resumeWith(C32446OooOOOo.OooO00o(th2));
                    throw th2;
                }
            }
        }
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooO00o;
    }
}
