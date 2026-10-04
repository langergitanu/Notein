package o00o000o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.C21559Oooo0oO;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00o000o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25249OooO0oo implements InterfaceC25121OooOO0O<Uri, Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25119OooO0oo<Resources.Theme> f85972OooO0O0 = new C25119OooO0oo<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C25119OooO0oo.f85385OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85973OooO00o;

    public C25249OooO0oo(Context context) {
        this.f85973OooO00o = context.getApplicationContext();
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final /* bridge */ /* synthetic */ InterfaceC25145OooOo0o<Drawable> OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return OooO0OO(uri, c25111OooO);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(Uri uri, C25111OooO c25111OooO) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final InterfaceC25145OooOo0o OooO0OO(Uri uri, C25111OooO c25111OooO) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f85973OooO00o;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(C21559Oooo0oO.OooO00o(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, TelemetryEventStrings.C18741Os.OS_NAME);
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(C21559Oooo0oO.OooO00o(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(C21559Oooo0oO.OooO00o(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(C21559Oooo0oO.OooO00o(uri, "Unrecognized Uri format: "), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c25111OooO.OooO0OO(f85972OooO0O0) : null;
        Drawable drawableOooO00o = theme == null ? C25247OooO0o0.OooO00o(context, contextCreatePackageContext, identifier, null) : C25247OooO0o0.OooO00o(context, context, identifier, theme);
        if (drawableOooO00o != null) {
            return new C25248OooO0oO(drawableOooO00o);
        }
        return null;
    }
}
