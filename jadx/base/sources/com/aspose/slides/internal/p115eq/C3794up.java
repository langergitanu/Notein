package com.aspose.slides.internal.p115eq;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3185jd;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p099e3.C3554m9;
import com.aspose.slides.internal.p136fr.C4116x1;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p270m9.C6335dy;
import com.aspose.slides.internal.p270m9.C6348to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p404sp.C10312kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p535yz.C13343k4;
import com.aspose.slides.internal.p535yz.C13347x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.up */
/* JADX INFO: loaded from: classes.dex */
public class C3794up {
    /* JADX INFO: renamed from: k4 */
    public static C12007ix m15154k4(C10312kk c10312kk, C12007ix c12007ix, C12007ix c12007ix2) {
        float fM56550c5;
        float fM56575x1;
        float fM56557jd = c12007ix2.m56557jd();
        float fM56551ck = c12007ix2.m56551ck();
        int iM50285x1 = c10312kk.m50285x1();
        if (!c12007ix.m56568kk()) {
            fM56550c5 = c12007ix2.m56550c5() / c12007ix.m56550c5();
            fM56575x1 = c12007ix2.m56575x1() / c12007ix.m56575x1();
            if (iM50285x1 != 0) {
                fM56550c5 = !c10312kk.m50284kk() ? C14116yg.m67504x1(fM56550c5, fM56575x1) : C14116yg.m67481k4(fM56550c5, fM56575x1);
                if (iM50285x1 == 8 || iM50285x1 == 5 || iM50285x1 == 2) {
                    fM56557jd = C22205OooOOo.OooO00o(c12007ix2, 2.0f, c12007ix2.m56557jd()) - (((c12007ix.m56550c5() / 2.0f) + c12007ix.m56557jd()) * fM56550c5);
                } else if (iM50285x1 == 9 || iM50285x1 == 6 || iM50285x1 == 3) {
                    fM56557jd = c12007ix2.m56550c5() - (c12007ix.m56550c5() * fM56550c5);
                }
                if (iM50285x1 == 6 || iM50285x1 == 5 || iM50285x1 == 4) {
                    fM56551ck = C22203OooOO0o.OooO0O0(c12007ix2, 2.0f, c12007ix2.m56551ck()) - (((c12007ix.m56575x1() / 2.0f) + c12007ix.m56551ck()) * fM56550c5);
                } else if (iM50285x1 == 9 || iM50285x1 == 8 || iM50285x1 == 7) {
                    fM56551ck = c12007ix2.m56575x1() - (c12007ix.m56575x1() * fM56550c5);
                }
            }
            return new C12007ix(c12007ix.m56557jd() + fM56557jd, c12007ix.m56551ck() + fM56551ck, c12007ix.m56550c5() * fM56550c5, c12007ix.m56575x1() * fM56575x1);
        }
        fM56550c5 = 1.0f;
        fM56575x1 = fM56550c5;
        return new C12007ix(c12007ix.m56557jd() + fM56557jd, c12007ix.m56551ck() + fM56551ck, c12007ix.m56550c5() * fM56550c5, c12007ix.m56575x1() * fM56575x1);
    }

