package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3F {
    private static boolean zzWZY;
    private static int zzWZZ;
    private static ThreadLocal<Integer> zzX00 = new ThreadLocal<Integer>() { // from class: com.aspose.words.zzY3F.1
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Integer initialValue() {
            return 0;
        }
    };

    static {
        clear();
    }

    private static void clear() {
        zzWZZ = 48;
        zzWZY = true;
        zzX00.set(0);
    }

    public static void zzXTO() {
        zzWZY = false;
    }

    public static int zzXTP() {
        return zzWZZ;
    }

    public static int zzXTQ() {
        return zzX00.get().intValue();
    }

    public static int zzXTR() {
        return (zzWZZ != 128 || zzWZY) ? 4096 : 256;
    }

    public static void zzjd(int i) {
        zzWZZ = i;
    }

    public static void zzje(int i) {
        zzX00.set(Integer.valueOf(i));
    }
}
