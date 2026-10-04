package com.huawei.hms.network.base.common;

import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.trans.ByteString;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hms.network.httpclient.RequestBody;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class RequestBodyProviders {
    public static final String DEFAULT_CONTENT_TYPE = "text/plain; charset=UTF-8";

    /* JADX INFO: renamed from: a */
    private static final Charset f54046a = Charset.forName("UTF-8");

    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() { // from class: com.huawei.hms.network.base.common.RequestBodyProviders.3
            @Override // com.huawei.hms.network.httpclient.RequestBody
            public long contentLength() {
                return byteString.size();
            }

            @Override // com.huawei.hms.network.httpclient.RequestBody
            public String contentType() {
                MediaType mediaType2 = mediaType;
                if (mediaType2 == null) {
                    return null;
                }
                return mediaType2.toString();
            }

            @Override // com.huawei.hms.network.httpclient.RequestBody
            public void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(StringUtils.getBytes(byteString.utf8()));
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() { // from class: com.huawei.hms.network.base.common.RequestBodyProviders.4
                @Override // com.huawei.hms.network.httpclient.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // com.huawei.hms.network.httpclient.RequestBody
                public String contentType() {
                    MediaType mediaType2 = mediaType;
                    if (mediaType2 == null) {
                        return null;
                    }
                    return mediaType2.toString();
                }

                @Override // com.huawei.hms.network.httpclient.RequestBody
                public void writeTo(OutputStream outputStream) {
                    new FileBinary(file).onWriteBinary(outputStream);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(MediaType mediaType, String str) {
        if (str == null) {
            throw new NullPointerException("content == null");
        }
        Charset charset = f54046a;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        byte[] bytes = str.getBytes(charset);
        return create(mediaType, bytes, 0, bytes.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        CheckParamUtils.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: com.huawei.hms.network.base.common.RequestBodyProviders.2
            @Override // com.huawei.hms.network.httpclient.RequestBody
            public long contentLength() {
                return i2;
            }

            @Override // com.huawei.hms.network.httpclient.RequestBody
            public String contentType() {
                MediaType mediaType2 = mediaType;
                if (mediaType2 == null) {
                    return null;
                }
                return mediaType2.toString();
            }

            @Override // com.huawei.hms.network.httpclient.RequestBody
            public void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr, i, i2);
            }
        };
    }

    public static RequestBody create(String str) {
        if (str != null) {
            return create("text/plain; charset=UTF-8", StringUtils.str2Byte(str));
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final String str, final byte[] bArr) {
        if (bArr != null) {
            return new RequestBody() { // from class: com.huawei.hms.network.base.common.RequestBodyProviders.1
                @Override // com.huawei.hms.network.httpclient.RequestBody
                public long contentLength() {
                    return bArr.length;
                }

                @Override // com.huawei.hms.network.httpclient.RequestBody
                public String contentType() {
                    String str2 = str;
                    return str2 == null ? "text/plain; charset=UTF-8" : str2;
                }

                @Override // com.huawei.hms.network.httpclient.RequestBody
                public void writeTo(OutputStream outputStream) throws IOException {
                    outputStream.write(bArr);
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
