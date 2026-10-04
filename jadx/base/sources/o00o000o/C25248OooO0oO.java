package o00o000o;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o00o000o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25248OooO0oO extends OooO0o<Drawable> {
    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<Drawable> OooO00o() {
        return this.f85970OooOo0o.getClass();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        T t = this.f85970OooOo0o;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final void recycle() {
    }
}
