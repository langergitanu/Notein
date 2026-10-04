package o0OooO0;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.client.PublicClientApplicationConfiguration;
import com.microsoft.identity.client.configuration.AccountMode;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.common.java.authorities.CIAMAuthority;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OooO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m80612d2 = {"Lo0OooO0/OooO0OO;", "Lcom/microsoft/identity/client/PublicClientApplicationConfiguration;", "Ljava/io/Serializable;", "<init>", "()V", "", "", "OooOo0o", "Ljava/util/List;", "challengeTypes", "", "OooOo", "Ljava/lang/Boolean;", "OooO0OO", "()Ljava/lang/Boolean;", "setUseMockAuthority", "(Ljava/lang/Boolean;)V", "useMockAuthority", "OooOoO0", "Ljava/lang/String;", "OooO0O0", "()Ljava/lang/String;", "setDc", "(Ljava/lang/String;)V", AzureActiveDirectorySlice.DC_PARAMETER, "msal_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class C29573OooO0OO extends PublicClientApplicationConfiguration implements Serializable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final List<String> f104893OooOoO = C34429OooOOo0.OooOO0o("password", "oob", "redirect");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("use_mock_api_for_native_auth")
    private Boolean useMockAuthority;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("challenge_types")
    private List<String> challengeTypes;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(AzureActiveDirectorySlice.DC_PARAMETER)
    private String dc;

    public final List<String> OooO00o() {
        return this.challengeTypes;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final String getDc() {
        return this.dc;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final Boolean getUseMockAuthority() {
        return this.useMockAuthority;
    }

    public final void OooO0Oo(C29573OooO0OO config) {
        OooOOO0.OooO0oO(config, "config");
        super.mergeConfiguration(config);
        setAccountMode(config.getAccountMode() != null ? config.getAccountMode() : getAccountMode());
        List<String> list = config.challengeTypes;
        if (list == null) {
            list = this.challengeTypes;
        }
        this.challengeTypes = list;
        Boolean bool = config.useMockAuthority;
        if (bool == null) {
            bool = this.useMockAuthority;
        }
        this.useMockAuthority = bool;
        String str = config.dc;
        if (str == null) {
            str = this.dc;
        }
        this.dc = str;
    }

    public final void OooO0o0(List<String> list) {
        this.challengeTypes = list;
    }

    @Override // com.microsoft.identity.client.PublicClientApplicationConfiguration
    public final void checkIntentFilterAddedToAppManifestForBrokerFlow() throws MsalClientException {
        if (getRedirectUri() != null) {
            super.checkIntentFilterAddedToAppManifestForBrokerFlow();
        }
    }

    @Override // com.microsoft.identity.client.PublicClientApplicationConfiguration
    public final void validateConfiguration() throws MsalClientException {
        ArrayList<String> arrayList;
        if (TextUtils.isEmpty(getClientId())) {
            throw new MsalClientException(MsalClientException.NATIVE_AUTH_USE_WITHOUT_CLIENT_ID_ERROR_CODE, MsalClientException.NATIVE_AUTH_USE_WITHOUT_CLIENT_ID_ERROR_MESSAGE);
        }
        if (getRedirectUri() != null) {
            super.validateConfiguration();
        } else {
            Logger.warn("OooO0OO", "No redirect URI was passed.");
        }
        if (getAccountMode() != AccountMode.SINGLE) {
            throw new MsalClientException(MsalClientException.NATIVE_AUTH_INVALID_ACCOUNT_MODE_CONFIG_ERROR_CODE, MsalClientException.NATIVE_AUTH_INVALID_ACCOUNT_MODE_CONFIG_ERROR_MESSAGE);
        }
        if (getAuthorities() == null || getAuthorities().size() == 0) {
            throw new MsalClientException(MsalClientException.NATIVE_AUTH_USE_WITH_NO_AUTHORITY_ERROR_CODE, MsalClientException.NATIVE_AUTH_USE_WITH_NO_AUTHORITY_ERROR_MESSAGE);
        }
        if (getAuthorities().size() > 1) {
            throw new MsalClientException(MsalClientException.NATIVE_AUTH_USE_WITH_MULTI_AUTHORITY_ERROR_CODE, MsalClientException.NATIVE_AUTH_USE_WITH_MULTI_AUTHORITY_ERROR_MESSAGE);
        }
        if (!(getDefaultAuthority() instanceof o0O0OOOo.OooO00o)) {
            if (!(getDefaultAuthority() instanceof CIAMAuthority)) {
                throw new MsalClientException("native_auth_invalid_ciam_authority", MsalClientException.NATIVE_AUTH_INVALID_CIAM_AUTHORITY_ERROR_MESSAGE);
            }
            String string = getDefaultAuthority().getAuthorityUri().toString();
            OooOOO0.OooO0o(string, "defaultAuthority.authorityUri.toString()");
            String clientId = getClientId();
            OooOOO0.OooO0o(clientId, "clientId");
            o0O0OOOo.OooO00o oooO00o = new o0O0OOOo.OooO00o(string, clientId);
            getAuthorities().clear();
            getAuthorities().add(oooO00o);
        }
        if (getIsSharedDevice()) {
            throw new MsalClientException(MsalClientException.NATIVE_AUTH_SHARED_DEVICE_MODE_ERROR_CODE, MsalClientException.NATIVE_AUTH_SHARED_DEVICE_MODE_ERROR_MESSAGE);
        }
        List<String> list = this.challengeTypes;
        if (list != null) {
            List<String> list2 = list;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                arrayList.add(lowerCase);
            }
        } else {
            arrayList = null;
        }
        this.challengeTypes = arrayList;
        if (arrayList != null) {
            for (String str : arrayList) {
                if (!f104893OooOoO.contains(str)) {
                    throw new MsalClientException(MsalClientException.NATIVE_AUTH_INVALID_CHALLENGE_TYPE_ERROR_CODE, C24684Oooo.OooO00o('\"', "NativeAuthPublicClientApplication detected invalid challenge type. \"", str));
                }
            }
        }
    }
}
