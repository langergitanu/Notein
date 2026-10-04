package com.microsoft.identity.common.java.eststelemetry;

import com.google.gson.annotations.SerializedName;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class LastRequestTelemetry extends RequestTelemetry {
    static final int FAILED_REQUEST_CAP = 100;

    @SerializedName("failed_requests")
    private List<FailedRequest> failedRequests;

    @SerializedName("silent_successful_count")
    private int silentSuccessfulCount;

    public LastRequestTelemetry(String str) {
        super(str);
        if (str == null) {
            throw new NullPointerException("schemaVersion is marked non-null but is null");
        }
        this.silentSuccessfulCount = 0;
        this.failedRequests = new ArrayList();
    }

    private Map.Entry<String, String> getHeaderStringForFailedRequests() {
        List<FailedRequest> list = this.failedRequests;
        if (list == null) {
            return new AbstractMap.SimpleEntry("", "");
        }
        FailedRequest[] failedRequestArr = (FailedRequest[]) list.toArray(new FailedRequest[0]);
        if (failedRequestArr == null) {
            return new AbstractMap.SimpleEntry("", "");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < failedRequestArr.length; i++) {
            FailedRequest failedRequest = failedRequestArr[i];
            sb.append(failedRequest.toApiIdCorrelationString());
            sb2.append(failedRequest.toErrorCodeString());
            if (i != failedRequestArr.length - 1) {
                sb.append(',');
                sb2.append(',');
            }
        }
        return new AbstractMap.SimpleEntry(sb.toString(), sb2.toString());
    }

    public void appendFailedRequest(String str, String str2, String str3) {
        appendFailedRequest(new FailedRequest(str, str2, str3));
    }

    @Override // com.microsoft.identity.common.java.eststelemetry.RequestTelemetry, com.microsoft.identity.common.java.eststelemetry.IRequestTelemetry
    public IRequestTelemetry copySharedValues(IRequestTelemetry iRequestTelemetry) {
        if (iRequestTelemetry == null) {
            throw new NullPointerException("requestTelemetry is marked non-null but is null");
        }
        if (iRequestTelemetry instanceof LastRequestTelemetry) {
            this.silentSuccessfulCount = ((LastRequestTelemetry) iRequestTelemetry).silentSuccessfulCount;
        }
        return super.copySharedValues(iRequestTelemetry);
    }

    public List<FailedRequest> getFailedRequests() {
        return Collections.unmodifiableList(this.failedRequests);
    }

    @Override // com.microsoft.identity.common.java.eststelemetry.IRequestTelemetry
    public String getHeaderStringForFields() {
        Map.Entry<String, String> headerStringForFailedRequests = getHeaderStringForFailedRequests();
        return this.silentSuccessfulCount + "|" + headerStringForFailedRequests.getKey() + "|" + headerStringForFailedRequests.getValue();
    }

    public void incrementSilentSuccessCount() {
        this.silentSuccessfulCount++;
    }

    public void resetSilentSuccessCount() {
        this.silentSuccessfulCount = 0;
    }

    public void wipeFailedRequestAndErrorForSubList(Collection<FailedRequest> collection) {
        if (collection != null) {
            this.failedRequests.removeAll(collection);
        }
    }

    public void appendFailedRequest(FailedRequest failedRequest) {
        if (this.failedRequests.size() >= 100) {
            this.failedRequests = this.failedRequests.subList(this.failedRequests.size() - 99, this.failedRequests.size());
        }
        this.failedRequests.add(failedRequest);
    }
}
