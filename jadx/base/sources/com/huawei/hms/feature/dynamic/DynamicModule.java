package com.huawei.hms.feature.dynamic;

import OooOoo.C20593OooO0Oo;
import Oooo0o0.C21009OooOooO;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.IDynamicInstall;
import com.huawei.hms.feature.dynamic.IDynamicLoader;
import com.huawei.hms.feature.dynamic.p576e.C17912a;
import com.huawei.hms.feature.dynamic.p576e.C17914c;
import com.huawei.hms.feature.dynamic.p576e.C17915d;
import com.huawei.hms.feature.dynamic.p576e.C17916e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class DynamicModule {
    public static final int MODULE_INTER_ERROR = 3;
    public static final int MODULE_NEED_UPDATE = 2;
    public static final int MODULE_NORMAL = 0;
    public static final int MODULE_NOT_EXIST = 1;
    public static final int MODULE_NOT_PRESET_HSF = 5;
    public static final int MODULE_NOT_READY = 4;

    /* JADX INFO: renamed from: c */
    public static final int f53516c = 256;

    /* JADX INFO: renamed from: d */
    public static final int f53517d = -100;

    /* JADX INFO: renamed from: i */
    public static int f53522i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f53523j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f53524k = 2;

    /* JADX INFO: renamed from: l */
    public static int f53525l;

    /* JADX INFO: renamed from: a */
    public Context f53528a;
    public static final VersionPolicy PREFER_REMOTE = new C17916e();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new C17914c();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new C17915d();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new C17916e();

    /* JADX INFO: renamed from: b */
    public static final String f53515b = "DynamicModule";

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<HashMap<String, Boolean>> f53518e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal<HashMap<String, String>> f53519f = new ThreadLocal<>();

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<HashMap<String, IDynamicLoader>> f53520g = new ThreadLocal<>();

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<HashMap<String, ClassLoader>> f53521h = new ThreadLocal<>();

    /* JADX INFO: renamed from: m */
    public static HashMap<String, Boolean> f53526m = new HashMap<>();

    /* JADX INFO: renamed from: n */
    public static HashMap<String, Boolean> f53527n = new HashMap<>();

    public static class DynamicLoaderClassLoader {

        /* JADX INFO: renamed from: a */
        public static HashMap<String, ClassLoader> f53529a = new HashMap<>();

        public static ClassLoader getsClassLoader(String str) {
            return f53529a.get(str);
        }

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f53529a.put(str, classLoader);
        }
    }

    public static class LoadingException extends Exception {

        /* JADX INFO: renamed from: a */
        public Bundle f53530a;

        public LoadingException(String str) {
            super(str);
        }

        public Bundle getBundle() {
            return this.f53530a;
        }

        public LoadingException(String str, Bundle bundle) {
            super(str);
            this.f53530a = bundle;
        }
    }

    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str) throws LoadingException;
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$a */
    public static class C17899a extends HashMap<String, ClassLoader> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f53531a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ClassLoader f53532b;

        public C17899a(String str, ClassLoader classLoader) {
            this.f53531a = str;
            this.f53532b = classLoader;
            put(str, classLoader);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$b */
    public static class C17900b extends HashMap<String, ClassLoader> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f53533a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ClassLoader f53534b;

        public C17900b(String str, ClassLoader classLoader) {
            this.f53533a = str;
            this.f53534b = classLoader;
            put(str, classLoader);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$c */
    public static class CallableC17901c implements Callable<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f53535a;

        public CallableC17901c(Context context) {
            this.f53535a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Bundle call() {
            try {
                return DynamicModule.queryHMSModuleBundle(this.f53535a, InterfaceC17909b.f53579e);
            } catch (Exception e) {
                Logger.m75885w(DynamicModule.f53515b, "Query provider error.", e);
                return new Bundle();
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$d */
    public static class C17902d extends HashMap<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f53536a;

        public C17902d(String str) {
            this.f53536a = str;
            put(str, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$e */
    public static class C17903e extends HashMap<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f53537a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f53538b;

        public C17903e(String str, String str2) {
            this.f53537a = str;
            this.f53538b = str2;
            put(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$f */
    public static class C17904f extends HashMap<String, IDynamicLoader> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f53539a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ IBinder f53540b;

        public C17904f(String str, IBinder iBinder) {
            this.f53539a = str;
            this.f53540b = iBinder;
            put(str, IDynamicLoader.Stub.asInterface(iBinder));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DynamicModule$g */
    public static class C17905g extends Exception {
        public C17905g(String str) {
            super(str);
        }

        public /* synthetic */ C17905g(String str, C17899a c17899a) {
            this(str);
        }
    }

    public DynamicModule(Context context) {
        this.f53528a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m76919a(Context context, String str, Bundle bundle) throws Throwable {
        int i;
        boolean zM76932a;
        Bundle bundle2 = new Bundle();
        LoadingException loadingException = null;
        try {
            bundle2 = queryHMSModuleBundle(context, InterfaceC17909b.f53579e);
            i = bundle2.getInt(InterfaceC17909b.f53585k);
        } catch (LoadingException e) {
            e = e;
            i = 0;
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
        try {
            zM76932a = m76932a(str, bundle2.getInt(InterfaceC17909b.f53600z));
        } catch (LoadingException e3) {
            e = e3;
            Logger.m75884w(f53515b, "Get loader in HMS failed:" + e.getMessage());
            loadingException = e.getBundle() != null ? new LoadingException(e.getMessage(), e.getBundle()) : new LoadingException(e.getMessage());
            zM76932a = false;
        } catch (Exception e4) {
            e = e4;
            Logger.m75884w(f53515b, "Get hms loader info failed:" + e.getMessage());
            zM76932a = false;
        }
        Bundle assetModuleInfo = AssetLoadManager.getAssetModuleInfo(context, InterfaceC17909b.f53579e);
        int i2 = assetModuleInfo.getInt(InterfaceC17909b.f53587m);
        String string = assetModuleInfo.getString(InterfaceC17909b.f53588n);
        if (i == 0 && i2 == 0) {
            Logger.m75884w(f53515b, "No available dynamic loader in HMS and asset.");
            if (loadingException == null) {
                return 0;
            }
            throw loadingException;
        }
        String str2 = f53515b;
        Logger.m75880i(str2, "HMS loader version:" + i + ", asset loader version:" + i2);
        if (i <= i2) {
            Logger.m75880i(str2, "Choose dynamicLoader in asset.");
            bundle.putString(InterfaceC17909b.f53592r, string);
            bundle.putInt(InterfaceC17909b.f53591q, i2);
            return i2;
        }
        Logger.m75880i(str2, "Choose dynamicLoader in HMS.");
        if (zM76932a) {
            Logger.m75880i(str2, "Need to copy HMS dynamicLoader to local dir.");
            ModuleCopy.copyModule(context, bundle2);
        }
        bundle.putString(InterfaceC17909b.f53592r, bundle2.getString(InterfaceC17909b.f53588n));
        bundle.putInt(InterfaceC17909b.f53591q, i);
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m76933b(Context context, String str) throws C17905g, LoadingException {
        try {
            Bundle bundleQueryHMSModuleBundle = queryHMSModuleBundle(context, str);
            String string = bundleQueryHMSModuleBundle.getString(InterfaceC17909b.f53592r);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                f53519f.set(new C17903e(str, string));
                Logger.m75880i(f53515b, "Query remote version by module name:" + str + " success.");
                return bundleQueryHMSModuleBundle;
            }
            Logger.m75884w(f53515b, "The loader_path:" + string + " in query bundle is not available,change the module version to:-100");
            bundleQueryHMSModuleBundle.putInt(InterfaceC17909b.f53585k, -100);
            return bundleQueryHMSModuleBundle;
        } catch (LoadingException e) {
            throw e;
        } catch (Exception unused) {
            throw new C17905g("failed to Query remote version.", null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static DynamicModule m76936c(Context context, String str, Bundle bundle) throws LoadingException {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        try {
            synchronized (DynamicModule.class) {
                HashMap<String, Boolean> map = f53518e.get();
                Objects.requireNonNull(map);
                bool = map.get(str);
                HashMap<String, IDynamicLoader> map2 = f53520g.get();
                Objects.requireNonNull(map2);
                iDynamicLoader = map2.get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException("The loader for " + str + " was not prepared.");
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context contextM76921a = m76921a(context, str, bundle, iDynamicLoader);
            if (contextM76921a != null) {
                return new DynamicModule(contextM76921a);
            }
            throw new LoadingException("Failed to get remote module context: null");
        } catch (LoadingException e) {
            throw e;
        } catch (Exception unused) {
            throw new LoadingException("Load Module Error.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m76938d(Context context) throws C17905g {
        C17899a c17899a = null;
        try {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            FutureTask futureTask = new FutureTask(new CallableC17901c(context));
            executorServiceNewSingleThreadExecutor.execute(futureTask);
            Bundle bundle = (Bundle) futureTask.get(f53525l, TimeUnit.MILLISECONDS);
            String string = bundle.getString(InterfaceC17909b.f53592r);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                Logger.m75880i(f53515b, "Query HMS module:huawei_module_dynamicloader info success.");
                return bundle;
            }
            Logger.m75884w(f53515b, "The loader_path:" + string + " is not available.");
            throw new C17905g("The loader_path in queryBundle is empty or not exist.", c17899a);
        } catch (TimeoutException unused) {
            Logger.m75884w(f53515b, "Query hms provider timeout: over " + f53525l + " ms, choose the local loader fallback.");
            return new Bundle();
        } catch (Exception e) {
            Logger.m75885w(f53515b, "FutureTask: query provider exception.", e);
            throw new C17905g("failed to get :huawei_module_dynamicloader info.", c17899a);
        }
    }

    public static void enable3rdPhone(String str, boolean z) {
        f53526m.put(str, Boolean.valueOf(z));
    }

    public static void enableLowEMUI(String str, boolean z) {
        f53527n.put(str, Boolean.valueOf(z));
    }

    public static Set<String> getInstalledModuleInfo() {
        return C17911d.m76949a().f53608a;
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString(InterfaceC17909b.f53584j, str);
        bundle.putInt(InterfaceC17909b.f53586l, localVersion);
        return bundle;
    }

    public static int getLocalVersion(Context context, String str) {
        if (context == null || str.length() == 0 || str.length() > 256) {
            Logger.m75877e(f53515b, "Invalid context or moduleName.");
            return 0;
        }
        try {
            String str2 = AssetLoadManager.f53494d + str + ".ModuleDescriptor";
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(str2).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.m75884w(f53515b, "Cannot find the class of module descriptor for ".concat(str));
            return 0;
        } catch (Exception e) {
            Logger.m75885w(f53515b, "Get local module info failed.", e);
            return 0;
        }
    }

    public static Bundle getRemoteModuleInfo(Context context, String str) throws LoadingException {
        try {
        } catch (LoadingException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m75885w(f53515b, "Get remote module info for " + str + " failed.", e2);
        }
        synchronized (DynamicModule.class) {
            try {
                ThreadLocal<HashMap<String, Boolean>> threadLocal = f53518e;
                if (threadLocal.get() == null || threadLocal.get().get(str) == null || !threadLocal.get().get(str).booleanValue()) {
                    Bundle bundleM76923a = m76923a(context, str);
                    if (bundleM76923a.getInt(InterfaceC17909b.f53585k) > 0) {
                        return bundleM76923a;
                    }
                }
                if (threadLocal.get().get(str).booleanValue()) {
                    try {
                        return m76933b(context, str);
                    } catch (C17905g e3) {
                        Logger.m75885w(f53515b, "Query remote module info in HMS failed.", e3);
                    }
                }
                return new Bundle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        try {
            Bundle bundleM76933b = m76933b(context, str);
            if (bundleM76933b != null && !bundleM76933b.isEmpty()) {
                return bundleM76933b.getInt(InterfaceC17909b.f53585k);
            }
            Logger.m75884w(f53515b, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.");
        } catch (C17905g e) {
            Logger.m75884w(f53515b, "Query remote module:" + str + " exception:" + e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void install(Context context, int i) {
        if (context == null) {
            Logger.m75877e(f53515b, "The input context is null.");
            return;
        }
        try {
            f53525l = i;
            String str = f53515b;
            Logger.m75880i(str, "Query HMS provider timeOut is set to:" + f53525l + " ms.");
            IDynamicInstall iDynamicInstallM76935b = m76935b(context);
            if (iDynamicInstallM76935b == null) {
                throw new LoadingException("Get dynamicInstaller failed.");
            }
            Bundle bundleInstall = iDynamicInstallM76935b.install(ObjectWrapper.wrap(context), new Bundle());
            if (bundleInstall == null) {
                throw new LoadingException("Get install info failed: moduleBundle is null.");
            }
            C17911d.m76949a().m76950a(bundleInstall);
            Logger.m75880i(str, "Install module success.");
        } catch (RemoteException e) {
            e = e;
            if (f53522i != 2 || getLocalVersion(context, InterfaceC17909b.f53579e) <= 0) {
                Logger.m75885w(f53515b, "Install module failed.", e);
            }
            String str2 = f53515b;
            Logger.m75880i(str2, "Ready to use local loader-fallback to retry:");
            try {
                Bundle bundleInstall2 = m76937c(context).install(ObjectWrapper.wrap(context), new Bundle());
                if (bundleInstall2 == null) {
                    throw new LoadingException("Retry: get install info failed: moduleBundle is null.");
                }
                C17911d.m76949a().m76950a(bundleInstall2);
                Logger.m75880i(str2, "Retry install module with local loader-fallback success.");
            } catch (RemoteException | LoadingException | NullPointerException e2) {
                Logger.m75885w(f53515b, "Retry failed with local loader-fallback.", e2);
            }
        } catch (LoadingException e3) {
            e = e3;
            if (f53522i != 2) {
            }
            Logger.m75885w(f53515b, "Install module failed.", e);
        } catch (NullPointerException e4) {
            e = e4;
            if (f53522i != 2) {
            }
            Logger.m75885w(f53515b, "Install module failed.", e);
        }
    }

    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256) {
            throw new LoadingException("Null param, please check it.");
        }
        return m76924a(context, versionPolicy, str, new Bundle());
    }

    public static DynamicModule loadV2(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256) {
            throw new LoadingException("Null param, please check it.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(InterfaceC17909b.f53593s, "v2");
        return m76924a(context, versionPolicy, str, bundle);
    }

    public static DynamicModule loadV3(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256) {
            throw new LoadingException("Null param, please check it.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(InterfaceC17909b.f53593s, InterfaceC17909b.f53595u);
        return m76924a(context, versionPolicy, str, bundle);
    }

    public static Bundle queryHMSModuleBundle(Context context, String str) throws C17905g, LoadingException {
        C17899a c17899a = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new C17905g("Query remote version failed: null contentResolver.", c17899a);
            }
            Bundle bundleCall = contentResolver.call(Uri.parse(InterfaceC17909b.f53575a), str, (String) null, (Bundle) null);
            if (bundleCall == null) {
                Logger.m75884w(f53515b, "Failed to get bundle info:null.");
                throw new C17905g("Query remote version failed: null bundle info.", c17899a);
            }
            int i = bundleCall.getInt(InterfaceC17909b.f53582h);
            String string = bundleCall.getString(InterfaceC17909b.f53592r);
            String str2 = f53515b;
            Logger.m75880i(str2, "bundle info: errorCode:" + i + ", moduleVersion:" + bundleCall.getInt(InterfaceC17909b.f53585k) + ", modulePath:" + bundleCall.getString(InterfaceC17909b.f53588n) + ", loader_version:" + bundleCall.getInt(InterfaceC17909b.f53591q) + ", loaderPath:" + string + ", armeabiType:" + bundleCall.getInt(InterfaceC17909b.f53596v));
            if (i == 0) {
                return bundleCall;
            }
            Logger.m75884w(str2, "Failed to get " + str + " bundle info, errcode:" + i);
            throw new LoadingException("Query " + str + " unavailable, errorCode:" + i, bundleCall);
        } catch (LoadingException e) {
            throw e;
        } catch (Exception unused) {
            throw new C17905g(C20593OooO0Oo.OooO0O0("failed to get :", str, " info."), c17899a);
        }
    }

    public final Context getModuleContext() {
        return this.f53528a;
    }

    /* JADX INFO: renamed from: a */
    public static int m76920a(VersionPolicy versionPolicy) {
        if (versionPolicy instanceof C17916e) {
            return 1;
        }
        if (versionPolicy instanceof C17915d) {
            return 2;
        }
        return versionPolicy instanceof C17914c ? 3 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static DynamicModule m76934b(Context context, String str, Bundle bundle) throws LoadingException {
        ClassLoader classLoader;
        synchronized (DynamicModule.class) {
            try {
                ThreadLocal<HashMap<String, ClassLoader>> threadLocal = f53521h;
                if (threadLocal.get() == null || threadLocal.get().get(str) == null) {
                    Logger.m75880i(f53515b, "No available cached loader for asset module.");
                    classLoader = null;
                } else {
                    Logger.m75880i(f53515b, "Cached loader for asset module is available, ready to use it.");
                    classLoader = threadLocal.get().get(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        IDynamicLoader iDynamicLoaderM76928a = m76928a(context, str, bundle.getString(InterfaceC17909b.f53592r), classLoader);
        if (iDynamicLoaderM76928a == null) {
            throw new LoadingException("Failed to get iDynamicLoader: null.");
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Context contextM76921a = m76921a(context, str, bundle, iDynamicLoaderM76928a);
        if (contextM76921a != null) {
            return new DynamicModule(contextM76921a);
        }
        throw new LoadingException("New version policy: Failed to get module context: null.");
    }

    /* JADX INFO: renamed from: c */
    public static IDynamicInstall m76937c(Context context) throws LoadingException {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass(InterfaceC17909b.f53581g).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("getLocalLoaderFallback: failed to instantiate dynamic loader: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Context m76921a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper iObjectWrapperLoad = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(InterfaceC17909b.f53585k), ObjectWrapper.wrap(bundle));
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapperLoad);
            if (objUnwrap == null) {
                Logger.m75884w(f53515b, "Get remote context is null, module:" + str);
                return null;
            }
            if (objUnwrap instanceof Context) {
                Logger.m75880i(f53515b, "Get context for module:" + str + " success.");
                return (Context) objUnwrap;
            }
            if (objUnwrap instanceof Bundle) {
                Logger.m75880i(f53515b, "Get module info bundle for " + str);
                return m76922a(context, str, bundle, iDynamicLoader, (Bundle) objUnwrap);
            }
            if (!objUnwrap.getClass().getName().equals(LoadingException.class.getName())) {
                return null;
            }
            Bundle bundle2 = (Bundle) ObjectWrapper.unwrap(iObjectWrapperLoad).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(iObjectWrapperLoad), new Object[0]);
            Logger.m75884w(f53515b, "Successfully get the bundle in exception.");
            throw new LoadingException("Failed to load, please check the bundle in exception.", bundle2);
        } catch (LoadingException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m75885w(f53515b, "Failed to get module context for:" + str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String, void] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.os.Bundle, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: b */
    public static IDynamicInstall m76935b(Context context) throws LoadingException {
        int i;
        String string = null;
        int localVersion = 0;
        try {
            Bundle bundleM76938d = m76938d(context);
            string = bundleM76938d.getString(InterfaceC17909b.f53592r);
            i = bundleM76938d.getInt(InterfaceC17909b.f53591q);
        } catch (Exception e) {
            Logger.m75885w(f53515b, "Cannot get remote HMS dynamicLoader.", e);
            i = 0;
        }
        try {
            localVersion = getLocalVersion(context, InterfaceC17909b.f53579e);
        } catch (Exception e2) {
            Logger.m75885w(f53515b, "Cannot find local dynamicLoader fallback.", e2);
        }
        String str = f53515b;
        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "DynamicLoader remoteHMSVersion:", ", hmsLoaderPath:", string, ", localLoaderVersion:");
        sbOooO0OO.append(localVersion);
        Logger.m75880i(str, sbOooO0OO.toString());
        ?? r4 = i > localVersion ? i : localVersion;
        if (r4 <= 10009300) {
            Logger.m75884w(str, "The current version:" + ((int) r4) + " is too low.");
            throw new LoadingException(APMediaMessage.IMediaObject.serialize(r4));
        }
        if (i <= localVersion) {
            Logger.m75880i(str, "Choose local dynamicLoader fallback: ");
            f53522i = 2;
            return m76937c(context);
        }
        Logger.m75880i(str, "Choose hms dynamicLoader: " + string);
        f53522i = 1;
        return m76927a(string);
    }

    /* JADX INFO: renamed from: a */
    public static Context m76922a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader, Bundle bundle2) throws LoadingException {
        Object objUnwrap;
        bundle.putInt(InterfaceC17909b.f53597w, 4);
        if (AssetLoadManager.getAssetModuleInfo(context, str).getInt(InterfaceC17909b.f53587m, 0) <= 0) {
            Logger.m75880i(f53515b, "No fallback module in assets.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        try {
            objUnwrap = ObjectWrapper.unwrap(iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(InterfaceC17909b.f53585k), ObjectWrapper.wrap(bundle)));
        } catch (RemoteException e) {
            Logger.m75885w(f53515b, "tryWithAssetsModule RemoteException.", e);
            objUnwrap = null;
        }
        if (!(objUnwrap instanceof Context)) {
            Logger.m75884w(f53515b, "tryWithAssetsModule get dynamicContext failed: null or wrong type.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        Logger.m75880i(f53515b, "get dynamic module context for:" + str + " from assets fallback success.");
        return (Context) objUnwrap;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m76923a(Context context, String str) throws LoadingException {
        boolean z = false;
        try {
            try {
                Class<?> clsM76929a = m76929a(context);
                Method declaredMethod = clsM76929a.getDeclaredMethod("getsClassLoader", String.class);
                Method declaredMethod2 = clsM76929a.getDeclaredMethod("setsClassLoader", String.class, ClassLoader.class);
                ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
                if (classLoader == null) {
                    try {
                        Logger.m75880i(f53515b, "No available cached loader, query remote.");
                        Bundle bundleM76933b = m76933b(context, str);
                        synchronized (DynamicModule.class) {
                            try {
                                HashMap<String, String> map = f53519f.get();
                                Objects.requireNonNull(map);
                                String str2 = map.get(str);
                                if (TextUtils.isEmpty(str2)) {
                                    return bundleM76933b;
                                }
                                C17912a c17912a = new C17912a(str2, ClassLoader.getSystemClassLoader());
                                m76931a(str, c17912a);
                                declaredMethod2.invoke(null, str, c17912a);
                                f53518e.set(new C17902d(str));
                                return bundleM76933b;
                            } finally {
                            }
                        }
                    } catch (C17905g unused) {
                    }
                } else if (classLoader != ClassLoader.getSystemClassLoader()) {
                    Logger.m75880i(f53515b, "Cached loader is available, ready to use it.");
                    try {
                        m76931a(str, classLoader);
                    } catch (LoadingException e) {
                        Logger.m75885w(f53515b, "Get loader interface failed.", e);
                    }
                    z = true;
                }
            } catch (Exception e2) {
                Logger.m75885w(f53515b, "failed to load.", e2);
            }
            HashMap<String, Boolean> map2 = new HashMap<>();
            map2.put(str, Boolean.valueOf(z));
            f53518e.set(map2);
            return new Bundle();
        } catch (LoadingException e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static DynamicModule m76924a(Context context, VersionPolicy versionPolicy, String str, Bundle bundle) throws Throwable {
        try {
            int iM76919a = m76919a(context, str, bundle);
            if (iM76919a >= 10015300) {
                Logger.m75880i(f53515b, "Load start in new-version-policy.");
                return m76926a(context, str, versionPolicy, bundle);
            }
            if (iM76919a <= 0) {
                throw new LoadingException("Cannot find a valid dynamicLoader in HMS and local.");
            }
            Logger.m75880i(f53515b, "Load start in old-version-policy.");
            return m76925a(context, str, versionPolicy);
        } catch (LoadingException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m75877e(f53515b, "Other exception:" + e2);
            throw new LoadingException("Load failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static DynamicModule m76925a(Context context, String str, VersionPolicy versionPolicy) throws LoadingException {
        Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
        if (moduleInfo.getInt(InterfaceC17909b.f53585k) <= 0) {
            if (moduleInfo.getInt(InterfaceC17909b.f53586l) <= 0) {
                throw new LoadingException("Query remote version and local version failed.");
            }
            Logger.m75880i(f53515b, "Remote version is invalid, use local context.");
            return new DynamicModule(context.getApplicationContext());
        }
        try {
            return m76936c(context, str, moduleInfo);
        } catch (LoadingException e) {
            Logger.m75885w(f53515b, "Failed to load remote module.", e);
            if (getLocalVersion(context, str) <= 0) {
                throw e;
            }
            Logger.m75875d(f53515b, "Local module version is valid, use local fallback.");
            return new DynamicModule(context.getApplicationContext());
        }
    }

    /* JADX INFO: renamed from: a */
    public static DynamicModule m76926a(Context context, String str, VersionPolicy versionPolicy, Bundle bundle) throws LoadingException {
        int iM76920a = m76920a(versionPolicy);
        String string = bundle.getString(InterfaceC17909b.f53592r);
        String str2 = f53515b;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("The loader path for module:", str, " is:", string, ", and versionType is:");
        sbOooO0O0.append(iM76920a);
        Logger.m75880i(str2, sbOooO0O0.toString());
        if (TextUtils.isEmpty(string)) {
            throw new LoadingException("Cannot find a valid dynamic loader in HMS or local.");
        }
        Boolean bool = f53527n.get(str);
        Boolean bool2 = f53526m.get(str);
        bundle.putString(InterfaceC17909b.f53584j, str);
        bundle.putInt(InterfaceC17909b.f53597w, iM76920a);
        bundle.putBoolean(InterfaceC17909b.f53598x, bool != null ? bool.booleanValue() : false);
        bundle.putBoolean(InterfaceC17909b.f53599y, bool2 != null ? bool2.booleanValue() : false);
        try {
            return m76934b(context, str, bundle);
        } catch (LoadingException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m75878e(f53515b, "Other exception,", e2);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return new DynamicModule(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static IDynamicInstall m76927a(String str) throws LoadingException {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return IDynamicInstall.Stub.asInterface((IBinder) new C17912a(str, ClassLoader.getSystemClassLoader()).loadClass(InterfaceC17909b.f53581g).getConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new LoadingException("getHMSDynamicInstaller: failed to instantiate dynamic loader:" + e.getMessage());
            }
        }
        throw new LoadingException("Failed to get dynamicLoader path.");
    }

    /* JADX INFO: renamed from: a */
    public static IDynamicLoader m76928a(Context context, String str, String str2, ClassLoader classLoader) {
        if (classLoader == null) {
            try {
                classLoader = new C17912a(str2, ClassLoader.getSystemClassLoader());
                f53521h.set(new C17900b(str, classLoader));
            } catch (Exception e) {
                Logger.m75885w(f53515b, "Get asset iDynamicLoader failed.", e);
                return null;
            }
        }
        return IDynamicLoader.Stub.asInterface((IBinder) classLoader.loadClass(InterfaceC17909b.f53580f).getConstructor(new Class[0]).newInstance(new Object[0]));
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m76929a(Context context) throws LoadingException {
        Class<?> clsLoadClass;
        try {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            clsLoadClass = context.getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
        } catch (ClassNotFoundException unused) {
            Logger.m75884w(f53515b, "ClassLoader class not found when use client context.");
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            try {
                ClassLoader classLoader = DynamicModule.class.getClassLoader();
                Objects.requireNonNull(classLoader);
                clsLoadClass = classLoader.loadClass(DynamicLoaderClassLoader.class.getName());
                if (clsLoadClass == null) {
                    throw new LoadingException("ClassLoader class is null.");
                }
            } catch (ClassNotFoundException unused2) {
                throw new LoadingException("ClassLoader class not found when use DynamicModule's classLoader.");
            }
        }
        return clsLoadClass;
    }

    /* JADX INFO: renamed from: a */
    public static void m76931a(String str, ClassLoader classLoader) throws LoadingException {
        try {
            f53520g.set(new C17904f(str, (IBinder) classLoader.loadClass(InterfaceC17909b.f53580f).getConstructor(new Class[0]).newInstance(new Object[0])));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to get loader interface:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76932a(String str, int i) {
        Boolean bool;
        if (i == 1) {
            Boolean bool2 = f53527n.get(str);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return false;
        }
        if (i != 2 || (bool = f53526m.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
