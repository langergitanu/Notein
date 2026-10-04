package o00OO0oo;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.C0146aa;
import com.alipay.android.phone.mrpc.core.C0156h;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: renamed from: o00OO0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25006OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C25006OooO0O0 f84830OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static DataReportResult f84831OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BugTrackMessageService f84832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DataReportService f84833OooO0O0;

    public C25006OooO0O0(Context context, String str) {
        this.f84832OooO00o = null;
        this.f84833OooO0O0 = null;
        C0146aa c0146aa = new C0146aa();
        c0146aa.m47a(str);
        C0156h c0156h = new C0156h(context);
        this.f84832OooO00o = (BugTrackMessageService) c0156h.mo69a(BugTrackMessageService.class, c0146aa);
        this.f84833OooO0O0 = (DataReportService) c0156h.mo69a(DataReportService.class, c0146aa);
    }
}
