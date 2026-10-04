package oO00000o;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes10.dex */
public enum OooO0o {
    AUTHENTICATION(154, 6275333),
    SIGNATURE(156, 6275338),
    KEY_MANAGEMENT(157, 6275339),
    CARD_AUTH(158, 6275329),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED1(130, 6275341),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED2(131, 6275342),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED3(132, 6275343),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED4(133, 6275344),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED5(134, 6275345),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED6(135, 6275346),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED7(136, 6275347),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED8(137, 6275348),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED9(138, 6275349),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED10(139, 6275350),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED11(140, 6275351),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED12(141, 6275352),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED13(142, 6275353),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED14(143, 6275354),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED15(144, 6275355),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED16(145, 6275356),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED17(146, 6275357),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED18(147, 6275358),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED19(148, 6275359),
    /* JADX INFO: Fake field, exist only in values array */
    RETIRED20(149, 6275360),
    /* JADX INFO: Fake field, exist only in values array */
    ATTESTATION(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, 6291201);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f113762OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f113763OooOo0o;

    OooO0o(int i, int i2) {
        this.f113763OooOo0o = i;
        this.f113762OooOo = i2;
    }

    public static OooO0o OooO00o(String str) {
        int i = Integer.parseInt(str, 16);
        for (OooO0o oooO0o : values()) {
            if (oooO0o.f113763OooOo0o == i) {
                return oooO0o;
            }
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Not a valid Slot :"));
    }
}
