package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

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
public final class CampaignImpression extends GeneratedMessageLite<CampaignImpression, Builder> implements CampaignImpressionOrBuilder {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final CampaignImpression DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile Parser<CampaignImpression> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression$1 */
    public static /* synthetic */ class C174251 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51893xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51893xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51893xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51893xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51893xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51893xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51893xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51893xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CampaignImpression, Builder> implements CampaignImpressionOrBuilder {
        public /* synthetic */ Builder(C174251 c174251) {
            this();
        }

        public Builder clearCampaignId() {
            copyOnWrite();
            ((CampaignImpression) this.instance).clearCampaignId();
            return this;
        }

        public Builder clearImpressionTimestampMillis() {
            copyOnWrite();
            ((CampaignImpression) this.instance).clearImpressionTimestampMillis();
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionOrBuilder
        public String getCampaignId() {
            return ((CampaignImpression) this.instance).getCampaignId();
        }

        @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionOrBuilder
        public ByteString getCampaignIdBytes() {
            return ((CampaignImpression) this.instance).getCampaignIdBytes();
        }

        @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionOrBuilder
        public long getImpressionTimestampMillis() {
            return ((CampaignImpression) this.instance).getImpressionTimestampMillis();
        }

        public Builder setCampaignId(String str) {
            copyOnWrite();
            ((CampaignImpression) this.instance).setCampaignId(str);
            return this;
        }

        public Builder setCampaignIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CampaignImpression) this.instance).setCampaignIdBytes(byteString);
            return this;
        }

        public Builder setImpressionTimestampMillis(long j) {
            copyOnWrite();
            ((CampaignImpression) this.instance).setImpressionTimestampMillis(j);
            return this;
        }

        private Builder() {
            super(CampaignImpression.DEFAULT_INSTANCE);
        }
    }

    static {
        CampaignImpression campaignImpression = new CampaignImpression();
        DEFAULT_INSTANCE = campaignImpression;
        GeneratedMessageLite.registerDefaultInstance(CampaignImpression.class, campaignImpression);
    }

    private CampaignImpression() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionTimestampMillis() {
        this.impressionTimestampMillis_ = 0L;
    }

    public static CampaignImpression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignImpression parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignImpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignImpression> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.campaignId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionTimestampMillis(long j) {
        this.impressionTimestampMillis_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C174251 c174251 = null;
        switch (C174251.f51893xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignImpression();
            case 2:
                return new Builder(c174251);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignImpression> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignImpression.class) {
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

    @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionOrBuilder
    public String getCampaignId() {
        return this.campaignId_;
    }

    @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionOrBuilder
    public ByteString getCampaignIdBytes() {
        return ByteString.copyFromUtf8(this.campaignId_);
    }

    @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionOrBuilder
    public long getImpressionTimestampMillis() {
        return this.impressionTimestampMillis_;
    }

    public static Builder newBuilder(CampaignImpression campaignImpression) {
        return DEFAULT_INSTANCE.createBuilder(campaignImpression);
    }

    public static CampaignImpression parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignImpression parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignImpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CampaignImpression parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignImpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignImpression parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignImpression parseFrom(InputStream inputStream) throws IOException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignImpression parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignImpression parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignImpression parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
