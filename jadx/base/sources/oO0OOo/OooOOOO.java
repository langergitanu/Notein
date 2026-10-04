package oO0OOo;

import OooOoOO.C20519OooO0Oo;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import oO00ooO.C32447OooOOo;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Oooo.C33509OooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO implements InterfaceC33342OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<AbstractC33320OooOoo> f119488OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32447OooOOo f119489OooO0O0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<AbstractC33328Oooo0O0>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final List<AbstractC33328Oooo0O0> invoke() {
            OooOOOO.this.getClass();
            throw null;
        }
    }

    public OooOOOO() {
        throw null;
    }

    public OooOOOO(Set set) {
        C33339OoooOOO.f120598OooOo.getClass();
        C33339OoooOOO attributes = C33339OoooOOO.f120599OooOoO0;
        int i = C33322OooOooO.f120569OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(attributes, "attributes");
        C33322OooOooO.OooO0o(C34434OooOoO.f123453OooOo0o, C33509OooO.OooO00o(2, true, "unknown integer literal type"), attributes, this, false);
        this.f119489OooO0O0 = C20519OooO0Oo.OooO0OO(new OooO00o());
        this.f119488OooO00o = set;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final InterfaceC32598OooO0oo OooO0OO() {
        return null;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final Collection<AbstractC33320OooOoo> OooO0Oo() {
        return (List) this.f119489OooO0O0.getValue();
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final oO0O0O0o.OooOO0 OooOO0O() {
        throw null;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + oOo000Oo.OooOo.o000oOoO(this.f119488OooO00o, ",", null, null, C33041OooOOOo.f119491OooOo0o, 30) + ']');
        return sb.toString();
    }
}
