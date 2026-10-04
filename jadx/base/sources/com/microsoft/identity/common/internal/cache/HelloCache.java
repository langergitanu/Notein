package com.microsoft.identity.common.internal.cache;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.OooOOO;
import com.huawei.hms.network.embedded.C18198h4;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.logging.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/HelloCache;", "", "Landroid/content/Context;", "context", "", "protocolName", "targetAppPackageName", "Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;", "components", "", "cacheExpiryTimeInMs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;J)V", "clientMinimumProtocolVersion", "clientMaximumProtocolVersion", "Lcom/microsoft/identity/common/internal/cache/HelloCacheResult;", "result", "callerMethodTag", "LoO00ooO/OooOooO;", "saveNegotiatedValue", "(Ljava/lang/String;Ljava/lang/String;Lcom/microsoft/identity/common/internal/cache/HelloCacheResult;Ljava/lang/String;)V", "getNegotiatedProtocolVersionCacheKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getHelloCacheResult", "(Ljava/lang/String;Ljava/lang/String;)Lcom/microsoft/identity/common/internal/cache/HelloCacheResult;", "negotiatedProtocolVersion", "saveNegotiatedProtocolVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "saveHandshakeError", "(Ljava/lang/String;Ljava/lang/String;)V", "clearCache", "()V", "Landroid/content/Context;", "Ljava/lang/String;", "J", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "fileManager", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "getVersionCode", "()Ljava/lang/String;", C18198h4.f55025c, "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public class HelloCache {
    private static final String SHARED_PREFERENCE_NAME = "com.microsoft.common.ipc.hello.cache";
    private final long cacheExpiryTimeInMs;
    private final Context context;
    private final INameValueStorage<String> fileManager;
    private final String protocolName;
    private final String targetAppPackageName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "HelloCache";
    private static boolean sIsEnabled = true;
    private static final long DEFAULT_CACHE_EXPIRY_MILLIS = TimeUnit.HOURS.toMillis(4);

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/HelloCache$Companion;", "", "<init>", "()V", "", "value", "LoO00ooO/OooOooO;", "setIsEnabled", "(Z)V", "", "DEFAULT_CACHE_EXPIRY_MILLIS", "J", "", "SHARED_PREFERENCE_NAME", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "sIsEnabled", "Z", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final void setIsEnabled(boolean value) {
            synchronized (HelloCache.class) {
                HelloCache.sIsEnabled = value;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        }

        private Companion() {
        }
    }

    public HelloCache(Context context, String protocolName, String targetAppPackageName, IPlatformComponents components, long j) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(protocolName, "protocolName");
        OooOOO0.OooO0oO(targetAppPackageName, "targetAppPackageName");
        OooOOO0.OooO0oO(components, "components");
        this.context = context;
        this.protocolName = protocolName;
        this.targetAppPackageName = targetAppPackageName;
        this.cacheExpiryTimeInMs = j;
        this.fileManager = components.getStorageSupplier().getUnencryptedNameValueStore(SHARED_PREFERENCE_NAME, String.class);
    }

    private final String getNegotiatedProtocolVersionCacheKey(String clientMinimumProtocolVersion, String clientMaximumProtocolVersion) throws PackageManager.NameNotFoundException {
        return this.protocolName + '[' + clientMinimumProtocolVersion + ',' + clientMaximumProtocolVersion + "]:" + this.targetAppPackageName + '[' + getVersionCode() + ']';
    }

    private final void saveNegotiatedValue(String clientMinimumProtocolVersion, String clientMaximumProtocolVersion, HelloCacheResult result, String callerMethodTag) {
        String strOooO0O0 = OooOOO.OooO0O0(new StringBuilder(), TAG, callerMethodTag, ":saveNegotiatedProtocolVersion");
        if (!sIsEnabled) {
            Logger.infoPII(strOooO0O0, "hello cache is not enabled.");
            return;
        }
        try {
            this.fileManager.put(getNegotiatedProtocolVersionCacheKey(clientMinimumProtocolVersion, clientMaximumProtocolVersion), result.serialize$common_distRelease());
        } catch (PackageManager.NameNotFoundException e) {
            Logger.error(strOooO0O0, "Failed to retrieve key", e);
        }
    }

    public final void clearCache() {
        this.fileManager.clear();
    }

    public final HelloCacheResult getHelloCacheResult(String clientMinimumProtocolVersion, String clientMaximumProtocolVersion) {
        OooOOO0.OooO0oO(clientMaximumProtocolVersion, "clientMaximumProtocolVersion");
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":tryGetNegotiatedProtocolVersion");
        if (!sIsEnabled) {
            Logger.infoPII(strOooO0OO, "hello cache is not enabled.");
            return null;
        }
        try {
            String negotiatedProtocolVersionCacheKey = getNegotiatedProtocolVersionCacheKey(clientMinimumProtocolVersion, clientMaximumProtocolVersion);
            String str = this.fileManager.get(negotiatedProtocolVersionCacheKey);
            if (str == null || str.length() == 0) {
                return null;
            }
            HelloCacheResult helloCacheResultDeserialize$common_distRelease = HelloCacheResult.INSTANCE.deserialize$common_distRelease(str);
            if (helloCacheResultDeserialize$common_distRelease == null) {
                Logger.info(strOooO0OO, "Legacy or invalid cache value.");
                this.fileManager.remove(negotiatedProtocolVersionCacheKey);
                return null;
            }
            if (System.currentTimeMillis() - helloCacheResultDeserialize$common_distRelease.getTimeStamp() <= this.cacheExpiryTimeInMs) {
                return helloCacheResultDeserialize$common_distRelease;
            }
            Logger.info(strOooO0OO, "Cache entry is expired.");
            this.fileManager.remove(negotiatedProtocolVersionCacheKey);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.error(strOooO0OO, "Failed to retrieve key", e);
            return null;
        }
    }

    public String getVersionCode() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.targetAppPackageName, 0);
        return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
    }

    public final void saveHandshakeError(String clientMinimumProtocolVersion, String clientMaximumProtocolVersion) {
        OooOOO0.OooO0oO(clientMaximumProtocolVersion, "clientMaximumProtocolVersion");
        saveNegotiatedValue(clientMinimumProtocolVersion, clientMaximumProtocolVersion, HelloCacheResult.INSTANCE.createHandshakeError$common_distRelease(), OooO00o.OooO0OO(new StringBuilder(), TAG, ":saveHandShakeError"));
    }

    public final void saveNegotiatedProtocolVersion(String clientMinimumProtocolVersion, String clientMaximumProtocolVersion, String negotiatedProtocolVersion) {
        OooOOO0.OooO0oO(clientMaximumProtocolVersion, "clientMaximumProtocolVersion");
        OooOOO0.OooO0oO(negotiatedProtocolVersion, "negotiatedProtocolVersion");
        saveNegotiatedValue(clientMinimumProtocolVersion, clientMaximumProtocolVersion, HelloCacheResult.INSTANCE.createFromNegotiatedProtocolVersion$common_distRelease(negotiatedProtocolVersion), OooO00o.OooO0OO(new StringBuilder(), TAG, ":saveNegotiatedProtocolVersion"));
    }

    public /* synthetic */ HelloCache(Context context, String str, String str2, IPlatformComponents iPlatformComponents, long j, int i, C24018OooO0oo c24018OooO0oo) {
        this(context, str, str2, iPlatformComponents, (i & 16) != 0 ? DEFAULT_CACHE_EXPIRY_MILLIS : j);
    }
}
