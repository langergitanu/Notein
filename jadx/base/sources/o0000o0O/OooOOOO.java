package o0000o0O;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f81581OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f81582OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooOOOO(Object obj, int i) {
        super(0);
        this.f81582OooOo0o = i;
        this.f81581OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        switch (this.f81582OooOo0o) {
            case 0:
                return ((o0ooOOo) ((OooOOO) this.f81581OooOo).f81559OooOO0.getValue()).OooO0Oo();
            default:
                o00O00o0.OooO0O0 oooO0O0 = (o00O00o0.OooO0O0) this.f81581OooOo;
                Class<?> clsLoadClass = ((ClassLoader) oooO0O0.f84154OooO0O0).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z = false;
                Method getWindowExtensionsMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class<?> clsLoadClass2 = ((ClassLoader) oooO0O0.f84154OooO0O0).loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                kotlin.jvm.internal.OooOOO0.OooO0o(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                if (getWindowExtensionsMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
