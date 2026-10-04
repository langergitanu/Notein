package com.huawei.cloud.client.okhttp;

import android.content.Context;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.LowLevelHttpRequest;
import com.huawei.cloud.base.http.LowLevelHttpResponse;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.client.grs.GRSRouting;
import com.huawei.cloud.client.util.DnsKprUtil;
import com.huawei.cloud.client.util.DomainManagerUtil;
import com.huawei.hms.drive.AbstractC17799bi;
import com.huawei.hms.drive.AbstractC17874i;
import com.huawei.hms.drive.C17792bb;
import com.huawei.hms.drive.C17794bd;
import com.huawei.hms.drive.C17795be;
import com.huawei.hms.drive.C17798bh;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.C17806bp;
import com.huawei.hms.drive.InterfaceC17775al;
import com.huawei.hms.drive.InterfaceC17776am;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public final class OkHttpRequest extends LowLevelHttpRequest {

    /* JADX INFO: renamed from: a */
    private static final Logger f52300a = Logger.getLogger("OkHttpRequest");

    /* JADX INFO: renamed from: b */
    private C17795be f52301b;

    /* JADX INFO: renamed from: c */
    private C17798bh.a f52302c;

    /* JADX INFO: renamed from: d */
    private String f52303d;

    /* JADX INFO: renamed from: e */
    private Context f52304e;

    /* JADX INFO: renamed from: f */
    private InterfaceC17775al f52305f;

    public class ProgressOutputStream extends AbstractC17874i {

        /* JADX INFO: renamed from: b */
        private long f52311b;

        /* JADX INFO: renamed from: c */
        private long f52312c;

        /* JADX INFO: renamed from: d */
        private HttpRequest.ProgressListener f52313d;

        public ProgressOutputStream(OutputStream outputStream, HttpRequest.ProgressListener progressListener) {
            super(outputStream);
            this.f52311b = 0L;
            this.f52312c = 0L;
            this.f52313d = progressListener;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            delegate().write(i);
            long j = this.f52312c + 1;
            this.f52312c = j;
            if (j > HttpRequest.DEFAULT_PROGRESS_STEP_SIZE) {
                long j2 = this.f52311b + j;
                this.f52311b = j2;
                this.f52312c = 0L;
                this.f52313d.onProgress(j2);
            }
        }
    }

    public OkHttpRequest(Context context, C17795be c17795be, String str, String str2) {
        this.f52304e = context;
        this.f52301b = c17795be;
        this.f52303d = str;
        C17798bh.a aVar = new C17798bh.a();
        this.f52302c = aVar;
        aVar.m76274a(str2);
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpRequest
    public void addHeader(String str, String str2) {
        this.f52302c.m76279b(str, str2);
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpRequest
    public void cancel() {
        InterfaceC17775al interfaceC17775al = this.f52305f;
        if (interfaceC17775al != null) {
            interfaceC17775al.mo75981c();
        }
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpRequest
    public LowLevelHttpResponse execute() throws IOException {
        if (getStreamingContent() != null) {
            final String contentType = getContentType();
            if (contentType != null) {
                addHeader("Content-Type", contentType);
            }
            final long contentLength = getContentLength();
            if (contentLength >= 0) {
                this.f52302c.m76276a("Content-Length", Long.toString(contentLength));
            }
            String str = this.f52303d;
            if ("POST".equals(str) || "PUT".equals(str) || "PATCH".equals(str)) {
                this.f52302c.m76275a(this.f52303d, new AbstractC17799bi() { // from class: com.huawei.cloud.client.okhttp.OkHttpRequest.1
                    @Override // com.huawei.hms.drive.AbstractC17799bi
                    public long contentLength() {
                        return contentLength;
                    }

                    @Override // com.huawei.hms.drive.AbstractC17799bi
                    public C17794bd contentType() {
                        String str2 = contentType;
                        if (str2 == null) {
                            str2 = "";
                        }
                        return C17794bd.m76187b(str2);
                    }

                    @Override // com.huawei.hms.drive.AbstractC17799bi
                    public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
                        OkHttpRequest.this.m75700a(interfaceC34526OooO0o0);
                    }
                });
            } else {
                Preconditions.checkArgument(contentLength == 0, "%s with non-zero content length is not supported", str);
            }
        } else {
            this.f52302c.m76275a(this.f52303d, (AbstractC17799bi) null);
        }
        return m75696a();
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpRequest
    public void setTimeout(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: all -> 0x0047, IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:5:0x002b, B:7:0x0031, B:13:0x0062, B:12:0x004d), top: B:45:0x002b, outer: #2 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private LowLevelHttpResponse m75696a() throws IOException {
        String strM76151f = this.f52302c.m76277a().m76261a().m76151f();
        String string = this.f52302c.m76277a().m76261a().toString();
        HttpRequest.ProgressListener progressListener = getProgressListener();
        String strErrorCode2DnsKpr = "";
        C17800bj c17800bjMo75980b = null;
        int i = 4;
        IOException iOException = null;
        while (true) {
            if (i >= 0) {
                try {
                    try {
                        if (DnsKprUtil.isNeedDNSKpr(strM76151f, strErrorCode2DnsKpr, 4 - i)) {
                            DomainManagerUtil.switchDriveDomain(this.f52304e, strM76151f, getInitializer());
                            c17800bjMo75980b = DnsKprUtil.tryConnectByDNSKpr(string, strM76151f, strErrorCode2DnsKpr, iOException, this.f52302c, new DnsKprUtil.OkHttpRetryCallBack() { // from class: com.huawei.cloud.client.okhttp.OkHttpRequest.2
                                @Override // com.huawei.cloud.client.util.DnsKprUtil.OkHttpRetryCallBack
                                public void run(C17798bh.a aVar, InterfaceC17776am interfaceC17776am) {
                                }

                                @Override // com.huawei.cloud.client.util.DnsKprUtil.OkHttpRetryCallBack
                                public C17800bj run(C17798bh.a aVar) throws IOException {
                                    OkHttpRequest okHttpRequest = OkHttpRequest.this;
                                    okHttpRequest.f52305f = okHttpRequest.f52301b.m76193a(aVar.m76277a());
                                    return OkHttpRequest.this.f52305f.mo75980b();
                                }
                            });
                        } else {
                            InterfaceC17775al interfaceC17775alM76193a = this.f52301b.m76193a(this.f52302c.m76277a());
                            this.f52305f = interfaceC17775alM76193a;
                            c17800bjMo75980b = interfaceC17775alM76193a.mo75980b();
                            DomainManagerUtil.clearExpiredTime();
                        }
                    } catch (IOException e) {
                        iOException = e;
                        String str = strM76151f + iOException.toString();
                        f52300a.m75690e("OkHttpRequest:[" + i + "]" + str);
                        if ((iOException instanceof InterruptedIOException) && !(iOException instanceof SocketTimeoutException)) {
                            throw iOException;
                        }
                        strErrorCode2DnsKpr = DnsKprUtil.errorCode2DnsKpr(iOException);
                        if ((iOException instanceof NoRouteToHostException) || (iOException instanceof UnknownHostException)) {
                            i--;
                        }
                        int i2 = i - 1;
                        if (i > 1) {
                            if (progressListener != null) {
                                try {
                                    progressListener.onErrorCallback();
                                } catch (IOException e2) {
                                    throw e2;
                                }
                            }
                            if (c17800bjMo75980b != null) {
                                c17800bjMo75980b.close();
                            }
                            i = i2;
                        } else {
                            i -= 2;
                            if (i2 == 0) {
                                C17792bb.a aVarM76159n = this.f52302c.m76277a().m76261a().m76159n();
                                aVarM76159n.m76178d(new URL(GRSRouting.getDriveURL(this.f52304e)).getHost());
                                this.f52302c.m76273a(aVarM76159n.m76177c());
                                if (c17800bjMo75980b != null) {
                                    c17800bjMo75980b.close();
                                }
                            } else {
                                throw iOException;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (c17800bjMo75980b != null) {
                        c17800bjMo75980b.close();
                    }
                    throw th;
                }
            }
            f52300a.m75689d("OkHttpRequest:sendRequest response.", false);
            return new OkHttpResponse(c17800bjMo75980b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75700a(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
        OutputStream outputStreamO000O0oo = interfaceC34526OooO0o0.o000O0oo();
        try {
            try {
                HttpRequest.ProgressListener progressListener = getProgressListener();
                if (progressListener == null) {
                    getStreamingContent().writeTo(outputStreamO000O0oo);
                } else {
                    getStreamingContent().writeTo(new ProgressOutputStream(outputStreamO000O0oo, progressListener));
                }
                C17806bp.m76338a(outputStreamO000O0oo);
            } catch (Exception e) {
                f52300a.m75689d("RequestBody write error:" + e.toString(), false);
                HttpRequest.ProgressListener progressListener2 = getProgressListener();
                if (progressListener2 != null) {
                    progressListener2.onErrorCallback();
                }
                throw e;
            }
        } catch (Throwable th) {
            C17806bp.m76338a(outputStreamO000O0oo);
            throw th;
        }
    }
}
