package o00Ooooo;

import java.io.InputStream;
import java.net.URL;
import o00Ooo0o.C25111OooO;
import o00OoooO.C25183OooOO0;
import o00OoooO.C25190OooOo0O;
import o00OoooO.InterfaceC25186OooOOo;
import o00OoooO.InterfaceC25188OooOOoo;

/* JADX INFO: renamed from: o00Ooooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25202OooO0o0 implements InterfaceC25186OooOOo<URL, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25186OooOOo<C25183OooOO0, InputStream> f85802OooO00o;

    /* JADX INFO: renamed from: o00Ooooo.OooO0o0$OooO00o */
    public static class OooO00o implements InterfaceC25188OooOOoo<URL, InputStream> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<URL, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25202OooO0o0(c25190OooOo0O.OooO0O0(C25183OooOO0.class, InputStream.class));
        }
    }

    public C25202OooO0o0(InterfaceC25186OooOOo<C25183OooOO0, InputStream> interfaceC25186OooOOo) {
        this.f85802OooO00o = interfaceC25186OooOOo;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<InputStream> OooO00o(URL url, int i, int i2, C25111OooO c25111OooO) {
        return this.f85802OooO00o.OooO00o(new C25183OooOO0(url), i, i2, c25111OooO);
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(URL url) {
        return true;
    }
}
