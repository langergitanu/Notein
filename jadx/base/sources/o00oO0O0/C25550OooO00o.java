package o00oO0O0;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o00oO0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25550OooO00o implements InterfaceC25553OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25551OooO0O0 f87139OooOo0o;

    public C25550OooO00o(C25551OooO0O0 c25551OooO0O0) {
        this.f87139OooOo0o = c25551OooO0O0;
    }

    @Override // o00oO0O0.InterfaceC25553OooO0Oo
    public final Drawable OooO0oo() {
        return this.f87139OooOo0o.OooO00o(2);
    }

    @Override // o00oO0O0.InterfaceC25553OooO0Oo
    public final Drawable OooOO0(Drawable drawable) {
        C25554OooO0o0 c25554OooO0o0;
        C25551OooO0O0 c25551OooO0O0 = this.f87139OooOo0o;
        c25551OooO0O0.getClass();
        Drawable[] drawableArr = c25551OooO0O0.f87143OooOoO0;
        if (!(2 < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[2];
        if (drawable != drawable2) {
            if (drawable != null && c25551OooO0O0.f87147OooOooO) {
                drawable.mutate();
            }
            OooO0o.OooO0OO(drawableArr[2], null, null);
            OooO0o.OooO0OO(drawable, null, null);
            if (drawable != null && (c25554OooO0o0 = c25551OooO0O0.f87140OooOo) != null) {
                c25554OooO0o0.OooO00o(drawable);
            }
            OooO0o.OooO00o(drawable, c25551OooO0O0);
            OooO0o.OooO0OO(drawable, c25551OooO0O0, c25551OooO0O0);
            c25551OooO0O0.f87145OooOoo = false;
            drawableArr[2] = drawable;
            c25551OooO0O0.invalidateSelf();
        }
        return drawable2;
    }
}
