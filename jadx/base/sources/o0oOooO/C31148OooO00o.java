package o0oOooO;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import o000Ooo.C24545OooO00o;

/* JADX INFO: renamed from: o0oOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31148OooO00o {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: OutOfMemoryError -> 0x00af, TRY_LEAVE, TryCatch #1 {OutOfMemoryError -> 0x00af, blocks: (B:26:0x0090, B:28:0x00aa), top: B:36:0x0090 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C31149OooO0O0 OooO00o(Context context, Uri uri) {
        Bitmap bitmapCreateBitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        Bitmap bitmap = null;
        BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        while (true) {
            i2 /= 2;
            if (i2 < 1024 || (i3 = i3 / 2) < 1024) {
                break;
            }
            i *= 2;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options2);
        if (bitmapDecodeStream != null) {
            int iOooO0OO = 0;
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                OooOOO0.OooO0Oo(inputStreamOpenInputStream);
                iOooO0OO = new C24545OooO00o(inputStreamOpenInputStream).OooO0OO(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Matrix matrix = new Matrix();
            switch (iOooO0OO) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                        if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                            bitmapDecodeStream.recycle();
                        }
                        bitmap = bitmapCreateBitmap;
                    } catch (OutOfMemoryError e2) {
                        e2.printStackTrace();
                        bitmap = bitmapDecodeStream;
                    }
                    break;
                case 3:
                    matrix.setRotate(180.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                    OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                    }
                    bitmap = bitmapCreateBitmap;
                    break;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                    OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                    }
                    bitmap = bitmapCreateBitmap;
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                    OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                    }
                    bitmap = bitmapCreateBitmap;
                    break;
                case 6:
                    matrix.setRotate(90.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                    OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                    }
                    bitmap = bitmapCreateBitmap;
                    break;
                case 7:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                    OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                    }
                    bitmap = bitmapCreateBitmap;
                    break;
                case 8:
                    matrix.setRotate(-90.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                    OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeStream)) {
                    }
                    bitmap = bitmapCreateBitmap;
                    break;
                default:
                    bitmap = bitmapDecodeStream;
                    break;
            }
        }
        return new C31149OooO0O0(bitmap);
    }
}
