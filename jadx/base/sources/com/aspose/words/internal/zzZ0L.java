package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ0L {
    private static volatile Throwable zzWd5;
    private static volatile zzZ zzWd6;
    private static final String[] zzWd7 = {zzZ1T.class.getName(), zzZ0I.class.getName(), zzZ1M.class.getName(), zzZ1L.class.getName(), zzZ1K.class.getName(), zzZ1H.class.getName(), zzZ1D.class.getName(), zzZ0T.class.getName(), zzZ0Q.class.getName(), zzZ0P.class.getName()};

    public static class zzZ {
        public zzZ() throws Exception {
            for (String str : zzZ0L.zzWd7) {
                if (!zzZ0L.zzXEf()) {
                    zzZ0L.zzwF(str);
                }
            }
        }
    }

    public static boolean isReady() {
        synchronized ("READY") {
            if (zzWd6 == null && zzWd5 == null) {
                try {
                    zzWd6 = new zzZ();
                } catch (Exception e) {
                    zzWd5 = e;
                    zzZ(new zzZ14("Module startup failed: " + e.getMessage(), e));
                }
            } else if (zzWd5 != null) {
                throw new zzZ14("Module in error status: " + zzWd5.getMessage(), zzWd5);
            }
        }
        return true;
    }

    public static boolean zzXEf() {
        return zzWd5 != null;
    }

    public static String zzXEg() {
        try {
            isReady();
        } catch (zzZ14 unused) {
        }
        return zzWd5 != null ? zzWd5.getMessage() : "READY";
    }

    public static void zzZ(zzZ14 zzz14) {
        zzWd5 = zzz14;
        throw zzz14;
    }

    public static void zzwE(String str) {
        zzZ(new zzZ14(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzwF(String str) {
        try {
            Class.forName(str);
        } catch (ClassNotFoundException e) {
            zzWd5 = e;
            throw new IllegalStateException("Unable to initialize module: " + e.getMessage(), e);
        } catch (ExceptionInInitializerError e2) {
            if (e2.getCause() != null) {
                zzWd5 = e2.getCause();
            } else {
                zzWd5 = e2;
            }
            throw e2;
        }
    }
}
