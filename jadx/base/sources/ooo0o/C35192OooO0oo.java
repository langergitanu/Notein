package ooo0o;

import java.util.HashMap;
import java.util.List;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.o000oOoO;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.C33044OooOOoo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.C34586OooO0Oo;
import ooOOOoo0.C35107OooO0O0;
import ooo0o.C35191OooO0oO;

/* JADX INFO: renamed from: ooo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35192OooO0oo extends C35191OooO0oO.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<C33479OooO0o, AbstractC33038OooO0oO<?>> f126355OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C35191OooO0oO f126356OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32596OooO0o0 f126357OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List<oOo0oooO.OooO0OO> f126358OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ C33476OooO0O0 f126359OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f126360OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35192OooO0oo(C35191OooO0oO c35191OooO0oO, InterfaceC32596OooO0o0 interfaceC32596OooO0o0, C33476OooO0O0 c33476OooO0O0, List<oOo0oooO.OooO0OO> list, o000oOoO o000oooo2) {
        super();
        this.f126356OooO0OO = c35191OooO0oO;
        this.f126357OooO0Oo = interfaceC32596OooO0o0;
        this.f126359OooO0o0 = c33476OooO0O0;
        this.f126358OooO0o = list;
        this.f126360OooO0oO = o000oooo2;
        this.f126355OooO0O0 = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
    public final void OooO00o() {
        HashMap<C33479OooO0o, AbstractC33038OooO0oO<?>> arguments = this.f126355OooO0O0;
        C35191OooO0oO c35191OooO0oO = this.f126356OooO0OO;
        c35191OooO0oO.getClass();
        C33476OooO0O0 c33476OooO0O0 = this.f126359OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
        boolean zOooOOOo = false;
        if (c33476OooO0O0.equals(C35107OooO0O0.f126090OooO0O0)) {
            AbstractC33038OooO0oO<?> abstractC33038OooO0oO = arguments.get(C33479OooO0o.OooO0o0("value"));
            C33044OooOOoo c33044OooOOoo = abstractC33038OooO0oO instanceof C33044OooOOoo ? (C33044OooOOoo) abstractC33038OooO0oO : null;
            if (c33044OooOOoo != null) {
                T t = c33044OooOOoo.f119483OooO00o;
                C33044OooOOoo.OooO00o.OooO0O0 oooO0O0 = t instanceof C33044OooOOoo.OooO00o.OooO0O0 ? (C33044OooOOoo.OooO00o.OooO0O0) t : null;
                if (oooO0O0 != null) {
                    zOooOOOo = c35191OooO0oO.OooOOOo(oooO0O0.f119493OooO00o.f119481OooO00o);
                }
            }
        }
        if (zOooOOOo || c35191OooO0oO.OooOOOo(c33476OooO0O0)) {
            return;
        }
        this.f126358OooO0o.add(new C34586OooO0Oo(this.f126357OooO0Oo.OooOOO(), arguments, this.f126360OooO0oO));
    }
}
