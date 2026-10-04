package com.google.firestore.p565v1;

import com.google.firestore.p565v1.Document;
import com.google.firestore.p565v1.DocumentMask;
import com.google.firestore.p565v1.Precondition;
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
public final class UpdateDocumentRequest extends GeneratedMessageLite<UpdateDocumentRequest, Builder> implements UpdateDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final UpdateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile Parser<UpdateDocumentRequest> PARSER = null;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private int bitField0_;
    private Precondition currentDocument_;
    private Document document_;
    private DocumentMask mask_;
    private DocumentMask updateMask_;

    /* JADX INFO: renamed from: com.google.firestore.v1.UpdateDocumentRequest$1 */
    public static /* synthetic */ class C173261 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51884xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51884xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51884xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51884xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51884xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51884xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51884xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51884xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UpdateDocumentRequest, Builder> implements UpdateDocumentRequestOrBuilder {
        public /* synthetic */ Builder(C173261 c173261) {
            this();
        }

        public Builder clearCurrentDocument() {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).clearCurrentDocument();
            return this;
        }

        public Builder clearDocument() {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).clearDocument();
            return this;
        }

        public Builder clearMask() {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).clearMask();
            return this;
        }

        public Builder clearUpdateMask() {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).clearUpdateMask();
            return this;
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public Precondition getCurrentDocument() {
            return ((UpdateDocumentRequest) this.instance).getCurrentDocument();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public Document getDocument() {
            return ((UpdateDocumentRequest) this.instance).getDocument();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public DocumentMask getMask() {
            return ((UpdateDocumentRequest) this.instance).getMask();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public DocumentMask getUpdateMask() {
            return ((UpdateDocumentRequest) this.instance).getUpdateMask();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public boolean hasCurrentDocument() {
            return ((UpdateDocumentRequest) this.instance).hasCurrentDocument();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public boolean hasDocument() {
            return ((UpdateDocumentRequest) this.instance).hasDocument();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public boolean hasMask() {
            return ((UpdateDocumentRequest) this.instance).hasMask();
        }

        @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
        public boolean hasUpdateMask() {
            return ((UpdateDocumentRequest) this.instance).hasUpdateMask();
        }

        public Builder mergeCurrentDocument(Precondition precondition) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).mergeCurrentDocument(precondition);
            return this;
        }

        public Builder mergeDocument(Document document) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeMask(DocumentMask documentMask) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeUpdateMask(DocumentMask documentMask) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).mergeUpdateMask(documentMask);
            return this;
        }

        public Builder setCurrentDocument(Precondition precondition) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setCurrentDocument(precondition);
            return this;
        }

        public Builder setDocument(Document document) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setDocument(document);
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setMask(documentMask);
            return this;
        }

        public Builder setUpdateMask(DocumentMask documentMask) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setUpdateMask(documentMask);
            return this;
        }

        private Builder() {
            super(UpdateDocumentRequest.DEFAULT_INSTANCE);
        }

        public Builder setCurrentDocument(Precondition.Builder builder) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setCurrentDocument(builder.build());
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setDocument(builder.build());
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setMask(builder.build());
            return this;
        }

        public Builder setUpdateMask(DocumentMask.Builder builder) {
            copyOnWrite();
            ((UpdateDocumentRequest) this.instance).setUpdateMask(builder.build());
            return this;
        }
    }

    static {
        UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest();
        DEFAULT_INSTANCE = updateDocumentRequest;
        GeneratedMessageLite.registerDefaultInstance(UpdateDocumentRequest.class, updateDocumentRequest);
    }

    private UpdateDocumentRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDocument() {
        this.currentDocument_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateMask() {
        this.updateMask_ = null;
        this.bitField0_ &= -3;
    }

    public static UpdateDocumentRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentDocument(Precondition precondition) {
        precondition.getClass();
        Precondition precondition2 = this.currentDocument_;
        if (precondition2 == null || precondition2 == Precondition.getDefaultInstance()) {
            this.currentDocument_ = precondition;
        } else {
            this.currentDocument_ = Precondition.newBuilder(this.currentDocument_).mergeFrom(precondition).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(Document document) {
        document.getClass();
        Document document2 = this.document_;
        if (document2 == null || document2 == Document.getDefaultInstance()) {
            this.document_ = document;
        } else {
            this.document_ = Document.newBuilder(this.document_).mergeFrom(document).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 == null || documentMask2 == DocumentMask.getDefaultInstance()) {
            this.mask_ = documentMask;
        } else {
            this.mask_ = DocumentMask.newBuilder(this.mask_).mergeFrom(documentMask).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.updateMask_;
        if (documentMask2 == null || documentMask2 == DocumentMask.getDefaultInstance()) {
            this.updateMask_ = documentMask;
        } else {
            this.updateMask_ = DocumentMask.newBuilder(this.updateMask_).mergeFrom(documentMask).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpdateDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpdateDocumentRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpdateDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDocument(Precondition precondition) {
        precondition.getClass();
        this.currentDocument_ = precondition;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(Document document) {
        document.getClass();
        this.document_ = document;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.updateMask_ = documentMask;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C173261 c173261 = null;
        switch (C173261.f51884xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpdateDocumentRequest();
            case 2:
                return new Builder(c173261);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "document_", "updateMask_", "mask_", "currentDocument_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpdateDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UpdateDocumentRequest.class) {
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

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        return precondition == null ? Precondition.getDefaultInstance() : precondition;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public Document getDocument() {
        Document document = this.document_;
        return document == null ? Document.getDefaultInstance() : document;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        return documentMask == null ? DocumentMask.getDefaultInstance() : documentMask;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public DocumentMask getUpdateMask() {
        DocumentMask documentMask = this.updateMask_;
        return documentMask == null ? DocumentMask.getDefaultInstance() : documentMask;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public boolean hasCurrentDocument() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public boolean hasDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public boolean hasMask() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firestore.p565v1.UpdateDocumentRequestOrBuilder
    public boolean hasUpdateMask() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(UpdateDocumentRequest updateDocumentRequest) {
        return DEFAULT_INSTANCE.createBuilder(updateDocumentRequest);
    }

    public static UpdateDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpdateDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpdateDocumentRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpdateDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpdateDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
