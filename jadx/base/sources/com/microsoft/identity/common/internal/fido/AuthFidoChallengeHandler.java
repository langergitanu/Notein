package com.microsoft.identity.common.internal.fido;

import android.webkit.WebView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.IChallengeHandler;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.opentelemetry.AttributeName;
import com.microsoft.identity.common.java.opentelemetry.OTelUtility;
import com.microsoft.identity.common.java.opentelemetry.SpanName;
import com.microsoft.identity.common.logging.Logger;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.StatusCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010!\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0017\u0010'\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/fido/AuthFidoChallengeHandler;", "Lcom/microsoft/identity/common/internal/ui/webview/challengehandlers/IChallengeHandler;", "Lcom/microsoft/identity/common/internal/fido/FidoChallenge;", "Ljava/lang/Void;", "Lcom/microsoft/identity/common/internal/fido/IFidoManager;", "fidoManager", "Landroid/webkit/WebView;", "webView", "Lio/opentelemetry/api/trace/SpanContext;", "spanContext", "Landroidx/lifecycle/OooOoo;", "lifecycleOwner", "<init>", "(Lcom/microsoft/identity/common/internal/fido/IFidoManager;Landroid/webkit/WebView;Lio/opentelemetry/api/trace/SpanContext;Landroidx/lifecycle/OooOoo;)V", "", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "getErrorAssertion", "(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;", "fidoChallenge", "processChallenge", "(Lcom/microsoft/identity/common/internal/fido/FidoChallenge;)Ljava/lang/Void;", "submitUrl", AbstractJwtRequest.ClaimNames.ASSERTION, "context", "Lio/opentelemetry/api/trace/Span;", "span", "LoO00ooO/OooOooO;", "respondToChallenge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/opentelemetry/api/trace/Span;)V", "methodTag", "respondToChallengeWithError", "(Ljava/lang/String;Ljava/lang/String;Lio/opentelemetry/api/trace/Span;Ljava/lang/String;Ljava/lang/Exception;Ljava/lang/String;)V", "Lcom/microsoft/identity/common/internal/fido/IFidoManager;", "Landroid/webkit/WebView;", "Lio/opentelemetry/api/trace/SpanContext;", "Landroidx/lifecycle/OooOoo;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class AuthFidoChallengeHandler implements IChallengeHandler<FidoChallenge, Void> {
    private final String TAG;
    private final IFidoManager fidoManager;
    private final InterfaceC21987OooOoo lifecycleOwner;
    private final SpanContext spanContext;
    private final WebView webView;

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.fido.AuthFidoChallengeHandler$processChallenge$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.fido.AuthFidoChallengeHandler$processChallenge$1", m80623f = "AuthFidoChallengeHandler.kt", m80624l = {107}, m80625m = "invokeSuspend")
    public static final class C185931 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ List<String> $allowedCredentials;
        final /* synthetic */ String $authChallenge;
        final /* synthetic */ String $context;
        final /* synthetic */ String $methodTag;
        final /* synthetic */ String $relyingPartyIdentifier;
        final /* synthetic */ Span $span;
        final /* synthetic */ String $submitUrl;
        final /* synthetic */ String $userVerificationPolicy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185931(String str, String str2, List<String> list, String str3, Span span, String str4, String str5, String str6, Continuation<? super C185931> continuation) {
            super(2, continuation);
            this.$authChallenge = str;
            this.$relyingPartyIdentifier = str2;
            this.$allowedCredentials = list;
            this.$userVerificationPolicy = str3;
            this.$span = span;
            this.$submitUrl = str4;
            this.$context = str5;
            this.$methodTag = str6;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AuthFidoChallengeHandler.this.new C185931(this.$authChallenge, this.$relyingPartyIdentifier, this.$allowedCredentials, this.$userVerificationPolicy, this.$span, this.$submitUrl, this.$context, this.$methodTag, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            C185931 c185931;
            IFidoManager iFidoManager;
            String str;
            String str2;
            List<String> list;
            String str3;
            Exception exc;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                try {
                    iFidoManager = AuthFidoChallengeHandler.this.fidoManager;
                    str = this.$authChallenge;
                    str2 = this.$relyingPartyIdentifier;
                    list = this.$allowedCredentials;
                    str3 = this.$userVerificationPolicy;
                    this.label = 1;
                    c185931 = this;
                } catch (Exception e) {
                    e = e;
                    c185931 = this;
                    exc = e;
                    Exception exc2 = exc;
                    AuthFidoChallengeHandler.this.respondToChallengeWithError(c185931.$submitUrl, c185931.$context, c185931.$span, String.valueOf(exc2.getMessage()), exc2, c185931.$methodTag);
                }
                try {
                    obj = iFidoManager.authenticate(str, str2, list, str3, c185931);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    Exception exc22 = exc;
                    AuthFidoChallengeHandler.this.respondToChallengeWithError(c185931.$submitUrl, c185931.$context, c185931.$span, String.valueOf(exc22.getMessage()), exc22, c185931.$methodTag);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c185931 = this;
                } catch (Exception e3) {
                    exc = e3;
                    c185931 = this;
                    Exception exc222 = exc;
                    AuthFidoChallengeHandler.this.respondToChallengeWithError(c185931.$submitUrl, c185931.$context, c185931.$span, String.valueOf(exc222.getMessage()), exc222, c185931.$methodTag);
                }
            }
            c185931.$span.setStatus(StatusCode.OK);
            AuthFidoChallengeHandler.this.respondToChallenge(c185931.$submitUrl, (String) obj, c185931.$context, c185931.$span);
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C185931) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public AuthFidoChallengeHandler(IFidoManager fidoManager, WebView webView, SpanContext spanContext, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        OooOOO0.OooO0oO(fidoManager, "fidoManager");
        OooOOO0.OooO0oO(webView, "webView");
        this.fidoManager = fidoManager;
        this.webView = webView;
        this.spanContext = spanContext;
        this.lifecycleOwner = interfaceC21987OooOoo;
        this.TAG = String.valueOf(C24035Oooo00o.f80943OooO00o.OooO0O0(AuthFidoChallengeHandler.class).OooOO0());
    }

    private final String getErrorAssertion(String errorMessage, Exception exception) {
        if (exception == null) {
            return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(FidoConstants.PASSKEY_PROTOCOL_ERROR_PREFIX_STRING, errorMessage);
        }
        return FidoConstants.PASSKEY_PROTOCOL_ERROR_PREFIX_STRING + exception.getClass().getName() + ": " + exception.getMessage();
    }

    public static /* synthetic */ String getErrorAssertion$default(AuthFidoChallengeHandler authFidoChallengeHandler, String str, Exception exc, int i, Object obj) {
        if ((i & 2) != 0) {
            exc = null;
        }
        return authFidoChallengeHandler.getErrorAssertion(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void respondToChallenge$lambda$0(String methodTag, AuthFidoChallengeHandler this$0, String submitUrl, Map header) {
        OooOOO0.OooO0oO(methodTag, "$methodTag");
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(submitUrl, "$submitUrl");
        OooOOO0.OooO0oO(header, "$header");
        Logger.info(methodTag, "Responding to Fido challenge.");
        this$0.webView.loadUrl(submitUrl, header);
    }

    public static /* synthetic */ void respondToChallengeWithError$default(AuthFidoChallengeHandler authFidoChallengeHandler, String str, String str2, Span span, String str3, Exception exc, String str4, int i, Object obj) {
        if ((i & 16) != 0) {
            exc = null;
        }
        Exception exc2 = exc;
        if ((i & 32) != 0) {
            str4 = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), authFidoChallengeHandler.TAG, ":respondToChallengeWithError");
        }
        authFidoChallengeHandler.respondToChallengeWithError(str, str2, span, str3, exc2, str4);
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final void respondToChallenge(final String submitUrl, String assertion, String context, Span span) {
        String str;
        String str2;
        OooOOO0.OooO0oO(submitUrl, "submitUrl");
        OooOOO0.OooO0oO(assertion, "assertion");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(span, "span");
        final String str3 = this.TAG + ":respondToChallenge";
        span.end();
        List listOoooOO0 = C33599OooOo0O.OoooOO0(context, new String[]{" "});
        if (listOoooOO0.size() == 2) {
            str = (String) listOoooOO0.get(0);
            str2 = (String) listOoooOO0.get(1);
        } else {
            str = (String) listOoooOO0.get(0);
            str2 = "";
        }
        final Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(FidoConstants.PASSKEY_RESPONSE_ASSERTION_HEADER, assertion), new C32443OooOOO(FidoConstants.PASSKEY_RESPONSE_CONTEXT_HEADER, str), new C32443OooOOO(FidoConstants.PASSKEY_RESPONSE_FLOWTOKEN_HEADER, str2));
        this.webView.post(new Runnable() { // from class: com.microsoft.identity.common.internal.fido.OooO00o
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
            @Override // java.lang.Runnable
            public final void run() {
                String str4 = submitUrl;
                ?? r1 = mapOooO0oo;
                AuthFidoChallengeHandler.respondToChallenge$lambda$0(str3, this, str4, r1);
            }
        });
    }

    public final void respondToChallengeWithError(String submitUrl, String context, Span span, String errorMessage, Exception exception, String methodTag) {
        OooOOO0.OooO0oO(submitUrl, "submitUrl");
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(span, "span");
        OooOOO0.OooO0oO(errorMessage, "errorMessage");
        Logger.error(methodTag, errorMessage, exception);
        if (exception != null) {
            span.recordException(exception);
            span.setStatus(StatusCode.ERROR);
        } else {
            span.setStatus(StatusCode.ERROR, errorMessage);
        }
        respondToChallenge(submitUrl, getErrorAssertion(errorMessage, exception), context, span);
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.challengehandlers.IChallengeHandler
    public Void processChallenge(FidoChallenge fidoChallenge) throws ClientException {
        OooOOO0.OooO0oO(fidoChallenge, "fidoChallenge");
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.TAG, ":processChallenge");
        Span spanCreateSpanFromParent = this.spanContext != null ? OTelUtility.createSpanFromParent(SpanName.Fido.name(), this.spanContext) : OTelUtility.createSpan(SpanName.Fido.name());
        OooOOO0.OooO0o(spanCreateSpanFromParent, "if (spanContext != null)…Name.Fido.name)\n        }");
        spanCreateSpanFromParent.setAttribute(AttributeName.fido_challenge_handler.name(), this.TAG);
        String orThrow = fidoChallenge.getSubmitUrl().getOrThrow();
        String orThrow2 = fidoChallenge.getContext().getOrThrow();
        try {
            String orThrow3 = fidoChallenge.getChallenge().getOrThrow();
            String orThrow4 = fidoChallenge.getRelyingPartyIdentifier().getOrThrow();
            String orThrow5 = fidoChallenge.getUserVerificationPolicy().getOrThrow();
            List<String> orThrow6 = fidoChallenge.getAllowedCredentials().getOrThrow();
            fidoChallenge.getVersion().getOrThrow();
            fidoChallenge.getKeyTypes().getOrThrow();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.lifecycleOwner;
            if (interfaceC21987OooOoo == null) {
                respondToChallengeWithError$default(this, orThrow, orThrow2, spanCreateSpanFromParent, "Cannot get lifecycle owner needed for FIDO API calls.", null, strOooO0OO, 16, null);
                return null;
            }
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new C185931(orThrow3, orThrow4, orThrow6, orThrow5, spanCreateSpanFromParent, orThrow, orThrow2, strOooO0OO, null), 3);
            return null;
        } catch (Exception e) {
            respondToChallengeWithError(orThrow, orThrow2, spanCreateSpanFromParent, String.valueOf(e.getMessage()), e, strOooO0OO);
            return null;
        }
    }
}
