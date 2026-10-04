package oOo0oooO;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OooO0.C33477OooO0OO;
import oO0o0O0O.C33566OooO0o;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 implements InterfaceC34588OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<InterfaceC34588OooO0oO> f123921OooOo0o;

    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<InterfaceC34588OooO0oO, OooO0OO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33477OooO0OO f123922OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33477OooO0OO c33477OooO0OO) {
            super(1);
            this.f123922OooOo0o = c33477OooO0OO;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final OooO0OO invoke(InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
            InterfaceC34588OooO0oO it = interfaceC34588OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return it.OooOOO0(this.f123922OooOo0o);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32507OooOO0o<InterfaceC34588OooO0oO, InterfaceC33569OooO0oo<? extends OooO0OO>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f123923OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final InterfaceC33569OooO0oo<? extends OooO0OO> invoke(InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
            InterfaceC34588OooO0oO it = interfaceC34588OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return OooOo.OooOooo(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0(List<? extends InterfaceC34588OooO0oO> list) {
        this.f123921OooOo0o = list;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final OooO0OO OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        return (OooO0OO) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOo00(OooOo.OooOooo(this.f123921OooOo0o), new OooO00o(fqName)));
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean Oooo000(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        Iterator it = OooOo.OooOooo(this.f123921OooOo0o).f123452OooO00o.iterator();
        while (it.hasNext()) {
            if (((InterfaceC34588OooO0oO) it.next()).Oooo000(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean isEmpty() {
        List<InterfaceC34588OooO0oO> list = this.f123921OooOo0o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC34588OooO0oO) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<OooO0OO> iterator() {
        return new C33566OooO0o.OooO00o(C33576OooOOOo.OooOOOo(OooOo.OooOooo(this.f123921OooOo0o), OooO0O0.f123923OooOo0o));
    }

    public OooOO0(InterfaceC34588OooO0oO... interfaceC34588OooO0oOArr) {
        this.f123921OooOo0o = OooOOO.OoooOO0(interfaceC34588OooO0oOArr);
    }
}
