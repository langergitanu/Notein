package o00o000;

import android.os.Build;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o00o000.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25223OooOOoo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final boolean f85904OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f85905OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final File f85906OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static volatile C25223OooOOoo f85907OooO0oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f85909OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f85910OooO0OO = true;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f85911OooO0Oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f85908OooO00o = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i = Build.VERSION.SDK_INT;
        f85905OooO0o0 = i < 29;
        f85904OooO0o = i >= 28;
        f85906OooO0oO = new File("/proc/self/fd");
    }

    public static C25223OooOOoo OooO00o() {
        if (f85907OooO0oo == null) {
            synchronized (C25223OooOOoo.class) {
                try {
                    if (f85907OooO0oo == null) {
                        f85907OooO0oo = new C25223OooOOoo();
                    }
                } finally {
                }
            }
        }
        return f85907OooO0oo;
    }

    public final int OooO0O0() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f85908OooO00o;
    }

    public final boolean OooO0OO(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (f85904OooO0o) {
                if (!f85905OooO0o0 || this.f85911OooO0Oo.get()) {
                    if (z2) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i2 >= 0) {
                        synchronized (this) {
                            try {
                                int i3 = this.f85909OooO0O0 + 1;
                                this.f85909OooO0O0 = i3;
                                if (i3 >= 50) {
                                    this.f85909OooO0O0 = 0;
                                    int length = f85906OooO0oO.list().length;
                                    long jOooO0O0 = OooO0O0();
                                    boolean z4 = ((long) length) < jOooO0O0;
                                    this.f85910OooO0OO = z4;
                                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jOooO0O0);
                                    }
                                }
                                z3 = this.f85910OooO0OO;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
