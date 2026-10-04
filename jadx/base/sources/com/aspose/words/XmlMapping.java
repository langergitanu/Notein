package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class XmlMapping implements Cloneable {
    private static com.aspose.words.internal.zzZYF zzWSb;
    private CustomXmlPart zzWSc;
    private String zzWSd;
    private String zzWSg;
    private StructuredDocumentTag zzYHQ;
    private String zzWSf = "";
    private String zzWSe = "";

    static {
        com.aspose.words.internal.zzZYF zzzyf = new com.aspose.words.internal.zzZYF((char) 0);
        zzWSb = zzzyf;
        zzzyf.add(NoteMeta.PROPERTY_TITLE, "Title");
        zzWSb.add("subject", "Subject");
        zzWSb.add("creator", "Author");
        zzWSb.add("keywords", "Keywords");
        zzWSb.add("description", "Comments");
        zzWSb.add("category", "Category");
        zzWSb.add("contentStatus", "ContentStatus");
    }

    public XmlMapping(StructuredDocumentTag structuredDocumentTag) {
        this.zzYHQ = structuredDocumentTag;
    }

    private void zz9(ArrayList<String> arrayList) throws Exception {
        if (isEmpty()) {
            throw new IllegalStateException("XML mapping is not defined.");
        }
        Document documentZzYBb = this.zzYHQ.zzYBb();
        if (zzXQE() || zzXQD()) {
            String propertyName = getPropertyName();
            if (!com.aspose.words.internal.zzZYD.zzXk(propertyName)) {
                throw new IllegalStateException("Cannot find document property.");
            }
            documentZzYBb.getBuiltInDocumentProperties().get(propertyName).setValue(arrayList.get(0));
            return;
        }
        CustomXmlPart byId = documentZzYBb.getCustomXmlParts().getById(getStoreItemId());
        if (byId == null) {
            throw new IllegalStateException("Custom XML part is not found.");
        }
        ArrayList<org.w3c.dom.Node> arrayListZzZ = zzKM.zzZ(byId.getData(), getXPath(), getPrefixMappings(), getStoreItemId(), null);
        if (arrayListZzZ.size() != arrayList.size()) {
            throw new IllegalStateException("Incorrect XML nodes count.");
        }
        if (zzKM.zzl(arrayListZzZ)) {
            for (int i = 0; i < arrayListZzZ.size(); i++) {
                arrayListZzZ.get(i).setTextContent(arrayList.get(i));
            }
        } else {
            arrayListZzZ.get(0).setTextContent(arrayList.get(0));
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZSN.zzZ(arrayListZzZ.get(0).getOwnerDocument(), (com.aspose.words.internal.zzZOP) zzzor);
        byId.setData(zzzor.zzWy());
    }

    private static boolean zzI(org.w3c.dom.Node node) {
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (com.aspose.words.internal.zzZSN.zzZ(childNodes.item(i), 1)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] zzU(BuiltInDocumentProperties builtInDocumentProperties) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zz7B.zzZ(new com.aspose.words.internal.zzP(zzzor, true), builtInDocumentProperties.getTitle(), builtInDocumentProperties.getSubject(), builtInDocumentProperties.getAuthor(), builtInDocumentProperties.getKeywords(), builtInDocumentProperties.getComments(), builtInDocumentProperties.getLastSavedBy(), Integer.toString(builtInDocumentProperties.getRevisionNumber()), builtInDocumentProperties.zz7g(), builtInDocumentProperties.zz7h(), builtInDocumentProperties.zz7f(), builtInDocumentProperties.getCategory(), builtInDocumentProperties.getContentStatus(), "", "");
        return zzzor.zzWy();
    }

    private static boolean zzV(StructuredDocumentTag structuredDocumentTag, String str) throws Exception {
        boolean z = "1".equals(str) || TelemetryEventStrings.Value.TRUE.equals(str);
        if (structuredDocumentTag.getChecked() != z) {
            structuredDocumentTag.setChecked(z);
        }
        return true;
    }

    private static boolean zzW(StructuredDocumentTag structuredDocumentTag, String str) throws Exception {
        byte[] bArrZzX5 = com.aspose.words.internal.zzZYD.zzX5(str);
        if (com.aspose.words.internal.zzEF.zzZU(bArrZzX5) == 0) {
            return false;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArrZzX5);
        Shape shape = (Shape) structuredDocumentTag.getChild(18, 0, true);
        if (shape == null) {
            return false;
        }
        shape.getImageData().zzZ1(zzzor);
        zzZc(shape);
        return true;
    }

    private static boolean zzX(StructuredDocumentTag structuredDocumentTag, String str) {
        if ((structuredDocumentTag.getSdtType() == 12 || structuredDocumentTag.getSdtType() == 11) && com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getText())) {
            return com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.zzYln(), str);
        }
        return false;
    }

    private boolean zzXQD() {
        return "{6668398D-A668-4E3E-A5EB-62B293D839F1}".equals(getStoreItemId());
    }

    private static boolean zzY(StructuredDocumentTag structuredDocumentTag, zzXYV zzxyv) throws Exception {
        if (!structuredDocumentTag.zzY3W() || structuredDocumentTag.getXmlMapping().isEmpty()) {
            return true;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getXmlMapping().getXPath())) {
            return false;
        }
        if (structuredDocumentTag.getParentNode().getNodeType() == 28) {
            StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) structuredDocumentTag.getParentNode();
            if (com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.getXmlMapping().getXPath(), structuredDocumentTag2.getXmlMapping().getXPath()) && com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.getXmlMapping().getPrefixMappings(), structuredDocumentTag2.getXmlMapping().getPrefixMappings())) {
                return true;
            }
        }
        if (!structuredDocumentTag.zzY3X()) {
            return false;
        }
        if (structuredDocumentTag.zzY3P()) {
            return zzYD2.zzp(structuredDocumentTag);
        }
        ArrayList<org.w3c.dom.Node> arrayListZzY = structuredDocumentTag.getXmlMapping().zzY(zzxyv);
        if (arrayListZzY.size() > 0) {
            String strZzm = zzKM.zzm(arrayListZzY);
            if (zzX(structuredDocumentTag, strZzm)) {
                return false;
            }
            if (!com.aspose.words.internal.zzZYD.zzXk(strZzm)) {
                if (!structuredDocumentTag.isShowingPlaceholderText()) {
                    zzYDI.zzZ(structuredDocumentTag, true);
                }
                return true;
            }
            int sdtType = structuredDocumentTag.getSdtType();
            if (sdtType != 4 && sdtType != 5) {
                if (sdtType == 6) {
                    String strZzZ = zzYDI.zzZ(structuredDocumentTag, strZzm);
                    if (!com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.zzYln(), strZzZ)) {
                        zzYDI.zzY(structuredDocumentTag, strZzZ);
                    }
                    return true;
                }
                switch (sdtType) {
                    case 12:
                        if (!zzI(arrayListZzY.get(0))) {
                            break;
                        }
                        break;
                }
                return true;
            }
            SdtListItemCollection listItems = ((zzYDB) structuredDocumentTag.zzY3H()).getListItems();
            int iZzBj = listItems.zzBj(strZzm);
            if (iZzBj >= 0) {
                zzYDI.zzY(structuredDocumentTag, listItems.get(iZzBj).getDisplayText());
                listItems.setSelectedValue(listItems.get(iZzBj));
                listItems.zzBi(null);
                return true;
            }
            if (!com.aspose.words.internal.zzZKN.equals(listItems.zzYcL(), strZzm) || structuredDocumentTag.getChildNodes(0, false).getCount() <= 0) {
                zzYDI.zzY(structuredDocumentTag, strZzm);
            }
            return true;
        }
        if (structuredDocumentTag.getXmlMapping().zzXQE()) {
            zzYDI.zzF(structuredDocumentTag);
            return true;
        }
        return false;
    }

    private static boolean zzZH(Document document) {
        if (document.getSections().getCount() > 1) {
            return true;
        }
        Body body = document.getFirstSection().getBody();
        Node nodeZzZYr = body.zzZYr();
        Node nodeZzZYq = body.zzZYq();
        if (zzYDI.zzYo((Paragraph) com.aspose.words.internal.zzZKW.zzZ(nodeZzZYq, Paragraph.class))) {
            nodeZzZYq = nodeZzZYq.zzYB9();
        }
        return (nodeZzZYq == null || nodeZzZYr == nodeZzZYq || (nodeZzZYr.zzYB4() == nodeZzZYq && nodeZzZYq.getNodeType() == 8 && !((Paragraph) nodeZzZYq).hasChildNodes())) ? false : true;
    }

    private static void zzZc(Shape shape) throws Exception {
        double width = shape.getWidth();
        double height = shape.getHeight();
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(shape.getImageData().getImageBytes());
        shape.zzWf(zzegZzZT.getWidthPoints());
        shape.zzWe(zzegZzZT.getHeightPoints());
        boolean aspectRatioLocked = shape.getAspectRatioLocked();
        shape.setAspectRatioLocked(true);
        if (com.aspose.words.internal.zzAN.zzL(width, height)) {
            if (zzegZzZT.zzDQ() < zzegZzZT.zzDP()) {
                shape.setHeight(height);
            } else {
                shape.setWidth(width);
            }
        } else if (width > height) {
            shape.setHeight(height);
        } else {
            shape.setWidth(width);
        }
        shape.setAspectRatioLocked(aspectRatioLocked);
    }

    private CustomXmlPart zzyi(String str) {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzYHQ.getDocument(), Document.class);
        if (document != null) {
            return document.getCustomXmlParts().getById(str);
        }
        return null;
    }

    public void delete() {
        this.zzWSe = "";
        this.zzWSf = "";
        this.zzWSd = "";
        this.zzWSc = null;
    }

    public CustomXmlPart getCustomXmlPart() {
        if (this.zzWSc == null && com.aspose.words.internal.zzZYD.zzXk(this.zzWSd)) {
            CustomXmlPart customXmlPartZzyi = zzyi(this.zzWSd);
            this.zzWSc = customXmlPartZzyi;
            if (customXmlPartZzyi != null) {
                this.zzWSd = null;
            }
        }
        return this.zzWSc;
    }

    public String getPrefixMappings() {
        return this.zzWSe;
    }

    public final String getPropertyName() {
        if ((!zzXQE() && !zzXQD()) || this.zzWSf == null || ((zzXQE() && com.aspose.words.internal.zzZKN.zzT(this.zzWSf, "COREPROPERTIES", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) == -1) || (zzXQD() && com.aspose.words.internal.zzZKN.zzT(this.zzWSf, "PROPERTIES", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) == -1))) {
            return null;
        }
        int iLastIndexOf = this.zzWSf.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            iLastIndexOf = this.zzWSf.lastIndexOf(92);
        }
        if (iLastIndexOf < 0) {
            return null;
        }
        int iLastIndexOf2 = this.zzWSf.lastIndexOf(91);
        if (iLastIndexOf2 < 0 || iLastIndexOf2 < iLastIndexOf) {
            iLastIndexOf2 = this.zzWSf.length();
        }
        int i = iLastIndexOf + 1;
        String strSubstring = this.zzWSf.substring(i, ((iLastIndexOf2 - iLastIndexOf) - 1) + i);
        int iIndexOf = strSubstring.indexOf(58);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(iIndexOf + 1);
        }
        if (!zzXQE()) {
            return strSubstring;
        }
        if (zzWSb.containsKey(strSubstring)) {
            return zzWSb.get(strSubstring);
        }
        return null;
    }

    public String getStoreItemId() {
        CustomXmlPart customXmlPart = this.zzWSc;
        return customXmlPart != null ? customXmlPart.getId() : com.aspose.words.internal.zzZYD.zzXk(this.zzWSd) ? this.zzWSd : "";
    }

    public final String getValue() throws Exception {
        if (!isEmpty()) {
            ArrayList<org.w3c.dom.Node> arrayListZzY = zzY(null);
            if (arrayListZzY.size() > 0) {
                return arrayListZzY.get(0).getTextContent();
            }
        }
        return null;
    }

    public String getXPath() {
        return this.zzWSf;
    }

    public final boolean isEmpty() {
        return (com.aspose.words.internal.zzZYD.zzXk(this.zzWSf) || com.aspose.words.internal.zzZYD.zzXk(this.zzWSe) || com.aspose.words.internal.zzZYD.zzXk(this.zzWSd) || this.zzWSc != null) ? false : true;
    }

    public boolean isMapped() throws Exception {
        return com.aspose.words.internal.zzZYD.zzXk(getXPath()) && zzXQH() > 0;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public boolean setMapping(CustomXmlPart customXmlPart, String str, String str2) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "xPath");
        com.aspose.words.internal.zzZ4.zzY((Object) customXmlPart, "customXmlPart");
        if (this.zzYHQ.getSdtType() == 7 || this.zzYHQ.getSdtType() == 8 || this.zzYHQ.getSdtType() == 2) {
            throw new IllegalStateException("Cannot map a structured document tag of this type to XML data.");
        }
        zzm("", str, str2);
        this.zzWSc = customXmlPart;
        return isMapped();
    }

    public final void setValue(String str) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, str);
        zz9(arrayList);
    }

    public final void setXPath(String str) {
        this.zzWSf = str;
    }

    public final boolean zzXQE() {
        return "{6C3C8BC8-F283-45AE-878A-BAB7291924A1}".equals(getStoreItemId());
    }

    public final String zzXQF() {
        return this.zzWSg;
    }

    public final boolean zzXQG() {
        if (isEmpty()) {
            return false;
        }
        return this.zzYHQ.getSdtType() == 11 || this.zzYHQ.getSdtType() == 7 || this.zzYHQ.getSdtType() == 8 || this.zzYHQ.getSdtType() == 2 || this.zzYHQ.getSdtType() == 13 || this.zzYHQ.zzY3P() || this.zzYHQ.zzY3O();
    }

    public final int zzXQH() throws Exception {
        return zzY(null).size();
    }

    public final boolean zzXQI() throws Exception {
        return zzZ(new zzXYV());
    }

    public final void zzXQJ() {
        this.zzWSc = zzyi(getStoreItemId());
    }

    public final boolean zzZ(zzXYV zzxyv) throws Exception {
        zzY82 zzy82 = new zzY82(this.zzYHQ.getDocument());
        try {
            return zzY(this.zzYHQ, zzxyv);
        } finally {
            zzy82.dispose();
        }
    }

    public final XmlMapping zzl(StructuredDocumentTag structuredDocumentTag) {
        XmlMapping xmlMapping = (XmlMapping) memberwiseClone();
        xmlMapping.zzYHQ = structuredDocumentTag;
        CustomXmlPart customXmlPart = this.zzWSc;
        if (customXmlPart != null) {
            this.zzWSd = customXmlPart.getId();
            this.zzWSc = null;
        }
        return xmlMapping;
    }

    public final void zzm(String str, String str2, String str3) {
        this.zzWSe = str3;
        this.zzWSf = str2;
        CustomXmlPart customXmlPartZzyi = com.aspose.words.internal.zzZYD.zzXk(str) ? zzyi(str) : null;
        this.zzWSc = customXmlPartZzyi;
        if (customXmlPartZzyi != null) {
            str = "";
        }
        this.zzWSd = str;
    }

    public final void zzyg(String str) {
        this.zzWSg = str;
    }

    public final void zzyh(String str) {
        CustomXmlPart customXmlPartZzyi = zzyi(str);
        this.zzWSc = customXmlPartZzyi;
        if (customXmlPartZzyi != null) {
            str = "";
        }
        this.zzWSd = str;
    }

    private static byte[] zzV(BuiltInDocumentProperties builtInDocumentProperties) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, true);
        zzp.zzZ("Properties");
        zzp.zzX("xmlns", "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties");
        zzp.zzX("xmlns:vt", "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
        zzp.zzY("Manager", builtInDocumentProperties.getManager());
        zzp.zzZ("Company", builtInDocumentProperties.getCompany());
        zzp.endDocument();
        return zzzor.zzWy();
    }

    private static boolean zzZ(StructuredDocumentTag structuredDocumentTag, String str, zzXYV zzxyv) throws Exception {
        boolean zZzY;
        if (structuredDocumentTag.getSdtType() != 12) {
            structuredDocumentTag.getSdtType();
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzhV().getBytes(str));
        int loadFormat = (!com.aspose.words.internal.zzZYD.zzXh(str) && str.contains("<pkg:package")) ? FileFormatUtil.zzZb(zzzor).getLoadFormat() : 62;
        if (loadFormat == 62 || (loadFormat == 255 && structuredDocumentTag.getSdtType() == 12)) {
            if (structuredDocumentTag.getSdtType() != 11 && !structuredDocumentTag.getMultiline()) {
                str = str.replace(ControlChar.CR_LF, "").replace(ControlChar.PARAGRAPH_BREAK, "");
            }
            zzYDI.zzY(structuredDocumentTag, str.replace("_x000d_", "").replace("_x000D_", ""));
            zZzY = true;
        } else {
            if (loadFormat == 255) {
                return false;
            }
            if (structuredDocumentTag.getParentNode().getNodeType() == 28 && !((StructuredDocumentTag) structuredDocumentTag.getParentNode()).getXmlMapping().isEmpty()) {
                return true;
            }
            zZzY = zzY(structuredDocumentTag, new Document(zzzor, null, false));
            Iterator<T> it = structuredDocumentTag.getChildNodes(28, true).iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zzxyv.zzXQC(), (StructuredDocumentTag) it.next());
            }
        }
        if (!structuredDocumentTag.isRemoved() && !structuredDocumentTag.hasChildNodes()) {
            zzYDI.zzZ(structuredDocumentTag, true);
            return zZzY;
        }
        structuredDocumentTag.isShowingPlaceholderText(false);
        return zZzY;
    }

    public final boolean zzX(zzXYV zzxyv) {
        if (isEmpty()) {
            return false;
        }
        return (com.aspose.words.internal.zzZYD.zzXk(this.zzWSg) && com.aspose.words.internal.zzZKN.equals(zzxyv.zzZ(this), this.zzWSg)) ? false : true;
    }

    private static boolean zzY(StructuredDocumentTag structuredDocumentTag, Document document) {
        if (structuredDocumentTag.getLevel() != 1 || structuredDocumentTag.getParentNode().getNodeType() != 8 || !zzZH(document)) {
            return zzYDI.zzZ(structuredDocumentTag, (Node) document, true) != null;
        }
        Paragraph lastParagraph = document.getLastSection().getBody().getLastParagraph();
        if (zzYDI.zzYo(lastParagraph)) {
            lastParagraph.remove();
        }
        zzYDI.zzZ(structuredDocumentTag, (Node) document, true);
        return true;
    }

    public final ArrayList<org.w3c.dom.Node> zzY(zzXYV zzxyv) throws Exception {
        String prefixMappings;
        Document documentZzYBb = this.zzYHQ.zzYBb();
        ArrayList<org.w3c.dom.Node> arrayList = new ArrayList<>();
        if (zzXQE()) {
            byte[] bArrZzU = zzU(documentZzYBb.getBuiltInDocumentProperties());
            if (com.aspose.words.internal.zzZYD.zzXk(getPrefixMappings())) {
                prefixMappings = getPrefixMappings();
            } else {
                prefixMappings = "xmlns:ns0='http://purl.org/dc/elements/1.1/' xmlns:ns1='http://schemas.openxmlformats.org/package/2006/metadata/core-properties'";
            }
            return zzKM.zzZ(bArrZzU, getXPath(), prefixMappings, getStoreItemId(), zzxyv);
        }
        if (zzXQD()) {
            return zzKM.zzZ(zzV(documentZzYBb.getBuiltInDocumentProperties()), getXPath(), getPrefixMappings(), getStoreItemId(), zzxyv);
        }
        CustomXmlPart byId = documentZzYBb.getCustomXmlParts().getById(getStoreItemId());
        if (byId == null) {
            if (zzxyv != null && zzxyv.zzXQC().contains(this.zzYHQ)) {
                return arrayList;
            }
            Iterator<CustomXmlPart> it = documentZzYBb.getCustomXmlParts().iterator();
            while (it.hasNext()) {
                arrayList = zzKM.zzZ(it.next().getData(), getXPath(), getPrefixMappings(), getStoreItemId(), null);
                if (arrayList.size() > 0) {
                    break;
                }
            }
            return arrayList;
        }
        return zzKM.zzZ(byId.getData(), getXPath(), getPrefixMappings(), getStoreItemId(), zzxyv);
    }
}
