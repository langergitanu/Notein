package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO0O0;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.network.base.util.HttpUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18185g5 {

    /* JADX INFO: renamed from: a */
    public String f54910a;

    /* JADX INFO: renamed from: b */
    public URL f54911b;

    /* JADX INFO: renamed from: c */
    public MalformedURLException f54912c;

    /* JADX INFO: renamed from: d */
    public List<String> f54913d = new ArrayList();

    public C18185g5(String str) {
        setUrl(str);
    }

    public C18185g5 addIp(String str) {
        this.f54913d.add(str);
        return this;
    }

    public String getHost() {
        URL url = this.f54911b;
        return url == null ? "" : url.getHost();
    }

    public List<String> getIps() {
        return this.f54913d;
    }

    public int getPort() {
        URL url = this.f54911b;
        if (url == null) {
            return -1;
        }
        return url.getPort();
    }

    public URL getURL() throws MalformedURLException {
        URL url = this.f54911b;
        if (url != null) {
            return url;
        }
        throw this.f54912c;
    }

    public String getUrl() {
        return this.f54910a;
    }

    public C18185g5 setIps(List<String> list) {
        this.f54913d = list;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C18185g5 setUrl(String str) {
        String strOooO00o;
        StringBuilder sb;
        int i;
        CheckParamUtils.checkNotNull(str, "url == null");
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            sb = new StringBuilder("http:");
            i = 3;
        } else {
            if (!str.regionMatches(true, 0, "wss:", 0, 4)) {
                strOooO00o = str;
                if (HttpUtils.isHttpOrGrsUrl(strOooO00o)) {
                    throw new IllegalArgumentException("url not valid must be http://;https://;grs://");
                }
                this.f54910a = strOooO00o;
                if (HttpUtils.isHttpUrl(strOooO00o)) {
                    try {
                        this.f54911b = new URL(strOooO00o);
                        return this;
                    } catch (MalformedURLException e) {
                        this.f54912c = e;
                    }
                }
                return this;
            }
            sb = new StringBuilder("https:");
            i = 4;
        }
        strOooO00o = OooO0O0.OooO00o(str, i, sb);
        if (HttpUtils.isHttpOrGrsUrl(strOooO00o)) {
        }
    }

    public String toString() {
        return super.toString();
    }
}
