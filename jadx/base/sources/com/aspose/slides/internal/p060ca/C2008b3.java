package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.b3 */
/* JADX INFO: loaded from: classes3.dex */
class C2008b3 extends C2412zn {

    /* JADX INFO: renamed from: kk */
    private int f6992kk;

    public C2008b3(C2317u4 c2317u4, int i) {
        super(c2317u4);
        this.f6992kk = i;
    }

    /* JADX INFO: renamed from: du */
    public final String m10232du() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) > 31) {
            throw new C2105gz("Unexpected PS object type in PS program.");
        }
        switch (bM11473k4) {
            case 1:
                return "hstem";
            case 2:
            case 9:
            case 13:
            case 15:
            case 16:
            case 17:
            case 28:
            default:
                return "N/A";
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
                switch (C7019kk.m27462to(Byte.valueOf(this.f8358k4.m11473k4(i)), 6)) {
                    case 3:
                        return "and";
                    case 4:
                        return "or";
                    case 5:
                        return "not";
                    case 6:
                    case 7:
                    case 8:
                    case 13:
                    case 16:
                    case 17:
                    case 19:
                    case 25:
                    case 31:
                    case 32:
                    case 33:
                    default:
                        return "N/A";
                    case 9:
                        return "abs";
                    case 10:
                        return "add";
                    case 11:
                        return "sub";
                    case 12:
                        return "div";
                    case 14:
                        return "neg";
                    case 15:
                        return "eq";
                    case 18:
                        return "drop";
                    case 20:
                        return "put";
                    case 21:
                        return "get";
                    case 22:
                        return "ifelse";
                    case 23:
                        return "random";
                    case 24:
                        return "mul";
                    case 26:
                        return "sqrt";
                    case 27:
                        return "dup";
                    case 28:
                        return "exch";
                    case 29:
                        return FirebaseAnalytics.Param.INDEX;
                    case 30:
                        return "roll";
                    case 34:
                        return "hflex";
                    case 35:
                        return "flex";
                    case 36:
                        return "hflex1";
                    case 37:
                        return "flex1";
                }
            case 14:
                return "endchar";
            case 18:
                return "hstemhm";
            case 19:
                return "hintmask";
            case 20:
                return "cntrmask";
            case 21:
                return "rmoveto";
            case 22:
                return "hmoveto";
            case 23:
                return "vstemhm";
            case 24:
                return "rcurveline";
            case 25:
                return "rlinecurve";
            case 26:
                return "vvcurveto";
            case 27:
                return "hhcurveto";
            case 29:
                return "callgsubr";
            case 30:
                return "vhcurveto";
            case 31:
                return "hvcurveto";
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10233k4() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) == 28 || (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) >= 32 && C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) < 255)) {
            return 1;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) == 255) {
            return this.f6992kk == 2 ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int m10234kk() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) == 28) {
            if (this.f8359x1 + 2 >= this.f8358k4.m11477x1()) {
                return 0;
            }
            C2317u4 c2317u4 = this.f8358k4;
            int i = this.f8359x1 + 1;
            this.f8359x1 = i;
            int iM27462to = C7019kk.m27462to(Byte.valueOf(c2317u4.m11473k4(i)), 6);
            C2317u4 c2317u42 = this.f8358k4;
            int i2 = this.f8359x1 + 1;
            this.f8359x1 = i2;
            return (short) ((iM27462to << 8) | C7019kk.m27462to(Byte.valueOf(c2317u42.m11473k4(i2)), 6));
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 246) {
            return C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 139;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 250) {
            if (this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                return 0;
            }
            C2317u4 c2317u43 = this.f8358k4;
            int i3 = this.f8359x1 + 1;
            this.f8359x1 = i3;
            return ((C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 247) * 256) + C7019kk.m27462to(Byte.valueOf(c2317u43.m11473k4(i3)), 6) + 108;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 254) {
            if (this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                return 0;
            }
            C2317u4 c2317u44 = this.f8358k4;
            int i4 = this.f8359x1 + 1;
            this.f8359x1 = i4;
            return ((-((C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 251) * 256)) - C7019kk.m27462to(Byte.valueOf(c2317u44.m11473k4(i4)), 6)) + BackupEvent.ERROR_UID_NOT_EXIST;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) != 255 || this.f8359x1 + 4 >= this.f8358k4.m11477x1()) {
            return 0;
        }
        C2317u4 c2317u45 = this.f8358k4;
        int i5 = this.f8359x1 + 1;
        this.f8359x1 = i5;
        int iM27462to2 = C7019kk.m27462to(Byte.valueOf(c2317u45.m11473k4(i5)), 6);
        C2317u4 c2317u46 = this.f8358k4;
        int i6 = this.f8359x1 + 1;
        this.f8359x1 = i6;
        int iM27462to3 = C7019kk.m27462to(Byte.valueOf(c2317u46.m11473k4(i6)), 6);
        C2317u4 c2317u47 = this.f8358k4;
        int i7 = this.f8359x1 + 1;
        this.f8359x1 = i7;
        int iM27462to4 = C7019kk.m27462to(Byte.valueOf(c2317u47.m11473k4(i7)), 6);
        C2317u4 c2317u48 = this.f8358k4;
        int i8 = this.f8359x1 + 1;
        this.f8359x1 = i8;
        return (iM27462to2 << 24) | (iM27462to3 << 16) | (iM27462to4 << 8) | C7019kk.m27462to(Byte.valueOf(c2317u48.m11473k4(i8)), 6);
    }

    /* JADX INFO: renamed from: to */
    public final double m10235to() {
        if (C7019kk.m27462to(Byte.valueOf(this.f8358k4.m11473k4(this.f8359x1)), 6) != 255 || this.f8359x1 + 4 >= this.f8358k4.m11477x1()) {
            return 0.0d;
        }
        C2317u4 c2317u4 = this.f8358k4;
        int i = this.f8359x1 + 1;
        this.f8359x1 = i;
        int iM27462to = C7019kk.m27462to(Byte.valueOf(c2317u4.m11473k4(i)), 6);
        C2317u4 c2317u42 = this.f8358k4;
        int i2 = this.f8359x1 + 1;
        this.f8359x1 = i2;
        int iM27462to2 = C7019kk.m27462to(Byte.valueOf(c2317u42.m11473k4(i2)), 6);
        C2317u4 c2317u43 = this.f8358k4;
        int i3 = this.f8359x1 + 1;
        this.f8359x1 = i3;
        int iM27462to3 = C7019kk.m27462to(Byte.valueOf(c2317u43.m11473k4(i3)), 6);
        C2317u4 c2317u44 = this.f8358k4;
        int i4 = this.f8359x1 + 1;
        this.f8359x1 = i4;
        return (((double) (C7019kk.m27462to(Byte.valueOf(c2317u44.m11473k4(i4)), 6) | (iM27462to3 << 8))) / 65536.0d) + ((double) ((short) ((iM27462to << 8) | iM27462to2)));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10236x1() {
        return C7019kk.m27462to(Byte.valueOf(this.f8358k4.m11473k4(this.f8359x1)), 6);
    }
}
