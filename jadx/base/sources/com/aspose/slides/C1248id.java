package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11855y2;
import com.aspose.slides.internal.p475wh.C12001c5;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.id */
/* JADX INFO: loaded from: classes3.dex */
class C1248id {

    /* JADX INFO: renamed from: com.aspose.slides.id$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract C11791os mo7624k4(u8s u8sVar, byte[] bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m7620k4(C0758ap c0758ap, k4 k4Var, com.aspose.slides.internal.p332p7.v4m v4mVar, C11723d3 c11723d3, u8s u8sVar) {
        IGenericDictionary iGenericDictionaryM6508m9;
        com.aspose.slides.internal.p332p7.wum wumVarM42603k4;
        String strM55289du;
        IGenericEnumerator iGenericEnumerator;
        IGenericEnumerator<KeyValuePair<String, C1141ge>> it = c0758ap.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, C1141ge> next = it.next();
                com.aspose.slides.internal.p332p7.uxg uxgVarM42721k4 = v4mVar.m42721k4();
                uxgVarM42721k4.m42600du().m44666x1(next.getValue().m6503k4());
                uxgVarM42721k4.m42600du().m44667x1(C13678ja.m63257k4(next.getValue().m6509to()));
                uxgVarM42721k4.m42600du().m44661k4((byte) next.getValue().m6500du());
                uxgVarM42721k4.m42600du().m44662k4(next.getValue().getFontName());
                if (next.getValue().m6501dy()) {
                    IGenericDictionary<Integer, byte[]> iGenericDictionaryM1548k4 = ((FontsManager) u8sVar.m71526c5().getFontsManager()).m1548k4(next.getValue(), u8sVar.m71547k4());
                    iGenericDictionaryM6508m9 = new Dictionary();
                    IGenericEnumerator it2 = iGenericDictionaryM1548k4.iterator();
                    while (it2.hasNext()) {
                        try {
                            KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                            try {
                                iGenericDictionaryM6508m9.addItem(keyValuePair.getKey(), FontsManager.m1544k4((byte[]) keyValuePair.getValue(), new FontData[]{null}));
                            } catch (RuntimeException unused) {
                                iGenericDictionaryM6508m9.addItem(keyValuePair.getKey(), (byte[]) keyValuePair.getValue());
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    boolean zM27456k4 = C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class);
                    iGenericEnumerator = it2;
                    if (zM27456k4) {
                        iGenericEnumerator.dispose();
                    }
                } else {
                    iGenericDictionaryM6508m9 = next.getValue().m6508m9();
                    if (iGenericDictionaryM6508m9.size() == 0) {
                        iGenericDictionaryM6508m9 = new Dictionary(next.getValue().m6502h4().size());
                        IGenericEnumerator it3 = next.getValue().m6502h4().iterator();
                        while (it3.hasNext()) {
                            try {
                                KeyValuePair keyValuePair2 = (KeyValuePair) it3.next();
                                iGenericDictionaryM6508m9.addItem(keyValuePair2.getKey(), FontsManager.m1544k4((byte[]) keyValuePair2.getValue(), new FontData[]{null}));
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            iGenericEnumerator = it3;
                            iGenericEnumerator.dispose();
                        }
                    }
                }
                IGenericEnumerator it4 = iGenericDictionaryM6508m9.iterator();
                while (it4.hasNext()) {
                    try {
                        KeyValuePair keyValuePair3 = (KeyValuePair) it4.next();
                        C11791os c11791osMo7624k4 = k4Var.mo7624k4(u8sVar, (byte[]) keyValuePair3.getValue());
                        if (((Integer) keyValuePair3.getKey()).intValue() == 0) {
                            wumVarM42603k4 = uxgVarM42721k4.m42603k4();
                            strM55289du = c11723d3.m55311x1(c11791osMo7624k4).m55289du();
                        } else if ((((Integer) keyValuePair3.getKey()).intValue() & 1) == 1 && (((Integer) keyValuePair3.getKey()).intValue() & 2) == 2) {
                            wumVarM42603k4 = uxgVarM42721k4.m42606to();
                            strM55289du = c11723d3.m55311x1(c11791osMo7624k4).m55289du();
                        } else if ((((Integer) keyValuePair3.getKey()).intValue() & 1) == 1) {
                            wumVarM42603k4 = uxgVarM42721k4.m42607x1();
                            strM55289du = c11723d3.m55311x1(c11791osMo7624k4).m55289du();
                        } else if ((((Integer) keyValuePair3.getKey()).intValue() & 2) == 2) {
                            wumVarM42603k4 = uxgVarM42721k4.m42604kk();
                            strM55289du = c11723d3.m55311x1(c11791osMo7624k4).m55289du();
                        }
                        wumVarM42603k4.m44065k4(strM55289du);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7621k4(C0758ap c0758ap, AbstractC4685kk<com.aspose.slides.internal.p332p7.v4m> abstractC4685kk, final u8s u8sVar) {
        C11723d3 c11723d3M55433g8 = u8sVar.m55433g8();
        final int[] iArr = {1};
        m7620k4(c0758ap, new k4() { // from class: com.aspose.slides.id.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.aspose.slides.C1248id.k4
            /* JADX INFO: renamed from: k4 */
            public C11791os mo7624k4(u8s u8sVar2, byte[] bArr) {
                return u8sVar.mo4812qm().m55395k4("/ppt/fonts/font{0}.fntdata", new AbstractC11760jd.k4() { // from class: com.aspose.slides.id.1.1
                    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                    /* JADX INFO: renamed from: k4 */
                    public int mo5039k4() {
                        int[] iArr2 = iArr;
                        int i = iArr2[0];
                        iArr2[0] = i + 1;
                        return i;
                    }
                }, new C11855y2(), bArr);
            }
        }, abstractC4685kk.invoke(), c11723d3M55433g8, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7622k4(C0758ap c0758ap, C11791os c11791os, String str, byte b, byte[] bArr, int i, int i2, gnb gnbVar) {
        c11791os.m55422k4(true);
        try {
            c0758ap.m3690k4(str, b, bArr, i, i2, c11791os.m55426to(), false, gnbVar.m6801yj().m2349du());
        } catch (RuntimeException unused) {
            gnbVar.m6785k4(C14113y2.m67408k4("Embedded font \"", str, " ", C14042ak.m66410k4(C12001c5.class, i2), "\" cannot be installed: General failure"), 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7623k4(C1197hf c1197hf, com.aspose.slides.internal.p332p7.v4m v4mVar, gnb gnbVar) {
        gnb gnbVar2;
        if (v4mVar == null) {
            return;
        }
        C11723d3 c11723d3M55338u4 = gnbVar.m55338u4();
        com.aspose.slides.internal.p332p7.uxg[] uxgVarArrM42722x1 = v4mVar.m42722x1();
        if (uxgVarArrM42722x1 == null || uxgVarArrM42722x1.length <= 0) {
            return;
        }
        int length = uxgVarArrM42722x1.length;
        int i = 0;
        while (i < length) {
            com.aspose.slides.internal.p332p7.uxg uxgVar = uxgVarArrM42722x1[i];
            gnbVar.m6790ks().throwIfInterruptionRequested();
            String strM44660k4 = uxgVar.m42600du().m44660k4();
            if (c1197hf.m7122k4().m3689k4(strM44660k4) != null) {
                gnbVar2 = gnbVar;
            } else if (uxgVar.m42602h4() != null) {
                C11709bg c11709bgM55303k4 = c11723d3M55338u4.m55303k4(uxgVar.m42602h4().m44064k4());
                if (c11709bgM55303k4.m55296x1() != null) {
                    gnbVar2 = gnbVar;
                    m7622k4(c1197hf.m7122k4(), c11709bgM55303k4.m55296x1(), strM44660k4, uxgVar.m42600du().m44664to(), C13678ja.m63261k4(uxgVar.m42600du().m44665x1()), uxgVar.m42600du().m44663kk(), 0, gnbVar2);
                } else {
                    gnbVar2 = gnbVar;
                }
                if (uxgVar.m42605m9() != null) {
                    C11709bg c11709bgM55303k42 = c11723d3M55338u4.m55303k4(uxgVar.m42605m9().m44064k4());
                    if (c11709bgM55303k42.m55296x1() != null) {
                        m7622k4(c1197hf.m7122k4(), c11709bgM55303k42.m55296x1(), strM44660k4, uxgVar.m42600du().m44664to(), C13678ja.m63261k4(uxgVar.m42600du().m44665x1()), uxgVar.m42600du().m44663kk(), 1, gnbVar2);
                    }
                }
                if (uxgVar.m42601dy() != null) {
                    C11709bg c11709bgM55303k43 = c11723d3M55338u4.m55303k4(uxgVar.m42601dy().m44064k4());
                    if (c11709bgM55303k43.m55296x1() != null) {
                        m7622k4(c1197hf.m7122k4(), c11709bgM55303k43.m55296x1(), strM44660k4, uxgVar.m42600du().m44664to(), C13678ja.m63261k4(uxgVar.m42600du().m44665x1()), uxgVar.m42600du().m44663kk(), 2, gnbVar2);
                    }
                }
                if (uxgVar.m42599c5() != null) {
                    C11709bg c11709bgM55303k44 = c11723d3M55338u4.m55303k4(uxgVar.m42599c5().m44064k4());
                    if (c11709bgM55303k44.m55296x1() != null) {
                        m7622k4(c1197hf.m7122k4(), c11709bgM55303k44.m55296x1(), strM44660k4, uxgVar.m42600du().m44664to(), C13678ja.m63261k4(uxgVar.m42600du().m44665x1()), uxgVar.m42600du().m44663kk(), 3, gnbVar2);
                    }
                }
            }
            i++;
            gnbVar = gnbVar2;
        }
    }
}
