package o00OoooO;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo<DataT> implements InterfaceC25186OooOOo<Uri, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85735OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25186OooOOo<Integer, DataT> f85736OooO0O0;

    public static final class OooO00o implements InterfaceC25188OooOOoo<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85737OooO00o;

        public OooO00o(Context context) {
            this.f85737OooO00o = context;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, AssetFileDescriptor> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new OooOo(this.f85737OooO00o, c25190OooOo0O.OooO0O0(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class OooO0O0 implements InterfaceC25188OooOOoo<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f85738OooO00o;

        public OooO0O0(Context context) {
            this.f85738OooO00o = context;
        }

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new OooOo(this.f85738OooO00o, c25190OooOo0O.OooO0O0(Integer.class, InputStream.class));
        }
    }

    public OooOo(Context context, InterfaceC25186OooOOo<Integer, DataT> interfaceC25186OooOOo) {
        this.f85735OooO00o = context.getApplicationContext();
        this.f85736OooO0O0 = interfaceC25186OooOOo;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        InterfaceC25186OooOOo<Integer, DataT> interfaceC25186OooOOo = this.f85736OooO0O0;
        if (size == 1) {
            try {
                int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i3 != 0) {
                    return interfaceC25186OooOOo.OooO00o(Integer.valueOf(i3), i, i2, c25111OooO);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                    return null;
                }
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f85735OooO00o;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return interfaceC25186OooOOo.OooO00o(Integer.valueOf(identifier), i, i2, c25111OooO);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return null;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.f85735OooO00o.getPackageName().equals(uri2.getAuthority());
    }
}
