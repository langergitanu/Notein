package androidx.credentials.playservices;

import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"Lcom/google/android/gms/auth/api/identity/BeginSignInResult;", "kotlin.jvm.PlatformType", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/android/gms/auth/api/identity/BeginSignInResult;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class HiddenActivity$handleBeginSignIn$1$1 extends OooOOOO implements InterfaceC32507OooOO0o<BeginSignInResult, C32460OooOooO> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleBeginSignIn$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(BeginSignInResult beginSignInResult) {
        invoke2(beginSignInResult);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BeginSignInResult beginSignInResult) {
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
            OooOOO0.OooO0Oo(resultReceiver);
            hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
        }
    }
}
