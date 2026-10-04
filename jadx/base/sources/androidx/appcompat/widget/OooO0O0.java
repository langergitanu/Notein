package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ActionBarContainer f62891OooO00o;

    public OooO0O0(ActionBarContainer actionBarContainer) {
        this.f62891OooO00o = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f62891OooO00o;
        if (actionBarContainer.f62723OooOooO) {
            Drawable drawable = actionBarContainer.f62721OooOoo;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f62720OooOoOO;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f62722OooOoo0;
        if (drawable3 == null || !actionBarContainer.f62724OooOooo) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f62891OooO00o;
        if (actionBarContainer.f62723OooOooO) {
            if (actionBarContainer.f62721OooOoo != null) {
                actionBarContainer.f62720OooOoOO.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f62720OooOoOO;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
