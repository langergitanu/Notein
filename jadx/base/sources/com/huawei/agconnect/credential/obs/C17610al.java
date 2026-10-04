package com.huawei.agconnect.credential.obs;

import androidx.core.app.NotificationCompat;
import com.huawei.agconnect.https.annotation.Result;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.al */
/* JADX INFO: loaded from: classes8.dex */
public class C17610al {

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
