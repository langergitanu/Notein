package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldInfo extends Field implements zzZBA {

    public static class zzZ implements zzZBB {
        private zzZR1 zzYFN;

        public zzZ(zzZR1 zzzr1) {
            this.zzYFN = zzzr1;
        }

        @Override // com.aspose.words.zzZBB
        public final String zzDG(int i) {
            return this.zzYFN.zzDG(i + 1);
        }

        @Override // com.aspose.words.zzZBB
        public final boolean zzMj(String str) {
            return this.zzYFN.zzMj(str);
        }
    }

    private zzZB5 zzZdd() {
        String infoType = getInfoType();
        if (com.aspose.words.internal.zzZKN.zzU3(infoType)) {
            return null;
        }
        int iZzLE = zzZOO.zzLE(infoType);
        if (iZzLE == 69) {
            return FieldFileSize.zzYGm;
        }
        switch (iZzLE) {
        }
        return null;
    }

    public String getInfoType() {
        return zzZgq().zzDG(0);
    }

    public String getNewValue() {
        return zzZgq().zzDG(1);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzMk = FieldFileSize.zzMk(str);
        if (iZzMk != 0) {
            return iZzMk;
        }
        int iZzMk2 = FieldFileName.zzMk(str);
        return iZzMk2 != 0 ? iZzMk2 : FieldTemplate.zzMk(str);
    }

    public void setInfoType(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setNewValue(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZB5 zzzb5ZzZdd = zzZdd();
        if (zzzb5ZzZdd == null) {
            return new zzZP2(this, "Error! Unknown info keyword.");
        }
        return new zzZP5(this, zzzb5ZzZdd.zzW(getStart().zzYBb(), new zzZ(zzZgq())));
    }
}
