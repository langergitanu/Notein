package o00Ooooo;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00OooO0.C25151OooO0O0;
import o00OoooO.C25190OooOo0O;
import o00OoooO.InterfaceC25186OooOOo;
import o00OoooO.InterfaceC25188OooOOoo;
import o00o0O00.C25320OooO0Oo;
import o00oo0O0.C25679OooOo0o;

/* JADX INFO: renamed from: o00Ooooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25199OooO0O0 implements InterfaceC25186OooOOo<Uri, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85781OooO00o;

    /* JADX INFO: renamed from: o00Ooooo.OooO0O0$OooO00o */
    public static class OooO00o implements InterfaceC25188OooOOoo<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85782OooO00o;

        public OooO00o(Context context) {
            this.f85782OooO00o = context;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25199OooO0O0(this.f85782OooO00o);
        }
    }

    public C25199OooO0O0(Context context) {
        this.f85781OooO00o = context.getApplicationContext();
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<InputStream> OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return null;
        }
        C25320OooO0Oo c25320OooO0Oo = new C25320OooO0Oo(uri2);
        Context context = this.f85781OooO00o;
        return new InterfaceC25186OooOOo.OooO00o<>(c25320OooO0Oo, C25151OooO0O0.OooO0o0(context, uri2, new C25151OooO0O0.OooO00o(context.getContentResolver())));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        Uri uri2 = uri;
        return C25679OooOo0o.OooO0Oo(uri2) && !uri2.getPathSegments().contains("video");
    }
}
