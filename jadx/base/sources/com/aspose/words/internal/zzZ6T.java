package com.aspose.words.internal;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ6T implements Serializable {
    private transient zzZ80 zzWni;
    private transient zzZ7T zzWtv;

    public zzZ6T(byte[] bArr) throws IOException {
        this(zzXj(bArr));
    }

    private static zzZ80 zzXj(byte[] bArr) throws IOException {
        try {
            return zzZ80.zzXh(zzZ6U.zzXk(bArr));
        } catch (ClassCastException e) {
            throw new zzZ6V("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new zzZ6V("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void zzZ(zzZ80 zzz80) {
        this.zzWni = zzz80;
        this.zzWtv = zzz80.zzXIj().zzXIH();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzZ6T) {
            return this.zzWni.equals(((zzZ6T) obj).zzWni);
        }
        return false;
    }

    public final byte[] getEncoded() throws IOException {
        return this.zzWni.getEncoded();
    }

    public final Date getNotAfter() {
        return this.zzWni.zzXIf().getDate();
    }

    public final BigInteger getSerialNumber() {
        return this.zzWni.zzXJQ().zzXKZ();
    }

    public int hashCode() {
        return this.zzWni.hashCode();
    }

    public final zzZ7U zzQ(zzZDA zzzda) {
        zzZ7T zzz7t = this.zzWtv;
        if (zzz7t != null) {
            return zzz7t.zzQ(zzzda);
        }
        return null;
    }

    public final zzZ80 zzXHp() {
        return this.zzWni;
    }

    public final zzZ86 zzXIc() {
        return this.zzWni.zzXIc();
    }

    public final zzZ7D zzXId() {
        return this.zzWni.zzXId();
    }

    public final zzZ8C zzXIe() {
        return zzZ8C.zzXn(this.zzWni.zzXIe());
    }

    public final zzZ8C zzXIh() {
        return zzZ8C.zzXn(this.zzWni.zzXIh());
    }

    public zzZ6T(zzZ80 zzz80) {
        zzZ(zzz80);
    }
}
