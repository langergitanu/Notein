package oO000Ooo;

import com.google.common.base.Preconditions;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.InterfaceC33085Oooo0OO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32080OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f114903OooO00o = ExtensionRegistryLite.getEmptyRegistry();

    /* JADX INFO: renamed from: oO000Ooo.OooO0O0$OooO00o */
    public static final class OooO00o<T extends MessageLite> implements C33101OoooOO0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final ThreadLocal<Reference<byte[]>> f114904OooO0Oo = new ThreadLocal<>();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Parser<T> f114905OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final T f114906OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f114907OooO0OO = -1;

        public OooO00o(GeneratedMessageLite generatedMessageLite) {
            this.f114906OooO0O0 = (T) Preconditions.checkNotNull(generatedMessageLite, "defaultInstance cannot be null");
            this.f114905OooO00o = (Parser<T>) generatedMessageLite.getParserForType();
        }

        @Override // oO0OOo0o.C33101OoooOO0.OooO0O0
        public final C32079OooO00o OooO00o(Object obj) {
            return new C32079OooO00o((MessageLite) obj, this.f114905OooO00o);
        }

        @Override // oO0OOo0o.C33101OoooOO0.OooO0O0
        public final MessageLite OooO0O0(InputStream inputStream) {
            CodedInputStream codedInputStreamNewInstance;
            byte[] bArr;
            if ((inputStream instanceof C32079OooO00o) && ((C32079OooO00o) inputStream).f114900OooOo == this.f114905OooO00o) {
                try {
                    MessageLite messageLite = ((C32079OooO00o) inputStream).f114901OooOo0o;
                    if (messageLite != null) {
                        return messageLite;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof InterfaceC33085Oooo0OO) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f114906OooO0O0;
                        }
                        codedInputStreamNewInstance = null;
                    } else {
                        ThreadLocal<Reference<byte[]>> threadLocal = f114904OooO0Oo;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i = iAvailable;
                        while (i > 0) {
                            int i2 = inputStream.read(bArr, iAvailable - i, i);
                            if (i2 == -1) {
                                break;
                            }
                            i -= i2;
                        }
                        if (i != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                        }
                        codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, 0, iAvailable);
                    }
                } else {
                    codedInputStreamNewInstance = null;
                }
                if (codedInputStreamNewInstance == null) {
                    codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
                }
                codedInputStreamNewInstance.setSizeLimit(Integer.MAX_VALUE);
                int i3 = this.f114907OooO0OO;
                if (i3 >= 0) {
                    codedInputStreamNewInstance.setRecursionLimit(i3);
                }
                try {
                    T from = this.f114905OooO00o.parseFrom(codedInputStreamNewInstance, C32080OooO0O0.f114903OooO00o);
                    try {
                        codedInputStreamNewInstance.checkLastTagWas(0);
                        return from;
                    } catch (InvalidProtocolBufferException e) {
                        e.setUnfinishedMessage(from);
                        throw e;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw o00Oo0.f119723OooOOO.OooO0oo("Invalid protobuf byte sequence").OooO0oO(e2).OooO00o();
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
