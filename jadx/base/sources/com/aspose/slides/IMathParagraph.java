package com.aspose.slides;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathParagraph extends IMathBlockCollection {
    int getJustification();

    void setJustification(int i);

    String toLatex();

    void writeAsMathMl(OutputStream outputStream);
}