    /* JADX INFO: renamed from: kk */
    public static String m15166kk(String str) {
        String strM67401k4 = C14113y2.m67401k4(str, "url(", C14113y2.f47374k4);
        if (strM67401k4.charAt(0) == '#') {
            strM67401k4 = C14113y2.m67396k4(strM67401k4, 0, 1);
        }
        int iM67429to = C14113y2.m67429to(strM67401k4, ')');
        return iM67429to > 0 ? C14113y2.m67443x1(strM67401k4, 0, iM67429to) : strM67401k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m15167x1(String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, " ", C14113y2.f47374k4), "\r", C14113y2.f47374k4), IOUtils.LINE_SEPARATOR_UNIX, C14113y2.f47374k4), "\t", C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m15168x1(C3181c5 c3181c5) {
        if (!c3181c5.f9461x1.containsKey("style")) {
            return true;
        }
        for (String str : C14113y2.m67417k4(c3181c5.f9461x1.get_Item("style").toString(), new String[]{";"}, 1)) {
            String[] strArrM67417k4 = C14113y2.m67417k4(str, new String[]{C18241k5.f55433h}, 1);
            String strM67440x1 = C14113y2.m67440x1(strArrM67417k4[0]);
            String strM67440x12 = C14113y2.f47374k4;
            if (strArrM67417k4.length > 1) {
                strM67440x12 = C14113y2.m67440x1(strArrM67417k4[1]);
            }
            if ("media".equals(strM67440x1) && !C14113y2.m67359c5(strM67440x12, "all") && !C14113y2.m67359c5(strM67440x12, "print") && !C14113y2.m67359c5(strM67440x12, "screen")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static C13343k4 m15155k4(C3181c5 c3181c5, String str) {
        if ("font".equals(c3181c5.f9456h4) && C14113y2.m67363du(c3181c5.f9461x1.get_Item("id"), str)) {
            return (C13343k4) c3181c5;
        }
        if (!c3181c5.m13639u4()) {
            return null;
        }
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c5.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                C13343k4 c13343k4M15155k4 = m15155k4(it.next().getValue(), str);
                if (c13343k4M15155k4 != null) {
                    return c13343k4M15155k4;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15156k4(C3181c5 c3181c5, C3783ck c3783ck) {
        for (int i = 0; i < c3181c5.m13628ar().m13697k4(); i++) {
            C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
            m15156k4(c3181c5M13702x1, c3783ck);
            C3554m9 c3554m9 = (C3554m9) C7019kk.m27452k4((Object) c3181c5M13702x1, C3554m9.class);
            if (c3554m9 != null) {
                c3181c5.m13628ar().m13701kk(i, c3554m9.m14462k4(c3783ck));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15157k4(C3181c5 c3181c5, C3783ck c3783ck, InterfaceC3793to interfaceC3793to) {
        if (C7019kk.m27469x1(c3181c5, C13347x1.class)) {
            m15163k4((C13347x1) c3181c5, c3783ck, interfaceC3793to);
            return;
        }
        if (C7019kk.m27469x1(c3181c5, C13343k4.class)) {
            c3783ck.m15118k4((C13343k4) c3181c5);
            return;
        }
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c5.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                C3181c5 value = it.next().getValue();
                m15157k4(value, c3783ck, interfaceC3793to);
                if (!C14113y2.m67411k4(value.m13641uz()) && !c3783ck.m15119x1().containsKey(value.m13641uz())) {
                    c3783ck.m15119x1().addItem(value.m13641uz(), value);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m15158k4(C3181c5 c3181c5, C3786fa c3786fa, C12015qq[] c12015qqArr, C10310jd c10310jd) {
        C12015qq c12015qq;
        float fM56550c5;
        if (!c3181c5.f9461x1.containsKey("width") || c3786fa.m15128k4(c3181c5.f9461x1.get_Item("width"), "width", c3181c5) <= c12015qqArr[0].m56699x1()) {
            if (c12015qqArr[0].m56699x1() <= 0.0f) {
                float f = C3185jd.f9464x1;
                if (f == -1.0f) {
                    c12015qq = c12015qqArr[0];
                    fM56550c5 = c10310jd != null ? c10310jd.m50276k4(c3786fa).m56550c5() : 500.0f;
                } else {
                    c12015qqArr[0].m56695k4(f);
                }
            }
            if (!c3181c5.f9461x1.containsKey("height") && c3786fa.m15128k4(c3181c5.f9461x1.get_Item("height"), "height", c3181c5) > c12015qqArr[0].m56697kk()) {
                c12015qqArr[0].m56700x1(c3786fa.m15128k4(c3181c5.f9461x1.get_Item("height"), "height", c3181c5));
                return;
            }
            if (c12015qqArr[0].m56697kk() > 0.0f) {
                float f2 = C3185jd.f9463k4;
                if (f2 == -1.0f) {
                    c12015qqArr[0].m56700x1(c10310jd != null ? c10310jd.m50276k4(c3786fa).m56575x1() : 500.0f);
                    return;
                } else {
                    c12015qqArr[0].m56700x1(f2);
                    return;
                }
            }
            return;
        }
        c12015qq = c12015qqArr[0];
        fM56550c5 = c3786fa.m15128k4(c3181c5.f9461x1.get_Item("width"), "width", c3181c5);
        c12015qq.m56695k4(fM56550c5);
        if (!c3181c5.f9461x1.containsKey("height")) {
        }
        if (c12015qqArr[0].m56697kk() > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15159k4(C3181c5 c3181c5, C3792m9 c3792m9, boolean z) {
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it;
        if ("style".equals(c3181c5.f9456h4)) {
            C6765kp c6765kp = new C6765kp();
            it = c3181c5.m13628ar().iterator();
            while (it.hasNext()) {
                try {
                    c6765kp.m26792k4(((C10229k4) it.next().getValue()).f36669dy);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            c3792m9.m15152k4(c6765kp.toString());
        }
        it = c3181c5.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                m15159k4(it.next().getValue(), c3792m9, z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15160k4(C3181c5 c3181c5, InterfaceC3793to interfaceC3793to, C3787h4 c3787h4) {
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it;
        InterfaceC5775ar interfaceC5775arMo25989k4;
        if ("style".equals(c3181c5.f9456h4)) {
            C6765kp c6765kp = new C6765kp();
            it = c3181c5.m13628ar().iterator();
            while (it.hasNext()) {
                try {
                    c6765kp.m26792k4(((C10229k4) it.next().getValue()).f36669dy);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            interfaceC5775arMo25989k4 = new C6335dy().m25937k4(null, new C6348to(interfaceC3793to)).mo25989k4(c6765kp.toString());
        } else {
            if (!"link".equals(c3181c5.f9456h4)) {
                it = c3181c5.m13628ar().iterator();
                while (it.hasNext()) {
                    try {
                        C3181c5 value = it.next().getValue();
                        if (value != null) {
                            m15160k4(value, interfaceC3793to, c3787h4);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                    return;
                }
                return;
            }
            if (!c3181c5.f9461x1.containsKey(C18437z2.f56754h) || !"text/css".equals(c3181c5.f9461x1.get_Item(C18437z2.f56754h)) || !c3181c5.f9461x1.containsKey("rel") || !"stylesheet".equals(c3181c5.f9461x1.get_Item("rel")) || !c3181c5.f9461x1.containsKey("href")) {
                return;
            }
            interfaceC5775arMo25989k4 = new C6335dy().m25937k4(null, new C6348to(interfaceC3793to)).mo25989k4(AbstractC6747ar.m26650yj().m26681x1(interfaceC3793to.mo14413k4(c3181c5, new C5811wp(c3181c5.f9461x1.get_Item("href"))).m23692k4()));
        }
        c3787h4.m15135k4(interfaceC5775arMo25989k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15161k4(C3181c5 c3181c5, String str, String str2, boolean z) {
        C3187kk c3187kk;
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c5.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Integer, C3181c5> next = it.next();
                C3181c5 value = next.getValue();
                if ("transform".equals(str)) {
                    if (value.f9461x1.containsKey("transform")) {
                        value.f9461x1.set_Item(str, C14113y2.m67408k4(str2, " ", value.f9461x1.get_Item("transform").toString()));
                    } else {
                        value.f9461x1.set_Item(str, str2);
                    }
                } else if ("x".equals(str) || "y".equals(str)) {
                    if (("g".equals(c3181c5.f9456h4) || "svg".equals(c3181c5.f9456h4) || "symbol".equals(c3181c5.f9456h4) || "image".equals(c3181c5.f9456h4)) && !next.getValue().f9461x1.containsKey(str)) {
                        c3187kk = next.getValue().f9461x1;
                        c3187kk.m13684k4(str, str2);
                    }
                } else if (!"clip-path".equals(str) && (!next.getValue().f9461x1.containsKey(str) || z)) {
                    if (z && next.getValue().f9461x1.containsKey(str)) {
                        next.getValue().f9461x1.m13696x1(str);
                    }
                    c3187kk = next.getValue().f9461x1;
                    c3187kk.m13684k4(str, str2);
                }
                if ("bounding-box-width".equals(str)) {
                    next.getValue().f9461x1.set_Item("bounding-box-width", str2);
                }
                if ("bounding-box-height".equals(str)) {
                    next.getValue().f9461x1.set_Item("bounding-box-height", str2);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15162k4(C3181c5 c3181c5, boolean z, Dictionary<String, IGenericDictionary<String, String>> dictionary) {
        if ("defs".equals(c3181c5.f9456h4)) {
            return;
        }
        String str = C14113y2.f47374k4;
        List list = new List(AbstractC14092to.m67204k4((Object[]) new String[]{"svg", "g", AbstractJwtRequest.ClaimNames.USE}));
        if (c3181c5.f9461x1.containsKey("xlink:href")) {
            String string = c3181c5.f9461x1.get_Item("xlink:href").toString();
            if (list.containsItem(c3181c5.f9456h4) && C14113y2.m67448x1(string, "#")) {
                dictionary.set_Item(C14113y2.m67396k4(string, 0, 1), c3181c5.f9461x1);
            }
        }
        if (c3181c5.f9461x1.containsKey("id")) {
            String string2 = c3181c5.f9461x1.get_Item("id").toString();
            if (dictionary.containsKey(string2)) {
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it = dictionary.get_Item(string2).iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair keyValuePair = (KeyValuePair) it.next();
                        if (!c3181c5.f9461x1.containsKey((String) keyValuePair.getKey())) {
                            c3181c5.f9461x1.set_Item((String) keyValuePair.getKey(), (String) keyValuePair.getValue());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
        if (c3181c5.f9461x1.containsKey("width") && list.containsItem(c3181c5.f9456h4)) {
            C3187kk c3187kk = c3181c5.f9461x1;
            c3187kk.set_Item("bounding-box-width", c3187kk.get_Item("width").toString());
        }
        if (c3181c5.f9461x1.containsKey("height") && list.containsItem(c3181c5.f9456h4)) {
            C3187kk c3187kk2 = c3181c5.f9461x1;
            c3187kk2.set_Item("bounding-box-height", c3187kk2.get_Item("height").toString());
        }
        if (c3181c5.f9461x1.containsKey("color") && C14113y2.m67363du("inherit", c3181c5.f9461x1.get_Item("color"))) {
            c3181c5.f9461x1.set_Item("color", c3181c5.m13638qq().f9461x1.containsKey("color") ? c3181c5.m13638qq().f9461x1.get_Item("color") : "black");
        }
        if ("text".equals(c3181c5.f9456h4) && !c3181c5.f9461x1.containsKey("fill") && !c3181c5.f9461x1.containsKey("stroke")) {
            c3181c5.f9461x1.m13684k4("fill", "#000000");
        }
        String[] strArr = {"fill", "stroke", "stop-color", "flood-color", "lighting-color"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (c3181c5.f9461x1.containsKey(str2) && "currentColor".equals(c3181c5.f9461x1.get_Item(str2))) {
                C3187kk c3187kk3 = c3181c5.f9461x1;
                c3187kk3.set_Item(str2, c3187kk3.containsKey("color") ? c3181c5.f9461x1.get_Item("color") : "black");
            }
        }
        IGenericEnumerator<KeyValuePair<String, String>> it2 = c3181c5.f9461x1.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair<String, String> next = it2.next();
                String string3 = next.getKey().toString();
                String string4 = next.getValue().toString();
                if ("style".equals(next.getKey().toString()) || "class".equals(next.getKey().toString())) {
                    String strM15153x1 = C14113y2.f47374k4;
                    if ("style".equals(next.getKey().toString())) {
                        strM15153x1 = next.getValue().toString();
                    } else if ("class".equals(next.getKey().toString())) {
                        strM15153x1 = new C3792m9().m15153x1(next.getValue().toString());
                    }
                    for (String str3 : C14113y2.m67417k4(strM15153x1, new String[]{";"}, 1)) {
                        String[] strArrM67417k4 = C14113y2.m67417k4(str3, new String[]{C18241k5.f55433h}, 1);
                        if (strArrM67417k4.length >= 2) {
                            String strM67440x1 = C14113y2.m67440x1(strArrM67417k4[0]);
                            String strM67440x12 = C14113y2.m67440x1(strArrM67417k4[1]);
                            if (C12565ks.m58621k4(",x,y,width,height,fill,fill-rule,fill-opacity,stroke,stroke-width,stroke-opacity,font-size,font-family,font-weight,font-variant,opacity,cap-height,rotate,text-anchor,x,y,glyph-orientation-horizontal,glyph-orientation-vertical,bounding-box-width,bounding-box-height,view-clip-id,clip-path,color,visibility,display,transform,", C14113y2.m67408k4(",", strM67440x1, ","), true)) {
                                m15161k4(c3181c5, strM67440x1, strM67440x12, z);
                            }
                        }
                    }
                } else if (C12565ks.m58621k4(",x,y,width,height,fill,fill-rule,fill-opacity,stroke,stroke-width,stroke-opacity,font-size,font-family,font-weight,font-variant,opacity,cap-height,rotate,text-anchor,x,y,glyph-orientation-horizontal,glyph-orientation-vertical,bounding-box-width,bounding-box-height,view-clip-id,clip-path,color,visibility,display,transform,", C14113y2.m67408k4(",", next.getKey().toString(), ","), true)) {
                    m15161k4(c3181c5, string3, string4, z);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it3 = c3181c5.m13628ar().iterator();
        while (it3.hasNext()) {
            try {
                m15162k4(it3.next().getValue(), z, dictionary);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15163k4(C13347x1 c13347x1, C3783ck c3783ck, InterfaceC3793to interfaceC3793to) {
        C5801ss c5801ssMo14413k4;
        C13343k4 c13343k4M15155k4;
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c13347x1.m13628ar().iterator();
        while (it.hasNext()) {
            try {
                C3181c5 value = it.next().getValue();
                if ("font-face-src".equals(value.f9456h4)) {
                    IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it2 = value.m13628ar().iterator();
                    while (it2.hasNext()) {
                        try {
                            C3181c5 value2 = it2.next().getValue();
                            if ("font-face-uri".equals(value2.f9456h4) && value2.f9461x1.containsKey("xlink:href")) {
                                String[] strArrM67414k4 = C14113y2.m67414k4(value2.f9461x1.get_Item("xlink:href"), '#');
                                if (interfaceC3793to != null && (c5801ssMo14413k4 = interfaceC3793to.mo14413k4(value2, new C5811wp(strArrM67414k4[0]))) != null && (c13343k4M15155k4 = m15155k4(C4116x1.m16477k4(c5801ssMo14413k4.m23693x1().m26681x1(c5801ssMo14413k4.m23692k4())).f9466h4, strArrM67414k4[1])) != null) {
                                    c3783ck.m15118k4(c13343k4M15155k4);
                                }
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
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
    public static boolean m15164k4(C3181c5 c3181c5) {
        return ("style".equals(c3181c5.f9456h4) || "defs".equals(c3181c5.f9456h4) || "tref".equals(c3181c5.f9456h4) || "altGlyph".equals(c3181c5.f9456h4) || "pattern".equals(c3181c5.f9456h4) || "symbol".equals(c3181c5.f9456h4) || RequestParameters.MARKER.equals(c3181c5.f9456h4) || "clipPath".equals(c3181c5.f9456h4) || "mask".equals(c3181c5.f9456h4)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m15165k4(String str) {
        return (str == null || C14113y2.m67411k4(C14113y2.m67440x1(str)) || C14113y2.m67432to("none", C14113y2.m67440x1(str), (short) 3)) ? false : true;
    }
}
