package o000o0O0;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import o0000OOo.C24217OooO0O0;
import o000o0O0.OooO0o;
import oO00ooO.InterfaceC32440OooOO0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: o000o0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24568OooO0oO<Args extends OooO0o> implements InterfaceC32440OooOO0<Args> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f83184OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo<Args> f83185OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Args f83186OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public C24568OooO0oO(InterfaceC34595OooO0Oo<Args> navArgsClass, oO0O000o.OooO00o<Bundle> oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(navArgsClass, "navArgsClass");
        this.f83185OooOo0o = navArgsClass;
        this.f83184OooOo = (kotlin.jvm.internal.OooOOOO) oooO00o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // oO00ooO.InterfaceC32440OooOO0
    public final Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.f83186OooOoO0;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.f83184OooOo.invoke();
        OooOo.OooO00o<InterfaceC34595OooO0Oo<? extends OooO0o>, Method> oooO00o = C24569OooO0oo.f83188OooO0O0;
        InterfaceC34595OooO0Oo<Args> interfaceC34595OooO0Oo = this.f83185OooOo0o;
        Method method = oooO00o.get((InterfaceC34595OooO0Oo<? extends OooO0o>) interfaceC34595OooO0Oo);
        if (method == null) {
            method = C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo).getMethod("fromBundle", (Class[]) Arrays.copyOf(C24569OooO0oo.f83187OooO00o, 1));
            oooO00o.put((InterfaceC34595OooO0Oo<? extends OooO0o>) interfaceC34595OooO0Oo, method);
            kotlin.jvm.internal.OooOOO0.OooO0o(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = method.invoke(null, bundle);
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        Args args2 = (Args) objInvoke;
        this.f83186OooOoO0 = args2;
        return args2;
    }

    @Override // oO00ooO.InterfaceC32440OooOO0
    public final boolean isInitialized() {
        return this.f83186OooOoO0 != null;
    }
}
