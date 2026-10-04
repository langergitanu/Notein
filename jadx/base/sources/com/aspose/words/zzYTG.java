package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTG extends zzYU6 {
    public zzYTG(zzYQO zzyqo, boolean z) throws Exception {
        super(zzyqo.zzYvo(), new com.aspose.words.internal.zzZNI(false), z, false);
    }

    private void zzT(zzYOR zzyor) {
        zzX("office:version", zzyor.zzYsI().isStrictSchema11() ? "1.1" : "1.2");
        zzX("xmlns:office", "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
        zzX("xmlns:xlink", "http://www.w3.org/1999/xlink");
        zzX("xmlns:ooo", "http://openoffice.org/2004/office");
    }

    private void zzU(zzYOR zzyor) {
        zzT(zzyor);
        zzX("xmlns:dc", "http://purl.org/dc/elements/1.1/");
        zzX("xmlns:meta", "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
    }

    private void zzV(zzYOR zzyor) {
        zzU(zzyor);
        zzX("xmlns:style", "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
        zzX("xmlns:text", "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
        zzX("xmlns:table", "urn:oasis:names:tc:opendocument:xmlns:table:1.0");
        zzX("xmlns:draw", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
        zzX("xmlns:fo", "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0");
        zzX("xmlns:number", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
        zzX("xmlns:svg", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
        zzX("xmlns:chart", "urn:oasis:names:tc:opendocument:xmlns:chart:1.0");
        zzX("xmlns:dr3d", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0");
        zzX("xmlns:math", "http://www.w3.org/1998/Math/MathML");
        zzX("xmlns:form", "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
        zzX("xmlns:script", "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
        zzX("xmlns:ooow", "http://openoffice.org/2004/writer");
        zzX("xmlns:oooc", "http://openoffice.org/2004/calc");
        zzX("xmlns:dom", "http://www.w3.org/2001/xml-events");
        if (zzyor.zzYsH()) {
            zzX("xmlns:loext", "urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0");
        }
    }

    public final void zzGA(String str) {
        zzX(com.aspose.words.internal.zzZKN.format("</{0}>", str));
    }

    public final void zzGB(String str) {
        zzX(com.aspose.words.internal.zzZKN.format("<{0} ", str));
    }

    public final void zzGz(String str) {
        String strZzDq = zzYOU.zzDq(str);
        String strZzDr = zzYOU.zzDr(str);
        zz0("style:name", strZzDq);
        if (com.aspose.words.internal.zzZKN.equals(strZzDr, strZzDq)) {
            return;
        }
        zz0("style:display-name", strZzDr);
    }

    public final void zzW(zzYOR zzyor) {
        zzZ("office:document-settings");
        zzT(zzyor);
        zzX("xmlns:config", "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
    }

    public final void zzX(zzYOR zzyor) {
        zzZ("office:document-meta");
        zzU(zzyor);
    }

    public final void zzY(zzYOR zzyor) {
        zzZ("office:document-styles");
        zzV(zzyor);
    }

    public final void zzYs(String str, String str2) {
        zzYu(str, str2);
        zzX("/>");
    }

    public final void zzYt(String str, String str2) {
        zzYu(str, str2);
        zzX(">");
    }

    public final void zzYu(String str, String str2) {
        if (str2 != null) {
            writeString(com.aspose.words.internal.zzZKN.format("{0}=\"{1}\" ", str, str2.replace("\"", "")));
        }
    }

    public final void zzYxZ() {
        zzZ("manifest:manifest");
        zzX("xmlns:manifest", "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
    }

    public final void zzZ(zzYOR zzyor) {
        zzZ("office:document-content");
        zzV(zzyor);
    }
}
