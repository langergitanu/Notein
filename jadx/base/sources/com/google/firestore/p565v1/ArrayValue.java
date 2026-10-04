package com.google.firestore.p565v1;

import com.google.firestore.p565v1.Value;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ArrayValue extends GeneratedMessageLite<ArrayValue, Builder> implements ArrayValueOrBuilder {
    private static final ArrayValue DEFAULT_INSTANCE;
    private static volatile Parser<ArrayValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.google.firestore.v1.ArrayValue$1 */
    public static /* synthetic */ class C172791 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51844xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51844xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51844xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51844xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51844xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51844xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51844xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51844xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ArrayValue, Builder> implements ArrayValueOrBuilder {
        public /* synthetic */ Builder(C172791 c172791) {
            this();
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            copyOnWrite();
            ((ArrayValue) this.instance).addAllValues(iterable);
            return this;
        }

        public Builder addValues(Value value) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(value);
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((ArrayValue) this.instance).clearValues();
            return this;
        }

        @Override // com.google.firestore.p565v1.ArrayValueOrBuilder
        public Value getValues(int i) {
            return ((ArrayValue) this.instance).getValues(i);
        }

        @Override // com.google.firestore.p565v1.ArrayValueOrBuilder
        public int getValuesCount() {
            return ((ArrayValue) this.instance).getValuesCount();
        }

        @Override // com.google.firestore.p565v1.ArrayValueOrBuilder
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ArrayValue) this.instance).getValuesList());
        }

        public Builder removeValues(int i) {
            copyOnWrite();
            ((ArrayValue) this.instance).removeValues(i);
            return this;
        }

        public Builder setValues(int i, Value value) {
            copyOnWrite();
            ((ArrayValue) this.instance).setValues(i, value);
            return this;
        }

        private Builder() {
            super(ArrayValue.DEFAULT_INSTANCE);
        }

        public Builder addValues(int i, Value value) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(i, value);
            return this;
        }

        public Builder setValues(int i, Value.Builder builder) {
            copyOnWrite();
            ((ArrayValue) this.instance).setValues(i, builder.build());
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(builder.build());
            return this;
        }

        public Builder addValues(int i, Value.Builder builder) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(i, builder.build());
            return this;
        }
    }

    static {
        ArrayValue arrayValue = new ArrayValue();
        DEFAULT_INSTANCE = arrayValue;
        GeneratedMessageLite.registerDefaultInstance(ArrayValue.class, arrayValue);
    }

    private ArrayValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Value> protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ArrayValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArrayValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArrayValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, value);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C172791 c172791 = null;
        switch (C172791.f51844xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArrayValue();
            case 2:
                return new Builder(c172791);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArrayValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ArrayValue.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firestore.p565v1.ArrayValueOrBuilder
    public Value getValues(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.firestore.p565v1.ArrayValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.firestore.p565v1.ArrayValueOrBuilder
    public List<Value> getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public static Builder newBuilder(ArrayValue arrayValue) {
        return DEFAULT_INSTANCE.createBuilder(arrayValue);
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArrayValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArrayValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, value);
    }

    public static ArrayValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArrayValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArrayValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArrayValue parseFrom(InputStream inputStream) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArrayValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArrayValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArrayValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
