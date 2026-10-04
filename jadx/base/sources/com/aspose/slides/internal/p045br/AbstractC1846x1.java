package com.aspose.slides.internal.p045br;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.br.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1846x1 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<String, String> f6685kk;

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, String> f6686to;

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, String> f6687k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, Integer> f6688x1 = new Dictionary<>();

    static {
        Dictionary<String, String> dictionary = new Dictionary<>();
        f6685kk = dictionary;
        f6686to = new Dictionary<>();
        m9626k4(".notdef", "");
        m9626k4(TranslateLanguage.FINNISH, TranslateLanguage.FINNISH);
        m9626k4("fl", "fl");
        m9626k4("ffi", "ffi");
        m9626k4("ff", "ff");
        m9626k4(ContextChain.TAG_PRODUCT_AND_INFRA, ContextChain.TAG_PRODUCT_AND_INFRA);
        Dictionary.Enumerator<String, String> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                m9628x1((String) next.getValue(), (String) next.getKey());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m9624k4(int i, int i2) {
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 *= i;
            }
            i *= i;
            i2 >>= 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: kk */
    private int m9627kk(int i) {
        String strM66591x1 = C14057f9.m66591x1(i);
        int iM9625k4 = 0;
        for (int i2 = 0; i2 < strM66591x1.length(); i2++) {
            iM9625k4 += m9625k4(strM66591x1.charAt((strM66591x1.length() - 1) - i2)) * m9624k4(8, i2);
        }
        return iM9625k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m9632x1(int i) {
        String strM9629k4 = m9629k4(i);
        if (strM9629k4 != null) {
            return m9630k4(strM9629k4);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m9629k4(int i) {
        return !this.f6687k4.containsKey(Integer.valueOf(i)) ? C14113y2.f47374k4 : this.f6687k4.get_Item(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9633x1(int i, String str) {
        if (this.f6687k4.containsKey(Integer.valueOf(i))) {
            this.f6687k4.set_Item(Integer.valueOf(i), str);
        } else {
            this.f6687k4.addItem(Integer.valueOf(i), str);
        }
        if (this.f6688x1.containsKey(str)) {
            this.f6688x1.set_Item(str, Integer.valueOf(i));
        } else {
            this.f6688x1.addItem(str, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m9628x1(String str, String str2) {
        Dictionary<String, String> dictionary = f6686to;
        if (dictionary.containsKey(str)) {
            dictionary.set_Item(str, str2);
        } else {
            dictionary.addItem(str, str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m9630k4(String str) {
        Dictionary<String, String> dictionary = f6685kk;
        String str2 = dictionary.containsKey(str) ? dictionary.get_Item(str) : null;
        if (str2 != null) {
            return str2;
        }
        if (C14113y2.m67429to(str, FilenameUtils.EXTENSION_SEPARATOR) > 0) {
            return m9630k4(C14113y2.m67443x1(str, 0, C14113y2.m67429to(str, FilenameUtils.EXTENSION_SEPARATOR)));
        }
        if (!C14113y2.m67448x1(str, "uni")) {
            if (!C14113y2.m67448x1(str, "u")) {
                return this.f6688x1.containsKey(str) ? C14117yj.m67537ne((char) this.f6688x1.get_Item(str).intValue()) : str;
            }
            int iM67044x1 = C14080ne.m67044x1(C14113y2.m67422kk(str, 1), 16);
            if (iM67044x1 > 55295 && iM67044x1 < 57344) {
                return str2;
            }
            String strM66986ks = C14080ne.m66986ks(Character.valueOf((char) iM67044x1));
            m9626k4(str, strM66986ks);
            return strM66986ks;
        }
        int length = str.length();
        C6765kp c6765kp = new C6765kp();
        int i = 3;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                String string = c6765kp.toString();
                m9626k4(str, string);
                return string;
            }
            try {
                int iM67044x12 = C14080ne.m67044x1(C14113y2.m67443x1(str, i, i2), 16);
                if (iM67044x12 <= 55295 || iM67044x12 >= 57344) {
                    c6765kp.m26780k4((char) iM67044x12);
                }
                i = i2;
            } catch (FormatException | RuntimeException unused) {
                return str;
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private short m9625k4(char c) {
        switch (c) {
            case '0':
                return (short) 0;
            case '1':
                return (short) 1;
            case '2':
                return (short) 2;
            case '3':
                return (short) 3;
            case '4':
                return (short) 4;
            case '5':
                return (short) 5;
            case '6':
                return (short) 6;
            case '7':
                return (short) 7;
            case '8':
                return (short) 8;
            case '9':
                return (short) 9;
            default:
                throw new InvalidOperationException(C14113y2.m67402k4("Could not convert the character {0} to a short.", Character.valueOf(c)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9631k4(int i, String str) {
        m9633x1(m9627kk(i), str);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m9626k4(String str, String str2) {
        Dictionary<String, String> dictionary = f6685kk;
        if (dictionary.containsKey(str)) {
            dictionary.set_Item(str, str2);
        } else {
            dictionary.addItem(str, str2);
        }
    }
}
