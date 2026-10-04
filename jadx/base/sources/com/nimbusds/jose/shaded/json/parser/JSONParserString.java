package com.nimbusds.jose.shaded.json.parser;

/* JADX INFO: loaded from: classes9.dex */
class JSONParserString extends JSONParserMemory {

    /* JADX INFO: renamed from: in */
    private String f57431in;

    public JSONParserString(int i) {
        super(i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public void extractString(int i, int i2) {
        this.f57426xs = this.f57431in.substring(i, i2);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public int indexOf(char c, int i) {
        return this.f57431in.indexOf(c, i);
    }

    public Object parse(String str) throws ParseException {
        return parse(str, ContainerFactory.FACTORY_SIMPLE, ContentHandlerDumy.HANDLER);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void read() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.f57423c = (char) 26;
        } else {
            this.f57423c = this.f57431in.charAt(i);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNoEnd() throws ParseException {
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.len) {
            this.f57423c = this.f57431in.charAt(i);
        } else {
            this.f57423c = (char) 26;
            throw new ParseException(this.pos - 1, 3, "EOF");
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readS() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.f57423c = (char) 26;
        } else {
            this.f57423c = this.f57431in.charAt(i);
        }
    }

    public Object parse(String str, ContainerFactory containerFactory) throws ParseException {
        return parse(str, containerFactory, ContentHandlerDumy.HANDLER);
    }

    public Object parse(String str, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        this.f57431in = str;
        this.len = str.length();
        this.pos = -1;
        return parse(containerFactory, contentHandler);
    }
}
