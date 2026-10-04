package com.google.type;

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
public final class Quaternion extends GeneratedMessageLite<Quaternion, Builder> implements QuaternionOrBuilder {
    private static final Quaternion DEFAULT_INSTANCE;
    private static volatile Parser<Quaternion> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;

    /* JADX INFO: renamed from: w_ */
    private double f51958w_;

    /* JADX INFO: renamed from: x_ */
    private double f51959x_;

    /* JADX INFO: renamed from: y_ */
    private double f51960y_;

    /* JADX INFO: renamed from: z_ */
    private double f51961z_;

    /* JADX INFO: renamed from: com.google.type.Quaternion$1 */
    public static /* synthetic */ class C175581 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f51962xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f51962xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51962xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51962xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51962xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51962xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51962xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51962xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Quaternion, Builder> implements QuaternionOrBuilder {
        public /* synthetic */ Builder(C175581 c175581) {
            this();
        }

        public Builder clearW() {
            copyOnWrite();
            ((Quaternion) this.instance).clearW();
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((Quaternion) this.instance).clearX();
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((Quaternion) this.instance).clearY();
            return this;
        }

        public Builder clearZ() {
            copyOnWrite();
            ((Quaternion) this.instance).clearZ();
            return this;
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getW() {
            return ((Quaternion) this.instance).getW();
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getX() {
            return ((Quaternion) this.instance).getX();
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getY() {
            return ((Quaternion) this.instance).getY();
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getZ() {
            return ((Quaternion) this.instance).getZ();
        }

        public Builder setW(double d) {
            copyOnWrite();
            ((Quaternion) this.instance).setW(d);
            return this;
        }

        public Builder setX(double d) {
            copyOnWrite();
            ((Quaternion) this.instance).setX(d);
            return this;
        }

        public Builder setY(double d) {
            copyOnWrite();
            ((Quaternion) this.instance).setY(d);
            return this;
        }

        public Builder setZ(double d) {
            copyOnWrite();
            ((Quaternion) this.instance).setZ(d);
            return this;
        }

        private Builder() {
            super(Quaternion.DEFAULT_INSTANCE);
        }
    }

    static {
        Quaternion quaternion = new Quaternion();
        DEFAULT_INSTANCE = quaternion;
        GeneratedMessageLite.registerDefaultInstance(Quaternion.class, quaternion);
    }

    private Quaternion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearW() {
        this.f51958w_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.f51959x_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.f51960y_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZ() {
        this.f51961z_ = 0.0d;
    }

    public static Quaternion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quaternion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Quaternion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setW(double d) {
        this.f51958w_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(double d) {
        this.f51959x_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(double d) {
        this.f51960y_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZ(double d) {
        this.f51961z_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C175581 c175581 = null;
        switch (C175581.f51962xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Quaternion();
            case 2:
                return new Builder(c175581);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"x_", "y_", "z_", "w_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Quaternion> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Quaternion.class) {
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

    @Override // com.google.type.QuaternionOrBuilder
    public double getW() {
        return this.f51958w_;
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getX() {
        return this.f51959x_;
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getY() {
        return this.f51960y_;
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getZ() {
        return this.f51961z_;
    }

    public static Builder newBuilder(Quaternion quaternion) {
        return DEFAULT_INSTANCE.createBuilder(quaternion);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quaternion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Quaternion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Quaternion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Quaternion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quaternion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Quaternion parseFrom(InputStream inputStream) throws IOException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quaternion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
