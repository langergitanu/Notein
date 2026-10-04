package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzU2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("=", "<>", ">", "<", ">=", "<=");
    private zzZQM zzZts;
    private zzZ zzZtt;

    public static class zzZ {
        private boolean zzZtn;
        private String zzZto;
        private String zzZtp;
        private boolean zzZtq;
        private String zzZtr;

        public zzZ(zzZCZ zzzcz) throws Exception {
            zzZR8 zzzr8ZzZfm = zzzcz.zzZfm();
            if (zzzr8ZzZfm != null) {
                this.zzZtr = zzzr8ZzZfm.zzW2(true);
                this.zzZtq = zzZ(zzzcz.getLeftExpression(), zzzcz.zzZfm());
            } else {
                this.zzZtr = zzzcz.getLeftExpression();
            }
            this.zzZtp = zzzcz.getComparisonOperator();
            zzZR8 zzzr8ZzZfl = zzzcz.zzZfl();
            if (zzzr8ZzZfl == null) {
                this.zzZto = zzzcz.getRightExpression();
            } else {
                this.zzZto = zzzr8ZzZfl.zzW2(true);
                this.zzZtn = zzZ(zzzcz.getRightExpression(), zzzcz.zzZfl());
            }
        }

        private static boolean zzZ(String str, zzZR8 zzzr8) {
            return zzY0C.zzyz(str) && !zzZOO.zzM(zzzr8.zzZga());
        }

        public final String getComparisonOperator() {
            return this.zzZtp;
        }

        public final String getLeftExpression() {
            return this.zzZtr;
        }

        public final String getRightExpression() {
            return this.zzZto;
        }

        public final boolean zzZYV() {
            return this.zzZtn;
        }

        public final boolean zzZYW() {
            return this.zzZtq;
        }
    }

    private zzU2(Field field, zzZ zzz) {
        this.zzZtt = zzz;
        this.zzZts = new zzZQM(field);
    }

    private boolean zzS(String str, String str2, boolean z) {
        return ((z && (zzZYY() || zzZYX())) && (str2.indexOf(63) != -1 || str2.indexOf(42) != -1)) ? new com.aspose.words.internal.zzZNR(zzZz(str2, str)).zzUV(str) == zzZYY() : zzy(com.aspose.words.internal.zzZYD.zzd(str, str2), 0.0d);
    }

    public static boolean zzSQ(String str) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5;
    }

    private zzTL zzSR(String str) throws Exception {
        Bookmark bookmarkZzT = zzZOO.zzT(this.zzZts.getField(), str);
        if (bookmarkZzT != null) {
            return new zzY94(bookmarkZzT.zzYP(true));
        }
        return null;
    }

    private zzTL zzSS(String str) throws Exception {
        zzTL zztlZzW = zzZSH.zzW(this.zzZts, str);
        return zzZ(zztlZzW) ? zztlZzW : zzZSH.zzY(this.zzZts, str, true);
    }

    private static zzTL zzZ(zzTL zztl, String str) {
        return zzZ(zztl) ? zztl : new zzY94(str);
    }

    private boolean zzZYX() {
        return "<>".equals(this.zzZtt.getComparisonOperator());
    }

    private boolean zzZYY() {
        return "=".equals(this.zzZtt.getComparisonOperator());
    }

    private zzTL zzZYZ() throws Exception {
        zzTL zztlZzSS;
        zzTL zztlZzSS2;
        if (this.zzZtt.getLeftExpression() == null) {
            return new zzZU3("Error! Missing test condition.");
        }
        boolean z = true;
        if (this.zzZtt.getComparisonOperator() == null) {
            return new zzY0(true);
        }
        if (!zzSQ(this.zzZtt.getComparisonOperator())) {
            return new zzZU3("Error! Unknown op code for conditional.");
        }
        if (this.zzZtt.getRightExpression() == null) {
            return new zzZU3("Error! Missing second part of test condition.");
        }
        if (this.zzZtt.zzZYW() && this.zzZtt.zzZYV()) {
            zztlZzSS = new zzY94(this.zzZtt.getLeftExpression());
            zztlZzSS2 = new zzY94(this.zzZtt.getRightExpression());
        } else if (this.zzZtt.zzZYW()) {
            zztlZzSS = new zzY94(this.zzZtt.getLeftExpression());
            zztlZzSS2 = zzSR(this.zzZtt.getRightExpression());
        } else if (this.zzZtt.zzZYV()) {
            zztlZzSS = zzSR(this.zzZtt.getLeftExpression());
            if (zztlZzSS != null) {
                zztlZzSS2 = new zzY94(this.zzZtt.getRightExpression());
            } else {
                zztlZzSS = zzZSH.zzY(this.zzZts, this.zzZtt.getLeftExpression(), false);
                zztlZzSS2 = zzZSH.zzY(this.zzZts, this.zzZtt.getRightExpression(), true);
            }
        } else {
            zztlZzSS = zzSS(this.zzZtt.getLeftExpression());
            zztlZzSS2 = zzSS(this.zzZtt.getRightExpression());
        }
        zzTL zztlZzZ = zzZ(zztlZzSS, this.zzZtt.getLeftExpression());
        zzTL zztlZzZ2 = zzZ(zztlZzSS2, this.zzZtt.getRightExpression());
        boolean z2 = zztlZzZ instanceof zzY94;
        boolean z3 = zztlZzZ2 instanceof zzY94;
        if (!z2 && !z3) {
            return new zzY0(zzy(zztlZzZ.zz8Y(), zztlZzZ2.zz8Y()));
        }
        String strZz8W = z2 ? zztlZzZ.zz8W() : this.zzZtt.getLeftExpression();
        String strZz8W2 = z3 ? zztlZzZ2.zz8W() : this.zzZtt.getRightExpression();
        if (!this.zzZtt.zzZYV() && !com.aspose.words.internal.zzZKN.zzU3(strZz8W2) && Character.isDigit(strZz8W2.charAt(0))) {
            z = false;
        }
        return new zzY0(zzS(strZz8W, strZz8W2, z));
    }

    private static String zzZz(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder("\\A");
        int length = str.length();
        int iIndexOf = str.indexOf(42);
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            if (str2.length() == iIndexOf) {
                str = com.aspose.words.internal.zzZKN.zzZ(str, '*', '?');
            } else if (iIndexOf == length - 2) {
                str = com.aspose.words.internal.zzZKN.zzn(str, i);
            } else if (iIndexOf == str2.length() - 1) {
                str = com.aspose.words.internal.zzZKN.zzn(str, iIndexOf + 1);
            } else if (iIndexOf > 1) {
                int length2 = (str.length() - 1) - iIndexOf;
                if (length2 > iIndexOf) {
                    length2 = iIndexOf;
                }
                str = com.aspose.words.internal.zzZKN.zzT(str, iIndexOf + 1, length2);
            } else {
                int length3 = ((str.length() - iIndexOf) - 1) - ((str2.length() - iIndexOf) - 1);
                if (length3 <= 0) {
                    length3 = 1;
                }
                str = com.aspose.words.internal.zzZKN.zzT(str, iIndexOf + 1, length3);
            }
        }
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '*') {
                if (z2) {
                    com.aspose.words.internal.zzZNH.zzU(sb, ".*");
                    z2 = false;
                } else {
                    com.aspose.words.internal.zzZNH.zzU(sb, "\\u");
                    com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWu(cCharAt));
                }
                z = i2 == length + (-1);
            } else if (cCharAt != '?') {
                com.aspose.words.internal.zzZNH.zzU(sb, "\\u");
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWu(cCharAt));
            } else {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            }
            i2++;
            if (z) {
                break;
            }
        }
        com.aspose.words.internal.zzZNH.zzU(sb, "\\z");
        return sb.toString();
    }

    private boolean zzy(double d, double d2) {
        int iZzTP = zzUR.zzTP(this.zzZtt.getComparisonOperator());
        if (iZzTP == 0) {
            return d == d2;
        }
        if (iZzTP == 1) {
            return d != d2;
        }
        if (iZzTP == 2) {
            return d > d2;
        }
        if (iZzTP == 3) {
            return d < d2;
        }
        if (iZzTP == 4) {
            return d >= d2;
        }
        if (iZzTP == 5) {
            return d <= d2;
        }
        throw new IllegalArgumentException();
    }

    private static boolean zzZ(zzTL zztl) {
        return (zztl == null || zztl.isError() || (zztl instanceof zzY0)) ? false : true;
    }

    public static zzTL zzZ(Field field, zzZCZ zzzcz) throws Exception {
        ComparisonEvaluationResult comparisonEvaluationResultEvaluate;
        IComparisonExpressionEvaluator comparisonExpressionEvaluator = field.getStart().zzYBb().getFieldOptions().getComparisonExpressionEvaluator();
        if (comparisonExpressionEvaluator != null && (comparisonEvaluationResultEvaluate = comparisonExpressionEvaluator.evaluate(field, new ComparisonExpression(zzzcz.getLeftExpression(), zzzcz.getComparisonOperator(), zzzcz.getRightExpression()))) != null) {
            if (com.aspose.words.internal.zzZKN.zzU3(comparisonEvaluationResultEvaluate.getErrorMessage())) {
                return new zzY0(comparisonEvaluationResultEvaluate.getResult());
            }
            return new zzZU3(comparisonEvaluationResultEvaluate.getErrorMessage());
        }
        return new zzU2(field, new zzZ(zzzcz)).zzZYZ();
    }
}
