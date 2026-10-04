package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18166f0 {

    /* JADX INFO: renamed from: d */
    public static final String f54708d = "IQuery";

    /* JADX INFO: renamed from: b */
    public ExecutorService f54710b;

    /* JADX INFO: renamed from: a */
    public C18180g0 f54709a = new C18180g0();

    /* JADX INFO: renamed from: c */
    public AbstractC18434z f54711c = AbstractC18434z.f56736e;

    /* JADX INFO: renamed from: a */
    public final AbstractC18166f0 m78402a() {
        this.f54711c.mo77835b(this.f54709a);
        C18180g0 c18180g0Mo78285b = mo78285b(this.f54711c);
        this.f54709a = c18180g0Mo78285b;
        if (c18180g0Mo78285b == null) {
            this.f54709a = new C18180g0();
        }
        this.f54711c.mo77833a(this.f54709a);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public abstract C18180g0 mo78285b(AbstractC18434z abstractC18434z);

    /* JADX INFO: renamed from: a */
    public final AbstractC18166f0 m78403a(AbstractC18166f0 abstractC18166f0) {
        if (!this.f54709a.m78523c()) {
            Logger.m76963i(f54708d, "the next quary will not execute!");
            return this;
        }
        this.f54709a.m78522b(false);
        abstractC18166f0.f54709a = this.f54709a;
        abstractC18166f0.m78402a();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC18166f0 m78404a(AbstractC18434z abstractC18434z) {
        this.f54711c = abstractC18434z;
        return this;
    }
}
