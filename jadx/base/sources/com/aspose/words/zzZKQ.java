package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKQ extends zzYBS {
    private static com.aspose.words.internal.zzD6 zzYtG;

    static {
        com.aspose.words.internal.zzD6 zzd6 = new com.aspose.words.internal.zzD6();
        zzYtG = zzd6;
        zzd6.zzV(96536041, (char) 64298);
        zzYtG.zzV(96601577, (char) 64299);
        zzYtG.zzV(96598857, (char) 64300);
        zzYtG.zzV(96664393, (char) 64301);
        zzYtG.zzV(95880656, (char) 64302);
        zzYtG.zzV(95946192, (char) 64303);
        zzYtG.zzV(96208336, (char) 64304);
        zzYtG.zzV(96208337, (char) 64305);
        zzYtG.zzV(96208338, (char) 64306);
        zzYtG.zzV(96208339, (char) 64307);
        zzYtG.zzV(96208340, (char) 64308);
        zzYtG.zzV(96208341, (char) 64309);
        zzYtG.zzV(96208342, (char) 64310);
        zzYtG.zzV(96208344, (char) 64312);
        zzYtG.zzV(96208345, (char) 64313);
        zzYtG.zzV(96208346, (char) 64314);
        zzYtG.zzV(96208347, (char) 64315);
        zzYtG.zzV(96208348, (char) 64316);
        zzYtG.zzV(96208350, (char) 64318);
        zzYtG.zzV(96208352, (char) 64320);
        zzYtG.zzV(96208353, (char) 64321);
        zzYtG.zzV(96208355, (char) 64323);
        zzYtG.zzV(96208356, (char) 64324);
        zzYtG.zzV(96208358, (char) 64326);
        zzYtG.zzV(96208359, (char) 64327);
        zzYtG.zzV(96208360, (char) 64328);
        zzYtG.zzV(96208361, (char) 64329);
        zzYtG.zzV(96208362, (char) 64330);
        zzYtG.zzV(96011733, (char) 64331);
        zzYtG.zzV(96404945, (char) 64332);
        zzYtG.zzV(96404955, (char) 64333);
        zzYtG.zzV(96404964, (char) 64334);
    }

    public zzZKQ(zzYE8 zzye8) {
        super(zzye8);
    }

    @Override // com.aspose.words.zzYBS
    public final void apply() {
        char c = 65535;
        int length = 0;
        for (int i = 0; i < this.zzXpP.getLength(); i++) {
            char c2 = this.zzXpP.get(i);
            if (com.aspose.words.internal.zzZVU.zza(c2) == 0) {
                length = this.zzXeJ.getLength();
                c = c2;
            }
            char c3 = zzYtG.get((c2 << 16) | c);
            if (com.aspose.words.internal.zzD6.zzx(c3)) {
                this.zzXeJ.zzM(c2, i);
            } else {
                zzT(c3, length, i);
                c = c3;
            }
        }
        this.zzXeJ.zzYdp();
    }
}
