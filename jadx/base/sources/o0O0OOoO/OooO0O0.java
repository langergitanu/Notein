package o0O0OOoO;

import com.android.billingclient.api.C22189OoooO0;
import com.microsoft.identity.common.java.providers.microsoft.microsoftsts.MicrosoftStsOAuth2Strategy;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2StrategyParameters;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24239OooOOO0;
import o0000Ooo.C24242OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 extends MicrosoftStsOAuth2Strategy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25891OooO00o f88407OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f88408OooO0O0;

    public OooO0O0(OAuth2StrategyParameters oAuth2StrategyParameters, C25891OooO00o c25891OooO00o, C22189OoooO0 c22189OoooO0, C24242OooOOo c24242OooOOo, C24239OooOOO0 c24239OooOOO0) {
        super(c25891OooO00o, oAuth2StrategyParameters);
        this.f88407OooO00o = c25891OooO00o;
        this.f88408OooO0O0 = "login.windows.net";
    }

    @Override // com.microsoft.identity.common.java.providers.microsoft.microsoftsts.MicrosoftStsOAuth2Strategy
    public final String getIssuerCacheIdentifierFromTokenEndpoint() {
        if (this.f88407OooO00o.f88405OooO0O0) {
            return this.f88408OooO0O0;
        }
        String issuerCacheIdentifierFromTokenEndpoint = super.getIssuerCacheIdentifierFromTokenEndpoint();
        OooOOO0.OooO0o(issuerCacheIdentifierFromTokenEndpoint, "super.getIssuerCacheIdentifierFromTokenEndpoint()");
        return issuerCacheIdentifierFromTokenEndpoint;
    }
}
