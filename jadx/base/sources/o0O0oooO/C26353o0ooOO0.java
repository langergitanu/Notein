package o0O0oooO;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0O0oooO.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26353o0ooOO0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Uri OooO00o(String str, C32443OooOOO... c32443OooOOOArr) {
        try {
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder builderPath = builder.scheme("notein").authority(NotificationCompat.CATEGORY_NAVIGATION).path(str);
            kotlin.jvm.internal.OooOOO0.OooO0o(builderPath, "path(...)");
            for (C32443OooOOO c32443OooOOO : c32443OooOOOArr) {
                builderPath.appendQueryParameter((String) c32443OooOOO.f116638OooOo0o, (String) c32443OooOOO.f116637OooOo);
            }
            return builder.build();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
