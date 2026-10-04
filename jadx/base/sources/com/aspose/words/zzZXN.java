package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXN {
    public static void zzZ(zzZW2 zzzw2) throws Exception {
        zzZYD zzzydZzH = zzzw2.zzH("/docProps/app.xml", "application/vnd.openxmlformats-officedocument.extended-properties+xml", zzzw2.zzZmp().zzZkW());
        zzzydZzH.zzZmY();
        BuiltInDocumentProperties builtInDocumentProperties = zzzw2.zzZqS().zzYfy.getBuiltInDocumentProperties();
        zzzydZzH.zzY("Template", builtInDocumentProperties.getTemplate());
        zzzydZzH.zzZ("TotalTime", builtInDocumentProperties.getTotalEditingTime());
        zzzydZzH.zzZ("Pages", builtInDocumentProperties.getPages());
        zzzydZzH.zzZ("Words", builtInDocumentProperties.getWords());
        zzzydZzH.zzZ("Characters", builtInDocumentProperties.getCharacters());
        zzzydZzH.zzZ("Application", "Microsoft Office Word");
        zzzydZzH.zzZ("DocSecurity", builtInDocumentProperties.getSecurity());
        zzzydZzH.zzZ("Lines", builtInDocumentProperties.getLines());
        zzzydZzH.zzZ("Paragraphs", builtInDocumentProperties.getParagraphs());
        zzzydZzH.zzZ("ScaleCrop", TelemetryEventStrings.Value.FALSE);
        zzZ(zzzydZzH, builtInDocumentProperties.getHeadingPairs());
        zzZ(zzzydZzH, builtInDocumentProperties.getTitlesOfParts());
        zzzydZzH.zzY("Manager", builtInDocumentProperties.getManager());
        zzzydZzH.zzZ("Company", builtInDocumentProperties.getCompany());
        zzzydZzH.zzZ("LinksUpToDate", TelemetryEventStrings.Value.FALSE);
        zzzydZzH.zzZ("CharactersWithSpaces", builtInDocumentProperties.getCharactersWithSpaces());
        zzzydZzH.zzZ("SharedDoc", TelemetryEventStrings.Value.FALSE);
        zzzydZzH.zzY("HyperlinkBase", builtInDocumentProperties.getHyperlinkBase());
        zzzydZzH.zzZ("HyperlinksChanged", TelemetryEventStrings.Value.FALSE);
        zzzydZzH.zzZ("AppVersion", (builtInDocumentProperties.getVersion() >> 16) <= 12 ? "12.0000" : zzYU3.zzsU(builtInDocumentProperties.getVersion()));
        zzzydZzH.endDocument();
    }

    private static void zzZ(zzZYD zzzyd, Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        zzzyd.zzY("HeadingPairs");
        zzzyd.zzY("vt:vector");
        zzzyd.zzZj("size", objArr.length);
        zzzyd.zz0("baseType", "variant");
        for (Object obj : objArr) {
            zzzyd.zzY("vt:variant");
            if (obj instanceof String) {
                zzzyd.zzZ("vt:lpstr", (String) obj);
            } else if (obj instanceof Integer) {
                zzzyd.zzZ("vt:i4", ((Integer) obj).intValue());
            } else {
                throw new IllegalStateException("Unexpected value type in heading pairs.");
            }
            zzzyd.zzp();
        }
        zzzyd.zzp();
        zzzyd.zzp();
    }

    private static void zzZ(zzZYD zzzyd, String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        zzzyd.zzY("TitlesOfParts");
        zzzyd.zzY("vt:vector");
        zzzyd.zzZj("size", strArr.length);
        zzzyd.zz0("baseType", "lpstr");
        for (String str : strArr) {
            zzzyd.zzZ("vt:lpstr", str);
        }
        zzzyd.zzp();
        zzzyd.zzp();
    }
}
