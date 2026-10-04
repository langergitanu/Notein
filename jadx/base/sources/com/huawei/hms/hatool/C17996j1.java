package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.huawei.hms.hatool.j1 */
/* JADX INFO: loaded from: classes8.dex */
public class C17996j1 {

    /* JADX INFO: renamed from: a */
    public String f53825a;

    /* JADX INFO: renamed from: b */
    public C18003m f53826b;

    public C17996j1(String str) {
        this.f53825a = str;
        this.f53826b = new C18003m(str);
        C17991i.m77353c().m77357a(this.f53825a, this.f53826b);
    }

    /* JADX INFO: renamed from: a */
    public void m77380a(int i) {
        C18030y.m77588d("hmsSdk", "onReport. TAG: " + this.f53825a + ", TYPE: " + i);
        C17993i1.m77362a().m77366a(this.f53825a, i);
    }

    /* JADX INFO: renamed from: b */
    public final C17997k m77384b(int i) {
        if (i == 0) {
            return this.f53826b.m77468c();
        }
        if (i == 1) {
            return this.f53826b.m77466b();
        }
        if (i == 2) {
            return this.f53826b.m77469d();
        }
        if (i != 3) {
            return null;
        }
        return this.f53826b.m77463a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77386c(int i) {
        String str;
        if (i != 2) {
            C17997k c17997kM77384b = m77384b(i);
            if (c17997kM77384b != null && !TextUtils.isEmpty(c17997kM77384b.m77410h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else {
            if ("_default_config_tag".equals(this.f53825a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        C18030y.m77590e("hmsSdk", str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m77381a(int i, String str, LinkedHashMap<String, String> linkedHashMap) throws IOException {
        StringBuilder sb = new StringBuilder("onEvent. TAG: ");
        String str2 = this.f53825a;
        ByteArrayOutputStream.close();
        sb.append(str);
        C18030y.m77588d("hmsSdk", sb.toString());
        if (C18019s0.m77525a(str) || !m77386c(i)) {
            C18030y.m77590e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f53825a + ", TYPE: " + i);
            return;
        }
        if (!C18019s0.m77528a(linkedHashMap)) {
            C18030y.m77590e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f53825a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        C17993i1.m77362a().m77367a(this.f53825a, i, str, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public void m77385b(C17997k c17997k) {
        C18030y.m77586c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f53825a);
        if (c17997k != null) {
            this.f53826b.m77467b(c17997k);
        } else {
            this.f53826b.m77467b(null);
            C18030y.m77590e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77382a(Context context, String str, String str2) {
        C18030y.m77588d("hmsSdk", "onEvent(context). TAG: " + this.f53825a + ", eventId : " + str);
        if (context == null) {
            C18030y.m77590e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (C18019s0.m77525a(str) || !m77386c(0)) {
            C18030y.m77590e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f53825a);
        } else {
            if (!C18019s0.m77526a("value", str2, 65536)) {
                C18030y.m77590e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f53825a);
                str2 = "";
            }
            C17993i1.m77362a().m77368a(this.f53825a, context, str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77383a(C17997k c17997k) {
        C18030y.m77586c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f53825a);
        if (c17997k != null) {
            this.f53826b.m77465a(c17997k);
        } else {
            C18030y.m77590e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f53826b.m77465a((C17997k) null);
        }
    }
}
