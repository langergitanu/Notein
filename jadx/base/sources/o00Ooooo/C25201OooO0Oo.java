package o00Ooooo;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.C25190OooOo0O;
import o00OoooO.InterfaceC25186OooOOo;
import o00OoooO.InterfaceC25188OooOOoo;
import o00o0O00.C25320OooO0Oo;
import o00oo0O0.C25679OooOo0o;

/* JADX INFO: renamed from: o00Ooooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25201OooO0Oo<DataT> implements InterfaceC25186OooOOo<Uri, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85785OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25186OooOOo<File, DataT> f85786OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25186OooOOo<Uri, DataT> f85787OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Class<DataT> f85788OooO0Oo;

    /* JADX INFO: renamed from: o00Ooooo.OooO0Oo$OooO00o */
    public static abstract class OooO00o<DataT> implements InterfaceC25188OooOOoo<Uri, DataT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85789OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<DataT> f85790OooO0O0;

        public OooO00o(Context context, Class<DataT> cls) {
            this.f85789OooO00o = context;
            this.f85790OooO0O0 = cls;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, DataT> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            Class<DataT> cls = this.f85790OooO0O0;
            return new C25201OooO0Oo(this.f85789OooO00o, c25190OooOo0O.OooO0O0(File.class, cls), c25190OooOo0O.OooO0O0(Uri.class, cls), cls);
        }
    }

    /* JADX INFO: renamed from: o00Ooooo.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<ParcelFileDescriptor> {
    }

    /* JADX INFO: renamed from: o00Ooooo.OooO0Oo$OooO0OO */
    public static final class OooO0OO extends OooO00o<InputStream> {
    }

    /* JADX INFO: renamed from: o00Ooooo.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static final class C19686OooO0Oo<DataT> implements InterfaceC22255OooO0Oo<DataT> {

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public static final String[] f85791Oooo00O = {"_data"};

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC25186OooOOo<File, DataT> f85792OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Context f85793OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final Uri f85794OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final InterfaceC25186OooOOo<Uri, DataT> f85795OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final int f85796OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final C25111OooO f85797OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final int f85798OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final Class<DataT> f85799OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public volatile boolean f85800OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public volatile InterfaceC22255OooO0Oo<DataT> f85801Oooo000;

        public C19686OooO0Oo(Context context, InterfaceC25186OooOOo<File, DataT> interfaceC25186OooOOo, InterfaceC25186OooOOo<Uri, DataT> interfaceC25186OooOOo2, Uri uri, int i, int i2, C25111OooO c25111OooO, Class<DataT> cls) {
            this.f85793OooOo0o = context.getApplicationContext();
            this.f85792OooOo = interfaceC25186OooOOo;
            this.f85795OooOoO0 = interfaceC25186OooOOo2;
            this.f85794OooOoO = uri;
            this.f85796OooOoOO = i;
            this.f85798OooOoo0 = i2;
            this.f85797OooOoo = c25111OooO;
            this.f85799OooOooO = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<DataT> OooO00o() {
            return this.f85799OooOooO;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
            InterfaceC22255OooO0Oo<DataT> interfaceC22255OooO0Oo = this.f85801Oooo000;
            if (interfaceC22255OooO0Oo != null) {
                interfaceC22255OooO0Oo.OooO0O0();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super DataT> oooO00o) throws Throwable {
            try {
                InterfaceC22255OooO0Oo<DataT> interfaceC22255OooO0OoOooO0o0 = OooO0o0();
                if (interfaceC22255OooO0OoOooO0o0 == null) {
                    oooO00o.OooO0o(new IllegalArgumentException("Failed to build fetcher for: " + this.f85794OooOoO));
                } else {
                    this.f85801Oooo000 = interfaceC22255OooO0OoOooO0o0;
                    if (this.f85800OooOooo) {
                        cancel();
                    } else {
                        interfaceC22255OooO0OoOooO0o0.OooO0Oo(enumC22252OooO0oo, oooO00o);
                    }
                }
            } catch (FileNotFoundException e) {
                oooO00o.OooO0o(e);
            }
        }

        public final InterfaceC22255OooO0Oo<DataT> OooO0o0() throws Throwable {
            InterfaceC25186OooOOo.OooO00o<DataT> OooO00o2;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.f85793OooOo0o;
            C25111OooO c25111OooO = this.f85797OooOoo;
            int i = this.f85798OooOoo0;
            int i2 = this.f85796OooOoOO;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f85794OooOoO;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f85791Oooo00O, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                OooO00o2 = this.f85792OooOo.OooO00o(file, i2, i, c25111OooO);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                Uri requireOriginal = this.f85794OooOoO;
                boolean zOooO0Oo = C25679OooOo0o.OooO0Oo(requireOriginal);
                InterfaceC25186OooOOo<Uri, DataT> interfaceC25186OooOOo = this.f85795OooOoO0;
                if (zOooO0Oo && requireOriginal.getPathSegments().contains("picker")) {
                    OooO00o2 = interfaceC25186OooOOo.OooO00o(requireOriginal, i2, i, c25111OooO);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    OooO00o2 = interfaceC25186OooOOo.OooO00o(requireOriginal, i2, i, c25111OooO);
                }
            }
            if (OooO00o2 != null) {
                return OooO00o2.f85731OooO0OO;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
            this.f85800OooOooo = true;
            InterfaceC22255OooO0Oo<DataT> interfaceC22255OooO0Oo = this.f85801Oooo000;
            if (interfaceC22255OooO0Oo != null) {
                interfaceC22255OooO0Oo.cancel();
            }
        }
    }

    public C25201OooO0Oo(Context context, InterfaceC25186OooOOo<File, DataT> interfaceC25186OooOOo, InterfaceC25186OooOOo<Uri, DataT> interfaceC25186OooOOo2, Class<DataT> cls) {
        this.f85785OooO00o = context.getApplicationContext();
        this.f85786OooO0O0 = interfaceC25186OooOOo;
        this.f85787OooO0OO = interfaceC25186OooOOo2;
        this.f85788OooO0Oo = cls;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        Uri uri2 = uri;
        return new InterfaceC25186OooOOo.OooO00o(new C25320OooO0Oo(uri2), new C19686OooO0Oo(this.f85785OooO00o, this.f85786OooO0O0, this.f85787OooO0OO, uri2, i, i2, c25111OooO, this.f85788OooO0Oo));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C25679OooOo0o.OooO0Oo(uri);
    }
}
