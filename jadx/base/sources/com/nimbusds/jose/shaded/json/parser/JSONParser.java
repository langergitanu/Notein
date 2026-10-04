package com.nimbusds.jose.shaded.json.parser;

import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public class JSONParser {
    public static final int ACCEPT_LEADING_ZERO = 32;
    public static final int ACCEPT_NAN = 4;
    public static final int ACCEPT_NON_QUOTE = 2;
    public static final int ACCEPT_SIMPLE_QUOTE = 1;
    public static final int ACCEPT_TAILLING_DATA = 256;
    public static final int ACCEPT_TAILLING_SPACE = 512;
    public static final int ACCEPT_USELESS_COMMA = 64;
    public static int DEFAULT_PERMISSIVE_MODE = 0;
    public static final int IGNORE_CONTROL_CHAR = 8;
    public static final int MODE_JSON_SIMPLE = 960;
    public static final int MODE_PERMISSIVE = -1;
    public static final int MODE_RFC4627 = 400;
    public static final int MODE_STRICTEST = 144;
    public static final int USE_HI_PRECISION_FLOAT = 128;
    public static final int USE_INTEGER_STORAGE = 16;
    private int mode;
    private JSONParserByteArray pBytes;
    private JSONParserInputStream pSBintream;
    private JSONParserReader pStream;
    private JSONParserString pString;

    static {
        DEFAULT_PERMISSIVE_MODE = System.getProperty("JSON_SMART_SIMPLE") != null ? MODE_JSON_SIMPLE : -1;
    }

    public JSONParser() {
        this.mode = DEFAULT_PERMISSIVE_MODE;
    }

    public Object parse(String str) throws ParseException {
        if (this.pString == null) {
            this.pString = new JSONParserString(this.mode);
        }
        return this.pString.parse(str);
    }

    public JSONParser(int i) {
        this.mode = i;
    }

    public Object parse(String str, ContainerFactory containerFactory) throws ParseException {
        if (this.pString == null) {
            this.pString = new JSONParserString(this.mode);
        }
        return this.pString.parse(str, containerFactory);
    }

    public Object parse(String str, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.pString == null) {
            this.pString = new JSONParserString(this.mode);
        }
        return this.pString.parse(str, containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr) throws ParseException {
        if (this.pBytes == null) {
            this.pBytes = new JSONParserByteArray(this.mode);
        }
        return this.pBytes.parse(bArr);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory) throws ParseException {
        if (this.pBytes == null) {
            this.pBytes = new JSONParserByteArray(this.mode);
        }
        return this.pBytes.parse(bArr, containerFactory);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.pBytes == null) {
            this.pBytes = new JSONParserByteArray(this.mode);
        }
        return this.pBytes.parse(bArr, containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr, int i, int i2) throws ParseException {
        if (this.pBytes == null) {
            this.pBytes = new JSONParserByteArray(this.mode);
        }
        return this.pBytes.parse(bArr, i, i2, ContainerFactory.FACTORY_SIMPLE, ContentHandlerDumy.HANDLER);
    }

    public Object parse(byte[] bArr, int i, int i2, ContainerFactory containerFactory) throws ParseException {
        if (this.pBytes == null) {
            this.pBytes = new JSONParserByteArray(this.mode);
        }
        return this.pBytes.parse(bArr, i, i2, containerFactory, ContentHandlerDumy.HANDLER);
    }

    public Object parse(byte[] bArr, int i, int i2, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.pBytes == null) {
            this.pBytes = new JSONParserByteArray(this.mode);
        }
        return this.pBytes.parse(bArr, i, i2, containerFactory, contentHandler);
    }

    public Object parse(Reader reader) throws ParseException {
        if (this.pStream == null) {
            this.pStream = new JSONParserReader(this.mode);
        }
        return this.pStream.parse(reader);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory) throws ParseException {
        if (this.pStream == null) {
            this.pStream = new JSONParserReader(this.mode);
        }
        return this.pStream.parse(reader, containerFactory);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.pStream == null) {
            this.pStream = new JSONParserReader(this.mode);
        }
        return this.pStream.parse(reader, containerFactory, contentHandler);
    }

    public Object parse(InputStream inputStream) throws ParseException, UnsupportedEncodingException {
        if (this.pSBintream == null) {
            this.pSBintream = new JSONParserInputStream(this.mode);
        }
        return this.pSBintream.parse(inputStream);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory) throws ParseException, UnsupportedEncodingException {
        if (this.pSBintream == null) {
            this.pSBintream = new JSONParserInputStream(this.mode);
        }
        return this.pSBintream.parse(inputStream, containerFactory);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException, UnsupportedEncodingException {
        if (this.pSBintream == null) {
            this.pSBintream = new JSONParserInputStream(this.mode);
        }
        return this.pSBintream.parse(inputStream, containerFactory, contentHandler);
    }
}
