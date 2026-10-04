package o00o000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import o00OooOO.C25156OooO0OO;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f85900OooO00o = new OooO00o();

    public class OooO00o extends C25156OooO0OO {
        @Override // o00OooOO.C25156OooO0OO, o00OooOO.InterfaceC25155OooO0O0
        public final void OooO00o(Bitmap bitmap) {
        }
    }

    public static C25213OooO0o0 OooO00o(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = C25231OooOoo0.f85943OooO0Oo;
                    lock.lock();
                    Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapOooO0o0);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapOooO0o0;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC25155OooO0O0 = f85900OooO00o;
        }
        return C25213OooO0o0.OooO0O0(bitmap, interfaceC25155OooO0O0);
    }
}
