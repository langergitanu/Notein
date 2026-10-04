package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.p588ui.AbstractDialog;
import com.huawei.hms.p588ui.AbstractPromptDialog;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;

/* JADX INFO: loaded from: classes6.dex */
public class BindingFailedResolution implements IBridgeActivityDelegate, ServiceConnection {

    /* JADX INFO: renamed from: g */
    private static final Object f52398g = new Object();

    /* JADX INFO: renamed from: a */
    private Activity f52399a;

    /* JADX INFO: renamed from: c */
    private C17718d f52401c;

    /* JADX INFO: renamed from: d */
    private FailedBinderCallBack.BinderCallBack f52402d;

    /* JADX INFO: renamed from: b */
    private boolean f52400b = true;

    /* JADX INFO: renamed from: e */
    private Handler f52403e = null;

    /* JADX INFO: renamed from: f */
    private Handler f52404f = null;

    /* JADX INFO: renamed from: com.huawei.hms.api.BindingFailedResolution$a */
    public class C17715a implements Handler.Callback {
        public C17715a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            BindingFailedResolution.this.m75753a(8);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.BindingFailedResolution$b */
    public class C17716b implements Handler.Callback {
        public C17716b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.m80172e("BindingFailedResolution", "In connect, bind core try timeout");
            BindingFailedResolution.this.m75760b(false);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.BindingFailedResolution$c */
    public class C17717c implements AbstractDialog.Callback {
        public C17717c() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.f52401c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.m75753a(8);
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.f52401c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.m75753a(8);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.api.BindingFailedResolution$d */
    public static class C17718d extends AbstractPromptDialog {
        private C17718d() {
        }

        @Override // com.huawei.hms.p588ui.AbstractDialog
        public String onGetMessageString(Context context) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message", Util.getAppName(context, null), Util.getAppName(context, HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService()));
        }

        @Override // com.huawei.hms.p588ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        public /* synthetic */ C17718d(C17715a c17715a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m75760b(boolean z) {
        if (this.f52400b) {
            this.f52400b = false;
            onStartResult(z);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m75761c() {
        Handler handler = this.f52404f;
        if (handler != null) {
            handler.removeMessages(3);
        } else {
            this.f52404f = new Handler(Looper.getMainLooper(), new C17715a());
        }
        this.f52404f.sendEmptyMessageDelayed(3, 4000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Activity, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v0, types: [void] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    private void m75762d() {
        ?? activity = getActivity();
        if (activity == 0 || activity.printStackTrace() != 0) {
            return;
        }
        C17718d c17718d = this.f52401c;
        if (c17718d == null) {
            this.f52401c = new C17718d(null);
        } else {
            c17718d.dismiss();
        }
        HMSLog.m80174i("BindingFailedResolution", "showPromptdlg to resolve conn error");
        this.f52401c.show(activity, new C17717c());
    }

    public Activity getActivity() {
        return this.f52399a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra(FailedBinderCallBack.CALLER_ID)) {
            this.f52402d = FailedBinderCallBack.getInstance().getCallBack(Long.valueOf(intent.getLongExtra(FailedBinderCallBack.CALLER_ID, 0L)));
        }
        this.f52399a = activity;
        C17727a.f52472b.m75802a(activity);
        m75761c();
        m75754a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        m75752a();
        C17727a.f52472b.m75803b(this.f52399a);
        this.f52399a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.m80174i("BindingFailedResolution", "onBridgeActivityResult");
        Handler handler = this.f52404f;
        if (handler != null) {
            handler.removeMessages(3);
            this.f52404f = null;
        }
        m75757a(true);
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f52401c == null) {
            return;
        }
        HMSLog.m80174i("BindingFailedResolution", "re show prompt dialog");
        m75762d();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("BindingFailedResolution", "On key up when resolve conn error");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m75752a();
        m75760b(true);
        if (getActivity() == null) {
            return;
        }
        HMSLog.m80174i("BindingFailedResolution", "test connect success, try to reConnect and reply message");
        BindResolveClients.getInstance().notifyClientReconnect();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onStartResult(boolean z) {
        if (getActivity() == null) {
            return;
        }
        if (z) {
            m75753a(0);
        } else {
            m75762d();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.app.Activity, android.content.Context, java.lang.StringBuilder] */
    /* JADX INFO: renamed from: a */
    private void m75754a(Activity activity) {
        ?? sb;
        Intent intent = new Intent();
        intent.putExtra("intent.extra.isfullscreen", UIUtil.isActivityFullscreen(sb));
        intent.setClassName(HMSPackageManager.getInstance(sb.getApplicationContext()).getHMSPackageNameForMultiService(), HuaweiApiAvailability.ACTIVITY_NAME);
        HMSLog.m80174i("BindingFailedResolution", "onBridgeActivityCreate：try to start HMS");
        try {
            getRequestCode();
            sb = new StringBuilder();
        } catch (Throwable th) {
            HMSLog.m80172e("BindingFailedResolution", "ActivityNotFoundException：" + th.getMessage());
            Handler handler = this.f52404f;
            if (handler != null) {
                handler.removeMessages(3);
                this.f52404f = null;
            }
            m75757a(false);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m75759b() {
        Handler handler = this.f52403e;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f52403e = new Handler(Looper.getMainLooper(), new C17716b());
        }
        this.f52403e.sendEmptyMessageDelayed(2, 5000L);
    }

    /* JADX INFO: renamed from: a */
    private void m75758a(boolean z, int i) {
        FailedBinderCallBack.BinderCallBack binderCallBack;
        if (!z || (binderCallBack = this.f52402d) == null) {
            return;
        }
        binderCallBack.binderCallBack(i);
    }

    /* JADX INFO: renamed from: a */
    private void m75757a(boolean z) {
        Activity activity = getActivity();
        if (activity == null) {
            HMSLog.m80172e("BindingFailedResolution", "In connect, bind core try fail");
            m75760b(false);
            m75758a(z, 8);
            return;
        }
        Intent intent = new Intent(HMSPackageManager.getInstance(activity.getApplicationContext()).getServiceAction());
        intent.setPackage(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageNameForMultiService());
        synchronized (f52398g) {
            try {
                if (activity.bindService(intent, this, 1)) {
                    m75759b();
                    return;
                }
                HMSLog.m80172e("BindingFailedResolution", "In connect, bind core try fail");
                m75760b(false);
                m75758a(z, 8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Activity, android.content.Context, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v0, types: [void] */
    /* JADX INFO: renamed from: a */
    public void m75753a(int i) {
        ?? activity = getActivity();
        if (activity == 0 || activity.printStackTrace() != 0) {
            return;
        }
        HMSLog.m80174i("BindingFailedResolution", "finishBridgeActivity：" + i);
        Intent intent = new Intent();
        intent.putExtra(BridgeActivity.EXTRA_RESULT, i);
        activity.setResult(-1, intent);
        Util.unBindServiceCatchException(activity, this);
        activity.finish();
    }

    /* JADX INFO: renamed from: a */
    private void m75752a() {
        synchronized (f52398g) {
            try {
                Handler handler = this.f52403e;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.f52403e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
