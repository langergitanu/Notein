package com.nimbusds.jose.shaded.json.parser;

import com.aspose.words.ControlChar;
import com.google.android.material.internal.ViewUtils;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
abstract class JSONParserBase {
    public static final byte EOI = 26;
    protected static final char MAX_STOP = '~';
    protected static boolean[] stopAll;
    protected static boolean[] stopArray;
    protected static boolean[] stopKey;
    protected static boolean[] stopValue;
    protected static boolean[] stopX;
    protected final boolean acceptLeadinZero;
    protected final boolean acceptNaN;
    protected final boolean acceptNonQuote;
    protected final boolean acceptSimpleQuote;
    protected final boolean acceptUselessComma;

    /* JADX INFO: renamed from: c */
    protected char f57423c;
    protected final boolean checkTaillingData;
    protected final boolean checkTaillingSpace;
    protected ContainerFactory containerFactory;
    protected ContentHandler handler;
    protected final boolean ignoreControlChar;
    protected int pos;

    /* JADX INFO: renamed from: sb */
    protected final MSB f57424sb = new MSB(15);
    protected final boolean useHiPrecisionFloat;
    protected final boolean useIntegerStorage;

    /* JADX INFO: renamed from: xo */
    protected Object f57425xo;

    /* JADX INFO: renamed from: xs */
    protected String f57426xs;

