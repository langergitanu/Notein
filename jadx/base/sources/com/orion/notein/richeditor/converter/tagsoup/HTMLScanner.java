package com.orion.notein.richeditor.converter.tagsoup;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18438z3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes9.dex */
public class HTMLScanner implements Scanner, Locator {
    private static final int A_ADUP = 1;
    private static final int A_ADUP_SAVE = 2;
    private static final int A_ADUP_STAGC = 3;
    private static final int A_ANAME = 4;
    private static final int A_ANAME_ADUP = 5;
    private static final int A_ANAME_ADUP_STAGC = 6;
    private static final int A_AVAL = 7;
    private static final int A_AVAL_STAGC = 8;
    private static final int A_CDATA = 9;
    private static final int A_CMNT = 10;
    private static final int A_DECL = 11;
    private static final int A_EMPTYTAG = 12;
    private static final int A_ENTITY = 13;
    private static final int A_ENTITY_START = 14;
    private static final int A_ETAG = 15;
    private static final int A_GI = 16;
    private static final int A_GI_STAGC = 17;
    private static final int A_LT = 18;
    private static final int A_LT_PCDATA = 19;
    private static final int A_MINUS = 20;
    private static final int A_MINUS2 = 21;
    private static final int A_MINUS3 = 22;
    private static final int A_PCDATA = 23;
    private static final int A_PI = 24;
    private static final int A_PITARGET = 25;
    private static final int A_PITARGET_PI = 26;
    private static final int A_SAVE = 27;
    private static final int A_SKIP = 28;
    private static final int A_SP = 29;
    private static final int A_STAGC = 30;
    private static final int A_UNGET = 31;
    private static final int A_UNSAVE_PCDATA = 32;
    private static final int S_ANAME = 1;
    private static final int S_APOS = 2;
    private static final int S_AVAL = 3;
    private static final int S_BB = 4;
    private static final int S_BBC = 5;
    private static final int S_BBCD = 6;
    private static final int S_BBCDA = 7;
    private static final int S_BBCDAT = 8;
    private static final int S_BBCDATA = 9;
    private static final int S_CDATA = 10;
    private static final int S_CDATA2 = 11;
    private static final int S_CDSECT = 12;
    private static final int S_CDSECT1 = 13;
    private static final int S_CDSECT2 = 14;
    private static final int S_COM = 15;
    private static final int S_COM2 = 16;
    private static final int S_COM3 = 17;
    private static final int S_COM4 = 18;
    private static final int S_DECL = 19;
    private static final int S_DECL2 = 20;
    private static final int S_DONE = 21;
    private static final int S_EMPTYTAG = 22;
    private static final int S_ENT = 23;
    private static final int S_EQ = 24;
    private static final int S_ETAG = 25;
    private static final int S_GI = 26;
    private static final int S_NCR = 27;
    private static final int S_PCDATA = 28;
    private static final int S_PI = 29;
    private static final int S_PITARGET = 30;
    private static final int S_QUOT = 31;
    private static final int S_STAGC = 32;
    private static final int S_TAG = 33;
    private static final int S_TAGWS = 34;
    private static final int S_XNCR = 35;
    private static int[] statetable = {1, 47, 5, 22, 1, 61, 4, 3, 1, 62, 6, 28, 1, 0, 27, 1, 1, -1, 6, 21, 1, 32, 4, 24, 1, 10, 4, 24, 1, 9, 4, 24, 2, 39, 7, 34, 2, 0, 27, 2, 2, -1, 8, 21, 2, 32, 29, 2, 2, 10, 29, 2, 2, 9, 29, 2, 3, 39, 28, 2, 3, 34, 28, 31, 3, 62, 8, 28, 3, 0, 27, 32, 3, -1, 8, 21, 3, 32, 28, 3, 3, 10, 28, 3, 3, 9, 28, 3, 4, 67, 28, 5, 4, 0, 28, 19, 4, -1, 28, 21, 5, 68, 28, 6, 5, 0, 28, 19, 5, -1, 28, 21, 6, 65, 28, 7, 6, 0, 28, 19, 6, -1, 28, 21, 7, 84, 28, 8, 7, 0, 28, 19, 7, -1, 28, 21, 8, 65, 28, 9, 8, 0, 28, 19, 8, -1, 28, 21, 9, 91, 28, 12, 9, 0, 28, 19, 9, -1, 28, 21, 10, 60, 27, 11, 10, 0, 27, 10, 10, -1, 23, 21, 11, 47, 32, 25, 11, 0, 27, 10, 11, -1, 32, 21, 12, 93, 27, 13, 12, 0, 27, 12, 12, -1, 28, 21, 13, 93, 27, 14, 13, 0, 27, 12, 13, -1, 28, 21, 14, 62, 9, 28, 14, 0, 27, 12, 14, -1, 28, 21, 15, 45, 28, 16, 15, 0, 27, 16, 15, -1, 10, 21, 16, 45, 28, 17, 16, 0, 27, 16, 16, -1, 10, 21, 17, 45, 28, 18, 17, 0, 20, 16, 17, -1, 10, 21, 18, 45, 22, 18, 18, 62, 10, 28, 18, 0, 21, 16, 18, -1, 10, 21, 19, 45, 28, 15, 19, 91, 28, 4, 19, 62, 28, 28, 19, 0, 27, 20, 19, -1, 28, 21, 20, 62, 11, 28, 20, 0, 27, 20, 20, -1, 28, 21, 22, 62, 12, 28, 22, 0, 27, 1, 22, 32, 28, 34, 22, 10, 28, 34, 22, 9, 28, 34, 23, 0, 13, 23, 23, -1, 13, 21, 24, 61, 28, 3, 24, 62, 3, 28, 24, 0, 2, 1, 24, -1, 3, 21, 24, 32, 28, 24, 24, 10, 28, 24, 24, 9, 28, 24, 25, 62, 15, 28, 25, 0, 27, 25, 25, -1, 15, 21, 25, 32, 28, 25, 25, 10, 28, 25, 25, 9, 28, 25, 26, 47, 28, 22, 26, 62, 17, 28, 26, 0, 27, 26, 26, -1, 28, 21, 26, 32, 16, 34, 26, 10, 16, 34, 26, 9, 16, 34, 27, 0, 13, 27, 27, -1, 13, 21, 28, 38, 14, 23, 28, 60, 23, 33, 28, 0, 27, 28, 28, -1, 23, 21, 29, 62, 24, 28, 29, 0, 27, 29, 29, -1, 24, 21, 30, 62, 26, 28, 30, 0, 27, 30, 30, -1, 26, 21, 30, 32, 25, 29, 30, 10, 25, 29, 30, 9, 25, 29, 31, 34, 7, 34, 31, 0, 27, 31, 31, -1, 8, 21, 31, 32, 29, 31, 31, 10, 29, 31, 31, 9, 29, 31, 32, 62, 8, 28, 32, 0, 27, 32, 32, -1, 8, 21, 32, 32, 7, 34, 32, 10, 7, 34, 32, 9, 7, 34, 33, 33, 28, 19, 33, 63, 28, 30, 33, 47, 28, 25, 33, 60, 27, 33, 33, 0, 27, 26, 33, -1, 19, 21, 33, 32, 18, 28, 33, 10, 18, 28, 33, 9, 18, 28, 34, 47, 28, 22, 34, 62, 30, 28, 34, 0, 27, 1, 34, -1, 30, 21, 34, 32, 28, 34, 34, 10, 28, 34, 34, 9, 28, 34, 35, 0, 13, 35, 35, -1, 13, 21};
    private int theCurrentColumn;
    private int theCurrentLine;
    private int theLastColumn;
    private int theLastLine;
    int theNextState;
    private String thePublicid;
    int theSize;
    int theState;
    private String theSystemid;
    char[] theOutputBuffer = new char[200];
    int[] theWinMap = {8364, 65533, EditingLanguage.BOSNIAN_CYRILLIC, 402, 8222, 8230, 8224, 8225, 710, 8240, StyleIdentifier.LIST_TABLE_3_ACCENT_4, 8249, StyleIdentifier.LIST_TABLE_3_ACCENT_2, 65533, 381, 65533, 65533, 8216, 8217, C18438z3.f56774j, 8221, 8226, 8211, 8212, 732, 8482, StyleIdentifier.LIST_TABLE_4_ACCENT_4, 8250, StyleIdentifier.LIST_TABLE_4_ACCENT_2, 65533, 382, 376};

