package pdfcpu_mobile;

import p614go.Seq;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Pdfcpu_mobile {
    static {
        Seq.touch();
        _init();
    }

    private Pdfcpu_mobile() {
    }

    private static native void _init();

    public static native void init();

    public static native void merge2(String str, String str2, String str3) throws Exception;

    public static native void optimize(String str, String str2) throws Exception;

    public static native long pageCount(String str) throws Exception;

    public static void touch() {
    }
}
