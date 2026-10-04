package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21790OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class<?> f64410OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f64411OooO0O0;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f64410OooO00o = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f64411OooO0O0 = cls2 != null;
    }

    public static boolean OooO00o() {
        return (f64410OooO00o == null || f64411OooO0O0) ? false : true;
    }
}
