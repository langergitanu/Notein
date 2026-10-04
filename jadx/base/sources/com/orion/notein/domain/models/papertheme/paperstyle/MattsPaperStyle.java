package com.orion.notein.domain.models.papertheme.paperstyle;

import Oooo0.o000000O;
import Oooo0oO.C21036OooOOo0;
import android.content.res.Resources;
import android.graphics.DashPathEffect;
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
@Metadata(m80611d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJA\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/MattsPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "<init>", "()V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "initPath", "Landroid/graphics/Path;", "key", "Landroid/graphics/Paint;", "getScaledPaint", "(Landroid/graphics/Path;F)Landroid/graphics/Paint;", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "marginX", "F", "marginY", "itemHeight", "itemWidth", "itemSpace", "", "m", "I", BackupFile.PREFIX_NOTE_DIR, "solidLines", "Landroid/graphics/Path;", "dashLines", "solidPaint", "Landroid/graphics/Paint;", "dashLinePaint", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MattsPaperStyle extends PaperStyle {
    private final Paint dashLinePaint;
    private final Path dashLines;
    private final float itemHeight;
    private final float itemSpace;
    private final float itemWidth;
    private final int m;
    private final float marginX;
    private final float marginY;
    private final int n;
    private final Path solidLines;
    private final Paint solidPaint;

    public MattsPaperStyle() {
        super(0.0f, 0.0f, null, null, null, null, 63, null);
        this.marginX = o000000O.OooO0o0(21.0f);
        this.marginY = o000000O.OooO0o0(53.0f);
        this.itemHeight = o000000O.OooO0o0(45.0f);
        this.itemWidth = o000000O.OooO0o0(46.0f);
        this.itemSpace = o000000O.OooO0o0(31.0f);
        this.m = 12;
        this.n = 10;
        this.solidLines = new Path();
        this.dashLines = new Path();
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
        paint.setStrokeWidth(o000000O.OooO0o0(1.0f));
        paint.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(5.0f), o000000O.OooO0o0(3.0f)}, 0.0f));
        this.dashLinePaint = paint;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_matts, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public Paint getScaledPaint(Path key, float scale) {
        OooOOO0.OooO0oO(key, "key");
        if (!key.equals(this.dashLines)) {
            return super.getScaledPaint(key, scale);
        }
        Paint paint = new Paint();
        paint.set(this.dashLinePaint);
        paint.setStrokeWidth(this.dashLinePaint.getStrokeWidth() * scale);
        paint.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(5.0f) * scale, o000000O.OooO0o0(3.0f) * scale}, 0.0f));
        return paint;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            float f = this.marginX;
            float f2 = ((this.itemSpace + this.itemHeight) * i2) + this.marginY;
            float paperWidth = (getPaperWidth() - this.marginX) - o000000O.OooO0o(1);
            for (int i3 = 0; i3 < 2; i3++) {
                float f3 = i3;
                this.solidLines.moveTo(f, (this.itemHeight * f3) + f2);
                this.solidLines.lineTo(paperWidth, (f3 * this.itemHeight) + f2);
            }
            this.dashLines.moveTo(f, (this.itemHeight * 0.5f) + f2);
            this.dashLines.lineTo(paperWidth, (this.itemHeight * 0.5f) + f2);
            int i4 = this.m;
            if (i4 >= 0) {
                int i5 = 0;
                while (true) {
                    float f4 = i5;
                    this.solidLines.moveTo((this.itemWidth * f4) + f, f2);
                    this.solidLines.lineTo((f4 * this.itemWidth) + f, this.itemHeight + f2);
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int i6 = this.m;
            for (int i7 = 0; i7 < i6; i7++) {
                float f5 = i7 + 0.5f;
                this.dashLines.moveTo((this.itemWidth * f5) + f, f2);
                this.dashLines.lineTo((f5 * this.itemWidth) + f, this.itemHeight + f2);
            }
        }
        getPathList().add(new C32443OooOOO<>(this.solidLines, this.solidPaint));
        C21559Oooo0oO.OooO0O0(this.dashLines, this.dashLinePaint, getPathList());
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
        int i2 = 2;
        int i3 = 1;
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
        float fWidth = renderTargetViewport.width();
        float fHeight = renderTargetViewport.height();
        float paperWidth = fWidth / getPaperWidth();
        float paperHeight = fHeight / getPaperHeight();
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getDefaultColor(), o000000O.OooO0o0(1.0f) * paperWidth, 0, 0, false, 24);
        int i4 = this.n;
        int i5 = 0;
        while (i5 < i4) {
            float f = this.marginX;
            float f2 = ((this.itemSpace + this.itemHeight) * i5) + this.marginY;
            float paperWidth2 = (getPaperWidth() - this.marginX) - o000000O.OooO0o(i3);
            int i6 = 0;
            while (i6 < i2) {
                float f3 = i6;
                renderEngine.moveTo((f * paperWidth) + renderTargetViewport.left, (((this.itemHeight * f3) + f2) * paperHeight) + renderTargetViewport.top);
                renderEngine.lineTo((paperWidth2 * paperWidth) + renderTargetViewport.left, (((f3 * this.itemHeight) + f2) * paperHeight) + renderTargetViewport.top);
                i6++;
                i3 = i3;
                i2 = 2;
            }
            int i7 = i3;
            int i8 = this.m;
            if (i8 >= 0) {
                while (true) {
                    float f4 = i;
                    com.aspose.words.OooO00o.OooO00o(f2, paperHeight, renderTargetViewport.top, renderEngine, (((this.itemWidth * f4) + f) * paperWidth) + renderTargetViewport.left);
                    renderEngine.lineTo((((f4 * this.itemWidth) + f) * paperWidth) + renderTargetViewport.left, ((this.itemHeight + f2) * paperHeight) + renderTargetViewport.top);
                    i = i != i8 ? i + 1 : 0;
                }
            }
            i5++;
            i3 = i7;
            i2 = 2;
        }
        renderEngine.OooOOOO(1.0f);
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getDefaultColor(), o000000O.OooO0o0(1.0f) * paperWidth, 0, 0, false, 24);
        float fOooO0o0 = o000000O.OooO0o0(5.0f);
        float fOooO0o02 = o000000O.OooO0o0(3.0f);
        float[] fArr = new float[2];
        fArr[0] = fOooO0o0;
        fArr[i3] = fOooO0o02;
        renderEngine.OooO0oo(fArr);
        int i9 = this.n;
        for (int i10 = 0; i10 < i9; i10++) {
            float f5 = this.marginX;
            float f6 = ((this.itemSpace + this.itemHeight) * i10) + this.marginY;
            float paperWidth3 = (getPaperWidth() - this.marginX) - o000000O.OooO0o(r20);
            renderEngine.moveTo((f5 * paperWidth) + renderTargetViewport.left, (((this.itemHeight * 0.5f) + f6) * paperHeight) + renderTargetViewport.top);
            renderEngine.lineTo((paperWidth3 * paperWidth) + renderTargetViewport.left, (((this.itemHeight * 0.5f) + f6) * paperHeight) + renderTargetViewport.top);
            int i11 = this.m;
            for (int i12 = 0; i12 < i11; i12++) {
                float f7 = i12 + 0.5f;
                com.aspose.words.OooO00o.OooO00o(f6, paperHeight, renderTargetViewport.top, renderEngine, (((this.itemWidth * f7) + f5) * paperWidth) + renderTargetViewport.left);
                renderEngine.lineTo((((f7 * this.itemWidth) + f5) * paperWidth) + renderTargetViewport.left, ((this.itemHeight + f6) * paperHeight) + renderTargetViewport.top);
            }
        }
        renderEngine.OooOOOO(1.0f);
    }
}
