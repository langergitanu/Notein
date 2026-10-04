package com.google.firestore.p565v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class BeginTransactionResponse extends GeneratedMessageLite<BeginTransactionResponse, Builder> implements BeginTransactionResponseOrBuilder {
    private static final BeginTransactionResponse DEFAULT_INSTANCE;
    private static volatile Parser<BeginTransactionResponse> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private ByteString transaction_ = ByteString.EMPTY;

    /* JADX INFO: renamed from: com.google.firestore.v1.BeginTransactionResponse$1 */
    public static /* synthetic */ class C172831 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51848xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51848xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51848xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51848xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51848xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51848xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51848xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51848xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BeginTransactionResponse, Builder> implements BeginTransactionResponseOrBuilder {
        public /* synthetic */ Builder(C172831 c172831) {
            this();
        }

        public Builder clearTransaction() {
            copyOnWrite();
            ((BeginTransactionResponse) this.instance).clearTransaction();
            return this;
        }

        @Override // com.google.firestore.p565v1.BeginTransactionResponseOrBuilder
        public ByteString getTransaction() {
            return ((BeginTransactionResponse) this.instance).getTransaction();
        }

        public Builder setTransaction(ByteString byteString) {
            copyOnWrite();
            ((BeginTransactionResponse) this.instance).setTransaction(byteString);
            return this;
        }

        private Builder() {
            super(BeginTransactionResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        BeginTransactionResponse beginTransactionResponse = new BeginTransactionResponse();
        DEFAULT_INSTANCE = beginTransactionResponse;
        GeneratedMessageLite.registerDefaultInstance(BeginTransactionResponse.class, beginTransactionResponse);
    }

    private BeginTransactionResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public static BeginTransactionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BeginTransactionResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BeginTransactionResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BeginTransactionResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.transaction_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C172831 c172831 = null;
        switch (C172831.f51848xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BeginTransactionResponse();
            case 2:
                return new Builder(c172831);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BeginTransactionResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BeginTransactionResponse.class) {
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

    @Override // com.google.firestore.p565v1.BeginTransactionResponseOrBuilder
    public ByteString getTransaction() {
        return this.transaction_;
    }

    public static Builder newBuilder(BeginTransactionResponse beginTransactionResponse) {
        return DEFAULT_INSTANCE.createBuilder(beginTransactionResponse);
    }

    public static BeginTransactionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BeginTransactionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BeginTransactionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BeginTransactionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BeginTransactionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
