package o00Ooo0O;

import Oooo0oO.C21036OooOOo0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.integration.webp.WebpBitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import o000OO00.C24472OooOoo;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.EnumC25113OooO0O0;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.C25213OooO0o0;
import o00o000.C25231OooOoo0;
import o00o000.OooOOO;
import o00o000.OooOOO0;
import o00o0O0.C25315OooO0oo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ArrayDeque f85292OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DisplayMetrics f85294OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25159OooO0oO f85295OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f85296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85290OooO0o0 = C25119OooO0oo.OooO00o(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85289OooO0o = C25119OooO0oo.OooO00o(Boolean.TRUE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.SystemDecoder");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f85291OooO0oO = new OooO00o();

    public static class OooO00o implements OooOOO.OooO0O0 {
        @Override // o00o000.OooOOO.OooO0O0
        public final void OooO00o() {
        }

        @Override // o00o000.OooOOO.OooO0O0
        public final void OooO0O0(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) throws IOException {
        }
    }

    static {
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        f85292OooO0oo = new ArrayDeque(0);
    }

    public OooO(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC25155OooO0O0 interfaceC25155OooO0O0, C25159OooO0oO c25159OooO0oO) {
        this.f85296OooO0Oo = arrayList;
        C21929Ooooo0o.OooO0OO(displayMetrics, "Argument must not be null");
        this.f85294OooO0O0 = displayMetrics;
        C21929Ooooo0o.OooO0OO(interfaceC25155OooO0O0, "Argument must not be null");
        this.f85293OooO00o = interfaceC25155OooO0O0;
        C21929Ooooo0o.OooO0OO(c25159OooO0oO, "Argument must not be null");
        this.f85295OooO0OO = c25159OooO0oO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r6;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap OooO0OO(InputStream inputStream, BitmapFactory.Options options, OooO00o oooO00o, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(MediaHttpUploader.DEFAULT_CHUNK_SIZE);
        } else {
            oooO00o.getClass();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = C25231OooOoo0.f85943OooO0Oo;
        lock.lock();
        try {
            try {
                Bitmap bitmapDecodeStream = WebpBitmapFactory.decodeStream(inputStream, null, options);
                lock.unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return bitmapDecodeStream;
            } catch (IllegalArgumentException e) {
                ?? byteArray = ByteArrayOutputStream.toByteArray();
                byteArray.append(str);
                byteArray.append(", inBitmap: ");
                byteArray.append(OooO0Oo(options.inBitmap));
                IOException iOException = new IOException(byteArray.toString(), e);
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                if (options.inBitmap == null) {
                    throw iOException;
                }
                try {
                    inputStream.reset();
                    interfaceC25155OooO0O0.OooO00o(options.inBitmap);
                    options.inBitmap = null;
                    Bitmap bitmapOooO0OO = OooO0OO(inputStream, options, oooO00o, interfaceC25155OooO0O0);
                    C25231OooOoo0.f85943OooO0Oo.unlock();
                    return bitmapOooO0OO;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            C25231OooOoo0.f85943OooO0Oo.unlock();
            throw th;
        }
    }

    public static String OooO0Oo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void OooO0o0(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C25213OooO0o0 OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        OooO00o oooO00o = f85291OooO0oO;
        C21929Ooooo0o.OooO00o(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f85295OooO0OO.OooO0Oo(byte[].class, 65536);
        synchronized (OooO.class) {
            arrayDeque = f85292OooO0oo;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                OooO0o0(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC25113OooO0O0 enumC25113OooO0O0 = (EnumC25113OooO0O0) c25111OooO.OooO0OO(OooOOO.f85877OooO0o);
        o00o000.OooOOO0 oooOOO0 = (o00o000.OooOOO0) c25111OooO.OooO0OO(OooOOO.f85879OooO0oo);
        boolean zBooleanValue = ((Boolean) c25111OooO.OooO0OO(OooOOO.f85876OooO)).booleanValue();
        C25119OooO0oo<Boolean> c25119OooO0oo = OooOOO.f85880OooOO0;
        if (c25111OooO.OooO0OO(c25119OooO0oo) != null) {
            ((Boolean) c25111OooO.OooO0OO(c25119OooO0oo)).booleanValue();
        }
        try {
            C25213OooO0o0 c25213OooO0o0OooO0O0 = C25213OooO0o0.OooO0O0(OooO0O0(inputStream, options2, oooOOO0, enumC25113OooO0O0, i, i2, zBooleanValue, oooO00o), this.f85293OooO00o);
            OooO0o0(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f85295OooO0OO.OooO0oo(bArr);
            return c25213OooO0o0OooO0O0;
        } catch (Throwable th) {
            OooO0o0(options2);
            ArrayDeque arrayDeque2 = f85292OooO0oo;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f85295OooO0OO.OooO0oo(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6  */
    /* JADX WARN: Type inference failed for: r0v25, types: [byte[], java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v12, types: [byte[], java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap OooO0O0(InputStream inputStream, BitmapFactory.Options options, o00o000.OooOOO0 oooOOO0, EnumC25113OooO0O0 enumC25113OooO0O0, int i, int i2, boolean z, OooO00o oooO00o) throws IOException {
        char c;
        int i3;
        String str;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O02;
        Bitmap.Config config;
        int i4;
        boolean zHasAlpha;
        int iFloor;
        int iFloor2;
        int i5;
        int i6;
        int i7 = C25315OooO0oo.f86154OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O03 = this.f85293OooO00o;
        OooO0OO(inputStream, options, oooO00o, interfaceC25155OooO0O03);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i8 = iArr[0];
        int i9 = iArr[1];
        String str4 = options.outMimeType;
        ArrayList arrayList = this.f85296OooO0Oo;
        C25159OooO0oO c25159OooO0oO = this.f85295OooO0OO;
        int iOooO00o = com.bumptech.glide.load.OooO00o.OooO00o(arrayList, inputStream, c25159OooO0oO);
        switch (iOooO00o) {
            case 3:
            case 4:
                c = 180;
                i3 = iOooO00o;
                break;
            case 5:
            case 6:
                i3 = iOooO00o;
                c = 'Z';
                break;
            case 7:
            case 8:
                i3 = iOooO00o;
                c = 270;
                break;
            default:
                i3 = iOooO00o;
                c = 0;
                break;
        }
        int i10 = i == Integer.MIN_VALUE ? i8 : i;
        int iRound = i2 == Integer.MIN_VALUE ? i9 : i2;
        ImageHeaderParser.ImageType imageTypeOooO0O0 = com.bumptech.glide.load.OooO00o.OooO0O0(arrayList, inputStream, c25159OooO0oO);
        if (i8 <= 0 || i9 <= 0) {
            str = ", target density: ";
            interfaceC25155OooO0O0 = interfaceC25155OooO0O03;
            str2 = ", density: ";
            z2 = false;
            str3 = "x";
        } else {
            float fOooO0O0 = (c == 'Z' || c == 270) ? oooOOO0.OooO0O0(i9, i8, i10, iRound) : oooOOO0.OooO0O0(i8, i9, i10, iRound);
            if (fOooO0O0 <= 0.0f) {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(fOooO0O0);
                sb.append(" from: ");
                sb.append(oooOOO0);
                sb.append(", source: [");
                C24472OooOoo.OooO0O0(sb, "x", "], target: [", i8, i9);
                sb.append(i10);
                sb.append("x");
                sb.append(iRound);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            OooOOO0.EnumC25219OooO0oO enumC25219OooO0oOOooO00o = oooOOO0.OooO00o(i8, i9, i10, iRound);
            if (enumC25219OooO0oOOooO00o == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f = i8;
            float f2 = fOooO0O0;
            int i11 = (int) (((double) (fOooO0O0 * f)) + 0.5d);
            float f3 = i9;
            int i12 = (int) (((double) (f2 * f3)) + 0.5d);
            int i13 = i8 / i11;
            int i14 = i9 / i12;
            OooOOO0.EnumC25219OooO0oO enumC25219OooO0oO = OooOOO0.EnumC25219OooO0oO.f85898OooOo0o;
            int iMax = Math.max(1, Integer.highestOneBit(enumC25219OooO0oOOooO00o == enumC25219OooO0oO ? Math.max(i13, i14) : Math.min(i13, i14)));
            if (enumC25219OooO0oOOooO00o == enumC25219OooO0oO && iMax < 1.0f / f2) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeOooO0O0 == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f / fMin);
                int iCeil = (int) Math.ceil(f3 / fMin);
                int i15 = iMax / 8;
                if (i15 > 0) {
                    iFloor /= i15;
                    iCeil /= i15;
                }
                iFloor2 = iCeil;
            } else if (imageTypeOooO0O0 == ImageHeaderParser.ImageType.PNG || imageTypeOooO0O0 == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = iMax;
                iFloor = (int) Math.floor(f / f4);
                iFloor2 = (int) Math.floor(f3 / f4);
            } else {
                if (imageTypeOooO0O0 == ImageHeaderParser.ImageType.WEBP || imageTypeOooO0O0 == ImageHeaderParser.ImageType.WEBP_A) {
                    float f5 = iMax;
                    int iRound2 = Math.round(f / f5);
                    iFloor2 = Math.round(f3 / f5);
                    i5 = iRound2;
                } else if (i8 % iMax == 0 && i9 % iMax == 0) {
                    i5 = i8 / iMax;
                    iFloor2 = i9 / iMax;
                } else {
                    options.inJustDecodeBounds = true;
                    OooO0OO(inputStream, options, oooO00o, interfaceC25155OooO0O03);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    int i16 = iArr2[0];
                    iFloor2 = iArr2[1];
                    i5 = i16;
                }
                double dOooO0O0 = oooOOO0.OooO0O0(i5, iFloor2, i10, iRound);
                interfaceC25155OooO0O0 = interfaceC25155OooO0O03;
                int i17 = (int) ((1.0E9d * dOooO0O0) + 0.5d);
                i6 = (int) ((((double) i17) * (dOooO0O0 / ((double) (i17 / 1.0E9f)))) + 0.5d);
                options.inTargetDensity = i6;
                options.inDensity = 1000000000;
                if (i6 > 0 || i6 == 1000000000) {
                    z2 = false;
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                    z2 = false;
                }
                if (Log.isLoggable("WebpDownsampler", 2)) {
                    str2 = ", density: ";
                    str = ", target density: ";
                    str3 = "x";
                } else {
                    str3 = "x";
                    ?? byteArray = ByteArrayOutputStream.toByteArray();
                    C24472OooOoo.OooO0O0(byteArray, str3, "], power of two scaled: [", i10, iRound);
                    C24472OooOoo.OooO0O0(byteArray, str3, "], exact scale factor: ", i5, iFloor2);
                    byteArray.append(f2);
                    byteArray.append(", power of 2 sample size: ");
                    byteArray.append(iMax);
                    byteArray.append(", adjusted scale factor: ");
                    byteArray.append(dOooO0O0);
                    str = ", target density: ";
                    byteArray.append(str);
                    byteArray.append(options.inTargetDensity);
                    str2 = ", density: ";
                    byteArray.append(str2);
                    byteArray.append(options.inDensity);
                    Log.v("WebpDownsampler", byteArray.toString());
                }
            }
            i5 = iFloor;
            double dOooO0O02 = oooOOO0.OooO0O0(i5, iFloor2, i10, iRound);
            interfaceC25155OooO0O0 = interfaceC25155OooO0O03;
            int i172 = (int) ((1.0E9d * dOooO0O02) + 0.5d);
            i6 = (int) ((((double) i172) * (dOooO0O02 / ((double) (i172 / 1.0E9f)))) + 0.5d);
            options.inTargetDensity = i6;
            options.inDensity = 1000000000;
            if (i6 > 0) {
                z2 = false;
                options.inTargetDensity = 0;
                options.inDensity = 0;
                if (Log.isLoggable("WebpDownsampler", 2)) {
                }
            }
        }
        if (enumC25113OooO0O0 != EnumC25113OooO0O0.f85376OooOo0o) {
            try {
                zHasAlpha = com.bumptech.glide.load.OooO00o.OooO0O0(arrayList, inputStream, c25159OooO0oO).hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC25113OooO0O0, e);
                }
                zHasAlpha = z2;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444 || config2 == Bitmap.Config.ALPHA_8) {
                z3 = true;
                options.inDither = true;
            } else {
                z3 = true;
            }
        } else {
            z3 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        if (!z) {
            int i18 = options.inTargetDensity;
            if (i18 > 0 && (i4 = options.inDensity) > 0 && i18 != i4) {
                z2 = z3;
            }
            float f6 = z2 ? i18 / options.inDensity : 1.0f;
            int i19 = options.inSampleSize;
            float f7 = i19;
            int iCeil2 = (int) Math.ceil(i8 / f7);
            int iCeil3 = (int) Math.ceil(i9 / f7);
            int iRound3 = Math.round(iCeil2 * f6);
            iRound = Math.round(iCeil3 * f6);
            if (Log.isLoggable("WebpDownsampler", 2)) {
                ?? byteArray2 = ByteArrayOutputStream.toByteArray();
                C24472OooOoo.OooO0O0(byteArray2, str3, "], sampleSize: ", i8, i9);
                byteArray2.append(i19);
                byteArray2.append(", targetDensity: ");
                byteArray2.append(options.inTargetDensity);
                byteArray2.append(str2);
                byteArray2.append(options.inDensity);
                byteArray2.append(", density multiplier: ");
                byteArray2.append(f6);
                Log.v("WebpDownsampler", byteArray2.toString());
            }
            i10 = iRound3;
        }
        if (i10 <= 0 || iRound <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
            interfaceC25155OooO0O02 = interfaceC25155OooO0O0;
        } else {
            interfaceC25155OooO0O02 = interfaceC25155OooO0O0;
            options.inBitmap = interfaceC25155OooO0O02.OooO0O0(i10, iRound, config);
        }
        Bitmap bitmapOooO0OO = OooO0OO(inputStream, options, oooO00o, interfaceC25155OooO0O02);
        oooO00o.getClass();
        if (Log.isLoggable("WebpDownsampler", 2)) {
            StringBuilder sb2 = new StringBuilder("Decoded ");
            sb2.append(OooO0Oo(bitmapOooO0OO));
            sb2.append(" from [");
            sb2.append(i8);
            sb2.append(str3);
            C21036OooOOo0.OooO0Oo(i9, "] ", str4, " with inBitmap ", sb2);
            sb2.append(OooO0Oo(options.inBitmap));
            sb2.append(" for [");
            sb2.append(i);
            sb2.append(str3);
            sb2.append(i2);
            sb2.append("], sample size: ");
            sb2.append(options.inSampleSize);
            sb2.append(str2);
            sb2.append(options.inDensity);
            sb2.append(str);
            sb2.append(options.inTargetDensity);
            sb2.append(", thread: ");
            sb2.append(Thread.currentThread().getName());
            sb2.append(", duration: ");
            sb2.append(C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
            Log.v("WebpDownsampler", sb2.toString());
        }
        if (bitmapOooO0OO == null) {
            return null;
        }
        bitmapOooO0OO.setDensity(this.f85294OooO0O0.densityDpi);
        Bitmap bitmapOooO0Oo = C25231OooOoo0.OooO0Oo(interfaceC25155OooO0O02, bitmapOooO0OO, i3);
        if (bitmapOooO0OO.equals(bitmapOooO0Oo)) {
            return bitmapOooO0Oo;
        }
        interfaceC25155OooO0O02.OooO00o(bitmapOooO0OO);
        return bitmapOooO0Oo;
    }
}
