package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FormFieldCollection implements Iterable<FormField> {
    private NodeCollection zzYwi;

    public FormFieldCollection(Node node) {
        this.zzYwi = node.isComposite() ? ((CompositeNode) node).getChildNodes(25, true) : zzZUO.zzYLo;
    }

    private static void zzX(FormField formField) throws Exception {
        if (formField == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: formField");
        }
        formField.removeField();
    }

    public void clear() throws Exception {
        for (int count = getCount(); count > 0; count--) {
            removeAt(0);
        }
    }

    public FormField get(int i) {
        return (FormField) this.zzYwi.get(i);
    }

    public int getCount() {
        return this.zzYwi.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<FormField> iterator() {
        return this.zzYwi.zzYAP();
    }

    public void remove(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "formField");
        zzX(get(str));
    }

    public void removeAt(int i) throws Exception {
        zzX(get(i));
    }

    public FormField get(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "bookmarkName");
        for (int i = 0; i < getCount(); i++) {
            if (com.aspose.words.internal.zzZYD.zzi(get(i).getName(), str)) {
                return get(i);
            }
        }
        return null;
    }
}
