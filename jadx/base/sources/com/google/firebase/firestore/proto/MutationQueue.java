package com.google.firebase.firestore.proto;

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
public final class MutationQueue extends GeneratedMessageLite<MutationQueue, Builder> implements MutationQueueOrBuilder {
    private static final MutationQueue DEFAULT_INSTANCE;
    public static final int LAST_ACKNOWLEDGED_BATCH_ID_FIELD_NUMBER = 1;
    public static final int LAST_STREAM_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<MutationQueue> PARSER;
    private int lastAcknowledgedBatchId_;
    private ByteString lastStreamToken_ = ByteString.EMPTY;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.MutationQueue$1 */
    public static /* synthetic */ class C170741 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51795xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51795xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51795xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51795xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51795xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51795xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51795xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51795xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MutationQueue, Builder> implements MutationQueueOrBuilder {
        public /* synthetic */ Builder(C170741 c170741) {
            this();
        }

        public Builder clearLastAcknowledgedBatchId() {
            copyOnWrite();
            ((MutationQueue) this.instance).clearLastAcknowledgedBatchId();
            return this;
        }

        public Builder clearLastStreamToken() {
            copyOnWrite();
            ((MutationQueue) this.instance).clearLastStreamToken();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
        public int getLastAcknowledgedBatchId() {
            return ((MutationQueue) this.instance).getLastAcknowledgedBatchId();
        }

        @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
        public ByteString getLastStreamToken() {
            return ((MutationQueue) this.instance).getLastStreamToken();
        }

        public Builder setLastAcknowledgedBatchId(int i) {
            copyOnWrite();
            ((MutationQueue) this.instance).setLastAcknowledgedBatchId(i);
            return this;
        }

        public Builder setLastStreamToken(ByteString byteString) {
            copyOnWrite();
            ((MutationQueue) this.instance).setLastStreamToken(byteString);
            return this;
        }

        private Builder() {
            super(MutationQueue.DEFAULT_INSTANCE);
        }
    }

    static {
        MutationQueue mutationQueue = new MutationQueue();
        DEFAULT_INSTANCE = mutationQueue;
        GeneratedMessageLite.registerDefaultInstance(MutationQueue.class, mutationQueue);
    }

    private MutationQueue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAcknowledgedBatchId() {
        this.lastAcknowledgedBatchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastStreamToken() {
        this.lastStreamToken_ = getDefaultInstance().getLastStreamToken();
    }

    public static MutationQueue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationQueue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MutationQueue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationQueue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MutationQueue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAcknowledgedBatchId(int i) {
        this.lastAcknowledgedBatchId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastStreamToken(ByteString byteString) {
        byteString.getClass();
        this.lastStreamToken_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C170741 c170741 = null;
        switch (C170741.f51795xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MutationQueue();
            case 2:
                return new Builder(c170741);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"lastAcknowledgedBatchId_", "lastStreamToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MutationQueue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MutationQueue.class) {
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

    @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
    public int getLastAcknowledgedBatchId() {
        return this.lastAcknowledgedBatchId_;
    }

    @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
    public ByteString getLastStreamToken() {
        return this.lastStreamToken_;
    }

    public static Builder newBuilder(MutationQueue mutationQueue) {
        return DEFAULT_INSTANCE.createBuilder(mutationQueue);
    }

    public static MutationQueue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MutationQueue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MutationQueue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MutationQueue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationQueue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MutationQueue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationQueue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MutationQueue parseFrom(InputStream inputStream) throws IOException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationQueue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MutationQueue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MutationQueue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MutationQueue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
