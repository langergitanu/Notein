package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.JSONStyle;
import com.nimbusds.jose.shaded.json.JSONValue;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class ContentHandlerCompressor implements ContentHandler {
    JSONStyle compression;
    Appendable out;
    int pos;
    int[] stack = new int[10];

    public ContentHandlerCompressor(Appendable appendable, JSONStyle jSONStyle) {
        this.out = appendable;
        this.compression = jSONStyle;
    }

    private boolean isInArray() {
        return this.stack[this.pos] == 1;
    }

    private boolean isInObject() {
        return this.stack[this.pos] == 0;
    }

    private void push(int i) {
        int i2 = this.pos + 2;
        this.pos = i2;
        int[] iArr = this.stack;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i3 = this.pos;
        iArr3[i3] = i;
        iArr3[i3 + 1] = 0;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean endArray() throws ParseException, IOException {
        this.out.append(']');
        this.pos -= 2;
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public void endJSON() throws ParseException, IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean endObject() throws ParseException, IOException {
        this.out.append('}');
        this.pos -= 2;
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean endObjectEntry() throws ParseException, IOException {
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean primitive(Object obj) throws ParseException, IOException {
        if (!isInObject()) {
            int[] iArr = this.stack;
            int i = this.pos + 1;
            int i2 = iArr[i];
            iArr[i] = i2 + 1;
            if (i2 > 0) {
                this.out.append(',');
            }
        }
        if (obj instanceof String) {
            this.compression.writeString(this.out, (String) obj);
            return false;
        }
        JSONValue.writeJSONString(obj, this.out, this.compression);
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean startArray() throws ParseException, IOException {
        if (isInArray()) {
            int[] iArr = this.stack;
            int i = this.pos + 1;
            int i2 = iArr[i];
            iArr[i] = i2 + 1;
            if (i2 > 0) {
                this.out.append(',');
            }
        }
        this.out.append('[');
        push(1);
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public void startJSON() throws ParseException, IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean startObject() throws ParseException, IOException {
        if (isInArray()) {
            int[] iArr = this.stack;
            int i = this.pos + 1;
            int i2 = iArr[i];
            iArr[i] = i2 + 1;
            if (i2 > 0) {
                this.out.append(',');
            }
        }
        this.out.append('{');
        push(0);
        return false;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContentHandler
    public boolean startObjectEntry(String str) throws ParseException, IOException {
        int[] iArr = this.stack;
        int i = this.pos + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        if (i2 > 0) {
            this.out.append(',');
        }
        if (str == null) {
            this.out.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        } else if (this.compression.mustProtectKey(str)) {
            this.out.append('\"');
            JSONValue.escape(str, this.out, this.compression);
            this.out.append('\"');
        } else {
            this.out.append(str);
        }
        this.out.append(':');
        return false;
    }
}
