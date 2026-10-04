package com.microsoft.identity.common.internal.fido;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.List;
import o0oo0o00.InterfaceC31297OooOO0O;

/* JADX INFO: loaded from: classes9.dex */
public class PublicKeyCredentialRequestOptions {

    @InterfaceC31297OooOO0O(name = "allowCredentials")
    public final List<PublicKeyCredentialDescriptor> allowCredentials;

    @InterfaceC31297OooOO0O(name = ClientData.KEY_CHALLENGE)
    public final String challenge;

    @InterfaceC31297OooOO0O(name = "rpId")
    public final String rpId;

    @InterfaceC31297OooOO0O(name = "userVerification")
    public final String userVerification;

    public PublicKeyCredentialRequestOptions(String str, String str2, List<PublicKeyCredentialDescriptor> list, String str3) {
        this.challenge = str;
        this.rpId = str2;
        this.allowCredentials = list;
        this.userVerification = str3;
    }

    public List<PublicKeyCredentialDescriptor> getAllowCredentials() {
        return this.allowCredentials;
    }

    public String getChallenge() {
        return this.challenge;
    }

    public String getRpId() {
        return this.rpId;
    }

    public String getUserVerification() {
        return this.userVerification;
    }
}
