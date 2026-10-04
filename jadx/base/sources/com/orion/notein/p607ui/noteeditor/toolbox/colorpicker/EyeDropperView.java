package com.orion.notein.p607ui.noteeditor.toolbox.colorpicker;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\nR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/EyeDropperView;", "Landroid/view/View;", "Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/EyeDropperView$OooO00o;", "OoooO0", "Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/EyeDropperView$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/EyeDropperView$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/EyeDropperView$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EyeDropperView extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f76860OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f76861OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Bitmap f76862OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Bitmap f76863OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final PointF f76864OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Path f76865OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final PointF f76866OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Path f76867OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Path f76868OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f76869Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Paint f76870Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Path f76871Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ShapeDrawable f76872Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f76873Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Paint f76874Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Paint f76875Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f76876Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Paint f76877Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Drawable f76878Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Drawable f76879Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f76881OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final int f76854OoooO0O = o000000O.OooO0o(103) / 2;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final int f76853OoooO = o000000O.OooO0o(95) / 2;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final int f76855OoooOO0 = o000000O.OooO0o(3);

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final int f76859o000oOoO = Color.parseColor("#595959");

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final int f76856OoooOOO = Color.parseColor("#CACACA");

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final int f76857OoooOOo = o000000O.OooO0o(3);

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final int f76858OoooOo0 = o000000O.OooO0o(5);

    public interface OooO00o {
        void OooO00o(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EyeDropperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76861OooOo0o = System.currentTimeMillis();
        this.f76864OooOoOO = new PointF();
        this.f76866OooOoo0 = new PointF();
        this.f76865OooOoo = new Path();
        this.f76867OooOooO = new Path();
        this.f76868OooOooo = new Path();
        this.f76871Oooo000 = new Path();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setColor(f76859o000oOoO);
        paint.setStrokeWidth(o000000O.OooO0o0(1.0f));
        this.f76870Oooo0 = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        int i = f76856OoooOOO;
        paint2.setColor(i);
        paint2.setStrokeWidth(o000000O.OooO0o0(1.0f));
        paint2.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(4.0f), o000000O.OooO0o0(2.0f)}, 0.0f));
        this.f76874Oooo0O0 = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setColor(i);
        paint3.setStrokeWidth(1.0f);
        this.f76875Oooo0OO = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setAntiAlias(true);
        paint4.setStrokeWidth(o000000O.OooO0o0(8.0f));
        this.f76877Oooo0o0 = paint4;
        this.f76876Oooo0o = o000000O.OooO0o(24);
        this.f76878Oooo0oO = getResources().getDrawable(R.drawable.ic_eye_dropper_done, null);
        this.f76879Oooo0oo = getResources().getDrawable(R.drawable.ic_eye_dropper_close, null);
    }

    public final void OooO00o() {
        this.f76878Oooo0oO = getResources().getDrawable(R.drawable.ic_eye_dropper_done, null);
        this.f76879Oooo0oo = getResources().getDrawable(R.drawable.ic_eye_dropper_close, null);
        this.f76872Oooo00O = null;
        this.f76863OooOoO0 = null;
        this.f76862OooOoO = null;
        this.f76865OooOoo.reset();
        this.f76867OooOooO.reset();
        this.f76868OooOooo.reset();
        this.f76871Oooo000.reset();
        setVisibility(8);
    }

    public final void OooO0O0() {
        Bitmap bitmap = this.f76863OooOoO0;
        Bitmap bitmap2 = this.f76862OooOoO;
        if (bitmap == null || bitmap2 == null) {
            return;
        }
        Canvas canvas = new Canvas(bitmap2);
        PointF pointF = this.f76864OooOoOO;
        float f = pointF.x;
        int i = f76854OoooO0O;
        float f2 = pointF.y;
        canvas.drawBitmap(bitmap, new Rect((int) (f - (i / 3.0f)), (int) (f2 - (i / 3.0f)), (int) ((i / 3.0f) + f), (int) ((i / 3.0f) + f2)), new Rect(0, 0, i * 2, i * 2), (Paint) null);
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        if (this.f76863OooOoO0 == null || this.f76862OooOoO == null) {
            return;
        }
        Path path = this.f76865OooOoo;
        path.reset();
        PointF pointF = this.f76864OooOoOO;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = f76854OoooO0O;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f, f2, f3, direction);
        Path path2 = this.f76867OooOooO;
        path2.reset();
        float f4 = pointF.x;
        float f5 = pointF.y;
        float f6 = f76855OoooOO0;
        path2.addCircle(f4, f5, f6, direction);
        Path path3 = this.f76868OooOooo;
        path3.reset();
        float f7 = pointF.x;
        float f8 = pointF.y;
        float f9 = f76853OoooO;
        path3.addCircle(f7, f8, f9, direction);
        Paint paint = this.f76877Oooo0o0;
        paint.setColor(this.f76873Oooo00o);
        Path path4 = this.f76871Oooo000;
        path4.reset();
        float f10 = pointF.x - f6;
        float f11 = f76857OoooOOo;
        path4.moveTo(f10 - f11, pointF.y);
        float f12 = pointF.x - f9;
        float f13 = f76858OoooOo0;
        path4.lineTo(f12 + f13, pointF.y);
        path4.moveTo(pointF.x, (pointF.y - f6) - f11);
        path4.lineTo(pointF.x, (pointF.y - f9) + f13);
        path4.moveTo(pointF.x + f6 + f11, pointF.y);
        path4.lineTo((pointF.x + f9) - f13, pointF.y);
        path4.moveTo(pointF.x, pointF.y + f6 + f11);
        path4.lineTo(pointF.x, (pointF.y + f9) - f13);
        ShapeDrawable shapeDrawable = this.f76872Oooo00O;
        if (shapeDrawable != null) {
            shapeDrawable.draw(canvas);
        }
        canvas.drawPath(path4, this.f76874Oooo0O0);
        canvas.drawPath(path, this.f76870Oooo0);
        canvas.drawPath(path3, paint);
        canvas.drawPath(path2, this.f76875Oooo0OO);
        this.f76878Oooo0oO.draw(canvas);
        this.f76879Oooo0oo.draw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (this.f76878Oooo0oO.getBounds().contains((int) event.getX(), (int) event.getY()) || this.f76869Oooo) {
            int action = event.getAction();
            if (action == 0) {
                this.f76869Oooo = true;
                Drawable drawable = getResources().getDrawable(R.drawable.ic_eye_dropper_done_pressed, null);
                drawable.setBounds(this.f76878Oooo0oO.getBounds());
                this.f76878Oooo0oO = drawable;
                invalidate();
                return true;
            }
            if (action == 1) {
                this.f76869Oooo = false;
                if (!this.f76878Oooo0oO.getBounds().contains((int) event.getX(), (int) event.getY())) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.ic_eye_dropper_done_normal, null);
                    drawable2.setBounds(this.f76878Oooo0oO.getBounds());
                    this.f76878Oooo0oO = drawable2;
                    invalidate();
                    return true;
                }
                OooO00o();
                OooO00o oooO00o = this.eventListener;
                if (oooO00o != null) {
                    oooO00o.OooO00o(this.f76873Oooo00o);
                }
            }
        } else if (this.f76879Oooo0oo.getBounds().contains((int) event.getX(), (int) event.getY()) || this.f76881OoooO00) {
            int action2 = event.getAction();
            if (action2 == 0) {
                this.f76881OoooO00 = true;
                Drawable drawable3 = getResources().getDrawable(R.drawable.ic_eye_dropper_close_pressed, null);
                drawable3.setBounds(this.f76879Oooo0oo.getBounds());
                this.f76879Oooo0oo = drawable3;
                invalidate();
                return true;
            }
            if (action2 == 1) {
                this.f76881OoooO00 = false;
                if (this.f76879Oooo0oo.getBounds().contains((int) event.getX(), (int) event.getY())) {
                    OooO00o();
                    return true;
                }
                Drawable drawable4 = getResources().getDrawable(R.drawable.ic_eye_dropper_close_normal, null);
                drawable4.setBounds(this.f76879Oooo0oo.getBounds());
                this.f76879Oooo0oo = drawable4;
                invalidate();
                return true;
            }
        } else {
            float x = event.getX();
            PointF pointF = this.f76866OooOoo0;
            if (Math.abs(x - pointF.x) >= 2.0f || Math.abs(event.getY() - pointF.y) >= 2.0f) {
                float x2 = event.getX();
                PointF pointF2 = this.f76864OooOoOO;
                float f = x2 - pointF2.x;
                float y = event.getY() - pointF2.y;
                float fSqrt = (float) Math.sqrt((y * y) + (f * f));
                int action3 = event.getAction();
                int i = f76854OoooO0O;
                if (action3 == 0) {
                    pointF.set(event.getX(), event.getY());
                    if (fSqrt > i) {
                        pointF2.set(event.getX(), event.getY());
                    }
                    this.f76861OooOo0o = System.currentTimeMillis();
                } else if (action3 == 2) {
                    if (System.currentTimeMillis() - this.f76861OooOo0o >= 10) {
                        pointF2.offset(event.getX() - pointF.x, event.getY() - pointF.y);
                        pointF.set(event.getX(), event.getY());
                        this.f76861OooOo0o = System.currentTimeMillis();
                    }
                }
                OooO0O0();
                Bitmap bitmap = this.f76862OooOoO;
                if (bitmap != null) {
                    this.f76873Oooo00o = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
                    ShapeDrawable shapeDrawable = this.f76872Oooo00O;
                    if (shapeDrawable != null) {
                        float f2 = pointF2.x;
                        float f3 = i;
                        float f4 = pointF2.y;
                        RectF rectF = new RectF(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                        Rect rect = new Rect();
                        rectF.roundOut(rect);
                        shapeDrawable.setBounds(rect);
                    }
                }
                float fOooO0o = pointF2.y + o000000O.OooO0o(60);
                float f5 = this.f76876Oooo0o;
                if (fOooO0o + f5 > (this.f76860OooOo != null ? r5.getHeight() : 0)) {
                    Drawable drawable5 = this.f76878Oooo0oO;
                    RectF rectF2 = new RectF(pointF2.x + o000000O.OooO0o(8), (pointF2.y - o000000O.OooO0o(60)) - f5, pointF2.x + o000000O.OooO0o(8) + f5, pointF2.y - o000000O.OooO0o(60));
                    Rect rect2 = new Rect();
                    rectF2.roundOut(rect2);
                    drawable5.setBounds(rect2);
                    Drawable drawable6 = this.f76879Oooo0oo;
                    RectF rectF3 = new RectF((pointF2.x - o000000O.OooO0o(8)) - f5, (pointF2.y - o000000O.OooO0o(60)) - f5, pointF2.x - o000000O.OooO0o(8), pointF2.y - o000000O.OooO0o(60));
                    Rect rect3 = new Rect();
                    rectF3.roundOut(rect3);
                    drawable6.setBounds(rect3);
                } else {
                    Drawable drawable7 = this.f76878Oooo0oO;
                    RectF rectF4 = new RectF(pointF2.x + o000000O.OooO0o(8), pointF2.y + o000000O.OooO0o(60), pointF2.x + o000000O.OooO0o(8) + f5, pointF2.y + o000000O.OooO0o(60) + f5);
                    Rect rect4 = new Rect();
                    rectF4.roundOut(rect4);
                    drawable7.setBounds(rect4);
                    Drawable drawable8 = this.f76879Oooo0oo;
                    RectF rectF5 = new RectF((pointF2.x - o000000O.OooO0o(8)) - f5, pointF2.y + o000000O.OooO0o(60), pointF2.x - o000000O.OooO0o(8), pointF2.y + o000000O.OooO0o(60) + f5);
                    Rect rect5 = new Rect();
                    rectF5.roundOut(rect5);
                    drawable8.setBounds(rect5);
                }
                invalidate();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        View view;
        OooOOO0.OooO0oO(changedView, "changedView");
        if (changedView.equals(this) && i == 0 && (view = this.f76860OooOo) != null) {
            Integer numValueOf = Integer.valueOf(view.getWidth());
            Integer numValueOf2 = Integer.valueOf(view.getHeight());
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            Bitmap.Config config = Bitmap.Config.RGB_565;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
            OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
            view.draw(new Canvas(bitmapCreateBitmap));
            this.f76863OooOoO0 = bitmapCreateBitmap;
            int i2 = f76854OoooO0O;
            this.f76862OooOoO = Bitmap.createBitmap(i2 * 2, i2 * 2, config);
            PointF pointF = this.f76864OooOoOO;
            pointF.set(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            OooO0O0();
            Bitmap bitmap = this.f76862OooOoO;
            if (bitmap != null) {
                this.f76873Oooo00o = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                Paint paint = shapeDrawable.getPaint();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                float f = pointF.x;
                float f2 = pointF.y;
                RectF rectF = new RectF(f - i2, f2 - i2, f + i2, f2 + i2);
                Rect rect = new Rect();
                rectF.roundOut(rect);
                shapeDrawable.setBounds(rect);
                this.f76872Oooo00O = shapeDrawable;
            }
            Drawable drawable = this.f76878Oooo0oO;
            float fOooO0o = pointF.x + o000000O.OooO0o(8);
            float fOooO0o2 = pointF.y + o000000O.OooO0o(60);
            float fOooO0o3 = pointF.x + o000000O.OooO0o(8);
            int i3 = this.f76876Oooo0o;
            RectF rectF2 = new RectF(fOooO0o, fOooO0o2, fOooO0o3 + i3, pointF.y + o000000O.OooO0o(60) + i3);
            Rect rect2 = new Rect();
            rectF2.roundOut(rect2);
            drawable.setBounds(rect2);
            Drawable drawable2 = this.f76879Oooo0oo;
            RectF rectF3 = new RectF((pointF.x - o000000O.OooO0o(8)) - i3, pointF.y + o000000O.OooO0o(60), pointF.x - o000000O.OooO0o(8), pointF.y + o000000O.OooO0o(60) + i3);
            Rect rect3 = new Rect();
            rectF3.roundOut(rect3);
            drawable2.setBounds(rect3);
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
