package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzN9 {
    private zzN7 zzEI;
    private boolean zzEq;
    private long zzEr;

    public zzN9(zzN7 zzn7) {
        this.zzEI = zzn7;
    }

    public final void zzH(zzPV zzpv) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16393);
        this.zzEI.zzKt().writeShort((short) 0);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().zzI(zzpv);
    }

    public final void zzI(zzP9 zzp9) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16428);
        this.zzEI.zzKt().writeShort((short) 0);
        this.zzEI.zzKt().writeInt(36);
        this.zzEI.zzKt().writeInt(24);
        this.zzEI.zzKt().zzK(zzp9);
    }

    public final void zzKB() throws Exception {
        this.zzEI.zzKt().writeShort((short) 16415);
        this.zzEI.zzKt().writeByte((byte) 3);
        this.zzEI.zzKt().writeByte((byte) 0);
        this.zzEI.zzKt().writeInt(12);
        this.zzEI.zzKt().writeInt(0);
    }

    public final void zzKC() throws Exception {
        this.zzEI.zzKt().writeShort((short) 16432);
        this.zzEI.zzKt().writeByte((byte) 3);
        this.zzEI.zzKt().writeByte((byte) 0);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().writeFloat(1.0f);
    }

    public final void zzKD() throws Exception {
        if (this.zzEq) {
            this.zzEq = false;
            long position = this.zzEI.zzq().getPosition();
            int i = (int) (position - this.zzEr);
            this.zzEI.zzq().zzH(this.zzEr + 4);
            this.zzEI.zzKt().writeInt(i);
            this.zzEI.zzKt().writeInt(i - 12);
            this.zzEI.zzq().zzH(position);
        }
    }

    public final void zzKE() throws Exception {
        this.zzEI.zzKt().writeShort((short) 16386);
        this.zzEI.zzKt().zzR((short) 0);
        this.zzEI.zzKt().writeInt(12);
        this.zzEI.zzKt().writeInt(0);
    }

    public final void zzKF() throws Exception {
        this.zzEI.zzKt().writeShort((short) 16385);
        this.zzEI.zzKt().zzR((short) 0);
        this.zzEI.zzKt().writeInt(28);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().zzMF();
        this.zzEI.zzKt().writeInt(1);
        this.zzEI.zzKt().writeInt((int) this.zzEI.getHorizontalResolution());
        this.zzEI.zzKt().writeInt((int) this.zzEI.getVerticalResolution());
    }

    public final void zzT(float f, float f2) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16430);
        this.zzEI.zzKt().writeShort((short) 0);
        this.zzEI.zzKt().writeInt(20);
        this.zzEI.zzKt().writeInt(8);
        this.zzEI.zzKt().writeFloat(f);
        this.zzEI.zzKt().writeFloat(f2);
    }

    public final void zzXa(int i) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16417);
        this.zzEI.zzKt().writeByte((byte) 7);
        this.zzEI.zzKt().writeByte((byte) 0);
        this.zzEI.zzKt().writeInt(12);
        this.zzEI.zzKt().writeInt(0);
    }

    public final void zzXb(int i) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16414);
        this.zzEI.zzKt().writeShort((short) 5);
        this.zzEI.zzKt().writeInt(12);
        this.zzEI.zzKt().writeInt(0);
    }

    public final void zzXc(int i) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16435);
        this.zzEI.zzKt().writeByte((byte) i);
        this.zzEI.zzKt().writeByte((byte) 1);
        this.zzEI.zzKt().writeInt(12);
        this.zzEI.zzKt().writeInt(0);
    }

    public final void zzXd(int i) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16422);
        this.zzEI.zzKt().writeShort((short) 0);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().writeInt(i);
    }

    public final void zzXe(int i) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16421);
        this.zzEI.zzKt().writeShort((short) 0);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().writeInt(i);
    }

    public final void zzY(int i, zzZQ4 zzzq4, zzZQ4 zzzq42) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16410);
        this.zzEI.zzKt().writeByte((byte) i);
        this.zzEI.zzKt().writeByte((byte) 0);
        this.zzEI.zzKt().writeInt(52);
        this.zzEI.zzKt().writeInt(40);
        this.zzEI.zzKt().zzXC(-1);
        this.zzEI.zzKt().writeInt(2);
        this.zzEI.zzKt().zzD(zzzq4);
        this.zzEI.zzKt().zzD(zzzq42);
    }

    public final void zzZ(int i, short s) throws Exception {
        if (this.zzEq) {
            return;
        }
        this.zzEq = true;
        this.zzEr = this.zzEI.zzq().getPosition();
        this.zzEI.zzKt().writeShort((short) i);
        this.zzEI.zzKt().zzR(s);
        this.zzEI.zzKt().writeInt(0);
        this.zzEI.zzKt().writeInt(0);
    }

    public final void zzk(int i, int i2) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16404);
        this.zzEI.zzKt().writeByte((byte) i);
        this.zzEI.zzKt().writeByte((byte) 0);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().writeInt(i2);
    }

    public final void zzl(int i, int i2) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16405);
        this.zzEI.zzKt().writeByte((byte) i);
        this.zzEI.zzKt().writeByte(UnsignedBytes.MAX_POWER_OF_TWO);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().writeInt(i2);
    }

    public final void zzZ(int i, String str, zzPV zzpv, long j, int i2) throws Exception {
        zzZ(16412, (short) (((short) i) | Short.MIN_VALUE));
        byte[] bytes = zzZO0.zzhU().getBytes(str);
        this.zzEI.zzKt().zzI(zzpv);
        this.zzEI.zzKt().writeInt(i2);
        this.zzEI.zzKt().writeInt(bytes.length / 2);
        this.zzEI.zzKt().zzD(new zzZQ4(j, zzZPW.zzG(0.0f, 0.0f)));
        this.zzEI.zzKt().writeBytes(bytes);
        this.zzEI.zzKt().zzXB(bytes.length);
        zzKD();
    }

    public final void zzZ(int i, zzPV zzpv) throws Exception {
        this.zzEI.zzKt().writeShort((short) 16404);
        this.zzEI.zzKt().writeByte((byte) i);
        this.zzEI.zzKt().writeByte(UnsignedBytes.MAX_POWER_OF_TWO);
        this.zzEI.zzKt().writeInt(16);
        this.zzEI.zzKt().writeInt(4);
        this.zzEI.zzKt().zzI(zzpv);
    }
}
