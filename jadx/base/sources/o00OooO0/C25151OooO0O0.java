package o00OooO0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.C22257OooO0oO;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o00Ooo0o.EnumC25112OooO00o;

/* JADX INFO: renamed from: o00OooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25151OooO0O0 implements InterfaceC22255OooO0Oo<InputStream> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25153OooO0Oo f85609OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Uri f85610OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InputStream f85611OooOoO0;

    /* JADX INFO: renamed from: o00OooO0.OooO0O0$OooO00o */
    public static class OooO00o implements InterfaceC25152OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f85612OooO0O0 = {"_data"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f85613OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f85613OooO00o = contentResolver;
        }

        @Override // o00OooO0.InterfaceC25152OooO0OO
        public final Cursor OooO00o(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f85613OooO00o.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f85612OooO0O0, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* JADX INFO: renamed from: o00OooO0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19679OooO0O0 implements InterfaceC25152OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f85614OooO0O0 = {"_data"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f85615OooO00o;

        public C19679OooO0O0(ContentResolver contentResolver) {
            this.f85615OooO00o = contentResolver;
        }

        @Override // o00OooO0.InterfaceC25152OooO0OO
        public final Cursor OooO00o(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f85615OooO00o.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f85614OooO0O0, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public C25151OooO0O0(Uri uri, C25153OooO0Oo c25153OooO0Oo) {
        this.f85610OooOo0o = uri;
        this.f85609OooOo = c25153OooO0Oo;
    }

    public static C25151OooO0O0 OooO0o0(Context context, Uri uri, InterfaceC25152OooO0OO interfaceC25152OooO0OO) {
        return new C25151OooO0O0(uri, new C25153OooO0Oo(com.bumptech.glide.OooO0OO.OooO00o(context).f67116OooOoO0.OooO00o().OooO0o0(), interfaceC25152OooO0OO, com.bumptech.glide.OooO0OO.OooO00o(context).f67115OooOoO, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0O0() {
        InputStream inputStream = this.f85611OooOoO0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final EnumC25112OooO00o OooO0OO() {
        return EnumC25112OooO00o.f85370OooOo0o;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super InputStream> oooO00o) throws Throwable {
        try {
            InputStream inputStreamOooO0o = OooO0o();
            this.f85611OooOoO0 = inputStreamOooO0o;
            oooO00o.OooO0o0(inputStreamOooO0o);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            oooO00o.OooO0o(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0022: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputStream OooO0o() throws Throwable {
        Cursor cursorOooO00o;
        ?? r6;
        String string;
        boolean zIsEmpty;
        InputStream inputStreamOpenInputStream;
        int iOooO00o;
        Uri uri = this.f85610OooOo0o;
        C25153OooO0Oo c25153OooO0Oo = this.f85609OooOo;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorOooO00o = c25153OooO0Oo.f85616OooO00o.OooO00o(uri);
            } catch (Throwable th) {
                th = th;
                r5 = r6;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (SecurityException e) {
            e = e;
            cursorOooO00o = null;
        } catch (Throwable th2) {
            th = th2;
            if (r5 != 0) {
            }
            throw th;
        }
        if (cursorOooO00o != null) {
            try {
            } catch (SecurityException e2) {
                e = e2;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
                if (cursorOooO00o != null) {
                }
                string = null;
                zIsEmpty = TextUtils.isEmpty(string);
                ContentResolver contentResolver = c25153OooO0Oo.f85618OooO0OO;
                if (zIsEmpty) {
                }
                if (inputStreamOpenInputStream != null) {
                }
                if (iOooO00o != -1) {
                }
            }
            if (cursorOooO00o.moveToFirst()) {
                string = cursorOooO00o.getString(0);
                cursorOooO00o.close();
                zIsEmpty = TextUtils.isEmpty(string);
                ContentResolver contentResolver2 = c25153OooO0Oo.f85618OooO0OO;
                if (zIsEmpty) {
                    inputStreamOpenInputStream = null;
                } else {
                    File file = new File(string);
                    if (file.exists() && 0 < file.length()) {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = contentResolver2.openInputStream(uriFromFile);
                        } catch (NullPointerException e3) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e3));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        try {
                            inputStreamOpenInputStream2 = contentResolver2.openInputStream(uri);
                            iOooO00o = com.bumptech.glide.load.OooO00o.OooO00o(c25153OooO0Oo.f85619OooO0Oo, inputStreamOpenInputStream2, c25153OooO0Oo.f85617OooO0O0);
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                try {
                                    r5.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException | NullPointerException e4) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e4);
                        }
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                inputStreamOpenInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        iOooO00o = -1;
                    }
                } else {
                    iOooO00o = -1;
                }
                return iOooO00o != -1 ? new C22257OooO0oO(inputStreamOpenInputStream, iOooO00o) : inputStreamOpenInputStream;
            }
        }
        if (cursorOooO00o != null) {
            cursorOooO00o.close();
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        ContentResolver contentResolver22 = c25153OooO0Oo.f85618OooO0OO;
        if (zIsEmpty) {
        }
        if (inputStreamOpenInputStream != null) {
        }
        if (iOooO00o != -1) {
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void cancel() {
    }
}
