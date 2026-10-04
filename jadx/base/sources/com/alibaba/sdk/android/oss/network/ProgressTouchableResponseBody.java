package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import oOo00OoO.AbstractC34529OooOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.InterfaceC34525OooO0o;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends ResponseBody {
    private InterfaceC34525OooO0o mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final ResponseBody mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(ResponseBody responseBody, ExecutionContext executionContext) {
        this.mResponseBody = responseBody;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getF124449OooOo() {
        return this.mResponseBody.getF124449OooOo();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getF124288OooOo0o() {
        return this.mResponseBody.getF124288OooOo0o();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public InterfaceC34525OooO0o getF124289OooOoO0() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = C34535OooOOOo.OooO0O0(source(this.mResponseBody.getF124289OooOoO0()));
        }
        return this.mBufferedSource;
    }

    private InterfaceC34548OooOoo0 source(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
        return new AbstractC34529OooOO0(interfaceC34548OooOoo0) { // from class: com.alibaba.sdk.android.oss.network.ProgressTouchableResponseBody.1
            private long totalBytesRead = 0;

            @Override // oOo00OoO.AbstractC34529OooOO0, oOo00OoO.InterfaceC34548OooOoo0
            public long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
                long j2 = super.read(c34524OooO0Oo, j);
                this.totalBytesRead += j2 != -1 ? j2 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null && j2 != -1 && this.totalBytesRead != 0) {
                    ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.getF124449OooOo());
                }
                return j2;
            }
        };
    }
}
