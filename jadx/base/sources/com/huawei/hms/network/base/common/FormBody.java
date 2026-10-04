package com.huawei.hms.network.base.common;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.RequestBody;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FormBody extends RequestBody {

    /* JADX INFO: renamed from: c */
    private static final String f54017c = "FormBody";

    /* JADX INFO: renamed from: d */
    private static final String f54018d = "application/x-www-form-urlencoded; charset=UTF-8";

    /* JADX INFO: renamed from: a */
    private final List<String> f54019a;

    /* JADX INFO: renamed from: b */
    private final byte[] f54020b;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final List<String> f54021a = new ArrayList();

        public Builder add(String str, String str2) {
            if (str != null && str2 != null) {
                this.f54021a.add(str);
                this.f54021a.add(str2);
            }
            return this;
        }

        public FormBody build() {
            return new FormBody(this);
        }
    }

    private FormBody(Builder builder) {
        this.f54019a = builder.f54021a;
        this.f54020b = m77734a();
    }

    /* JADX INFO: renamed from: a */
    private byte[] m77734a() {
        StringBuilder sb = new StringBuilder();
        int size = this.f54019a.size();
        for (int i = 0; i < size; i += 2) {
            if (i > 0) {
                sb.append('&');
            }
            sb.append(this.f54019a.get(i));
            sb.append('=');
            sb.append(this.f54019a.get(i + 1));
        }
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            byte[] bArr = new byte[0];
            Logger.m76968w(f54017c, "UnsupportedEncodingException", e);
            return bArr;
        }
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public long contentLength() {
        if (this.f54020b.length == 0) {
            return -1L;
        }
        return r0.length;
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public String contentType() {
        return f54018d;
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f54020b);
    }
}
