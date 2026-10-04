package com.miui.penengine.p596e;

import android.content.Context;
import com.miui.penengine.auth.MiuiAuthHelper;
import com.miui.penengine.p594c.C18759b;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.miui.penengine.e.i */
/* JADX INFO: loaded from: classes9.dex */
public class C18774i {

    /* JADX INFO: renamed from: d */
    public static final String f57236d = "i";

    /* JADX INFO: renamed from: e */
    public static final String f57237e = "com.miui.penengine.impl.manager.PencilEngineManager";

    /* JADX INFO: renamed from: f */
    public static Class<?> f57238f;

    /* JADX INFO: renamed from: g */
    public static Method f57239g;

    /* JADX INFO: renamed from: h */
    public static Method f57240h;

    /* JADX INFO: renamed from: i */
    public static Method f57241i;

    /* JADX INFO: renamed from: j */
    public static Method f57242j;

    /* JADX INFO: renamed from: k */
    public static Constructor<?> f57243k;

    /* JADX INFO: renamed from: a */
    public Object f57244a;

    /* JADX INFO: renamed from: b */
    public b f57245b;

    /* JADX INFO: renamed from: c */
    public MiuiAuthHelper.AuthResultListener f57246c;

    /* JADX INFO: renamed from: com.miui.penengine.e.i$b */
    public class b implements Observer {
        public b() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
            if (C18774i.this.f57246c != null) {
                C18774i.this.f57246c.onAuthComplete(zBooleanValue);
            }
        }
    }

    public C18774i() {
        if (f57243k == null) {
            C18759b.m80276b(f57236d, "Construct system pencil engine manager fail, sPencilManagerConstructor is null!");
            return;
        }
        this.f57245b = new b();
        try {
            this.f57244a = f57243k.newInstance(new Object[0]);
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "pencil engine manager object is unavailable, ", f57236d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m80351a(PathClassLoader pathClassLoader) {
        try {
            Class<?> clsLoadClass = pathClassLoader.loadClass(f57237e);
            f57238f = clsLoadClass;
            f57243k = clsLoadClass.getDeclaredConstructor(new Class[0]);
            try {
                f57239g = f57238f.getDeclaredMethod("pencilEngineInit", Context.class, String.class, Long.TYPE, Observer.class, Boolean.TYPE);
                try {
                    f57240h = f57238f.getDeclaredMethod("pencilEngineDestroy", new Class[0]);
                    try {
                        f57241i = f57238f.getDeclaredMethod("runAuthConnect", new Class[0]);
                        try {
                            f57242j = f57238f.getDeclaredMethod("setLogLevel", Integer.TYPE);
                            return 0;
                        } catch (NoSuchMethodException e) {
                            C18759b.m80276b(f57236d, "Method setLogLevel does not exist, " + e.getMessage());
                            return -1;
                        }
                    } catch (NoSuchMethodException e2) {
                        C18759b.m80276b(f57236d, "Method runAuthConnect does not exist, " + e2.getMessage());
                        return -1;
                    }
                } catch (NoSuchMethodException e3) {
                    C18759b.m80276b(f57236d, "Method pencilEngineDestroy does not exist, " + e3.getMessage());
                    return -1;
                }
            } catch (NoSuchMethodException e4) {
                C18759b.m80276b(f57236d, "Method pencilEngineInit does not exist, " + e4.getMessage());
                return -1;
            }
        } catch (Exception e5) {
            C25071OooO00o.OooO0O0(e5, "Pencil engine manager class or constructor is unavailable, ", f57236d);
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m80356b() {
        Object obj;
        Method method = f57241i;
        if (method == null || (obj = this.f57244a) == null) {
            C18759b.m80276b(f57236d, "Run auth connect error, sRunAuthConnect is null!");
            return;
        }
        try {
            method.invoke(obj, new Object[0]);
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "Run auth connect fail, ", f57236d);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m80353a() {
        Object obj;
        Method method = f57240h;
        if (method != null && (obj = this.f57244a) != null) {
            this.f57246c = null;
            try {
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Destroy fail, ", f57236d);
                return;
            }
        }
        C18759b.m80276b(f57236d, "destroy init error, sPencilEngineDestroy is null!");
    }

    /* JADX INFO: renamed from: a */
    public void m80354a(int i) {
        Object obj;
        Method method = f57242j;
        if (method != null && (obj = this.f57244a) != null) {
            try {
                method.invoke(obj, Integer.valueOf(i));
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Set log level fail, ", f57236d);
                return;
            }
        }
        C18759b.m80276b(f57236d, "Set log level, sSetLogLevel is null!");
    }

    /* JADX INFO: renamed from: a */
    public boolean m80355a(Context context, MiuiAuthHelper.AuthResultListener authResultListener) {
        if (f57239g != null && this.f57244a != null && authResultListener != null && context != null) {
            this.f57246c = authResultListener;
            try {
                f57239g.invoke(this.f57244a, context, context.getPackageName(), 0, this.f57245b, Boolean.FALSE);
                return true;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Init fail, ", f57236d);
                return false;
            }
        }
        C18759b.m80276b(f57236d, "Method init error, sPencilEngineInit is null!");
        return false;
    }
}
