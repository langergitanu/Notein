package com.miui.penengine.p596e;

import android.content.Context;
import android.graphics.Path;
import android.view.MotionEvent;
import com.huawei.hms.network.embedded.C18374u4;
import com.miui.penengine.p594c.C18759b;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Method;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.miui.penengine.e.e */
/* JADX INFO: loaded from: classes9.dex */
public class C18770e {

    /* JADX INFO: renamed from: b */
    public static final String f57205b = "e";

    /* JADX INFO: renamed from: c */
    public static final String f57206c = "com.miui.penengine.impl.algorithm.shape.ShapeRecognizeFacade";

    /* JADX INFO: renamed from: d */
    public static Class<?> f57207d;

    /* JADX INFO: renamed from: e */
    public static Method f57208e;

    /* JADX INFO: renamed from: f */
    public static Method f57209f;

    /* JADX INFO: renamed from: g */
    public static Method f57210g;

    /* JADX INFO: renamed from: h */
    public static Method f57211h;

    /* JADX INFO: renamed from: i */
    public static Method f57212i;

    /* JADX INFO: renamed from: j */
    public static Method f57213j;

    /* JADX INFO: renamed from: k */
    public static Method f57214k;

    /* JADX INFO: renamed from: a */
    public Object f57215a;

    public C18770e() {
        Method method = f57210g;
        if (method == null || f57207d == null) {
            C18759b.m80276b(f57205b, "Method getInstance error, mOneStrokeGetInstance is null!");
            return;
        }
        try {
            this.f57215a = method.invoke(null, new Object[0]);
        } catch (Exception e) {
            this.f57215a = null;
            C25071OooO00o.OooO0O0(e, "One stroke object is unavailable, ", f57205b);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m80337a() {
        Object obj;
        Method method = f57209f;
        if (method == null || (obj = this.f57215a) == null) {
            C18759b.m80276b(f57205b, "Method destroy error, mOneStrokeDestroy is null!");
            return -1;
        }
        try {
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
            return -10;
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "One stroke destroy fail, ", f57205b);
            return -10;
        }
    }

    /* JADX INFO: renamed from: b */
    public Path m80341b() {
        Object obj;
        Method method = f57212i;
        if (method == null || (obj = this.f57215a) == null) {
            C18759b.m80276b(f57205b, "Method getShapePath error, mOneStrokeGetShapePath is null!");
            return null;
        }
        try {
            return (Path) method.invoke(obj, new Object[0]);
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "Get shape path fail, ", f57205b);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m80342c() {
        Object obj;
        Method method = f57213j;
        if (method == null || (obj = this.f57215a) == null) {
            C18759b.m80276b(f57205b, "Method isFeatureEnable error, mOneStrokeIsFeatureEnable is null!");
            return false;
        }
        try {
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke != null) {
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "Get feature enable fail, ", f57205b);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m80336a(PathClassLoader pathClassLoader) {
        try {
            Class<?> clsLoadClass = pathClassLoader.loadClass(f57206c);
            f57207d = clsLoadClass;
            Class<?>[] clsArr = {Context.class};
            try {
                f57210g = clsLoadClass.getDeclaredMethod("getInstance", new Class[0]);
                try {
                    f57208e = f57207d.getDeclaredMethod(C18374u4.f56270c, clsArr);
                    try {
                        f57209f = f57207d.getDeclaredMethod("destroy", new Class[0]);
                        try {
                            f57213j = f57207d.getDeclaredMethod("isFeatureEnable", new Class[0]);
                            try {
                                f57214k = f57207d.getDeclaredMethod("processTouchEvent", MotionEvent.class);
                                try {
                                    f57212i = f57207d.getDeclaredMethod("getShapePath", new Class[0]);
                                    try {
                                        f57211h = f57207d.getDeclaredMethod("setStopTime", Integer.TYPE);
                                        return 0;
                                    } catch (NoSuchMethodException e) {
                                        C18759b.m80276b(f57205b, "Method setStopTime does not exist, " + e.getMessage());
                                        return -1;
                                    }
                                } catch (NoSuchMethodException e2) {
                                    C18759b.m80276b(f57205b, "Method getShapePath does not exist, " + e2.getMessage());
                                    return -1;
                                }
                            } catch (NoSuchMethodException e3) {
                                C18759b.m80276b(f57205b, "Method processTouchEvent does not exist, " + e3.getMessage());
                                return -1;
                            }
                        } catch (NoSuchMethodException e4) {
                            C18759b.m80276b(f57205b, "Method isFeatureEnable does not exist, " + e4.getMessage());
                            return -1;
                        }
                    } catch (NoSuchMethodException e5) {
                        C18759b.m80276b(f57205b, "Method destroy does not exist, " + e5.getMessage());
                        return -1;
                    }
                } catch (NoSuchMethodException e6) {
                    C18759b.m80276b(f57205b, "Method init does not exist, " + e6.getMessage());
                    return -1;
                }
            } catch (NoSuchMethodException e7) {
                C18759b.m80276b(f57205b, "Method getInstance does not exist, " + e7.getMessage());
                return -1;
            }
        } catch (Exception e8) {
            C25071OooO00o.OooO0O0(e8, "One stroke class or constructor is unavailable, ", f57205b);
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m80338a(int i) {
        Object obj;
        Method method = f57211h;
        if (method != null && (obj = this.f57215a) != null) {
            try {
                method.invoke(obj, Integer.valueOf(i));
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Set stop time fail, ", f57205b);
                return;
            }
        }
        C18759b.m80276b(f57205b, "Method setStopTime error, mOneStrokeSetStopTime is null!");
    }

    /* JADX INFO: renamed from: a */
    public void m80339a(MotionEvent motionEvent) {
        Object obj;
        Method method = f57214k;
        if (method != null && (obj = this.f57215a) != null) {
            try {
                method.invoke(obj, motionEvent);
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Process touch event fail, ", f57205b);
                return;
            }
        }
        C18759b.m80276b(f57205b, "Method processTouchEvent error, mOneStrokeProcessTouchEvent is null!");
    }

    /* JADX INFO: renamed from: a */
    public boolean m80340a(Context context) {
        Object obj;
        Method method = f57208e;
        if (method != null && (obj = this.f57215a) != null) {
            try {
                Object objInvoke = method.invoke(obj, context);
                if (objInvoke != null) {
                    if (((Boolean) objInvoke).booleanValue()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "One stroke init fail, ", f57205b);
                return false;
            }
        }
        C18759b.m80276b(f57205b, "Method init error, mOneStrokeInit is null!");
        return false;
    }
}
