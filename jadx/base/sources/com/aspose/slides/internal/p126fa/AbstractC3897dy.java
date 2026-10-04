package com.aspose.slides.internal.p126fa;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.C9930to;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11528c5;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11536kk;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p478wl.C12160qw;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.dy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3897dy extends AbstractC3900ix {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f10637to = new C7017h4("linear-gradient", "radial-gradient", "repeating-linear-gradient", "repeating-radial-gradient", "left", "top", "bottom", "right");

    /* JADX INFO: renamed from: k4 */
    private final x1 f10638k4;

    /* JADX INFO: renamed from: kk */
    private final k4 f10639kk;

    /* JADX INFO: renamed from: x1 */
    private final kk f10640x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.fa.dy$k4 */
    public static class k4 extends AbstractC3902k4 {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: k4 */
        public String mo15583k4() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: kk */
        public boolean mo15584kk() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: to */
        public AbstractC5788h4 mo15585to() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: x1 */
        public int mo15586x1() {
            throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.fa.dy$kk */
    public static class kk extends AbstractC3894c5 {
        private kk() {
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: k4 */
        public String mo15583k4() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: kk */
        public boolean mo15584kk() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: to */
        public AbstractC5788h4 mo15585to() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: x1 */
        public int mo15586x1() {
            throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.fa.dy$x1 */
    public static class x1 extends AbstractC3903kk {
        private x1() {
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: k4 */
        public String mo15583k4() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: kk */
        public boolean mo15584kk() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: to */
        public AbstractC5788h4 mo15585to() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
        /* JADX INFO: renamed from: x1 */
        public int mo15586x1() {
            throw new NotImplementedException();
        }
    }

    public AbstractC3897dy() {
        this.f10638k4 = new x1();
        this.f10640x1 = new kk();
        this.f10639kk = new k4();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5788h4 m15579k4(String str, InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        InterfaceC9933up interfaceC9933upMo48820dy = interfaceC9933up.mo48820dy();
        if (interfaceC9933upMo48820dy == null) {
            throw m15604kk(str);
        }
        List list = new List();
        C14093tq<Integer>[] c14093tqArr = {new C14093tq()};
        C11531dy[] c11531dyArr = {null};
        InterfaceC9933up interfaceC9933upM15581k4 = m15581k4(str, interfaceC9933upMo48820dy, c6344m9, c14093tqArr, c11531dyArr);
        C14093tq<Integer> c14093tq = c14093tqArr[0];
        C11531dy c11531dy = c11531dyArr[0];
        if (c14093tq.m67302x1()) {
            list.addItem(new C11537ks(C14042ak.m66410k4(C12160qw.class, c14093tq.m67297k4().intValue())));
            list.addItem(c11531dy);
            interfaceC9933upM15581k4 = interfaceC9933upM15581k4.mo48851kk();
        } else {
            list.addItem(new C11537ks(C14042ak.m66410k4(C12160qw.class, 4L)));
            list.addItem(new C11531dy(180.0f, (short) 11));
        }
        int i = 0;
        while (interfaceC9933upM15581k4 != null) {
            C11536kk[] c11536kkArr = {null};
            interfaceC9933upM15581k4 = m15580k4(str, interfaceC9933upM15581k4, c6344m9, c11536kkArr);
            C11536kk c11536kk = c11536kkArr[0];
            if (c11536kk != null) {
                list.addItem(c11536kk);
                i++;
            }
            if (interfaceC9933upM15581k4 != null) {
                interfaceC9933upM15581k4 = interfaceC9933upM15581k4.mo48851kk();
            }
        }
        if (i >= 2) {
            return new C11528c5(str, (AbstractC5788h4[]) list.toArray(new AbstractC5788h4[0]));
        }
        throw m15604kk(str);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3900ix
    /* JADX INFO: renamed from: x1 */
    public AbstractC5788h4 mo15582x1(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        String strM67361du = C14113y2.m67361du(interfaceC9933up.mo48821m9());
        String strOooO00o = OooO0OO.OooO00o(1, 0, strM67361du, strM67361du);
        if (f10637to.m27428k4(strOooO00o) == 0) {
            return m15579k4(strOooO00o, interfaceC9933up, c6344m9);
        }
        throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9933up m15580k4(String str, InterfaceC9933up interfaceC9933up, C6344m9 c6344m9, C11536kk[] c11536kkArr) {
        AbstractC5803to abstractC5803to = null;
        c11536kkArr[0] = null;
        try {
            AbstractC5803to abstractC5803to2 = (AbstractC5803to) this.f10638k4.mo15578k4(interfaceC9933up, c6344m9);
            interfaceC9933up = interfaceC9933up.mo48851kk();
            if (interfaceC9933up != null) {
                try {
                    AbstractC5803to abstractC5803to3 = (AbstractC5803to) this.f10640x1.mo15578k4(interfaceC9933up, c6344m9);
                    try {
                        interfaceC9933up = interfaceC9933up.mo48851kk();
                    } catch (C9930to unused) {
                    }
                    abstractC5803to = abstractC5803to3;
                } catch (C9930to unused2) {
                }
            }
            c11536kkArr[0] = C11536kk.m54522k4(abstractC5803to2, abstractC5803to);
        } catch (C9930to unused3) {
        }
        return interfaceC9933up;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9933up m15581k4(String str, InterfaceC9933up interfaceC9933up, C6344m9 c6344m9, C14093tq<Integer>[] c14093tqArr, C11531dy[] c11531dyArr) {
        c14093tqArr[0] = new C14093tq<>();
        c11531dyArr[0] = null;
        try {
            c11531dyArr[0] = (C11531dy) this.f10639kk.mo15578k4(interfaceC9933up, c6344m9);
            c14093tqArr[0] = new C14093tq<>(4);
            interfaceC9933up = interfaceC9933up.mo48851kk();
        } catch (C9930to unused) {
        }
        if (c11531dyArr[0] == null && interfaceC9933up.mo48850k4() == 47) {
            C14093tq c14093tq = new C14093tq();
            C14093tq c14093tq2 = new C14093tq();
            C14093tq c14093tq3 = new C14093tq();
            for (String str2 : C14113y2.m67416k4(interfaceC9933up.mo48784c5(), new char[]{ControlChar.SPACE_CHAR}, (short) 1)) {
                int iM27428k4 = f10637to.m27428k4(C14113y2.m67361du(str2));
                if (iM27428k4 == 4) {
                    c14093tq2 = new C14093tq(Boolean.TRUE);
                } else if (iM27428k4 == 5) {
                    c14093tq3 = new C14093tq(Boolean.TRUE);
                } else if (iM27428k4 == 6) {
                    c14093tq3 = new C14093tq(Boolean.FALSE);
                } else if (iM27428k4 == 7) {
                    c14093tq2 = new C14093tq(Boolean.FALSE);
                }
            }
            interfaceC9933up = interfaceC9933up.mo48851kk();
            if (c14093tq2.m67302x1() && c14093tq3.m67302x1()) {
                if (((Boolean) c14093tq2.m67297k4()).booleanValue() && ((Boolean) c14093tq3.m67297k4()).booleanValue()) {
                    c14093tqArr[0] = new C14093tq<>(0);
                } else if (!((Boolean) c14093tq2.m67297k4()).booleanValue() && ((Boolean) c14093tq3.m67297k4()).booleanValue()) {
                    c14093tqArr[0] = new C14093tq<>(1);
                } else if (((Boolean) c14093tq2.m67297k4()).booleanValue() && !((Boolean) c14093tq3.m67297k4()).booleanValue()) {
                    c14093tqArr[0] = new C14093tq<>(2);
                } else if (!((Boolean) c14093tq2.m67297k4()).booleanValue() && !((Boolean) c14093tq3.m67297k4()).booleanValue()) {
                    c14093tqArr[0] = new C14093tq<>(3);
                }
            } else if (c14093tq2.m67302x1()) {
                c14093tq = new C14093tq(Float.valueOf(((Boolean) c14093tq2.m67297k4()).booleanValue() ? 270.0f : 90.0f));
                c14093tqArr[0] = new C14093tq<>(4);
            } else if (c14093tq3.m67302x1()) {
                c14093tq = new C14093tq(Float.valueOf(((Boolean) c14093tq3.m67297k4()).booleanValue() ? 0.0f : 180.0f));
                c14093tqArr[0] = new C14093tq<>(4);
            }
            if (c14093tq.m67302x1()) {
                c11531dyArr[0] = new C11531dy(((Float) c14093tq.m67297k4()).floatValue(), (short) 11);
            }
        }
        return interfaceC9933up;
    }
}
