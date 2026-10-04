package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI3 extends zzZ1I {
    private zzZAO zzYqI;
    private zzZF0 zzYrW;
    private zzZJU zzYsy;
    private HtmlSaveOptions zzYt2;

    public zzZI3(Document document, HtmlSaveOptions htmlSaveOptions, zzYE2 zzye2, zzZ1H zzz1h, zzZAO zzzao, zzZF0 zzzf0, zzZJU zzzju) {
        super(document, htmlSaveOptions.getExportTocPageNumbers(), htmlSaveOptions.getExportTextInputFormFieldAsText(), htmlSaveOptions.getExportRoundtripInformation(), zzye2, zzz1h);
        this.zzYt2 = htmlSaveOptions;
        this.zzYqI = zzzao;
        this.zzYrW = zzzf0;
        this.zzYsy = zzzju;
    }

    private zzZE7 zzZ3E() {
        return this.zzYqI.zzZ3E();
    }

    private boolean zzzI(int i) {
        if (this.zzYt2.getExportRoundtripInformation()) {
            return i == 3 || i == 9 || i == 15 || i == 17 || i == 26 || i == 33 || i == 72 || i == 12 || i == 13;
        }
        return false;
    }

    @Override // com.aspose.words.zzZ1I
    public final void zzU(FieldSeparator fieldSeparator) {
        if (zzzI(fieldSeparator.getFieldType())) {
            zzZ3E().zzZN("span", 0);
            zzLU zzlu = new zzLU();
            zzlu.zzZs("-aw-field-separator", TelemetryEventStrings.Value.TRUE);
            this.zzYqI.zzZ3C().zzV(zzlu);
            zzZ3E().endElement("span");
        }
    }

    @Override // com.aspose.words.zzZ1I
    public final int zzW(FormField formField) throws Exception {
        int type = formField.getType();
        if (type != 70) {
            if (type != 71) {
                if (type != 83) {
                    throw new IllegalStateException("Unknown form field type.");
                }
                if (this.zzYt2.zzYZc() || this.zzYt2.getExportDropDownFormFieldAsText()) {
                    String strZzZ6Q = formField.zzZ6Q();
                    if (strZzZ6Q.length() != 0) {
                        this.zzYrW.zzY(formField.getFont(), strZzZ6Q);
                    }
                } else {
                    this.zzYsy.zzZ40();
                    zzZ3E().zzZN("select", 0);
                    zzZ3E().zzX("name", formField.getName());
                    for (int i = 0; i < formField.getDropDownItems().getCount(); i++) {
                        zzZ3E().zzZN("option", 0);
                        if (i == formField.getDropDownSelectedIndex()) {
                            zzZ3E().zzX("selected", "selected");
                        }
                        zzZ3E().writeString(formField.getDropDownItems().get(i));
                        zzZ3E().endElement("option");
                    }
                    zzZ3E().endElement("select");
                }
            } else if (this.zzYt2.zzYZc()) {
                zzZ3E().zzZN("span", 0);
                zzLU zzlu = new zzLU();
                zzlu.zzJ("Wingdings");
                zzlu.zzZ("font-size", formField.getFont().getSize(), 4);
                this.zzYqI.zzZ3C().zzV(zzlu);
                zzZ3E().zzY(formField.getChecked() ? "&#xfd;" : "&#x6f;", false);
                zzZ3E().endElement("span");
            } else {
                this.zzYsy.zzZ40();
                zzZ3E().zzZN("input", 1);
                zzZ3E().zzX(C18437z2.f56754h, "checkbox");
                zzZ3E().zzX("name", formField.getName());
                if (formField.getChecked()) {
                    zzZ3E().zzX("checked", "checked");
                }
                zzZ3E().endElement("input");
            }
        } else if (zz4(formField.getField())) {
            this.zzYsy.zzZ40();
            zzZ3E().zzZN("input", 1);
            zzZ3E().zzX(C18437z2.f56754h, "text");
            zzZ3E().zzX("name", formField.getName());
            if (formField.getMaxLength() != 0) {
                zzZ3E().zzZD("maxlength", formField.getMaxLength());
            }
            zzZ3E().zzX("value", formField.getResult());
            zzZ3E().endElement("input");
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ1I
    public final void zzb(Field field) throws Exception {
        if (zzzI(field.getType())) {
            zzZ3E().zzZN("span", 0);
            zzLU zzlu = new zzLU();
            zzlu.zzZs("-aw-field-start", TelemetryEventStrings.Value.TRUE);
            this.zzYqI.zzZ3C().zzV(zzlu);
            zzZ3E().endElement("span");
            zzZ3E().zzZN("span", 0);
            zzLU zzlu2 = new zzLU();
            zzlu2.setString("-aw-field-code", field.getFieldCode());
            this.zzYqI.zzZ3C().zzV(zzlu2);
            zzZ3E().endElement("span");
        }
        super.zzb(field);
    }

    @Override // com.aspose.words.zzZ1I
    public final void zzU(FieldEnd fieldEnd) throws Exception {
        if (zzzI(fieldEnd.getFieldType())) {
            zzZ3E().zzZN("span", 0);
            zzLU zzlu = new zzLU();
            zzlu.zzZs("-aw-field-end", TelemetryEventStrings.Value.TRUE);
            this.zzYqI.zzZ3C().zzV(zzlu);
            zzZ3E().endElement("span");
        }
        super.zzU(fieldEnd);
    }
}
