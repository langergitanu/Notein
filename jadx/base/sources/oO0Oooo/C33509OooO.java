package oO0Oooo;

import com.aspose.slides.C22220Oooo00o;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.OooOO0O;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: oO0Oooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33509OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33509OooO f121032OooO00o = new C33509OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33512OooO0OO f121033OooO0O0 = C33512OooO0OO.f121040OooOo0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33510OooO00o f121034OooO0OO = new C33510OooO00o(C33479OooO0o.OooO0oO(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33514OooO0o f121035OooO0Oo = OooO0OO(EnumC33517OooO0oo.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33514OooO0o f121037OooO0o0 = OooO0OO(EnumC33517OooO0oo.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Set<InterfaceC32627Oooo0oo> f121036OooO0o = C34449Oooo0oo.OooOO0(new C33513OooO0Oo());

    public static final C33515OooO0o0 OooO00o(int i, boolean z, String... formatParams) {
        C22220Oooo00o.OooO0OO(i, "kind");
        OooOOO0.OooO0oO(formatParams, "formatParams");
        if (!z) {
            return new C33515OooO0o0(i, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        OooOOO0.OooO0oO(formatParams2, "formatParams");
        return new C33518OooOO0(i, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final C33515OooO0o0 OooO0O0(int i, String... strArr) {
        C22220Oooo00o.OooO0OO(i, "kind");
        return OooO00o(i, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C33514OooO0o OooO0OO(EnumC33517OooO0oo kind, String... strArr) {
        OooOOO0.OooO0oO(kind, "kind");
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        OooOOO0.OooO0oO(formatParams, "formatParams");
        return OooO0o0(kind, c34434OooOoO, OooO0Oo(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static C33516OooO0oO OooO0Oo(EnumC33517OooO0oo kind, String... formatParams) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(formatParams, "formatParams");
        return new C33516OooO0oO(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean OooO0o(OooOO0O oooOO0O) {
        if (oooOO0O != null) {
            return (oooOO0O instanceof C33510OooO00o) || (oooOO0O.OooO0Oo() instanceof C33510OooO00o) || oooOO0O == f121033OooO0O0;
        }
        return false;
    }

    public static C33514OooO0o OooO0o0(EnumC33517OooO0oo kind, List list, InterfaceC33342OoooOo0 interfaceC33342OoooOo0, String... formatParams) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(formatParams, "formatParams");
        return new C33514OooO0o(interfaceC33342OoooOo0, OooO0O0(7, interfaceC33342OoooOo0.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }
}
