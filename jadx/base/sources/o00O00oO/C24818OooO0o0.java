package o00O00oO;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;

/* JADX INFO: renamed from: o00O00oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24818OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24819OooO0oO f84170OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24818OooO0o0(C24819OooO0oO c24819OooO0oO) {
        super(0);
        this.f84170OooOo0o = c24819OooO0oO;
    }

    @Override // oO0O000o.OooO00o
    public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = this.f84170OooOo0o.f84171OooO00o.loadClass("androidx.window.extensions.layout.FoldingFeature");
        kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        boolean z = false;
        Method getBoundsMethod = clsLoadClass.getMethod("getBounds", new Class[0]);
        Method getTypeMethod = clsLoadClass.getMethod("getType", new Class[0]);
        Method getStateMethod = clsLoadClass.getMethod("getState", new Class[0]);
        kotlin.jvm.internal.OooOOO0.OooO0o(getBoundsMethod, "getBoundsMethod");
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        if (o00O0O0O.OooO00o.OooO00o(getBoundsMethod, oooo0.OooO0O0(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
            kotlin.jvm.internal.OooOOO0.OooO0o(getTypeMethod, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (o00O0O0O.OooO00o.OooO00o(getTypeMethod, oooo0.OooO0O0(cls)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                kotlin.jvm.internal.OooOOO0.OooO0o(getStateMethod, "getStateMethod");
                if (o00O0O0O.OooO00o.OooO00o(getStateMethod, oooo0.OooO0O0(cls)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
