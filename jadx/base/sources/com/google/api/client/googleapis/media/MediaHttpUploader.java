package com.google.api.client.googleapis.media;

import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class MediaHttpUploader {
    public static final String CONTENT_LENGTH_HEADER = "X-Upload-Content-Length";
    public static final String CONTENT_TYPE_HEADER = "X-Upload-Content-Type";
    public static final int DEFAULT_CHUNK_SIZE = 10485760;

    /* JADX INFO: renamed from: KB */
    private static final int f51638KB = 1024;

    /* JADX INFO: renamed from: MB */
    static final int f51639MB = 1048576;
    public static final int MINIMUM_CHUNK_SIZE = 262144;
    private Byte cachedByte;
    private InputStream contentInputStream;
    private int currentChunkLength;
    private HttpRequest currentRequest;
    private byte[] currentRequestContentBuffer;
    private boolean directUploadEnabled;
    private boolean disableGZipContent;
    private boolean isMediaContentLengthCalculated;
    private final AbstractInputStreamContent mediaContent;
    private long mediaContentLength;
    private HttpContent metadata;
    private MediaHttpUploaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private long totalBytesClientSent;
    private long totalBytesServerReceived;
    private final HttpTransport transport;
    private UploadState uploadState = UploadState.NOT_STARTED;
    private String initiationRequestMethod = "POST";
    private HttpHeaders initiationHeaders = new HttpHeaders();
    String mediaContentLengthStr = C18358t1.g.f56183c;
    private int chunkSize = DEFAULT_CHUNK_SIZE;
    Sleeper sleeper = Sleeper.DEFAULT;

    public static class ContentChunk {
        private final AbstractInputStreamContent content;
        private final String contentRange;

        public ContentChunk(AbstractInputStreamContent abstractInputStreamContent, String str) {
            this.content = abstractInputStreamContent;
            this.contentRange = str;
        }

        public AbstractInputStreamContent getContent() {
            return this.content;
        }

        public String getContentRange() {
            return this.contentRange;
        }
    }

    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpUploader(AbstractInputStreamContent abstractInputStreamContent, HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.mediaContent = (AbstractInputStreamContent) Preconditions.checkNotNull(abstractInputStreamContent);
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        this.requestFactory = httpRequestInitializer == null ? httpTransport.createRequestFactory() : httpTransport.createRequestFactory(httpRequestInitializer);
    }

    private ContentChunk buildContentChunk() throws IOException {
        int i;
        int i2;
        AbstractInputStreamContent byteArrayContent;
        String str;
        int iMin = isMediaLengthKnown() ? (int) Math.min(this.chunkSize, getMediaContentLength() - this.totalBytesServerReceived) : this.chunkSize;
        if (isMediaLengthKnown()) {
            this.contentInputStream.mark(iMin);
            long j = iMin;
            byteArrayContent = new InputStreamContent(this.mediaContent.getType(), ByteStreams.limit(this.contentInputStream, j)).setRetrySupported(true).setLength(j).setCloseInputStream(false);
            this.mediaContentLengthStr = String.valueOf(getMediaContentLength());
        } else {
            byte[] bArr = this.currentRequestContentBuffer;
            if (bArr == null) {
                Byte b = this.cachedByte;
                i = b == null ? iMin + 1 : iMin;
                byte[] bArr2 = new byte[iMin + 1];
                this.currentRequestContentBuffer = bArr2;
                if (b != null) {
                    bArr2[0] = b.byteValue();
                }
                i2 = 0;
            } else {
                int i3 = (int) (this.totalBytesClientSent - this.totalBytesServerReceived);
                System.arraycopy(bArr, this.currentChunkLength - i3, bArr, 0, i3);
                Byte b2 = this.cachedByte;
                if (b2 != null) {
                    this.currentRequestContentBuffer[i3] = b2.byteValue();
                }
                i = iMin - i3;
                i2 = i3;
            }
            int i4 = ByteStreams.read(this.contentInputStream, this.currentRequestContentBuffer, (iMin + 1) - i, i);
            if (i4 < i) {
                iMin = Math.max(0, i4) + i2;
                if (this.cachedByte != null) {
                    iMin++;
                    this.cachedByte = null;
                }
                if (this.mediaContentLengthStr.equals(C18358t1.g.f56183c)) {
                    this.mediaContentLengthStr = String.valueOf(this.totalBytesServerReceived + ((long) iMin));
                }
            } else {
                this.cachedByte = Byte.valueOf(this.currentRequestContentBuffer[iMin]);
            }
            byteArrayContent = new ByteArrayContent(this.mediaContent.getType(), this.currentRequestContentBuffer, 0, iMin);
            this.totalBytesClientSent = this.totalBytesServerReceived + ((long) iMin);
        }
        this.currentChunkLength = iMin;
        if (iMin == 0) {
            str = "bytes */" + this.mediaContentLengthStr;
        } else {
            str = "bytes " + this.totalBytesServerReceived + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + ((this.totalBytesServerReceived + ((long) iMin)) - 1) + "/" + this.mediaContentLengthStr;
        }
        return new ContentChunk(byteArrayContent, str);
    }

    private HttpResponse directUpload(GenericUrl genericUrl) throws IOException {
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        HttpContent contentParts = this.mediaContent;
        if (this.metadata != null) {
            contentParts = new MultipartContent().setContentParts(Arrays.asList(this.metadata, this.mediaContent));
            genericUrl.put("uploadType", "multipart");
        } else {
            genericUrl.put("uploadType", "media");
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, contentParts);
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest);
        try {
            if (isMediaLengthKnown()) {
                this.totalBytesServerReceived = getMediaContentLength();
            }
            updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th;
        }
    }

    private HttpResponse executeCurrentRequest(HttpRequest httpRequest) throws IOException {
        if (!this.disableGZipContent && !(httpRequest.getContent() instanceof EmptyContent)) {
            httpRequest.setEncoding(new GZipEncoding());
        }
        return executeCurrentRequestWithoutGZip(httpRequest);
    }

    private HttpResponse executeCurrentRequestWithoutGZip(HttpRequest httpRequest) throws IOException {
        new MethodOverride().intercept(httpRequest);
        httpRequest.setThrowExceptionOnExecuteError(false);
        return httpRequest.execute();
    }

    private HttpResponse executeUploadInitiation(GenericUrl genericUrl) throws IOException {
        updateStateAndNotifyListener(UploadState.INITIATION_STARTED);
        genericUrl.put("uploadType", "resumable");
        HttpContent emptyContent = this.metadata;
        if (emptyContent == null) {
            emptyContent = new EmptyContent();
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, emptyContent);
        this.initiationHeaders.set("X-Upload-Content-Type", (Object) this.mediaContent.getType());
        if (isMediaLengthKnown()) {
            this.initiationHeaders.set("X-Upload-Content-Length", (Object) Long.valueOf(getMediaContentLength()));
        }
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest);
        try {
            updateStateAndNotifyListener(UploadState.INITIATION_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th;
        }
    }

    private long getMediaContentLength() throws IOException {
        if (!this.isMediaContentLengthCalculated) {
            this.mediaContentLength = this.mediaContent.getLength();
            this.isMediaContentLengthCalculated = true;
        }
        return this.mediaContentLength;
    }

    private long getNextByteIndex(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    private boolean isMediaLengthKnown() throws IOException {
        return getMediaContentLength() >= 0;
    }

    private HttpResponse resumableUpload(GenericUrl genericUrl) throws IOException {
        HttpResponse httpResponseExecuteUploadInitiation = executeUploadInitiation(genericUrl);
        if (!httpResponseExecuteUploadInitiation.isSuccessStatusCode()) {
            return httpResponseExecuteUploadInitiation;
        }
        try {
            GenericUrl genericUrl2 = new GenericUrl(httpResponseExecuteUploadInitiation.getHeaders().getLocation());
            httpResponseExecuteUploadInitiation.disconnect();
            InputStream inputStream = this.mediaContent.getInputStream();
            this.contentInputStream = inputStream;
            if (!inputStream.markSupported() && isMediaLengthKnown()) {
                this.contentInputStream = new BufferedInputStream(this.contentInputStream);
            }
            while (true) {
                ContentChunk contentChunkBuildContentChunk = buildContentChunk();
                HttpRequest httpRequestBuildPutRequest = this.requestFactory.buildPutRequest(genericUrl2, null);
                this.currentRequest = httpRequestBuildPutRequest;
                httpRequestBuildPutRequest.setContent(contentChunkBuildContentChunk.getContent());
                this.currentRequest.getHeaders().setContentRange(contentChunkBuildContentChunk.getContentRange());
                new MediaUploadErrorHandler(this, this.currentRequest);
                HttpResponse httpResponseExecuteCurrentRequestWithoutGZip = isMediaLengthKnown() ? executeCurrentRequestWithoutGZip(this.currentRequest) : executeCurrentRequest(this.currentRequest);
                try {
                    if (httpResponseExecuteCurrentRequestWithoutGZip.isSuccessStatusCode()) {
                        this.totalBytesServerReceived = getMediaContentLength();
                        if (this.mediaContent.getCloseInputStream()) {
                            this.contentInputStream.close();
                        }
                        updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
                        return httpResponseExecuteCurrentRequestWithoutGZip;
                    }
                    if (httpResponseExecuteCurrentRequestWithoutGZip.getStatusCode() != 308) {
                        if (this.mediaContent.getCloseInputStream()) {
                            this.contentInputStream.close();
                        }
                        return httpResponseExecuteCurrentRequestWithoutGZip;
                    }
                    String location = httpResponseExecuteCurrentRequestWithoutGZip.getHeaders().getLocation();
                    if (location != null) {
                        genericUrl2 = new GenericUrl(location);
                    }
                    long nextByteIndex = getNextByteIndex(httpResponseExecuteCurrentRequestWithoutGZip.getHeaders().getRange());
                    long j = nextByteIndex - this.totalBytesServerReceived;
                    Preconditions.checkState(j >= 0 && j <= ((long) this.currentChunkLength));
                    long j2 = ((long) this.currentChunkLength) - j;
                    if (isMediaLengthKnown()) {
                        if (j2 > 0) {
                            this.contentInputStream.reset();
                            Preconditions.checkState(j == this.contentInputStream.skip(j));
                        }
                    } else if (j2 == 0) {
                        this.currentRequestContentBuffer = null;
                    }
                    this.totalBytesServerReceived = nextByteIndex;
                    updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
                    httpResponseExecuteCurrentRequestWithoutGZip.disconnect();
                } catch (Throwable th) {
                    httpResponseExecuteCurrentRequestWithoutGZip.disconnect();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            httpResponseExecuteUploadInitiation.disconnect();
            throw th2;
        }
    }

    private void updateStateAndNotifyListener(UploadState uploadState) throws IOException {
        this.uploadState = uploadState;
        MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener = this.progressListener;
        if (mediaHttpUploaderProgressListener != null) {
            mediaHttpUploaderProgressListener.progressChanged(this);
        }
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public boolean getDisableGZipContent() {
        return this.disableGZipContent;
    }

    public HttpHeaders getInitiationHeaders() {
        return this.initiationHeaders;
    }

    public String getInitiationRequestMethod() {
        return this.initiationRequestMethod;
    }

    public HttpContent getMediaContent() {
        return this.mediaContent;
    }

    public HttpContent getMetadata() {
        return this.metadata;
    }

    public long getNumBytesUploaded() {
        return this.totalBytesServerReceived;
    }

    public double getProgress() throws IOException {
        Preconditions.checkArgument(isMediaLengthKnown(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (getMediaContentLength() == 0) {
            return 0.0d;
        }
        return this.totalBytesServerReceived / getMediaContentLength();
    }

    public MediaHttpUploaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public UploadState getUploadState() {
        return this.uploadState;
    }

    public boolean isDirectUploadEnabled() {
        return this.directUploadEnabled;
    }

    public void serverErrorCallback() throws IOException {
        Preconditions.checkNotNull(this.currentRequest, "The current request should not be null");
        this.currentRequest.setContent(new EmptyContent());
        this.currentRequest.getHeaders().setContentRange("bytes */" + this.mediaContentLengthStr);
    }

    public MediaHttpUploader setChunkSize(int i) {
        Preconditions.checkArgument(i > 0 && i % 262144 == 0, "chunkSize must be a positive multiple of 262144.");
        this.chunkSize = i;
        return this;
    }

    public MediaHttpUploader setDirectUploadEnabled(boolean z) {
        this.directUploadEnabled = z;
        return this;
    }

    public MediaHttpUploader setDisableGZipContent(boolean z) {
        this.disableGZipContent = z;
        return this;
    }

    public MediaHttpUploader setInitiationHeaders(HttpHeaders httpHeaders) {
        this.initiationHeaders = httpHeaders;
        return this;
    }

    public MediaHttpUploader setInitiationRequestMethod(String str) {
        Preconditions.checkArgument(str.equals("POST") || str.equals("PUT") || str.equals("PATCH"));
        this.initiationRequestMethod = str;
        return this;
    }

    public MediaHttpUploader setMetadata(HttpContent httpContent) {
        this.metadata = httpContent;
        return this;
    }

    public MediaHttpUploader setProgressListener(MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener) {
        this.progressListener = mediaHttpUploaderProgressListener;
        return this;
    }

    public MediaHttpUploader setSleeper(Sleeper sleeper) {
        this.sleeper = sleeper;
        return this;
    }

    public HttpResponse upload(GenericUrl genericUrl) throws IOException {
        Preconditions.checkArgument(this.uploadState == UploadState.NOT_STARTED);
        return this.directUploadEnabled ? directUpload(genericUrl) : resumableUpload(genericUrl);
    }
}
