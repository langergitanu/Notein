package com.miui.penengine.p596e;

import android.content.Context;
import com.miui.penengine.ocr.MiuiInk;
import com.miui.penengine.p594c.C18759b;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.miui.penengine.e.f */
/* JADX INFO: loaded from: classes9.dex */
public class C18771f {

    /* JADX INFO: renamed from: c */
    public static final String f57216c = "f";

    /* JADX INFO: renamed from: d */
    public static final String f57217d = "com.miui.penengine.impl.algorithm.recognizelib.algorithm.RecognizeFacade";

    /* JADX INFO: renamed from: e */
    public static Class<?> f57218e;

    /* JADX INFO: renamed from: f */
    public static Method f57219f;

    /* JADX INFO: renamed from: g */
    public static Method f57220g;

    /* JADX INFO: renamed from: h */
    public static Constructor<?> f57221h;

    /* JADX INFO: renamed from: a */
    public Object f57222a;

    /* JADX INFO: renamed from: b */
    public boolean f57223b = false;

    /* JADX INFO: renamed from: a */
    public static int m80343a(PathClassLoader pathClassLoader) {
        try {
            Class<?> clsLoadClass = pathClassLoader.loadClass(f57217d);
            f57218e = clsLoadClass;
            f57221h = clsLoadClass.getDeclaredConstructor(Context.class);
            try {
                f57219f = f57218e.getDeclaredMethod("recognizeStrokes", List.class);
                try {
                    f57220g = f57218e.getDeclaredMethod("onDestroy", new Class[0]);
                    return 0;
                } catch (NoSuchMethodException e) {
                    C18759b.m80276b(f57216c, "Method on destroy does not exist, " + e.getMessage());
                    return -1;
                }
            } catch (NoSuchMethodException e2) {
                C18759b.m80276b(f57216c, "Method recognize text does not exist, " + e2.getMessage());
                return -1;
            }
        } catch (Exception e3) {
            C25071OooO00o.OooO0O0(e3, "Recognize class or constructor is unavailable, ", f57216c);
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m80344a(MiuiInk miuiInk) {
        Method method;
        Object obj;
        if (f57218e != null && (method = f57219f) != null && (obj = this.f57222a) != null) {
            try {
                return (String) method.invoke(obj, miuiInk.getStrokes());
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Recognize text fail, ", f57216c);
                return null;
            }
        }
        C18759b.m80276b(f57216c, "Recognize recognize text error, recognizeClass is null!");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m80345a() {
        Method method;
        Object obj;
        if (f57218e != null && (method = f57220g) != null && (obj = this.f57222a) != null) {
            try {
                method.invoke(obj, new Object[0]);
                this.f57223b = false;
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "On destroy fail, ", f57216c);
                return;
            }
        }
        C18759b.m80276b(f57216c, "Recognize on destroy error, recognizeClass is null!");
    }

    /* JADX INFO: renamed from: a */
    public boolean m80346a(Context context) {
        Constructor<?> constructor = f57221h;
        if (constructor == null) {
            return false;
        }
        if (this.f57223b) {
            return true;
        }
        try {
            this.f57222a = constructor.newInstance(context);
            this.f57223b = true;
            return true;
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "Recognize object is unavailable, ", f57216c);
            return false;
        }
    }
}
