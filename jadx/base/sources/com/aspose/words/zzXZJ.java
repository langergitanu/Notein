package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZJ {
    public static void zzZ(zzXZ7 zzxz7) throws Exception {
        zzXZN zzxznZzn = zzxz7.zzn("/docProps/app.xml", "application/vnd.openxmlformats-officedocument.extended-properties+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties");
        zzxznZzn.zzZmY();
        BuiltInDocumentProperties builtInDocumentProperties = zzxz7.getDocument().getBuiltInDocumentProperties();
        zzxznZzn.zzZ("Application", "Microsoft Excel");
        zzxznZzn.zzZ("DocSecurity", builtInDocumentProperties.getSecurity());
        zzxznZzn.zzZ("ScaleCrop", TelemetryEventStrings.Value.FALSE);
        zzxznZzn.zzY("Manager", builtInDocumentProperties.getManager());
        zzxznZzn.zzZ("Company", builtInDocumentProperties.getCompany());
        zzxznZzn.zzZ("LinksUpToDate", TelemetryEventStrings.Value.FALSE);
        zzxznZzn.zzZ("SharedDoc", TelemetryEventStrings.Value.FALSE);
        zzxznZzn.zzY("HyperlinkBase", builtInDocumentProperties.getHyperlinkBase());
        zzxznZzn.zzZ("HyperlinksChanged", TelemetryEventStrings.Value.FALSE);
        zzxznZzn.zzZ("AppVersion", zzYU3.zzsU(983040));
        zzxznZzn.endDocument();
    }
}
