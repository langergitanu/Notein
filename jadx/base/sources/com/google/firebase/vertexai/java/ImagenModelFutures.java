package com.google.firebase.vertexai.java;

import androidx.concurrent.futures.OooOO0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import com.google.firebase.vertexai.ImagenModel;
import com.google.firebase.vertexai.type.ImagenGenerationResponse;
import com.google.firebase.vertexai.type.ImagenInlineImage;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/ImagenModelFutures;", "", "()V", "generateImages", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "Lcom/google/firebase/vertexai/type/ImagenInlineImage;", AuthenticationConstants.AAD.QUERY_PROMPT, "", "getImageModel", "Lcom/google/firebase/vertexai/ImagenModel;", "Companion", "FuturesImpl", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class ImagenModelFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/ImagenModelFutures$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/google/firebase/vertexai/java/ImagenModelFutures;", "model", "Lcom/google/firebase/vertexai/ImagenModel;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final ImagenModelFutures from(ImagenModel model) {
            OooOOO0.OooO0oO(model, "model");
            return new FuturesImpl(model);
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/vertexai/java/ImagenModelFutures$FuturesImpl;", "Lcom/google/firebase/vertexai/java/ImagenModelFutures;", "model", "Lcom/google/firebase/vertexai/ImagenModel;", "(Lcom/google/firebase/vertexai/ImagenModel;)V", "generateImages", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "Lcom/google/firebase/vertexai/type/ImagenInlineImage;", AuthenticationConstants.AAD.QUERY_PROMPT, "", "getImageModel", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class FuturesImpl extends ImagenModelFutures {
        private final ImagenModel model;

        public FuturesImpl(ImagenModel model) {
            OooOOO0.OooO0oO(model, "model");
            this.model = model;
        }

        @Override // com.google.firebase.vertexai.java.ImagenModelFutures
        public ListenableFuture<ImagenGenerationResponse<ImagenInlineImage>> generateImages(String prompt) {
            OooOOO0.OooO0oO(prompt, "prompt");
            OooOO0.OooO0O0 oooO0O0 = OooOO0.f63608OooO00o;
            return OooOO0.OooO00o(new ImagenModelFutures$FuturesImpl$generateImages$1(this, prompt, null));
        }

        @Override // com.google.firebase.vertexai.java.ImagenModelFutures
        /* JADX INFO: renamed from: getImageModel, reason: from getter */
        public ImagenModel getModel() {
            return this.model;
        }
    }

    public static final ImagenModelFutures from(ImagenModel imagenModel) {
        return INSTANCE.from(imagenModel);
    }

    public abstract ListenableFuture<ImagenGenerationResponse<ImagenInlineImage>> generateImages(String prompt);

    /* JADX INFO: renamed from: getImageModel */
    public abstract ImagenModel getModel();
}
