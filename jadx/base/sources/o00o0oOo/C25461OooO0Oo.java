package o00o0oOo;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: renamed from: o00o0oOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25461OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Uri f86761OooO00o = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String OooO00o(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!FirebaseAnalytics.Param.CONTENT.equals(OooO0O0(uri))) {
            if ("file".equals(OooO0O0(uri))) {
                return uri.getPath();
            }
            return null;
        }
        boolean z = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            documentId.getClass();
            Uri uri3 = z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri3.getClass();
            str = "_id=?";
            uri2 = uri3;
            strArr = new String[]{documentId.split(C18241k5.f55433h)[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{"_data"}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data")) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } finally {
                cursorQuery.close();
            }
        }
        if (cursorQuery != null) {
        }
        return string;
    }

    public static String OooO0O0(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean OooO0OO(Uri uri) {
        String strOooO0O0 = OooO0O0(uri);
        return AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(strOooO0O0) || "http".equals(strOooO0O0);
    }
}
