package o00o000;

import android.graphics.Bitmap;
import java.io.IOException;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o000.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25230OooOoo implements InterfaceC25121OooOO0O<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: o00o000.OooOoo$OooO00o */
    public static final class OooO00o implements InterfaceC25145OooOo0o<Bitmap> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Bitmap f85939OooOo0o;

        public OooO00o(Bitmap bitmap) {
            this.f85939OooOo0o = bitmap;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final Class<Bitmap> OooO00o() {
            return Bitmap.class;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final Bitmap get() {
            return this.f85939OooOo0o;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final int getSize() {
            return C25316OooOO0o.OooO0OO(this.f85939OooOo0o);
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final void recycle() {
        }
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(Bitmap bitmap, int i, int i2, C25111OooO c25111OooO) throws IOException {
        return new OooO00o(bitmap);
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Bitmap bitmap, C25111OooO c25111OooO) throws IOException {
        return true;
    }
}
