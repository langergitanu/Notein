package o00o0O0;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: o00o0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25316OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f86159OooO00o = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final char[] f86160OooO0O0 = new char[64];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile Handler f86161OooO0OO;

    /* JADX INFO: renamed from: o00o0O0.OooOO0o$OooO00o */
    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f86162OooO00o;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f86162OooO00o = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86162OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86162OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f86162OooO00o[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f86162OooO00o[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean OooO(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void OooO00o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean OooO0O0(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int OooO0OO(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int OooO0Oo(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = OooO00o.f86162OooO00o[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static Handler OooO0o() {
        if (f86161OooO0OO == null) {
            synchronized (C25316OooOO0o.class) {
                try {
                    if (f86161OooO0OO == null) {
                        f86161OooO0OO = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f86161OooO0OO;
    }

    public static ArrayList OooO0o0(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int OooO0oO(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int OooO0oo(int i, Object obj) {
        return OooO0oO(obj == null ? 0 : obj.hashCode(), i);
    }

    public static void OooOO0(Runnable runnable) {
        OooO0o().post(runnable);
    }
}
