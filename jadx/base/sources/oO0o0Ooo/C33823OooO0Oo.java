package oO0o0Ooo;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0OO.InterfaceC33631OooOooo;
import oO0o0OOO.C33682OooO0O0;

/* JADX INFO: renamed from: oO0o0Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33823OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Collection<InterfaceC33631OooOooo> f121917OooO00o;

    static {
        try {
            f121917OooO00o = C33576OooOOOo.OooOo0(C33574OooOOO0.OooO0o(Arrays.asList(new C33682OooO0O0()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
