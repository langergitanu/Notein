package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import o0000OO.OooOO0O;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
public /* synthetic */ class C0093x4b514208 extends C24019OooOO0o implements InterfaceC32508OooOOOo<String, String, OooOO0O> {
    public C0093x4b514208(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final OooOO0O invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m36xd975db95(str, str2);
    }
}
