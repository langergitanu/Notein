package com.aspose.slides.internal.p397sd;

import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p107eg.C3682c5;
import com.aspose.slides.internal.p107eg.C3687jd;
import com.aspose.slides.internal.p107eg.C3691to;
import com.aspose.slides.internal.p284mx.C6618k4;
import com.aspose.slides.internal.p284mx.C6619kk;
import com.aspose.slides.internal.p284mx.C6621x1;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10222kk {

    /* JADX INFO: renamed from: k4 */
    private boolean f36628k4;

    /* JADX INFO: renamed from: x1 */
    private C6621x1 f36629x1;

    public C10222kk() {
        this.f36629x1 = C6621x1.m26418k4();
        this.f36628k4 = false;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m50069k4(int i, C3687jd c3687jd, C13637dy c13637dy) {
        byte[] bArrM14972dy = c3687jd.m14972dy();
        return c13637dy.m62970x1(i, bArrM14972dy, 0, bArrM14972dy.length);
    }

    /* JADX INFO: renamed from: kk */
    private static int m50075kk(int i, C3687jd c3687jd, C13637dy c13637dy) {
        int iM62969x1 = c13637dy.m62969x1(i, c3687jd.m14979yj()) + i;
        return (c13637dy.m62969x1(iM62969x1, c3687jd.m14976ks()) + iM62969x1) - i;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m50076x1(int i, C3687jd c3687jd, C13637dy c13637dy) {
        int iM62969x1 = c13637dy.m62969x1(i, c3687jd.m14969c5()) + i;
        int iM62969x12 = c13637dy.m62969x1(iM62969x1, c3687jd.m14975jd()) + iM62969x1;
        int iM62969x13 = c13637dy.m62969x1(iM62969x12, c3687jd.m14970ck()) + iM62969x12;
        return (c13637dy.m62969x1(iM62969x13, c3687jd.m14973fa()) + iM62969x13) - i;
    }

    public C10222kk(boolean z) {
        this.f36629x1 = C6621x1.m26418k4();
        this.f36628k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m50070k4(int i, C13637dy c13637dy) {
        int iM62969x1 = i;
        for (int i2 = 0; i2 < 4; i2++) {
            iM62969x1 += c13637dy.m62969x1(iM62969x1, 0L);
        }
        return iM62969x1 - i;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m50077x1(int i, C13637dy c13637dy) {
        return c13637dy.m62960du(i, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m50071k4(int i, byte[] bArr, C13637dy c13637dy) {
        int iM62960du = c13637dy.m62960du(i, (short) bArr.length) + i;
        return (c13637dy.m62970x1(iM62960du, bArr, 0, bArr.length) + iM62960du) - i;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m50072k4(int i, int i2, int i3, int i4, int i5) {
        return i + 100 + i2 + i3 + i4 + i5 + 20;
    }

    /* JADX INFO: renamed from: k4 */
    private static C13637dy m50073k4(int i) {
        return C13637dy.m62959fa(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13637dy m50078k4(C6618k4 c6618k4, C10224to[] c10224toArr) {
        char c;
        long j;
        byte[] bArrM50052k4;
        c10224toArr[0] = new C10224to();
        C3123ar c3123ar = new C3123ar(new C3152yj());
        c3123ar.m13305k4(true);
        this.f36629x1.m26423k4(c6618k4, c3123ar);
        byte[] array = ((C3152yj) c3123ar.m13301k4()).toArray();
        C3682c5 c3682c5 = (C3682c5) c6618k4.m26396x1(C6619kk.f18333m9);
        byte[] bArrM50074k4 = m50074k4(c3682c5.m14930k4(3, 1, EditingLanguage.ENGLISH_US, 1));
        byte[] bArrM50074k42 = m50074k4(c3682c5.m14930k4(3, 1, EditingLanguage.ENGLISH_US, 2));
        byte[] bArrM50074k43 = m50074k4(c3682c5.m14930k4(3, 1, EditingLanguage.ENGLISH_US, 5));
        byte[] bArrM50074k44 = m50074k4(c3682c5.m14930k4(3, 1, EditingLanguage.ENGLISH_US, 4));
        if (!this.f36628k4 || (bArrM50052k4 = new C10218fa().m50052k4(c6618k4)) == null) {
            c = 3;
            j = 0;
        } else {
            array = bArrM50052k4;
            c = 3;
            j = 4;
        }
        long jM50072k4 = m50072k4(bArrM50074k4.length, bArrM50074k42.length, bArrM50074k43.length, bArrM50074k44.length, array.length);
        C13637dy c13637dyM50073k4 = m50073k4((int) jM50072k4);
        C3687jd c3687jd = (C3687jd) c6618k4.m26396x1(C6619kk.f18319dy);
        int iM62969x1 = c13637dyM50073k4.m62969x1(0, jM50072k4);
        c10224toArr[0].f36650k4 = jM50072k4 & 4294967295L;
        int iM62969x12 = c13637dyM50073k4.m62969x1(iM62969x1, array.length) + iM62969x1;
        c10224toArr[0].f36663x1 = ((long) array.length) & 4294967295L;
        int iM62969x13 = c13637dyM50073k4.m62969x1(iM62969x12, 131074L) + iM62969x12;
        c10224toArr[0].f36651kk = 131074L;
        int iM62969x14 = c13637dyM50073k4.m62969x1(iM62969x13, j) + iM62969x13;
        c10224toArr[0].f36657to = j & 4294967295L;
        int iM50069k4 = iM62969x14 + m50069k4(iM62969x14, c3687jd, c13637dyM50073k4);
        c10224toArr[0].f36644du = c3687jd.m14972dy();
        int iM62961k4 = c13637dyM50073k4.m62961k4(iM50069k4, (byte) 1) + iM50069k4;
        c10224toArr[0].f36647h4 = (byte) 1;
        int iM62961k42 = c13637dyM50073k4.m62961k4(iM62961k4, (byte) (c3687jd.m14978up() & 1)) + iM62961k4;
        c10224toArr[0].f36653m9 = (byte) (c3687jd.m14978up() & 1);
        int iM62969x15 = c13637dyM50073k4.m62969x1(iM62961k42, c3687jd.m14974h4()) + iM62961k42;
        c10224toArr[0].f36645dy = ((long) c3687jd.m14974h4()) & 4294967295L;
        int iM62960du = c13637dyM50073k4.m62960du(iM62969x15, (short) c3687jd.m14977m9()) + iM62969x15;
        c10224toArr[0].f36642c5 = c3687jd.m14977m9() & 65535;
        int iM62960du2 = c13637dyM50073k4.m62960du(iM62960du, 20556) + iM62960du;
        int iM50076x1 = iM62960du2 + m50076x1(iM62960du2, c3687jd, c13637dyM50073k4);
        C10224to c10224to = c10224toArr[0];
        long jM14969c5 = c3687jd.m14969c5() & 4294967295L;
        long jM14975jd = c3687jd.m14975jd() & 4294967295L;
        long jM14970ck = c3687jd.m14970ck() & 4294967295L;
        long jM14973fa = c3687jd.m14973fa() & 4294967295L;
        long[] jArr = new long[4];
        jArr[0] = jM14969c5;
        jArr[1] = jM14975jd;
        jArr[2] = jM14970ck;
        jArr[c] = jM14973fa;
        c10224to.f36649jd = jArr;
        int iM50075kk = iM50076x1 + m50075kk(iM50076x1, c3687jd, c13637dyM50073k4);
        c10224toArr[0].f36643ck = new long[]{c3687jd.m14979yj() & 4294967295L, c3687jd.m14976ks() & 4294967295L};
        C3691to c3691to = (C3691to) c6618k4.m26396x1(C6619kk.f18329kk);
        int iM62969x16 = c13637dyM50073k4.m62969x1(iM50075kk, c3691to.m14998du()) + iM50075kk;
        c10224toArr[0].f36646fa = c3691to.m14998du() & 4294967295L;
        int iM50070k4 = iM62969x16 + m50070k4(iM62969x16, c13637dyM50073k4);
        int iM50077x1 = iM50070k4 + m50077x1(iM50070k4, c13637dyM50073k4);
        c10224toArr[0].f36660up = 0;
        int iM50071k4 = iM50077x1 + m50071k4(iM50077x1, bArrM50074k4, c13637dyM50073k4);
        C10224to c10224to2 = c10224toArr[0];
        c10224to2.f36665yj = bArrM50074k4.length & 65535;
        c10224to2.f36652ks = bArrM50074k4;
        int iM50077x12 = iM50071k4 + m50077x1(iM50071k4, c13637dyM50073k4);
        c10224toArr[0].f36656rv = 0;
        int iM50071k42 = iM50077x12 + m50071k4(iM50077x12, bArrM50074k42, c13637dyM50073k4);
        C10224to c10224to3 = c10224toArr[0];
        c10224to3.f36664x6 = bArrM50074k42.length & 65535;
        c10224to3.f36654ne = bArrM50074k42;
        int iM50077x13 = iM50071k42 + m50077x1(iM50071k42, c13637dyM50073k4);
        c10224toArr[0].f36648ix = 0;
        int iM50071k43 = iM50077x13 + m50071k4(iM50077x13, bArrM50074k43, c13637dyM50073k4);
        C10224to c10224to4 = c10224toArr[0];
        c10224to4.f36658u4 = bArrM50074k43.length & 65535;
        c10224to4.f36661uz = bArrM50074k43;
        int iM50077x14 = iM50071k43 + m50077x1(iM50071k43, c13637dyM50073k4);
        c10224toArr[0].f36662wl = 0;
        int iM50071k44 = iM50077x14 + m50071k4(iM50077x14, bArrM50074k44, c13637dyM50073k4);
        C10224to c10224to5 = c10224toArr[0];
        c10224to5.f36655qq = 65535 & bArrM50074k44.length;
        c10224to5.f36640ar = bArrM50074k44;
        int iM50077x15 = iM50071k44 + m50077x1(iM50071k44, c13637dyM50073k4);
        c10224toArr[0].f36659um = 0;
        int iM50077x16 = iM50077x15 + m50077x1(iM50077x15, c13637dyM50073k4);
        c10224toArr[0].f36641bv = 0;
        int iM62969x17 = c13637dyM50073k4.m62969x1(iM50077x16, 1346851650L) + iM50077x16;
        int iM62969x18 = c13637dyM50073k4.m62969x1(iM62969x17, 0L) + iM62969x17;
        int iM50077x17 = iM62969x18 + m50077x1(iM62969x18, c13637dyM50073k4);
        int iM50077x18 = iM50077x17 + m50077x1(iM50077x17, c13637dyM50073k4);
        int iM62969x19 = c13637dyM50073k4.m62969x1(iM50077x18, 0L) + iM50077x18;
        c13637dyM50073k4.m62970x1(c13637dyM50073k4.m62969x1(iM62969x19, 0L) + iM62969x19, array, 0, array.length);
        return c13637dyM50073k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m50074k4(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i += 2) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
