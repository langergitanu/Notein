package oO0000o0;

import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o000OoO.C24536OooO0Oo;
import oO0000o.C31931OooO00o;
import oO0000oo.C31933OooO00o;
import oO0000oo.C31934OooO0O0;
import oO0000oo.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public class OooO00o {
    private Charset charset;
    private String encodedAuthority;
    private String encodedFragment;
    private String encodedPath;
    private String encodedQuery;
    private String encodedSchemeSpecificPart;
    private String encodedUserInfo;
    private String fragment;
    private String host;
    private List<String> pathSegments;
    private int port;
    private String query;
    private List<oO0000Oo.OooO0O0> queryParams;
    private String scheme;
    private String userInfo;

    public OooO00o() {
        this.port = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String buildString() {
        StringBuilder sb = new StringBuilder();
        String str = this.scheme;
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = this.encodedSchemeSpecificPart;
        if (str2 != null) {
            sb.append(str2);
        } else {
            if (this.encodedAuthority != null) {
                sb.append("//");
                sb.append(this.encodedAuthority);
            } else if (this.host != null) {
                sb.append("//");
                String str3 = this.encodedUserInfo;
                if (str3 != null) {
                    sb.append(str3);
                    sb.append("@");
                } else {
                    String str4 = this.userInfo;
                    if (str4 != null) {
                        sb.append(encodeUserInfo(str4));
                        sb.append("@");
                    }
                }
                String str5 = this.host;
                if (!C31931OooO00o.f113874OooO00o.matcher(str5).matches()) {
                    int i = 0;
                    for (int i2 = 0; i2 < str5.length(); i2++) {
                        if (str5.charAt(i2) == ':') {
                            i++;
                        }
                    }
                    if (i > 7 || !C31931OooO00o.f113875OooO0O0.matcher(str5).matches()) {
                        sb.append(this.host);
                    } else {
                        sb.append("[");
                        sb.append(this.host);
                        sb.append("]");
                    }
                    if (this.port >= 0) {
                        sb.append(C18241k5.f55433h);
                        sb.append(this.port);
                    }
                }
            }
            String str6 = this.encodedPath;
            if (str6 != null) {
                sb.append(normalizePath(str6, sb.length() == 0));
            } else {
                List<String> list = this.pathSegments;
                if (list != null) {
                    sb.append(encodePath(list));
                }
            }
            if (this.encodedQuery != null) {
                sb.append(MsalUtils.QUERY_STRING_SYMBOL);
                sb.append(this.encodedQuery);
            } else {
                List<oO0000Oo.OooO0O0> list2 = this.queryParams;
                if (list2 != null && !list2.isEmpty()) {
                    sb.append(MsalUtils.QUERY_STRING_SYMBOL);
                    sb.append(encodeUrlForm(this.queryParams));
                } else if (this.query != null) {
                    sb.append(MsalUtils.QUERY_STRING_SYMBOL);
                    sb.append(encodeUric(this.query));
                }
            }
        }
        if (this.encodedFragment != null) {
            sb.append("#");
            sb.append(this.encodedFragment);
        } else if (this.fragment != null) {
            sb.append("#");
            sb.append(encodeUric(this.fragment));
        }
        return sb.toString();
    }

    private void digestURI(URI uri) {
        this.scheme = uri.getScheme();
        this.encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        this.encodedAuthority = uri.getRawAuthority();
        this.host = uri.getHost();
        this.port = uri.getPort();
        this.encodedUserInfo = uri.getRawUserInfo();
        this.userInfo = uri.getUserInfo();
        this.encodedPath = uri.getRawPath();
        String rawPath = uri.getRawPath();
        Charset charset = this.charset;
        if (charset == null) {
            charset = oO0000Oo.OooO00o.f113873OooO00o;
        }
        this.pathSegments = parsePath(rawPath, charset);
        this.encodedQuery = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = oO0000Oo.OooO00o.f113873OooO00o;
        }
        this.queryParams = parseQuery(rawQuery, charset2);
        this.encodedFragment = uri.getRawFragment();
        this.fragment = uri.getFragment();
    }

    private String encodePath(List<String> list) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = oO0000Oo.OooO00o.f113873OooO00o;
        }
        BitSet bitSet = OooO0O0.f113877OooO00o;
        C24536OooO0Oo.OooO0OO(list, "Segments");
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(OooO0O0.OooO0OO(str, charset, OooO0O0.f113882OooO0o0, false));
        }
        return sb.toString();
    }

    private String encodeUric(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = oO0000Oo.OooO00o.f113873OooO00o;
        }
        return OooO0O0.OooO0OO(str, charset, OooO0O0.f113881OooO0o, false);
    }

    private String encodeUrlForm(List<oO0000Oo.OooO0O0> list) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = oO0000Oo.OooO00o.f113873OooO00o;
        }
        BitSet bitSet = OooO0O0.f113877OooO00o;
        C24536OooO0Oo.OooO0OO(list, "Parameters");
        StringBuilder sb = new StringBuilder();
        for (oO0000Oo.OooO0O0 oooO0O0 : list) {
            String name = oooO0O0.getName();
            String strOooO0OO = name == null ? null : OooO0O0.OooO0OO(name, charset != null ? charset : oO0000Oo.OooO00o.f113873OooO00o, OooO0O0.f113884OooO0oo, true);
            String value = oooO0O0.getValue();
            String strOooO0OO2 = value != null ? OooO0O0.OooO0OO(value, charset != null ? charset : oO0000Oo.OooO00o.f113873OooO00o, OooO0O0.f113884OooO0oo, true) : null;
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(strOooO0OO);
            if (strOooO0OO2 != null) {
                sb.append("=");
                sb.append(strOooO0OO2);
            }
        }
        return sb.toString();
    }

    private String encodeUserInfo(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = oO0000Oo.OooO00o.f113873OooO00o;
        }
        return OooO0O0.OooO0OO(str, charset, OooO0O0.f113880OooO0Oo, false);
    }

    private static String normalizePath(String str, boolean z) {
        if (str == null) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return (z || str.startsWith("/")) ? str : "/".concat(str);
            }
        }
        return "";
    }

    private List<String> parsePath(String str, Charset charset) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        List<String> listOooO00o = OooO0O0.OooO00o(str);
        for (int i = 0; i < listOooO00o.size(); i++) {
            listOooO00o.set(i, OooO0O0.OooO0O0(listOooO00o.get(i), charset != null ? charset : oO0000Oo.OooO00o.f113873OooO00o, false));
        }
        return listOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<oO0000Oo.OooO0O0> parseQuery(String str, Charset charset) {
        String strOooO0OO;
        if (str == null || str.isEmpty()) {
            return null;
        }
        BitSet bitSet = OooO0O0.f113877OooO00o;
        int length = str.length();
        oO000.OooO00o oooO00o = new oO000.OooO00o();
        if (length < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        oooO00o.f113730OooOo0o = new char[length];
        int length2 = str.length();
        int i = oooO00o.f113729OooOo + length2;
        char[] cArr = oooO00o.f113730OooOo0o;
        if (i > cArr.length) {
            char[] cArr2 = new char[Math.max(cArr.length << 1, i)];
            System.arraycopy(oooO00o.f113730OooOo0o, 0, cArr2, 0, oooO00o.f113729OooOo);
            oooO00o.f113730OooOo0o = cArr2;
        }
        str.getChars(0, length2, oooO00o.f113730OooOo0o, oooO00o.f113729OooOo);
        oooO00o.f113729OooOo = i;
        char[] cArr3 = {'&', ';'};
        BitSet bitSet2 = new BitSet();
        for (int i2 = 0; i2 < 2; i2++) {
            bitSet2.set(cArr3[i2]);
        }
        C31934OooO0O0 c31934OooO0O0 = new C31934OooO0O0(oooO00o.f113729OooOo);
        ArrayList arrayList = new ArrayList();
        while (!c31934OooO0O0.OooO00o()) {
            bitSet2.set(61);
            String strOooO0OO2 = OooO0OO.OooO0OO(oooO00o, c31934OooO0O0, bitSet2);
            if (!c31934OooO0O0.OooO00o()) {
                int i3 = c31934OooO0O0.f113892OooO0O0;
                char c = oooO00o.f113730OooOo0o[i3];
                c31934OooO0O0.OooO0O0(i3 + 1);
                if (c == '=') {
                    bitSet2.clear(61);
                    strOooO0OO = OooO0OO.OooO0OO(oooO00o, c31934OooO0O0, bitSet2);
                    if (!c31934OooO0O0.OooO00o()) {
                        c31934OooO0O0.OooO0O0(c31934OooO0O0.f113892OooO0O0 + 1);
                    }
                } else {
                    strOooO0OO = null;
                }
            }
            if (!strOooO0OO2.isEmpty()) {
                arrayList.add(new C31933OooO00o(OooO0O0.OooO0O0(strOooO0OO2, charset != null ? charset : oO0000Oo.OooO00o.f113873OooO00o, true), strOooO0OO == null ? null : OooO0O0.OooO0O0(strOooO0OO, charset != null ? charset : oO0000Oo.OooO00o.f113873OooO00o, true)));
            }
        }
        return arrayList;
    }

    public OooO00o addParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.add(new C31933OooO00o(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public OooO00o addParameters(List<oO0000Oo.OooO0O0> list) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.addAll(list);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URI build() throws URISyntaxException {
        return new URI(buildString());
    }

    public OooO00o clearParameters() {
        this.queryParams = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getFragment() {
        return this.fragment;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        if (this.pathSegments == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.pathSegments) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> getPathSegments() {
        return this.pathSegments != null ? new ArrayList(this.pathSegments) : Collections.EMPTY_LIST;
    }

    public int getPort() {
        return this.port;
    }

    public List<oO0000Oo.OooO0O0> getQueryParams() {
        return this.queryParams != null ? new ArrayList(this.queryParams) : Collections.EMPTY_LIST;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public boolean isAbsolute() {
        return this.scheme != null;
    }

    public boolean isOpaque() {
        return isPathEmpty();
    }

    public boolean isPathEmpty() {
        List<String> list = this.pathSegments;
        return (list == null || list.isEmpty()) && this.encodedPath == null;
    }

    public boolean isQueryEmpty() {
        List<oO0000Oo.OooO0O0> list = this.queryParams;
        return (list == null || list.isEmpty()) && this.encodedQuery == null;
    }

    public OooO00o removeQuery() {
        this.queryParams = null;
        this.query = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public OooO00o setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    public OooO00o setCustomQuery(String str) {
        this.query = str;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.queryParams = null;
        return this;
    }

    public OooO00o setFragment(String str) {
        this.fragment = str;
        this.encodedFragment = null;
        return this;
    }

    public OooO00o setHost(String str) {
        this.host = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    public OooO00o setParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        if (!this.queryParams.isEmpty()) {
            Iterator<oO0000Oo.OooO0O0> it = this.queryParams.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equals(str)) {
                    it.remove();
                }
            }
        }
        this.queryParams.add(new C31933OooO00o(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public OooO00o setParameters(List<oO0000Oo.OooO0O0> list) {
        List<oO0000Oo.OooO0O0> list2 = this.queryParams;
        if (list2 == null) {
            this.queryParams = new ArrayList();
        } else {
            list2.clear();
        }
        this.queryParams.addAll(list);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public OooO00o setPath(String str) {
        return setPathSegments(str != null ? OooO0O0.OooO00o(str) : null);
    }

    public OooO00o setPathSegments(String... strArr) {
        this.pathSegments = strArr.length > 0 ? Arrays.asList(strArr) : null;
        this.encodedSchemeSpecificPart = null;
        this.encodedPath = null;
        return this;
    }

    public OooO00o setPort(int i) {
        if (i < 0) {
            i = -1;
        }
        this.port = i;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    @Deprecated
    public OooO00o setQuery(String str) {
        Charset charset = this.charset;
        if (charset == null) {
            charset = oO0000Oo.OooO00o.f113873OooO00o;
        }
        this.queryParams = parseQuery(str, charset);
        this.query = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public OooO00o setScheme(String str) {
        this.scheme = str;
        return this;
    }

    public OooO00o setUserInfo(String str) {
        this.userInfo = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        this.encodedUserInfo = null;
        return this;
    }

    public String toString() {
        return buildString();
    }

    public OooO00o(String str) throws URISyntaxException {
        digestURI(new URI(str));
    }

    public OooO00o setPathSegments(List<String> list) {
        this.pathSegments = (list == null || list.size() <= 0) ? null : new ArrayList(list);
        this.encodedSchemeSpecificPart = null;
        this.encodedPath = null;
        return this;
    }

    public OooO00o(URI uri) {
        digestURI(uri);
    }

    public OooO00o setUserInfo(String str, String str2) {
        return setUserInfo(str + ':' + str2);
    }

    public OooO00o setParameters(oO0000Oo.OooO0O0... oooO0O0Arr) {
        List<oO0000Oo.OooO0O0> list = this.queryParams;
        if (list == null) {
            this.queryParams = new ArrayList();
        } else {
            list.clear();
        }
        for (oO0000Oo.OooO0O0 oooO0O0 : oooO0O0Arr) {
            this.queryParams.add(oooO0O0);
        }
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }
}
