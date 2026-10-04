package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
public /* synthetic */ class C0106xdfe2be02 extends C24019OooOO0o implements InterfaceC32508OooOOOo<String, String, o0000OO.OooO0o> {
    public C0106xdfe2be02(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final o0000OO.OooO0o invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m35x5e74af(str, str2);
    }
}
