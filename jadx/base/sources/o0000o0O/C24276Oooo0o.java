package o0000o0O;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import o00O00oO.C24819OooO0oO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0000o0O.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24276Oooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f81699OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f81700OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24276Oooo0o(Object obj, int i) {
        super(0);
        this.f81700OooOo0o = i;
        this.f81699OooOo = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // oO0O000o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        switch (this.f81700OooOo0o) {
            case 0:
                Object obj = C24278Oooo0oO.f81703OooO0o0;
                File file = (File) this.f81699OooOo;
                synchronized (obj) {
                    C24278Oooo0oO.f81702OooO0Oo.remove(file.getAbsolutePath());
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                Class<?> clsLoadClass = ((C24819OooO0oO) this.f81699OooOo).f84171OooO00o.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.OooOOO0.OooO0o(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(removeListenerMethod, "removeListenerMethod");
                    z = Modifier.isPublic(removeListenerMethod.getModifiers());
                }
                return Boolean.valueOf(z);
        }
    }
}
