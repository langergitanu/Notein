package oO0OOOoO;

import OooOoO.C20503OooO00o;
import java.util.concurrent.Callable;
import o0o0OO0.C30416Oooo0OO;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33497OooOOO;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO0OOOoO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33021OooOOO0<T, R> extends AbstractC33498OooOOO0<R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C20503OooO00o f119477OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f119478OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C33021OooOOO0(Object obj, C20503OooO00o c20503OooO00o) {
        this.f119478OooOo0o = obj;
        this.f119477OooOo = c20503OooO00o;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super R> interfaceC33499OooOOOO) {
        EnumC35110OooO0OO enumC35110OooO0OO = EnumC35110OooO0OO.f126094OooOo0o;
        try {
            InterfaceC33497OooOOO interfaceC33497OooOOO = (InterfaceC33497OooOOO) this.f119477OooOo.apply(this.f119478OooOo0o);
            if (!(interfaceC33497OooOOO instanceof Callable)) {
                interfaceC33497OooOOO.OooO0O0(interfaceC33499OooOOOO);
                return;
            }
            try {
                Object objCall = ((Callable) interfaceC33497OooOOO).call();
                if (objCall == null) {
                    interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                    interfaceC33499OooOOOO.onComplete();
                } else {
                    RunnableC33019OooOO0o runnableC33019OooOO0o = new RunnableC33019OooOO0o(interfaceC33499OooOOOO, objCall);
                    interfaceC33499OooOOOO.OooO00o(runnableC33019OooOO0o);
                    runnableC33019OooOO0o.run();
                }
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                interfaceC33499OooOOOO.onError(th);
            }
        } catch (Throwable th2) {
            interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
            interfaceC33499OooOOOO.onError(th2);
        }
    }
}
