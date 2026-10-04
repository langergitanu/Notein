package com.google.api.client.http;

import OooOoo.C20593OooO0Oo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.ControlChar;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.util.LoggingStreamingContent;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.api.client.util.StreamingContent;
import com.google.api.client.util.StringUtils;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C24037Oooo0OO;
import oO00Ooo.AbstractC32307OooOo0O;
import oO00Ooo.C32293OooO0O0;
import oO00Ooo.C32294OooO0OO;
import oO00Ooo.C32300OooOO0;
import oO00Ooo.OooOO0O;
import oO00Ooo.OooOOOO;
import oO00Ooo0.C32309OooO00o;
import oO00o000.OooO00o;
import oO0OOo0o.C33065OooOOOo;

/* JADX INFO: loaded from: classes7.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX;
    public static final String VERSION;

    @Deprecated
    private BackOffPolicy backOffPolicy;
    private HttpContent content;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private HttpIOExceptionHandler ioExceptionHandler;
    private ObjectParser objectParser;
    private String requestMethod;
    private HttpResponseInterceptor responseInterceptor;
    private boolean suppressUserAgentSuffix;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;
    private HttpHeaders headers = new HttpHeaders();
    private HttpHeaders responseHeaders = new HttpHeaders();
    private int numRetries = 10;
    private int contentLoggingLimit = 16384;
    private boolean loggingEnabled = true;
    private boolean curlLoggingEnabled = true;
    private int connectTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int readTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int writeTimeout = 0;
    private boolean followRedirects = true;
    private boolean useRawRedirectUrls = false;
    private boolean throwExceptionOnExecuteError = true;

    @Deprecated
    private boolean retryOnExecuteIOException = false;
    private Sleeper sleeper = Sleeper.DEFAULT;
    private final AbstractC32307OooOo0O tracer = OpenCensusUtils.getTracer();
    private boolean responseReturnRawInputStream = false;

    static {
        String version = getVersion();
        VERSION = version;
        USER_AGENT_SUFFIX = C20593OooO0Oo.OooO0O0("Google-HTTP-Java-Client/", version, " (gzip)");
    }

    public HttpRequest(HttpTransport httpTransport, String str) {
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    private static void addSpanAttribute(OooOOOO oooOOOO, String str, String str2) {
        if (str2 != null) {
            oooOOOO.OooO0OO(str, new C32294OooO0OO(str2));
        }
    }

    private static String getVersion() {
        String property = "unknown-version";
        try {
            InputStream resourceAsStream = HttpRequest.class.getResourceAsStream("/com/google/api/client/http/google-http-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    property = properties.getProperty("google-http-client.version");
                } finally {
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return property;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(7:(22:23|(2:25|(1:27))|30|(2:32|(1:34)(1:35))|36|(1:38)|39|(1:45)(1:44)|46|(8:48|(1:50)(1:51)|52|(1:54)(1:55)|56|(5:58|(2:60|(1:62))(1:63)|(2:65|(1:67))|68|(1:70))(1:71)|(1:73)|74)(1:75)|(2:77|(3:79|(1:81)|82))|(1:86)(1:85)|87|176|88|(1:90)|178|96|97|(3:183|116|(5:118|(1:120)(1:123)|(2:125|(1:(3:133|134|(3:180|136|127)))(1:127))|138|(1:140))(2:(1:145)(1:146)|147))(0)|148|(4:188|(1:151)(1:152)|153|(4:155|(1:157)|158|(1:168)(3:174|163|164))(1:169))(1:170))(1:29)|178|96|97|(0)(0)|148|(0)(0))|176|88|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02af, code lost:
    
        if (r24.retryOnExecuteIOException == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bc, code lost:
    
        r4.OooO0o0(com.google.api.client.http.OpenCensusUtils.getEndSpanOptions(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c4, code lost:
    
        if (r20 != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c6, code lost:
    
        r8.log(java.util.logging.Level.WARNING, "exception thrown while executing request", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02cd, code lost:
    
        ((oO0OOo0o.C33065OooOOOo) oO00o000.OooO00o.f116248OooO0O0.OooO00o().f80945OooO00o).OooOooo(r3);
        r3 = r16;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x028a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0377 A[LOOP:0: B:10:0x003b->B:170:0x0377, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0271 A[Catch: all -> 0x0287, IOException -> 0x028a, TRY_LEAVE, TryCatch #1 {IOException -> 0x028a, blocks: (B:88:0x026b, B:90:0x0271, B:99:0x02a3, B:101:0x02a9, B:102:0x02ac), top: B:176:0x026b, outer: #4 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.google.api.client.http.HttpResponseInterceptor] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.api.client.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.api.client.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.api.client.http.HttpUnsuccessfulResponseHandler] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse execute() throws IOException {
        StringBuilder sbOooO0OO;
        StringBuilder sb;
        HttpContent httpContent;
        int i;
        boolean z;
        boolean z2;
        Integer num;
        long j;
        StreamingContent streamingContent;
        C33065OooOOOo c33065OooOOOo;
        ?? r3;
        boolean z3;
        BackOffPolicy backOffPolicy;
        LowLevelHttpResponse lowLevelHttpResponseExecute;
        StreamingContent loggingStreamingContent;
        String name;
        StreamingContent httpEncodingStreamingContent;
        long length;
        Preconditions.checkArgument(this.numRetries >= 0);
        int i2 = this.numRetries;
        BackOffPolicy backOffPolicy2 = this.backOffPolicy;
        if (backOffPolicy2 != null) {
            backOffPolicy2.reset();
        }
        Preconditions.checkNotNull(this.requestMethod);
        Preconditions.checkNotNull(this.url);
        AbstractC32307OooOo0O abstractC32307OooOo0O = this.tracer;
        String str = OpenCensusUtils.SPAN_NAME_HTTP_REQUEST_EXECUTE;
        abstractC32307OooOo0O.getClass();
        OooOO0O oooOO0O = OooO00o.f116248OooO0O0;
        oooOO0O.OooO0OO(oooOO0O.OooO00o());
        C32309OooO00o.OooO00o(str, "name");
        OpenCensusUtils.isRecordEvent();
        C32300OooOO0 c32300OooOO0 = C32300OooOO0.f116193OooO0o0;
        int i3 = i2;
        ?? r0 = 0;
        while (true) {
            String str2 = "retry #" + (this.numRetries - i3);
            c32300OooOO0.getClass();
            C32309OooO00o.OooO00o(str2, "description");
            C32309OooO00o.OooO00o(OooOOOO.f116201OooO0OO, "attributes");
            if (r0 != 0) {
                r0.ignore();
            }
            HttpExecuteInterceptor httpExecuteInterceptor = this.executeInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(this);
            }
            String strBuild = this.url.build();
            addSpanAttribute(c32300OooOO0, "http.method", this.requestMethod);
            addSpanAttribute(c32300OooOO0, "http.host", this.url.getHost());
            addSpanAttribute(c32300OooOO0, "http.path", this.url.getRawPath());
            addSpanAttribute(c32300OooOO0, "http.url", strBuild);
            LowLevelHttpRequest lowLevelHttpRequestBuildRequest = this.transport.buildRequest(this.requestMethod, strBuild);
            Logger logger = HttpTransport.LOGGER;
            boolean z4 = this.loggingEnabled && logger.isLoggable(Level.CONFIG);
            try {
                try {
                    if (z4) {
                        sbOooO0OO = C22218Oooo.OooO0OO("-------------- REQUEST  --------------");
                        String str3 = StringUtils.LINE_SEPARATOR;
                        sbOooO0OO.append(str3);
                        sbOooO0OO.append(this.requestMethod);
                        sbOooO0OO.append(ControlChar.SPACE_CHAR);
                        sbOooO0OO.append(strBuild);
                        sbOooO0OO.append(str3);
                        if (this.curlLoggingEnabled) {
                            sb = new StringBuilder("curl -v --compressed");
                            if (!this.requestMethod.equals("GET")) {
                                sb.append(" -X ");
                                sb.append(this.requestMethod);
                            }
                        }
                        String userAgent = this.headers.getUserAgent();
                        if (!this.suppressUserAgentSuffix) {
                            if (userAgent == null) {
                                HttpHeaders httpHeaders = this.headers;
                                String str4 = USER_AGENT_SUFFIX;
                                httpHeaders.setUserAgent(str4);
                                addSpanAttribute(c32300OooOO0, "http.user_agent", str4);
                            } else {
                                StringBuilder sbOooO0OO2 = C22226Oooo0oo.OooO0OO(userAgent, " ");
                                sbOooO0OO2.append(USER_AGENT_SUFFIX);
                                String string = sbOooO0OO2.toString();
                                this.headers.setUserAgent(string);
                                addSpanAttribute(c32300OooOO0, "http.user_agent", string);
                            }
                        }
                        OpenCensusUtils.propagateTracingContext(c32300OooOO0, this.headers);
                        HttpHeaders.serializeHeaders(this.headers, sbOooO0OO, sb, logger, lowLevelHttpRequestBuildRequest);
                        if (!this.suppressUserAgentSuffix) {
                            this.headers.setUserAgent(userAgent);
                        }
                        httpContent = this.content;
                        boolean z5 = httpContent != null || httpContent.retrySupported();
                        if (httpContent == null) {
                            String type = this.content.getType();
                            num = null;
                            if (z4) {
                                j = -1;
                                loggingStreamingContent = new LoggingStreamingContent(httpContent, logger, Level.CONFIG, this.contentLoggingLimit);
                            } else {
                                j = -1;
                                loggingStreamingContent = httpContent;
                            }
                            HttpEncoding httpEncoding = this.encoding;
                            if (httpEncoding == null) {
                                length = this.content.getLength();
                                name = null;
                                httpEncodingStreamingContent = loggingStreamingContent;
                            } else {
                                name = httpEncoding.getName();
                                httpEncodingStreamingContent = new HttpEncodingStreamingContent(loggingStreamingContent, this.encoding);
                                length = j;
                            }
                            i = i3;
                            if (z4) {
                                z = z4;
                                if (type != null) {
                                    String strConcat = "Content-Type: ".concat(type);
                                    sbOooO0OO.append(strConcat);
                                    z2 = z5;
                                    sbOooO0OO.append(StringUtils.LINE_SEPARATOR);
                                    if (sb != null) {
                                        sb.append(" -H '" + strConcat + "'");
                                    }
                                } else {
                                    z2 = z5;
                                }
                                if (name != null) {
                                    String strConcat2 = "Content-Encoding: ".concat(name);
                                    sbOooO0OO.append(strConcat2);
                                    sbOooO0OO.append(StringUtils.LINE_SEPARATOR);
                                    if (sb != null) {
                                        sb.append(" -H '" + strConcat2 + "'");
                                    }
                                }
                                if (length >= 0) {
                                    sbOooO0OO.append("Content-Length: " + length);
                                    sbOooO0OO.append(StringUtils.LINE_SEPARATOR);
                                }
                            } else {
                                z = z4;
                                z2 = z5;
                            }
                            if (sb != null) {
                                sb.append(" -d '@-'");
                            }
                            lowLevelHttpRequestBuildRequest.setContentType(type);
                            lowLevelHttpRequestBuildRequest.setContentEncoding(name);
                            lowLevelHttpRequestBuildRequest.setContentLength(length);
                            lowLevelHttpRequestBuildRequest.setStreamingContent(httpEncodingStreamingContent);
                            streamingContent = httpEncodingStreamingContent;
                        } else {
                            i = i3;
                            z = z4;
                            z2 = z5;
                            num = null;
                            j = -1;
                            streamingContent = httpContent;
                        }
                        if (z) {
                            logger.config(sbOooO0OO.toString());
                            if (sb != null) {
                                sb.append(" -- '");
                                sb.append(strBuild.replaceAll("'", "'\"'\"'"));
                                sb.append("'");
                                if (streamingContent != null) {
                                    sb.append(" << $$$");
                                }
                                logger.config(sb.toString());
                            }
                        }
                        boolean z6 = !z2 && i > 0;
                        lowLevelHttpRequestBuildRequest.setTimeout(this.connectTimeout, this.readTimeout);
                        lowLevelHttpRequestBuildRequest.setWriteTimeout(this.writeTimeout);
                        this.tracer.getClass();
                        OooOO0O oooOO0O2 = OooO00o.f116248OooO0O0;
                        c33065OooOOOo = (C33065OooOOOo) new C24037Oooo0OO(((C33065OooOOOo) oooOO0O2.OooO0O0(oooOO0O2.OooO00o(), c32300OooOO0).f80945OooO00o).OooO0OO()).f80945OooO00o;
                        OpenCensusUtils.recordSentMessageEvent(c32300OooOO0, lowLevelHttpRequestBuildRequest.getContentLength());
                        lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                        if (lowLevelHttpResponseExecute != null) {
                            OpenCensusUtils.recordReceivedMessageEvent(c32300OooOO0, lowLevelHttpResponseExecute.getContentLength());
                            new C32293OooO0O0(Long.valueOf(lowLevelHttpResponseExecute.getStatusCode()));
                        }
                        HttpResponse httpResponse = new HttpResponse(this, lowLevelHttpResponseExecute);
                        ((C33065OooOOOo) OooO00o.f116248OooO0O0.OooO00o().f80945OooO00o).OooOooo(c33065OooOOOo);
                        r3 = httpResponse;
                        ?? r02 = num;
                        if (r3 == 0) {
                            try {
                                if (r3.isSuccessStatusCode()) {
                                    z3 = z6 & (r3 == 0);
                                } else {
                                    ?? r5 = this.unsuccessfulResponseHandler;
                                    boolean zHandleResponse = r5 != 0 ? r5.handleResponse(this, r3, z6) : false;
                                    if (!zHandleResponse) {
                                        if (handleRedirect(r3.getStatusCode(), r3.getHeaders())) {
                                            zHandleResponse = true;
                                        } else if (z6 && (backOffPolicy = this.backOffPolicy) != null && backOffPolicy.isBackOffRequired(r3.getStatusCode())) {
                                            long nextBackOffMillis = this.backOffPolicy.getNextBackOffMillis();
                                            if (nextBackOffMillis != j) {
                                                try {
                                                    this.sleeper.sleep(nextBackOffMillis);
                                                } catch (InterruptedException unused) {
                                                }
                                                zHandleResponse = true;
                                            }
                                        }
                                    }
                                    z3 = z6 & zHandleResponse;
                                    if (z3) {
                                        r3.ignore();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        i3 = i - 1;
                        if (z3) {
                            c32300OooOO0.OooO0o0(OpenCensusUtils.getEndSpanOptions(r3 == 0 ? num : Integer.valueOf(r3.getStatusCode())));
                            if (r3 == 0) {
                                throw r02;
                            }
                            ?? r03 = this.responseInterceptor;
                            if (r03 != 0) {
                                r03.interceptResponse(r3);
                            }
                            if (!this.throwExceptionOnExecuteError || r3.isSuccessStatusCode()) {
                                return r3;
                            }
                            try {
                                throw new HttpResponseException.Builder(r3).setAttemptCount(this.numRetries - i3).build();
                            } finally {
                                r3.disconnect();
                            }
                        }
                        r0 = r3;
                    } else {
                        sbOooO0OO = null;
                    }
                    HttpResponse httpResponse2 = new HttpResponse(this, lowLevelHttpResponseExecute);
                    ((C33065OooOOOo) OooO00o.f116248OooO0O0.OooO00o().f80945OooO00o).OooOooo(c33065OooOOOo);
                    r3 = httpResponse2;
                    ?? r022 = num;
                    if (r3 == 0) {
                    }
                    i3 = i - 1;
                    if (z3) {
                    }
                } catch (Throwable th2) {
                    InputStream content = lowLevelHttpResponseExecute.getContent();
                    if (content != null) {
                        content.close();
                    }
                    throw th2;
                }
                lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                if (lowLevelHttpResponseExecute != null) {
                }
            } catch (Throwable th3) {
                ((C33065OooOOOo) OooO00o.f116248OooO0O0.OooO00o().f80945OooO00o).OooOooo(c33065OooOOOo);
                throw th3;
            }
            sb = null;
            String userAgent2 = this.headers.getUserAgent();
            if (!this.suppressUserAgentSuffix) {
            }
            OpenCensusUtils.propagateTracingContext(c32300OooOO0, this.headers);
            HttpHeaders.serializeHeaders(this.headers, sbOooO0OO, sb, logger, lowLevelHttpRequestBuildRequest);
            if (!this.suppressUserAgentSuffix) {
            }
            httpContent = this.content;
            if (httpContent != null) {
            }
            if (httpContent == null) {
            }
            if (z) {
            }
            if (z2) {
            }
            lowLevelHttpRequestBuildRequest.setTimeout(this.connectTimeout, this.readTimeout);
            lowLevelHttpRequestBuildRequest.setWriteTimeout(this.writeTimeout);
            this.tracer.getClass();
            OooOO0O oooOO0O22 = OooO00o.f116248OooO0O0;
            c33065OooOOOo = (C33065OooOOOo) new C24037Oooo0OO(((C33065OooOOOo) oooOO0O22.OooO0O0(oooOO0O22.OooO00o(), c32300OooOO0).f80945OooO00o).OooO0OO()).f80945OooO00o;
            OpenCensusUtils.recordSentMessageEvent(c32300OooOO0, lowLevelHttpRequestBuildRequest.getContentLength());
        }
    }

    public Future<HttpResponse> executeAsync(Executor executor) {
        FutureTask futureTask = new FutureTask(new Callable<HttpResponse>() { // from class: com.google.api.client.http.HttpRequest.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HttpResponse call() throws Exception {
                return HttpRequest.this.execute();
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.backOffPolicy;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public final ObjectParser getParser() {
        return this.objectParser;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public boolean getResponseReturnRawInputStream() {
        return this.responseReturnRawInputStream;
    }

    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.retryOnExecuteIOException;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.suppressUserAgentSuffix;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public boolean getUseRawRedirectUrls() {
        return this.useRawRedirectUrls;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public boolean handleRedirect(int i, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (!getFollowRedirects() || !HttpStatusCodes.isRedirect(i) || location == null) {
            return false;
        }
        setUrl(new GenericUrl(this.url.toURL(location), this.useRawRedirectUrls));
        if (i == 303) {
            setRequestMethod("GET");
            setContent(null);
        }
        this.headers.setAuthorization((String) null);
        this.headers.setIfMatch(null);
        this.headers.setIfNoneMatch(null);
        this.headers.setIfModifiedSince(null);
        this.headers.setIfUnmodifiedSince(null);
        this.headers.setIfRange(null);
        return true;
    }

    public boolean isCurlLoggingEnabled() {
        return this.curlLoggingEnabled;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.backOffPolicy = backOffPolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.connectTimeout = i;
        return this;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i) {
        Preconditions.checkArgument(i >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z) {
        this.curlLoggingEnabled = z;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i) {
        Preconditions.checkArgument(i >= 0);
        this.numRetries = i;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.objectParser = objectParser;
        return this;
    }

    public HttpRequest setReadTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.readTimeout = i;
        return this;
    }

    public HttpRequest setRequestMethod(String str) {
        Preconditions.checkArgument(str == null || HttpMediaType.matchesToken(str));
        this.requestMethod = str;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public HttpRequest setResponseReturnRawInputStream(boolean z) {
        this.responseReturnRawInputStream = z;
        return this;
    }

    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z) {
        this.retryOnExecuteIOException = z;
        return this;
    }

    public HttpRequest setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z) {
        this.suppressUserAgentSuffix = z;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z) {
        this.throwExceptionOnExecuteError = z;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }

    public HttpRequest setUseRawRedirectUrls(boolean z) {
        this.useRawRedirectUrls = z;
        return this;
    }

    public HttpRequest setWriteTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.writeTimeout = i;
        return this;
    }

    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newFixedThreadPool(1, new ThreadFactoryBuilder().setDaemon(true).build()));
    }
}
