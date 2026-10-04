package oO00o00;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f116246OooO00o;

    static {
        Object obj;
        Class<?> cls;
        OooO00o oooO00o;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                oooO00o = (OooO00o) cls.asSubclass(OooO00o.class).getConstructor(OooO0OO.class).newInstance(OooO00o.f116244OooO00o);
            } catch (Throwable th2) {
                obj = th2;
                oooO00o = null;
            }
        } else {
            oooO00o = null;
        }
        if (oooO00o != null) {
            f116246OooO00o = oooO00o;
        } else {
            f116246OooO00o = new OooO00o();
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, OooO0O0.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void OooO00o() {
        f116246OooO00o.getClass();
    }

    public static void OooO0O0() {
        f116246OooO00o.getClass();
    }

    public static void OooO0OO() {
        f116246OooO00o.getClass();
    }
}
