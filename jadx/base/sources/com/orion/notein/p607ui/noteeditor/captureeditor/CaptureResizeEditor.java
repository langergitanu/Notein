package com.orion.notein.p607ui.noteeditor.captureeditor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.C28460OooooO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/captureeditor/CaptureResizeEditor;", "Landroid/view/View;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CaptureResizeEditor extends View {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final int f74454OooOoO = Color.parseColor("#007AFF");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final float f74455OooOoOO = C28460OooooO0.OooO00o(1.5f);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final float f74456OooOoo0 = C28460OooooO0.OooO00o(12.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Paint f74457OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Paint f74458OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Paint f74459OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureResizeEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f74455OooOoOO);
        int i = f74454OooOoO;
        paint.setColor(i);
        this.f74458OooOo0o = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeJoin(join);
        paint2.setStrokeCap(cap);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setStrokeWidth(0.0f);
        paint2.setColor(Color.argb(51, Color.red(i), Color.green(i), Color.blue(i)));
        this.f74457OooOo = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStrokeJoin(join);
        paint3.setStrokeCap(cap);
        paint3.setStyle(style);
        paint3.setColor(i);
        this.f74459OooOoO0 = paint3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        float width = getWidth();
        float f = f74456OooOoo0;
        canvas.drawRect(new RectF(f, f, width - f, getHeight() - f), this.f74458OooOo0o);
        canvas.drawRect(new RectF(f, f, getWidth() - f, getHeight() - f), this.f74457OooOo);
        float fOooO00o = C28460OooooO0.OooO00o(10.0f);
        float width2 = getWidth() - f;
        float height = getHeight() - f;
        Paint paint = this.f74459OooOoO0;
        canvas.drawCircle(f, f, fOooO00o, paint);
        canvas.drawCircle(width2, f, fOooO00o, paint);
        canvas.drawCircle(f, height, fOooO00o, paint);
        canvas.drawCircle(width2, height, fOooO00o, paint);
    }
}
