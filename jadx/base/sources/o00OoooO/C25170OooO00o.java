package o00OoooO;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C22258OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25170OooO00o<Data> implements InterfaceC25186OooOOo<Uri, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AssetManager f85682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f85683OooO0O0;

    /* JADX INFO: renamed from: o00OoooO.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19681OooO00o<Data> {
        InterfaceC22255OooO0Oo<Data> OooO00o(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: o00OoooO.OooO00o$OooO0O0 */
    public static class OooO0O0 implements InterfaceC25188OooOOoo<Uri, AssetFileDescriptor>, InterfaceC19681OooO00o<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AssetManager f85684OooO00o;

        public OooO0O0(AssetManager assetManager) {
            this.f85684OooO00o = assetManager;
        }

        @Override // o00OoooO.C25170OooO00o.InterfaceC19681OooO00o
        public final InterfaceC22255OooO0Oo<AssetFileDescriptor> OooO00o(AssetManager assetManager, String str) {
            return new C22258OooO0oo(assetManager, str);
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, AssetFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25170OooO00o(this.f85684OooO00o, this);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooO00o$OooO0OO */
    public static class OooO0OO implements InterfaceC25188OooOOoo<Uri, InputStream>, InterfaceC19681OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AssetManager f85685OooO00o;

        public OooO0OO(AssetManager assetManager) {
            this.f85685OooO00o = assetManager;
        }

        @Override // o00OoooO.C25170OooO00o.InterfaceC19681OooO00o
        public final InterfaceC22255OooO0Oo<InputStream> OooO00o(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.OooOOO0(assetManager, str);
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25170OooO00o(this.f85685OooO00o, this);
        }
    }

    public C25170OooO00o(AssetManager assetManager, InterfaceC19681OooO00o<Data> interfaceC19681OooO00o) {
        this.f85682OooO00o = assetManager;
        this.f85683OooO0O0 = interfaceC19681OooO00o;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o00OoooO.OooO00o$OooO00o] */
    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        Uri uri2 = uri;
        return new InterfaceC25186OooOOo.OooO00o(new C25320OooO0Oo(uri2), this.f85683OooO0O0.OooO00o(this.f85682OooO00o, uri2.toString().substring(22)));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
