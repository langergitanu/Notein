package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY2 {
    private static void zzZ(DocumentProperty documentProperty, zzYU6 zzyu6) {
        int type = documentProperty.getType();
        if (type == 0) {
            zzyu6.zzY("vt:bool");
            zzyu6.writeString(documentProperty.toBool() ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
            zzyu6.zzp();
            return;
        }
        if (type == 1) {
            zzyu6.zzY("vt:filetime");
            zzyu6.writeString(com.aspose.words.internal.zzJB.zzR(documentProperty.zzZoj()));
            zzyu6.zzp();
            return;
        }
        if (type == 2) {
            zzyu6.zzY("vt:r8");
            zzyu6.writeString(com.aspose.words.internal.zzJB.zzZZ(documentProperty.toDouble()));
            zzyu6.zzp();
        } else if (type == 3) {
            zzyu6.zzY("vt:i4");
            zzyu6.writeString(com.aspose.words.internal.zzJB.zzWF(documentProperty.toInt()));
            zzyu6.zzp();
        } else {
            if (type != 4) {
                throw new IllegalStateException("Unexpected property type.");
            }
            zzyu6.zzY("vt:lpwstr");
            zzyu6.zzV((String) documentProperty.getValue());
            zzyu6.zzp();
        }
    }

    public static void zzZ(zzZW2 zzzw2) throws Exception {
        Document document = zzzw2.zzZqS().zzYfy;
        if (zzYVC.zzZ(document.getCustomDocumentProperties())) {
            zzZYD zzzydZzH = zzzw2.zzH("/docProps/custom.xml", "application/vnd.openxmlformats-officedocument.custom-properties+xml", zzzw2.zzZmp().zzZkV());
            zzzydZzH.zzZmX();
            int i = 2;
            for (DocumentProperty documentProperty : document.getCustomDocumentProperties()) {
                if (zzYVC.zzZ(documentProperty)) {
                    zzzydZzH.zzY("property");
                    zzzydZzH.zzX("fmtid", "{D5CDD505-2E9C-101B-9397-08002B2CF9AE}");
                    zzzydZzH.zzX("pid", com.aspose.words.internal.zzJB.zzWF(i));
                    zzzydZzH.zzX("name", documentProperty.getName());
                    zzzydZzH.zz0("linkTarget", documentProperty.zzZok());
                    zzZ(documentProperty, zzzydZzH);
                    zzzydZzH.zzp();
                    i++;
                }
            }
            zzzydZzH.endDocument();
        }
    }
}
