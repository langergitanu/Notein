package com.google.firebase.vertexai;

import android.graphics.Bitmap;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.vertexai.common.APIController;
import com.google.firebase.vertexai.common.AppCheckHeaderProvider;
import com.google.firebase.vertexai.common.CountTokensRequest;
import com.google.firebase.vertexai.common.GenerateContentRequest;
import com.google.firebase.vertexai.type.Candidate;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.ContentKt;
import com.google.firebase.vertexai.type.CountTokensResponse;
import com.google.firebase.vertexai.type.FinishReason;
import com.google.firebase.vertexai.type.FirebaseVertexAIException;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.firebase.vertexai.type.GenerationConfig;
import com.google.firebase.vertexai.type.PromptBlockedException;
import com.google.firebase.vertexai.type.PromptFeedback;
import com.google.firebase.vertexai.type.RequestOptions;
import com.google.firebase.vertexai.type.ResponseStoppedException;
import com.google.firebase.vertexai.type.SafetySetting;
import com.google.firebase.vertexai.type.SerializationException;
import com.google.firebase.vertexai.type.Tool;
import com.google.firebase.vertexai.type.ToolConfig;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32431OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33736OooOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\u00020\u0001:\u0001<Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0011\u0010\u001aJ#\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001b\"\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020 2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001b\"\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020#H\u0002¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020#2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001b\"\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J'\u0010)\u001a\b\u0012\u0004\u0012\u00020#0(2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001b\"\u00020\r¢\u0006\u0004\b)\u0010*J\u001b\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010+J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020#0(2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b)\u0010,J\u001b\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020-H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010.J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020#0(2\u0006\u0010\u001c\u001a\u00020-¢\u0006\u0004\b)\u0010/J\u001d\u00102\u001a\u0002012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b2\u00103J'\u00105\u001a\u0002042\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001b\"\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010'J\u001b\u00105\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010+J\u001b\u00105\u001a\u0002042\u0006\u0010\u001c\u001a\u00020-H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, m80612d2 = {"Lcom/google/firebase/vertexai/GenerativeModel;", "", "", "modelName", "Lcom/google/firebase/vertexai/type/GenerationConfig;", "generationConfig", "", "Lcom/google/firebase/vertexai/type/SafetySetting;", "safetySettings", "Lcom/google/firebase/vertexai/type/Tool;", "tools", "Lcom/google/firebase/vertexai/type/ToolConfig;", "toolConfig", "Lcom/google/firebase/vertexai/type/Content;", "systemInstruction", "Lcom/google/firebase/vertexai/common/APIController;", "controller", "<init>", "(Ljava/lang/String;Lcom/google/firebase/vertexai/type/GenerationConfig;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/ToolConfig;Lcom/google/firebase/vertexai/type/Content;Lcom/google/firebase/vertexai/common/APIController;)V", "apiKey", "Lcom/google/firebase/vertexai/type/RequestOptions;", "requestOptions", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "appCheckTokenProvider", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "internalAuthProvider", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/GenerationConfig;Ljava/util/List;Ljava/util/List;Lcom/google/firebase/vertexai/type/ToolConfig;Lcom/google/firebase/vertexai/type/Content;Lcom/google/firebase/vertexai/type/RequestOptions;Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;Lcom/google/firebase/auth/internal/InternalAuthProvider;)V", "", AuthenticationConstants.AAD.QUERY_PROMPT, "Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "constructRequest", "([Lcom/google/firebase/vertexai/type/Content;)Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "Lcom/google/firebase/vertexai/common/CountTokensRequest;", "constructCountTokensRequest", "([Lcom/google/firebase/vertexai/type/Content;)Lcom/google/firebase/vertexai/common/CountTokensRequest;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "validate", "(Lcom/google/firebase/vertexai/type/GenerateContentResponse;)Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "generateContent", "([Lcom/google/firebase/vertexai/type/Content;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoO0o0Oo/OooO0o;", "generateContentStream", "([Lcom/google/firebase/vertexai/type/Content;)LoO0o0Oo/OooO0o;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;)LoO0o0Oo/OooO0o;", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/graphics/Bitmap;)LoO0o0Oo/OooO0o;", "history", "Lcom/google/firebase/vertexai/Chat;", "startChat", "(Ljava/util/List;)Lcom/google/firebase/vertexai/Chat;", "Lcom/google/firebase/vertexai/type/CountTokensResponse;", "countTokens", "Ljava/lang/String;", "Lcom/google/firebase/vertexai/type/GenerationConfig;", "Ljava/util/List;", "Lcom/google/firebase/vertexai/type/ToolConfig;", "Lcom/google/firebase/vertexai/type/Content;", "Lcom/google/firebase/vertexai/common/APIController;", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerativeModel {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "GenerativeModel";
    private final APIController controller;
    private final GenerationConfig generationConfig;
    private final String modelName;
    private final List<SafetySetting> safetySettings;
    private final Content systemInstruction;
    private final ToolConfig toolConfig;
    private final List<Tool> tools;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/vertexai/GenerativeModel$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$countTokens$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.GenerativeModel", m80623f = "GenerativeModel.kt", m80624l = {172}, m80625m = "countTokens")
    public static final class C172231 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C172231(Continuation<? super C172231> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GenerativeModel.this.countTokens((Content[]) null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$countTokens$3 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172243 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
        final /* synthetic */ String $prompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172243(String str) {
            super(1);
            this.$prompt = str;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
            invoke2(builder);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Content.Builder content) {
            OooOOO0.OooO0oO(content, "$this$content");
            content.addText(this.$prompt);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$countTokens$5 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172255 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
        final /* synthetic */ Bitmap $prompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172255(Bitmap bitmap) {
            super(1);
            this.$prompt = bitmap;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
            invoke2(builder);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Content.Builder content) {
            OooOOO0.OooO0oO(content, "$this$content");
            content.addImage(this.$prompt);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContent$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.GenerativeModel", m80623f = "GenerativeModel.kt", m80624l = {95}, m80625m = "generateContent")
    public static final class C172261 extends AbstractC32479OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C172261(Continuation<? super C172261> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GenerativeModel.this.generateContent((Content[]) null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContent$3 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172273 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
        final /* synthetic */ String $prompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172273(String str) {
            super(1);
            this.$prompt = str;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
            invoke2(builder);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Content.Builder content) {
            OooOOO0.OooO0oO(content, "$this$content");
            content.addText(this.$prompt);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContent$5 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172285 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
        final /* synthetic */ Bitmap $prompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172285(Bitmap bitmap) {
            super(1);
            this.$prompt = bitmap;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
            invoke2(builder);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Content.Builder content) {
            OooOOO0.OooO0oO(content, "$this$content");
            content.addImage(this.$prompt);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContentStream$1 */
    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;Ljava/lang/Throwable;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.GenerativeModel$generateContentStream$1", m80623f = "GenerativeModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C172301 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super GenerateContentResponse.Internal>, Throwable, Continuation<? super C32460OooOooO>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C172301(Continuation<? super C172301> continuation) {
            super(3, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            throw FirebaseVertexAIException.INSTANCE.from$com_google_firebase_firebase_vertexai((Throwable) this.L$0);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super GenerateContentResponse.Internal> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
            C172301 c172301 = new C172301(continuation);
            c172301.L$0 = th;
            return c172301.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContentStream$3 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172313 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
        final /* synthetic */ String $prompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172313(String str) {
            super(1);
            this.$prompt = str;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
            invoke2(builder);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Content.Builder content) {
            OooOOO0.OooO0oO(content, "$this$content");
            content.addText(this.$prompt);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContentStream$4 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172324 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
        final /* synthetic */ Bitmap $prompt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172324(Bitmap bitmap) {
            super(1);
            this.$prompt = bitmap;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
            invoke2(builder);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Content.Builder content) {
            OooOOO0.OooO0oO(content, "$this$content");
            content.addImage(this.$prompt);
        }
    }

    public GenerativeModel(String modelName, GenerationConfig generationConfig, List<SafetySetting> list, List<Tool> list2, ToolConfig toolConfig, Content content, APIController controller) {
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(controller, "controller");
        this.modelName = modelName;
        this.generationConfig = generationConfig;
        this.safetySettings = list;
        this.tools = list2;
        this.toolConfig = toolConfig;
        this.systemInstruction = content;
        this.controller = controller;
    }

    private final CountTokensRequest constructCountTokensRequest(Content... prompt) {
        return CountTokensRequest.INSTANCE.forVertexAI(constructRequest((Content[]) Arrays.copyOf(prompt, prompt.length)));
    }

    private final GenerateContentRequest constructRequest(Content... prompt) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Content contentCopy$default;
        String str = this.modelName;
        ArrayList arrayList3 = new ArrayList(prompt.length);
        for (Content content : prompt) {
            arrayList3.add(content.toInternal$com_google_firebase_firebase_vertexai());
        }
        List<SafetySetting> list = this.safetySettings;
        Content.Internal internal$com_google_firebase_firebase_vertexai = null;
        if (list != null) {
            List<SafetySetting> list2 = list;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SafetySetting) it.next()).toInternal$com_google_firebase_firebase_vertexai());
            }
        } else {
            arrayList = null;
        }
        GenerationConfig generationConfig = this.generationConfig;
        GenerationConfig.Internal internal$com_google_firebase_firebase_vertexai2 = generationConfig != null ? generationConfig.toInternal$com_google_firebase_firebase_vertexai() : null;
        List<Tool> list3 = this.tools;
        if (list3 != null) {
            List<Tool> list4 = list3;
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Tool) it2.next()).toInternal$com_google_firebase_firebase_vertexai());
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        ToolConfig toolConfig = this.toolConfig;
        ToolConfig.Internal internal$com_google_firebase_firebase_vertexai3 = toolConfig != null ? toolConfig.toInternal$com_google_firebase_firebase_vertexai() : null;
        Content content2 = this.systemInstruction;
        if (content2 != null && (contentCopy$default = Content.copy$default(content2, "system", null, 2, null)) != null) {
            internal$com_google_firebase_firebase_vertexai = contentCopy$default.toInternal$com_google_firebase_firebase_vertexai();
        }
        return new GenerateContentRequest(str, arrayList3, arrayList, internal$com_google_firebase_firebase_vertexai2, arrayList2, internal$com_google_firebase_firebase_vertexai3, internal$com_google_firebase_firebase_vertexai);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Chat startChat$default(GenerativeModel generativeModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = C34434OooOoO.f123453OooOo0o;
        }
        return generativeModel.startChat(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final GenerateContentResponse validate(GenerateContentResponse generateContentResponse) {
        Object next;
        int i = 2;
        Throwable th = null;
        Object[] objArr = 0;
        if (generateContentResponse.getCandidates().isEmpty() && generateContentResponse.getPromptFeedback() == null) {
            throw new SerializationException("Error deserializing response, found no valid fields", null, 2, null);
        }
        PromptFeedback promptFeedback = generateContentResponse.getPromptFeedback();
        if (promptFeedback != null && promptFeedback.getBlockReason() != null) {
            throw new PromptBlockedException(generateContentResponse, null, null, 6, null);
        }
        List<Candidate> candidates = generateContentResponse.getCandidates();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = candidates.iterator();
        while (it.hasNext()) {
            FinishReason finishReason = ((Candidate) it.next()).getFinishReason();
            if (finishReason != null) {
                arrayList.add(finishReason);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!OooOOO0.OooO0O0((FinishReason) next, FinishReason.STOP)) {
                break;
            }
        }
        if (((FinishReason) next) == null) {
            return generateContentResponse;
        }
        throw new ResponseStoppedException(generateContentResponse, th, i, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object countTokens(Content[] contentArr, Continuation<? super CountTokensResponse> continuation) {
        C172231 c172231;
        if (continuation instanceof C172231) {
            c172231 = (C172231) continuation;
            int i = c172231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172231.label = i - Integer.MIN_VALUE;
            } else {
                c172231 = new C172231(continuation);
            }
        }
        Object objCountTokens = c172231.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172231.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objCountTokens);
                APIController aPIController = this.controller;
                CountTokensRequest countTokensRequestConstructCountTokensRequest = constructCountTokensRequest((Content[]) Arrays.copyOf(contentArr, contentArr.length));
                c172231.label = 1;
                objCountTokens = aPIController.countTokens(countTokensRequestConstructCountTokensRequest, c172231);
                if (objCountTokens == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objCountTokens);
            }
            return ((CountTokensResponse.Internal) objCountTokens).toPublic$com_google_firebase_firebase_vertexai();
        } catch (Throwable th) {
            throw FirebaseVertexAIException.INSTANCE.from$com_google_firebase_firebase_vertexai(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateContent(Content[] contentArr, Continuation<? super GenerateContentResponse> continuation) {
        C172261 c172261;
        GenerativeModel generativeModel;
        if (continuation instanceof C172261) {
            c172261 = (C172261) continuation;
            int i = c172261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172261.label = i - Integer.MIN_VALUE;
            } else {
                c172261 = new C172261(continuation);
            }
        }
        Object objGenerateContent = c172261.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172261.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objGenerateContent);
                APIController aPIController = this.controller;
                GenerateContentRequest generateContentRequestConstructRequest = constructRequest((Content[]) Arrays.copyOf(contentArr, contentArr.length));
                c172261.L$0 = this;
                c172261.label = 1;
                objGenerateContent = aPIController.generateContent(generateContentRequestConstructRequest, c172261);
                if (objGenerateContent == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                generativeModel = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                generativeModel = (GenerativeModel) c172261.L$0;
                C32446OooOOOo.OooO0O0(objGenerateContent);
            }
            return generativeModel.validate(((GenerateContentResponse.Internal) objGenerateContent).toPublic$com_google_firebase_firebase_vertexai());
        } catch (Throwable th) {
            throw FirebaseVertexAIException.INSTANCE.from$com_google_firebase_firebase_vertexai(th);
        }
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse> generateContentStream(Content... prompt) {
        OooOOO0.OooO0oO(prompt, "prompt");
        final C33736OooOo0 c33736OooOo0 = new C33736OooOo0(this.controller.generateContentStream(constructRequest((Content[]) Arrays.copyOf(prompt, prompt.length))), new C172301(null));
        return new InterfaceC33721OooO0o<GenerateContentResponse>() { // from class: com.google.firebase.vertexai.GenerativeModel$generateContentStream$$inlined$map$1

            /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContentStream$$inlined$map$1$2 */
            @Metadata(m80611d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"T", "R", "value", "LoO00ooO/OooOooO;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
            public static final class C172292<T> implements InterfaceC33723OooO0oO {
                final /* synthetic */ InterfaceC33723OooO0oO $this_unsafeFlow;
                final /* synthetic */ GenerativeModel this$0;

                /* JADX INFO: renamed from: com.google.firebase.vertexai.GenerativeModel$generateContentStream$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
                @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.GenerativeModel$generateContentStream$$inlined$map$1$2", m80623f = "GenerativeModel.kt", m80624l = {223}, m80625m = "emit")
                public static final class AnonymousClass1 extends AbstractC32479OooO0OO {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C172292.this.emit(null, this);
                    }
                }

                public C172292(InterfaceC33723OooO0oO interfaceC33723OooO0oO, GenerativeModel generativeModel) {
                    this.$this_unsafeFlow = interfaceC33723OooO0oO;
                    this.this$0 = generativeModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C32446OooOOOo.OooO0O0(obj2);
                        InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.$this_unsafeFlow;
                        GenerateContentResponse generateContentResponseValidate = this.this$0.validate(((GenerateContentResponse.Internal) obj).toPublic$com_google_firebase_firebase_vertexai());
                        anonymousClass1.label = 1;
                        if (interfaceC33723OooO0oO.emit(generateContentResponseValidate, anonymousClass1) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            @Override // oO0o0Oo.InterfaceC33721OooO0o
            public Object collect(InterfaceC33723OooO0oO<? super GenerateContentResponse> interfaceC33723OooO0oO, Continuation continuation) {
                Object objCollect = c33736OooOo0.collect(new C172292(interfaceC33723OooO0oO, this), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            }
        };
    }

    public final Chat startChat(List<Content> history) {
        OooOOO0.OooO0oO(history, "history");
        return new Chat(this, OooOo.o0ooOoO(history));
    }

    public final Object countTokens(String str, Continuation<? super CountTokensResponse> continuation) {
        return countTokens(new Content[]{ContentKt.content$default(null, new C172243(str), 1, null)}, continuation);
    }

    public final Object generateContent(String str, Continuation<? super GenerateContentResponse> continuation) {
        return generateContent(new Content[]{ContentKt.content$default(null, new C172273(str), 1, null)}, continuation);
    }

    public final Object countTokens(Bitmap bitmap, Continuation<? super CountTokensResponse> continuation) {
        return countTokens(new Content[]{ContentKt.content$default(null, new C172255(bitmap), 1, null)}, continuation);
    }

    public final Object generateContent(Bitmap bitmap, Continuation<? super GenerateContentResponse> continuation) {
        return generateContent(new Content[]{ContentKt.content$default(null, new C172285(bitmap), 1, null)}, continuation);
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse> generateContentStream(String prompt) {
        OooOOO0.OooO0oO(prompt, "prompt");
        return generateContentStream(ContentKt.content$default(null, new C172313(prompt), 1, null));
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse> generateContentStream(Bitmap prompt) {
        OooOOO0.OooO0oO(prompt, "prompt");
        return generateContentStream(ContentKt.content$default(null, new C172324(prompt), 1, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GenerativeModel(String str, GenerationConfig generationConfig, List list, List list2, ToolConfig toolConfig, Content content, APIController aPIController, int i, C24018OooO0oo c24018OooO0oo) {
        APIController aPIController2;
        Content content2;
        generationConfig = (i & 2) != 0 ? null : generationConfig;
        list = (i & 4) != 0 ? null : list;
        list2 = (i & 8) != 0 ? null : list2;
        toolConfig = (i & 16) != 0 ? null : toolConfig;
        if ((i & 32) != 0) {
            aPIController2 = aPIController;
            content2 = null;
        } else {
            aPIController2 = aPIController;
            content2 = content;
        }
        this(str, generationConfig, list, list2, toolConfig, content2, aPIController2);
    }

    public /* synthetic */ GenerativeModel(String str, String str2, GenerationConfig generationConfig, List list, List list2, ToolConfig toolConfig, Content content, RequestOptions requestOptions, InteropAppCheckTokenProvider interopAppCheckTokenProvider, InternalAuthProvider internalAuthProvider, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, (i & 4) != 0 ? null : generationConfig, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : toolConfig, (i & 64) != 0 ? null : content, (i & 128) != 0 ? new RequestOptions(0L, 1, (C24018OooO0oo) null) : requestOptions, (i & 256) != 0 ? null : interopAppCheckTokenProvider, (i & 512) != 0 ? null : internalAuthProvider);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GenerativeModel(String modelName, String apiKey, GenerationConfig generationConfig, List<SafetySetting> list, List<Tool> list2, ToolConfig toolConfig, Content content, RequestOptions requestOptions, InteropAppCheckTokenProvider interopAppCheckTokenProvider, InternalAuthProvider internalAuthProvider) {
        OooOOO0.OooO0oO(modelName, "modelName");
        OooOOO0.OooO0oO(apiKey, "apiKey");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
        String str = "gl-kotlin/" + C32431OooO.f116622OooOoOO + " fire/16.2.0";
        String TAG2 = TAG;
        OooOOO0.OooO0o(TAG2, "TAG");
        this(modelName, generationConfig, list, list2, toolConfig, content, new APIController(apiKey, modelName, requestOptions, str, new AppCheckHeaderProvider(TAG2, interopAppCheckTokenProvider, internalAuthProvider)));
    }
}
