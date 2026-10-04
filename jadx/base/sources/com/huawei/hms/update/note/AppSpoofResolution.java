package com.huawei.hms.update.note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.C17730b;
import com.huawei.hms.p588ui.AbstractDialog;
import com.huawei.hms.p588ui.AbstractPromptDialog;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: loaded from: classes9.dex */
public class AppSpoofResolution implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: a */
    public Activity f56981a;

    /* JADX INFO: renamed from: b */
    public C18494b f56982b;

    /* JADX INFO: renamed from: com.huawei.hms.update.note.AppSpoofResolution$a */
    public class C18493a implements AbstractDialog.Callback {
        public C18493a() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            C17730b.f52479c.m75817a(true);
            AppSpoofResolution.this.f56982b = null;
            AppSpoofResolution.this.m80180a();
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            C17730b.f52479c.m75817a(true);
            AppSpoofResolution.this.f56982b = null;
            AppSpoofResolution.this.m80180a();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.update.note.AppSpoofResolution$b */
    public static class C18494b extends AbstractPromptDialog {
        public C18494b() {
        }

        @Override // com.huawei.hms.p588ui.AbstractDialog
        public String onGetMessageString(Context context) {
            String applicationName = new PackageManagerHelper(context).getApplicationName("com.huawei.hwid");
            String str = TextUtils.isEmpty(applicationName) ? "com.huawei.hwid" : applicationName;
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_is_spoof", str);
        }

        @Override // com.huawei.hms.p588ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        @Override // com.huawei.hms.p588ui.AbstractPromptDialog, com.huawei.hms.p588ui.AbstractDialog
        public String onGetTitleString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_spoof_hints");
        }

        public /* synthetic */ C18494b(C18493a c18493a) {
            this();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m80181b() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        C18494b c18494b = this.f56982b;
        if (c18494b == null) {
            this.f56982b = new C18494b(null);
        } else {
            c18494b.dismiss();
        }
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution showPromptdlg to resolve conn error");
        this.f56982b.show(activity, new C18493a());
    }

    public Activity getActivity() {
        return this.f56981a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityCreate");
        this.f56981a = activity;
        C17730b c17730b = C17730b.f52479c;
        c17730b.m75816a(activity);
        c17730b.m75817a(false);
        m80181b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityDestroy");
        C17730b c17730b = C17730b.f52479c;
        if (c17730b.m75815a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        c17730b.m75818b(this.f56981a);
        this.f56981a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityResult");
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f56982b == null) {
            return;
        }
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution re show prompt dialog");
        m80181b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution On key up when resolve spoof error");
    }

    /* JADX INFO: renamed from: a */
    public final void m80180a() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        HMSLog.m80174i("AppSpoofResolution", "enter AppSpoofResolution finishBridgeActivity：");
        if (C17730b.f52479c.m75815a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        activity.finish();
    }
}
