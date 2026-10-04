package o00OoooO;

import android.net.Uri;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o00Ooo0o.C25111OooO;
import o00OoooO.InterfaceC25186OooOOo;

/* JADX INFO: renamed from: o00OoooO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25195OooOoo<Data> implements InterfaceC25186OooOOo<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f85771OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", AuthenticationConstants.HTTPS_PROTOCOL_STRING)));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25186OooOOo<C25183OooOO0, Data> f85772OooO00o;

    /* JADX INFO: renamed from: o00OoooO.OooOoo$OooO00o */
    public static class OooO00o implements InterfaceC25188OooOOoo<Uri, InputStream> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<Uri, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25195OooOoo(c25190OooOo0O.OooO0O0(C25183OooOO0.class, InputStream.class));
        }
    }

    public C25195OooOoo(InterfaceC25186OooOOo<C25183OooOO0, Data> interfaceC25186OooOOo) {
        this.f85772OooO00o = interfaceC25186OooOOo;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o OooO00o(Uri uri, int i, int i2, C25111OooO c25111OooO) {
        return this.f85772OooO00o.OooO00o(new C25183OooOO0(uri.toString(), OooOO0O.f85718OooO00o), i, i2, c25111OooO);
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final boolean OooO0O0(Uri uri) {
        return f85771OooO0O0.contains(uri.getScheme());
    }
}
