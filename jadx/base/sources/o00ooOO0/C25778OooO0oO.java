package o00ooOO0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import kotlin.jvm.internal.OooOOO0;
import o00o0Ooo.C25429OooO0o0;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0o0o.AbstractC25442OooO;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0O.C25654OooO0Oo;

/* JADX INFO: renamed from: o00ooOO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25778OooO0oO implements InterfaceC25774OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f87949OooO00o;

    /* JADX INFO: renamed from: o00ooOO0.OooO0oO$OooO00o */
    public static final class OooO00o {
    }

    public C25778OooO0oO(boolean z) {
        this.f87949OooO00o = z;
    }

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final boolean OooO00o(C25638OooO0oO encodedImage, C25654OooO0Oo c25654OooO0Oo) {
        OooOOO0.OooO0oO(encodedImage, "encodedImage");
        if (c25654OooO0Oo == null) {
            c25654OooO0Oo = C25654OooO0Oo.f87571OooO0O0;
        }
        return this.f87949OooO00o && C25772OooO00o.OooO00o(c25654OooO0Oo, encodedImage, 2048) > 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o00ooOO0.InterfaceC25774OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C25773OooO0O0 OooO0O0(C25638OooO0oO encodedImage, AbstractC25442OooO outputStream, C25654OooO0Oo c25654OooO0Oo, ColorSpace colorSpace) throws Throwable {
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        Integer num = 85;
        OooOOO0.OooO0oO(encodedImage, "encodedImage");
        OooOOO0.OooO0oO(outputStream, "outputStream");
        C25654OooO0Oo c25654OooO0Oo2 = c25654OooO0Oo == null ? C25654OooO0Oo.f87571OooO0O0 : c25654OooO0Oo;
        int iOooO00o = !this.f87949OooO00o ? 1 : C25772OooO00o.OooO00o(c25654OooO0Oo2, encodedImage, 2048);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iOooO00o;
        if (colorSpace != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Matrix matrix2 = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.OooOOoo(), null, options);
            if (bitmapDecodeStream == null) {
                if (C25438OooO00o.f86720OooO00o.OooO00o(6)) {
                    C25439OooO0O0.OooO0O0(6, "SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                }
                return new C25773OooO0O0(2);
            }
            C25429OooO0o0<Integer> c25429OooO0o0 = C25777OooO0o0.f87948OooO00o;
            encodedImage.ooOO();
            try {
                try {
                    if (C25777OooO0o0.f87948OooO00o.contains(Integer.valueOf(encodedImage.f87503OooOoO))) {
                        int iOooO00o2 = C25777OooO0o0.OooO00o(encodedImage, c25654OooO0Oo2);
                        Matrix matrix3 = new Matrix();
                        if (iOooO00o2 == 2) {
                            matrix3.setScale(-1.0f, 1.0f);
                        } else if (iOooO00o2 == 7) {
                            matrix3.setRotate(-90.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        } else if (iOooO00o2 == 4) {
                            matrix3.setRotate(180.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        } else if (iOooO00o2 == 5) {
                            matrix3.setRotate(90.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        }
                        matrix = matrix3;
                        if (matrix == null) {
                            try {
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
                            } catch (OutOfMemoryError e) {
                                e = e;
                                bitmapCreateBitmap = bitmapDecodeStream;
                                C25438OooO00o.OooO0OO("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                                C25773OooO0O0 c25773OooO0O0 = new C25773OooO0O0(2);
                                bitmapCreateBitmap.recycle();
                                bitmapDecodeStream.recycle();
                                return c25773OooO0O0;
                            } catch (Throwable th) {
                                th = th;
                                bitmapCreateBitmap = bitmapDecodeStream;
                                bitmapCreateBitmap.recycle();
                                bitmapDecodeStream.recycle();
                                throw th;
                            }
                        } else {
                            bitmapCreateBitmap = bitmapDecodeStream;
                        }
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), outputStream);
                        C25773OooO0O0 c25773OooO0O02 = new C25773OooO0O0(iOooO00o > 1 ? 0 : 1);
                        bitmapCreateBitmap.recycle();
                        bitmapDecodeStream.recycle();
                        return c25773OooO0O02;
                    }
                    int iOooO0O0 = C25777OooO0o0.OooO0O0(encodedImage, c25654OooO0Oo2);
                    if (iOooO0O0 != 0) {
                        matrix2 = new Matrix();
                        matrix2.setRotate(iOooO0O0);
                    }
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), outputStream);
                    C25773OooO0O0 c25773OooO0O022 = new C25773OooO0O0(iOooO00o > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c25773OooO0O022;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    C25438OooO00o.OooO0OO("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C25773OooO0O0 c25773OooO0O03 = new C25773OooO0O0(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c25773OooO0O03;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
            matrix = matrix2;
            if (matrix == null) {
            }
        } catch (OutOfMemoryError e3) {
            C25438OooO00o.OooO0OO("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new C25773OooO0O0(2);
        }
    }

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final boolean OooO0OO(C25623OooO0OO imageFormat) {
        OooOOO0.OooO0oO(imageFormat, "imageFormat");
        return imageFormat == C25622OooO0O0.f87450OooOO0O || imageFormat == C25622OooO0O0.f87441OooO00o;
    }

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }
}
