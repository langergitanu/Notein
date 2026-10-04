package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU7 extends zzZ5N {
    private byte[] buf;
    private OutputStream out;
    private zzYTS zzVZl;
    private zzYUE zzVZm;
    private zzYV5 zzVZn;
    private final boolean zzVZo;
    private final String zzVZp;
    private final byte[] zzWc5;

    public zzYU7(OutputStream outputStream, zzYV5 zzyv5) {
        this.zzWc5 = new byte[1];
        this.zzVZo = zzZ5L.zzXH0();
        this.zzVZp = zzyv5.zzXCK().zzXGi();
        this.out = outputStream;
        this.zzVZn = zzyv5;
    }

    private void zzYQ(int i, boolean z) {
        if (z) {
            zzYV5 zzyv5 = this.zzVZn;
            if (zzyv5 != null) {
                i = zzyv5.getOutputSize(i);
            } else {
                zzYTS zzyts = this.zzVZl;
                if (zzyts != null) {
                    i = zzyts.getOutputSize(i);
                }
            }
        } else {
            zzYV5 zzyv52 = this.zzVZn;
            if (zzyv52 != null) {
                i = zzyv52.zzfY(i);
            } else {
                zzYTS zzyts2 = this.zzVZl;
                if (zzyts2 != null) {
                    i = zzyts2.zzfY(i);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i) {
            this.buf = new byte[i];
        }
    }

    @Override // com.aspose.words.internal.zzZ5N, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IOException zzyu3;
        IOException iOException;
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        zzYQ(0, true);
        try {
            zzYV5 zzyv5 = this.zzVZn;
            if (zzyv5 != null) {
                int iZzo = zzyv5.zzo(this.buf);
                if (iZzo != 0) {
                    this.out.write(this.buf, 0, iZzo);
                }
            } else {
                zzYTS zzyts = this.zzVZl;
                if (zzyts != null) {
                    int iDoFinal = zzyts.doFinal(this.buf, 0);
                    if (iDoFinal != 0) {
                        this.out.write(this.buf, 0, iDoFinal);
                    }
                } else {
                    zzYUE zzyue = this.zzVZm;
                    if (zzyue != null) {
                        zzyue.reset();
                    }
                }
            }
            iOException = null;
        } catch (zzYUT e) {
            zzyu3 = new zzZ5D("Error finalising cipher data: " + e.getMessage(), e);
            iOException = zzyu3;
        } catch (IllegalStateException e2) {
            zzyu3 = new zzZ47(e2.getMessage(), e2.getCause());
            iOException = zzyu3;
        } catch (Exception e3) {
            zzyu3 = new zzYU3("Error closing stream: ", e3);
            iOException = zzyu3;
        }
        try {
            flush();
        } catch (IOException e4) {
            if (iOException == null) {
                iOException = e4;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        byte[] bArr = this.zzWc5;
        byte b = (byte) i;
        bArr[0] = b;
        zzYUE zzyue = this.zzVZm;
        if (zzyue != null) {
            this.out.write(zzyue.zze(b));
        } else {
            write(bArr, 0, 1);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public zzYU7(OutputStream outputStream, zzYUE zzyue) {
        this.zzWc5 = new byte[1];
        this.zzVZo = zzZ5L.zzXH0();
        this.zzVZp = zzyue.zzXGi();
        this.out = outputStream;
        this.zzVZm = zzyue;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        zzYU2.zzV(this.zzVZo, this.zzVZp);
        zzYQ(i2, false);
        zzYV5 zzyv5 = this.zzVZn;
        if (zzyv5 != null) {
            int iZzY = zzyv5.zzY(bArr, i, i2, this.buf);
            if (iZzY != 0) {
                this.out.write(this.buf, 0, iZzY);
                return;
            }
            return;
        }
        zzYTS zzyts = this.zzVZl;
        if (zzyts != null) {
            int iZzY2 = zzyts.zzY(bArr, i, i2, this.buf);
            if (iZzY2 != 0) {
                this.out.write(this.buf, 0, iZzY2);
                return;
            }
            return;
        }
        this.zzVZm.zzY(bArr, i, i2, this.buf, 0);
        this.out.write(this.buf, 0, i2);
    }

    public zzYU7(OutputStream outputStream, zzYTS zzyts) {
        this.zzWc5 = new byte[1];
        this.zzVZo = zzZ5L.zzXH0();
        this.zzVZp = zzyts.zzXGi();
        this.out = outputStream;
        this.zzVZl = zzyts;
    }
}
