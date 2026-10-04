package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.C17756a;
import com.huawei.hms.core.aidl.C17757b;
import com.huawei.hms.core.aidl.C17760e;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.InterfaceC17758c;
import com.huawei.hms.core.aidl.InterfaceC17759d;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* JADX INFO: renamed from: b */
    private final Context f52427b;

    /* JADX INFO: renamed from: c */
    private final String f52428c;

    /* JADX INFO: renamed from: d */
    private String f52429d;

    /* JADX INFO: renamed from: e */
    private String f52430e;

    /* JADX INFO: renamed from: f */
    private volatile InterfaceC17759d f52431f;

    /* JADX INFO: renamed from: g */
    private String f52432g;

    /* JADX INFO: renamed from: h */
    private WeakReference<Activity> f52433h;

    /* JADX INFO: renamed from: i */
    private WeakReference<Activity> f52434i;

    /* JADX INFO: renamed from: l */
    private List<Scope> f52437l;

    /* JADX INFO: renamed from: m */
    private List<PermissionInfo> f52438m;

    /* JADX INFO: renamed from: n */
    private Map<Api<?>, Api.ApiOptions> f52439n;

    /* JADX INFO: renamed from: o */
    private SubAppInfo f52440o;

    /* JADX INFO: renamed from: s */
    private final ReentrantLock f52444s;

    /* JADX INFO: renamed from: t */
    private final Condition f52445t;

    /* JADX INFO: renamed from: u */
    private ConnectionResult f52446u;

    /* JADX INFO: renamed from: v */
    private HuaweiApiClient.ConnectionCallbacks f52447v;

    /* JADX INFO: renamed from: w */
    private HuaweiApiClient.OnConnectionFailedListener f52448w;

    /* JADX INFO: renamed from: x */
    private Handler f52449x;

    /* JADX INFO: renamed from: y */
    private Handler f52450y;

    /* JADX INFO: renamed from: z */
    private static final Object f52425z = new Object();

    /* JADX INFO: renamed from: A */
    private static final Object f52424A = new Object();

    /* JADX INFO: renamed from: a */
    private int f52426a = -1;

    /* JADX INFO: renamed from: j */
    private boolean f52435j = false;

    /* JADX INFO: renamed from: k */
    private AtomicInteger f52436k = new AtomicInteger(1);

    /* JADX INFO: renamed from: p */
    private long f52441p = 0;

    /* JADX INFO: renamed from: q */
    private int f52442q = 0;

    /* JADX INFO: renamed from: r */
    private final Object f52443r = new Object();

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$a */
    public class C17720a implements Handler.Callback {
        public C17720a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.m80172e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f52436k.get() == 5) {
                HuaweiApiClientImpl.this.m75782c(1);
                HuaweiApiClientImpl.this.m75775b();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$b */
    public class C17721b implements Handler.Callback {
        public C17721b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.m80172e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f52436k.get() == 2) {
                HuaweiApiClientImpl.this.m75782c(1);
                HuaweiApiClientImpl.this.m75775b();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$c */
    public class BinderC17722c extends InterfaceC17758c.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ResultCallback f52453a;

        public BinderC17722c(HuaweiApiClientImpl huaweiApiClientImpl, ResultCallback resultCallback) {
            this.f52453a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.InterfaceC17758c
        public void call(C17757b c17757b) {
            if (c17757b == null) {
                HMSLog.m80174i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
                this.f52453a.onResult(new BundleResult(-1, null));
                return;
            }
            C17760e c17760eM75890a = C17756a.m75890a(c17757b.m75896c());
            ResponseHeader responseHeader = new ResponseHeader();
            c17760eM75890a.m75906a(c17757b.f52536b, responseHeader);
            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), c17757b.m75893a());
            HMSLog.m80174i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f52453a.onResult(bundleResult);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$d */
    public static class C17723d extends PendingResultImpl<Status, IMessageEntity> {
        public C17723d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e */
    public class C17724e implements ResultCallback<ResolveResult<ConnectResp>> {

        /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ResolveResult f52455a;

            public a(ResolveResult resolveResult) {
                this.f52455a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.m75773a((ResolveResult<ConnectResp>) this.f52455a);
            }
        }

        private C17724e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ C17724e(HuaweiApiClientImpl huaweiApiClientImpl, C17720a c17720a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f */
    public class C17725f implements ResultCallback<ResolveResult<DisconnectResp>> {

        /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ResolveResult f52458a;

            public a(ResolveResult resolveResult) {
                this.f52458a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.m75779b((ResolveResult<DisconnectResp>) this.f52458a);
            }
        }

        private C17725f() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ C17725f(HuaweiApiClientImpl huaweiApiClientImpl, C17720a c17720a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.HuaweiApiClientImpl$g */
    public class C17726g implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private C17726g() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) == null || value.getStatusCode() != 0) {
                return;
            }
            HMSLog.m80174i("HuaweiApiClientImpl", "get notice has intent.");
            Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f52433h.get(), HuaweiApiClientImpl.this.getTopActivity());
            if (validActivity == null) {
                HMSLog.m80172e("HuaweiApiClientImpl", "showNotice no valid activity!");
            } else {
                HuaweiApiClientImpl.this.f52435j = true;
                validActivity.startActivity(noticeIntent);
            }
        }

        public /* synthetic */ C17726g(HuaweiApiClientImpl huaweiApiClientImpl, C17720a c17720a) {
            this();
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f52444s = reentrantLock;
        this.f52445t = reentrantLock.newCondition();
        this.f52449x = null;
        this.f52450y = null;
        this.f52427b = context;
        String appId = Util.getAppId(context);
        this.f52428c = appId;
        this.f52429d = appId;
        this.f52430e = Util.getCpId(context);
    }

    /* JADX INFO: renamed from: d */
    private DisconnectInfo m75784d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f52439n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f52437l, arrayList);
    }

    /* JADX INFO: renamed from: e */
    private int m75785e() {
        int hmsVersion = Util.getHmsVersion(this.f52427b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int iM75786f = m75786f();
        if (m75787g()) {
            if (iM75786f < 20503000) {
                return 20503000;
            }
        } else if (iM75786f < 20600000) {
            return 20600000;
        }
        return iM75786f;
    }

    /* JADX INFO: renamed from: f */
    private int m75786f() {
        Integer num;
        int iIntValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (iIntValue = num.intValue()) > i) {
                i = iIntValue;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    private boolean m75787g() {
        Map<Api<?>, Api.ApiOptions> map = this.f52439n;
        if (map == null) {
            return false;
        }
        Iterator<Api<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private void m75788h() {
        Handler handler = this.f52449x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f52449x = new Handler(Looper.getMainLooper(), new C17720a());
        }
        this.f52449x.sendEmptyMessageDelayed(2, 5000L);
    }

    /* JADX INFO: renamed from: i */
    private void m75789i() {
        synchronized (f52424A) {
            try {
                Handler handler = this.f52450y;
                if (handler != null) {
                    handler.removeMessages(3);
                } else {
                    this.f52450y = new Handler(Looper.getMainLooper(), new C17721b());
                }
                HMSLog.m80169d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f52450y.sendEmptyMessageDelayed(3, 3000L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m75790j() {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, m75780c()).setResultCallback(new C17724e(this, null));
    }

    /* JADX INFO: renamed from: k */
    private void m75791k() {
        ConnectService.disconnect(this, m75784d()).setResultCallback(new C17725f(this, null));
    }

    /* JADX INFO: renamed from: l */
    private void m75792l() {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, m75780c()).setResultCallback(new C17724e(this, null));
    }

    /* JADX INFO: renamed from: m */
    private void m75793m() {
        if (this.f52435j) {
            HMSLog.m80174i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f52427b) == 0) {
            ConnectService.getNotice(this, 0, "6.4.0.302").setResultCallback(new C17726g(this, null));
        }
    }

    /* JADX INFO: renamed from: n */
    private void m75794n() {
        Util.unBindServiceCatchException(this.f52427b, this);
        this.f52431f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i, ResultCallback<BundleResult> resultCallback) {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.m80172e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        }
        if (!innerIsConnected()) {
            HMSLog.m80172e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        }
        C17757b c17757b = new C17757b(str, i);
        C17760e c17760eM75890a = C17756a.m75890a(c17757b.m75896c());
        c17757b.m75894a(bundle);
        RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 60400302, getSessionId());
        requestHeader.setApiNameList(getApiNameList());
        c17757b.f52536b = c17760eM75890a.m75905a(requestHeader, new Bundle());
        try {
            getService().mo75897a(c17757b, new BinderC17722c(this, resultCallback));
            return 0;
        } catch (RemoteException e) {
            HMSLog.m80172e("HuaweiApiClientImpl", "remote exception:" + e.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        if (checkUpdatelistener == null) {
            HMSLog.m80172e("HuaweiApiClientImpl", "listener is null!");
        } else {
            checkUpdatelistener.onResult(-1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.m80174i("HuaweiApiClientImpl", "====== HMSSDK version: 60400302 ======");
        int i = this.f52436k.get();
        C21791OooO0o0.OooO0OO(i, "Enter connect, Connection Status: ", "HuaweiApiClientImpl");
        if (i == 3 || i == 5 || i == 2 || i == 4) {
            return;
        }
        if (activity != null) {
            this.f52433h = new WeakReference<>(activity);
            this.f52434i = new WeakReference<>(activity);
        }
        this.f52429d = TextUtils.isEmpty(this.f52428c) ? Util.getAppId(this.f52427b) : this.f52428c;
        int iM75785e = m75785e();
        HMSLog.m80174i("HuaweiApiClientImpl", "connect minVersion:" + iM75785e);
        HuaweiApiAvailability.setServicesVersionCode(iM75785e);
        int iIsHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f52427b, iM75785e);
        C21791OooO0o0.OooO0OO(iIsHuaweiMobileServicesAvailable, "In connect, isHuaweiMobileServicesAvailable result: ", "HuaweiApiClientImpl");
        this.f52442q = HMSPackageManager.getInstance(this.f52427b).getHmsMultiServiceVersion();
        if (iIsHuaweiMobileServicesAvailable != 0) {
            if (this.f52448w != null) {
                m75776b(iIsHuaweiMobileServicesAvailable);
                return;
            }
            return;
        }
        m75782c(5);
        if (this.f52431f == null) {
            m75769a();
            return;
        }
        m75782c(2);
        m75790j();
        m75789i();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        HMSLog.m80174i("HuaweiApiClientImpl", "====== HMSSDK version: 60400302 ======");
        int i = this.f52436k.get();
        C21791OooO0o0.OooO0OO(i, "Enter forceConnect, Connection Status: ", "HuaweiApiClientImpl");
        if (i == 3 || i == 5 || i == 2 || i == 4) {
            return;
        }
        this.f52429d = TextUtils.isEmpty(this.f52428c) ? Util.getAppId(this.f52427b) : this.f52428c;
        m75792l();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f52426a < 0) {
            throw new IllegalStateException("disableLifeCycleManagement failed");
        }
        AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f52426a);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new C17723d(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i = this.f52436k.get();
        C21791OooO0o0.OooO0OO(i, "Enter disconnect, Connection Status: ", "HuaweiApiClientImpl");
        if (i == 2) {
            m75782c(4);
            return;
        }
        if (i == 3) {
            m75782c(4);
            m75791k();
        } else {
            if (i != 5) {
                return;
            }
            m75770a(2);
            m75782c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f52439n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f52439n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f52429d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f52446u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f52446u;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f52427b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f52430e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f52427b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f52438m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f52437l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public InterfaceC17759d getService() {
        return this.f52431f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f52432g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f52440o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f52434i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f52443r) {
            try {
                return this.f52448w == onConnectionFailedListener;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f52443r) {
            try {
                return this.f52447v == connectionCallbacks;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f52444s.lock();
        try {
            connect((Activity) null);
            while (isConnecting()) {
                this.f52445t.await();
            }
            if (isConnected()) {
                this.f52446u = null;
                return new ConnectionResult(0, (PendingIntent) null);
            }
            ConnectionResult connectionResult = this.f52446u;
            return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, (PendingIntent) null);
        } finally {
            this.f52444s.unlock();
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f52436k.get() == 3 || this.f52436k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f52442q == 0) {
            this.f52442q = HMSPackageManager.getInstance(this.f52427b).getHmsMultiServiceVersion();
        }
        if (this.f52442q >= 20504000) {
            return innerIsConnected();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f52441p;
        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ((ResolveResult) ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS)).getStatus();
        if (status.isSuccess()) {
            this.f52441p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        C21791OooO0o0.OooO0OO(statusCode, "isConnected is false, statuscode:", "HuaweiApiClientImpl");
        if (statusCode == 907135004) {
            return false;
        }
        m75794n();
        m75782c(1);
        this.f52441p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i = this.f52436k.get();
        return i == 2 || i == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.m80174i("HuaweiApiClientImpl", "onPause");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.m80174i("HuaweiApiClientImpl", "onResume");
            this.f52434i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.m80174i("HuaweiApiClientImpl", "HuaweiApiClientImpl Enter onServiceConnected.");
        m75770a(2);
        this.f52431f = InterfaceC17759d.a.m75899a(iBinder);
        if (this.f52431f != null) {
            if (this.f52436k.get() == 5) {
                m75782c(2);
                m75790j();
                m75789i();
                return;
            } else {
                if (this.f52436k.get() != 3) {
                    m75794n();
                    return;
                }
                return;
            }
        }
        HMSLog.m80172e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
        m75794n();
        m75782c(1);
        if (this.f52448w != null) {
            WeakReference<Activity> weakReference = this.f52433h;
            ConnectionResult connectionResult = new ConnectionResult(10, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f52433h.get(), 10));
            this.f52448w.onConnectionFailed(connectionResult);
            this.f52446u = connectionResult;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f52431f = null;
        m75782c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f52447v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f52443r) {
            try {
                if (this.f52448w != onConnectionFailedListener) {
                    HMSLog.m80175w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
                } else {
                    this.f52448w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f52443r) {
            try {
                if (this.f52447v != connectionCallbacks) {
                    HMSLog.m80175w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
                } else {
                    this.f52447v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f52439n = map;
    }

    public void setAutoLifecycleClientId(int i) {
        this.f52426a = i;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f52447v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f52448w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z) {
        this.f52435j = z;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f52438m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f52437l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.m80172e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m80172e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.f52428c) ? Util.getAppId(this.f52427b) : this.f52428c)) {
            HMSLog.m80172e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f52440o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m75782c(int i) {
        this.f52436k.set(i);
        if (i == 1 || i == 3 || i == 2) {
            this.f52444s.lock();
            try {
                this.f52445t.signalAll();
            } finally {
                this.f52444s.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m75776b(int i) {
        PendingIntent resolveErrorPendingIntent;
        WeakReference<Activity> weakReference = this.f52433h;
        if (weakReference == null || weakReference.get() == null) {
            resolveErrorPendingIntent = null;
        } else {
            resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f52433h.get(), i);
            C21791OooO0o0.OooO0OO(i, "connect 2.0 fail: ", "HuaweiApiClientImpl");
        }
        ConnectionResult connectionResult = new ConnectionResult(i, resolveErrorPendingIntent);
        this.f52448w.onConnectionFailed(connectionResult);
        this.f52446u = connectionResult;
    }

    /* JADX INFO: renamed from: a */
    private void m75769a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f52427b).getServiceAction());
        HMSPackageManager.getInstance(this.f52427b).refreshForMultiService();
        intent.setPackage(HMSPackageManager.getInstance(this.f52427b).getHMSPackageNameForMultiService());
        synchronized (f52425z) {
            try {
                if (this.f52427b.bindService(intent, this, 1)) {
                    m75788h();
                    return;
                }
                m75782c(1);
                HMSLog.m80172e("HuaweiApiClientImpl", "In connect, bind core service fail");
                m75775b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private ConnectInfo m75780c() {
        String packageSignature = new PackageManagerHelper(this.f52427b).getPackageSignature(this.f52427b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f52440o;
        return new ConnectInfo(getApiNameList(), this.f52437l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* JADX INFO: renamed from: c */
    private void m75783c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        m75782c(3);
        this.f52446u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f52447v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f52433h != null) {
            m75793m();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.m80174i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.m80174i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f52433h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m75775b() {
        m75794n();
        if (this.f52448w != null) {
            int i = UIUtil.isBackground(this.f52427b) ? 7 : 6;
            WeakReference<Activity> weakReference = this.f52433h;
            ConnectionResult connectionResult = new ConnectionResult(i, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f52433h.get(), i));
            this.f52448w.onConnectionFailed(connectionResult);
            this.f52446u = connectionResult;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m75770a(int i) {
        if (i == 2) {
            synchronized (f52425z) {
                try {
                    Handler handler = this.f52449x;
                    if (handler != null) {
                        handler.removeMessages(i);
                        this.f52449x = null;
                    }
                } finally {
                }
            }
        }
        if (i == 3) {
            synchronized (f52424A) {
                try {
                    Handler handler2 = this.f52450y;
                    if (handler2 != null) {
                        handler2.removeMessages(i);
                        this.f52450y = null;
                    }
                } finally {
                }
            }
        }
        synchronized (f52425z) {
            try {
                Handler handler3 = this.f52449x;
                if (handler3 != null) {
                    handler3.removeMessages(2);
                    this.f52449x = null;
                }
            } finally {
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f52444s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        return new ConnectionResult(14, (PendingIntent) null);
                    }
                    nanos = this.f52445t.awaitNanos(nanos);
                }
                if (isConnected()) {
                    this.f52446u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f52446u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f52444s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m75779b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        m75794n();
        m75782c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75773a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.m80174i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f52431f != null && this.f52436k.get() == 2) {
            m75770a(3);
            ConnectResp value = resolveResult.getValue();
            if (value != null) {
                this.f52432g = value.sessionId;
            }
            SubAppInfo subAppInfo = this.f52440o;
            PendingIntent resolveErrorPendingIntent = null;
            String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
            if (!TextUtils.isEmpty(subAppID)) {
                this.f52429d = subAppID;
            }
            int statusCode = resolveResult.getStatus().getStatusCode();
            C21791OooO0o0.OooO0OO(statusCode, "Enter onConnectionResult, connect to server result: ", "HuaweiApiClientImpl");
            if (Status.SUCCESS.equals(resolveResult.getStatus())) {
                m75783c(resolveResult);
                return;
            }
            if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
                m75794n();
                m75782c(1);
                HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f52447v;
                if (connectionCallbacks != null) {
                    connectionCallbacks.onConnectionSuspended(3);
                    return;
                }
                return;
            }
            m75794n();
            m75782c(1);
            if (this.f52448w != null) {
                WeakReference<Activity> weakReference = this.f52433h;
                if (weakReference != null && weakReference.get() != null) {
                    resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f52433h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, resolveErrorPendingIntent);
                this.f52448w.onConnectionFailed(connectionResult);
                this.f52446u = connectionResult;
                return;
            }
            return;
        }
        HMSLog.m80172e("HuaweiApiClientImpl", "Invalid onConnectionResult");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i) {
        connect((Activity) null);
    }
}
