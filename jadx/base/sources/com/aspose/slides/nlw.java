package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class nlw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static Dictionary<String, byte[]> m68080k4(Presentation presentation, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        C14318pw.m69319k4(kiw.m63915x1(xamlOptions).mo4303k4(xamlOptions), dictionary);
        C14318pw.m69319k4(kiw.m63914kk(xamlOptions).mo7670k4(presentation, xamlOptions, interruptionToken), dictionary);
        List list = new List();
        InterfaceC14691vk interfaceC14691vkM63913k4 = kiw.m63913k4(xamlOptions);
        List<String>[] listArr = {list};
        Dictionary<String, byte[]> dictionaryMo7187k4 = interfaceC14691vkM63913k4.mo7187k4(presentation, xamlOptions, listArr, interruptionToken);
        List<String> list2 = listArr[0];
        C14318pw.m69319k4(dictionaryMo7187k4, dictionary);
        if (list2 != null && list2.size() > 0) {
            C13716k7 c13716k7 = new C13716k7();
            String strM67408k4 = C14113y2.m67408k4(xamlOptions.m3098h4(), ".csproj");
            String str = C14113y2.f47374k4;
            List list3 = new List();
            String strMo7188k4 = interfaceC14691vkM63913k4.mo7188k4(list2);
            Dictionary.Enumerator<String, byte[]> it = dictionary.iterator();
            byte[] bArr = null;
            byte[] bArr2 = null;
            String str2 = str;
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    if (C14113y2.m67359c5((String) next.getKey(), strM67408k4)) {
                        str = (String) next.getKey();
                        bArr = (byte[]) next.getValue();
                    }
                    if (C14113y2.m67359c5((String) next.getKey(), "MainWindow.xaml.cs")) {
                        String str3 = (String) next.getKey();
                        bArr2 = (byte[]) next.getValue();
                        str2 = str3;
                    }
                    List<String> list4 = list2;
                    if (!C14113y2.m67448x1((String) next.getKey(), C14113y2.m67408k4(xamlOptions.m3094du(), "\\"))) {
                        list3.addItem(next.getKey());
                    }
                    list2 = list4;
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            List<String> list5 = list2;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            List.Enumerator it2 = list3.iterator();
            while (it2.hasNext()) {
                try {
                    String str4 = (String) it2.next();
                    byte[] bArr3 = dictionary.get_Item(str4);
                    String strM13412x1 = C3141rv.m13412x1(xamlOptions.m3110rv(), str4);
                    dictionary.removeItemByKey(str4);
                    dictionary.addItem(strM13412x1, bArr3);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            if (!C14113y2.m67411k4(str) && bArr != null) {
                String strM73603k4 = C14817xt.m73603k4(bArr);
                List.Enumerator<String> it3 = list5.iterator();
                while (it3.hasNext()) {
                    try {
                        strM73603k4 = c13716k7.mo63707k4(strM73603k4, it3.next());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    try {
                        strM73603k4 = c13716k7.mo63708kk(strM73603k4, (String) it2.next());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                byte[] bArrM73604k4 = C14817xt.m73604k4(strM73603k4);
                dictionary.removeItemByKey(str);
                dictionary.addItem(str, bArrM73604k4);
            }
            if (!C14113y2.m67411k4(str2) && bArr2 != null && xamlOptions.m3096dy()) {
                byte[] bArrM73604k42 = C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14817xt.m73603k4(bArr2), "{Cases}", strMo7188k4), "{SlidesCount}", C14057f9.m66591x1(x5q.m73146k4(presentation.getSlides(), xamlOptions))));
                dictionary.removeItemByKey(str2);
                dictionary.addItem(str2, bArrM73604k42);
                return dictionary;
            }
        }
        return dictionary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    private static Dictionary<String, byte[]> m68083kk(Presentation presentation, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        C14318pw.m69319k4(kiw.m63915x1(xamlOptions).mo4303k4(xamlOptions), dictionary);
        C14318pw.m69319k4(kiw.m63914kk(xamlOptions).mo7670k4(presentation, xamlOptions, interruptionToken), dictionary);
        List list = new List();
        InterfaceC14691vk interfaceC14691vkM63913k4 = kiw.m63913k4(xamlOptions);
        List<String>[] listArr = {list};
        Dictionary<String, byte[]> dictionaryMo7187k4 = interfaceC14691vkM63913k4.mo7187k4(presentation, xamlOptions, listArr, interruptionToken);
        List<String> list2 = listArr[0];
        C14318pw.m69319k4(dictionaryMo7187k4, dictionary);
        if (list2 != null && list2.size() > 0) {
            C13716k7 c13716k7 = new C13716k7();
            String strM67408k4 = C14113y2.m67408k4(C14113y2.m67408k4(xamlOptions.m3098h4(), ".Android"), ".csproj");
            String str = C14113y2.f47374k4;
            List list3 = new List();
            String strMo7188k4 = interfaceC14691vkM63913k4.mo7188k4(list2);
            Dictionary.Enumerator<String, byte[]> it = dictionary.iterator();
            byte[] bArr = null;
            byte[] bArr2 = null;
            String str2 = str;
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    if (C14113y2.m67359c5((String) next.getKey(), strM67408k4)) {
                        str2 = (String) next.getKey();
                        bArr2 = (byte[]) next.getValue();
                    }
                    if (C14113y2.m67359c5((String) next.getKey(), "MainPage.xaml.cs")) {
                        String str3 = (String) next.getKey();
                        bArr = (byte[]) next.getValue();
                        str = str3;
                    }
                    String str4 = strM67408k4;
                    if (!C14113y2.m67448x1((String) next.getKey(), C14113y2.m67408k4(xamlOptions.m3094du(), "\\"))) {
                        list3.addItem(next.getKey());
                    }
                    strM67408k4 = str4;
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
            List.Enumerator it2 = list3.iterator();
            while (it2.hasNext()) {
                try {
                    String str5 = (String) it2.next();
                    byte[] bArr3 = dictionary.get_Item(str5);
                    List list4 = list3;
                    String strM13412x1 = C3141rv.m13412x1(C3141rv.m13412x1(C3141rv.m13412x1(C3141rv.m13412x1(xamlOptions.m3094du(), xamlOptions.m3098h4()), C14113y2.m67408k4(xamlOptions.m3098h4(), ".Android")), "Resources\\drawable"), str5);
                    dictionary.removeItemByKey(str5);
                    dictionary.addItem(strM13412x1, bArr3);
                    list3 = list4;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            List list5 = list3;
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            if (!C14113y2.m67411k4(str2) && bArr2 != null) {
                String strM73603k4 = C14817xt.m73603k4(bArr2);
                it2 = list5.iterator();
                while (it2.hasNext()) {
                    try {
                        strM73603k4 = c13716k7.mo63709x1(strM73603k4, C3141rv.m13412x1("Resources\\drawable", (String) it2.next()));
                    } finally {
                    }
                }
                byte[] bArrM73604k4 = C14817xt.m73604k4(strM73603k4);
                dictionary.removeItemByKey(str2);
                dictionary.addItem(str2, bArrM73604k4);
            }
            if (!C14113y2.m67411k4(str) && bArr != null && xamlOptions.m3096dy()) {
                byte[] bArrM73604k42 = C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14817xt.m73603k4(bArr), "{Cases}", strMo7188k4), "{SlidesCount}", C14057f9.m66591x1(x5q.m73146k4(presentation.getSlides(), xamlOptions))));
                dictionary.removeItemByKey(str);
                dictionary.addItem(str, bArrM73604k42);
                return dictionary;
            }
        }
        return dictionary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    private static Dictionary<String, byte[]> m68084to(Presentation presentation, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        Dictionary<String, byte[]> dictionaryMo7670k4 = kiw.m63914kk(xamlOptions).mo7670k4(presentation, xamlOptions, interruptionToken);
        List list = new List();
        Dictionary.Enumerator<String, byte[]> it = dictionaryMo7670k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!C14113y2.m67448x1((String) next.getKey(), C14113y2.m67408k4(xamlOptions.m3110rv(), "\\"))) {
                    list.addItem(next.getKey());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                String str = (String) it2.next();
                byte[] bArr = dictionaryMo7670k4.get_Item(str);
                String strM13412x1 = C3141rv.m13412x1(xamlOptions.m3110rv(), str);
                dictionaryMo7670k4.removeItemByKey(str);
                dictionaryMo7670k4.addItem(strM13412x1, bArr);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return dictionaryMo7670k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, byte[]> m68085x1(Presentation presentation, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        Dictionary<String, byte[]> dictionaryMo7670k4 = kiw.m63914kk(xamlOptions).mo7670k4(presentation, xamlOptions, interruptionToken);
        List list = new List();
        Dictionary.Enumerator<String, byte[]> it = dictionaryMo7670k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!C14113y2.m67448x1((String) next.getKey(), C14113y2.m67408k4(xamlOptions.m3110rv(), "\\"))) {
                    list.addItem(next.getKey());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                String str = (String) it2.next();
                byte[] bArr = dictionaryMo7670k4.get_Item(str);
                String strM13412x1 = C3141rv.m13412x1(xamlOptions.m3110rv(), str);
                dictionaryMo7670k4.removeItemByKey(str);
                dictionaryMo7670k4.addItem(strM13412x1, bArr);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return dictionaryMo7670k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68081k4(Presentation presentation) {
        return C14113y2.m67411k4(presentation.f3114x1) ? "" : C3141rv.m13411x1(presentation.f3114x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m68086x1(Presentation presentation, int[] iArr, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        C14322q0 c14322q0;
        if (C14113y2.m67411k4(xamlOptions.m3109m9())) {
            xamlOptions.m3104k4("Slide");
        }
        if (xamlOptions.m3114x1().m56699x1() == 0.0f || xamlOptions.m3114x1().m56697kk() == 0.0f) {
            xamlOptions.m3102k4(new C12015qq(((SlideSize) presentation.getSlideSize()).m2755k4().m56699x1(), ((SlideSize) presentation.getSlideSize()).m2755k4().m56697kk()));
        }
        if (xamlOptions.getProgressCallback() != null) {
            c14322q0 = new C14322q0(xamlOptions.getProgressCallback());
            c14322q0.mo7217k4(presentation, iArr);
        } else {
            c14322q0 = null;
        }
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        int iM3111to = xamlOptions.m3111to();
        if (iM3111to == 0) {
            xamlOptions.m3117x1(C3141rv.m13412x1(xamlOptions.m3094du(), xamlOptions.m3098h4()));
            dictionary = m68083kk(presentation, xamlOptions, interruptionToken);
        } else if (iM3111to == 1) {
            xamlOptions.m3117x1(m68081k4(presentation));
            dictionary = m68084to(presentation, xamlOptions, interruptionToken);
        }
        Dictionary.Enumerator<String, byte[]> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                xamlOptions.getOutputSaver().save((String) next.getKey(), (byte[]) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (c14322q0 != null) {
            c14322q0.mo7216k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68082k4(Presentation presentation, int[] iArr, XamlOptions xamlOptions, InterruptionToken interruptionToken) {
        C14322q0 c14322q0;
        if (C14113y2.m67411k4(xamlOptions.m3109m9())) {
            xamlOptions.m3104k4("Slide");
        }
        if (xamlOptions.m3114x1().m56699x1() == 0.0f || xamlOptions.m3114x1().m56697kk() == 0.0f) {
            xamlOptions.m3102k4(new C12015qq(((SlideSize) presentation.getSlideSize()).m2755k4().m56699x1(), ((SlideSize) presentation.getSlideSize()).m2755k4().m56697kk()));
        }
        if (xamlOptions.getProgressCallback() != null) {
            c14322q0 = new C14322q0(xamlOptions.getProgressCallback());
            c14322q0.mo7217k4(presentation, iArr);
        } else {
            c14322q0 = null;
        }
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        int iM3111to = xamlOptions.m3111to();
        if (iM3111to == 0) {
            xamlOptions.m3117x1(C3141rv.m13412x1(xamlOptions.m3094du(), xamlOptions.m3098h4()));
            dictionary = m68080k4(presentation, xamlOptions, interruptionToken);
        } else if (iM3111to == 1) {
            xamlOptions.m3117x1(m68081k4(presentation));
            dictionary = m68085x1(presentation, xamlOptions, interruptionToken);
        }
        Dictionary.Enumerator<String, byte[]> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                xamlOptions.getOutputSaver().save((String) next.getKey(), (byte[]) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (c14322q0 != null) {
            c14322q0.mo7216k4();
        }
    }
}
