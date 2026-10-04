package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ts */
/* JADX INFO: loaded from: classes.dex */
public final class C4471ts {

    /* JADX INFO: renamed from: du */
    private short[] f12284du;

    /* JADX INFO: renamed from: h4 */
    private float f12285h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4429ak f12286k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f12287kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f12288m9;

    /* JADX INFO: renamed from: to */
    private float[] f12289to;

    /* JADX INFO: renamed from: x1 */
    private C4443em f12290x1;

    public C4471ts(int i, int i2, boolean z) {
        C4443em c4443em = new C4443em();
        this.f12290x1 = c4443em;
        this.f12285h4 = 0.0078125f;
        c4443em.m18174k4(i);
        this.f12290x1.m18178x1(i2);
        this.f12288m9 = z;
        int iM18177x1 = this.f12290x1.m18177x1() * this.f12290x1.m18173k4();
        this.f12287kk = new byte[iM18177x1 * 4];
        int i3 = 0;
        if (this.f12288m9) {
            this.f12284du = new short[iM18177x1];
            while (i3 < iM18177x1) {
                this.f12284du[i3] = -1;
                i3++;
            }
        } else {
            this.f12289to = new float[iM18177x1];
            while (i3 < iM18177x1) {
                this.f12289to[i3] = Float.MAX_VALUE;
                i3++;
            }
        }
        m18352k4(4278190080L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18352k4(long j) {
        long j2 = 4294967295L & j;
        byte b = (byte) (j & 255);
        byte b2 = (byte) ((j2 >> 8) & 255);
        byte b3 = (byte) ((j2 >> 16) & 255);
        byte b4 = (byte) ((j2 >> 24) & 255);
        int iM18177x1 = this.f12290x1.m18177x1() * this.f12290x1.m18173k4();
        int i = 0;
        while (true) {
            int i2 = iM18177x1 - 1;
            if (iM18177x1 <= 0) {
                return;
            }
            byte[] bArr = this.f12287kk;
            bArr[i] = b;
            bArr[i + 1] = b2;
            int i3 = i + 3;
            bArr[i + 2] = b3;
            i += 4;
            bArr[i3] = b4;
            iM18177x1 = i2;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC4429ak m18356kk() {
        return this.f12286k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4443em m18357x1() {
        return this.f12290x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18353k4(AbstractC4429ak abstractC4429ak) {
        this.f12286k4 = abstractC4429ak;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x049e A[Catch: all -> 0x04af, TryCatch #8 {all -> 0x04af, blocks: (B:107:0x048a, B:109:0x049e, B:114:0x04c7, B:113:0x04b7), top: B:213:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b7 A[Catch: all -> 0x04af, TryCatch #8 {all -> 0x04af, blocks: (B:107:0x048a, B:109:0x049e, B:114:0x04c7, B:113:0x04b7), top: B:213:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04e1 A[Catch: all -> 0x04f4, TryCatch #0 {all -> 0x04f4, blocks: (B:115:0x04cd, B:117:0x04e1, B:121:0x050a, B:123:0x0526, B:125:0x054b, B:127:0x0551, B:129:0x0562, B:131:0x057b, B:130:0x056f, B:134:0x0582, B:136:0x0629, B:124:0x0539, B:120:0x04f8), top: B:197:0x04cd }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f8 A[Catch: all -> 0x04f4, TryCatch #0 {all -> 0x04f4, blocks: (B:115:0x04cd, B:117:0x04e1, B:121:0x050a, B:123:0x0526, B:125:0x054b, B:127:0x0551, B:129:0x0562, B:131:0x057b, B:130:0x056f, B:134:0x0582, B:136:0x0629, B:124:0x0539, B:120:0x04f8), top: B:197:0x04cd }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0526 A[Catch: all -> 0x04f4, TryCatch #0 {all -> 0x04f4, blocks: (B:115:0x04cd, B:117:0x04e1, B:121:0x050a, B:123:0x0526, B:125:0x054b, B:127:0x0551, B:129:0x0562, B:131:0x057b, B:130:0x056f, B:134:0x0582, B:136:0x0629, B:124:0x0539, B:120:0x04f8), top: B:197:0x04cd }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0539 A[Catch: all -> 0x04f4, TryCatch #0 {all -> 0x04f4, blocks: (B:115:0x04cd, B:117:0x04e1, B:121:0x050a, B:123:0x0526, B:125:0x054b, B:127:0x0551, B:129:0x0562, B:131:0x057b, B:130:0x056f, B:134:0x0582, B:136:0x0629, B:124:0x0539, B:120:0x04f8), top: B:197:0x04cd }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0551 A[Catch: all -> 0x04f4, TryCatch #0 {all -> 0x04f4, blocks: (B:115:0x04cd, B:117:0x04e1, B:121:0x050a, B:123:0x0526, B:125:0x054b, B:127:0x0551, B:129:0x0562, B:131:0x057b, B:130:0x056f, B:134:0x0582, B:136:0x0629, B:124:0x0539, B:120:0x04f8), top: B:197:0x04cd }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0582 A[Catch: all -> 0x04f4, TryCatch #0 {all -> 0x04f4, blocks: (B:115:0x04cd, B:117:0x04e1, B:121:0x050a, B:123:0x0526, B:125:0x054b, B:127:0x0551, B:129:0x0562, B:131:0x057b, B:130:0x056f, B:134:0x0582, B:136:0x0629, B:124:0x0539, B:120:0x04f8), top: B:197:0x04cd }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0452 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x020a A[Catch: all -> 0x017e, TRY_ENTER, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021b A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022c A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0256 A[Catch: all -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a A[Catch: all -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02be A[Catch: all -> 0x017e, TRY_ENTER, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ea A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c6 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d1 A[Catch: all -> 0x082c, TRY_ENTER, TryCatch #6 {all -> 0x082c, blocks: (B:9:0x0051, B:11:0x008f, B:13:0x0099, B:17:0x00b7, B:33:0x01db, B:48:0x0241, B:51:0x0280, B:54:0x02b4, B:61:0x0372, B:62:0x037f, B:65:0x0387, B:68:0x03ab, B:80:0x03da, B:86:0x03f6, B:93:0x043a, B:92:0x0428, B:85:0x03f1, B:79:0x03d1, B:26:0x0184), top: B:209:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ea A[Catch: all -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03f1 A[Catch: all -> 0x082c, TRY_ENTER, TryCatch #6 {all -> 0x082c, blocks: (B:9:0x0051, B:11:0x008f, B:13:0x0099, B:17:0x00b7, B:33:0x01db, B:48:0x0241, B:51:0x0280, B:54:0x02b4, B:61:0x0372, B:62:0x037f, B:65:0x0387, B:68:0x03ab, B:80:0x03da, B:86:0x03f6, B:93:0x043a, B:92:0x0428, B:85:0x03f1, B:79:0x03d1, B:26:0x0184), top: B:209:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0411 A[Catch: all -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x017e, blocks: (B:7:0x004b, B:20:0x012a, B:36:0x020a, B:40:0x021b, B:44:0x022c, B:50:0x0256, B:53:0x028a, B:56:0x02be, B:58:0x02ea, B:70:0x03b1, B:77:0x03c6, B:83:0x03ea, B:89:0x0411, B:29:0x018b), top: B:211:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0426  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18351k4(C4433bv c4433bv, AbstractC4434bz abstractC4434bz) throws Throwable {
        Class<IDisposable> cls;
        IGenericEnumerator<AbstractC4434bz.k4> iGenericEnumerator;
        Class<IDisposable> cls2;
        IGenericEnumerator<AbstractC4434bz.k4> iGenericEnumerator2;
        float f;
        AbstractC4434bz.kk kkVarClone;
        AbstractC4434bz.kk kkVarClone2;
        AbstractC4434bz.kk kkVarClone3;
        AbstractC4434bz abstractC4434bz2;
        Class<IDisposable> cls3;
        C4442e0 c4442e0;
        boolean z;
        C4489zj c4489zj;
        C4443em c4443em;
        C4443em c4443em2;
        float f2;
        int iM18177x1;
        int i;
        int i2;
        C4443em c4443em3;
        AbstractC4434bz.kk kkVar;
        AbstractC4434bz.kk kkVar2;
        C4489zj c4489zj2;
        C4489zj c4489zj3;
        C4489zj c4489zj4;
        AbstractC4434bz abstractC4434bz3;
        C4471ts c4471ts;
        boolean z2;
        int iM18177x12;
        int iM18177x13;
        boolean z3;
        float f3;
        float fM18173k4;
        float f4;
        C4428ai c4428aiM18037k4;
        C4489zj c4489zjM18499k4;
        C4459os c4459os;
        C4459os c4459osM18279k4;
        C4489zj c4489zj5;
        C4489zj c4489zjM18499k42;
        C4459os c4459os2;
        C4459os c4459os3;
        C4489zj c4489zj6;
        int iM27462to;
        int i3;
        C4489zj c4489zj7;
        C4489zj c4489zj8;
        int i4;
        C4428ai c4428ai;
        C4459os c4459os4;
        C4428ai c4428ai2;
        C4489zj c4489zj9;
        C4489zj c4489zj10;
        C4489zj c4489zj11;
        C4471ts c4471ts2 = this;
        AbstractC4434bz abstractC4434bz4 = abstractC4434bz;
        Class<IDisposable> cls4 = IDisposable.class;
        C4442e0 c4442e0M18096to = abstractC4434bz4.m18096to();
        float f5 = 0.0f;
        boolean z4 = c4442e0M18096to.m18168x1().m18374m9() != 0.0f;
        C4489zj c4489zj12 = new C4489zj();
        C4489zj c4489zj13 = new C4489zj();
        C4489zj c4489zj14 = new C4489zj();
        C4489zj c4489zj15 = new C4489zj();
        C4489zj c4489zj16 = new C4489zj();
        C4489zj c4489zj17 = new C4489zj(0.0f);
        c4489zj17.CloneTo(c4489zj16);
        c4489zj17.CloneTo(c4489zj15);
        c4489zj17.CloneTo(c4489zj14);
        c4489zj17.CloneTo(c4489zj13);
        c4489zj17.CloneTo(c4489zj12);
        IGenericEnumerator<AbstractC4434bz.k4> it = c4433bv.iterator();
        while (it.hasNext()) {
            try {
                try {
                    AbstractC4434bz.k4 next = it.next();
                    f = f5;
                    kkVarClone = abstractC4434bz4.mo18092k4(next.f12178k4.Clone()).Clone();
                    kkVarClone2 = abstractC4434bz4.mo18092k4(next.f12180x1.Clone()).Clone();
                    kkVarClone3 = abstractC4434bz4.mo18092k4(next.f12179kk.Clone()).Clone();
                } catch (Throwable th) {
                    th = th;
                    cls2 = cls4;
                }
            } catch (Throwable th2) {
                th = th2;
                cls = cls4;
                iGenericEnumerator = it;
            }
            if (kkVarClone.f12181k4.m18047kk() >= f && kkVarClone2.f12181k4.m18047kk() >= f && kkVarClone3.f12181k4.m18047kk() >= f) {
                C4428ai c4428ai3 = kkVarClone.f12181k4;
                c4442e0 = c4442e0M18096to;
                C4443em c4443emClone = C4479w6.m18406k4(C4428ai.m18039x1(c4428ai3, c4428ai3.m18049to()).Clone(), c4471ts2.f12290x1.m18173k4(), c4471ts2.f12290x1.m18177x1()).Clone();
                C4428ai c4428ai4 = kkVarClone2.f12181k4;
                z = z4;
                C4443em c4443emClone2 = C4479w6.m18406k4(C4428ai.m18039x1(c4428ai4, c4428ai4.m18049to()).Clone(), c4471ts2.f12290x1.m18173k4(), c4471ts2.f12290x1.m18177x1()).Clone();
                C4428ai c4428ai5 = kkVarClone3.f12181k4;
                c4489zj = c4489zj12;
                C4443em c4443emClone3 = C4479w6.m18406k4(C4428ai.m18039x1(c4428ai5, c4428ai5.m18049to()).Clone(), c4471ts2.f12290x1.m18173k4(), c4471ts2.f12290x1.m18177x1()).Clone();
                if (c4442e0.m18167to() == 2) {
                    if (((c4443emClone.m18177x1() + c4443emClone3.m18177x1()) * (c4443emClone.m18173k4() - c4443emClone3.m18173k4())) + ((c4443emClone3.m18173k4() - c4443emClone2.m18173k4()) * (c4443emClone3.m18177x1() + c4443emClone2.m18177x1())) + ((c4443emClone2.m18177x1() + c4443emClone.m18177x1()) * (c4443emClone2.m18173k4() - c4443emClone.m18173k4())) > f) {
                        abstractC4434bz2 = abstractC4434bz4;
                        cls3 = cls4;
                        abstractC4434bz4 = abstractC4434bz2;
                        c4471ts2 = c4471ts2;
                        f5 = f;
                        c4442e0M18096to = c4442e0;
                        z4 = z;
                        c4489zj12 = c4489zj;
                        c4489zj13 = c4489zj13;
                        cls4 = cls3;
                        it = it;
                    } else {
                        float fM18288kk = C4459os.m18282x1(kkVarClone2.f12182kk, kkVarClone.f12182kk).m18288kk();
                        float fM18288kk2 = C4459os.m18282x1(kkVarClone3.f12182kk, kkVarClone2.f12182kk).m18288kk();
                        float fM18288kk3 = C4459os.m18282x1(kkVarClone.f12182kk, kkVarClone3.f12182kk).m18288kk();
                        C4489zj c4489zj18 = c4489zj13;
                        try {
                            abstractC4434bz4.m18089du().mo18193k4(C4479w6.m18405k4(fM18288kk == f ? C4443em.m18170k4(c4443emClone2, c4443emClone).m18175kk() / fM18288kk : Float.MAX_VALUE, fM18288kk2 == f ? C4443em.m18170k4(c4443emClone3, c4443emClone2).m18175kk() / fM18288kk2 : Float.MAX_VALUE, fM18288kk3 != f ? C4443em.m18170k4(c4443emClone, c4443emClone3).m18175kk() / fM18288kk3 : Float.MAX_VALUE));
                            if (c4443emClone2.m18177x1() < c4443emClone.m18177x1()) {
                                C4443em[] c4443emArr = {c4443emClone2};
                                C4443em[] c4443emArr2 = {c4443emClone};
                                C4479w6.m18411k4(c4443emArr, c4443emArr2);
                                c4443emArr[0].CloneTo(c4443emClone2);
                                c4443emArr2[0].CloneTo(c4443emClone);
                                AbstractC4434bz.kk[] kkVarArr = {kkVarClone2};
                                AbstractC4434bz.kk[] kkVarArr2 = {kkVarClone};
                                C4479w6.m18410k4(kkVarArr, kkVarArr2);
                                kkVarArr[0].CloneTo(kkVarClone2);
                                kkVarArr2[0].CloneTo(kkVarClone);
                            }
                            if (c4443emClone3.m18177x1() < c4443emClone.m18177x1()) {
                                C4443em[] c4443emArr3 = {c4443emClone3};
                                C4443em[] c4443emArr4 = {c4443emClone};
                                C4479w6.m18411k4(c4443emArr3, c4443emArr4);
                                c4443emArr3[0].CloneTo(c4443emClone3);
                                c4443emArr4[0].CloneTo(c4443emClone);
                                AbstractC4434bz.kk[] kkVarArr3 = {kkVarClone3};
                                AbstractC4434bz.kk[] kkVarArr4 = {kkVarClone};
                                C4479w6.m18410k4(kkVarArr3, kkVarArr4);
                                kkVarArr3[0].CloneTo(kkVarClone3);
                                kkVarArr4[0].CloneTo(kkVarClone);
                            }
                            if (c4443emClone3.m18177x1() < c4443emClone2.m18177x1()) {
                                C4443em[] c4443emArr5 = {c4443emClone3};
                                C4443em[] c4443emArr6 = {c4443emClone2};
                                C4479w6.m18411k4(c4443emArr5, c4443emArr6);
                                c4443emArr5[0].CloneTo(c4443emClone3);
                                c4443emArr6[0].CloneTo(c4443emClone2);
                                AbstractC4434bz.kk[] kkVarArr5 = {kkVarClone3};
                                AbstractC4434bz.kk[] kkVarArr6 = {kkVarClone2};
                                C4479w6.m18410k4(kkVarArr5, kkVarArr6);
                                kkVarArr5[0].CloneTo(kkVarClone3);
                                kkVarArr6[0].CloneTo(kkVarClone2);
                            }
                            if (z) {
                                c4443em = c4443emClone;
                                c4443em2 = c4443emClone2;
                                f2 = 1.0f;
                                c4489zj12 = c4489zj;
                                c4489zj13 = c4489zj18;
                            } else {
                                f2 = 1.0f;
                                c4489zj12 = new C4489zj(kkVarClone.f12182kk.m18285k4() / kkVarClone.f12181k4.m18047kk(), kkVarClone.f12182kk.m18290x1() / kkVarClone.f12181k4.m18047kk(), 1.0f / kkVarClone.f12181k4.m18047kk());
                                c4443em = c4443emClone;
                                C4489zj c4489zj19 = new C4489zj(kkVarClone2.f12182kk.m18285k4() / kkVarClone2.f12181k4.m18047kk(), kkVarClone2.f12182kk.m18290x1() / kkVarClone2.f12181k4.m18047kk(), 1.0f / kkVarClone2.f12181k4.m18047kk());
                                c4443em2 = c4443emClone2;
                                c4489zj14 = new C4489zj(kkVarClone3.f12182kk.m18285k4() / kkVarClone3.f12181k4.m18047kk(), kkVarClone3.f12182kk.m18290x1() / kkVarClone3.f12181k4.m18047kk(), 1.0f / kkVarClone3.f12181k4.m18047kk());
                                c4489zj13 = c4489zj19;
                            }
                            int iM18177x14 = c4443emClone3.m18177x1() - c4443em.m18177x1();
                            iM18177x1 = c4443em.m18177x1();
                            while (iM18177x1 <= c4443emClone3.m18177x1()) {
                                if (iM18177x1 < 0) {
                                    i = iM18177x14;
                                    cls2 = cls4;
                                    i2 = iM18177x1;
                                    c4443em3 = c4443emClone3;
                                    kkVar = kkVarClone;
                                    kkVar2 = kkVarClone2;
                                    c4489zj2 = c4489zj12;
                                    c4489zj3 = c4489zj13;
                                    c4489zj4 = c4489zj14;
                                    iGenericEnumerator2 = it;
                                    abstractC4434bz3 = abstractC4434bz4;
                                    c4471ts = c4471ts2;
                                } else if (iM18177x1 >= c4471ts2.f12290x1.m18177x1()) {
                                    i = iM18177x14;
                                    cls2 = cls4;
                                    i2 = iM18177x1;
                                    c4443em3 = c4443emClone3;
                                    kkVar = kkVarClone;
                                    kkVar2 = kkVarClone2;
                                    c4489zj2 = c4489zj12;
                                    c4489zj3 = c4489zj13;
                                    c4489zj4 = c4489zj14;
                                    iGenericEnumerator2 = it;
                                    abstractC4434bz3 = abstractC4434bz4;
                                    c4471ts = c4471ts2;
                                    iM18177x1 = i2 + 1;
                                    abstractC4434bz4 = abstractC4434bz3;
                                    c4471ts2 = c4471ts;
                                    c4489zj12 = c4489zj2;
                                    iM18177x14 = i;
                                    cls4 = cls2;
                                    c4443emClone3 = c4443em3;
                                    it = iGenericEnumerator2;
                                    kkVarClone = kkVar;
                                    kkVarClone2 = kkVar2;
                                    c4489zj13 = c4489zj3;
                                    c4489zj14 = c4489zj4;
                                } else {
                                    try {
                                        try {
                                            if (iM18177x1 <= c4443em2.m18177x1()) {
                                                i2 = iM18177x1;
                                                if (c4443em2.m18177x1() != c4443em.m18177x1()) {
                                                    z2 = false;
                                                    if (z2) {
                                                        iM18177x12 = c4443em2.m18177x1();
                                                        iM18177x13 = c4443em.m18177x1();
                                                    } else {
                                                        iM18177x12 = c4443emClone3.m18177x1();
                                                        iM18177x13 = c4443em2.m18177x1();
                                                    }
                                                    z3 = z2;
                                                    float fM18177x1 = (i2 - c4443em.m18177x1()) / iM18177x14;
                                                    i = iM18177x14;
                                                    float fM18177x12 = (i2 - (!z3 ? c4443em2.m18177x1() : c4443em.m18177x1())) / (iM18177x12 - iM18177x13);
                                                    c4443em3 = c4443emClone3;
                                                    float fM18173k42 = ((c4443emClone3.m18173k4() - c4443em.m18173k4()) * fM18177x1) + c4443em.m18173k4();
                                                    if (z3) {
                                                        f3 = fM18173k42;
                                                        fM18173k4 = c4443em.m18173k4() + ((c4443em2.m18173k4() - c4443em.m18173k4()) * fM18177x12);
                                                    } else {
                                                        f3 = fM18173k42;
                                                        fM18173k4 = ((c4443em3.m18173k4() - c4443em2.m18173k4()) * fM18177x12) + c4443em2.m18173k4();
                                                    }
                                                    C4428ai c4428ai6 = kkVarClone.f12181k4;
                                                    f4 = fM18173k4;
                                                    C4428ai c4428aiClone = C4428ai.m18037k4(c4428ai6, C4428ai.m18036k4(C4428ai.m18040x1(kkVarClone3.f12181k4, c4428ai6), fM18177x1)).Clone();
                                                    if (z3) {
                                                        cls2 = cls4;
                                                        try {
                                                            C4428ai c4428ai7 = kkVarClone.f12181k4;
                                                            c4428aiM18037k4 = C4428ai.m18037k4(c4428ai7, C4428ai.m18036k4(C4428ai.m18040x1(kkVarClone2.f12181k4, c4428ai7), fM18177x12));
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            iGenericEnumerator2 = it;
                                                            cls = cls2;
                                                            iGenericEnumerator = iGenericEnumerator2;
                                                            if (C7019kk.m27456k4((Iterator) iGenericEnumerator, cls)) {
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        try {
                                                            C4428ai c4428ai8 = kkVarClone2.f12181k4;
                                                            cls2 = cls4;
                                                            try {
                                                                c4428aiM18037k4 = C4428ai.m18037k4(c4428ai8, C4428ai.m18036k4(C4428ai.m18040x1(kkVarClone3.f12181k4, c4428ai8), fM18177x12));
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                iGenericEnumerator = it;
                                                                cls = cls2;
                                                                if (C7019kk.m27456k4((Iterator) iGenericEnumerator, cls)) {
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cls2 = cls4;
                                                        }
                                                    }
                                                    C4428ai c4428aiClone2 = c4428aiM18037k4.Clone();
                                                    C4489zj c4489zj20 = kkVarClone.f12184x1;
                                                    iGenericEnumerator2 = it;
                                                    C4489zj c4489zjClone = C4489zj.m18499k4(c4489zj20, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone3.f12184x1, c4489zj20), fM18177x1)).Clone();
                                                    if (z3) {
                                                        C4489zj c4489zj21 = kkVarClone.f12184x1;
                                                        c4489zjM18499k4 = C4489zj.m18499k4(c4489zj21, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone2.f12184x1, c4489zj21), fM18177x12));
                                                    } else {
                                                        C4489zj c4489zj22 = kkVarClone2.f12184x1;
                                                        c4489zjM18499k4 = C4489zj.m18499k4(c4489zj22, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone3.f12184x1, c4489zj22), fM18177x12));
                                                    }
                                                    C4489zj c4489zjClone2 = c4489zjM18499k4.Clone();
                                                    C4459os c4459os5 = kkVarClone.f12182kk;
                                                    C4459os c4459osClone = C4459os.m18279k4(c4459os5, C4459os.m18278k4(C4459os.m18282x1(kkVarClone3.f12182kk, c4459os5), fM18177x1)).Clone();
                                                    if (z3) {
                                                        c4459os = c4459osClone;
                                                        C4459os c4459os6 = kkVarClone.f12182kk;
                                                        c4459osM18279k4 = C4459os.m18279k4(c4459os6, C4459os.m18278k4(C4459os.m18282x1(kkVarClone2.f12182kk, c4459os6), fM18177x12));
                                                    } else {
                                                        C4459os c4459os7 = kkVarClone2.f12182kk;
                                                        c4459os = c4459osClone;
                                                        c4459osM18279k4 = C4459os.m18279k4(c4459os7, C4459os.m18278k4(C4459os.m18282x1(kkVarClone3.f12182kk, c4459os7), fM18177x12));
                                                    }
                                                    C4459os c4459osClone2 = c4459osM18279k4.Clone();
                                                    C4489zj c4489zj23 = kkVarClone.f12183to;
                                                    C4489zj c4489zjClone3 = C4489zj.m18499k4(c4489zj23, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone3.f12183to, c4489zj23), fM18177x1)).Clone();
                                                    if (z3) {
                                                        c4489zj5 = c4489zjClone3;
                                                        C4489zj c4489zj24 = kkVarClone.f12183to;
                                                        c4489zjM18499k42 = C4489zj.m18499k4(c4489zj24, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone2.f12183to, c4489zj24), fM18177x12));
                                                    } else {
                                                        C4489zj c4489zj25 = kkVarClone2.f12183to;
                                                        c4489zj5 = c4489zjClone3;
                                                        c4489zjM18499k42 = C4489zj.m18499k4(c4489zj25, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone3.f12183to, c4489zj25), fM18177x12));
                                                    }
                                                    C4489zj c4489zjClone4 = c4489zjM18499k42.Clone();
                                                    if (z) {
                                                        C4489zj.m18499k4(c4489zj12, C4489zj.m18498k4(C4489zj.m18504x1(c4489zj14, c4489zj12), fM18177x1)).CloneTo(c4489zj15);
                                                        (z3 ? C4489zj.m18499k4(c4489zj13, C4489zj.m18498k4(C4489zj.m18504x1(c4489zj14, c4489zj13), fM18177x12)) : C4489zj.m18499k4(c4489zj12, C4489zj.m18498k4(C4489zj.m18504x1(c4489zj13, c4489zj12), fM18177x12))).CloneTo(c4489zj16);
                                                    }
                                                    if (f3 <= f4) {
                                                        Float[] fArr = {Float.valueOf(f3)};
                                                        Float[] fArr2 = {Float.valueOf(f4)};
                                                        C4479w6.m18414k4(fArr, fArr2);
                                                        float fFloatValue = fArr[0].floatValue();
                                                        float fFloatValue2 = fArr2[0].floatValue();
                                                        C4428ai[] c4428aiArr = {c4428aiClone};
                                                        C4428ai[] c4428aiArr2 = {c4428aiClone2};
                                                        C4479w6.m18409k4(c4428aiArr, c4428aiArr2);
                                                        c4428aiArr[0].CloneTo(c4428aiClone);
                                                        c4428aiArr2[0].CloneTo(c4428aiClone2);
                                                        C4489zj[] c4489zjArr = {c4489zjClone};
                                                        C4489zj[] c4489zjArr2 = {c4489zjClone2};
                                                        C4479w6.m18413k4(c4489zjArr, c4489zjArr2);
                                                        c4489zjArr[0].CloneTo(c4489zjClone);
                                                        c4489zjArr2[0].CloneTo(c4489zjClone2);
                                                        C4459os[] c4459osArr = {c4459os};
                                                        C4459os[] c4459osArr2 = {c4459osClone2};
                                                        C4479w6.m18412k4(c4459osArr, c4459osArr2);
                                                        c4459os2 = c4459os;
                                                        c4459osArr[0].CloneTo(c4459os2);
                                                        C4459os c4459os8 = c4459osArr2[0];
                                                        c4459os3 = c4459osClone2;
                                                        c4459os8.CloneTo(c4459os3);
                                                        C4489zj[] c4489zjArr3 = {c4489zj5};
                                                        kkVar = kkVarClone;
                                                        C4489zj[] c4489zjArr4 = {c4489zjClone4};
                                                        C4479w6.m18413k4(c4489zjArr3, c4489zjArr4);
                                                        c4489zj6 = c4489zj5;
                                                        c4489zjArr3[0].CloneTo(c4489zj6);
                                                        c4489zjArr4[0].CloneTo(c4489zjClone4);
                                                        C4489zj[] c4489zjArr5 = {c4489zj15};
                                                        kkVar2 = kkVarClone2;
                                                        C4489zj[] c4489zjArr6 = {c4489zj16};
                                                        C4479w6.m18413k4(c4489zjArr5, c4489zjArr6);
                                                        c4489zjArr5[0].CloneTo(c4489zj15);
                                                        c4489zjArr6[0].CloneTo(c4489zj16);
                                                        f3 = fFloatValue;
                                                        f4 = fFloatValue2;
                                                    } else {
                                                        c4459os2 = c4459os;
                                                        c4459os3 = c4459osClone2;
                                                        kkVar = kkVarClone;
                                                        kkVar2 = kkVarClone2;
                                                        c4489zj6 = c4489zj5;
                                                    }
                                                    int iM27462to2 = C7019kk.m27462to(Float.valueOf(f3), 13);
                                                    c4489zj2 = c4489zj12;
                                                    iM27462to = C7019kk.m27462to(Float.valueOf(f4), 13);
                                                    i3 = iM27462to2;
                                                    while (i3 <= iM27462to) {
                                                        if (i3 >= 0) {
                                                            c4489zj10 = c4489zj13;
                                                            c4489zj11 = c4489zj14;
                                                            try {
                                                                if (i3 >= this.f12290x1.m18173k4()) {
                                                                    c4489zj7 = c4489zjClone2;
                                                                    c4489zj8 = c4489zjClone4;
                                                                    i4 = iM27462to2;
                                                                    c4428ai = c4428aiClone2;
                                                                    c4459os4 = c4459os2;
                                                                    c4428ai2 = c4428aiClone;
                                                                    c4489zj9 = c4489zj6;
                                                                } else {
                                                                    float f6 = iM27462to2 == iM27462to ? f2 : (i3 - f3) / (f4 - f3);
                                                                    i4 = iM27462to2;
                                                                    C4428ai c4428aiClone3 = C4428ai.m18037k4(c4428aiClone, C4428ai.m18036k4(C4428ai.m18040x1(c4428aiClone2, c4428aiClone), f6)).Clone();
                                                                    c4428ai = c4428aiClone2;
                                                                    C4489zj c4489zjClone5 = C4489zj.m18499k4(c4489zjClone, C4489zj.m18498k4(C4489zj.m18504x1(c4489zjClone2, c4489zjClone), f6)).Clone();
                                                                    c4489zj7 = c4489zjClone2;
                                                                    C4459os c4459osClone3 = C4459os.m18279k4(c4459os2, C4459os.m18278k4(C4459os.m18282x1(c4459os3, c4459os2), f6)).Clone();
                                                                    c4459os4 = c4459os2;
                                                                    C4489zj c4489zjClone6 = C4489zj.m18499k4(c4489zj6, C4489zj.m18498k4(C4489zj.m18504x1(c4489zjClone4, c4489zj6), f6)).Clone();
                                                                    if (z) {
                                                                        c4489zj8 = c4489zjClone4;
                                                                        C4489zj c4489zjClone7 = C4489zj.m18499k4(c4489zj15, C4489zj.m18498k4(C4489zj.m18504x1(c4489zj16, c4489zj15), f6)).Clone();
                                                                        c4459osClone3.m18286k4(c4489zjClone7.m18506k4() / c4489zjClone7.m18508kk());
                                                                        c4459osClone3.m18291x1(c4489zjClone7.m18511x1() / c4489zjClone7.m18508kk());
                                                                    } else {
                                                                        c4489zj8 = c4489zjClone4;
                                                                    }
                                                                    int iM18173k4 = (this.f12290x1.m18173k4() * i2) + i3;
                                                                    float fM18047kk = c4428aiClone3.m18047kk();
                                                                    if (this.f12288m9 || fM18047kk < this.f12289to[iM18173k4]) {
                                                                        int i5 = iM18173k4 * 4;
                                                                        c4428ai2 = c4428aiClone;
                                                                        AbstractC4434bz.kk kkVar3 = new AbstractC4434bz.kk();
                                                                        c4489zj9 = c4489zj6;
                                                                        c4428aiClone3.CloneTo(kkVar3.f12181k4);
                                                                        c4489zjClone5.CloneTo(kkVar3.f12184x1);
                                                                        c4459osClone3.CloneTo(kkVar3.f12182kk);
                                                                        c4489zjClone6.CloneTo(kkVar3.f12183to);
                                                                        C4428ai c4428aiClone4 = abstractC4434bz.mo18091k4(kkVar3.Clone()).Clone();
                                                                        if (c4428aiClone4.m18049to() >= this.f12285h4) {
                                                                            if (this.f12288m9) {
                                                                                short s = this.f12284du[iM18173k4];
                                                                                if (s == -1) {
                                                                                    C4479w6.m18408k4(c4428aiClone4.Clone(), this.f12287kk, i5);
                                                                                    this.f12284du[iM18173k4] = c4433bv.m18078du();
                                                                                } else if (s != c4433bv.m18078du()) {
                                                                                    byte[] bArr = this.f12287kk;
                                                                                    float f7 = (bArr[i5] & 255) / 255.0f;
                                                                                    float f8 = (bArr[i5 + 1] & 255) / 255.0f;
                                                                                    float f9 = (bArr[i5 + 2] & 255) / 255.0f;
                                                                                    float fM18049to = c4428aiClone4.m18049to();
                                                                                    float f10 = f2 - fM18049to;
                                                                                    c4428aiClone4.m18045k4((f7 * f10) + (c4428aiClone4.m18044k4() * fM18049to));
                                                                                    c4428aiClone4.m18052x1((f8 * f10) + (c4428aiClone4.m18051x1() * fM18049to));
                                                                                    c4428aiClone4.m18048kk((f9 * f10) + (c4428aiClone4.m18047kk() * fM18049to));
                                                                                    c4428aiClone4.m18050to((((bArr[i5 + 3] & 255) / 255.0f) * f10) + fM18049to);
                                                                                    C4479w6.m18408k4(c4428aiClone4.Clone(), this.f12287kk, i5);
                                                                                    this.f12284du[iM18173k4] = c4433bv.m18078du();
                                                                                }
                                                                            } else {
                                                                                C4479w6.m18408k4(c4428aiClone4.Clone(), this.f12287kk, i5);
                                                                                this.f12289to[iM18173k4] = fM18047kk;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c4428ai2 = c4428aiClone;
                                                                        c4489zj9 = c4489zj6;
                                                                    }
                                                                }
                                                                i3++;
                                                                c4489zj13 = c4489zj10;
                                                                c4489zj14 = c4489zj11;
                                                                iM27462to2 = i4;
                                                                c4428aiClone2 = c4428ai;
                                                                c4489zjClone2 = c4489zj7;
                                                                c4459os2 = c4459os4;
                                                                c4489zjClone4 = c4489zj8;
                                                                c4428aiClone = c4428ai2;
                                                                c4489zj6 = c4489zj9;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                cls = cls2;
                                                                iGenericEnumerator = iGenericEnumerator2;
                                                                if (C7019kk.m27456k4((Iterator) iGenericEnumerator, cls)) {
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            c4489zj7 = c4489zjClone2;
                                                            c4489zj8 = c4489zjClone4;
                                                            i4 = iM27462to2;
                                                            c4428ai = c4428aiClone2;
                                                            c4459os4 = c4459os2;
                                                            c4428ai2 = c4428aiClone;
                                                            c4489zj9 = c4489zj6;
                                                            c4489zj10 = c4489zj13;
                                                            c4489zj11 = c4489zj14;
                                                        }
                                                        i3++;
                                                        c4489zj13 = c4489zj10;
                                                        c4489zj14 = c4489zj11;
                                                        iM27462to2 = i4;
                                                        c4428aiClone2 = c4428ai;
                                                        c4489zjClone2 = c4489zj7;
                                                        c4459os2 = c4459os4;
                                                        c4489zjClone4 = c4489zj8;
                                                        c4428aiClone = c4428ai2;
                                                        c4489zj6 = c4489zj9;
                                                    }
                                                    abstractC4434bz3 = abstractC4434bz;
                                                    c4489zj3 = c4489zj13;
                                                    c4489zj4 = c4489zj14;
                                                    c4471ts = this;
                                                }
                                            } else {
                                                i2 = iM18177x1;
                                            }
                                            C4459os c4459osClone4 = C4459os.m18279k4(c4459os5, C4459os.m18278k4(C4459os.m18282x1(kkVarClone3.f12182kk, c4459os5), fM18177x1)).Clone();
                                            if (z3) {
                                            }
                                            C4459os c4459osClone22 = c4459osM18279k4.Clone();
                                            C4489zj c4489zj232 = kkVarClone.f12183to;
                                            C4489zj c4489zjClone32 = C4489zj.m18499k4(c4489zj232, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone3.f12183to, c4489zj232), fM18177x1)).Clone();
                                            if (z3) {
                                            }
                                            C4489zj c4489zjClone42 = c4489zjM18499k42.Clone();
                                            if (z) {
                                            }
                                            if (f3 <= f4) {
                                            }
                                            int iM27462to22 = C7019kk.m27462to(Float.valueOf(f3), 13);
                                            c4489zj2 = c4489zj12;
                                            iM27462to = C7019kk.m27462to(Float.valueOf(f4), 13);
                                            i3 = iM27462to22;
                                            while (i3 <= iM27462to) {
                                            }
                                            abstractC4434bz3 = abstractC4434bz;
                                            c4489zj3 = c4489zj13;
                                            c4489zj4 = c4489zj14;
                                            c4471ts = this;
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                        C4489zj c4489zjClone8 = C4489zj.m18499k4(c4489zj20, C4489zj.m18498k4(C4489zj.m18504x1(kkVarClone3.f12184x1, c4489zj20), fM18177x1)).Clone();
                                        if (z3) {
                                        }
                                        C4489zj c4489zjClone22 = c4489zjM18499k4.Clone();
                                        C4459os c4459os52 = kkVarClone.f12182kk;
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                    z2 = true;
                                    if (z2) {
                                    }
                                    z3 = z2;
                                    float fM18177x13 = (i2 - c4443em.m18177x1()) / iM18177x14;
                                    i = iM18177x14;
                                    float fM18177x122 = (i2 - (!z3 ? c4443em2.m18177x1() : c4443em.m18177x1())) / (iM18177x12 - iM18177x13);
                                    c4443em3 = c4443emClone3;
                                    float fM18173k422 = ((c4443emClone3.m18173k4() - c4443em.m18173k4()) * fM18177x13) + c4443em.m18173k4();
                                    if (z3) {
                                    }
                                    C4428ai c4428ai62 = kkVarClone.f12181k4;
                                    f4 = fM18173k4;
                                    C4428ai c4428aiClone5 = C4428ai.m18037k4(c4428ai62, C4428ai.m18036k4(C4428ai.m18040x1(kkVarClone3.f12181k4, c4428ai62), fM18177x13)).Clone();
                                    if (z3) {
                                    }
                                    C4428ai c4428aiClone22 = c4428aiM18037k4.Clone();
                                    C4489zj c4489zj202 = kkVarClone.f12184x1;
                                    iGenericEnumerator2 = it;
                                }
                                iM18177x1 = i2 + 1;
                                abstractC4434bz4 = abstractC4434bz3;
                                c4471ts2 = c4471ts;
                                c4489zj12 = c4489zj2;
                                iM18177x14 = i;
                                cls4 = cls2;
                                c4443emClone3 = c4443em3;
                                it = iGenericEnumerator2;
                                kkVarClone = kkVar;
                                kkVarClone2 = kkVar2;
                                c4489zj13 = c4489zj3;
                                c4489zj14 = c4489zj4;
                            }
                            f5 = f;
                            c4442e0M18096to = c4442e0;
                            z4 = z;
                        } catch (Throwable th9) {
                            th = th9;
                            cls2 = cls4;
                        }
                    }
                } else if (c4442e0.m18167to() != 1 || ((c4443emClone.m18177x1() + c4443emClone3.m18177x1()) * (c4443emClone.m18173k4() - c4443emClone3.m18173k4())) + ((c4443emClone3.m18173k4() - c4443emClone2.m18173k4()) * (c4443emClone3.m18177x1() + c4443emClone2.m18177x1())) + ((c4443emClone2.m18177x1() + c4443emClone.m18177x1()) * (c4443emClone2.m18173k4() - c4443emClone.m18173k4())) >= f) {
                    float fM18288kk4 = C4459os.m18282x1(kkVarClone2.f12182kk, kkVarClone.f12182kk).m18288kk();
                    float fM18288kk22 = C4459os.m18282x1(kkVarClone3.f12182kk, kkVarClone2.f12182kk).m18288kk();
                    float fM18288kk32 = C4459os.m18282x1(kkVarClone.f12182kk, kkVarClone3.f12182kk).m18288kk();
                    C4489zj c4489zj182 = c4489zj13;
                    abstractC4434bz4.m18089du().mo18193k4(C4479w6.m18405k4(fM18288kk4 == f ? C4443em.m18170k4(c4443emClone2, c4443emClone).m18175kk() / fM18288kk4 : Float.MAX_VALUE, fM18288kk22 == f ? C4443em.m18170k4(c4443emClone3, c4443emClone2).m18175kk() / fM18288kk22 : Float.MAX_VALUE, fM18288kk32 != f ? C4443em.m18170k4(c4443emClone, c4443emClone3).m18175kk() / fM18288kk32 : Float.MAX_VALUE));
                    if (c4443emClone2.m18177x1() < c4443emClone.m18177x1()) {
                    }
                    if (c4443emClone3.m18177x1() < c4443emClone.m18177x1()) {
                    }
                    if (c4443emClone3.m18177x1() < c4443emClone2.m18177x1()) {
                    }
                    if (z) {
                    }
                    int iM18177x142 = c4443emClone3.m18177x1() - c4443em.m18177x1();
                    iM18177x1 = c4443em.m18177x1();
                    while (iM18177x1 <= c4443emClone3.m18177x1()) {
                    }
                    f5 = f;
                    c4442e0M18096to = c4442e0;
                    z4 = z;
                } else {
                    abstractC4434bz2 = abstractC4434bz4;
                    cls3 = cls4;
                    abstractC4434bz4 = abstractC4434bz2;
                    c4471ts2 = c4471ts2;
                    f5 = f;
                    c4442e0M18096to = c4442e0;
                    z4 = z;
                    c4489zj12 = c4489zj;
                    c4489zj13 = c4489zj13;
                    cls4 = cls3;
                    it = it;
                }
                if (C7019kk.m27456k4((Iterator) iGenericEnumerator, cls)) {
                    iGenericEnumerator.dispose();
                }
                throw th;
            }
            abstractC4434bz2 = abstractC4434bz4;
            cls3 = cls4;
            c4442e0 = c4442e0M18096to;
            z = z4;
            c4489zj = c4489zj12;
            abstractC4434bz4 = abstractC4434bz2;
            c4471ts2 = c4471ts2;
            f5 = f;
            c4442e0M18096to = c4442e0;
            z4 = z;
            c4489zj12 = c4489zj;
            c4489zj13 = c4489zj13;
            cls4 = cls3;
            it = it;
        }
        IGenericEnumerator<AbstractC4434bz.k4> iGenericEnumerator3 = it;
        if (C7019kk.m27456k4((Iterator) iGenericEnumerator3, cls4)) {
            iGenericEnumerator3.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18354k4(C4476v4 c4476v4, AbstractC4434bz... abstractC4434bzArr) {
        for (AbstractC4434bz abstractC4434bz : abstractC4434bzArr) {
            if (abstractC4434bz != null) {
                abstractC4434bz.m18097x1();
            }
        }
        IGenericEnumerator<C4433bv> it = c4476v4.iterator();
        while (it.hasNext()) {
            try {
                C4433bv next = it.next();
                int length = abstractC4434bzArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    AbstractC4434bz abstractC4434bz2 = abstractC4434bzArr[i];
                    if (abstractC4434bz2 != null && (abstractC4434bz2.m18090h4() & next.m18085to()) != 0) {
                        m18351k4(next, abstractC4434bz2);
                        break;
                    }
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        for (AbstractC4434bz abstractC4434bz3 : abstractC4434bzArr) {
            if (abstractC4434bz3 != null) {
                abstractC4434bz3.m18094kk();
            }
        }
        if (m18356kk() != null) {
            m18356kk().m18053k4(this);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m18355k4() {
        return this.f12287kk;
    }
}
