package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.aspose.words.ref.Ref;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzCI {
    private boolean zztW;
    private String zztX;
    private int zztY;
    private int zztZ;
    private boolean zzu0;
    private static char[] zzu1 = {FilenameUtils.EXTENSION_SEPARATOR, ControlChar.SPACE_CHAR, '\'', IOUtils.DIR_SEPARATOR_UNIX, '\"', '[', ']', '(', ')', '\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR, '\f', '\b', IOUtils.DIR_SEPARATOR_WINDOWS, 133, 8232, 8233};
    static zzCI zztV = new zzCI((byte) 0);

    public zzCI() {
    }

    private int zzCx() {
        if (this.zzu0) {
            return 0;
        }
        int i = this.zztZ;
        if (i == 1) {
            return this.zztX.length() + 5;
        }
        if (i == 2 || i == 3) {
            return zzAM.zzZO(this.zztY) + 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Type");
    }

    private static boolean zzVy(int i) {
        return i == 2 || i == 3;
    }

    private void zzZ(StringBuilder sb, Ref<zzZOL> ref, Ref<char[]> ref2) {
        if (this.zzu0) {
            return;
        }
        int i = this.zztZ;
        if (i != 1) {
            if (i == 2 || i == 3) {
                sb.append('[');
                sb.append(this.zztY);
                sb.append(']');
                return;
            }
            return;
        }
        String str = this.zztX;
        if (zzZKN.zzZ(str, zzu1) == -1) {
            if (sb.length() > 0) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            }
            zzZNH.zzU(sb, str);
        } else {
            zzZNH.zzU(sb, "['");
            if (ref.get() == null) {
                ref.set(new zzZOL(sb));
            }
            zzCT.zzZ(ref.get(), str, zzCT.zzuf, ref2);
            zzZNH.zzU(sb, "']");
        }
    }

    public final int getPosition() {
        return this.zztY;
    }

    public final int getType() {
        return this.zztZ;
    }

    public final void setPosition(int i) {
        if (this.zzu0) {
            throw new IllegalStateException("Cannot change readonly object.");
        }
        this.zztY = i;
    }

    public final void setPropertyName(String str) {
        if (this.zzu0) {
            throw new IllegalStateException("Cannot change readonly object.");
        }
        this.zztX = str;
    }

    public final boolean zzCy() {
        return this.zztW;
    }

    public zzCI(int i) {
        this.zztZ = i;
        this.zztW = zzVy(i);
        this.zztY = -1;
        this.zztX = null;
        this.zzu0 = false;
    }

    private zzCI(byte b) {
        this(0);
        this.zzu0 = true;
    }

    public static String zzZ(ArrayList<zzCI> arrayList, zzCI zzci) {
        char[] cArr;
        int i = 0;
        if (arrayList != null) {
            int iZzCx = 0;
            while (i < arrayList.size()) {
                iZzCx += arrayList.get(i).zzCx();
                i++;
            }
            i = iZzCx;
        }
        StringBuilder sb = new StringBuilder(i + zzci.zzCx());
        zzZOL zzzol = null;
        if (arrayList != null) {
            cArr = null;
            for (zzCI zzci2 : arrayList) {
                Ref<zzZOL> ref = new Ref<>(zzzol);
                Ref<char[]> ref2 = new Ref<>(cArr);
                zzci2.zzZ(sb, ref, ref2);
                zzZOL zzzol2 = ref.get();
                cArr = ref2.get();
                zzzol = zzzol2;
            }
        } else {
            cArr = null;
        }
        Ref<zzZOL> ref3 = new Ref<>(zzzol);
        Ref<char[]> ref4 = new Ref<>(cArr);
        zzci.zzZ(sb, ref3, ref4);
        ref3.get();
        ref4.get();
        return sb.toString();
    }

    public static String zzZ(zzGK zzgk, String str, String str2) {
        int i = zzZOF.ORDINAL$4894b8c8;
        if (!zzZKN.zzW(str2, IOUtils.LINE_SEPARATOR_WINDOWS, i)) {
            String strZzTX = zzZKN.zzTX(str2);
            if (!zzZKN.zzW(strZzTX, ".", i)) {
                strZzTX = zzZKN.zzZI(strZzTX, ".");
            }
            str2 = zzZKN.zzZI(strZzTX, " ");
        }
        String strZzZI = zzZKN.zzZI(str2, zzZKN.format("Path '{0}'", str));
        if (zzgk != null) {
            strZzZI = zzZKN.zzZI(strZzZI, zzZKN.format(", line {0}, position {1}", Integer.valueOf(zzgk.getLineNumber()), Integer.valueOf(zzgk.zzFz())));
        }
        return zzZKN.zzZI(strZzZI, ".");
    }
}
