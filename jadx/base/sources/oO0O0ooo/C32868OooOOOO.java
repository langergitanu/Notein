package oO0O0ooo;

import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0ooo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32868OooOOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC33354o00o0O, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32868OooOOOO f117955OooOo0o = new C32868OooOOOO(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(AbstractC33354o00o0O abstractC33354o00o0O) {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33354o00o0O.o00000().OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO == null) {
            return Boolean.FALSE;
        }
        C33479OooO0o name = interfaceC32598OooO0ooOooO0OO.getName();
        C33477OooO0OO c33477OooO0OO = oO0O0O.OooO0OO.f116826OooO0o;
        return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0(name, c33477OooO0OO.OooO0o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(C33194OooO0O0.OooO0OO(interfaceC32598OooO0ooOooO0OO), c33477OooO0OO));
    }
}
