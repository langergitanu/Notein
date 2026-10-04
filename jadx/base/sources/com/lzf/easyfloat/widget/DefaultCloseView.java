package com.lzf.easyfloat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0O0o.C25872OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/lzf/easyfloat/widget/DefaultCloseView;", "Lcom/lzf/easyfloat/widget/BaseSwitchView;", "easyfloat_release"}, m80613k = 1, m80614mv = {1, 5, 1}, m80616xi = 48)
public final class DefaultCloseView extends BaseSwitchView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f68983OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f68984OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Paint f68985OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f68986OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Path f68987OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f68988OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f68989OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f68990OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Region f68991OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Region f68992Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final float f68993Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f68984OooOo0o = Color.parseColor("#99000000");
        this.f68983OooOo = Color.parseColor("#99FF0000");
        this.f68987OooOoOO = new Path();
        this.f68990OooOooO = new RectF();
        this.f68991OooOooo = new Region();
        this.f68992Oooo000 = new Region();
        this.f68993Oooo00O = (int) ((4.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C25872OooO0O0.f88282OooO00o, 0, 0);
            this.f68984OooOo0o = typedArrayObtainStyledAttributes.getColor(2, this.f68984OooOo0o);
            this.f68983OooOo = typedArrayObtainStyledAttributes.getColor(1, this.f68983OooOo);
            this.f68986OooOoO0 = typedArrayObtainStyledAttributes.getInt(0, this.f68986OooOoO0);
            this.f68993Oooo00O = typedArrayObtainStyledAttributes.getDimension(3, this.f68993Oooo00O);
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        paint.setColor(this.f68984OooOo0o);
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        this.f68985OooOoO = paint;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.f68987OooOoOO;
        path.reset();
        Paint paint = this.f68985OooOoO;
        if (paint == null) {
            OooOOO0.OooOOOO("paint");
            throw null;
        }
        paint.setColor(this.f68984OooOo0o);
        int i = this.f68986OooOoO0;
        RectF rectF = this.f68990OooOooO;
        Region region = this.f68992Oooo000;
        if (i == 0) {
            float paddingLeft = getPaddingLeft();
            float f = this.f68993Oooo00O;
            float paddingRight = this.f68989OooOoo0 - getPaddingRight();
            float f2 = this.f68993Oooo00O;
            rectF.set(paddingLeft + f, f, paddingRight - f2, (this.f68988OooOoo - f2) * 2);
            path.addOval(rectF, Path.Direction.CW);
            int paddingLeft2 = getPaddingLeft();
            float f3 = this.f68993Oooo00O;
            region.set(paddingLeft2 + ((int) f3), (int) f3, (int) ((this.f68989OooOoo0 - getPaddingRight()) - this.f68993Oooo00O), (int) this.f68988OooOoo);
        } else if (i == 1) {
            rectF.set(getPaddingLeft(), this.f68993Oooo00O, this.f68989OooOoo0 - getPaddingRight(), this.f68988OooOoo);
            path.addRect(rectF, Path.Direction.CW);
            region.set(getPaddingLeft(), (int) this.f68993Oooo00O, ((int) this.f68989OooOoo0) - getPaddingRight(), (int) this.f68988OooOoo);
        } else if (i == 2) {
            float f4 = this.f68989OooOoo0 / 2;
            float f5 = this.f68988OooOoo;
            path.addCircle(f4, f5, f5 - this.f68993Oooo00O, Path.Direction.CW);
            region.set(0, (int) this.f68993Oooo00O, (int) this.f68989OooOoo0, (int) this.f68988OooOoo);
        }
        this.f68991OooOooo.setPath(path, region);
        if (canvas != null) {
            Paint paint2 = this.f68985OooOoO;
            if (paint2 == null) {
                OooOOO0.OooOOOO("paint");
                throw null;
            }
            canvas.drawPath(path, paint2);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f68989OooOoo0 = i;
        this.f68988OooOoo = i2;
    }
}
