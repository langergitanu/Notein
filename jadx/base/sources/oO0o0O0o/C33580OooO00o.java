package oO0o0O0o;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: oO0o0O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33580OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33580OooO00o f121230OooO00o = new C33580OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Charset f121231OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile Charset f121232OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile Charset f121233OooO0Oo;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.OooOOO0.OooO0o(charsetForName, "forName(...)");
        f121231OooO0O0 = charsetForName;
        kotlin.jvm.internal.OooOOO0.OooO0o(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.OooOOO0.OooO0o(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.OooOOO0.OooO0o(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.OooOOO0.OooO0o(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.OooOOO0.OooO0o(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
