package com.aspose.words.internal;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRW extends zzZRX {
    private static byte[] zz5o = {80, 75, 3, 4};
    private zzZRX zz5p;

    public zzZRW(zzZOP zzzop) throws Exception {
        this(zzzop, (byte) 0);
    }

    public static zzZOR zzZO(zzZOP zzzop) throws Exception {
        try {
            zzZOX zzzox = new zzZOX(zzzop);
            int iZzX8 = (int) zzzox.zzX8();
            return zzzox.readBoolean() ? new zzZOR(zzZRV.zzT(zzzox.zzn(zzzox.zzXc()), iZzX8, 0)) : new zzZOR(zzzox.zzn(iZzX8));
        } catch (Exception e) {
            if (e instanceof ZipException) {
                throw new ZipException("Cannot create ZipStream from byte array");
            }
            throw e;
        }
    }

    private static boolean zzZP(zzZOP zzzop) throws Exception {
        try {
            zzZOR zzzor = new zzZOR();
            ZipInputStream zipInputStream = new ZipInputStream(new zzZK7(zzzop));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return true;
                }
                int size = (int) nextEntry.getSize();
                if (size > 0 && size < 12582912) {
                    zzzor.zzH(0L);
                    zzZKB.zzZ(zipInputStream, zzzor, size);
                }
            }
        } catch (ZipException unused) {
            return false;
        }
    }

    private boolean zzlQ() {
        return this.zz5p.zzlY() == 8;
    }

    public static byte[] zzlS() {
        return zz5o;
    }

    @Override // com.aspose.words.internal.zzZRX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zz5p.close();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final /* bridge */ /* synthetic */ void dispose() throws IOException {
        super.dispose();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final void zzZQ(zzZOP zzzop) throws Exception {
        this.zz5p.zzZQ(zzzop);
    }

    public final byte[] zzlR() throws Exception {
        return zzlQ() ? zzSJ.zzZ(zzZRV.zzD(super.zzlU(), 0), zzlW(), zzlQ()) : zzSJ.zzZ(super.zzlU(), zzlW(), false);
    }

    @Override // com.aspose.words.internal.zzZRX
    public final /* bridge */ /* synthetic */ zzZOR zzlT() throws Exception {
        return super.zzlT();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final /* bridge */ /* synthetic */ byte[] zzlU() throws Exception {
        return super.zzlU();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final /* bridge */ /* synthetic */ zzZOR zzlV() throws Exception {
        return super.zzlV();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final int zzlW() {
        int iZzlW = this.zz5p.zzlW();
        if (iZzlW > 0) {
            return iZzlW;
        }
        return 0;
    }

    @Override // com.aspose.words.internal.zzZRX
    public final zzZQ9 zzlX() {
        return this.zz5p.zzlX();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final int zzlY() {
        return this.zz5p.zzlY();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final String zzlZ() {
        return this.zz5p.zzlZ();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final boolean zzm0() throws Exception {
        return this.zz5p.zzm0();
    }

    private zzZRW(zzZOP zzzop, byte b) throws Exception {
        boolean zZzZP;
        if (zzzop instanceof zzZOS) {
            zZzZP = false;
        } else {
            long position = zzzop.getPosition();
            zZzZP = zzZP(zzzop);
            zzzop.zzH(position);
        }
        this.zz5p = zZzZP ? new zzZRY(zzzop) : new zzZRZ(zzzop);
    }
}
