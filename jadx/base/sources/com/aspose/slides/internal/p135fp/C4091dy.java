package com.aspose.slides.internal.p135fp;

import com.aspose.slides.internal.p185il.C5104x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.dy */
/* JADX INFO: loaded from: classes.dex */
public final class C4091dy {

    /* JADX INFO: renamed from: k4 */
    static final byte[] f11172k4 = {74, 70, 73, 70, 0};

    /* JADX INFO: renamed from: du */
    private short f11173du;

    /* JADX INFO: renamed from: h4 */
    private short f11174h4;

    /* JADX INFO: renamed from: x1 */
    private byte f11177x1;

    /* JADX INFO: renamed from: to */
    private short f11176to = 258;

    /* JADX INFO: renamed from: kk */
    private AbstractC13613um f11175kk = null;

    /* JADX INFO: renamed from: k4 */
    public static C4091dy m16286k4(C4094ix c4094ix) {
        c4094ix.m16302k4(new int[]{0});
        byte[] bArr = new byte[5];
        c4094ix.m16300k4(bArr, 5);
        if (!C14113y2.m67448x1(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 5), "JFIF")) {
            return null;
        }
        C4091dy c4091dy = new C4091dy();
        int[] iArr = {0};
        c4094ix.m16302k4(iArr);
        int i = iArr[0];
        int[] iArr2 = {0};
        c4094ix.m16309x1(iArr2);
        c4091dy.f11177x1 = (byte) iArr2[0];
        int[] iArr3 = {0};
        c4094ix.m16302k4(iArr3);
        int i2 = iArr3[0];
        int[] iArr4 = {0};
        c4094ix.m16302k4(iArr4);
        int i3 = iArr4[0];
        c4091dy.f11173du = C7019kk.m27468x1(Integer.valueOf(i2), 9);
        c4091dy.f11174h4 = C7019kk.m27468x1(Integer.valueOf(i3), 9);
        int[] iArr5 = {0};
        c4094ix.m16309x1(iArr5);
        int i4 = iArr5[0];
        int[] iArr6 = {0};
        c4094ix.m16309x1(iArr6);
        int i5 = iArr6[0];
        if (i5 != 0 && i4 != 0) {
            int i6 = i5 * i4;
            int[] iArr7 = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                int[] iArr8 = {0};
                c4094ix.m16309x1(iArr8);
                int i8 = iArr8[0];
                int[] iArr9 = {0};
                c4094ix.m16309x1(iArr9);
                int i9 = iArr9[0];
                int[] iArr10 = {0};
                c4094ix.m16309x1(iArr10);
                iArr7[i7] = (i8 << 16) + (i9 << 8) + iArr10[0];
            }
            C4102rv c4102rv = new C4102rv(i4, i5);
            c4091dy.f11175kk = c4102rv;
            c4102rv.m62810kk(new C12014ne(0, 0, i4, i5), iArr7);
        }
        c4091dy.f11176to = C7019kk.m27468x1(Integer.valueOf(i), 9);
        return c4091dy;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16290x1(short s) {
        this.f11174h4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13613um m16288k4() {
        return this.f11175kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16287k4(C4091dy c4091dy, C4101qq c4101qq) {
        AbstractC13613um abstractC13613um = c4091dy.f11175kk;
        if (abstractC13613um != null) {
            if (abstractC13613um.mo10009jd() > 255 || c4091dy.f11175kk.mo10012up() > 255) {
                throw new C5104x1("Thumbnail width or height cannot be over 255 pixels.");
            }
            if ((c4091dy.f11175kk.mo10009jd() * c4091dy.f11175kk.mo10012up() * 3) + 16 > C7019kk.m27457kk((Object) 65535, 8)) {
                throw new C5104x1("Thumbnail data cannot be over 21839 bytes long. Please, consider smaller thumbnail image.");
            }
        }
        c4101qq.m62855k4((byte) -1);
        c4101qq.m62855k4((byte) -32);
        AbstractC13613um abstractC13613um2 = c4091dy.f11175kk;
        c4101qq.m16370k4(C7019kk.m27457kk(Integer.valueOf((abstractC13613um2 != null ? c4091dy.f11175kk.mo10009jd() * abstractC13613um2.mo10012up() * 3 : 0) + 16), 9));
        c4101qq.m62855k4((byte) 74);
        c4101qq.m62855k4((byte) 70);
        c4101qq.m62855k4((byte) 73);
        c4101qq.m62855k4((byte) 70);
        c4101qq.m62855k4((byte) 0);
        c4101qq.m62855k4((byte) 1);
        c4101qq.m62855k4((byte) 1);
        c4101qq.m62855k4(c4091dy.f11177x1);
        c4101qq.m16370k4(C7019kk.m27457kk(Short.valueOf(c4091dy.f11173du), 7));
        c4101qq.m16370k4(C7019kk.m27457kk(Short.valueOf(c4091dy.f11174h4), 7));
        AbstractC13613um abstractC13613um3 = c4091dy.f11175kk;
        if (abstractC13613um3 == null) {
            c4101qq.m62855k4((byte) 0);
            c4101qq.m62855k4((byte) 0);
            return;
        }
        c4101qq.m62855k4(C7019kk.m27442k4(Integer.valueOf(abstractC13613um3.mo10012up()), 9));
        c4101qq.m62855k4(C7019kk.m27442k4(Integer.valueOf(c4091dy.f11175kk.mo10009jd()), 9));
        for (int i : c4091dy.m16288k4().m62814to(new C12014ne(0, 0, c4091dy.f11175kk.mo10012up(), c4091dy.f11175kk.mo10009jd()))) {
            c4101qq.m62855k4(C7019kk.m27442k4(Integer.valueOf((i >> 16) & 255), 9));
            c4101qq.m62855k4(C7019kk.m27442k4(Integer.valueOf((i >> 8) & 255), 9));
            c4101qq.m62855k4(C7019kk.m27442k4(Integer.valueOf(i & 255), 9));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m16289k4(short s) {
        this.f11173du = s;
    }
}
