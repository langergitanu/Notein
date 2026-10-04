package o000OoOO;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: o000OoOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24538OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f82996OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f82997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f82998OooO0OO;

    /* JADX INFO: renamed from: o000OoOO.OooO0O0$OooO00o */
    public static class OooO00o {
        public static Display OooO00o(Context context) {
            return context.getDisplay();
        }
    }

    public C24538OooO0O0(Context context) {
        Display.Mode[] supportedModes = (Build.VERSION.SDK_INT >= 30 ? OooO00o.OooO00o(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay()).getSupportedModes();
        float refreshRate = supportedModes[0].getRefreshRate();
        for (int i = 1; i < supportedModes.length; i++) {
            float refreshRate2 = supportedModes[i].getRefreshRate();
            if (refreshRate2 > refreshRate) {
                refreshRate = refreshRate2;
            }
        }
        this.f82997OooO0O0 = 1000.0f / refreshRate;
        this.f82998OooO0OO = C24537OooO00o.OooO00o().f82994OooO0OO;
    }

    public final int OooO00o() {
        long j = this.f82996OooO00o;
        int i = this.f82998OooO0OO;
        float f = this.f82997OooO0O0;
        return j <= 0 ? ((int) f) + i : Math.min(32, ((int) ((SystemClock.uptimeMillis() - this.f82996OooO00o) + f)) + i);
    }
}
