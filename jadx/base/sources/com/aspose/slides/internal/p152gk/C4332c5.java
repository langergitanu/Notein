package com.aspose.slides.internal.p152gk;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p149gf.C4256k4;
import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.AbstractC4841k4;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4838j5;
import com.aspose.slides.internal.p181ig.C4839jd;
import com.aspose.slides.internal.p181ig.C4861to;
import com.aspose.slides.internal.p181ig.C4880y9;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.internal.p493x5.AbstractC12411j5;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4332c5 extends AbstractC4331ar {
    /* JADX WARN: Removed duplicated region for block: B:396:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        AbstractC4331ar abstractC4331ar;
        C4839jd c4839jd;
        if (abstractC4830gf.m19946h4() == 5) {
            if (c4833h4.m20054v4().size() != 0) {
                c4833h4.m20037lr().mo17426k4(abstractC4830gf, c4833h4);
            } else {
                c4833h4.m20069xk();
            }
            return false;
        }
        int iM19946h4 = abstractC4830gf.m19946h4();
        if (iM19946h4 == 0) {
            C4880y9 c4880y9M19953yj = abstractC4830gf.m19953yj();
            String strM20090k4 = c4880y9M19953yj.m20090k4();
            if (C14113y2.m67363du(strM20090k4, "html")) {
                c4833h4.m20062x1(this);
                if (c4833h4.m20058x1().m20079k4(C5540dy.x1.f15215c5)) {
                    return false;
                }
                C5543ix c5543ixM20082to = c4833h4.m20058x1().m20082to();
                for (AbstractC4841k4.k4 k4Var : c4880y9M19953yj.m20098kk()) {
                    if (!c5543ixM20082to.mo22698c5(k4Var.m20103k4())) {
                        c5543ixM20082to.mo22708k4(k4Var.m20103k4(), k4Var.m20107x1());
                    }
                }
            } else {
                if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11574to)) {
                    return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
                }
                if (C14113y2.m67363du(strM20090k4, "body")) {
                    c4833h4.m20062x1(this);
                    C4838j5 c4838j5M20058x1 = c4833h4.m20058x1();
                    if (c4838j5M20058x1.m20080kk() == 1 || ((c4838j5M20058x1.m20080kk() > 2 && !C14113y2.m67363du(c4838j5M20058x1.m20076k4(1).m22719to().m22852x1(), "body")) || c4833h4.m20058x1().m20079k4(C5540dy.x1.f15215c5))) {
                        return false;
                    }
                    c4833h4.m20024k4(false);
                    C5543ix c5543ixM20076k4 = c4838j5M20058x1.m20076k4(1);
                    for (AbstractC4841k4.k4 k4Var2 : c4880y9M19953yj.m20098kk()) {
                        if (!c5543ixM20076k4.mo22698c5(k4Var2.m20103k4())) {
                            c5543ixM20076k4.mo22708k4(k4Var2.m20103k4(), k4Var2.m20107x1());
                        }
                    }
                } else {
                    if (C14113y2.m67363du(strM20090k4, "frameset")) {
                        c4833h4.m20062x1(this);
                        C4838j5 c4838j5M20058x12 = c4833h4.m20058x1();
                        if (c4838j5M20058x12.m20080kk() == 1 || ((c4838j5M20058x12.m20080kk() > 2 && !C5540dy.x1.f15217du.m22849k4(c4838j5M20058x12.m20076k4(1))) || !c4833h4.m20010jd())) {
                            return false;
                        }
                        C5543ix c5543ixM20076k42 = c4838j5M20058x12.m20076k4(1);
                        if (c5543ixM20076k42.mo22646kp() != null) {
                            c5543ixM20076k42.mo22646kp().mo22665x1(c5543ixM20076k42);
                        }
                        while (c4838j5M20058x12.m20080kk() > 1) {
                            c4838j5M20058x12.m20075k4();
                        }
                        c4833h4.m20059x1(c4880y9M19953yj);
                        abstractC4331ar = AbstractC4331ar.f11846u4;
                    } else if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11563h4)) {
                        if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                            c4839jd = new C4839jd(ContextChain.TAG_PRODUCT);
                            c4833h4.m20025k4(c4839jd);
                        }
                        c4833h4.m20059x1(c4880y9M19953yj);
                    } else {
                        String[] strArr = C4256k4.k4.f11570m9;
                        if (C11283h4.m54243x1(strM20090k4, strArr)) {
                            if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                c4833h4.m20041ne();
                            }
                            if (C11283h4.m54243x1(c4833h4.m20045to().m22719to().m22852x1(), strArr)) {
                                c4833h4.m20062x1(this);
                                c4833h4.m20016k4();
                            }
                        } else {
                            if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11557c5)) {
                                if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                    c4833h4.m20041ne();
                                }
                            } else if (C14113y2.m67363du(strM20090k4, "form")) {
                                if (c4833h4.m20005fa() != null && !c4833h4.m20058x1().m20079k4(C5540dy.x1.f15215c5)) {
                                    c4833h4.m20062x1(this);
                                    return false;
                                }
                                if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                    c4833h4.m20041ne();
                                }
                                C5543ix c5543ixM20059x1 = c4833h4.m20059x1(c4880y9M19953yj);
                                if (!c4833h4.m20058x1().m20079k4(C5540dy.x1.f15215c5)) {
                                    c4833h4.m20046to(c5543ixM20059x1);
                                }
                            } else if (C14113y2.m67363du(strM20090k4, "li")) {
                                c4833h4.m20024k4(false);
                                C4838j5 c4838j5M20058x13 = c4833h4.m20058x1();
                                int iM20080kk = c4838j5M20058x13.m20080kk() - 1;
                                while (true) {
                                    if (iM20080kk <= 0) {
                                        break;
                                    }
                                    C5543ix c5543ixM20076k43 = c4838j5M20058x13.m20076k4(iM20080kk);
                                    if (!C14113y2.m67363du(c5543ixM20076k43.m22719to().m22852x1(), "li")) {
                                        if (c4833h4.m19999du(c5543ixM20076k43) && !C11283h4.m54243x1(c5543ixM20076k43.m22719to().m22852x1(), C4256k4.k4.f11558ck)) {
                                            break;
                                        }
                                        iM20080kk--;
                                    } else {
                                        c4833h4.m19992c5(strM20090k4);
                                        if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k4)) {
                                            c4833h4.m20062x1(this);
                                        }
                                        c4833h4.m20066x1(strM20090k4);
                                    }
                                }
                                if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                    c4839jd = new C4839jd(ContextChain.TAG_PRODUCT);
                                    c4833h4.m20025k4(c4839jd);
                                }
                            } else if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11562fa)) {
                                c4833h4.m20024k4(false);
                                C4838j5 c4838j5M20058x14 = c4833h4.m20058x1();
                                int iM20080kk2 = c4838j5M20058x14.m20080kk() - 1;
                                while (true) {
                                    if (iM20080kk2 <= 0) {
                                        break;
                                    }
                                    C5543ix c5543ixM20076k44 = c4838j5M20058x14.m20076k4(iM20080kk2);
                                    if (C11283h4.m54243x1(c5543ixM20076k44.m22719to().m22852x1(), C4256k4.k4.f11562fa)) {
                                        c4833h4.m20025k4(new C4839jd(c5543ixM20076k44.m22719to().m22852x1()));
                                        break;
                                    }
                                    if (c4833h4.m19999du(c5543ixM20076k44) && !C11283h4.m54243x1(c5543ixM20076k44.m22719to().m22852x1(), C4256k4.k4.f11558ck)) {
                                        break;
                                    }
                                    iM20080kk2--;
                                }
                                if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                    c4839jd = new C4839jd(ContextChain.TAG_PRODUCT);
                                    c4833h4.m20025k4(c4839jd);
                                }
                            } else if (C14113y2.m67363du(strM20090k4, "plaintext")) {
                                if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                    c4833h4.m20025k4(new C4839jd(ContextChain.TAG_PRODUCT));
                                }
                                c4833h4.m20059x1(c4880y9M19953yj);
                                c4833h4.m20038m9().m19967k4(AbstractC12411j5.f41415jw);
                            } else if (C14113y2.m67363du(strM20090k4, "button")) {
                                if (c4833h4.m20034kk("button")) {
                                    c4833h4.m20062x1(this);
                                    c4833h4.m20009ix();
                                    c4833h4.m20066x1("button");
                                }
                                c4833h4.m20036ks();
                            } else {
                                if (C14113y2.m67363du(strM20090k4, "a")) {
                                    C5543ix c5543ixM20039m9 = c4833h4.m20039m9("a");
                                    if (c5543ixM20039m9 != null) {
                                        c4833h4.m20062x1(this);
                                        c4833h4.m20011jd("a");
                                        c4833h4.m20040m9(c5543ixM20039m9);
                                    }
                                } else if (!C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11573rv)) {
                                    if (C14113y2.m67363du(strM20090k4, "nobr")) {
                                        c4833h4.m20036ks();
                                        if (c4833h4.m20034kk("nobr")) {
                                            c4833h4.m20062x1(this);
                                            c4833h4.m20011jd("nobr");
                                        }
                                        c4833h4.m20007h4(c4833h4.m20059x1(c4880y9M19953yj));
                                    } else {
                                        if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11571ne)) {
                                            c4833h4.m20036ks();
                                            c4833h4.m20059x1(c4880y9M19953yj);
                                            c4833h4.m20068x6();
                                        } else if (C14113y2.m67363du(strM20090k4, "table")) {
                                            c4833h4.m20059x1(c4880y9M19953yj);
                                            c4833h4.m20024k4(false);
                                            abstractC4331ar = AbstractC4331ar.f11830c5;
                                        } else {
                                            if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11564ix)) {
                                                c4833h4.m20036ks();
                                                c4833h4.m20026k4((InterfaceC12769ix) c4833h4.m20059x1(c4880y9M19953yj));
                                            } else if (C14113y2.m67363du(strM20090k4, "input")) {
                                                c4833h4.m20036ks();
                                                C5543ix c5543ixM20059x12 = c4833h4.m20059x1(c4880y9M19953yj);
                                                c4833h4.m20016k4();
                                                c4833h4.m20053uz();
                                                if (!c5543ixM20059x12.mo22698c5(C18437z2.f56754h) || !C14113y2.m67432to("hidden", c5543ixM20059x12.mo22721to(C18437z2.f56754h), (short) 5)) {
                                                }
                                            } else {
                                                if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11575u4)) {
                                                    c4833h4.m20059x1(c4880y9M19953yj);
                                                } else if (C14113y2.m67363du(strM20090k4, TranslateLanguage.CROATIAN)) {
                                                    if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                                        c4833h4.m20041ne();
                                                    }
                                                    c4833h4.m20059x1(c4880y9M19953yj);
                                                    c4833h4.m20016k4();
                                                } else if (C14113y2.m67363du(strM20090k4, "image")) {
                                                    if (!c4833h4.m20003dy("svg")) {
                                                        c4880y9M19953yj.m20093k4("img");
                                                        return c4833h4.m20025k4((AbstractC4830gf) c4880y9M19953yj);
                                                    }
                                                } else if (C14113y2.m67363du(strM20090k4, "isindex")) {
                                                    c4833h4.m20062x1(this);
                                                    if (!c4833h4.m20034kk("template") && c4833h4.m20005fa() != null) {
                                                        return false;
                                                    }
                                                    c4833h4.m20053uz();
                                                    c4833h4.m20024k4(false);
                                                    if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                                        c4833h4.m20041ne();
                                                    }
                                                    C5543ix c5543ixM20015k4 = c4833h4.m20015k4("form");
                                                    c4833h4.m20046to(c5543ixM20015k4);
                                                    if (c4880y9M19953yj.m20098kk().m20109k4("action")) {
                                                        c5543ixM20015k4.mo22708k4("action", c4880y9M19953yj.m20098kk().m20111x1("action"));
                                                    }
                                                    c4833h4.m20015k4(TranslateLanguage.CROATIAN);
                                                    c4833h4.m20016k4();
                                                    c4833h4.m20036ks();
                                                    c4833h4.m20015k4(Constants.ScionAnalytics.PARAM_LABEL);
                                                    c4833h4.m20021k4(new C4861to(c4880y9M19953yj.m20098kk().m20109k4(AuthenticationConstants.AAD.QUERY_PROMPT) ? c4880y9M19953yj.m20098kk().m20111x1(AuthenticationConstants.AAD.QUERY_PROMPT) : "This is a searchable index. Enter search keywords: "));
                                                    C4880y9 c4880y9 = new C4880y9("input");
                                                    for (AbstractC4841k4.k4 k4Var3 : c4880y9M19953yj.m20098kk()) {
                                                        if (!C11283h4.m54243x1(k4Var3.m20103k4(), C4256k4.k4.f11578uz)) {
                                                            c4880y9.m20094k4(k4Var3.m20103k4(), k4Var3.m20107x1());
                                                        }
                                                    }
                                                    c4880y9.m20094k4("name", "isindex");
                                                    c4833h4.m20059x1(c4880y9);
                                                    c4833h4.m20016k4();
                                                    c4833h4.m20016k4();
                                                    c4833h4.m20015k4(TranslateLanguage.CROATIAN);
                                                    c4833h4.m20016k4();
                                                    c4833h4.m20016k4();
                                                    c4833h4.m20046to((C5543ix) null);
                                                } else if (C14113y2.m67363du(strM20090k4, "textarea")) {
                                                    c4833h4.m20059x1(c4880y9M19953yj);
                                                    c4833h4.m20038m9().m19967k4(AbstractC12411j5.f41408g8);
                                                    c4833h4.m20001dy();
                                                    c4833h4.m20024k4(false);
                                                    abstractC4331ar = AbstractC4331ar.f11833dy;
                                                } else {
                                                    if (C14113y2.m67363du(strM20090k4, "xmp")) {
                                                        if (c4833h4.m20047to(ContextChain.TAG_PRODUCT)) {
                                                            c4833h4.m20041ne();
                                                        }
                                                        c4833h4.m20036ks();
                                                    } else {
                                                        if (!C14113y2.m67363du(strM20090k4, "iframe")) {
                                                            if (!C14113y2.m67363du(strM20090k4, "noembed") && (!C14113y2.m67363du(strM20090k4, "noscript") || !c4833h4.m19989bv())) {
                                                                if (C14113y2.m67363du(strM20090k4, "select")) {
                                                                    c4833h4.m20036ks();
                                                                    c4833h4.m20059x1(c4880y9M19953yj);
                                                                    c4833h4.m20024k4(false);
                                                                    AbstractC4331ar abstractC4331arM20052up = c4833h4.m20052up();
                                                                    abstractC4331ar = (abstractC4331arM20052up.equals(AbstractC4331ar.f11830c5) || abstractC4331arM20052up.equals(AbstractC4331ar.f11831ck) || abstractC4331arM20052up.equals(AbstractC4331ar.f11847up) || abstractC4331arM20052up.equals(AbstractC4331ar.f11852yj) || abstractC4331arM20052up.equals(AbstractC4331ar.f11840ks)) ? AbstractC4331ar.f11851x6 : AbstractC4331ar.f11844rv;
                                                                } else if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11580wl)) {
                                                                    if (C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "option")) {
                                                                        c4833h4.m20016k4();
                                                                    }
                                                                    c4833h4.m20036ks();
                                                                } else if (C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11572qq)) {
                                                                    if (c4833h4.m20034kk("ruby")) {
                                                                        c4833h4.m20009ix();
                                                                        if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "ruby")) {
                                                                            c4833h4.m20062x1(this);
                                                                        }
                                                                    }
                                                                } else if (C14113y2.m67363du(strM20090k4, "rt")) {
                                                                    if (c4833h4.m20034kk("ruby")) {
                                                                        c4833h4.m19992c5(TranslateLanguage.TURKISH);
                                                                        if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "ruby") && !C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), "rtc")) {
                                                                        }
                                                                    }
                                                                } else if (C14113y2.m67363du(strM20090k4, "math")) {
                                                                    c4833h4.m20036ks();
                                                                    c4833h4.m20060x1(c4833h4.m19997du(c4833h4.m20057x1(abstractC4830gf)).m19953yj(), "http://www.w3.org/1998/Math/MathML");
                                                                    if (c4880y9M19953yj.m20102x1()) {
                                                                    }
                                                                } else {
                                                                    if (!C14113y2.m67363du(strM20090k4, "svg")) {
                                                                        if (!C11283h4.m54243x1(strM20090k4, C4256k4.k4.f11554ar)) {
                                                                            return mo17427kk(abstractC4830gf, c4833h4);
                                                                        }
                                                                        c4833h4.m20062x1(this);
                                                                        return false;
                                                                    }
                                                                    c4833h4.m20036ks();
                                                                    c4833h4.m20060x1(c4833h4.m19997du(c4833h4.m20057x1(abstractC4830gf)).m19953yj(), "http://www.w3.org/2000/svg");
                                                                    if (c4880y9M19953yj.m20102x1()) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        c4833h4.m20023k4(AbstractC12411j5.f41411he);
                                                    }
                                                    c4833h4.m20024k4(false);
                                                    c4833h4.m20023k4(AbstractC12411j5.f41411he);
                                                }
                                                c4833h4.m20016k4();
                                                c4833h4.m20053uz();
                                            }
                                            c4833h4.m20053uz();
                                        }
                                        c4833h4.m20024k4(false);
                                    }
                                }
                                c4833h4.m20036ks();
                                c4833h4.m20007h4(c4833h4.m20059x1(c4880y9M19953yj));
                            }
                            c4833h4.m20059x1(c4880y9M19953yj);
                            c4833h4.m20024k4(false);
                        }
                        c4833h4.m20059x1(c4880y9M19953yj);
                    }
                    c4833h4.m20020k4(abstractC4331ar);
                }
            }
        } else if (iM19946h4 == 1) {
            String strM20090k42 = abstractC4830gf.m19948ks().m20090k4();
            if (C14113y2.m67363du(strM20090k42, "template")) {
                return AbstractC4331ar.f11845to.mo17426k4(abstractC4830gf, c4833h4);
            }
            if (C14113y2.m67363du(strM20090k42, "body")) {
                if (!c4833h4.m20034kk("body")) {
                    c4833h4.m20062x1(this);
                    return false;
                }
                abstractC4331ar = AbstractC4331ar.f11836ix;
                c4833h4.m20020k4(abstractC4331ar);
            } else {
                if (C14113y2.m67363du(strM20090k42, "html")) {
                    if (c4833h4.m20034kk("body")) {
                        return AbstractC4331ar.f11836ix.mo17426k4(abstractC4830gf, c4833h4);
                    }
                    c4833h4.m20062x1(this);
                    return false;
                }
                if (C11283h4.m54243x1(strM20090k42, C4256k4.k4.f11577up)) {
                    if (!c4833h4.m20034kk(strM20090k42)) {
                        c4833h4.m20062x1(this);
                        return false;
                    }
                    c4833h4.m20009ix();
                    if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k42)) {
                        c4833h4.m20062x1(this);
                    }
                    c4833h4.m20066x1(strM20090k42);
                } else if (C14113y2.m67363du(strM20090k42, "form")) {
                    if (!c4833h4.m20058x1().m20079k4(C5540dy.x1.f15215c5)) {
                        C5543ix c5543ixM20005fa = c4833h4.m20005fa();
                        c4833h4.m20046to((C5543ix) null);
                        if (c5543ixM20005fa == null || !c4833h4.m20034kk(strM20090k42)) {
                            c4833h4.m20062x1(this);
                            return false;
                        }
                        c4833h4.m20009ix();
                        if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k42)) {
                            c4833h4.m20062x1(this);
                        }
                        c4833h4.m20058x1().m20087x1(c5543ixM20005fa);
                    } else {
                        if (!c4833h4.m20034kk("font")) {
                            c4833h4.m20062x1(this);
                            return false;
                        }
                        c4833h4.m20009ix();
                        C5560wy c5560wyM22719to = c4833h4.m20045to().m22719to();
                        C5560wy c5560wy = C5540dy.x1.f15216ck;
                        if (!c5560wyM22719to.m22850k4(c5560wy)) {
                            c4833h4.m20062x1(this);
                        }
                        c4833h4.m20066x1(c5560wy.m22852x1());
                    }
                } else if (C14113y2.m67363du(strM20090k42, ContextChain.TAG_PRODUCT)) {
                    if (!c4833h4.m20047to(strM20090k42)) {
                        c4833h4.m20062x1(this);
                        c4833h4.m20025k4((AbstractC4830gf) new C4880y9(strM20090k42));
                    }
                    c4833h4.m20041ne();
                } else if (C14113y2.m67363du(strM20090k42, "li")) {
                    if (!c4833h4.m20008h4(strM20090k42)) {
                        c4833h4.m20062x1(this);
                        return false;
                    }
                    c4833h4.m19992c5(strM20090k42);
                    if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k42)) {
                    }
                    c4833h4.m20066x1(strM20090k42);
                } else if (!C11283h4.m54243x1(strM20090k42, C4256k4.k4.f11562fa)) {
                    String[] strArr2 = C4256k4.k4.f11570m9;
                    if (C11283h4.m54243x1(strM20090k42, strArr2)) {
                        if (!c4833h4.m20035kk(strArr2)) {
                            c4833h4.m20062x1(this);
                            return false;
                        }
                        c4833h4.m20009ix();
                        if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k42)) {
                            c4833h4.m20062x1(this);
                        }
                        c4833h4.m20028k4(strArr2);
                    } else {
                        if (C14113y2.m67363du(strM20090k42, "sarcasm")) {
                            return mo17428to(abstractC4830gf, c4833h4);
                        }
                        if (C11283h4.m54243x1(strM20090k42, C4256k4.k4.f11583x6)) {
                            return c4833h4.m20011jd(strM20090k42);
                        }
                        if (!C11283h4.m54243x1(strM20090k42, C4256k4.k4.f11571ne)) {
                            if (!C14113y2.m67363du(strM20090k42, "br")) {
                                return mo17428to(abstractC4830gf, c4833h4);
                            }
                            c4833h4.m20062x1(this);
                            c4833h4.m20025k4((AbstractC4830gf) new C4880y9(strM20090k42));
                            return false;
                        }
                        if (!c4833h4.m20034kk(strM20090k42)) {
                            c4833h4.m20062x1(this);
                            return false;
                        }
                        c4833h4.m20009ix();
                        if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k42)) {
                            c4833h4.m20062x1(this);
                        }
                        c4833h4.m20066x1(strM20090k42);
                        c4833h4.m20043rv();
                    }
                } else {
                    if (!c4833h4.m20034kk(strM20090k42)) {
                        c4833h4.m20062x1(this);
                        return false;
                    }
                    c4833h4.m19992c5(strM20090k42);
                    if (!C14113y2.m67363du(c4833h4.m20045to().m22719to().m22852x1(), strM20090k42)) {
                    }
                    c4833h4.m20066x1(strM20090k42);
                }
            }
        } else if (iM19946h4 == 2) {
            C4861to c4861toM19952x6 = abstractC4830gf.m19952x6();
            if (c4861toM19952x6.m20144k4((char) 0)) {
                c4833h4.m20062x1(this);
                return false;
            }
            boolean zM20145x1 = c4861toM19952x6.m20145x1();
            c4833h4.m20036ks();
            c4833h4.m20021k4(c4861toM19952x6);
            if (!zM20145x1) {
                c4833h4.m20024k4(false);
            }
        } else if (iM19946h4 == 3) {
            c4833h4.m20017k4(abstractC4830gf.m19950rv());
        } else if (iM19946h4 == 4) {
            c4833h4.m20062x1(this);
            return false;
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: kk */
    public boolean mo17427kk(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        c4833h4.m20036ks();
        c4833h4.m20059x1(abstractC4830gf.m19953yj());
        return true;
    }

    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: to */
    public boolean mo17428to(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        String strM20090k4 = abstractC4830gf.m19951up().m20090k4();
        C5560wy c5560wyM22847k4 = C5560wy.m22847k4(strM20090k4);
        IGenericEnumerator<C5543ix> it = c4833h4.m20058x1().iterator();
        while (it.hasNext()) {
            C5543ix next = it.next();
            if (next.m22719to().m22850k4(c5560wyM22847k4)) {
                c4833h4.m19992c5(strM20090k4);
                if (!next.equals(c4833h4.m20045to())) {
                    c4833h4.m20062x1(this);
                }
                c4833h4.m20026k4((InterfaceC12769ix) next);
                return true;
            }
            if (c4833h4.m19999du(next)) {
                c4833h4.m20062x1(this);
                return false;
            }
        }
        return true;
    }
}
