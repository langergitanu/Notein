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
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class WriteResult extends GeneratedMessageLite<WriteResult, Builder> implements WriteResultOrBuilder {
    private static final WriteResult DEFAULT_INSTANCE;
    private static volatile Parser<WriteResult> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<Value> transformResults_ = GeneratedMessageLite.emptyProtobufList();
    private Timestamp updateTime_;

    /* JADX INFO: renamed from: com.google.firestore.v1.WriteResult$1 */
    public static /* synthetic */ class C173311 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51889xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51889xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51889xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51889xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51889xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51889xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51889xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51889xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteResult, Builder> implements WriteResultOrBuilder {
        public /* synthetic */ Builder(C173311 c173311) {
            this();
        }

        public Builder addAllTransformResults(Iterable<? extends Value> iterable) {
            copyOnWrite();
            ((WriteResult) this.instance).addAllTransformResults(iterable);
            return this;
        }

        public Builder addTransformResults(Value value) {
            copyOnWrite();
            ((WriteResult) this.instance).addTransformResults(value);
            return this;
        }

        public Builder clearTransformResults() {
            copyOnWrite();
            ((WriteResult) this.instance).clearTransformResults();
            return this;
        }

        public Builder clearUpdateTime() {
            copyOnWrite();
            ((WriteResult) this.instance).clearUpdateTime();
            return this;
        }

        @Override // com.google.firestore.p565v1.WriteResultOrBuilder
        public Value getTransformResults(int i) {
            return ((WriteResult) this.instance).getTransformResults(i);
        }

        @Override // com.google.firestore.p565v1.WriteResultOrBuilder
        public int getTransformResultsCount() {
            return ((WriteResult) this.instance).getTransformResultsCount();
        }

        @Override // com.google.firestore.p565v1.WriteResultOrBuilder
        public List<Value> getTransformResultsList() {
            return Collections.unmodifiableList(((WriteResult) this.instance).getTransformResultsList());
        }

        @Override // com.google.firestore.p565v1.WriteResultOrBuilder
        public Timestamp getUpdateTime() {
            return ((WriteResult) this.instance).getUpdateTime();
        }

        @Override // com.google.firestore.p565v1.WriteResultOrBuilder
        public boolean hasUpdateTime() {
            return ((WriteResult) this.instance).hasUpdateTime();
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            copyOnWrite();
            ((WriteResult) this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder removeTransformResults(int i) {
            copyOnWrite();
            ((WriteResult) this.instance).removeTransformResults(i);
            return this;
        }

        public Builder setTransformResults(int i, Value value) {
            copyOnWrite();
            ((WriteResult) this.instance).setTransformResults(i, value);
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            copyOnWrite();
            ((WriteResult) this.instance).setUpdateTime(timestamp);
            return this;
        }

        private Builder() {
            super(WriteResult.DEFAULT_INSTANCE);
        }

        public Builder addTransformResults(int i, Value value) {
            copyOnWrite();
            ((WriteResult) this.instance).addTransformResults(i, value);
            return this;
        }

        public Builder setTransformResults(int i, Value.Builder builder) {
            copyOnWrite();
            ((WriteResult) this.instance).setTransformResults(i, builder.build());
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            copyOnWrite();
            ((WriteResult) this.instance).setUpdateTime(builder.build());
            return this;
        }

        public Builder addTransformResults(Value.Builder builder) {
            copyOnWrite();
            ((WriteResult) this.instance).addTransformResults(builder.build());
            return this;
        }

        public Builder addTransformResults(int i, Value.Builder builder) {
            copyOnWrite();
            ((WriteResult) this.instance).addTransformResults(i, builder.build());
            return this;
        }
    }

    static {
        WriteResult writeResult = new WriteResult();
        DEFAULT_INSTANCE = writeResult;
        GeneratedMessageLite.registerDefaultInstance(WriteResult.class, writeResult);
    }

    private WriteResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTransformResults(Iterable<? extends Value> iterable) {
        ensureTransformResultsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.transformResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransformResults(Value value) {
        value.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransformResults() {
        this.transformResults_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.updateTime_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureTransformResultsIsMutable() {
        Internal.ProtobufList<Value> protobufList = this.transformResults_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.transformResults_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WriteResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updateTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.updateTime_ = timestamp;
        } else {
            this.updateTime_ = Timestamp.newBuilder(this.updateTime_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WriteResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTransformResults(int i) {
        ensureTransformResultsIsMutable();
        this.transformResults_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransformResults(int i, Value value) {
        value.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.set(i, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.updateTime_ = timestamp;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C173311 c173311 = null;
        switch (C173311.f51889xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new WriteResult();
            case 2:
                return new Builder(c173311);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WriteResult> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WriteResult.class) {
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

    @Override // com.google.firestore.p565v1.WriteResultOrBuilder
    public Value getTransformResults(int i) {
        return this.transformResults_.get(i);
    }

    @Override // com.google.firestore.p565v1.WriteResultOrBuilder
    public int getTransformResultsCount() {
        return this.transformResults_.size();
    }

    @Override // com.google.firestore.p565v1.WriteResultOrBuilder
    public List<Value> getTransformResultsList() {
        return this.transformResults_;
    }

    public ValueOrBuilder getTransformResultsOrBuilder(int i) {
        return this.transformResults_.get(i);
    }

    public List<? extends ValueOrBuilder> getTransformResultsOrBuilderList() {
        return this.transformResults_;
    }

    @Override // com.google.firestore.p565v1.WriteResultOrBuilder
    public Timestamp getUpdateTime() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.google.firestore.p565v1.WriteResultOrBuilder
    public boolean hasUpdateTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WriteResult writeResult) {
        return DEFAULT_INSTANCE.createBuilder(writeResult);
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WriteResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WriteResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransformResults(int i, Value value) {
        value.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.add(i, value);
    }

    public static WriteResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WriteResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WriteResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WriteResult parseFrom(InputStream inputStream) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
