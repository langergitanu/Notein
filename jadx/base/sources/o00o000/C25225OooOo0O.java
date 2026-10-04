package o00o000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.C21929Ooooo0o;
import o00OooO.InterfaceC25142OooOOoo;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: renamed from: o00o000.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25225OooOo0O implements InterfaceC25145OooOo0o<BitmapDrawable>, InterfaceC25142OooOOoo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC25145OooOo0o<Bitmap> f85928OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Resources f85929OooOo0o;

    public C25225OooOo0O(Resources resources, InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0o) {
        C21929Ooooo0o.OooO0OO(resources, "Argument must not be null");
        this.f85929OooOo0o = resources;
        C21929Ooooo0o.OooO0OO(interfaceC25145OooOo0o, "Argument must not be null");
        this.f85928OooOo = interfaceC25145OooOo0o;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<BitmapDrawable> OooO00o() {
        return BitmapDrawable.class;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f85929OooOo0o, this.f85928OooOo.get());
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        return this.f85928OooOo.getSize();
    }

    @Override // o00OooO.InterfaceC25142OooOOoo
    public final void initialize() {
        InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0o = this.f85928OooOo;
        if (interfaceC25145OooOo0o instanceof InterfaceC25142OooOOoo) {
            ((InterfaceC25142OooOOoo) interfaceC25145OooOo0o).initialize();
        }
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
        this.f85928OooOo.recycle();
    }
}
