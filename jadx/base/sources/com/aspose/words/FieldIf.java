package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldIf extends Field implements zzZAA {
    private zzTL zzYDT;

    public static class zzZ implements zzZCZ {
        private static com.aspose.words.internal.zzZNR zzYDR = new com.aspose.words.internal.zzZNR("^[0-9]+$", 0);
        private C19078zzZ zzYDS;

        /* JADX INFO: renamed from: com.aspose.words.FieldIf$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19078zzZ {
            private zzZR8 zzYDN;
            private zzZR8 zzYDO;
            private zzZR8 zzYDP;
            private zzZR8 zzYDQ;
            private String zzZto;
            private String zzZtp;
            private String zzZtr;

            public C19078zzZ(zzZR8 zzzr8, String str, String str2, zzZR8 zzzr82, String str3, zzZR8 zzzr83, zzZR8 zzzr84) {
                this.zzZtr = str;
                this.zzZtp = str2;
                this.zzZto = str3;
                this.zzYDO = zzzr83;
                this.zzYDN = zzzr84;
                this.zzYDQ = zzzr8;
                this.zzYDP = zzzr82;
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

            public final zzZR8 zzZdK() {
                return this.zzYDN;
            }

            public final zzZR8 zzZdL() {
                return this.zzYDO;
            }

            public final zzZR8 zzZfl() {
                return this.zzYDP;
            }

            public final zzZR8 zzZfm() {
                return this.zzYDQ;
            }
        }

        public zzZ(zzZR1 zzzr1) {
            C19078zzZ c19078zzZ = new C19078zzZ(zzzr1.zzDH(0), zzzr1.zzT(0, false, false), zzzr1.zzT(1, false, false), zzzr1.zzDH(2), zzzr1.zzT(2, false, false), zzzr1.zzDH(3), zzzr1.zzDH(4));
            this.zzYDS = (zzZ(zzzr1, c19078zzZ) != null ? zzZ(zzzr1, c19078zzZ) : zzY(zzzr1, c19078zzZ)) != null ? zzZ(zzzr1, c19078zzZ) != null ? zzZ(zzzr1, c19078zzZ) : zzY(zzzr1, c19078zzZ) : c19078zzZ;
        }

        private static C19078zzZ zzY(zzZR1 zzzr1, C19078zzZ c19078zzZ) {
            if (zzzr1.zzZfD().size() < 2 || zzU2.zzSQ(c19078zzZ.getComparisonOperator()) || zzYDR.zzUV(c19078zzZ.getLeftExpression())) {
                return null;
            }
            return new C19078zzZ(null, "", "=", null, "", zzzr1.zzDH(1), zzzr1.zzDH(1));
        }

        private static C19078zzZ zzZ(zzZR1 zzzr1, C19078zzZ c19078zzZ) {
            if (zzzr1.zzZfD().size() >= 2 && !zzU2.zzSQ(c19078zzZ.getComparisonOperator()) && zzU2.zzSQ(c19078zzZ.getLeftExpression())) {
                return new C19078zzZ(null, "", "=", null, "", zzzr1.zzDH(1), zzzr1.zzDH(1));
            }
            return null;
        }

        @Override // com.aspose.words.zzZCZ
        public final String getComparisonOperator() {
            return this.zzYDS.getComparisonOperator();
        }

        @Override // com.aspose.words.zzZCZ
        public final String getLeftExpression() {
            return this.zzYDS.getLeftExpression();
        }

        @Override // com.aspose.words.zzZCZ
        public final String getRightExpression() {
            return this.zzYDS.getRightExpression();
        }

        public final zzZR8 zzZdK() {
            return this.zzYDS.zzZdK();
        }

        public final zzZR8 zzZdL() {
            return this.zzYDS.zzZdL();
        }

        @Override // com.aspose.words.zzZCZ
        public final zzZR8 zzZfl() {
            return this.zzYDS.zzZfl();
        }

        @Override // com.aspose.words.zzZCZ
        public final zzZR8 zzZfm() {
            return this.zzYDS.zzZfm();
        }
    }

    private zzZR8 zzZdM() {
        return this.zzYDT.zz8X() ? zzZdN().zzZdL() : zzZdN().zzZdK();
    }

    private zzZ zzZdN() {
        return new zzZ(zzZgq());
    }

    private zzTL zzZdO() throws Exception {
        return zzU2.zzZ(this, zzZdN());
    }

    private void zzZdP() throws Exception {
        if (this.zzYDT != null) {
            return;
        }
        this.zzYDT = zzZdO();
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean canWorkAsMergeField() throws Exception {
        if (!getStart().zzYBb().getMailMerge().getUseNonMergeFields()) {
            return false;
        }
        zzZ zzzZzZdN = zzZdN();
        return "0".equals(zzzZzZdN.getLeftExpression()) && "=".equals(zzzZzZdN.getComparisonOperator()) && "0".equals(zzzZzZdN.getRightExpression());
    }

    public int evaluateCondition() throws Exception {
        zzTL zztlZzZdO = zzZdO();
        if (zztlZzZdO.isError()) {
            return 0;
        }
        return zztlZzZdO.zz8X() ? 1 : 2;
    }

    public String getComparisonOperator() {
        return zzZgq().zzDG(1);
    }

    public String getFalseText() {
        return zzZgq().zzDG(4);
    }

    public String getLeftExpression() {
        return zzZgq().zzT(0, false, false);
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFieldName() {
        return com.aspose.words.internal.zzZKN.zzT(com.aspose.words.internal.zzZKN.zzU(zzY0C.zzyA(zzZdN().zzZdL().zzW2(true)), '{'), '}');
    }

    public String getRightExpression() {
        return zzZgq().zzT(2, false, false);
    }

    public String getTrueText() {
        return zzZgq().zzDG(3);
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean isMergeValueRequired() {
        return false;
    }

    public void setComparisonOperator(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setFalseText(String str) throws Exception {
        zzZgq().zzB(4, str);
    }

    public void setLeftExpression(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setRightExpression(String str) throws Exception {
        zzZgq().zzB(2, str);
    }

    public void setTrueText(String str) throws Exception {
        zzZgq().zzB(3, str);
    }

    @Override // com.aspose.words.Field
    public final int zzY(zzZBF zzzbf) throws Exception {
        int iZzZb9 = zzZgn().zzZb9();
        if (iZzZb9 == 0) {
            return (zzzbf == zzZdN().zzZdL() || zzzbf == zzZdN().zzZdK()) ? 1 : 0;
        }
        if (iZzZb9 != 1) {
            throw new IllegalArgumentException();
        }
        if (zzzbf != zzZdN().zzZdL() && zzzbf != zzZdN().zzZdK()) {
            return 1;
        }
        zzZdP();
        return (this.zzYDT.isError() || zzzbf != zzZdM()) ? 3 : 0;
    }

    @Override // com.aspose.words.Field
    public final void zzZ(zzZBF zzzbf) throws Exception {
        zzZ zzzZzZdN = zzZdN();
        if (zzzbf == zzzZzZdN.zzZfm() || zzzbf == zzzZzZdN.zzZfl()) {
            this.zzYDT = null;
        }
        super.zzZ(zzzbf);
    }

    public final zzZR8 zzZdK() {
        return zzZdN().zzZdK();
    }

    public final zzZR8 zzZdL() {
        return zzZdN().zzZdL();
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZdP();
        zzZP6 zzzp5 = !this.zzYDT.isError() ? new zzZP5(this, zzZdM()) : new zzZP2(this, this.zzYDT.zz8W());
        this.zzYDT = null;
        return zzzp5;
    }

    @Override // com.aspose.words.Field
    public final void zzZgV() {
        zzW4(true);
        super.zzZgV();
    }

    @Override // com.aspose.words.Field
    public final zzZA2 zzZgk() {
        return new zzZQ6(getStart().zzYBb());
    }

    @Override // com.aspose.words.Field
    public final boolean zzZgu() {
        return !zzZgt();
    }
}
