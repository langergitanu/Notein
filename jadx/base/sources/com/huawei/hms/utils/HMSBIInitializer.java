package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.C18449a;
import com.huawei.hms.stats.C18451c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class HMSBIInitializer {

    /* JADX INFO: renamed from: d */
    public static final Object f56998d = new Object();

    /* JADX INFO: renamed from: e */
    public static HMSBIInitializer f56999e;

    /* JADX INFO: renamed from: f */
    public static HiAnalyticsInstance f57000f;

    /* JADX INFO: renamed from: a */
    public final Context f57001a;

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f57002b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public boolean f57003c = C18451c.m80087a();

    /* JADX INFO: renamed from: com.huawei.hms.utils.HMSBIInitializer$a */
    public class C18497a implements IQueryUrlCallBack {
        public C18497a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i) {
            HMSLog.m80172e("HMSBIInitializer", "get grs failed, the errorcode is " + i);
            HMSBIInitializer.this.f57002b.set(false);
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (HMSBIInitializer.this.f57003c) {
                    HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
                    HiAnalyticsInstance unused = HMSBIInitializer.f57000f = new HiAnalyticsInstance.Builder(HMSBIInitializer.this.f57001a).setOperConf(hiAnalyticsConfigBuild).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
                    HMSBIInitializer.f57000f.setAppid("com.huawei.hwid");
                } else {
                    HmsHiAnalyticsUtils.init(HMSBIInitializer.this.f57001a, false, false, false, str, "com.huawei.hwid");
                }
                HMSLog.m80174i("HMSBIInitializer", "BI URL acquired successfully");
            }
            HMSBIInitializer.this.f57002b.set(false);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.utils.HMSBIInitializer$b */
    public class AsyncTaskC18498b extends AsyncTask<String, Integer, Void> {
        public AsyncTaskC18498b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.m80195a(strArr[0]);
            return null;
        }

        public /* synthetic */ AsyncTaskC18498b(HMSBIInitializer hMSBIInitializer, C18497a c18497a) {
            this();
        }
    }

    public HMSBIInitializer(Context context) {
        this.f57001a = context;
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (f56998d) {
            try {
                if (f56999e == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        f56999e = new HMSBIInitializer(applicationContext);
                    } else {
                        f56999e = new HMSBIInitializer(context);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f56999e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f57000f;
    }

    public void initBI() {
        boolean initFlag = !this.f57003c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        HMSLog.m80174i("HMSBIInitializer", "Builder->biInitFlag :" + initFlag);
        if (initFlag || C18449a.m80082c(this.f57001a) || !this.f57002b.compareAndSet(false, true)) {
            return;
        }
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f57001a);
        if (!TextUtils.isEmpty(issueCountryCode)) {
            issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
        }
        if (!GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
            new AsyncTaskC18498b(this, null).execute(issueCountryCode);
        } else {
            HMSLog.m80172e("HMSBIInitializer", "Failed to get device issue country");
            this.f57002b.set(false);
        }
    }

    public boolean isInit() {
        return !this.f57003c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    /* JADX INFO: renamed from: a */
    public final void m80195a(String str) {
        HMSLog.m80174i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f57001a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new C18497a());
    }
}
