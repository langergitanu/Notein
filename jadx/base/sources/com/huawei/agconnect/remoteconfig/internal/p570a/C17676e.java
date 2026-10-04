package com.huawei.agconnect.remoteconfig.internal.p570a;

import com.huawei.agconnect.https.annotation.Result;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.a.e */
/* JADX INFO: loaded from: classes8.dex */
public class C17676e {

    @Result("experiments")
    private List<Map<String, String>> experiments;

    @Result("configItems")
    private List<C17673b> parameters;

    @Result("ret")
    private C17672a ret;

    @Result("tag")
    private String tag;

    public List<Map<String, String>> getExperiments() {
        return this.experiments;
    }

    public List<C17673b> getParameters() {
        return this.parameters;
    }

    public C17672a getRet() {
        return this.ret;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isSuccess() {
        C17672a c17672a = this.ret;
        return c17672a != null && c17672a.getCode() == 0;
    }

    public void setExperiments(List<Map<String, String>> list) {
        this.experiments = list;
    }

    public void setParameters(List<C17673b> list) {
        this.parameters = list;
    }

    public void setRet(C17672a c17672a) {
        this.ret = c17672a;
    }

    public void setTag(String str) {
        this.tag = str;
    }
}
