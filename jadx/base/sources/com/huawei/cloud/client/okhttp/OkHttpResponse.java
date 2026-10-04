package com.huawei.cloud.client.okhttp;

import com.huawei.cloud.base.http.LowLevelHttpResponse;
import com.huawei.hms.drive.C17800bj;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class OkHttpResponse extends LowLevelHttpResponse {

    /* JADX INFO: renamed from: a */
    private final C17800bj f52314a;

    /* JADX INFO: renamed from: b */
    private final int f52315b;

    /* JADX INFO: renamed from: c */
    private final String f52316c;

    /* JADX INFO: renamed from: d */
    private final ArrayList<String> f52317d;

    /* JADX INFO: renamed from: e */
    private final ArrayList<String> f52318e;

    public OkHttpResponse(C17800bj c17800bj) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f52317d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f52318e = arrayList2;
        this.f52314a = c17800bj;
        int iM76283b = c17800bj.m76283b();
        this.f52315b = iM76283b == -1 ? 0 : iM76283b;
        this.f52316c = c17800bj.m76284c();
        for (Map.Entry<String, List<String>> entry : c17800bj.m76286e().m76078c().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public void disconnect() {
        C17800bj c17800bj = this.f52314a;
        if (c17800bj != null) {
            c17800bj.close();
        }
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public InputStream getContent() throws IOException {
        InputStream inputStreamM76313b = this.f52314a.m76287f().m76313b();
        if (inputStreamM76313b == null) {
            return null;
        }
        return new SizeValidatingInputStream(inputStreamM76313b);
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.f52314a.m76281a("Content-Encoding");
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public long getContentLength() {
        String strM76281a = this.f52314a.m76281a("Content-Length");
        if (strM76281a == null) {
            return -1L;
        }
        return Long.parseLong(strM76281a);
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public String getContentType() {
        return this.f52314a.m76281a("Content-Type");
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.f52317d.size();
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public String getHeaderName(int i) {
        return this.f52317d.get(i);
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public String getHeaderValue(int i) {
        return this.f52318e.get(i);
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.f52316c;
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.f52315b;
    }

    @Override // com.huawei.cloud.base.http.LowLevelHttpResponse
    public String getStatusLine() {
        String strM76281a = this.f52314a.m76281a("0");
        if (strM76281a == null || !strM76281a.startsWith("HTTP/1.")) {
            return null;
        }
        return strM76281a;
    }

    public final class SizeValidatingInputStream extends FilterInputStream {

        /* JADX INFO: renamed from: b */
        private long f52320b;

        public SizeValidatingInputStream(InputStream inputStream) {
            super(inputStream);
            this.f52320b = 0L;
        }

        /* JADX INFO: renamed from: a */
        private void m75702a() throws IOException {
            long contentLength = OkHttpResponse.this.getContentLength();
            if (contentLength == -1) {
                return;
            }
            long j = this.f52320b;
            if (j == 0 || j >= contentLength) {
                return;
            }
            throw new IOException("Connection closed prematurely: bytesRead = " + this.f52320b + ", Content-Length = " + contentLength);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i == -1) {
                m75702a();
                return i;
            }
            this.f52320b++;
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (i3 == -1) {
                m75702a();
                return i3;
            }
            this.f52320b += (long) i3;
            return i3;
        }
    }
}
