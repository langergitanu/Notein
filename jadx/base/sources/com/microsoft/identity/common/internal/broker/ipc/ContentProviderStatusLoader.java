package com.microsoft.identity.common.internal.broker.ipc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.DeadObjectException;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.logging.Logger;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B=\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/ContentProviderStatusLoader;", "Lcom/microsoft/identity/common/internal/broker/ipc/IContentProviderStatusLoader;", "Lkotlin/Function1;", "", "getVersionCode", "", "supportedByContentProvider", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "fileManager", "<init>", "(LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;)V", "Landroid/content/Context;", "context", "Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;", "components", "(Landroid/content/Context;Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;)V", "packageName", "supportsContentProvider", "(Ljava/lang/String;)Z", "LoO0O000o/OooOO0o;", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class ContentProviderStatusLoader implements IContentProviderStatusLoader {
    private static final String SHARED_PREFERENCE_NAME = "com.microsoft.common.ipc.content.provider.query.cache";
    private final INameValueStorage<String> fileManager;
    private final InterfaceC32507OooOO0o<String, String> getVersionCode;
    private final InterfaceC32507OooOO0o<String, Boolean> supportedByContentProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ContentProviderStatusLoader";

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.broker.ipc.ContentProviderStatusLoader$1 */
    @Metadata(m80611d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m80612d2 = {"<anonymous>", "", "pkgName", "invoke"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185681 extends OooOOOO implements InterfaceC32507OooOO0o<String, String> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185681(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final String invoke(String pkgName) {
            OooOOO0.OooO0oO(pkgName, "pkgName");
            return ContentProviderStatusLoader.INSTANCE.getVersionCode(this.$context, pkgName);
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.broker.ipc.ContentProviderStatusLoader$2 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"<anonymous>", "", "pkgName", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185692 extends OooOOOO implements InterfaceC32507OooOO0o<String, Boolean> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185692(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(String pkgName) {
            OooOOO0.OooO0oO(pkgName, "pkgName");
            return Boolean.valueOf(ContentProviderStatusLoader.INSTANCE.supportedByContentProvider(this.$context, pkgName));
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/ipc/ContentProviderStatusLoader$Companion;", "", "()V", "SHARED_PREFERENCE_NAME", "", "TAG", "kotlin.jvm.PlatformType", "getVersionCode", "context", "Landroid/content/Context;", "appPackageName", "supportedByContentProvider", "", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getVersionCode(Context context, String appPackageName) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(appPackageName, 0);
            return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        }

        public final boolean supportedByContentProvider(Context context, String appPackageName) throws DeadObjectException {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(appPackageName, "appPackageName");
            String contentProviderAuthority = ContentProviderStrategy.getContentProviderAuthority(appPackageName);
            OooOOO0.OooO0o(contentProviderAuthority, "getContentProviderAuthority(appPackageName)");
            List<ProviderInfo> listQueryContentProviders = context.getPackageManager().queryContentProviders((String) null, 0, 0);
            OooOOO0.OooO0o(listQueryContentProviders, "context.packageManager\n …tentProviders(null, 0, 0)");
            Iterator<ProviderInfo> it = listQueryContentProviders.iterator();
            while (it.hasNext()) {
                String str = it.next().authority;
                if (str != null && OooOOO0.OooO0O0(str, contentProviderAuthority)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentProviderStatusLoader(InterfaceC32507OooOO0o<? super String, String> getVersionCode, InterfaceC32507OooOO0o<? super String, Boolean> supportedByContentProvider, INameValueStorage<String> fileManager) {
        OooOOO0.OooO0oO(getVersionCode, "getVersionCode");
        OooOOO0.OooO0oO(supportedByContentProvider, "supportedByContentProvider");
        OooOOO0.OooO0oO(fileManager, "fileManager");
        this.getVersionCode = getVersionCode;
        this.supportedByContentProvider = supportedByContentProvider;
        this.fileManager = fileManager;
    }

    @Override // com.microsoft.identity.common.internal.broker.ipc.IContentProviderStatusLoader
    public boolean supportsContentProvider(String packageName) {
        OooOOO0.OooO0oO(packageName, "packageName");
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getResult");
        try {
            String str = packageName + ':' + this.getVersionCode.invoke(packageName);
            String str2 = this.fileManager.get(str);
            if (str2 != null) {
                return Boolean.parseBoolean(str2);
            }
            boolean zBooleanValue = this.supportedByContentProvider.invoke(packageName).booleanValue();
            this.fileManager.put(str, String.valueOf(zBooleanValue));
            return zBooleanValue;
        } catch (Throwable th) {
            Logger.error(strOooO0OO, th.getMessage(), th);
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentProviderStatusLoader(Context context, IPlatformComponents components) {
        this(new C185681(context), new C185692(context), components.getStorageSupplier().getUnencryptedNameValueStore(SHARED_PREFERENCE_NAME, String.class));
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(components, "components");
    }
}
