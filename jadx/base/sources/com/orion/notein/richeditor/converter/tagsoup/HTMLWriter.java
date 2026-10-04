package com.orion.notein.richeditor.converter.tagsoup;

import android.text.util.Linkify;
import androidx.concurrent.futures.OooO00o;
import com.aspose.words.ControlChar;
import com.google.common.net.HttpHeaders;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.base.util.HttpUtils;
import com.orion.notein.richeditor.converter.tagsoup.util.StringEscapeUtils;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.regex.Matcher;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.NamespaceSupport;
import org.xml.sax.helpers.XMLFilterImpl;

/* JADX INFO: loaded from: classes9.dex */
public class HTMLWriter extends XMLFilterImpl implements LexicalHandler {
    public static final String CDATA_SECTION_ELEMENTS = "cdata-section-elements";
    public static final String DOCTYPE_PUBLIC = "doctype-public";
    public static final String DOCTYPE_SYSTEM = "doctype-system";
    public static final String ENCODING = "encoding";
    public static final String INDENT = "indent";
    private static final String[] LINK_SCHEMAS;
    public static final String MEDIA_TYPE = "media-type";
    public static final String METHOD = "method";
    public static final String OMIT_XML_DECLARATION = "omit-xml-declaration";
    public static final String STANDALONE = "standalone";
    private static final Linkify.MatchFilter URL_MATCH_FILTER;
    public static final String VERSION = "version";
    private static Map<String, Map<String, String>> mTags2Ignore = new HashMap();
    private boolean mIgnoreChars;
    private Stack<String> mIgnoredTags;
    private boolean mOmitXHTMLNamespace;
    private Writer output;
    private int elementLevel = 0;
    private int prefixCounter = 0;
    private String outputEncoding = "";
    private boolean htmlMode = false;
    private boolean forceDTD = false;
    private boolean hasOutputDTD = false;
    private String overridePublic = null;
    private String overrideSystem = null;
    private String version = null;
    private String standalone = null;
    private boolean cdataElement = false;
    private String[] booleans = {"checked", "compact", "declare", "defer", "disabled", "ismap", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "selected"};
    private StringBuffer mLastText4Links = new StringBuffer();
    private NamespaceSupport nsSupport = new NamespaceSupport();
    private Hashtable<String, String> prefixTable = new Hashtable<>();
    private Hashtable<String, Boolean> forcedDeclTable = new Hashtable<>();
    private Hashtable<String, String> doneDeclTable = new Hashtable<>();
    private Properties outputProperties = new Properties();

