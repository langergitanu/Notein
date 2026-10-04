package com.huawei.hms.utils;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.device.C17762a;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class HMSPackageManager {

    /* JADX INFO: renamed from: l */
    public static HMSPackageManager f57006l;

    /* JADX INFO: renamed from: m */
    public static final Object f57007m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f57008n = new Object();

    /* JADX INFO: renamed from: o */
    public static final Object f57009o = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f57010a;

    /* JADX INFO: renamed from: b */
    public final PackageManagerHelper f57011b;

    /* JADX INFO: renamed from: c */
    public String f57012c;

    /* JADX INFO: renamed from: d */
    public String f57013d;

    /* JADX INFO: renamed from: e */
    public int f57014e;

    /* JADX INFO: renamed from: f */
    public String f57015f;

    /* JADX INFO: renamed from: g */
    public String f57016g;

    /* JADX INFO: renamed from: h */
    public String f57017h;

    /* JADX INFO: renamed from: i */
    public int f57018i;

    /* JADX INFO: renamed from: j */
    public int f57019j;

    /* JADX INFO: renamed from: k */
    public long f57020k;

    /* JADX INFO: renamed from: com.huawei.hms.utils.HMSPackageManager$a */
    public class RunnableC18499a implements Runnable {
        public RunnableC18499a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m80174i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            Iterator<ResolveInfo> it = HMSPackageManager.this.f57010a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128).iterator();
            while (it.hasNext()) {
                if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                    HMSPackageManager.this.m80206c();
                }
            }
            HMSLog.m80174i("HMSPackageManager", "quit asyncOnceCheckMDMState");
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.utils.HMSPackageManager$b */
    public static class C18500b implements Comparable<C18500b> {

        /* JADX INFO: renamed from: a */
        public String f57022a;

        /* JADX INFO: renamed from: b */
        public String f57023b;

        /* JADX INFO: renamed from: c */
        public String f57024c;

        /* JADX INFO: renamed from: d */
        public String f57025d;

        /* JADX INFO: renamed from: e */
        public String f57026e;

        /* JADX INFO: renamed from: f */
        public Long f57027f;

        public C18500b(String str, String str2, String str3, String str4, String str5, long j) {
            this.f57022a = str;
            this.f57023b = str2;
            this.f57024c = str3;
            this.f57025d = str4;
            this.f57026e = str5;
            this.f57027f = Long.valueOf(j);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18500b c18500b) {
            return TextUtils.equals(this.f57026e, c18500b.f57026e) ? this.f57027f.compareTo(c18500b.f57027f) : this.f57026e.compareTo(c18500b.f57026e);
        }
    }

    public HMSPackageManager(Context context) {
        this.f57010a = context;
        this.f57011b = new PackageManagerHelper(context);
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f57007m) {
            try {
                if (f57006l == null) {
                    if (context.getApplicationContext() != null) {
                        f57006l = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        f57006l = new HMSPackageManager(context);
                    }
                    f57006l.m80213j();
                    f57006l.m80202a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f57006l;
    }

    /* JADX INFO: renamed from: c */
    public final int m80206c() {
        synchronized (f57009o) {
            try {
                HMSLog.m80174i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.f57011b.getPackageFirstInstallTime("com.huawei.hwid");
                if (this.f57019j != 3 && this.f57020k == packageFirstInstallTime) {
                    HMSLog.m80174i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + m80198a(this.f57019j));
                    return this.f57019j;
                }
                this.f57019j = m80205b() ? 2 : 1;
                this.f57020k = this.f57011b.getPackageFirstInstallTime("com.huawei.hwid");
                HMSLog.m80174i("HMSPackageManager", "quit checkHmsIsSpoof state: " + m80198a(this.f57019j));
                return this.f57019j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m80207d() {
        synchronized (f57008n) {
            this.f57015f = null;
            this.f57016g = null;
            this.f57017h = null;
            this.f57018i = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m80208e() {
        synchronized (f57008n) {
            this.f57012c = null;
            this.f57013d = null;
            this.f57014e = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Pair<String, String> m80209f() {
        List<ResolveInfo> listQueryIntentServices = this.f57010a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
        if (listQueryIntentServices.size() == 0) {
            return null;
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            String str = serviceInfo.applicationInfo.packageName;
            Bundle bundle = serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.m80172e("HMSPackageManager", "skip package " + str + " for metadata is null");
            } else if (!bundle.containsKey("hms_app_signer")) {
                HMSLog.m80172e("HMSPackageManager", "skip package " + str + " for no signer");
            } else if (bundle.containsKey("hms_app_cert_chain")) {
                String packageSignature = this.f57011b.getPackageSignature(str);
                if (m80203a(o0Oo0oo.OooO0Oo(str, "&", packageSignature), bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                    return new Pair<>(str, packageSignature);
                }
                HMSLog.m80172e("HMSPackageManager", "checkSigner failed");
            } else {
                HMSLog.m80172e("HMSPackageManager", "skip package " + str + " for no cert chain");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Pair<String, String> m80210g() {
        Pair<String, String> pairM80209f = m80209f();
        if (pairM80209f != null) {
            HMSLog.m80174i("HMSPackageManager", "aidlService pkgName: " + ((String) pairM80209f.first));
            this.f57017h = "com.huawei.hms.core.aidlservice";
            return pairM80209f;
        }
        ArrayList<C18500b> arrayListM80211h = m80211h();
        if (arrayListM80211h == null) {
            HMSLog.m80172e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        for (C18500b c18500b : arrayListM80211h) {
            String str = c18500b.f57022a;
            String str2 = c18500b.f57023b;
            String str3 = c18500b.f57024c;
            String str4 = c18500b.f57025d;
            String packageSignature = this.f57011b.getPackageSignature(str);
            if (m80203a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                StringBuilder sbOooO0O0 = OooO0o.OooO0O0("result: ", str, ", ", str2, ", ");
                sbOooO0O0.append(c18500b.f57027f);
                HMSLog.m80174i("HMSPackageManager", sbOooO0O0.toString());
                this.f57017h = PackageConstants.GENERAL_SERVICES_ACTION;
                m80204b(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    public String getHMSFingerprint() {
        String str = this.f57013d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.m80174i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f57012c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f57011b.getPackageStates(str))) {
                HMSLog.m80174i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                m80212i();
            }
            String str2 = this.f57012c;
            if (str2 != null) {
                return str2;
            }
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f57011b.getPackageStates("com.huawei.hwid"))) {
            "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(this.f57011b.getPackageSignature("com.huawei.hwid"));
        }
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.m80174i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f57015f;
        if (str == null) {
            return "com.huawei.hwid";
        }
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f57011b.getPackageStates(str))) {
            HMSLog.m80174i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
            m80213j();
        }
        String str2 = this.f57015f;
        return str2 != null ? str2 : "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f57007m) {
            refresh();
            PackageManagerHelper.PackageStates packageStates = this.f57011b.getPackageStates(this.f57012c);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                m80208e();
                return packageStates2;
            }
            if ("com.huawei.hwid".equals(this.f57012c) && m80206c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            return (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.f57013d.equals(this.f57011b.getPackageSignature(this.f57012c))) ? packageStates : packageStates2;
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f57007m) {
            refreshForMultiService();
            PackageManagerHelper.PackageStates packageStates = this.f57011b.getPackageStates(this.f57015f);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                m80207d();
                return packageStates2;
            }
            if ("com.huawei.hwid".equals(this.f57015f) && m80206c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            return (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.f57016g.equals(this.f57011b.getPackageSignature(this.f57015f))) ? packageStates : packageStates2;
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f57011b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f57011b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f57017h) ? this.f57017h : "com.huawei.hms.core.aidlservice";
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList<C18500b> m80211h() {
        List<ResolveInfo> listQueryIntentServices = this.f57010a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            HMSLog.m80172e("HMSPackageManager", "resolveInfoList is null or empty");
            return null;
        }
        ArrayList<C18500b> arrayList = new ArrayList<>();
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            long packageFirstInstallTime = this.f57011b.getPackageFirstInstallTime(str);
            Bundle bundle = resolveInfo.serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.m80172e("HMSPackageManager", "package " + str + " get metaData is null");
            } else {
                String strM80200a = m80200a(bundle, "hms_app_checker_config");
                String strM80201a = m80201a(strM80200a);
                if (TextUtils.isEmpty(strM80201a)) {
                    HMSLog.m80174i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + strM80200a);
                } else {
                    String strM80200a2 = m80200a(bundle, "hms_app_signer_v2");
                    if (TextUtils.isEmpty(strM80200a2)) {
                        HMSLog.m80174i("HMSPackageManager", "get signerV2 fail.");
                    } else {
                        String strM80200a3 = m80200a(bundle, "hms_app_cert_chain");
                        if (TextUtils.isEmpty(strM80200a3)) {
                            HMSLog.m80174i("HMSPackageManager", "get certChain fail.");
                        } else {
                            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("add: ", str, ", ", strM80200a, ", ");
                            sbOooO0O0.append(packageFirstInstallTime);
                            HMSLog.m80174i("HMSPackageManager", sbOooO0O0.toString());
                            arrayList.add(new C18500b(str, strM80200a, strM80200a2, strM80200a3, strM80201a, packageFirstInstallTime));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean hmsVerHigherThan(int i) {
        if (this.f57014e >= i || !m80214k()) {
            return true;
        }
        int packageVersionCode = this.f57011b.getPackageVersionCode(getHMSPackageName());
        this.f57014e = packageVersionCode;
        return packageVersionCode >= i;
    }

    /* JADX INFO: renamed from: i */
    public final void m80212i() {
        synchronized (f57008n) {
            try {
                Pair<String, String> pairM80209f = m80209f();
                if (pairM80209f == null) {
                    HMSLog.m80172e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    m80208e();
                    return;
                }
                this.f57012c = (String) pairM80209f.first;
                this.f57013d = (String) pairM80209f.second;
                this.f57014e = this.f57011b.getPackageVersionCode(getHMSPackageName());
                HMSLog.m80174i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f57012c + " version: " + this.f57014e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isApkNeedUpdate(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m80174i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i);
        return hmsVersionCode < i;
    }

    public boolean isApkUpdateNecessary(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m80174i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i);
        return m80214k() && hmsVersionCode < i;
    }

    /* JADX INFO: renamed from: j */
    public final void m80213j() {
        synchronized (f57008n) {
            try {
                Pair<String, String> pairM80210g = m80210g();
                if (pairM80210g == null) {
                    HMSLog.m80172e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    m80207d();
                    return;
                }
                this.f57015f = (String) pairM80210g.first;
                this.f57016g = (String) pairM80210g.second;
                this.f57018i = this.f57011b.getPackageVersionCode(getHMSPackageNameForMultiService());
                HMSLog.m80174i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f57015f + " version: " + this.f57018i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m80214k() {
        Bundle bundle;
        PackageManager packageManager = this.f57010a.getPackageManager();
        if (packageManager == null) {
            HMSLog.m80172e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m80172e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e) {
            HMSLog.m80173e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e);
        }
        if (TextUtils.isEmpty(this.f57017h) || (!this.f57017h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.f57017h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.m80174i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.m80174i("HMSPackageManager", "action = " + this.f57017h + " exist");
        return false;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f57012c) || TextUtils.isEmpty(this.f57013d)) {
            m80212i();
        }
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f57015f) || TextUtils.isEmpty(this.f57016g)) {
            m80213j();
        }
    }

    public void resetMultiServiceState() {
        m80207d();
    }

    /* JADX INFO: renamed from: a */
    public final String m80200a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        HMSLog.m80172e("HMSPackageManager", "no " + str + " in metaData");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m80204b(String str) {
        String strM80201a = m80201a(str);
        if (TextUtils.isEmpty(strM80201a)) {
            return;
        }
        strM80201a.substring(9);
    }

    /* JADX INFO: renamed from: a */
    public final String m80201a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("priority=");
        if (iIndexOf == -1) {
            HMSLog.m80172e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf, iIndexOf2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80205b() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f57010a);
        if (hmsPath == null) {
            HMSLog.m80174i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.m80174i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.m80174i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.m80174i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [long] */
    /* JADX INFO: renamed from: a */
    public final boolean m80203a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> listM75921b = C17762a.m75921b(str3);
            if (listM75921b.size() == 0) {
                HMSLog.m80172e("HMSPackageManager", "certChain is empty");
                return false;
            }
            if (!C17762a.m75918a(C17762a.m75911a(this.f57010a), listM75921b)) {
                HMSLog.m80172e("HMSPackageManager", "failed to verify cert chain");
                return false;
            }
            X509Certificate x509Certificate = (X509Certificate) System.currentTimeMillis();
            if (!C17762a.m75916a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.m80172e("HMSPackageManager", "CN is invalid");
                return false;
            }
            if (!C17762a.m75923b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.m80172e("HMSPackageManager", "OU is invalid");
                return false;
            }
            if (C17762a.m75917a(x509Certificate, str, str2)) {
                return true;
            }
            HMSLog.m80172e("HMSPackageManager", "signature is invalid: " + str);
            return false;
        }
        HMSLog.m80172e("HMSPackageManager", "args is invalid");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m80202a() {
        new Thread(new RunnableC18499a(), "Thread-asyncOnceCheckMDMState").start();
    }

    /* JADX INFO: renamed from: a */
    public static String m80198a(int i) {
        if (i == 1) {
            return "SPOOFED";
        }
        if (i == 2) {
            return MaterialPurchaseStatusResponse.STATUS_SUCCESS;
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        HMSLog.m80172e("HMSPackageManager", "invalid checkMDM state: " + i);
        return "";
    }
}
