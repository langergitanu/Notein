package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.JStylerObj;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class JSONStyle {
    public static final int FLAG_AGRESSIVE = 8;
    public static final int FLAG_IGNORE_NULL = 16;
    public static final int FLAG_PROTECT_4WEB = 2;
    public static final int FLAG_PROTECT_KEYS = 1;
    public static final int FLAG_PROTECT_VALUES = 4;
    private boolean _ignore_null;
    private boolean _protect4Web;
    private boolean _protectKeys;
    private boolean _protectValues;
    private JStylerObj.StringProtector esc;
    private JStylerObj.MustProtect mpKey;
    private JStylerObj.MustProtect mpValue;
    public static final JSONStyle NO_COMPRESS = new JSONStyle();
    public static final JSONStyle MAX_COMPRESS = new JSONStyle(-1);
    public static final JSONStyle LT_COMPRESS = new JSONStyle(2);

    public JSONStyle(int i) {
        boolean z = (i & 1) == 0;
        this._protectKeys = z;
        boolean z2 = (i & 4) == 0;
        this._protectValues = z2;
        boolean z3 = (i & 2) == 0;
        this._protect4Web = z3;
        this._ignore_null = (i & 16) > 0;
        JStylerObj.MustProtect mustProtect = (i & 8) > 0 ? JStylerObj.MP_AGGRESIVE : JStylerObj.MP_SIMPLE;
        if (z2) {
            this.mpValue = JStylerObj.MP_TRUE;
        } else {
            this.mpValue = mustProtect;
        }
        if (z) {
            this.mpKey = JStylerObj.MP_TRUE;
        } else {
            this.mpKey = mustProtect;
        }
        if (z3) {
            this.esc = JStylerObj.ESCAPE4Web;
        } else {
            this.esc = JStylerObj.ESCAPE_LT;
        }
    }

    public void arrayNextElm(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void arrayObjectEnd(Appendable appendable) throws IOException {
    }

    public void arrayStart(Appendable appendable) throws IOException {
        appendable.append('[');
    }

    public void arrayStop(Appendable appendable) throws IOException {
        appendable.append(']');
    }

    public void arrayfirstObject(Appendable appendable) throws IOException {
    }

    public void escape(String str, Appendable appendable) {
        this.esc.escape(str, appendable);
    }

    public boolean ignoreNull() {
        return this._ignore_null;
    }

    public boolean indent() {
        return false;
    }

    public boolean mustProtectKey(String str) {
        return this.mpKey.mustBeProtect(str);
    }

    public boolean mustProtectValue(String str) {
        return this.mpValue.mustBeProtect(str);
    }

    public void objectElmStop(Appendable appendable) throws IOException {
    }

    public void objectEndOfKey(Appendable appendable) throws IOException {
        appendable.append(':');
    }

    public void objectFirstStart(Appendable appendable) throws IOException {
    }

    public void objectNext(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void objectStart(Appendable appendable) throws IOException {
        appendable.append('{');
    }

    public void objectStop(Appendable appendable) throws IOException {
        appendable.append('}');
    }

    public boolean protect4Web() {
        return this._protect4Web;
    }

    public boolean protectKeys() {
        return this._protectKeys;
    }

    public boolean protectValues() {
        return this._protectValues;
    }

    public void writeString(Appendable appendable, String str) throws IOException {
        if (!mustProtectValue(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        JSONValue.escape(str, appendable, this);
        appendable.append('\"');
    }

    public JSONStyle() {
        this(0);
    }
}
