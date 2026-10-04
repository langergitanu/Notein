package com.orion.penkit.models;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.internal.view.SupportMenu;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistLinePainter;", "", "<init>", "()V", "Lcom/orion/penkit/models/AnchorAssistAware;", "assistAware", "Landroid/graphics/Canvas;", "canvas", "LoO00ooO/OooOooO;", "drawTypedRect", "(Lcom/orion/penkit/models/AnchorAssistAware;Landroid/graphics/Canvas;)V", "Lcom/orion/penkit/models/AnchorAssistLine;", "assistLine", "drawAssistLine", "(Lcom/orion/penkit/models/AnchorAssistLine;Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "assistLinePaint$delegate", "LoO00ooO/OooOO0;", "getAssistLinePaint", "()Landroid/graphics/Paint;", "assistLinePaint", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AnchorAssistLinePainter {
    public static final AnchorAssistLinePainter INSTANCE = new AnchorAssistLinePainter();

    /* JADX INFO: renamed from: assistLinePaint$delegate, reason: from kotlin metadata */
    private static final InterfaceC32440OooOO0 assistLinePaint = C20519OooO0Oo.OooO0OO(new C23909OooO0Oo());

    private AnchorAssistLinePainter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint assistLinePaint_delegate$lambda$0() {
        Paint paint = new Paint();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        return paint;
    }

    private final Paint getAssistLinePaint() {
        return (Paint) assistLinePaint.getValue();
    }

    public final void drawAssistLine(AnchorAssistLine<?> assistLine, Canvas canvas) {
        OooOOO0.OooO0oO(assistLine, "assistLine");
        OooOOO0.OooO0oO(canvas, "canvas");
        if (AnchorAssistAware.INSTANCE.getEnableAssistLine()) {
            canvas.drawLine(assistLine.getA().getX().floatValue(), assistLine.getA().getY().floatValue(), assistLine.getB().getX().floatValue(), assistLine.getB().getY().floatValue(), getAssistLinePaint());
        }
    }

    public final void drawTypedRect(AnchorAssistAware<?, ?> assistAware, Canvas canvas) {
        OooOOO0.OooO0oO(assistAware, "assistAware");
        OooOOO0.OooO0oO(canvas, "canvas");
        if (AnchorAssistAware.INSTANCE.getEnableAssistLine()) {
            TypedRect<T> typedRect = assistAware.getTypedRect();
            canvas.drawRect(typedRect.getLeft().floatValue(), typedRect.getTop().floatValue(), typedRect.getRight().floatValue(), typedRect.getBottom().floatValue(), getAssistLinePaint());
        }
    }
}
