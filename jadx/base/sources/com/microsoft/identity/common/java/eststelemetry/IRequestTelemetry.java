package com.microsoft.identity.common.java.eststelemetry;

/* JADX INFO: loaded from: classes9.dex */
interface IRequestTelemetry {
    IRequestTelemetry copySharedValues(IRequestTelemetry iRequestTelemetry);

    String getCompleteHeaderString();

    String getHeaderStringForFields();

    String getSchemaVersion();
}
