package o00OooOo;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.huawei.hms.network.embedded.C18361t4;

/* JADX INFO: renamed from: o00OooOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25167OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f85670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f85671OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f85672OooO0OO;

    /* JADX INFO: renamed from: o00OooOo.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85673OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ActivityManager f85674OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f85675OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f85676OooO0Oo;

        public OooO00o(Context context) {
            this.f85676OooO0Oo = 1;
            this.f85673OooO00o = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C18361t4.f56218b);
            this.f85674OooO0O0 = activityManager;
            this.f85675OooO0OO = new OooO0O0(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f85676OooO0Oo = 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: o00OooOo.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DisplayMetrics f85677OooO00o;

        public OooO0O0(DisplayMetrics displayMetrics) {
            this.f85677OooO00o = displayMetrics;
        }
    }

    public C25167OooO0oO(OooO00o oooO00o) {
        Context context = oooO00o.f85673OooO00o;
        ActivityManager activityManager = oooO00o.f85674OooO0O0;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f85672OooO0OO = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = oooO00o.f85675OooO0OO.f85677OooO00o;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = oooO00o.f85676OooO0Oo;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.f85671OooO0O0 = iRound3;
            this.f85670OooO00o = iRound2;
        } else {
            float f3 = i2 / (f2 + 2.0f);
            this.f85671OooO0O0 = Math.round(2.0f * f3);
            this.f85670OooO00o = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f85671OooO0O0));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f85670OooO00o));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
