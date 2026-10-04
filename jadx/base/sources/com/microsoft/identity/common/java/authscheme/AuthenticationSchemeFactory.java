package com.microsoft.identity.common.java.authscheme;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.java.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class AuthenticationSchemeFactory {
    private static final String TAG = "AuthenticationSchemeFactory";

    public static AbstractAuthenticationScheme createScheme(IPlatformComponents iPlatformComponents, INameable iNameable) throws ClientException {
        if (iPlatformComponents == null) {
            throw new NullPointerException("commonComponents is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":createScheme");
        if (iNameable == null) {
            return new BearerAuthenticationSchemeInternal();
        }
        String name = iNameable.getName();
        name.getClass();
        switch (name) {
            case "PoP_With_Client_Key":
                if (!(iNameable instanceof IPoPAuthenticationSchemeParams)) {
                    throw new IllegalStateException("Unrecognized parameter type.");
                }
                Logger.verbose(strOooO0OO, "Constructing PoP Authentication Scheme With Client Key.");
                return (PopAuthenticationSchemeWithClientKeyInternal) iNameable;
            case "PoP":
                if (!(iNameable instanceof IPoPAuthenticationSchemeParams)) {
                    throw new IllegalStateException("Unrecognized parameter type.");
                }
                Logger.verbose(strOooO0OO, "Constructing PoP Authentication Scheme.");
                IPoPAuthenticationSchemeParams iPoPAuthenticationSchemeParams = (IPoPAuthenticationSchemeParams) iNameable;
                return new PopAuthenticationSchemeInternal(iPlatformComponents.getClockSkewManager(), iPlatformComponents.getDefaultDevicePopManager(), iPoPAuthenticationSchemeParams.getHttpMethod(), iPoPAuthenticationSchemeParams.getUrl(), iPoPAuthenticationSchemeParams.getNonce(), iPoPAuthenticationSchemeParams.getClientClaims());
            case "Bearer":
                Logger.verbose(strOooO0OO, "Constructing Bearer Authentication Scheme.");
                return new BearerAuthenticationSchemeInternal();
            default:
                throw new UnsupportedOperationException("Unknown or unsupported scheme: " + iNameable.getName());
        }
    }

    public static boolean isPopAuthenticationScheme(AbstractAuthenticationScheme abstractAuthenticationScheme) {
        if (abstractAuthenticationScheme != null) {
            return abstractAuthenticationScheme instanceof IPoPAuthenticationSchemeParams;
        }
        throw new NullPointerException("authenticationScheme is marked non-null but is null");
    }
}
