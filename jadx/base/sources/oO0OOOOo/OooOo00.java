package oO0OOOOo;

import java.util.concurrent.Callable;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0OOOo0.C33006OooO0o0;
import oO0OOOo0.EnumC33004OooO0Oo;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 {

    public static final class OooO00o<T, R> extends AbstractC33491OooO0o0<R> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final T f119345OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super T, ? extends oOO00OOO.OooO00o<? extends R>> f119346OooOoO0;

        public OooO00o(T t, InterfaceC32331OooO0OO<? super T, ? extends oOO00OOO.OooO00o<? extends R>> interfaceC32331OooO0OO) {
            this.f119345OooOo = t;
            this.f119346OooOoO0 = interfaceC32331OooO0OO;
        }

        @Override // oO0OooOO.AbstractC33491OooO0o0
        public final void OooO0Oo(oOO00OOO.OooO0O0<? super R> oooO0O0) {
            try {
                oOO00OOO.OooO00o<? extends R> oooO00oApply = this.f119346OooOoO0.apply(this.f119345OooOo);
                o00Oo0.OooO00o(oooO00oApply, "The mapper returned a null Publisher");
                oOO00OOO.OooO00o<? extends R> oooO00o = oooO00oApply;
                if (!(oooO00o instanceof Callable)) {
                    oooO00o.subscribe(oooO0O0);
                    return;
                }
                try {
                    Object objCall = ((Callable) oooO00o).call();
                    if (objCall == null) {
                        EnumC33004OooO0Oo.OooO00o((InterfaceC33493OooO0oo) oooO0O0);
                    } else {
                        oooO0O0.OooO0Oo(new C33006OooO0o0((InterfaceC33493OooO0oo) oooO0O0, objCall));
                    }
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    EnumC33004OooO0Oo.OooO0OO(th, (InterfaceC33493OooO0oo) oooO0O0);
                }
            } catch (Throwable th2) {
                EnumC33004OooO0Oo.OooO0OO(th2, (InterfaceC33493OooO0oo) oooO0O0);
            }
        }
    }

    public static boolean OooO00o(oOO00OOO.OooO00o oooO00o, InterfaceC33493OooO0oo interfaceC33493OooO0oo, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        if (!(oooO00o instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) oooO00o).call();
            if (objCall == null) {
                EnumC33004OooO0Oo.OooO00o(interfaceC33493OooO0oo);
                return true;
            }
            try {
                Object objApply = interfaceC32331OooO0OO.apply(objCall);
                o00Oo0.OooO00o(objApply, "The mapper returned a null Publisher");
                oOO00OOO.OooO00o oooO00o2 = (oOO00OOO.OooO00o) objApply;
                if (!(oooO00o2 instanceof Callable)) {
                    oooO00o2.subscribe(interfaceC33493OooO0oo);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) oooO00o2).call();
                    if (objCall2 == null) {
                        EnumC33004OooO0Oo.OooO00o(interfaceC33493OooO0oo);
                        return true;
                    }
                    interfaceC33493OooO0oo.OooO0Oo(new C33006OooO0o0(interfaceC33493OooO0oo, objCall2));
                    return true;
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    EnumC33004OooO0Oo.OooO0OO(th, interfaceC33493OooO0oo);
                    return true;
                }
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                EnumC33004OooO0Oo.OooO0OO(th2, interfaceC33493OooO0oo);
                return true;
            }
        } catch (Throwable th3) {
            C30416Oooo0OO.OooO00o(th3);
            EnumC33004OooO0Oo.OooO0OO(th3, interfaceC33493OooO0oo);
            return true;
        }
    }
}
