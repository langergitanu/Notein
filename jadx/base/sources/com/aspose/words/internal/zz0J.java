package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz0J extends zzZWZ {
    int zzBu;
    ArrayList<String> zzea;
    int[] zzeb;
    int zzec;
    int zzed;
    int zzee;
    int zzef;
    int zzeg;
    int zzeh;
    short zzei;
    short zzej;
    int zzek;

    public zz0J(zzY0 zzy0, long j) throws Exception {
        long position = zzy0.zzq().getPosition();
        this.zzBu = zzy0.zzXc();
        this.zzek = zzy0.zzXc();
        this.zzej = zzy0.zzXa();
        this.zzei = zzy0.zzXa();
        this.zzeh = zzy0.zzXc();
        this.zzeg = zzy0.zzXc();
        this.zzef = zzy0.zzXc();
        this.zzee = zzy0.zzXc();
        this.zzed = zzy0.zzXc();
        int i = this.zzBu;
        if (i != 65536) {
            if (i != 131072) {
                if (i != 196608) {
                    throw new IllegalStateException("Unexpected PostScript table version.");
                }
                return;
            }
            int iZzX9 = zzy0.zzX9() & 65535;
            this.zzec = iZzX9;
            this.zzeb = new int[iZzX9];
            int iMax = 0;
            for (int i2 = 0; i2 < this.zzeb.length; i2++) {
                int iZzX92 = zzy0.zzX9() & 65535;
                this.zzeb[i2] = iZzX92;
                if (iZzX92 <= 32767) {
                    iMax = Math.max(iZzX92, iMax);
                }
            }
            int i3 = iMax - 257;
            this.zzea = new ArrayList<>(i3 >= 0 ? i3 : 0);
            for (int i4 = StyleIdentifier.COLORFUL_LIST_ACCENT_6; i4 <= iMax && zzy0.zzq().getPosition() < position + j; i4++) {
                this.zzea.add(zzw(zzy0));
            }
        }
    }

    private void zzR(zzZYV<Integer> zzzyv) {
        int[] iArr = new int[zzzyv.getCount()];
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < zzzyv.getCount(); i++) {
            int iZzT3 = zzzyv.zzT3(i);
            int iIntValue = zzzyv.zzVY(i).intValue();
            int i2 = iZzT3 < this.zzec ? this.zzeb[iZzT3] : 0;
            if (i2 < 258 || i2 > 32767) {
                iArr[iIntValue] = ((short) i2) & 65535;
            } else {
                int i3 = i2 - 258;
                if (i3 >= this.zzea.size()) {
                    iArr[iIntValue] = 0;
                } else {
                    zzZQG.zzZ(arrayList, this.zzea.get(i3));
                    iArr[iIntValue] = ((short) (arrayList.size() + 257)) & 65535;
                }
            }
        }
        this.zzec = ((short) zzzyv.getCount()) & 65535;
        this.zzeb = iArr;
        this.zzea = arrayList;
    }

    private static String zzw(zzY0 zzy0) throws Exception {
        int length = zzy0.readByte() & 255;
        if (zzy0.zzq().getPosition() + ((long) length) > zzy0.zzq().getLength()) {
            length = (int) (zzy0.zzq().getLength() - zzy0.zzq().getPosition());
        }
        return zzZO0.zzhX().zzZn(zzy0.zzn(length));
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzl(this.zzBu);
        zzxz.zzl(this.zzek);
        zzxz.zzj(this.zzej);
        zzxz.zzj(this.zzei);
        zzxz.zzl(this.zzeh);
        zzxz.zzl(this.zzeg);
        zzxz.zzl(this.zzef);
        zzxz.zzl(this.zzee);
        zzxz.zzl(this.zzed);
        int i = this.zzBu;
        if (i != 65536) {
            if (i != 131072) {
                if (i != 196608) {
                    throw new IllegalStateException("Unexpected PostScript table version.");
                }
                return;
            }
            zzxz.zzj(this.zzec);
            for (int i2 : this.zzeb) {
                zzxz.zzj(i2);
            }
            for (int i3 = 0; i3 < this.zzea.size(); i3++) {
                zzZ(this.zzea.get(i3), zzxz);
            }
        }
    }

    public final void zzZ(zzZYV<Integer> zzzyv) {
        this.zzeg = 0;
        this.zzef = 0;
        this.zzee = 0;
        this.zzed = 0;
        int i = this.zzBu;
        if (i != 65536) {
            if (i == 131072) {
                zzR(zzzyv);
            } else if (i != 196608) {
                throw new IllegalStateException("Unexpected PostScript table version.");
            }
        }
    }

    private static void zzZ(String str, zzXZ zzxz) throws Exception {
        if (str.length() <= 255) {
            byte[] bytes = zzZO0.zzhX().getBytes(str);
            zzxz.writeByte((byte) bytes.length);
            zzxz.zzW(bytes, bytes.length);
            return;
        }
        throw new IllegalStateException("The PostScript glyph name is too long.");
    }
}
