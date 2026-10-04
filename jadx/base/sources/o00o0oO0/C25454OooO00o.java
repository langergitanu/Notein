package o00o0oO0;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import o00O0oo0.C24969OooOO0;

/* JADX INFO: renamed from: o00o0oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25454OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f86744OooO = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static C25454OooO00o f86745OooO0oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile File f86747OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile File f86749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f86751OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile StatFs f86746OooO00o = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile StatFs f86748OooO0OO = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile boolean f86752OooO0oO = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ReentrantLock f86750OooO0o = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0oO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class EnumC19704OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC19704OooO00o f86753OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC19704OooO00o f86754OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ EnumC19704OooO00o[] f86755OooOoO0;

        static {
            EnumC19704OooO00o enumC19704OooO00o = new EnumC19704OooO00o("INTERNAL", 0);
            f86754OooOo0o = enumC19704OooO00o;
            EnumC19704OooO00o enumC19704OooO00o2 = new EnumC19704OooO00o("EXTERNAL", 1);
            f86753OooOo = enumC19704OooO00o2;
            f86755OooOoO0 = new EnumC19704OooO00o[]{enumC19704OooO00o, enumC19704OooO00o2};
        }

        public EnumC19704OooO00o() {
            throw null;
        }

        public static EnumC19704OooO00o valueOf(String str) {
            return (EnumC19704OooO00o) Enum.valueOf(EnumC19704OooO00o.class, str);
        }

        public static EnumC19704OooO00o[] values() {
            return (EnumC19704OooO00o[]) f86755OooOoO0.clone();
        }
    }

    public static StatFs OooO0O0(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                C24969OooOO0.OooO0o(th);
                throw null;
            }
        }
        return null;
    }

    public final void OooO00o() {
        if (this.f86752OooO0oO) {
            return;
        }
        this.f86750OooO0o.lock();
        try {
            if (!this.f86752OooO0oO) {
                this.f86747OooO0O0 = Environment.getDataDirectory();
                this.f86749OooO0Oo = Environment.getExternalStorageDirectory();
                this.f86746OooO00o = OooO0O0(this.f86746OooO00o, this.f86747OooO0O0);
                this.f86748OooO0OO = OooO0O0(this.f86748OooO0OO, this.f86749OooO0Oo);
                this.f86751OooO0o0 = SystemClock.uptimeMillis();
                this.f86752OooO0oO = true;
            }
        } finally {
            this.f86750OooO0o.unlock();
        }
    }
}
