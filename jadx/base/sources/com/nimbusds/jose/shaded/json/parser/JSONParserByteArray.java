package com.nimbusds.jose.shaded.json.parser;

/* JADX INFO: loaded from: classes9.dex */
class JSONParserByteArray extends JSONParserMemory {

    /* JADX INFO: renamed from: in */
    private byte[] f57429in;

    public JSONParserByteArray(int i) {
        super(i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public void extractString(int i, int i2) {
        this.f57426xs = new String(this.f57429in, i, i2 - i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public int indexOf(char c, int i) {
        while (i < this.len) {
            if (this.f57429in[i] == ((byte) c)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Object parse(byte[] bArr) throws ParseException {
        return parse(bArr, ContainerFactory.FACTORY_SIMPLE, ContentHandlerDumy.HANDLER);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void read() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.f57423c = (char) 26;
        } else {
            this.f57423c = (char) this.f57429in[i];
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNoEnd() throws ParseException {
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.len) {
            this.f57423c = (char) this.f57429in[i];
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
            this.f57423c = (char) this.f57429in[i];
        }
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory) throws ParseException {
        return parse(bArr, containerFactory, ContentHandlerDumy.HANDLER);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        this.f57429in = bArr;
        this.len = bArr.length;
        this.pos = -1;
        return parse(containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr, int i, int i2, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        this.f57429in = bArr;
        this.len = i2;
        this.pos = i - 1;
        return parse(containerFactory, contentHandler);
    }
}
