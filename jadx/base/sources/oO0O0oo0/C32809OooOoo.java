package oO0O0oo0;

import java.util.Collection;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0o0O0.C33552OooO00o;

/* JADX INFO: renamed from: oO0O0oo0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32809OooOoo extends C33552OooO00o.OooO0O0<InterfaceC32596OooO0o0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C32784OooO0o0 f117877OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Set<Object> f117878OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f117879OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C32809OooOoo(C32784OooO0o0 c32784OooO0o0, Set set, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        this.f117877OooO00o = c32784OooO0o0;
        this.f117878OooO0O0 = set;
        this.f117879OooO0OO = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
    }

    @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final /* bridge */ /* synthetic */ Object OooO00o() {
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO0o0O0.C33552OooO00o.InterfaceC33553OooO0Oo
    public final boolean OooO0O0(Object obj) {
        InterfaceC32596OooO0o0 current = (InterfaceC32596OooO0o0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(current, "current");
        if (current == this.f117877OooO00o) {
            return true;
        }
        oO0Oo0o0.OooOO0 oooOO0O00Ooo = current.o00Ooo();
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0O00Ooo, "current.staticScope");
        if (!(oooOO0O00Ooo instanceof AbstractC32812OooOooo)) {
            return true;
        }
        this.f117878OooO0O0.addAll((Collection) this.f117879OooO0OO.invoke(oooOO0O00Ooo));
        return false;
    }
}
