package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOX {
    public static void zzW(zzPS zzps, Shape shape) {
        zzPT zzptZzSx = zzps.zzSx("background-color");
        zzPT zzptZzSx2 = zzps.zzSx("border-top-color");
        zzPT zzptZzSx3 = zzps.zzSx("border-right-color");
        zzPT zzptZzSx4 = zzps.zzSx("border-bottom-color");
        zzPT zzptZzSx5 = zzps.zzSx("border-left-color");
        if (zzptZzSx != null && zzptZzSx2 != null && zzptZzSx3 != null && zzptZzSx4 != null && zzptZzSx5 != null && zzptZzSx.zzZWj().zzX(zzptZzSx2.zzZWj()) && zzptZzSx.zzZWj().zzX(zzptZzSx3.zzZWj()) && zzptZzSx.zzZWj().zzX(zzptZzSx4.zzZWj()) && zzptZzSx.zzZWj().zzX(zzptZzSx5.zzZWj())) {
            shape.zzY9h().zzZyf().setNoShade(true);
        }
        zzPT zzptZzSx6 = zzps.zzSx("border-top-style");
        zzPT zzptZzSx7 = zzps.zzSx("border-right-style");
        zzPT zzptZzSx8 = zzps.zzSx("border-bottom-style");
        zzPT zzptZzSx9 = zzps.zzSx("border-left-style");
        if (zzptZzSx6 == null || !zzptZzSx6.zzZWj().zzP(zzL4.zzZno) || zzptZzSx7 == null || !zzptZzSx7.zzZWj().zzP(zzL4.zzZno) || zzptZzSx8 == null || !zzptZzSx8.zzZWj().zzP(zzL4.zzZno) || zzptZzSx9 == null || !zzptZzSx9.zzZWj().zzP(zzL4.zzZno)) {
            return;
        }
        shape.zzY9h().zzZyf().setNoShade(true);
    }
}
