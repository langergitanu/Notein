package o00o000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.EnumC25114OooO0OO;
import o00Ooo0o.InterfaceC25122OooOO0o;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;
import o00o0O0.C25315OooO0oo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO implements InterfaceC25122OooOO0o<Bitmap> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25119OooO0oo<Integer> f85862OooO0O0 = C25119OooO0oo.OooO00o(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25119OooO0oo<Bitmap.CompressFormat> f85863OooO0OO = new C25119OooO0oo<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C25119OooO0oo.f85385OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25159OooO0oO f85864OooO00o;

    public OooO0OO(C25159OooO0oO c25159OooO0oO) {
        this.f85864OooO00o = c25159OooO0oO;
    }

    @Override // o00Ooo0o.InterfaceC25115OooO0Oo
    public final boolean OooO00o(Object obj, File file, C25111OooO c25111OooO) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC25145OooOo0o) obj).get();
        C25119OooO0oo<Bitmap.CompressFormat> c25119OooO0oo = f85863OooO0OO;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c25111OooO.OooO0OO(c25119OooO0oo);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = C25315OooO0oo.f86154OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c25111OooO.OooO0OO(f85862OooO0O0)).intValue();
        OutputStream oooO0OO = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C25159OooO0oO c25159OooO0oO = this.f85864OooO00o;
                if (c25159OooO0oO != null) {
                    try {
                        oooO0OO = new com.bumptech.glide.load.data.OooO0OO(fileOutputStream, c25159OooO0oO);
                    } catch (IOException e) {
                        e = e;
                        oooO0OO = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (oooO0OO != null) {
                            try {
                                oooO0OO.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        oooO0OO = fileOutputStream;
                        if (oooO0OO != null) {
                            try {
                                oooO0OO.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    oooO0OO = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, oooO0OO);
                oooO0OO.close();
                try {
                    oooO0OO.close();
                } catch (IOException unused3) {
                }
                z = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + C25316OooOO0o.OooO0OO(bitmap) + " in " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos) + ", options format: " + c25111OooO.OooO0OO(c25119OooO0oo) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }

    @Override // o00Ooo0o.InterfaceC25122OooOO0o
    public final EnumC25114OooO0OO OooO0O0(C25111OooO c25111OooO) {
        return EnumC25114OooO0OO.f85379OooOo;
    }
}