    static {
        HashMap map = new HashMap();
        map.put("http-equiv", HttpHeaders.REFRESH);
        mTags2Ignore.put("meta", map);
        mTags2Ignore.put("iframe", map);
        HashMap map2 = new HashMap();
        map2.put("autoplay", "autoplay#true");
        mTags2Ignore.put("audio", map2);
        mTags2Ignore.put("video", map2);
        LINK_SCHEMAS = new String[]{HttpUtils.HTTP_PREFIX, "https://", "rtsp://"};
        URL_MATCH_FILTER = new Linkify.MatchFilter() { // from class: com.orion.notein.richeditor.converter.tagsoup.HTMLWriter.1
            @Override // android.text.util.Linkify.MatchFilter
            public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
                return i == 0 || charSequence.charAt(i - 1) != '@';
            }
        };
    }

    public HTMLWriter(boolean z) {
        setOutputProperty("method", "html");
        setOutputProperty(OMIT_XML_DECLARATION, "yes");
        this.mOmitXHTMLNamespace = z;
        this.mIgnoredTags = new Stack<>();
    }

    private boolean booleanAttribute(String str, String str2, String str3) {
        int iIndexOf;
        if (str == null && (iIndexOf = str2.indexOf(58)) != -1) {
            str = str2.substring(iIndexOf + 1, str2.length());
        }
        if (!str.equals(str3)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.booleans;
            if (i >= strArr.length) {
                return false;
            }
            if (str.equals(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    private void collectText4Links(char[] cArr, int i, int i2) throws SAXException {
        this.mLastText4Links.append(String.valueOf(cArr, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String doPrefix(String str, String str2, boolean z) {
        String string = "";
        String uri = this.nsSupport.getURI("");
        String str3 = null;
        if ("".equals(str)) {
            if (z && uri != null) {
                this.nsSupport.declarePrefix("", "");
            }
            return null;
        }
        String prefix = (z && uri != null && str.equals(uri)) ? "" : this.nsSupport.getPrefix(str);
        if (prefix != null) {
            return prefix;
        }
        String str4 = this.doneDeclTable.get(str);
        if (str4 != null && (((!z || uri != null) && "".equals(str4)) || this.nsSupport.getURI(str4) != null)) {
            str4 = null;
        }
        if (str4 != null || (str4 = this.prefixTable.get(str)) == null || (((z && uri == null) || !"".equals(str4)) && this.nsSupport.getURI(str4) == null)) {
            str3 = str4;
        }
        if (str3 != null || str2 == null || "".equals(str2)) {
            string = str3;
        } else {
            int iIndexOf = str2.indexOf(58);
            if (iIndexOf != -1) {
                string = str2.substring(0, iIndexOf);
            } else if (!z || uri != null) {
            }
        }
        while (true) {
            if (string != null && this.nsSupport.getURI(string) == null) {
                this.nsSupport.declarePrefix(string, str);
                this.doneDeclTable.put(str, string);
                return string;
            }
            StringBuilder sb = new StringBuilder("__NS");
            int i = this.prefixCounter + 1;
            this.prefixCounter = i;
            sb.append(i);
            string = sb.toString();
        }
    }

    private void forceNSDecls() {
        Enumeration<String> enumerationKeys = this.forcedDeclTable.keys();
        while (enumerationKeys.hasMoreElements()) {
            doPrefix(enumerationKeys.nextElement(), null, true);
        }
    }

    private boolean ignoreElement(String str, String str2, String str3, Attributes attributes) {
        Map<String, String> map = mTags2Ignore.get(str3.toLowerCase(Locale.US));
        if (map != null) {
            for (String str4 : map.keySet()) {
                for (String str5 : map.get(str4).split("#")) {
                    String value = attributes.getValue(str4);
                    if (!isNullOrEmpty(value) && str5.equalsIgnoreCase(value)) {
                        this.mIgnoredTags.push(str3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private String makeUrl(String str, String[] strArr, Matcher matcher) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            String str3 = str;
            if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                String str4 = strArr[i];
                boolean zRegionMatches = str3.regionMatches(false, 0, str4, 0, str4.length());
                z = true;
                if (zRegionMatches) {
                    str = str3;
                } else {
                    str = strArr[i] + str3.substring(strArr[i].length());
                }
            } else {
                i++;
                str = str3;
            }
        }
        if (!z) {
            str = OooO00o.OooO0OO(new StringBuilder(), strArr[0], str);
        }
        return str.replace(" ", "");
    }

    private void write(char c) throws SAXException {
        try {
            this.output.write(c);
        } catch (IOException e) {
            throw new SAXException(e);
        }
    }

    private void writeAttributes(Attributes attributes) throws SAXException {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            write(ControlChar.SPACE_CHAR);
            writeName(attributes.getURI(i), attributes.getLocalName(i), attributes.getQName(i), false);
            if (this.htmlMode && booleanAttribute(attributes.getLocalName(i), attributes.getQName(i), attributes.getValue(i))) {
                return;
            }
            write("=\"");
            String value = attributes.getValue(i);
            writeEscUTF16(value, 0, value.length(), true);
            write('\"');
        }
    }

    private void writeEscUTF16(String str, int i, int i2, boolean z) throws SAXException {
        write(StringEscapeUtils.escapeHtml4(str.substring(i, i2 + i)));
    }

    private void writeNSDecls() throws SAXException {
        Enumeration declaredPrefixes = this.nsSupport.getDeclaredPrefixes();
        while (declaredPrefixes.hasMoreElements()) {
            String str = (String) declaredPrefixes.nextElement();
            String uri = this.nsSupport.getURI(str);
            if (uri == null) {
                uri = "";
            }
            write(ControlChar.SPACE_CHAR);
            if ("".equals(str)) {
                write("xmlns=\"");
            } else {
                write("xmlns:");
                write(str);
                write("=\"");
            }
            writeEscUTF16(uri, 0, uri.length(), true);
            write('\"');
        }
    }

    private void writeName(String str, String str2, String str3, boolean z) throws SAXException {
        String strDoPrefix = doPrefix(str, str3, z);
        if (strDoPrefix != null && !"".equals(strDoPrefix)) {
            write(strDoPrefix);
            write(':');
        }
        if (str2 == null || "".equals(str2)) {
            write(str3.substring(str3.indexOf(58) + 1, str3.length()));
        } else {
            write(str2);
        }
    }

    private void writeText4Links() throws SAXException {
        if (this.mLastText4Links.length() > 0) {
            String string = this.mLastText4Links.toString();
            Writer writer = this.output;
            this.output = new StringWriter();
            Matcher matcher = Patterns.WEB_URL.matcher(this.mLastText4Links);
            int iEnd = 0;
            while (matcher.find()) {
                Linkify.MatchFilter matchFilter = URL_MATCH_FILTER;
                if (matchFilter == null || matchFilter.acceptMatch(this.mLastText4Links, matcher.start(), matcher.start())) {
                    writeEscUTF16(string, iEnd, matcher.start() - iEnd, false);
                    try {
                        String strGroup = matcher.group(0);
                        String strMakeUrl = makeUrl(strGroup, LINK_SCHEMAS, matcher);
                        this.output.append((CharSequence) ("<a href=\"" + strMakeUrl + "\">"));
                        writeEscUTF16(strGroup, 0, strGroup.length(), false);
                        this.output.append((CharSequence) "</a>");
                    } catch (IOException unused) {
                    }
                    iEnd = matcher.end();
                }
            }
            if (iEnd < string.length()) {
                writeEscUTF16(string, iEnd, string.length() - iEnd, false);
            }
            String string2 = this.output.toString();
            this.output = writer;
            write(string2);
            this.mLastText4Links.setLength(0);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        if (this.cdataElement) {
            writeText4Links();
            for (int i3 = i; i3 < i + i2; i3++) {
                write(cArr[i3]);
            }
        } else if (this.mIgnoreChars) {
            writeText4Links();
            writeEscUTF16(new String(cArr), i, i2, false);
        } else {
            collectText4Links(cArr, i, i2);
        }
        super.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i, int i2) throws SAXException {
        int i3;
        write("<!--");
        int i4 = i;
        while (true) {
            int i5 = i + i2;
            if (i4 >= i5) {
                write("-->");
                return;
            }
            write(cArr[i4]);
            if (cArr[i4] == '-' && (i3 = i4 + 1) <= i5 && cArr[i3] == '-') {
                write(ControlChar.SPACE_CHAR);
            }
            i4++;
        }
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endDTD() throws SAXException {
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        writeText4Links();
        write('\n');
        super.endDocument();
        try {
            flush();
        } catch (IOException e) {
            throw new SAXException(e);
        }
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        writeText4Links();
        if (!this.mIgnoredTags.isEmpty() && this.mIgnoredTags.peek().equalsIgnoreCase(str3)) {
            this.mIgnoredTags.pop();
            return;
        }
        if (!this.htmlMode || ((!str.equals("http://www.w3.org/1999/xhtml") && !str.equals("")) || (!str3.equals("area") && !str3.equals("base") && !str3.equals("basefont") && !str3.equals("br") && !str3.equals("col") && !str3.equals("frame") && !str3.equals(TranslateLanguage.CROATIAN) && !str3.equals("img") && !str3.equals("input") && !str3.equals("isindex") && !str3.equals("link") && !str3.equals("meta") && !str3.equals("param")))) {
            write("</");
            writeName(str, str2, str3, true);
            write('>');
        }
        if (this.elementLevel == 1) {
            write('\n');
        }
        if (this.htmlMode && str2.equals("a")) {
            this.mIgnoreChars = false;
        }
        this.cdataElement = false;
        super.endElement(str, str2, str3);
        this.nsSupport.popContext();
        this.elementLevel--;
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) throws SAXException {
    }

    public void flush() throws SAXException, IOException {
        writeText4Links();
        this.output.flush();
    }

    public void forceNSDecl(String str) {
        this.forcedDeclTable.put(str, Boolean.TRUE);
    }

    public String getOutputProperty(String str) {
        return this.outputProperties.getProperty(str);
    }

    public String getPrefix(String str) {
        return this.prefixTable.get(str);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        writeText4Links();
        writeEscUTF16(new String(cArr), i, i2, false);
        super.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        writeText4Links();
        write("<?");
        write(str);
        write(ControlChar.SPACE_CHAR);
        write(str2);
        write("?>");
        if (this.elementLevel < 1) {
            write('\n');
        }
        super.processingInstruction(str, str2);
    }

    public void reset() throws SAXException {
        writeText4Links();
        this.elementLevel = 0;
        this.prefixCounter = 0;
        this.nsSupport.reset();
    }

    public void setOutput(Writer writer) {
        if (writer == null) {
            this.output = new OutputStreamWriter(System.out);
        } else {
            this.output = writer;
        }
    }

    public void setOutputProperty(String str, String str2) {
        this.outputProperties.setProperty(str, str2);
        if (str.equals("encoding")) {
            this.outputEncoding = str2;
            return;
        }
        if (str.equals("method")) {
            this.htmlMode = str2.equals("html");
            return;
        }
        if (str.equals(DOCTYPE_PUBLIC)) {
            this.overridePublic = str2;
            this.forceDTD = true;
        } else if (str.equals(DOCTYPE_SYSTEM)) {
            this.overrideSystem = str2;
            this.forceDTD = true;
        } else if (str.equals("version")) {
            this.version = str2;
        } else if (str.equals(STANDALONE)) {
            this.standalone = str2;
        }
    }

    public void setPrefix(String str, String str2) {
        this.prefixTable.put(str, str2);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startCDATA() throws SAXException {
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) throws SAXException {
        if (str == null || this.hasOutputDTD) {
            return;
        }
        this.hasOutputDTD = true;
        write("<!DOCTYPE ");
        write(str);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.overrideSystem;
        if (str4 != null) {
            str3 = str4;
        }
        char c = str3.indexOf(34) != -1 ? '\'' : '\"';
        String str5 = this.overridePublic;
        if (str5 != null) {
            str2 = str5;
        }
        if (str2 == null || "".equals(str2)) {
            write(" SYSTEM ");
        } else {
            char c2 = str2.indexOf(34) != -1 ? '\'' : '\"';
            write(" PUBLIC ");
            write(c2);
            write(str2);
            write(c2);
            write(ControlChar.SPACE_CHAR);
        }
        write(c);
        write(str3);
        write(c);
        write(">\n");
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        writeText4Links();
        reset();
        if (!"yes".equals(this.outputProperties.getProperty(OMIT_XML_DECLARATION, TranslateLanguage.NORWEGIAN))) {
            write("<?xml");
            if (this.version == null) {
                write(" version=\"1.0\"");
            } else {
                write(" version=\"");
                write(this.version);
                write("\"");
            }
            String str = this.outputEncoding;
            if (str != null && str != "") {
                write(" encoding=\"");
                write(this.outputEncoding);
                write("\"");
            }
            if (this.standalone == null) {
                write(" standalone=\"yes\"?>\n");
            } else {
                write(" standalone=\"");
                write(this.standalone);
                write("\"");
            }
        }
        super.startDocument();
    }

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        writeText4Links();
        if (ignoreElement(str, str2, str3, attributes)) {
            return;
        }
        this.elementLevel++;
        this.nsSupport.pushContext();
        if (this.forceDTD && !this.hasOutputDTD) {
            startDTD(str2 == null ? str3 : str2, "", "");
        }
        write('<');
        writeName(str, str2, str3, true);
        writeAttributes(attributes);
        if (this.elementLevel == 1) {
            forceNSDecls();
        }
        if (!this.mOmitXHTMLNamespace || !"html".equalsIgnoreCase(str2)) {
            writeNSDecls();
        }
        write('>');
        if (this.htmlMode && (str3.equals("script") || str3.equals("style"))) {
            this.cdataElement = true;
        }
        if (this.htmlMode && str2.equals("a")) {
            this.mIgnoreChars = true;
        }
        super.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) throws SAXException {
    }

    public void forceNSDecl(String str, String str2) {
        setPrefix(str, str2);
        forceNSDecl(str);
    }

    private void write(String str) throws SAXException {
        try {
            this.output.write(str);
        } catch (IOException e) {
            throw new SAXException(e);
        }
    }
}
