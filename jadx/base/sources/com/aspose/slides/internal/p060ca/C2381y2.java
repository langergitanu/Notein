package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.y2 */
/* JADX INFO: loaded from: classes3.dex */
class C2381y2 extends C2412zn {
    public C2381y2(C2317u4 c2317u4) {
        super(c2317u4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11723k4() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) >= 28 && C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) <= 29) {
            return 1;
        }
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) < 32 || C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) > 254) {
            return C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) == 30 ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public final double m11724kk() {
        String strM55062ne;
        C2317u4 c2317u4 = this.f8358k4;
        int i = this.f8359x1 + 1;
        this.f8359x1 = i;
        byte bM11473k4 = c2317u4.m11473k4(i);
        C6765kp c6765kp = new C6765kp();
        boolean z = false;
        boolean z2 = true;
        while (!z) {
            int iM27462to = C7019kk.m27462to(Byte.valueOf(bM11473k4), 6);
            byte b = (byte) (z2 ? iM27462to >> 4 : iM27462to & 15);
            if (C7019kk.m27462to(Byte.valueOf(b), 6) < 0 || C7019kk.m27462to(Byte.valueOf(b), 6) > 9) {
                switch (b) {
                    case 10:
                        strM55062ne = C11697x1.m55250kk().m55263fa().m55062ne();
                        c6765kp.m26792k4(strM55062ne);
                        break;
                    case 11:
                        strM55062ne = "E";
                        c6765kp.m26792k4(strM55062ne);
                        break;
                    case 12:
                        strM55062ne = "E-";
                        c6765kp.m26792k4(strM55062ne);
                        break;
                    case 14:
                        strM55062ne = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                        c6765kp.m26792k4(strM55062ne);
                        break;
                    case 15:
                        z = true;
                        break;
                }
            } else {
                c6765kp.m26779k4(b);
            }
            if (z) {
                return C14044b3.m66428k4(c6765kp.toString(), C11697x1.m55250kk());
            }
            boolean z3 = !z2;
            if (!z2) {
                C2317u4 c2317u42 = this.f8358k4;
                int i2 = this.f8359x1 + 1;
                this.f8359x1 = i2;
                bM11473k4 = c2317u42.m11473k4(i2);
            }
            z2 = z3;
        }
        return C14044b3.m66428k4(c6765kp.toString(), C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: to */
    public final String m11725to() {
        byte bM11473k4 = this.f8358k4.m11473k4(this.f8359x1);
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) > 31) {
            throw new C2105gz("Unexpected PS object type in PS program.");
        }
        switch (bM11473k4) {
            case 6:
                return "BlueValues";
            case 7:
                return "OtherBlues";
            case 8:
                return "FamilyBlues";
            case 9:
                return "FamilyOtherBlues";
            case 10:
                return "StdHW";
            case 11:
                return "StdVW";
            case 12:
                if (this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                    return "N/A";
                }
                int i = this.f8359x1 + 1;
                this.f8359x1 = i;
                switch (C7019kk.m27462to(Byte.valueOf(this.f8358k4.m11473k4(i)), 6)) {
                    case 9:
                        return "BlueScale";
                    case 10:
                        return "BlueShift";
                    case 11:
                        return "BlueFuzz";
                    case 12:
                        return "StemSnapH";
                    case 13:
                        return "StemSnapV";
                    case 14:
                        return "ForceBold";
                    case 15:
                    case 16:
                    default:
                        return "N/A";
                    case 17:
                        return "LanguageGroup";
                    case 18:
                        return "ExpansionFactor";
                    case 19:
                        return "initialRandomSeed";
                }
            default:
                switch (bM11473k4) {
                    case 19:
                        return "Subrs";
                    case 20:
                        return "defaultWidthX";
                    case 21:
                        return "nominalWidthX";
                    default:
                        return "N/A";
                }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11726x1() {
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
        if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) != 29) {
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
            if (C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) > 254 || this.f8359x1 + 1 >= this.f8358k4.m11477x1()) {
                return 0;
            }
            C2317u4 c2317u44 = this.f8358k4;
            int i4 = this.f8359x1 + 1;
            this.f8359x1 = i4;
            return ((-((C7019kk.m27462to(Byte.valueOf(bM11473k4), 6) - 251) * 256)) - C7019kk.m27462to(Byte.valueOf(c2317u44.m11473k4(i4)), 6)) + BackupEvent.ERROR_UID_NOT_EXIST;
        }
        if (this.f8359x1 + 4 >= this.f8358k4.m11477x1()) {
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
}
