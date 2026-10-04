package o00o000;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: renamed from: o00o000.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25233OooOooo<T> implements InterfaceC25121OooOO0O<T, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25235OooO0o0<T> f85948OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85949OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f85950OooO0OO = f85945OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C25119OooO0oo<Long> f85944OooO0Oo = new C25119OooO0oo<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new OooO00o());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C25119OooO0oo<Integer> f85946OooO0o0 = new C25119OooO0oo<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new OooO0O0());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO0o f85945OooO0o = new OooO0o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<String> f85947OooO0oO = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO00o */
    public class OooO00o implements C25119OooO0oo.OooO0O0<Long> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f85951OooO00o = ByteBuffer.allocate(8);

        @Override // o00Ooo0o.C25119OooO0oo.OooO0O0
        public final void OooO00o(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.f85951OooO00o) {
                this.f85951OooO00o.position(0);
                messageDigest.update(this.f85951OooO00o.putLong(l2.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0O0 */
    public class OooO0O0 implements C25119OooO0oo.OooO0O0<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f85952OooO00o = ByteBuffer.allocate(4);

        @Override // o00Ooo0o.C25119OooO0oo.OooO0O0
        public final void OooO00o(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f85952OooO00o) {
                this.f85952OooO00o.position(0);
                messageDigest.update(this.f85952OooO00o.putInt(num2.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0OO */
    public static final class OooO0OO implements InterfaceC25235OooO0o0<AssetFileDescriptor> {
        @Override // o00o000.C25233OooOooo.InterfaceC25235OooO0o0
        public final void OooO00o(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // o00o000.C25233OooOooo.InterfaceC25235OooO0o0
        public final void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C25234OooO0Oo implements InterfaceC25235OooO0o0<ByteBuffer> {
        @Override // o00o000.C25233OooOooo.InterfaceC25235OooO0o0
        public final void OooO00o(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new Oooo000(byteBuffer));
        }

        @Override // o00o000.C25233OooOooo.InterfaceC25235OooO0o0
        public final void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new Oooo000(byteBuffer));
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0o */
    public static class OooO0o {
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC25235OooO0o0<T> {
        void OooO00o(MediaExtractor mediaExtractor, T t) throws IOException;

        void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0oO, reason: case insensitive filesystem */
    public static final class C25236OooO0oO implements InterfaceC25235OooO0o0<ParcelFileDescriptor> {
        @Override // o00o000.C25233OooOooo.InterfaceC25235OooO0o0
        public final void OooO00o(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // o00o000.C25233OooOooo.InterfaceC25235OooO0o0
        public final void OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: renamed from: o00o000.OooOooo$OooO0oo, reason: case insensitive filesystem */
    public static final class C25237OooO0oo extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;
    }

    public C25233OooOooo(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, InterfaceC25235OooO0o0<T> interfaceC25235OooO0o0) {
        this.f85949OooO0O0 = interfaceC25155OooO0O0;
        this.f85948OooO00o = interfaceC25235OooO0o0;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(T t, int i, int i2, C25111OooO c25111OooO) throws Throwable {
        long jLongValue = ((Long) c25111OooO.OooO0OO(f85944OooO0Oo)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) c25111OooO.OooO0OO(f85946OooO0o0);
        if (num == null) {
            num = 2;
        }
        OooOOO0 oooOOO0 = (OooOOO0) c25111OooO.OooO0OO(OooOOO0.f85894OooO0o);
        if (oooOOO0 == null) {
            oooOOO0 = OooOOO0.f85895OooO0o0;
        }
        OooOOO0 oooOOO02 = oooOOO0;
        this.f85950OooO0OO.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f85948OooO00o.OooO0O0(mediaMetadataRetriever, t);
            try {
                Bitmap bitmapOooO0OO = OooO0OO(t, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, oooOOO02);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return C25213OooO0o0.OooO0O0(bitmapOooO0OO, this.f85949OooO0O0);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                    throw th2;
                }
                mediaMetadataRetriever.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(T t, C25111OooO c25111OooO) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #2 {all -> 0x006b, blocks: (B:23:0x005f, B:25:0x0065), top: B:91:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap OooO0OO(T t, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, OooOOO0 oooOOO0) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f85948OooO00o.OooO00o(mediaExtractor, t);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i9 = 0; i9 < trackCount; i9++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i9).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (Log.isLoggable("VideoDecoder", 3)) {
                        }
                        if (mediaExtractor != null) {
                        }
                        if (Build.VERSION.SDK_INT >= 27) {
                            try {
                                i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i8 != 90) {
                                    i7 = i6;
                                    i6 = i7;
                                    float fOooO0O0 = oooOOO0.OooO0O0(i6, i7, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fOooO0O0), Math.round(fOooO0O0 * i7));
                                }
                            } catch (Throwable th3) {
                                if (Log.isLoggable("VideoDecoder", 3)) {
                                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th3);
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i5 = Integer.parseInt(strExtractMetadata);
                                    int i10 = Integer.parseInt(strExtractMetadata2);
                                    if (i5 == 7) {
                                    }
                                } catch (NumberFormatException unused) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                    }
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                        }
                    }
                    mediaExtractor.release();
                }
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            } catch (Throwable th4) {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                throw th4;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && oooOOO0 != OooOOO0.f85893OooO0Oo) {
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i8 != 90 || i8 == 270) {
                i7 = i6;
                i6 = i7;
            }
            float fOooO0O02 = oooOOO0.OooO0O0(i6, i7, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fOooO0O02), Math.round(fOooO0O02 * i7));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata22 = mediaMetadataRetriever.extractMetadata(35);
                i5 = Integer.parseInt(strExtractMetadata3);
                int i102 = Integer.parseInt(strExtractMetadata22);
                if ((i5 == 7 || i5 == 6) && i102 == 6) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                        }
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                    }
                }
            }
        } else {
            Iterator<String> it = f85947OooO0oO.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith(it.next())) {
                    String strExtractMetadata32 = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata222 = mediaMetadataRetriever.extractMetadata(35);
                    i5 = Integer.parseInt(strExtractMetadata32);
                    int i1022 = Integer.parseInt(strExtractMetadata222);
                    if (i5 == 7) {
                        if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        }
                    } else if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    }
                }
            }
        }
        if (bitmapCreateBitmap == null) {
            return bitmapCreateBitmap;
        }
        throw new C25237OooO0oo("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
