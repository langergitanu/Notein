package com.huawei.cloud.base.json.gson;

import OooO0O0.OooO00o;
import com.huawei.cloud.base.json.JsonFactory;
import com.huawei.cloud.base.json.JsonParser;
import com.huawei.cloud.base.json.JsonToken;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.hms.drive.C17790b;
import com.huawei.hms.drive.EnumC17817c;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
class GsonParser extends JsonParser {
    private List<String> currentNameStack = new ArrayList();
    private String currentText;
    private JsonToken currentToken;
    private final GsonFactory factory;
    private final C17790b reader;

    /* JADX INFO: renamed from: com.huawei.cloud.base.json.gson.GsonParser$1 */
    public static /* synthetic */ class C176871 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;
        static final /* synthetic */ int[] $SwitchMap$com$huawei$cloud$base$json$JsonToken;

        static {
            int[] iArr = new int[EnumC17817c.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[EnumC17817c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[EnumC17817c.NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            $SwitchMap$com$huawei$cloud$base$json$JsonToken = iArr2;
            try {
                iArr2[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.START_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public GsonParser(GsonFactory gsonFactory, C17790b c17790b) {
        this.factory = gsonFactory;
        this.reader = c17790b;
        c17790b.m76112a(true);
    }

    private void checkNumber() {
        JsonToken jsonToken = this.currentToken;
        Preconditions.checkArgument(jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT);
    }

    private void prepareForJsonReader() throws IOException {
        JsonToken jsonToken = this.currentToken;
        if (jsonToken != null) {
            int i = C176871.$SwitchMap$com$huawei$cloud$base$json$JsonToken[jsonToken.ordinal()];
            if (i == 1) {
                this.reader.m76111a();
                this.currentNameStack.add(null);
            } else {
                if (i != 2) {
                    return;
                }
                this.reader.m76114c();
                this.currentNameStack.add(null);
            }
        }
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public BigInteger getBigIntegerValue() {
        checkNumber();
        return new BigInteger(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public byte getByteValue() {
        checkNumber();
        return Byte.parseByte(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public String getCurrentName() {
        if (this.currentNameStack.isEmpty()) {
            return null;
        }
        return (String) OooO00o.OooO00o(1, this.currentNameStack);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public JsonToken getCurrentToken() {
        return this.currentToken;
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public BigDecimal getDecimalValue() {
        checkNumber();
        return new BigDecimal(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public double getDoubleValue() {
        checkNumber();
        return Double.parseDouble(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public JsonFactory getFactory() {
        return this.factory;
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public float getFloatValue() {
        checkNumber();
        return Float.parseFloat(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public int getIntValue() {
        checkNumber();
        return Integer.parseInt(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public long getLongValue() {
        checkNumber();
        return Long.parseLong(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public short getShortValue() {
        checkNumber();
        return Short.parseShort(this.currentText);
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public String getText() {
        return this.currentText;
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public JsonToken nextToken() throws IOException {
        EnumC17817c enumC17817cM76116e;
        prepareForJsonReader();
        try {
            enumC17817cM76116e = this.reader.m76116e();
        } catch (EOFException unused) {
            enumC17817cM76116e = EnumC17817c.END_DOCUMENT;
        }
        switch (C176871.$SwitchMap$com$google$gson$stream$JsonToken[enumC17817cM76116e.ordinal()]) {
            case 1:
                this.currentText = "[";
                this.currentToken = JsonToken.START_ARRAY;
                break;
            case 2:
                this.currentText = "]";
                this.currentToken = JsonToken.END_ARRAY;
                this.currentNameStack.remove(r0.size() - 1);
                this.reader.m76113b();
                break;
            case 3:
                this.currentText = "{";
                this.currentToken = JsonToken.START_OBJECT;
                break;
            case 4:
                this.currentText = "}";
                this.currentToken = JsonToken.END_OBJECT;
                this.currentNameStack.remove(r0.size() - 1);
                this.reader.m76115d();
                break;
            case 5:
                if (!this.reader.m76120i()) {
                    this.currentText = TelemetryEventStrings.Value.FALSE;
                    this.currentToken = JsonToken.VALUE_FALSE;
                } else {
                    this.currentText = TelemetryEventStrings.Value.TRUE;
                    this.currentToken = JsonToken.VALUE_TRUE;
                }
                break;
            case 6:
                this.currentText = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                this.currentToken = JsonToken.VALUE_NULL;
                this.reader.m76121j();
                break;
            case 7:
                this.currentText = this.reader.m76119h();
                this.currentToken = JsonToken.VALUE_STRING;
                break;
            case 8:
                String strM76119h = this.reader.m76119h();
                this.currentText = strM76119h;
                this.currentToken = strM76119h.indexOf(46) == -1 ? JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.currentText = this.reader.m76118g();
                this.currentToken = JsonToken.FIELD_NAME;
                this.currentNameStack.set(r0.size() - 1, this.currentText);
                break;
            default:
                this.currentText = null;
                this.currentToken = null;
                break;
        }
        return this.currentToken;
    }

    @Override // com.huawei.cloud.base.json.JsonParser
    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this.currentToken;
        if (jsonToken != null) {
            int i = C176871.$SwitchMap$com$huawei$cloud$base$json$JsonToken[jsonToken.ordinal()];
            if (i == 1) {
                this.reader.m76122k();
                this.currentText = "]";
                this.currentToken = JsonToken.END_ARRAY;
            } else if (i == 2) {
                this.reader.m76122k();
                this.currentText = "}";
                this.currentToken = JsonToken.END_OBJECT;
                return this;
            }
        }
        return this;
    }
}
