package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5779c5;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p237ks.C5906k4;
import com.aspose.slides.internal.p270m9.C6334du;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11530du;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p447up.C11540to;
import com.aspose.slides.internal.p447up.C11543x6;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.m4 */
/* JADX INFO: loaded from: classes.dex */
public class C5318m4 extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14315k4;

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f14316x1;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14315k4 = c11068dy;
        c11068dy.m53499k4("normal", C5813x1.k4.f16504wy);
        c11068dy.m53499k4("none", C5813x1.k4.f15898b3);
        c11068dy.m53499k4("open-quote", C5813x1.k4.f16498wr);
        c11068dy.m53499k4("close-quote", C5813x1.k4.f16083i2);
        c11068dy.m53499k4("no-open-quote", C5813x1.k4.f16108iv);
        c11068dy.m53499k4("no-close-quote", C5813x1.k4.f16316q9);
        f14316x1 = new C7017h4("attr(", "counter(", "counters(");
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14315k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        C5796m9 c5796m9 = (C5796m9) C7019kk.m27452k4((Object) abstractC5788h4, C5796m9.class);
        if (c5796m9 == null) {
            return super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
        }
        C5796m9 c5796m92 = new C5796m9();
        IGenericEnumerator<AbstractC5788h4> it = c5796m9.iterator();
        while (it.hasNext()) {
            try {
                AbstractC5803to c11537ks = (AbstractC5803to) it.next();
                if (c11537ks.m23700k4() == 22) {
                    InterfaceC12769ix interfaceC12769ix = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC5808uz, InterfaceC12769ix.class);
                    if (interfaceC12769ix == null) {
                        C11537ks c11537ksM54524x1 = C11537ks.m54524x1(C14113y2.f47374k4);
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return c11537ksM54524x1;
                    }
                    String strMo22721to = interfaceC12769ix.mo22721to(c11537ks.mo23706x1());
                    if (strMo22721to == null) {
                        strMo22721to = C14113y2.f47374k4;
                    }
                    c5796m92.m23683x1(new C11537ks(strMo22721to, (short) 22));
                } else if (c11537ks.m23700k4() == 23) {
                    if (C7019kk.m27469x1(c11537ks, C11540to.class)) {
                        C5779c5 c5779c5Mo23703kk = c11537ks.mo23703kk();
                        c5796m92.m23683x1(new C11537ks(c6344m9.mo26002m9().mo23772k4(c5779c5Mo23703kk.m23394x1()).m23779h4().mo49689k4(interfaceC5808uz.mo8449x1().mo23709k4(c5779c5Mo23703kk.m23392k4(), str)), (short) 23));
                    } else {
                        C5779c5 c5779c5Mo23703kk2 = c11537ks.mo23703kk();
                        C5906k4 c5906k4Mo23772k4 = c6344m9.mo26002m9().mo23772k4(c5779c5Mo23703kk2.m23394x1());
                        C6765kp c6765kp = new C6765kp();
                        int iMo23709k4 = interfaceC5808uz.mo8449x1().mo23709k4(c5779c5Mo23703kk2.m23392k4(), str);
                        c6765kp.m26786k4(0, c5906k4Mo23772k4.m23779h4().mo49689k4(iMo23709k4));
                        C6334du c6334duM25921k4 = ((C6334du) interfaceC5808uz.mo8449x1()).m25921k4(c5779c5Mo23703kk2.m23392k4());
                        while (true) {
                            InterfaceC12777qq interfaceC12777qqMo22646kp = c6334duM25921k4.m25922k4().mo22646kp();
                            C6334du c6334duM25921k42 = (C6334du) ((InterfaceC5808uz) C7019kk.m27452k4((Object) interfaceC12777qqMo22646kp, InterfaceC5808uz.class)).mo8449x1();
                            int[] iArr = {iMo23709k4};
                            boolean zM25924k4 = c6334duM25921k42.m25924k4(c5779c5Mo23703kk2.m23392k4(), iArr);
                            iMo23709k4 = iArr[0];
                            if (zM25924k4) {
                                c6765kp.m26786k4(0, c5779c5Mo23703kk2.m23393kk());
                                c6765kp.m26786k4(0, c5906k4Mo23772k4.m23779h4().mo49689k4(iMo23709k4));
                                c6334duM25921k42 = c6334duM25921k42.m25921k4(c5779c5Mo23703kk2.m23392k4());
                            }
                            if ("html".equals(interfaceC12777qqMo22646kp.mo22604c5())) {
                                break;
                            }
                            c6334duM25921k4 = c6334duM25921k42;
                        }
                        c11537ks = new C11537ks(c6765kp.toString(), (short) 23);
                        c5796m92.m23683x1(c11537ks);
                    }
                } else if (c11537ks.m23700k4() != 19 || !C14113y2.m67411k4(c11537ks.mo23706x1())) {
                    c5796m92.m23683x1(c11537ks);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return c5796m92;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16504wy;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 83;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 c11543x6;
        AbstractC5788h4 abstractC5788h4M53498k4;
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 == 35 && (abstractC5788h4M53498k4 = mo15596du().m53498k4(C14113y2.m67361du(interfaceC9933up.mo48784c5()))) != null && (abstractC5788h4M53498k4 == C5813x1.k4.f15898b3 || abstractC5788h4M53498k4 == C5813x1.k4.f16504wy)) {
            return abstractC5788h4M53498k4;
        }
        C5796m9 c5796m9 = new C5796m9();
        while (interfaceC9933up != null) {
            short sMo48850k42 = interfaceC9933up.mo48850k4();
            if (sMo48850k42 == 24) {
                c11543x6 = new C11543x6(interfaceC9933up.mo48784c5());
            } else if (sMo48850k42 == 41) {
                int iM27428k4 = f14316x1.m27428k4(C14113y2.m67361du(interfaceC9933up.mo48821m9()));
                if (iM27428k4 != 0) {
                    C11537ks c11537ksM54523kk = null;
                    if (iM27428k4 == 1) {
                        InterfaceC9933up interfaceC9933upMo48820dy = interfaceC9933up.mo48820dy();
                        if (interfaceC9933upMo48820dy == null) {
                            throw m15604kk(interfaceC9933up.mo48821m9());
                        }
                        if (interfaceC9933upMo48820dy.mo48850k4() != 35) {
                            throw m15604kk(interfaceC9933up.mo48821m9());
                        }
                        C11537ks c11537ksM54523kk2 = C11537ks.m54523kk(interfaceC9933upMo48820dy.mo48784c5());
                        InterfaceC9933up interfaceC9933upMo48851kk = interfaceC9933upMo48820dy.mo48851kk();
                        if (interfaceC9933upMo48851kk != null) {
                            if (interfaceC9933upMo48851kk.mo48850k4() != 0) {
                                throw m15604kk(interfaceC9933up.mo48821m9());
                            }
                            InterfaceC9933up interfaceC9933upMo48851kk2 = interfaceC9933upMo48851kk.mo48851kk();
                            if (interfaceC9933upMo48851kk2.mo48850k4() != 35) {
                                throw m15604kk(interfaceC9933up.mo48821m9());
                            }
                            c11537ksM54523kk = C11537ks.m54523kk(interfaceC9933upMo48851kk2.mo48784c5());
                            InterfaceC9933up interfaceC9933upMo48851kk3 = interfaceC9933upMo48851kk2.mo48851kk();
                            if (interfaceC9933upMo48851kk3 != null) {
                                if (interfaceC9933upMo48851kk3.mo48850k4() == 35 || interfaceC9933upMo48851kk3.mo48850k4() == 36) {
                                    throw m15601k4(interfaceC9933upMo48851kk3.mo48784c5());
                                }
                                throw m15602k4(interfaceC9933up.mo48850k4());
                            }
                        }
                        c11543x6 = new C11540to(c11537ksM54523kk2, c11537ksM54523kk);
                    } else {
                        if (iM27428k4 != 2) {
                            throw m15602k4(interfaceC9933up.mo48850k4());
                        }
                        InterfaceC9933up interfaceC9933upMo48820dy2 = interfaceC9933up.mo48820dy();
                        if (interfaceC9933upMo48820dy2 == null) {
                            throw m15604kk(interfaceC9933up.mo48821m9());
                        }
                        if (interfaceC9933upMo48820dy2.mo48850k4() != 35) {
                            throw m15604kk(interfaceC9933up.mo48821m9());
                        }
                        C11537ks c11537ksM54523kk3 = C11537ks.m54523kk(interfaceC9933upMo48820dy2.mo48784c5());
                        InterfaceC9933up interfaceC9933upMo48851kk4 = interfaceC9933upMo48820dy2.mo48851kk();
                        if (interfaceC9933upMo48851kk4.mo48850k4() != 0) {
                            throw m15604kk(interfaceC9933up.mo48821m9());
                        }
                        InterfaceC9933up interfaceC9933upMo48851kk5 = interfaceC9933upMo48851kk4.mo48851kk();
                        if (interfaceC9933upMo48851kk5.mo48850k4() != 36) {
                            throw m15604kk(interfaceC9933up.mo48821m9());
                        }
                        C11537ks c11537ksM54523kk4 = C11537ks.m54523kk(interfaceC9933upMo48851kk5.mo48784c5());
                        InterfaceC9933up interfaceC9933upMo48851kk6 = interfaceC9933upMo48851kk5.mo48851kk();
                        if (interfaceC9933upMo48851kk6 != null) {
                            if (interfaceC9933upMo48851kk6.mo48850k4() != 0) {
                                throw m15604kk(interfaceC9933up.mo48821m9());
                            }
                            InterfaceC9933up interfaceC9933upMo48851kk7 = interfaceC9933upMo48851kk6.mo48851kk();
                            if (interfaceC9933upMo48851kk7.mo48850k4() != 35) {
                                throw m15604kk(interfaceC9933up.mo48821m9());
                            }
                            c11537ksM54523kk = C11537ks.m54523kk(interfaceC9933upMo48851kk7.mo48784c5());
                            InterfaceC9933up interfaceC9933upMo48851kk8 = interfaceC9933upMo48851kk7.mo48851kk();
                            if (interfaceC9933upMo48851kk8 != null) {
                                if (interfaceC9933upMo48851kk8.mo48850k4() == 35 || interfaceC9933upMo48851kk8.mo48850k4() == 36) {
                                    throw m15601k4(interfaceC9933upMo48851kk8.mo48784c5());
                                }
                                throw m15602k4(interfaceC9933up.mo48850k4());
                            }
                        }
                        c11543x6 = new C11530du(c11537ksM54523kk3, c11537ksM54523kk, c11537ksM54523kk4);
                    }
                } else {
                    if (interfaceC9933up.mo48820dy().mo48851kk() != null) {
                        throw m15604kk(interfaceC9933up.mo48821m9());
                    }
                    c11543x6 = new C11537ks(interfaceC9933up.mo48820dy().mo48784c5(), (short) 22);
                }
            } else if (sMo48850k42 == 35) {
                c11543x6 = mo15596du().m53498k4(C14113y2.m67361du(interfaceC9933up.mo48784c5()));
                if (c11543x6 == null) {
                    throw m15601k4(interfaceC9933up.mo48784c5());
                }
            } else {
                if (sMo48850k42 != 36) {
                    throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
                }
                c11543x6 = new C11537ks(interfaceC9933up.mo48784c5());
            }
            c5796m9.m23683x1(c11543x6);
            interfaceC9933up = interfaceC9933up.mo48851kk();
        }
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return FirebaseAnalytics.Param.CONTENT;
    }
}