    static {
        boolean[] zArr = new boolean[126];
        stopAll = zArr;
        boolean[] zArr2 = new boolean[126];
        stopArray = zArr2;
        boolean[] zArr3 = new boolean[126];
        stopKey = zArr3;
        boolean[] zArr4 = new boolean[126];
        stopValue = zArr4;
        boolean[] zArr5 = new boolean[126];
        stopX = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public JSONParserBase(int i) {
        this.acceptNaN = (i & 4) > 0;
        this.acceptNonQuote = (i & 2) > 0;
        this.acceptSimpleQuote = (i & 1) > 0;
        this.ignoreControlChar = (i & 8) > 0;
        this.useIntegerStorage = (i & 16) > 0;
        this.acceptLeadinZero = (i & 32) > 0;
        this.acceptUselessComma = (i & 64) > 0;
        this.useHiPrecisionFloat = (i & 128) > 0;
        this.checkTaillingData = (i & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768;
        this.checkTaillingSpace = (i & 512) == 0;
    }

    public void checkControleChar() throws ParseException {
        if (this.ignoreControlChar) {
            return;
        }
        int length = this.f57426xs.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = this.f57426xs.charAt(i);
            if (cCharAt >= 0) {
                if (cCharAt <= 31) {
                    throw new ParseException(this.pos + i, 0, Character.valueOf(cCharAt));
                }
                if (cCharAt == 127) {
                    throw new ParseException(this.pos + i, 0, Character.valueOf(cCharAt));
                }
            }
        }
    }

    public void checkLeadinZero() throws ParseException {
        int length = this.f57426xs.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f57426xs.equals("00")) {
                throw new ParseException(this.pos, 6, this.f57426xs);
            }
            return;
        }
        char cCharAt = this.f57426xs.charAt(0);
        char cCharAt2 = this.f57426xs.charAt(1);
        if (cCharAt != '-') {
            if (cCharAt == '0' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new ParseException(this.pos, 6, this.f57426xs);
            }
            return;
        }
        char cCharAt3 = this.f57426xs.charAt(2);
        if (cCharAt2 == '0' && cCharAt3 >= '0' && cCharAt3 <= '9') {
            throw new ParseException(this.pos, 6, this.f57426xs);
        }
    }

    public Number extractFloat() throws ParseException {
        if (!this.acceptLeadinZero) {
            checkLeadinZero();
        }
        try {
            return !this.useHiPrecisionFloat ? Float.valueOf(Float.parseFloat(this.f57426xs)) : this.f57426xs.length() > 18 ? new BigDecimal(this.f57426xs) : Double.valueOf(Double.parseDouble(this.f57426xs));
        } catch (NumberFormatException unused) {
            throw new ParseException(this.pos, 1, this.f57426xs);
        }
    }

    public Object parse(ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        this.containerFactory = containerFactory;
        this.handler = contentHandler;
        try {
            read();
            contentHandler.startJSON();
            Object main = readMain(stopX);
            contentHandler.endJSON();
            if (this.checkTaillingData) {
                if (!this.checkTaillingSpace) {
                    skipSpace();
                }
                if (this.f57423c != 26) {
                    throw new ParseException(this.pos - 1, 1, Character.valueOf(this.f57423c));
                }
            }
            this.f57426xs = null;
            this.f57425xo = null;
            return main;
        } catch (IOException e) {
            throw new ParseException(this.pos, e);
        }
    }

    public Number parseNumber(String str) throws ParseException {
        int i;
        int i2;
        int length = str.length();
        boolean z = false;
        if (str.charAt(0) == '-') {
            if (!this.acceptLeadinZero && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.pos, 6, str);
            }
            i = 20;
            i2 = 1;
        } else {
            if (!this.acceptLeadinZero && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.pos, 6, str);
            }
            i = 19;
            i2 = 0;
        }
        int i3 = i2;
        if (length >= i) {
            if (length > i) {
                return new BigInteger(str, 10);
            }
            length--;
            z = true;
        }
        long jCharAt = 0;
        while (i2 < length) {
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i2)));
            i2++;
        }
        if (z) {
            if (jCharAt <= -922337203685477580L) {
                if (jCharAt >= -922337203685477580L) {
                    if (i3 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i2)));
        }
        if (i3 != 0) {
            return (!this.useIntegerStorage || jCharAt < -2147483648L) ? Long.valueOf(jCharAt) : Integer.valueOf((int) jCharAt);
        }
        long j = -jCharAt;
        return (!this.useIntegerStorage || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
    }

    public abstract void read() throws IOException;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r3 == ':') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r3 == ']') goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r3 == '}') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r2 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r6.acceptUselessComma == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r6.pos, 0, java.lang.Character.valueOf(r6.f57423c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        read();
        r6.handler.endArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r6.pos, 0, java.lang.Character.valueOf(r6.f57423c));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Object> readArray() throws ParseException, IOException {
        List<Object> listCreateArrayContainer = this.containerFactory.createArrayContainer();
        if (this.f57423c != '[') {
            throw new RuntimeException("Internal Error");
        }
        read();
        this.handler.startArray();
        while (true) {
            boolean z = false;
            while (true) {
                char c = this.f57423c;
                if (c != '\t' && c != '\n' && c != '\r') {
                    if (c == 26) {
                        throw new ParseException(this.pos - 1, 3, "EOF");
                    }
                    if (c != ' ') {
                        if (c != ',') {
                            break;
                        }
                        if (z && !this.acceptUselessComma) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.f57423c));
                        }
                        read();
                        z = true;
                    }
                }
                read();
            }
            listCreateArrayContainer.add(readMain(stopArray));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r3.pos, 0, java.lang.Character.valueOf(r3.f57423c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        r4 = readNumber(r4);
        r3.f57425xo = r4;
        r3.handler.primitive(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        return r3.f57425xo;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readMain(boolean[] zArr) throws ParseException, IOException {
        while (true) {
            char c = this.f57423c;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        readString();
                        this.handler.primitive(this.f57426xs);
                        return this.f57426xs;
                    case '-':
                        break;
                    case 'N':
                        readNQString(zArr);
                        if (!this.acceptNaN) {
                            throw new ParseException(this.pos, 1, this.f57426xs);
                        }
                        if ("NaN".equals(this.f57426xs)) {
                            this.handler.primitive(Float.valueOf(Float.NaN));
                            return Float.valueOf(Float.NaN);
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f57426xs);
                        }
                        this.handler.primitive(this.f57426xs);
                        return this.f57426xs;
                    case '[':
                        return readArray();
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        readNQString(zArr);
                        if (TelemetryEventStrings.Value.FALSE.equals(this.f57426xs)) {
                            ContentHandler contentHandler = this.handler;
                            Boolean bool = Boolean.FALSE;
                            contentHandler.primitive(bool);
                            return bool;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f57426xs);
                        }
                        this.handler.primitive(this.f57426xs);
                        return this.f57426xs;
                    case 'n':
                        readNQString(zArr);
                        if (CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(this.f57426xs)) {
                            this.handler.primitive(null);
                            return null;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f57426xs);
                        }
                        this.handler.primitive(this.f57426xs);
                        return this.f57426xs;
                    case 't':
                        readNQString(zArr);
                        if (TelemetryEventStrings.Value.TRUE.equals(this.f57426xs)) {
                            ContentHandler contentHandler2 = this.handler;
                            Boolean bool2 = Boolean.TRUE;
                            contentHandler2.primitive(bool2);
                            return bool2;
                        }
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f57426xs);
                        }
                        this.handler.primitive(this.f57426xs);
                        return this.f57426xs;
                    case '{':
                        return readObject();
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                readNQString(zArr);
                                if (!this.acceptNonQuote) {
                                    throw new ParseException(this.pos, 1, this.f57426xs);
                                }
                                this.handler.primitive(this.f57426xs);
                                return this.f57426xs;
                        }
                        break;
                }
            }
            read();
        }
    }

    public abstract void readNQString(boolean[] zArr) throws IOException;

    public abstract void readNoEnd() throws ParseException, IOException;

    public abstract Object readNumber(boolean[] zArr) throws ParseException, IOException;

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r13.pos, 0, java.lang.Character.valueOf(r13.f57423c));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> readObject() throws ParseException, IOException {
        Map<String, Object> mapCreateObjectContainer = this.containerFactory.createObjectContainer();
        if (this.f57423c != '{') {
            throw new RuntimeException("Internal Error");
        }
        this.handler.startObject();
        boolean z = false;
        while (true) {
            read();
            char c = this.f57423c;
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c != ',') {
                    if (c == ':' || c == '[' || c == ']' || c == '{') {
                        break;
                    }
                    if (c == '}') {
                        if (z && !this.acceptUselessComma) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.f57423c));
                        }
                        read();
                        this.handler.endObject();
                        return mapCreateObjectContainer;
                    }
                    int i = this.pos;
                    if (c == '\"' || c == '\'') {
                        readString();
                    } else {
                        readNQString(stopKey);
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.f57426xs);
                        }
                    }
                    String str = this.f57426xs;
                    this.handler.startObjectEntry(str);
                    skipSpace();
                    char c2 = this.f57423c;
                    if (c2 != ':') {
                        if (c2 == 26) {
                            throw new ParseException(this.pos - 1, 3, null);
                        }
                        throw new ParseException(this.pos - 1, 0, Character.valueOf(this.f57423c));
                    }
                    readNoEnd();
                    if (mapCreateObjectContainer.put(str, readMain(stopValue)) != null) {
                        throw new ParseException(i, 5, str);
                    }
                    this.handler.endObjectEntry();
                    skipSpace();
                    char c3 = this.f57423c;
                    if (c3 == '}') {
                        read();
                        this.handler.endObject();
                        return mapCreateObjectContainer;
                    }
                    if (c3 == 26) {
                        throw new ParseException(this.pos - 1, 3, null);
                    }
                    if (c3 != ',') {
                        throw new ParseException(this.pos - 1, 1, Character.valueOf(this.f57423c));
                    }
                } else if (z && !this.acceptUselessComma) {
                    throw new ParseException(this.pos, 0, Character.valueOf(this.f57423c));
                }
                z = true;
            }
        }
    }

    public abstract void readS() throws IOException;

    public abstract void readString() throws ParseException, IOException;

    public void readString2() throws ParseException, IOException {
        char c = this.f57423c;
        while (true) {
            read();
            char c2 = this.f57423c;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    read();
                    this.f57426xs = this.f57424sb.toString();
                    return;
                }
                this.f57424sb.append(c2);
            } else if (c2 != '\\') {
                if (c2 != 127) {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            break;
                        case 26:
                            throw new ParseException(this.pos - 1, 3, null);
                        default:
                            this.f57424sb.append(c2);
                            continue;
                    }
                }
                if (!this.ignoreControlChar) {
                    throw new ParseException(this.pos, 0, Character.valueOf(this.f57423c));
                }
            } else {
                read();
                char c3 = this.f57423c;
                if (c3 == '\"') {
                    this.f57424sb.append('\"');
                } else if (c3 == '\'') {
                    this.f57424sb.append('\'');
                } else if (c3 == '/') {
                    this.f57424sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                } else if (c3 == '\\') {
                    this.f57424sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                } else if (c3 == 'b') {
                    this.f57424sb.append('\b');
                } else if (c3 == 'f') {
                    this.f57424sb.append('\f');
                } else if (c3 == 'n') {
                    this.f57424sb.append('\n');
                } else if (c3 == 'r') {
                    this.f57424sb.append(ControlChar.PARAGRAPH_BREAK_CHAR);
                } else if (c3 == 'x') {
                    this.f57424sb.append(readUnicode(2));
                } else if (c3 == 't') {
                    this.f57424sb.append('\t');
                } else if (c3 == 'u') {
                    this.f57424sb.append(readUnicode(4));
                }
            }
        }
    }

    public char readUnicode(int i) throws ParseException, IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 * 16;
            read();
            char c = this.f57423c;
            if (c <= '9' && c >= '0') {
                i2 = c - '0';
            } else if (c <= 'F' && c >= 'A') {
                i2 = c - '7';
            } else {
                if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new ParseException(this.pos, 3, "EOF");
                    }
                    throw new ParseException(this.pos, 4, Character.valueOf(this.f57423c));
                }
                i2 = c - 'W';
            }
            i3 = i2 + i5;
        }
        return (char) i3;
    }

    public void skipDigits() throws IOException {
        while (true) {
            char c = this.f57423c;
            if (c < '0' || c > '9') {
                return;
            } else {
                readS();
            }
        }
    }

    public void skipNQString(boolean[] zArr) throws IOException {
        while (true) {
            char c = this.f57423c;
            if (c == 26) {
                return;
            }
            if (c >= 0 && c < '~' && zArr[c]) {
                return;
            } else {
                readS();
            }
        }
    }

    public void skipSpace() throws IOException {
        while (true) {
            char c = this.f57423c;
            if (c > ' ' || c == 26) {
                return;
            } else {
                readS();
            }
        }
    }

    public static class MSB {

        /* JADX INFO: renamed from: b */
        char[] f57427b;

        /* JADX INFO: renamed from: p */
        int f57428p = -1;

        public MSB(int i) {
            this.f57427b = new char[i];
        }

        public void append(char c) {
            int i = this.f57428p + 1;
            this.f57428p = i;
            char[] cArr = this.f57427b;
            if (cArr.length <= i) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f57427b = cArr2;
            }
            this.f57427b[this.f57428p] = c;
        }

        public void clear() {
            this.f57428p = -1;
        }

        public String toString() {
            return new String(this.f57427b, 0, this.f57428p + 1);
        }

        public void append(int i) {
            int i2 = this.f57428p + 1;
            this.f57428p = i2;
            char[] cArr = this.f57427b;
            if (cArr.length <= i2) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f57427b = cArr2;
            }
            this.f57427b[this.f57428p] = (char) i;
        }
    }
}
