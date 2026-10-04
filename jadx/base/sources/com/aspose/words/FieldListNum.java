package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldListNum extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\l", "\\s");

    private static int zzLU(String str) {
        int iZzZo;
        if (com.aspose.words.internal.zzZKN.zzU3(str) || !Character.isDigit(str.charAt(0)) || (iZzZo = com.aspose.words.internal.zzJB.zzZo(com.aspose.words.internal.zzZYD.zzXa(str))) == Integer.MIN_VALUE) {
            return -1;
        }
        return iZzZo;
    }

    public String getListLevel() {
        return zzZgq().zzt("\\l", false);
    }

    public String getListName() {
        return zzZgq().zzDG(0);
    }

    public String getStartingNumber() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1) ? 2 : 0;
    }

    public boolean hasListName() {
        return zzZgq().zzDI(0);
    }

    public void setListLevel(String str) throws Exception {
        zzZgq().zzZe("\\l", str);
    }

    public void setListName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setStartingNumber(String str) throws Exception {
        zzZgq().zzZe("\\s", str);
    }

    public final int zzZdb() {
        int iZzLU = zzLU(getStartingNumber());
        while (iZzLU > 9999) {
            iZzLU /= 10;
        }
        return iZzLU;
    }

    public final int zzZdc() {
        int iZzLU = zzLU(getListLevel());
        return iZzLU <= 0 ? iZzLU : iZzLU - 1;
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        return zzZPU.zzJ(this);
    }
}
