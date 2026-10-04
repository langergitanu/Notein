package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class WordML2003SaveOptions extends SaveOptions {
    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 31;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 31) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }
}
