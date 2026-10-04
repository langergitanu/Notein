package Oooo0OO;

import OooooOO.C21348Ooooo0o;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: Oooo0OO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20967OooOo0O extends RippleDrawable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C21348Ooooo0o f60519OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f60520OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f60521OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Integer f60522OooOoO0;

    /* JADX INFO: renamed from: Oooo0OO.OooOo0O$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f60523OooO00o = new OooO00o();

        public final void OooO00o(RippleDrawable ripple, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(ripple, "ripple");
            ripple.setRadius(i);
        }
    }

    public C20967OooOo0O(boolean z) {
        super(ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK), null, z ? new ColorDrawable(-1) : null);
        this.f60520OooOo0o = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f60520OooOo0o) {
            this.f60521OooOoO = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(dirtyBounds, "super.getDirtyBounds()");
        this.f60521OooOoO = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f60521OooOoO;
    }
}
