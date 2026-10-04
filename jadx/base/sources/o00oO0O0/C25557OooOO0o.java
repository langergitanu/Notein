package o00oO0O0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oO0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25557OooOO0o extends OooOOOO {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Paint f87177OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Paint f87178OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public WeakReference<Bitmap> f87179OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public RectF f87180OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final Bitmap f87181o000oOoO;

    public C25557OooOO0o(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f87177OoooO = paint2;
        Paint paint3 = new Paint(1);
        this.f87178OoooOO0 = paint3;
        this.f87180OoooOOo = null;
        this.f87181o000oOoO = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // o00oO0O0.OooOOOO, o00oO0O0.OooOO0O
    public final void OooO0Oo() {
    }

    @Override // o00oO0O0.OooOOOO
    public final void OooO0oo() {
        super.OooO0oo();
        if (this.f87180OoooOOo == null) {
            this.f87180OoooOOo = new RectF();
        }
        this.f87218Oooo.mapRect(this.f87180OoooOOo, this.f87219Oooo0);
    }

    @Override // o00oO0O0.OooOOOO, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        C25732OooO0O0.OooO00o();
        if (!((this.f87209OooOo || this.f87212OooOoO0 || this.f87211OooOoO > 0.0f) && this.f87181o000oOoO != null)) {
            super.draw(canvas);
            C25732OooO0O0.OooO00o();
            return;
        }
        OooO0oo();
        OooO0o0();
        WeakReference<Bitmap> weakReference = this.f87179OoooOOO;
        Paint paint = this.f87177OoooO;
        Bitmap bitmap = this.f87181o000oOoO;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.f87179OoooOOO = new WeakReference<>(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f87215OooOoo0 = true;
            }
        }
        if (this.f87215OooOoo0 && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.f87218Oooo);
            this.f87215OooOoo0 = false;
        }
        paint.setFilterBitmap(false);
        int iSave = canvas.save();
        canvas.concat(this.f87228Oooo0oo);
        Path path = this.f87213OooOoOO;
        if (this.f87180OoooOOo != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f87180OoooOOo);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f = this.f87211OooOoO;
        if (f > 0.0f) {
            Paint paint2 = this.f87178OoooOO0;
            paint2.setStrokeWidth(f);
            paint2.setColor(OooO0o.OooO0O0(this.f87214OooOoo, paint.getAlpha()));
            canvas.drawPath(this.f87216OooOooO, paint2);
        }
        canvas.restoreToCount(iSave);
        C25732OooO0O0.OooO00o();
    }

    @Override // o00oO0O0.OooOOOO, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.f87177OoooO;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // o00oO0O0.OooOOOO, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f87177OoooO.setColorFilter(colorFilter);
    }
}
