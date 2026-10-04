package com.google.mlkit.vision.common.internal;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o000Ooo.C24545OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public class ImageUtils {
    private static final GmsLogger zza = new GmsLogger("MLKitImageUtils", "");
    private static final ImageUtils zzb = new ImageUtils();

    private ImageUtils() {
    }

    public static ImageUtils getInstance() {
        return zzb;
    }

    public IObjectWrapper getImageDataWrapper(InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return ObjectWrapper.wrap(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                throw new MlKitException(C21532OooOOo.OooO0OO(inputImage.getFormat(), "Unsupported image format: "), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
    }

    public int getMobileVisionImageFormat(InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix getUprightRotationMatrix(int i, int i2, int i3) {
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i4 = i3 % 2;
        int i5 = i4 != 0 ? i2 : i;
        if (i4 == 0) {
            i = i2;
        }
        matrix.postTranslate(i5 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[PHI: r5
      0x008d: PHI (r5v3 android.graphics.Matrix) = (r5v0 android.graphics.Matrix), (r5v1 android.graphics.Matrix) binds: [B:38:0x008a, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0075, B:38:0x008a, B:49:0x00bb, B:51:0x00c4, B:40:0x008f, B:41:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x00a5, B:45:0x00a9, B:47:0x00b0, B:36:0x0070, B:33:0x005e, B:53:0x00c9, B:54:0x00d0), top: B:62:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap zza(ContentResolver contentResolver, Uri uri) throws IOException {
        IOException iOException;
        C24545OooO00o c24545OooO00o;
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int iOooO0OO = 0;
            Matrix matrix2 = null;
            if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            c24545OooO00o = new C24545OooO00o(inputStreamOpenInputStream);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                } catch (Exception unused) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        c24545OooO00o = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e) {
                            iOException = e;
                            zza.m74907e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                        }
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    c24545OooO00o = null;
                    zza.m74907e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
                    if (c24545OooO00o == null) {
                    }
                    Matrix matrix3 = new Matrix();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    switch (iOooO0OO) {
                    }
                    return matrix == null ? bitmap : bitmap;
                }
                if (c24545OooO00o == null) {
                    iOooO0OO = c24545OooO00o.OooO0OO(1);
                }
            }
            Matrix matrix32 = new Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (iOooO0OO) {
                case 2:
                    matrix2 = new Matrix();
                    matrix2.postScale(-1.0f, 1.0f);
                    matrix = matrix2;
                    break;
                case 3:
                    matrix32.postRotate(180.0f);
                    matrix = matrix32;
                    break;
                case 4:
                    matrix32.postScale(1.0f, -1.0f);
                    matrix = matrix32;
                    break;
                case 5:
                    matrix32.postRotate(90.0f);
                    matrix32.postScale(-1.0f, 1.0f);
                    matrix = matrix32;
                    break;
                case 6:
                    matrix32.postRotate(90.0f);
                    matrix = matrix32;
                    break;
                case 7:
                    matrix32.postRotate(-90.0f);
                    matrix32.postScale(-1.0f, 1.0f);
                    matrix = matrix32;
                    break;
                case 8:
                    matrix32.postRotate(-90.0f);
                    matrix = matrix32;
                    break;
                default:
                    matrix = matrix2;
                    break;
            }
            if (matrix == null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true))) {
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
        } catch (FileNotFoundException e3) {
            zza.m74907e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e3);
            throw e3;
        }
    }
}
