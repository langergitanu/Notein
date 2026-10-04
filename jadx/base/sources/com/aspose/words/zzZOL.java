package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOL {
    private static void zzA(zzZOY zzzoy) {
        if (zzzoy.zzZb4() != -1) {
            return;
        }
        zzw(zzzoy);
        ArrayList<zzZOY> arrayListZzz = zzz(zzzoy);
        if (arrayListZzz.size() == 0) {
            return;
        }
        Iterator<zzZOY> it = arrayListZzz.iterator();
        while (it.hasNext()) {
            zzv(it.next());
        }
        zzy(zzzoy);
    }

    public static boolean zzB(zzZOY zzzoy) {
        if (zze(zzzoy.getField())) {
            return true;
        }
        if (zzzoy.getField().zzZgt()) {
            return false;
        }
        zzA(zzzoy.zzZbg());
        return zzzoy.zzZb4() == 1;
    }

    private static boolean zzCp(int i) {
        return i == 3 || i == 4;
    }

    private static boolean zzCq(int i) {
        if (i == 3 || i == 10 || i == 12 || i == 49 || i == 70 || i == 72 || i == 85 || i == 6 || i == 7 || i == 46 || i == 47 || i == 94 || i == 95 || i == 6301 || i == 6302) {
            return true;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return true;
            default:
                switch (i) {
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        return true;
                    default:
                        switch (i) {
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                                return true;
                            default:
                                switch (i) {
                                    case 79:
                                    case 80:
                                    case 81:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    private static boolean zzd(Field field) {
        switch (field.getType()) {
            case 3:
            case 6:
            case 10:
            case 12:
            case 22:
            case 23:
            case 26:
            case 31:
            case 32:
            case 33:
            case 37:
            case 38:
            case 40:
            case 46:
            case 49:
            case 63:
            case 65:
            case 66:
            case 72:
            case FieldType.FIELD_DISPLAY_BARCODE /* 6301 */:
            case FieldType.FIELD_MERGE_BARCODE /* 6302 */:
                break;
            case 70:
                FormField formFieldZzZcg = field.getStart().zzZcg();
                if (formFieldZzZcg != null) {
                    break;
                }
                break;
        }
        return false;
    }

    private static boolean zze(Field field) {
        return field.zzZgt() ? zzCq(field.getType()) : zzd(field);
    }

    private static void zzv(zzZOY zzzoy) {
        while (true) {
            zzzoy.zzq((byte) 1);
            if (!zzzoy.zzZbi()) {
                return;
            } else {
                zzzoy = zzzoy.zzZbh();
            }
        }
    }

    private static void zzw(zzZOY zzzoy) {
        zzzoy.zzq((byte) 0);
        Iterator<zzZOY> it = zzzoy.iterator();
        while (it.hasNext()) {
            zzw(it.next());
        }
    }

    private static boolean zzx(zzZOY zzzoy) {
        zzzoy.getField().getType();
        FieldIf fieldIf = (FieldIf) zzzoy.getField();
        zzZR8 zzzr8ZzZdL = fieldIf.zzZdL();
        zzZR8 zzzr8ZzZdK = fieldIf.zzZdK();
        for (zzZOY zzzoy2 : zzzoy) {
            if (zzzoy2.zzZb4() != 1 && (zzzoy2.zzZbc() == zzzr8ZzZdL || zzzoy2.zzZbc() == zzzr8ZzZdK)) {
                return false;
            }
        }
        return true;
    }

    private static void zzy(zzZOY zzzoy) {
        if (zzzoy.getField().getType() != 7) {
            return;
        }
        boolean z = false;
        for (zzZOY zzzoy2 : zzzoy) {
            if (zzzoy2.getField().getType() == 7) {
                boolean zZzx = zzx(zzzoy2);
                if (z && !zZzx) {
                    return;
                }
                if (zZzx) {
                    z = true;
                }
                zzzoy2.zzq((byte) 1);
            }
        }
    }

    private static ArrayList<zzZOY> zzz(zzZOY zzzoy) {
        ArrayList<zzZOY> arrayList = new ArrayList<>();
        for (zzZOY zzzoy2 : zzzoy) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) zzz(zzzoy2));
            if (zze(zzzoy2.getField())) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzoy2);
            }
        }
        return arrayList;
    }
}
