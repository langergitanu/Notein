package com.google.firebase.vertexai.common;

import Oooo0oO.C21091o0000o;
import OooooOO.C21355Ooooooo;
import android.util.Log;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.vertexai.common.util.UtilKt;
import com.google.firebase.vertexai.type.CountTokensResponse;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.firebase.vertexai.type.ImagenGenerationResponse;
import com.google.firebase.vertexai.type.RequestOptions;
import com.google.firebase.vertexai.type.Response;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.inner.api.NetworkService;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.C25510OooOooO;
import oO000o.C32084OooO0oo;
import oO000o.OooOO0;
import oO000o0.C32093OooO0oO;
import oO000o0.OooO0o;
import oO000oO0.OooO0O0;
import oO000oO0.OooO0OO;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32192OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33204OooO0oO;
import oO0Oo0Oo.C33207OooOO0O;
import oO0Oo0Oo.C33209OooOOO0;
import oO0Ooo0O.C33400OooOoO0;
import oO0Ooo0O.InterfaceC33394OooOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o0000;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.C33719OooO0OO;
import oO0o0Oo.C33736OooOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOOoOoOO.OooO00o;
import oOo0000O.OooO;
import oOoo0.C34614OooOo0o;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u0012*\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\n\b\u0000\u0010\u0018\u0018\u0001*\u00020\u0017*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0014\b\u0006\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u001bH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020 H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u001d2\u0006\u0010\u0011\u001a\u00020 ¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020*H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u00101\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/APIController;", "", "", "key", "model", "Lcom/google/firebase/vertexai/type/RequestOptions;", "requestOptions", "LoO000o/OooO0O0;", "httpEngine", "apiClient", "Lcom/google/firebase/vertexai/common/HeaderProvider;", "headerProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/RequestOptions;LoO000o/OooO0O0;Ljava/lang/String;Lcom/google/firebase/vertexai/common/HeaderProvider;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/RequestOptions;Ljava/lang/String;Lcom/google/firebase/vertexai/common/HeaderProvider;)V", "LoO000oo/OooO0Oo;", "Lcom/google/firebase/vertexai/common/Request;", "request", "LoO00ooO/OooOooO;", "applyCommonConfiguration", "(LoO000oo/OooO0Oo;Lcom/google/firebase/vertexai/common/Request;)V", "applyHeaderProvider", "(LoO000oo/OooO0Oo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/vertexai/type/Response;", "R", "LoO000o0/OooO0o;", "url", "Lkotlin/Function1;", NetworkService.Constants.CONFIG_SERVICE, "LoO0o0Oo/OooO0o;", "postStream", "(LoO000o0/OooO0o;Ljava/lang/String;LoO0O000o/OooOO0o;)LoO0o0Oo/OooO0o;", "Lcom/google/firebase/vertexai/common/GenerateContentRequest;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "generateContent", "(Lcom/google/firebase/vertexai/common/GenerateContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/vertexai/common/GenerateImageRequest;", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal;", "generateImage", "(Lcom/google/firebase/vertexai/common/GenerateImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateContentStream", "(Lcom/google/firebase/vertexai/common/GenerateContentRequest;)LoO0o0Oo/OooO0o;", "Lcom/google/firebase/vertexai/common/CountTokensRequest;", "Lcom/google/firebase/vertexai/type/CountTokensResponse$Internal;", "countTokens", "(Lcom/google/firebase/vertexai/common/CountTokensRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "Lcom/google/firebase/vertexai/type/RequestOptions;", "Lcom/google/firebase/vertexai/common/HeaderProvider;", "client", "LoO000o0/OooO0o;", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class APIController {
    private static final String TAG = "APIController";
    private final String apiClient;
    private final OooO0o client;
    private final HeaderProvider headerProvider;
    private final String key;
    private final String model;
    private final RequestOptions requestOptions;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$applyHeaderProvider$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController", m80623f = "APIController.kt", m80624l = {183}, m80625m = "applyHeaderProvider")
    public static final class C172351 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C172351(Continuation<? super C172351> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return APIController.this.applyHeaderProvider(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$applyHeaderProvider$2 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$applyHeaderProvider$2", m80623f = "APIController.kt", m80624l = {184}, m80625m = "invokeSuspend")
    public static final class C172362 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ C32132OooO0Oo $this_applyHeaderProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C172362(C32132OooO0Oo c32132OooO0Oo, Continuation<? super C172362> continuation) {
            super(2, continuation);
            this.$this_applyHeaderProvider = c32132OooO0Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return APIController.this.new C172362(this.$this_applyHeaderProvider, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                HeaderProvider headerProvider = APIController.this.headerProvider;
                this.label = 1;
                obj = headerProvider.generateHeaders(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                C25510OooOooO.OooO0O0(this.$this_applyHeaderProvider, (String) entry.getKey(), (String) entry.getValue());
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C172362) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$countTokens$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController", m80623f = "APIController.kt", m80624l = {161, StyleIdentifier.LIST_TABLE_7_COLORFUL, 163, StyleIdentifier.LIST_TABLE_2_ACCENT_1}, m80625m = "countTokens")
    public static final class C172391 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172391(Continuation<? super C172391> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return APIController.this.countTokens(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContent$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController", m80623f = "APIController.kt", m80624l = {122, StyleIdentifier.LIST_TABLE_7_COLORFUL, 124, StyleIdentifier.LIST_TABLE_2_ACCENT_1}, m80625m = "generateContent")
    public static final class C172401 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172401(Continuation<? super C172401> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return APIController.this.generateContent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$3 */
    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;Ljava/lang/Throwable;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$generateContentStream$3", m80623f = "APIController.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C172433 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super GenerateContentResponse.Internal>, Throwable, Continuation<? super C32460OooOooO>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C172433(Continuation<? super C172433> continuation) {
            super(3, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            throw FirebaseCommonAIException.INSTANCE.from((Throwable) this.L$0);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super GenerateContentResponse.Internal> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
            C172433 c172433 = new C172433(continuation);
            c172433.L$0 = th;
            return c172433.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateImage$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController", m80623f = "APIController.kt", m80624l = {136, StyleIdentifier.LIST_TABLE_7_COLORFUL, 138, StyleIdentifier.LIST_TABLE_2_ACCENT_1}, m80625m = "generateImage")
    public static final class C172441 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C172441(Continuation<? super C172441> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return APIController.this.generateImage(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$1 */
    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO000oo/OooO0Oo;", "LoO00ooO/OooOooO;", "invoke", "(LoO000oo/OooO0Oo;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172451 extends OooOOOO implements InterfaceC32507OooOO0o<C32132OooO0Oo, C32460OooOooO> {
        public static final C172451 INSTANCE = new C172451();

        public C172451() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C32132OooO0Oo c32132OooO0Oo) {
            OooOOO0.OooO0oO(c32132OooO0Oo, "$this$null");
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(C32132OooO0Oo c32132OooO0Oo) {
            invoke2(c32132OooO0Oo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$2 */
    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO0o0OOo/OooOo0O;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$postStream$2", m80623f = "APIController.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C172462<R> extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super R>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ InterfaceC32507OooOO0o<C32132OooO0Oo, C32460OooOooO> $config;
        final /* synthetic */ OooO0o $this_postStream;
        final /* synthetic */ String $url;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ APIController this$0;

        /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$2$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$postStream$2$1", m80623f = "APIController.kt", m80624l = {227, 230}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
            final /* synthetic */ InterfaceC33712OooOo0O<R> $$this$channelFlow;
            final /* synthetic */ InterfaceC32507OooOO0o<C32132OooO0Oo, C32460OooOooO> $config;
            final /* synthetic */ OooO0o $this_postStream;
            final /* synthetic */ String $url;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ APIController this$0;

            /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$2$1$2, reason: invalid class name */
            @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", "LoO0Oo0Oo/OooO0OO;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0Oo0Oo/OooO0OO;)V"}, m80613k = 3, m80614mv = {1, 8, 0})
            @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$postStream$2$1$2", m80623f = "APIController.kt", m80624l = {231, 233, 236}, m80625m = "invokeSuspend")
            public static final class AnonymousClass2 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {
                final /* synthetic */ InterfaceC33712OooOo0O<R> $$this$channelFlow;
                /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$postStream$2$1$2$1, reason: invalid class name and collision with other inner class name */
                @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Response;", "R", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "emit", "(Lcom/google/firebase/vertexai/type/Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
                public static final class C191101<T> implements InterfaceC33723OooO0oO {
                    final /* synthetic */ InterfaceC33712OooOo0O<R> $$this$channelFlow;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C191101(InterfaceC33712OooOo0O<? super R> interfaceC33712OooOo0O) {
                        this.$$this$channelFlow = interfaceC33712OooOo0O;
                    }

                    /* JADX WARN: Incorrect types in method signature: (TR;Lkotlin/coroutines/Continuation<-LoO00ooO/OooOooO;>;)Ljava/lang/Object; */
                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Response response, Continuation continuation) {
                        Object objOooOOO = this.$$this$channelFlow.OooOOO(response, continuation);
                        return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(InterfaceC33712OooOo0O<? super R> interfaceC33712OooOo0O, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$$this$channelFlow = interfaceC33712OooOo0O;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$channelFlow, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
                
                    if (r6 == r0) goto L19;
                 */
                @Override // oO00ooo.AbstractC32477OooO00o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AbstractC33200OooO0OO abstractC33200OooO0OO;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.label;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.L$0;
                        this.L$0 = abstractC33200OooO0OO;
                        this.label = 1;
                        if (APIControllerKt.validateResponse(abstractC33200OooO0OO, this) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C32446OooOOOo.OooO0O0(obj);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        APIControllerKt.getJSON();
                        OooOOO0.OooOOO();
                        throw null;
                    }
                    abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.L$0;
                    C32446OooOOOo.OooO0O0(obj);
                    this.L$0 = null;
                    this.label = 2;
                    obj = C33204OooO0oO.OooO00o(abstractC33200OooO0OO, this);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
                    return ((AnonymousClass2) create(abstractC33200OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(OooO0o oooO0o, String str, APIController aPIController, InterfaceC32507OooOO0o<? super C32132OooO0Oo, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC33712OooOo0O<? super R> interfaceC33712OooOo0O, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_postStream = oooO0o;
                this.$url = str;
                this.this$0 = aPIController;
                this.$config = interfaceC32507OooOO0o;
                this.$$this$channelFlow = interfaceC33712OooOo0O;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_postStream, this.$url, this.this$0, this.$config, this.$$this$channelFlow, continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                OooO0o client;
                InterfaceC32507OooOO0o<C32132OooO0Oo, C32460OooOooO> interfaceC32507OooOO0o;
                C32132OooO0Oo c32132OooO0Oo;
                C32132OooO0Oo c32132OooO0Oo2;
                Set setKeySet;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.label;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO0o oooO0o = this.$this_postStream;
                    String str = this.$url;
                    APIController aPIController = this.this$0;
                    InterfaceC32507OooOO0o<C32132OooO0Oo, C32460OooOooO> interfaceC32507OooOO0o2 = this.$config;
                    C32132OooO0Oo c32132OooO0Oo3 = new C32132OooO0Oo();
                    C21091o0000o.OooOOo0(c32132OooO0Oo3, str);
                    this.L$0 = interfaceC32507OooOO0o2;
                    this.L$1 = oooO0o;
                    this.L$2 = c32132OooO0Oo3;
                    this.L$3 = c32132OooO0Oo3;
                    this.label = 1;
                    if (aPIController.applyHeaderProvider(c32132OooO0Oo3, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    client = oooO0o;
                    interfaceC32507OooOO0o = interfaceC32507OooOO0o2;
                    c32132OooO0Oo = c32132OooO0Oo3;
                    c32132OooO0Oo2 = c32132OooO0Oo;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    c32132OooO0Oo = (C32132OooO0Oo) this.L$3;
                    c32132OooO0Oo2 = (C32132OooO0Oo) this.L$2;
                    client = (OooO0o) this.L$1;
                    interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) this.L$0;
                    C32446OooOOOo.OooO0O0(obj);
                }
                interfaceC32507OooOO0o.invoke(c32132OooO0Oo);
                c32132OooO0Oo2.OooO0Oo(C32192OooOo0.f115539OooO0OO);
                OooOOO0.OooO0oO(client, "client");
                Map map = (Map) c32132OooO0Oo2.f115207OooO0o.OooO0OO(C32084OooO0oo.f114926OooO00o);
                if (map != null && (setKeySet = map.keySet()) != null) {
                    ArrayList<InterfaceC33394OooOo> arrayList = new ArrayList();
                    for (Object obj2 : setKeySet) {
                        if (obj2 instanceof InterfaceC33394OooOo) {
                            arrayList.add(obj2);
                        }
                    }
                    for (InterfaceC33394OooOo interfaceC33394OooOo : arrayList) {
                        if (C33400OooOoO0.OooO0O0(client, interfaceC33394OooOo) == null) {
                            throw new IllegalArgumentException(("Consider installing " + interfaceC33394OooOo + " plugin because the request requires it to be installed").toString());
                        }
                    }
                }
                OooOOO0.OooOOO();
                throw null;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                Set setKeySet;
                OooO0o client = this.$this_postStream;
                String str = this.$url;
                APIController aPIController = this.this$0;
                InterfaceC32507OooOO0o<C32132OooO0Oo, C32460OooOooO> interfaceC32507OooOO0o = this.$config;
                C32132OooO0Oo c32132OooO0Oo = new C32132OooO0Oo();
                C21091o0000o.OooOOo0(c32132OooO0Oo, str);
                aPIController.applyHeaderProvider(c32132OooO0Oo, null);
                interfaceC32507OooOO0o.invoke(c32132OooO0Oo);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                c32132OooO0Oo.OooO0Oo(C32192OooOo0.f115539OooO0OO);
                OooOOO0.OooO0oO(client, "client");
                Map map = (Map) c32132OooO0Oo.f115207OooO0o.OooO0OO(C32084OooO0oo.f114926OooO00o);
                if (map != null && (setKeySet = map.keySet()) != null) {
                    ArrayList<InterfaceC33394OooOo> arrayList = new ArrayList();
                    for (Object obj2 : setKeySet) {
                        if (obj2 instanceof InterfaceC33394OooOo) {
                            arrayList.add(obj2);
                        }
                    }
                    for (InterfaceC33394OooOo interfaceC33394OooOo : arrayList) {
                        if (C33400OooOoO0.OooO0O0(client, interfaceC33394OooOo) == null) {
                            throw new IllegalArgumentException(("Consider installing " + interfaceC33394OooOo + " plugin because the request requires it to be installed").toString());
                        }
                    }
                }
                OooOOO0.OooOOO();
                throw null;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((AnonymousClass1) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C172462(OooO0o oooO0o, String str, APIController aPIController, InterfaceC32507OooOO0o<? super C32132OooO0Oo, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super C172462> continuation) {
            super(2, continuation);
            this.$this_postStream = oooO0o;
            this.$url = str;
            this.this$0 = aPIController;
            this.$config = interfaceC32507OooOO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooOOO0.OooOOO();
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            OooOOO0.OooOOO();
            throw null;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            OooOOO0.OooOOO();
            throw null;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33712OooOo0O<? super R> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
            return ((C172462) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public APIController(String key, String model, RequestOptions requestOptions, String apiClient, HeaderProvider headerProvider) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(model, "model");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
        OooOOO0.OooO0oO(apiClient, "apiClient");
        OooOO0 block = OooOO0.f114928OooOo0o;
        OooOOO0.OooO0oO(block, "block");
        OooO0O0 oooO0O0 = new OooO0O0();
        block.invoke(oooO0O0);
        this(key, model, requestOptions, new OooO0OO(oooO0O0), apiClient, headerProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCommonConfiguration(C32132OooO0Oo c32132OooO0Oo, Request request) {
        boolean z = request instanceof GenerateContentRequest;
        oO00O0oO.OooO0O0 oooO0O0 = oO00O0oO.OooO0O0.f115612OooO00o;
        if (z) {
            if (request == null) {
                c32132OooO0Oo.getClass();
                c32132OooO0Oo.f115206OooO0Oo = oooO0O0;
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(GenerateContentRequest.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(GenerateContentRequest.class), interfaceC34606OooOOOoOooO00o));
            } else if (request instanceof oO00O0oO.OooO0OO) {
                c32132OooO0Oo.OooO0O0(request);
                c32132OooO0Oo.OooO0OO(null);
            } else {
                c32132OooO0Oo.OooO0O0(request);
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(GenerateContentRequest.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(GenerateContentRequest.class), interfaceC34606OooOOOoOooO00o2));
            }
        } else if (request instanceof CountTokensRequest) {
            if (request == null) {
                c32132OooO0Oo.getClass();
                c32132OooO0Oo.f115206OooO0Oo = oooO0O0;
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o3 = C24035Oooo00o.OooO00o(CountTokensRequest.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o3), C24035Oooo00o.f80943OooO00o.OooO0O0(CountTokensRequest.class), interfaceC34606OooOOOoOooO00o3));
            } else if (request instanceof oO00O0oO.OooO0OO) {
                c32132OooO0Oo.OooO0O0(request);
                c32132OooO0Oo.OooO0OO(null);
            } else {
                c32132OooO0Oo.OooO0O0(request);
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o4 = C24035Oooo00o.OooO00o(CountTokensRequest.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o4), C24035Oooo00o.f80943OooO00o.OooO0O0(CountTokensRequest.class), interfaceC34606OooOOOoOooO00o4));
            }
        } else if (request instanceof GenerateImageRequest) {
            if (request == null) {
                c32132OooO0Oo.getClass();
                c32132OooO0Oo.f115206OooO0Oo = oooO0O0;
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o5 = C24035Oooo00o.OooO00o(GenerateImageRequest.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o5), C24035Oooo00o.f80943OooO00o.OooO0O0(GenerateImageRequest.class), interfaceC34606OooOOOoOooO00o5));
            } else if (request instanceof oO00O0oO.OooO0OO) {
                c32132OooO0Oo.OooO0O0(request);
                c32132OooO0Oo.OooO0OO(null);
            } else {
                c32132OooO0Oo.OooO0O0(request);
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o6 = C24035Oooo00o.OooO00o(GenerateImageRequest.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o6), C24035Oooo00o.f80943OooO00o.OooO0O0(GenerateImageRequest.class), interfaceC34606OooOOOoOooO00o6));
            }
        }
        C32183OooO0Oo type = C32183OooO0Oo.OooO00o.f115523OooO00o;
        OooOOO0.OooO0oO(c32132OooO0Oo, "<this>");
        OooOOO0.OooO0oO(type, "type");
        List<String> list = C32190OooOOo0.f115537OooO00o;
        String value = type.toString();
        C32187OooOO0o c32187OooOO0o = c32132OooO0Oo.f115205OooO0OO;
        c32187OooOO0o.getClass();
        OooOOO0.OooO0oO(value, "value");
        c32187OooOO0o.OooO0oo(value);
        List<String> listOooO0Oo = c32187OooOO0o.OooO0Oo("Content-Type");
        listOooO0Oo.clear();
        listOooO0Oo.add(value);
        C25510OooOooO.OooO0O0(c32132OooO0Oo, "x-goog-api-key", this.key);
        C25510OooOooO.OooO0O0(c32132OooO0Oo, "x-goog-api-client", this.apiClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyHeaderProvider(C32132OooO0Oo c32132OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C172351 c172351;
        if (continuation instanceof C172351) {
            c172351 = (C172351) continuation;
            int i = c172351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172351.label = i - Integer.MIN_VALUE;
            } else {
                c172351 = new C172351(continuation);
            }
        }
        Object obj = c172351.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172351.label;
        try {
        } catch (o0000 unused) {
            Log.w(TAG, "HeaderProvided timed out without generating headers, ignoring");
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            HeaderProvider headerProvider = this.headerProvider;
            if (headerProvider != null) {
                long jMo80701getTimeoutUwyO8pc = headerProvider.mo80701getTimeoutUwyO8pc();
                C172362 c172362 = new C172362(c32132OooO0Oo, null);
                c172351.label = 1;
                if (C21355Ooooooo.OooOO0(jMo80701getTimeoutUwyO8pc, c172362, c172351) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        return C32460OooOooO.f116667OooO00o;
    }

    private final <R extends Response> InterfaceC33721OooO0o<R> postStream(OooO0o oooO0o, String str, InterfaceC32507OooOO0o<? super C32132OooO0Oo, C32460OooOooO> interfaceC32507OooOO0o) {
        OooOOO0.OooOOO();
        throw null;
    }

    public static InterfaceC33721OooO0o postStream$default(APIController aPIController, OooO0o oooO0o, String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 2) != 0) {
            C172451 c172451 = C172451.INSTANCE;
        }
        OooOOO0.OooOOO();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r13 != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object countTokens(CountTokensRequest countTokensRequest, Continuation<? super CountTokensResponse.Internal> continuation) {
        C172391 c172391;
        OooO0o oooO0o;
        C32132OooO0Oo c32132OooO0Oo;
        Object obj;
        if (continuation instanceof C172391) {
            c172391 = (C172391) continuation;
            int i = c172391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172391.label = i - Integer.MIN_VALUE;
            } else {
                c172391 = new C172391(continuation);
            }
        }
        Object objOooO0O0 = c172391.result;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172391.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                oooO0o = this.client;
                String str = this.requestOptions.getEndpoint() + IOUtils.DIR_SEPARATOR_UNIX + this.requestOptions.getApiVersion() + IOUtils.DIR_SEPARATOR_UNIX + this.model + ":countTokens";
                C32132OooO0Oo c32132OooO0Oo2 = new C32132OooO0Oo();
                C21091o0000o.OooOOo0(c32132OooO0Oo2, str);
                applyCommonConfiguration(c32132OooO0Oo2, countTokensRequest);
                c172391.L$0 = oooO0o;
                c172391.L$1 = c32132OooO0Oo2;
                c172391.label = 1;
                if (applyHeaderProvider(c32132OooO0Oo2, c172391) == obj2) {
                    return obj2;
                }
                c32132OooO0Oo = c32132OooO0Oo2;
            } else if (i2 == 1) {
                c32132OooO0Oo = (C32132OooO0Oo) c172391.L$1;
                oooO0o = (OooO0o) c172391.L$0;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            } else if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                c172391.L$0 = objOooO0O0;
                c172391.label = 3;
                if (APIControllerKt.validateResponse((AbstractC33200OooO0OO) objOooO0O0, c172391) != obj2) {
                    return obj2;
                }
                obj = objOooO0O0;
                ooOOOOOo.OooO0OO oooO0OOOooO00o = ((AbstractC33200OooO0OO) obj).OooO00o();
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(CountTokensResponse.Internal.class);
                OooO00o oooO00oOooO = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(CountTokensResponse.Internal.class), interfaceC34606OooOOOoOooO00o);
                c172391.L$0 = null;
                c172391.label = 4;
                objOooO0O0 = oooO0OOOooO00o.OooO00o(oooO00oOooO, c172391);
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooO0O0);
                    if (objOooO0O0 != null) {
                        return (CountTokensResponse.Internal) objOooO0O0;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.firebase.vertexai.type.CountTokensResponse.Internal");
                }
                obj = c172391.L$0;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                ooOOOOOo.OooO0OO oooO0OOOooO00o2 = ((AbstractC33200OooO0OO) obj).OooO00o();
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(CountTokensResponse.Internal.class);
                OooO00o oooO00oOooO2 = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(CountTokensResponse.Internal.class), interfaceC34606OooOOOoOooO00o2);
                c172391.L$0 = null;
                c172391.label = 4;
                objOooO0O0 = oooO0OOOooO00o2.OooO00o(oooO00oOooO2, c172391);
            }
            c32132OooO0Oo.OooO0Oo(C32192OooOo0.f115539OooO0OO);
            C33209OooOOO0 c33209OooOOO0 = new C33209OooOOO0(c32132OooO0Oo, oooO0o);
            c172391.L$0 = null;
            c172391.L$1 = null;
            c172391.label = 2;
            objOooO0O0 = c33209OooOOO0.OooO0O0(new C33207OooOO0O(2, null), c172391);
            if (objOooO0O0 != obj2) {
                c172391.L$0 = objOooO0O0;
                c172391.label = 3;
                if (APIControllerKt.validateResponse((AbstractC33200OooO0OO) objOooO0O0, c172391) != obj2) {
                }
            }
            return obj2;
        } catch (Throwable th) {
            throw FirebaseCommonAIException.INSTANCE.from(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r13 != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateContent(GenerateContentRequest generateContentRequest, Continuation<? super GenerateContentResponse.Internal> continuation) {
        C172401 c172401;
        OooO0o oooO0o;
        C32132OooO0Oo c32132OooO0Oo;
        Object obj;
        if (continuation instanceof C172401) {
            c172401 = (C172401) continuation;
            int i = c172401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172401.label = i - Integer.MIN_VALUE;
            } else {
                c172401 = new C172401(continuation);
            }
        }
        Object objOooO0O0 = c172401.result;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172401.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                oooO0o = this.client;
                String str = this.requestOptions.getEndpoint() + IOUtils.DIR_SEPARATOR_UNIX + this.requestOptions.getApiVersion() + IOUtils.DIR_SEPARATOR_UNIX + this.model + ":generateContent";
                C32132OooO0Oo c32132OooO0Oo2 = new C32132OooO0Oo();
                C21091o0000o.OooOOo0(c32132OooO0Oo2, str);
                applyCommonConfiguration(c32132OooO0Oo2, generateContentRequest);
                c172401.L$0 = oooO0o;
                c172401.L$1 = c32132OooO0Oo2;
                c172401.label = 1;
                if (applyHeaderProvider(c32132OooO0Oo2, c172401) == obj2) {
                    return obj2;
                }
                c32132OooO0Oo = c32132OooO0Oo2;
            } else if (i2 == 1) {
                c32132OooO0Oo = (C32132OooO0Oo) c172401.L$1;
                oooO0o = (OooO0o) c172401.L$0;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            } else if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                c172401.L$0 = objOooO0O0;
                c172401.label = 3;
                if (APIControllerKt.validateResponse((AbstractC33200OooO0OO) objOooO0O0, c172401) != obj2) {
                    return obj2;
                }
                obj = objOooO0O0;
                ooOOOOOo.OooO0OO oooO0OOOooO00o = ((AbstractC33200OooO0OO) obj).OooO00o();
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(GenerateContentResponse.Internal.class);
                OooO00o oooO00oOooO = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(GenerateContentResponse.Internal.class), interfaceC34606OooOOOoOooO00o);
                c172401.L$0 = null;
                c172401.label = 4;
                objOooO0O0 = oooO0OOOooO00o.OooO00o(oooO00oOooO, c172401);
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooO0O0);
                    if (objOooO0O0 != null) {
                        return APIControllerKt.validate((GenerateContentResponse.Internal) objOooO0O0);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.firebase.vertexai.type.GenerateContentResponse.Internal");
                }
                obj = c172401.L$0;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                ooOOOOOo.OooO0OO oooO0OOOooO00o2 = ((AbstractC33200OooO0OO) obj).OooO00o();
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(GenerateContentResponse.Internal.class);
                OooO00o oooO00oOooO2 = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(GenerateContentResponse.Internal.class), interfaceC34606OooOOOoOooO00o2);
                c172401.L$0 = null;
                c172401.label = 4;
                objOooO0O0 = oooO0OOOooO00o2.OooO00o(oooO00oOooO2, c172401);
            }
            c32132OooO0Oo.OooO0Oo(C32192OooOo0.f115539OooO0OO);
            C33209OooOOO0 c33209OooOOO0 = new C33209OooOOO0(c32132OooO0Oo, oooO0o);
            c172401.L$0 = null;
            c172401.L$1 = null;
            c172401.label = 2;
            objOooO0O0 = c33209OooOOO0.OooO0O0(new C33207OooOO0O(2, null), c172401);
            if (objOooO0O0 != obj2) {
                c172401.L$0 = objOooO0O0;
                c172401.label = 3;
                if (APIControllerKt.validateResponse((AbstractC33200OooO0OO) objOooO0O0, c172401) != obj2) {
                }
            }
            return obj2;
        } catch (Throwable th) {
            throw FirebaseCommonAIException.INSTANCE.from(th);
        }
    }

    public final InterfaceC33721OooO0o<GenerateContentResponse.Internal> generateContentStream(GenerateContentRequest request) {
        OooOOO0.OooO0oO(request, "request");
        OooO0o oooO0o = this.client;
        StringBuilder sb = new StringBuilder();
        sb.append(this.requestOptions.getEndpoint());
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(this.requestOptions.getApiVersion());
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        final C33719OooO0OO c33719OooO0OO = new C33719OooO0OO(new APIController$generateContentStream$$inlined$postStream$1(oooO0o, androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.model, ":streamGenerateContent?alt=sse"), this, null, this, request), OooO.f123416OooOo0o, -2, EnumC33692OooO0OO.f121452OooOo0o);
        return new C33736OooOo0(new InterfaceC33721OooO0o<GenerateContentResponse.Internal>() { // from class: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$map$1

            /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$map$1$2 */
            @Metadata(m80611d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"T", "R", "value", "LoO00ooO/OooOooO;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
            public static final class C172412<T> implements InterfaceC33723OooO0oO {
                final /* synthetic */ InterfaceC33723OooO0oO $this_unsafeFlow;

                /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
                @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIController$generateContentStream$$inlined$map$1$2", m80623f = "APIController.kt", m80624l = {223}, m80625m = "emit")
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
                        return C172412.this.emit(null, this);
                    }
                }

                public C172412(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                    this.$this_unsafeFlow = interfaceC33723OooO0oO;
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
                        GenerateContentResponse.Internal internalValidate = APIControllerKt.validate((GenerateContentResponse.Internal) obj);
                        anonymousClass1.label = 1;
                        if (interfaceC33723OooO0oO.emit(internalValidate, anonymousClass1) == enumC32485OooO00o) {
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
            public Object collect(InterfaceC33723OooO0oO<? super GenerateContentResponse.Internal> interfaceC33723OooO0oO, Continuation continuation) {
                Object objCollect = c33719OooO0OO.collect(new C172412(interfaceC33723OooO0oO), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            }
        }, new C172433(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r13 != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateImage(GenerateImageRequest generateImageRequest, Continuation<? super ImagenGenerationResponse.Internal> continuation) {
        C172441 c172441;
        OooO0o oooO0o;
        C32132OooO0Oo c32132OooO0Oo;
        Object obj;
        if (continuation instanceof C172441) {
            c172441 = (C172441) continuation;
            int i = c172441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172441.label = i - Integer.MIN_VALUE;
            } else {
                c172441 = new C172441(continuation);
            }
        }
        Object objOooO0O0 = c172441.result;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172441.label;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                oooO0o = this.client;
                String str = this.requestOptions.getEndpoint() + IOUtils.DIR_SEPARATOR_UNIX + this.requestOptions.getApiVersion() + IOUtils.DIR_SEPARATOR_UNIX + this.model + ":predict";
                C32132OooO0Oo c32132OooO0Oo2 = new C32132OooO0Oo();
                C21091o0000o.OooOOo0(c32132OooO0Oo2, str);
                applyCommonConfiguration(c32132OooO0Oo2, generateImageRequest);
                c172441.L$0 = oooO0o;
                c172441.L$1 = c32132OooO0Oo2;
                c172441.label = 1;
                if (applyHeaderProvider(c32132OooO0Oo2, c172441) == obj2) {
                    return obj2;
                }
                c32132OooO0Oo = c32132OooO0Oo2;
            } else if (i2 == 1) {
                c32132OooO0Oo = (C32132OooO0Oo) c172441.L$1;
                oooO0o = (OooO0o) c172441.L$0;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            } else if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                c172441.L$0 = objOooO0O0;
                c172441.label = 3;
                if (APIControllerKt.validateResponse((AbstractC33200OooO0OO) objOooO0O0, c172441) != obj2) {
                    return obj2;
                }
                obj = objOooO0O0;
                ooOOOOOo.OooO0OO oooO0OOOooO00o = ((AbstractC33200OooO0OO) obj).OooO00o();
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(ImagenGenerationResponse.Internal.class);
                OooO00o oooO00oOooO = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(ImagenGenerationResponse.Internal.class), interfaceC34606OooOOOoOooO00o);
                c172441.L$0 = null;
                c172441.label = 4;
                objOooO0O0 = oooO0OOOooO00o.OooO00o(oooO00oOooO, c172441);
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooO0O0);
                    if (objOooO0O0 != null) {
                        return (ImagenGenerationResponse.Internal) objOooO0O0;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.firebase.vertexai.type.ImagenGenerationResponse.Internal");
                }
                obj = c172441.L$0;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                ooOOOOOo.OooO0OO oooO0OOOooO00o2 = ((AbstractC33200OooO0OO) obj).OooO00o();
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(ImagenGenerationResponse.Internal.class);
                OooO00o oooO00oOooO2 = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(ImagenGenerationResponse.Internal.class), interfaceC34606OooOOOoOooO00o2);
                c172441.L$0 = null;
                c172441.label = 4;
                objOooO0O0 = oooO0OOOooO00o2.OooO00o(oooO00oOooO2, c172441);
            }
            c32132OooO0Oo.OooO0Oo(C32192OooOo0.f115539OooO0OO);
            C33209OooOOO0 c33209OooOOO0 = new C33209OooOOO0(c32132OooO0Oo, oooO0o);
            c172441.L$0 = null;
            c172441.L$1 = null;
            c172441.label = 2;
            objOooO0O0 = c33209OooOOO0.OooO0O0(new C33207OooOO0O(2, null), c172441);
            if (objOooO0O0 != obj2) {
                c172441.L$0 = objOooO0O0;
                c172441.label = 3;
                if (APIControllerKt.validateResponse((AbstractC33200OooO0OO) objOooO0O0, c172441) != obj2) {
                }
            }
            return obj2;
        } catch (Throwable th) {
            throw FirebaseCommonAIException.INSTANCE.from(th);
        }
    }

    public APIController(String key, String model, RequestOptions requestOptions, oO000o.OooO0O0 httpEngine, String apiClient, HeaderProvider headerProvider) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(model, "model");
        OooOOO0.OooO0oO(requestOptions, "requestOptions");
        OooOOO0.OooO0oO(httpEngine, "httpEngine");
        OooOOO0.OooO0oO(apiClient, "apiClient");
        this.key = key;
        this.requestOptions = requestOptions;
        this.apiClient = apiClient;
        this.headerProvider = headerProvider;
        this.model = UtilKt.fullModelName(model);
        APIController$client$1 aPIController$client$1 = new APIController$client$1(this);
        C32093OooO0oO c32093OooO0oO = new C32093OooO0oO();
        aPIController$client$1.invoke(c32093OooO0oO);
        this.client = new OooO0o(httpEngine, c32093OooO0oO, false);
    }

    public /* synthetic */ APIController(String str, String str2, RequestOptions requestOptions, String str3, HeaderProvider headerProvider, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, requestOptions, str3, (i & 16) != 0 ? null : headerProvider);
    }
}
