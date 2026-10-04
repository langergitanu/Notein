package com.alibaba.sdk.android.oss.network;

import android.os.ParcelFileDescriptor;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.HttpMethod;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.internal.OSSRetryHandler;
import com.alibaba.sdk.android.oss.internal.OSSRetryType;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.internal.ResponseMessage;
import com.alibaba.sdk.android.oss.internal.ResponseParser;
import com.alibaba.sdk.android.oss.internal.ResponseParsers;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.ListBucketsRequest;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes.dex */
public class OSSRequestTask<T extends OSSResult> implements Callable<T> {
    private OkHttpClient client;
    private ExecutionContext context;
    private int currentRetryCount = 0;
    private RequestMessage message;
    private ResponseParser<T> responseParser;
    private OSSRetryHandler retryHandler;

    /* JADX INFO: renamed from: com.alibaba.sdk.android.oss.network.OSSRequestTask$1 */
    public static /* synthetic */ class C01371 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod = iArr;
            try {
                iArr[HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[HttpMethod.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OSSRequestTask(RequestMessage requestMessage, ResponseParser responseParser, ExecutionContext executionContext, int i) {
        this.responseParser = responseParser;
        this.message = requestMessage;
        this.context = executionContext;
        this.client = executionContext.getClient();
        this.retryHandler = new OSSRetryHandler(i);
    }

    private ResponseMessage buildResponseMessage(RequestMessage requestMessage, Response response) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setRequest(requestMessage);
        responseMessage.setResponse(response);
        HashMap map = new HashMap();
        Headers headers = response.f124263OooOoo0;
        for (int i = 0; i < headers.size(); i++) {
            map.put(headers.OooO0Oo(i), headers.OooO0oO(i));
        }
        responseMessage.setHeaders(map);
        responseMessage.setStatusCode(response.f124259OooOoO);
        ResponseBody responseBody = response.f124262OooOoo;
        responseMessage.setContentLength(responseBody.getF124449OooOo());
        responseMessage.setContent(responseBody.byteStream());
        return responseMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x019d A[Catch: Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0021, B:10:0x0042, B:12:0x004b, B:14:0x0058, B:15:0x0069, B:17:0x006f, B:18:0x0085, B:72:0x0204, B:29:0x00cc, B:30:0x00d5, B:31:0x00da, B:35:0x00e6, B:37:0x00f3, B:65:0x019d, B:67:0x01a5, B:68:0x01b0, B:70:0x01d0, B:71:0x01f1, B:40:0x010a, B:42:0x0114, B:45:0x0130, B:46:0x0137, B:47:0x0138, B:49:0x0140, B:52:0x016e, B:58:0x0178, B:59:0x017b, B:60:0x017c, B:62:0x0184, B:63:0x0192, B:13:0x0052, B:90:0x02c9, B:91:0x02d0), top: B:155:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T call() throws Exception {
        RealCall realCallOooO00o;
        Request requestOooO0O0;
        Exception clientException;
        ResponseMessage responseMessageBuildResponseMessage;
        OSSRequest request;
        long statSize;
        String stringBody;
        InputStream content;
        long contentLength;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            if (this.context.getApplicationContext() != null) {
                OSSLog.logInfo(OSSUtils.buildBaseLogInfo(this.context.getApplicationContext()));
            }
            OSSLog.logDebug("[call] - ");
            request = this.context.getRequest();
            OSSUtils.ensureRequestValid(request, this.message);
            OSSUtils.signRequest(this.message);
        } catch (Exception e) {
            e = e;
            realCallOooO00o = null;
            requestOooO0O0 = null;
        }
        if (this.context.getCancellationHandler().isCancelled()) {
            throw new InterruptedIOException("This task is cancelled!");
        }
        Request.Builder builder = new Request.Builder();
        builder.OooO0o(request instanceof ListBucketsRequest ? this.message.buildOSSServiceURL() : this.message.buildCanonicalURL());
        for (String str : this.message.getHeaders().keySet()) {
            builder.OooO00o(str, (String) this.message.getHeaders().get(str));
        }
        String str2 = (String) this.message.getHeaders().get("Content-Type");
        OSSLog.logDebug("request method = " + this.message.getMethod());
        int i = C01371.$SwitchMap$com$alibaba$sdk$android$oss$common$HttpMethod[this.message.getMethod().ordinal()];
        if (i == 1 || i == 2) {
            OSSUtils.assertTrue(str2 != null, "Content type can't be null when upload!");
            if (this.message.getUploadData() != null) {
                content = new ByteArrayInputStream(this.message.getUploadData());
                contentLength = this.message.getUploadData().length;
            } else {
                if (this.message.getUploadFilePath() != null) {
                    File file = new File(this.message.getUploadFilePath());
                    FileInputStream fileInputStream = new FileInputStream(file);
                    long length = file.length();
                    if (length <= 0) {
                        throw new ClientException("the length of file is 0!");
                    }
                    stringBody = null;
                    content = fileInputStream;
                    statSize = length;
                } else if (this.message.getUploadUri() != null) {
                    content = this.context.getApplicationContext().getContentResolver().openInputStream(this.message.getUploadUri());
                    try {
                        parcelFileDescriptorOpenFileDescriptor = this.context.getApplicationContext().getContentResolver().openFileDescriptor(this.message.getUploadUri(), "r");
                        try {
                            statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            stringBody = null;
                        } catch (Throwable th) {
                            th = th;
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        parcelFileDescriptorOpenFileDescriptor = null;
                    }
                } else if (this.message.getContent() != null) {
                    content = this.message.getContent();
                    contentLength = this.message.getContentLength();
                } else {
                    statSize = 0;
                    stringBody = this.message.getStringBody();
                    content = null;
                }
                if (content == null) {
                    if (this.message.isCheckCRC64()) {
                        content = new CheckedInputStream(content, new CRC64());
                    }
                    this.message.setContent(content);
                    this.message.setContentLength(statSize);
                    builder.OooO0Oo(this.message.getMethod().toString(), NetworkProgressHelper.addProgressRequestBody(content, statSize, str2, this.context));
                } else if (stringBody != null) {
                    String string = this.message.getMethod().toString();
                    MediaType.f124148OooO0o0.getClass();
                    builder.OooO0Oo(string, RequestBody.create(MediaType.Companion.OooO0O0(str2), stringBody.getBytes("UTF-8")));
                } else {
                    builder.OooO0Oo(this.message.getMethod().toString(), RequestBody.create((MediaType) null, new byte[0]));
                }
            }
            statSize = contentLength;
            stringBody = null;
            if (content == null) {
            }
        } else if (i == 3) {
            builder.OooO0Oo("GET", null);
        } else if (i == 4) {
            builder.OooO0Oo("HEAD", null);
        } else if (i == 5) {
            builder.OooO0Oo("DELETE", Util.f124304OooO0Oo);
        }
        requestOooO0O0 = builder.OooO0O0();
        try {
            if (request instanceof GetObjectRequest) {
                this.client = NetworkProgressHelper.addProgressResponseListener(this.client, this.context);
                OSSLog.logDebug("getObject");
            }
            realCallOooO00o = this.client.OooO00o(requestOooO0O0);
        } catch (Exception e2) {
            e = e2;
            realCallOooO00o = null;
        }
        try {
            this.context.getCancellationHandler().setCall(realCallOooO00o);
            Response responseExecute = realCallOooO00o.execute();
            if (OSSLog.isEnableLog()) {
                TreeMap treeMapOooO0o = responseExecute.f124263OooOoo0.OooO0o();
                StringBuilder sb = new StringBuilder();
                sb.append("response:---------------------\n");
                sb.append("response code: " + responseExecute.f124259OooOoO + " for url: " + requestOooO0O0.f124238OooO00o + IOUtils.LINE_SEPARATOR_UNIX);
                for (String str3 : treeMapOooO0o.keySet()) {
                    sb.append("responseHeader [" + str3 + "]: ");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) ((List) treeMapOooO0o.get(str3)).get(0));
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb.append(sb2.toString());
                }
                OSSLog.logDebug(sb.toString());
            }
            responseMessageBuildResponseMessage = buildResponseMessage(this.message, responseExecute);
            clientException = null;
        } catch (Exception e3) {
            e = e3;
            OSSLog.logError("Encounter local execpiton: " + e.toString());
            if (OSSLog.isEnableLog()) {
                e.printStackTrace();
            }
            clientException = new ClientException(e.getMessage(), e);
            responseMessageBuildResponseMessage = null;
        }
        if (clientException == null && (responseMessageBuildResponseMessage.getStatusCode() == 203 || responseMessageBuildResponseMessage.getStatusCode() >= 300)) {
            clientException = ResponseParsers.parseResponseErrorXML(responseMessageBuildResponseMessage, requestOooO0O0.f124239OooO0O0.equals("HEAD"));
        } else if (clientException == null) {
            try {
                T t = (T) this.responseParser.parse(responseMessageBuildResponseMessage);
                if (this.context.getCompletedCallback() != null) {
                    this.context.getCompletedCallback().onSuccess(this.context.getRequest(), t);
                }
                return t;
            } catch (IOException e4) {
                clientException = new ClientException(e4.getMessage(), e4);
            }
        }
        if ((realCallOooO00o != null && realCallOooO00o.f124390Oooo0o0) || this.context.getCancellationHandler().isCancelled()) {
            clientException = new ClientException("Task is cancelled!", clientException.getCause(), Boolean.TRUE);
        }
        OSSRetryType oSSRetryTypeShouldRetry = this.retryHandler.shouldRetry(clientException, this.currentRetryCount);
        OSSLog.logError("[run] - retry, retry type: " + oSSRetryTypeShouldRetry);
        if (oSSRetryTypeShouldRetry == OSSRetryType.OSSRetryTypeShouldRetry) {
            this.currentRetryCount++;
            if (this.context.getRetryCallback() != null) {
                this.context.getRetryCallback().onRetryCallback();
            }
            try {
                Thread.sleep(this.retryHandler.timeInterval(this.currentRetryCount, oSSRetryTypeShouldRetry));
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                e5.printStackTrace();
            }
            return (T) call();
        }
        if (oSSRetryTypeShouldRetry != OSSRetryType.OSSRetryTypeShouldFixedTimeSkewedAndRetry) {
            if (clientException instanceof ClientException) {
                if (this.context.getCompletedCallback() == null) {
                    throw clientException;
                }
                this.context.getCompletedCallback().onFailure(this.context.getRequest(), (ClientException) clientException, null);
                throw clientException;
            }
            if (this.context.getCompletedCallback() == null) {
                throw clientException;
            }
            this.context.getCompletedCallback().onFailure(this.context.getRequest(), null, (ServiceException) clientException);
            throw clientException;
        }
        if (responseMessageBuildResponseMessage != null) {
            String str4 = (String) responseMessageBuildResponseMessage.getHeaders().get("Date");
            try {
                DateUtil.setCurrentServerTime(DateUtil.parseRfc822Date(str4).getTime());
                this.message.getHeaders().put("Date", str4);
            } catch (Exception unused) {
                OSSLog.logError("[error] - synchronize time, reponseDate:" + str4);
            }
        }
        this.currentRetryCount++;
        if (this.context.getRetryCallback() != null) {
            this.context.getRetryCallback().onRetryCallback();
        }
        return (T) call();
    }
}
