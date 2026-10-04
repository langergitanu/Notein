package o0OO00o0;

import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.InputStream;
import java.util.LinkedHashMap;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00O0OOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f91699OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f91700OooOo0o;

    public /* synthetic */ o00O0OOO(C26596o00O0o0 c26596o00O0o0, Uri uri) {
        this.f91700OooOo0o = c26596o00O0o0;
        this.f91699OooOo = uri;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        boolean z;
        InputStream inputStreamOpenInputStream;
        C26596o00O0o0 c26596o00O0o0 = this.f91700OooOo0o;
        Uri uri = this.f91699OooOo;
        try {
            Cursor cursorQuery = c26596o00O0o0.f91722OooO0OO.getContentResolver().query(uri, new String[]{"_id", "date_added"}, null, null, "date_added DESC");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (cursorQuery == null) {
                return linkedHashMap;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int i = 0;
                while (i < 18 && cursor2.moveToNext()) {
                    long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
                    Uri uriWithAppendedId = ContentUris.withAppendedId(uri, j);
                    kotlin.jvm.internal.OooOOO0.OooO0o(uriWithAppendedId, "withAppendedId(...)");
                    try {
                        inputStreamOpenInputStream = c26596o00O0o0.f91722OooO0OO.getContentResolver().openInputStream(uriWithAppendedId);
                    } catch (Exception unused) {
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                            z = options.outWidth > 0 && options.outHeight > 0;
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                oO0O000.OooO00o.OooO00o(inputStreamOpenInputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put(String.valueOf(j), uriWithAppendedId);
                        i++;
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                cursor.close();
                return linkedHashMap;
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ImageRepoImpl");
            c20358OooO00o.OooO0Oo(e, "getLatestImagesInDevices#queryImages error.", new Object[0]);
            return C34436OooOoOO.f123455OooOo0o;
        }
    }
}
