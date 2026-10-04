package com.google.firestore.p565v1;

import com.google.firestore.p565v1.BitSequence;
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
public final class BloomFilter extends GeneratedMessageLite<BloomFilter, Builder> implements BloomFilterOrBuilder {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final BloomFilter DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile Parser<BloomFilter> PARSER;
    private int bitField0_;
    private BitSequence bits_;
    private int hashCount_;

    /* JADX INFO: renamed from: com.google.firestore.v1.BloomFilter$1 */
    public static /* synthetic */ class C172851 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51850xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51850xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51850xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51850xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51850xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51850xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51850xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51850xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BloomFilter, Builder> implements BloomFilterOrBuilder {
        public /* synthetic */ Builder(C172851 c172851) {
            this();
        }

        public Builder clearBits() {
            copyOnWrite();
            ((BloomFilter) this.instance).clearBits();
            return this;
        }

        public Builder clearHashCount() {
            copyOnWrite();
            ((BloomFilter) this.instance).clearHashCount();
            return this;
        }

        @Override // com.google.firestore.p565v1.BloomFilterOrBuilder
        public BitSequence getBits() {
            return ((BloomFilter) this.instance).getBits();
        }

        @Override // com.google.firestore.p565v1.BloomFilterOrBuilder
        public int getHashCount() {
            return ((BloomFilter) this.instance).getHashCount();
        }

        @Override // com.google.firestore.p565v1.BloomFilterOrBuilder
        public boolean hasBits() {
            return ((BloomFilter) this.instance).hasBits();
        }

        public Builder mergeBits(BitSequence bitSequence) {
            copyOnWrite();
            ((BloomFilter) this.instance).mergeBits(bitSequence);
            return this;
        }

        public Builder setBits(BitSequence bitSequence) {
            copyOnWrite();
            ((BloomFilter) this.instance).setBits(bitSequence);
            return this;
        }

        public Builder setHashCount(int i) {
            copyOnWrite();
            ((BloomFilter) this.instance).setHashCount(i);
            return this;
        }

        private Builder() {
            super(BloomFilter.DEFAULT_INSTANCE);
        }

        public Builder setBits(BitSequence.Builder builder) {
            copyOnWrite();
            ((BloomFilter) this.instance).setBits(builder.build());
            return this;
        }
    }

    static {
        BloomFilter bloomFilter = new BloomFilter();
        DEFAULT_INSTANCE = bloomFilter;
        GeneratedMessageLite.registerDefaultInstance(BloomFilter.class, bloomFilter);
    }

    private BloomFilter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBits() {
        this.bits_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHashCount() {
        this.hashCount_ = 0;
    }

    public static BloomFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBits(BitSequence bitSequence) {
        bitSequence.getClass();
        BitSequence bitSequence2 = this.bits_;
        if (bitSequence2 == null || bitSequence2 == BitSequence.getDefaultInstance()) {
            this.bits_ = bitSequence;
        } else {
            this.bits_ = BitSequence.newBuilder(this.bits_).mergeFrom(bitSequence).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BloomFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BloomFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BloomFilter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBits(BitSequence bitSequence) {
        bitSequence.getClass();
        this.bits_ = bitSequence;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashCount(int i) {
        this.hashCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C172851 c172851 = null;
        switch (C172851.f51850xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BloomFilter();
            case 2:
                return new Builder(c172851);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BloomFilter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BloomFilter.class) {
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

    @Override // com.google.firestore.p565v1.BloomFilterOrBuilder
    public BitSequence getBits() {
        BitSequence bitSequence = this.bits_;
        return bitSequence == null ? BitSequence.getDefaultInstance() : bitSequence;
    }

    @Override // com.google.firestore.p565v1.BloomFilterOrBuilder
    public int getHashCount() {
        return this.hashCount_;
    }

    @Override // com.google.firestore.p565v1.BloomFilterOrBuilder
    public boolean hasBits() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(BloomFilter bloomFilter) {
        return DEFAULT_INSTANCE.createBuilder(bloomFilter);
    }

    public static BloomFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BloomFilter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BloomFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BloomFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BloomFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BloomFilter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BloomFilter parseFrom(InputStream inputStream) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BloomFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BloomFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BloomFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
