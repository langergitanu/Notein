package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IOverrideTheme extends ITheme {
    void clear();

    void initColorScheme();

    void initColorSchemeFrom(IColorScheme iColorScheme);

    void initColorSchemeFromInherited();

    void initFontScheme();

    void initFontSchemeFrom(IFontScheme iFontScheme);

    void initFontSchemeFromInherited();

    void initFormatScheme();

    void initFormatSchemeFrom(IFormatScheme iFormatScheme);

    void initFormatSchemeFromInherited();

    boolean isEmpty();
}
