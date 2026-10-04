package o0OOo0o;

import OooOoo.C20593OooO0Oo;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.AbstractC27507o00OoooO;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00o0000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27515o00o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96433OooO00o;

    public C27515o00o0000(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f96433OooO00o = abstractApplicationC26277OooOoOO;
    }

    public static final String OooO00o(C27515o00o0000 c27515o00o0000) {
        c27515o00o0000.getClass();
        return C20593OooO0Oo.OooO0O0("NoteIn_", new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.getDefault()).format(new Date()), ".jpg");
    }

    public static final AbstractC27507o00OoooO OooO0O0(C27515o00o0000 c27515o00o0000, Bitmap bitmap, String str) throws IOException {
        int i = Build.VERSION.SDK_INT;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27515o00o0000.f96433OooO00o;
        if (i <= 28 && ContextCompat.checkSelfPermission(abstractApplicationC26277OooOoOO, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SaveImageToGallery");
            c20358OooO00o.OooOO0O("WRITE_EXTERNAL_STORAGE permission not granted", new Object[0]);
            return AbstractC27507o00OoooO.C27508OooO0Oo.f96406OooO00o;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "NoteIn");
        if (!file.exists() && !file.mkdirs()) {
            return new AbstractC27507o00OoooO.OooO0O0("Failed to create directory");
        }
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream)) {
                AbstractC27507o00OoooO.OooO0O0 oooO0O0 = new AbstractC27507o00OoooO.OooO0O0("Failed to compress image");
                fileOutputStream.close();
                return oooO0O0;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            fileOutputStream.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", file2.getAbsolutePath());
            contentValues.put("mime_type", "image/jpeg");
            return new AbstractC27507o00OoooO.C27509OooO0o0(abstractApplicationC26277OooOoOO.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
        } finally {
        }
    }

    public static final AbstractC27507o00OoooO OooO0OO(C27515o00o0000 c27515o00o0000, Bitmap bitmap, String str) throws Exception {
        c27515o00o0000.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/NoteIn");
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27515o00o0000.f96433OooO00o;
        Uri uriInsert = abstractApplicationC26277OooOoOO.getContentResolver().insert(contentUri, contentValues);
        if (uriInsert == null) {
            return new AbstractC27507o00OoooO.OooO0O0("Failed to create media entry");
        }
        try {
            OutputStream outputStreamOpenOutputStream = abstractApplicationC26277OooOoOO.getContentResolver().openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream != null) {
                try {
                    if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 95, outputStreamOpenOutputStream)) {
                        AbstractC27507o00OoooO.OooO0O0 oooO0O0 = new AbstractC27507o00OoooO.OooO0O0("Failed to compress image");
                        outputStreamOpenOutputStream.close();
                        return oooO0O0;
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    outputStreamOpenOutputStream.close();
                } finally {
                }
            }
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            abstractApplicationC26277OooOoOO.getContentResolver().update(uriInsert, contentValues, null, null);
            return new AbstractC27507o00OoooO.C27509OooO0o0(uriInsert);
        } catch (Exception e) {
            abstractApplicationC26277OooOoOO.getContentResolver().delete(uriInsert, null, null);
            throw e;
        }
    }
}
