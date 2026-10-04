package o00Ooo0O;

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
import o00Ooo0O.OooOOO0;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 extends Drawable implements OooOOO0.OooO0O0, Animatable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f85326OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f85327OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f85328OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f85329OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f85330OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f85331OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f85332OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f85333OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Paint f85334OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Rect f85335Oooo000;

    public static class OooO00o extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO0 f85336OooO00o;

        public OooO00o(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, OooOOO0 oooOOO0) {
            this.f85336OooO00o = oooOOO0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new OooOO0(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new OooOO0(this);
        }
    }

    public OooOO0() {
        throw null;
    }

    public OooOO0(OooO00o oooO00o) {
        this.f85331OooOoo = -1;
        this.f85330OooOoOO = true;
        this.f85327OooOo0o = oooO00o;
        C25108OooO0oo c25108OooO0oo = oooO00o.f85336OooO00o.f85346OooO00o;
        int loopCount = c25108OooO0oo.f85314OooO0O0.getLoopCount() == 0 ? 0 : c25108OooO0oo.f85314OooO0O0.getLoopCount();
        this.f85331OooOoo = loopCount != 0 ? loopCount : -1;
    }

    @Override // o00Ooo0O.OooOOO0.OooO0O0
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
        OooOOO0.OooO00o oooO00o = this.f85327OooOo0o.f85336OooO00o.f85345OooO;
        if ((oooO00o != null ? oooO00o.f85361OooOo : -1) == r0.f85346OooO00o.f85314OooO0O0.getFrameCount() - 1) {
            this.f85332OooOoo0++;
        }
        int i = this.f85331OooOoo;
        if (i == -1 || this.f85332OooOoo0 < i) {
            return;
        }
        stop();
    }

    public final void OooO0O0() {
        C21929Ooooo0o.OooO00o(!this.f85328OooOoO, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        OooO00o oooO00o = this.f85327OooOo0o;
        if (oooO00o.f85336OooO00o.f85346OooO00o.f85314OooO0O0.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f85326OooOo) {
            return;
        }
        this.f85326OooOo = true;
        OooOOO0 oooOOO0 = oooO00o.f85336OooO00o;
        if (oooOOO0.f85354OooOO0) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = oooOOO0.f85348OooO0OO;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !oooOOO0.f85350OooO0o) {
            oooOOO0.f85350OooO0o = true;
            oooOOO0.f85354OooOO0 = false;
            oooOOO0.OooO00o();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f85328OooOoO) {
            return;
        }
        if (this.f85333OooOooO) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f85335Oooo000 == null) {
                this.f85335Oooo000 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f85335Oooo000);
            this.f85333OooOooO = false;
        }
        OooOOO0 oooOOO0 = this.f85327OooOo0o.f85336OooO00o;
        OooOOO0.OooO00o oooO00o = oooOOO0.f85345OooO;
        Bitmap bitmap = oooO00o != null ? oooO00o.f85363OooOoO : oooOOO0.f85356OooOO0o;
        if (this.f85335Oooo000 == null) {
            this.f85335Oooo000 = new Rect();
        }
        Rect rect = this.f85335Oooo000;
        if (this.f85334OooOooo == null) {
            this.f85334OooOooo = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f85334OooOooo);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f85327OooOo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f85327OooOo0o.f85336OooO00o.f85360OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f85327OooOo0o.f85336OooO00o.f85359OooOOOO;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f85326OooOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f85333OooOooO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f85334OooOooo == null) {
            this.f85334OooOooo = new Paint(2);
        }
        this.f85334OooOooo.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f85334OooOooo == null) {
            this.f85334OooOooo = new Paint(2);
        }
        this.f85334OooOooo.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        C21929Ooooo0o.OooO00o(!this.f85328OooOoO, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f85330OooOoOO = z;
        if (!z) {
            this.f85326OooOo = false;
            OooOOO0 oooOOO0 = this.f85327OooOo0o.f85336OooO00o;
            ArrayList arrayList = oooOOO0.f85348OooO0OO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                oooOOO0.f85350OooO0o = false;
            }
        } else if (this.f85329OooOoO0) {
            OooO0O0();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f85329OooOoO0 = true;
        this.f85332OooOoo0 = 0;
        if (this.f85330OooOoOO) {
            OooO0O0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f85329OooOoO0 = false;
        this.f85326OooOo = false;
        OooOOO0 oooOOO0 = this.f85327OooOo0o.f85336OooO00o;
        ArrayList arrayList = oooOOO0.f85348OooO0OO;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            oooOOO0.f85350OooO0o = false;
        }
    }
}
