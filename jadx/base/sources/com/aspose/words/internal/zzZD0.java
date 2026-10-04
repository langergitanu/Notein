package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZD0 {
    private final int zzWIc;
    private final InputStream zzWId;
    private final byte[][] zzWIs;

    public zzZD0(InputStream inputStream) {
        this(inputStream, zzZBC.zzR(inputStream));
    }

    private void zzXKA() {
        InputStream inputStream = this.zzWId;
        if (inputStream instanceof zzZBH) {
            ((zzZBH) inputStream).zzOP(false);
        }
    }

    private zzZDK zzg5(int i) throws IOException {
        if (i == 4) {
            return new zzZCR(this);
        }
        if (i == 8) {
            return new zzZCE(this);
        }
        if (i == 16) {
            return new zzZCO(this);
        }
        if (i == 17) {
            return new zzZCM(this);
        }
        throw new zzZDH(androidx.core.graphics.OooO0O0.OooO00o(i, new StringBuilder("unknown BER object encountered: 0x")));
    }

    public final zzZD5 zzO(boolean z, int i) throws IOException {
        if (!z) {
            return new zzZBX(false, i, new zzZC6(((zzZBJ) this.zzWId).toByteArray()));
        }
        zzZDJ zzzdjZzXKz = zzXKz();
        return this.zzWId instanceof zzZBH ? zzzdjZzXKz.size() == 1 ? new zzZCL(true, i, zzzdjZzXKz.zzg8(0)) : new zzZCL(false, i, zzZCT.zzY(zzzdjZzXKz)) : zzzdjZzXKz.size() == 1 ? new zzZBX(true, i, zzzdjZzXKz.zzg8(0)) : new zzZBX(false, i, zzZCD.zzX(zzzdjZzXKz));
    }

    public final zzZDK zzP(boolean z, int i) throws IOException {
        InputStream inputStream = this.zzWId;
        if (inputStream instanceof zzZBH) {
            if (z) {
                return zzg5(i);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        if (z) {
            if (i == 4) {
                return new zzZCR(this);
            }
            if (i == 16) {
                return new zzZC1(this);
            }
            if (i == 17) {
                return new zzZBZ(this);
            }
        } else {
            if (i == 4) {
                return new zzZC5((zzZBJ) inputStream);
            }
            if (i == 16) {
                throw new zzZDH("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i == 17) {
                throw new zzZDH("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
        }
        throw new zzZDH("implicit tagging not implemented");
    }

    public final zzZDK zzXKC() throws IOException {
        int i = this.zzWId.read();
        if (i == -1) {
            return null;
        }
        zzXKA();
        int iZzZ = zzZDE.zzZ(this.zzWId, i);
        boolean z = (i & 32) != 0;
        int iZzY = zzZDE.zzY(this.zzWId, this.zzWIc);
        if (iZzY < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            zzZD0 zzzd0 = new zzZD0(new zzZBH(this.zzWId, this.zzWIc), this.zzWIc);
            return (i & 64) != 0 ? new zzZCU(iZzZ, zzzd0) : (i & 128) != 0 ? new zzZCK(true, iZzZ, zzzd0) : zzzd0.zzg5(iZzZ);
        }
        zzZBJ zzzbj = new zzZBJ(this.zzWId, iZzY);
        if ((i & 64) != 0) {
            return new zzZBR(z, iZzZ, zzzbj.toByteArray());
        }
        if ((i & 128) != 0) {
            return new zzZCK(z, iZzZ, new zzZD0(zzzbj));
        }
        if (!z) {
            if (iZzZ == 4) {
                return new zzZC5(zzzbj);
            }
            try {
                return zzZDE.zzZ(iZzZ, zzzbj, this.zzWIs);
            } catch (IllegalArgumentException e) {
                throw new zzZDH("corrupted stream detected", e);
            }
        }
        if (iZzZ == 4) {
            return new zzZCR(new zzZD0(zzzbj));
        }
        if (iZzZ == 8) {
            return new zzZCE(new zzZD0(zzzbj));
        }
        if (iZzZ == 16) {
            return new zzZC1(new zzZD0(zzzbj));
        }
        if (iZzZ == 17) {
            return new zzZBZ(new zzZD0(zzzbj));
        }
        throw new IOException(o0Oo0oo.OooO0O0(iZzZ, "unknown tag ", " encountered"));
    }

    public final zzZDJ zzXKz() throws IOException {
        zzZDJ zzzdj = new zzZDJ();
        while (true) {
            zzZDK zzzdkZzXKC = zzXKC();
            if (zzzdkZzXKC == null) {
                return zzzdj;
            }
            if (zzzdkZzXKC instanceof zzZBI) {
                zzzdj.zzZ(((zzZBI) zzzdkZzXKC).zzXKI());
            } else {
                zzzdj.zzZ(zzzdkZzXKC.zzXL0());
            }
        }
    }

    public zzZD0(InputStream inputStream, int i) {
        this.zzWId = inputStream;
        this.zzWIc = i;
        this.zzWIs = new byte[11][];
    }
}
