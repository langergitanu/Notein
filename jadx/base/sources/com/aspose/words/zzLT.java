package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLT extends zzMG {
    private zzMD[] zzZot;
    private zzPS zzZq9;

    public zzLT() {
        super(0);
    }

    public final zzLT zzSc(String str) {
        zzPS zzpsZzSA = this.zzZq9.zzSA(str);
        return com.aspose.words.internal.zzZKO.zzA(this.zzZq9, zzpsZzSA) ? this : new zzLT(this.zzZot, zzpsZzSA);
    }

    public final zzMD[] zzZUV() {
        return this.zzZot;
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }

    @Override // com.aspose.words.zzMG
    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        for (zzMD zzmd : this.zzZot) {
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, ", ");
            }
            com.aspose.words.internal.zzZNH.zzU(sb, zzmd.zzZXu());
        }
        com.aspose.words.internal.zzZNH.zzU(sb, " { ");
        com.aspose.words.internal.zzZNH.zzU(sb, this.zzZq9.zzZWh().zzZXu());
        com.aspose.words.internal.zzZNH.zzU(sb, " }");
        return sb.toString();
    }

    private zzLT(zzMD zzmd, zzPS zzps) {
        this(new zzMD[]{zzmd}, zzps);
    }

    public zzLT(zzMD[] zzmdArr, zzPS zzps) {
        this();
        this.zzZot = zzmdArr;
        this.zzZq9 = zzps;
    }

    public zzLT(zzMD zzmd, zzLU zzlu) {
        this(zzmd, zzlu.zzZWe());
    }

    public zzLT(zzMD[] zzmdArr, zzLU zzlu) {
        this(zzmdArr, zzlu.zzZWe());
    }
}
