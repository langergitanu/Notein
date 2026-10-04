package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHS {
    private static final boolean zzZH9 = zzZHP.zzTN("1.6.0_25");
    private static final zzZ<DecimalFormat> zzZH8 = new zzZ<DecimalFormat>() { // from class: com.aspose.words.internal.zzZHS.1
        private static DecimalFormat zzP(Locale locale) {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
            zzZHS.zzZ(decimalFormat);
            return decimalFormat;
        }

        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final /* synthetic */ NumberFormat zzO(Locale locale) {
            return zzP(locale);
        }
    };
    private static final zzZ<DecimalFormat> zzZH7 = new zzZ<DecimalFormat>() { // from class: com.aspose.words.internal.zzZHS.2
        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final /* synthetic */ NumberFormat zzO(Locale locale) {
            return (DecimalFormat) NumberFormat.getInstance(locale);
        }
    };
    private static final zzZ<DecimalFormat> zzZH6 = new zzZ<DecimalFormat>() { // from class: com.aspose.words.internal.zzZHS.3
        private static DecimalFormat zzP(Locale locale) {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale);
            zzZHS.zzZ(decimalFormat);
            return decimalFormat;
        }

        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final /* synthetic */ NumberFormat zzO(Locale locale) {
            return zzP(locale);
        }
    };
    private static final zzZ<DecimalFormat> zzZH5 = new zzZ<DecimalFormat>() { // from class: com.aspose.words.internal.zzZHS.4
        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final /* synthetic */ NumberFormat zzO(Locale locale) {
            return (DecimalFormat) NumberFormat.getCurrencyInstance(locale);
        }
    };
    private static final zzZ<DecimalFormat> zzZH4 = new zzZ<DecimalFormat>() { // from class: com.aspose.words.internal.zzZHS.5
        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final /* synthetic */ NumberFormat zzO(Locale locale) {
            return (DecimalFormat) NumberFormat.getNumberInstance(locale);
        }
    };
    private static zzZ<DecimalFormat> zzZH3 = new zzZ<DecimalFormat>() { // from class: com.aspose.words.internal.zzZHS.6
        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final /* synthetic */ NumberFormat zzO(Locale locale) {
            return (DecimalFormat) NumberFormat.getIntegerInstance(locale);
        }
    };
    private static final zzZ<NumberFormat> zzZH2 = new zzZ<NumberFormat>() { // from class: com.aspose.words.internal.zzZHS.7
        @Override // com.aspose.words.internal.zzZHS.zzZ
        public final NumberFormat zzO(Locale locale) {
            return NumberFormat.getPercentInstance(locale);
        }
    };

    public static String getCurrencySymbol() {
        return zzS(zzZNG.zzpZ().getLocale()).getDecimalFormatSymbols().getCurrencySymbol();
    }

    public static DecimalFormatSymbols getDecimalFormatSymbols() {
        return zzS(zzZNG.zzpZ().getLocale()).getDecimalFormatSymbols();
    }

    public static char getDecimalSeparator() {
        return zzS(zzZNG.zzpZ().getLocale()).getDecimalFormatSymbols().getDecimalSeparator();
    }

    public static char getGroupingSeparator() {
        return zzS(zzZNG.zzpZ().getLocale()).getDecimalFormatSymbols().getGroupingSeparator();
    }

    public static int getGroupingSize() {
        return zzS(zzZNG.zzpZ().getLocale()).getGroupingSize();
    }

    public static DecimalFormat zzQ(Locale locale) {
        return (DecimalFormat) zzZH3.zzN(locale);
    }

    private static DecimalFormat zzR(Locale locale) {
        return (DecimalFormat) zzZH4.zzN(locale);
    }

    private static DecimalFormat zzS(Locale locale) {
        return (DecimalFormat) zzZH8.zzM(locale);
    }

    public static DecimalFormat zzT(Locale locale) {
        return (DecimalFormat) zzZH7.zzN(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzZ(DecimalFormat decimalFormat) {
        String string = zzZNG.zzpZ().toString();
        if ("uk-UA".equals(string)) {
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            if ("₴".equals(decimalFormatSymbols.getCurrencySymbol())) {
                return;
            }
            decimalFormatSymbols.setCurrencySymbol("₴");
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            return;
        }
        if ("fr-CH".equals(string)) {
            DecimalFormatSymbols decimalFormatSymbols2 = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols2.setCurrencySymbol("SFr.");
            decimalFormatSymbols2.setGroupingSeparator('\'');
            decimalFormatSymbols2.setMonetaryDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            decimalFormatSymbols2.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
            decimalFormat.setNegativePrefix("(SFr.");
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols2);
        }
    }

    public static DecimalFormat zzck() {
        return (DecimalFormat) zzZH6.zzN(zzZNG.zzpZ().getLocale());
    }

    public static DecimalFormat zzcl() {
        return zzR(zzZNG.zzpZ().getLocale());
    }

    public static DecimalFormat zzcm() {
        return (DecimalFormat) zzZH8.zzN(zzZNG.zzpZ().getLocale());
    }

    public static DecimalFormat zzcn() {
        return zzT(zzZNG.zzpZ().getLocale());
    }

    public static abstract class zzZ<V extends NumberFormat> {
        private final ConcurrentHashMap<Locale, V> zzZH1;

        private zzZ() {
            this.zzZH1 = new ConcurrentHashMap<>();
        }

        public final V zzM(Locale locale) {
            if (this.zzZH1.containsKey(locale)) {
                return this.zzZH1.get(locale);
            }
            V v = (V) zzO(locale);
            this.zzZH1.putIfAbsent(locale, v);
            return v;
        }

        public final V zzN(Locale locale) {
            return (V) zzM(locale).clone();
        }

        public abstract NumberFormat zzO(Locale locale);

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }
}
