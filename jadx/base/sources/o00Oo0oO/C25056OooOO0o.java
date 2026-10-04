package o00Oo0oO;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.alipay.sdk.app.H5PayActivity;
import java.io.ByteArrayInputStream;
import o00OOooO.C25019OooO00o;

/* JADX INFO: renamed from: o00Oo0oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25056OooOO0o {
    public static BitmapDrawable OooO00o(H5PayActivity h5PayActivity, String str) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(C25019OooO00o.OooO0OO(str));
        } catch (Throwable unused) {
            byteArrayInputStream = null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 480;
            options.inTargetDensity = h5PayActivity.getResources().getDisplayMetrics().densityDpi;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(h5PayActivity.getResources(), BitmapFactory.decodeStream(byteArrayInputStream, null, options));
            try {
                byteArrayInputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable unused3) {
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        }
    }
}
