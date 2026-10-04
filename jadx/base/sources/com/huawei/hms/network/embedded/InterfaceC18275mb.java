package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.mb */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18275mb extends InterfaceC18220ic, WritableByteChannel {
    /* JADX INFO: renamed from: a */
    long mo78257a(InterfaceC18234jc interfaceC18234jc) throws IOException;

    /* JADX INFO: renamed from: a */
    C18261lb mo78258a();

    /* JADX INFO: renamed from: a */
    InterfaceC18275mb mo78259a(int i) throws IOException;

    /* JADX INFO: renamed from: a */
    InterfaceC18275mb mo78260a(InterfaceC18234jc interfaceC18234jc, long j) throws IOException;

    /* JADX INFO: renamed from: a */
    InterfaceC18275mb mo78261a(String str) throws IOException;

    /* JADX INFO: renamed from: a */
    InterfaceC18275mb mo78262a(String str, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: a */
    InterfaceC18275mb mo78263a(String str, int i, int i2, Charset charset) throws IOException;

    /* JADX INFO: renamed from: a */
    InterfaceC18275mb mo78264a(String str, Charset charset) throws IOException;

    /* JADX INFO: renamed from: b */
    InterfaceC18275mb mo78265b(int i) throws IOException;

    /* JADX INFO: renamed from: b */
    InterfaceC18275mb mo78266b(long j) throws IOException;

    /* JADX INFO: renamed from: b */
    InterfaceC18275mb mo78267b(C18303ob c18303ob) throws IOException;

    /* JADX INFO: renamed from: c */
    InterfaceC18275mb mo78268c(int i) throws IOException;

    /* JADX INFO: renamed from: d */
    InterfaceC18275mb mo78269d(long j) throws IOException;

    @Override // com.huawei.hms.network.embedded.InterfaceC18220ic, java.io.Flushable
    void flush() throws IOException;

    /* JADX INFO: renamed from: g */
    OutputStream mo78270g();

    /* JADX INFO: renamed from: h */
    InterfaceC18275mb mo78271h() throws IOException;

    /* JADX INFO: renamed from: h */
    InterfaceC18275mb mo78272h(long j) throws IOException;

    /* JADX INFO: renamed from: n */
    InterfaceC18275mb mo78273n() throws IOException;

    InterfaceC18275mb write(byte[] bArr) throws IOException;

    InterfaceC18275mb write(byte[] bArr, int i, int i2) throws IOException;

    InterfaceC18275mb writeByte(int i) throws IOException;

    InterfaceC18275mb writeInt(int i) throws IOException;

    InterfaceC18275mb writeLong(long j) throws IOException;

    InterfaceC18275mb writeShort(int i) throws IOException;
}
