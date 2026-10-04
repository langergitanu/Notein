package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.framework.qoes.HmsQoEApiManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f */
/* JADX INFO: loaded from: classes9.dex */
public class C18165f extends AbstractC18151e {

    /* JADX INFO: renamed from: f */
    public static final String f54703f = "NetDiagManagerImpl";

    /* JADX INFO: renamed from: b */
    public boolean f54704b;

    /* JADX INFO: renamed from: c */
    public C18124c0 f54705c;

    /* JADX INFO: renamed from: d */
    public C18194h0 f54706d;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f54707e = new AtomicBoolean(false);

    public C18165f() {
        C18124c0 c18124c0 = new C18124c0();
        this.f54705c = c18124c0;
        this.f54706d = new C18194h0(c18124c0);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: a */
    public LinkedHashMapPack mo78275a(String str) {
        String str2;
        try {
            HmsQoEApiManager.getInstance().requestNQoEMetrics(str);
            return new LinkedHashMapPack();
        } catch (NoClassDefFoundError unused) {
            str2 = "the qoes or wireless kit need dependency";
            Logger.m76965v(f54703f, str2);
            return new LinkedHashMapPack();
        } catch (Throwable th) {
            HianalyticsHelper.getInstance().reportException(th, "crash");
            str2 = "the qoes or wireless kit has fatal error";
            Logger.m76965v(f54703f, str2);
            return new LinkedHashMapPack();
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: b */
    public void mo78280b() {
        if (this.f54707e.get()) {
            this.f54705c.m78035a();
        } else {
            Logger.m76967w(f54703f, "start has error! pls check init is ok?");
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: a */
    public AbstractC18304p mo78276a(long j, long j2) {
        return this.f54707e.get() ? this.f54706d.m78656a(j, j2) : new C18317q();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: b */
    public void mo78281b(boolean z) {
        if (!this.f54707e.get()) {
            Logger.m76967w(f54703f, "stop has error! pls check init is ok?");
            return;
        }
        this.f54705c.m78035a();
        if (this.f54704b) {
            this.f54706d.m78657a(Boolean.valueOf(z));
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: a */
    public void mo78277a(Context context) {
        if (context == null) {
            Logger.m76967w(f54703f, "context == null");
        } else if (this.f54707e.compareAndSet(false, true)) {
            C18138d0.m78156a(context, this.f54705c);
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: b */
    public boolean mo78282b(long j, long j2) {
        return this.f54706d.m78659b(j, j2);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: a */
    public void mo78278a(boolean z) {
        this.f54704b = z;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18151e
    /* JADX INFO: renamed from: a */
    public boolean mo78279a() {
        if (this.f54707e.get()) {
            return this.f54706d.m78658a();
        }
        return false;
    }
}
