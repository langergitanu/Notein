package o00Ooooo;

import com.bumptech.glide.load.data.OooOO0;
import java.io.InputStream;
import java.util.ArrayDeque;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00OoooO.C25183OooOO0;
import o00OoooO.C25185OooOOOo;
import o00OoooO.C25187OooOOo0;
import o00OoooO.C25190OooOo0O;
import o00OoooO.InterfaceC25186OooOOo;
import o00OoooO.InterfaceC25188OooOOoo;

/* JADX INFO: renamed from: o00Ooooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25198OooO00o implements InterfaceC25186OooOOo<C25183OooOO0, InputStream> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25119OooO0oo<Integer> f85778OooO0O0 = C25119OooO0oo.OooO00o(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25187OooOOo0<C25183OooOO0, C25183OooOO0> f85779OooO00o;

    /* JADX INFO: renamed from: o00Ooooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19685OooO00o implements InterfaceC25188OooOOoo<C25183OooOO0, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25187OooOOo0<C25183OooOO0, C25183OooOO0> f85780OooO00o = new C25187OooOOo0<>();

        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<C25183OooOO0, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25198OooO00o(this.f85780OooO00o);
        }
    }

    public C25198OooO00o(C25187OooOOo0<C25183OooOO0, C25183OooOO0> c25187OooOOo0) {
        this.f85779OooO00o = c25187OooOOo0;
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<InputStream> OooO00o(C25183OooOO0 c25183OooOO0, int i, int i2, C25111OooO c25111OooO) {
        C25183OooOO0 c25183OooOO02 = c25183OooOO0;
        C25187OooOOo0<C25183OooOO0, C25183OooOO0> c25187OooOOo0 = this.f85779OooO00o;
        if (c25187OooOOo0 != null) {
            C25187OooOOo0.OooO00o OooO00o2 = C25187OooOOo0.OooO00o.OooO00o(c25183OooOO02);
            C25185OooOOOo c25185OooOOOo = c25187OooOOo0.f85732OooO00o;
            Object objOooO00o = c25185OooOOOo.OooO00o(OooO00o2);
            ArrayDeque arrayDeque = C25187OooOOo0.OooO00o.f85733OooO0O0;
            synchronized (arrayDeque) {
                arrayDeque.offer(OooO00o2);
            }
            C25183OooOO0 c25183OooOO03 = (C25183OooOO0) objOooO00o;
            if (c25183OooOO03 == null) {
                c25185OooOOOo.OooO0Oo(C25187OooOOo0.OooO00o.OooO00o(c25183OooOO02), c25183OooOO02);
            } else {
                c25183OooOO02 = c25183OooOO03;
            }
        }
        return new InterfaceC25186OooOOo.OooO00o<>(c25183OooOO02, new OooOO0(c25183OooOO02, ((Integer) c25111OooO.OooO0OO(f85778OooO0O0)).intValue()));
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(C25183OooOO0 c25183OooOO0) {
        return true;
    }
}
