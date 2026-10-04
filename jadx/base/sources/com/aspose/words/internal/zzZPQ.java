package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.ref.Ref;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzZPQ {
    private static volatile String zz0p;
    private static final zzZEO zz0r = zzZHG.zzc7();
    private static final zzZQX zz0q = new zzZQX() { // from class: com.aspose.words.internal.zzZPQ.3
        @Override // com.aspose.words.internal.zzZQX
        public final boolean zzZ(zzZQR zzzqr) {
            return zzzqr.zzli();
        }
    };

    public interface zzY {
        boolean zzY(zzZ zzz);

        boolean zzZ(zzZ zzz);
    }

    public static final class zzZ {
        private final zzYFW zz0k;

        public zzZ(zzYFW zzyfw) {
            this.zz0k = zzyfw;
        }

        public final void close() {
            try {
                this.zz0k.close();
            } catch (zzZQS e) {
                zzZHV.zzY(e);
            }
        }

        public final String getAttribute(String str) {
            return this.zz0k.getAttributeValue("", str);
        }

        public final String getLocalName() {
            return this.zz0k.getLocalName();
        }

        public final boolean hasNext() throws zzZQS {
            return this.zz0k.hasNext();
        }

        public final int next() throws zzZQS {
            return this.zz0k.next();
        }

        public final int[] zzVA(String str) {
            String[] strArrSplit = getAttribute(str).split(",");
            int length = strArrSplit.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = Integer.parseInt(strArrSplit[i]);
            }
            return iArr;
        }

        public final boolean zzVB(String str) {
            return Boolean.parseBoolean(getAttribute(str));
        }

        public final int zzVz(String str) {
            return Integer.parseInt(getAttribute(str));
        }
    }

    private zzZPQ() {
    }

    public static String zzRb(int i) {
        if (i <= 0) {
            return "";
        }
        final String strValueOf = String.valueOf(i);
        final Ref ref = new Ref("");
        zzZ(new zzY() { // from class: com.aspose.words.internal.zzZPQ.1
            @Override // com.aspose.words.internal.zzZPQ.zzY
            public final boolean zzY(zzZ zzz) {
                ref.set(zzz.getAttribute("Name"));
                return true;
            }

            @Override // com.aspose.words.internal.zzZPQ.zzY
            public final boolean zzZ(zzZ zzz) {
                return strValueOf.equals(zzz.getAttribute("LCID"));
            }
        });
        return (String) ref.get();
    }

    private static boolean zzY(zzZ zzz, zzZPR zzzpr) {
        if (!"Culture".equals(zzz.getLocalName())) {
            return false;
        }
        zzzpr.zzRd(zzz.zzVz("Type"));
        zzzpr.setName(zzz.getAttribute("Name"));
        zzzpr.zzVH(zzz.getAttribute("EnglishName"));
        zzzpr.zzVG(zzz.getAttribute("NativeName"));
        zzzpr.zzVI(zzz.getAttribute("DisplayName"));
        zzzpr.zzRe(zzz.zzVz("LCID"));
        zzzpr.zzRf(zzz.zzVz("CalendarId"));
        zzzpr.zzP(zzz.zzVA("OptionalCalendars"));
        zzzpr.zzZ8(zzz.zzVB("IsNeutralCulture"));
        zzzpr.zzVD(zzz.getAttribute("TwoLetterISOLanguageName"));
        zzzpr.zzVF(zzz.getAttribute("ThreeLetterISOLanguageName"));
        zzzpr.zzVE(zzz.getAttribute("ThreeLetterWindowsLanguageName"));
        zzzpr.zzVC(zzz.getAttribute("ListSeparator"));
        zzzpr.zzRc(zzz.zzVz("ANSICodePage"));
        return true;
    }

    private static boolean zzZ(zzY zzy) {
        zzZ zzzZzjV = zzjV();
        while (zzzZzjV.hasNext()) {
            try {
                try {
                    if (zzzZzjV.next() == 1 && "Culture".equals(zzzZzjV.getLocalName()) && zzy.zzZ(zzzZzjV) && zzy.zzY(zzzZzjV)) {
                        return true;
                    }
                } catch (Exception e) {
                    zzZHV.zzY(e);
                }
            } finally {
                zzzZzjV.close();
            }
        }
        return false;
    }

    private static InputStream zzjU() {
        if (zz0p != null) {
            return zzZPQ.class.getResourceAsStream(zz0p);
        }
        InputStream resourceAsStream = zzZPQ.class.getResourceAsStream("/com/aspose/words/resources/CultureInfo.xml");
        if (resourceAsStream != null) {
            zz0p = "/com/aspose/words/resources/CultureInfo.xml";
            return resourceAsStream;
        }
        String strReplaceAll = zzZPQ.class.getPackage().getName().replaceAll("\\.", "/");
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(strReplaceAll, "/resources/CultureInfo.xml");
        InputStream resourceAsStream2 = zzZPQ.class.getResourceAsStream(strOooO0Oo);
        if (resourceAsStream2 != null) {
            zz0p = strOooO0Oo;
            return resourceAsStream2;
        }
        String strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(strReplaceAll.substring(0, strReplaceAll.lastIndexOf("/")), "/resources/CultureInfo.xml");
        InputStream resourceAsStream3 = zzZPQ.class.getResourceAsStream(strOooO0Oo2);
        if (resourceAsStream3 == null) {
            throw new IllegalStateException("CultureInfo.xml cannot be found");
        }
        zz0p = strOooO0Oo2;
        return resourceAsStream3;
    }

    private static zzZ zzjV() {
        try {
            return new zzZ(zzYFQ.zz4(zzZEO.zzZ(zz0r.zzZ(zzjU()), zz0q)));
        } catch (zzZQS e) {
            zzZHV.zzY(e);
            throw new IllegalStateException("Cannot read CultureInfo.xml");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzZ(zzZ zzz, zzZPR zzzpr) {
        try {
            if (!zzY(zzz, zzzpr)) {
                return false;
            }
            if (!zzz.hasNext()) {
                return true;
            }
            zzZ(zzz.next(), zzz, zzzpr);
            return true;
        } catch (Exception e) {
            zzZHV.zzY(e);
            return false;
        }
    }

    private static void zzZ(int i, zzZ zzz, zzZPR zzzpr) {
        if (i == 1 && "DateTimeFormat".equals(zzz.getLocalName())) {
            zzZPT zzzpt = new zzZPT();
            zzzpt.zzRg(zzzpr.zzk4().getID());
            zzzpt.setLongDatePattern(zzz.getAttribute("LongDatePattern"));
            zzzpt.setLongTimePattern(zzz.getAttribute("LongTimePattern"));
            zzzpt.setShortDatePattern(zzz.getAttribute("ShortDatePattern"));
            zzzpt.setShortTimePattern(zzz.getAttribute("ShortTimePattern"));
            zzzpt.zzVQ(zzz.getAttribute("MonthDayPattern"));
            zzzpt.zzVP(zzz.getAttribute("YearMonthPattern"));
            zzzpt.zzVO(zzz.getAttribute("DateSeparator"));
            zzzpt.zzVN(zzz.getAttribute("TimeSeparator"));
            zzzpt.zzVM(zzz.getAttribute("FullDateTimePattern"));
            zzzpt.setPMDesignator(zzz.getAttribute("PMDesignator"));
            zzzpt.setAMDesignator(zzz.getAttribute("AMDesignator"));
            zzzpt.zzVL(zzz.getAttribute("RFC1123Pattern"));
            zzzpt.zzVK(zzz.getAttribute("SortableDateTimePattern"));
            zzzpt.zzVJ(zzz.getAttribute("UniversalSortableDateTimePattern"));
            zzzpr.zzZ(zzzpt);
        }
    }

    public static boolean zzZ(final zzZPR zzzpr) {
        final String strZzk2 = zzzpr.zzk2();
        if (zzZKN.zzU3(strZzk2)) {
            return false;
        }
        return zzZ(new zzY() { // from class: com.aspose.words.internal.zzZPQ.2
            @Override // com.aspose.words.internal.zzZPQ.zzY
            public final boolean zzY(zzZ zzz) {
                return zzZPQ.zzZ(zzz, zzzpr);
            }

            @Override // com.aspose.words.internal.zzZPQ.zzY
            public final boolean zzZ(zzZ zzz) {
                return strZzk2.equalsIgnoreCase(zzz.getAttribute("Name"));
            }
        });
    }
}
