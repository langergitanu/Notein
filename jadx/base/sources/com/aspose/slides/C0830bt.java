package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.bt */
/* JADX INFO: loaded from: classes3.dex */
class C0830bt {
    /* JADX WARN: Removed duplicated region for block: B:51:0x025f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4307k4(klp klpVar) {
        C13791lr c13791lr;
        long j;
        long j2;
        C13791lr c13791lr2;
        C10462h9 c10462h9M70140fa = klpVar.m63999x1().m70140fa();
        kp9 kp9VarM2944dy = klpVar.m63996m9().f3519k4.m2944dy();
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        kp9VarM2944dy.f45826x1 = dictionary;
        List list = new List();
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10462h9M70140fa.mo50859du().m51263x1().m50923k4(StyleIdentifier.LIST_TABLE_6_COLORFUL), C10609qn.class);
        String strM67402k4 = dictionary.size() != 0 ? C14113y2.m67402k4("adj{0}", Integer.valueOf(dictionary.size() + 1)) : "adj";
        byte bM64091k4 = kp9VarM2944dy.m64091k4();
        if (bM64091k4 == 1) {
            if (c10609qn != null) {
                dictionary.set_Item(strM67402k4, Integer.valueOf(dictionary.size() + 1));
                c13791lr = new C13791lr(strM67402k4, C14113y2.m67408k4("val ", C14057f9.m66591x1((int) ((((c10609qn.m51597ar() & 4294967295L) * 50000) & 4294967295L) / 10800))));
                list.addItem(c13791lr);
            }
        } else if (bM64091k4 == 9) {
            dictionary.set_Item(strM67402k4, Integer.valueOf(dictionary.size() + 1));
            list.addItem(new C13791lr(strM67402k4, "val 10800000"));
            if (c10609qn != null) {
                ((C13791lr) list.get_Item(0)).m64506k4(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to((((int) c10609qn.m51597ar()) / 65536.0f) * 60000.0f)), 14));
                if (((C13791lr) list.get_Item(0)).m64504k4() < 0) {
                    ((C13791lr) list.get_Item(0)).m64506k4(((C13791lr) list.get_Item(0)).m64504k4() + 21600000);
                }
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) klpVar.m63999x1().m70148u4(), AutoShape.class);
                if (autoShape != null) {
                    double dM64511x1 = ((double) (((C13791lr) list.get_Item(0)).m64511x1() / 180.0f)) * 3.141592653589793d;
                    j = 21600000;
                    j2 = 0;
                    ((C13791lr) list.get_Item(0)).m64506k4(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to((C14116yg.m67498to(((double) autoShape.getHeight()) * C14116yg.m67495m9(dM64511x1), C14116yg.m67470dy(dM64511x1) * ((double) autoShape.getWidth())) / 3.141592653589793d) * 180.0d * 60000.0d)), 14));
                } else {
                    j = 21600000;
                    j2 = 0;
                }
                if (((C13791lr) list.get_Item(0)).m64504k4() < j2) {
                    ((C13791lr) list.get_Item(0)).m64506k4(((C13791lr) list.get_Item(0)).m64504k4() + j);
                }
            }
        } else if (bM64091k4 != 17) {
            if (bM64091k4 != 23) {
                if (bM64091k4 != 26 && bM64091k4 != 28) {
                    if (bM64091k4 == 37) {
                        if (c10609qn == null) {
                            dictionary.set_Item(strM67402k4, Integer.valueOf(dictionary.size() + 1));
                            c13791lr2 = new C13791lr(strM67402k4, "val 55556");
                        } else if ((c10609qn.m51597ar() & 4294967295L) == 6924) {
                            dictionary.set_Item(strM67402k4, Integer.valueOf(dictionary.size() + 1));
                            c13791lr2 = new C13791lr(strM67402k4, "val 32056");
                        }
                        list.addItem(c13791lr2);
                    } else if (bM64091k4 == 39) {
                        dictionary.set_Item(strM67402k4, Integer.valueOf(dictionary.size() + 1));
                        c13791lr2 = new C13791lr(strM67402k4, "val 44444");
                        list.addItem(c13791lr2);
                    } else if (bM64091k4 != 20) {
                        if (bM64091k4 == 21 && c10609qn == null) {
                            String strM67402k42 = C14113y2.m67402k4("adj{0}", Integer.valueOf(dictionary.size() + 1));
                            dictionary.set_Item(strM67402k42, Integer.valueOf(dictionary.size() + 1));
                            list.addItem(new C13791lr(strM67402k42, "val 13005"));
                            String strM67402k43 = C14113y2.m67402k4("adj{0}", Integer.valueOf(dictionary.size() + 1));
                            dictionary.set_Item(strM67402k43, Integer.valueOf(dictionary.size() + 1));
                            c13791lr = new C13791lr(strM67402k43, "val 0");
                            list.addItem(c13791lr);
                        }
                    }
                }
            } else if (c10609qn == null) {
                String strM67402k44 = C14113y2.m67402k4("adj{0}", Integer.valueOf(dictionary.size() + 1));
                dictionary.set_Item(strM67402k44, Integer.valueOf(dictionary.size() + 1));
                list.addItem(new C13791lr(strM67402k44, "val 6500"));
                String strM67402k45 = C14113y2.m67402k4("adj{0}", Integer.valueOf(dictionary.size() + 1));
                dictionary.set_Item(strM67402k45, Integer.valueOf(dictionary.size() + 1));
                c13791lr = new C13791lr(strM67402k45, "val 0");
                list.addItem(c13791lr);
            }
        }
        kp9VarM2944dy.f45823k4 = (C13791lr[]) list.toArray(new C13791lr[0]);
    }
}
