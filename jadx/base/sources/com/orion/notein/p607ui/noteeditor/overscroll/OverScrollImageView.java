package com.orion.notein.p607ui.noteeditor.overscroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/overscroll/OverScrollImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", NotificationCompat.CATEGORY_PROGRESS, "LoO00ooO/OooOooO;", "setProgress", "(F)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OverScrollImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f74735OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO0.OooO0oO(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_ni_editor_add_page_indicator);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, getWidth(), getHeight());
        canvas.save();
        RectF rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = getHeight() - (getHeight() * this.f74735OooOo0o);
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        canvas.clipRect(rectF);
        drawable.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(getContext(), R.color.add_page_indicator_progress_reverse_color), BlendModeCompat.SRC_IN));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void setProgress(float progress) {
        this.f74735OooOo0o = progress;
        invalidate();
    }
}
