package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL0 {
    public static boolean zzZ(zzYAU zzyau, char c) {
        return zzZ(c, zzZV(zzyau.zzY6N().getLocaleIdFarEast(), zzyau.zzab().zzZp0().zza7().getUseAltKinsokuLineBreakRules()));
    }

    private static String zzZV(int i, boolean z) {
        if (i != 4) {
            if (i != 1028) {
                if (i != 2052) {
                    if (i != 3076) {
                        if (i != 4100) {
                            if (i != 5124 && i != 31748) {
                                if (i != 17) {
                                    if (i == 18) {
                                        return ".,:;])}%?!";
                                    }
                                    if (i != 1041) {
                                        return i != 1042 ? "" : ".,:;])}%?!";
                                    }
                                }
                                return z ? ",.、。，．｡､" : ",.’”、。」』】），．］｝｡､";
                            }
                        }
                    }
                }
            }
            return z ? "!),.:;?]}" : "!),.:;?]}’”′、。〉》」』】〕〞﹚﹜﹞！），．：；？］｝";
        }
        return z ? "!),.:;?]}" : "!%),.:;>?]}¢°ˇ’”‰′″℃∶、。〃〉》」』】〕〗〞﹚﹜﹞！＂％＇），．：；？］｝￠";
    }

    private static boolean zzZ(char c, String str) {
        return str.indexOf(c) != -1;
    }
}
