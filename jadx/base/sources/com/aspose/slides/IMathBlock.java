package com.aspose.slides;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathBlock extends IMathElement, IMathElementCollection {
    IMathDelimiter delimit(char c);

    IMathDelimiter enclose(char c, char c2, char c3);

    IMathBlock joinBlock(IMathBlock iMathBlock);

    void writeAsMathMl(OutputStream outputStream);
}
