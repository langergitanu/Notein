package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m80612d2 = {"Landroidx/core/os/BuildCompat;", "", "()V", "AD_SERVICES_EXTENSION_INT", "", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "isAtLeastB", "", "isAtLeastN", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastPreReleaseCodename", "codename", "", "buildCodename", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m80612d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "()V", "getExtensionVersion", "", "extension", "core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final int getExtensionVersion(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m80612d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = i >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(1000000) : 0;
    }

    private BuildCompat() {
    }

    public static final boolean isAtLeastB() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            return true;
        }
        if (i < 35) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        OooOOO0.OooO0o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Baklava", CODENAME);
    }

    public static final boolean isAtLeastN() {
        return true;
    }

    public static final boolean isAtLeastNMR1() {
        return true;
    }

    public static final boolean isAtLeastO() {
        return true;
    }

    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        OooOOO0.OooO0oO(codename, "codename");
        OooOOO0.OooO0oO(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Integer numIsAtLeastPreReleaseCodename$codenameToInt = isAtLeastPreReleaseCodename$codenameToInt(buildCodename);
        Integer numIsAtLeastPreReleaseCodename$codenameToInt2 = isAtLeastPreReleaseCodename$codenameToInt(codename);
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null && numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt.intValue() >= numIsAtLeastPreReleaseCodename$codenameToInt2.intValue();
        }
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null || numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        OooOOO0.OooO0o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        OooOOO0.OooO0o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        OooOOO0.OooO0o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.equals("BAKLAVA") ? 0 : null;
    }

    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        OooOOO0.OooO0o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("S", CODENAME);
    }

    public static final boolean isAtLeastSv2() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return true;
        }
        if (i < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        OooOOO0.OooO0o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Sv2", CODENAME);
    }

    public static final boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        OooOOO0.OooO0o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Tiramisu", CODENAME);
    }

    public static final boolean isAtLeastU() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        OooOOO0.OooO0o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME);
    }

    public static final boolean isAtLeastV() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        OooOOO0.OooO0o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME);
    }
}
