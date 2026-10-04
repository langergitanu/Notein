package o0OoO0oo;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.MimeTypeFilter;
import androidx.core.net.UriKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;
import java.io.IOException;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31194OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28692OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C28692OooO0oo f101652OooO00o = new C28692OooO0oo();

    public static File OooO00o(File file, String str) {
        String str2;
        if (str != null) {
            File file2 = new File(file, str);
            if (file2.exists()) {
                int iOooo0oO = C33599OooOo0O.Oooo0oO(str, FilenameUtils.EXTENSION_SEPARATOR, 0, 6);
                if (iOooo0oO > 0) {
                    String strSubstring = str.substring(0, iOooo0oO);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                    String strSubstring2 = str.substring(iOooo0oO);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "substring(...)");
                    str2 = strSubstring2;
                    str = strSubstring;
                } else {
                    str2 = "";
                }
                int i = 0;
                while (file2.exists()) {
                    i++;
                    file2 = new File(file, str + "(" + i + ")" + str2);
                }
            }
            try {
                if (C31190OooO0oo.OooO0oO(file2)) {
                    return file2;
                }
            } catch (IOException e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ContentUriConvertor");
                c20358OooO00o.OooO0OO("Error creating new file: " + file2 + ", " + e, new Object[0]);
                return null;
            }
        }
        return null;
    }

    public static File OooO0O0(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        File file = new File(context.getFilesDir(), "documents");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #3 {Exception -> 0x0077, blocks: (B:26:0x0070, B:28:0x0074), top: B:47:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO0OO(Context context, Uri uri) {
        Uri uri2;
        Throwable th;
        Exception exc;
        String str;
        Cursor cursor;
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string = null;
        cursor2 = null;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
            try {
                try {
                    uri2 = uri;
                    try {
                        Cursor cursorQuery = context.getContentResolver().query(uri2, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")) : null;
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } catch (Exception e) {
                                exc = e;
                                String str2 = string;
                                cursor2 = cursorQuery;
                                str = str2;
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("ContentUriConvertor");
                                c20358OooO00o.OooO0OO("Error getting file name: " + exc, new Object[0]);
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                try {
                                    cursor = cursor2;
                                    if (cursor != null) {
                                    }
                                } catch (Exception unused) {
                                }
                                string = str;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursorQuery;
                                try {
                                    Cursor cursor3 = cursor2;
                                    if (cursor3 == null) {
                                        throw th;
                                    }
                                    cursor3.close();
                                    throw th;
                                } catch (Exception unused2) {
                                    throw th;
                                }
                            }
                        }
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        str = null;
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("ContentUriConvertor");
                        c20358OooO00o2.OooO0OO("Error getting file name: " + exc, new Object[0]);
                        C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        string = str;
                        if (string == null) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e3) {
                e = e3;
                uri2 = uri;
            }
        } else {
            uri2 = uri;
        }
        if (string == null) {
            return string;
        }
        String path = uri2.getPath();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(path);
        int iOooo0oO = C33599OooOo0O.Oooo0oO(path, IOUtils.DIR_SEPARATOR_UNIX, 0, 6);
        if (iOooo0oO == -1) {
            return path;
        }
        String strSubstring = path.substring(iOooo0oO + 1);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String OooO0o0(Context context, Uri uri, File file) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        try {
            File fileOooO00o = OooO00o(file, OooO0OO(context, uri));
            if (fileOooO00o == null) {
                return null;
            }
            String absolutePath = fileOooO00o.getAbsolutePath();
            C31190OooO0oo.OooO0O0(context, uri, fileOooO00o);
            return absolutePath;
        } catch (SecurityException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ContentUriConvertor");
            c20358OooO00o.OooO0OO("copyFileFromUri: SecurityException: %s", e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(Context context, Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28689OooO0o c28689OooO0o;
        if (abstractC32479OooO0OO instanceof C28689OooO0o) {
            c28689OooO0o = (C28689OooO0o) abstractC32479OooO0OO;
            int i = c28689OooO0o.f101648OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28689OooO0o.f101648OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28689OooO0o = new C28689OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28689OooO0o.f101647OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28689OooO0o.f101648OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            String path = uri.getPath();
            File file = null;
            try {
                if (MimeTypeFilter.matches((path == null || path.length() == 0 || !"file".equals(uri.getScheme())) ? context.getContentResolver().getType(uri) : MimeTypeMap.getSingleton().getMimeTypeFromExtension(C32501OooO0oO.OooO0o0(UriKt.toFile(uri))), "image/*")) {
                    c28689OooO0o.f101648OooOoO0 = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28691OooO0oO(context, uri, null), c28689OooO0o);
                    if (objOooO0o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    try {
                        File fileOooO0OO = C31194OooOOo0.OooO0OO(context, uri);
                        if (fileOooO0OO != null) {
                            if (fileOooO0OO.canRead()) {
                                file = fileOooO0OO;
                            }
                        }
                    } catch (SecurityException e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("UriUtils");
                        c20358OooO00o.OooO0OO("uri2File: SecurityException: %s", e.getMessage());
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            File file2 = new File(path2);
                            if (file2.exists() && file2.canRead()) {
                                file = file2;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (file != null && file.exists()) {
                return file.getAbsolutePath();
            }
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            return OooO0o0(context, uri, new File(context.getExternalCacheDir(), "documents"));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(objOooO0o);
        return (String) objOooO0o;
    }
}
