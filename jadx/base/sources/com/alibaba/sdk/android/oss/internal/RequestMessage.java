package com.alibaba.sdk.android.oss.internal;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.HttpUtil;
import com.alibaba.sdk.android.oss.common.utils.HttpdnsMini;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.BucketLifecycleRule;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.slides.OooOOO;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RequestMessage extends HttpMessage {
    private String bucketName;
    private boolean checkCRC64;
    private OSSCredentialProvider credentialProvider;
    private URI endpoint;
    private String ipWithHeader;
    private HttpMethod method;
    private String objectKey;
    private URI service;
    private byte[] uploadData;
    private String uploadFilePath;
    private Uri uploadUri;
    private boolean isAuthorizationRequired = true;
    private Map<String, String> parameters = new LinkedHashMap();
    private boolean httpDnsEnable = false;
    private boolean pathStyleAccessEnable = false;
    private boolean customPathPrefixEnable = false;
    private boolean isInCustomCnameExcludeList = false;

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void addHeader(String str, String str2) {
        super.addHeader(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String buildCanonicalURL() throws Exception {
        boolean z = false;
        OSSUtils.assertTrue(this.endpoint != null, "Endpoint haven't been set!");
        String scheme = this.endpoint.getScheme();
        String host = this.endpoint.getHost();
        String path = this.endpoint.getPath();
        int port = this.endpoint.getPort();
        String ipByHostAsync = null;
        String strValueOf = port != -1 ? String.valueOf(port) : null;
        if (TextUtils.isEmpty(host)) {
            OSSLog.logDebug("endpoint url : " + this.endpoint.toString());
        }
        OSSLog.logDebug(" scheme : " + scheme);
        OSSLog.logDebug(" originHost : " + host);
        OSSLog.logDebug(" port : " + strValueOf);
        String string = scheme + "://" + host;
        if (!TextUtils.isEmpty(strValueOf)) {
            string = o0Oo0oo.OooO0Oo(string, C18241k5.f55433h, strValueOf);
        }
        if (!TextUtils.isEmpty(this.bucketName)) {
            if (OSSUtils.isOssOriginHost(host)) {
                String strOooO0O0 = OooOOO.OooO0O0(new StringBuilder(), this.bucketName, ".", host);
                if (isHttpDnsEnable()) {
                    ipByHostAsync = HttpdnsMini.getInstance().getIpByHostAsync(strOooO0O0);
                } else {
                    OSSLog.logDebug("[buildCannonicalURL], disable httpdns");
                }
                addHeader("Host", strOooO0O0);
                string = !TextUtils.isEmpty(ipByHostAsync) ? o0Oo0oo.OooO0Oo(scheme, "://", ipByHostAsync) : o0Oo0oo.OooO0Oo(scheme, "://", strOooO0O0);
            } else if (this.isInCustomCnameExcludeList) {
                if (this.pathStyleAccessEnable) {
                    z = true;
                } else {
                    string = OooOOO.OooO0O0(C22226Oooo0oo.OooO0OO(scheme, "://"), this.bucketName, ".", host);
                }
            } else if (OSSUtils.isValidateIP(host)) {
                if (!OSSUtils.isEmptyString(this.ipWithHeader)) {
                    addHeader("Host", getIpWithHeader());
                }
            }
        }
        if (this.customPathPrefixEnable && path != null) {
            string = C21111o0ooOoO.OooO0Oo(string, path);
        }
        if (z) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, "/");
            sbOooO0OO.append(this.bucketName);
            string = sbOooO0OO.toString();
        }
        if (!TextUtils.isEmpty(this.objectKey)) {
            StringBuilder sbOooO0OO2 = C22226Oooo0oo.OooO0OO(string, "/");
            sbOooO0OO2.append(HttpUtil.urlEncode(this.objectKey, "utf-8"));
            string = sbOooO0OO2.toString();
        }
        String strParamToQueryString = OSSUtils.paramToQueryString(this.parameters, "utf-8");
        StringBuilder sb = new StringBuilder("request---------------------\n");
        sb.append("request url=" + string + IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("request params=" + strParamToQueryString + IOUtils.LINE_SEPARATOR_UNIX);
        for (String str : getHeaders().keySet()) {
            sb.append("requestHeader [" + str + "]: ");
            sb.append(((String) getHeaders().get(str)) + IOUtils.LINE_SEPARATOR_UNIX);
        }
        OSSLog.logDebug(sb.toString());
        return OSSUtils.isEmptyString(strParamToQueryString) ? string : o0Oo0oo.OooO0Oo(string, MsalUtils.QUERY_STRING_SYMBOL, strParamToQueryString);
    }

    public String buildOSSServiceURL() {
        String ipByHostAsync;
        OSSUtils.assertTrue(this.service != null, "Service haven't been set!");
        String host = this.service.getHost();
        String scheme = this.service.getScheme();
        if (isHttpDnsEnable() && scheme.equalsIgnoreCase("http")) {
            ipByHostAsync = HttpdnsMini.getInstance().getIpByHostAsync(host);
        } else {
            OSSLog.logDebug("[buildOSSServiceURL], disable httpdns or http is not need httpdns");
            ipByHostAsync = null;
        }
        if (ipByHostAsync == null) {
            ipByHostAsync = host;
        }
        getHeaders().put("Host", host);
        String str = scheme + "://" + ipByHostAsync;
        String strParamToQueryString = OSSUtils.paramToQueryString(this.parameters, "utf-8");
        return OSSUtils.isEmptyString(strParamToQueryString) ? str : o0Oo0oo.OooO0Oo(str, MsalUtils.QUERY_STRING_SYMBOL, strParamToQueryString);
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    public void createBucketRequestBodyMarshall(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer();
        if (map != null) {
            stringBuffer.append("<CreateBucketConfiguration>");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                stringBuffer.append("<" + entry.getKey() + ">" + entry.getValue() + "</" + entry.getKey() + ">");
            }
            stringBuffer.append("</CreateBucketConfiguration>");
            byte[] bytes = stringBuffer.toString().getBytes("utf-8");
            long length = bytes.length;
            setContent(new ByteArrayInputStream(bytes));
            setContentLength(length);
        }
    }

    public byte[] deleteMultipleObjectRequestBodyMarshall(List<String> list, boolean z) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<Delete>");
        if (z) {
            stringBuffer.append("<Quiet>true</Quiet>");
        } else {
            stringBuffer.append("<Quiet>false</Quiet>");
        }
        for (String str : list) {
            stringBuffer.append("<Object><Key>");
            stringBuffer.append(str);
            stringBuffer.append("</Key></Object>");
        }
        stringBuffer.append("</Delete>");
        byte[] bytes = stringBuffer.toString().getBytes("utf-8");
        long length = bytes.length;
        setContent(new ByteArrayInputStream(bytes));
        setContentLength(length);
        return bytes;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ InputStream getContent() {
        return super.getContent();
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ long getContentLength() {
        return super.getContentLength();
    }

    public OSSCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public URI getEndpoint() {
        return this.endpoint;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ Map getHeaders() {
        return super.getHeaders();
    }

    public String getIpWithHeader() {
        return this.ipWithHeader;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public String getObjectKey() {
        return this.objectKey;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public URI getService() {
        return this.service;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ String getStringBody() {
        return super.getStringBody();
    }

    public byte[] getUploadData() {
        return this.uploadData;
    }

    public String getUploadFilePath() {
        return this.uploadFilePath;
    }

    public Uri getUploadUri() {
        return this.uploadUri;
    }

    public boolean isAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }

    public boolean isCheckCRC64() {
        return this.checkCRC64;
    }

    public boolean isCustomPathPrefixEnable() {
        return this.customPathPrefixEnable;
    }

    public boolean isHttpDnsEnable() {
        return this.httpDnsEnable;
    }

    public boolean isInCustomCnameExcludeList() {
        return this.isInCustomCnameExcludeList;
    }

    public boolean isPathStyleAccessEnable() {
        return this.pathStyleAccessEnable;
    }

    public void putBucketLifecycleRequestBodyMarshall(ArrayList<BucketLifecycleRule> arrayList) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<LifecycleConfiguration>");
        for (BucketLifecycleRule bucketLifecycleRule : arrayList) {
            stringBuffer.append("<Rule>");
            if (bucketLifecycleRule.getIdentifier() != null) {
                stringBuffer.append("<ID>" + bucketLifecycleRule.getIdentifier() + "</ID>");
            }
            if (bucketLifecycleRule.getPrefix() != null) {
                stringBuffer.append("<Prefix>" + bucketLifecycleRule.getPrefix() + "</Prefix>");
            }
            StringBuilder sb = new StringBuilder("<Status>");
            sb.append(bucketLifecycleRule.getStatus() ? "Enabled" : "Disabled");
            sb.append("</Status>");
            stringBuffer.append(sb.toString());
            if (bucketLifecycleRule.getDays() != null) {
                stringBuffer.append("<Days>" + bucketLifecycleRule.getDays() + "</Days>");
            } else if (bucketLifecycleRule.getExpireDate() != null) {
                stringBuffer.append("<Date>" + bucketLifecycleRule.getExpireDate() + "</Date>");
            }
            if (bucketLifecycleRule.getMultipartDays() != null) {
                stringBuffer.append("<AbortMultipartUpload><Days>" + bucketLifecycleRule.getMultipartDays() + "</Days></AbortMultipartUpload>");
            } else if (bucketLifecycleRule.getMultipartExpireDate() != null) {
                stringBuffer.append("<AbortMultipartUpload><Date>" + bucketLifecycleRule.getMultipartDays() + "</Date></AbortMultipartUpload>");
            }
            if (bucketLifecycleRule.getIADays() != null) {
                stringBuffer.append("<Transition><Days>" + bucketLifecycleRule.getIADays() + "</Days><StorageClass>IA</StorageClass></Transition>");
            } else if (bucketLifecycleRule.getIAExpireDate() != null) {
                stringBuffer.append("<Transition><Date>" + bucketLifecycleRule.getIAExpireDate() + "</Date><StorageClass>IA</StorageClass></Transition>");
            } else if (bucketLifecycleRule.getArchiveDays() != null) {
                stringBuffer.append("<Transition><Days>" + bucketLifecycleRule.getArchiveDays() + "</Days><StorageClass>Archive</StorageClass></Transition>");
            } else if (bucketLifecycleRule.getArchiveExpireDate() != null) {
                stringBuffer.append("<Transition><Date>" + bucketLifecycleRule.getArchiveExpireDate() + "</Date><StorageClass>Archive</StorageClass></Transition>");
            }
            stringBuffer.append("</Rule>");
        }
        stringBuffer.append("</LifecycleConfiguration>");
        byte[] bytes = stringBuffer.toString().getBytes("utf-8");
        long length = bytes.length;
        setContent(new ByteArrayInputStream(bytes));
        setContentLength(length);
    }

    public void putBucketLoggingRequestBodyMarshall(String str, String str2) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<BucketLoggingStatus>");
        if (str != null) {
            stringBuffer.append("<LoggingEnabled><TargetBucket>" + str + "</TargetBucket>");
            if (str2 != null) {
                stringBuffer.append("<TargetPrefix>" + str2 + "</TargetPrefix>");
            }
            stringBuffer.append("</LoggingEnabled>");
        }
        stringBuffer.append("</BucketLoggingStatus>");
        byte[] bytes = stringBuffer.toString().getBytes("utf-8");
        long length = bytes.length;
        setContent(new ByteArrayInputStream(bytes));
        setContentLength(length);
    }

    public void putBucketRefererRequestBodyMarshall(ArrayList<String> arrayList, boolean z) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<RefererConfiguration>");
        StringBuilder sb = new StringBuilder("<AllowEmptyReferer>");
        sb.append(z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        sb.append("</AllowEmptyReferer>");
        stringBuffer.append(sb.toString());
        if (arrayList != null && arrayList.size() > 0) {
            stringBuffer.append("<RefererList>");
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("<Referer>" + it.next() + "</Referer>");
            }
            stringBuffer.append("</RefererList>");
        }
        stringBuffer.append("</RefererConfiguration>");
        byte[] bytes = stringBuffer.toString().getBytes("utf-8");
        long length = bytes.length;
        setContent(new ByteArrayInputStream(bytes));
        setContentLength(length);
    }

    public byte[] putObjectTaggingRequestBodyMarshall(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuffer stringBuffer = new StringBuffer("<Tagging><TagSet>");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                stringBuffer.append("<Tag><Key>");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("</Key><Value>");
                stringBuffer.append(entry.getValue());
                stringBuffer.append("</Value></Tag>");
            }
        }
        stringBuffer.append("</TagSet></Tagging>");
        byte[] bytes = stringBuffer.toString().getBytes("utf-8");
        long length = bytes.length;
        setContent(new ByteArrayInputStream(bytes));
        setContentLength(length);
        return bytes;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setCheckCRC64(boolean z) {
        this.checkCRC64 = z;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setContent(InputStream inputStream) {
        super.setContent(inputStream);
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setContentLength(long j) {
        super.setContentLength(j);
    }

    public void setCredentialProvider(OSSCredentialProvider oSSCredentialProvider) {
        this.credentialProvider = oSSCredentialProvider;
    }

    public void setCustomPathPrefixEnable(boolean z) {
        this.customPathPrefixEnable = z;
    }

    public void setEndpoint(URI uri) {
        this.endpoint = uri;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setHeaders(Map map) {
        super.setHeaders(map);
    }

    public void setHttpDnsEnable(boolean z) {
        this.httpDnsEnable = z;
    }

    public void setIpWithHeader(String str) {
        this.ipWithHeader = str;
    }

    public void setIsAuthorizationRequired(boolean z) {
        this.isAuthorizationRequired = z;
    }

    public void setIsInCustomCnameExcludeList(boolean z) {
        this.isInCustomCnameExcludeList = z;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public void setPathStyleAccessEnable(boolean z) {
        this.pathStyleAccessEnable = z;
    }

    public void setService(URI uri) {
        this.service = uri;
    }

    @Override // com.alibaba.sdk.android.oss.internal.HttpMessage
    public /* bridge */ /* synthetic */ void setStringBody(String str) {
        super.setStringBody(str);
    }

    public void setUploadData(byte[] bArr) {
        this.uploadData = bArr;
    }

    public void setUploadFilePath(String str) {
        this.uploadFilePath = str;
    }

    public void setUploadUri(Uri uri) {
        this.uploadUri = uri;
    }
}
