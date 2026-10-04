package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZG {

    public static class zzZ extends RuntimeException {
        public zzZ(String str) {
            super(str);
        }
    }

    public static <T> T zzZ(zzZ1P zzz1p, T t, zzYRV<T> zzyrv) {
        try {
            if (zzyrv.zzWO(t)) {
                return t;
            }
            zzZ0L.zzZ(new zzZ0N("Self test failed", zzz1p));
            return t;
        } catch (Exception e) {
            zzZ0L.zzZ(new zzZ0N(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Exception on self test: ")), zzz1p));
            return null;
        }
    }

    public static <T> T zzZ(zzZ1P zzz1p, T t, zzYZD<T> zzyzd) {
        try {
            zzyzd.zzWN(t);
            return t;
        } catch (zzZ e) {
            zzZ0L.zzZ(new zzZ0N(e.getMessage(), zzz1p));
            return null;
        } catch (Exception e2) {
            zzZ0L.zzZ(new zzZ0N(OooOO0.OooO0OO.OooO0Oo(e2, new StringBuilder("Exception on self test: ")), zzz1p));
            return null;
        }
    }

    public static void zzZ(zzZ1P zzz1p, zzYZE zzyze) {
        try {
            if (zzz1p.equals(zzyze.zzXF4())) {
                zzyze.zzXG9();
            } else {
                throw new zzZ("Inconsistent algorithm tag for " + zzz1p);
            }
        } catch (zzZ e) {
            zzZ0L.zzZ(new zzZ0N(e.getMessage(), zzz1p));
        } catch (Exception e2) {
            zzZ0L.zzZ(new zzZ0N(OooOO0.OooO0OO.OooO0Oo(e2, new StringBuilder("Exception on self test: ")), zzz1p));
        }
    }

    public static <T> T zzZ(zzZ1P zzz1p, T t, zzYRU<T> zzyru) {
        try {
            if (zzyru.zzWO(t)) {
                return t;
            }
            zzZ0L.zzZ(new zzZ1N("Consistency test failed", zzz1p));
            return t;
        } catch (Exception e) {
            zzZ0L.zzZ(new zzZ1N(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Exception on consistency test: ")), zzz1p));
            return null;
        }
    }
}