    private void mark() {
        this.theLastColumn = this.theCurrentColumn;
        this.theLastLine = this.theCurrentLine;
    }

    private void save(int i, ScanHandler scanHandler) throws SAXException, IOException {
        save(scanHandler);
        char[] cArr = this.theOutputBuffer;
        int i2 = this.theSize;
        this.theSize = i2 + 1;
        cArr[i2] = (char) i;
    }

    private void unread(PushbackReader pushbackReader, int i) throws IOException {
        if (i != -1) {
            pushbackReader.unread(i);
        }
    }

    @Override // org.xml.sax.Locator
    public int getColumnNumber() {
        return this.theLastColumn;
    }

    @Override // org.xml.sax.Locator
    public int getLineNumber() {
        return this.theLastLine;
    }

    @Override // org.xml.sax.Locator
    public String getPublicId() {
        return this.thePublicid;
    }

    @Override // org.xml.sax.Locator
    public String getSystemId() {
        return this.theSystemid;
    }

    @Override // com.orion.notein.richeditor.converter.tagsoup.Scanner
    public void resetDocumentLocator(String str, String str2) {
        this.thePublicid = str;
        this.theSystemid = str2;
        this.theCurrentColumn = 0;
        this.theCurrentLine = 0;
        this.theLastColumn = 0;
        this.theLastLine = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.orion.notein.richeditor.converter.tagsoup.Scanner
    public void scan(Reader reader, ScanHandler scanHandler) throws SAXException, IOException {
        String string;
        this.theState = 28;
        PushbackReader pushbackReader = reader instanceof PushbackReader ? (PushbackReader) reader : reader instanceof BufferedReader ? new PushbackReader(reader) : new PushbackReader(new BufferedReader(reader, 200));
        int i = pushbackReader.read();
        if (i != 65279) {
            unread(pushbackReader, i);
        }
        while (this.theState != 21) {
            int i2 = pushbackReader.read();
            char c = (char) i2;
            boolean zIsHighSurrogate = Character.isHighSurrogate(c);
            int i3 = zIsHighSurrogate ? pushbackReader.read() : -1;
            if (zIsHighSurrogate) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(c);
                stringBuffer.append((char) i3);
                string = stringBuffer.toString();
            } else {
                string = null;
            }
            if (!zIsHighSurrogate && i2 >= 128 && i2 <= 159) {
                i2 = this.theWinMap[i2 - 128];
            }
            if (!zIsHighSurrogate && i2 == 13 && (i2 = pushbackReader.read()) != 10) {
                unread(pushbackReader, i2);
                i2 = 10;
            }
            if (zIsHighSurrogate || i2 != 10) {
                this.theCurrentColumn++;
            } else {
                this.theCurrentLine++;
                this.theCurrentColumn = 0;
            }
            if (!zIsHighSurrogate || i2 >= 32 || i2 == 10 || i2 == 9 || i2 == -1) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = statetable;
                    if (i4 < iArr.length) {
                        if (this.theState == iArr[i4]) {
                            int i6 = iArr[i4 + 1];
                            if (i6 == 0) {
                                i5 = iArr[i4 + 2];
                                this.theNextState = iArr[i4 + 3];
                            } else if (!zIsHighSurrogate && i6 == i2) {
                                i5 = iArr[i4 + 2];
                                this.theNextState = iArr[i4 + 3];
                            }
                            i4 += 4;
                        } else if (i5 == 0) {
                            i4 += 4;
                        }
                    }
                }
                int i7 = i5;
                switch (i7) {
                    case 0:
                        throw new Error("HTMLScanner can't cope with " + Integer.toString(i2) + " in state " + Integer.toString(this.theState));
                    case 1:
                        scanHandler.adup(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 2:
                        scanHandler.adup(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        if (string != null) {
                            save(string, i2, scanHandler);
                        }
                        this.theState = this.theNextState;
                        break;
                    case 3:
                        scanHandler.adup(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        scanHandler.stagc(this.theOutputBuffer, 0, 0);
                        this.theState = this.theNextState;
                        break;
                    case 4:
                        scanHandler.aname(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 5:
                        scanHandler.aname(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        scanHandler.adup(this.theOutputBuffer, 0, 0);
                        this.theState = this.theNextState;
                        break;
                    case 6:
                        scanHandler.aname(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        scanHandler.adup(this.theOutputBuffer, 0, 0);
                        scanHandler.stagc(this.theOutputBuffer, 0, this.theSize);
                        this.theState = this.theNextState;
                        break;
                    case 7:
                        scanHandler.aval(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 8:
                        scanHandler.aval(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        scanHandler.stagc(this.theOutputBuffer, 0, 0);
                        this.theState = this.theNextState;
                        break;
                    case 9:
                        mark();
                        int i8 = this.theSize;
                        if (i8 > 1) {
                            this.theSize = i8 - 2;
                        }
                        scanHandler.pcdata(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 10:
                        mark();
                        scanHandler.cmnt(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 11:
                        scanHandler.decl(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 12:
                        mark();
                        int i9 = this.theSize;
                        if (i9 > 0) {
                            scanHandler.mo80564gi(this.theOutputBuffer, 0, i9);
                        }
                        this.theSize = 0;
                        scanHandler.stage(this.theOutputBuffer, 0, 0);
                        this.theState = this.theNextState;
                        break;
                    case 13:
                        mark();
                        int i10 = this.theState;
                        if (i10 == 23 && c == '#') {
                            this.theNextState = 27;
                            save(string, i2, scanHandler);
                        } else if (i10 == 27 && (c == 'x' || c == 'X')) {
                            this.theNextState = 35;
                            save(string, i2, scanHandler);
                        } else if (i10 == 23 && Character.isLetterOrDigit(c)) {
                            save(string, i2, scanHandler);
                        } else if (this.theState == 27 && Character.isDigit(c)) {
                            save(string, i2, scanHandler);
                        } else if (this.theState != 35 || (!Character.isDigit(c) && "abcdefABCDEF".indexOf(c) == -1)) {
                            scanHandler.entity(this.theOutputBuffer, 1, this.theSize - 1);
                            int entity = scanHandler.getEntity();
                            if (entity != 0) {
                                this.theSize = 0;
                                if (entity >= 128 && entity <= 159) {
                                    entity = this.theWinMap[entity - 128];
                                }
                                if (entity >= 32 && (entity < 55296 || entity > 57343)) {
                                    if (entity <= 65535) {
                                        save(entity, scanHandler);
                                    } else {
                                        int i11 = entity - 65536;
                                        save((i11 >> 10) + 55296, scanHandler);
                                        save((i11 & 1023) + 56320, scanHandler);
                                    }
                                }
                                if (zIsHighSurrogate || i2 != 59) {
                                    if (zIsHighSurrogate) {
                                        unread(pushbackReader, i3);
                                        this.theCurrentColumn--;
                                    }
                                    unread(pushbackReader, i2);
                                    this.theCurrentColumn--;
                                }
                            } else {
                                if (zIsHighSurrogate) {
                                    unread(pushbackReader, i3);
                                    this.theCurrentColumn--;
                                }
                                unread(pushbackReader, i2);
                                this.theCurrentColumn--;
                            }
                            this.theNextState = 28;
                            this.theState = this.theNextState;
                        } else {
                            save(string, i2, scanHandler);
                        }
                        this.theState = this.theNextState;
                        break;
                    case 14:
                        scanHandler.pcdata(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        save(string, i2, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 15:
                        scanHandler.etag(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 16:
                        scanHandler.mo80564gi(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 17:
                        scanHandler.mo80564gi(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        scanHandler.stagc(this.theOutputBuffer, 0, 0);
                        this.theState = this.theNextState;
                        break;
                    case 18:
                        mark();
                        save(60, scanHandler);
                        save(string, i2, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 19:
                        mark();
                        save(60, scanHandler);
                        scanHandler.pcdata(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 20:
                        save(45, scanHandler);
                        save(string, i2, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 21:
                        save(45, scanHandler);
                        save(32, scanHandler);
                        save(45, scanHandler);
                        save(string, i2, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 22:
                        save(45, scanHandler);
                        save(32, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 23:
                        mark();
                        scanHandler.pcdata(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 24:
                        mark();
                        scanHandler.mo80565pi(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 25:
                        scanHandler.pitarget(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 26:
                        scanHandler.pitarget(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        scanHandler.mo80565pi(this.theOutputBuffer, 0, 0);
                        this.theState = this.theNextState;
                        break;
                    case 27:
                        save(string, i2, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 28:
                        this.theState = this.theNextState;
                        break;
                    case 29:
                        save(32, scanHandler);
                        this.theState = this.theNextState;
                        break;
                    case 30:
                        scanHandler.stagc(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    case 31:
                        unread(pushbackReader, i2);
                        this.theCurrentColumn--;
                        this.theState = this.theNextState;
                        break;
                    case 32:
                        int i12 = this.theSize;
                        if (i12 > 0) {
                            this.theSize = i12 - 1;
                        }
                        scanHandler.pcdata(this.theOutputBuffer, 0, this.theSize);
                        this.theSize = 0;
                        this.theState = this.theNextState;
                        break;
                    default:
                        throw new Error(C21532OooOOo.OooO0OO(i7, "Can't process state "));
                }
            }
        }
        scanHandler.eof(this.theOutputBuffer, 0, 0);
    }

    @Override // com.orion.notein.richeditor.converter.tagsoup.Scanner
    public void startCDATA() {
        this.theNextState = 10;
    }

    private void save(String str, int i, ScanHandler scanHandler) throws SAXException, IOException {
        if (str == null) {
            save(i, scanHandler);
            return;
        }
        save(scanHandler);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArr = this.theOutputBuffer;
            int i3 = this.theSize;
            this.theSize = i3 + 1;
            cArr[i3] = str.charAt(i2);
        }
    }

    private void save(ScanHandler scanHandler) throws SAXException, IOException {
        int i = this.theSize;
        char[] cArr = this.theOutputBuffer;
        if (i >= cArr.length - 20) {
            int i2 = this.theState;
            if (i2 != 28 && i2 != 10) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i + 1);
                this.theOutputBuffer = cArr2;
            } else {
                scanHandler.pcdata(cArr, 0, i);
                this.theSize = 0;
            }
        }
    }
}
