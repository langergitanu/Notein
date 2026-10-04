package com.google.firestore.p565v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class ListCollectionIdsRequest extends GeneratedMessageLite<ListCollectionIdsRequest, Builder> implements ListCollectionIdsRequestOrBuilder {
    private static final ListCollectionIdsRequest DEFAULT_INSTANCE;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListCollectionIdsRequest> PARSER;
    private int pageSize_;
    private String parent_ = "";
    private String pageToken_ = "";

    /* JADX INFO: renamed from: com.google.firestore.v1.ListCollectionIdsRequest$1 */
    public static /* synthetic */ class C173031 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51864xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51864xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51864xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51864xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51864xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51864xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51864xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51864xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListCollectionIdsRequest, Builder> implements ListCollectionIdsRequestOrBuilder {
        public /* synthetic */ Builder(C173031 c173031) {
            this();
        }

        public Builder clearPageSize() {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).clearPageToken();
            return this;
        }

        public Builder clearParent() {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).clearParent();
            return this;
        }

        @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
        public int getPageSize() {
            return ((ListCollectionIdsRequest) this.instance).getPageSize();
        }

        @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
        public String getPageToken() {
            return ((ListCollectionIdsRequest) this.instance).getPageToken();
        }

        @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
        public ByteString getPageTokenBytes() {
            return ((ListCollectionIdsRequest) this.instance).getPageTokenBytes();
        }

        @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
        public String getParent() {
            return ((ListCollectionIdsRequest) this.instance).getParent();
        }

        @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
        public ByteString getParentBytes() {
            return ((ListCollectionIdsRequest) this.instance).getParentBytes();
        }

        public Builder setPageSize(int i) {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).setPageSize(i);
            return this;
        }

        public Builder setPageToken(String str) {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).setPageToken(str);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).setPageTokenBytes(byteString);
            return this;
        }

        public Builder setParent(String str) {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).setParent(str);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            copyOnWrite();
            ((ListCollectionIdsRequest) this.instance).setParentBytes(byteString);
            return this;
        }

        private Builder() {
            super(ListCollectionIdsRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        ListCollectionIdsRequest listCollectionIdsRequest = new ListCollectionIdsRequest();
        DEFAULT_INSTANCE = listCollectionIdsRequest;
        GeneratedMessageLite.registerDefaultInstance(ListCollectionIdsRequest.class, listCollectionIdsRequest);
    }

    private ListCollectionIdsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    public static ListCollectionIdsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ListCollectionIdsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListCollectionIdsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ListCollectionIdsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageToken(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pageToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.parent_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C173031 c173031 = null;
        switch (C173031.f51864xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ListCollectionIdsRequest();
            case 2:
                return new Builder(c173031);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"parent_", "pageSize_", "pageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ListCollectionIdsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListCollectionIdsRequest.class) {
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

    @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
    public ByteString getPageTokenBytes() {
        return ByteString.copyFromUtf8(this.pageToken_);
    }

    @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
    public String getParent() {
        return this.parent_;
    }

    @Override // com.google.firestore.p565v1.ListCollectionIdsRequestOrBuilder
    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8(this.parent_);
    }

    public static Builder newBuilder(ListCollectionIdsRequest listCollectionIdsRequest) {
        return DEFAULT_INSTANCE.createBuilder(listCollectionIdsRequest);
    }

    public static ListCollectionIdsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ListCollectionIdsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListCollectionIdsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListCollectionIdsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListCollectionIdsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
