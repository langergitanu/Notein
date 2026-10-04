package o00OoooO;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;

/* JADX INFO: renamed from: o00OoooO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25192OooOoO<Data> implements InterfaceC25186OooOOo<String, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25186OooOOo<Uri, Data> f85766OooO00o;

    /* JADX INFO: renamed from: o00OoooO.OooOoO$OooO00o */
    public static final class OooO00o implements InterfaceC25188OooOOoo<String, AssetFileDescriptor> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<String, AssetFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25192OooOoO(c25190OooOo0O.OooO0O0(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOoO$OooO0O0 */
    public static class OooO0O0 implements InterfaceC25188OooOOoo<String, ParcelFileDescriptor> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<String, ParcelFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25192OooOoO(c25190OooOo0O.OooO0O0(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOoO$OooO0OO */
    public static class OooO0OO implements InterfaceC25188OooOOoo<String, InputStream> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<String, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25192OooOoO(c25190OooOo0O.OooO0O0(Uri.class, InputStream.class));
        }
    }

    public C25192OooOoO(InterfaceC25186OooOOo<Uri, Data> interfaceC25186OooOOo) {
        this.f85766OooO00o = interfaceC25186OooOOo;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(String str, int i, int i2, C25111OooO c25111OooO) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            InterfaceC25186OooOOo<Uri, Data> interfaceC25186OooOOo = this.f85766OooO00o;
            if (interfaceC25186OooOOo.OooO0O0(uriFromFile)) {
                return interfaceC25186OooOOo.OooO00o(uriFromFile, i, i2, c25111OooO);
            }
        }
        return null;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(String str) {
        return true;
    }
}
