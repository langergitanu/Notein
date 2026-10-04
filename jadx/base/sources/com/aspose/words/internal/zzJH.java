package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJH implements zzGO {
    private static String zzT(zzJJ zzjj) {
        return zzjj.getFamily() == 1 ? "Symbol" : "Wingdings";
    }

    private static String zzU(zzJJ zzjj) {
        int family = zzjj.getFamily();
        if (family == 0) {
            return "Arial";
        }
        if (family == 1) {
            return "Times New Roman";
        }
        if (family == 2) {
            return "Arial";
        }
        if (family == 3) {
            return "Courier New";
        }
        if (family == 4 || family == 5) {
            return "Arial";
        }
        return null;
    }

    private static String zzV(zzJJ zzjj) {
        int family = zzjj.getFamily();
        if (family == 0 || family == 1) {
            return zzjj.getPitch() == 1 ? "MS Mincho" : "Times New Roman";
        }
        if (family == 2 || family == 3) {
            return zzjj.getPitch() == 1 ? "MS Gothic" : "Arial";
        }
        if (family == 4) {
            return "Bradley Hand ITC";
        }
        if (family != 5) {
            return null;
        }
        return "Gabriola";
    }

    private static boolean zzX(zzJW zzjw) {
        for (byte b : zzjw.getValues()) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzY(zzJW zzjw) {
        return (zzjw.getValues()[0] == 0 || zzjw.getValues()[0] == 1) ? false : true;
    }

    @Override // com.aspose.words.internal.zzGO
    public final String zzZ(zzJJ zzjj, Iterable<zzJU> iterable) {
        if (zzY(zzjj.zzHD())) {
            return null;
        }
        return !zzX(zzjj.zzHD()) ? "Courier New" : zzjj.getCharset() == 2 ? zzT(zzjj) : zzjj.zzHB().zzIa() == Integer.MIN_VALUE ? "Symbol" : zzjj.zzHB().zzIa() == 1 ? zzU(zzjj) : zzV(zzjj);
    }
}
