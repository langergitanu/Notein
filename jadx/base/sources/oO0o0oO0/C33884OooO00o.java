package oO0o0oO0;

import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import o00OO0oo.RunnableC25005OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33644OoooO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33884OooO00o extends C24019OooOO0o implements InterfaceC32510OooOOo0<C33885OooO0O0, InterfaceC33883OooO<?>, Object, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C33884OooO00o f122060OooOo0o = new C33884OooO00o(3, C33885OooO0O0.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final C32460OooOooO invoke(C33885OooO0O0 c33885OooO0O0, InterfaceC33883OooO<?> interfaceC33883OooO, Object obj) {
        C33885OooO0O0 c33885OooO0O02 = c33885OooO0O0;
        InterfaceC33883OooO<?> interfaceC33883OooO2 = interfaceC33883OooO;
        long j = c33885OooO0O02.f122061OooO00o;
        if (j <= 0) {
            interfaceC33883OooO2.OooO0Oo(C32460OooOooO.f116667OooO00o);
        } else {
            RunnableC25005OooO00o runnableC25005OooO00o = new RunnableC25005OooO00o(interfaceC33883OooO2, c33885OooO0O02);
            OooOOO0.OooO0o0(interfaceC33883OooO2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C33890OooO0oO c33890OooO0oO = (C33890OooO0oO) interfaceC33883OooO2;
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = c33890OooO0oO.f122067OooOo0o;
            c33890OooO0oO.f122069OooOoO0 = C33644OoooO0.OooO0O0(interfaceC34415OooO0oo).OooOooo(j, runnableC25005OooO00o, interfaceC34415OooO0oo);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
