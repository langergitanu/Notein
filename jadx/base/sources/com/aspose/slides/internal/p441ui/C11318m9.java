package com.aspose.slides.internal.p441ui;

import com.aspose.slides.internal.p075d5.C3019h4;
import com.aspose.slides.internal.p075d5.C3020k4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.ui.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11318m9 {

    /* JADX INFO: renamed from: k4 */
    private static C3019h4 f38990k4 = new C3019h4((byte) -14, (byte) -12, (byte) -13);

    /* JADX INFO: renamed from: k4 */
    public static C3019h4 m54478k4(C3019h4 c3019h4) {
        if (c3019h4.equals(f38990k4)) {
            return new C3020k4(C12003du.f40505to.Clone());
        }
        byte b = (byte) (~(c3019h4.m12704kk() & 255));
        byte b2 = (byte) (~(c3019h4.m12706to() & 255));
        byte b3 = (byte) (~(c3019h4.m12701du() & 255));
        if (!C7019kk.m27469x1(c3019h4, C3020k4.class)) {
            return new C3019h4(b, b2, b3);
        }
        if (c3019h4.mo12707x1().m56506h4() == 0) {
            return f38990k4;
        }
        if ((((C3020k4) C7019kk.m27452k4((Object) c3019h4, C3020k4.class)).m12709k4() & 255) != 0) {
            return (((byte) ((C7019kk.m27442k4(Float.valueOf(((((float) (((b & 255) + (b2 & 255)) + (b3 & 255))) / 3.0f) / 255.0f) * 255.0f), 13) & 255) > 128 ? 255 : 0)) & 255) == 0 ? new C3020k4(C12003du.f40505to.Clone()) : new C3019h4(b, b2, b3);
        }
        return new C3019h4(C12003du.m56385i5().Clone());
    }

    /* JADX INFO: renamed from: kk */
    public static C3019h4 m54483kk(C3019h4 c3019h4, C3019h4 c3019h42) {
        return m54478k4(m54485x1(c3019h4, c3019h42));
    }

    /* JADX INFO: renamed from: to */
    public static C3019h4 m54484to(C3019h4 c3019h4, C3019h4 c3019h42) {
        return m54483kk(m54483kk(c3019h4, m54483kk(c3019h4, c3019h42)), m54483kk(c3019h42, m54483kk(c3019h4, c3019h42)));
    }

    /* JADX INFO: renamed from: x1 */
    public static C3019h4 m54485x1(C3019h4 c3019h4, C3019h4 c3019h42) {
        byte bM12704kk = (byte) (c3019h4.m12704kk() & 255 & c3019h42.m12704kk() & 255);
        byte bM12706to = (byte) (c3019h4.m12706to() & 255 & c3019h42.m12706to() & 255);
        byte bM12701du = (byte) (c3019h4.m12701du() & 255 & c3019h42.m12701du() & 255);
        if (C7019kk.m27469x1(c3019h4, C3020k4.class) && C7019kk.m27469x1(c3019h42, C3020k4.class)) {
            return new C3020k4((byte) (((C3020k4) C7019kk.m27452k4((Object) c3019h4, C3020k4.class)).m12709k4() & 255 & ((C3020k4) C7019kk.m27452k4((Object) c3019h42, C3020k4.class)).m12709k4() & 255), bM12704kk, bM12706to, bM12701du);
        }
        if (!C7019kk.m27469x1(c3019h4, C3020k4.class) && !C7019kk.m27469x1(c3019h42, C3020k4.class)) {
            return new C3019h4(bM12704kk, bM12706to, bM12701du);
        }
        if (C7019kk.m27469x1(c3019h4, C3020k4.class)) {
            if ((((C3020k4) C7019kk.m27452k4((Object) c3019h4, C3020k4.class)).m12709k4() & 255) == 0) {
                return (((byte) ((((byte) (255 - ((((c3019h42.m12704kk() & 255) + (c3019h42.m12706to() & 255)) + (c3019h42.m12701du() & 255)) / 3))) & 255) > 0 ? 255 : 0)) & 255) == 0 ? new C3020k4(C12003du.f40505to.Clone()) : new C3019h4(bM12704kk, bM12706to, bM12701du);
            }
            return new C3019h4(bM12704kk, bM12706to, bM12701du);
        }
        if ((((C3020k4) C7019kk.m27452k4((Object) c3019h42, C3020k4.class)).m12709k4() & 255) == 0) {
            return (((byte) ((((byte) (255 - ((((c3019h4.m12704kk() & 255) + (c3019h4.m12706to() & 255)) + (c3019h4.m12701du() & 255)) / 3))) & 255) > 0 ? 255 : 0)) & 255) == 0 ? new C3020k4(C12003du.f40505to.Clone()) : new C3019h4(bM12704kk, bM12706to, bM12701du);
        }
        return new C3019h4(bM12704kk, bM12706to, bM12701du);
    }

    /* JADX INFO: renamed from: k4 */
    public static C3019h4 m54479k4(C3019h4 c3019h4, C3019h4 c3019h42) {
        byte bM12704kk = (byte) ((c3019h4.m12704kk() & 255) | (c3019h42.m12704kk() & 255));
        byte bM12706to = (byte) ((c3019h4.m12706to() & 255) | (c3019h42.m12706to() & 255));
        byte bM12701du = (byte) ((c3019h4.m12701du() & 255) | (c3019h42.m12701du() & 255));
        if (C7019kk.m27469x1(c3019h4, C3020k4.class) && C7019kk.m27469x1(c3019h42, C3020k4.class)) {
            return new C3020k4((byte) ((((C3020k4) C7019kk.m27452k4((Object) c3019h4, C3020k4.class)).m12709k4() & 255) | (((C3020k4) C7019kk.m27452k4((Object) c3019h42, C3020k4.class)).m12709k4() & 255)), bM12704kk, bM12706to, bM12701du);
        }
        if (!C7019kk.m27469x1(c3019h4, C3020k4.class) && !C7019kk.m27469x1(c3019h42, C3020k4.class)) {
            return new C3019h4(bM12704kk, bM12706to, bM12701du);
        }
        if (C7019kk.m27469x1(c3019h4, C3020k4.class)) {
            if ((((C3020k4) C7019kk.m27452k4((Object) c3019h4, C3020k4.class)).m12709k4() & 255) == 0) {
                return (((byte) ((((byte) ((((c3019h42.m12704kk() & 255) + (c3019h42.m12706to() & 255)) + (c3019h42.m12701du() & 255)) / 3)) & 255) > 128 ? 255 : 0)) & 255) == 0 ? new C3020k4(C12003du.f40505to.Clone()) : new C3019h4(bM12704kk, bM12706to, bM12701du);
            }
            return new C3019h4(bM12704kk, bM12706to, bM12701du);
        }
        if ((((C3020k4) C7019kk.m27452k4((Object) c3019h42, C3020k4.class)).m12709k4() & 255) == 0) {
            return (((byte) ((((byte) ((((c3019h4.m12704kk() & 255) + (c3019h4.m12706to() & 255)) + (c3019h42.m12701du() & 255)) / 3)) & 255) > 128 ? 255 : 0)) & 255) == 0 ? new C3020k4(C12003du.f40505to.Clone()) : new C3019h4(bM12704kk, bM12706to, bM12701du);
        }
        return new C3019h4(bM12704kk, bM12706to, bM12701du);
    }

    /* JADX INFO: renamed from: k4 */
    public static C3019h4 m54480k4(C3019h4 c3019h4, C3019h4 c3019h42, C3019h4 c3019h43, long j) {
        switch ((int) j) {
            case 0:
                return new C3020k4(C12003du.m56460uz().Clone());
            case 1:
                return m54478k4(m54479k4(c3019h42, m54479k4(c3019h43, c3019h4)));
            case 2:
                return m54485x1(c3019h42, m54478k4(m54479k4(c3019h43, c3019h4)));
            case 3:
                return m54478k4(m54479k4(c3019h43, c3019h4));
            case 4:
                return m54485x1(c3019h4, m54478k4(m54479k4(c3019h42, c3019h43)));
            case 5:
                return m54478k4(m54479k4(c3019h42, c3019h43));
            case 6:
                return m54478k4(m54479k4(c3019h43, m54478k4(m54484to(c3019h42, c3019h4))));
            case 7:
                return m54478k4(m54479k4(c3019h43, m54485x1(c3019h42, c3019h4)));
            case 8:
                return m54485x1(c3019h4, m54485x1(c3019h42, m54478k4(c3019h43)));
            case 9:
                return m54478k4(m54479k4(c3019h43, m54484to(c3019h42, c3019h4)));
            case 10:
                return m54485x1(c3019h42, m54478k4(c3019h43));
            case 11:
                return m54478k4(m54479k4(c3019h43, m54485x1(c3019h4, m54478k4(c3019h42))));
            case 12:
                return m54485x1(c3019h4, m54478k4(c3019h43));
            case 13:
                return m54478k4(m54479k4(m54485x1(m54478k4(c3019h4), c3019h42), c3019h43));
            case 14:
                return m54478k4(m54479k4(m54478k4(m54479k4(c3019h42, c3019h4)), c3019h43));
            case 15:
                return m54478k4(c3019h43);
            case 16:
                return m54485x1(m54478k4(m54479k4(c3019h42, c3019h4)), c3019h43);
            case 17:
                return m54478k4(m54479k4(c3019h4, c3019h42));
            case 18:
                return m54478k4(m54479k4(m54478k4(m54484to(c3019h43, c3019h42)), c3019h4));
            case 19:
                return m54478k4(m54479k4(m54485x1(c3019h43, c3019h42), c3019h4));
            case 20:
                return m54478k4(m54479k4(m54478k4(m54484to(c3019h4, c3019h43)), c3019h42));
            case 21:
                return m54478k4(m54479k4(m54485x1(c3019h4, c3019h43), c3019h42));
            case 22:
                return m54484to(m54484to(m54485x1(m54478k4(m54485x1(c3019h4, c3019h43)), c3019h42), c3019h4), c3019h43);
            case 23:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4)), c3019h4));
            case 24:
                return m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h43, c3019h4));
            case 25:
                return m54478k4(m54484to(m54485x1(m54478k4(m54485x1(c3019h4, c3019h43)), c3019h42), c3019h4));
            case 26:
                return m54484to(m54479k4(m54485x1(c3019h43, c3019h4), c3019h42), c3019h43);
            case 27:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h4, c3019h43), c3019h42), c3019h4));
            case 28:
                return m54484to(m54479k4(m54485x1(c3019h43, c3019h42), c3019h4), c3019h43);
            case 29:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h42, c3019h43), c3019h4), c3019h42));
            case 30:
                return m54484to(m54479k4(c3019h4, c3019h42), c3019h43);
            case 31:
                return m54478k4(m54485x1(m54479k4(c3019h4, c3019h42), c3019h43));
            case 32:
                return m54485x1(m54485x1(m54478k4(c3019h4), c3019h43), c3019h42);
            case 33:
                return m54478k4(m54479k4(m54484to(c3019h43, c3019h42), c3019h4));
            case 34:
                return m54485x1(m54478k4(c3019h4), c3019h42);
            case 35:
                return m54478k4(m54479k4(m54485x1(m54478k4(c3019h42), c3019h43), c3019h4));
            case 36:
                return m54485x1(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4));
            case 37:
                return m54478k4(m54484to(m54485x1(m54478k4(m54485x1(c3019h43, c3019h4)), c3019h42), c3019h43));
            case 38:
                return m54484to(m54479k4(m54485x1(c3019h4, c3019h43), c3019h42), c3019h4);
            case 39:
                return m54484to(m54479k4(m54478k4(m54484to(c3019h4, c3019h43)), c3019h42), c3019h4);
            case 40:
                return m54485x1(m54484to(c3019h4, c3019h43), c3019h42);
            case 41:
                return m54478k4(m54484to(m54484to(m54479k4(m54485x1(c3019h4, c3019h43), c3019h42), c3019h4), c3019h43));
            case 42:
                return m54485x1(m54478k4(m54485x1(c3019h4, c3019h43)), c3019h42);
            case 43:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h43, c3019h4)), c3019h4));
            case 44:
                return m54484to(m54485x1(m54479k4(c3019h4, c3019h42), c3019h43), c3019h4);
            case 45:
                return m54484to(m54479k4(m54478k4(c3019h42), c3019h4), c3019h43);
            case 46:
                return m54484to(m54479k4(m54484to(c3019h43, c3019h42), c3019h4), c3019h43);
            case 47:
                return m54478k4(m54485x1(m54479k4(m54478k4(c3019h42), c3019h4), c3019h43));
            case 48:
                return m54485x1(m54478k4(c3019h4), c3019h43);
            case 49:
                return m54478k4(m54479k4(m54485x1(m54478k4(c3019h43), c3019h42), c3019h4));
            case 50:
                return m54484to(m54479k4(m54479k4(c3019h4, c3019h43), c3019h42), c3019h4);
            case 51:
                return m54478k4(c3019h4);
            case 52:
                return m54484to(m54479k4(m54485x1(c3019h4, c3019h42), c3019h43), c3019h4);
            case 53:
                return m54484to(m54479k4(m54478k4(m54484to(c3019h4, c3019h42)), c3019h43), c3019h4);
            case 54:
                return m54484to(m54479k4(c3019h43, c3019h42), c3019h4);
            case 55:
                return m54478k4(m54485x1(m54479k4(c3019h43, c3019h42), c3019h4));
            case 56:
                return m54484to(m54485x1(m54479k4(c3019h43, c3019h42), c3019h4), c3019h43);
            case 57:
                return m54484to(m54479k4(m54478k4(c3019h42), c3019h43), c3019h4);
            case 58:
                return m54484to(m54479k4(m54484to(c3019h4, c3019h42), c3019h43), c3019h4);
            case 59:
                return m54478k4(m54485x1(m54479k4(m54478k4(c3019h42), c3019h43), c3019h4));
            case 60:
                return m54484to(c3019h4, c3019h43);
            case 61:
                return m54484to(m54479k4(m54478k4(m54479k4(c3019h4, c3019h42)), c3019h43), c3019h4);
            case 62:
                return m54484to(m54479k4(m54485x1(m54478k4(c3019h4), c3019h42), c3019h43), c3019h4);
            case 63:
                return m54478k4(m54485x1(c3019h4, c3019h43));
            case 64:
                return m54485x1(m54485x1(m54478k4(c3019h42), c3019h4), c3019h43);
            case 65:
                return m54478k4(m54479k4(m54484to(c3019h4, c3019h43), c3019h42));
            case 66:
                return m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h42, c3019h4));
            case 67:
                return m54478k4(m54484to(m54485x1(m54478k4(m54485x1(c3019h4, c3019h42)), c3019h43), c3019h4));
            case 68:
                return m54485x1(m54478k4(c3019h42), c3019h4);
            case 69:
                return m54478k4(m54479k4(m54485x1(m54478k4(c3019h4), c3019h43), c3019h42));
            case 70:
                return m54484to(m54479k4(m54485x1(c3019h42, c3019h43), c3019h4), c3019h42);
            case 71:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h43, c3019h42), c3019h4), c3019h43));
            case 72:
                return m54485x1(m54484to(c3019h43, c3019h42), c3019h4);
            case 73:
                return m54478k4(m54484to(m54484to(m54479k4(m54485x1(c3019h42, c3019h43), c3019h4), c3019h42), c3019h43));
            case 74:
                return m54484to(m54485x1(m54479k4(c3019h42, c3019h4), c3019h43), c3019h42);
            case 75:
                return m54484to(m54479k4(m54478k4(c3019h4), c3019h42), c3019h43);
            case 76:
                return m54485x1(m54478k4(m54485x1(c3019h43, c3019h42)), c3019h4);
            case 77:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4)), c3019h4));
            case 78:
                return m54484to(m54479k4(m54484to(c3019h43, c3019h4), c3019h42), c3019h43);
            case 79:
                return m54478k4(m54485x1(m54479k4(m54478k4(c3019h4), c3019h42), c3019h43));
            case 80:
                return m54485x1(m54478k4(c3019h42), c3019h43);
            case 81:
                return m54478k4(m54479k4(m54485x1(m54478k4(c3019h43), c3019h4), c3019h42));
            case 82:
                return m54484to(m54479k4(m54485x1(c3019h42, c3019h4), c3019h43), c3019h42);
            case 83:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h4, c3019h42), c3019h43), c3019h4));
            case 84:
                return m54478k4(m54479k4(m54478k4(m54479k4(c3019h4, c3019h43)), c3019h42));
            case 85:
                return m54478k4(c3019h42);
            case 86:
                return m54484to(m54479k4(c3019h4, c3019h43), c3019h42);
            case 87:
                return m54478k4(m54485x1(m54479k4(c3019h4, c3019h43), c3019h42));
            case 88:
                return m54484to(m54485x1(m54479k4(c3019h43, c3019h4), c3019h42), c3019h43);
            case 89:
                return m54484to(m54479k4(m54478k4(c3019h4), c3019h43), c3019h42);
            case 90:
                return m54484to(c3019h43, c3019h42);
            case 91:
                return m54484to(m54479k4(m54478k4(m54479k4(c3019h42, c3019h4)), c3019h43), c3019h42);
            case 92:
                return m54484to(m54479k4(m54484to(c3019h42, c3019h4), c3019h43), c3019h42);
            case 93:
                return m54478k4(m54485x1(m54479k4(m54478k4(c3019h4), c3019h43), c3019h42));
            case 94:
                return m54484to(m54479k4(m54485x1(m54478k4(c3019h42), c3019h4), c3019h43), c3019h42);
            case 95:
                return m54478k4(m54485x1(c3019h43, c3019h42));
            case 96:
                return m54485x1(m54484to(c3019h4, c3019h42), c3019h43);
            case 97:
                return m54478k4(m54484to(m54484to(m54479k4(m54485x1(c3019h4, c3019h42), c3019h43), c3019h4), c3019h42));
            case 98:
                return m54484to(m54485x1(m54479k4(c3019h42, c3019h43), c3019h4), c3019h42);
            case 99:
                return m54484to(m54479k4(m54478k4(c3019h43), c3019h42), c3019h4);
            case 100:
                return m54484to(m54485x1(m54479k4(c3019h4, c3019h43), c3019h42), c3019h4);
            case 101:
                return m54484to(m54479k4(m54478k4(c3019h43), c3019h4), c3019h42);
            case 102:
                return m54484to(c3019h4, c3019h42);
            case 103:
                return m54484to(m54479k4(m54478k4(m54479k4(c3019h4, c3019h43)), c3019h42), c3019h4);
            case 104:
                return m54478k4(m54484to(m54484to(m54479k4(m54478k4(m54479k4(c3019h4, c3019h42)), c3019h43), c3019h4), c3019h42));
            case 105:
                return m54478k4(m54484to(m54484to(c3019h4, c3019h42), c3019h43));
            case 106:
                return m54484to(m54485x1(c3019h4, c3019h43), c3019h42);
            case 107:
                return m54478k4(m54484to(m54484to(m54485x1(m54479k4(c3019h4, c3019h43), c3019h42), c3019h4), c3019h43));
            case 108:
                return m54484to(m54485x1(c3019h43, c3019h42), c3019h4);
            case 109:
                return m54478k4(m54484to(m54484to(m54485x1(m54479k4(c3019h42, c3019h43), c3019h4), c3019h42), c3019h43));
            case 110:
                return m54484to(m54485x1(m54479k4(m54478k4(c3019h4), c3019h43), c3019h42), c3019h4);
            case 111:
                return m54478k4(m54485x1(m54478k4(m54484to(c3019h4, c3019h42)), c3019h43));
            case 112:
                return m54485x1(m54478k4(m54485x1(c3019h4, c3019h42)), c3019h43);
            case 113:
                return m54478k4(m54484to(m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h42, c3019h4)), c3019h4));
            case 114:
                return m54484to(m54479k4(m54484to(c3019h4, c3019h43), c3019h42), c3019h4);
            case 115:
                return m54478k4(m54485x1(m54479k4(m54478k4(c3019h43), c3019h42), c3019h4));
            case 116:
                return m54484to(m54479k4(m54484to(c3019h42, c3019h43), c3019h4), c3019h42);
            case 117:
                return m54478k4(m54485x1(m54479k4(m54478k4(c3019h43), c3019h4), c3019h42));
            case 118:
                return m54484to(m54479k4(m54485x1(m54478k4(c3019h4), c3019h43), c3019h42), c3019h4);
            case 119:
                return m54478k4(m54485x1(c3019h4, c3019h42));
            case 120:
                return m54484to(m54485x1(c3019h4, c3019h42), c3019h43);
            case 121:
                return m54478k4(m54484to(m54484to(m54485x1(m54479k4(c3019h4, c3019h42), c3019h43), c3019h4), c3019h42));
            case 122:
                return m54484to(m54485x1(m54479k4(m54478k4(c3019h42), c3019h4), c3019h43), c3019h42);
            case 123:
                return m54478k4(m54485x1(m54478k4(m54484to(c3019h43, c3019h42)), c3019h4));
            case 124:
                return m54484to(m54485x1(m54479k4(m54478k4(c3019h4), c3019h42), c3019h43), c3019h4);
            case 125:
                return m54478k4(m54485x1(m54478k4(m54484to(c3019h4, c3019h43)), c3019h42));
            case 126:
                return m54479k4(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4));
            case 127:
                return m54478k4(m54485x1(m54485x1(c3019h4, c3019h43), c3019h42));
            case 128:
                return m54485x1(m54485x1(c3019h4, c3019h43), c3019h42);
            case 129:
                return m54478k4(m54479k4(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4)));
            case 130:
                return m54485x1(m54478k4(m54484to(c3019h4, c3019h43)), c3019h42);
            case 131:
                return m54478k4(m54484to(m54485x1(m54479k4(m54478k4(c3019h4), c3019h42), c3019h43), c3019h4));
            case 132:
                return m54485x1(m54478k4(m54484to(c3019h43, c3019h42)), c3019h4);
            case 133:
                return m54478k4(m54484to(m54485x1(m54479k4(m54478k4(c3019h43), c3019h4), c3019h42), c3019h43));
            case 134:
                return m54484to(m54484to(m54485x1(m54479k4(c3019h4, c3019h42), c3019h43), c3019h4), c3019h42);
            case 135:
                return m54478k4(m54484to(m54485x1(c3019h4, c3019h42), c3019h43));
            case 136:
                return m54485x1(c3019h4, c3019h42);
            case 137:
                return m54478k4(m54484to(m54479k4(m54485x1(m54478k4(c3019h4), c3019h43), c3019h42), c3019h4));
            case 138:
                return m54485x1(m54479k4(m54478k4(c3019h43), c3019h4), c3019h42);
            case 139:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h42, c3019h43), c3019h4), c3019h42));
            case 140:
                return m54485x1(m54479k4(m54478k4(c3019h43), c3019h42), c3019h4);
            case 141:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h4, c3019h43), c3019h42), c3019h4));
            case 142:
                return m54484to(m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h42, c3019h4)), c3019h4);
            case 143:
                return m54478k4(m54485x1(m54478k4(m54485x1(c3019h4, c3019h42)), c3019h43));
            case 144:
                return m54485x1(m54478k4(m54484to(c3019h4, c3019h42)), c3019h43);
            case 145:
                return m54478k4(m54484to(m54485x1(m54479k4(m54478k4(c3019h4), c3019h43), c3019h42), c3019h4));
            case 146:
                return m54484to(m54484to(m54485x1(m54479k4(c3019h43, c3019h42), c3019h4), c3019h43), c3019h42);
            case 147:
                return m54478k4(m54484to(m54485x1(c3019h42, c3019h43), c3019h4));
            case 148:
                return m54484to(m54484to(m54485x1(m54479k4(c3019h4, c3019h43), c3019h42), c3019h4), c3019h43);
            case 149:
                return m54478k4(m54484to(m54485x1(c3019h4, c3019h43), c3019h42));
            case 150:
                return m54484to(m54484to(c3019h4, c3019h43), c3019h42);
            case 151:
                return m54484to(m54484to(m54479k4(m54478k4(m54479k4(c3019h4, c3019h43)), c3019h42), c3019h4), c3019h43);
            case 152:
                return m54478k4(m54484to(m54479k4(m54478k4(m54479k4(c3019h4, c3019h43)), c3019h42), c3019h4));
            case 153:
                return m54478k4(m54484to(c3019h4, c3019h42));
            case 154:
                return m54484to(m54485x1(m54478k4(c3019h4), c3019h43), c3019h42);
            case 155:
                return m54478k4(m54484to(m54485x1(m54479k4(c3019h4, c3019h43), c3019h42), c3019h4));
            case 156:
                return m54484to(m54485x1(m54478k4(c3019h42), c3019h43), c3019h4);
            case 157:
                return m54478k4(m54484to(m54485x1(m54479k4(c3019h42, c3019h43), c3019h4), c3019h42));
            case 158:
                return m54484to(m54484to(m54479k4(m54485x1(c3019h4, c3019h42), c3019h43), c3019h4), c3019h42);
            case 159:
                return m54478k4(m54485x1(m54484to(c3019h4, c3019h42), c3019h43));
            case 160:
                return m54485x1(c3019h43, c3019h42);
            case 161:
                return m54478k4(m54484to(m54479k4(m54485x1(m54478k4(c3019h43), c3019h4), c3019h42), c3019h43));
            case 162:
                return m54485x1(m54479k4(m54478k4(c3019h4), c3019h43), c3019h42);
            case 163:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h42, c3019h4), c3019h43), c3019h42));
            case 164:
                return m54478k4(m54484to(m54479k4(m54478k4(m54479k4(c3019h43, c3019h4)), c3019h42), c3019h43));
            case 165:
                return m54478k4(m54484to(c3019h42, c3019h43));
            case 166:
                return m54484to(m54485x1(m54478k4(c3019h43), c3019h4), c3019h42);
            case 167:
                return m54478k4(m54484to(m54485x1(m54479k4(c3019h43, c3019h4), c3019h42), c3019h43));
            case 168:
                return m54485x1(m54479k4(c3019h4, c3019h43), c3019h42);
            case 169:
                return m54478k4(m54484to(m54479k4(c3019h4, c3019h43), c3019h42));
            case 170:
            default:
                return c3019h42;
            case 171:
                return m54479k4(m54478k4(m54479k4(c3019h4, c3019h43)), c3019h42);
            case 172:
                return m54484to(m54485x1(m54484to(c3019h4, c3019h42), c3019h43), c3019h4);
            case 173:
                return m54478k4(m54484to(m54479k4(m54485x1(c3019h42, c3019h4), c3019h43), c3019h42));
            case 174:
                return m54479k4(m54485x1(m54478k4(c3019h43), c3019h4), c3019h42);
            case 175:
                return m54479k4(m54478k4(c3019h43), c3019h42);
            case 176:
                return m54485x1(m54479k4(m54478k4(c3019h4), c3019h42), c3019h43);
            case 177:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h43, c3019h4), c3019h42), c3019h43));
            case 178:
                return m54484to(m54479k4(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4)), c3019h4);
            case 179:
                return m54478k4(m54485x1(m54478k4(m54485x1(c3019h43, c3019h42)), c3019h4));
            case 180:
                return m54484to(m54485x1(m54478k4(c3019h42), c3019h4), c3019h43);
            case 181:
                return m54478k4(m54484to(m54485x1(m54479k4(c3019h42, c3019h4), c3019h43), c3019h42));
            case 182:
                return m54484to(m54484to(m54479k4(m54485x1(c3019h43, c3019h42), c3019h4), c3019h43), c3019h42);
            case 183:
                return m54478k4(m54485x1(m54484to(c3019h43, c3019h42), c3019h4));
            case 184:
                return m54484to(m54485x1(m54484to(c3019h43, c3019h42), c3019h4), c3019h43);
            case 185:
                return m54478k4(m54484to(m54479k4(m54485x1(c3019h42, c3019h43), c3019h4), c3019h42));
            case 186:
                return m54479k4(m54485x1(m54478k4(c3019h4), c3019h43), c3019h42);
            case 187:
                return m54479k4(m54478k4(c3019h4), c3019h42);
            case 188:
                return m54484to(m54485x1(m54478k4(m54485x1(c3019h4, c3019h42)), c3019h43), c3019h4);
            case 189:
                return m54478k4(m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h42, c3019h4)));
            case 190:
                return m54479k4(m54484to(c3019h4, c3019h43), c3019h42);
            case 191:
                return m54479k4(m54478k4(m54485x1(c3019h4, c3019h43)), c3019h42);
            case 192:
                return m54485x1(c3019h4, c3019h43);
            case 193:
                return m54478k4(m54484to(m54479k4(m54485x1(m54478k4(c3019h4), c3019h42), c3019h43), c3019h4));
            case 194:
                return m54478k4(m54484to(m54479k4(m54478k4(m54479k4(c3019h4, c3019h42)), c3019h43), c3019h4));
            case 195:
                return m54478k4(m54484to(c3019h4, c3019h43));
            case 196:
                return m54485x1(m54479k4(m54478k4(c3019h42), c3019h43), c3019h4);
            case 197:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h4, c3019h42), c3019h43), c3019h4));
            case 198:
                return m54484to(m54485x1(m54478k4(c3019h43), c3019h42), c3019h4);
            case 199:
                return m54478k4(m54484to(m54485x1(m54479k4(c3019h43, c3019h42), c3019h4), c3019h43));
            case 200:
                return m54485x1(m54479k4(c3019h43, c3019h42), c3019h4);
            case 201:
                return m54478k4(m54484to(m54479k4(c3019h42, c3019h43), c3019h4));
            case 202:
                return m54484to(m54485x1(m54484to(c3019h42, c3019h4), c3019h43), c3019h42);
            case 203:
                return m54478k4(m54484to(m54479k4(m54485x1(c3019h4, c3019h42), c3019h43), c3019h4));
            case 204:
                return c3019h4;
            case 205:
                return m54479k4(m54478k4(m54479k4(c3019h43, c3019h42)), c3019h4);
            case 206:
                return m54479k4(m54485x1(m54478k4(c3019h43), c3019h42), c3019h4);
            case 207:
                return m54479k4(m54478k4(c3019h43), c3019h4);
            case 208:
                return m54485x1(m54479k4(m54478k4(c3019h42), c3019h4), c3019h43);
            case 209:
                return m54478k4(m54484to(m54479k4(m54484to(c3019h43, c3019h42), c3019h4), c3019h43));
            case 210:
                return m54484to(m54485x1(m54478k4(c3019h4), c3019h42), c3019h43);
            case 211:
                return m54478k4(m54484to(m54485x1(m54479k4(c3019h4, c3019h42), c3019h43), c3019h4));
            case 212:
                return m54484to(m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h43, c3019h4)), c3019h4);
            case 213:
                return m54478k4(m54485x1(m54478k4(m54485x1(c3019h4, c3019h43)), c3019h42));
            case 214:
                return m54484to(m54484to(m54479k4(m54485x1(c3019h4, c3019h43), c3019h42), c3019h4), c3019h43);
            case 215:
                return m54478k4(m54485x1(m54484to(c3019h4, c3019h43), c3019h42));
            case 216:
                return m54484to(m54485x1(m54484to(c3019h43, c3019h4), c3019h42), c3019h43);
            case 217:
                return m54478k4(m54484to(m54479k4(m54485x1(c3019h4, c3019h43), c3019h42), c3019h4));
            case 218:
                return m54484to(m54485x1(m54478k4(m54485x1(c3019h42, c3019h4)), c3019h43), c3019h42);
            case 219:
                return m54478k4(m54485x1(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4)));
            case 220:
                return m54479k4(m54485x1(m54478k4(c3019h42), c3019h43), c3019h4);
            case 221:
                return m54479k4(m54478k4(c3019h42), c3019h4);
            case 222:
                return m54479k4(m54484to(c3019h43, c3019h42), c3019h4);
            case 223:
                return m54479k4(m54478k4(m54485x1(c3019h43, c3019h42)), c3019h4);
            case 224:
                return m54485x1(m54479k4(c3019h4, c3019h42), c3019h43);
            case 225:
                return m54478k4(m54484to(m54479k4(c3019h4, c3019h42), c3019h43));
            case 226:
                return m54484to(m54485x1(m54484to(c3019h42, c3019h43), c3019h4), c3019h42);
            case 227:
                return m54478k4(m54484to(m54479k4(m54485x1(c3019h43, c3019h42), c3019h4), c3019h43));
            case 228:
                return m54484to(m54485x1(m54484to(c3019h4, c3019h43), c3019h42), c3019h4);
            case 229:
                return m54478k4(m54484to(m54479k4(m54485x1(c3019h43, c3019h4), c3019h42), c3019h43));
            case 230:
                return m54484to(m54485x1(m54478k4(m54485x1(c3019h4, c3019h43)), c3019h42), c3019h4);
            case 231:
                return m54478k4(m54485x1(m54484to(c3019h42, c3019h43), m54484to(c3019h43, c3019h4)));
            case 232:
                return m54484to(m54485x1(m54484to(c3019h4, c3019h42), m54484to(c3019h43, c3019h4)), c3019h4);
            case 233:
                return m54478k4(m54484to(m54484to(m54485x1(m54478k4(m54485x1(c3019h4, c3019h42)), c3019h43), c3019h4), c3019h42));
            case 234:
                return m54479k4(m54485x1(c3019h4, c3019h43), c3019h42);
            case 235:
                return m54479k4(m54478k4(m54484to(c3019h4, c3019h43)), c3019h42);
            case 236:
                return m54479k4(m54485x1(c3019h43, c3019h42), c3019h4);
            case 237:
                return m54479k4(m54478k4(m54484to(c3019h43, c3019h42)), c3019h4);
            case 238:
                return m54479k4(c3019h4, c3019h42);
            case 239:
                return m54479k4(m54479k4(m54478k4(c3019h43), c3019h42), c3019h4);
            case 240:
                return c3019h43;
            case 241:
                return m54479k4(m54478k4(m54479k4(c3019h4, c3019h42)), c3019h43);
            case 242:
                return m54479k4(m54485x1(m54478k4(c3019h4), c3019h42), c3019h43);
            case 243:
                return m54479k4(m54478k4(c3019h4), c3019h43);
            case 244:
                return m54479k4(m54485x1(m54478k4(c3019h42), c3019h4), c3019h43);
            case 245:
                return m54479k4(m54478k4(c3019h42), c3019h43);
            case 246:
                return m54479k4(m54484to(c3019h4, c3019h42), c3019h43);
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                return m54479k4(m54478k4(m54485x1(c3019h4, c3019h42)), c3019h43);
            case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                return m54479k4(m54485x1(c3019h4, c3019h42), c3019h43);
            case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                return m54479k4(m54478k4(m54484to(c3019h4, c3019h42)), c3019h43);
            case 250:
                return m54479k4(c3019h43, c3019h42);
            case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                return m54479k4(m54479k4(m54478k4(c3019h4), c3019h43), c3019h42);
            case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                return m54479k4(c3019h4, c3019h43);
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                return m54479k4(m54479k4(m54478k4(c3019h42), c3019h4), c3019h43);
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                return m54479k4(m54479k4(c3019h4, c3019h43), c3019h42);
            case 255:
                return new C3020k4(C12003du.m56385i5().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m54481k4(C12009k4 c12009k4, C12009k4 c12009k42, C12009k4 c12009k43, long j, C11315h4 c11315h4) {
        int i = 0;
        C12014ne c12014ne = new C12014ne(0, 0, c12009k43.mo15760yj(), c12009k43.mo15757m9());
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(c12014ne.Clone(), 1, 2498570);
        C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(c12014ne.Clone(), 1, 2498570);
        C3983k4 c3983k4M56597k43 = c12009k43.m56597k4(c12014ne.Clone(), 3, 2498570);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        C14112xw c14112xwM15721to2 = c3983k4M56597k43.m15721to();
        C14112xw c14112xwM15721to3 = c3983k4M56597k42.m15721to();
        int i2 = 0;
        while (i2 < c3983k4M56597k4.m15716k4()) {
            int iM67482k4 = C14116yg.m67482k4(c3983k4M56597k4.m15715du());
            byte[] bArr = new byte[iM67482k4];
            byte[] bArr2 = new byte[iM67482k4];
            byte[] bArr3 = new byte[iM67482k4];
            C3914k4.m15618k4(c14112xwM15721to, bArr, i, iM67482k4);
            C3914k4.m15618k4(c14112xwM15721to2, bArr2, i, iM67482k4);
            C3914k4.m15618k4(c14112xwM15721to3, bArr3, i, iM67482k4);
            int i3 = i;
            while (i3 < iM67482k4) {
                int i4 = i3 + 3;
                int i5 = i3 + 2;
                C14112xw c14112xw = c14112xwM15721to;
                int i6 = i3 + 1;
                byte[] bArr4 = bArr3;
                int i7 = i3;
                C12003du c12003duClone = m54480k4(new C3019h4(C12003du.m56398k4(bArr[i4] & 255, bArr[i5] & 255, bArr[i6] & 255, bArr[i3] & 255).Clone().Clone()), new C3020k4(C12003du.m56398k4(bArr2[i4] & 255, bArr2[i5] & 255, bArr2[i6] & 255, bArr2[i3] & 255).Clone().Clone()), new C3019h4(C12003du.m56398k4(bArr3[i4] & 255, bArr3[i5] & 255, bArr3[i6] & 255, bArr4[i3] & 255).Clone().Clone()), j).mo12707x1().Clone();
                bArr2[i7] = c12003duClone.m56505fa();
                bArr2[i6] = c12003duClone.m56502ck();
                bArr2[i5] = c12003duClone.m56507jd();
                bArr2[i4] = c12003duClone.m56501c5();
                i3 = i7 + 4;
                c14112xwM15721to = c14112xw;
                c14112xwM15721to3 = c14112xwM15721to3;
                i2 = i2;
                bArr = bArr;
                bArr3 = bArr4;
                i = 0;
            }
            C14112xw c14112xw2 = c14112xwM15721to3;
            C3914k4.m15621k4(bArr2, i, c14112xwM15721to2, iM67482k4);
            long j2 = iM67482k4;
            C14112xw c14112xw3 = new C14112xw(c14112xwM15721to.m67357x1() + j2);
            i2++;
            c14112xwM15721to = c14112xw3;
            c14112xwM15721to2 = new C14112xw(c14112xwM15721to2.m67357x1() + j2);
            c14112xwM15721to3 = new C14112xw(c14112xw2.m67357x1() + j2);
            i = 0;
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        c12009k42.m56605k4(c3983k4M56597k42);
        c12009k43.m56605k4(c3983k4M56597k43);
        return c12009k43;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m54482k4(C12014ne c12014ne, C12014ne c12014ne2) {
        return C12014ne.m56656k4(c12014ne2.Clone(), c12014ne.Clone());
    }
}
