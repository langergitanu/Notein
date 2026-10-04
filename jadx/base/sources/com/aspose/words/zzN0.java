package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzN0 extends zzMG {
    private zzMZ zzZps;
    private zzPS zzZq9;

    public zzN0(zzMZ zzmz, zzPS zzps) {
        super(3);
        this.zzZps = zzmz;
        this.zzZq9 = zzps;
    }

    public final zzN0 zzSq(String str) {
        zzPS zzpsZzSA = this.zzZq9.zzSA(str);
        return com.aspose.words.internal.zzZKO.zzA(this.zzZq9, zzpsZzSA) ? this : new zzN0(this.zzZps, zzpsZzSA);
    }

    public final zzMZ zzZVL() {
        return this.zzZps;
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }

    @Override // com.aspose.words.zzMG
    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, "@page");
        String strZzZXu = this.zzZps.zzZXu();
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZXu)) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, strZzZXu);
        }
        com.aspose.words.internal.zzZNH.zzU(sb, " { ");
        com.aspose.words.internal.zzZNH.zzU(sb, this.zzZq9.zzZWh().zzZXu());
        com.aspose.words.internal.zzZNH.zzU(sb, " }");
        return sb.toString();
    }
}
