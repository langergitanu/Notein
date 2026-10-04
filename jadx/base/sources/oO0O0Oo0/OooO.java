package oO0O0Oo0;

import java.util.Collection;
import java.util.List;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Oo00.C33194OooO0O0;
import oO0OoOO.C33279OooOOOo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.InterfaceC33342OoooOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC33342OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32670OooO0oo f117385OooO00o;

    public OooO(AbstractC32670OooO0oo abstractC32670OooO0oo) {
        this.f117385OooO00o = abstractC32670OooO0oo;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final InterfaceC32598OooO0oo OooO0OO() {
        return this.f117385OooO00o;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final Collection<AbstractC33320OooOoo> OooO0Oo() {
        Collection<AbstractC33320OooOoo> collectionOooO0Oo = ((C33279OooOOOo) this.f117385OooO00o).o0ooOOo().o00000().OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooO0Oo, "declarationDescriptor.un…pe.constructor.supertypes");
        return collectionOooO0Oo;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return true;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final oO0O0O0o.OooOO0 OooOO0O() {
        return C33194OooO0O0.OooO0o0(this.f117385OooO00o);
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        List list = ((C33279OooOOOo) this.f117385OooO00o).f120492Oooo0o;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f117385OooO00o.getName().OooO0O0() + ']';
    }
}
