package oO0Ooo;

import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;

/* JADX INFO: renamed from: oO0Ooo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33317OooOoO extends AbstractC33350Oooooo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32637OoooOoo[] f120556OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33348OooooOO[] f120557OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f120558OooO0Oo;

    public C33317OooOoO() {
        throw null;
    }

    public C33317OooOoO(InterfaceC32637OoooOoo[] parameters, InterfaceC33348OooooOO[] arguments, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parameters, "parameters");
        kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
        this.f120556OooO0O0 = parameters;
        this.f120557OooO0OO = arguments;
        this.f120558OooO0Oo = z;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final boolean OooO0O0() {
        return this.f120558OooO0Oo;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final InterfaceC33348OooooOO OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo) {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        InterfaceC32637OoooOoo interfaceC32637OoooOoo = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo ? (InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO : null;
        if (interfaceC32637OoooOoo != null) {
            int index = interfaceC32637OoooOoo.getIndex();
            InterfaceC32637OoooOoo[] interfaceC32637OoooOooArr = this.f120556OooO0O0;
            if (index < interfaceC32637OoooOooArr.length && kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC32637OoooOooArr[index].OooO(), interfaceC32637OoooOoo.OooO())) {
                return this.f120557OooO0OO[index];
            }
        }
        return null;
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final boolean OooO0o0() {
        return this.f120557OooO0OO.length == 0;
    }
}
