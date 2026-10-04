package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJ5 extends zzZJ3 {
    public zzZJ5(DocumentBuilder documentBuilder, zzZYY zzzyy) {
        super(documentBuilder, zzzyy);
    }

    private void zz2(String str) {
        if (zzZ3K().getDocument().getWarningCallback() != null) {
            OooO00o.OooO0O0(zzZ3K().getDocument().getWarningCallback(), 1, 16, str);
        }
    }

    private FormField zzKS(String str) throws Exception {
        zzZ3J().zzZ(zzZ3K().getFont(), zzZ3K().getCurrentParagraph().zzqy(0));
        FormField formFieldInsertComboBox = zzZ3K().insertComboBox(str, new String[]{""}, 0);
        zzZ3J().zzZ(formFieldInsertComboBox.getFont(), zzZ3K().getCurrentParagraph().zzqy(0));
        formFieldInsertComboBox.getDropDownItems().clear();
        formFieldInsertComboBox.setEnabled(true);
        return formFieldInsertComboBox;
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, boolean z, String str2, int i) throws Exception {
        zzZ(str, str2, z, i, 2);
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, boolean z, boolean z2, boolean z3) throws Exception {
        zzZ3K().insertCheckBox(str, z3, com.aspose.words.internal.zzAN.zzZG(zzZ3K().getFont().getSize())).setEnabled(!z);
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, String str2, boolean z, int i, String str3) throws Exception {
        zzZ(str, str2, z, i, 0);
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, boolean z, Iterable<zzZFW> iterable) throws Exception {
        FormField formFieldZzKS = zzKS(str);
        for (zzZFW zzzfw : iterable) {
            zzZ(formFieldZzKS, zzzfw.getText(), zzzfw.isSelected());
        }
    }

    private void zzZ(String str, String str2, boolean z, int i, int i2) throws Exception {
        zzZ3J().zzZ(zzZ3K().getFont(), zzZ3K().getCurrentParagraph().zzqy(0));
        FormField formFieldInsertTextInput = zzZ3K().insertTextInput(str, i2, "", str2, i);
        formFieldInsertTextInput.setEnabled(z);
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            return;
        }
        formFieldInsertTextInput.getField().setResult(FormField.zzYwj);
    }

    private void zzZ(FormField formField, String str, boolean z) {
        if (formField.getDropDownItems().getCount() < 25) {
            formField.getDropDownItems().add(str);
        } else {
            if (z) {
                String str2 = formField.getDropDownItems().get(24);
                formField.getDropDownItems().set(24, str);
                str = str2;
            }
            zz2(com.aspose.words.internal.zzZKN.format("Item \"{0}\" has been lost while adding DropDown elements.", str));
        }
        if (z) {
            formField.setDropDownSelectedIndex(formField.getDropDownItems().getCount() - 1);
        }
    }
}
