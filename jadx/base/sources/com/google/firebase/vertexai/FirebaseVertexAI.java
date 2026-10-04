package com.google.firebase.vertexai;

import com.aspose.slides.OooOOO;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.inject.Provider;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.GenerationConfig;
import com.google.firebase.vertexai.type.ImagenGenerationConfig;
import com.google.firebase.vertexai.type.ImagenSafetySettings;
import com.google.firebase.vertexai.type.InvalidLocationException;
import com.google.firebase.vertexai.type.RequestOptions;
import com.google.firebase.vertexai.type.SafetySetting;
import com.google.firebase.vertexai.type.Tool;
import com.google.firebase.vertexai.type.ToolConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJb\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J2\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m80612d2 = {"Lcom/google/firebase/vertexai/FirebaseVertexAI;", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "location", "", "appCheckProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "internalAuthProvider", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Lcom/google/firebase/inject/Provider;Lcom/google/firebase/inject/Provider;)V", "generativeModel", "Lcom/google/firebase/vertexai/GenerativeModel;", "modelName", "generationConfig", "Lcom/google/firebase/vertexai/type/GenerationConfig;", "safetySettings", "", "Lcom/google/firebase/vertexai/type/SafetySetting;", "tools", "Lcom/google/firebase/vertexai/type/Tool;", "toolConfig", "Lcom/google/firebase/vertexai/type/ToolConfig;", "systemInstruction", "Lcom/google/firebase/vertexai/type/Content;", "requestOptions", "Lcom/google/firebase/vertexai/type/RequestOptions;", "imagenModel", "Lcom/google/firebase/vertexai/ImagenModel;", "Lcom/google/firebase/vertexai/type/ImagenGenerationConfig;", "Lcom/google/firebase/vertexai/type/ImagenSafetySettings;", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FirebaseVertexAI {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InteropAppCheckTokenProvider> appCheckProvider;
    private final FirebaseApp firebaseApp;
    private final Provider<InternalAuthProvider> internalAuthProvider;
    private final String location;

    @Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/vertexai/FirebaseVertexAI$Companion;", "", "()V", "instance", "Lcom/google/firebase/vertexai/FirebaseVertexAI;", "getInstance$annotations", "getInstance", "()Lcom/google/firebase/vertexai/FirebaseVertexAI;", "app", "Lcom/google/firebase/FirebaseApp;", "location", "", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public static /* synthetic */ FirebaseVertexAI getInstance$default(Companion companion, FirebaseApp firebaseApp, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                firebaseApp = FirebaseKt.getApp(Firebase.INSTANCE);
            }
            return companion.getInstance(firebaseApp, str);
        }

        public final FirebaseVertexAI getInstance(String location) {
            OooOOO0.OooO0oO(location, "location");
            return getInstance$default(this, null, location, 1, null);
        }

        private Companion() {
        }

        public final FirebaseVertexAI getInstance() {
            return getInstance$default(this, null, "us-central1", 1, null);
        }

        public final FirebaseVertexAI getInstance(FirebaseApp app) {
            OooOOO0.OooO0oO(app, "app");
            return getInstance(app);
        }

        public final FirebaseVertexAI getInstance(FirebaseApp app, String location) {
            OooOOO0.OooO0oO(app, "app");
            OooOOO0.OooO0oO(location, "location");
            return ((FirebaseVertexAIMultiResourceComponent) app.get(FirebaseVertexAIMultiResourceComponent.class)).get(location);
        }
    }

    public FirebaseVertexAI(FirebaseApp firebaseApp, String location, Provider<InteropAppCheckTokenProvider> appCheckProvider, Provider<InternalAuthProvider> internalAuthProvider) {
        OooOOO0.OooO0oO(firebaseApp, "firebaseApp");
        OooOOO0.OooO0oO(location, "location");
        OooOOO0.OooO0oO(appCheckProvider, "appCheckProvider");
        OooOOO0.OooO0oO(internalAuthProvider, "internalAuthProvider");
        this.firebaseApp = firebaseApp;
        this.location = location;
        this.appCheckProvider = appCheckProvider;
        this.internalAuthProvider = internalAuthProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenerativeModel generativeModel$default(FirebaseVertexAI firebaseVertexAI, String str, GenerationConfig generationConfig, List list, List list2, ToolConfig toolConfig, Content content, RequestOptions requestOptions, int i, Object obj) {
        if ((i & 2) != 0) {
            generationConfig = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 16) != 0) {
            toolConfig = null;
        }
        if ((i & 32) != 0) {
            content = null;
        }
        if ((i & 64) != 0) {
            requestOptions = new RequestOptions(0L, 1, (C24018OooO0oo) null);
        }
        return firebaseVertexAI.generativeModel(str, generationConfig, list, list2, toolConfig, content, requestOptions);
    }

    public static final FirebaseVertexAI getInstance() {
        return INSTANCE.getInstance();
    }

    public static /* synthetic */ ImagenModel imagenModel$default(FirebaseVertexAI firebaseVertexAI, String str, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings, RequestOptions requestOptions, int i, Object obj) {
        if ((i & 2) != 0) {
            imagenGenerationConfig = null;
        }
        if ((i & 4) != 0) {
            imagenSafetySettings = null;
        }
        if ((i & 8) != 0) {
            requestOptions = new RequestOptions(0L, 1, (C24018OooO0oo) null);
        }
        return firebaseVertexAI.imagenModel(str, imagenGenerationConfig, imagenSafetySettings, requestOptions);
    }

    public final GenerativeModel generativeModel(String modelName) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return generativeModel$default(this, modelName, null, null, null, null, null, null, 126, null);
    }

    public final ImagenModel imagenModel(String modelName) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return imagenModel$default(this, modelName, null, null, null, 14, null);
    }

    public static final FirebaseVertexAI getInstance(FirebaseApp firebaseApp) {
        return INSTANCE.getInstance(firebaseApp);
    }

    public final GenerativeModel generativeModel(String modelName, GenerationConfig generationConfig) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return generativeModel$default(this, modelName, generationConfig, null, null, null, null, null, 124, null);
    }

    public final ImagenModel imagenModel(String modelName, ImagenGenerationConfig imagenGenerationConfig) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return imagenModel$default(this, modelName, imagenGenerationConfig, null, null, 12, null);
    }

    public static final FirebaseVertexAI getInstance(FirebaseApp firebaseApp, String str) {
        return INSTANCE.getInstance(firebaseApp, str);
    }

    public final GenerativeModel generativeModel(String modelName, GenerationConfig generationConfig, List<SafetySetting> list) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return generativeModel$default(this, modelName, generationConfig, list, null, null, null, null, 120, null);
    }

    public final ImagenModel imagenModel(String modelName, ImagenGenerationConfig imagenGenerationConfig, ImagenSafetySettings imagenSafetySettings) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return imagenModel$default(this, modelName, imagenGenerationConfig, imagenSafetySettings, null, 8, null);
    }

    public static final FirebaseVertexAI getInstance(String str) {
        return INSTANCE.getInstance(str);
    }

    public final GenerativeModel generativeModel(String modelName, GenerationConfig generationConfig, List<SafetySetting> list, List<Tool> list2) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return generativeModel$default(this, modelName, generationConfig, list, list2, null, null, null, 112, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImagenModel imagenModel(String modelName, ImagenGenerationConfig generationConfig, ImagenSafetySettings safetySettings, RequestOptions requestOptions) {
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
        if (C33599OooOo0O.Oooooo0(this.location).toString().length() != 0 && !C33599OooOo0O.OooOoOO(this.location, "/", false)) {
            StringBuilder sb = new StringBuilder("projects/");
            sb.append(this.firebaseApp.getOptions().getProjectId());
            sb.append("/locations/");
            String strOooO0O0 = OooOOO.OooO0O0(sb, this.location, "/publishers/google/models/", modelName);
            String apiKey = this.firebaseApp.getOptions().getApiKey();
            OooOOO0.OooO0o(apiKey, "firebaseApp.options.apiKey");
            return new ImagenModel(strOooO0O0, apiKey, generationConfig, safetySettings, requestOptions, this.appCheckProvider.get(), this.internalAuthProvider.get());
        }
        throw new InvalidLocationException(this.location, null, 2, 0 == true ? 1 : 0);
    }

    public final GenerativeModel generativeModel(String modelName, GenerationConfig generationConfig, List<SafetySetting> list, List<Tool> list2, ToolConfig toolConfig) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return generativeModel$default(this, modelName, generationConfig, list, list2, toolConfig, null, null, 96, null);
    }

    public final GenerativeModel generativeModel(String modelName, GenerationConfig generationConfig, List<SafetySetting> list, List<Tool> list2, ToolConfig toolConfig, Content content) {
        OooOOO0.OooO0oO(modelName, "modelName");
        return generativeModel$default(this, modelName, generationConfig, list, list2, toolConfig, content, null, 64, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GenerativeModel generativeModel(String modelName, GenerationConfig generationConfig, List<SafetySetting> safetySettings, List<Tool> tools, ToolConfig toolConfig, Content systemInstruction, RequestOptions requestOptions) {
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
        if (C33599OooOo0O.Oooooo0(this.location).toString().length() != 0 && !C33599OooOo0O.OooOoOO(this.location, "/", false)) {
            StringBuilder sb = new StringBuilder("projects/");
            sb.append(this.firebaseApp.getOptions().getProjectId());
            sb.append("/locations/");
            String strOooO0O0 = OooOOO.OooO0O0(sb, this.location, "/publishers/google/models/", modelName);
            String apiKey = this.firebaseApp.getOptions().getApiKey();
            OooOOO0.OooO0o(apiKey, "firebaseApp.options.apiKey");
            return new GenerativeModel(strOooO0O0, apiKey, generationConfig, safetySettings, tools, toolConfig, systemInstruction, requestOptions, this.appCheckProvider.get(), this.internalAuthProvider.get());
        }
        throw new InvalidLocationException(this.location, null, 2, 0 == true ? 1 : 0);
    }
}
