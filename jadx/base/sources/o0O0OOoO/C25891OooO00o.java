package o0O0OOoO;

import com.microsoft.identity.common.java.logging.LogSession;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.microsoft.microsoftsts.MicrosoftStsOAuth2Configuration;
import com.microsoft.identity.common.java.util.UrlUtil;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0OOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25891OooO00o extends MicrosoftStsOAuth2Configuration {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final URL f88404OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f88405OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f88406OooO0OO;

    public C25891OooO00o(URL url, String clientId, String challengeType) {
        boolean zBooleanValue = o0O0OOO.OooO00o.f88340OooO0O0.booleanValue();
        OooOOO0.OooO0oO(clientId, "clientId");
        OooOOO0.OooO0oO(challengeType, "challengeType");
        this.f88404OooO00o = url;
        this.f88405OooO0O0 = zBooleanValue;
        this.f88406OooO0OO = C25891OooO00o.class.getSimpleName();
    }

    public final URL OooO00o(URL url, String str) throws MalformedURLException, URISyntaxException {
        LogSession.Companion companion = LogSession.INSTANCE;
        String TAG = this.f88406OooO0OO;
        OooOOO0.OooO0o(TAG, "TAG");
        companion.logMethodCall(TAG, null, TAG.concat(".getEndpointUrlFromRootAndTenantAndSuffix"));
        try {
            URL urlAppendPathAndQueryToURL = o0O0OOO.OooO00o.f88339OooO00o.length() > 0 ? UrlUtil.appendPathAndQueryToURL(url, str, "dc=".concat(o0O0OOO.OooO00o.f88339OooO00o)) : UrlUtil.appendPathToURL(url, str);
            OooOOO0.OooO0o(urlAppendPathAndQueryToURL, "{\n            if (BuildV…)\n            }\n        }");
            return urlAppendPathAndQueryToURL;
        } catch (MalformedURLException e) {
            Logger.error(TAG, "appendPathToURL failed", e);
            throw e;
        } catch (URISyntaxException e2) {
            Logger.error(TAG, "appendPathToURL failed", e2);
            throw e2;
        }
    }

    @Override // com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectoryOAuth2Configuration
    public final URL getAuthorityUrl() {
        return this.f88405OooO0O0 ? new URL("https://native-auth-mock-api.azurewebsites.net/lumonconvergedps.onmicrosoft.com") : this.f88404OooO00o;
    }
}
