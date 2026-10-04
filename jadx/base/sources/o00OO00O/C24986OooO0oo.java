package o00OO00O;

import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: renamed from: o00OO00O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24986OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84760OooO00o = 0;

    /* JADX INFO: renamed from: o00OO00O.OooO0oo$OooO00o */
    public class OooO00o extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: o00OO00O.OooO0oo$OooO0O0 */
    public class OooO0O0 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: o00OO00O.OooO0oo$OooO0OO */
    public class OooO0OO extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: o00OO00O.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public class C24987OooO0Oo extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    static {
        new OooO00o();
        new OooO0O0();
        new OooO0OO();
        new C24987OooO0Oo();
        Math.sqrt(2.0d);
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float OooO0O0() {
        return Resources.getSystem().getDisplayMetrics().density;
    }
}
