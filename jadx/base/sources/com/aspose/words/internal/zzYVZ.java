package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVZ {

    public static class zzZ extends RuntimeException {
        public zzZ(String str) {
            super(str);
        }
    }

    public static <T> T zzZ(zzZ5W zzz5w, T t, zzYRV<T> zzyrv) {
        try {
            if (zzyrv.zzWO(t)) {
                return t;
            }
            throw new zzYWR("Self test failed: " + zzz5w.getName());
        } catch (Exception e) {
            throw new zzYWR("Exception on self test: " + zzz5w.getName(), e);
        }
    }

    public static <T> T zzZ(zzZ5W zzz5w, T t, zzYRU<T> zzyru) {
        try {
            if (zzyru.zzWO(t)) {
                return t;
            }
            throw new zzYWR("Consistency test failed: " + zzz5w.getName());
        } catch (Exception e) {
            throw new zzYWR("Consistency test exception: " + zzz5w.getName(), e);
        }
    }

    public static <T> T zzZ(zzZ5W zzz5w, T t, zzYVN<T> zzyvn) {
        try {
            zzyvn.zzWN(t);
            return t;
        } catch (zzZ e) {
            throw new zzYWR(e.getMessage() + ": " + zzz5w.getName());
        } catch (Exception e2) {
            throw new zzYWR("Exception on self test: " + zzz5w.getName(), e2);
        }
    }
}
