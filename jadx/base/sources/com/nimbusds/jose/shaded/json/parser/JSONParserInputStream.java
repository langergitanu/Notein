package com.nimbusds.jose.shaded.json.parser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
class JSONParserInputStream extends JSONParserReader {
    public JSONParserInputStream(int i) {
        super(i);
    }

    public Object parse(InputStream inputStream) throws ParseException, UnsupportedEncodingException {
        return parse(inputStream, ContainerFactory.FACTORY_SIMPLE, ContentHandlerDumy.HANDLER);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory) throws ParseException, UnsupportedEncodingException {
        return parse(inputStream, containerFactory, ContentHandlerDumy.HANDLER);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException, UnsupportedEncodingException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf8");
        this.pos = -1;
        return super.parse(inputStreamReader, containerFactory, contentHandler);
    }
}
