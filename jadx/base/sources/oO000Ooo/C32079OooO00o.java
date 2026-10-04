package oO000Ooo;

import com.google.common.base.Preconditions;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import oO0OOo0o.InterfaceC33071OooOo0;
import oO0OOo0o.InterfaceC33085Oooo0OO;

/* JADX INFO: renamed from: oO000Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32079OooO00o extends InputStream implements InterfaceC33071OooOo0, InterfaceC33085Oooo0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Parser<?> f114900OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public MessageLite f114901OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ByteArrayInputStream f114902OooOoO0;

    public C32079OooO00o(MessageLite messageLite, Parser<?> parser) {
        this.f114901OooOo0o = messageLite;
        this.f114900OooOo = parser;
    }

    @Override // oO0OOo0o.InterfaceC33071OooOo0
    public final int OooO00o(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.f114901OooOo0o;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            this.f114901OooOo0o.writeTo(outputStream);
            this.f114901OooOo0o = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f114902OooOoO0;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
        Preconditions.checkNotNull(byteArrayInputStream, "inputStream cannot be null!");
        Preconditions.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.f114902OooOoO0 = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        MessageLite messageLite = this.f114901OooOo0o;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f114902OooOoO0;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f114901OooOo0o != null) {
            this.f114902OooOoO0 = new ByteArrayInputStream(this.f114901OooOo0o.toByteArray());
            this.f114901OooOo0o = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f114902OooOoO0;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        MessageLite messageLite = this.f114901OooOo0o;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.f114901OooOo0o = null;
                this.f114902OooOoO0 = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr, i, serializedSize);
                this.f114901OooOo0o.writeTo(codedOutputStreamNewInstance);
                codedOutputStreamNewInstance.flush();
                codedOutputStreamNewInstance.checkNoSpaceLeft();
                this.f114901OooOo0o = null;
                this.f114902OooOoO0 = null;
                return serializedSize;
            }
            this.f114902OooOoO0 = new ByteArrayInputStream(this.f114901OooOo0o.toByteArray());
            this.f114901OooOo0o = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f114902OooOoO0;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
