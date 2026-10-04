package oO0OOo0;

import com.facebook.soloader.OooOo;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0O0O0o.OooOO0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO.C33460OooOO0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33348OooooOO f119500OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C33460OooOO0O f119501OooO0O0;

    public OooO0OO(InterfaceC33348OooooOO projection) {
        OooOOO0.OooO0oO(projection, "projection");
        this.f119500OooO00o = projection;
        projection.OooO0OO();
    }

    @Override // oO0OOo0.OooO0O0
    public final InterfaceC33348OooooOO OooO0O0() {
        return this.f119500OooO00o;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final /* bridge */ /* synthetic */ InterfaceC32598OooO0oo OooO0OO() {
        return null;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final Collection<AbstractC33320OooOoo> OooO0Oo() {
        InterfaceC33348OooooOO interfaceC33348OooooOO = this.f119500OooO00o;
        AbstractC33320OooOoo type = interfaceC33348OooooOO.OooO0OO() == 3 ? interfaceC33348OooooOO.getType() : OooOO0O().OooOOO();
        OooOOO0.OooO0o(type, "if (projection.projectio… builtIns.nullableAnyType");
        return OooOo.OooO0oO(type);
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final OooOO0 OooOO0O() {
        OooOO0 oooOO0OooOO0O = this.f119500OooO00o.getType().o00000().OooOO0O();
        OooOOO0.OooO0o(oooOO0OooOO0O, "projection.type.constructor.builtIns");
        return oooOO0OooOO0O;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f119500OooO00o + ')';
    }
}
