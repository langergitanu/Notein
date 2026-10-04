package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes9.dex */
class JSONParserReader extends JSONParserStream {

    /* JADX INFO: renamed from: in */
    private Reader f57430in;

    public JSONParserReader(int i) {
        super(i);
    }

    public Object parse(Reader reader) throws ParseException {
        return parse(reader, ContainerFactory.FACTORY_SIMPLE, ContentHandlerDumy.HANDLER);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void read() throws IOException {
        int i = this.f57430in.read();
        this.f57423c = i == -1 ? (char) 26 : (char) i;
        this.pos++;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNoEnd() throws ParseException, IOException {
        int i = this.f57430in.read();
        if (i == -1) {
            throw new ParseException(this.pos - 1, 3, "EOF");
        }
        this.f57423c = (char) i;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readS() throws IOException {
        this.f57424sb.append(this.f57423c);
        int i = this.f57430in.read();
        if (i == -1) {
            this.f57423c = (char) 26;
        } else {
            this.f57423c = (char) i;
            this.pos++;
        }
    }

    public Object parse(Reader reader, ContainerFactory containerFactory) throws ParseException {
        return parse(reader, containerFactory, ContentHandlerDumy.HANDLER);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        this.f57430in = reader;
        this.pos = -1;
        return super.parse(containerFactory, contentHandler);
    }
}
