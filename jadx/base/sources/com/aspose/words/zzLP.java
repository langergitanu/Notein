package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLP {
    public static boolean zzY(zzPS zzps, boolean z) {
        zzPT zzptZzSx = zzps.zzSx("text-align");
        if (zzptZzSx != null && !zzptZzSx.zzZWj().zzP(zzL4.zzZmA) && (z || (!zzptZzSx.zzZWj().zzP(zzL4.zzZmH) && !zzptZzSx.zzZWj().zzP(zzL4.zzZmy)))) {
            if (!z) {
                return false;
            }
            if (!zzptZzSx.zzZWj().zzP(zzL4.zzZmG) && !zzptZzSx.zzZWj().zzP(zzL4.zzZmx)) {
                return false;
            }
        }
        return true;
    }

    public static void zzZ(zzPS zzps, boolean z, ParagraphFormat paragraphFormat) {
        zzPT zzptZzSx = zzps.zzSx("text-align");
        if (zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZmA)) {
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZmH) || zzptZzSx.zzZWj().zzP(zzL4.zzZmy)) {
            paragraphFormat.setAlignment(z ? 2 : 0);
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZmG) || zzptZzSx.zzZWj().zzP(zzL4.zzZmx)) {
            paragraphFormat.setAlignment(z ? 0 : 2);
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZmF) || zzptZzSx.zzZWj().zzP(zzL4.zzZmw)) {
            paragraphFormat.setAlignment(1);
        } else if (zzptZzSx.zzZWj().zzP(zzL4.zzZmE)) {
            paragraphFormat.setAlignment(3);
        }
    }
}
