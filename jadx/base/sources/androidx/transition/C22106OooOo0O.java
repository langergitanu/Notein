package androidx.transition;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.os.Build;

/* JADX INFO: renamed from: androidx.transition.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22106OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f66393OooO00o;

    /* JADX INFO: renamed from: androidx.transition.OooOo0O$OooO00o */
    public static class OooO00o {
        public static Bitmap OooO00o(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    static {
        f66393OooO00o = Build.VERSION.SDK_INT >= 28;
    }
}
