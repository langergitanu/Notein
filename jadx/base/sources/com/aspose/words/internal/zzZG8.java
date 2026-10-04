package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG8 extends zzZGA {
    final String[] zzWN5;
    final boolean zzWOV;

    public zzZG8(boolean z, zzZDZ[] zzzdzArr) {
        this.zzWOV = z;
        int length = zzzdzArr.length;
        if (length == 0) {
            throw new IllegalStateException("Trying to construct empty PrefixedNameSet");
        }
        this.zzWN5 = new String[z ? length + length : length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            zzZDZ zzzdz = zzzdzArr[i];
            if (z) {
                this.zzWN5[i2] = zzzdz.getPrefix();
                i2++;
            }
            this.zzWN5[i2] = zzzdz.getLocalName();
            i++;
            i2++;
        }
    }

    @Override // com.aspose.words.internal.zzZGA
    public final void zzQ(StringBuilder sb, String str) {
        int i = 0;
        while (i < this.zzWN5.length) {
            if (i > 0) {
                sb.append(str);
            }
            if (this.zzWOV) {
                int i2 = i + 1;
                String str2 = this.zzWN5[i];
                if (str2 != null) {
                    sb.append(str2);
                    sb.append(':');
                }
                i = i2;
            }
            sb.append(this.zzWN5[i]);
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzZGA
    public final boolean zzX(zzZDZ zzzdz) {
        int length = this.zzWN5.length;
        String localName = zzzdz.getLocalName();
        String[] strArr = this.zzWN5;
        if (this.zzWOV) {
            String prefix = zzzdz.getPrefix();
            if (strArr[1] == localName && strArr[0] == prefix) {
                return true;
            }
            for (int i = 2; i < length; i += 2) {
                if (strArr[i + 1] == localName && strArr[i] == prefix) {
                    return true;
                }
            }
        } else {
            if (strArr[0] == localName) {
                return true;
            }
            for (int i2 = 1; i2 < length; i2++) {
                if (strArr[i2] == localName) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZGA
    public final boolean zzXO0() {
        return this.zzWN5.length > 1;
    }
}
