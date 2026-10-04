package o00o000;

import android.graphics.Bitmap;
import androidx.fragment.app.C21929Ooooo0o;
import o00OooO.InterfaceC25142OooOOoo;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25213OooO0o0 implements InterfaceC25145OooOo0o<Bitmap>, InterfaceC25142OooOOoo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Bitmap f85867OooOo0o;

    public C25213OooO0o0(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        C21929Ooooo0o.OooO0OO(bitmap, "Bitmap must not be null");
        this.f85867OooOo0o = bitmap;
        C21929Ooooo0o.OooO0OO(interfaceC25155OooO0O0, "BitmapPool must not be null");
        this.f85866OooOo = interfaceC25155OooO0O0;
    }

    public static C25213OooO0o0 OooO0O0(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        if (bitmap == null) {
            return null;
        }
        return new C25213OooO0o0(bitmap, interfaceC25155OooO0O0);
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<Bitmap> OooO00o() {
        return Bitmap.class;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Bitmap get() {
        return this.f85867OooOo0o;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        return C25316OooOO0o.OooO0OO(this.f85867OooOo0o);
    }

    @Override // o00OooO.InterfaceC25142OooOOoo
    public final void initialize() {
        this.f85867OooOo0o.prepareToDraw();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
        this.f85866OooOo.OooO00o(this.f85867OooOo0o);
    }
}
