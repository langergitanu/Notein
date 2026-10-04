package o0OooO0;

import android.content.Context;
import com.microsoft.identity.client.PublicClientApplication;
import com.microsoft.identity.common.crypto.AndroidAuthSdkStorageEncryptionManager;
import com.microsoft.identity.common.internal.cache.SharedPreferencesFileManager;
import com.microsoft.identity.common.internal.net.cache.HttpCache;
import com.microsoft.identity.common.java.authorities.Authority;
import com.microsoft.identity.common.java.logging.LogSession;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectory;
import kotlin.jvm.internal.OooOOO0;
import o00000.OooOO0;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33664o00000Oo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0OooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C29572OooO0O0 extends PublicClientApplication implements InterfaceC29571OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f104891OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C29573OooO0OO f104892OooO00o;

    static {
        String string = C29572OooO0O0.class.toString();
        OooOOO0.OooO0o(string, "NativeAuthPublicClientAp…on::class.java.toString()");
        f104891OooO0O0 = string;
        C33664o00000Oo c33664o00000OoOooO00o = OooOO0.OooO00o();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000OoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29572OooO0O0(C29573OooO0OO nativeAuthConfig) {
        super(nativeAuthConfig);
        OooOOO0.OooO0oO(nativeAuthConfig, "nativeAuthConfig");
        this.f104892OooO00o = nativeAuthConfig;
        C29573OooO0OO c29573OooO0OO = this.f104892OooO00o;
        Context appContext = c29573OooO0OO.getAppContext();
        AzureActiveDirectory.setEnvironment(c29573OooO0OO.getEnvironment());
        Authority.addKnownAuthorities(c29573OooO0OO.getAuthorities());
        PublicClientApplication.initializeLoggerSettings(c29573OooO0OO.getLoggerConfiguration());
        PublicClientApplication.checkInternetPermission(c29573OooO0OO);
        HttpCache.initialize(appContext.getCacheDir());
        LogSession.Companion companion = LogSession.INSTANCE;
        StringBuilder sb = new StringBuilder();
        String str = f104891OooO0O0;
        sb.append(str);
        sb.append(".initializeApplication");
        companion.logMethodCall(str, null, sb.toString());
        Context appContext2 = nativeAuthConfig.getAppContext();
        OooOOO0.OooO0o(appContext2, "nativeAuthConfig.appContext");
        new SharedPreferencesFileManager(appContext2, "com.microsoft.identity.client.native_auth_credential_cache", new AndroidAuthSdkStorageEncryptionManager(appContext2));
    }
}
