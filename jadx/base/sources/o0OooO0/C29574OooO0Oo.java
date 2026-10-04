package o0OooO0;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.microsoft.identity.client.Logger;
import com.microsoft.identity.client.PublicClientApplicationConfiguration;
import com.microsoft.identity.client.PublicClientApplicationConfigurationFactory;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.client.internal.configuration.LogLevelDeserializer;
import com.microsoft.identity.common.components.AndroidPlatformComponentsFactory;
import com.microsoft.identity.common.internal.authorities.AzureActiveDirectoryAudienceDeserializer;
import com.microsoft.identity.common.java.authorities.Authority;
import com.microsoft.identity.common.java.authorities.AuthorityDeserializer;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAudience;
import com.microsoft.identity.common.java.cache.MsalOAuth2TokenCache;
import com.microsoft.identity.common.java.configuration.LibraryConfiguration;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAccount;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftRefreshToken;
import com.microsoft.identity.common.java.providers.microsoft.microsoftsts.MicrosoftStsAuthorizationRequest;
import com.microsoft.identity.common.java.providers.microsoft.microsoftsts.MicrosoftStsOAuth2Strategy;
import com.microsoft.identity.common.java.providers.microsoft.microsoftsts.MicrosoftStsTokenResponse;
import com.microsoft.identity.msal.C18753R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: renamed from: o0OooO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C29574OooO0Oo extends PublicClientApplicationConfigurationFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f104897OooO00o = 0;

    /* JADX INFO: renamed from: o0OooO0.OooO0Oo$OooO00o */
    public static final class OooO00o {
        public static C29573OooO0OO OooO00o(Context context, File configFile) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(configFile, "configFile");
            try {
                return OooO0O0(context, OooO0OO(new FileInputStream(configFile), false));
            } catch (FileNotFoundException unused) {
                throw new IllegalArgumentException("Provided configuration file path=" + configFile.getPath() + " not found.");
            }
        }

        public static C29573OooO0OO OooO0O0(Context context, C29573OooO0OO c29573OooO0OO) throws MsalClientException {
            PublicClientApplicationConfiguration publicClientApplicationConfigurationLoadConfiguration = PublicClientApplicationConfigurationFactory.loadConfiguration(context, C18753R.raw.msal_default_config);
            OooOOO0.OooO0o(publicClientApplicationConfigurationLoadConfiguration, "loadConfiguration(contex….raw.msal_default_config)");
            Logger.verbose("OooO0Oo".concat(":loadDefaultNativeAuthConfiguration"), "Loading default native auth configuration");
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(C18753R.raw.msal_native_auth_default_config);
            OooOOO0.OooO0o(inputStreamOpenRawResource, "context.resources.openRa…esource(configResourceId)");
            C29573OooO0OO c29573OooO0OOOooO0OO = OooO0OO(inputStreamOpenRawResource, true);
            C29573OooO0OO c29573OooO0OO2 = new C29573OooO0OO();
            c29573OooO0OO2.setAppContext(context);
            c29573OooO0OO2.mergeConfiguration(publicClientApplicationConfigurationLoadConfiguration);
            c29573OooO0OO2.OooO0Oo(c29573OooO0OOOooO0OO);
            c29573OooO0OO2.getAuthorities().clear();
            if (c29573OooO0OO != null) {
                c29573OooO0OO2.OooO0Oo(c29573OooO0OO);
                c29573OooO0OO2.validateConfiguration();
            }
            LibraryConfiguration.LibraryConfigurationBuilder libraryConfigurationBuilderBuilder = LibraryConfiguration.builder();
            Boolean boolAuthorizationInCurrentTask = c29573OooO0OO2.authorizationInCurrentTask();
            OooOOO0.OooO0o(boolAuthorizationInCurrentTask, "config.authorizationInCurrentTask()");
            LibraryConfiguration.intializeLibraryConfiguration(libraryConfigurationBuilderBuilder.authorizationInCurrentTask(boolAuthorizationInCurrentTask.booleanValue()).build());
            IPlatformComponents iPlatformComponentsCreateFromContext = AndroidPlatformComponentsFactory.createFromContext(context);
            OooOOO0.OooO0o(iPlatformComponentsCreateFromContext, "createFromContext(context)");
            Logger.verbose("OooO0Oo".concat(":createCache"), "Creating MsalOAuth2TokenCache");
            MsalOAuth2TokenCache<MicrosoftStsOAuth2Strategy, MicrosoftStsAuthorizationRequest, MicrosoftStsTokenResponse, MicrosoftAccount, MicrosoftRefreshToken> msalOAuth2TokenCacheCreate = MsalOAuth2TokenCache.create(iPlatformComponentsCreateFromContext);
            OooOOO0.OooO0o(msalOAuth2TokenCacheCreate, "create(components)");
            c29573OooO0OO2.setOAuth2TokenCache(msalOAuth2TokenCacheCreate);
            String str = c29573OooO0OO != null ? c29573OooO0OO.getCom.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice.DC_PARAMETER java.lang.String() : null;
            Boolean useMockAuthority = c29573OooO0OO != null ? c29573OooO0OO.getUseMockAuthority() : null;
            if (str != null) {
                o0O0OOO.OooO00o.f88339OooO00o = str;
            }
            if (useMockAuthority != null) {
                o0O0OOO.OooO00o.f88340OooO0O0 = useMockAuthority;
            }
            return c29573OooO0OO2;
        }

        public static C29573OooO0OO OooO0OO(InputStream inputStream, boolean z) {
            try {
                try {
                    byte[] bArr = new byte[inputStream.available()];
                    inputStream.read(bArr);
                    inputStream.close();
                    String str = new String(bArr, C33580OooO00o.f121231OooO0O0);
                    Gson gsonCreate = new GsonBuilder().registerTypeAdapter(Authority.class, new AuthorityDeserializer()).registerTypeAdapter(AzureActiveDirectoryAudience.class, new AzureActiveDirectoryAudienceDeserializer()).registerTypeAdapter(Logger.LogLevel.class, new LogLevelDeserializer()).create();
                    OooOOO0.OooO0o(gsonCreate, "GsonBuilder()\n          …                .create()");
                    try {
                        Object objFromJson = gsonCreate.fromJson(str, (Class<Object>) C29573OooO0OO.class);
                        OooOOO0.OooO0o(objFromJson, "{\n                gson.f…class.java)\n            }");
                        return (C29573OooO0OO) objFromJson;
                    } catch (Exception e) {
                        if (e instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        throw new IllegalArgumentException("Error while processing configuration", e);
                    }
                } finally {
                }
            } catch (IOException e2) {
                if (z) {
                    throw new IllegalStateException("Unable to open default native auth configuration file.", e2);
                }
                throw new IllegalArgumentException("Unable to open provided native auth configuration file.", e2);
            }
        }
    }
}
