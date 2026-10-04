package o00o000o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.C21929Ooooo0o;
import o00OooO.InterfaceC25142OooOOoo;
import o00OooO.InterfaceC25145OooOo0o;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooO0o<T extends Drawable> implements InterfaceC25145OooOo0o<T>, InterfaceC25142OooOOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f85970OooOo0o;

    public OooO0o(T t) {
        C21929Ooooo0o.OooO0OO(t, "Argument must not be null");
        this.f85970OooOo0o = t;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Object get() {
        T t = this.f85970OooOo0o;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f85970OooOo0o;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof o00o00.OooO0OO) {
            ((o00o00.OooO0OO) t).f85820OooOo0o.f85829OooO00o.f85842OooOO0o.prepareToDraw();
        }
    }
}
