package o00ooO0o;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import o00o0oOo.C25461OooO0Oo;
import o00oo0O.C25651OooO00o;
import o00oo0O.C25654OooO0Oo;
import o00oo0O.EnumC25653OooO0OO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: o00ooO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25764OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final HashSet f87929OooO = new HashSet();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Uri f87930OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C25763OooO00o.OooO0OO f87931OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f87932OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C25654OooO0Oo f87933OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25763OooO00o.OooO0O0 f87934OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C25651OooO00o f87935OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f87936OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public EnumC25653OooO0OO f87937OooO0oo;

    /* JADX INFO: renamed from: o00ooO0o.OooO0O0$OooO00o */
    public static class OooO00o extends RuntimeException {
        public OooO00o(String str) {
            super("Invalid request builder: ".concat(str));
        }
    }

    public static boolean OooO0Oo(Uri uri) {
        HashSet hashSet = f87929OooO;
        if (hashSet == null || uri == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static C25764OooO0O0 OooO0o(Uri uri) {
        C25764OooO0O0 c25764OooO0O0 = new C25764OooO0O0();
        c25764OooO0O0.f87930OooO00o = null;
        c25764OooO0O0.f87931OooO0O0 = C25763OooO00o.OooO0OO.FULL_FETCH;
        c25764OooO0O0.f87932OooO0OO = 0;
        c25764OooO0O0.f87933OooO0Oo = null;
        c25764OooO0O0.f87935OooO0o0 = C25651OooO00o.f87562OooO0OO;
        c25764OooO0O0.f87934OooO0o = C25763OooO00o.OooO0O0.f87921OooOo;
        c25764OooO0O0.f87936OooO0oO = false;
        c25764OooO0O0.f87937OooO0oo = EnumC25653OooO0OO.f87570OooOoO0;
        uri.getClass();
        c25764OooO0O0.f87930OooO00o = uri;
        return c25764OooO0O0;
    }

    public static C25764OooO0O0 OooO0o0(int i) {
        Uri uri = C25461OooO0Oo.f86761OooO00o;
        return OooO0o(new Uri.Builder().scheme("res").path(String.valueOf(i)).build());
    }

    public final C25763OooO00o OooO00o() {
        Uri uri = this.f87930OooO00o;
        if (uri == null) {
            throw new OooO00o("Source must be set!");
        }
        if ("res".equals(C25461OooO0Oo.OooO0O0(uri))) {
            if (!this.f87930OooO00o.isAbsolute()) {
                throw new OooO00o("Resource URI path must be absolute.");
            }
            if (this.f87930OooO00o.getPath().isEmpty()) {
                throw new OooO00o("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f87930OooO00o.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new OooO00o("Resource URI path must be a resource id.");
            }
        }
        if (!"asset".equals(C25461OooO0Oo.OooO0O0(this.f87930OooO00o)) || this.f87930OooO00o.isAbsolute()) {
            return new C25763OooO00o(this);
        }
        throw new OooO00o("Asset URI path must be absolute.");
    }

    public final void OooO0O0() {
        this.f87932OooO0OO |= 48;
    }

    public final void OooO0OO() {
        this.f87932OooO0OO |= 15;
    }
}
