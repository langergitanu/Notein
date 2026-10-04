package OooO0o;

import OooO0oO.C20436OooO0o0;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {
    public static OooOO0 OooO00o(C20436OooO0o0.OooO0o oooO0o) {
        int i = Build.VERSION.SDK_INT;
        int pickImagesMaxLimit = (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
        C20436OooO0o0.OooO0O0.OooO00o defaultTab = C20436OooO0o0.OooO0O0.OooO00o.f58274OooO00o;
        OooOOO0.OooO0oO(defaultTab, "defaultTab");
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        OooOO0 oooOO02 = new OooOO0();
        oooOO02.f58267OooO00o = oooO0o;
        oooOO02.f58268OooO0O0 = pickImagesMaxLimit;
        oooOO02.f58269OooO0OO = defaultTab;
        return oooOO02;
    }
}
