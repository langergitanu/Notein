package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10579os;
import com.aspose.slides.internal.p407st.AbstractC10657tu;
import com.aspose.slides.internal.p407st.C10576og;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
class tl4 extends uki {

    /* JADX INFO: renamed from: k4 */
    static final byte[] f49161k4 = {UnsignedBytes.MAX_POWER_OF_TWO, 122, 31, -16, 97, 0, 0, 0, -28, 66, -17, 93, 34, -78, -29, -126, 73, 60, 57, 107, 2, -69, -33, 95, -60, 40, 0, 0, 0, 8, 0, 0, 0, 8, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 32, 0, 0, 0, -119, 11, 0, 0, -119, 11, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -9, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, Ascii.DEL, 0, 0, 0};

    /* JADX INFO: renamed from: x1 */
    private byte f49162x1;

    public tl4(byte b, C14652uw c14652uw) {
        super(c14652uw);
        this.f49162x1 = b;
        c14652uw.m71943fa().addItem(Byte.valueOf(this.f49162x1), this);
    }

    /* JADX INFO: renamed from: k4 */
    private byte m71245k4(byte b) {
        switch (b) {
            case 1:
                return (byte) -60;
            case 2:
                return (byte) -52;
            case 3:
                return (byte) -44;
            case 4:
                return (byte) -36;
            case 5:
                return (byte) -28;
            case 6:
                return (byte) -20;
            case 7:
                return (byte) -59;
            case 8:
                return (byte) -51;
            case 9:
                return (byte) -43;
            case 10:
                return (byte) -35;
            case 11:
                return (byte) -27;
            case 12:
                return (byte) -19;
            case 13:
            case 49:
                return (byte) -17;
            case 14:
            case 50:
                return (byte) -25;
            case 15:
            case 52:
                return (byte) -42;
            case 16:
            case 53:
                return (byte) -34;
            case 17:
                return (byte) -37;
            case 18:
                return (byte) -22;
            case 19:
                return (byte) -49;
            case 20:
                return (byte) -57;
            case 21:
                return (byte) -58;
            case 22:
                return (byte) -50;
            case 23:
                return (byte) -53;
            case 24:
                return (byte) -38;
            case 25:
                return (byte) -26;
            case 26:
                return (byte) -18;
            case 27:
                return (byte) -56;
            case 28:
                return (byte) -48;
            case 29:
                return (byte) -41;
            case 30:
                return (byte) -33;
            case 31:
                return (byte) -32;
            case 32:
                return (byte) -40;
            case 33:
                return (byte) -16;
            case 34:
                return (byte) -45;
            case 35:
                return (byte) -31;
            case 36:
                return (byte) -29;
            case 37:
                return (byte) -24;
            case 38:
                return (byte) -55;
            case 39:
                return (byte) -13;
            case 40:
                return (byte) -39;
            case 41:
                return (byte) -21;
            case 42:
                return (byte) -15;
            case 43:
                return (byte) -14;
            case 44:
                return (byte) -23;
            case 45:
                return (byte) -46;
            case 46:
                return (byte) -54;
            case 47:
                return (byte) -30;
            case 48:
                return (byte) -47;
            case 51:
            case 54:
                throw new NotImplementedException();
            default:
                throw new Exception();
        }
    }

    @Override // com.aspose.slides.uki
    /* JADX INFO: renamed from: k4 */
    public AbstractC10657tu mo71246k4() {
        AbstractC10657tu abstractC10657tu = (AbstractC10657tu) C7019kk.m27452k4((Object) C10576og.m51429k4(new C3134k4(new C3152yj(f49161k4))), AbstractC10657tu.class);
        byte[] bArrM22001x1 = C5133k4.m22001x1("resources/patterns", C14113y2.m67408k4(tbt.m71069k4(f6b.m5929m9(this.f49162x1)), ".dat"));
        C14047bz c14047bzClone = C5133k4.m22000kk("resources/patterns", C14113y2.m67408k4(tbt.m71069k4(f6b.m5929m9(this.f49162x1)), " Guid.dat")).Clone();
        abstractC10657tu.m51778k4(bArrM22001x1);
        abstractC10657tu.m51777k4(c14047bzClone.Clone());
        if (C7019kk.m27469x1(abstractC10657tu, AbstractC10579os.class)) {
            ((AbstractC10579os) abstractC10657tu).m51444k4(m71245k4(this.f49162x1));
        }
        return abstractC10657tu;
    }
}
