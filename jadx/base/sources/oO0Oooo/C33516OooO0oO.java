package oO0Oooo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0O0O0o.C32587OooO0Oo;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.InterfaceC33342OoooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0Oooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33516OooO0oO implements InterfaceC33342OoooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC33517OooO0oo f121052OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String[] f121053OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f121054OooO0OO;

    public C33516OooO0oO(EnumC33517OooO0oo kind, String... formatParams) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(formatParams, "formatParams");
        this.f121052OooO00o = kind;
        this.f121053OooO0O0 = formatParams;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f121054OooO0OO = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(kind.f121086OooOo0o, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final InterfaceC32598OooO0oo OooO0OO() {
        C33509OooO.f121032OooO00o.getClass();
        return C33509OooO.f121034OooO0OO;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final Collection<AbstractC33320OooOoo> OooO0Oo() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final oO0O0O0o.OooOO0 OooOO0O() {
        C32587OooO0Oo c32587OooO0Oo = C32587OooO0Oo.f117102OooO0o;
        return C32587OooO0Oo.f117102OooO0o;
    }

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    public final List<InterfaceC32637OoooOoo> getParameters() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final String toString() {
        return this.f121054OooO0OO;
    }
}
