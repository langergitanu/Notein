package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import java.io.InputStream;
import oOo00OoO.C34534OooOOOO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends RequestBody {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getF124249OooO00o() {
        String str = this.contentType;
        MediaType.f124148OooO0o0.getClass();
        return MediaType.Companion.OooO0O0(str);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
        C34534OooOOOO c34534OooOOOOOooO0o = C34535OooOOOo.OooO0o(this.inputStream);
        long j = 0;
        while (true) {
            long j2 = this.contentLength;
            if (j >= j2) {
                break;
            }
            long j3 = c34534OooOOOOOooO0o.read(interfaceC34526OooO0o0.OooOO0(), Math.min(j2 - j, 2048L));
            if (j3 == -1) {
                break;
            }
            long j4 = j + j3;
            interfaceC34526OooO0o0.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j4 != 0) {
                oSSProgressCallback.onProgress(this.request, j4, this.contentLength);
            }
            j = j4;
        }
        c34534OooOOOOOooO0o.close();
    }
}
