package oOo00ooo;

import java.util.Objects;
import oO00o.AbstractC32316OooO0OO;
import oO00o.InterfaceC32317OooO0Oo;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO0.EnumC32398OooO0OO;
import oO00oO00.InterfaceC32404OooO0Oo;
import oO0OoooO.C33519OooO00o;
import oO0o0OO.C33669o000oOoO;

/* JADX INFO: renamed from: oOo00ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34576OooO<T, R> extends AbstractC32316OooO0OO<R> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f123829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33519OooO00o.C33520OooO0Oo f123830OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public C34576OooO(Object obj) {
        C33519OooO00o.C33520OooO0Oo c33520OooO0Oo = C33519OooO00o.f121087OooO00o;
        this.f123829OooO00o = obj;
        this.f123830OooO0O0 = c33520OooO0Oo;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super R> interfaceC32319OooO0o0) {
        EnumC32398OooO0OO enumC32398OooO0OO = EnumC32398OooO0OO.f116503OooOo0o;
        try {
            C33519OooO00o.C33520OooO0Oo c33520OooO0Oo = this.f123830OooO0O0;
            T t = this.f123829OooO00o;
            c33520OooO0Oo.getClass();
            Objects.requireNonNull(t, "The mapper returned a null ObservableSource");
            InterfaceC32317OooO0Oo interfaceC32317OooO0Oo = (InterfaceC32317OooO0Oo) t;
            if (!(interfaceC32317OooO0Oo instanceof InterfaceC32404OooO0Oo)) {
                interfaceC32317OooO0Oo.OooO00o(interfaceC32319OooO0o0);
                return;
            }
            try {
                Object obj = ((InterfaceC32404OooO0Oo) interfaceC32317OooO0Oo).get();
                if (obj == null) {
                    interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
                    interfaceC32319OooO0o0.onComplete();
                } else {
                    RunnableC34584OooO0oo runnableC34584OooO0oo = new RunnableC34584OooO0oo(interfaceC32319OooO0o0, obj);
                    interfaceC32319OooO0o0.OooO00o(runnableC34584OooO0oo);
                    runnableC34584OooO0oo.run();
                }
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
                interfaceC32319OooO0o0.onError(th);
            }
        } catch (Throwable th2) {
            C33669o000oOoO.OooO0O0(th2);
            interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
            interfaceC32319OooO0o0.onError(th2);
        }
    }
}
