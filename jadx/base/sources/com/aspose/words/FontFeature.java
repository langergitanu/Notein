package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FontFeature {
    public static final int CONTEXTUAL_LIGATURES = 1668049255;
    public static final int DISCRETIONARY_LIGATURES = 1684826471;
    public static final int GLYPH_COMPOSITION_DECOMPOSITION = 1667460464;
    public static final int HISTORICAL_LIGATURES = 1751935335;
    public static final int KERNING = 1801810542;
    public static final int LINING_FIGURES = 1819178349;
    public static final int OLDSTYLE_FIGURES = 1869509997;
    public static final int PROPORTIONAL_FIGURES = 1886287213;
    public static final int REQUIRED_LIGATURES = 1919707495;
    public static final int STANDARD_LIGATURES = 1818847073;
    public static final int STYLISTIC_SET_01 = 1936928817;
    public static final int STYLISTIC_SET_02 = 1936928818;
    public static final int STYLISTIC_SET_03 = 1936928819;
    public static final int STYLISTIC_SET_04 = 1936928820;
    public static final int STYLISTIC_SET_05 = 1936928821;
    public static final int STYLISTIC_SET_06 = 1936928822;
    public static final int STYLISTIC_SET_07 = 1936928823;
    public static final int STYLISTIC_SET_08 = 1936928824;
    public static final int STYLISTIC_SET_09 = 1936928825;
    public static final int STYLISTIC_SET_10 = 1936929072;
    public static final int STYLISTIC_SET_11 = 1936929073;
    public static final int STYLISTIC_SET_12 = 1936929074;
    public static final int STYLISTIC_SET_13 = 1936929075;
    public static final int STYLISTIC_SET_14 = 1936929076;
    public static final int STYLISTIC_SET_15 = 1936929077;
    public static final int STYLISTIC_SET_16 = 1936929078;
    public static final int STYLISTIC_SET_17 = 1936929079;
    public static final int STYLISTIC_SET_18 = 1936929080;
    public static final int STYLISTIC_SET_19 = 1936929081;
    public static final int STYLISTIC_SET_20 = 1936929328;
    public static final int TABULAR_FIGURES = 1953396077;
    public static final int VERTICAL_ALTERNATES = 1986359924;
    public static final int VERTICAL_ALTERNATES_AND_ROTATION = 1987212338;
    public static final int length = 33;

    private FontFeature() {
    }

    public static int fromName(String str) {
        if ("GLYPH_COMPOSITION_DECOMPOSITION".equals(str)) {
            return GLYPH_COMPOSITION_DECOMPOSITION;
        }
        if ("STANDARD_LIGATURES".equals(str)) {
            return STANDARD_LIGATURES;
        }
        if ("REQUIRED_LIGATURES".equals(str)) {
            return REQUIRED_LIGATURES;
        }
        if ("CONTEXTUAL_LIGATURES".equals(str)) {
            return CONTEXTUAL_LIGATURES;
        }
        if ("DISCRETIONARY_LIGATURES".equals(str)) {
            return DISCRETIONARY_LIGATURES;
        }
        if ("HISTORICAL_LIGATURES".equals(str)) {
            return HISTORICAL_LIGATURES;
        }
        if ("PROPORTIONAL_FIGURES".equals(str)) {
            return PROPORTIONAL_FIGURES;
        }
        if ("TABULAR_FIGURES".equals(str)) {
            return TABULAR_FIGURES;
        }
        if ("LINING_FIGURES".equals(str)) {
            return LINING_FIGURES;
        }
        if ("OLDSTYLE_FIGURES".equals(str)) {
            return OLDSTYLE_FIGURES;
        }
        if ("VERTICAL_ALTERNATES".equals(str)) {
            return VERTICAL_ALTERNATES;
        }
        if ("VERTICAL_ALTERNATES_AND_ROTATION".equals(str)) {
            return VERTICAL_ALTERNATES_AND_ROTATION;
        }
        if ("STYLISTIC_SET_01".equals(str)) {
            return STYLISTIC_SET_01;
        }
        if ("STYLISTIC_SET_02".equals(str)) {
            return STYLISTIC_SET_02;
        }
        if ("STYLISTIC_SET_03".equals(str)) {
            return STYLISTIC_SET_03;
        }
        if ("STYLISTIC_SET_04".equals(str)) {
            return STYLISTIC_SET_04;
        }
        if ("STYLISTIC_SET_05".equals(str)) {
            return STYLISTIC_SET_05;
        }
        if ("STYLISTIC_SET_06".equals(str)) {
            return STYLISTIC_SET_06;
        }
        if ("STYLISTIC_SET_07".equals(str)) {
            return STYLISTIC_SET_07;
        }
        if ("STYLISTIC_SET_08".equals(str)) {
            return STYLISTIC_SET_08;
        }
        if ("STYLISTIC_SET_09".equals(str)) {
            return STYLISTIC_SET_09;
        }
        if ("STYLISTIC_SET_10".equals(str)) {
            return STYLISTIC_SET_10;
        }
        if ("STYLISTIC_SET_11".equals(str)) {
            return STYLISTIC_SET_11;
        }
        if ("STYLISTIC_SET_12".equals(str)) {
            return STYLISTIC_SET_12;
        }
        if ("STYLISTIC_SET_13".equals(str)) {
            return STYLISTIC_SET_13;
        }
        if ("STYLISTIC_SET_14".equals(str)) {
            return STYLISTIC_SET_14;
        }
        if ("STYLISTIC_SET_15".equals(str)) {
            return STYLISTIC_SET_15;
        }
        if ("STYLISTIC_SET_16".equals(str)) {
            return STYLISTIC_SET_16;
        }
        if ("STYLISTIC_SET_17".equals(str)) {
            return STYLISTIC_SET_17;
        }
        if ("STYLISTIC_SET_18".equals(str)) {
            return STYLISTIC_SET_18;
        }
        if ("STYLISTIC_SET_19".equals(str)) {
            return STYLISTIC_SET_19;
        }
        if ("STYLISTIC_SET_20".equals(str)) {
            return STYLISTIC_SET_20;
        }
        if ("KERNING".equals(str)) {
            return KERNING;
        }
        throw new IllegalArgumentException("Unknown FontFeature name.");
    }

    public static String getName(int i) {
        switch (i) {
            case GLYPH_COMPOSITION_DECOMPOSITION /* 1667460464 */:
                return "GLYPH_COMPOSITION_DECOMPOSITION";
            case CONTEXTUAL_LIGATURES /* 1668049255 */:
                return "CONTEXTUAL_LIGATURES";
            case DISCRETIONARY_LIGATURES /* 1684826471 */:
                return "DISCRETIONARY_LIGATURES";
            case HISTORICAL_LIGATURES /* 1751935335 */:
                return "HISTORICAL_LIGATURES";
            case KERNING /* 1801810542 */:
                return "KERNING";
            case STANDARD_LIGATURES /* 1818847073 */:
                return "STANDARD_LIGATURES";
            case LINING_FIGURES /* 1819178349 */:
                return "LINING_FIGURES";
            case OLDSTYLE_FIGURES /* 1869509997 */:
                return "OLDSTYLE_FIGURES";
            case PROPORTIONAL_FIGURES /* 1886287213 */:
                return "PROPORTIONAL_FIGURES";
            case REQUIRED_LIGATURES /* 1919707495 */:
                return "REQUIRED_LIGATURES";
            case STYLISTIC_SET_20 /* 1936929328 */:
                return "STYLISTIC_SET_20";
            case TABULAR_FIGURES /* 1953396077 */:
                return "TABULAR_FIGURES";
            case VERTICAL_ALTERNATES /* 1986359924 */:
                return "VERTICAL_ALTERNATES";
            case VERTICAL_ALTERNATES_AND_ROTATION /* 1987212338 */:
                return "VERTICAL_ALTERNATES_AND_ROTATION";
            default:
                switch (i) {
                    case STYLISTIC_SET_01 /* 1936928817 */:
                        return "STYLISTIC_SET_01";
                    case STYLISTIC_SET_02 /* 1936928818 */:
                        return "STYLISTIC_SET_02";
                    case STYLISTIC_SET_03 /* 1936928819 */:
                        return "STYLISTIC_SET_03";
                    case STYLISTIC_SET_04 /* 1936928820 */:
                        return "STYLISTIC_SET_04";
                    case STYLISTIC_SET_05 /* 1936928821 */:
                        return "STYLISTIC_SET_05";
                    case STYLISTIC_SET_06 /* 1936928822 */:
                        return "STYLISTIC_SET_06";
                    case STYLISTIC_SET_07 /* 1936928823 */:
                        return "STYLISTIC_SET_07";
                    case STYLISTIC_SET_08 /* 1936928824 */:
                        return "STYLISTIC_SET_08";
                    case STYLISTIC_SET_09 /* 1936928825 */:
                        return "STYLISTIC_SET_09";
                    default:
                        switch (i) {
                            case STYLISTIC_SET_10 /* 1936929072 */:
                                return "STYLISTIC_SET_10";
                            case STYLISTIC_SET_11 /* 1936929073 */:
                                return "STYLISTIC_SET_11";
                            case STYLISTIC_SET_12 /* 1936929074 */:
                                return "STYLISTIC_SET_12";
                            case STYLISTIC_SET_13 /* 1936929075 */:
                                return "STYLISTIC_SET_13";
                            case STYLISTIC_SET_14 /* 1936929076 */:
                                return "STYLISTIC_SET_14";
                            case STYLISTIC_SET_15 /* 1936929077 */:
                                return "STYLISTIC_SET_15";
                            case STYLISTIC_SET_16 /* 1936929078 */:
                                return "STYLISTIC_SET_16";
                            case STYLISTIC_SET_17 /* 1936929079 */:
                                return "STYLISTIC_SET_17";
                            case STYLISTIC_SET_18 /* 1936929080 */:
                                return "STYLISTIC_SET_18";
                            case STYLISTIC_SET_19 /* 1936929081 */:
                                return "STYLISTIC_SET_19";
                            default:
                                return "Unknown FontFeature value.";
                        }
                }
        }
    }

    public static int[] getValues() {
        return new int[]{GLYPH_COMPOSITION_DECOMPOSITION, STANDARD_LIGATURES, REQUIRED_LIGATURES, CONTEXTUAL_LIGATURES, DISCRETIONARY_LIGATURES, HISTORICAL_LIGATURES, PROPORTIONAL_FIGURES, TABULAR_FIGURES, LINING_FIGURES, OLDSTYLE_FIGURES, VERTICAL_ALTERNATES, VERTICAL_ALTERNATES_AND_ROTATION, STYLISTIC_SET_01, STYLISTIC_SET_02, STYLISTIC_SET_03, STYLISTIC_SET_04, STYLISTIC_SET_05, STYLISTIC_SET_06, STYLISTIC_SET_07, STYLISTIC_SET_08, STYLISTIC_SET_09, STYLISTIC_SET_10, STYLISTIC_SET_11, STYLISTIC_SET_12, STYLISTIC_SET_13, STYLISTIC_SET_14, STYLISTIC_SET_15, STYLISTIC_SET_16, STYLISTIC_SET_17, STYLISTIC_SET_18, STYLISTIC_SET_19, STYLISTIC_SET_20, KERNING};
    }

    public static String toString(int i) {
        switch (i) {
            case GLYPH_COMPOSITION_DECOMPOSITION /* 1667460464 */:
                return "GlyphCompositionDecomposition";
            case CONTEXTUAL_LIGATURES /* 1668049255 */:
                return "ContextualLigatures";
            case DISCRETIONARY_LIGATURES /* 1684826471 */:
                return "DiscretionaryLigatures";
            case HISTORICAL_LIGATURES /* 1751935335 */:
                return "HistoricalLigatures";
            case KERNING /* 1801810542 */:
                return "Kerning";
            case STANDARD_LIGATURES /* 1818847073 */:
                return "StandardLigatures";
            case LINING_FIGURES /* 1819178349 */:
                return "LiningFigures";
            case OLDSTYLE_FIGURES /* 1869509997 */:
                return "OldstyleFigures";
            case PROPORTIONAL_FIGURES /* 1886287213 */:
                return "ProportionalFigures";
            case REQUIRED_LIGATURES /* 1919707495 */:
                return "RequiredLigatures";
            case STYLISTIC_SET_20 /* 1936929328 */:
                return "StylisticSet20";
            case TABULAR_FIGURES /* 1953396077 */:
                return "TabularFigures";
            case VERTICAL_ALTERNATES /* 1986359924 */:
                return "VerticalAlternates";
            case VERTICAL_ALTERNATES_AND_ROTATION /* 1987212338 */:
                return "VerticalAlternatesAndRotation";
            default:
                switch (i) {
                    case STYLISTIC_SET_01 /* 1936928817 */:
                        return "StylisticSet01";
                    case STYLISTIC_SET_02 /* 1936928818 */:
                        return "StylisticSet02";
                    case STYLISTIC_SET_03 /* 1936928819 */:
                        return "StylisticSet03";
                    case STYLISTIC_SET_04 /* 1936928820 */:
                        return "StylisticSet04";
                    case STYLISTIC_SET_05 /* 1936928821 */:
                        return "StylisticSet05";
                    case STYLISTIC_SET_06 /* 1936928822 */:
                        return "StylisticSet06";
                    case STYLISTIC_SET_07 /* 1936928823 */:
                        return "StylisticSet07";
                    case STYLISTIC_SET_08 /* 1936928824 */:
                        return "StylisticSet08";
                    case STYLISTIC_SET_09 /* 1936928825 */:
                        return "StylisticSet09";
                    default:
                        switch (i) {
                            case STYLISTIC_SET_10 /* 1936929072 */:
                                return "StylisticSet10";
                            case STYLISTIC_SET_11 /* 1936929073 */:
                                return "StylisticSet11";
                            case STYLISTIC_SET_12 /* 1936929074 */:
                                return "StylisticSet12";
                            case STYLISTIC_SET_13 /* 1936929075 */:
                                return "StylisticSet13";
                            case STYLISTIC_SET_14 /* 1936929076 */:
                                return "StylisticSet14";
                            case STYLISTIC_SET_15 /* 1936929077 */:
                                return "StylisticSet15";
                            case STYLISTIC_SET_16 /* 1936929078 */:
                                return "StylisticSet16";
                            case STYLISTIC_SET_17 /* 1936929079 */:
                                return "StylisticSet17";
                            case STYLISTIC_SET_18 /* 1936929080 */:
                                return "StylisticSet18";
                            case STYLISTIC_SET_19 /* 1936929081 */:
                                return "StylisticSet19";
                            default:
                                return "Unknown FontFeature value.";
                        }
                }
        }
    }
}
