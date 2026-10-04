package com.microsoft.identity.client;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.concurrent.futures.OooO00o;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.hms.network.embedded.C18361t4;
import com.microsoft.identity.client.AcquireTokenParameters;
import com.microsoft.identity.client.AcquireTokenSilentParameters;
import com.microsoft.identity.client.DeviceCodeFlowParameters;
import com.microsoft.identity.client.IPublicClientApplication;
import com.microsoft.identity.client.Logger;
import com.microsoft.identity.client.claims.ClaimsRequest;
import com.microsoft.identity.client.configuration.AccountMode;
import com.microsoft.identity.client.configuration.LoggerConfiguration;
import com.microsoft.identity.client.exception.MsalArgumentException;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.client.exception.MsalException;
import com.microsoft.identity.client.exception.MsalUiRequiredException;
import com.microsoft.identity.client.helper.BrokerHelperActivity;
import com.microsoft.identity.client.internal.AsyncResult;
import com.microsoft.identity.client.internal.CommandParametersAdapter;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.client.internal.controllers.MSALControllerFactory;
import com.microsoft.identity.client.internal.controllers.MsalExceptionAdapter;
import com.microsoft.identity.common.adal.internal.tokensharing.TokenShareUtility;
import com.microsoft.identity.common.components.AndroidPlatformComponentsFactory;
import com.microsoft.identity.common.crypto.AndroidAuthSdkStorageEncryptionManager;
import com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClientFactory;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.BrokerValidator;
import com.microsoft.identity.common.internal.broker.PackageHelper;
import com.microsoft.identity.common.internal.cache.SharedPreferencesFileManager;
import com.microsoft.identity.common.internal.commands.GenerateShrCommand;
import com.microsoft.identity.common.internal.commands.GetDeviceModeCommand;
import com.microsoft.identity.common.internal.commands.GetPreferredAuthMethodFromAuthenticator;
import com.microsoft.identity.common.internal.controllers.LocalMSALController;
import com.microsoft.identity.common.internal.migration.AdalMigrationAdapter;
import com.microsoft.identity.common.internal.migration.TokenMigrationCallback;
import com.microsoft.identity.common.internal.migration.TokenMigrationUtility;
import com.microsoft.identity.common.internal.net.cache.HttpCache;
import com.microsoft.identity.common.internal.telemetry.Telemetry;
import com.microsoft.identity.common.java.authorities.Authority;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAudience;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAuthority;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryB2CAuthority;
import com.microsoft.identity.common.java.authorities.CIAMAuthority;
import com.microsoft.identity.common.java.cache.ICacheRecord;
import com.microsoft.identity.common.java.cache.IShareSingleSignOnState;
import com.microsoft.identity.common.java.cache.MsalOAuth2TokenCache;
import com.microsoft.identity.common.java.commands.CommandCallback;
import com.microsoft.identity.common.java.commands.DeviceCodeFlowCommand;
import com.microsoft.identity.common.java.commands.DeviceCodeFlowCommandCallback;
import com.microsoft.identity.common.java.commands.ICommandResult;
import com.microsoft.identity.common.java.commands.InteractiveTokenCommand;
import com.microsoft.identity.common.java.commands.SilentTokenCommand;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.commands.parameters.InteractiveTokenCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.SilentTokenCommandParameters;
import com.microsoft.identity.common.java.controllers.CommandDispatcher;
import com.microsoft.identity.common.java.controllers.CommandResult;
import com.microsoft.identity.common.java.controllers.ExceptionAdapter;
import com.microsoft.identity.common.java.dto.AccountRecord;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.exception.ServiceException;
import com.microsoft.identity.common.java.opentelemetry.AttributeName;
import com.microsoft.identity.common.java.opentelemetry.OTelUtility;
import com.microsoft.identity.common.java.opentelemetry.OtelContextExtension;
import com.microsoft.identity.common.java.opentelemetry.SpanExtension;
import com.microsoft.identity.common.java.opentelemetry.SpanName;
import com.microsoft.identity.common.java.p591ui.PreferredAuthMethod;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectory;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2TokenCache;
import com.microsoft.identity.common.java.result.GenerateShrResult;
import com.microsoft.identity.common.java.result.ILocalAuthenticationResult;
import com.microsoft.identity.common.java.result.LocalAuthenticationResult;
import com.microsoft.identity.common.java.util.ResultFuture;
import com.microsoft.identity.common.java.util.SchemaUtil;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.msal.BuildConfig;
import com.microsoft.identity.msal.C18753R;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Scope;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.OooOOO0;
import o0OooO0.C29572OooO0O0;
import o0OooO0.C29573OooO0OO;
import o0OooO0.C29574OooO0Oo;
import o0OooO0.InterfaceC29571OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class PublicClientApplication implements IPublicClientApplication, ITokenShare {
    private static final String ACCESS_NETWORK_STATE_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
    private static final String ERR_UNSUPPORTED_OPERATION = "This method is unsupported.";
    private static final String INTERNET_PERMISSION = "android.permission.INTERNET";
    private static final String TAG = "PublicClientApplication";
    private static final String TSL_MSG_FAILED_TO_SAVE = "Failed to save FRT - see getCause() for additional Exception info";
    private static final String TSM_MSG_FAILED_TO_RETRIEVE = "Failed to retrieve FRT - see getCause() for additional Exception info";
    private static final ExecutorService sBackgroundExecutor = Executors.newCachedThreadPool();
    protected PublicClientApplicationConfiguration mPublicClientConfiguration;
    protected TokenShareUtility mTokenShareUtility;
    protected AccountMatcher homeAccountMatcher = new AccountMatcher() { // from class: com.microsoft.identity.client.PublicClientApplication.21
        @Override // com.microsoft.identity.client.PublicClientApplication.AccountMatcher
        public boolean matches(String str, IAccount iAccount) {
            return str.contains(iAccount.getId());
        }
    };
    protected AccountMatcher localAccountMatcher = new AccountMatcher() { // from class: com.microsoft.identity.client.PublicClientApplication.22
        @Override // com.microsoft.identity.client.PublicClientApplication.AccountMatcher
        public boolean matches(String str, IAccount iAccount) {
            Map<String, ITenantProfile> tenantProfiles;
            if (str.contains(iAccount.getId())) {
                return true;
            }
            if (!(iAccount instanceof MultiTenantAccount) || (tenantProfiles = ((MultiTenantAccount) iAccount).getTenantProfiles()) == null || tenantProfiles.isEmpty()) {
                return false;
            }
            for (Map.Entry<String, ITenantProfile> entry : tenantProfiles.entrySet()) {
                if (!TextUtils.isEmpty(entry.getValue().getId()) && str.contains(entry.getValue().getId())) {
                    return true;
                }
            }
            return false;
        }
    };
    protected AccountMatcher usernameMatcher = new AccountMatcher() { // from class: com.microsoft.identity.client.PublicClientApplication.23
        @Override // com.microsoft.identity.client.PublicClientApplication.AccountMatcher
        public boolean matches(String str, IAccount iAccount) {
            ArrayList<IClaimable> arrayList = new ArrayList();
            if (iAccount.getClaims() != null) {
                arrayList.add(iAccount);
            }
            if (iAccount instanceof MultiTenantAccount) {
                for (Map.Entry<String, ITenantProfile> entry : ((MultiTenantAccount) iAccount).getTenantProfiles().entrySet()) {
                    if (entry.getValue().getClaims() != null) {
                        arrayList.add(entry.getValue());
                    }
                }
            }
            for (IClaimable iClaimable : arrayList) {
                if (iClaimable.getClaims() != null && str.equalsIgnoreCase(SchemaUtil.getDisplayableId(iClaimable.getClaims()))) {
                    return true;
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: com.microsoft.identity.client.PublicClientApplication$25 */
    public static /* synthetic */ class C1853325 {

        /* JADX INFO: renamed from: $SwitchMap$com$microsoft$identity$common$java$commands$ICommandResult$ResultStatus */
        static final /* synthetic */ int[] f57061x184111ae;

        static {
            int[] iArr = new int[ICommandResult.ResultStatus.values().length];
            f57061x184111ae = iArr;
            try {
                iArr[ICommandResult.ResultStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57061x184111ae[ICommandResult.ResultStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57061x184111ae[ICommandResult.ResultStatus.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface BrokerDeviceModeCallback {
        void onError(MsalException msalException);

        void onGetMode(boolean z);
    }

    public static class NONNULL_CONSTANTS {
        static final String ACCOUNT = "account";
        static final String ACTIVITY = "activity";
        static final String AUTHORITY = "authority";
        static final String CALLBACK = "callback";
        static final String CHALLENGE_TYPES = "challenge_types";
        static final String CLIENT_ID = "client_id";
        static final String CONFIG_FILE = "config_file";
        static final String CONTEXT = "context";
        static final String LISTENER = "listener";
        static final String NULL_ERROR_SUFFIX = " cannot be null or empty";
        static final String REDIRECT_URI = "redirect_uri";
        static final String SCOPES = "scopes";
    }

    public PublicClientApplication(PublicClientApplicationConfiguration publicClientApplicationConfiguration) throws MsalClientException {
        this.mPublicClientConfiguration = publicClientApplicationConfiguration;
        initializeApplication();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MsalException baseExceptionToMsalException(BaseException baseException) {
        return "no_account_found".equalsIgnoreCase(baseException.getErrorCode()) ? new MsalUiRequiredException("no_account_found", "The supplied account could not be located.") : new MsalClientException(baseException.getErrorCode(), baseException.getMessage());
    }

    public static void checkInternetPermission(PublicClientApplicationConfiguration publicClientApplicationConfiguration) {
        PackageManager packageManager = publicClientApplicationConfiguration.getAppContext().getPackageManager();
        if (packageManager.checkPermission(INTERNET_PERMISSION, publicClientApplicationConfiguration.getAppContext().getPackageName()) != 0 || packageManager.checkPermission(ACCESS_NETWORK_STATE_PERMISSION, publicClientApplicationConfiguration.getAppContext().getPackageName()) != 0) {
            throw new IllegalStateException("android.permission.Internet or android.permission.ACCESS_NETWORK_STATE is missing");
        }
    }

    public static void create(final Context context, final int i, final IPublicClientApplication.ApplicationCreatedListener applicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(applicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.1
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.create(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, i), (String) null, (String) null, (String) null, applicationCreatedListener);
            }
        });
    }

    private GenerateShrCommand createGenerateShrCommand(IAccount iAccount, PoPAuthenticationScheme poPAuthenticationScheme, CommandCallback<GenerateShrResult, BaseException> commandCallback, String str) throws MsalClientException {
        PublicClientApplicationConfiguration publicClientApplicationConfiguration = this.mPublicClientConfiguration;
        return new GenerateShrCommand(CommandParametersAdapter.createGenerateShrCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), ((Account) iAccount).getHomeAccountId(), poPAuthenticationScheme), new MSALControllerFactory(this.mPublicClientConfiguration), commandCallback, str);
    }

    public static void createMultipleAccountPublicClientApplication(final Context context, final int i, final IPublicClientApplication.IMultipleAccountApplicationCreatedListener iMultipleAccountApplicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(iMultipleAccountApplicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.4
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.createMultipleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, i), iMultipleAccountApplicationCreatedListener);
            }
        });
    }

    private static C29572OooO0O0 createNativeAuthApplication(C29573OooO0OO c29573OooO0OO, String str, String str2, String str3, List<String> list) throws BaseException {
        if (str != null) {
            c29573OooO0OO.setClientId(str);
        }
        if (str2 != null) {
            c29573OooO0OO.getAuthorities().clear();
            Authority authorityFromAuthorityUrl = Authority.getAuthorityFromAuthorityUrl(str2);
            authorityFromAuthorityUrl.setDefault(Boolean.TRUE);
            c29573OooO0OO.getAuthorities().add(authorityFromAuthorityUrl);
        }
        if (str3 != null) {
            c29573OooO0OO.setRedirectUri(str3);
        }
        if (list != null) {
            c29573OooO0OO.OooO0o0(list);
        }
        validateAccountModeConfiguration(c29573OooO0OO);
        c29573OooO0OO.setIsSharedDevice(false);
        c29573OooO0OO.validateConfiguration();
        return new C29572OooO0O0(c29573OooO0OO);
    }

    public static InterfaceC29571OooO00o createNativeAuthPublicClientApplication(Context context, int i) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        try {
            OooOOO0.OooO0oO(context, "context");
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            OooOOO0.OooO0o(inputStreamOpenRawResource, "context.resources.openRa…esource(configResourceId)");
            return createNativeAuthApplication(C29574OooO0Oo.OooO00o.OooO0O0(context, C29574OooO0Oo.OooO00o.OooO0OO(inputStreamOpenRawResource, i == C18753R.raw.msal_native_auth_default_config)), null, null, null, null);
        } catch (MsalException e) {
            throw e;
        } catch (BaseException e2) {
            throw new MsalClientException("unknown_error", MsalClientException.NATIVE_AUTH_APPLICATION_CREATION_UNKNOWN_ERROR_MESSAGE, e2);
        }
    }

    public static void createSingleAccountPublicClientApplication(final Context context, final int i, final IPublicClientApplication.ISingleAccountApplicationCreatedListener iSingleAccountApplicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(iSingleAccountApplicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.6
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.createSingleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, i), iSingleAccountApplicationCreatedListener);
            }
        });
    }

    public static CommandCallback<List<ICacheRecord>, BaseException> getLoadAccountsCallback(final IPublicClientApplication.LoadAccountsCallback loadAccountsCallback) {
        return new CommandCallback<List<ICacheRecord>, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.18
            @Override // com.microsoft.identity.common.java.commands.CommandCallback
            public void onCancel() {
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(BaseException baseException) {
                loadAccountsCallback.onError(MsalExceptionAdapter.msalExceptionFromBaseException(baseException));
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(List<ICacheRecord> list) {
                if (list == null) {
                    loadAccountsCallback.onTaskCompleted((List<IAccount>) null);
                } else {
                    loadAccountsCallback.onTaskCompleted(AccountAdapter.adapt(list));
                }
            }
        };
    }

    private OAuth2TokenCache<?, ?, ?> getOAuth2TokenCache() {
        return MsalOAuth2TokenCache.create(AndroidPlatformComponentsFactory.createFromContext(this.mPublicClientConfiguration.getAppContext()));
    }

    public static String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private void initializeApplication() throws MsalClientException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":initializeApplication");
        Context appContext = this.mPublicClientConfiguration.getAppContext();
        setupTelemetry(appContext, this.mPublicClientConfiguration);
        AzureActiveDirectory.setEnvironment(this.mPublicClientConfiguration.getEnvironment());
        Authority.addKnownAuthorities(this.mPublicClientConfiguration.getAuthorities());
        initializeLoggerSettings(this.mPublicClientConfiguration.getLoggerConfiguration());
        initializeTokenSharingLibrary();
        this.mPublicClientConfiguration.checkIntentFilterAddedToAppManifestForBrokerFlow();
        checkInternetPermission(this.mPublicClientConfiguration);
        HttpCache.initialize(appContext.getCacheDir());
        com.microsoft.identity.common.logging.Logger.info(strOooO0OO, "Create new public client application.");
    }

    public static void initializeLoggerSettings(LoggerConfiguration loggerConfiguration) {
        if (loggerConfiguration != null) {
            Logger.LogLevel logLevel = loggerConfiguration.getLogLevel();
            boolean zIsPiiEnabled = loggerConfiguration.isPiiEnabled();
            boolean zIsLogcatEnabled = loggerConfiguration.isLogcatEnabled();
            Logger logger = Logger.getInstance();
            if (logLevel != null) {
                logger.setLogLevel(logLevel);
            }
            logger.setEnablePII(zIsPiiEnabled);
            logger.setEnableLogcatLog(zIsLogcatEnabled);
        }
    }

    private void initializeTokenSharingLibrary() {
        if (!(this.mPublicClientConfiguration.getOAuth2TokenCache() instanceof MsalOAuth2TokenCache)) {
            throw new IllegalStateException("TSL support mandates use of the MsalOAuth2TokenCache");
        }
        this.mTokenShareUtility = new TokenShareUtility(this.mPublicClientConfiguration.getClientId(), this.mPublicClientConfiguration.getRedirectUri(), (MsalOAuth2TokenCache) this.mPublicClientConfiguration.getOAuth2TokenCache());
    }

    private static boolean isAccountHomeTenant(Map<String, ?> map, String str) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        return map.get("tid").equals(str);
    }

    private static void runOnBackground(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static AccountRecord selectAccountRecordForTokenRequest(PublicClientApplicationConfiguration publicClientApplicationConfiguration, TokenParameters tokenParameters) throws ServiceException, ClientException {
        ITenantProfile iTenantProfile;
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":selectAccountRecordForTokenRequest");
        if (TextUtils.isEmpty(tokenParameters.getAuthority())) {
            tokenParameters.setAuthority(publicClientApplicationConfiguration.getDefaultAuthority().getAuthorityURL().toString());
        }
        if (tokenParameters.getAccount() == null) {
            return null;
        }
        ITenantProfile account = tokenParameters.getAccount();
        MultiTenantAccount multiTenantAccount = (MultiTenantAccount) account;
        String authority = tokenParameters.getAuthority();
        Authority cIAMAuthority = o0O0OOO.OooO00o.f88340OooO0O0.booleanValue() ? new CIAMAuthority(authority) : Authority.getAuthorityFromAuthorityUrl(authority);
        if ((cIAMAuthority instanceof AzureActiveDirectoryB2CAuthority) || (cIAMAuthority instanceof CIAMAuthority)) {
            return AccountAdapter.getAccountInternal(publicClientApplicationConfiguration.getClientId(), publicClientApplicationConfiguration.getOAuth2TokenCache(), multiTenantAccount.getHomeAccountId(), multiTenantAccount.getTenantId());
        }
        if (!(cIAMAuthority instanceof AzureActiveDirectoryAuthority)) {
            throw new UnsupportedOperationException("Unsupported Authority type: ".concat(cIAMAuthority.getClass().getSimpleName()));
        }
        AzureActiveDirectoryAuthority azureActiveDirectoryAuthority = (AzureActiveDirectoryAuthority) cIAMAuthority;
        String tenantId = azureActiveDirectoryAuthority.getAudience().getTenantId();
        AccountRecord accountRecord = new AccountRecord();
        accountRecord.setEnvironment(multiTenantAccount.getEnvironment());
        accountRecord.setHomeAccountId(multiTenantAccount.getHomeAccountId());
        if (!StringUtil.isUuid(tenantId) && !AzureActiveDirectoryAudience.isHomeTenantAlias(tenantId)) {
            tenantId = azureActiveDirectoryAuthority.getAudience().getTenantUuidForAlias(cIAMAuthority.getAuthorityURL().toString());
        }
        accountRecord.setRealm(tenantId);
        if (AzureActiveDirectoryAudience.isHomeTenantAlias(tenantId) || isAccountHomeTenant(multiTenantAccount.getClaims(), tenantId)) {
            iTenantProfile = multiTenantAccount.getClaims() != null ? multiTenantAccount : null;
        } else {
            iTenantProfile = multiTenantAccount.getTenantProfiles().get(tenantId);
        }
        if (iTenantProfile != null || !(tokenParameters instanceof AcquireTokenSilentParameters)) {
            account = iTenantProfile;
        } else if (account.getClaims() == null) {
            Iterator<ITenantProfile> it = multiTenantAccount.getTenantProfiles().values().iterator();
            while (it.hasNext()) {
                account = it.next();
                if (account.getClaims() != null) {
                    break;
                }
            }
            account = iTenantProfile;
        }
        if (account != null) {
            accountRecord.setLocalAccountId(account.getId());
            accountRecord.setUsername(account.getUsername());
            return accountRecord;
        }
        com.microsoft.identity.common.logging.Logger.warnPII(strOooO0OO, "No account record found for IAccount with request tenantId: " + tenantId);
        throw new ClientException("no_account_found", "No account record found for IAccount");
    }

    private static void setupTelemetry(Context context, PublicClientApplicationConfiguration publicClientApplicationConfiguration) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":setupTelemetry");
        if (publicClientApplicationConfiguration.getTelemetryConfiguration() != null) {
            com.microsoft.identity.common.logging.Logger.verbose(strOooO0OO, "Telemetry configuration is set. Telemetry is enabled.");
        } else {
            com.microsoft.identity.common.logging.Logger.verbose(strOooO0OO, "Telemetry configuration is null. Telemetry is disabled.");
        }
        new Telemetry.Builder().withContext(context).defaultConfiguration(publicClientApplicationConfiguration.getTelemetryConfiguration()).build();
    }

    public static void showExpectedMsalRedirectUriInfo(Activity activity) {
        activity.startActivity(BrokerHelperActivity.createStartIntent(activity.getApplicationContext()));
    }

    private static void validateAccountModeConfiguration(PublicClientApplicationConfiguration publicClientApplicationConfiguration) throws MsalClientException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":validateAccountModeConfiguration");
        if (publicClientApplicationConfiguration.getAccountMode() == AccountMode.SINGLE && publicClientApplicationConfiguration.getDefaultAuthority() != null && (publicClientApplicationConfiguration.getDefaultAuthority() instanceof AzureActiveDirectoryB2CAuthority)) {
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Warning! B2C applications should use MultipleAccountPublicClientApplication. Use of SingleAccount mode with multiple IEF policies is unsupported.");
            if (publicClientApplicationConfiguration.getAuthorities().size() > 1) {
                throw new MsalClientException(MsalClientException.SAPCA_USE_WITH_MULTI_POLICY_B2C);
            }
        }
    }

    private void validateBrokerNotInUse() throws MsalClientException {
        if (new MSALControllerFactory(this.mPublicClientConfiguration).brokerEligibleAndInstalled()) {
            throw new MsalClientException("Cannot perform this action - broker is enabled.");
        }
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    @Deprecated
    public void acquireToken(Activity activity, String[] strArr, AuthenticationCallback authenticationCallback) {
        acquireTokenInternal(buildAcquireTokenParameters(activity, (Fragment) null, Arrays.asList(strArr), (IAccount) null, (Prompt) null, (List<Map.Entry<String, String>>) null, (String[]) null, (String) null, authenticationCallback, (String) null, (ClaimsRequest) null), PublicApiId.PCA_ACQUIRE_TOKEN_WITH_ACTIVITY_SCOPES_CALLBACK);
    }

    public void acquireTokenInternal(final AcquireTokenParameters acquireTokenParameters, final String str) {
        sBackgroundExecutor.submit(OtelContextExtension.wrap(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.15
            @Override // java.lang.Runnable
            public void run() {
                final CommandCallback commandCallback = PublicClientApplication.this.getCommandCallback(acquireTokenParameters.getCallback(), acquireTokenParameters);
                try {
                    PublicClientApplication.this.validateAcquireTokenParameters(acquireTokenParameters);
                    AcquireTokenParameters acquireTokenParameters2 = acquireTokenParameters;
                    acquireTokenParameters2.setAccountRecord(PublicClientApplication.selectAccountRecordForTokenRequest(PublicClientApplication.this.mPublicClientConfiguration, acquireTokenParameters2));
                    PublicClientApplicationConfiguration publicClientApplicationConfiguration = PublicClientApplication.this.mPublicClientConfiguration;
                    InteractiveTokenCommandParameters interactiveTokenCommandParametersCreateInteractiveTokenCommandParameters = CommandParametersAdapter.createInteractiveTokenCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), acquireTokenParameters);
                    CommandDispatcher.beginInteractive(new InteractiveTokenCommand(interactiveTokenCommandParametersCreateInteractiveTokenCommandParameters, new MSALControllerFactory(PublicClientApplication.this.mPublicClientConfiguration, interactiveTokenCommandParametersCreateInteractiveTokenCommandParameters.getAuthority()), commandCallback, str));
                } catch (Exception e) {
                    final BaseException baseExceptionBaseExceptionFromException = ExceptionAdapter.baseExceptionFromException(e);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.15.1
                        @Override // java.lang.Runnable
                        public void run() {
                            commandCallback.onError(baseExceptionBaseExceptionFromException);
                        }
                    });
                }
            }
        }));
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public IAuthenticationResult acquireTokenSilent(AcquireTokenSilentParameters acquireTokenSilentParameters) throws MsalException, InterruptedException {
        return acquireTokenSilentInternal(acquireTokenSilentParameters, PublicApiId.PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS);
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public void acquireTokenSilentAsync(AcquireTokenSilentParameters acquireTokenSilentParameters) {
        acquireTokenSilentAsyncInternal(acquireTokenSilentParameters, PublicApiId.PCA_ACQUIRE_TOKEN_SILENT_ASYNC_WITH_PARAMETERS);
    }

    public void acquireTokenSilentAsyncInternal(final AcquireTokenSilentParameters acquireTokenSilentParameters, final String str) {
        sBackgroundExecutor.submit(OtelContextExtension.wrap(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.16
            @Override // java.lang.Runnable
            public void run() {
                final CommandCallback commandCallback = PublicClientApplication.this.getCommandCallback(acquireTokenSilentParameters.getCallback(), acquireTokenSilentParameters);
                try {
                    PublicClientApplication.this.validateAcquireTokenSilentParameters(acquireTokenSilentParameters);
                    AcquireTokenSilentParameters acquireTokenSilentParameters2 = acquireTokenSilentParameters;
                    acquireTokenSilentParameters2.setAccountRecord(PublicClientApplication.selectAccountRecordForTokenRequest(PublicClientApplication.this.mPublicClientConfiguration, acquireTokenSilentParameters2));
                    PublicClientApplicationConfiguration publicClientApplicationConfiguration = PublicClientApplication.this.mPublicClientConfiguration;
                    SilentTokenCommandParameters silentTokenCommandParametersCreateSilentTokenCommandParameters = CommandParametersAdapter.createSilentTokenCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), acquireTokenSilentParameters);
                    CommandDispatcher.submitSilent(new SilentTokenCommand(silentTokenCommandParametersCreateSilentTokenCommandParameters, new MSALControllerFactory(PublicClientApplication.this.mPublicClientConfiguration, silentTokenCommandParametersCreateSilentTokenCommandParameters.getAuthority()), commandCallback, str));
                } catch (Exception e) {
                    final BaseException baseExceptionBaseExceptionFromException = ExceptionAdapter.baseExceptionFromException(e);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.16.1
                        @Override // java.lang.Runnable
                        public void run() {
                            commandCallback.onError(baseExceptionBaseExceptionFromException);
                        }
                    });
                }
            }
        }));
    }

    public IAuthenticationResult acquireTokenSilentInternal(AcquireTokenSilentParameters acquireTokenSilentParameters, String str) throws MsalException, InterruptedException {
        if (acquireTokenSilentParameters.getCallback() != null) {
            throw new IllegalArgumentException("Do not provide callback for synchronous methods");
        }
        final ResultFuture resultFuture = new ResultFuture();
        acquireTokenSilentParameters.setCallback(new SilentAuthenticationCallback() { // from class: com.microsoft.identity.client.PublicClientApplication.17
            @Override // com.microsoft.identity.client.SilentAuthenticationCallback
            public void onError(MsalException msalException) {
                resultFuture.setResult(new AsyncResult(null, msalException));
            }

            @Override // com.microsoft.identity.client.SilentAuthenticationCallback
            public void onSuccess(IAuthenticationResult iAuthenticationResult) {
                resultFuture.setResult(new AsyncResult(iAuthenticationResult, null));
            }
        });
        acquireTokenSilentAsyncInternal(acquireTokenSilentParameters, str);
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return (IAuthenticationResult) asyncResult.getResult();
            }
            throw asyncResult.getException();
        } catch (ExecutionException e) {
            throw new MsalClientException("unknown_error", "Unexpected error while acquiring token.", e);
        }
    }

    public IAuthenticationResult acquireTokenSilentSyncInternal(String[] strArr, String str, IAccount iAccount, boolean z, String str2) throws MsalException, InterruptedException {
        MsalUtils.throwOnMainThread("acquireTokenSilent");
        final ResultFuture resultFuture = new ResultFuture();
        acquireTokenSilentAsyncInternal(buildAcquireTokenSilentParameters(strArr, iAccount, str, z, null, new SilentAuthenticationCallback() { // from class: com.microsoft.identity.client.PublicClientApplication.24
            @Override // com.microsoft.identity.client.SilentAuthenticationCallback
            public void onError(MsalException msalException) {
                resultFuture.setResult(new AsyncResult(null, msalException));
            }

            @Override // com.microsoft.identity.client.SilentAuthenticationCallback
            public void onSuccess(IAuthenticationResult iAuthenticationResult) {
                resultFuture.setResult(new AsyncResult(iAuthenticationResult, null));
            }
        }), str2);
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return (IAuthenticationResult) asyncResult.getResult();
            }
            throw asyncResult.getException();
        } catch (ExecutionException e) {
            throw new MsalClientException("unknown_error", "Unexpected error while acquiring token.", e);
        }
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public void acquireTokenWithDeviceCode(List<String> list, IPublicClientApplication.DeviceCodeFlowCallback deviceCodeFlowCallback, ClaimsRequest claimsRequest, UUID uuid) {
        Context appContext = this.mPublicClientConfiguration.getAppContext();
        PackageHelper packageHelper = new PackageHelper(appContext);
        Span spanCreateSpan = OTelUtility.createSpan(SpanName.AcquireTokenDcf.name());
        try {
            Scope scopeMakeCurrentSpan = SpanExtension.makeCurrentSpan(spanCreateSpan);
            try {
                spanCreateSpan.setAttribute(AttributeName.application_name.name(), this.mPublicClientConfiguration.getAppContext().getPackageName());
                if (!packageHelper.verifyIfValidTeamsPackage(appContext.getPackageName())) {
                    spanCreateSpan.setAttribute(AttributeName.error_message.name(), "acquireTokenWithDeviceCode with claims is not supported for current package.");
                    throw new UnsupportedOperationException("This method is unsupported.");
                }
                DeviceCodeFlowParameters.Builder builder = new DeviceCodeFlowParameters.Builder();
                if (uuid != null) {
                    builder.withCorrelationId(uuid);
                    spanCreateSpan.setAttribute(AttributeName.correlation_id.name(), uuid.toString());
                }
                DeviceCodeFlowParameters deviceCodeFlowParametersBuild = builder.withScopes(list).withClaims(claimsRequest).build();
                PublicClientApplicationConfiguration publicClientApplicationConfiguration = this.mPublicClientConfiguration;
                CommandDispatcher.submitSilent(new DeviceCodeFlowCommand(CommandParametersAdapter.createDeviceCodeFlowWithClaimsCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), deviceCodeFlowParametersBuild), new MSALControllerFactory(this.mPublicClientConfiguration), getDeviceCodeFlowCommandCallback(deviceCodeFlowCallback), PublicApiId.DEVICE_CODE_FLOW_WITH_CLAIMS_AND_CALLBACK));
                spanCreateSpan.setStatus(StatusCode.OK);
                if (scopeMakeCurrentSpan != null) {
                    scopeMakeCurrentSpan.close();
                }
            } finally {
            }
        } finally {
        }
    }

    public AcquireTokenParameters buildAcquireTokenParameters(Activity activity, Fragment fragment, List<String> list, IAccount iAccount, Prompt prompt, List<Map.Entry<String, String>> list2, String[] strArr, String str, AuthenticationCallback authenticationCallback, String str2, ClaimsRequest claimsRequest) {
        MsalUtils.validateNonNullArgument(activity, C18361t4.f56218b);
        MsalUtils.validateNonNullArgument(list, "scopes");
        MsalUtils.validateNonNullArgument(authenticationCallback, "callback");
        AcquireTokenParameters.Builder builderWithAuthorizationQueryStringParameters = new AcquireTokenParameters.Builder().startAuthorizationFromActivity(activity).withFragment(fragment).forAccount(iAccount).withScopes(list).withPrompt(prompt).withAuthorizationQueryStringParameters(list2);
        if (strArr == null) {
            strArr = new String[0];
        }
        return builderWithAuthorizationQueryStringParameters.withOtherScopesToAuthorize(Arrays.asList(strArr)).fromAuthority(str).withCallback(authenticationCallback).withLoginHint(str2).withClaims(claimsRequest).build();
    }

    public AcquireTokenSilentParameters buildAcquireTokenSilentParameters(String[] strArr, IAccount iAccount, String str, boolean z, ClaimsRequest claimsRequest, SilentAuthenticationCallback silentAuthenticationCallback) {
        MsalUtils.validateNonNullArgument(iAccount, "account");
        MsalUtils.validateNonNullArgument(silentAuthenticationCallback, "callback");
        return new AcquireTokenSilentParameters.Builder().withScopes(Arrays.asList(strArr)).forAccount(iAccount).fromAuthority(str).forceRefresh(z).withClaims(claimsRequest).withCallback(silentAuthenticationCallback).build();
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public String generateSignedHttpRequest(IAccount iAccount, PoPAuthenticationScheme poPAuthenticationScheme) throws MsalException {
        final ResultFuture resultFuture = new ResultFuture();
        CommandDispatcher.submitSilent(createGenerateShrCommand(iAccount, poPAuthenticationScheme, new CommandCallback<GenerateShrResult, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.13
            @Override // com.microsoft.identity.common.java.commands.CommandCallback
            public void onCancel() {
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(BaseException baseException) {
                resultFuture.setResult(new AsyncResult(null, PublicClientApplication.this.baseExceptionToMsalException(baseException)));
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(GenerateShrResult generateShrResult) {
                resultFuture.setResult(new AsyncResult(generateShrResult, null));
            }
        }, PublicApiId.PCA_GENERATE_SIGNED_HTTP_REQUEST));
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return ((GenerateShrResult) asyncResult.getResult()).getShr();
            }
            throw asyncResult.getException();
        } catch (InterruptedException e) {
            e = e;
            throw new MsalClientException("unknown_error", "Unexpected error while generating SHR.", e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new MsalClientException("unknown_error", "Unexpected error while generating SHR.", e);
        }
    }

    public String getActiveBrokerPackageName(Context context) {
        BrokerData activeBroker = BrokerDiscoveryClientFactory.getInstanceForClientSdk(context, AndroidPlatformComponentsFactory.createFromContext(context)).getActiveBroker(false);
        if (activeBroker != null) {
            return activeBroker.getPackageName();
        }
        return null;
    }

    public CommandCallback getCommandCallback(final SilentAuthenticationCallback silentAuthenticationCallback, final TokenParameters tokenParameters) {
        return new CommandCallback<ILocalAuthenticationResult, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.19
            @Override // com.microsoft.identity.common.java.commands.CommandCallback
            public void onCancel() {
                SilentAuthenticationCallback silentAuthenticationCallback2 = silentAuthenticationCallback;
                if (!(silentAuthenticationCallback2 instanceof AuthenticationCallback)) {
                    throw new IllegalStateException("Silent requests cannot be cancelled.");
                }
                ((AuthenticationCallback) silentAuthenticationCallback2).onCancel();
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(BaseException baseException) {
                MsalException msalExceptionMsalExceptionFromBaseException = MsalExceptionAdapter.msalExceptionFromBaseException(baseException);
                SilentAuthenticationCallback silentAuthenticationCallback2 = silentAuthenticationCallback;
                if (silentAuthenticationCallback2 == null) {
                    throw new IllegalStateException("callback cannot be null or empty");
                }
                silentAuthenticationCallback2.onError(msalExceptionMsalExceptionFromBaseException);
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(ILocalAuthenticationResult iLocalAuthenticationResult) {
                PublicClientApplication.this.postAuthResult(iLocalAuthenticationResult, tokenParameters, silentAuthenticationCallback);
            }
        };
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public PublicClientApplicationConfiguration getConfiguration() {
        return this.mPublicClientConfiguration;
    }

    public DeviceCodeFlowCommandCallback getDeviceCodeFlowCommandCallback(final IPublicClientApplication.DeviceCodeFlowCallback deviceCodeFlowCallback) {
        return new DeviceCodeFlowCommandCallback<LocalAuthenticationResult, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.20
            @Override // com.microsoft.identity.common.java.commands.CommandCallback
            public void onCancel() {
            }

            @Override // com.microsoft.identity.common.java.commands.DeviceCodeFlowCommandCallback
            public void onUserCodeReceived(String str, String str2, String str3, Date date) {
                deviceCodeFlowCallback.onUserCodeReceived(str, str2, str3, date);
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
            public void onError(BaseException baseException) {
                deviceCodeFlowCallback.onError(MsalExceptionAdapter.msalExceptionFromBaseException(baseException));
            }

            @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
            public void onTaskCompleted(LocalAuthenticationResult localAuthenticationResult) {
                deviceCodeFlowCallback.onTokenReceived(AuthenticationResultAdapter.adapt(localAuthenticationResult));
            }
        };
    }

    @Override // com.microsoft.identity.client.ITokenShare, com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public String getMsaFamilyRefreshToken(String str) throws MsalClientException {
        return getMsaFamilyRefreshTokenWithMetadata(str).getRefreshToken();
    }

    @Override // com.microsoft.identity.client.ITokenShare, com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public String getOrgIdFamilyRefreshToken(String str) throws MsalClientException {
        return getOrgIdFamilyRefreshTokenWithMetadata(str).getRefreshToken();
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public PreferredAuthMethod getPreferredAuthConfiguration() throws BaseException {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getPreferredAuthConfiguration");
        PublicClientApplicationConfiguration publicClientApplicationConfiguration = this.mPublicClientConfiguration;
        CommandParameters commandParametersCreateCommandParameters = CommandParametersAdapter.createCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache());
        PublicClientApplicationConfiguration publicClientApplicationConfiguration2 = this.mPublicClientConfiguration;
        try {
            CommandResult commandResult = CommandDispatcher.submitSilentReturningFuture(new GetPreferredAuthMethodFromAuthenticator(commandParametersCreateCommandParameters, new MSALControllerFactory(publicClientApplicationConfiguration2, CommandParametersAdapter.getRequestAuthority(publicClientApplicationConfiguration2)), new CommandCallback<PreferredAuthMethod, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.12
                @Override // com.microsoft.identity.common.java.commands.CommandCallback
                public void onCancel() {
                }

                @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
                public void onError(BaseException baseException) {
                    com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Unexpected error on GetPreferredAuthMethodFromAuthenticator", baseException);
                }

                @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
                public void onTaskCompleted(PreferredAuthMethod preferredAuthMethod) {
                    com.microsoft.identity.common.logging.Logger.info(strOooO0OO, "Preferred AuthMethod: " + preferredAuthMethod.name());
                }
            }, PublicApiId.PCA_IS_QR_PIN_AVAILABLE)).get(15L, TimeUnit.SECONDS);
            int i = C1853325.f57061x184111ae[commandResult.getStatus().ordinal()];
            if (i == 1) {
                com.microsoft.identity.common.logging.Logger.info(strOooO0OO, "Preferred AuthMethod: " + commandResult.getResult());
                return (PreferredAuthMethod) commandResult.getResult();
            }
            if (i == 2) {
                BaseException baseException = (BaseException) commandResult.getResult();
                com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Unexpected error on GetPreferredAuthMethodFromAuthenticator", baseException);
                throw baseException;
            }
            if (i == 3) {
                com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "GetPreferredAuthMethodFromAuthenticator was cancelled");
                return PreferredAuthMethod.NONE;
            }
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Unexpected status on GetPreferredAuthMethodFromAuthenticator: " + commandResult.getStatus());
            return PreferredAuthMethod.NONE;
        } catch (InterruptedException e) {
            e = e;
            com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Unexpected error on GetPreferredAuthMethodFromAuthenticator", e);
            return PreferredAuthMethod.NONE;
        } catch (ExecutionException e2) {
            e = e2;
            com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Unexpected error on GetPreferredAuthMethodFromAuthenticator", e);
            return PreferredAuthMethod.NONE;
        } catch (TimeoutException e3) {
            e = e3;
            com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Unexpected error on GetPreferredAuthMethodFromAuthenticator", e);
            return PreferredAuthMethod.NONE;
        }
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public boolean isSharedDevice() {
        return this.mPublicClientConfiguration.getIsSharedDevice();
    }

    public boolean isValidBrokerPackage(Context context, String str) {
        return new BrokerValidator(context).isValidBrokerPackage(str);
    }

    public void performMigration(TokenMigrationCallback tokenMigrationCallback) {
        HashMap map = new HashMap();
        map.put(this.mPublicClientConfiguration.getClientId(), this.mPublicClientConfiguration.getRedirectUri());
        AdalMigrationAdapter adalMigrationAdapter = new AdalMigrationAdapter(this.mPublicClientConfiguration.getAppContext(), map, false);
        if (adalMigrationAdapter.getMigrationStatus()) {
            tokenMigrationCallback.onMigrationFinished(0);
        } else {
            new TokenMigrationUtility()._import(adalMigrationAdapter, new SharedPreferencesFileManager(this.mPublicClientConfiguration.getAppContext(), "com.microsoft.aad.adal.cache", new AndroidAuthSdkStorageEncryptionManager(this.mPublicClientConfiguration.getAppContext())).getAll(), (IShareSingleSignOnState) this.mPublicClientConfiguration.getOAuth2TokenCache(), tokenMigrationCallback);
        }
    }

    public void postAuthResult(ILocalAuthenticationResult iLocalAuthenticationResult, TokenParameters tokenParameters, SilentAuthenticationCallback silentAuthenticationCallback) {
        if (silentAuthenticationCallback == null) {
            throw new IllegalStateException("callback cannot be null or empty");
        }
        List<String> declinedScopes = AuthenticationResultAdapter.getDeclinedScopes(Arrays.asList(iLocalAuthenticationResult.getScope()), tokenParameters.getScopes());
        if (declinedScopes.isEmpty()) {
            silentAuthenticationCallback.onSuccess(AuthenticationResultAdapter.adapt(iLocalAuthenticationResult));
        } else {
            silentAuthenticationCallback.onError(AuthenticationResultAdapter.declinedScopeExceptionFromResult(iLocalAuthenticationResult, declinedScopes, tokenParameters));
        }
    }

    @Override // com.microsoft.identity.client.ITokenShare, com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public void saveMsaFamilyRefreshToken(String str) throws MsalClientException {
        MsalUtils.validateNonNullArgument(str, "refreshToken");
        try {
            this.mTokenShareUtility.saveMsaFamilyRefreshToken(str);
        } catch (Exception e) {
            throw new MsalClientException(ClientException.TOKEN_SHARING_MSA_PERSISTENCE_ERROR, TSL_MSG_FAILED_TO_SAVE, e);
        }
    }

    @Override // com.microsoft.identity.client.ITokenShare, com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public void saveOrgIdFamilyRefreshToken(String str) throws MsalClientException {
        MsalUtils.validateNonNullArgument(str, "SsoStateSerializerBlob");
        validateBrokerNotInUse();
        try {
            this.mTokenShareUtility.saveOrgIdFamilyRefreshToken(str);
        } catch (Exception e) {
            throw new MsalClientException(ClientException.TOKEN_SHARING_DESERIALIZATION_ERROR, TSL_MSG_FAILED_TO_SAVE, e);
        }
    }

    public void validateAcquireTokenParameters(AcquireTokenParameters acquireTokenParameters) throws MsalArgumentException {
        Activity activity = acquireTokenParameters.getActivity();
        List<String> scopes = acquireTokenParameters.getScopes();
        AuthenticationCallback callback = acquireTokenParameters.getCallback();
        MsalUtils.validateNonNullArg(activity, C18361t4.f56218b);
        MsalUtils.validateNonNullArg(scopes, "scopes");
        MsalUtils.validateNonNullArg(callback, "callback");
    }

    public void validateAcquireTokenSilentParameters(AcquireTokenSilentParameters acquireTokenSilentParameters) throws MsalArgumentException {
        String authority = acquireTokenSilentParameters.getAuthority();
        IAccount account = acquireTokenSilentParameters.getAccount();
        List<String> scopes = acquireTokenSilentParameters.getScopes();
        SilentAuthenticationCallback callback = acquireTokenSilentParameters.getCallback();
        MsalUtils.validateNonNullArg(authority, "authority");
        MsalUtils.validateNonNullArg(account, "account");
        MsalUtils.validateNonNullArg(callback, "callback");
        MsalUtils.validateNonNullArg(scopes, "scopes");
    }

    public class AccountMatcher {
        private final AccountMatcher[] mDelegateMatchers;

        public AccountMatcher() {
            this.mDelegateMatchers = new AccountMatcher[0];
        }

        public boolean matches(String str, IAccount iAccount) {
            boolean zMatches = false;
            for (AccountMatcher accountMatcher : this.mDelegateMatchers) {
                zMatches = accountMatcher.matches(str, iAccount);
                if (zMatches) {
                    return zMatches;
                }
            }
            return zMatches;
        }

        public AccountMatcher(AccountMatcher... accountMatcherArr) {
            this.mDelegateMatchers = accountMatcherArr;
        }
    }

    @Override // com.microsoft.identity.client.ITokenShare, com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public TokenShareResult getMsaFamilyRefreshTokenWithMetadata(String str) throws MsalClientException {
        MsalUtils.validateNonNullArgument(str, "identifier");
        validateBrokerNotInUse();
        try {
            return new TokenShareResult(this.mTokenShareUtility.getMsaFamilyRefreshTokenWithMetadata(str));
        } catch (Exception e) {
            throw new MsalClientException(ClientException.TOKEN_CACHE_ITEM_NOT_FOUND, TSM_MSG_FAILED_TO_RETRIEVE, e);
        }
    }

    @Override // com.microsoft.identity.client.ITokenShare, com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public TokenShareResult getOrgIdFamilyRefreshTokenWithMetadata(String str) throws MsalClientException {
        MsalUtils.validateNonNullArgument(str, "identifier");
        validateBrokerNotInUse();
        try {
            return new TokenShareResult(this.mTokenShareUtility.getOrgIdFamilyRefreshTokenWithMetadata(str));
        } catch (Exception e) {
            throw new MsalClientException(ClientException.TOKEN_CACHE_ITEM_NOT_FOUND, TSM_MSG_FAILED_TO_RETRIEVE, e);
        }
    }

    public static void create(final Context context, final File file, final IPublicClientApplication.ApplicationCreatedListener applicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(applicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.2
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.create(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, file), (String) null, (String) null, (String) null, applicationCreatedListener);
            }
        });
    }

    public static void createMultipleAccountPublicClientApplication(final Context context, final File file, final IPublicClientApplication.IMultipleAccountApplicationCreatedListener iMultipleAccountApplicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(iMultipleAccountApplicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.5
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.createMultipleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, file), iMultipleAccountApplicationCreatedListener);
            }
        });
    }

    public static void createSingleAccountPublicClientApplication(final Context context, final File file, final IPublicClientApplication.ISingleAccountApplicationCreatedListener iSingleAccountApplicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(file, "config_file");
        MsalUtils.validateNonNullArgument(iSingleAccountApplicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.7
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.createSingleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, file), iSingleAccountApplicationCreatedListener);
            }
        });
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public void acquireToken(AcquireTokenParameters acquireTokenParameters) {
        acquireTokenInternal(acquireTokenParameters, PublicApiId.PCA_ACQUIRE_TOKEN_WITH_PARAMETERS);
    }

    public static void create(final Context context, final String str, final String str2, final String str3, final IPublicClientApplication.ApplicationCreatedListener applicationCreatedListener) {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(str, "client_id");
        MsalUtils.validateNonNullArgument(str3, "redirect_uri");
        MsalUtils.validateNonNullArgument(applicationCreatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        runOnBackground(new Runnable() { // from class: com.microsoft.identity.client.PublicClientApplication.3
            @Override // java.lang.Runnable
            public void run() {
                PublicClientApplication.create(PublicClientApplicationConfigurationFactory.initializeConfiguration(context), str, str2, str3, applicationCreatedListener);
            }
        });
    }

    public static IMultipleAccountPublicClientApplication createMultipleAccountPublicClientApplication(Context context, int i) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        return createMultipleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, i));
    }

    public static ISingleAccountPublicClientApplication createSingleAccountPublicClientApplication(Context context, int i) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        return createSingleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, i));
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public void generateSignedHttpRequest(IAccount iAccount, PoPAuthenticationScheme poPAuthenticationScheme, final IPublicClientApplication.SignedHttpRequestRequestCallback signedHttpRequestRequestCallback) {
        try {
            CommandDispatcher.submitSilent(createGenerateShrCommand(iAccount, poPAuthenticationScheme, new CommandCallback<GenerateShrResult, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.14
                @Override // com.microsoft.identity.common.java.commands.CommandCallback
                public void onCancel() {
                }

                @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
                public void onError(BaseException baseException) {
                    signedHttpRequestRequestCallback.onError(PublicClientApplication.this.baseExceptionToMsalException(baseException));
                }

                @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
                public void onTaskCompleted(GenerateShrResult generateShrResult) {
                    signedHttpRequestRequestCallback.onTaskCompleted(generateShrResult.getShr());
                }
            }, PublicApiId.PCA_GENERATE_SIGNED_HTTP_REQUEST_ASYNC));
        } catch (MsalClientException e) {
            signedHttpRequestRequestCallback.onError((MsalException) new MsalClientException("unknown_error", "Unexpected error while generating SHR.", e));
        }
    }

    public static IMultipleAccountPublicClientApplication createMultipleAccountPublicClientApplication(Context context, File file) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(file, "configFile");
        return createMultipleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, file));
    }

    public static InterfaceC29571OooO00o createNativeAuthPublicClientApplication(Context context, File file) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(file, "config_file");
        try {
            return createNativeAuthApplication(C29574OooO0Oo.OooO00o.OooO00o(context, file), null, null, null, null);
        } catch (BaseException e) {
            throw new MsalClientException("unknown_error", MsalClientException.NATIVE_AUTH_APPLICATION_CREATION_UNKNOWN_ERROR_MESSAGE, e);
        }
    }

    public static ISingleAccountPublicClientApplication createSingleAccountPublicClientApplication(Context context, File file) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        return createSingleAccountPublicClientApplication(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, file));
    }

    public static IPublicClientApplication create(Context context, int i) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        return create(PublicClientApplicationConfigurationFactory.initializeConfiguration(context, i));
    }

    private static IPublicClientApplication create(PublicClientApplicationConfiguration publicClientApplicationConfiguration) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(publicClientApplicationConfiguration, "configuration");
        MsalUtils.throwOnMainThread("createPublicClientApplication");
        final ResultFuture resultFuture = new ResultFuture();
        create(publicClientApplicationConfiguration, (String) null, (String) null, (String) null, new IPublicClientApplication.ApplicationCreatedListener() { // from class: com.microsoft.identity.client.PublicClientApplication.8
            @Override // com.microsoft.identity.client.IPublicClientApplication.ApplicationCreatedListener
            public void onCreated(IPublicClientApplication iPublicClientApplication) {
                resultFuture.setResult(new AsyncResult(iPublicClientApplication, null));
            }

            @Override // com.microsoft.identity.client.IPublicClientApplication.ApplicationCreatedListener
            public void onError(MsalException msalException) {
                resultFuture.setResult(new AsyncResult(null, msalException));
            }
        });
        try {
            AsyncResult asyncResult = (AsyncResult) resultFuture.get();
            if (asyncResult.getSuccess()) {
                return (IPublicClientApplication) asyncResult.getResult();
            }
            throw asyncResult.getException();
        } catch (ExecutionException e) {
            throw new MsalClientException("unknown_error", MsalClientException.NATIVE_AUTH_APPLICATION_CREATION_UNKNOWN_ERROR_MESSAGE, e);
        }
    }

    private static IMultipleAccountPublicClientApplication createMultipleAccountPublicClientApplication(PublicClientApplicationConfiguration publicClientApplicationConfiguration) throws MsalException, InterruptedException {
        AccountMode accountMode = publicClientApplicationConfiguration.getAccountMode();
        AccountMode accountMode2 = AccountMode.MULTIPLE;
        if (accountMode == accountMode2) {
            IPublicClientApplication iPublicClientApplicationCreate = create(publicClientApplicationConfiguration);
            if (iPublicClientApplicationCreate instanceof IMultipleAccountPublicClientApplication) {
                return (IMultipleAccountPublicClientApplication) iPublicClientApplicationCreate;
            }
            if (publicClientApplicationConfiguration.getAccountMode() == accountMode2 && iPublicClientApplicationCreate.isSharedDevice()) {
                throw new MsalClientException(ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_ON_SHARED_DEVICE_ERROR_CODE, ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_ON_SHARED_DEVICE_ERROR_MESSAGE);
            }
            throw new MsalClientException(ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_CODE, ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_MESSAGE);
        }
        throw new MsalClientException(ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_ACCOUNT_MODE_ERROR_CODE, ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_ACCOUNT_MODE_ERROR_MESSAGE);
    }

    private static ISingleAccountPublicClientApplication createSingleAccountPublicClientApplication(PublicClientApplicationConfiguration publicClientApplicationConfiguration) throws MsalException, InterruptedException {
        IPublicClientApplication iPublicClientApplicationCreate = create(publicClientApplicationConfiguration);
        if (iPublicClientApplicationCreate instanceof ISingleAccountPublicClientApplication) {
            return (ISingleAccountPublicClientApplication) iPublicClientApplicationCreate;
        }
        if (publicClientApplicationConfiguration.getAccountMode() != AccountMode.SINGLE) {
            throw new MsalClientException(ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_ACCOUNT_MODE_ERROR_CODE, ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_ACCOUNT_MODE_ERROR_MESSAGE);
        }
        throw new MsalClientException(ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_CODE, ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_MESSAGE);
    }

    public static InterfaceC29571OooO00o createNativeAuthPublicClientApplication(Context context, String str, String str2, String str3, List<String> list) throws MsalException, InterruptedException {
        MsalUtils.validateNonNullArgument(context, "context");
        MsalUtils.validateNonNullArgument(str, "client_id");
        MsalUtils.validateNonNullArgument(str2, "authority");
        MsalUtils.validateNonNullArgument(list, "challenge_types");
        try {
            OooOOO0.OooO0oO(context, "context");
            return createNativeAuthApplication(C29574OooO0Oo.OooO00o.OooO0O0(context, null), str, str2, str3, list);
        } catch (BaseException e) {
            throw new MsalClientException("unknown_error", MsalClientException.NATIVE_AUTH_APPLICATION_CREATION_UNKNOWN_ERROR_MESSAGE, e);
        }
    }

    @Deprecated
    public AcquireTokenParameters buildAcquireTokenParameters(Activity activity, Fragment fragment, String[] strArr, IAccount iAccount, Prompt prompt, List<Map.Entry<String, String>> list, String[] strArr2, String str, AuthenticationCallback authenticationCallback, String str2, ClaimsRequest claimsRequest) {
        MsalUtils.validateNonNullArgument(activity, C18361t4.f56218b);
        MsalUtils.validateNonNullArgument(strArr, "scopes");
        MsalUtils.validateNonNullArgument(authenticationCallback, "callback");
        AcquireTokenParameters.Builder builderWithAuthorizationQueryStringParameters = new AcquireTokenParameters.Builder().startAuthorizationFromActivity(activity).withFragment(fragment).forAccount(iAccount).withScopes(Arrays.asList(strArr)).withPrompt(prompt).withAuthorizationQueryStringParameters(list);
        if (strArr2 == null) {
            strArr2 = new String[0];
        }
        return builderWithAuthorizationQueryStringParameters.withOtherScopesToAuthorize(Arrays.asList(strArr2)).fromAuthority(str).withCallback(authenticationCallback).withLoginHint(str2).withClaims(claimsRequest).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createSingleAccountPublicClientApplication(PublicClientApplicationConfiguration publicClientApplicationConfiguration, final IPublicClientApplication.ISingleAccountApplicationCreatedListener iSingleAccountApplicationCreatedListener) {
        create(publicClientApplicationConfiguration, (String) null, (String) null, (String) null, new IPublicClientApplication.ApplicationCreatedListener() { // from class: com.microsoft.identity.client.PublicClientApplication.11
            @Override // com.microsoft.identity.client.IPublicClientApplication.ApplicationCreatedListener
            public void onCreated(IPublicClientApplication iPublicClientApplication) {
                if (iPublicClientApplication instanceof ISingleAccountPublicClientApplication) {
                    iSingleAccountApplicationCreatedListener.onCreated((ISingleAccountPublicClientApplication) iPublicClientApplication);
                } else if (iPublicClientApplication.getConfiguration().getAccountMode() != AccountMode.SINGLE) {
                    iSingleAccountApplicationCreatedListener.onError(new MsalClientException(ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_ACCOUNT_MODE_ERROR_CODE, ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_ACCOUNT_MODE_ERROR_MESSAGE));
                } else {
                    iSingleAccountApplicationCreatedListener.onError(new MsalClientException(ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_CODE, ErrorStrings.SINGLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_MESSAGE));
                }
            }

            @Override // com.microsoft.identity.client.IPublicClientApplication.ApplicationCreatedListener
            public void onError(MsalException msalException) {
                iSingleAccountApplicationCreatedListener.onError(msalException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createMultipleAccountPublicClientApplication(PublicClientApplicationConfiguration publicClientApplicationConfiguration, final IPublicClientApplication.IMultipleAccountApplicationCreatedListener iMultipleAccountApplicationCreatedListener) {
        create(publicClientApplicationConfiguration, (String) null, (String) null, (String) null, new IPublicClientApplication.ApplicationCreatedListener() { // from class: com.microsoft.identity.client.PublicClientApplication.10
            @Override // com.microsoft.identity.client.IPublicClientApplication.ApplicationCreatedListener
            public void onCreated(IPublicClientApplication iPublicClientApplication) {
                if (iPublicClientApplication instanceof IMultipleAccountPublicClientApplication) {
                    iMultipleAccountApplicationCreatedListener.onCreated((IMultipleAccountPublicClientApplication) iPublicClientApplication);
                } else if (iPublicClientApplication.getConfiguration().getAccountMode() == AccountMode.MULTIPLE && iPublicClientApplication.isSharedDevice()) {
                    iMultipleAccountApplicationCreatedListener.onError(new MsalClientException(ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_ON_SHARED_DEVICE_ERROR_CODE, ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_ON_SHARED_DEVICE_ERROR_MESSAGE));
                } else {
                    iMultipleAccountApplicationCreatedListener.onError(new MsalClientException(ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_CODE, ErrorStrings.MULTIPLE_ACCOUNT_PCA_INIT_FAIL_UNKNOWN_REASON_ERROR_MESSAGE));
                }
            }

            @Override // com.microsoft.identity.client.IPublicClientApplication.ApplicationCreatedListener
            public void onError(MsalException msalException) {
                iMultipleAccountApplicationCreatedListener.onError(msalException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void create(final PublicClientApplicationConfiguration publicClientApplicationConfiguration, String str, String str2, String str3, final IPublicClientApplication.ApplicationCreatedListener applicationCreatedListener) {
        if (str != null) {
            publicClientApplicationConfiguration.setClientId(str);
        }
        if (str2 != null) {
            publicClientApplicationConfiguration.getAuthorities().clear();
            Authority authorityFromAuthorityUrl = Authority.getAuthorityFromAuthorityUrl(str2);
            authorityFromAuthorityUrl.setDefault(Boolean.TRUE);
            publicClientApplicationConfiguration.getAuthorities().add(authorityFromAuthorityUrl);
        }
        if (str3 != null) {
            publicClientApplicationConfiguration.setRedirectUri(str3);
        }
        try {
            validateAccountModeConfiguration(publicClientApplicationConfiguration);
            CommandDispatcher.submitSilent(new GetDeviceModeCommand(CommandParametersAdapter.createCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache()), new MSALControllerFactory(publicClientApplicationConfiguration), new CommandCallback<Boolean, BaseException>() { // from class: com.microsoft.identity.client.PublicClientApplication.9
                @Override // com.microsoft.identity.common.java.commands.CommandCallback
                public void onCancel() {
                }

                @Override // com.microsoft.identity.common.java.util.TaskCompletedCallbackWithError
                public void onError(BaseException baseException) {
                    applicationCreatedListener.onError(MsalExceptionAdapter.msalExceptionFromBaseException(baseException));
                }

                @Override // com.microsoft.identity.common.java.util.TaskCompletedCallback
                public void onTaskCompleted(Boolean bool) {
                    publicClientApplicationConfiguration.setIsSharedDevice(bool.booleanValue());
                    try {
                        PublicClientApplicationConfiguration publicClientApplicationConfiguration2 = publicClientApplicationConfiguration;
                        if ((publicClientApplicationConfiguration2 instanceof C29573OooO0OO) && publicClientApplicationConfiguration2.getAccountMode() == AccountMode.SINGLE) {
                            publicClientApplicationConfiguration.validateConfiguration();
                            applicationCreatedListener.onCreated(new C29572OooO0O0((C29573OooO0OO) publicClientApplicationConfiguration));
                            return;
                        }
                        if (publicClientApplicationConfiguration.getAccountMode() != AccountMode.SINGLE && !bool.booleanValue()) {
                            applicationCreatedListener.onCreated(new MultipleAccountPublicClientApplication(publicClientApplicationConfiguration));
                            return;
                        }
                        applicationCreatedListener.onCreated(new SingleAccountPublicClientApplication(publicClientApplicationConfiguration));
                    } catch (MsalClientException e) {
                        applicationCreatedListener.onError(e);
                    }
                }
            }, PublicApiId.PCA_GET_DEVICE_MODE));
        } catch (MsalClientException e) {
            applicationCreatedListener.onError(e);
        }
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    public void acquireTokenWithDeviceCode(List<String> list, IPublicClientApplication.DeviceCodeFlowCallback deviceCodeFlowCallback) {
        PublicClientApplicationConfiguration publicClientApplicationConfiguration = this.mPublicClientConfiguration;
        CommandDispatcher.submitSilent(new DeviceCodeFlowCommand(CommandParametersAdapter.createDeviceCodeFlowCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), list), new LocalMSALController().asControllerFactory(), getDeviceCodeFlowCommandCallback(deviceCodeFlowCallback), PublicApiId.DEVICE_CODE_FLOW_WITH_CALLBACK));
    }

    @Override // com.microsoft.identity.client.IPublicClientApplication
    @Deprecated
    public void acquireTokenWithDeviceCode(String[] strArr, IPublicClientApplication.DeviceCodeFlowCallback deviceCodeFlowCallback) {
        PublicClientApplicationConfiguration publicClientApplicationConfiguration = this.mPublicClientConfiguration;
        CommandDispatcher.submitSilent(new DeviceCodeFlowCommand(CommandParametersAdapter.createDeviceCodeFlowCommandParameters(publicClientApplicationConfiguration, publicClientApplicationConfiguration.getOAuth2TokenCache(), Arrays.asList(strArr)), new LocalMSALController().asControllerFactory(), getDeviceCodeFlowCommandCallback(deviceCodeFlowCallback), PublicApiId.DEVICE_CODE_FLOW_WITH_CALLBACK));
    }
}
