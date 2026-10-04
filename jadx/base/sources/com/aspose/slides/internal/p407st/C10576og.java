package com.aspose.slides.internal.p407st;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.PptCorruptFileException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18208i0;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.sms.common.ReadSmsConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.og */
/* JADX INFO: loaded from: classes4.dex */
public class C10576og {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f37268k4 = new C7017h4("___PPT9", "___PPT10", "___PPT11", "___PPT12");

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10571o4 m51429k4(C3134k4 c3134k4) {
        return m51431k4(c3134k4, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10571o4 m51430k4(C3134k4 c3134k4, C10395d2 c10395d2, AbstractC10571o4 abstractC10571o4) {
        String string = "NotDefined";
        try {
            C10695wm c10695wm = new C10695wm(c3134k4);
            AbstractC10571o4 abstractC10571o4M51432k4 = m51432k4(c10695wm, c10395d2, abstractC10571o4, c3134k4);
            string = abstractC10571o4M51432k4.toString();
            abstractC10571o4M51432k4.m51405k4(c3134k4, c10695wm);
            return abstractC10571o4M51432k4;
        } catch (RuntimeException e) {
            throw new PptCorruptFileException(C14113y2.m67408k4("Couldn't read [", string, "]"), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10571o4 m51431k4(C3134k4 c3134k4, AbstractC10571o4 abstractC10571o4) {
        return m51430k4(c3134k4, null, abstractC10571o4);
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x0619  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC10571o4 m51432k4(C10695wm c10695wm, C10395d2 c10395d2, AbstractC10571o4 abstractC10571o4, C3134k4 c3134k4) {
        AbstractC10571o4 c10699wt;
        AbstractC3150x6 abstractC3150x6M13371ck;
        long j;
        int iM51923to = c10695wm.m51923to();
        if (iM51923to == 2005) {
            c10699wt = new C10699wt();
        } else if (iM51923to == 2006) {
            c10699wt = new C10501k1();
        } else if (iM51923to == 2040) {
            c10699wt = new C10413dy();
        } else if (iM51923to != 2041) {
            switch (iM51923to) {
                case 1000:
                    c10699wt = new C10641ss();
                    break;
                case 1001:
                    c10699wt = new C10696wp();
                    break;
                case 1002:
                    c10699wt = new C10654tq();
                    break;
                default:
                    switch (iM51923to) {
                        case 1006:
                            c10699wt = new C10431f3();
                            break;
                        case 1007:
                            c10699wt = new C10487j0();
                            break;
                        case 1008:
                            c10699wt = new C10618r9();
                            break;
                        case 1009:
                            c10699wt = new C10676v0();
                            break;
                        case 1010:
                            c10699wt = new C10513kp();
                            break;
                        case 1011:
                            c10699wt = new C10495ji(c10395d2);
                            break;
                        default:
                            switch (iM51923to) {
                                case PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW /* 1016 */:
                                    c10699wt = new C10678v6();
                                    break;
                                case PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW /* 1017 */:
                                    c10699wt = new C10738yu();
                                    break;
                                case PointerIconCompat.TYPE_ZOOM_IN /* 1018 */:
                                    c10699wt = new C10648tf();
                                    break;
                                case PointerIconCompat.TYPE_ZOOM_OUT /* 1019 */:
                                    c10699wt = new C10388cj();
                                    break;
                                default:
                                    switch (iM51923to) {
                                        case PointerIconCompat.TYPE_GRABBING /* 1021 */:
                                            c10699wt = new C10426eo();
                                            break;
                                        case 1022:
                                            c10699wt = new C10518kx();
                                            break;
                                        case 1023:
                                            c10699wt = new C10415e2();
                                            break;
                                        case 1024:
                                            c10699wt = new C10505k6();
                                            break;
                                        case 1025:
                                            c10699wt = new C10588pd();
                                            break;
                                        case EditingLanguage.BULGARIAN /* 1026 */:
                                            c10699wt = new C10506k9();
                                            break;
                                        default:
                                            if (iM51923to == 4040) {
                                                if (C7019kk.m27469x1(abstractC10571o4, C10513kp.class)) {
                                                    c10699wt = new C10476i5();
                                                } else {
                                                    if (!C7019kk.m27469x1(abstractC10571o4, C10498jn.class)) {
                                                        throw new Exception();
                                                    }
                                                    c10699wt = new C10616r5();
                                                }
                                                break;
                                            } else if (iM51923to != 4041) {
                                                switch (iM51923to) {
                                                    case EditingLanguage.DANISH /* 1030 */:
                                                        c10699wt = new C10447g8();
                                                        break;
                                                    case EditingLanguage.GERMAN_GERMANY /* 1031 */:
                                                        c10699wt = new C10425en();
                                                        break;
                                                    case EditingLanguage.GREEK /* 1032 */:
                                                        c10699wt = new C10585p6();
                                                        break;
                                                    case EditingLanguage.ENGLISH_US /* 1033 */:
                                                        c10699wt = new C10433f7();
                                                        break;
                                                    case EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT /* 1034 */:
                                                        c10699wt = new C10404dl();
                                                        break;
                                                    case EditingLanguage.FINNISH /* 1035 */:
                                                        c10699wt = new C10631s7();
                                                        break;
                                                    case EditingLanguage.FRENCH_FRANCE /* 1036 */:
                                                        c10699wt = new C10451gi();
                                                        break;
                                                    case EditingLanguage.HEBREW /* 1037 */:
                                                        c10699wt = new C10570o3();
                                                        break;
                                                    case EditingLanguage.HUNGARIAN /* 1038 */:
                                                        c10699wt = new C10381c1();
                                                        break;
                                                    case EditingLanguage.ICELANDIC /* 1039 */:
                                                        c10699wt = new C10484iv();
                                                        break;
                                                    case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                                                        c10699wt = new C10632s9();
                                                        break;
                                                    case EditingLanguage.JAPANESE /* 1041 */:
                                                        c10699wt = new C10547ms();
                                                        break;
                                                    case EditingLanguage.KOREAN /* 1042 */:
                                                        c10699wt = new C10656tt();
                                                        break;
                                                    case EditingLanguage.DUTCH_NETHERLANDS /* 1043 */:
                                                        c10699wt = new C10702x0();
                                                        break;
                                                    case EditingLanguage.NORWEGIAN_BOKMAL /* 1044 */:
                                                        c10699wt = new C10448g9();
                                                        break;
                                                    case EditingLanguage.POLISH /* 1045 */:
                                                        c10699wt = new C10502k2();
                                                        break;
                                                    default:
                                                        switch (iM51923to) {
                                                            case 2000:
                                                                c10699wt = new C10414e0();
                                                                break;
                                                            case 2032:
                                                                c10699wt = new C10675uz();
                                                                break;
                                                            case 3009:
                                                                c10699wt = new C10531ly();
                                                                break;
                                                            case 3011:
                                                                c10699wt = new C10668un();
                                                                break;
                                                            case 3998:
                                                                c10699wt = new C10373br(c10395d2);
                                                                break;
                                                            case 3999:
                                                                c10699wt = new C10587pa(c10395d2);
                                                                break;
                                                            case 4000:
                                                                c10699wt = new C10665uh(c10395d2);
                                                                break;
                                                            case 4001:
                                                                c10699wt = new C10461h8(c10395d2);
                                                                break;
                                                            case 4002:
                                                                c10699wt = new C10371bp(c10395d2);
                                                                break;
                                                            case 4003:
                                                                c10699wt = new C10536m5();
                                                                break;
                                                            case 4004:
                                                                c10699wt = new C10612qv();
                                                                break;
                                                            case 4005:
                                                                c10699wt = new C10723xz();
                                                                break;
                                                            case 4006:
                                                                c10699wt = new C10688w5(c10395d2);
                                                                break;
                                                            case 4007:
                                                                c10699wt = new C10549mu(c10395d2);
                                                                break;
                                                            case 4008:
                                                                c10699wt = new C10712xh(c10395d2);
                                                                break;
                                                            case 4009:
                                                                c10699wt = new C10442fp();
                                                                break;
                                                            case 4010:
                                                                c10699wt = new C10577oo(c10395d2);
                                                                break;
                                                            case 4011:
                                                                c10699wt = new C10356ak();
                                                                break;
                                                            case 4012:
                                                                c10699wt = new C10704x2();
                                                                break;
                                                            case 4013:
                                                                c10699wt = new C10575of();
                                                                break;
                                                            case 4014:
                                                                c10699wt = new C10393cx();
                                                                break;
                                                            case 4015:
                                                                c10699wt = new C10687w2();
                                                                break;
                                                            case 4016:
                                                                c10699wt = new C10628s1();
                                                                break;
                                                            case 4017:
                                                                c10699wt = new C10508kf();
                                                                break;
                                                            case 4018:
                                                                c10699wt = new C10605qh();
                                                                break;
                                                            case 4019:
                                                                c10699wt = new C10637sl();
                                                                break;
                                                            case 4020:
                                                                c10699wt = new C10643sx();
                                                                break;
                                                            case 4021:
                                                                c10699wt = new C10364b2();
                                                                break;
                                                            case 4022:
                                                                c10699wt = new C10466hh();
                                                                break;
                                                            case 4023:
                                                                c10699wt = new C10497jm();
                                                                break;
                                                            case 4024:
                                                                c10699wt = new C10658tw();
                                                                break;
                                                            case 4026:
                                                                c10699wt = new C10626rv();
                                                                break;
                                                            case 4033:
                                                                c10699wt = new C10370bm();
                                                                break;
                                                            case 4035:
                                                                c10699wt = new C10417e8();
                                                                break;
                                                            case 4063:
                                                                c10699wt = new C10509kh(c10395d2);
                                                                break;
                                                            case 4068:
                                                                c10699wt = new C10494jf();
                                                                break;
                                                            case 4071:
                                                                c10699wt = new C10566ny();
                                                                break;
                                                            case 4074:
                                                                c10699wt = new C10369bg(0);
                                                                break;
                                                            case 4078:
                                                                c10699wt = new C10383c4(0);
                                                                break;
                                                            case 4109:
                                                                c10699wt = new C10560nh();
                                                                break;
                                                            case 4110:
                                                                c10699wt = new C10662u5();
                                                                break;
                                                            case 4111:
                                                                c10699wt = new C10366b5(0);
                                                                break;
                                                            case 4112:
                                                                c10699wt = new C10617r7(0);
                                                                break;
                                                            case 4113:
                                                                c10699wt = new C10504k5();
                                                                break;
                                                            case 4114:
                                                                c10699wt = new C10640sq();
                                                                break;
                                                            case 4115:
                                                                c10699wt = new C10429ew();
                                                                break;
                                                            case 4116:
                                                                c10699wt = new C10703x1();
                                                                break;
                                                            case 4117:
                                                                c10699wt = new C10446g6(c10395d2);
                                                                break;
                                                            case 4120:
                                                                c10699wt = new C10713xi();
                                                                break;
                                                            case 5000:
                                                                int iM51404bv = abstractC10571o4.m51404bv();
                                                                if (iM51404bv != 1000) {
                                                                    if (iM51404bv == 1006 || iM51404bv == 1008 || iM51404bv == 1016) {
                                                                        c10699wt = new C10567nz();
                                                                        break;
                                                                    } else if (iM51404bv == 2000) {
                                                                        c10699wt = new C10608qm();
                                                                        break;
                                                                    } else if (iM51404bv != 4041) {
                                                                        if (iM51404bv != 61457) {
                                                                            throw new Exception();
                                                                        }
                                                                        c10699wt = new C10516kt();
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c10699wt = new C10608qm();
                                                                    break;
                                                                }
                                                                break;
                                                            case 5001:
                                                                c10699wt = new C10467hj();
                                                                break;
                                                            case 5002:
                                                                c10699wt = !C7019kk.m27469x1(abstractC10571o4, C10516kt.class) ? !C7019kk.m27469x1(abstractC10571o4, C10567nz.class) ? !C7019kk.m27469x1(abstractC10571o4, C10608qm.class) ? new C10647td() : new C10379bz() : new C10610qp() : new C10430ex();
                                                                break;
                                                            case 5003:
                                                                if (C7019kk.m27469x1(abstractC10571o4, C10430ex.class)) {
                                                                    int iM27428k4 = f37268k4.m27428k4(((C10626rv) ((C10430ex) C7019kk.m27452k4((Object) abstractC10571o4, C10430ex.class)).m50513yj().get_Item(0)).m51659x1());
                                                                    if (iM27428k4 == 0) {
                                                                        c10699wt = new C10444fw();
                                                                    } else if (iM27428k4 == 1) {
                                                                        c10699wt = new C10471hu();
                                                                    } else if (iM27428k4 == 2) {
                                                                        c10699wt = new C10401di();
                                                                    } else {
                                                                        c10699wt = new C10460h4();
                                                                    }
                                                                } else if (C7019kk.m27469x1(abstractC10571o4, C10610qp.class)) {
                                                                    int iM27428k42 = f37268k4.m27428k4(((C10626rv) ((C10610qp) C7019kk.m27452k4((Object) abstractC10571o4, C10610qp.class)).m50513yj().get_Item(0)).m51659x1());
                                                                    if (iM27428k42 == 0) {
                                                                        c10699wt = new C10350a0();
                                                                    } else if (iM27428k42 == 1) {
                                                                        c10699wt = new C10491j8();
                                                                    } else if (iM27428k42 == 3) {
                                                                        c10699wt = new C10584p5();
                                                                    } else {
                                                                        c10699wt = new C10460h4();
                                                                    }
                                                                } else {
                                                                    if (!C7019kk.m27469x1(abstractC10571o4, C10379bz.class)) {
                                                                        throw new Exception();
                                                                    }
                                                                    int iM27428k43 = f37268k4.m27428k4(((C10626rv) ((C10379bz) C7019kk.m27452k4((Object) abstractC10571o4, C10379bz.class)).m50513yj().get_Item(0)).m51659x1());
                                                                    if (iM27428k43 == 0) {
                                                                        c10699wt = new C10498jn();
                                                                    } else if (iM27428k43 == 1) {
                                                                        c10699wt = new C10593po();
                                                                    } else if (iM27428k43 == 2) {
                                                                        c10699wt = new C10650th();
                                                                    } else if (iM27428k43 == 3) {
                                                                        c10699wt = new C10680vf();
                                                                    } else {
                                                                        c10699wt = new C10460h4();
                                                                    }
                                                                }
                                                                break;
                                                            case C18208i0.f55081h /* 6000 */:
                                                                c10699wt = new C10468hl();
                                                                break;
                                                            case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                                                c10699wt = new C10755zn();
                                                                break;
                                                            case 6010:
                                                                c10699wt = new C10472hx();
                                                                break;
                                                            case 6011:
                                                                c10699wt = new C10449ga();
                                                                break;
                                                            case 6013:
                                                                c10699wt = new C10644sz();
                                                                break;
                                                            case 6014:
                                                                c10699wt = new C10492jd();
                                                                break;
                                                            case 6020:
                                                                c10699wt = new C10689w6();
                                                                break;
                                                            case 6021:
                                                                c10699wt = new C10488j2();
                                                                break;
                                                            case 11003:
                                                                int iM13384uz = (int) c3134k4.m13384uz();
                                                                int iM13384uz2 = (int) c3134k4.m13384uz();
                                                                c10699wt = iM13384uz2 != 1 ? iM13384uz2 != 2 ? new C10529ls() : new C10465hg() : iM13384uz != 5 ? new C10649tg() : new C10732yi();
                                                                abstractC3150x6M13371ck = c3134k4.m13371ck();
                                                                j = -8;
                                                                abstractC3150x6M13371ck.seek(j, 1);
                                                                break;
                                                            case 11008:
                                                                c10699wt = new C10470hq();
                                                                break;
                                                            case 11009:
                                                                c10699wt = new C10633sa();
                                                                break;
                                                            case 11010:
                                                                c10699wt = new C10435fa();
                                                                break;
                                                            case 11011:
                                                                c10699wt = new C10389ck();
                                                                break;
                                                            case 11012:
                                                                c10699wt = new C10559ne();
                                                                break;
                                                            case 11013:
                                                                c10699wt = new C10708x6();
                                                                break;
                                                            case 11014:
                                                                c10699wt = new C10714xk();
                                                                break;
                                                            case 11015:
                                                                c10699wt = new C10407dq();
                                                                break;
                                                            case 11016:
                                                                c10699wt = new C10625ru();
                                                                break;
                                                            case 11017:
                                                                c10699wt = new C10653tp();
                                                                break;
                                                            case 11018:
                                                                c10699wt = new C10457gx();
                                                                break;
                                                            case 11019:
                                                                c10699wt = new C10697wr();
                                                                break;
                                                            case 11021:
                                                                c10699wt = new C10474i2();
                                                                break;
                                                            case 12000:
                                                                c10699wt = new C10611qq();
                                                                break;
                                                            case 12001:
                                                                c10699wt = new C10694wl();
                                                                break;
                                                            case 12004:
                                                                c10699wt = new C10667um();
                                                                break;
                                                            case 12005:
                                                                c10699wt = new C10360ar();
                                                                break;
                                                            case 12006:
                                                                c10699wt = new C10741z1();
                                                                break;
                                                            case 12007:
                                                                c10699wt = new C10412dx();
                                                                break;
                                                            case 12010:
                                                                c10699wt = new C10636sf();
                                                                break;
                                                            case 12012:
                                                                c10699wt = new C10655ts();
                                                                break;
                                                            case 12017:
                                                                c10699wt = new C10557n9();
                                                                break;
                                                            case 12052:
                                                                c10699wt = new C10677v4();
                                                                break;
                                                            case 13000:
                                                                c10699wt = new C10728y6();
                                                                break;
                                                            case 14000:
                                                                c10699wt = new C10554n3();
                                                                break;
                                                            case 14001:
                                                                c10699wt = new C10642sv();
                                                                break;
                                                            case 14002:
                                                                c10699wt = new C10582p3();
                                                                break;
                                                            case 14003:
                                                                c10699wt = new C10595pr();
                                                                break;
                                                            case 14100:
                                                                c10699wt = new C10604qe();
                                                                break;
                                                            case 61440:
                                                                c10699wt = new C10459h0();
                                                                break;
                                                            case 61441:
                                                                c10699wt = new C10423ek();
                                                                break;
                                                            case 61442:
                                                                c10699wt = new C10602qb();
                                                                break;
                                                            case 61443:
                                                                c10699wt = new C10511kn();
                                                                break;
                                                            case 61444:
                                                                c10699wt = new C10462h9();
                                                                break;
                                                            case 61445:
                                                                c10699wt = new C10635sd();
                                                                break;
                                                            case 61446:
                                                                c10699wt = new C10614qx();
                                                                break;
                                                            case 61447:
                                                                c10699wt = new C10403dk();
                                                                break;
                                                            case 61448:
                                                                c10699wt = new C10740z0();
                                                                break;
                                                            case 61449:
                                                                c10699wt = new C10543mi();
                                                                break;
                                                            case 61450:
                                                                c10699wt = new C10724y1();
                                                                break;
                                                            case 61451:
                                                                c10699wt = new C10534m3();
                                                                break;
                                                            case 61453:
                                                                c10699wt = new C10548mt();
                                                                break;
                                                            case 61455:
                                                                c10699wt = new C10715xl();
                                                                break;
                                                            case 61456:
                                                                c10699wt = new C10386c9();
                                                                break;
                                                            case 61457:
                                                                c10699wt = new C10358am();
                                                                break;
                                                            case 61458:
                                                                c10699wt = new C10463hc();
                                                                break;
                                                            case 61460:
                                                                c10699wt = new C10394cz();
                                                                break;
                                                            case 61463:
                                                                c10699wt = new C10744z6();
                                                                break;
                                                            case 61466:
                                                                c10699wt = new C10440fj();
                                                                break;
                                                            case 61467:
                                                                c10699wt = new C10596pt();
                                                                break;
                                                            case 61468:
                                                                c10699wt = new C10432f5();
                                                                break;
                                                            case 61469:
                                                            case 61482:
                                                                c10699wt = new C10746z9();
                                                                break;
                                                            case 61470:
                                                                c10699wt = new C10544ml();
                                                                break;
                                                            case 61471:
                                                                c10699wt = new C10352aa();
                                                                break;
                                                            case 61481:
                                                                c10699wt = new C10719xt();
                                                                break;
                                                            case 61720:
                                                                c10699wt = new C10758zz();
                                                                break;
                                                            case 61722:
                                                                c10699wt = new C10377bx();
                                                                break;
                                                            case 61725:
                                                                c10699wt = new C10550mx();
                                                                break;
                                                            case 61726:
                                                                c10699wt = new C10439fh();
                                                                break;
                                                            case 61729:
                                                                c10699wt = new C10428ev();
                                                                break;
                                                            case 61730:
                                                                c10699wt = new C10711xc();
                                                                break;
                                                            case 61733:
                                                                c10699wt = new C10561ni();
                                                                break;
                                                            case 61735:
                                                                c10699wt = new C10693wk();
                                                                break;
                                                            case 61736:
                                                                c10699wt = new C10555n4();
                                                                break;
                                                            case 61737:
                                                                c10699wt = new C10720xu();
                                                                break;
                                                            case 61738:
                                                                c10699wt = new C10486iy();
                                                                break;
                                                            case 61739:
                                                                c10699wt = new C10664ug();
                                                                break;
                                                            case 61740:
                                                                c10699wt = new C10698ws();
                                                                break;
                                                            case 61741:
                                                                c10699wt = new C10416e6();
                                                                break;
                                                            case 61742:
                                                                c10699wt = new C10717xp();
                                                                break;
                                                            case 61743:
                                                                c10699wt = new C10581ov();
                                                                break;
                                                            case 61744:
                                                                c10699wt = new C10493je();
                                                                break;
                                                            case 61745:
                                                                c10699wt = new C10523ld();
                                                                break;
                                                            case 61746:
                                                                c10699wt = new C10721xv();
                                                                break;
                                                            case 61747:
                                                                c10699wt = new C10532m1();
                                                                break;
                                                            case 61748:
                                                                c10699wt = new C10514kq();
                                                                break;
                                                            case 61749:
                                                                c10699wt = new C10454gm();
                                                                break;
                                                            case 61750:
                                                                c10699wt = new C10638sn();
                                                                break;
                                                            case 61751:
                                                                c10699wt = new C10524lg();
                                                                break;
                                                            case 61752:
                                                                c10699wt = new C10478ib();
                                                                break;
                                                            case 61753:
                                                                c10699wt = new C10445fz();
                                                                break;
                                                            case 61754:
                                                                c10699wt = new C10410dv();
                                                                break;
                                                            case 61755:
                                                                c10699wt = new C10573oa();
                                                                break;
                                                            case 61756:
                                                                c10699wt = new C10485ix();
                                                                break;
                                                            case 61757:
                                                                switch (abstractC10571o4.m51404bv()) {
                                                                    case 61738:
                                                                        c10699wt = new C10351a8();
                                                                        break;
                                                                    case 61764:
                                                                    case 61765:
                                                                        c10699wt = new C10592pm();
                                                                        break;
                                                                    default:
                                                                        c10699wt = new C10709x7();
                                                                        break;
                                                                }
                                                                break;
                                                            case 61758:
                                                                c10699wt = new C10679ve();
                                                                break;
                                                            case 61759:
                                                                c10699wt = new C10419ee();
                                                                break;
                                                            case 61760:
                                                                c10699wt = new C10623rr();
                                                                break;
                                                            case 61761:
                                                                c10699wt = new C10606qj();
                                                                break;
                                                            case 61762:
                                                                byte bM13387yj = c3134k4.m13387yj();
                                                                int i = bM13387yj & 255;
                                                                if (i == 0) {
                                                                    c10699wt = new C10574od();
                                                                } else if (i == 1) {
                                                                    c10699wt = new C10391cu();
                                                                } else if (i == 2) {
                                                                    c10699wt = new C10427ep();
                                                                } else {
                                                                    if (i != 3) {
                                                                        throw new NotImplementedException(C14113y2.m67402k4("Unknown TimeVariant type: {0}", Byte.valueOf(bM13387yj)));
                                                                    }
                                                                    c10699wt = new C10742z2();
                                                                }
                                                                abstractC3150x6M13371ck = c3134k4.m13371ck();
                                                                j = -1;
                                                                abstractC3150x6M13371ck.seek(j, 1);
                                                                break;
                                                            case 61763:
                                                                c10699wt = new C10743z5();
                                                                break;
                                                            case 61764:
                                                                c10699wt = new C10562nk();
                                                                break;
                                                            case 61765:
                                                                c10699wt = new C10357al();
                                                                break;
                                                            default:
                                                                switch (iM51923to) {
                                                                    case 3035:
                                                                        c10699wt = new C10473hz();
                                                                        break;
                                                                    case 3036:
                                                                        c10699wt = new C10594pq();
                                                                        break;
                                                                    case 3037:
                                                                        c10699wt = new C10399dd();
                                                                        break;
                                                                    default:
                                                                        switch (iM51923to) {
                                                                            case 4044:
                                                                                c10699wt = new C10411dw(0);
                                                                                break;
                                                                            case 4045:
                                                                                c10699wt = new C10600q6();
                                                                                break;
                                                                            case 4046:
                                                                                c10699wt = new C10599q3(0);
                                                                                break;
                                                                            default:
                                                                                switch (iM51923to) {
                                                                                    case 4049:
                                                                                        c10699wt = new C10651tl();
                                                                                        break;
                                                                                    case 4050:
                                                                                        c10699wt = new C10565nx();
                                                                                        break;
                                                                                    case 4051:
                                                                                        c10699wt = new C10362av();
                                                                                        break;
                                                                                    default:
                                                                                        switch (iM51923to) {
                                                                                            case 4055:
                                                                                                c10699wt = new C10580ou();
                                                                                                break;
                                                                                            case 4056:
                                                                                                c10699wt = new C10482iq(c10395d2);
                                                                                                break;
                                                                                            case 4057:
                                                                                                c10699wt = new C10639so();
                                                                                                break;
                                                                                            case 4058:
                                                                                                c10699wt = new C10624rs();
                                                                                                break;
                                                                                            default:
                                                                                                switch (iM51923to) {
                                                                                                    case 4080:
                                                                                                        c10699wt = new C10706x4();
                                                                                                        break;
                                                                                                    case 4081:
                                                                                                        c10699wt = new C10503k4();
                                                                                                        break;
                                                                                                    case 4082:
                                                                                                        c10699wt = new C10750zf(c10395d2);
                                                                                                        break;
                                                                                                    case 4083:
                                                                                                        c10699wt = new C10422ei();
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (iM51923to) {
                                                                                                            case 4085:
                                                                                                                c10699wt = new C10372bq();
                                                                                                                break;
                                                                                                            case 4086:
                                                                                                                c10699wt = new C10528lr();
                                                                                                                break;
                                                                                                            case 4087:
                                                                                                                c10699wt = new C10365b3(c10395d2);
                                                                                                                break;
                                                                                                            case 4088:
                                                                                                                c10699wt = new C10552n0(c10395d2);
                                                                                                                break;
                                                                                                            case 4089:
                                                                                                                c10699wt = new C10745z7(c10395d2);
                                                                                                                break;
                                                                                                            case 4090:
                                                                                                                c10699wt = new C10408dt(c10395d2);
                                                                                                                break;
                                                                                                            case 4091:
                                                                                                                c10699wt = new C10526lm();
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (iM51923to) {
                                                                                                                    case EditingLanguage.CHINESE_SINGAPORE /* 4100 */:
                                                                                                                        c10699wt = new C10572o9();
                                                                                                                        break;
                                                                                                                    case 4101:
                                                                                                                        c10699wt = new C10396d3(0);
                                                                                                                        break;
                                                                                                                    case 4102:
                                                                                                                        c10699wt = new C10705x3(0);
                                                                                                                        break;
                                                                                                                    case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                                                                                                                        c10699wt = new C10375bu(0);
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (iM51923to) {
                                                                                                                            case 1052:
                                                                                                                                c10699wt = new C10477i9();
                                                                                                                                break;
                                                                                                                            case 1053:
                                                                                                                                c10699wt = new C10601q9();
                                                                                                                                break;
                                                                                                                            case EditingLanguage.THAI /* 1054 */:
                                                                                                                                c10699wt = new C10692wh();
                                                                                                                                break;
                                                                                                                            case 1055:
                                                                                                                                c10699wt = new C10553n2();
                                                                                                                                break;
                                                                                                                            case EditingLanguage.URDU /* 1056 */:
                                                                                                                                c10699wt = new C10542mh();
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                switch (iM51923to) {
                                                                                                                                    case EditingLanguage.UKRAINIAN /* 1058 */:
                                                                                                                                        c10699wt = new C10520l6();
                                                                                                                                        break;
                                                                                                                                    case EditingLanguage.BELARUSIAN /* 1059 */:
                                                                                                                                        c10699wt = new C10418eb();
                                                                                                                                        break;
                                                                                                                                    case EditingLanguage.SLOVENIAN /* 1060 */:
                                                                                                                                        c10699wt = new C10683vm();
                                                                                                                                        break;
                                                                                                                                    case EditingLanguage.ESTONIAN /* 1061 */:
                                                                                                                                        c10699wt = new C10438fe();
                                                                                                                                        break;
                                                                                                                                    case EditingLanguage.LATVIAN /* 1062 */:
                                                                                                                                        c10699wt = new C10361au();
                                                                                                                                        break;
                                                                                                                                    case EditingLanguage.LITHUANIAN /* 1063 */:
                                                                                                                                        c10699wt = new C10691wg();
                                                                                                                                        break;
                                                                                                                                    case EditingLanguage.TAJIK /* 1064 */:
                                                                                                                                        c10699wt = new C10690w8();
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (iM51923to) {
                                                                                                                                            case CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED /* 2020 */:
                                                                                                                                                c10699wt = new C10499jv(0);
                                                                                                                                                break;
                                                                                                                                            case 2021:
                                                                                                                                                c10699wt = new C10537m6();
                                                                                                                                                break;
                                                                                                                                            case ReadSmsConstant.FAIL /* 2022 */:
                                                                                                                                                c10699wt = new C10659tx(0);
                                                                                                                                                break;
                                                                                                                                            case 2023:
                                                                                                                                                c10699wt = new C10737yq();
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                c10699wt = new C10647td();
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                c10699wt = new C10634sc();
                                                break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c10699wt = new C10384c5();
        }
        c10699wt.m51413x1(abstractC10571o4);
        return c10699wt;
    }
}
