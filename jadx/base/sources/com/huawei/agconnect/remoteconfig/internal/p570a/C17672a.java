package com.huawei.agconnect.remoteconfig.internal.p570a;

import androidx.core.app.NotificationCompat;
import com.huawei.agconnect.https.annotation.Result;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.a.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17672a {

    @Result("code")
    private int code;

    @Result(NotificationCompat.CATEGORY_MESSAGE)
    private String msg;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
