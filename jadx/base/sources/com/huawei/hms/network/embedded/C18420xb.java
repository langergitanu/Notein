package com.huawei.hms.network.embedded;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.client.internal.MsalUtils;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.xb */
/* JADX INFO: loaded from: classes9.dex */
public final class C18420xb implements InterfaceC18234jc {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18289nb f56672a;

    /* JADX INFO: renamed from: b */
    public final Inflater f56673b;

    /* JADX INFO: renamed from: c */
    public int f56674c;

    /* JADX INFO: renamed from: d */
    public boolean f56675d;

    public C18420xb(InterfaceC18234jc interfaceC18234jc, Inflater inflater) {
        this(C18433yb.m80007a(interfaceC18234jc), inflater);
    }

    /* JADX INFO: renamed from: h */
    private void m79991h() throws IOException {
        int i = this.f56674c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f56673b.getRemaining();
        this.f56674c -= remaining;
        this.f56672a.skip(remaining);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    /* JADX INFO: renamed from: c */
    public long mo77914c(C18261lb c18261lb, long j) throws IOException {
        boolean zM79992g;
        if (j < 0) {
            throw new IllegalArgumentException(OooO00o.OooO0O0(j, "byteCount < 0: "));
        }
        if (this.f56675d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            zM79992g = m79992g();
            try {
                C18178fc c18178fcM79090e = c18261lb.m79090e(1);
                int iInflate = this.f56673b.inflate(c18178fcM79090e.f54865a, c18178fcM79090e.f54867c, (int) Math.min(j, 8192 - c18178fcM79090e.f54867c));
                if (iInflate > 0) {
                    c18178fcM79090e.f54867c += iInflate;
                    long j2 = iInflate;
                    c18261lb.f55631b += j2;
                    return j2;
                }
                if (!this.f56673b.finished() && !this.f56673b.needsDictionary()) {
                }
                m79991h();
                if (c18178fcM79090e.f54866b != c18178fcM79090e.f54867c) {
                    return -1L;
                }
                c18261lb.f55630a = c18178fcM79090e.m78512b();
                C18192gc.m78640a(c18178fcM79090e);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!zM79992g);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f56675d) {
            return;
        }
        this.f56673b.end();
        this.f56675d = true;
        this.f56672a.close();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m79992g() throws IOException {
        if (!this.f56673b.needsInput()) {
            return false;
        }
        m79991h();
        if (this.f56673b.getRemaining() != 0) {
            throw new IllegalStateException(MsalUtils.QUERY_STRING_SYMBOL);
        }
        if (this.f56672a.mo78389f()) {
            return true;
        }
        C18178fc c18178fc = this.f56672a.mo78374a().f55630a;
        int i = c18178fc.f54867c;
        int i2 = c18178fc.f54866b;
        int i3 = i - i2;
        this.f56674c = i3;
        this.f56673b.setInput(c18178fc.f54865a, i2, i3);
        return false;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18234jc
    public C18248kc timeout() {
        return this.f56672a.timeout();
    }

    public C18420xb(InterfaceC18289nb interfaceC18289nb, Inflater inflater) {
        if (interfaceC18289nb == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f56672a = interfaceC18289nb;
        this.f56673b = inflater;
    }
}
