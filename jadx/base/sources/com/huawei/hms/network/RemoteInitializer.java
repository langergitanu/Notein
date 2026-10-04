package com.huawei.hms.network;

import android.content.Context;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.api.C18085c;
import com.huawei.hms.network.core.api.C18093R;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes9.dex */
public class RemoteInitializer {

    /* JADX INFO: renamed from: b */
    private static final String f53996b = "RemoteInitializer";

    /* JADX INFO: renamed from: c */
    private static final String f53997c = "com.huawei.hms.feature.DynamicModuleInitializer";

    /* JADX INFO: renamed from: d */
    private static final String f53998d = "initializeModule";

    /* JADX INFO: renamed from: e */
    private static final String f53999e = "huawei_module_networkkit";

    /* JADX INFO: renamed from: a */
    private Context f54000a;

    /* JADX INFO: renamed from: com.huawei.hms.network.RemoteInitializer$a */
    public class RunnableC18082a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f54001a;

        public RunnableC18082a(Context context) {
            this.f54001a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextM77726a = RemoteInitializer.this.m77726a(RemoteInitializer.f53999e, this.f54001a);
            RemoteInitializer.this.f54000a = contextM77726a;
            if (contextM77726a != null) {
                String[] stringArray = this.f54001a.getResources().getStringArray(C18093R.array.huawei_module_network_services);
                if (stringArray.length > 0) {
                    String[] strArr = new String[stringArray.length + 1];
                    strArr[0] = contextM77726a.getPackageCodePath();
                    int i = 0;
                    for (String str : stringArray) {
                        Context contextM77726a2 = RemoteInitializer.this.m77726a(str, this.f54001a);
                        if (contextM77726a2 != null) {
                            Logger.m76967w(RemoteInitializer.f53996b, "load module " + str + " success");
                            i++;
                            strArr[i] = contextM77726a2.getPackageCodePath();
                        }
                    }
                    if (i > 0) {
                        RemoteInitializer.this.f54000a = new C18085c(this.f54001a, strArr);
                        try {
                            RemoteInitializer.this.f54000a.getClassLoader().loadClass(RemoteInitializer.f53997c).getDeclaredMethod(RemoteInitializer.f53998d, Context.class).invoke(null, RemoteInitializer.this.f54000a);
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            Logger.m76967w(RemoteInitializer.f53996b, "initializeModule reflection call failed" + e);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Context m77726a(String str, Context context) {
        DynamicModule.enable3rdPhone(str, true);
        DynamicModule.enableLowEMUI(str, true);
        try {
            return DynamicModule.loadV2(context, DynamicModule.PREFER_REMOTE, str).getModuleContext();
        } catch (DynamicModule.LoadingException e) {
            Logger.m76967w(f53996b, " load module " + str + " failed " + e);
            return null;
        }
    }

    public Context getRemoteContext() {
        return this.f54000a;
    }

    public synchronized Future init(Context context) {
        return ExecutorsUtils.newSingleThreadExecutor("Loading_NetworkKit").submit(new RunnableC18082a(context));
    }

    public boolean isInited() {
        return this.f54000a != null;
    }
}
