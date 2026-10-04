package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18321q3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18102a6 extends UploadDataProvider {

    /* JADX INFO: renamed from: e */
    public static final String f54161e = "CronetUploadDataProvide";

    /* JADX INFO: renamed from: f */
    public static final String f54162f = "cronet_upload_task";

    /* JADX INFO: renamed from: a */
    public C18321q3.e f54163a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f54164b;

    /* JADX INFO: renamed from: c */
    public ExecutorService f54165c;

    /* JADX INFO: renamed from: d */
    public C18200h6 f54166d = new C18200h6();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a6$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18321q3.e f54167a;

        public a(C18321q3.e eVar) {
            this.f54167a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f54167a.writeTo(new C18440z5(C18102a6.this.f54166d));
            } catch (IOException unused) {
                Logger.m76967w(C18102a6.f54161e, "An IOException occurs during stream writing.");
            }
        }
    }

    public C18102a6(C18321q3.e eVar) {
        this.f54163a = eVar;
        a aVar = new a(eVar);
        ExecutorService executorServiceNewSingleThreadExecutor = ExecutorsUtils.newSingleThreadExecutor(f54162f);
        this.f54165c = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(aVar);
    }

    public long getLength() throws IOException {
        if (this.f54163a.contentLength() == 0) {
            Logger.m76967w(f54161e, "maybe the requestBody's contentLength be not override");
        }
        return this.f54163a.contentLength();
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) this.f54166d.take());
            this.f54164b = byteBufferWrap;
            byteBuffer.put(byteBufferWrap);
        } catch (InterruptedException unused) {
            Logger.m76967w(f54161e, "An error occurred when obtaining the input bytebuffer.");
        }
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.f54164b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
