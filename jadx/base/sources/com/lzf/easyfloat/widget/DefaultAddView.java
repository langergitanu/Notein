package com.lzf.easyfloat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/lzf/easyfloat/widget/DefaultAddView;", "Lcom/lzf/easyfloat/widget/BaseSwitchView;", "easyfloat_release"}, m80613k = 1, m80614mv = {1, 5, 1}, m80616xi = 48)
public final class DefaultAddView extends BaseSwitchView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Path f68976OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Paint f68977OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f68978OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f68979OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Region f68980OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f68981OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Region f68982OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAddView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f68976OooOo = new Path();
        this.f68980OooOoOO = new Region();
        this.f68982OooOoo0 = new Region();
        this.f68981OooOoo = 18.0f;
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AA000000"));
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        this.f68977OooOo0o = paint;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.f68976OooOo;
        path.reset();
        float f = this.f68979OooOoO0;
        float f2 = this.f68978OooOoO;
        float fMin = Math.min(f, f2);
        float f3 = this.f68981OooOoo;
        path.addCircle(f, f2, fMin - f3, Path.Direction.CW);
        Region region = this.f68982OooOoo0;
        region.set((int) f3, (int) f3, (int) this.f68979OooOoO0, (int) this.f68978OooOoO);
        this.f68980OooOoOO.setPath(path, region);
        if (canvas != null) {
            Paint paint = this.f68977OooOo0o;
            if (paint == null) {
                OooOOO0.OooOOOO("paint");
                throw null;
            }
            canvas.drawPath(path, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f68979OooOoO0 = i;
        this.f68978OooOoO = i2;
    }
}
