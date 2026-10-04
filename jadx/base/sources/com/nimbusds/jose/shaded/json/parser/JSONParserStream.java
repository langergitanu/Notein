package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
abstract class JSONParserStream extends JSONParserBase {
    public JSONParserStream(int i) {
        super(i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNQString(boolean[] zArr) throws IOException {
        this.f57424sb.clear();
        skipNQString(zArr);
        this.f57426xs = this.f57424sb.toString().trim();
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public Object readNumber(boolean[] zArr) throws ParseException, IOException {
        this.f57424sb.clear();
        this.f57424sb.append(this.f57423c);
        read();
        skipDigits();
        char c = this.f57423c;
        if (c != '.' && c != 'E' && c != 'e') {
            skipSpace();
            char c2 = this.f57423c;
            if (c2 < 0 || c2 >= '~' || zArr[c2] || c2 == 26) {
                String strTrim = this.f57424sb.toString().trim();
                this.f57426xs = strTrim;
                return parseNumber(strTrim);
            }
            skipNQString(zArr);
            String strTrim2 = this.f57424sb.toString().trim();
            this.f57426xs = strTrim2;
            if (this.acceptNonQuote) {
                return strTrim2;
            }
            throw new ParseException(this.pos, 1, this.f57426xs);
        }
        if (c == '.') {
            this.f57424sb.append(c);
            read();
            skipDigits();
        }
        char c3 = this.f57423c;
        if (c3 != 'E' && c3 != 'e') {
            skipSpace();
            char c4 = this.f57423c;
            if (c4 < 0 || c4 >= '~' || zArr[c4] || c4 == 26) {
                this.f57426xs = this.f57424sb.toString().trim();
                return extractFloat();
            }
            skipNQString(zArr);
            String strTrim3 = this.f57424sb.toString().trim();
            this.f57426xs = strTrim3;
            if (this.acceptNonQuote) {
                return strTrim3;
            }
            throw new ParseException(this.pos, 1, this.f57426xs);
        }
        this.f57424sb.append('E');
        read();
        char c5 = this.f57423c;
        if (c5 != '+' && c5 != '-' && (c5 < '0' || c5 > '9')) {
            skipNQString(zArr);
            this.f57426xs = this.f57424sb.toString().trim();
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
            this.f57426xs = this.f57424sb.toString().trim();
            return extractFloat();
        }
        skipNQString(zArr);
        String strTrim4 = this.f57424sb.toString().trim();
        this.f57426xs = strTrim4;
        if (this.acceptNonQuote) {
            return strTrim4;
        }
        throw new ParseException(this.pos, 1, this.f57426xs);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readString() throws ParseException, IOException {
        if (this.acceptSimpleQuote || this.f57423c != '\'') {
            this.f57424sb.clear();
            readString2();
        } else {
            if (!this.acceptNonQuote) {
                throw new ParseException(this.pos, 0, Character.valueOf(this.f57423c));
            }
            readNQString(JSONParserBase.stopAll);
        }
    }
}
