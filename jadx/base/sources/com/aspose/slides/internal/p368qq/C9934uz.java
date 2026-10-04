package com.aspose.slides.internal.p368qq;

import com.aspose.slides.internal.p096dy.AbstractC3504kk;
import com.aspose.slides.internal.p096dy.AbstractC3505to;
import com.aspose.slides.internal.p096dy.C3502du;
import com.aspose.slides.internal.p096dy.InterfaceC3506x1;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11533h4;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11538m9;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.uz */
/* JADX INFO: loaded from: classes4.dex */
class C9934uz {
    /* JADX INFO: renamed from: kk */
    private AbstractC3504kk m48873kk(InterfaceC12359fa interfaceC12359fa) {
        if (interfaceC12359fa.mo57925k4() == 1) {
            return AbstractC3505to.m14060k4(interfaceC12359fa.mo57926k4(0).mo57918ck());
        }
        if (interfaceC12359fa.mo57925k4() == 2) {
            return AbstractC3505to.m14061k4(interfaceC12359fa.mo57926k4(0).mo57918ck(), m48874to(interfaceC12359fa.mo57926k4(1)));
        }
        if (interfaceC12359fa.mo57925k4() != 4) {
            throw new C9930to(C14113y2.m67402k4("Token '{0}' is not valid.", interfaceC12359fa.mo57926k4(2).mo57918ck()));
        }
        C5796m9 c5796m9 = new C5796m9();
        c5796m9.m23683x1(m48874to(interfaceC12359fa.mo57926k4(1)));
        c5796m9.m23683x1(m48874to(interfaceC12359fa.mo57926k4(2)));
        c5796m9.m23683x1(m48874to(interfaceC12359fa.mo57926k4(3)));
        return AbstractC3505to.m14061k4(interfaceC12359fa.mo57926k4(0).mo57918ck(), c5796m9);
    }

    /* JADX INFO: renamed from: to */
    private AbstractC5788h4 m48874to(InterfaceC12359fa interfaceC12359fa) {
        int iMo57924jd = interfaceC12359fa.mo57924jd();
        InterfaceC9933up interfaceC9933upM48845kk = iMo57924jd != 44 ? iMo57924jd != 53 ? iMo57924jd != 61 ? (iMo57924jd == 67 || iMo57924jd == 69) ? AbstractC9922k4.m48845kk(null, interfaceC12359fa) : null : AbstractC9922k4.m48843k4((InterfaceC9933up) null, (short) 4, interfaceC12359fa.mo57918ck()) : AbstractC9922k4.m48839k4((InterfaceC9933up) null, interfaceC12359fa.mo57918ck()) : AbstractC9922k4.m48848x1((InterfaceC9933up) null, interfaceC12359fa.mo57918ck());
        if (interfaceC9933upM48845kk != null) {
            short sMo48850k4 = interfaceC9933upM48845kk.mo48850k4();
            if (sMo48850k4 == 4) {
                return new C11533h4(interfaceC9933upM48845kk);
            }
            if (sMo48850k4 == 35) {
                return C11537ks.m54523kk(interfaceC9933upM48845kk.mo48784c5());
            }
            if (sMo48850k4 == 36) {
                return C11537ks.m54524x1(interfaceC9933upM48845kk.mo48784c5());
            }
            switch (sMo48850k4) {
                case 13:
                    return new C11531dy(interfaceC9933upM48845kk.mo48834du(), (short) 1);
                case 14:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 1);
                case 15:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 3);
                case 16:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 4);
                case 17:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 5);
                case 18:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 8);
                case 19:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 6);
                case 20:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 7);
                case 21:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 9);
                case 22:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 10);
                case 23:
                    return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 2);
                default:
                    switch (sMo48850k4) {
                        case 28:
                            return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 11);
                        case 29:
                            return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 13);
                        case 30:
                            return new C11531dy(interfaceC9933upM48845kk.mo48788h4(), (short) 12);
                        default:
                            switch (sMo48850k4) {
                                case 44:
                                    return new C11538m9(interfaceC9933upM48845kk.mo48788h4(), "dpi");
                                case 45:
                                    return new C11538m9(interfaceC9933upM48845kk.mo48788h4(), "dpcm");
                                case 46:
                                    return new C11538m9(interfaceC9933upM48845kk.mo48788h4(), "dppx");
                            }
                    }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC3506x1 m48875k4(InterfaceC12359fa interfaceC12359fa) {
        if (interfaceC12359fa.mo57924jd() != 27 && interfaceC12359fa.mo57924jd() != 28) {
            throw new C9930to(C14113y2.m67402k4("Token type '{0}' is not valid.", Integer.valueOf(interfaceC12359fa.mo57924jd())));
        }
        return m48876x1(interfaceC12359fa);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC3504kk m48876x1(InterfaceC12359fa interfaceC12359fa) {
        int i = 0;
        AbstractC3504kk abstractC3504kkM48873kk = null;
        while (i < interfaceC12359fa.mo57925k4()) {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
            if (interfaceC12359faMo57926k4.mo57924jd() == 44) {
                abstractC3504kkM48873kk = abstractC3504kkM48873kk == null ? new C3502du(interfaceC12359faMo57926k4.mo57918ck()) : abstractC3504kkM48873kk.m14059k4(new C3502du(interfaceC12359faMo57926k4.mo57918ck()));
            } else if (interfaceC12359faMo57926k4.mo57924jd() == 55) {
                i++;
                InterfaceC12359fa interfaceC12359faMo57926k42 = interfaceC12359fa.mo57926k4(i);
                if (abstractC3504kkM48873kk == null) {
                    abstractC3504kkM48873kk = m48873kk(interfaceC12359faMo57926k42);
                    if (abstractC3504kkM48873kk == null) {
                        throw new C9930to(C14113y2.m67402k4("Invalid media query '{0}' is not valid.", interfaceC12359faMo57926k42.mo57930m9()));
                    }
                } else {
                    AbstractC3504kk abstractC3504kkM48873kk2 = m48873kk(interfaceC12359faMo57926k42);
                    if (abstractC3504kkM48873kk2 == null) {
                        throw new C9930to(C14113y2.m67402k4("Invalid media query '{0}' is not valid.", interfaceC12359faMo57926k42.mo57930m9()));
                    }
                    abstractC3504kkM48873kk = abstractC3504kkM48873kk.m14059k4(abstractC3504kkM48873kk2);
                }
            } else if (interfaceC12359faMo57926k4.mo57924jd() == 28) {
                abstractC3504kkM48873kk = abstractC3504kkM48873kk == null ? m48873kk(interfaceC12359faMo57926k4) : abstractC3504kkM48873kk.m14059k4(m48873kk(interfaceC12359faMo57926k4));
            } else {
                interfaceC12359faMo57926k4.mo57924jd();
            }
            i++;
        }
        return abstractC3504kkM48873kk;
    }
}
