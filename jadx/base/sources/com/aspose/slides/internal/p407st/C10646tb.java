package com.aspose.slides.internal.p407st;

import com.aspose.slides.InvalidPasswordException;
import com.aspose.slides.PptReadException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3088tq;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p356qb.AbstractC9818dy;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.tb */
/* JADX INFO: loaded from: classes4.dex */
public final class C10646tb {
    /* JADX INFO: renamed from: k4 */
    private static int m51725k4(long j, C10755zn c10755zn) {
        if (c10755zn.m52163k4(j) != null) {
            return (int) c10755zn.m52163k4(j).m52079x1();
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    private static C10626rv m51739x1(C9816ck c9816ck) throws Throwable {
        AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to("PowerPoint Document");
        if (abstractC9818dyM48344to == null) {
            throw new PptReadException("The PowerPoint Document file entry is not found.");
        }
        C3152yj c3152yj = new C3152yj(((C9820h4) abstractC9818dyM48344to).m48410k4());
        C10528lr c10528lrM51214k4 = C10528lr.m51214k4(c9816ck);
        if (c10528lrM51214k4 == null) {
            throw new PptReadException("The CurrentUserAtom record in the document file system is not found.");
        }
        final C10372bq[] c10372bqArr = {(C10372bq) C10591pk.m51474k4(c3152yj, c10528lrM51214k4.m51218x1() & 4294967295L, (AbstractC10571o4) null)};
        if (c10372bqArr[0] == null) {
            throw new PptReadException("The UserEditAtom record in the document file system is not found.");
        }
        C10755zn c10755zn = (C10755zn) C10591pk.m51474k4(c3152yj, r4.m50475kk(), (AbstractC10571o4) null);
        if (c10755zn == null) {
            throw new PptReadException("The PersistDirectoryAtom record in the document file system is not found.");
        }
        if ((c10372bqArr[0].m50472h4() & 4294967295L) != 0 && c10755zn.m52163k4(c10372bqArr[0].m50472h4()) != null) {
            m51729k4(c9816ck, c10372bqArr[0], c10755zn, (String) null, false, new boolean[]{false});
        }
        int iFindIndex = c10755zn.m52164x1().findIndex(new AbstractC14041ai<C10734yl>() { // from class: com.aspose.slides.internal.st.tb.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C10734yl c10734yl) {
                return c10734yl.m52077k4() == c10372bqArr[0].m50477to();
            }
        });
        if (iFindIndex == -1 || c10755zn.m52164x1().get_Item(iFindIndex).m52079x1() == 4294967295L) {
            throw new PptReadException("The DocumentContainer record in the document file system is not found.");
        }
        C10641ss c10641ss = (C10641ss) C10591pk.m51474k4(c3152yj, c10755zn.m52164x1().get_Item(iFindIndex).m52079x1() & 4294967295L, (AbstractC10571o4) null);
        if (c10641ss == null) {
            throw new PptReadException("The DocumentContainer record in the document file system is not found.");
        }
        if (c10641ss.m51713rv() == null || c10641ss.m51713rv().m50723to() == null || c10641ss.m51713rv().m50723to().m51595to() == null) {
            return null;
        }
        return c10641ss.m51713rv().m50723to().m51595to().m51500ix();
    }

    /* JADX INFO: renamed from: k4 */
    public static C9816ck m51726k4(C9816ck c9816ck, C10677v4 c10677v4, C10755zn c10755zn, String str) {
        C10530lv c10530lvM51839x1 = c10677v4.m51839x1();
        C10603qc c10603qcM51224k4 = c10530lvM51839x1.m51224k4(str);
        try {
            m51733k4(c9816ck, c10603qcM51224k4, c10530lvM51839x1);
            m51734k4(c9816ck, c10603qcM51224k4, c10677v4, c10755zn);
            m51732k4(c9816ck, c10603qcM51224k4);
            return c9816ck;
        } finally {
            if (c10603qcM51224k4 != null) {
                c10603qcM51224k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m51740x1(C9816ck c9816ck, C10603qc c10603qc) {
        int i;
        long j;
        byte[] bArrM50696k4;
        int i2;
        int i3;
        int i4;
        int i5;
        C9820h4 c9820h4 = (C9820h4) c9816ck.m48360k4().m48344to("Pictures");
        if (c9820h4 != null) {
            C3152yj c3152yj = new C3152yj(c9820h4.m48410k4());
            int i6 = 0;
            int i7 = 0;
            while (c3152yj.getLength() >= i7 + 8) {
                long j2 = i7;
                c3152yj.setPosition(j2);
                byte[] bArrM50696k42 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(c3152yj, 8));
                short sM13241k4 = C3110yd.m13241k4(bArrM50696k42, i6);
                short sM13241k42 = C3110yd.m13241k4(bArrM50696k42, 2);
                int iM13249kk = C3110yd.m13249kk(bArrM50696k42, 4);
                int i8 = sM13241k42 & 65535;
                if ((i8 != 61447 && (i8 < 61464 || i8 > 61719)) || c3152yj.getLength() < i7 + iM13249kk + 8) {
                    return;
                }
                if (i8 == 61447) {
                    throw new NotImplementedException();
                }
                switch (i8) {
                    case 61466:
                    case 61467:
                    case 61468:
                        i = i7;
                        long j3 = j2 + 8;
                        c3152yj.setPosition(j3);
                        byte[] bArrM50696k43 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(c3152yj, 16));
                        byte[] bArr = new byte[16];
                        int i9 = sM13241k4 & 65535;
                        if (i9 == 15696 || i9 == 981 || i9 == 8560 || i9 == 535 || i9 == 21552 || i9 == 1347) {
                            c3152yj.setPosition(j2 + 24);
                            j = 0;
                            bArrM50696k4 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(c3152yj, 16));
                            i2 = 32;
                        } else {
                            bArrM50696k4 = bArr;
                            i2 = 16;
                            j = 0;
                        }
                        long j4 = ((long) i2) + j3;
                        c3152yj.setPosition(j4);
                        i3 = iM13249kk;
                        byte[] bArrM50696k44 = c10603qc.m51562k4(j).m50696k4(C3110yd.m13260x1(c3152yj, 34));
                        int i10 = (i3 - i2) - 34;
                        byte[] bArr2 = new byte[i10];
                        long j5 = j4 + 34;
                        c3152yj.seek(j5, 0);
                        c3152yj.read(bArr2, 0, i10);
                        byte[] bArr3 = bArrM50696k4;
                        byte[] bArrM50696k45 = c10603qc.m51562k4(0L).m50696k4(bArr2);
                        i4 = 0;
                        c3152yj.seek(j2, 0);
                        c3152yj.write(bArrM50696k42, 0, 8);
                        c3152yj.seek(j3, 0);
                        c3152yj.write(bArrM50696k43, 0, 16);
                        if (i2 == 32) {
                            c3152yj.seek(j2 + 24, 0);
                            c3152yj.write(bArr3, 0, 16);
                        }
                        c3152yj.seek(j4, 0);
                        c3152yj.write(bArrM50696k44, 0, 34);
                        c3152yj.seek(j5, 0);
                        c3152yj.write(bArrM50696k45, 0, i10);
                        continue;
                        i7 = i3 + 8 + i;
                        i6 = i4;
                        break;
                    case 61469:
                    case 61470:
                    case 61471:
                        break;
                    default:
                        switch (i8) {
                            case 61481:
                            case 61482:
                                break;
                            default:
                                throw new NotImplementedException();
                        }
                        i7 = i3 + 8 + i;
                        i6 = i4;
                        break;
                }
                long j6 = j2 + 8;
                c3152yj.setPosition(j6);
                byte[] bArrM50696k46 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(c3152yj, 16));
                byte[] bArrM50696k47 = new byte[16];
                int i11 = sM13241k4 & 65535;
                if (i11 == 28176 || i11 == 1761 || i11 == 18096 || i11 == 1131 || i11 == 28208 || i11 == 1763 || i11 == 31376 || i11 == 1961 || i11 == 28240 || i11 == 1765) {
                    c3152yj.setPosition(j2 + 24);
                    bArrM50696k47 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(c3152yj, 16));
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                long j7 = ((long) i5) + j6;
                c3152yj.setPosition(j7);
                byte[] bArrM50696k48 = c10603qc.m51562k4(0L).m50696k4(C3110yd.m13260x1(c3152yj, 1));
                int i12 = (iM13249kk - i5) - 1;
                byte[] bArr4 = new byte[i12];
                long j8 = j7 + 1;
                c3152yj.seek(j8, 0);
                c3152yj.read(bArr4, 0, i12);
                int i13 = i5;
                byte[] bArrM50696k49 = c10603qc.m51562k4(0L).m50696k4(bArr4);
                c3152yj.seek(j2, 0);
                i = i7;
                c3152yj.write(bArrM50696k42, 0, 8);
                c3152yj.seek(j6, 0);
                c3152yj.write(bArrM50696k46, 0, 16);
                if (i13 == 32) {
                    c3152yj.seek(j2 + 24, 0);
                    c3152yj.write(bArrM50696k47, 0, 16);
                }
                c3152yj.seek(j7, 0);
                c3152yj.write(bArrM50696k48, 0, 1);
                c3152yj.seek(j8, 0);
                c3152yj.write(bArrM50696k49, 0, i12);
                i4 = 0;
                i3 = iM13249kk;
                i7 = i3 + 8 + i;
                i6 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C10603qc m51727k4(C9816ck c9816ck, String str, C10530lv[] c10530lvArr) {
        C3152yj c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("PowerPoint Document")).m48410k4());
        try {
            C10372bq c10372bq = (C10372bq) C10591pk.m51474k4(c3152yj, C10528lr.m51214k4(c9816ck).m51218x1() & 4294967295L, (AbstractC10571o4) null);
            c3152yj.seek(m51725k4(c10372bq.m50472h4(), (C10755zn) C10591pk.m51474k4(c3152yj, c10372bq.m50475kk(), (AbstractC10571o4) null)), 0);
            C10530lv c10530lvM51839x1 = C10677v4.m51838k4(c3152yj).m51839x1();
            c10530lvArr[0] = c10530lvM51839x1;
            return c10530lvM51839x1.m51224k4(str);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m51741x1(C9816ck c9816ck, String str) throws Throwable {
        if (c9816ck == null) {
            throw new ArgumentNullException("fileSystem");
        }
        if (str == null) {
            throw new ArgumentNullException("password");
        }
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentException("The password argument value is empty.");
        }
        C10626rv c10626rvM51739x1 = m51739x1(c9816ck);
        if (c10626rvM51739x1 == null) {
            return false;
        }
        return C14113y2.m67363du(c10626rvM51739x1.m51659x1(), str);
    }

    /* JADX INFO: renamed from: k4 */
    private static C10603qc m51728k4(C10530lv c10530lv, C10677v4 c10677v4, String str, boolean z, boolean[] zArr, boolean[] zArr2) {
        C10603qc c10603qcM51224k4 = c10530lv.m51224k4(str);
        zArr[0] = !c10677v4.m51839x1().f37199kk.m51866k4().m51852k4();
        zArr2[0] = true;
        if (!z && !c10530lv.m51226k4(c10603qcM51224k4)) {
            zArr2[0] = false;
        }
        return c10603qcM51224k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m51729k4(C9816ck c9816ck, C10372bq c10372bq, C10755zn c10755zn, String str, boolean z, boolean[] zArr) throws Throwable {
        m51735k4(c9816ck, ((C9820h4) c9816ck.m48360k4().m48344to("PowerPoint Document")).m48410k4(), c10372bq, c10755zn, str, z, zArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51730k4(C9816ck c9816ck, C10530lv c10530lv, C10603qc c10603qc) {
        if (c10530lv.f37199kk.m51866k4().m51852k4()) {
            return;
        }
        AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to("EncryptedSummary");
        C10722xw c10722xwM52019k4 = C10722xw.m52019k4(new C3152yj(((C9820h4) abstractC9818dyM48344to).m48410k4()), c10603qc);
        byte[] bArrM52022k4 = c10722xwM52019k4.m52022k4(c10603qc, ((c10722xwM52019k4.f37527to & 4294967295L) - 2) & 4294967295L);
        byte[] bArrM52022k42 = c10722xwM52019k4.m52022k4(c10603qc, ((c10722xwM52019k4.f37527to & 4294967295L) - 1) & 4294967295L);
        c9816ck.m48360k4().m48341h4(abstractC9818dyM48344to);
        C9820h4 c9820h4 = new C9820h4("\u0005SummaryInformation");
        c9820h4.m48409k4(bArrM52022k4);
        c9816ck.m48360k4().m48340du(c9820h4);
        c9816ck.m48360k4().m48343kk("\u0005DocumentSummaryInformation");
        C9820h4 c9820h42 = new C9820h4("\u0005DocumentSummaryInformation");
        c9820h42.m48409k4(bArrM52022k42);
        c9816ck.m48360k4().m48340du(c9820h42);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51731k4(C9816ck c9816ck, C10530lv c10530lv, C10603qc c10603qc, C10372bq c10372bq, C10755zn c10755zn, AbstractC3150x6 abstractC3150x6) {
        m51730k4(c9816ck, c10530lv, c10603qc);
        m51736k4(c10372bq, c10755zn, abstractC3150x6, c10603qc);
        m51740x1(c9816ck, c10603qc);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51732k4(C9816ck c9816ck, C10603qc c10603qc) {
        int i;
        long j;
        byte[] bArrM50697x1;
        int i2;
        int i3;
        int i4;
        C9820h4 c9820h4 = (C9820h4) c9816ck.m48360k4().m48344to("Pictures");
        if (c9820h4 != null) {
            C3152yj c3152yj = new C3152yj(c9820h4.m48410k4());
            int i5 = 0;
            int i6 = 0;
            while (c3152yj.getLength() >= i6 + 8) {
                long j2 = i6;
                c3152yj.setPosition(j2);
                byte[] bArrM13260x1 = C3110yd.m13260x1(c3152yj, 8);
                byte[] bArrM50697x12 = c10603qc.m51562k4(0L).m50697x1(bArrM13260x1);
                short sM13241k4 = C3110yd.m13241k4(bArrM13260x1, i5);
                short sM13241k42 = C3110yd.m13241k4(bArrM13260x1, 2);
                int iM13249kk = C3110yd.m13249kk(bArrM13260x1, 4);
                int i7 = sM13241k42 & 65535;
                if ((i7 != 61447 && (i7 < 61464 || i7 > 61719)) || c3152yj.getLength() < i6 + iM13249kk + 8) {
                    return;
                }
                if (i7 == 61447) {
                    throw new NotImplementedException();
                }
                switch (i7) {
                    case 61466:
                    case 61467:
                    case 61468:
                        i = i6;
                        long j3 = j2 + 8;
                        c3152yj.setPosition(j3);
                        byte[] bArrM50697x13 = c10603qc.m51562k4(0L).m50697x1(C3110yd.m13260x1(c3152yj, 16));
                        byte[] bArr = new byte[16];
                        int i8 = sM13241k4 & 65535;
                        if (i8 == 15696 || i8 == 981 || i8 == 8560 || i8 == 535 || i8 == 21552 || i8 == 1347) {
                            c3152yj.setPosition(j2 + 24);
                            j = 0;
                            bArrM50697x1 = c10603qc.m51562k4(0L).m50697x1(C3110yd.m13260x1(c3152yj, 16));
                            i2 = 32;
                        } else {
                            bArrM50697x1 = bArr;
                            i2 = 16;
                            j = 0;
                        }
                        long j4 = ((long) i2) + j3;
                        c3152yj.setPosition(j4);
                        byte[] bArrM50697x14 = c10603qc.m51562k4(j).m50697x1(C3110yd.m13260x1(c3152yj, 34));
                        int i9 = (iM13249kk - i2) - 34;
                        byte[] bArr2 = new byte[i9];
                        long j5 = j4 + 34;
                        c3152yj.seek(j5, 0);
                        c3152yj.read(bArr2, 0, i9);
                        byte[] bArr3 = bArrM50697x1;
                        byte[] bArrM50697x15 = c10603qc.m51562k4(0L).m50697x1(bArr2);
                        i3 = 0;
                        c3152yj.seek(j2, 0);
                        c3152yj.write(bArrM50697x12, 0, 8);
                        c3152yj.seek(j3, 0);
                        c3152yj.write(bArrM50697x13, 0, 16);
                        if (i2 == 32) {
                            c3152yj.seek(j2 + 24, 0);
                            c3152yj.write(bArr3, 0, 16);
                        }
                        c3152yj.seek(j4, 0);
                        c3152yj.write(bArrM50697x14, 0, 34);
                        c3152yj.seek(j5, 0);
                        c3152yj.write(bArrM50697x15, 0, i9);
                        continue;
                        i6 = iM13249kk + 8 + i;
                        i5 = i3;
                        break;
                    case 61469:
                    case 61470:
                    case 61471:
                        break;
                    default:
                        switch (i7) {
                            case 61481:
                            case 61482:
                                break;
                            default:
                                throw new NotImplementedException();
                        }
                        i6 = iM13249kk + 8 + i;
                        i5 = i3;
                        break;
                }
                long j6 = j2 + 8;
                c3152yj.setPosition(j6);
                byte[] bArrM50697x16 = c10603qc.m51562k4(0L).m50697x1(C3110yd.m13260x1(c3152yj, 16));
                byte[] bArrM50697x17 = new byte[16];
                int i10 = sM13241k4 & 65535;
                if (i10 == 28176 || i10 == 1761 || i10 == 18096 || i10 == 1131 || i10 == 28208 || i10 == 1763 || i10 == 31376 || i10 == 1961 || i10 == 28240 || i10 == 1765) {
                    c3152yj.setPosition(j2 + 24);
                    bArrM50697x17 = c10603qc.m51562k4(0L).m50697x1(C3110yd.m13260x1(c3152yj, 16));
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                long j7 = ((long) i4) + j6;
                c3152yj.setPosition(j7);
                byte[] bArrM50697x18 = c10603qc.m51562k4(0L).m50697x1(C3110yd.m13260x1(c3152yj, 1));
                int i11 = (iM13249kk - i4) - 1;
                byte[] bArr4 = new byte[i11];
                long j8 = j7 + 1;
                c3152yj.seek(j8, 0);
                c3152yj.read(bArr4, 0, i11);
                byte[] bArrM50697x19 = c10603qc.m51562k4(0L).m50697x1(bArr4);
                c3152yj.seek(j2, 0);
                i = i6;
                c3152yj.write(bArrM50697x12, 0, 8);
                c3152yj.seek(j6, 0);
                c3152yj.write(bArrM50697x16, 0, 16);
                if (i4 == 32) {
                    c3152yj.seek(j2 + 24, 0);
                    c3152yj.write(bArrM50697x17, 0, 16);
                }
                c3152yj.seek(j7, 0);
                c3152yj.write(bArrM50697x18, 0, 1);
                c3152yj.seek(j8, 0);
                c3152yj.write(bArrM50697x19, 0, i11);
                i3 = 0;
                i6 = iM13249kk + 8 + i;
                i5 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51733k4(C9816ck c9816ck, C10603qc c10603qc, C10530lv c10530lv) {
        if (c10530lv.f37199kk.m51866k4().m51852k4()) {
            return;
        }
        C9820h4 c9820h4 = (C9820h4) c9816ck.m48360k4().m48344to("\u0005SummaryInformation");
        C9820h4 c9820h42 = (C9820h4) c9816ck.m48360k4().m48344to("\u0005DocumentSummaryInformation");
        C10722xw c10722xw = new C10722xw();
        c10722xw.f37524du = new C10645t6[2];
        c10722xw.f37527to = 2L;
        C10645t6 c10645t6 = new C10645t6();
        c10645t6.f37390k4 = 8L;
        c10645t6.f37394x1 = ((long) c9820h4.m48410k4().length) & 4294967295L;
        c10645t6.f37391kk = 0;
        c10645t6.f37393to = (byte) 19;
        c10645t6.f37388du = (byte) 1;
        c10645t6.f37392m9 = "\u0005SummaryInformation";
        c10722xw.f37524du[0] = c10645t6;
        byte[] bArrM50697x1 = c10603qc.m51562k4(0L).m50697x1(c9820h4.m48410k4());
        C10645t6 c10645t62 = new C10645t6();
        c10645t62.f37390k4 = ((((long) c9820h4.m48410k4().length) & 4294967295L) + 8) & 4294967295L;
        c10645t62.f37394x1 = ((long) c9820h42.m48410k4().length) & 4294967295L;
        c10645t62.f37391kk = 1;
        c10645t62.f37393to = (byte) 27;
        c10645t62.f37388du = (byte) 1;
        c10645t62.f37392m9 = "\u0005DocumentSummaryInformation";
        c10722xw.f37524du[1] = c10645t62;
        byte[] bArrM50697x12 = c10603qc.m51562k4(1L).m50697x1(c9820h42.m48410k4());
        byte[] bArr = new byte[bArrM50697x1.length + bArrM50697x12.length];
        c10722xw.f37526kk = bArr;
        System.arraycopy(bArrM50697x1, 0, bArr, 0, bArrM50697x1.length);
        System.arraycopy(bArrM50697x12, 0, c10722xw.f37526kk, bArrM50697x1.length, bArrM50697x12.length);
        c10722xw.f37525k4 = ((((long) c10722xw.f37526kk.length) & 4294967295L) + 8) & 4294967295L;
        c10722xw.f37528x1 = ((((((long) c10722xw.f37524du[0].m51723k4()) & 4294967295L) + 4) & 4294967295L) + (((long) c10722xw.f37524du[1].m51723k4()) & 4294967295L)) & 4294967295L;
        C9820h4 c9820h43 = new C9820h4("EncryptedSummary");
        c9820h43.m48409k4(c10722xw.m52021k4(c10603qc));
        c9816ck.m48360k4().m48340du(c9820h43);
        c9816ck.m48360k4().m48341h4(c9820h4);
        c9816ck.m48360k4().m48341h4(c9820h42);
        C9820h4 c9820h44 = new C9820h4("\u0005DocumentSummaryInformation");
        c9820h44.m48409k4(C3088tq.m13121k4(C3088tq.f9164x1.Clone()));
        c9816ck.m48360k4().m48340du(c9820h44);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51734k4(C9816ck c9816ck, C10603qc c10603qc, C10677v4 c10677v4, C10755zn c10755zn) {
        C3152yj c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("PowerPoint Document")).m48410k4());
        for (int i = 0; i < c10755zn.m52164x1().size(); i++) {
            long jM52079x1 = c10755zn.m52164x1().get_Item(i).m52079x1();
            if ((c10677v4.mo51092dy() & 4294967295L) != (c10755zn.m52164x1().get_Item(i).m52077k4() & 4294967295L)) {
                long j = jM52079x1 & 4294967295L;
                c3152yj.seek(j, 0);
                int iM13249kk = C3110yd.m13249kk(C3110yd.m13260x1(c3152yj, 8), 4) + 8;
                byte[] bArr = new byte[iM13249kk];
                c3152yj.seek(j, 0);
                c3152yj.read(bArr, 0, iM13249kk);
                byte[] bArrM50697x1 = c10603qc.m51562k4(c10755zn.m52164x1().get_Item(i).m52077k4()).m50697x1(bArr);
                c3152yj.seek(j, 0);
                c3152yj.write(bArrM50697x1, 0, iM13249kk);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m51735k4(C9816ck c9816ck, byte[] bArr, C10372bq c10372bq, C10755zn c10755zn, String str, boolean z, boolean[] zArr) throws Throwable {
        Throwable th;
        C10603qc c10603qc;
        C3152yj c3152yj = new C3152yj(bArr);
        String str2 = str != null ? str : "/01Hannes Ruescher/01";
        c3152yj.seek(m51725k4(c10372bq.m50472h4(), c10755zn), 0);
        C10677v4 c10677v4M51838k4 = C10677v4.m51838k4(c3152yj);
        C10530lv c10530lvM51839x1 = c10677v4M51838k4.m51839x1();
        boolean[] zArr2 = {false};
        C10603qc c10603qcM51728k4 = m51728k4(c10530lvM51839x1, c10677v4M51838k4, str2, z, zArr, zArr2);
        boolean z2 = zArr2[0];
        if (z2) {
            c10603qc = c10603qcM51728k4;
            try {
                m51731k4(c9816ck, c10530lvM51839x1, c10603qc, c10372bq, c10755zn, c3152yj);
                if (c10603qc == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (c10603qc != null) {
                }
            }
        } else {
            try {
                zArr2[0] = z2;
                if (str != null) {
                    str2 = "/01Hannes Ruescher/01";
                }
                C10603qc c10603qcM51728k42 = m51728k4(c10530lvM51839x1, c10677v4M51838k4, str2, z, zArr, zArr2);
                try {
                    if (!zArr2[0]) {
                        throw new InvalidPasswordException("Invalid password.");
                    }
                    m51731k4(c9816ck, c10530lvM51839x1, c10603qcM51728k42, c10372bq, c10755zn, c3152yj);
                    if (c10603qcM51728k42 != null) {
                        c10603qcM51728k42.dispose();
                    }
                    c10603qc = c10603qcM51728k4;
                    if (c10603qc == null) {
                        c10603qc.dispose();
                    }
                } finally {
                }
            } catch (Throwable th3) {
                th = th3;
                c10603qc = c10603qcM51728k4;
                if (c10603qc != null) {
                    throw th;
                }
                c10603qc.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m51736k4(C10372bq c10372bq, C10755zn c10755zn, AbstractC3150x6 abstractC3150x6, C10603qc c10603qc) {
        int iM51725k4 = m51725k4(c10372bq.m50472h4(), c10755zn);
        for (int i = 0; i < c10755zn.m52164x1().size(); i++) {
            long jM52079x1 = c10755zn.m52164x1().get_Item(i).m52079x1() & 4294967295L;
            if (jM52079x1 != iM51725k4) {
                abstractC3150x6.seek(jM52079x1, 0);
                int iM13249kk = C3110yd.m13249kk(c10603qc.m51562k4(c10755zn.m52164x1().get_Item(i).m52077k4()).m50696k4(C3110yd.m13260x1(abstractC3150x6, 8)), 4) + 8;
                byte[] bArr = new byte[iM13249kk];
                abstractC3150x6.seek(jM52079x1, 0);
                abstractC3150x6.read(bArr, 0, iM13249kk);
                byte[] bArrM50696k4 = c10603qc.m51562k4(c10755zn.m52164x1().get_Item(i).m52077k4()).m50696k4(bArr);
                abstractC3150x6.seek(jM52079x1, 0);
                abstractC3150x6.write(bArrM50696k4, 0, iM13249kk);
            }
        }
        c10755zn.m52165x1(c10372bq.m50472h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m51737k4(C9816ck c9816ck) {
        if (c9816ck != null) {
            return m51739x1(c9816ck) != null;
        }
        throw new ArgumentNullException("fileSystem");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m51738k4(C9816ck c9816ck, String str) {
        if (c9816ck == null) {
            throw new ArgumentNullException("fileSystem");
        }
        C10530lv[] c10530lvArr = {null};
        C10603qc c10603qcM51727k4 = m51727k4(c9816ck, str, c10530lvArr);
        try {
            return c10530lvArr[0].m51226k4(c10603qcM51727k4);
        } finally {
            if (c10603qcM51727k4 != null) {
                c10603qcM51727k4.dispose();
            }
        }
    }
}
