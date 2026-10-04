package com.aspose.words;

import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zzJN {
    private static void zzY(String str, zzBW zzbw, zzZXR zzzxr) {
        if (zzbw == null) {
            return;
        }
        zzzxr.zzZlV().zzY(com.aspose.words.internal.zzZKN.format("{0}:contourClr", str));
        zzBN.zzW(str, zzbw, zzzxr);
        zzzxr.zzZlV().zzo();
    }

    public static void zzZ(zz2S zz2s, zzZXR zzzxr, boolean z) throws Exception {
        zzZ(z ? "w14" : "a", zz2s, zzzxr, false);
    }

    public static void zzZ(String str, zz2S zz2s, zzZXR zzzxr, boolean z) throws Exception {
        if (zz2s == null) {
            return;
        }
        if (z || !zz2s.zzZvC()) {
            String str2 = com.aspose.words.internal.zzZKN.format("{0}:scene3d", str);
            if ("dgm".equals(str)) {
                str = "a";
            }
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY(str2);
            zzZ(str, zz2s.zzZvF(), zzzydZzZlV, zzzxr.getCompliance());
            zzZ(str, zz2s.zzZvE(), zzzydZzZlV);
            zzZ(str, zz2s.zzZvD(), zzzxr);
            zz7Z.zzZ(zz2s.getExtensions(), zzzxr);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(String str, zz5Z zz5z, zzYU6 zzyu6) {
        zzyu6.zzY(com.aspose.words.internal.zzZKN.format("{0}:lightRig", str));
        zzyu6.zz0(zz56.zzZl(str, "rig"), zz84.zzIo(zz5z.zzZyN()));
        zzyu6.zz0(zz56.zzZl(str, "dir"), zz84.zzIn(zz5z.getDirection()));
        zzZ(str, zz5z.zzZPw(), zzyu6);
        zzyu6.zzo();
    }

    private static void zzZ(String str, zzHA zzha, zzZXR zzzxr) throws Exception {
        if (zzha == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:backdrop", str));
        zz3L zz3lZzZQo = zzha.zzZQo();
        zzH5.zzZ(com.aspose.words.internal.zzZKN.format("{0}:anchor", str), zz3lZzZQo.zzQb(), zz3lZzZQo.zzYm(), zz3lZzZQo.zzQa(), zzzydZzZlV);
        zz3L zz3lZzZQn = zzha.zzZQn();
        zzH5.zzY(com.aspose.words.internal.zzZKN.format("{0}:norm", str), zz3lZzZQn.zzQb(), zz3lZzZQn.zzYm(), zz3lZzZQn.zzQa(), zzzydZzZlV);
        zz3L zz3lZzZQm = zzha.zzZQm();
        zzH5.zzY(com.aspose.words.internal.zzZKN.format("{0}:up", str), zz3lZzZQm.zzQb(), zz3lZzZQm.zzYm(), zz3lZzZQm.zzQa(), zzzydZzZlV);
        zz7Z.zzZ(zzha.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzGO zzgo, zzYU6 zzyu6, int i) {
        boolean z = i == 2;
        zzyu6.zzY(com.aspose.words.internal.zzZKN.format("{0}:camera", str));
        zzyu6.zz0(zz56.zzZl(str, "prst"), zz84.zzIp(zzgo.zzZPy()));
        if (!com.aspose.words.internal.zzAN.zzL(zzgo.zzZPz().getValue() / 60000.0d, 180.0d)) {
            zzyu6.zzO(zz56.zzZl(str, "fov"), zzgo.zzZPz().getValue());
        }
        if (!com.aspose.words.internal.zzAN.zzL(zzgo.zzZPx(), 1.0d)) {
            zzyu6.zz0(zz56.zzZl(str, "zoom"), zz3W.zzS(zzgo.zzZPx(), z));
        }
        zzZ(str, zzgo.zzZPw(), zzyu6);
        zzyu6.zzo();
    }

    private static void zzZ(String str, zz33 zz33Var, zzYU6 zzyu6) {
        if (zz33Var == null) {
            return;
        }
        zzyu6.zzY(com.aspose.words.internal.zzZKN.format("{0}:rot", str));
        zzyu6.zzO(zz56.zzZl(str, "lat"), zz33Var.zzZw5().getValue());
        zzyu6.zzO(zz56.zzZl(str, "lon"), zz33Var.zzZw4().getValue());
        zzyu6.zzO(zz56.zzZl(str, "rev"), zz33Var.zzZw3().getValue());
        zzyu6.zzo();
    }

    public static void zzZ(zz2N zz2n, zzZXR zzzxr, boolean z) throws Exception {
        zzZ(z ? "w14" : "a", zz2n, zzzxr, false);
    }

    public static void zzZ(String str, zz2N zz2n, zzZXR zzzxr, boolean z) throws Exception {
        if (zz2n == null) {
            return;
        }
        if (z || !zz2n.zzZvC()) {
            String str2 = com.aspose.words.internal.zzZKN.format("{0}:{1}", str, "w14".equals(str) ? "props3d" : "sp3d");
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY(str2);
            zzzydZzZlV.zzN(zz56.zzZl(str, "extrusionH"), zz2n.zzZvn());
            zzzydZzZlV.zzN(zz56.zzZl(str, "contourW"), zz2n.zzZvo());
            zzzydZzZlV.zzA(zz56.zzZl(str, "prstMaterial"), zz84.zzIm(zz2n.zzZvm()), "warmMatte");
            zzzydZzZlV.zzN(zz56.zzZl(str, "z"), zz2n.zzQa());
            zzZ(str, "bevelT", zz2n.zzZvs(), zzzydZzZlV);
            zzZ(str, "bevelB", zz2n.zzZvr(), zzzydZzZlV);
            zzZ(str, zz2n.zzZvp(), zzzxr);
            zzY(str, zz2n.zzZvq(), zzzxr);
            zz7Z.zzZ("a", zz2n.getExtensions(), zzzxr);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(String str, zzBW zzbw, zzZXR zzzxr) {
        if (zzbw == null) {
            return;
        }
        zzzxr.zzZlV().zzY(com.aspose.words.internal.zzZKN.format("{0}:extrusionClr", str));
        zzBN.zzW(str, zzbw, zzzxr);
        zzzxr.zzZlV().zzo();
    }

    private static void zzZ(String str, String str2, zzH4 zzh4, zzYU6 zzyu6) {
        if (zzh4 == null) {
            return;
        }
        zzyu6.zzY(com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2));
        zzyu6.zzO(zz56.zzZl(str, "w"), zzh4.getWidth());
        zzyu6.zzO(zz56.zzZl(str, C18773h.f57233c), zzh4.getHeight());
        zzyu6.zz0(zz56.zzZl(str, "prst"), zz84.zzIl(zzh4.zzZQd()));
        zzyu6.zzo();
    }
}
