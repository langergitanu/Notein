package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ8H extends zzYJV {
    @Override // com.aspose.words.zzYJV
    public final String zzYVW() {
        return "![";
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzY(zzyi);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 8;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) throws Exception {
        zzYm0();
        Document document = zzz1t.zzZ3K().getDocument();
        Shape shape = new Shape(document, 75);
        shape.setWrapType(0);
        shape.setShapeAttr(897, getText());
        shape.getImageData().setSourceFullName(zzYm0().getUri());
        if (!"".equals(zzYm0().getTitle())) {
            shape.setShapeAttr(EditingLanguage.GERMAN_LUXEMBOURG, zzYm0().getTitle());
        }
        shape.setName(zzYm4());
        new zzZFF(document.getResourceLoadingCallback(), document.getWarningCallback()).zzu(shape);
        zzz1t.zzZ3K().insertNode(shape);
    }

    public static boolean zzZ(zzZ8G zzz8g, zzJZ zzjz) {
        zzZ4O zzz4oZzZ6T = zzz8g.zzZ6T();
        if (zzz4oZzZ6T == null) {
            return false;
        }
        return zzZ4R.zzZ(zzz4oZzZ6T, zzjz);
    }
}
