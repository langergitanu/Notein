package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXL extends zzYV9 {
    private zzZWP zzYOG;
    private zzZXR zzYPg;

    public zzZXL(zzZXR zzzxr, zzZWP zzzwp) {
        this.zzYPg = zzzxr;
        this.zzYOG = zzzwp;
    }

    private void zzX(FieldChar fieldChar) {
        byte[] fieldData;
        if (fieldChar.getNodeType() == 22 && (fieldData = ((FieldStart) fieldChar).getFieldData()) != null) {
            if (this.zzYPg.getCompliance() == 2) {
                this.zzYPg.zzT(1, com.aspose.words.internal.zzZKN.format("The element '{0}' is not supported by Strict Open XML Document format, discarded.", "fldData"));
                return;
            }
            this.zzYPg.zzZlV().zzY("w:fldData");
            this.zzYPg.zzZlV().zzX("xml:space", "preserve");
            this.zzYPg.zzZlV().zzZ(fieldData, fieldData.length);
            this.zzYPg.zzZlV().zzp();
        }
    }

    private void zzY(FieldChar fieldChar) {
        FormField formFieldZzZcg;
        if (fieldChar.getNodeType() == 22 && zzZOO.zzCJ(fieldChar.getFieldType()) && (formFieldZzZcg = ((FieldStart) fieldChar).zzZcg()) != null && formFieldZzZcg.getField() != null) {
            this.zzYPg.zzZlV().zzY("w:ffData");
            this.zzYPg.zzZlV().zzYy("w:name", formFieldZzZcg.getName());
            this.zzYPg.zzZlV().zzy("w:enabled", formFieldZzZcg.getEnabled());
            this.zzYPg.zzZlV().zzy("w:calcOnExit", formFieldZzZcg.getCalculateOnExit());
            this.zzYPg.zzZlV().zzYz("w:entryMacro", formFieldZzZcg.getEntryMacro());
            this.zzYPg.zzZlV().zzYz("w:exitMacro", formFieldZzZcg.getExitMacro());
            zzZ("w:helpText", !formFieldZzZcg.getOwnHelp(), formFieldZzZcg.getHelpText());
            zzZ("w:statusText", !formFieldZzZcg.getOwnStatus(), formFieldZzZcg.getStatusText());
            int fieldType = fieldChar.getFieldType();
            if (fieldType == 70) {
                zzZ(formFieldZzZcg.zzZ6O());
            } else if (fieldType == 71) {
                zzY(formFieldZzZcg.zzZ6O());
            } else {
                if (fieldType != 83) {
                    throw new IllegalStateException("Unknown form field type.");
                }
                zzX(formFieldZzZcg.zzZ6O());
            }
            this.zzYPg.zzZlV().zzo();
        }
    }

    public final Shape zzH(Shape shape) {
        Shape shape2 = (Shape) shape.deepClone(true);
        zzZQX zzzqxZzM7 = zzZQX.zzM7(zzYyO().getField().getFieldCode());
        shape2.setShapeAttr(898, com.aspose.words.internal.zzZVR.zz5(zzzqxZzM7.getAddress(), zzzqxZzM7.getSubAddress()));
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqxZzM7.getTarget())) {
            shape2.setShapeAttr(4120, zzzqxZzM7.getTarget());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqxZzM7.getScreenTip())) {
            shape2.setShapeAttr(909, zzzqxZzM7.getScreenTip());
        }
        return shape2;
    }

    @Override // com.aspose.words.zzYV9
    public final void zzZ(FieldChar fieldChar, String str) throws Exception {
        this.zzYOG.zzZ(fieldChar.zzZYh(), fieldChar, !zzZOO.zzCK(fieldChar.getFieldType()));
        this.zzYPg.zzZlV().zzW("w:fldChar", "w:fldCharType", str);
        if (fieldChar.getNodeType() == 22) {
            this.zzYPg.zzZlV().zzw("w:dirty", fieldChar.isDirty());
            this.zzYPg.zzZlV().zzw("w:fldLock", fieldChar.isLocked());
        }
        zzY(fieldChar);
        zzX(fieldChar);
        this.zzYPg.zzZlV().zzo();
        this.zzYOG.zzT(fieldChar.zzZYh());
    }

    @Override // com.aspose.words.zzYV9
    public final void zzZlN() {
        this.zzYPg.zzZm2().zzo();
    }

    public final boolean zzg(Node node) {
        FieldChar fieldCharZzYyO = zzYyO();
        if (fieldCharZzYyO.getFieldType() != 88) {
            return false;
        }
        return node.getNextSibling() == fieldCharZzYyO.getField().getEnd();
    }

    private void zzX(zzZMM zzzmm) {
        this.zzYPg.zzZlV().zzY("w:ddList");
        if (zzzmm.zzZ6F() != 0) {
            this.zzYPg.zzZlV().zzZl("w:default", zzzmm.zzZ6F());
        }
        if (zzzmm.contains(21070)) {
            this.zzYPg.zzZlV().zzZl("w:result", zzzmm.zzZ6E());
        }
        for (String str : zzzmm.getDropDownItems()) {
            if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
                this.zzYPg.zzT(65536, "Empty value is not allowed inside DropDown ListEntry, and will be ignored");
            }
            this.zzYPg.zzZlV().zzYz("w:listEntry", str);
        }
        this.zzYPg.zzZlV().zzo();
    }

    @Override // com.aspose.words.zzYV9
    public final boolean zzZ(FieldChar fieldChar) {
        boolean zZzZ = super.zzZ(fieldChar);
        if (((Document) com.aspose.words.internal.zzZKW.zzZ(fieldChar.getDocument(), Document.class)) == null || !zZzZ) {
            return zZzZ;
        }
        Node previousSibling = fieldChar.getField().getStart().getParentParagraph().getPreviousSibling();
        return previousSibling == null || !zzYVU.zzXT(previousSibling);
    }

    private void zzZ(String str, boolean z, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzYPg.zzZlV().zzY(str);
            this.zzYPg.zzZlV().zzX("w:type", z ? "autoText" : "text");
            this.zzYPg.zzZlV().zzX("w:val", str2);
            this.zzYPg.zzZlV().zzo();
        }
    }

    private void zzY(zzZMM zzzmm) {
        this.zzYPg.zzZlV().zzY("w:checkBox");
        if (zzzmm.zzZ6J()) {
            this.zzYPg.zzZlV().zzZ("w:sizeAuto", (String) null);
        } else {
            this.zzYPg.zzZlV().zzYz("w:size", com.aspose.words.internal.zzJB.zzWF(zzzmm.zzZ6I()));
        }
        this.zzYPg.zzZlV().zzz("w:default", zzzmm.zzZ6H());
        if (zzzmm.contains(21010)) {
            this.zzYPg.zzZlV().zzz("w:checked", zzzmm.zzZ6G());
        }
        this.zzYPg.zzZlV().zzo();
    }

    @Override // com.aspose.words.zzYV9
    public final void zzZ(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.zzYPg.zzZlV().zzY("w:hyperlink");
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzYPg.zzZlV().zz0("r:id", this.zzYPg.zzNF(str));
        }
        this.zzYPg.zzZlV().zz0("w:anchor", str2);
        this.zzYPg.zzZlV().zz0("w:tgtFrame", str3);
        this.zzYPg.zzZlV().zz0("w:tooltip", str4);
        this.zzYPg.zzZlV().zz0("w:docLocation", str5);
        this.zzYPg.zzZlV().zzw("w:history", z);
    }

    private void zzZ(zzZMM zzzmm) {
        this.zzYPg.zzZlV().zzY("w:textInput");
        this.zzYPg.zzZlV().zzYz("w:type", zzZXP.zzFb(zzzmm.getTextInputType()));
        this.zzYPg.zzZlV().zzYz("w:default", zzzmm.getTextInputDefault());
        int iZzZ6K = zzzmm.zzZ6K();
        if (iZzZ6K > 32767) {
            iZzZ6K = 32767;
        }
        this.zzYPg.zzZlV().zzZk("w:maxLength", iZzZ6K);
        this.zzYPg.zzZlV().zzYz("w:format", zzzmm.getTextInputFormat());
        this.zzYPg.zzZlV().zzo();
    }
}
