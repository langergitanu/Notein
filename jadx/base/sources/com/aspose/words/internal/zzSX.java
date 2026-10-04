package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSX implements zzGW {
    private static String zzQ3 = zzXF.zzI("All");
    private static String zzQ2 = zzXF.zzI("Any");
    private static String zzQ1 = zzXF.zzI("Average");
    private static String zzQ0 = zzXF.zzI("Concat");
    private static String zzPZ = zzXF.zzI("Contains");
    private static String zzPY = zzXF.zzI("Count");
    private static String zzPX = zzXF.zzI("Distinct");
    private static String zzPW = zzXF.zzI("ElementAt");
    private static String zzPV = zzXF.zzI("ElementAtOrDefault");
    private static String zzPU = zzXF.zzI("First");
    private static String zzPT = zzXF.zzI("FirstOrDefault");
    private static String zzPS = zzXF.zzI("Last");
    private static String zzPR = zzXF.zzI("LastOrDefault");
    private static String zzPQ = zzXF.zzI("Max");
    private static String zzPP = zzXF.zzI("Min");
    private static String zzPO = zzXF.zzI("Select");
    private static String zzPN = zzXF.zzI("SelectMany");
    private static String zzPM = zzXF.zzI("Single");
    private static String zzPL = zzXF.zzI("SingleOrDefault");
    private static String zzPK = zzXF.zzI("Skip");
    private static String zzPJ = zzXF.zzI("SkipWhile");
    private static String zzPI = zzXF.zzI("Sum");
    private static String zzPH = zzXF.zzI("Take");
    private static String zzPG = zzXF.zzI("TakeWhile");
    private static String zzPF = zzXF.zzI("Union");
    private static String zzPE = zzXF.zzI("Where");
    static zzGW zzPD = new zzSX();

    private zzSX() {
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzY(zzF6 zzf6, zzGY zzgy) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6) {
        return null;
    }

    private static zzH0 zzY(zzKO zzko, String str, zzKO[] zzkoArr, zzGY zzgy) {
        if (!Iterable.class.isAssignableFrom(zzko.getType())) {
            return null;
        }
        int length = zzkoArr.length;
        if (length == 0) {
            return zzY(zzko, str, zzgy);
        }
        if (length != 1) {
            return null;
        }
        return zzZ(zzko, str, zzkoArr[0], zzgy);
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzF6 zzZ(zzF6 zzf6, zzGY zzgy) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str) {
        return null;
    }

    @Override // com.aspose.words.internal.zzGW
    public final zzH0 zzZ(zzH0 zzh0, String str, zzH0[] zzh0Arr, zzGY zzgy) {
        return zzY(zzZ2.zzZ((zzKO) zzh0, zzgy), str, (zzKO[]) zzh0Arr, zzgy);
    }

    private static zzH0 zzY(zzKO zzko, String str, zzGY zzgy) {
        String str2 = zzQ2;
        int i = zzZOF.ORDINAL$4894b8c8;
        if (zzZKN.zzX(str, str2, i)) {
            return zzTP.zzQ(zzko);
        }
        if (zzZKN.zzX(str, zzPY, i)) {
            return zzS8.zzR(zzko, null);
        }
        if (zzZKN.zzX(str, zzPX, i)) {
            return zzA8.zzV(zzko, zzgy);
        }
        if (zzZKN.zzX(str, zzPU, i)) {
            return zz19.zze(zzko, null, zzgy);
        }
        if (zzZKN.zzX(str, zzPT, i)) {
            return zz19.zzd(zzko, null, zzgy);
        }
        if (zzZKN.zzX(str, zzPS, i)) {
            return zz19.zzc(zzko, null, zzgy);
        }
        if (zzZKN.zzX(str, zzPR, i)) {
            return zz19.zzb(zzko, null, zzgy);
        }
        if (zzZKN.zzX(str, zzPM, i)) {
            return zz19.zza(zzko, null, zzgy);
        }
        if (zzZKN.zzX(str, zzPL, i)) {
            return zz19.zz9(zzko, null, zzgy);
        }
        return null;
    }

    private static zzH0 zzZ(zzKO zzko, String str, zzKO zzko2, zzGY zzgy) {
        String str2 = zzQ3;
        int i = zzZOF.ORDINAL$4894b8c8;
        if (zzZKN.zzX(str, str2, i)) {
            return zzTP.zzU(zzko, zzko2);
        }
        if (zzZKN.zzX(str, zzQ2, i)) {
            return zzTP.zzT(zzko, zzko2);
        }
        if (zzZKN.zzX(str, zzQ1, i)) {
            return zzS.zzY(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzQ0, i)) {
            return zzA8.zzf(zzko, zzZ2.zzZ(zzko2, zzgy), zzgy);
        }
        if (zzZKN.zzX(str, zzPZ, i)) {
            return zzSE.zzR(zzko, zzko2);
        }
        if (zzZKN.zzX(str, zzPY, i)) {
            return zzS8.zzR(zzko, zzko2);
        }
        if (zzZKN.zzX(str, zzPW, i)) {
            return zz19.zz8(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPV, i)) {
            return zz19.zz7(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPU, i)) {
            return zz19.zze(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPT, i)) {
            return zz19.zzd(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPS, i)) {
            return zz19.zzc(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPR, i)) {
            return zz19.zzb(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPQ, i)) {
            return zzKI.zzP(zzko, zzko2);
        }
        if (zzZKN.zzX(str, zzPP, i)) {
            return zzKI.zzQ(zzko, zzko2);
        }
        if (zzZKN.zzX(str, zzPO, i)) {
            return zz0G.zz6(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPN, i)) {
            return zz0G.zz5(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPM, i)) {
            return zz19.zza(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPL, i)) {
            return zz19.zz9(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPK, i)) {
            return zzKC.zzj(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPJ, i)) {
            return zzKC.zzi(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPI, i)) {
            return zzS.zzZ(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPH, i)) {
            return zzKC.zzl(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPG, i)) {
            return zzKC.zzk(zzko, zzko2, zzgy);
        }
        if (zzZKN.zzX(str, zzPF, i)) {
            return zzA8.zzg(zzko, zzZ2.zzZ(zzko2, zzgy), zzgy);
        }
        if (zzZKN.zzX(str, zzPE, i)) {
            return zzKC.zzh(zzko, zzko2, zzgy);
        }
        return null;
    }
}
