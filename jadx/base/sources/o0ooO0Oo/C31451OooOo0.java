package o0ooO0Oo;

import java.util.HashMap;

/* JADX INFO: renamed from: o0ooO0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31451OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f112481OooO00o = new int[256];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f112482OooO0O0 = new HashMap(256);

    static {
        for (int i = 0; i < 256; i++) {
            if ((i <= 23 || i >= 32) && ((i <= 126 || i >= 161) && i != 173)) {
                OooO00o(i, (char) i);
            }
        }
        OooO00o(24, (char) 728);
        OooO00o(25, (char) 711);
        OooO00o(26, (char) 710);
        OooO00o(27, (char) 729);
        OooO00o(28, (char) 733);
        OooO00o(29, (char) 731);
        OooO00o(30, (char) 730);
        OooO00o(31, (char) 732);
        OooO00o(127, (char) 65533);
        OooO00o(128, (char) 8226);
        OooO00o(129, (char) 8224);
        OooO00o(130, (char) 8225);
        OooO00o(131, (char) 8230);
        OooO00o(132, (char) 8212);
        OooO00o(133, (char) 8211);
        OooO00o(134, (char) 402);
        OooO00o(135, (char) 8260);
        OooO00o(136, (char) 8249);
        OooO00o(137, (char) 8250);
        OooO00o(138, (char) 8722);
        OooO00o(139, (char) 8240);
        OooO00o(140, (char) 8222);
        OooO00o(141, (char) 8220);
        OooO00o(142, (char) 8221);
        OooO00o(143, (char) 8216);
        OooO00o(144, (char) 8217);
        OooO00o(145, (char) 8218);
        OooO00o(146, (char) 8482);
        OooO00o(147, (char) 64257);
        OooO00o(148, (char) 64258);
        OooO00o(149, (char) 321);
        OooO00o(150, (char) 338);
        OooO00o(151, (char) 352);
        OooO00o(152, (char) 376);
        OooO00o(153, (char) 381);
        OooO00o(154, (char) 305);
        OooO00o(155, (char) 322);
        OooO00o(156, (char) 339);
        OooO00o(157, (char) 353);
        OooO00o(158, (char) 382);
        OooO00o(159, (char) 65533);
        OooO00o(160, (char) 8364);
    }

    public static void OooO00o(int i, char c) {
        f112481OooO00o[i] = c;
        f112482OooO0O0.put(Character.valueOf(c), Integer.valueOf(i));
    }
}
