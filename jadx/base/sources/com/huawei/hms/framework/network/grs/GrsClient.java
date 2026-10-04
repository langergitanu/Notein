package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class GrsClient {
    private static final String EMPTY_STRING = "";
    private final C17931c grsClientGlobal;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
        }
        this.grsClientGlobal = C17932d.m77007a(grsBaseInfo, context);
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        C17931c c17931c = this.grsClientGlobal;
        if (c17931c == null) {
            iQueryUrlCallBack.onCallBackFail(-8);
        } else {
            c17931c.m77004a(str, str2, iQueryUrlCallBack);
        }
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        C17931c c17931c = this.grsClientGlobal;
        if (c17931c == null) {
            iQueryUrlsCallBack.onCallBackFail(-8);
        } else {
            c17931c.m77003a(str, iQueryUrlsCallBack);
        }
    }

    public void clearSp() {
        C17931c c17931c = this.grsClientGlobal;
        if (c17931c == null) {
            return;
        }
        c17931c.m77002a();
    }

    public boolean forceExpire() {
        C17931c c17931c = this.grsClientGlobal;
        if (c17931c == null) {
            return false;
        }
        return c17931c.m77006b();
    }

    public String synGetGrsUrl(String str, String str2) {
        C17931c c17931c = this.grsClientGlobal;
        return c17931c == null ? "" : c17931c.m77000a(str, str2);
    }

    public Map<String, String> synGetGrsUrls(String str) {
        C17931c c17931c = this.grsClientGlobal;
        return c17931c == null ? new HashMap() : c17931c.m77001a(str);
    }
}
