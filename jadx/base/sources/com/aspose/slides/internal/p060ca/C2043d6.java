package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.d6 */
/* JADX INFO: loaded from: classes3.dex */
class C2043d6 extends C2412zn {
    public C2043d6(C2317u4 c2317u4) {
        super(c2317u4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10355k4() {
        return C7019kk.m27462to(Byte.valueOf(this.f8358k4.m11473k4(this.f8359x1)), 6) <= 31 ? 0 : 1;
    }

    /* JADX INFO: renamed from: kk */
    public final double m10356kk() {
        return 0.0d;
    }

    /* JADX INFO: renamed from: to */
    public final String m10357to() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) > 31) {
            throw new C2105gz("Unexpected PS object type in PS program.");
        }
        if (bM11473k4 == 1) {
            return "hstem";
        }
        if (bM11473k4 == 21) {
            return "rmoveto";
        }
        if (bM11473k4 == 22) {
            return "hmoveto";
        }
        if (bM11473k4 == 30) {
            return "vhcurveto";
        }
        if (bM11473k4 == 31) {
            return "hvcurveto";
        }
        switch (bM11473k4) {
            case 3:
                return "vstem";
            case 4:
                return "vmoveto";
            case 5:
                return "rlineto";
            case 6:
                return "hlineto";
            case 7:
                return "vlineto";
            case 8:
                return "rrcurveto";
            case 9:
                return "closepath";
            case 10:
                return "callsubr";
            case 11:
                return "return";
            case 12:
                if (this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                    return "N/A";
                }
                int i = this.f8359x1 + 1;
                this.f8359x1 = i;
                int iM27462to = C7019kk.m27462to(Byte.valueOf(this.f8358k4.m11473k4(i)), 6);
                return iM27462to != 0 ? iM27462to != 1 ? iM27462to != 2 ? iM27462to != 6 ? iM27462to != 7 ? iM27462to != 12 ? iM27462to != 33 ? iM27462to != 16 ? iM27462to != 17 ? "N/A" : TokenRequest.TokenType.POP : "callothersubr" : "setcurrentpoint" : "div" : "sbw" : "seac" : "hstem3" : "vstem3" : "dotsection";
            case 13:
                return "hsbw";
            case 14:
                return "endchar";
            default:
                return "N/A";
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10358x1() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 31) {
            throw new C2105gz("Unexpected PS object type in PS program.");
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 246) {
            return C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 139;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 250) {
            if (this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                return 0;
            }
            C2317u4 c2317u4 = this.f8358k4;
            int i = this.f8359x1 + 1;
            this.f8359x1 = i;
            return ((C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 247) * 256) + C7019kk.m27462to(Byte.valueOf(c2317u4.m11473k4(i)), 6) + 108;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 254) {
            if (this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                return 0;
            }
            C2317u4 c2317u42 = this.f8358k4;
            int i2 = this.f8359x1 + 1;
            this.f8359x1 = i2;
            return ((-((C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 251) * 256)) - C7019kk.m27462to(Byte.valueOf(c2317u42.m11473k4(i2)), 6)) + BackupEvent.ERROR_UID_NOT_EXIST;
        }
        if (this.f8359x1 + 4 >= this.f8358k4.m11477x1()) {
            return 0;
        }
        C2317u4 c2317u43 = this.f8358k4;
        int i3 = this.f8359x1 + 1;
        this.f8359x1 = i3;
        int iM27462to = C7019kk.m27462to(Byte.valueOf(c2317u43.m11473k4(i3)), 6);
        C2317u4 c2317u44 = this.f8358k4;
        int i4 = this.f8359x1 + 1;
        this.f8359x1 = i4;
        int iM27462to2 = C7019kk.m27462to(Byte.valueOf(c2317u44.m11473k4(i4)), 6);
        C2317u4 c2317u45 = this.f8358k4;
        int i5 = this.f8359x1 + 1;
        this.f8359x1 = i5;
        int iM27462to3 = C7019kk.m27462to(Byte.valueOf(c2317u45.m11473k4(i5)), 6);
        C2317u4 c2317u46 = this.f8358k4;
        int i6 = this.f8359x1 + 1;
        this.f8359x1 = i6;
        return (iM27462to << 24) | (iM27462to2 << 16) | (iM27462to3 << 8) | C7019kk.m27462to(Byte.valueOf(c2317u46.m11473k4(i6)), 6);
    }
}
