package o00o000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import o00O0OOO.C24851OooO0o0;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25156OooO0OO;
import o00o0000.C25238OooO00o;

/* JADX INFO: renamed from: o00o000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25212OooO0Oo implements InterfaceC25121OooOO0O<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25156OooO0OO f85865OooO00o = new C25156OooO0OO();

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final /* bridge */ /* synthetic */ InterfaceC25145OooOo0o<Bitmap> OooO00o(ImageDecoder.Source source, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return OooO0OO(C24851OooO0o0.OooO00o(source), i, i2, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final /* bridge */ /* synthetic */ boolean OooO0O0(ImageDecoder.Source source, C25111OooO c25111OooO) throws IOException {
        androidx.core.text.OooO00o.OooO0O0(source);
        return true;
    }

    public final C25213OooO0o0 OooO0OO(ImageDecoder.Source source, int i, int i2, C25111OooO c25111OooO) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C25238OooO00o(i, i2, c25111OooO));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C25213OooO0o0(bitmapDecodeBitmap, this.f85865OooO00o);
    }
}
