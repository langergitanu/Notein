package o00OoooO;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.InputStream;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;

/* JADX INFO: renamed from: o00OoooO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25191OooOo0o<Data> implements InterfaceC25186OooOOo<Integer, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25186OooOOo<Uri, Data> f85761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f85762OooO0O0;

    /* JADX INFO: renamed from: o00OoooO.OooOo0o$OooO00o */
    public static final class OooO00o implements InterfaceC25188OooOOoo<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f85763OooO00o;

        public OooO00o(Resources resources) {
            this.f85763OooO00o = resources;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Integer, AssetFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25191OooOo0o(this.f85763OooO00o, c25190OooOo0O.OooO0O0(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOo0o$OooO0O0 */
    public static class OooO0O0 implements InterfaceC25188OooOOoo<Integer, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f85764OooO00o;

        public OooO0O0(Resources resources) {
            this.f85764OooO00o = resources;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Integer, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25191OooOo0o(this.f85764OooO00o, c25190OooOo0O.OooO0O0(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: o00OoooO.OooOo0o$OooO0OO */
    public static class OooO0OO implements InterfaceC25188OooOOoo<Integer, Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f85765OooO00o;

        public OooO0OO(Resources resources) {
            this.f85765OooO00o = resources;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Integer, Uri> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25191OooOo0o(this.f85765OooO00o, C25194OooOoOO.f85768OooO00o);
        }
    }

    public C25191OooOo0o(Resources resources, InterfaceC25186OooOOo<Uri, Data> interfaceC25186OooOOo) {
        this.f85762OooO0O0 = resources;
        this.f85761OooO00o = interfaceC25186OooOOo;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Integer num, int i, int i2, C25111OooO c25111OooO) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f85762OooO0O0;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + resources.getResourceTypeName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f85761OooO00o.OooO00o(uri, i, i2, c25111OooO);
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Integer num) {
        return true;
    }
}
