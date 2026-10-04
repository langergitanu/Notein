package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOZ {
    public static void zzW(zzPS zzps, Shape shape) {
        zzPT zzptZzSx = zzps.zzSx("margin-left");
        zzPT zzptZzSx2 = zzps.zzSx("margin-right");
        if (zzptZzSx == null || zzptZzSx2 == null) {
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZng) && zzptZzSx2.zzZWj().zzP(zzL4.zzZng)) {
            shape.zzY9h().zzZyf().zzAc(1);
            return;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZnl) && zzptZzSx2.zzZWj().zzP(zzL4.zzZng)) {
            shape.zzY9h().zzZyf().zzAc(0);
        } else if (zzptZzSx.zzZWj().zzP(zzL4.zzZng) && zzptZzSx2.zzZWj().zzP(zzL4.zzZnl)) {
            shape.zzY9h().zzZyf().zzAc(2);
        }
    }
}
