package o00O00oO;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: o00O00oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24817OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24819OooO0oO f84169OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24817OooO0o(C24819OooO0oO c24819OooO0oO) {
        super(0);
        this.f84169OooOo0o = c24819OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    @Override // oO0O000o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsOooO0O0;
        boolean z;
        C24819OooO0oO c24819OooO0oO = this.f84169OooOo0o;
        try {
            clsOooO0O0 = c24819OooO0oO.f84172OooO0O0.OooO0O0();
        } catch (ClassNotFoundException unused) {
            clsOooO0O0 = null;
        }
        if (clsOooO0O0 == null) {
            return Boolean.FALSE;
        }
        Class<?> clsLoadClass = c24819OooO0oO.f84171OooO00o.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        Method addListenerMethod = clsLoadClass.getMethod("addWindowLayoutInfoListener", Activity.class, clsOooO0O0);
        Method removeListenerMethod = clsLoadClass.getMethod("removeWindowLayoutInfoListener", clsOooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(addListenerMethod, "addListenerMethod");
        if (Modifier.isPublic(addListenerMethod.getModifiers())) {
            kotlin.jvm.internal.OooOOO0.OooO0o(removeListenerMethod, "removeListenerMethod");
            z = Modifier.isPublic(removeListenerMethod.getModifiers());
        }
        return Boolean.valueOf(z);
    }
}
