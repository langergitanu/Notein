package oO000Oo;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.Set;
import oO0OOo0o.AbstractC33102OoooOOO;
import oO0OOo0o.o000oOoO;

/* JADX INFO: renamed from: oO000Oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31979Oooo00o extends AbstractC33102OoooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f114198OooO00o;

    static {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, C31979Oooo00o.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        f114198OooO00o = z;
    }

    @Override // oO0OOo0o.o000oOoO.OooO0OO
    public final C31976Oooo00O OooO00o(URI uri, o000oOoO.OooO00o oooO00o) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) Preconditions.checkNotNull(uri.getPath(), "targetPath");
        Preconditions.checkArgument(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        String strSubstring = str.substring(1);
        uri.getAuthority();
        return new C31976Oooo00O(strSubstring, oooO00o, C31989OoooO0O.f114228OooOOOo, Stopwatch.createUnstarted(), f114198OooO00o);
    }

    @Override // oO0OOo0o.AbstractC33102OoooOOO
    public final Set OooO0O0() {
        return Collections.singleton(InetSocketAddress.class);
    }
}
