package o0Oo0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.net.Uri;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import o00o0OO0.C25328OooO;
import o00o0OO0.C25345OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28023OooO00o {
    public static final Bitmap OooO00o(Context context, Uri svgUri, int i, int i2, Bitmap.Config config) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(svgUri, "svgUri");
        OooOOO0.OooO0oO(config, "config");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(svgUri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                C25345OooO0o c25345OooO0oOooO0o = new C25328OooO().OooO0o(inputStreamOpenInputStream);
                if (i > 2000) {
                    i = 2000;
                }
                if (i2 > 2000) {
                    i2 = 2000;
                }
                Picture pictureOooO0O0 = c25345OooO0oOooO0o.OooO0O0(i, i2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
                new Canvas(bitmapCreateBitmap).drawPicture(pictureOooO0O0);
                inputStreamOpenInputStream.close();
                return bitmapCreateBitmap;
            } finally {
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SVGUri2Bitmap");
            c20358OooO00o.OooO0Oo(e, "svg uri to bitmap error.", new Object[0]);
            return null;
        }
    }
}
