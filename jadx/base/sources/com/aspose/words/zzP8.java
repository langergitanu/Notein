package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzP8 extends zzMP {
    private zzL4 zzZq3;
    private zzL4 zzZq4;
    private zzL4 zzZq5;
    private zzL4 zzZq6;
    private zzL4 zzZq7;
    private zzL4 zzZq8;

    public zzP8(zzL4 zzl4, zzL4 zzl42, zzL4 zzl43, zzL4 zzl44, zzL4 zzl45, zzL4 zzl46) {
        super(zzZ(zzl4, zzl42, zzl43, zzl44, zzl45, zzl46));
        this.zzZq8 = zzl4;
        this.zzZq7 = zzl42;
        this.zzZq6 = zzl43;
        this.zzZq5 = zzl44;
        this.zzZq4 = zzl45;
        this.zzZq3 = zzl46;
    }

    private static zzL2 zzZ(zzL4 zzl4, zzL4 zzl42, zzL4 zzl43, zzL4 zzl44, zzL4 zzl45, zzL4 zzl46) {
        zzL2 zzl2 = new zzL2();
        if (zzl4 != null) {
            zzl2.zzI(zzl4);
        }
        if (zzl42 != null) {
            zzl2.zzI(zzl42);
        }
        if (zzl43 != null) {
            zzl2.zzI(zzl43);
        }
        zzl2.zzI(zzl44);
        if (zzl45 != null) {
            zzl2.zzI(zzl45);
        }
        zzl2.zzI(zzl46);
        return zzl2;
    }

    @Override // com.aspose.words.zzMP
    public final void zzF(StringBuilder sb) {
        boolean z;
        zzL4 zzl4 = this.zzZq8;
        boolean z2 = true;
        if (zzl4 != null) {
            zzl4.zzG(sb);
            z = true;
        } else {
            z = false;
        }
        if (this.zzZq7 != null) {
            if (z) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            this.zzZq7.zzG(sb);
            z = true;
        }
        if (this.zzZq6 != null) {
            if (z) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            this.zzZq6.zzG(sb);
        } else {
            z2 = z;
        }
        if (z2) {
            sb.append(ControlChar.SPACE_CHAR);
        }
        this.zzZq5.zzG(sb);
        if (this.zzZq4 != null) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            this.zzZq4.zzG(sb);
        }
        sb.append(ControlChar.SPACE_CHAR);
        this.zzZq3.zzG(sb);
    }

    public zzP8(zzL4 zzl4, zzL4 zzl42) {
        this(null, null, null, zzl4, null, zzl42);
    }
}
