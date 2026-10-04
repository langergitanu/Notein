package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldCompare extends Field {
    public String getComparisonOperator() {
        return zzZgq().zzDG(1);
    }

    public String getLeftExpression() {
        return zzZgq().zzT(0, false, false);
    }

    public String getRightExpression() {
        return zzZgq().zzT(2, false, false);
    }

    public void setComparisonOperator(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setLeftExpression(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setRightExpression(String str) throws Exception {
        zzZgq().zzB(2, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzTL zztlZzZ = zzU2.zzZ(this, new zzZR0(zzZgq()));
        return !zztlZzZ.isError() ? new zzZP5(this, zztlZzZ) : new zzZP2(this, zztlZzZ.zz8W());
    }
}
