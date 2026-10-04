package o0oo00OO;

import android.os.Build;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0oo00Oo.C31199OooO00o;
import o0oo00oO.InterfaceC31211OooO0Oo;
import o0oo00oO.InterfaceC31213OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0oo00OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31198OooO00o implements InterfaceC31211OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC31213OooO0oO f111250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C31199OooO00o f111251OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<InterfaceC31211OooO0Oo.OooO00o> f111252OooO0OO;

    /* JADX INFO: renamed from: o0oo00OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C20163OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f111253OooO00o;

        static {
            int[] iArr = new int[InterfaceC31211OooO0Oo.OooO00o.values().length];
            try {
                InterfaceC31211OooO0Oo.OooO00o oooO00o = InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111253OooO00o = iArr;
        }
    }

    public C31198OooO00o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, InterfaceC31213OooO0oO interfaceC31213OooO0oO) {
        this.f111250OooO00o = interfaceC31213OooO0oO;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("LenovoPenCapabilityProvider");
        c20358OooO00o.OooO00o("LenovoPenCapabilityProvider initialized", new Object[0]);
        this.f111252OooO0OO = C34449Oooo0oo.OooOO0(InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o);
    }

    @Override // o0oo00oO.InterfaceC31211OooO0Oo
    public final <T> T OooO00o(InterfaceC31211OooO0Oo.OooO00o oooO00o) {
        T t;
        if (C20163OooO00o.f111253OooO00o[oooO00o.ordinal()] != 1 || (t = (T) this.f111251OooO0O0) == null) {
            return null;
        }
        return t;
    }

    public final boolean OooO0O0() {
        String MANUFACTURER = Build.MANUFACTURER;
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        Locale locale = Locale.ROOT;
        String lowerCase = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String lowerCase2 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
        return C33599OooOo0O.OooOoOO(lowerCase, "lenovo", false) || C33599OooOo0O.OooOoOO(lowerCase2, "lenovo", false);
    }

    @Override // o0oo00oO.InterfaceC31211OooO0Oo
    public final boolean initialize() {
        if (!OooO0O0()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LenovoPenCapabilityProvider");
            c20358OooO00o.OooOO0O("Device not supported, initialization failed", new Object[0]);
            return false;
        }
        if ((OooO0O0() ? this.f111252OooO0OO : C34438OooOoo0.f123458OooOo0o).contains(InterfaceC31211OooO0Oo.OooO00o.f111301OooOo0o)) {
            C31199OooO00o c31199OooO00o = new C31199OooO00o(this.f111250OooO00o);
            try {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("LenovoStylusEvent");
                c20358OooO00o2.OooO0o0("Lenovo stylus event capability initialized successfully", new Object[0]);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("LenovoStylusEvent");
                c20358OooO00o3.OooO0Oo(e, "Failed to initialize Lenovo stylus event capability", new Object[0]);
            }
            this.f111251OooO0O0 = c31199OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("LenovoPenCapabilityProvider");
        c20358OooO00o4.OooO0o0("Lenovo pen capabilities initialized successfully", new Object[0]);
        return true;
    }

    @Override // o0oo00oO.InterfaceC31211OooO0Oo
    public final void release() {
        this.f111251OooO0O0 = null;
    }
}
