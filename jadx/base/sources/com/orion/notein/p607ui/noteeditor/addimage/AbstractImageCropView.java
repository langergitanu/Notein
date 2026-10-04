package com.orion.notein.p607ui.noteeditor.addimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addimage/AbstractImageCropView;", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "getCroppedImage", "()Landroid/graphics/Bitmap;", "Landroid/graphics/RectF;", "getCroppedBounds", "()Landroid/graphics/RectF;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractImageCropView extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
    }

    public abstract void OooO00o(Bitmap bitmap, RectF rectF, int i, int i2);

    public abstract RectF getCroppedBounds();

    public abstract Bitmap getCroppedImage();
}
