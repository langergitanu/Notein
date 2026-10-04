package o00o00;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.fragment.app.C21929Ooooo0o;
import java.util.ArrayList;
import o00o00.C25208OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO extends Drawable implements C25208OooO0oO.OooO0O0, Animatable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f85819OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f85820OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f85821OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f85822OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f85823OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f85824OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f85825OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f85826OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Paint f85827OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Rect f85828Oooo000;

    public static final class OooO00o extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25208OooO0oO f85829OooO00o;

        public OooO00o(C25208OooO0oO c25208OooO0oO) {
            this.f85829OooO00o = c25208OooO0oO;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new OooO0OO(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new OooO0OO(this);
        }
    }

    public OooO0OO() {
        throw null;
    }

    public OooO0OO(OooO00o oooO00o) {
        this.f85823OooOoOO = true;
        this.f85824OooOoo = -1;
        this.f85820OooOo0o = oooO00o;
    }

    @Override // o00o00.C25208OooO0oO.OooO0O0
    public final void OooO00o() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C25208OooO0oO.OooO00o oooO00o = this.f85820OooOo0o.f85829OooO00o.f85831OooO;
        if ((oooO00o != null ? oooO00o.f85848OooOo : -1) == r0.f85832OooO00o.f85246OooOO0o.f85223OooO0OO - 1) {
            this.f85825OooOoo0++;
        }
        int i = this.f85824OooOoo;
        if (i == -1 || this.f85825OooOoo0 < i) {
            return;
        }
        stop();
    }

    public final void OooO0O0() {
        C21929Ooooo0o.OooO00o(!this.f85821OooOoO, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        C25208OooO0oO c25208OooO0oO = this.f85820OooOo0o.f85829OooO00o;
        if (c25208OooO0oO.f85832OooO00o.f85246OooOO0o.f85223OooO0OO == 1) {
            invalidateSelf();
            return;
        }
        if (this.f85819OooOo) {
            return;
        }
        this.f85819OooOo = true;
        if (c25208OooO0oO.f85840OooOO0) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c25208OooO0oO.f85834OooO0OO;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c25208OooO0oO.f85836OooO0o) {
            c25208OooO0oO.f85836OooO0o = true;
            c25208OooO0oO.f85840OooOO0 = false;
            c25208OooO0oO.OooO00o();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f85821OooOoO) {
            return;
        }
        if (this.f85826OooOooO) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f85828Oooo000 == null) {
                this.f85828Oooo000 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f85828Oooo000);
            this.f85826OooOooO = false;
        }
        C25208OooO0oO c25208OooO0oO = this.f85820OooOo0o.f85829OooO00o;
        C25208OooO0oO.OooO00o oooO00o = c25208OooO0oO.f85831OooO;
        Bitmap bitmap = oooO00o != null ? oooO00o.f85850OooOoO : c25208OooO0oO.f85842OooOO0o;
        if (this.f85828Oooo000 == null) {
            this.f85828Oooo000 = new Rect();
        }
        Rect rect = this.f85828Oooo000;
        if (this.f85827OooOooo == null) {
            this.f85827OooOooo = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f85827OooOooo);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f85820OooOo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f85820OooOo0o.f85829OooO00o.f85847OooOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f85820OooOo0o.f85829OooO00o.f85846OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f85819OooOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f85826OooOooO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f85827OooOooo == null) {
            this.f85827OooOooo = new Paint(2);
        }
        this.f85827OooOooo.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f85827OooOooo == null) {
            this.f85827OooOooo = new Paint(2);
        }
        this.f85827OooOooo.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        C21929Ooooo0o.OooO00o(!this.f85821OooOoO, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f85823OooOoOO = z;
        if (!z) {
            this.f85819OooOo = false;
            C25208OooO0oO c25208OooO0oO = this.f85820OooOo0o.f85829OooO00o;
            ArrayList arrayList = c25208OooO0oO.f85834OooO0OO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c25208OooO0oO.f85836OooO0o = false;
            }
        } else if (this.f85822OooOoO0) {
            OooO0O0();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f85822OooOoO0 = true;
        this.f85825OooOoo0 = 0;
        if (this.f85823OooOoOO) {
            OooO0O0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f85822OooOoO0 = false;
        this.f85819OooOo = false;
        C25208OooO0oO c25208OooO0oO = this.f85820OooOo0o.f85829OooO00o;
        ArrayList arrayList = c25208OooO0oO.f85834OooO0OO;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c25208OooO0oO.f85836OooO0o = false;
        }
    }
}
