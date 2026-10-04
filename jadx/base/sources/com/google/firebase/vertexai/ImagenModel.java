package com.google.firebase.vertexai;

import com.facebook.soloader.OooOo;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.vertexai.common.APIController;
import com.google.firebase.vertexai.common.AppCheckHeaderProvider;
import com.google.firebase.vertexai.common.GenerateImageRequest;
import com.google.firebase.vertexai.type.FirebaseVertexAIException;
import com.google.firebase.vertexai.type.ImagenAspectRatio;
import com.google.firebase.vertexai.type.ImagenGenerationConfig;
import com.google.firebase.vertexai.type.ImagenGenerationResponse;
import com.google.firebase.vertexai.type.ImagenImageFormat;
import com.google.firebase.vertexai.type.ImagenInlineImage;
import com.google.firebase.vertexai.type.ImagenPersonFilterLevel;
import com.google.firebase.vertexai.type.ImagenSafetyFilterLevel;
import com.google.firebase.vertexai.type.ImagenSafetySettings;
import com.google.firebase.vertexai.type.RequestOptions;
import com.huawei.hms.network.inner.api.NetworkService;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32431OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBQ\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0002J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m80612d2 = {"Lcom/google/firebase/vertexai/ImagenModel;", "", "modelName", "", "apiKey", "generationConfig", "Lcom/google/firebase/vertexai/type/ImagenGenerationConfig;", "safetySettings", "Lcom/google/firebase/vertexai/type/ImagenSafetySettings;", "requestOptions", "Lcom/google/firebase/vertexai/type/RequestOptions;", "appCheckTokenProvider", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "internalAuthProvider", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/ImagenGenerationConfig;Lcom/google/firebase/vertexai/type/ImagenSafetySettings;Lcom/google/firebase/vertexai/type/RequestOptions;Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;Lcom/google/firebase/auth/internal/InternalAuthProvider;)V", "controller", "Lcom/google/firebase/vertexai/common/APIController;", "(Ljava/lang/String;Lcom/google/firebase/vertexai/type/ImagenGenerationConfig;Lcom/google/firebase/vertexai/type/ImagenSafetySettings;Lcom/google/firebase/vertexai/common/APIController;)V", "constructRequest", "Lcom/google/firebase/vertexai/common/GenerateImageRequest;", AuthenticationConstants.AAD.QUERY_PROMPT, "gcsUri", NetworkService.Constants.CONFIG_SERVICE, "generateImages", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse;", "Lcom/google/firebase/vertexai/type/ImagenInlineImage;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenModel {
    public static final String DEFAULT_FILTERED_ERROR = "Unable to show generated images. All images were filtered out because they violated Vertex AI's usage guidelines. You will not be charged for blocked images. Try rephrasing the prompt. If you think this was an error, send feedback.";
    private final APIController controller;
    private final ImagenGenerationConfig generationConfig;
    private final String modelName;
    private final ImagenSafetySettings safetySettings;
    private static final String TAG = "ImagenModel";

    /* JADX INFO: renamed from: com.google.firebase.vertexai.ImagenModel$generateImages$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.ImagenModel", m80623f = "ImagenModel.kt", m80624l = {75}, m80625m = "generateImages")
    public static final class C172331 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C172331(Continuation<? super C172331> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImagenModel.this.generateImages(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImagenModel(String modelName, String apiKey) {
        this(modelName, apiKey, null, null, null, null, null, 124, null);
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
    }

    private final GenerateImageRequest constructRequest(String prompt, String gcsUri, ImagenGenerationConfig config) {
        ImagenImageFormat imageFormat;
        ImagenAspectRatio aspectRatio;
        ImagenSafetyFilterLevel safetyFilterLevel;
        ImagenPersonFilterLevel personFilterLevel;
        Integer numberOfImages;
        List listOooO0oO = OooOo.OooO0oO(new GenerateImageRequest.ImagenPrompt(prompt));
        int iIntValue = (config == null || (numberOfImages = config.getNumberOfImages()) == null) ? 1 : numberOfImages.intValue();
        ImagenGenerationConfig imagenGenerationConfig = this.generationConfig;
        ImagenImageFormat.Internal internal$com_google_firebase_firebase_vertexai = null;
        Boolean addWatermark = imagenGenerationConfig != null ? imagenGenerationConfig.getAddWatermark() : null;
        ImagenSafetySettings imagenSafetySettings = this.safetySettings;
        String internalVal = (imagenSafetySettings == null || (personFilterLevel = imagenSafetySettings.getPersonFilterLevel()) == null) ? null : personFilterLevel.getInternalVal();
        String negativePrompt = config != null ? config.getNegativePrompt() : null;
        ImagenSafetySettings imagenSafetySettings2 = this.safetySettings;
        String internalVal2 = (imagenSafetySettings2 == null || (safetyFilterLevel = imagenSafetySettings2.getSafetyFilterLevel()) == null) ? null : safetyFilterLevel.getInternalVal();
        String internalVal3 = (config == null || (aspectRatio = config.getAspectRatio()) == null) ? null : aspectRatio.getInternalVal();
        ImagenGenerationConfig imagenGenerationConfig2 = this.generationConfig;
        if (imagenGenerationConfig2 != null && (imageFormat = imagenGenerationConfig2.getImageFormat()) != null) {
            internal$com_google_firebase_firebase_vertexai = imageFormat.toInternal$com_google_firebase_firebase_vertexai();
        }
        return new GenerateImageRequest(listOooO0oO, new GenerateImageRequest.ImagenParameters(iIntValue, true, gcsUri, negativePrompt, internalVal3, internalVal2, internalVal, addWatermark, internal$com_google_firebase_firebase_vertexai));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateImages(String str, Continuation<? super ImagenGenerationResponse<ImagenInlineImage>> continuation) {
        C172331 c172331;
        if (continuation instanceof C172331) {
            c172331 = (C172331) continuation;
            int i = c172331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172331.label = i - Integer.MIN_VALUE;
            } else {
                c172331 = new C172331(continuation);
            }
        }
        Object objGenerateImage = c172331.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172331.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objGenerateImage);
                APIController aPIController = this.controller;
                GenerateImageRequest generateImageRequestConstructRequest = constructRequest(str, null, this.generationConfig);
                c172331.label = 1;
                objGenerateImage = aPIController.generateImage(generateImageRequestConstructRequest, c172331);
                if (objGenerateImage == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objGenerateImage);
            }
            return ImagenModelKt.validate((ImagenGenerationResponse.Internal) objGenerateImage).toPublicInline$com_google_firebase_firebase_vertexai();
        } catch (Throwable th) {
            throw FirebaseVertexAIException.INSTANCE.from$com_google_firebase_firebase_vertexai(th);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImagenModel(String modelName, String apiKey, ImagenGenerationConfig imagenGenerationConfig) {
        this(modelName, apiKey, imagenGenerationConfig, null, null, null, null, 120, null);
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImagenModel(String modelName, String apiKey, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings) {
        this(modelName, apiKey, imagenGenerationConfig, imagenSafetySettings, null, null, null, 112, null);
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImagenModel(String modelName, String apiKey, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, RequestOptions requestOptions) {
        this(modelName, apiKey, imagenGenerationConfig, imagenSafetySettings, requestOptions, null, null, 96, null);
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImagenModel(String modelName, String apiKey, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, RequestOptions requestOptions, InteropAppCheckTokenProvider interopAppCheckTokenProvider) {
        this(modelName, apiKey, imagenGenerationConfig, imagenSafetySettings, requestOptions, interopAppCheckTokenProvider, null, 64, null);
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
    }

    public ImagenModel(String modelName, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, APIController controller) {
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(controller, "controller");
        this.modelName = modelName;
        this.generationConfig = imagenGenerationConfig;
        this.safetySettings = imagenSafetySettings;
        this.controller = controller;
    }

    public /* synthetic */ ImagenModel(String str, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, APIController aPIController, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : imagenGenerationConfig, (i & 4) != 0 ? null : imagenSafetySettings, aPIController);
    }

    public /* synthetic */ ImagenModel(String str, String str2, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, RequestOptions requestOptions, InteropAppCheckTokenProvider interopAppCheckTokenProvider, InternalAuthProvider internalAuthProvider, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, (i & 4) != 0 ? null : imagenGenerationConfig, (i & 8) != 0 ? null : imagenSafetySettings, (i & 16) != 0 ? new RequestOptions(0L, 1, (C24018OooO0oo) null) : requestOptions, (i & 32) != 0 ? null : interopAppCheckTokenProvider, (i & 64) != 0 ? null : internalAuthProvider);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagenModel(String modelName, String apiKey, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, RequestOptions requestOptions, InteropAppCheckTokenProvider interopAppCheckTokenProvider, InternalAuthProvider internalAuthProvider) {
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
        String str = "gl-kotlin/" + C32431OooO.f116622OooOoOO + " fire/16.2.0";
        String TAG2 = TAG;
        OooOOO0.OooO0o(TAG2, "TAG");
        this(modelName, imagenGenerationConfig, imagenSafetySettings, new APIController(apiKey, modelName, requestOptions, str, new AppCheckHeaderProvider(TAG2, interopAppCheckTokenProvider, internalAuthProvider)));
    }
}
