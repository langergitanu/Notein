package com.aspose.words;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class SignatureLine {
    private int zzXek;
    private Shape zzXel;

    public SignatureLine(Shape shape) {
        this.zzXel = shape;
        if (!com.aspose.words.internal.zzZYD.zzXk((String) shape.getDirectShapeAttr(1921))) {
            this.zzXel.setShapeAttr(1921, com.aspose.words.internal.zzZOZ.zziD().toString("B").toUpperCase());
        }
        if (com.aspose.words.internal.zzZYD.zzXk((String) this.zzXel.getDirectShapeAttr(1922))) {
            return;
        }
        this.zzXel.setShapeAttr(1922, "{00000000-0000-0000-0000-000000000000}");
    }

    private void zzI(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzXel.setShapeAttr(1922, zzzoz.toString("B").toUpperCase());
    }

    private com.aspose.words.internal.zzZOZ zzY7Z() {
        return new com.aspose.words.internal.zzZOZ((String) this.zzXel.getDirectShapeAttr(1922));
    }

    private void zzY81() throws Exception {
        this.zzXek--;
        zzY83();
    }

    private void zzY82() {
        this.zzXek++;
    }

    public boolean getAllowComments() {
        return ((Boolean) this.zzXel.fetchShapeAttr(1981)).booleanValue();
    }

    public boolean getDefaultInstructions() {
        return !((Boolean) this.zzXel.fetchShapeAttr(1982)).booleanValue();
    }

    public String getEmail() {
        String str = (String) this.zzXel.getDirectShapeAttr(1925);
        return str != null ? str : "";
    }

    public UUID getId() {
        return com.aspose.words.internal.zzZOZ.zzV(zzY80());
    }

    public final byte[] getImageBytes() throws Exception {
        if (!isValid()) {
            return isSigned() ? zzYBG.zzX(this) : this.zzXel.getImageData().getImageBytes();
        }
        byte[] bArrZzZSy = zzY7Y().zzZSy();
        return bArrZzZSy == null ? zzYBG.zzY(this) : bArrZzZSy;
    }

    public String getInstructions() {
        String str = (String) this.zzXel.getDirectShapeAttr(1926);
        return str != null ? str : "";
    }

    public final Shape getParent() {
        return this.zzXel;
    }

    public UUID getProviderId() {
        return com.aspose.words.internal.zzZOZ.zzV(zzY7Z());
    }

    public boolean getShowDate() {
        return ((Boolean) this.zzXel.fetchShapeAttr(FieldType.FIELD_CITATION)).booleanValue();
    }

    public String getSigner() {
        String str = (String) this.zzXel.getDirectShapeAttr(1923);
        return str != null ? str : "";
    }

    public String getSignerTitle() {
        String str = (String) this.zzXel.getDirectShapeAttr(1924);
        return str != null ? str : "";
    }

    public boolean isSigned() {
        return zzY7Y() != null;
    }

    public boolean isValid() {
        return isSigned() && zzY7Y().isValid();
    }

    public void setAllowComments(boolean z) {
        this.zzXel.setShapeAttr(1981, Boolean.valueOf(z));
    }

    public void setDefaultInstructions(boolean z) {
        this.zzXel.setShapeAttr(1982, Boolean.valueOf(!z));
        if (z) {
            this.zzXel.removeShapeAttr(1926);
        }
    }

    public void setEmail(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzXel.setShapeAttr(1925, str);
        } else {
            this.zzXel.removeShapeAttr(1925);
        }
    }

    public void setId(UUID uuid) {
        zzJ(com.aspose.words.internal.zzZOZ.zzZ(uuid));
    }

    public void setInstructions(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzXel.setShapeAttr(1926, str);
        } else {
            this.zzXel.removeShapeAttr(1926);
        }
    }

    public void setProviderId(UUID uuid) {
        zzI(com.aspose.words.internal.zzZOZ.zzZ(uuid));
    }

    public void setShowDate(boolean z) {
        this.zzXel.setShapeAttr(FieldType.FIELD_CITATION, Boolean.valueOf(z));
    }

    public void setSigner(String str) throws Exception {
        if (com.aspose.words.internal.zzZKN.equals(getSigner(), str)) {
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzXel.setShapeAttr(1923, str);
        } else {
            this.zzXel.removeShapeAttr(1923);
        }
        zzY83();
    }

    public void setSignerTitle(String str) throws Exception {
        if (com.aspose.words.internal.zzZKN.equals(getSignerTitle(), str)) {
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzXel.setShapeAttr(1924, str);
        } else {
            this.zzXel.removeShapeAttr(1924);
        }
        zzY83();
    }

    public final void zzJ(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzXel.setShapeAttr(1921, zzzoz.toString("B").toUpperCase());
    }

    public final DigitalSignature zzY7Y() {
        Document document = (Document) this.zzXel.getDocument();
        return document.getDigitalSignatures().zzRN((String) this.zzXel.getDirectShapeAttr(1921));
    }

    public final com.aspose.words.internal.zzZOZ zzY80() {
        return new com.aspose.words.internal.zzZOZ((String) this.zzXel.getDirectShapeAttr(1921));
    }

    public final void zzY83() throws Exception {
        if (this.zzXek <= 0) {
            this.zzXel.getImageData().setImageBytes(zzYBG.zzZ(this));
        }
    }

    public final void zzZ(SignatureLineOptions signatureLineOptions) throws Exception {
        zzY82();
        try {
            setSigner(signatureLineOptions.getSigner());
            setSignerTitle(signatureLineOptions.getSignerTitle());
            setEmail(signatureLineOptions.getEmail());
            setDefaultInstructions(signatureLineOptions.getDefaultInstructions());
            setInstructions(signatureLineOptions.getInstructions());
            setAllowComments(signatureLineOptions.getAllowComments());
            setShowDate(signatureLineOptions.getShowDate());
        } finally {
            zzY81();
        }
    }
}
