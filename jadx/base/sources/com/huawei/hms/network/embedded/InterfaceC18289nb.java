package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.nb */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18289nb extends InterfaceC18234jc, ReadableByteChannel {
    /* JADX INFO: renamed from: a */
    int mo78367a(C18446zb c18446zb) throws IOException;

    /* JADX INFO: renamed from: a */
    long mo78368a(byte b) throws IOException;

    /* JADX INFO: renamed from: a */
    long mo78369a(byte b, long j) throws IOException;

    /* JADX INFO: renamed from: a */
    long mo78370a(byte b, long j, long j2) throws IOException;

    /* JADX INFO: renamed from: a */
    long mo78371a(InterfaceC18220ic interfaceC18220ic) throws IOException;

    /* JADX INFO: renamed from: a */
    long mo78372a(C18303ob c18303ob) throws IOException;

    /* JADX INFO: renamed from: a */
    long mo78373a(C18303ob c18303ob, long j) throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: a */
    C18261lb mo78374a();

    /* JADX INFO: renamed from: a */
    C18303ob mo78375a(long j) throws IOException;

    /* JADX INFO: renamed from: a */
    String mo78376a(long j, Charset charset) throws IOException;

    /* JADX INFO: renamed from: a */
    String mo78377a(Charset charset) throws IOException;

    /* JADX INFO: renamed from: a */
    void mo78378a(C18261lb c18261lb, long j) throws IOException;

    /* JADX INFO: renamed from: a */
    boolean mo78379a(long j, C18303ob c18303ob) throws IOException;

    /* JADX INFO: renamed from: a */
    boolean mo78380a(long j, C18303ob c18303ob, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: b */
    int mo78381b() throws IOException;

    /* JADX INFO: renamed from: b */
    long mo78382b(C18303ob c18303ob, long j) throws IOException;

    /* JADX INFO: renamed from: c */
    long mo78383c() throws IOException;

    /* JADX INFO: renamed from: c */
    long mo78384c(C18303ob c18303ob) throws IOException;

    /* JADX INFO: renamed from: c */
    String mo78385c(long j) throws IOException;

    /* JADX INFO: renamed from: d */
    C18261lb mo78386d();

    /* JADX INFO: renamed from: e */
    int mo78387e() throws IOException;

    /* JADX INFO: renamed from: e */
    String mo78388e(long j) throws IOException;

    /* JADX INFO: renamed from: f */
    boolean mo78389f() throws IOException;

    /* JADX INFO: renamed from: f */
    byte[] mo78390f(long j) throws IOException;

    /* JADX INFO: renamed from: g */
    boolean mo78391g(long j) throws IOException;

    /* JADX INFO: renamed from: i */
    short mo78392i() throws IOException;

    /* JADX INFO: renamed from: i */
    void mo78393i(long j) throws IOException;

    /* JADX INFO: renamed from: j */
    long mo78394j() throws IOException;

    /* JADX INFO: renamed from: k */
    String mo78395k() throws IOException;

    /* JADX INFO: renamed from: l */
    InputStream mo78396l();

    /* JADX INFO: renamed from: m */
    String mo78397m() throws IOException;

    /* JADX INFO: renamed from: o */
    String mo78398o() throws IOException;

    /* JADX INFO: renamed from: p */
    long mo78399p() throws IOException;

    InterfaceC18289nb peek();

    /* JADX INFO: renamed from: q */
    byte[] mo78400q() throws IOException;

    /* JADX INFO: renamed from: r */
    C18303ob mo78401r() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;
}
