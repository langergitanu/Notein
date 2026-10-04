package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzMR {
    private static HashMap<String, zzMS> zzZpd = new HashMap<>();
    private static ArrayList<zzM6> zzZpc = new ArrayList<>();

    static {
        zzZVB();
    }

    public static zzOP zzSj(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXm(str);
        return (zzOP) com.aspose.words.internal.zzZKW.zzZ(zzZpd.get(str), zzOP.class);
    }

    public static zzMS zzSk(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXm(str);
        zzMS zzms = (zzMS) com.aspose.words.internal.zzQW.zzZ(zzZpd, str);
        return zzms == null ? new zzL7(str) : zzms;
    }

    private static void zzZ(zzMS zzms) {
        com.aspose.words.internal.zzZQF.zzY(zzZpd, zzms.getName(), zzms);
        zzM6 zzm6 = (zzM6) com.aspose.words.internal.zzZKW.zzZ(zzms, zzM6.class);
        if (zzm6 != null) {
            com.aspose.words.internal.zzZQG.zzZ(zzZpc, zzm6);
        }
    }

    private static void zzZVB() {
        zzZ(new zzRW());
        zzZ(new zzRU());
        zzZ(new zzRT());
        zzZ(new zzRS());
        zzZ(new zzRO());
        zzZ(new zzRQ());
        zzZ(new zzO4());
        zzZ(new zzO2());
        zzZ(new zzO1());
        zzZ(new zzO6());
        zzZ(new zzN9());
        zzZ(new zzN7());
        zzZ(new zzN6());
        zzZ(new zzNB());
        zzZ(new zzS7());
        zzZ(new zzS8());
        zzZ(new zzSA());
        zzZ(new zzS9());
        zzZ(new zzO9());
        zzZ(new zzOC());
        zzZ(new zzOD());
        zzZ(new zzOB());
        zzZ(new zzQD());
        zzZ(new zzPK());
        zzZ(new zzNC());
        zzZ(new zzN2());
        zzZ(new zzN4());
        zzZ(new zzN3());
        zzZ(new zzLQ());
        zzZ(new zzLK());
        zzZ(new zzKX());
        zzZ(new zzKU());
        zzZ(new zzO3());
        zzZ(new zzN8());
        zzZ(new zzL9());
        zzZ(new zzL0());
        zzZ(new zzPD());
        zzZ(new zzKW());
        zzZ(new zzNS());
        zzZ(new zzNW());
        zzZ(new zzQF());
        zzZ(new zzQL());
        zzZ(new zzRG());
        zzZ(new zzOV());
        zzZ(new zzNT());
        zzZ(new zzNX());
        zzZ(new zzR2());
        zzZ(new zzKY());
        zzZ(new zzLB());
        zzZ(new zzLI());
        zzZ(new zzLM());
        zzZ(new zzPJ());
        zzZ(new zzOH());
        zzZ(new zzQM());
        zzZ(new zzKZ());
        zzZ(new zzMH());
        zzZ(new zzN1());
        zzZ(new zzMY());
        zzZ(new zzP7());
        zzZ(new zzPB());
        zzZ(new zzP4());
        zzZ(new zzP6());
        zzZ(new zzP5());
        zzZ(new zzOG());
        zzZ(new zzP9());
        zzZ(new zzQX());
        zzZ(new zzR5());
        zzZ(new zzRJ());
        zzZ(new zzRA());
        zzZ(new zzR7());
        zzZ(new zzQU());
        zzZ(new zzQV());
        zzZ(new zzR3());
        zzZ(new zzRH());
        zzZ(new zzR8());
        zzZ(new zzRF());
        zzZ(new zzQY());
        zzZ(new zzR6());
        zzZ(new zzRK());
        zzZ(new zzRB());
        zzZ(new zzR0());
        zzZ(new zzQW());
        zzZ(new zzR4());
        zzZ(new zzRI());
        zzZ(new zzR9());
        zzZ(new zzSF());
        zzZ(new zzSK());
        zzZ(new zzT1());
        zzZ(new zzSO());
        zzZ(new zzSL());
        zzZ(new zzSC());
        zzZ(new zzSD());
        zzZ(new zzSI());
        zzZ(new zzSZ());
        zzZ(new zzSM());
        zzZ(new zzSH());
        zzZ(new zzSE());
        zzZ(new zzSJ());
        zzZ(new zzT0());
        zzZ(new zzSN());
        zzZ(new zzSV());
        zzZ(new zzSR());
        zzZ(new zzST());
        zzZ(new zzSP());
        zzZ(new zzSU());
        zzZ(new zzSQ());
        zzZ(new zzSW());
        zzZ(new zzSS());
        zzZ(new zzQ2());
        zzZ(new zzLW());
        zzZ(new zzLV());
        zzZ(new zzM0());
        zzZ(new zzLX());
        zzZ(new zzLZ());
        zzZ(new zzLY());
        zzZ(new zzPF());
        zzZ(new zzPG());
        zzZ(new zzPE());
        zzZ(new zzNE());
        zzZ(new zzLO());
        zzZ(new zzM1());
        zzZ(new zzRM());
        zzZ(new zzPI());
    }

    public static Collection<zzM6> zzZVC() {
        return zzZpc;
    }
}
