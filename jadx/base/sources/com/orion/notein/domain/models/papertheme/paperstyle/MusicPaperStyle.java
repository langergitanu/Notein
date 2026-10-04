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
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJA\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\u00020!8\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/MusicPaperStyle;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "<init>", "()V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "initPath", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "marginX", "F", "getMarginX", "()F", "marginY", "getMarginY", "itemHeight", "getItemHeight", "itemSpace", "getItemSpace", "", BackupFile.PREFIX_NOTE_DIR, "I", "getN", "()I", "Landroid/graphics/Path;", "lines", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "solidPaint", "Landroid/graphics/Paint;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MusicPaperStyle extends PaperStyle {
    private final float itemHeight;
    private final float itemSpace;
    private final Path lines;
    private final float marginX;
    private final float marginY;
    private final int n;
    private final Paint solidPaint;

    public MusicPaperStyle() {
        super(0.0f, 0.0f, null, null, null, null, 63, null);
        this.marginX = o000000O.OooO0o0(27.0f);
        this.marginY = o000000O.OooO0o0(54.0f);
        this.itemHeight = o000000O.OooO0o0(32.0f);
        this.itemSpace = o000000O.OooO0o0(31.0f);
        this.n = 12;
        this.lines = new Path();
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        paintOooO00o.setColor(getDefaultColor());
        paintOooO00o.setStyle(Paint.Style.STROKE);
        paintOooO00o.setStrokeWidth(o000000O.OooO0o0(1.0f));
        this.solidPaint = paintOooO00o;
    }

    public final float getItemHeight() {
        return this.itemHeight;
    }

    public final float getItemSpace() {
        return this.itemSpace;
    }

    public final float getMarginX() {
        return this.marginX;
    }

    public final float getMarginY() {
        return this.marginY;
    }

    public final int getN() {
        return this.n;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public String getName(Resources res) {
        return OooO0OO.OooO00o(res, "res", R.string.paper_style_music, "getString(...)");
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void initPath() {
        super.initPath();
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            float f = this.marginX;
            float f2 = this.marginY;
            for (int i3 = 0; i3 < 5; i3++) {
                float fOooO0o0 = (o000000O.OooO0o0(8.0f) * i3) + ((this.itemSpace + this.itemHeight) * i2) + f2;
                this.lines.moveTo(f, fOooO0o0);
                this.lines.lineTo(getPaperWidth() - this.marginX, fOooO0o0);
            }
        }
        C21559Oooo0oO.OooO0O0(this.lines, this.solidPaint, getPathList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public <T> void render(OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        C32443OooOOO c32443OooOOOOooO0OO = C21036OooOOo0.OooO0OO(renderEngine, "renderEngine", renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, new RectF(0.0f, 0.0f, ((Number) c32443OooOOOOooO0OO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOOOooO0OO.f116637OooOo).floatValue()));
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
        OooO00o.C19734OooO00o.OooO00o(renderEngine, getDefaultColor(), o000000O.OooO0o0(1.0f) * paperWidth, 0, 0, false, 24);
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            float f = this.marginX;
            float f2 = this.marginY;
            for (int i3 = 0; i3 < 5; i3++) {
                float fOooO0o0 = ((o000000O.OooO0o0(8.0f) * i3) + ((this.itemSpace + this.itemHeight) * i2) + f2) * paperHeight;
                renderEngine.moveTo((f * paperWidth) + renderTargetViewport.left, renderTargetViewport.top + fOooO0o0);
                renderEngine.lineTo(OooOO0.OooO0OO.OooO0O0(getPaperWidth(), this.marginX, paperWidth, renderTargetViewport.left), renderTargetViewport.top + fOooO0o0);
            }
        }
        renderEngine.OooOOOO(1.0f);
    }
}
