package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO0.AbstractC24169OooOOOo;
import o0000OO0.C24164OooO0Oo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24192Oooo0oo;
import o0000OO0.C24197OoooOO0;
import o0000OO0.InterfaceC24171OooOOo0;
import o0000OO0.OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, m80612d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lo0000OO0/OooOOo0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "Lo0000OO0/Oooo0oo;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lo0000OO0/OooOOO;", "Lo0000OO0/Oooo;", "Lo0000OO/OooOO0O;", "callback", "LoO00ooO/OooOooO;", "onGetCredential", "(Landroid/content/Context;Lo0000OO0/Oooo0oo;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lo0000OO0/OooOOO;)V", "Lo0000OO0/OooO0O0;", "Lo0000OO0/OooO0OO;", "Lo0000OO/OooO0o;", "onCreateCredential", "(Landroid/content/Context;Lo0000OO0/OooO0O0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lo0000OO0/OooOOO;)V", "", "isAvailableOnDevice", "()Z", "Lo0000OO0/OooO00o;", "Ljava/lang/Void;", "Lo0000OO/OooO00o;", "onClearCredential", "(Lo0000OO0/OooO00o;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lo0000OO0/OooOOO;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CredentialProviderPlayServicesImpl implements InterfaceC24171OooOOo0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability;

    @Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;LoO0O000o/OooO00o;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Lo0000OO0/Oooo0oo;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Lo0000OO0/Oooo0oo;)Z", "isGetSignInIntentRequest", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        /* JADX INFO: renamed from: cancellationReviewerWithCallback$credentials_play_services_auth_release */
        public final void m16xee23955a(CancellationSignal cancellationSignal, oO0O000o.OooO00o<C32460OooOooO> callback) {
            OooOOO0.OooO0oO(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C24192Oooo0oo request) {
            OooOOO0.OooO0oO(request, "request");
            Iterator<AbstractC24169OooOOOo> it = request.f81445OooO00o.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetSignInWithGoogleOption) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00911 extends OooOOOO implements InterfaceC32507OooOO0o<Void, C32460OooOooO> {
        final /* synthetic */ OooOOO<Void, o0000OO.OooO00o> $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
        public static final class AnonymousClass1 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
            final /* synthetic */ OooOOO<Void, o0000OO.OooO00o> $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Executor executor, OooOOO<Void, o0000OO.OooO00o> oooOOO) {
                super(0);
                this.$executor = executor;
                this.$callback = oooOOO;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(OooOOO callback) {
                OooOOO0.OooO0oO(callback, "$callback");
                callback.onResult(null);
            }

            @Override // oO0O000o.OooO00o
            public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
                invoke2();
                return C32460OooOooO.f116667OooO00o;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                Executor executor = this.$executor;
                final OooOOO<Void, o0000OO.OooO00o> oooOOO = this.$callback;
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderPlayServicesImpl.C00911.AnonymousClass1.invoke$lambda$0(oooOOO);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00911(CancellationSignal cancellationSignal, Executor executor, OooOOO<Void, o0000OO.OooO00o> oooOOO) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = oooOOO;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(Void r1) {
            invoke2(r1);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r5) {
            CredentialProviderPlayServicesImpl.INSTANCE.m16xee23955a(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        OooOOO0.OooO0oO(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        OooOOO0.OooO0o(googleApiAvailability, "getInstance()");
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(InterfaceC32507OooOO0o tmp0, Object obj) {
        OooOOO0.OooO0oO(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, OooOOO callback, Exception e) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO0.OooO0oO(executor, "$executor");
        OooOOO0.OooO0oO(callback, "$callback");
        OooOOO0.OooO0oO(e, "e");
        INSTANCE.m16xee23955a(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(e, executor, callback));
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // o0000OO0.InterfaceC24171OooOOo0
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable));
        }
        return z;
    }

    @Override // o0000OO0.InterfaceC24171OooOOo0
    public void onClearCredential(o0000OO0.OooO00o request, final CancellationSignal cancellationSignal, final Executor executor, final OooOOO<Void, o0000OO.OooO00o> callback) {
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<Void> taskSignOut = Identity.getSignInClient(this.context).signOut();
        final C00911 c00911 = new C00911(cancellationSignal, executor, callback);
        taskSignOut.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.OooO00o
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(c00911, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.OooO0O0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f64312OooO00o, cancellationSignal, executor, callback, exc);
            }
        });
    }

    public void onCreateCredential(Context context, o0000OO0.OooO0O0 request, CancellationSignal cancellationSignal, Executor executor, OooOOO<o0000OO0.OooO0OO, o0000OO.OooO0o> callback) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof C24164OooO0Oo) {
            CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((C24164OooO0Oo) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof o0000OO0.OooO0o)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((o0000OO0.OooO0o) request, callback, executor, cancellationSignal);
        }
    }

    public void onGetCredential(Context context, C24197OoooOO0 pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, OooOOO callback) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(callback, "callback");
    }

    public void onPrepareCredential(C24192Oooo0oo request, CancellationSignal cancellationSignal, Executor executor, OooOOO callback) {
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(callback, "callback");
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        OooOOO0.OooO0oO(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // o0000OO0.InterfaceC24171OooOOo0
    public void onGetCredential(Context context, C24192Oooo0oo request, CancellationSignal cancellationSignal, Executor executor, OooOOO<C24183Oooo, o0000OO.OooOO0O> callback) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }
}
