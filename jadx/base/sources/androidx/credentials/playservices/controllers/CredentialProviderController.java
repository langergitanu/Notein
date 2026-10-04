package androidx.credentials.playservices.controllers;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.microsoft.identity.common.java.constants.FidoConstants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.C24159OooO0o0;
import o0000OO.C24161OooO0oo;
import o0000OO.OooO;
import o0000OO.OooO0o;
import o0000OO.OooOO0O;
import o0000OO.OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001#B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00032\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController;", "", "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "Lo0000OO0/OooOOO;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "maybeReportErrorFromResultReceiver", "(Landroid/os/Bundle;LoO0O000o/OooOOOo;Ljava/util/concurrent/Executor;Lo0000OO0/OooOOO;Landroid/os/CancellationSignal;)Z", "request", "LoO00ooO/OooOooO;", "invokePlayServices", "(Ljava/lang/Object;Lo0000OO0/OooOOO;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ljava/lang/Object;)Ljava/lang/Object;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "convertResponseToCredentialManager", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u001a\u0010\u0011J'\u0010\u001c\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;", "", "<init>", "()V", "", "resultCode", "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "cancelOnError", "Lkotlin/Function1;", "Lo0000OO/OooO0o;", "onError", "cancellationSignal", "", "maybeReportErrorResultCodeCreate", "(ILoO0O000o/OooOOOo;LoO0O000o/OooOO0o;Landroid/os/CancellationSignal;)Z", "", "generateErrorStringUnknown$credentials_play_services_auth_release", "(I)Ljava/lang/String;", "generateErrorStringUnknown", "generateErrorStringCanceled$credentials_play_services_auth_release", "()Ljava/lang/String;", "generateErrorStringCanceled", "Lo0000OO/OooOO0O;", "maybeReportErrorResultCodeGet", "onResultOrException", "cancelOrCallbackExceptionOrResult", "(Landroid/os/CancellationSignal;LoO0O000o/OooO00o;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, oO0O000o.OooO00o<C32460OooOooO> onResultOrException) {
            OooOOO0.OooO0oO(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        /* JADX INFO: renamed from: generateErrorStringCanceled$credentials_play_services_auth_release */
        public final String m37x576fb150() {
            return "activity is cancelled by the user.";
        }

        /* JADX INFO: renamed from: generateErrorStringUnknown$credentials_play_services_auth_release */
        public final String m38x14b42947(int resultCode) {
            return o0Oo0oo.OooO0O0(resultCode, "activity with result code: ", " indicating not RESULT_OK");
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, o0000OO.OooO0oo] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, o0000OO.OooO0o0] */
        public final boolean maybeReportErrorResultCodeCreate(int resultCode, InterfaceC32508OooOOOo<? super CancellationSignal, ? super oO0O000o.OooO00o<C32460OooOooO>, C32460OooOooO> cancelOnError, InterfaceC32507OooOO0o<? super OooO0o, C32460OooOooO> onError, CancellationSignal cancellationSignal) {
            OooOOO0.OooO0oO(cancelOnError, "cancelOnError");
            OooOOO0.OooO0oO(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            c24034Oooo00O.f80942OooOo0o = new C24161OooO0oo(m38x14b42947(resultCode));
            if (resultCode == 0) {
                c24034Oooo00O.f80942OooOo0o = new C24159OooO0o0(m37x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C0107x7cfe4d37(onError, c24034Oooo00O));
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, o0000OO.OooOOO] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, o0000OO.OooO] */
        public final boolean maybeReportErrorResultCodeGet(int resultCode, InterfaceC32508OooOOOo<? super CancellationSignal, ? super oO0O000o.OooO00o<C32460OooOooO>, C32460OooOooO> cancelOnError, InterfaceC32507OooOO0o<? super OooOO0O, C32460OooOooO> onError, CancellationSignal cancellationSignal) {
            OooOOO0.OooO0oO(cancelOnError, "cancelOnError");
            OooOOO0.OooO0oO(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            c24034Oooo00O.f80942OooOo0o = new OooOOO(m38x14b42947(resultCode));
            if (resultCode == 0) {
                c24034Oooo00O.f80942OooOo0o = new OooO(m37x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C0108x6edb4e75(onError, c24034Oooo00O));
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m80612d2 = {"", "T1", "T2", "R2", "R1", "E1", "LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C01091 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        final /* synthetic */ o0000OO0.OooOOO<R1, E1> $callback;
        final /* synthetic */ E1 $exception;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01091(Executor executor, o0000OO0.OooOOO<R1, E1> oooOOO, E1 e1) {
            super(0);
            this.$executor = executor;
            this.$callback = oooOOO;
            this.$exception = e1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(o0000OO0.OooOOO callback, Object exception) {
            OooOOO0.OooO0oO(callback, "$callback");
            OooOOO0.OooO0oO(exception, "$exception");
            callback.onError(exception);
        }

        @Override // oO0O000o.OooO00o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = this.$executor;
            final o0000OO0.OooOOO<R1, E1> oooOOO = this.$callback;
            final E1 e1 = this.$exception;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderController.C01091.invoke$lambda$0(oooOOO, e1);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        OooOOO0.OooO0oO(context, "context");
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        INSTANCE.cancelOrCallbackExceptionOrResult(cancellationSignal, oooO00o);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, InterfaceC32508OooOOOo<? super CancellationSignal, ? super oO0O000o.OooO00o<C32460OooOooO>, C32460OooOooO> interfaceC32508OooOOOo, InterfaceC32507OooOO0o<? super OooO0o, C32460OooOooO> interfaceC32507OooOO0o, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeCreate(i, interfaceC32508OooOOOo, interfaceC32507OooOO0o, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, InterfaceC32508OooOOOo<? super CancellationSignal, ? super oO0O000o.OooO00o<C32460OooOooO>, C32460OooOooO> interfaceC32508OooOOOo, InterfaceC32507OooOO0o<? super OooOO0O, C32460OooOooO> interfaceC32507OooOO0o, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeGet(i, interfaceC32508OooOOOo, interfaceC32507OooOO0o, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 request);

    public abstract R1 convertResponseToCredentialManager(R2 response);

    public abstract void invokePlayServices(T1 request, o0000OO0.OooOOO<R1, E1> callback, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, InterfaceC32508OooOOOo<? super String, ? super String, ? extends E1> conversionFn, Executor executor, o0000OO0.OooOOO<R1, E1> callback, CancellationSignal cancellationSignal) {
        OooOOO0.OooO0oO(resultData, "resultData");
        OooOOO0.OooO0oO(conversionFn, "conversionFn");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new C01091(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
