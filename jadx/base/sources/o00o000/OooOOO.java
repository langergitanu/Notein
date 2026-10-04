package o00o000;

import Oooo0oO.C21036OooOOo0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import o000OO00.C24472OooOoo;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.EnumC25113OooO0O0;
import o00Ooo0o.EnumC25120OooOO0;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.OooOOO0;
import o00o0O0.C25315OooO0oo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85876OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C25119OooO0oo<EnumC25113OooO0O0> f85877OooO0o = C25119OooO0oo.OooO00o(EnumC25113OooO0O0.f85378OooOoO0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C25119OooO0oo<EnumC25120OooOO0> f85878OooO0oO = new C25119OooO0oo<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C25119OooO0oo.f85385OooO0o0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Deprecated
    public static final C25119OooO0oo<OooOOO0> f85879OooO0oo = OooOOO0.f85894OooO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final C25119OooO0oo<Boolean> f85880OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Set<String> f85881OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f85882OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final ArrayDeque f85883OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f85884OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85885OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DisplayMetrics f85886OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25159OooO0oO f85887OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f85888OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25223OooOOoo f85889OooO0o0 = C25223OooOOoo.OooO00o();

    public class OooO00o implements OooO0O0 {
        @Override // o00o000.OooOOO.OooO0O0
        public final void OooO00o() {
        }

        @Override // o00o000.OooOOO.OooO0O0
        public final void OooO0O0(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f85876OooO = C25119OooO0oo.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f85880OooOO0 = C25119OooO0oo.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f85881OooOO0O = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f85882OooOO0o = new OooO00o();
        f85884OooOOO0 = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        f85883OooOOO = new ArrayDeque(0);
    }

    public OooOOO(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC25155OooO0O0 interfaceC25155OooO0O0, C25159OooO0oO c25159OooO0oO) {
        this.f85888OooO0Oo = arrayList;
        C21929Ooooo0o.OooO0OO(displayMetrics, "Argument must not be null");
        this.f85886OooO0O0 = displayMetrics;
        C21929Ooooo0o.OooO0OO(interfaceC25155OooO0O0, "Argument must not be null");
        this.f85885OooO00o = interfaceC25155OooO0O0;
        C21929Ooooo0o.OooO0OO(c25159OooO0oO, "Argument must not be null");
        this.f85887OooO0OO = c25159OooO0oO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap OooO0OO(OooOo00 oooOo00, BitmapFactory.Options options, OooO0O0 oooO0O0, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) throws IOException {
        if (!options.inJustDecodeBounds) {
            oooO0O0.OooO00o();
            oooOo00.OooO00o();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = C25231OooOoo0.f85943OooO0Oo;
        lock.lock();
        try {
            try {
                Bitmap bitmapOooO0OO = oooOo00.OooO0OO(options);
                lock.unlock();
                return bitmapOooO0OO;
            } catch (IllegalArgumentException e) {
                ?? byteArray = ByteArrayOutputStream.toByteArray();
                byteArray.append(str);
                byteArray.append(", inBitmap: ");
                byteArray.append(OooO0Oo(options.inBitmap));
                IOException iOException = new IOException(byteArray.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    interfaceC25155OooO0O0.OooO00o(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapOooO0OO2 = OooO0OO(oooOo00, options, oooO0O0, interfaceC25155OooO0O0);
                    C25231OooOoo0.f85943OooO0Oo.unlock();
                    return bitmapOooO0OO2;
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
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C25213OooO0o0 OooO00o(OooOo00 oooOo00, int i, int i2, C25111OooO c25111OooO, OooO0O0 oooO0O0) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f85887OooO0OO.OooO0Oo(byte[].class, 65536);
        synchronized (OooOOO.class) {
            arrayDeque = f85883OooOOO;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                OooO0o0(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC25113OooO0O0 enumC25113OooO0O0 = (EnumC25113OooO0O0) c25111OooO.OooO0OO(f85877OooO0o);
        EnumC25120OooOO0 enumC25120OooOO0 = (EnumC25120OooOO0) c25111OooO.OooO0OO(f85878OooO0oO);
        OooOOO0 oooOOO0 = (OooOOO0) c25111OooO.OooO0OO(OooOOO0.f85894OooO0o);
        boolean zBooleanValue = ((Boolean) c25111OooO.OooO0OO(f85876OooO)).booleanValue();
        C25119OooO0oo<Boolean> c25119OooO0oo = f85880OooOO0;
        try {
            C25213OooO0o0 c25213OooO0o0OooO0O0 = C25213OooO0o0.OooO0O0(OooO0O0(oooOo00, options, oooOOO0, enumC25113OooO0O0, enumC25120OooOO0, c25111OooO.OooO0OO(c25119OooO0oo) != null && ((Boolean) c25111OooO.OooO0OO(c25119OooO0oo)).booleanValue(), i, i2, zBooleanValue, oooO0O0), this.f85885OooO00o);
            OooO0o0(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f85887OooO0OO.OooO0oo(bArr);
            return c25213OooO0o0OooO0O0;
        } catch (Throwable th) {
            OooO0o0(options);
            ArrayDeque arrayDeque2 = f85883OooOOO;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f85887OooO0OO.OooO0oo(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02ba  */
    /* JADX WARN: Type inference failed for: r0v36, types: [byte[], java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v15, types: [byte[], java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap OooO0O0(OooOo00 oooOo00, BitmapFactory.Options options, OooOOO0 oooOOO0, EnumC25113OooO0O0 enumC25113OooO0O0, EnumC25120OooOO0 enumC25120OooOO0, boolean z, int i, int i2, boolean z2, OooO0O0 oooO0O0) throws IOException {
        int i3;
        int i4;
        boolean z3;
        String str;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0;
        int i5;
        boolean zHasAlpha;
        boolean z4;
        String str2;
        int i6;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O02;
        ColorSpace colorSpace;
        Bitmap.Config config;
        String str3;
        int i7;
        int i8;
        int iFloor;
        int iFloor2;
        int i9 = i;
        int i10 = C25315OooO0oo.f86154OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O03 = this.f85885OooO00o;
        OooO0OO(oooOo00, options, oooO0O0, interfaceC25155OooO0O03);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i11 = iArr[0];
        int i12 = iArr[1];
        String str4 = options.outMimeType;
        boolean z5 = (i11 == -1 || i12 == -1) ? false : z;
        int iOooO0O0 = oooOo00.OooO0O0();
        switch (iOooO0O0) {
            case 3:
            case 4:
                i3 = 180;
                break;
            case 5:
            case 6:
                i3 = 90;
                break;
            case 7:
            case 8:
                i3 = 270;
                break;
            default:
                i3 = 0;
                break;
        }
        switch (iOooO0O0) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i4 = iOooO0O0;
                z3 = true;
                break;
            default:
                i4 = iOooO0O0;
                z3 = false;
                break;
        }
        int i13 = Integer.MIN_VALUE;
        if (i9 == Integer.MIN_VALUE) {
            i9 = (i3 == 90 || i3 == 270) ? i12 : i11;
            i13 = Integer.MIN_VALUE;
        }
        int i14 = i2 == i13 ? (i3 == 90 || i3 == 270) ? i11 : i12 : i2;
        ImageHeaderParser.ImageType imageType = oooOo00.getImageType();
        String str5 = ", density: ";
        boolean z6 = z5;
        boolean z7 = z3;
        if (i11 <= 0 || i12 <= 0) {
            str = ", target density: ";
            interfaceC25155OooO0O0 = interfaceC25155OooO0O03;
            i5 = i11;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i9 + "x" + i14 + "]");
            }
        } else {
            if (i3 == 90 || i3 == 270) {
                str3 = ", density: ";
                i7 = i12;
                i8 = i11;
            } else {
                str3 = ", density: ";
                i8 = i12;
                i7 = i11;
            }
            float fOooO0O0 = oooOOO0.OooO0O0(i7, i8, i9, i14);
            if (fOooO0O0 <= 0.0f) {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(fOooO0O0);
                sb.append(" from: ");
                sb.append(oooOOO0);
                sb.append(", source: [");
                C24472OooOoo.OooO0O0(sb, "x", "], target: [", i11, i12);
                sb.append(i9);
                sb.append("x");
                sb.append(i14);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            OooOOO0.EnumC25219OooO0oO enumC25219OooO0oOOooO00o = oooOOO0.OooO00o(i7, i8, i9, i14);
            if (enumC25219OooO0oOOooO00o == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i15 = i3;
            float f = i7;
            int i16 = i7;
            float f2 = i8;
            int i17 = i16 / ((int) (((double) (fOooO0O0 * f)) + 0.5d));
            int i18 = i8 / ((int) (((double) (fOooO0O0 * f2)) + 0.5d));
            OooOOO0.EnumC25219OooO0oO enumC25219OooO0oO = OooOOO0.EnumC25219OooO0oO.f85898OooOo0o;
            int iMax = Math.max(1, Integer.highestOneBit(enumC25219OooO0oOOooO00o == enumC25219OooO0oO ? Math.max(i17, i18) : Math.min(i17, i18)));
            if (enumC25219OooO0oOOooO00o == enumC25219OooO0oO && iMax < 1.0f / fOooO0O0) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageType == ImageHeaderParser.ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f / fMin);
                iFloor2 = (int) Math.ceil(f2 / fMin);
                int i19 = iMax / 8;
                if (i19 > 0) {
                    iFloor /= i19;
                    iFloor2 /= i19;
                }
            } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f3 = iMax;
                iFloor = (int) Math.floor(f / f3);
                iFloor2 = (int) Math.floor(f2 / f3);
            } else if (imageType.isWebp()) {
                float f4 = iMax;
                iFloor = Math.round(f / f4);
                iFloor2 = Math.round(f2 / f4);
            } else if (i16 % iMax == 0 && i8 % iMax == 0) {
                iFloor = i16 / iMax;
                iFloor2 = i8 / iMax;
            } else {
                options.inJustDecodeBounds = true;
                OooO0OO(oooOo00, options, oooO0O0, interfaceC25155OooO0O03);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                iFloor = iArr2[0];
                iFloor2 = iArr2[1];
            }
            double dOooO0O0 = oooOOO0.OooO0O0(iFloor, iFloor2, i9, i14);
            int iRound = (int) Math.round((dOooO0O0 <= 1.0d ? dOooO0O0 : 1.0d / dOooO0O0) * 2.147483647E9d);
            int i20 = (int) ((((double) iRound) * dOooO0O0) + 0.5d);
            options.inTargetDensity = (int) (((dOooO0O0 / ((double) (i20 / iRound))) * ((double) i20)) + 0.5d);
            int iRound2 = (int) Math.round((dOooO0O0 <= 1.0d ? dOooO0O0 : 1.0d / dOooO0O0) * 2.147483647E9d);
            options.inDensity = iRound2;
            int i21 = options.inTargetDensity;
            if (i21 <= 0 || iRound2 <= 0 || i21 == iRound2) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                i5 = i11;
                i12 = i12;
                ?? byteArray = ByteArrayOutputStream.toByteArray();
                C24472OooOoo.OooO0O0(byteArray, ", target: [", "x", i15, i9);
                C24472OooOoo.OooO0O0(byteArray, "], power of two scaled: [", "x", i14, iFloor);
                byteArray.append(iFloor2);
                byteArray.append("], exact scale factor: ");
                byteArray.append(fOooO0O0);
                byteArray.append(", power of 2 sample size: ");
                byteArray.append(iMax);
                byteArray.append(", adjusted scale factor: ");
                interfaceC25155OooO0O0 = interfaceC25155OooO0O03;
                byteArray.append(dOooO0O0);
                str = ", target density: ";
                byteArray.append(str);
                byteArray.append(options.inTargetDensity);
                str5 = str3;
                byteArray.append(str5);
                byteArray.append(options.inDensity);
                Log.v("Downsampler", byteArray.toString());
            } else {
                interfaceC25155OooO0O0 = interfaceC25155OooO0O03;
                str5 = str3;
                str = ", target density: ";
                i5 = i11;
                i12 = i12;
            }
        }
        boolean zOooO0OO = this.f85889OooO0o0.OooO0OO(i9, i14, z6, z7);
        if (zOooO0OO) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zOooO0OO) {
            if (enumC25113OooO0O0 != EnumC25113OooO0O0.f85376OooOo0o) {
                try {
                    zHasAlpha = oooOo00.getImageType().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC25113OooO0O0, e);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    z4 = true;
                    options.inDither = true;
                } else {
                    z4 = true;
                }
            } else {
                z4 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        int i22 = Build.VERSION.SDK_INT;
        if (i5 < 0 || i12 < 0 || !z2) {
            int i23 = options.inTargetDensity;
            float f5 = (i23 <= 0 || (i6 = options.inDensity) <= 0 || i23 == i6) ? false : z4 ? i23 / options.inDensity : 1.0f;
            int i24 = options.inSampleSize;
            float f6 = i24;
            int iCeil = (int) Math.ceil(i5 / f6);
            str2 = str;
            int iCeil2 = (int) Math.ceil(i12 / f6);
            int iRound3 = Math.round(iCeil * f5);
            int iRound4 = Math.round(iCeil2 * f5);
            if (Log.isLoggable("Downsampler", 2)) {
                ?? byteArray2 = ByteArrayOutputStream.toByteArray();
                C24472OooOoo.OooO0O0(byteArray2, "x", "], sampleSize: ", i5, i12);
                byteArray2.append(i24);
                byteArray2.append(", targetDensity: ");
                byteArray2.append(options.inTargetDensity);
                byteArray2.append(str5);
                byteArray2.append(options.inDensity);
                byteArray2.append(", density multiplier: ");
                byteArray2.append(f5);
                Log.v("Downsampler", byteArray2.toString());
            }
            i14 = iRound4;
            i9 = iRound3;
        } else {
            str2 = str;
        }
        if (i9 <= 0 || i14 <= 0 || (config = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
            interfaceC25155OooO0O02 = interfaceC25155OooO0O0;
        } else {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            interfaceC25155OooO0O02 = interfaceC25155OooO0O0;
            options.inBitmap = interfaceC25155OooO0O02.OooO0O0(i9, i14, config);
        }
        if (enumC25120OooOO0 != null) {
            if (i22 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get(enumC25120OooOO0 == EnumC25120OooOO0.f85391OooOo0o && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapOooO0OO = OooO0OO(oooOo00, options, oooO0O0, interfaceC25155OooO0O02);
        oooO0O0.OooO0O0(bitmapOooO0OO, interfaceC25155OooO0O02);
        if (Log.isLoggable("Downsampler", 2)) {
            StringBuilder sb2 = new StringBuilder("Decoded ");
            sb2.append(OooO0Oo(bitmapOooO0OO));
            sb2.append(" from [");
            sb2.append(i5);
            sb2.append("x");
            C21036OooOOo0.OooO0Oo(i12, "] ", str4, " with inBitmap ", sb2);
            sb2.append(OooO0Oo(options.inBitmap));
            sb2.append(" for [");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("], sample size: ");
            sb2.append(options.inSampleSize);
            sb2.append(str5);
            sb2.append(options.inDensity);
            sb2.append(str2);
            sb2.append(options.inTargetDensity);
            sb2.append(", thread: ");
            sb2.append(Thread.currentThread().getName());
            sb2.append(", duration: ");
            sb2.append(C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
            Log.v("Downsampler", sb2.toString());
        }
        if (bitmapOooO0OO == null) {
            return null;
        }
        bitmapOooO0OO.setDensity(this.f85886OooO0O0.densityDpi);
        Bitmap bitmapOooO0Oo = C25231OooOoo0.OooO0Oo(interfaceC25155OooO0O02, bitmapOooO0OO, i4);
        if (bitmapOooO0OO.equals(bitmapOooO0Oo)) {
            return bitmapOooO0Oo;
        }
        interfaceC25155OooO0O02.OooO00o(bitmapOooO0OO);
        return bitmapOooO0Oo;
    }
}
