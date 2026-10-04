package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.words.OooO0OO;
import com.google.gson.annotations.Expose;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/NonePaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "textColor", "<init>", "(I)V", "Landroid/graphics/Canvas;", "canvas", "LoO00ooO/OooOooO;", "drawText", "(Landroid/graphics/Canvas;)V", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "I", "getTextColor", "()I", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NonePaperStyle extends PaperStyle {

    @Expose
    private final int textColor;
    private final Paint textPaint;

    public NonePaperStyle() {
        this(0, 1, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void drawText(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f = fontMetrics.bottom;
        canvas.drawText("BLANK", rectF.centerX(), rectF.centerY() + (((f - fontMetrics.top) / 2) - f), this.textPaint);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.cover_name_cover_none, "getString(...)");
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public /* synthetic */ NonePaperStyle(int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? Color.parseColor("#FF4B4B4B") : i);
    }

    public NonePaperStyle(int i) {
        super(0.0f, 0.0f, null, null, null, null, 63, null);
        this.textColor = i;
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setStyle(Paint.Style.FILL);
        paintOooO00o.setColor(i);
        paintOooO00o.setTextSize(o000000O.OooO0o0(14.0f));
        paintOooO00o.setTextAlign(Paint.Align.CENTER);
        this.textPaint = paintOooO00o;
    }
}
