package Oooo0;

import Oooo0O0.C20935Oooo00o;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import o00O00oO.C24819OooO0oO;

/* JADX INFO: renamed from: Oooo0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20843OoooO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59936OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59937OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20843OoooO0(Object obj, int i) {
        super(0);
        this.f59937OooOo0o = i;
        this.f59936OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        switch (this.f59937OooOo0o) {
            case 0:
                ((C20935Oooo00o) this.f59936OooOo).OooO0o();
                return Boolean.TRUE;
            default:
                C24819OooO0oO c24819OooO0oO = (C24819OooO0oO) this.f59936OooOo;
                Class<?> clsLoadClass = ((ClassLoader) c24819OooO0oO.f84173OooO0OO.f84154OooO0O0).loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                boolean z = false;
                Method getWindowLayoutComponentMethod = clsLoadClass.getMethod("getWindowLayoutComponent", new Class[0]);
                Class<?> clsLoadClass2 = c24819OooO0oO.f84171OooO00o.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.OooOOO0.OooO0o(clsLoadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.OooOOO0.OooO0o(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(clsLoadClass2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
