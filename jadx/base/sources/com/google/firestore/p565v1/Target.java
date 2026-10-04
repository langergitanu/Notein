package com.google.firestore.p565v1;

import com.google.firestore.p565v1.StructuredQuery;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Target extends GeneratedMessageLite<Target, Builder> implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<Target> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Int32Value expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* JADX INFO: renamed from: com.google.firestore.v1.Target$1 */
    public static /* synthetic */ class C173221 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51881xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51881xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51881xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51881xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51881xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51881xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51881xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51881xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Target, Builder> implements TargetOrBuilder {
        public /* synthetic */ Builder(C173221 c173221) {
            this();
        }

        public Builder clearDocuments() {
            copyOnWrite();
            ((Target) this.instance).clearDocuments();
            return this;
        }

        public Builder clearExpectedCount() {
            copyOnWrite();
            ((Target) this.instance).clearExpectedCount();
            return this;
        }

        public Builder clearOnce() {
            copyOnWrite();
            ((Target) this.instance).clearOnce();
            return this;
        }

        public Builder clearQuery() {
            copyOnWrite();
            ((Target) this.instance).clearQuery();
            return this;
        }

        public Builder clearReadTime() {
            copyOnWrite();
            ((Target) this.instance).clearReadTime();
            return this;
        }

        public Builder clearResumeToken() {
            copyOnWrite();
            ((Target) this.instance).clearResumeToken();
            return this;
        }

        public Builder clearResumeType() {
            copyOnWrite();
            ((Target) this.instance).clearResumeType();
            return this;
        }

        public Builder clearTargetId() {
            copyOnWrite();
            ((Target) this.instance).clearTargetId();
            return this;
        }

        public Builder clearTargetType() {
            copyOnWrite();
            ((Target) this.instance).clearTargetType();
            return this;
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public DocumentsTarget getDocuments() {
            return ((Target) this.instance).getDocuments();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public Int32Value getExpectedCount() {
            return ((Target) this.instance).getExpectedCount();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public boolean getOnce() {
            return ((Target) this.instance).getOnce();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public QueryTarget getQuery() {
            return ((Target) this.instance).getQuery();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public Timestamp getReadTime() {
            return ((Target) this.instance).getReadTime();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public ByteString getResumeToken() {
            return ((Target) this.instance).getResumeToken();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public ResumeTypeCase getResumeTypeCase() {
            return ((Target) this.instance).getResumeTypeCase();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public int getTargetId() {
            return ((Target) this.instance).getTargetId();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public TargetTypeCase getTargetTypeCase() {
            return ((Target) this.instance).getTargetTypeCase();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public boolean hasDocuments() {
            return ((Target) this.instance).hasDocuments();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public boolean hasExpectedCount() {
            return ((Target) this.instance).hasExpectedCount();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public boolean hasQuery() {
            return ((Target) this.instance).hasQuery();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public boolean hasReadTime() {
            return ((Target) this.instance).hasReadTime();
        }

        @Override // com.google.firestore.p565v1.TargetOrBuilder
        public boolean hasResumeToken() {
            return ((Target) this.instance).hasResumeToken();
        }

        public Builder mergeDocuments(DocumentsTarget documentsTarget) {
            copyOnWrite();
            ((Target) this.instance).mergeDocuments(documentsTarget);
            return this;
        }

        public Builder mergeExpectedCount(Int32Value int32Value) {
            copyOnWrite();
            ((Target) this.instance).mergeExpectedCount(int32Value);
            return this;
        }

        public Builder mergeQuery(QueryTarget queryTarget) {
            copyOnWrite();
            ((Target) this.instance).mergeQuery(queryTarget);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            copyOnWrite();
            ((Target) this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocuments(DocumentsTarget documentsTarget) {
            copyOnWrite();
            ((Target) this.instance).setDocuments(documentsTarget);
            return this;
        }

        public Builder setExpectedCount(Int32Value int32Value) {
            copyOnWrite();
            ((Target) this.instance).setExpectedCount(int32Value);
            return this;
        }

        public Builder setOnce(boolean z) {
            copyOnWrite();
            ((Target) this.instance).setOnce(z);
            return this;
        }

        public Builder setQuery(QueryTarget queryTarget) {
            copyOnWrite();
            ((Target) this.instance).setQuery(queryTarget);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            copyOnWrite();
            ((Target) this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setResumeToken(ByteString byteString) {
            copyOnWrite();
            ((Target) this.instance).setResumeToken(byteString);
            return this;
        }

        public Builder setTargetId(int i) {
            copyOnWrite();
            ((Target) this.instance).setTargetId(i);
            return this;
        }

        private Builder() {
            super(Target.DEFAULT_INSTANCE);
        }

        public Builder setDocuments(DocumentsTarget.Builder builder) {
            copyOnWrite();
            ((Target) this.instance).setDocuments(builder.build());
            return this;
        }

        public Builder setExpectedCount(Int32Value.Builder builder) {
            copyOnWrite();
            ((Target) this.instance).setExpectedCount(builder.build());
            return this;
        }

        public Builder setQuery(QueryTarget.Builder builder) {
            copyOnWrite();
            ((Target) this.instance).setQuery(builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            copyOnWrite();
            ((Target) this.instance).setReadTime(builder.build());
            return this;
        }
    }

    public static final class DocumentsTarget extends GeneratedMessageLite<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
        private static final DocumentsTarget DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile Parser<DocumentsTarget> PARSER;
        private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<DocumentsTarget, Builder> implements DocumentsTargetOrBuilder {
            public /* synthetic */ Builder(C173221 c173221) {
                this();
            }

            public Builder addAllDocuments(Iterable<String> iterable) {
                copyOnWrite();
                ((DocumentsTarget) this.instance).addAllDocuments(iterable);
                return this;
            }

            public Builder addDocuments(String str) {
                copyOnWrite();
                ((DocumentsTarget) this.instance).addDocuments(str);
                return this;
            }

            public Builder addDocumentsBytes(ByteString byteString) {
                copyOnWrite();
                ((DocumentsTarget) this.instance).addDocumentsBytes(byteString);
                return this;
            }

            public Builder clearDocuments() {
                copyOnWrite();
                ((DocumentsTarget) this.instance).clearDocuments();
                return this;
            }

            @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
            public String getDocuments(int i) {
                return ((DocumentsTarget) this.instance).getDocuments(i);
            }

            @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
            public ByteString getDocumentsBytes(int i) {
                return ((DocumentsTarget) this.instance).getDocumentsBytes(i);
            }

            @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
            public int getDocumentsCount() {
                return ((DocumentsTarget) this.instance).getDocumentsCount();
            }

            @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
            public List<String> getDocumentsList() {
                return Collections.unmodifiableList(((DocumentsTarget) this.instance).getDocumentsList());
            }

            public Builder setDocuments(int i, String str) {
                copyOnWrite();
                ((DocumentsTarget) this.instance).setDocuments(i, str);
                return this;
            }

            private Builder() {
                super(DocumentsTarget.DEFAULT_INSTANCE);
            }
        }

        static {
            DocumentsTarget documentsTarget = new DocumentsTarget();
            DEFAULT_INSTANCE = documentsTarget;
            GeneratedMessageLite.registerDefaultInstance(DocumentsTarget.class, documentsTarget);
        }

        private DocumentsTarget() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDocuments(Iterable<String> iterable) {
            ensureDocumentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.documents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDocuments(String str) {
            str.getClass();
            ensureDocumentsIsMutable();
            this.documents_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDocumentsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureDocumentsIsMutable();
            this.documents_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDocuments() {
            this.documents_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDocumentsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.documents_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.documents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static DocumentsTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DocumentsTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DocumentsTarget> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDocuments(int i, String str) {
            str.getClass();
            ensureDocumentsIsMutable();
            this.documents_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            C173221 c173221 = null;
            switch (C173221.f51881xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DocumentsTarget();
                case 2:
                    return new Builder(c173221);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DocumentsTarget> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DocumentsTarget.class) {
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

        @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
        public String getDocuments(int i) {
            return this.documents_.get(i);
        }

        @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
        public ByteString getDocumentsBytes(int i) {
            return ByteString.copyFromUtf8(this.documents_.get(i));
        }

        @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
        public int getDocumentsCount() {
            return this.documents_.size();
        }

        @Override // com.google.firestore.v1.Target.DocumentsTargetOrBuilder
        public List<String> getDocumentsList() {
            return this.documents_;
        }

        public static Builder newBuilder(DocumentsTarget documentsTarget) {
            return DEFAULT_INSTANCE.createBuilder(documentsTarget);
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DocumentsTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DocumentsTarget parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DocumentsTargetOrBuilder extends MessageLiteOrBuilder {
        String getDocuments(int i);

        ByteString getDocumentsBytes(int i);

        int getDocumentsCount();

        List<String> getDocumentsList();
    }

    public static final class QueryTarget extends GeneratedMessageLite<QueryTarget, Builder> implements QueryTargetOrBuilder {
        private static final QueryTarget DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile Parser<QueryTarget> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<QueryTarget, Builder> implements QueryTargetOrBuilder {
            public /* synthetic */ Builder(C173221 c173221) {
                this();
            }

            public Builder clearParent() {
                copyOnWrite();
                ((QueryTarget) this.instance).clearParent();
                return this;
            }

            public Builder clearQueryType() {
                copyOnWrite();
                ((QueryTarget) this.instance).clearQueryType();
                return this;
            }

            public Builder clearStructuredQuery() {
                copyOnWrite();
                ((QueryTarget) this.instance).clearStructuredQuery();
                return this;
            }

            @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
            public String getParent() {
                return ((QueryTarget) this.instance).getParent();
            }

            @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
            public ByteString getParentBytes() {
                return ((QueryTarget) this.instance).getParentBytes();
            }

            @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
            public QueryTypeCase getQueryTypeCase() {
                return ((QueryTarget) this.instance).getQueryTypeCase();
            }

            @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
            public StructuredQuery getStructuredQuery() {
                return ((QueryTarget) this.instance).getStructuredQuery();
            }

            @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
            public boolean hasStructuredQuery() {
                return ((QueryTarget) this.instance).hasStructuredQuery();
            }

            public Builder mergeStructuredQuery(StructuredQuery structuredQuery) {
                copyOnWrite();
                ((QueryTarget) this.instance).mergeStructuredQuery(structuredQuery);
                return this;
            }

            public Builder setParent(String str) {
                copyOnWrite();
                ((QueryTarget) this.instance).setParent(str);
                return this;
            }

            public Builder setParentBytes(ByteString byteString) {
                copyOnWrite();
                ((QueryTarget) this.instance).setParentBytes(byteString);
                return this;
            }

            public Builder setStructuredQuery(StructuredQuery structuredQuery) {
                copyOnWrite();
                ((QueryTarget) this.instance).setStructuredQuery(structuredQuery);
                return this;
            }

            private Builder() {
                super(QueryTarget.DEFAULT_INSTANCE);
            }

            public Builder setStructuredQuery(StructuredQuery.Builder builder) {
                copyOnWrite();
                ((QueryTarget) this.instance).setStructuredQuery(builder.build());
                return this;
            }
        }

        public enum QueryTypeCase {
            STRUCTURED_QUERY(2),
            QUERYTYPE_NOT_SET(0);

            private final int value;

            QueryTypeCase(int i) {
                this.value = i;
            }

            public static QueryTypeCase forNumber(int i) {
                if (i == 0) {
                    return QUERYTYPE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return STRUCTURED_QUERY;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static QueryTypeCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            QueryTarget queryTarget = new QueryTarget();
            DEFAULT_INSTANCE = queryTarget;
            GeneratedMessageLite.registerDefaultInstance(QueryTarget.class, queryTarget);
        }

        private QueryTarget() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParent() {
            this.parent_ = getDefaultInstance().getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQueryType() {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStructuredQuery() {
            if (this.queryTypeCase_ == 2) {
                this.queryTypeCase_ = 0;
                this.queryType_ = null;
            }
        }

        public static QueryTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStructuredQuery(StructuredQuery structuredQuery) {
            structuredQuery.getClass();
            if (this.queryTypeCase_ != 2 || this.queryType_ == StructuredQuery.getDefaultInstance()) {
                this.queryType_ = structuredQuery;
            } else {
                this.queryType_ = StructuredQuery.newBuilder((StructuredQuery) this.queryType_).mergeFrom(structuredQuery).buildPartial();
            }
            this.queryTypeCase_ = 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QueryTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<QueryTarget> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setStructuredQuery(StructuredQuery structuredQuery) {
            structuredQuery.getClass();
            this.queryType_ = structuredQuery;
            this.queryTypeCase_ = 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            C173221 c173221 = null;
            switch (C173221.f51881xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new QueryTarget();
                case 2:
                    return new Builder(c173221);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<QueryTarget> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (QueryTarget.class) {
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

        @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
        public String getParent() {
            return this.parent_;
        }

        @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
        public ByteString getParentBytes() {
            return ByteString.copyFromUtf8(this.parent_);
        }

        @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
        public QueryTypeCase getQueryTypeCase() {
            return QueryTypeCase.forNumber(this.queryTypeCase_);
        }

        @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
        public StructuredQuery getStructuredQuery() {
            return this.queryTypeCase_ == 2 ? (StructuredQuery) this.queryType_ : StructuredQuery.getDefaultInstance();
        }

        @Override // com.google.firestore.v1.Target.QueryTargetOrBuilder
        public boolean hasStructuredQuery() {
            return this.queryTypeCase_ == 2;
        }

        public static Builder newBuilder(QueryTarget queryTarget) {
            return DEFAULT_INSTANCE.createBuilder(queryTarget);
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QueryTarget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static QueryTarget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static QueryTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static QueryTarget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QueryTarget parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static QueryTarget parseFrom(InputStream inputStream) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QueryTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface QueryTargetOrBuilder extends MessageLiteOrBuilder {
        String getParent();

        ByteString getParentBytes();

        QueryTarget.QueryTypeCase getQueryTypeCase();

        StructuredQuery getStructuredQuery();

        boolean hasStructuredQuery();
    }

    public enum ResumeTypeCase {
        RESUME_TOKEN(4),
        READ_TIME(11),
        RESUMETYPE_NOT_SET(0);

        private final int value;

        ResumeTypeCase(int i) {
            this.value = i;
        }

        public static ResumeTypeCase forNumber(int i) {
            if (i == 0) {
                return RESUMETYPE_NOT_SET;
            }
            if (i == 4) {
                return RESUME_TOKEN;
            }
            if (i != 11) {
                return null;
            }
            return READ_TIME;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ResumeTypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum TargetTypeCase {
        QUERY(2),
        DOCUMENTS(3),
        TARGETTYPE_NOT_SET(0);

        private final int value;

        TargetTypeCase(int i) {
            this.value = i;
        }

        public static TargetTypeCase forNumber(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 2) {
                return QUERY;
            }
            if (i != 3) {
                return null;
            }
            return DOCUMENTS;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TargetTypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.registerDefaultInstance(Target.class, target);
    }

    private Target() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 3) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedCount() {
        this.expectedCount_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnce() {
        this.once_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 2) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.resumeTypeCase_ == 11) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeType() {
        this.resumeTypeCase_ = 0;
        this.resumeType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        if (this.targetTypeCase_ != 3 || this.targetType_ == DocumentsTarget.getDefaultInstance()) {
            this.targetType_ = documentsTarget;
        } else {
            this.targetType_ = DocumentsTarget.newBuilder((DocumentsTarget) this.targetType_).mergeFrom(documentsTarget).buildPartial();
        }
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpectedCount(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.expectedCount_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.expectedCount_ = int32Value;
        } else {
            this.expectedCount_ = Int32Value.newBuilder(this.expectedCount_).mergeFrom(int32Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(QueryTarget queryTarget) {
        queryTarget.getClass();
        if (this.targetTypeCase_ != 2 || this.targetType_ == QueryTarget.getDefaultInstance()) {
            this.targetType_ = queryTarget;
        } else {
            this.targetType_ = QueryTarget.newBuilder((QueryTarget) this.targetType_).mergeFrom(queryTarget).buildPartial();
        }
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        if (this.resumeTypeCase_ != 11 || this.resumeType_ == Timestamp.getDefaultInstance()) {
            this.resumeType_ = timestamp;
        } else {
            this.resumeType_ = Timestamp.newBuilder((Timestamp) this.resumeType_).mergeFrom(timestamp).buildPartial();
        }
        this.resumeTypeCase_ = 11;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Target parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Target) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Target> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = documentsTarget;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedCount(Int32Value int32Value) {
        int32Value.getClass();
        this.expectedCount_ = int32Value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnce(boolean z) {
        this.once_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = queryTarget;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.resumeType_ = timestamp;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(ByteString byteString) {
        byteString.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C173221 c173221 = null;
        switch (C173221.f51881xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Target();
            case 2:
                return new Builder(c173221);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", QueryTarget.class, DocumentsTarget.class, "targetId_", "once_", Timestamp.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Target> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Target.class) {
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

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public DocumentsTarget getDocuments() {
        return this.targetTypeCase_ == 3 ? (DocumentsTarget) this.targetType_ : DocumentsTarget.getDefaultInstance();
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public Int32Value getExpectedCount() {
        Int32Value int32Value = this.expectedCount_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public boolean getOnce() {
        return this.once_;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public QueryTarget getQuery() {
        return this.targetTypeCase_ == 2 ? (QueryTarget) this.targetType_ : QueryTarget.getDefaultInstance();
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public Timestamp getReadTime() {
        return this.resumeTypeCase_ == 11 ? (Timestamp) this.resumeType_ : Timestamp.getDefaultInstance();
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public ByteString getResumeToken() {
        return this.resumeTypeCase_ == 4 ? (ByteString) this.resumeType_ : ByteString.EMPTY;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public ResumeTypeCase getResumeTypeCase() {
        return ResumeTypeCase.forNumber(this.resumeTypeCase_);
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public int getTargetId() {
        return this.targetId_;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public TargetTypeCase getTargetTypeCase() {
        return TargetTypeCase.forNumber(this.targetTypeCase_);
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public boolean hasDocuments() {
        return this.targetTypeCase_ == 3;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public boolean hasExpectedCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public boolean hasQuery() {
        return this.targetTypeCase_ == 2;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public boolean hasReadTime() {
        return this.resumeTypeCase_ == 11;
    }

    @Override // com.google.firestore.p565v1.TargetOrBuilder
    public boolean hasResumeToken() {
        return this.resumeTypeCase_ == 4;
    }

    public static Builder newBuilder(Target target) {
        return DEFAULT_INSTANCE.createBuilder(target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Target parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Target parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Target parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Target parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Target parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Target parseFrom(InputStream inputStream) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Target parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Target parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
