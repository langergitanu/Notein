package com.google.firebase.vertexai.type;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagePart;", "Lcom/google/firebase/vertexai/type/Part;", "image", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagePart implements Part {
    private final Bitmap image;

    public ImagePart(Bitmap image) {
        OooOOO0.OooO0oO(image, "image");
        this.image = image;
    }

    public final Bitmap getImage() {
        return this.image;
    }
}
