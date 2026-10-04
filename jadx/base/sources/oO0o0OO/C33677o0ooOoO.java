package oO0o0OO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.o0ooOOo.C33674OooO0Oo;
import oO0o0oO0.InterfaceC33883OooO;

/* JADX INFO: renamed from: oO0o0OO.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33677o0ooOoO extends C24019OooOO0o implements InterfaceC32510OooOOo0<o0ooOOo, InterfaceC33883OooO<?>, Object, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C33677o0ooOoO f121412OooOo0o = new C33677o0ooOoO(3, o0ooOOo.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final C32460OooOooO invoke(o0ooOOo o0ooooo2, InterfaceC33883OooO<?> interfaceC33883OooO, Object obj) {
        o0ooOOo o0ooooo3 = o0ooooo2;
        InterfaceC33883OooO<?> interfaceC33883OooO2 = interfaceC33883OooO;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o0ooOOo.f121392OooOo0o;
        o0ooooo3.getClass();
        while (true) {
            Object objOooO00o = o0ooOOo.f121392OooOo0o.get(o0ooooo3);
            if (!(objOooO00o instanceof InterfaceC33678ooOO)) {
                if (!(objOooO00o instanceof C33620OooOo)) {
                    objOooO00o = o0Oo0oo.OooO00o(objOooO00o);
                }
                interfaceC33883OooO2.OooO0Oo(objOooO00o);
            } else if (o0ooooo3.Ooooo0o(objOooO00o) >= 0) {
                interfaceC33883OooO2.OooO0O0(oO00o00.OooO0OO.OooO0o0(o0ooooo3, o0ooooo3.new C33674OooO0Oo(interfaceC33883OooO2)));
                break;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
