package com.orion.notein.p607ui.noteeditor.toolbox.colorpicker;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/ColorPickerView;", "Landroid/view/View;", "Landroid/graphics/Shader;", "getSVShader", "()Landroid/graphics/Shader;", "", "color", "LoO00ooO/OooOooO;", "setColor", "(I)V", "", "value", "OooOo0o", "[F", "getColorHSV", "()[F", "setColorHSV", "([F)V", "colorHSV", "Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/ColorPickerView$OooO00o;", "OooOoo0", "Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/ColorPickerView$OooO00o;", "getCallback", "()Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/ColorPickerView$OooO00o;", "setCallback", "(Lcom/orion/notein/ui/noteeditor/toolbox/colorpicker/ColorPickerView$OooO00o;)V", "callback", "OooOoo", "getCorners", "setCorners", "corners", "Landroid/graphics/Path;", "OooOooO", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "path", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ColorPickerView extends View {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int f76835OooOooo = o000000O.OooO0o(16);

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final int f76836Oooo000 = o000000O.OooO0o(17);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final float f76837Oooo00O = o000000O.OooO0o0(9.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Paint f76838OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public float[] colorHSV;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f76840OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Drawable f76841OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f76842OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name and from kotlin metadata */
    public float[] corners;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public OooO00o callback;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public final Path path;

    public interface OooO00o {
        void OooO00o(int i);

        void OooO0O0(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.colorHSV = new float[3];
        this.f76838OooOo = new Paint();
        Drawable drawable = getResources().getDrawable(R.drawable.ic_color_picker_cursor, null);
        OooOOO0.OooO0o(drawable, "getDrawable(...)");
        this.f76841OooOoO0 = drawable;
        this.corners = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.path = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, null);
        }
    }

    private final Shader getSVShader() {
        float height = getHeight();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        return new ComposeShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, -1, ViewCompat.MEASURED_STATE_MASK, tileMode), new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, -1, Color.HSVToColor(new float[]{this.colorHSV[0], 1.0f, 1.0f}), tileMode), PorterDuff.Mode.MULTIPLY);
    }

    public final C32443OooOOO<Float, Float> OooO00o(float f, float f2) {
        float f3 = f76835OooOooo;
        float f4 = f76836Oooo000;
        float f5 = 2;
        float f6 = f3 / f5;
        if (f < f6) {
            f = f6;
        }
        if (f + f6 > getWidth()) {
            f = getWidth() - f6;
        }
        float f7 = f4 / f5;
        if (f2 < f7) {
            f2 = f7;
        }
        if (f2 + f7 > getHeight()) {
            f2 = getHeight() - f7;
        }
        return new C32443OooOOO<>(Float.valueOf(f), Float.valueOf(f2));
    }

    public final int OooO0O0(float f, float f2) {
        C32443OooOOO<Float, Float> c32443OooOOOOooO00o = OooO00o(f, f2);
        return Color.HSVToColor(new float[]{this.colorHSV[0], (c32443OooOOOOooO00o.f116638OooOo0o.floatValue() - (o000000O.OooO0o(16) / 2)) / (getWidth() - o000000O.OooO0o(16)), 1.0f - ((c32443OooOOOOooO00o.f116637OooOo.floatValue() - (o000000O.OooO0o(17) / 2)) / (getHeight() - o000000O.OooO0o(17)))});
    }

    public final void OooO0OO(float f, float f2) {
        float fOooO0o0 = o000000O.OooO0o0(16.0f);
        float fOooO0o02 = o000000O.OooO0o0(17.0f);
        C32443OooOOO<Float, Float> c32443OooOOOOooO00o = OooO00o(f, f2);
        float fFloatValue = c32443OooOOOOooO00o.f116638OooOo0o.floatValue();
        float fFloatValue2 = c32443OooOOOOooO00o.f116637OooOo.floatValue();
        float f3 = 2;
        float f4 = fOooO0o0 / f3;
        float f5 = fOooO0o02 / f3;
        this.f76841OooOoO0.setBounds((int) (fFloatValue - f4), (int) (fFloatValue2 - f5), (int) (fFloatValue + f4), (int) (fFloatValue2 + f5));
    }

    public final OooO00o getCallback() {
        return this.callback;
    }

    public final float[] getColorHSV() {
        return this.colorHSV;
    }

    public final float[] getCorners() {
        return this.corners;
    }

    public final Path getPath() {
        return this.path;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        Paint paint = this.f76838OooOo;
        paint.setShader(getSVShader());
        canvas.drawPath(this.path, paint);
        OooO0OO(this.f76840OooOoO, this.f76842OooOoOO);
        this.f76841OooOoO0.draw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.corners, Path.Direction.CW);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = event.getAction();
        if (action == 0) {
            this.f76840OooOoO = event.getX();
            float y = event.getY();
            this.f76842OooOoOO = y;
            OooO00o oooO00o = this.callback;
            if (oooO00o != null) {
                oooO00o.OooO0O0(OooO0O0(this.f76840OooOoO, y));
            }
        } else if (action == 1) {
            this.f76840OooOoO = event.getX();
            float y2 = event.getY();
            this.f76842OooOoOO = y2;
            OooO00o oooO00o2 = this.callback;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o(OooO0O0(this.f76840OooOoO, y2));
            }
        } else if (action == 2) {
            this.f76840OooOoO = event.getX();
            float y3 = event.getY();
            this.f76842OooOoOO = y3;
            OooO00o oooO00o3 = this.callback;
            if (oooO00o3 != null) {
                oooO00o3.OooO0O0(OooO0O0(this.f76840OooOoO, y3));
            }
        }
        invalidate();
        return true;
    }

    public final void setCallback(OooO00o oooO00o) {
        this.callback = oooO00o;
    }

    public final void setColor(int color) {
        float[] fArr = new float[3];
        Color.colorToHSV(color, fArr);
        setColorHSV(fArr);
    }

    public final void setColorHSV(float[] value) {
        OooOOO0.OooO0oO(value, "value");
        this.colorHSV = value;
        float f = value[1];
        int width = getWidth();
        int i = f76835OooOooo;
        this.f76840OooOoO = (f * (width - i)) + (i / 2);
        float f2 = 1.0f - value[2];
        int height = getHeight();
        int i2 = f76836Oooo000;
        float f3 = (f2 * (height - i2)) + (i2 / 2);
        this.f76842OooOoOO = f3;
        OooO0OO(this.f76840OooOoO, f3);
        invalidate();
    }

    public final void setCorners(float[] fArr) {
        OooOOO0.OooO0oO(fArr, "<set-?>");
        this.corners = fArr;
    }
}
