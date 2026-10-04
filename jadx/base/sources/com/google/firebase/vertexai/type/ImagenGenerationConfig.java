package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aBA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationConfig;", "", "negativePrompt", "", "numberOfImages", "", "aspectRatio", "Lcom/google/firebase/vertexai/type/ImagenAspectRatio;", "imageFormat", "Lcom/google/firebase/vertexai/type/ImagenImageFormat;", "addWatermark", "", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/google/firebase/vertexai/type/ImagenAspectRatio;Lcom/google/firebase/vertexai/type/ImagenImageFormat;Ljava/lang/Boolean;)V", "getAddWatermark", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAspectRatio", "()Lcom/google/firebase/vertexai/type/ImagenAspectRatio;", "getImageFormat", "()Lcom/google/firebase/vertexai/type/ImagenImageFormat;", "getNegativePrompt", "()Ljava/lang/String;", "getNumberOfImages", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Builder", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenGenerationConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean addWatermark;
    private final ImagenAspectRatio aspectRatio;
    private final ImagenImageFormat imageFormat;
    private final String negativePrompt;
    private final Integer numberOfImages;

    @Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0016"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationConfig$Builder;", "", "()V", "addWatermark", "", "Ljava/lang/Boolean;", "aspectRatio", "Lcom/google/firebase/vertexai/type/ImagenAspectRatio;", "imageFormat", "Lcom/google/firebase/vertexai/type/ImagenImageFormat;", "negativePrompt", "", "numberOfImages", "", "Ljava/lang/Integer;", "build", "Lcom/google/firebase/vertexai/type/ImagenGenerationConfig;", "setAddWatermark", "setAspectRatio", "setImageFormat", "setNegativePrompt", "setNumberOfImages", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Builder {
        public Boolean addWatermark;
        public ImagenAspectRatio aspectRatio;
        public ImagenImageFormat imageFormat;
        public String negativePrompt;
        public Integer numberOfImages = 1;

        public final ImagenGenerationConfig build() {
            return new ImagenGenerationConfig(this.negativePrompt, this.numberOfImages, this.aspectRatio, this.imageFormat, this.addWatermark);
        }

        public final Builder setAddWatermark(boolean addWatermark) {
            this.addWatermark = Boolean.valueOf(addWatermark);
            return this;
        }

        public final Builder setAspectRatio(ImagenAspectRatio aspectRatio) {
            OooOOO0.OooO0oO(aspectRatio, "aspectRatio");
            this.aspectRatio = aspectRatio;
            return this;
        }

        public final Builder setImageFormat(ImagenImageFormat imageFormat) {
            OooOOO0.OooO0oO(imageFormat, "imageFormat");
            this.imageFormat = imageFormat;
            return this;
        }

        public final Builder setNegativePrompt(String negativePrompt) {
            OooOOO0.OooO0oO(negativePrompt, "negativePrompt");
            this.negativePrompt = negativePrompt;
            return this;
        }

        public final Builder setNumberOfImages(int numberOfImages) {
            this.numberOfImages = Integer.valueOf(numberOfImages);
            return this;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGenerationConfig$Companion;", "", "()V", "builder", "Lcom/google/firebase/vertexai/type/ImagenGenerationConfig$Builder;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ImagenGenerationConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public final Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public final ImagenAspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    public final ImagenImageFormat getImageFormat() {
        return this.imageFormat;
    }

    public final String getNegativePrompt() {
        return this.negativePrompt;
    }

    public final Integer getNumberOfImages() {
        return this.numberOfImages;
    }

    public ImagenGenerationConfig(String str, Integer num, ImagenAspectRatio imagenAspectRatio, ImagenImageFormat imagenImageFormat, Boolean bool) {
        this.negativePrompt = str;
        this.numberOfImages = num;
        this.aspectRatio = imagenAspectRatio;
        this.imageFormat = imagenImageFormat;
        this.addWatermark = bool;
    }

    public /* synthetic */ ImagenGenerationConfig(String str, Integer num, ImagenAspectRatio imagenAspectRatio, ImagenImageFormat imagenImageFormat, Boolean bool, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 1 : num, (i & 4) != 0 ? null : imagenAspectRatio, (i & 8) != 0 ? null : imagenImageFormat, (i & 16) != 0 ? null : bool);
    }
}
