package com.aspose.words;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP7 {
    private zzYOW zzXRR;
    private zzYOR zzXRT;

    public zzYP7(zzYOR zzyor, zzYOW zzyow) {
        this.zzXRT = zzyor;
        this.zzXRR = zzyow;
    }

    private void zzT(FormField formField) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("form:checkbox");
        zzytgZzYsG.zz0("form:control-implementation", "ooo:com.sun.star.form.component.CheckBox");
        zzytgZzYsG.zz0("form:id", com.aspose.words.internal.zzZKN.format("control{0}", Integer.valueOf(this.zzXRT.zzYsz())));
        if (formField.getChecked() && !this.zzXRT.zzYsI().isStrictSchema11()) {
            zzytgZzYsG.zz0("current-state", "checked");
        }
        zzytgZzYsG.zzo();
        zzYOR zzyor = this.zzXRT;
        zzyor.zzra(zzyor.zzYsz() + 1);
    }

    private ArrayList<FormField> zzYtc() {
        ArrayList<FormField> arrayList = new ArrayList<>();
        for (FormField formField : this.zzXRT.getDocument().getRange().getFormFields()) {
            if (formField.zzZ6R() == 1) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, formField);
            }
        }
        return arrayList;
    }

    private void zzYtd() {
        ArrayList<FormField> arrayListZzYtc = zzYtc();
        if (arrayListZzYtc.size() == 0) {
            return;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("office:forms");
        zzytgZzYsG.zzY("form:form");
        zzytgZzYsG.zz0("form:control-implementation", "ooo:com.sun.star.form.component.Form");
        for (FormField formField : arrayListZzYtc) {
            if (formField.zzZ6R() == 1) {
                zzT(formField);
            }
        }
        zzytgZzYsG.zzo();
        zzytgZzYsG.zzo();
        this.zzXRT.zzra(0);
    }

    private void zzYte() {
        if (this.zzXRT.getDocument().getVariables().getCount() == 0) {
            return;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("text:user-field-decls");
        for (Map.Entry<String, String> entry : this.zzXRT.getDocument().getVariables()) {
            zzytgZzYsG.zzY("text:user-field-decl");
            zzytgZzYsG.zz0("office:value-type", "string");
            zzytgZzYsG.zz0("text:name", entry.getKey());
            zzytgZzYsG.zz0("office:string-value", entry.getValue());
            zzytgZzYsG.zzp();
        }
        zzytgZzYsG.zzp();
    }

    public final int zzYtf() {
        if (this.zzXRT.zzYsC() == 6) {
            return 0;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzp();
        zzytgZzYsG.zzp();
        zzytgZzYsG.endDocument();
        return 0;
    }

    public final void zzYtg() throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("office:body");
        zzytgZzYsG.zzY("office:text");
        this.zzXRT.zzYy(null);
        zzYte();
        zzYtd();
        this.zzXRR.zzY(this.zzXRT.zzYBx().getBody());
        this.zzXRT.zzrd(1);
    }
}
