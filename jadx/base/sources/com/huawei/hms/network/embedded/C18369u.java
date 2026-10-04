package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u */
/* JADX INFO: loaded from: classes9.dex */
public class C18369u implements InterfaceC18382v {

    /* JADX INFO: renamed from: a */
    public int f56257a;

    /* JADX INFO: renamed from: b */
    public Map<String, Integer> f56258b;

    /* JADX INFO: renamed from: c */
    public long f56259c;

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: a */
    public int mo79578a() {
        return m79577a(NetworkUtil.SignalType.LTE_RSSNR);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: b */
    public int mo79581b() {
        return m79577a(NetworkUtil.SignalType.LTE_CQI);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: c */
    public int mo79582c() {
        return m79577a(NetworkUtil.SignalType.LTE_RSRQ);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: d */
    public int mo79583d() {
        return m79577a(NetworkUtil.SignalType.LTE_RSRP);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: e */
    public int mo79584e() {
        return m79577a(NetworkUtil.SignalType.LTE_RSSI);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: f */
    public int mo79585f() {
        return m79577a(NetworkUtil.SignalType.LTE_DBM);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: g */
    public long mo79586g() {
        return this.f56259c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18382v
    /* JADX INFO: renamed from: h */
    public int mo79587h() {
        return this.f56257a;
    }

    public String toString() {
        return "SignalInfoImpl{wifiSignalStrength=" + mo79587h() + ", signalTimeStamp=" + mo79586g() + ", MobileSignalStrength=" + mo79585f() + ", LteRsrq=" + mo79582c() + ", LteRssi=" + mo79584e() + ", LteRssnr=" + mo79578a() + ", LteRsrp=" + mo79583d() + ", LteCqi=" + mo79581b() + '}';
    }

    /* JADX INFO: renamed from: a */
    private int m79577a(String str) {
        if (this.f56258b == null) {
            this.f56258b = NetworkUtil.getLteSignalInfo(ContextHolder.getResourceContext());
        }
        Map<String, Integer> map = this.f56258b;
        if (map == null || map.get(str) == null) {
            return Integer.MAX_VALUE;
        }
        return this.f56258b.get(str).intValue();
    }

    /* JADX INFO: renamed from: a */
    public void m79579a(int i) {
        this.f56257a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m79580a(long j) {
        this.f56259c = j;
    }
}
