package ooOOOOoo;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: ooOOOOoo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35085OooOooo {
    public static void OooO00o(ContentResolver contentResolver, String str, Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                contentResolver.call("com.xiaomi.mirror.callprovider", str, (String) null, bundle);
            } else {
                contentResolver.call(new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.xiaomi.mirror.callprovider").build(), str, (String) null, bundle);
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
