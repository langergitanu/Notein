package o00OOO0O;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.huawei.hms.network.embedded.C18224j2;
import java.util.HashMap;
import java.util.Map;
import o0000OoO.C24224OooO00o;
import o00OO0oo.C25006OooO0O0;
import o00OO0oo.RunnableC25005OooO00o;
import o00OOO00.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f84873OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static C25006OooO0O0 f84874OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f84875OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f84876OooO0Oo = 0;

    public o00OOO00.OooO00o OooO00o(OooO0O0 oooO0O0) throws InterruptedException {
        DataReportRequest dataReportRequest = new DataReportRequest();
        dataReportRequest.f184os = oooO0O0.f84866OooO00o;
        dataReportRequest.rpcVersion = oooO0O0.f84872OooO0oO;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", oooO0O0.f84867OooO0O0);
        dataReportRequest.bizData.put("apdidToken", oooO0O0.f84868OooO0OO);
        dataReportRequest.bizData.put("umidToken", oooO0O0.f84869OooO0Oo);
        dataReportRequest.bizData.put("dynamicKey", oooO0O0.f84871OooO0o0);
        dataReportRequest.deviceData = oooO0O0.f84870OooO0o;
        C25006OooO0O0 c25006OooO0O0 = f84874OooO0O0;
        if (c25006OooO0O0.f84833OooO0O0 != null) {
            C25006OooO0O0.f84831OooO0Oo = null;
            new Thread(new RunnableC25005OooO00o(c25006OooO0O0, dataReportRequest)).start();
            for (int i = C18224j2.f55304c; C25006OooO0O0.f84831OooO0Oo == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        DataReportResult dataReportResult = C25006OooO0O0.f84831OooO0Oo;
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        oooO00o.f84856OooO00o = false;
        oooO00o.f84857OooO0O0 = "";
        oooO00o.f84865OooOO0O = "";
        if (dataReportResult == null) {
            return null;
        }
        oooO00o.f84856OooO00o = dataReportResult.success;
        oooO00o.f84857OooO0O0 = dataReportResult.resultCode;
        Map<String, String> map2 = dataReportResult.resultData;
        if (map2 != null) {
            oooO00o.f84858OooO0OO = map2.get("apdid");
            oooO00o.f84859OooO0Oo = map2.get("apdidToken");
            oooO00o.f84862OooO0oO = map2.get("dynamicKey");
            oooO00o.f84863OooO0oo = map2.get("timeInterval");
            oooO00o.f84855OooO = map2.get("webrtcUrl");
            oooO00o.f84864OooOO0 = "";
            String str = map2.get("drmSwitch");
            if (C24224OooO00o.OooO0Oo(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    oooO00o.f84861OooO0o0 = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    oooO00o.f84860OooO0o = sb2.toString();
                }
            }
            if (map2.containsKey("apse_degrade")) {
                oooO00o.f84865OooOO0O = map2.get("apse_degrade");
            }
        }
        return oooO00o;
    }
}
