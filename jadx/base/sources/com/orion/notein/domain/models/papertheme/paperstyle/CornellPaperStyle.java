package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.C21559Oooo0oO;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.words.OooO0OO;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJA\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR*\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/CornellPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "<init>", "()V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "marginX", "F", "marginY", "itemSpace", "Landroid/graphics/Path;", "lines", "Landroid/graphics/Path;", "redLines", "", "value", "defaultColor", "I", "getDefaultColor", "()I", "setDefaultColor", "(I)V", "Landroid/graphics/Paint;", "solidPaint", "Landroid/graphics/Paint;", "redPaint", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CornellPaperStyle extends PaperStyle {
    private int defaultColor;
    private final float itemSpace;
    private final Path lines;
    private final float marginX;
    private final float marginY;
    private final Path redLines;
    private final Paint redPaint;
    private final Paint solidPaint;

    public CornellPaperStyle() {
        super(0.0f, 0.0f, null, null, null, null, 63, null);
        this.marginX = o000000O.OooO0o0(0.0f);
        this.marginY = o000000O.OooO0o0(83.0f);
        this.itemSpace = o000000O.OooO0o0(33.0f);
        this.lines = new Path();
        this.redLines = new Path();
        this.defaultColor = Color.parseColor("#C3D0E0");
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        Paint.Style style = Paint.Style.STROKE;
        paintOooO00o.setStyle(style);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(2.0f));
        this.solidPaint = paintOooO00o;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(style);
        paint.setStrokeWidth(o000000O.OooO0o0(2.0f));
        paint.setColor(Color.parseColor("#E89EAD"));
        this.redPaint = paint;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public int getDefaultColor() {
        return this.defaultColor;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_cornell, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        int i = 0;
        while (true) {
            float f = this.marginX;
            int i2 = i + 1;
            float f2 = (this.itemSpace * i) + this.marginY;
            if (f2 > getPaperHeight()) {
                Path path = this.redLines;
                path.moveTo(0.0f, o000000O.OooO0o0(182.0f));
                path.lineTo(getPaperWidth(), o000000O.OooO0o0(182.0f));
                path.moveTo(0.0f, o000000O.OooO0o0(677.0f));
                path.lineTo(getPaperWidth(), o000000O.OooO0o0(677.0f));
                path.moveTo(o000000O.OooO0o0(180.0f), o000000O.OooO0o0(182.0f));
                path.lineTo(o000000O.OooO0o0(180.0f), o000000O.OooO0o0(677.0f));
                getPathList().add(new C32443OooOOO<>(this.lines, this.solidPaint));
                C21559Oooo0oO.OooO0O0(this.redLines, this.redPaint, getPathList());
                return;
            }
            this.lines.moveTo(f, f2);
            this.lines.lineTo(getPaperWidth(), f2);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setDefaultColor(int i) {
        this.defaultColor = i;
        this.solidPaint.setColor(i);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getDefaultColor(), o000000O.OooO0o0(2.0f) * paperWidth, 0, 0, false, 24);
        int i = 0;
        while (true) {
            float f = (this.marginX * paperWidth) + renderTargetViewport.left;
            float f2 = renderTargetViewport.top;
            int i2 = i + 1;
            float f3 = (this.itemSpace * paperHeight * i) + (this.marginY * paperHeight) + f2;
            if (f3 > (getPaperHeight() * paperHeight) + f2) {
                renderEngine.OooOOOO(1.0f);
                OooO00o.C19734OooO00o.OooO00o(renderEngine, Color.parseColor("#E89EAD"), o000000O.OooO0o0(2.0f) * paperWidth, 0, 0, false, 24);
                renderEngine.moveTo(renderTargetViewport.left + 0.0f, (o000000O.OooO0o0(182.0f) * paperHeight) + renderTargetViewport.top);
                renderEngine.lineTo((getPaperWidth() * paperWidth) + renderTargetViewport.left, (o000000O.OooO0o0(182.0f) * paperHeight) + renderTargetViewport.top);
                renderEngine.moveTo(renderTargetViewport.left + 0.0f, (o000000O.OooO0o0(677.0f) * paperHeight) + renderTargetViewport.top);
                renderEngine.lineTo((getPaperWidth() * paperWidth) + renderTargetViewport.left, (o000000O.OooO0o0(677.0f) * paperHeight) + renderTargetViewport.top);
                renderEngine.moveTo((o000000O.OooO0o0(180.0f) * paperWidth) + renderTargetViewport.left, (o000000O.OooO0o0(182.0f) * paperHeight) + renderTargetViewport.top);
                renderEngine.lineTo((o000000O.OooO0o0(180.0f) * paperWidth) + renderTargetViewport.left, (o000000O.OooO0o0(677.0f) * paperHeight) + renderTargetViewport.top);
                renderEngine.OooOOOO(1.0f);
                return;
            }
            renderEngine.moveTo(f, f3);
            renderEngine.lineTo((getPaperWidth() * paperWidth) + renderTargetViewport.left, f3);
            i = i2;
        }
    }
}
