package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.https.annotation.Result;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.as */
/* JADX INFO: loaded from: classes8.dex */
public class C17617as {

    @Result("backDomain")
    private List<C17614ap> backDomain;

    @Result("mainDomain")
    private List<C17614ap> mainDomain;

    @Result("ret")
    private C17610al ret;

    @Result("ttl")
    String ttl;

    /* JADX INFO: renamed from: a */
    public C17610al m75501a() {
        return this.ret;
    }

    /* JADX INFO: renamed from: b */
    public List<C17614ap> m75502b() {
        return this.mainDomain;
    }

    /* JADX INFO: renamed from: c */
    public List<C17614ap> m75503c() {
        return this.backDomain;
    }

    /* JADX INFO: renamed from: d */
    public String m75504d() {
        return this.ttl;
    }
}
