package com.microsoft.identity.client.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.microsoft.identity.client.AcquireTokenParameters;
import com.microsoft.identity.client.AcquireTokenSilentParameters;
import com.microsoft.identity.client.DeviceCodeFlowParameters;
import com.microsoft.identity.client.IAccount;
import com.microsoft.identity.client.ITenantProfile;
import com.microsoft.identity.client.MultiTenantAccount;
import com.microsoft.identity.client.PoPAuthenticationScheme;
import com.microsoft.identity.client.PublicClientApplication;
import com.microsoft.identity.client.PublicClientApplicationConfiguration;
import com.microsoft.identity.client.claims.ClaimsRequest;
import com.microsoft.identity.client.claims.RequestedClaimAdditionalInformation;
import com.microsoft.identity.common.components.AndroidPlatformComponentsFactory;
import com.microsoft.identity.common.internal.commands.parameters.AndroidActivityInteractiveTokenCommandParameters;
import com.microsoft.identity.common.internal.util.StringUtil;
import com.microsoft.identity.common.java.authorities.Authority;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAuthority;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryB2CAuthority;
import com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme;
import com.microsoft.identity.common.java.authscheme.AuthenticationSchemeFactory;
import com.microsoft.identity.common.java.authscheme.BearerAuthenticationSchemeInternal;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.commands.parameters.DeviceCodeFlowCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.GenerateShrCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.InteractiveTokenCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.RemoveAccountCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.SilentTokenCommandParameters;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.microsoft.identity.common.java.dto.AccountRecord;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.logging.DiagnosticContext;
import com.microsoft.identity.common.java.p591ui.AuthorizationAgent;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2TokenCache;
import com.microsoft.identity.common.java.providers.oauth2.OpenIdConnectPromptParameter;
import com.microsoft.identity.common.java.request.SdkType;
import com.microsoft.identity.common.java.util.SchemaUtil;
import com.microsoft.identity.common.logging.Logger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o0O0OOOo.OooO00o;
import o0O0OOo.C25882OooO00o;
import o0O0OOo.C25883OooO0Oo;
import o0O0OOo.C25884OooO0o0;
import o0O0OOo.C25885OooO0oO;
import o0O0OOo.C25886OooO0oo;
import o0O0OOo.C25887OooOO0o;
import o0O0OOo.C25888OooOOOo;
import o0O0OOo.C25889OooOOo;
import o0O0OOo.C25890OooOOo0;
import o0O0OOo.OooO;
import o0O0OOo.OooO0o;
import o0O0OOo.OooOO0;
import o0O0OOo.OooOO0O;
import o0O0OOo.OooOOO;
import o0O0OOo.OooOOOO;
import o0OooO0.C29573OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public class CommandParametersAdapter {
    public static final String CLIENT_CAPABILITIES_CLAIM = "xms_cc";
    private static final String TAG = "CommandParametersAdapter";

    public static ClaimsRequest addClientCapabilitiesToClaimsRequest(ClaimsRequest claimsRequest, String str) {
        if (claimsRequest == null) {
            claimsRequest = new ClaimsRequest();
        }
        if (str != null) {
            RequestedClaimAdditionalInformation requestedClaimAdditionalInformation = new RequestedClaimAdditionalInformation();
            requestedClaimAdditionalInformation.setValues(new ArrayList(Arrays.asList(str.split(","))));
            claimsRequest.requestClaimInAccessToken("xms_cc", requestedClaimAdditionalInformation);
        }
        return claimsRequest;
    }

    public static List<Map.Entry<String, String>> appendToExtraQueryParametersIfWebAuthnCapable(List<Map.Entry<String, String>> list, PublicClientApplicationConfiguration publicClientApplicationConfiguration) {
        if (publicClientApplicationConfiguration.isWebauthnCapable().booleanValue()) {
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(FidoConstants.WEBAUTHN_QUERY_PARAMETER_FIELD, "1");
            if (list == null) {
                return new ArrayList(Collections.singletonList(simpleEntry));
            }
            if (!list.contains(simpleEntry)) {
                try {
                    list.add(simpleEntry);
                    return list;
                } catch (UnsupportedOperationException unused) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add(simpleEntry);
                    return arrayList;
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25882OooO00o createAcquireTokenNoFixedScopesCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, AccountRecord accountRecord, Boolean bool, String str) throws ClientException {
        OooO00o oooO00o = (OooO00o) publicClientApplicationConfiguration.getDefaultAuthority();
        BearerAuthenticationSchemeInternal bearerAuthenticationSchemeInternal = new BearerAuthenticationSchemeInternal();
        C25882OooO00o.AbstractC19728OooO00o abstractC19728OooO00o = (C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) new C25882OooO00o.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext()))).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName())).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext()))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).oAuth2TokenCache(oAuth2TokenCache)).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion());
        abstractC19728OooO00o.f88356OooO00o = oooO00o;
        C25882OooO00o.AbstractC19728OooO00o abstractC19728OooO00o2 = (C25882OooO00o.AbstractC19728OooO00o) abstractC19728OooO00o.self();
        abstractC19728OooO00o2.f88352OooO0Oo = bearerAuthenticationSchemeInternal;
        C25882OooO00o.OooO0O0 oooO0O0Self = abstractC19728OooO00o2.self();
        oooO0O0Self.f88353OooO0o0 = bool.booleanValue();
        oooO0O0Self.f88351OooO0OO = accountRecord;
        return ((C25882OooO00o.AbstractC19728OooO00o) ((C25882OooO00o.AbstractC19728OooO00o) oooO0O0Self.correlationId(str)).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).build();
    }

    public static CommandParameters createCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache) {
        return CommandParameters.builder().platformComponents(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext())).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName()).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext())).clientId(publicClientApplicationConfiguration.getClientId()).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice()).oAuth2TokenCache(oAuth2TokenCache).redirectUri(publicClientApplicationConfiguration.getRedirectUri()).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion()).sdkType(SdkType.MSAL).sdkVersion(PublicClientApplication.getSdkVersion()).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue()).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DeviceCodeFlowCommandParameters createDeviceCodeFlowCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, List<String> list) {
        return ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) DeviceCodeFlowCommandParameters.builder().platformComponents(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext()))).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName())).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext()))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).authenticationScheme(new BearerAuthenticationSchemeInternal())).scopes(new HashSet(list))).authority(publicClientApplicationConfiguration.getDefaultAuthority())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DeviceCodeFlowCommandParameters createDeviceCodeFlowWithClaimsCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, DeviceCodeFlowParameters deviceCodeFlowParameters) {
        return ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) ((DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder) DeviceCodeFlowCommandParameters.builder().platformComponents(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext()))).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName())).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext()))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).authenticationScheme(new BearerAuthenticationSchemeInternal())).scopes(new HashSet(deviceCodeFlowParameters.getScopes()))).authority(publicClientApplicationConfiguration.getDefaultAuthority())).claimsRequestJson(ClaimsRequest.getJsonStringFromClaimsRequest(deviceCodeFlowParameters.getClaimsRequest()))).correlationId(deviceCodeFlowParameters.getCorrelationId())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GenerateShrCommandParameters createGenerateShrCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, String str, PoPAuthenticationScheme poPAuthenticationScheme) {
        Context appContext = publicClientApplicationConfiguration.getAppContext();
        return ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) ((GenerateShrCommandParameters.GenerateShrCommandParametersBuilder) GenerateShrCommandParameters.builder().platformComponents(AndroidPlatformComponentsFactory.createFromContext(appContext))).applicationName(appContext.getPackageName())).applicationVersion(getPackageVersion(appContext))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).homeAccountId(str).popParameters(poPAuthenticationScheme).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InteractiveTokenCommandParameters createInteractiveTokenCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, AcquireTokenParameters acquireTokenParameters) throws ClientException {
        AbstractAuthenticationScheme abstractAuthenticationSchemeCreateScheme = AuthenticationSchemeFactory.createScheme(AndroidPlatformComponentsFactory.createFromContext(acquireTokenParameters.getActivity()), acquireTokenParameters.getAuthenticationScheme());
        Authority authority = getAuthority(publicClientApplicationConfiguration, acquireTokenParameters);
        return ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) ((AndroidActivityInteractiveTokenCommandParameters.AndroidActivityInteractiveTokenCommandParametersBuilder) AndroidActivityInteractiveTokenCommandParameters.builder().activity(acquireTokenParameters.getActivity()).platformComponents(AndroidPlatformComponentsFactory.createFromActivity(acquireTokenParameters.getActivity(), acquireTokenParameters.getFragment()))).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName())).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext()))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).oAuth2TokenCache(oAuth2TokenCache)).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).preferredBrowser(publicClientApplicationConfiguration.getPreferredBrowser())).browserSafeList(publicClientApplicationConfiguration.getBrowserSafeList())).authority(authority)).claimsRequestJson(ClaimsRequest.getJsonStringFromClaimsRequest(getClaimsRequest(acquireTokenParameters.getClaimsRequest(), publicClientApplicationConfiguration, authority)))).forceRefresh(acquireTokenParameters.getClaimsRequest() != null)).scopes(new HashSet(acquireTokenParameters.getScopes()))).extraScopesToConsent(acquireTokenParameters.getExtraScopesToConsent())).extraQueryStringParameters(appendToExtraQueryParametersIfWebAuthnCapable(acquireTokenParameters.getExtraQueryStringParameters(), publicClientApplicationConfiguration))).loginHint(getLoginHint(acquireTokenParameters))).account(acquireTokenParameters.getAccountRecord())).authenticationScheme(abstractAuthenticationSchemeCreateScheme)).authorizationAgent(getAuthorizationAgent(publicClientApplicationConfiguration))).brokerBrowserSupportEnabled(getBrokerBrowserSupportEnabled(acquireTokenParameters))).prompt(getPromptParameter(acquireTokenParameters))).isWebViewZoomControlsEnabled(publicClientApplicationConfiguration.isWebViewZoomControlsEnabled())).isWebViewZoomEnabled(publicClientApplicationConfiguration.isWebViewZoomEnabled())).handleNullTaskAffinity(publicClientApplicationConfiguration.isHandleNullTaskAffinityEnabled().booleanValue())).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).correlationId(acquireTokenParameters.getCorrelationId())).preferredAuthMethod(acquireTokenParameters.getPreferredAuthMethod())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoveAccountCommandParameters createRemoveAccountCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, AccountRecord accountRecord) {
        return ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) ((RemoveAccountCommandParameters.RemoveAccountCommandParametersBuilder) RemoveAccountCommandParameters.builder().platformComponents(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext()))).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName())).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext()))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).oAuth2TokenCache(oAuth2TokenCache)).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).account(accountRecord).browserSafeList(publicClientApplicationConfiguration.getBrowserSafeList()).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25883OooO0Oo createResetPasswordResendCodeCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25883OooO0Oo.OooO00o oooO00o2 = (C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) new C25883OooO0Oo.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25883OooO0Oo.OooO00o oooO00o3 = (C25883OooO0Oo.OooO00o) oooO00o2.self();
        oooO00o3.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        C25883OooO0Oo.OooO00o oooO00o4 = (C25883OooO0Oo.OooO00o) oooO00o3.self();
        if (str2 != null) {
            oooO00o4.f88363OooO0OO = str2;
            return ((C25883OooO0Oo.OooO00o) ((C25883OooO0Oo.OooO00o) oooO00o4.self().clientId(c29573OooO0OO.getClientId())).correlationId(str)).build();
        }
        oooO00o4.getClass();
        throw new NullPointerException("continuationToken is marked non-null but is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25884OooO0o0 createResetPasswordStartCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25884OooO0o0.OooO00o oooO00o2 = (C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) new C25884OooO0o0.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25884OooO0o0.OooO00o oooO00o3 = (C25884OooO0o0.OooO00o) oooO00o2.self();
        if (str == null) {
            oooO00o3.getClass();
            throw new NullPointerException("username is marked non-null but is null");
        }
        oooO00o3.f88369OooO0OO = str;
        C25884OooO0o0.OooO0O0 oooO0O0Self = oooO00o3.self();
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        return ((C25884OooO0o0.OooO00o) ((C25884OooO0o0.OooO00o) oooO0O0Self.clientId(c29573OooO0OO.getClientId())).correlationId(DiagnosticContext.INSTANCE.getThreadCorrelationId())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooO0o createResetPasswordSubmitCodeCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, String str3) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        OooO0o.OooO00o oooO00o2 = (OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) ((OooO0o.OooO00o) new OooO0o.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        OooO0o.OooO00o oooO00o3 = (OooO0o.OooO00o) oooO00o2.self();
        if (str == null) {
            oooO00o3.getClass();
            throw new NullPointerException("code is marked non-null but is null");
        }
        oooO00o3.f88366OooO0OO = str;
        OooO0o.OooO0O0 oooO0O0Self = oooO00o3.self();
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        if (str3 == null) {
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        oooO0O0Self.f88367OooO0Oo = str3;
        return ((OooO0o.OooO00o) ((OooO0o.OooO00o) oooO0O0Self.self().clientId(c29573OooO0OO.getClientId())).correlationId(str2)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25885OooO0oO createResetPasswordSubmitNewPasswordCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, char[] cArr) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25885OooO0oO.OooO00o oooO00o2 = (C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) new C25885OooO0oO.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25885OooO0oO.OooO00o oooO00o3 = (C25885OooO0oO.OooO00o) oooO00o2.self();
        if (str == null) {
            oooO00o3.getClass();
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        oooO00o3.f88373OooO0Oo = str;
        C25885OooO0oO.OooO0O0 oooO0O0Self = oooO00o3.self();
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        if (cArr == null) {
            throw new NullPointerException("newPassword is marked non-null but is null");
        }
        oooO0O0Self.f88372OooO0OO = cArr;
        return ((C25885OooO0oO.OooO00o) ((C25885OooO0oO.OooO00o) oooO0O0Self.self().clientId(c29573OooO0OO.getClientId())).correlationId(str2)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25886OooO0oo createSignInResendCodeCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25886OooO0oo.OooO00o oooO00o2 = (C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) ((C25886OooO0oo.OooO00o) new C25886OooO0oo.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25886OooO0oo.OooO00o oooO00o3 = (C25886OooO0oo.OooO00o) oooO00o2.self();
        oooO00o3.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        C25886OooO0oo.OooO00o oooO00o4 = (C25886OooO0oo.OooO00o) oooO00o3.self();
        if (str2 == null) {
            oooO00o4.getClass();
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        oooO00o4.f88375OooO0OO = str2;
        C25886OooO0oo.OooO0O0 oooO0O0Self = oooO00o4.self();
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        return ((C25886OooO0oo.OooO00o) oooO0O0Self.correlationId(str)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooO createSignInStartCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, char[] cArr, List<String> list) throws ClientException {
        AbstractAuthenticationScheme abstractAuthenticationSchemeCreateScheme = AuthenticationSchemeFactory.createScheme(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()), null);
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        OooO.OooO00o oooO00o2 = (OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) ((OooO.OooO00o) new OooO.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        OooO.OooO00o oooO00o3 = (OooO.OooO00o) oooO00o2.self();
        if (str == null) {
            oooO00o3.getClass();
            throw new NullPointerException("username is marked non-null but is null");
        }
        oooO00o3.f88347OooO0o0 = str;
        OooO.OooO0O0 OooO0o02 = oooO00o3.OooO0o0();
        OooO0o02.f88346OooO0o = cArr;
        OooO0o02.f88361OooO0Oo = abstractAuthenticationSchemeCreateScheme;
        OooO.OooO00o oooO00o4 = (OooO.OooO00o) OooO0o02.clientId(c29573OooO0OO.getClientId());
        oooO00o4.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        OooO.OooO00o oooO00o5 = (OooO.OooO00o) oooO00o4.self();
        oooO00o5.f88360OooO0OO = list;
        return ((OooO.OooO00o) ((OooO.OooO00o) oooO00o5.self()).correlationId(DiagnosticContext.INSTANCE.getThreadCorrelationId())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooOO0 createSignInSubmitCodeCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, String str3, List<String> list) throws ClientException {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        AbstractAuthenticationScheme abstractAuthenticationSchemeCreateScheme = AuthenticationSchemeFactory.createScheme(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()), null);
        OooOO0.OooO00o oooO00o2 = (OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) ((OooOO0.OooO00o) new OooOO0.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        OooOO0.OooO00o oooO00o3 = (OooOO0.OooO00o) oooO00o2.self();
        if (str2 == null) {
            oooO00o3.getClass();
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        oooO00o3.f88378OooO0o = str2;
        OooOO0.OooO0O0 oooO0O0Self = oooO00o3.self();
        oooO0O0Self.f88361OooO0Oo = abstractAuthenticationSchemeCreateScheme;
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        OooOO0.OooO0O0 oooO0O0 = oooO0O0Self;
        if (str == null) {
            throw new NullPointerException("code is marked non-null but is null");
        }
        oooO0O0.f88379OooO0o0 = str;
        OooOO0.OooO0O0 oooO0O0Self2 = oooO0O0.self();
        oooO0O0Self2.f88360OooO0OO = list;
        return ((OooOO0.OooO00o) oooO0O0Self2.correlationId(str3)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooOO0O createSignInSubmitPasswordCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, char[] cArr, String str2, List<String> list) throws ClientException {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        AbstractAuthenticationScheme abstractAuthenticationSchemeCreateScheme = AuthenticationSchemeFactory.createScheme(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()), null);
        OooOO0O.OooO00o oooO00o2 = (OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) ((OooOO0O.OooO00o) new OooOO0O.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        OooOO0O.OooO00o oooO00o3 = (OooOO0O.OooO00o) oooO00o2.self();
        oooO00o3.f88361OooO0Oo = abstractAuthenticationSchemeCreateScheme;
        OooOO0O.OooO00o oooO00o4 = (OooOO0O.OooO00o) oooO00o3.self();
        if (str == null) {
            oooO00o4.getClass();
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        oooO00o4.f88382OooO0o = str;
        OooOO0O.OooO0O0 oooO0O0Self = oooO00o4.self();
        if (cArr == null) {
            throw new NullPointerException("password is marked non-null but is null");
        }
        oooO0O0Self.f88383OooO0o0 = cArr;
        oooO0O0Self.f88360OooO0OO = list;
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        return ((OooOO0O.OooO00o) oooO0O0Self.correlationId(str2)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25887OooOO0o createSignInWithContinuationTokenCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, String str3, List<String> list) throws ClientException {
        AbstractAuthenticationScheme abstractAuthenticationSchemeCreateScheme = AuthenticationSchemeFactory.createScheme(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()), null);
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25887OooOO0o.OooO00o oooO00o2 = (C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) new C25887OooOO0o.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25887OooOO0o.OooO00o oooO00o3 = (C25887OooOO0o.OooO00o) oooO00o2.self();
        if (str == null) {
            oooO00o3.getClass();
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        oooO00o3.f88387OooO0o0 = str;
        C25887OooOO0o.OooO0O0 oooO0O0Self = oooO00o3.self();
        if (str2 == null) {
            throw new NullPointerException("username is marked non-null but is null");
        }
        oooO0O0Self.f88386OooO0o = str2;
        oooO0O0Self.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        oooO0O0Self.f88361OooO0Oo = abstractAuthenticationSchemeCreateScheme;
        C25887OooOO0o.OooO0O0 oooO0O0 = oooO0O0Self;
        oooO0O0.f88360OooO0OO = list;
        return ((C25887OooOO0o.OooO00o) ((C25887OooOO0o.OooO00o) oooO0O0.self()).correlationId(str3)).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooOOO createSignUpResendCodeCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        OooOOO.OooO00o oooO00o2 = (OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) ((OooOOO.OooO00o) new OooOOO.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        OooOOO.OooO00o oooO00o3 = (OooOOO.OooO00o) oooO00o2.self();
        oooO00o3.f88356OooO00o = oooO00o;
        OooOOO.OooO00o oooO00o4 = (OooOOO.OooO00o) oooO00o3.self();
        if (str != null) {
            oooO00o4.f88389OooO0OO = str;
            return ((OooOOO.OooO00o) oooO00o4.self().correlationId(str2)).build();
        }
        oooO00o4.getClass();
        throw new NullPointerException("continuationToken is marked non-null but is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25889OooOOo createSignUpStarSubmitUserAttributesCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, Map<String, String> map) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25889OooOOo.OooO00o oooO00o2 = (C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) new C25889OooOOo.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25889OooOOo.OooO00o oooO00o3 = (C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) oooO00o2.self()).clientId(c29573OooO0OO.getClientId());
        oooO00o3.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        C25889OooOOo.OooO00o oooO00o4 = (C25889OooOOo.OooO00o) ((C25889OooOOo.OooO00o) oooO00o3.self()).OooO0Oo(str);
        if (map != null) {
            oooO00o4.f88401OooO0Oo = map;
            return ((C25889OooOOo.OooO00o) oooO00o4.self().correlationId(str2)).build();
        }
        oooO00o4.getClass();
        throw new NullPointerException("userAttributes is marked non-null but is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OooOOOO createSignUpStartCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, char[] cArr, Map<String, String> map) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        OooOOOO.OooO00o oooO00o2 = (OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) ((OooOOOO.OooO00o) new OooOOOO.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        OooOOOO.OooO00o oooO00o3 = (OooOOOO.OooO00o) oooO00o2.self();
        if (str == null) {
            oooO00o3.getClass();
            throw new NullPointerException("username is marked non-null but is null");
        }
        oooO00o3.f88395OooO0OO = str;
        OooOOOO.OooO0O0 OooO0O02 = oooO00o3.OooO0O0();
        OooO0O02.f88397OooO0o0 = cArr;
        OooO0O02.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        OooO0O02.f88396OooO0Oo = map;
        return ((OooOOOO.OooO00o) OooO0O02.OooO0O0().correlationId(DiagnosticContext.INSTANCE.getThreadCorrelationId())).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25888OooOOOo createSignUpSubmitCodeCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, String str3) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25888OooOOOo.OooO00o oooO00o2 = (C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) new C25888OooOOOo.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25888OooOOOo.OooO00o oooO00o3 = (C25888OooOOOo.OooO00o) oooO00o2.self();
        oooO00o3.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        C25888OooOOOo.OooO00o oooO00o4 = (C25888OooOOOo.OooO00o) ((C25888OooOOOo.OooO00o) oooO00o3.self()).OooO0Oo(str2);
        if (str != null) {
            oooO00o4.f88399OooO0Oo = str;
            return ((C25888OooOOOo.OooO00o) oooO00o4.OooO0Oo().correlationId(str3)).build();
        }
        oooO00o4.getClass();
        throw new NullPointerException("code is marked non-null but is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C25890OooOOo0 createSignUpSubmitPasswordCommandParameters(C29573OooO0OO c29573OooO0OO, OAuth2TokenCache oAuth2TokenCache, String str, String str2, char[] cArr) {
        OooO00o oooO00o = (OooO00o) c29573OooO0OO.getDefaultAuthority();
        C25890OooOOo0.OooO00o oooO00o2 = (C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) new C25890OooOOo0.OooO0O0().platformComponents(AndroidPlatformComponentsFactory.createFromContext(c29573OooO0OO.getAppContext()))).applicationName(c29573OooO0OO.getAppContext().getPackageName())).applicationVersion(getPackageVersion(c29573OooO0OO.getAppContext()))).clientId(c29573OooO0OO.getClientId())).isSharedDevice(c29573OooO0OO.getIsSharedDevice())).redirectUri(c29573OooO0OO.getRedirectUri())).oAuth2TokenCache(oAuth2TokenCache)).requiredBrokerProtocolVersion(c29573OooO0OO.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).powerOptCheckEnabled(c29573OooO0OO.isPowerOptCheckForEnabled().booleanValue());
        oooO00o2.f88356OooO00o = oooO00o;
        C25890OooOOo0.OooO00o oooO00o3 = (C25890OooOOo0.OooO00o) oooO00o2.self();
        oooO00o3.f88357OooO0O0 = c29573OooO0OO.OooO00o();
        C25890OooOOo0.OooO00o oooO00o4 = (C25890OooOOo0.OooO00o) ((C25890OooOOo0.OooO00o) oooO00o3.self()).OooO0Oo(str);
        if (cArr != null) {
            oooO00o4.f88403OooO0Oo = cArr;
            return ((C25890OooOOo0.OooO00o) oooO00o4.OooO0o0().correlationId(str2)).build();
        }
        oooO00o4.getClass();
        throw new NullPointerException("password is marked non-null but is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SilentTokenCommandParameters createSilentTokenCommandParameters(PublicClientApplicationConfiguration publicClientApplicationConfiguration, OAuth2TokenCache oAuth2TokenCache, AcquireTokenSilentParameters acquireTokenSilentParameters) throws ClientException {
        Authority authority = getAuthority(publicClientApplicationConfiguration, acquireTokenSilentParameters);
        ClaimsRequest claimsRequest = acquireTokenSilentParameters.getClaimsRequest();
        String jsonStringFromClaimsRequest = ClaimsRequest.getJsonStringFromClaimsRequest(getClaimsRequest(acquireTokenSilentParameters.getClaimsRequest(), publicClientApplicationConfiguration, authority));
        return ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) ((SilentTokenCommandParameters.SilentTokenCommandParametersBuilder) SilentTokenCommandParameters.builder().platformComponents(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext()))).applicationName(publicClientApplicationConfiguration.getAppContext().getPackageName())).applicationVersion(getPackageVersion(publicClientApplicationConfiguration.getAppContext()))).clientId(publicClientApplicationConfiguration.getClientId())).isSharedDevice(publicClientApplicationConfiguration.getIsSharedDevice())).oAuth2TokenCache(oAuth2TokenCache)).redirectUri(publicClientApplicationConfiguration.getRedirectUri())).requiredBrokerProtocolVersion(publicClientApplicationConfiguration.getRequiredBrokerProtocolVersion())).sdkType(SdkType.MSAL)).sdkVersion(PublicClientApplication.getSdkVersion())).authority(authority)).claimsRequestJson(jsonStringFromClaimsRequest)).forceRefresh(claimsRequest != null || acquireTokenSilentParameters.getForceRefresh())).account(acquireTokenSilentParameters.getAccountRecord())).authenticationScheme(AuthenticationSchemeFactory.createScheme(AndroidPlatformComponentsFactory.createFromContext(publicClientApplicationConfiguration.getAppContext()), acquireTokenSilentParameters.getAuthenticationScheme()))).scopes(new HashSet(acquireTokenSilentParameters.getScopes()))).powerOptCheckEnabled(publicClientApplicationConfiguration.isPowerOptCheckForEnabled().booleanValue())).correlationId(acquireTokenSilentParameters.getCorrelationId())).build();
    }

    private static Authority getAuthority(PublicClientApplicationConfiguration publicClientApplicationConfiguration, AcquireTokenParameters acquireTokenParameters) {
        Authority requestAuthority = StringUtil.isEmpty(acquireTokenParameters.getAuthority()) ? acquireTokenParameters.getAccount() != null ? getRequestAuthority(publicClientApplicationConfiguration) : publicClientApplicationConfiguration.getDefaultAuthority() : Authority.getAuthorityFromAuthorityUrl(acquireTokenParameters.getAuthority());
        if (requestAuthority instanceof AzureActiveDirectoryAuthority) {
            ((AzureActiveDirectoryAuthority) requestAuthority).setMultipleCloudsSupported(publicClientApplicationConfiguration.getMultipleCloudsSupported().booleanValue());
        }
        return requestAuthority;
    }

    private static AuthorizationAgent getAuthorizationAgent(PublicClientApplicationConfiguration publicClientApplicationConfiguration) {
        return publicClientApplicationConfiguration.getAuthorizationAgent() != null ? publicClientApplicationConfiguration.getAuthorizationAgent() : AuthorizationAgent.DEFAULT;
    }

    private static boolean getBrokerBrowserSupportEnabled(AcquireTokenParameters acquireTokenParameters) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getBrokerBrowserSupportEnabled");
        if (!(acquireTokenParameters instanceof IntuneAcquireTokenParameters)) {
            return false;
        }
        boolean zIsBrokerBrowserSupportEnabled = ((IntuneAcquireTokenParameters) acquireTokenParameters).isBrokerBrowserSupportEnabled();
        Logger.info(strOooO0OO, " IntuneAcquireTokenParameters instance, broker browser enabled : " + zIsBrokerBrowserSupportEnabled);
        return zIsBrokerBrowserSupportEnabled;
    }

    private static ClaimsRequest getClaimsRequest(ClaimsRequest claimsRequest, PublicClientApplicationConfiguration publicClientApplicationConfiguration, Authority authority) {
        return authority instanceof AzureActiveDirectoryAuthority ? addClientCapabilitiesToClaimsRequest(claimsRequest, publicClientApplicationConfiguration.getClientCapabilities()) : claimsRequest;
    }

    private static String getLoginHint(AcquireTokenParameters acquireTokenParameters) {
        return acquireTokenParameters.getAccount() != null ? getUsername(acquireTokenParameters.getAccount()) : acquireTokenParameters.getLoginHint();
    }

    private static String getPackageVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static OpenIdConnectPromptParameter getPromptParameter(AcquireTokenParameters acquireTokenParameters) {
        return acquireTokenParameters.getPrompt() == null ? OpenIdConnectPromptParameter.SELECT_ACCOUNT : acquireTokenParameters.getPrompt().toOpenIdConnectPromptParameter();
    }

    public static Authority getRequestAuthority(PublicClientApplicationConfiguration publicClientApplicationConfiguration) {
        String string = publicClientApplicationConfiguration.getDefaultAuthority() instanceof AzureActiveDirectoryB2CAuthority ? publicClientApplicationConfiguration.getDefaultAuthority().getAuthorityURL().toString() : null;
        return string == null ? publicClientApplicationConfiguration.getDefaultAuthority() : Authority.getAuthorityFromAuthorityUrl(string);
    }

    private static String getUsername(IAccount iAccount) {
        if (iAccount.getClaims() != null) {
            return SchemaUtil.getDisplayableId(iAccount.getClaims());
        }
        for (Map.Entry<String, ITenantProfile> entry : ((MultiTenantAccount) iAccount).getTenantProfiles().entrySet()) {
            if (entry.getValue().getClaims() != null) {
                String displayableId = SchemaUtil.getDisplayableId(entry.getValue().getClaims());
                if (!SchemaUtil.MISSING_FROM_THE_TOKEN_RESPONSE.equalsIgnoreCase(displayableId)) {
                    return displayableId;
                }
            }
        }
        return null;
    }

    private static Authority getAuthority(PublicClientApplicationConfiguration publicClientApplicationConfiguration, AcquireTokenSilentParameters acquireTokenSilentParameters) {
        Authority authorityFromAuthorityUrl = Authority.getAuthorityFromAuthorityUrl(acquireTokenSilentParameters.getAuthority());
        if (authorityFromAuthorityUrl instanceof AzureActiveDirectoryAuthority) {
            ((AzureActiveDirectoryAuthority) authorityFromAuthorityUrl).setMultipleCloudsSupported(publicClientApplicationConfiguration.getMultipleCloudsSupported().booleanValue());
        }
        return authorityFromAuthorityUrl;
    }
}
