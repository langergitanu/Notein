package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.core.aidl.InterfaceC17759d;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    private static final int BINDING = 5;
    private static final int CONNECTED = 3;
    private static final int DISCONNECTED = 1;
    private static final int MSG_CONN_TIMEOUT = 2;
    private static final String TAG = "BaseHmsClient";
    protected static final int TIMEOUT_DISCONNECTED = 6;
    private static BinderAdapter mInnerBinderAdapter;
    private static BinderAdapter mOuterBinderAdapter;
    private String mAppID;
    private final ClientSettings mClientSettings;
    private Handler mConnectTimeoutHandler = null;
    private final Context mContext;
    private volatile InterfaceC17759d mService;
    protected String sessionId;
    private static final Object LOCK_CONNECT_TIMEOUT_HANDLER = new Object();
    private static final AtomicInteger CONN_STATUS = new AtomicInteger(1);
    private static final AtomicInteger INNER_CONN_STATUS = new AtomicInteger(1);

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.mContext = context;
        this.mClientSettings = clientSettings;
        this.mAppID = clientSettings.getAppID();
    }

    private void bindCoreInternal(String str, String str2) {
        if (this.mClientSettings.isUseInnerHms()) {
            mInnerBinderAdapter = InnerBinderAdapter.getInstance(this.mContext, str2, str);
            if (!isConnected()) {
                setConnectStatus(5);
                mInnerBinderAdapter.binder(newBinderCallBack());
                return;
            } else {
                HMSLog.m80174i(TAG, "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            }
        }
        mOuterBinderAdapter = OuterBinderAdapter.getInstance(this.mContext, str2, str);
        if (!isConnected()) {
            setConnectStatus(5);
            mOuterBinderAdapter.binder(newBinderCallBack());
        } else {
            HMSLog.m80174i(TAG, "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
        }
    }

    private void cancelConnDelayHandle() {
        synchronized (LOCK_CONNECT_TIMEOUT_HANDLER) {
            try {
                Handler handler = this.mConnectTimeoutHandler;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.mConnectTimeoutHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void checkAvailabilityAndConnect(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private BinderAdapter.BinderCallBack newBinderCallBack() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i) {
                onBinderFailed(i, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.setConnectStatus(1);
                BaseHmsClient.this.notifyFailed(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.m80174i(BaseHmsClient.TAG, "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.m80174i(BaseHmsClient.TAG, "Enter onServiceDisconnected.");
                BaseHmsClient.this.setConnectStatus(1);
                RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUSPENDED);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.setConnectStatus(6);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i, Intent intent) {
                if (intent == null) {
                    HMSLog.m80174i(BaseHmsClient.TAG, "onBinderFailed: intent is null!");
                    BaseHmsClient.this.notifyFailed(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.mService = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity == null) {
                    HMSLog.m80174i(BaseHmsClient.TAG, "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.notifyFailed(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.mContext, 11, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)));
                    BaseHmsClient.this.mService = null;
                    return;
                }
                HMSLog.m80174i(BaseHmsClient.TAG, "onBinderFailed: SDK try to resolve and reConnect!");
                long time = new Timestamp(System.currentTimeMillis()).getTime();
                FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                    @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                    public void binderCallBack(int i2) {
                        if (i2 != 0) {
                            BaseHmsClient.this.notifyFailed(new ConnectionResult(10, (PendingIntent) null));
                            BaseHmsClient.this.mService = null;
                        }
                    }
                });
                intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                activeActivity.startActivity(intent);
            }
        };
    }

    private void notice(AvailableAdapter availableAdapter, int i) {
        HMSLog.m80174i(TAG, "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i == 29) {
                i = 9;
            }
            notifyFailed(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.mContext, i, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i2) {
                        BaseHmsClient.this.notifyFailed(i2);
                    }
                });
            } else {
                notifyFailed(26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(int i) {
        HMSLog.m80174i(TAG, "notifyFailed result: " + i);
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        message.arg1 = i;
        RequestManager.getHandler().sendMessage(message);
    }

    private void resolution(AvailableAdapter availableAdapter, int i) {
        HMSLog.m80174i(TAG, "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            notifyFailed(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.mContext, i, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i2) {
                    if (i2 == 0) {
                        BaseHmsClient.this.bindCoreService();
                    } else {
                        BaseHmsClient.this.notifyFailed(i2);
                    }
                }
            });
        } else {
            notifyFailed(26);
        }
    }

    private void tryUnBind() {
        HMSLog.m80175w(TAG, "Failed to get service as interface, trying to unbind.");
        if (this.mClientSettings.isUseInnerHms()) {
            BinderAdapter binderAdapter = mInnerBinderAdapter;
            if (binderAdapter == null) {
                HMSLog.m80175w(TAG, "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = mOuterBinderAdapter;
            if (binderAdapter2 == null) {
                HMSLog.m80175w(TAG, "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        setConnectStatus(1);
        notifyFailed(10);
    }

    private void unBindAdapter() {
        if (this.mClientSettings.isUseInnerHms()) {
            BinderAdapter binderAdapter = mInnerBinderAdapter;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = mOuterBinderAdapter;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    public void bindCoreService() {
        String innerHmsPkg = this.mClientSettings.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.m80174i(TAG, "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        bindCoreInternal(innerHmsPkg, serviceAction);
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(int i) {
        checkAvailabilityAndConnect(i, false);
    }

    public void connectedInternal(IBinder iBinder) {
        this.mService = InterfaceC17759d.a.m75899a(iBinder);
        if (this.mService != null) {
            onConnecting();
        } else {
            HMSLog.m80172e(TAG, "mService is null, try to unBind.");
            tryUnBind();
        }
    }

    public final void connectionConnected() {
        setConnectStatus(3);
        RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUCCESS);
    }

    public void disconnect() {
        int i = (this.mClientSettings.isUseInnerHms() ? INNER_CONN_STATUS : CONN_STATUS).get();
        C21791OooO0o0.OooO0OO(i, "Enter disconnect, Connection Status: ", TAG);
        if (i != 1) {
            if (i == 3) {
                unBindAdapter();
                setConnectStatus(1);
            } else {
                if (i != 5) {
                    return;
                }
                cancelConnDelayHandle();
                setConnectStatus(1);
            }
        }
    }

    public BinderAdapter getAdapter() {
        HMSLog.m80174i(TAG, "getAdapter:isInner:" + this.mClientSettings.isUseInnerHms() + ", mInnerBinderAdapter:" + mInnerBinderAdapter + ", mOuterBinderAdapter:" + mOuterBinderAdapter);
        return this.mClientSettings.isUseInnerHms() ? mInnerBinderAdapter : mOuterBinderAdapter;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.mClientSettings.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.mAppID;
    }

    public ClientSettings getClientSettings() {
        return this.mClientSettings;
    }

    public int getConnectionStatus() {
        return (this.mClientSettings.isUseInnerHms() ? INNER_CONN_STATUS : CONN_STATUS).get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.mClientSettings.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.mClientSettings.getClientPackageName();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public InterfaceC17759d getService() {
        return this.mService;
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.mContext);
        return this.mClientSettings.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.mClientSettings.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return this.mClientSettings.isUseInnerHms() ? INNER_CONN_STATUS.get() == 3 : CONN_STATUS.get() == 3;
    }

    public boolean isConnecting() {
        return (this.mClientSettings.isUseInnerHms() ? INNER_CONN_STATUS : CONN_STATUS).get() == 5;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public void setConnectStatus(int i) {
        if (this.mClientSettings.isUseInnerHms()) {
            INNER_CONN_STATUS.set(i);
        } else {
            CONN_STATUS.set(i);
        }
    }

    public void setService(InterfaceC17759d interfaceC17759d) {
        this.mService = interfaceC17759d;
    }

    public void connect(int i, boolean z) {
        checkAvailabilityAndConnect(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(ConnectionResult connectionResult) {
        HMSLog.m80174i(TAG, "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        message.obj = connectionResult;
        RequestManager.getHandler().sendMessage(message);
    }
}
