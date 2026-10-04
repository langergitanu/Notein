package o0O0o000;

import android.os.Build;
import com.orion.notein.domain.models.cloudsync.CloudSyncCredentialType;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o {
    public static OooO0O0 OooO00o() {
        if (OooO0OO()) {
            return OooO0O0.f88803OooOo;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        Locale locale = Locale.ROOT;
        String lowerCase = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String lowerCase2 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
        if (C33599OooOo0O.OooOoOO(lowerCase, CloudSyncCredentialType.HUAWEI, false) || C33599OooOo0O.OooOoOO(lowerCase2, CloudSyncCredentialType.HUAWEI, false)) {
            return OooO0O0.f88805OooOoO0;
        }
        String lowerCase3 = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase3, "toLowerCase(...)");
        String lowerCase4 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase4, "toLowerCase(...)");
        if (C33599OooOo0O.OooOoOO(lowerCase3, "honor", false) || C33599OooOo0O.OooOoOO(lowerCase4, "honor", false)) {
            return OooO0O0.f88804OooOoO;
        }
        if (OooO0O0()) {
            return OooO0O0.f88806OooOoOO;
        }
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        String lowerCase5 = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase5, "toLowerCase(...)");
        OooOOO0.OooO0o(BRAND, "BRAND");
        String lowerCase6 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase6, "toLowerCase(...)");
        if (C33599OooOo0O.OooOoOO(lowerCase5, "oppo", false) || C33599OooOo0O.OooOoOO(lowerCase5, "oneplus", false) || C33599OooOo0O.OooOoOO(lowerCase6, "oppo", false) || C33599OooOo0O.OooOoOO(lowerCase6, "oneplus", false)) {
            return OooO0O0.f88808OooOoo0;
        }
        String lowerCase7 = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase7, "toLowerCase(...)");
        String lowerCase8 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase8, "toLowerCase(...)");
        if (C33599OooOo0O.OooOoOO(lowerCase7, "vivo", false) || C33599OooOo0O.OooOoOO(lowerCase7, "iqoo", false) || C33599OooOo0O.OooOoOO(lowerCase8, "vivo", false) || C33599OooOo0O.OooOoOO(lowerCase8, "iqoo", false)) {
            return OooO0O0.f88807OooOoo;
        }
        String lowerCase9 = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase9, "toLowerCase(...)");
        String lowerCase10 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase10, "toLowerCase(...)");
        return (C33599OooOo0O.OooOoOO(lowerCase9, "samsung", false) || C33599OooOo0O.OooOoOO(lowerCase10, "samsung", false)) ? OooO0O0.f88809OooOooO : OooO0O0.f88810OooOooo;
    }

    public static boolean OooO0O0() {
        String MANUFACTURER = Build.MANUFACTURER;
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        Locale locale = Locale.ROOT;
        String lowerCase = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String lowerCase2 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
        return C33599OooOo0O.OooOoOO(lowerCase, "lenovo", false) || C33599OooOo0O.OooOoOO(lowerCase2, "lenovo", false);
    }

    public static boolean OooO0OO() {
        String MANUFACTURER = Build.MANUFACTURER;
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        Locale locale = Locale.ROOT;
        String lowerCase = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String lowerCase2 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
        return C33599OooOo0O.OooOoOO(lowerCase, "xiaomi", false) || C33599OooOo0O.OooOoOO(lowerCase, "redmi", false) || C33599OooOo0O.OooOoOO(lowerCase, "poco", false) || C33599OooOo0O.OooOoOO(lowerCase2, "xiaomi", false) || C33599OooOo0O.OooOoOO(lowerCase2, "redmi", false) || C33599OooOo0O.OooOoOO(lowerCase2, "poco", false);
    }
}
