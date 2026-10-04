package com.huawei.hms.network.base.common;

import com.aspose.slides.PatternStyle;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.trans.ByteString;
import com.huawei.hms.network.base.common.trans.CounterOutputStream;
import com.huawei.hms.network.httpclient.RequestBody;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: f */
    private static final String f54032f = "MultipartBody";

    /* JADX INFO: renamed from: a */
    private final ByteString f54036a;

    /* JADX INFO: renamed from: b */
    private final MediaType f54037b;

    /* JADX INFO: renamed from: c */
    private final MediaType f54038c;

    /* JADX INFO: renamed from: d */
    private final List<Part> f54039d;

    /* JADX INFO: renamed from: e */
    private long f54040e = -1;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");

    /* JADX INFO: renamed from: g */
    private static final byte[] f54033g = {58, 32};

    /* JADX INFO: renamed from: h */
    private static final byte[] f54034h = {13, 10};

    /* JADX INFO: renamed from: i */
    private static final byte[] f54035i = {PatternStyle.DottedGrid, PatternStyle.DottedGrid};

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final ByteString f54041a;

        /* JADX INFO: renamed from: b */
        private final List<Part> f54042b;

        /* JADX INFO: renamed from: c */
        private MediaType f54043c;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public MultipartBody build() {
            if (this.f54042b.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this);
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            }
            if (mediaType.type().equals("multipart")) {
                this.f54043c = mediaType;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + mediaType);
        }

        public Builder(String str) {
            this.f54042b = new ArrayList();
            this.f54043c = MultipartBody.MIXED;
            this.f54041a = ByteString.encodeUtf8(str);
        }

        public Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(Part part) {
            if (part == null) {
                throw new NullPointerException("part == null");
            }
            this.f54042b.add(part);
            return this;
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }
    }

    public static final class Part {

        /* JADX INFO: renamed from: a */
        final Headers f54044a;

        /* JADX INFO: renamed from: b */
        final RequestBody f54045b;

        private Part(Headers headers, RequestBody requestBody) {
            this.f54044a = headers;
            this.f54045b = requestBody;
        }

        public static Part create(Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, requestBody);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBodyProviders.create((MediaType) null, str2));
        }

        public RequestBody body() {
            return this.f54045b;
        }

        public Headers headers() {
            return this.f54044a;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.m77741a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.m77741a(sb, str2);
            }
            return create(Headers.m77738of("Content-Disposition", sb.toString()), requestBody);
        }
    }

    public MultipartBody(Builder builder) {
        ByteString byteString = builder.f54041a;
        this.f54036a = byteString;
        MediaType mediaType = builder.f54043c;
        this.f54037b = mediaType;
        this.f54038c = MediaType.get(mediaType + "; boundary=" + byteString.utf8());
        this.f54039d = builder.f54042b;
    }

    /* JADX INFO: renamed from: a */
    private long m77740a(OutputStream outputStream, boolean z) throws IOException {
        CounterOutputStream counterOutputStream = new CounterOutputStream();
        if (z) {
            outputStream = counterOutputStream;
        }
        int size = this.f54039d.size();
        long lenth = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.f54039d.get(i);
            Headers headers = part.f54044a;
            RequestBody requestBody = part.f54045b;
            outputStream.write(f54035i);
            outputStream.write(StringUtils.getBytes(boundary()));
            outputStream.write(f54034h);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    outputStream.write(StringUtils.getBytes(headers.name(i2)));
                    outputStream.write(f54033g);
                    outputStream.write(StringUtils.getBytes(headers.value(i2)));
                    outputStream.write(f54034h);
                }
            }
            String strContentType = requestBody.contentType();
            if (strContentType != null) {
                outputStream.write(StringUtils.getBytes("Content-Type: "));
                outputStream.write(StringUtils.getBytes(strContentType));
                outputStream.write(f54034h);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                outputStream.write(StringUtils.getBytes("Content-Length: "));
                outputStream.write(StringUtils.getBytes(jContentLength));
                outputStream.write(f54034h);
            } else if (z) {
                return -1L;
            }
            byte[] bArr = f54034h;
            outputStream.write(bArr);
            if (z) {
                lenth += jContentLength;
            } else {
                requestBody.writeTo(outputStream);
            }
            outputStream.write(bArr);
        }
        byte[] bArr2 = f54035i;
        outputStream.write(bArr2);
        outputStream.write(StringUtils.getBytes(boundary()));
        outputStream.write(bArr2);
        outputStream.write(f54034h);
        if (z) {
            lenth += counterOutputStream.getLenth();
            IoUtils.closeSecure((OutputStream) counterOutputStream);
        }
        Logger.m76966v(f54032f, "the length of the requestBody is %s", Long.valueOf(lenth));
        return lenth;
    }

    public String boundary() {
        return this.f54036a.utf8();
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public long contentLength() {
        long j = this.f54040e;
        if (j != -1) {
            return j;
        }
        this.f54040e = m77740a((OutputStream) null, true);
        Logger.m76963i(f54032f, "get the contentLength,and the contentLength =" + this.f54040e);
        return this.f54040e;
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public String contentType() {
        MediaType mediaType = this.f54038c;
        if (mediaType == null) {
            return null;
        }
        return mediaType.toString();
    }

    public Part part(int i) {
        return this.f54039d.get(i);
    }

    public List<Part> parts() {
        return this.f54039d;
    }

    public int size() {
        return this.f54039d.size();
    }

    public MediaType type() {
        return this.f54037b;
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        m77740a(outputStream, false);
    }

    /* JADX INFO: renamed from: a */
    public static StringBuilder m77741a(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                str2 = "%0A";
            } else if (cCharAt == '\r') {
                str2 = "%0D";
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }
}
