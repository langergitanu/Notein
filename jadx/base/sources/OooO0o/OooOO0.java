package OooO0o;

import OooO0oO.C20436OooO0o0;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C20436OooO0o0.OooO0o f58267OooO00o = C20436OooO0o0.OooO0OO.f58276OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f58268OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C20436OooO0o0.OooO0O0 f58269OooO0OO;

    public OooOO0() {
        int i = Build.VERSION.SDK_INT;
        this.f58268OooO0O0 = (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
        this.f58269OooO0OO = C20436OooO0o0.OooO0O0.OooO00o.f58274OooO00o;
    }
}
