package o0OoO0oo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.internal.ManufacturerUtils;
import com.orion.penkit.models.QuoteInfo;
import o0oo0OOo.C31237OooO0O0;
import oO0OOooo.C33163OooO0oO;

/* JADX INFO: renamed from: o0OoO0oo.o00oOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28964o00oOoo0 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final StaticLayout f102622OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f102623OooO0O0;

    public C28964o00oOoo0(C33163OooO0oO c33163OooO0oO, QuoteInfo quoteInfo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((int) TypedValue.applyDimension(2, 12, c33163OooO0oO.getResources().getDisplayMetrics()));
        float fWidth = quoteInfo.getContentBoundingBox().width();
        fWidth = fWidth > 800.0f ? 800.0f : fWidth;
        C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
        String text = quoteInfo.getText();
        c31237OooO0O0.getClass();
        StaticLayout staticLayoutOooO0OO = C31237OooO0O0.OooO0OO(c33163OooO0oO, text, (int) fWidth, 1.0f, textPaint);
        this.f102622OooO00o = staticLayoutOooO0OO;
        int lineCount = staticLayoutOooO0OO.getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, this.f102622OooO00o.getLineWidth(i));
        }
        this.f102623OooO0O0 = fMax;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        canvas.save();
        this.f102622OooO00o.draw(canvas);
        canvas.drawColor(Color.parseColor("#66CCCCCC"));
        canvas.restore();
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point size, Point touch) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(size, "size");
        kotlin.jvm.internal.OooOOO0.OooO0oO(touch, "touch");
        int iOooO0o = (int) (this.f102623OooO0O0 + Oooo0.o000000O.OooO0o(4));
        int height = this.f102622OooO00o.getHeight();
        size.set(iOooO0o, height);
        if (ManufacturerUtils.isSamsungDevice()) {
            touch.set(iOooO0o / 2, height / 2);
        } else {
            touch.set(0, 0);
        }
    }
}
