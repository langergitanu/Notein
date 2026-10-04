package com.miui.penengine.p595d;

import com.miui.penengine.p594c.C18759b;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.miui.penengine.d.e */
/* JADX INFO: loaded from: classes9.dex */
public class C18765e implements InterfaceC18761a {

    /* JADX INFO: renamed from: b */
    public static final String f57169b = "e";

    /* JADX INFO: renamed from: c */
    public static final String f57170c = "com.miui.penengine.facade.MiuiMotionEventInfo";

    /* JADX INFO: renamed from: d */
    public static Method f57171d;

    /* JADX INFO: renamed from: e */
    public static Method f57172e;

    /* JADX INFO: renamed from: f */
    public static Method f57173f;

    /* JADX INFO: renamed from: g */
    public static Method f57174g;

    /* JADX INFO: renamed from: h */
    public static Method f57175h;

    /* JADX INFO: renamed from: i */
    public static Method f57176i;

    /* JADX INFO: renamed from: j */
    public static Method f57177j;

    /* JADX INFO: renamed from: k */
    public static Method f57178k;

    /* JADX INFO: renamed from: l */
    public static Constructor<?> f57179l;

    /* JADX INFO: renamed from: m */
    public static Class<?> f57180m;

    /* JADX INFO: renamed from: a */
    public Object f57181a;

    public C18765e(float f, float f2, long j, float f3, float f4, float f5, int i, boolean z) {
        Constructor<?> constructor = f57179l;
        if (constructor == null || f57180m == null) {
            return;
        }
        try {
            this.f57181a = constructor.newInstance(Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Integer.valueOf(i), Boolean.valueOf(z));
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "MotionEvent object is unavailable, ", f57169b);
        }
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: a */
    public float mo80289a() {
        Object obj;
        Method method = f57171d;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Float) objInvoke).floatValue();
                }
                return 0.0f;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get x axis coordinate fail, ", f57169b);
            }
        }
        return 0.0f;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: b */
    public float mo80290b() {
        Object obj;
        Method method = f57175h;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Float) objInvoke).floatValue();
                }
                return 0.0f;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get pressure fail, ", f57169b);
            }
        }
        return 0.0f;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: c */
    public float mo80291c() {
        Object obj;
        Method method = f57176i;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Float) objInvoke).floatValue();
                }
                return 0.0f;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get orientation fail, ", f57169b);
            }
        }
        return 0.0f;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: d */
    public boolean mo80292d() {
        Object obj;
        Method method = f57177j;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    if (((Boolean) objInvoke).booleanValue()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get history point fail, ", f57169b);
            }
        }
        return false;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: e */
    public Object mo80293e() {
        return this.f57181a;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: f */
    public float mo80294f() {
        Object obj;
        Method method = f57172e;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Float) objInvoke).floatValue();
                }
                return 0.0f;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get y axis coordinate fail, ", f57169b);
            }
        }
        return 0.0f;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: g */
    public int mo80295g() {
        Object obj;
        Method method = f57178k;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Integer) objInvoke).intValue();
                }
                return 0;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get motion action fail, ", f57169b);
            }
        }
        return 0;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: h */
    public float mo80296h() {
        Object obj;
        Method method = f57174g;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Float) objInvoke).floatValue();
                }
                return 0.0f;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get tilt fail, ", f57169b);
            }
        }
        return 0.0f;
    }

    @Override // com.miui.penengine.p595d.InterfaceC18761a
    /* JADX INFO: renamed from: i */
    public long mo80297i() {
        Object obj;
        Method method = f57173f;
        if (method != null && (obj = this.f57181a) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    return ((Long) objInvoke).longValue();
                }
                return 0L;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get time fail, ", f57169b);
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static int m80318a(PathClassLoader pathClassLoader) {
        try {
            Class<?> clsLoadClass = pathClassLoader.loadClass(f57170c);
            f57180m = clsLoadClass;
            Class cls = Float.TYPE;
            f57179l = clsLoadClass.getDeclaredConstructor(cls, cls, Long.TYPE, cls, cls, cls, Integer.TYPE, Boolean.TYPE);
            try {
                f57171d = f57180m.getDeclaredMethod("getX", new Class[0]);
                try {
                    f57172e = f57180m.getDeclaredMethod("getY", new Class[0]);
                    try {
                        f57173f = f57180m.getDeclaredMethod("getTime", new Class[0]);
                        try {
                            f57174g = f57180m.getDeclaredMethod("getTilt", new Class[0]);
                            try {
                                f57175h = f57180m.getDeclaredMethod("getPressure", new Class[0]);
                                try {
                                    f57176i = f57180m.getDeclaredMethod("getOrientation", new Class[0]);
                                    try {
                                        f57177j = f57180m.getDeclaredMethod("isHistoryPoint", new Class[0]);
                                        try {
                                            f57178k = f57180m.getDeclaredMethod("getMotionAction", new Class[0]);
                                            return 0;
                                        } catch (NoSuchMethodException e) {
                                            C18759b.m80276b(f57169b, "Method getMotionAction does not exist, " + e.getMessage());
                                            return -1;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        C18759b.m80276b(f57169b, "Method isHistoryPoint does not exist, " + e2.getMessage());
                                        return -1;
                                    }
                                } catch (NoSuchMethodException e3) {
                                    C18759b.m80276b(f57169b, "Method getOrientation does not exist, " + e3.getMessage());
                                    return -1;
                                }
                            } catch (NoSuchMethodException e4) {
                                C18759b.m80276b(f57169b, "Method getPressure does not exist, " + e4.getMessage());
                                return -1;
                            }
                        } catch (NoSuchMethodException e5) {
                            C18759b.m80276b(f57169b, "Method getTilt does not exist, " + e5.getMessage());
                            return -1;
                        }
                    } catch (NoSuchMethodException e6) {
                        C18759b.m80276b(f57169b, "Method getTime does not exist, " + e6.getMessage());
                        return -1;
                    }
                } catch (NoSuchMethodException e7) {
                    C18759b.m80276b(f57169b, "Method getY does not exist, " + e7.getMessage());
                    return -1;
                }
            } catch (NoSuchMethodException e8) {
                C18759b.m80276b(f57169b, "Method getX does not exist, " + e8.getMessage());
                return -1;
            }
        } catch (Exception e9) {
            C25071OooO00o.OooO0O0(e9, "Motion event info class or constructor is unavailable, ", f57169b);
            return -1;
        }
    }

    public C18765e(Object obj) {
        this.f57181a = obj;
    }
}
