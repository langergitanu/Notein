package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.C21559Oooo0oO;
import com.aspose.slides.C22234OoooOo0;
import com.aspose.words.OooO0OO;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo00.OooO00o;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJA\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/EnglishPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "<init>", "()V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "marginX", "F", "marginY", "itemHeight", "itemSpace", "innerSpace", "", BackupFile.PREFIX_NOTE_DIR, "I", "itemLineNumber", "Landroid/graphics/Path;", "solidLines", "Landroid/graphics/Path;", "boldLines", "Landroid/graphics/Paint;", "solidPaint", "Landroid/graphics/Paint;", "boldLinePaint", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EnglishPaperStyle extends PaperStyle {
    private final Paint boldLinePaint;
    private final Path boldLines;
    private final float innerSpace;
    private final float itemHeight;
    private final int itemLineNumber;
    private final float itemSpace;
    private final float marginX;
    private final float marginY;
    private final int n;
    private final Path solidLines;
    private final Paint solidPaint;

    public EnglishPaperStyle() {
        super(0.0f, 0.0f, null, null, null, null, 63, null);
        this.marginX = o000000O.OooO0o0(27.0f);
        this.marginY = o000000O.OooO0o0(53.0f);
        this.itemHeight = o000000O.OooO0o0(42.0f);
        this.itemSpace = o000000O.OooO0o0(32.0f);
        this.innerSpace = o000000O.OooO0o0(15.0f);
        this.n = 10;
        this.itemLineNumber = 4;
        this.solidLines = new Path();
        this.boldLines = new Path();
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        Paint.Style style = Paint.Style.STROKE;
        paintOooO00o.setStyle(style);
        this.solidPaint = paintOooO00o;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(style);
        paint.setColor(getDefaultColor());
        paint.setStrokeWidth(o000000O.OooO0o0(3.0f));
        this.boldLinePaint = paint;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_english, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            float f = this.marginX;
            float f2 = ((this.itemSpace + this.itemHeight) * i2) + this.marginY;
            float paperWidth = getPaperWidth() - this.marginX;
            int i3 = this.itemLineNumber;
            for (int i4 = 0; i4 < i3; i4++) {
                if (i4 == 2) {
                    float f3 = i4;
                    this.boldLines.moveTo(f, (this.innerSpace * f3) + f2);
                    this.boldLines.lineTo(paperWidth, (f3 * this.innerSpace) + f2);
                } else {
                    float f4 = i4;
                    this.solidLines.moveTo(f, (this.innerSpace * f4) + f2);
                    this.solidLines.lineTo(paperWidth, (f4 * this.innerSpace) + f2);
                }
            }
        }
        getPathList().add(new C32443OooOOO<>(this.solidLines, this.solidPaint));
        C21559Oooo0oO.OooO0O0(this.boldLines, this.boldLinePaint, getPathList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        int i;
        int i2;
        float f;
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        int i3 = this.n;
        for (int i4 = 0; i4 < i3; i4++) {
            float f2 = this.marginX;
            float f3 = ((this.itemSpace + this.itemHeight) * i4) + this.marginY;
            float paperWidth2 = getPaperWidth() - this.marginX;
            int i5 = this.itemLineNumber;
            int i6 = 0;
            while (i6 < i5) {
                if (i6 == 2) {
                    i = i5;
                    f = paperWidth;
                    i2 = i6;
                    OooO00o.C19734OooO00o.OooO00o(renderEngine, getDefaultColor(), o000000O.OooO0o0(3.0f) * paperWidth, 0, 0, false, 24);
                    float f4 = i2;
                    renderEngine.moveTo((f2 * f) + renderTargetViewport.left, (((this.innerSpace * f4) + f3) * paperHeight) + renderTargetViewport.top);
                    renderEngine.lineTo((paperWidth2 * f) + renderTargetViewport.left, (((f4 * this.innerSpace) + f3) * paperHeight) + renderTargetViewport.top);
                    renderEngine.OooOOOO(1.0f);
                } else {
                    i = i5;
                    i2 = i6;
                    f = paperWidth;
                    float f5 = i2;
                    renderEngine.moveTo((f2 * f) + renderTargetViewport.left, (((this.innerSpace * f5) + f3) * paperHeight) + renderTargetViewport.top);
                    renderEngine.lineTo((paperWidth2 * f) + renderTargetViewport.left, (((f5 * this.innerSpace) + f3) * paperHeight) + renderTargetViewport.top);
                    OooO00o.C19734OooO00o.OooO00o(renderEngine, getDefaultColor(), o000000O.OooO0o0(1.0f) * f, 0, 0, false, 24);
                    renderEngine.OooOOOO(1.0f);
                }
                i6 = i2 + 1;
                paperWidth = f;
                i5 = i;
            }
        }
    }
}
