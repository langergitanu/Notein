package com.nimbusds.jose.shaded.json;

import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class JSONStyleIdent extends JSONStyle {
    int deep;
    char identChar;
    String newline;

    public JSONStyleIdent(int i) {
        super(i);
        this.identChar = ControlChar.SPACE_CHAR;
        this.newline = IOUtils.LINE_SEPARATOR_UNIX;
        this.deep = 0;
    }

    private void ident(Appendable appendable) throws IOException {
        appendable.append(this.newline);
        for (int i = 0; i < this.deep; i++) {
            appendable.append(this.identChar);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayNextElm(Appendable appendable) throws IOException {
        appendable.append(',');
        ident(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayObjectEnd(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayStart(Appendable appendable) throws IOException {
        appendable.append('[');
        this.deep++;
        ident(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayStop(Appendable appendable) throws IOException {
        this.deep--;
        ident(appendable);
        appendable.append(']');
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void arrayfirstObject(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectElmStop(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectEndOfKey(Appendable appendable) throws IOException {
        appendable.append(':');
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectFirstStart(Appendable appendable) throws IOException {
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectNext(Appendable appendable) throws IOException {
        appendable.append(',');
        ident(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectStart(Appendable appendable) throws IOException {
        appendable.append('{');
        this.deep++;
        ident(appendable);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStyle
    public void objectStop(Appendable appendable) throws IOException {
        this.deep--;
        ident(appendable);
        appendable.append('}');
    }

    public JSONStyleIdent() {
        this.identChar = ControlChar.SPACE_CHAR;
        this.newline = IOUtils.LINE_SEPARATOR_UNIX;
        this.deep = 0;
    }
}
