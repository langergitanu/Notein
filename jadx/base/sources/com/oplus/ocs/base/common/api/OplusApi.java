package com.oplus.ocs.base.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.Api.ApiOptions;
import com.oplus.ocs.base.common.api.OplusApi;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import com.oplus.ocs.base.internal.ClientSettings;
import com.oplus.ocs.base.task.Task;
import com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.utils.C18861a;
import com.oplus.ocs.base.utils.C18864d;
import com.oplus.ocs.base.utils.ServiceCheck;

/* JADX INFO: loaded from: classes9.dex */
public abstract class OplusApi<O extends Api.ApiOptions, R extends OplusApi> {

    /* JADX INFO: renamed from: a */
    O f57471a;

    /* JADX INFO: renamed from: b */
    private Context f57472b;

    /* JADX INFO: renamed from: c */
    private Api<O> f57473c;

    /* JADX INFO: renamed from: d */
    private C18835l f57474d;

    /* JADX INFO: renamed from: e */
    private ClientSettings f57475e;

    /* JADX INFO: renamed from: f */
    private boolean f57476f;

    public OplusApi(Context context, Api<O> api, ClientSettings clientSettings) {
        this(context, api, null, clientSettings, true);
    }

    public static boolean checkInternal(Context context) {
        return ServiceCheck.m80540a(context);
    }

    public R addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        return (R) addOnConnectionFailedListener(onConnectionFailedListener, new Handler(Looper.getMainLooper()));
    }

    public R addOnConnectionSucceedListener(OnConnectionSucceedListener onConnectionSucceedListener) {
        return (R) addOnConnectionSucceedListener(onConnectionSucceedListener, new Handler(Looper.getMainLooper()));
    }

    public void addThis2Cache() {
        if (this.f57476f) {
            this.f57474d.m80518a(this, this.f57475e);
        }
    }

    public void checkAuthResult(CapabilityInfo capabilityInfo) {
    }

    public void checkCapability() {
        if (this.f57474d != null) {
            C18835l.m80509a(this);
        }
    }

    public boolean checkExist() {
        return ServiceCheck.check(this.f57472b, "com.coloros.ocs.opencapabilityservice") || ServiceCheck.check(this.f57472b, "com.oplus.ocs");
    }

    public void disconnect() {
        if (this.f57476f) {
            C18835l c18835l = this.f57474d;
            Api<O> api = this.f57473c;
            Message messageObtainMessage = c18835l.f57536b.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = api;
            c18835l.f57536b.sendMessage(messageObtainMessage);
        }
    }

    public <TResult> Task<TResult> doRegisterListener(TaskListenerHolder.SuccessNotifier<TResult> successNotifier, TaskListenerHolder.FailureNotifier<TResult> failureNotifier) {
        return doRegisterListener(Looper.getMainLooper(), successNotifier, failureNotifier);
    }

    public Api<O> getApi() {
        return this.f57473c;
    }

    public AuthResult getAuthResult() {
        if (this.f57476f) {
            return C18835l.m80514d(this);
        }
        return null;
    }

    public String getClientName() {
        return "";
    }

    public IBinder getRemoteService() {
        if (this.f57476f) {
            return C18835l.m80512b(this);
        }
        return null;
    }

    public int getRemoteVersion() {
        if (this.f57476f) {
            return C18835l.m80513c(this);
        }
        return 0;
    }

    public abstract int getVersion();

    public abstract boolean hasFeature(String str);

    public abstract void init();

    public boolean isConnected() {
        if (this.f57476f) {
            return C18835l.m80515e(this);
        }
        return true;
    }

    public void releaseClientKey() {
        if (this.f57476f) {
            C18835l.m80508a(this.f57473c.getClientKey());
        }
    }

    public OplusApi(Activity activity, Api<O> api, O o2, ClientSettings clientSettings) {
        this(activity, api, o2, clientSettings, true);
    }

    public R addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener, Handler handler) {
        if (this.f57476f) {
            C18835l.m80510a(this, onConnectionFailedListener, handler);
        }
        return this;
    }

    public R addOnConnectionSucceedListener(final OnConnectionSucceedListener onConnectionSucceedListener, Handler handler) {
        if (this.f57476f) {
            this.f57474d.m80517a(this, onConnectionSucceedListener, handler);
            return this;
        }
        if (onConnectionSucceedListener != null) {
            if (handler == null) {
                onConnectionSucceedListener.onConnectionSucceed();
                return this;
            }
            handler.post(new Runnable() { // from class: com.oplus.ocs.base.common.api.OplusApi.1
                @Override // java.lang.Runnable
                public void run() {
                    onConnectionSucceedListener.onConnectionSucceed();
                }
            });
        }
        return this;
    }

    public <TResult> Task<TResult> doRegisterListener(Looper looper, TaskListenerHolder.SuccessNotifier<TResult> successNotifier, TaskListenerHolder.FailureNotifier<TResult> failureNotifier) {
        C18861a.m80544a("capability doRegisterListener");
        TaskImpl taskImpl = new TaskImpl();
        TaskListenerHolder taskListenerHolder = new TaskListenerHolder(looper, taskImpl, successNotifier, failureNotifier);
        if (this.f57476f) {
            C18835l.m80511a(this, taskListenerHolder);
        }
        return taskImpl;
    }

    public OplusApi(Context context, Api<O> api, O o2, ClientSettings clientSettings) {
        this(context, api, o2, clientSettings, true);
    }

    public OplusApi(Context context, Api<O> api, O o2, ClientSettings clientSettings, boolean z) {
        C18864d.m80554a(context, "Null context is not permitted.");
        C18864d.m80554a(api, "Api must not be null.");
        this.f57472b = context;
        this.f57473c = api;
        this.f57471a = o2;
        this.f57475e = clientSettings;
        this.f57476f = z;
        if (z) {
            C18835l c18835lM80507a = C18835l.m80507a(context);
            this.f57474d = c18835lM80507a;
            c18835lM80507a.m80518a(this, this.f57475e);
        } else {
            if (api.isAuth()) {
                return;
            }
            String clientName = getClientName();
            if (TextUtils.isEmpty(clientName)) {
                Api.Client clientBuildClient = getApi().getClientBuilder().buildClient(this.f57472b, Looper.getMainLooper(), clientSettings, null);
                if (clientBuildClient instanceof BaseClient) {
                    clientName = ((BaseClient) clientBuildClient).getClientName();
                }
            }
            String str = clientName;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Context context2 = this.f57472b;
            new InternalClient(context2, context2.getPackageName(), str, 0, false, null).connect4Stat();
        }
    }
}
