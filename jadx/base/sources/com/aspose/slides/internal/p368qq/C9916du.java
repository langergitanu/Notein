package com.aspose.slides.internal.p368qq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p028ar.C1561k4;
import com.aspose.slides.internal.p065ck.AbstractC2566ca;
import com.aspose.slides.internal.p065ck.C2557ai;
import com.aspose.slides.internal.p065ck.C2585lr;
import com.aspose.slides.internal.p065ck.C2601u4;
import com.aspose.slides.internal.p065ck.C2605v4;
import com.aspose.slides.internal.p065ck.InterfaceC2563bz;
import com.aspose.slides.internal.p065ck.InterfaceC2575g8;
import com.aspose.slides.internal.p065ck.InterfaceC2589qm;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p096dy.InterfaceC3506x1;
import com.aspose.slides.internal.p217k4.C5587jd;
import com.aspose.slides.internal.p217k4.C5588k4;
import com.aspose.slides.internal.p217k4.C5589kk;
import com.aspose.slides.internal.p217k4.InterfaceC5591lr;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5795lr;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p270m9.AbstractC6355x1;
import com.aspose.slides.internal.p270m9.C6337h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p270m9.C6345ne;
import com.aspose.slides.internal.p270m9.C6349u4;
import com.aspose.slides.internal.p270m9.C6351up;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p489x1.C12365to;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p526yj.C12845k4;
import com.aspose.slides.internal.p526yj.C12846kk;
import com.aspose.slides.internal.p526yj.C12847x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.internal.fido.FidoChallenge;
import java.io.ByteArrayInputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9916du implements InterfaceC9940yj {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f35788c5 = new C7017h4("first-child", "last-child", "only-child", "first-of-type", "last-of-type", "only-of-type", "root", "nth-child(", "nth-last-child(", "nth-of-type(", "nth-last-of-type(", "lang(", "not(", "enabled", "disabled", "checked", "indeterminate", "valid", "invalid", FidoChallenge.DEFAULT_USER_VERIFICATION_POLICY, "optional", "in-range", "out-of-range", "read-only", "read-write", "dir(", "empty", "link", "target", "selection", "hover", "focus", "first-line", "first-letter", "before", "after");

    /* JADX INFO: renamed from: du */
    private C2605v4 f35789du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC12777qq f35790dy;

    /* JADX INFO: renamed from: h4 */
    private C6351up f35791h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9924ks f35792k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC9929rv f35793kk;

    /* JADX INFO: renamed from: m9 */
    private C6344m9 f35794m9;

    /* JADX INFO: renamed from: to */
    private C2557ai f35795to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC9938x6 f35796x1;

    public C9916du(C6344m9 c6344m9) {
        this(c6344m9, null);
    }

    /* JADX INFO: renamed from: c5 */
    private void m48789c5(InterfaceC12359fa interfaceC12359fa) {
        boolean zM27456k4;
        InterfaceC9933up interfaceC9933upM48839k4;
        List list = new List();
        C9935v4 c9935v4 = new C9935v4(interfaceC12359fa, AbstractC9925lr.m48869k4(51, 36, 48));
        String strMo48784c5 = null;
        while (c9935v4.hasNext()) {
            int iMo57924jd = c9935v4.next().mo57924jd();
            if (iMo57924jd == 0) {
                m48800k4((Exception) C9919h4.m48825k4(interfaceC12359fa.mo57918ck()));
                return;
            } else if (iMo57924jd != 27) {
                if (iMo57924jd == 53) {
                    interfaceC9933upM48839k4 = AbstractC9922k4.m48839k4((InterfaceC9933up) null, c9935v4.next().mo57918ck());
                } else if (iMo57924jd == 54) {
                    interfaceC9933upM48839k4 = AbstractC9922k4.m48846to(null, c9935v4.next());
                }
                strMo48784c5 = interfaceC9933upM48839k4.mo48784c5();
            } else {
                list.addItem(new C9934uz().m48875k4(c9935v4.next()));
            }
        }
        C6345ne c6345ne = (C6345ne) ((C9937x1) this.f35792k4).m48878k4();
        if (c6345ne.mo23390x1().mo23418k4() != 0) {
            IGenericEnumerator<InterfaceC5797ne> it = c6345ne.mo23390x1().iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC5797ne next = it.next();
                    if (3 != next.mo23403k4() && 2 != next.mo23403k4()) {
                        m48800k4((Exception) C9919h4.m48825k4(C14113y2.m67402k4("Invalid @import position at line {0}.", Integer.valueOf(interfaceC12359fa.mo57921dy()))));
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        this.f35792k4.mo48861k4(strMo48784c5, list);
        C5801ss c5801ssMo14413k4 = this.f35794m9.m25997kk().m26025k4().mo14413k4(this.f35794m9, new C5811wp(strMo48784c5));
        if (c5801ssMo14413k4.m23692k4() != null && c5801ssMo14413k4.m23692k4().length != 0) {
            C3152yj c3152yj = new C3152yj(c5801ssMo14413k4.m23692k4());
            try {
                C6345ne c6345ne2 = (C6345ne) new C9916du(this.f35794m9).m48815k4(c3152yj);
                c6345ne2.m26021k4(strMo48784c5);
                this.f35792k4.mo48859k4(c6345ne2);
            } finally {
                c3152yj.dispose();
            }
        }
        this.f35792k4.mo48857h4();
    }

    /* JADX INFO: renamed from: ck */
    private void m48790ck(InterfaceC12359fa interfaceC12359fa) {
        C6765kp c6765kp = new C6765kp();
        if (interfaceC12359fa.mo57925k4() == 0) {
            c6765kp.m26792k4(interfaceC12359fa.mo57930m9());
        } else {
            for (int i = 0; i < interfaceC12359fa.mo57925k4(); i++) {
                c6765kp.m26792k4(interfaceC12359fa.mo57926k4(i).mo57930m9());
            }
        }
        this.f35792k4.mo48865kk(c6765kp.toString());
        this.f35792k4.mo48857h4();
    }

    /* JADX INFO: renamed from: du */
    private void m48791du(InterfaceC12359fa interfaceC12359fa) {
        if (interfaceC12359fa.mo57925k4() != 0) {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(0);
            if (interfaceC12359faMo57926k4.mo57924jd() != 44) {
                m48803kk(C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359fa.mo57924jd()]));
            }
            String strMo57930m9 = interfaceC12359faMo57926k4.mo57930m9();
            InterfaceC12359fa interfaceC12359faMo57926k42 = interfaceC12359fa.mo57926k4(1);
            if (interfaceC12359faMo57926k42.mo57924jd() != 19) {
                m48803kk(C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359fa.mo57924jd()]));
            }
            try {
                this.f35792k4.mo48860k4(strMo57930m9);
                this.f35796x1 = new C9917dy((C6337h4) ((C9937x1) this.f35792k4).m48880x1());
                m48810up(interfaceC12359faMo57926k42);
                this.f35792k4.mo48857h4();
            } finally {
                if (!C14067j2.m66729x1(this.f35796x1, this.f35792k4)) {
                    this.f35796x1 = this.f35792k4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m48792dy(InterfaceC12359fa interfaceC12359fa) {
        this.f35792k4.mo48868x1(C14113y2.m67443x1(interfaceC12359fa.mo57918ck(), 10, interfaceC12359fa.mo57918ck().length() - 12));
        this.f35792k4.mo48857h4();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX INFO: renamed from: fa */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m48793fa(InterfaceC12359fa interfaceC12359fa) {
        List list = new List();
        AbstractC2566ca abstractC2566caM48804ks = m48804ks(interfaceC12359fa.mo57926k4(0));
        InterfaceC12359fa interfaceC12359fa2 = null;
        boolean z = false;
        int i = 1;
        do {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
            int iMo57924jd = interfaceC12359faMo57926k4.mo57924jd();
            if (iMo57924jd != 0) {
                if (iMo57924jd == 11) {
                    list.addItem(abstractC2566caM48804ks);
                    abstractC2566caM48804ks = m48804ks(interfaceC12359faMo57926k4);
                } else if (iMo57924jd == 19) {
                    z = true;
                    interfaceC12359fa2 = interfaceC12359faMo57926k4;
                } else if (iMo57924jd != 25) {
                    switch (iMo57924jd) {
                        case 14:
                            i++;
                            abstractC2566caM48804ks = this.f35795to.m11880x1((InterfaceC2563bz) abstractC2566caM48804ks, (InterfaceC2563bz) m48804ks(interfaceC12359fa.mo57926k4(i)));
                            break;
                        case 15:
                            i++;
                            abstractC2566caM48804ks = this.f35795to.m11878kk(abstractC2566caM48804ks, m48804ks(interfaceC12359fa.mo57926k4(i)));
                            break;
                        case 16:
                            i++;
                            abstractC2566caM48804ks = this.f35795to.m11873k4(abstractC2566caM48804ks, m48804ks(interfaceC12359fa.mo57926k4(i)));
                            break;
                        case 17:
                            i++;
                            abstractC2566caM48804ks = this.f35795to.m11872k4((InterfaceC2563bz) abstractC2566caM48804ks, (InterfaceC2563bz) m48804ks(interfaceC12359fa.mo57926k4(i)));
                            break;
                    }
                }
                i++;
                if (i < interfaceC12359fa.mo57925k4()) {
                }
                this.f35792k4.mo48855du();
                list.addItem(abstractC2566caM48804ks);
                this.f35792k4.mo48863k4((InterfaceC2563bz[]) list.toArray(new InterfaceC2563bz[0]));
                if (interfaceC12359fa2 != null) {
                    m48810up(interfaceC12359fa2);
                }
                this.f35792k4.mo48857h4();
            }
            throw new C9936wl(interfaceC12359faMo57926k4.mo57918ck());
        } while (!z);
        this.f35792k4.mo48855du();
        list.addItem(abstractC2566caM48804ks);
        this.f35792k4.mo48863k4((InterfaceC2563bz[]) list.toArray(new InterfaceC2563bz[0]));
        if (interfaceC12359fa2 != null) {
        }
        this.f35792k4.mo48857h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m48794h4(InterfaceC12359fa interfaceC12359fa) {
        this.f35792k4.mo48866m9();
        if (interfaceC12359fa.mo57925k4() != 0) {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(0);
            if (interfaceC12359faMo57926k4.mo57924jd() != 19) {
                m48803kk(C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359fa.mo57924jd()]));
            }
            m48810up(interfaceC12359faMo57926k4);
        }
        this.f35792k4.mo48857h4();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX INFO: renamed from: jd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m48795jd(InterfaceC12359fa interfaceC12359fa) {
        this.f35792k4.mo48856dy();
        AbstractC2566ca abstractC2566caM48797k4 = null;
        int i = 0;
        while (i < interfaceC12359fa.mo57925k4()) {
            int i2 = i + 1;
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
            int iMo57924jd = interfaceC12359faMo57926k4.mo57924jd();
            if (iMo57924jd == 13) {
                abstractC2566caM48797k4 = m48797k4(interfaceC12359faMo57926k4, abstractC2566caM48797k4);
            } else if (iMo57924jd == 19) {
                m48810up(interfaceC12359faMo57926k4);
            } else if (iMo57924jd != 44) {
                m48803kk(C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359fa.mo57924jd()]));
            }
            i = i2;
        }
        if (abstractC2566caM48797k4 != null) {
            this.f35792k4.mo48863k4(new InterfaceC2563bz[]{abstractC2566caM48797k4});
        }
        this.f35792k4.mo48857h4();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC2566ca m48796k4(InterfaceC12359fa interfaceC12359fa, int i) {
        AbstractC2566ca abstractC2566caM48797k4 = m48797k4(interfaceC12359fa.mo57926k4(i), (AbstractC2566ca) null);
        for (int i2 = i + 1; i2 < interfaceC12359fa.mo57925k4(); i2++) {
            abstractC2566caM48797k4 = m48797k4(interfaceC12359fa.mo57926k4(i2), abstractC2566caM48797k4);
        }
        return abstractC2566caM48797k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m48802kk(InterfaceC12359fa interfaceC12359fa) {
        int iMo57924jd = interfaceC12359fa.mo57924jd();
        if (iMo57924jd != 0) {
            if (iMo57924jd == 10) {
                m48793fa(interfaceC12359fa);
                return;
            }
            if (iMo57924jd == 30) {
                m48791du(interfaceC12359fa);
                return;
            }
            if (iMo57924jd == 32) {
                m48805m9(interfaceC12359fa);
                return;
            }
            if (iMo57924jd == 39) {
                m48792dy(interfaceC12359fa);
                return;
            }
            if (iMo57924jd == 43) {
                m48794h4(interfaceC12359fa);
                return;
            }
            if (iMo57924jd == 49) {
                m48795jd(interfaceC12359fa);
                return;
            }
            if (iMo57924jd == 52) {
                m48789c5(interfaceC12359fa);
                return;
            }
            if (iMo57924jd != 24 && iMo57924jd != 25) {
                if (iMo57924jd == 45) {
                    m48808to(interfaceC12359fa);
                    return;
                } else {
                    if (iMo57924jd != 46) {
                        return;
                    }
                    m48790ck(interfaceC12359fa);
                    return;
                }
            }
        }
        m48803kk(interfaceC12359fa.mo57918ck());
    }

    /* JADX INFO: renamed from: ks */
    private AbstractC2566ca m48804ks(InterfaceC12359fa interfaceC12359fa) {
        if (interfaceC12359fa.mo57924jd() == 0) {
            throw new C9931u4(interfaceC12359fa.mo57918ck());
        }
        AbstractC2566ca abstractC2566caM48797k4 = m48797k4(interfaceC12359fa.mo57926k4(0), (AbstractC2566ca) null);
        if (interfaceC12359fa.mo57925k4() == 1) {
            return abstractC2566caM48797k4;
        }
        for (int i = 1; i < interfaceC12359fa.mo57925k4(); i++) {
            abstractC2566caM48797k4 = m48797k4(interfaceC12359fa.mo57926k4(i), abstractC2566caM48797k4);
        }
        return abstractC2566caM48797k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017 A[PHI: r0 r6
      0x0017: PHI (r0v5 java.lang.String) = (r0v2 java.lang.String), (r0v6 java.lang.String) binds: [B:10:0x0039, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r6v7 com.aspose.slides.internal.x1.fa) = (r6v1 com.aspose.slides.internal.x1.fa), (r6v9 com.aspose.slides.internal.x1.fa) binds: [B:10:0x0039, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[PHI: r0 r6
      0x0020: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v6 java.lang.String) binds: [B:10:0x0039, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0020: PHI (r6v2 com.aspose.slides.internal.x1.fa) = (r6v1 com.aspose.slides.internal.x1.fa), (r6v9 com.aspose.slides.internal.x1.fa) binds: [B:10:0x0039, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m48805m9(InterfaceC12359fa interfaceC12359fa) {
        String strMo57918ck;
        InterfaceC12359fa interfaceC12359faMo57926k4;
        InterfaceC9933up interfaceC9933upM48846to;
        if (interfaceC12359fa.mo57925k4() == 1) {
            strMo57918ck = C14113y2.f47374k4;
            interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(0);
            interfaceC9933upM48846to = interfaceC12359faMo57926k4.mo57924jd() == 54 ? AbstractC9922k4.m48846to(null, interfaceC12359faMo57926k4) : AbstractC9922k4.m48839k4((InterfaceC9933up) null, interfaceC12359faMo57926k4.mo57918ck());
        } else {
            strMo57918ck = interfaceC12359fa.mo57926k4(0).mo57918ck();
            interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(1);
            if (interfaceC12359faMo57926k4.mo57924jd() == 54) {
            }
        }
        this.f35792k4.mo48862k4(strMo57918ck, interfaceC9933upM48846to.mo48784c5());
    }

    /* JADX INFO: renamed from: ne */
    private boolean m48806ne(InterfaceC12359fa interfaceC12359fa) {
        if (interfaceC12359fa.mo57924jd() != 90) {
            return false;
        }
        m48809to(interfaceC12359fa.mo57918ck());
        return true;
    }

    /* JADX INFO: renamed from: rv */
    private InterfaceC2589qm m48807rv(InterfaceC12359fa interfaceC12359fa) {
        String strMo57918ck;
        int i = 0;
        if (interfaceC12359fa.mo57926k4(0).mo57924jd() == 31) {
            strMo57918ck = interfaceC12359fa.mo57926k4(0).mo57925k4() == 0 ? C14113y2.f47374k4 : interfaceC12359fa.mo57926k4(0).mo57926k4(0).mo57918ck();
            i = 1;
        } else {
            strMo57918ck = null;
        }
        String strMo57918ck2 = interfaceC12359fa.mo57926k4(i).mo57918ck();
        if (i == interfaceC12359fa.mo57925k4() - 1) {
            return this.f35789du.m11930kk(strMo57918ck, strMo57918ck2);
        }
        if (i != interfaceC12359fa.mo57925k4() - 3) {
            throw new C9936wl(interfaceC12359fa.mo57930m9());
        }
        String strMo48784c5 = AbstractC9922k4.m48839k4((InterfaceC9933up) null, interfaceC12359fa.mo57926k4(i + 2).mo57918ck()).mo48784c5();
        int i2 = i + 1;
        int iMo57924jd = interfaceC12359fa.mo57926k4(i2).mo57924jd();
        if (iMo57924jd == 72) {
            return this.f35789du.m11945x1(strMo57918ck, strMo57918ck2, strMo48784c5);
        }
        if (iMo57924jd == 78) {
            return this.f35789du.m11925k4(strMo57918ck, strMo57918ck2, strMo48784c5);
        }
        if (iMo57924jd == 81) {
            return this.f35789du.m11931kk(strMo57918ck, strMo57918ck2, strMo48784c5);
        }
        switch (iMo57924jd) {
            case 85:
                return this.f35789du.m11938to(strMo57918ck, strMo57918ck2, strMo48784c5);
            case 86:
                return this.f35789du.m11920h4(strMo57918ck, strMo57918ck2, strMo48784c5);
            case 87:
                return this.f35789du.m11916du(strMo57918ck, strMo57918ck2, strMo48784c5);
            default:
                throw C9919h4.m48832x1(interfaceC12359fa.mo57926k4(i2));
        }
    }

    /* JADX INFO: renamed from: to */
    private void m48808to(InterfaceC12359fa interfaceC12359fa) {
        try {
            List list = new List();
            int i = 0;
            while (i < interfaceC12359fa.mo57925k4()) {
                InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
                if (interfaceC12359faMo57926k4.mo57924jd() == 27) {
                    InterfaceC3506x1 interfaceC3506x1M48875k4 = new C9934uz().m48875k4(interfaceC12359faMo57926k4);
                    if (interfaceC3506x1M48875k4 != null) {
                        list.addItem(interfaceC3506x1M48875k4);
                    }
                } else if (interfaceC12359faMo57926k4.mo57924jd() == 10) {
                    break;
                }
                i++;
            }
            this.f35792k4.mo48858k4(list);
            while (i < interfaceC12359fa.mo57925k4()) {
                InterfaceC12359fa interfaceC12359faMo57926k42 = interfaceC12359fa.mo57926k4(i);
                if (interfaceC12359faMo57926k42.mo57924jd() == 10) {
                    m48802kk(interfaceC12359faMo57926k42);
                }
                i++;
            }
            this.f35792k4.mo48857h4();
        } catch (C9930to e) {
            m48800k4((Exception) e);
        }
    }

    /* JADX INFO: renamed from: up */
    private void m48810up(InterfaceC12359fa interfaceC12359fa) {
        int iMo57925k4 = interfaceC12359fa.mo57925k4();
        for (int i = 0; i < iMo57925k4; i++) {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
            if (interfaceC12359faMo57926k4.mo57924jd() == 0) {
                m48803kk(C14113y2.m67402k4("Unexpected token type '{0}'.", interfaceC12359faMo57926k4.mo57918ck()));
                return;
            }
            if (interfaceC12359faMo57926k4.mo57924jd() != 20) {
                m48803kk(C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359faMo57926k4.mo57924jd()]));
            } else {
                m48814yj(interfaceC12359faMo57926k4);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5810wl m48811x1(InterfaceC12359fa interfaceC12359fa) {
        InterfaceC9938x6 interfaceC9938x6 = this.f35796x1;
        try {
            C9923kk c9923kk = new C9923kk(this.f35794m9, this.f35790dy);
            this.f35796x1 = c9923kk;
            int i = 0;
            while (i < interfaceC12359fa.mo57925k4()) {
                int i2 = i + 1;
                InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
                if (19 == interfaceC12359faMo57926k4.mo57924jd()) {
                    m48810up(interfaceC12359faMo57926k4);
                }
                i = i2;
            }
            AbstractC6355x1 abstractC6355x1M48854k4 = c9923kk.m48854k4();
            if (!C14067j2.m66729x1(this.f35796x1, interfaceC9938x6)) {
                this.f35796x1 = interfaceC9938x6;
            }
            return abstractC6355x1M48854k4;
        } catch (Throwable th) {
            if (!C14067j2.m66729x1(this.f35796x1, interfaceC9938x6)) {
                this.f35796x1 = interfaceC9938x6;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x6 */
    private static C1561k4 m48813x6(InterfaceC12359fa interfaceC12359fa) {
        String string;
        if (interfaceC12359fa.mo57925k4() == 2) {
            string = interfaceC12359fa.mo57926k4(1).mo57918ck();
        } else {
            C6765kp c6765kp = new C6765kp();
            for (int i = 1; i < interfaceC12359fa.mo57925k4(); i++) {
                c6765kp.m26791k4(interfaceC12359fa.mo57926k4(i));
            }
            string = c6765kp.toString();
        }
        return C1561k4.m8348k4(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: yj */
    private void m48814yj(InterfaceC12359fa interfaceC12359fa) {
        int i;
        String strM67402k4;
        if (interfaceC12359fa.mo57925k4() <= 1) {
            strM67402k4 = "Invalid property declaration.";
        } else {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(0);
            if (interfaceC12359faMo57926k4.mo57924jd() == 59) {
                return;
            }
            if (interfaceC12359faMo57926k4.mo57924jd() != 22) {
                i = 0;
            } else if ("important".equals(interfaceC12359faMo57926k4.mo57926k4(0).mo57918ck())) {
                interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(1);
                i = 1;
            } else {
                strM67402k4 = C14113y2.m67402k4("Undefined rule !'{0}'", interfaceC12359faMo57926k4.mo57926k4(0).mo57918ck());
            }
            boolean z = i;
            if (interfaceC12359faMo57926k4.mo57924jd() == 44) {
                String strM59729c5 = ((C12845k4) ((C12365to) interfaceC12359faMo57926k4).m57939fa()).m59729c5();
                InterfaceC12359fa interfaceC12359faMo57926k42 = interfaceC12359fa.mo57926k4(i + 1);
                if (interfaceC12359faMo57926k42.mo57924jd() == 21) {
                    InterfaceC9933up interfaceC9933upMo48853x1 = null;
                    for (int i2 = 0; i2 < interfaceC12359faMo57926k42.mo57925k4(); i2++) {
                        try {
                            interfaceC9933upMo48853x1 = m48799k4(interfaceC12359faMo57926k42.mo57926k4(i2), interfaceC9933upMo48853x1);
                        } catch (C9936wl e) {
                            throw e;
                        } catch (C9930to e2) {
                            m48800k4((Exception) e2);
                            return;
                        }
                    }
                    if (interfaceC9933upMo48853x1 != null && interfaceC9933upMo48853x1.mo48852to() != null) {
                        interfaceC9933upMo48853x1 = interfaceC9933upMo48853x1.mo48853x1();
                    }
                    this.f35796x1.mo48819k4(strM59729c5, interfaceC9933upMo48853x1, z);
                    return;
                }
                strM67402k4 = C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359fa.mo57924jd()]);
            } else {
                strM67402k4 = C14113y2.m67402k4("Unexpected token type '{0}'.", C12846kk.f42906kk[interfaceC12359faMo57926k4.mo57924jd()]);
            }
        }
        m48803kk(strM67402k4);
    }

    public C9916du(C6344m9 c6344m9, InterfaceC12777qq interfaceC12777qq) {
        this.f35795to = C2557ai.m11871k4();
        this.f35789du = C2605v4.m11913k4();
        this.f35791h4 = C6351up.m26032k4();
        this.f35793kk = c6344m9.m26004to();
        this.f35794m9 = c6344m9;
        this.f35790dy = interfaceC12777qq;
        C9937x1 c9937x1 = new C9937x1(this, c6344m9, interfaceC12777qq);
        this.f35792k4 = c9937x1;
        this.f35796x1 = c9937x1;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC2566ca m48797k4(InterfaceC12359fa interfaceC12359fa, AbstractC2566ca abstractC2566ca) {
        String str;
        AbstractC2566ca abstractC2566caM11874k4;
        InterfaceC2589qm interfaceC2589qmM11946x1;
        int iMo57924jd = interfaceC12359fa.mo57924jd();
        int i = 1;
        AbstractC2566ca abstractC2566ca2 = null;
        if (iMo57924jd != 12) {
            if (iMo57924jd == 13) {
                if (interfaceC12359fa.mo57925k4() == 0) {
                    int iMo57919du = interfaceC12359fa.mo57919du() + 1;
                    InterfaceC12359fa interfaceC12359faMo57922h4 = interfaceC12359fa.mo57922h4();
                    while (iMo57919du < interfaceC12359faMo57922h4.mo57925k4()) {
                        InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359faMo57922h4.mo57926k4(iMo57919du);
                        interfaceC12359faMo57922h4.mo57933x1(iMo57919du);
                        interfaceC12359fa.mo57927k4(interfaceC12359faMo57926k4);
                    }
                }
                int i2 = interfaceC12359fa.mo57926k4(0).mo57924jd() == 59 ? 1 : 0;
                String strMo57918ck = interfaceC12359fa.mo57926k4(i2).mo57918ck();
                int i3 = i2 + 1;
                int iMo57929ks = interfaceC12359fa.mo57929ks() - interfaceC12359fa.mo57935yj();
                if (iMo57929ks > 2 || iMo57929ks <= 0) {
                    iMo57929ks = 1;
                }
                if (iMo57929ks == 1) {
                    switch (f35788c5.m27428k4(C14113y2.m67361du(strMo57918ck))) {
                        case 0:
                            interfaceC2589qmM11946x1 = this.f35789du.m11946x1();
                            break;
                        case 1:
                            interfaceC2589qmM11946x1 = this.f35789du.m11932kk();
                            break;
                        case 2:
                            interfaceC2589qmM11946x1 = this.f35789du.m11939to();
                            break;
                        case 3:
                            interfaceC2589qmM11946x1 = this.f35789du.m11917du();
                            break;
                        case 4:
                            interfaceC2589qmM11946x1 = this.f35789du.m11921h4();
                            break;
                        case 5:
                            interfaceC2589qmM11946x1 = this.f35789du.m11935m9();
                            break;
                        case 6:
                            interfaceC2589qmM11946x1 = this.f35789du.m11918dy();
                            break;
                        case 7:
                            interfaceC2589qmM11946x1 = this.f35789du.m11927k4(m48813x6(interfaceC12359fa));
                            break;
                        case 8:
                            interfaceC2589qmM11946x1 = this.f35789du.m11947x1(m48813x6(interfaceC12359fa));
                            break;
                        case 9:
                            interfaceC2589qmM11946x1 = this.f35789du.m11933kk(m48813x6(interfaceC12359fa));
                            break;
                        case 10:
                            interfaceC2589qmM11946x1 = this.f35789du.m11940to(m48813x6(interfaceC12359fa));
                            break;
                        case 11:
                            List list = new List();
                            while (i < interfaceC12359fa.mo57925k4()) {
                                int i4 = i + 1;
                                InterfaceC12359fa interfaceC12359faMo57926k42 = interfaceC12359fa.mo57926k4(i);
                                if (interfaceC12359faMo57926k42.mo57924jd() != 51) {
                                    list.addItem(interfaceC12359faMo57926k42.mo57918ck());
                                }
                                i = i4;
                            }
                            interfaceC2589qmM11946x1 = this.f35789du.m11926k4(list);
                            break;
                        case 12:
                            AbstractC2566ca abstractC2566caM48796k4 = m48796k4(interfaceC12359fa, i3);
                            InterfaceC2575g8 interfaceC2575g8M11928k4 = this.f35789du.m11928k4(abstractC2566caM48796k4);
                            if (abstractC2566caM48796k4.mo11886kk() == 9) {
                                throw new C9931u4(interfaceC2575g8M11928k4.mo11890du());
                            }
                            if (abstractC2566caM48796k4.mo11886kk() == 0 && C7019kk.m27469x1(((C2585lr) abstractC2566caM48796k4).m11908x1(), C2601u4.class)) {
                                throw new C9931u4(interfaceC2575g8M11928k4.mo11890du());
                            }
                            interfaceC2589qmM11946x1 = interfaceC2575g8M11928k4;
                            break;
                            break;
                        case 13:
                            interfaceC2589qmM11946x1 = this.f35789du.m11914c5();
                            break;
                        case 14:
                            interfaceC2589qmM11946x1 = this.f35789du.m11923jd();
                            break;
                        case 15:
                            interfaceC2589qmM11946x1 = this.f35789du.m11915ck();
                            break;
                        case 16:
                            interfaceC2589qmM11946x1 = this.f35789du.m11942up();
                            break;
                        case 17:
                            interfaceC2589qmM11946x1 = this.f35789du.m11949yj();
                            break;
                        case 18:
                            interfaceC2589qmM11946x1 = this.f35789du.m11934ks();
                            break;
                        case 19:
                            interfaceC2589qmM11946x1 = this.f35789du.m11937rv();
                            break;
                        case 20:
                            interfaceC2589qmM11946x1 = this.f35789du.m11948x6();
                            break;
                        case 21:
                            interfaceC2589qmM11946x1 = this.f35789du.m11936ne();
                            break;
                        case 22:
                            interfaceC2589qmM11946x1 = this.f35789du.m11922ix();
                            break;
                        case 23:
                            interfaceC2589qmM11946x1 = this.f35789du.m11941u4();
                            break;
                        case 24:
                            interfaceC2589qmM11946x1 = this.f35789du.m11943uz();
                            break;
                        case 25:
                            interfaceC2589qmM11946x1 = this.f35789du.m11929k4(interfaceC12359fa.mo57926k4(i3).mo57918ck());
                            break;
                        case 26:
                            interfaceC2589qmM11946x1 = this.f35789du.m11919fa();
                            break;
                        case 27:
                            abstractC2566caM11874k4 = this.f35795to.m11877kk();
                            break;
                    }
                } else if (iMo57929ks == 2) {
                    int iM27428k4 = f35788c5.m27428k4(C14113y2.m67361du(strMo57918ck));
                    if (iM27428k4 == 11) {
                        throw new C9931u4(strMo57918ck);
                    }
                    switch (iM27428k4) {
                    }
                }
                abstractC2566caM11874k4 = this.f35795to.m11882x1((String) null, strMo57918ck);
            } else if (iMo57924jd == 18) {
                interfaceC2589qmM11946x1 = m48807rv(interfaceC12359fa);
            } else if (iMo57924jd != 44) {
                interfaceC2589qmM11946x1 = iMo57924jd != 66 ? iMo57924jd != 70 ? null : this.f35789du.m11944x1(null, C12845k4.m59724k4(interfaceC12359fa)) : this.f35789du.m11924k4(null, C12845k4.m59727x1(interfaceC12359fa));
            } else {
                abstractC2566caM11874k4 = this.f35795to.m11875k4((String) null, C12845k4.m59726kk(interfaceC12359fa));
            }
            if (abstractC2566ca2 == null) {
                return abstractC2566ca == null ? abstractC2566ca2 : this.f35795to.m11881x1(abstractC2566ca, abstractC2566ca2);
            }
            if (interfaceC2589qmM11946x1 == null) {
                return abstractC2566ca;
            }
            if (abstractC2566ca == null) {
                abstractC2566ca = this.f35795to.m11879x1();
            }
            return this.f35795to.m11876k4(abstractC2566ca, interfaceC2589qmM11946x1);
        }
        InterfaceC12359fa interfaceC12359faMo57926k43 = interfaceC12359fa.mo57926k4(0);
        if (interfaceC12359faMo57926k43.mo57924jd() == 31) {
            String strM59726kk = interfaceC12359faMo57926k43.mo57925k4() == 0 ? C14113y2.f47374k4 : C12845k4.m59726kk(interfaceC12359faMo57926k43.mo57926k4(0));
            interfaceC12359faMo57926k43 = interfaceC12359fa.mo57926k4(1);
            str = strM59726kk;
        } else {
            str = null;
        }
        abstractC2566caM11874k4 = interfaceC12359faMo57926k43.mo57924jd() == 80 ? this.f35795to.m11874k4(str) : this.f35795to.m11875k4(str, C12845k4.m59726kk(interfaceC12359faMo57926k43));
        abstractC2566ca2 = abstractC2566caM11874k4;
        interfaceC2589qmM11946x1 = null;
        if (abstractC2566ca2 == null) {
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m48803kk(String str) {
        this.f35793kk.mo48786k4(new C9930to(str));
    }

    /* JADX INFO: renamed from: to */
    private void m48809to(String str) {
        this.f35793kk.mo48786k4(new C9930to(C14113y2.m67402k4("The character '{0}' is not valid in the current state.", str)));
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5810wl m48818x1(String str) {
        try {
            return m48811x1(new C12846kk(new C5587jd(new C12847x1(new C5589kk(str)))).m59751dy());
        } catch (Throwable th) {
            m48801k4(th);
            return new C6349u4(this.f35794m9);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC9933up m48812x1(InterfaceC12359fa interfaceC12359fa, InterfaceC9933up interfaceC9933up) {
        short s;
        String strMo57918ck = interfaceC12359fa.mo57918ck();
        InterfaceC9933up interfaceC9933upMo48853x1 = null;
        if (interfaceC12359fa.mo57925k4() != 0) {
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(0);
            if (interfaceC12359faMo57926k4.mo57924jd() != 21) {
                throw C9919h4.m48823k4(interfaceC12359faMo57926k4.mo57924jd(), interfaceC12359faMo57926k4.mo57918ck());
            }
            InterfaceC9933up interfaceC9933upM48799k4 = null;
            for (int i = 0; i < interfaceC12359faMo57926k4.mo57925k4(); i++) {
                interfaceC9933upM48799k4 = m48799k4(interfaceC12359faMo57926k4.mo57926k4(i), interfaceC9933upM48799k4);
            }
            if (interfaceC9933upM48799k4 != null) {
                interfaceC9933upMo48853x1 = interfaceC9933upM48799k4.mo48853x1();
            }
        }
        char cCharAt = strMo57918ck.charAt(0);
        if (cCharAt == 'R' || cCharAt == 'r') {
            char cCharAt2 = strMo57918ck.charAt(1);
            if (cCharAt2 != 'E') {
                if (cCharAt2 != 'G') {
                    if (cCharAt2 != 'e') {
                        if (cCharAt2 == 'g') {
                        }
                    }
                }
                if (C14113y2.m67432to(strMo57918ck, "rgb(", (short) 3)) {
                    s = 27;
                    return AbstractC9922k4.m48842k4(interfaceC9933up, s, interfaceC9933upMo48853x1);
                }
            }
            if (C14113y2.m67432to(strMo57918ck, "rect(", (short) 3)) {
                s = 38;
                return AbstractC9922k4.m48842k4(interfaceC9933up, s, interfaceC9933upMo48853x1);
            }
        }
        return AbstractC9922k4.m48840k4(interfaceC9933up, strMo57918ck, interfaceC9933upMo48853x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5775ar m48815k4(AbstractC3150x6 abstractC3150x6) {
        try {
            C3148wl c3148wl = new C3148wl(abstractC3150x6, AbstractC6747ar.m26635ix());
            String strMo13427dy = c3148wl.mo13427dy();
            c3148wl.mo13059to();
            return m48798k4(new C12846kk(new C5587jd(new C12847x1(new C5588k4(new ByteArrayInputStream(strMo13427dy.getBytes("UTF-8")))))).m59763m9());
        } catch (Throwable th) {
            m48801k4(th);
            C6345ne c6345ne = (C6345ne) ((InterfaceC5795lr) this.f35790dy.mo22660v4().mo22779h4()).mo22727k4(C14113y2.f47374k4, "all");
            c6345ne.m26020k4(this.f35794m9, this.f35790dy);
            return c6345ne;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC5775ar m48798k4(InterfaceC12359fa interfaceC12359fa) {
        this.f35792k4.mo48864kk();
        if (!m48806ne(interfaceC12359fa)) {
            int iMo57925k4 = interfaceC12359fa.mo57925k4();
            for (int i = 0; i < iMo57925k4; i++) {
                try {
                    m48802kk(interfaceC12359fa.mo57926k4(i));
                } catch (C9931u4 | C9936wl e) {
                    m48800k4(e);
                }
            }
        }
        this.f35792k4.mo48867to();
        return ((C9937x1) this.f35792k4).m48878k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5775ar m48816k4(String str) {
        try {
            return m48798k4(new C12846kk(new C5587jd(new C12847x1(new C5589kk(str)))).m59763m9());
        } catch (Throwable th) {
            m48801k4(th);
            C6345ne c6345ne = (C6345ne) ((InterfaceC5795lr) this.f35790dy.mo22660v4().mo22779h4()).mo22727k4(C14113y2.f47374k4, "all");
            c6345ne.m26020k4(this.f35794m9, this.f35790dy);
            return c6345ne;
        }
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9940yj
    /* JADX INFO: renamed from: k4 */
    public final C6351up mo48817k4() {
        return this.f35791h4;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9933up m48799k4(InterfaceC12359fa interfaceC12359fa, InterfaceC9933up interfaceC9933up) {
        InterfaceC5591lr interfaceC5591lrM57939fa = ((C12365to) interfaceC12359fa).m57939fa();
        if (interfaceC5591lrM57939fa == null) {
            throw C9919h4.m48823k4(interfaceC12359fa.mo57924jd(), interfaceC12359fa.mo57918ck());
        }
        C12845k4 c12845k4 = (C12845k4) C7019kk.m27452k4((Object) interfaceC5591lrM57939fa, C12845k4.class);
        String strM59729c5 = c12845k4 != null ? c12845k4.m59729c5() : interfaceC5591lrM57939fa.mo22924x1();
        int iMo57924jd = interfaceC12359fa.mo57924jd();
        if (iMo57924jd == 44) {
            return (interfaceC12359fa.mo57918ck().length() == 7 && "inherit".equals(strM59729c5)) ? AbstractC9922k4.m48843k4(interfaceC9933up, (short) 12, "inherit") : AbstractC9922k4.m48848x1(interfaceC9933up, strM59729c5);
        }
        if (iMo57924jd == 51) {
            return AbstractC9922k4.m48843k4(interfaceC9933up, (short) 0, ",");
        }
        if (iMo57924jd == 61) {
            return AbstractC9922k4.m48843k4(interfaceC9933up, (short) 4, strM59729c5);
        }
        if (iMo57924jd == 76) {
            return AbstractC9922k4.m48838k4(interfaceC9933up, interfaceC12359fa);
        }
        if (iMo57924jd == 79) {
            return AbstractC9922k4.m48843k4(interfaceC9933up, (short) 1, strM59729c5);
        }
        if (iMo57924jd == 53) {
            return AbstractC9922k4.m48839k4(interfaceC9933up, strM59729c5);
        }
        if (iMo57924jd == 54) {
            return AbstractC9922k4.m48846to(interfaceC9933up, interfaceC12359fa);
        }
        if (iMo57924jd == 64) {
            return AbstractC9922k4.m48843k4(interfaceC9933up, (short) 2, strM59729c5);
        }
        if (iMo57924jd == 65) {
            return m48812x1(interfaceC12359fa, interfaceC9933up);
        }
        switch (iMo57924jd) {
            case 67:
            case 68:
            case 69:
                return AbstractC9922k4.m48845kk(interfaceC9933up, interfaceC12359fa);
            case 70:
                return AbstractC9922k4.m48847x1(interfaceC9933up, interfaceC12359fa);
            default:
                if (interfaceC12359fa.mo57924jd() == 0) {
                    throw new C9936wl(interfaceC12359fa.mo57918ck());
                }
                throw C9919h4.m48823k4(interfaceC12359fa.mo57924jd(), interfaceC12359fa.mo57918ck());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48800k4(Exception exception) {
        this.f35793kk.mo48786k4(new C9930to(exception.getMessage()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m48801k4(Throwable th) {
        this.f35793kk.mo48787x1(new C9930to(th.getMessage(), th));
    }
}
