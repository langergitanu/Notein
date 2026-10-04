package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public final class MaterialDynamicColors {
    public static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        Hct hctFrom = Hct.from(d, d2, d3);
        if (hctFrom.getChroma() < d2) {
            double chroma = hctFrom.getChroma();
            while (hctFrom.getChroma() < d2) {
                d3 += z ? -1.0d : 1.0d;
                Hct hctFrom2 = Hct.from(d, d2, d3);
                if (chroma > hctFrom2.getChroma() || Math.abs(hctFrom2.getChroma() - d2) < 0.4d) {
                    return d3;
                }
                if (Math.abs(hctFrom2.getChroma() - d2) < Math.abs(hctFrom.getChroma() - d2)) {
                    hctFrom = hctFrom2;
                }
                chroma = Math.max(chroma, hctFrom2.getChroma());
            }
        }
        return d3;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$error$93(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$errorContainer$99(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$41(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$66(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$96(DynamicScheme dynamicScheme) {
        return error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$102(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$57(DynamicScheme dynamicScheme) {
        return primary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$62(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$63(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$111(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$112(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$115(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$116(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$72(DynamicScheme dynamicScheme) {
        return secondary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$77(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$78(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$125(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$126(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 25.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$130(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$84(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$89(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$90(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 100.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$139(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$140(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$143(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$144(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primary$54(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryContainer$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixed$105(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixedDim$108(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondary$69(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryContainer$75(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 80.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixed$119(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixedDim$122(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 24.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 12.0d : 94.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 17.0d : 92.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 22.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 96.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 4.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 87.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiary$81(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryContainer$87(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 15.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixed$133(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixedDim$136(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct hctInViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        return (!DynamicColor.tonePrefersLightForeground(hct.getTone()) || DynamicColor.toneAllowsLightForeground(hctInViewingConditions.getTone())) ? DynamicColor.enableLightForeground(hctInViewingConditions.getTone()) : DynamicColor.enableLightForeground(hct.getTone());
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    public DynamicColor background() {
        return new DynamicColor("background", new o0000OO(), new o0000OOO(), true, null, null, null, null);
    }

    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new C22464o0ooOO0(), new o0ooOOo());
    }

    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new C22422o0000oo(), new C22418o0000oO(), false, null, null, null, null, new o0000O0());
    }

    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new C22399OooooOo(), new C22462o00ooo());
    }

    public DynamicColor error() {
        return new DynamicColor("error", new Oooo0(0), new C22380Oooo0OO(), true, new C22456o000oo0(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new C22382Oooo0o0(this, 0));
    }

    public DynamicColor errorContainer() {
        return new DynamicColor("error_container", new C22394OoooOoo(), new C22395Ooooo00(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.Ooooo0o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67661OooO00o.lambda$errorContainer$99((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new C22366OooOo0(0), new C22367OooOo0O(0), false, new Function() { // from class: com.google.android.material.color.utilities.OooOo0o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67645OooO00o.lambda$inverseOnSurface$41((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new o000(), new o000O000(), false, new Function() { // from class: com.google.android.material.color.utilities.o000OoO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67680OooO00o.lambda$inversePrimary$66((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new C22388OoooO0O(0), new C22385OoooO(), false, null, null, null, null);
    }

    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new OooOOO(), new C22370OooOoO0());
    }

    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new C22439o000Ooo0(), new C22440o000OooO());
    }

    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new C22410o0000Oo(), new C22412o0000OoO(), false, new Function() { // from class: com.google.android.material.color.utilities.o0000o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67668OooO00o.lambda$onBackground$14((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    public DynamicColor onError() {
        return new DynamicColor("on_error", new C22428o000O0oo(), new o000O(), false, new Function() { // from class: com.google.android.material.color.utilities.o000OO00
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67674OooO00o.lambda$onError$96((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new C22454o000oOoO(0), new C22390OoooOOO(), false, new Function() { // from class: com.google.android.material.color.utilities.OoooOOo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67660OooO00o.lambda$onErrorContainer$102((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new C22421o0000oOo(), new C22423o0000oo0(), false, new Function() { // from class: com.google.android.material.color.utilities.o0000ooO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67669OooO00o.lambda$onPrimary$57((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new o000OOO(), new Function() { // from class: com.google.android.material.color.utilities.o000OOo0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67676OooO00o.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.o000OOoO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67677OooO00o.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new C22375OooOooo(), new Oooo000(), false, new Function() { // from class: com.google.android.material.color.utilities.Oooo00O
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67652OooO00o.lambda$onPrimaryFixed$111((DynamicScheme) obj);
            }
        }, new C22378Oooo00o(this, 0), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new o000O00(), new o000O00O(), false, new Function() { // from class: com.google.android.material.color.utilities.o000O0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67670OooO00o.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o000O0Oo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67671OooO00o.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new C22357OooO0Oo(), new C22358OooO0o0(), false, new Function() { // from class: com.google.android.material.color.utilities.OooO0o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67639OooO00o.lambda$onSecondary$72((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new C22373OooOoo0(), new Function() { // from class: com.google.android.material.color.utilities.OooOoo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67648OooO00o.lambda$onSecondaryContainer$77((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.OooOooO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67649OooO00o.lambda$onSecondaryContainer$78((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new C22364OooOOo0(), new C22363OooOOo(), false, new Function() { // from class: com.google.android.material.color.utilities.OooOOoo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67641OooO00o.lambda$onSecondaryFixed$125((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.OooOo00
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67643OooO00o.lambda$onSecondaryFixed$126((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new o00O0O(), new o00Oo0(0), false, new Function() { // from class: com.google.android.material.color.utilities.o00Ooo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67689OooO00o.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o00o0O
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67690OooO00o.lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new C22434o000Oo0o(), new C22467oooo00o(), false, new C22456o000oo0(this), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new C22387OoooO00(0), new C22386OoooO0(), false, new C22456o000oo0(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new C22416o0000o0O(), new C22425o000O0o(), false, new Function() { // from class: com.google.android.material.color.utilities.o000O0oO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67673OooO00o.lambda$onTertiary$84((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new OooOo(), new Function() { // from class: com.google.android.material.color.utilities.OooOoO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67646OooO00o.lambda$onTertiaryContainer$89((DynamicScheme) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.OooOoOO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67647OooO00o.lambda$onTertiaryContainer$90((DynamicScheme) obj);
            }
        }, null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new C22406o00000o0(), new C22413o0000Ooo(), false, new Function() { // from class: com.google.android.material.color.utilities.o00000oO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67665OooO00o.lambda$onTertiaryFixed$139((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o00000oo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67666OooO00o.lambda$onTertiaryFixed$140((DynamicScheme) obj);
            }
        }, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new o0OO00O(), new oo0o0Oo(), false, new Function() { // from class: com.google.android.material.color.utilities.o0O0O00
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67692OooO00o.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o000OOo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67675OooO00o.lambda$onTertiaryFixedVariant$144((DynamicScheme) obj);
            }
        }, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public DynamicColor outline() {
        return new DynamicColor("outline", new C22361OooOO0o(), new OooOOO0(), false, new C22456o000oo0(this), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new C22417o0000o0o(), new C22414o0000o(), false, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    public DynamicColor primary() {
        return new DynamicColor("primary", new C22400Oooooo(), new C22402OoooooO(), true, new C22456o000oo0(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.Ooooooo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67663OooO00o.lambda$primary$54((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new o000OO(), new o0000O(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o0000OO0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67667OooO00o.lambda$primaryContainer$60((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new C22446o000o0O(), new C22448o000o0OO(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o000o0Oo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67681OooO00o.lambda$primaryFixed$105((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new C22451o000o0o0(), new C22450o000o0o(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o000o0oO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67682OooO00o.lambda$primaryFixedDim$108((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new C22465o0ooOoO(), new o0OOO0o());
    }

    public DynamicColor scrim() {
        return new DynamicColor("scrim", new o0OoOo0(), new C22466ooOO(), false, null, null, null, null);
    }

    public DynamicColor secondary() {
        return new DynamicColor("secondary", new C22359OooO0oO(), new C22360OooO0oo(0), true, new C22456o000oo0(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.OooO
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67636OooO00o.lambda$secondary$69((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new o00000O0(), new o00000O(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o00000Oo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67664OooO00o.lambda$secondaryContainer$75((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new C22438o000Ooo(), new o000O0O(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o000Oo0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67679OooO00o.lambda$secondaryFixed$119((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new C22432o000Oo00(), new C22433o000Oo0O(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o000Oo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67678OooO00o.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new o000000(), new o000000O());
    }

    public DynamicColor shadow() {
        return new DynamicColor("shadow", new C22442o000o00(), new C22444o000o00O(), false, null, null, null, null);
    }

    public DynamicColor surface() {
        return new DynamicColor("surface", new OooO0OO(), new o0Oo0oo(), true, null, null, null, null);
    }

    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new C22419o0000oO0(), new C22420o0000oOO(), true, null, null, null, null);
    }

    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new C22384Oooo0oo(), new C22376Oooo(), true, null, null, null, null);
    }

    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new C22409o0000OOo(), new C22411o0000Oo0(), true, null, null, null, null);
    }

    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new C22445o000o00o(), new C22447o000o0O0(), true, null, null, null, null);
    }

    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new C22404o000000o(), new o00000(), true, null, null, null, null);
    }

    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new OooOO0(), new OooOO0O(), true, null, null, null, null);
    }

    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new C22379Oooo0O0(), new C22389OoooOO0(0), true, null, null, null, null);
    }

    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new OooOOOO(), new C22362OooOOOo(), true, null, null, null, null);
    }

    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new C22436o000OoOO(), new C22437o000OoOo(), true, null, null, null, null);
    }

    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new oo000o(), new C22461o00oO0o(), true, new C22456o000oo0(this), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.o00oO0O
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67691OooO00o.lambda$tertiary$81((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new C22453o000o0oo(), new C22455o000oOoo(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new C22457o000oo00(this, 0));
    }

    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new C22397OooooO0(), new C22398OooooOO(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.Oooooo0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67662OooO00o.lambda$tertiaryFixed$133((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new o000OO0O(), new o000O0O0(), true, new C22456o000oo0(this), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.o000O0o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f67672OooO00o.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            }
        });
    }

    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new o0000(), new o0000O00());
    }

    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new C22441o000Oooo(), new C22443o000o000());
    }

    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new C22381Oooo0o(), new C22383Oooo0oO());
    }

    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new C22463o0OoO0o(), new C22429o000OO0o());
    }

    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new C22392OoooOo0(), new C22393OoooOoO());
    }

    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new o00000OO(), new o0000O0O());
    }
}
