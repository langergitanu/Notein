package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZS3 {
    private static void zzX(zzP zzp, String str) {
        zzp.zzY("psf:ScoredProperty");
        zzp.zzX("name", str);
    }

    private static void zzY(zzP zzp) {
        zzp.zzZ("psf:PrintTicket");
        zzp.zzX("version", "1");
        zzp.zzX("xmlns:psf", "http://schemas.microsoft.com/windows/2003/08/printing/printschemaframework");
        zzp.zzX("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        zzp.zzX("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
        zzp.zzX("xmlns:ns0000", "http://schemas.microsoft.com/windows/2006/06/printing/printschemakeywords/microsoftxpsdocumentwriter");
        zzp.zzX("xmlns:psk", "http://schemas.microsoft.com/windows/2003/08/printing/printschemakeywords");
    }

    public static void zzZ(zzP zzp, long j, boolean z) {
        zzY(zzp);
        zzZ(zzp, j);
        zzZ(zzp, z);
        zzp.endDocument();
    }

    public static void zzZ(zzP zzp) {
        zzY(zzp);
        zzp.endDocument();
    }

    private static void zzZ(zzP zzp, boolean z) {
        zzZ(zzp, z ? "psk:PageInputBin" : "psk:JobInputBin");
        zzY(zzp, "psk:AutoSelect");
        zzp.zzp();
        zzp.zzp();
    }

    private static void zzY(zzP zzp, String str) {
        zzp.zzY("psf:Option");
        zzp.zzX("name", str);
    }

    private static void zzZ(zzP zzp, String str) {
        zzp.zzY("psf:Feature");
        zzp.zzX("name", str);
    }

    private static void zzZ(zzP zzp, String str, String str2) {
        zzp.zzY("psf:Value");
        zzp.zzX("xsi:type", str);
        zzp.writeString(str2);
        zzp.zzp();
    }

    private static void zzZ(zzP zzp, long j) {
        float fIntBitsToFloat;
        int i = (int) j;
        boolean z = Float.intBitsToFloat(i) > zzZPW.zzYz(j);
        if (z) {
            fIntBitsToFloat = zzZPW.zzYz(j);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat(i);
        }
        int iZzy = zzSA.zzy(fIntBitsToFloat);
        int iZzy2 = zzSA.zzy(z ? Float.intBitsToFloat(i) : zzZPW.zzYz(j));
        zzZ(zzp, "psk:PageMediaSize");
        zzY(zzp, zzZS4.zzS(j, z));
        zzX(zzp, "psk:MediaSizeWidth");
        zzZ(zzp, "xsd:integer", Integer.toString(iZzy));
        zzp.zzp();
        zzX(zzp, "psk:MediaSizeHeight");
        zzZ(zzp, "xsd:integer", Integer.toString(iZzy2));
        zzp.zzp();
        zzp.zzp();
        zzp.zzp();
        zzZ(zzp, "psk:PageOrientation");
        zzY(zzp, z ? "psk:Landscape" : "psk:Portrait");
        zzp.zzp();
        zzp.zzp();
    }
}
