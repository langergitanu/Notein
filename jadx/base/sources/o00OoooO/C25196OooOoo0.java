package o00OoooO;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00OoooO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25196OooOoo0<Data> implements InterfaceC25186OooOOo<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f85773OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", FirebaseAnalytics.Param.CONTENT, "android.resource")));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f85774OooO00o;

    /* JADX INFO: renamed from: o00OoooO.OooOoo0$OooO00o */
    public static final class OooO00o implements InterfaceC25188OooOOoo<Uri, AssetFileDescriptor>, OooO0OO<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f85775OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f85775OooO00o = contentResolver;
        }

        @Override // o00OoooO.C25196OooOoo0.OooO0OO
        public final InterfaceC22255OooO0Oo<AssetFileDescriptor> OooO00o(Uri uri) {
            return new com.bumptech.glide.load.data.OooO00o(this.f85775OooO00o, uri);
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, AssetFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25196OooOoo0(this);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOoo0$OooO0O0 */
    public static class OooO0O0 implements InterfaceC25188OooOOoo<Uri, ParcelFileDescriptor>, OooO0OO<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f85776OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.f85776OooO00o = contentResolver;
        }

        @Override // o00OoooO.C25196OooOoo0.OooO0OO
        public final InterfaceC22255OooO0Oo<ParcelFileDescriptor> OooO00o(Uri uri) {
            return new com.bumptech.glide.load.data.OooO(this.f85776OooO00o, uri);
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, ParcelFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25196OooOoo0(this);
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOoo0$OooO0OO */
    public interface OooO0OO<Data> {
        InterfaceC22255OooO0Oo<Data> OooO00o(Uri uri);
    }

    /* JADX INFO: renamed from: o00OoooO.OooOoo0$OooO0Oo, reason: case insensitive filesystem */
    public static class C25197OooO0Oo implements InterfaceC25188OooOOoo<Uri, InputStream>, OooO0OO<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f85777OooO00o;

        public C25197OooO0Oo(ContentResolver contentResolver) {
            this.f85777OooO00o = contentResolver;
        }

        @Override // o00OoooO.C25196OooOoo0.OooO0OO
        public final InterfaceC22255OooO0Oo<InputStream> OooO00o(Uri uri) {
            return new com.bumptech.glide.load.data.OooOOO(this.f85777OooO00o, uri);
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25196OooOoo0(this);
        }
    }

    public C25196OooOoo0(OooO0OO<Data> oooO0OO) {
        this.f85774OooO00o = oooO0OO;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, o00OoooO.OooOoo0$OooO0OO] */
    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        Uri uri2 = uri;
        return new InterfaceC25186OooOOo.OooO00o(new C25320OooO0Oo(uri2), this.f85774OooO00o.OooO00o(uri2));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        return f85773OooO0O0.contains(uri.getScheme());
    }
}
