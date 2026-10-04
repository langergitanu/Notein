package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
abstract class JSONParserMemory extends JSONParserBase {
    protected int len;

    public JSONParserMemory(int i) {
        super(i);
    }

    public abstract void extractString(int i, int i2);

    public void extractStringTrim(int i, int i2) {
        extractString(i, i2);
        this.f57426xs = this.f57426xs.trim();
    }

    public abstract int indexOf(char c, int i);

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNQString(boolean[] zArr) throws IOException {
        int i = this.pos;
        skipNQString(zArr);
        extractStringTrim(i, this.pos);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public Object readNumber(boolean[] zArr) throws ParseException, IOException {
        int i = this.pos;
        read();
        skipDigits();
        char c = this.f57423c;
        if (c != '.' && c != 'E' && c != 'e') {
            skipSpace();
            char c2 = this.f57423c;
            if (c2 < 0 || c2 >= '~' || zArr[c2] || c2 == 26) {
                extractStringTrim(i, this.pos);
                return parseNumber(this.f57426xs);
            }
            skipNQString(zArr);
            extractStringTrim(i, this.pos);
            if (this.acceptNonQuote) {
                return this.f57426xs;
            }
            throw new ParseException(this.pos, 1, this.f57426xs);
        }
        if (c == '.') {
            read();
            skipDigits();
        }
        char c3 = this.f57423c;
        if (c3 != 'E' && c3 != 'e') {
            skipSpace();
            char c4 = this.f57423c;
            if (c4 < 0 || c4 >= '~' || zArr[c4] || c4 == 26) {
                extractStringTrim(i, this.pos);
                return extractFloat();
            }
            skipNQString(zArr);
            extractStringTrim(i, this.pos);
            if (this.acceptNonQuote) {
                return this.f57426xs;
            }
            throw new ParseException(this.pos, 1, this.f57426xs);
        }
        this.f57424sb.append('E');
        read();
        char c5 = this.f57423c;
        if (c5 != '+' && c5 != '-' && (c5 < '0' || c5 > '9')) {
            skipNQString(zArr);
            extractStringTrim(i, this.pos);
            if (!this.acceptNonQuote) {
                throw new ParseException(this.pos, 1, this.f57426xs);
            }
            if (!this.acceptLeadinZero) {
                checkLeadinZero();
            }
            return this.f57426xs;
        }
        this.f57424sb.append(c5);
        read();
        skipDigits();
        skipSpace();
        char c6 = this.f57423c;
        if (c6 < 0 || c6 >= '~' || zArr[c6] || c6 == 26) {
            extractStringTrim(i, this.pos);
            return extractFloat();
        }
        skipNQString(zArr);
        extractStringTrim(i, this.pos);
        if (this.acceptNonQuote) {
            return this.f57426xs;
        }
        throw new ParseException(this.pos, 1, this.f57426xs);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readString() throws ParseException, IOException {
        if (!this.acceptSimpleQuote && this.f57423c == '\'') {
            if (!this.acceptNonQuote) {
                throw new ParseException(this.pos, 0, Character.valueOf(this.f57423c));
            }
            readNQString(JSONParserBase.stopAll);
            return;
        }
        int iIndexOf = indexOf(this.f57423c, this.pos + 1);
        if (iIndexOf == -1) {
            throw new ParseException(this.len, 3, null);
        }
        extractString(this.pos + 1, iIndexOf);
        if (this.f57426xs.indexOf(92) != -1) {
            this.f57424sb.clear();
            readString2();
        } else {
            checkControleChar();
            this.pos = iIndexOf;
            read();
        }
    }
}
