package com.aspose.slides.internal.p474wg;

import androidx.core.content.OooO0O0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Specialized.NameObjectCollectionBase;
import com.aspose.slides.Collections.Specialized.NameValueCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.EditingLanguage;
import com.google.common.net.HttpHeaders;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.u1 */
/* JADX INFO: loaded from: classes5.dex */
public class C11973u1 extends NameValueCollection {

    /* JADX INFO: renamed from: k4 */
    static final boolean[] f40367k4 = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, true, false, false, false, true, true, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false};

    /* JADX INFO: renamed from: x1 */
    static final Dictionary<String, Integer> f40368x1;

    /* JADX INFO: renamed from: kk */
    private int f40369kk;

    /* JADX INFO: renamed from: to */
    private int f40370to;

    static {
        Dictionary<String, Integer> dictionary = new Dictionary<>(AbstractC14070jw.m66789to());
        f40368x1 = dictionary;
        dictionary.addItem(HttpHeaders.ALLOW, 1024);
        dictionary.addItem("Accept", 1025);
        dictionary.addItem(HttpHeaders.ACCEPT_CHARSET, 1024);
        dictionary.addItem(HttpHeaders.ACCEPT_ENCODING, 1024);
        dictionary.addItem(HttpHeaders.ACCEPT_LANGUAGE, 1024);
        dictionary.addItem(HttpHeaders.ACCEPT_RANGES, 1024);
        dictionary.addItem("Authorization", 1024);
        dictionary.addItem("Cache-Control", 1024);
        dictionary.addItem(HttpHeaders.COOKIE, 1024);
        dictionary.addItem(HttpHeaders.CONNECTION, 1025);
        dictionary.addItem("Content-Encoding", 1024);
        dictionary.addItem("Content-Length", 3);
        dictionary.addItem("Content-Type", 1);
        dictionary.addItem(HttpHeaders.CONTENT_LANGUAGE, 1024);
        dictionary.addItem("Date", 1);
        dictionary.addItem(HttpHeaders.EXPECT, 1025);
        dictionary.addItem("Host", 1);
        dictionary.addItem("If-Match", 1024);
        dictionary.addItem("If-Modified-Since", 1);
        dictionary.addItem("If-None-Match", 1024);
        dictionary.addItem(HttpHeaders.KEEP_ALIVE, 2);
        dictionary.addItem(HttpHeaders.PRAGMA, 1024);
        dictionary.addItem(HttpHeaders.PROXY_AUTHENTICATE, 1024);
        dictionary.addItem(HttpHeaders.PROXY_AUTHORIZATION, 1024);
        dictionary.addItem("Proxy-Connection", 1025);
        dictionary.addItem("Range", 1025);
        dictionary.addItem(HttpHeaders.REFERER, 1);
        dictionary.addItem(HttpHeaders.SET_COOKIE, 1024);
        dictionary.addItem(HttpHeaders.SET_COOKIE2, 1024);
        dictionary.addItem(HttpHeaders.f51754TE, 1024);
        dictionary.addItem(HttpHeaders.TRAILER, 1024);
        dictionary.addItem(HttpHeaders.TRANSFER_ENCODING, Integer.valueOf(EditingLanguage.CATALAN));
        dictionary.addItem(HttpHeaders.UPGRADE, 1024);
        dictionary.addItem("User-Agent", 1);
        dictionary.addItem(HttpHeaders.VARY, 1024);
        dictionary.addItem(HttpHeaders.VIA, 1024);
        dictionary.addItem(HttpHeaders.WARNING, 1024);
        dictionary.addItem("WWW-Authenticate", Integer.valueOf(EditingLanguage.BULGARIAN));
    }

    public C11973u1() {
        this.f40369kk = 0;
        this.f40370to = 0;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m56147h4(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > '~' || !f40367k4[C7019kk.m27462to(Character.valueOf(cCharAt), 4)]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    private void m56148m9(String str) {
        if (this.f40369kk == 0) {
            return;
        }
        Integer[] numArr = {0};
        boolean zTryGetValue = f40368x1.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue && (this.f40369kk & iIntValue) != 0) {
            throw new ArgumentException("This header must be modified with the appropiate property.");
        }
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public void add(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        m56148m9(str);
        m56157x1(str, str2);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public void clear() {
        super.clear();
    }

    /* JADX INFO: renamed from: du */
    public void m56150du(String str, String str2) {
        String strM67440x1 = str2 == null ? C14113y2.f47374k4 : C14113y2.m67440x1(str2);
        super.remove(str);
        super.set(str, strM67440x1);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public String get(int i) {
        return super.get(i);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public String[] getAllKeys() {
        return super.getAllKeys();
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public String getKey(int i) {
        return super.getKey(i);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameObjectCollectionBase
    public NameObjectCollectionBase.KeysCollection getKeys() {
        return super.getKeys();
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public String[] getValues(int i) {
        String[] values = super.getValues(i);
        if (values == null || AbstractC14092to.m67208k4((Object) values).m67265du() == 0) {
            return null;
        }
        return values;
    }

    @Override // com.aspose.slides.Collections.Specialized.NameObjectCollectionBase, java.lang.Iterable
    public IEnumerator iterator() {
        return super.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56151k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("header");
        }
        int iM67429to = C14113y2.m67429to(str, ':');
        if (iM67429to == -1) {
            throw new ArgumentException("no colon found", "header");
        }
        add(C14113y2.m67443x1(str, 0, iM67429to), C14113y2.m67422kk(str, iM67429to + 1));
    }

    /* JADX INFO: renamed from: kk */
    public void m56153kk(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        super.remove(str);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public void remove(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        m56148m9(str);
        super.remove(str);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public void set(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (!m56147h4(str)) {
            throw new ArgumentException("invalid header name");
        }
        String strM67440x1 = str2 == null ? C14113y2.f47374k4 : C14113y2.m67440x1(str2);
        if (!m56146du(strM67440x1)) {
            throw new ArgumentException("invalid header value");
        }
        m56148m9(str);
        super.set(str, strM67440x1);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameObjectCollectionBase, com.aspose.slides.Collections.ICollection
    public int size() {
        return super.size();
    }

    /* JADX INFO: renamed from: to */
    public void m56155to(String str, String str2) {
        String strM67440x1 = str2 == null ? C14113y2.f47374k4 : C14113y2.m67440x1(str2);
        if (!m56146du(strM67440x1)) {
            throw new ArgumentException("invalid header value");
        }
        if (m56149to(str)) {
            super.add(str, strM67440x1);
        } else {
            super.remove(str);
            super.set(str, strM67440x1);
        }
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        int size = super.size();
        for (int i = 0; i < size; i++) {
            c6765kp.m26792k4(getKey(i)).m26792k4(": ").m26792k4(get(i)).m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        return c6765kp.m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS).toString();
    }

    /* JADX INFO: renamed from: x1 */
    public void m56156x1(String str) {
        int iM67429to = C14113y2.m67429to(str, ':');
        if (iM67429to == -1) {
            throw new ArgumentException("no colon found", "header");
        }
        m56155to(C14113y2.m67443x1(str, 0, iM67429to), C14113y2.m67422kk(str, iM67429to + 1));
    }

    public C11973u1(int i) {
        this.f40370to = 0;
        this.f40369kk = i;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m56146du(String str) {
        char cCharAt;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == 127) {
                return false;
            }
            if (cCharAt2 < ' ' && cCharAt2 != '\r' && cCharAt2 != '\n' && cCharAt2 != '\t') {
                return false;
            }
            if (cCharAt2 == '\n' && (i = i + 1) < length && (cCharAt = str.charAt(i)) != ' ' && cCharAt != '\t') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m56149to(String str) {
        if (str == null) {
            return false;
        }
        Integer[] numArr = {0};
        return f40368x1.tryGetValue(str, numArr) && (numArr[0].intValue() & 1024) != 0;
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public String get(String str) {
        return super.get(str);
    }

    @Override // com.aspose.slides.Collections.Specialized.NameValueCollection
    public String[] getValues(String str) {
        return m56152k4(str, true);
    }

    /* JADX INFO: renamed from: k4 */
    public String[] m56152k4(String str, boolean z) {
        if (str == null) {
            throw new ArgumentNullException("header");
        }
        String[] values = super.getValues(str);
        List list = null;
        if (values == null || AbstractC14092to.m67208k4((Object) values).m67265du() == 0) {
            return null;
        }
        if (z && m56149to(str)) {
            for (String str2 : values) {
                if (C14113y2.m67429to(str2, ',') >= 0) {
                    if (list == null) {
                        list = new List(AbstractC14092to.m67208k4((Object) values).m67265du() + 1);
                        for (String str3 : values) {
                            if (C14113y2.m67363du(str3, str2)) {
                                break;
                            }
                            list.addItem(str3);
                        }
                    }
                    String[] strArrM67414k4 = C14113y2.m67414k4(str2, ',');
                    int iM67265du = AbstractC14092to.m67208k4((Object) strArrM67414k4).m67265du();
                    if (OooO0O0.OooO00o(1, str2) == ',') {
                        iM67265du--;
                    }
                    for (int i = 0; i < iM67265du; i++) {
                        list.addItem(C14113y2.m67440x1(strArrM67414k4[i]));
                    }
                }
            }
            if (list != null) {
                return (String[]) list.toArray(new String[0]);
            }
        }
        return values;
    }

    /* JADX INFO: renamed from: kk */
    public void m56154kk(String str, String str2) {
        super.add(str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56157x1(String str, String str2) {
        if (!m56147h4(str)) {
            throw new ArgumentException(C14113y2.m67408k4("invalid header name: ", str), "headerName");
        }
        String strM67440x1 = str2 == null ? C14113y2.f47374k4 : C14113y2.m67440x1(str2);
        if (!m56146du(strM67440x1)) {
            throw new ArgumentException(C14113y2.m67408k4("invalid header value: ", strM67440x1), "headerValue");
        }
        m56154kk(str, strM67440x1);
    }
}
