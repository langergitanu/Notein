package o00OO0oo;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import oO00ooO.C32460OooOooO;
import oO0o0oO0.C33885OooO0O0;
import oO0o0oO0.InterfaceC33883OooO;

/* JADX INFO: renamed from: o00OO0oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC25005OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f84827OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f84828OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f84829OooOoO0;

    public RunnableC25005OooO00o(C25006OooO0O0 c25006OooO0O0, DataReportRequest dataReportRequest) {
        this.f84829OooOoO0 = c25006OooO0O0;
        this.f84827OooOo = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f84828OooOo0o) {
            case 0:
                try {
                    C25006OooO0O0.f84831OooO0Oo = ((C25006OooO0O0) this.f84829OooOoO0).f84833OooO0O0.reportData((DataReportRequest) this.f84827OooOo);
                } catch (Throwable th) {
                    DataReportResult dataReportResult = new DataReportResult();
                    C25006OooO0O0.f84831OooO0Oo = dataReportResult;
                    dataReportResult.success = false;
                    StringBuilder sb = new StringBuilder("static data rpc upload error, ");
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    sb.append(stringWriter.toString());
                    dataReportResult.resultCode = sb.toString();
                    StringWriter stringWriter2 = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter2));
                    stringWriter2.toString();
                    return;
                }
                break;
            default:
                ((InterfaceC33883OooO) this.f84827OooOo).OooO0o0((C33885OooO0O0) this.f84829OooOoO0, C32460OooOooO.f116667OooO00o);
                break;
        }
    }

    public RunnableC25005OooO00o(InterfaceC33883OooO interfaceC33883OooO, C33885OooO0O0 c33885OooO0O0) {
        this.f84827OooOo = interfaceC33883OooO;
        this.f84829OooOoO0 = c33885OooO0O0;
    }
}
