package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpression;
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
public final class CampaignImpressionList extends GeneratedMessageLite<CampaignImpressionList, Builder> implements CampaignImpressionListOrBuilder {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final CampaignImpressionList DEFAULT_INSTANCE;
    private static volatile Parser<CampaignImpressionList> PARSER;
    private Internal.ProtobufList<CampaignImpression> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList$1 */
    public static /* synthetic */ class C174261 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51894xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51894xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51894xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51894xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51894xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51894xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51894xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51894xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CampaignImpressionList, Builder> implements CampaignImpressionListOrBuilder {
        public /* synthetic */ Builder(C174261 c174261) {
            this();
        }

        public Builder addAllAlreadySeenCampaigns(Iterable<? extends CampaignImpression> iterable) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).addAllAlreadySeenCampaigns(iterable);
            return this;
        }

        public Builder addAlreadySeenCampaigns(CampaignImpression campaignImpression) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(campaignImpression);
            return this;
        }

        public Builder clearAlreadySeenCampaigns() {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).clearAlreadySeenCampaigns();
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionListOrBuilder
        public CampaignImpression getAlreadySeenCampaigns(int i) {
            return ((CampaignImpressionList) this.instance).getAlreadySeenCampaigns(i);
        }

        @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionListOrBuilder
        public int getAlreadySeenCampaignsCount() {
            return ((CampaignImpressionList) this.instance).getAlreadySeenCampaignsCount();
        }

        @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionListOrBuilder
        public List<CampaignImpression> getAlreadySeenCampaignsList() {
            return Collections.unmodifiableList(((CampaignImpressionList) this.instance).getAlreadySeenCampaignsList());
        }

        public Builder removeAlreadySeenCampaigns(int i) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).removeAlreadySeenCampaigns(i);
            return this;
        }

        public Builder setAlreadySeenCampaigns(int i, CampaignImpression campaignImpression) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).setAlreadySeenCampaigns(i, campaignImpression);
            return this;
        }

        private Builder() {
            super(CampaignImpressionList.DEFAULT_INSTANCE);
        }

        public Builder addAlreadySeenCampaigns(int i, CampaignImpression campaignImpression) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(i, campaignImpression);
            return this;
        }

        public Builder setAlreadySeenCampaigns(int i, CampaignImpression.Builder builder) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).setAlreadySeenCampaigns(i, builder.build());
            return this;
        }

        public Builder addAlreadySeenCampaigns(CampaignImpression.Builder builder) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(builder.build());
            return this;
        }

        public Builder addAlreadySeenCampaigns(int i, CampaignImpression.Builder builder) {
            copyOnWrite();
            ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(i, builder.build());
            return this;
        }
    }

    static {
        CampaignImpressionList campaignImpressionList = new CampaignImpressionList();
        DEFAULT_INSTANCE = campaignImpressionList;
        GeneratedMessageLite.registerDefaultInstance(CampaignImpressionList.class, campaignImpressionList);
    }

    private CampaignImpressionList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlreadySeenCampaigns(Iterable<? extends CampaignImpression> iterable) {
        ensureAlreadySeenCampaignsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.alreadySeenCampaigns_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlreadySeenCampaigns(CampaignImpression campaignImpression) {
        campaignImpression.getClass();
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.add(campaignImpression);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlreadySeenCampaigns() {
        this.alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAlreadySeenCampaignsIsMutable() {
        Internal.ProtobufList<CampaignImpression> protobufList = this.alreadySeenCampaigns_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CampaignImpressionList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignImpressionList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignImpressionList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignImpressionList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignImpressionList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlreadySeenCampaigns(int i) {
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlreadySeenCampaigns(int i, CampaignImpression campaignImpression) {
        campaignImpression.getClass();
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.set(i, campaignImpression);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C174261 c174261 = null;
        switch (C174261.f51894xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignImpressionList();
            case 2:
                return new Builder(c174261);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", CampaignImpression.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignImpressionList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignImpressionList.class) {
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

    @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionListOrBuilder
    public CampaignImpression getAlreadySeenCampaigns(int i) {
        return this.alreadySeenCampaigns_.get(i);
    }

    @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionListOrBuilder
    public int getAlreadySeenCampaignsCount() {
        return this.alreadySeenCampaigns_.size();
    }

    @Override // com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionListOrBuilder
    public List<CampaignImpression> getAlreadySeenCampaignsList() {
        return this.alreadySeenCampaigns_;
    }

    public CampaignImpressionOrBuilder getAlreadySeenCampaignsOrBuilder(int i) {
        return this.alreadySeenCampaigns_.get(i);
    }

    public List<? extends CampaignImpressionOrBuilder> getAlreadySeenCampaignsOrBuilderList() {
        return this.alreadySeenCampaigns_;
    }

    public static Builder newBuilder(CampaignImpressionList campaignImpressionList) {
        return DEFAULT_INSTANCE.createBuilder(campaignImpressionList);
    }

    public static CampaignImpressionList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignImpressionList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignImpressionList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignImpressionList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlreadySeenCampaigns(int i, CampaignImpression campaignImpression) {
        campaignImpression.getClass();
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.add(i, campaignImpression);
    }

    public static CampaignImpressionList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignImpressionList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignImpressionList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignImpressionList parseFrom(InputStream inputStream) throws IOException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignImpressionList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignImpressionList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignImpressionList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignImpressionList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
