package o00OoooO;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.File;
import java.io.FileNotFoundException;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;
import o00oo0O0.C25679OooOo0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO implements InterfaceC25186OooOOo<Uri, File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85719OooO00o;

    public static final class OooO00o implements InterfaceC25188OooOOoo<Uri, File> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85720OooO00o;

        public OooO00o(Context context) {
            this.f85720OooO00o = context;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, File> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new OooOOO(this.f85720OooO00o);
        }
    }

    public static class OooO0O0 implements InterfaceC22255OooO0Oo<File> {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final String[] f85721OooOoO0 = {"_data"};

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Uri f85722OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Context f85723OooOo0o;

        public OooO0O0(Context context, Uri uri) {
            this.f85723OooOo0o = context;
            this.f85722OooOo = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<File> OooO00o() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85370OooOo0o;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super File> oooO00o) {
            Cursor cursorQuery = this.f85723OooOo0o.getContentResolver().query(this.f85722OooOo, f85721OooOoO0, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                oooO00o.OooO0o0(new File(string));
                return;
            }
            oooO00o.OooO0o(new FileNotFoundException("Failed to find file path for: " + this.f85722OooOo));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
        }
    }

    public OooOOO(Context context) {
        this.f85719OooO00o = context;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<File> OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        Uri uri2 = uri;
        return new InterfaceC25186OooOOo.OooO00o<>(new C25320OooO0Oo(uri2), new OooO0O0(this.f85719OooO00o, uri2));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        return C25679OooOo0o.OooO0Oo(uri);
    }
}
