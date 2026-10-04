package com.aspose.slides.internal.p123f5;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.C12532k4;
import com.aspose.slides.internal.p500xi.C12534m9;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.f5.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C3859m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C12534m9 f10576k4 = new C12534m9((byte) -14, (byte) -12, (byte) -13);

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m15551k4(C12009k4 c12009k4, C12009k4 c12009k42, C12009k4 c12009k43, long j, C3856h4 c3856h4) {
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
                C12003du c12003duClone = m15555k4(new C12534m9(C12003du.m56398k4(bArr[i4] & 255, bArr[i5] & 255, bArr[i6] & 255, bArr[i3] & 255).Clone().Clone()), new C12532k4(C12003du.m56398k4(bArr2[i4] & 255, bArr2[i5] & 255, bArr2[i6] & 255, bArr2[i3] & 255).Clone().Clone()), new C12534m9(C12003du.m56398k4(bArr3[i4] & 255, bArr3[i5] & 255, bArr3[i6] & 255, bArr4[i3] & 255).Clone().Clone()), j).mo58349x1().Clone();
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

    /* JADX INFO: renamed from: kk */
    public static C12534m9 m15556kk(C12534m9 c12534m9, C12534m9 c12534m92) {
        return m15553k4(m15558x1(c12534m9, c12534m92));
    }

    /* JADX INFO: renamed from: to */
    public static C12534m9 m15557to(C12534m9 c12534m9, C12534m9 c12534m92) {
        return m15556kk(m15556kk(c12534m9, m15556kk(c12534m9, c12534m92)), m15556kk(c12534m92, m15556kk(c12534m9, c12534m92)));
    }

    /* JADX INFO: renamed from: x1 */
    public static C12534m9 m15558x1(C12534m9 c12534m9, C12534m9 c12534m92) {
        byte bM58358kk = (byte) (c12534m9.m58358kk() & 255 & c12534m92.m58358kk() & 255);
        byte bM58360to = (byte) (c12534m9.m58360to() & 255 & c12534m92.m58360to() & 255);
        byte bM58355du = (byte) (c12534m9.m58355du() & 255 & c12534m92.m58355du() & 255);
        if (C7019kk.m27469x1(c12534m9, C12532k4.class) && C7019kk.m27469x1(c12534m92, C12532k4.class)) {
            return new C12532k4((byte) (((C12532k4) C7019kk.m27452k4((Object) c12534m9, C12532k4.class)).m58347k4() & 255 & ((C12532k4) C7019kk.m27452k4((Object) c12534m92, C12532k4.class)).m58347k4() & 255), bM58358kk, bM58360to, bM58355du);
        }
        if (!C7019kk.m27469x1(c12534m9, C12532k4.class) && !C7019kk.m27469x1(c12534m92, C12532k4.class)) {
            return new C12534m9(bM58358kk, bM58360to, bM58355du);
        }
        if (C7019kk.m27469x1(c12534m9, C12532k4.class)) {
            if ((((C12532k4) C7019kk.m27452k4((Object) c12534m9, C12532k4.class)).m58347k4() & 255) == 0) {
                return (((byte) ((((byte) (255 - ((((c12534m92.m58358kk() & 255) + (c12534m92.m58360to() & 255)) + (c12534m92.m58355du() & 255)) / 3))) & 255) > 0 ? 255 : 0)) & 255) == 0 ? new C12532k4(C12003du.f40505to.Clone()) : new C12534m9(bM58358kk, bM58360to, bM58355du);
            }
            return new C12534m9(bM58358kk, bM58360to, bM58355du);
        }
        if ((((C12532k4) C7019kk.m27452k4((Object) c12534m92, C12532k4.class)).m58347k4() & 255) == 0) {
            return (((byte) ((((byte) (255 - ((((c12534m9.m58358kk() & 255) + (c12534m9.m58360to() & 255)) + (c12534m9.m58355du() & 255)) / 3))) & 255) > 0 ? 255 : 0)) & 255) == 0 ? new C12532k4(C12003du.f40505to.Clone()) : new C12534m9(bM58358kk, bM58360to, bM58355du);
        }
        return new C12534m9(bM58358kk, bM58360to, bM58355du);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m15552k4(C12014ne c12014ne, C12014ne c12014ne2) {
        return C12014ne.m56656k4(c12014ne2.Clone(), c12014ne.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12534m9 m15553k4(C12534m9 c12534m9) {
        C12534m9 c12534m92 = f10576k4;
        if (c12534m9.equals(c12534m92)) {
            return new C12532k4(C12003du.f40505to.Clone());
        }
        byte b = (byte) (~(c12534m9.m58358kk() & 255));
        byte b2 = (byte) (~(c12534m9.m58360to() & 255));
        byte b3 = (byte) (~(c12534m9.m58355du() & 255));
        if (!C7019kk.m27469x1(c12534m9, C12532k4.class)) {
            return new C12534m9(b, b2, b3);
        }
        if (c12534m9.mo58349x1().m56506h4() == 0) {
            return c12534m92;
        }
        if ((((C12532k4) C7019kk.m27452k4((Object) c12534m9, C12532k4.class)).m58347k4() & 255) != 0) {
            return (((byte) ((C7019kk.m27442k4(Float.valueOf(((((float) (((b & 255) + (b2 & 255)) + (b3 & 255))) / 3.0f) / 255.0f) * 255.0f), 13) & 255) > 128 ? 255 : 0)) & 255) == 0 ? new C12532k4(C12003du.f40505to.Clone()) : new C12534m9(b, b2, b3);
        }
        return new C12534m9(C12003du.m56385i5().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12534m9 m15554k4(C12534m9 c12534m9, C12534m9 c12534m92) {
        byte bM58358kk = (byte) ((c12534m9.m58358kk() & 255) | (c12534m92.m58358kk() & 255));
        byte bM58360to = (byte) ((c12534m9.m58360to() & 255) | (c12534m92.m58360to() & 255));
        byte bM58355du = (byte) ((c12534m9.m58355du() & 255) | (c12534m92.m58355du() & 255));
        if (C7019kk.m27469x1(c12534m9, C12532k4.class) && C7019kk.m27469x1(c12534m92, C12532k4.class)) {
            return new C12532k4((byte) ((((C12532k4) C7019kk.m27452k4((Object) c12534m9, C12532k4.class)).m58347k4() & 255) | (((C12532k4) C7019kk.m27452k4((Object) c12534m92, C12532k4.class)).m58347k4() & 255)), bM58358kk, bM58360to, bM58355du);
        }
        if (!C7019kk.m27469x1(c12534m9, C12532k4.class) && !C7019kk.m27469x1(c12534m92, C12532k4.class)) {
            return new C12534m9(bM58358kk, bM58360to, bM58355du);
        }
        if (C7019kk.m27469x1(c12534m9, C12532k4.class)) {
            if ((((C12532k4) C7019kk.m27452k4((Object) c12534m9, C12532k4.class)).m58347k4() & 255) == 0) {
                return (((byte) ((((byte) ((((c12534m92.m58358kk() & 255) + (c12534m92.m58360to() & 255)) + (c12534m92.m58355du() & 255)) / 3)) & 255) > 128 ? 255 : 0)) & 255) == 0 ? new C12532k4(C12003du.f40505to.Clone()) : new C12534m9(bM58358kk, bM58360to, bM58355du);
            }
            return new C12534m9(bM58358kk, bM58360to, bM58355du);
        }
        if ((((C12532k4) C7019kk.m27452k4((Object) c12534m92, C12532k4.class)).m58347k4() & 255) == 0) {
            return (((byte) ((((byte) ((((c12534m9.m58358kk() & 255) + (c12534m9.m58360to() & 255)) + (c12534m92.m58355du() & 255)) / 3)) & 255) > 128 ? 255 : 0)) & 255) == 0 ? new C12532k4(C12003du.f40505to.Clone()) : new C12534m9(bM58358kk, bM58360to, bM58355du);
        }
        return new C12534m9(bM58358kk, bM58360to, bM58355du);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12534m9 m15555k4(C12534m9 c12534m9, C12534m9 c12534m92, C12534m9 c12534m93, long j) {
        switch ((int) j) {
            case 0:
                return new C12532k4(C12003du.m56460uz().Clone());
            case 1:
                return m15553k4(m15554k4(c12534m92, m15554k4(c12534m93, c12534m9)));
            case 2:
                return m15558x1(c12534m92, m15553k4(m15554k4(c12534m93, c12534m9)));
            case 3:
                return m15553k4(m15554k4(c12534m93, c12534m9));
            case 4:
                return m15558x1(c12534m9, m15553k4(m15554k4(c12534m92, c12534m93)));
            case 5:
                return m15553k4(m15554k4(c12534m92, c12534m93));
            case 6:
                return m15553k4(m15554k4(c12534m93, m15553k4(m15557to(c12534m92, c12534m9))));
            case 7:
                return m15553k4(m15554k4(c12534m93, m15558x1(c12534m92, c12534m9)));
            case 8:
                return m15558x1(c12534m9, m15558x1(c12534m92, m15553k4(c12534m93)));
            case 9:
                return m15553k4(m15554k4(c12534m93, m15557to(c12534m92, c12534m9)));
            case 10:
                return m15558x1(c12534m92, m15553k4(c12534m93));
            case 11:
                return m15553k4(m15554k4(c12534m93, m15558x1(c12534m9, m15553k4(c12534m92))));
            case 12:
                return m15558x1(c12534m9, m15553k4(c12534m93));
            case 13:
                return m15553k4(m15554k4(m15558x1(m15553k4(c12534m9), c12534m92), c12534m93));
            case 14:
                return m15553k4(m15554k4(m15553k4(m15554k4(c12534m92, c12534m9)), c12534m93));
            case 15:
                return m15553k4(c12534m93);
            case 16:
                return m15558x1(m15553k4(m15554k4(c12534m92, c12534m9)), c12534m93);
            case 17:
                return m15553k4(m15554k4(c12534m9, c12534m92));
            case 18:
                return m15553k4(m15554k4(m15553k4(m15557to(c12534m93, c12534m92)), c12534m9));
            case 19:
                return m15553k4(m15554k4(m15558x1(c12534m93, c12534m92), c12534m9));
            case 20:
                return m15553k4(m15554k4(m15553k4(m15557to(c12534m9, c12534m93)), c12534m92));
            case 21:
                return m15553k4(m15554k4(m15558x1(c12534m9, c12534m93), c12534m92));
            case 22:
                return m15557to(m15557to(m15558x1(m15553k4(m15558x1(c12534m9, c12534m93)), c12534m92), c12534m9), c12534m93);
            case 23:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9)), c12534m9));
            case 24:
                return m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m93, c12534m9));
            case 25:
                return m15553k4(m15557to(m15558x1(m15553k4(m15558x1(c12534m9, c12534m93)), c12534m92), c12534m9));
            case 26:
                return m15557to(m15554k4(m15558x1(c12534m93, c12534m9), c12534m92), c12534m93);
            case 27:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m9, c12534m93), c12534m92), c12534m9));
            case 28:
                return m15557to(m15554k4(m15558x1(c12534m93, c12534m92), c12534m9), c12534m93);
            case 29:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m92, c12534m93), c12534m9), c12534m92));
            case 30:
                return m15557to(m15554k4(c12534m9, c12534m92), c12534m93);
            case 31:
                return m15553k4(m15558x1(m15554k4(c12534m9, c12534m92), c12534m93));
            case 32:
                return m15558x1(m15558x1(m15553k4(c12534m9), c12534m93), c12534m92);
            case 33:
                return m15553k4(m15554k4(m15557to(c12534m93, c12534m92), c12534m9));
            case 34:
                return m15558x1(m15553k4(c12534m9), c12534m92);
            case 35:
                return m15553k4(m15554k4(m15558x1(m15553k4(c12534m92), c12534m93), c12534m9));
            case 36:
                return m15558x1(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9));
            case 37:
                return m15553k4(m15557to(m15558x1(m15553k4(m15558x1(c12534m93, c12534m9)), c12534m92), c12534m93));
            case 38:
                return m15557to(m15554k4(m15558x1(c12534m9, c12534m93), c12534m92), c12534m9);
            case 39:
                return m15557to(m15554k4(m15553k4(m15557to(c12534m9, c12534m93)), c12534m92), c12534m9);
            case 40:
                return m15558x1(m15557to(c12534m9, c12534m93), c12534m92);
            case 41:
                return m15553k4(m15557to(m15557to(m15554k4(m15558x1(c12534m9, c12534m93), c12534m92), c12534m9), c12534m93));
            case 42:
                return m15558x1(m15553k4(m15558x1(c12534m9, c12534m93)), c12534m92);
            case 43:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m93, c12534m9)), c12534m9));
            case 44:
                return m15557to(m15558x1(m15554k4(c12534m9, c12534m92), c12534m93), c12534m9);
            case 45:
                return m15557to(m15554k4(m15553k4(c12534m92), c12534m9), c12534m93);
            case 46:
                return m15557to(m15554k4(m15557to(c12534m93, c12534m92), c12534m9), c12534m93);
            case 47:
                return m15553k4(m15558x1(m15554k4(m15553k4(c12534m92), c12534m9), c12534m93));
            case 48:
                return m15558x1(m15553k4(c12534m9), c12534m93);
            case 49:
                return m15553k4(m15554k4(m15558x1(m15553k4(c12534m93), c12534m92), c12534m9));
            case 50:
                return m15557to(m15554k4(m15554k4(c12534m9, c12534m93), c12534m92), c12534m9);
            case 51:
                return m15553k4(c12534m9);
            case 52:
                return m15557to(m15554k4(m15558x1(c12534m9, c12534m92), c12534m93), c12534m9);
            case 53:
                return m15557to(m15554k4(m15553k4(m15557to(c12534m9, c12534m92)), c12534m93), c12534m9);
            case 54:
                return m15557to(m15554k4(c12534m93, c12534m92), c12534m9);
            case 55:
                return m15553k4(m15558x1(m15554k4(c12534m93, c12534m92), c12534m9));
            case 56:
                return m15557to(m15558x1(m15554k4(c12534m93, c12534m92), c12534m9), c12534m93);
            case 57:
                return m15557to(m15554k4(m15553k4(c12534m92), c12534m93), c12534m9);
            case 58:
                return m15557to(m15554k4(m15557to(c12534m9, c12534m92), c12534m93), c12534m9);
            case 59:
                return m15553k4(m15558x1(m15554k4(m15553k4(c12534m92), c12534m93), c12534m9));
            case 60:
                return m15557to(c12534m9, c12534m93);
            case 61:
                return m15557to(m15554k4(m15553k4(m15554k4(c12534m9, c12534m92)), c12534m93), c12534m9);
            case 62:
                return m15557to(m15554k4(m15558x1(m15553k4(c12534m9), c12534m92), c12534m93), c12534m9);
            case 63:
                return m15553k4(m15558x1(c12534m9, c12534m93));
            case 64:
                return m15558x1(m15558x1(m15553k4(c12534m92), c12534m9), c12534m93);
            case 65:
                return m15553k4(m15554k4(m15557to(c12534m9, c12534m93), c12534m92));
            case 66:
                return m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m92, c12534m9));
            case 67:
                return m15553k4(m15557to(m15558x1(m15553k4(m15558x1(c12534m9, c12534m92)), c12534m93), c12534m9));
            case 68:
                return m15558x1(m15553k4(c12534m92), c12534m9);
            case 69:
                return m15553k4(m15554k4(m15558x1(m15553k4(c12534m9), c12534m93), c12534m92));
            case 70:
                return m15557to(m15554k4(m15558x1(c12534m92, c12534m93), c12534m9), c12534m92);
            case 71:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m93, c12534m92), c12534m9), c12534m93));
            case 72:
                return m15558x1(m15557to(c12534m93, c12534m92), c12534m9);
            case 73:
                return m15553k4(m15557to(m15557to(m15554k4(m15558x1(c12534m92, c12534m93), c12534m9), c12534m92), c12534m93));
            case 74:
                return m15557to(m15558x1(m15554k4(c12534m92, c12534m9), c12534m93), c12534m92);
            case 75:
                return m15557to(m15554k4(m15553k4(c12534m9), c12534m92), c12534m93);
            case 76:
                return m15558x1(m15553k4(m15558x1(c12534m93, c12534m92)), c12534m9);
            case 77:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9)), c12534m9));
            case 78:
                return m15557to(m15554k4(m15557to(c12534m93, c12534m9), c12534m92), c12534m93);
            case 79:
                return m15553k4(m15558x1(m15554k4(m15553k4(c12534m9), c12534m92), c12534m93));
            case 80:
                return m15558x1(m15553k4(c12534m92), c12534m93);
            case 81:
                return m15553k4(m15554k4(m15558x1(m15553k4(c12534m93), c12534m9), c12534m92));
            case 82:
                return m15557to(m15554k4(m15558x1(c12534m92, c12534m9), c12534m93), c12534m92);
            case 83:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m9, c12534m92), c12534m93), c12534m9));
            case 84:
                return m15553k4(m15554k4(m15553k4(m15554k4(c12534m9, c12534m93)), c12534m92));
            case 85:
                return m15553k4(c12534m92);
            case 86:
                return m15557to(m15554k4(c12534m9, c12534m93), c12534m92);
            case 87:
                return m15553k4(m15558x1(m15554k4(c12534m9, c12534m93), c12534m92));
            case 88:
                return m15557to(m15558x1(m15554k4(c12534m93, c12534m9), c12534m92), c12534m93);
            case 89:
                return m15557to(m15554k4(m15553k4(c12534m9), c12534m93), c12534m92);
            case 90:
                return m15557to(c12534m93, c12534m92);
            case 91:
                return m15557to(m15554k4(m15553k4(m15554k4(c12534m92, c12534m9)), c12534m93), c12534m92);
            case 92:
                return m15557to(m15554k4(m15557to(c12534m92, c12534m9), c12534m93), c12534m92);
            case 93:
                return m15553k4(m15558x1(m15554k4(m15553k4(c12534m9), c12534m93), c12534m92));
            case 94:
                return m15557to(m15554k4(m15558x1(m15553k4(c12534m92), c12534m9), c12534m93), c12534m92);
            case 95:
                return m15553k4(m15558x1(c12534m93, c12534m92));
            case 96:
                return m15558x1(m15557to(c12534m9, c12534m92), c12534m93);
            case 97:
                return m15553k4(m15557to(m15557to(m15554k4(m15558x1(c12534m9, c12534m92), c12534m93), c12534m9), c12534m92));
            case 98:
                return m15557to(m15558x1(m15554k4(c12534m92, c12534m93), c12534m9), c12534m92);
            case 99:
                return m15557to(m15554k4(m15553k4(c12534m93), c12534m92), c12534m9);
            case 100:
                return m15557to(m15558x1(m15554k4(c12534m9, c12534m93), c12534m92), c12534m9);
            case 101:
                return m15557to(m15554k4(m15553k4(c12534m93), c12534m9), c12534m92);
            case 102:
                return m15557to(c12534m9, c12534m92);
            case 103:
                return m15557to(m15554k4(m15553k4(m15554k4(c12534m9, c12534m93)), c12534m92), c12534m9);
            case 104:
                return m15553k4(m15557to(m15557to(m15554k4(m15553k4(m15554k4(c12534m9, c12534m92)), c12534m93), c12534m9), c12534m92));
            case 105:
                return m15553k4(m15557to(m15557to(c12534m9, c12534m92), c12534m93));
            case 106:
                return m15557to(m15558x1(c12534m9, c12534m93), c12534m92);
            case 107:
                return m15553k4(m15557to(m15557to(m15558x1(m15554k4(c12534m9, c12534m93), c12534m92), c12534m9), c12534m93));
            case 108:
                return m15557to(m15558x1(c12534m93, c12534m92), c12534m9);
            case 109:
                return m15553k4(m15557to(m15557to(m15558x1(m15554k4(c12534m92, c12534m93), c12534m9), c12534m92), c12534m93));
            case 110:
                return m15557to(m15558x1(m15554k4(m15553k4(c12534m9), c12534m93), c12534m92), c12534m9);
            case 111:
                return m15553k4(m15558x1(m15553k4(m15557to(c12534m9, c12534m92)), c12534m93));
            case 112:
                return m15558x1(m15553k4(m15558x1(c12534m9, c12534m92)), c12534m93);
            case 113:
                return m15553k4(m15557to(m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m92, c12534m9)), c12534m9));
            case 114:
                return m15557to(m15554k4(m15557to(c12534m9, c12534m93), c12534m92), c12534m9);
            case 115:
                return m15553k4(m15558x1(m15554k4(m15553k4(c12534m93), c12534m92), c12534m9));
            case 116:
                return m15557to(m15554k4(m15557to(c12534m92, c12534m93), c12534m9), c12534m92);
            case 117:
                return m15553k4(m15558x1(m15554k4(m15553k4(c12534m93), c12534m9), c12534m92));
            case 118:
                return m15557to(m15554k4(m15558x1(m15553k4(c12534m9), c12534m93), c12534m92), c12534m9);
            case 119:
                return m15553k4(m15558x1(c12534m9, c12534m92));
            case 120:
                return m15557to(m15558x1(c12534m9, c12534m92), c12534m93);
            case 121:
                return m15553k4(m15557to(m15557to(m15558x1(m15554k4(c12534m9, c12534m92), c12534m93), c12534m9), c12534m92));
            case 122:
                return m15557to(m15558x1(m15554k4(m15553k4(c12534m92), c12534m9), c12534m93), c12534m92);
            case 123:
                return m15553k4(m15558x1(m15553k4(m15557to(c12534m93, c12534m92)), c12534m9));
            case 124:
                return m15557to(m15558x1(m15554k4(m15553k4(c12534m9), c12534m92), c12534m93), c12534m9);
            case 125:
                return m15553k4(m15558x1(m15553k4(m15557to(c12534m9, c12534m93)), c12534m92));
            case 126:
                return m15554k4(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9));
            case 127:
                return m15553k4(m15558x1(m15558x1(c12534m9, c12534m93), c12534m92));
            case 128:
                return m15558x1(m15558x1(c12534m9, c12534m93), c12534m92);
            case 129:
                return m15553k4(m15554k4(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9)));
            case 130:
                return m15558x1(m15553k4(m15557to(c12534m9, c12534m93)), c12534m92);
            case 131:
                return m15553k4(m15557to(m15558x1(m15554k4(m15553k4(c12534m9), c12534m92), c12534m93), c12534m9));
            case 132:
                return m15558x1(m15553k4(m15557to(c12534m93, c12534m92)), c12534m9);
            case 133:
                return m15553k4(m15557to(m15558x1(m15554k4(m15553k4(c12534m93), c12534m9), c12534m92), c12534m93));
            case 134:
                return m15557to(m15557to(m15558x1(m15554k4(c12534m9, c12534m92), c12534m93), c12534m9), c12534m92);
            case 135:
                return m15553k4(m15557to(m15558x1(c12534m9, c12534m92), c12534m93));
            case 136:
                return m15558x1(c12534m9, c12534m92);
            case 137:
                return m15553k4(m15557to(m15554k4(m15558x1(m15553k4(c12534m9), c12534m93), c12534m92), c12534m9));
            case 138:
                return m15558x1(m15554k4(m15553k4(c12534m93), c12534m9), c12534m92);
            case 139:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m92, c12534m93), c12534m9), c12534m92));
            case 140:
                return m15558x1(m15554k4(m15553k4(c12534m93), c12534m92), c12534m9);
            case 141:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m9, c12534m93), c12534m92), c12534m9));
            case 142:
                return m15557to(m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m92, c12534m9)), c12534m9);
            case 143:
                return m15553k4(m15558x1(m15553k4(m15558x1(c12534m9, c12534m92)), c12534m93));
            case 144:
                return m15558x1(m15553k4(m15557to(c12534m9, c12534m92)), c12534m93);
            case 145:
                return m15553k4(m15557to(m15558x1(m15554k4(m15553k4(c12534m9), c12534m93), c12534m92), c12534m9));
            case 146:
                return m15557to(m15557to(m15558x1(m15554k4(c12534m93, c12534m92), c12534m9), c12534m93), c12534m92);
            case 147:
                return m15553k4(m15557to(m15558x1(c12534m92, c12534m93), c12534m9));
            case 148:
                return m15557to(m15557to(m15558x1(m15554k4(c12534m9, c12534m93), c12534m92), c12534m9), c12534m93);
            case 149:
                return m15553k4(m15557to(m15558x1(c12534m9, c12534m93), c12534m92));
            case 150:
                return m15557to(m15557to(c12534m9, c12534m93), c12534m92);
            case 151:
                return m15557to(m15557to(m15554k4(m15553k4(m15554k4(c12534m9, c12534m93)), c12534m92), c12534m9), c12534m93);
            case 152:
                return m15553k4(m15557to(m15554k4(m15553k4(m15554k4(c12534m9, c12534m93)), c12534m92), c12534m9));
            case 153:
                return m15553k4(m15557to(c12534m9, c12534m92));
            case 154:
                return m15557to(m15558x1(m15553k4(c12534m9), c12534m93), c12534m92);
            case 155:
                return m15553k4(m15557to(m15558x1(m15554k4(c12534m9, c12534m93), c12534m92), c12534m9));
            case 156:
                return m15557to(m15558x1(m15553k4(c12534m92), c12534m93), c12534m9);
            case 157:
                return m15553k4(m15557to(m15558x1(m15554k4(c12534m92, c12534m93), c12534m9), c12534m92));
            case 158:
                return m15557to(m15557to(m15554k4(m15558x1(c12534m9, c12534m92), c12534m93), c12534m9), c12534m92);
            case 159:
                return m15553k4(m15558x1(m15557to(c12534m9, c12534m92), c12534m93));
            case 160:
                return m15558x1(c12534m93, c12534m92);
            case 161:
                return m15553k4(m15557to(m15554k4(m15558x1(m15553k4(c12534m93), c12534m9), c12534m92), c12534m93));
            case 162:
                return m15558x1(m15554k4(m15553k4(c12534m9), c12534m93), c12534m92);
            case 163:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m92, c12534m9), c12534m93), c12534m92));
            case 164:
                return m15553k4(m15557to(m15554k4(m15553k4(m15554k4(c12534m93, c12534m9)), c12534m92), c12534m93));
            case 165:
                return m15553k4(m15557to(c12534m92, c12534m93));
            case 166:
                return m15557to(m15558x1(m15553k4(c12534m93), c12534m9), c12534m92);
            case 167:
                return m15553k4(m15557to(m15558x1(m15554k4(c12534m93, c12534m9), c12534m92), c12534m93));
            case 168:
                return m15558x1(m15554k4(c12534m9, c12534m93), c12534m92);
            case 169:
                return m15553k4(m15557to(m15554k4(c12534m9, c12534m93), c12534m92));
            case 170:
            default:
                return c12534m92;
            case 171:
                return m15554k4(m15553k4(m15554k4(c12534m9, c12534m93)), c12534m92);
            case 172:
                return m15557to(m15558x1(m15557to(c12534m9, c12534m92), c12534m93), c12534m9);
            case 173:
                return m15553k4(m15557to(m15554k4(m15558x1(c12534m92, c12534m9), c12534m93), c12534m92));
            case 174:
                return m15554k4(m15558x1(m15553k4(c12534m93), c12534m9), c12534m92);
            case 175:
                return m15554k4(m15553k4(c12534m93), c12534m92);
            case 176:
                return m15558x1(m15554k4(m15553k4(c12534m9), c12534m92), c12534m93);
            case 177:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m93, c12534m9), c12534m92), c12534m93));
            case 178:
                return m15557to(m15554k4(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9)), c12534m9);
            case 179:
                return m15553k4(m15558x1(m15553k4(m15558x1(c12534m93, c12534m92)), c12534m9));
            case 180:
                return m15557to(m15558x1(m15553k4(c12534m92), c12534m9), c12534m93);
            case 181:
                return m15553k4(m15557to(m15558x1(m15554k4(c12534m92, c12534m9), c12534m93), c12534m92));
            case 182:
                return m15557to(m15557to(m15554k4(m15558x1(c12534m93, c12534m92), c12534m9), c12534m93), c12534m92);
            case 183:
                return m15553k4(m15558x1(m15557to(c12534m93, c12534m92), c12534m9));
            case 184:
                return m15557to(m15558x1(m15557to(c12534m93, c12534m92), c12534m9), c12534m93);
            case 185:
                return m15553k4(m15557to(m15554k4(m15558x1(c12534m92, c12534m93), c12534m9), c12534m92));
            case 186:
                return m15554k4(m15558x1(m15553k4(c12534m9), c12534m93), c12534m92);
            case 187:
                return m15554k4(m15553k4(c12534m9), c12534m92);
            case 188:
                return m15557to(m15558x1(m15553k4(m15558x1(c12534m9, c12534m92)), c12534m93), c12534m9);
            case 189:
                return m15553k4(m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m92, c12534m9)));
            case 190:
                return m15554k4(m15557to(c12534m9, c12534m93), c12534m92);
            case 191:
                return m15554k4(m15553k4(m15558x1(c12534m9, c12534m93)), c12534m92);
            case 192:
                return m15558x1(c12534m9, c12534m93);
            case 193:
                return m15553k4(m15557to(m15554k4(m15558x1(m15553k4(c12534m9), c12534m92), c12534m93), c12534m9));
            case 194:
                return m15553k4(m15557to(m15554k4(m15553k4(m15554k4(c12534m9, c12534m92)), c12534m93), c12534m9));
            case 195:
                return m15553k4(m15557to(c12534m9, c12534m93));
            case 196:
                return m15558x1(m15554k4(m15553k4(c12534m92), c12534m93), c12534m9);
            case 197:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m9, c12534m92), c12534m93), c12534m9));
            case 198:
                return m15557to(m15558x1(m15553k4(c12534m93), c12534m92), c12534m9);
            case 199:
                return m15553k4(m15557to(m15558x1(m15554k4(c12534m93, c12534m92), c12534m9), c12534m93));
            case 200:
                return m15558x1(m15554k4(c12534m93, c12534m92), c12534m9);
            case 201:
                return m15553k4(m15557to(m15554k4(c12534m92, c12534m93), c12534m9));
            case 202:
                return m15557to(m15558x1(m15557to(c12534m92, c12534m9), c12534m93), c12534m92);
            case 203:
                return m15553k4(m15557to(m15554k4(m15558x1(c12534m9, c12534m92), c12534m93), c12534m9));
            case 204:
                return c12534m9;
            case 205:
                return m15554k4(m15553k4(m15554k4(c12534m93, c12534m92)), c12534m9);
            case 206:
                return m15554k4(m15558x1(m15553k4(c12534m93), c12534m92), c12534m9);
            case 207:
                return m15554k4(m15553k4(c12534m93), c12534m9);
            case 208:
                return m15558x1(m15554k4(m15553k4(c12534m92), c12534m9), c12534m93);
            case 209:
                return m15553k4(m15557to(m15554k4(m15557to(c12534m93, c12534m92), c12534m9), c12534m93));
            case 210:
                return m15557to(m15558x1(m15553k4(c12534m9), c12534m92), c12534m93);
            case 211:
                return m15553k4(m15557to(m15558x1(m15554k4(c12534m9, c12534m92), c12534m93), c12534m9));
            case 212:
                return m15557to(m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m93, c12534m9)), c12534m9);
            case 213:
                return m15553k4(m15558x1(m15553k4(m15558x1(c12534m9, c12534m93)), c12534m92));
            case 214:
                return m15557to(m15557to(m15554k4(m15558x1(c12534m9, c12534m93), c12534m92), c12534m9), c12534m93);
            case 215:
                return m15553k4(m15558x1(m15557to(c12534m9, c12534m93), c12534m92));
            case 216:
                return m15557to(m15558x1(m15557to(c12534m93, c12534m9), c12534m92), c12534m93);
            case 217:
                return m15553k4(m15557to(m15554k4(m15558x1(c12534m9, c12534m93), c12534m92), c12534m9));
            case 218:
                return m15557to(m15558x1(m15553k4(m15558x1(c12534m92, c12534m9)), c12534m93), c12534m92);
            case 219:
                return m15553k4(m15558x1(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9)));
            case 220:
                return m15554k4(m15558x1(m15553k4(c12534m92), c12534m93), c12534m9);
            case 221:
                return m15554k4(m15553k4(c12534m92), c12534m9);
            case 222:
                return m15554k4(m15557to(c12534m93, c12534m92), c12534m9);
            case 223:
                return m15554k4(m15553k4(m15558x1(c12534m93, c12534m92)), c12534m9);
            case 224:
                return m15558x1(m15554k4(c12534m9, c12534m92), c12534m93);
            case 225:
                return m15553k4(m15557to(m15554k4(c12534m9, c12534m92), c12534m93));
            case 226:
                return m15557to(m15558x1(m15557to(c12534m92, c12534m93), c12534m9), c12534m92);
            case 227:
                return m15553k4(m15557to(m15554k4(m15558x1(c12534m93, c12534m92), c12534m9), c12534m93));
            case 228:
                return m15557to(m15558x1(m15557to(c12534m9, c12534m93), c12534m92), c12534m9);
            case 229:
                return m15553k4(m15557to(m15554k4(m15558x1(c12534m93, c12534m9), c12534m92), c12534m93));
            case 230:
                return m15557to(m15558x1(m15553k4(m15558x1(c12534m9, c12534m93)), c12534m92), c12534m9);
            case 231:
                return m15553k4(m15558x1(m15557to(c12534m92, c12534m93), m15557to(c12534m93, c12534m9)));
            case 232:
                return m15557to(m15558x1(m15557to(c12534m9, c12534m92), m15557to(c12534m93, c12534m9)), c12534m9);
            case 233:
                return m15553k4(m15557to(m15557to(m15558x1(m15553k4(m15558x1(c12534m9, c12534m92)), c12534m93), c12534m9), c12534m92));
            case 234:
                return m15554k4(m15558x1(c12534m9, c12534m93), c12534m92);
            case 235:
                return m15554k4(m15553k4(m15557to(c12534m9, c12534m93)), c12534m92);
            case 236:
                return m15554k4(m15558x1(c12534m93, c12534m92), c12534m9);
            case 237:
                return m15554k4(m15553k4(m15557to(c12534m93, c12534m92)), c12534m9);
            case 238:
                return m15554k4(c12534m9, c12534m92);
            case 239:
                return m15554k4(m15554k4(m15553k4(c12534m93), c12534m92), c12534m9);
            case 240:
                return c12534m93;
            case 241:
                return m15554k4(m15553k4(m15554k4(c12534m9, c12534m92)), c12534m93);
            case 242:
                return m15554k4(m15558x1(m15553k4(c12534m9), c12534m92), c12534m93);
            case 243:
                return m15554k4(m15553k4(c12534m9), c12534m93);
            case 244:
                return m15554k4(m15558x1(m15553k4(c12534m92), c12534m9), c12534m93);
            case 245:
                return m15554k4(m15553k4(c12534m92), c12534m93);
            case 246:
                return m15554k4(m15557to(c12534m9, c12534m92), c12534m93);
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                return m15554k4(m15553k4(m15558x1(c12534m9, c12534m92)), c12534m93);
            case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                return m15554k4(m15558x1(c12534m9, c12534m92), c12534m93);
            case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                return m15554k4(m15553k4(m15557to(c12534m9, c12534m92)), c12534m93);
            case 250:
                return m15554k4(c12534m93, c12534m92);
            case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                return m15554k4(m15554k4(m15553k4(c12534m9), c12534m93), c12534m92);
            case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                return m15554k4(c12534m9, c12534m93);
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                return m15554k4(m15554k4(m15553k4(c12534m92), c12534m9), c12534m93);
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                return m15554k4(m15554k4(c12534m9, c12534m93), c12534m92);
            case 255:
                return new C12532k4(C12003du.m56385i5().Clone());
        }
    }
}
