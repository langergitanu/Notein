package o0oo000O;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo000O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31182OooO {
    public static int OooO00o(Context context, Uri uri) {
        Uri uri2;
        int columnIndex;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt("Orientation", 1);
                    if (attributeInt == 3) {
                        inputStreamOpenInputStream.close();
                        return 180;
                    }
                    if (attributeInt == 6) {
                        inputStreamOpenInputStream.close();
                        return 90;
                    }
                    if (attributeInt == 8) {
                        inputStreamOpenInputStream.close();
                        return 270;
                    }
                } finally {
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ImageUtils");
            c20358OooO00o.OooOO0o(e, "Failed to read EXIF data from URI: %s", uri);
        }
        if (Build.VERSION.SDK_INT >= 29 || "com.android.providers.media.photopicker".equals(uri.getAuthority())) {
            return 0;
        }
        Cursor cursorQuery = null;
        try {
            try {
                uri2 = uri;
            } finally {
            }
        } catch (Exception e2) {
            e = e2;
            uri2 = uri;
        }
        try {
            cursorQuery = context.getContentResolver().query(uri2, new String[]{"orientation"}, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("orientation")) >= 0) {
                int i = cursorQuery.getInt(columnIndex);
                cursorQuery.close();
                return i;
            }
            if (cursorQuery == null) {
                return 0;
            }
        } catch (Exception e3) {
            e = e3;
            Exception exc = e;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ImageUtils");
            c20358OooO00o2.OooOO0o(exc, "Failed to query MediaStore for orientation: %s", uri2);
            if (cursorQuery == null) {
                return 0;
            }
        }
        cursorQuery.close();
        return 0;
    }

    public static Bitmap OooO0O0(int i, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static boolean OooO0OO(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        boolean zCreateNewFile;
        BufferedOutputStream bufferedOutputStream;
        boolean zCompress = false;
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            Log.e("ImageUtils", "bitmap is empty.");
            return false;
        }
        if (bitmap.isRecycled()) {
            Log.e("ImageUtils", "bitmap is recycled.");
            return false;
        }
        int i2 = C31190OooO0oo.f111228OooO00o;
        if (file != null && ((!file.exists() || file.delete()) && C31190OooO0oo.OooO0o(file.getParentFile()))) {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                zCreateNewFile = false;
            }
        } else {
            zCreateNewFile = false;
        }
        if (!zCreateNewFile) {
            Log.e("ImageUtils", "create or delete file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            zCompress = bitmap.compress(compressFormat, i, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (IOException e4) {
            e = e4;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            return zCompress;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
        return zCompress;
    }

    public static Bitmap OooO0Oo(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = 2560;
        if (height > width) {
            i2 = (int) ((2560 * width) / height);
            i = 2560;
        } else {
            i = width > height ? (int) ((2560 * height) / width) : 2560;
        }
        return Bitmap.createScaledBitmap(bitmap, i2, i, false);
    }
}
