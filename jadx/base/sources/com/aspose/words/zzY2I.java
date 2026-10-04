package com.aspose.words;

import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2I {
    private static zz7X zzW(zzZ8T zzz8t, ShapeBase shapeBase) throws Exception {
        boolean z = true;
        int iIntValue = ((Integer) zzY2V.zzZ(zzz8t, true)).intValue();
        zz54 zz54Var = new zz54();
        boolean zBooleanValue = ((Boolean) zzz8t.zzYW8().fetchShapeAttr(LogSeverity.ALERT_VALUE)).booleanValue();
        if (iIntValue != 3 && iIntValue != 2 && iIntValue != 1) {
            z = false;
        }
        if (zBooleanValue || (zzz8t.isWordArt() && z)) {
            return zz54Var;
        }
        zz7X zz7xZzZ = zzY2V.zzZ(zzz8t, iIntValue);
        zz7xZzZ.zzZ(shapeBase);
        return zz7xZzZ;
    }

    private static zz4G zzX(zzZ8T zzz8t, ShapeBase shapeBase) {
        zz4G zz4g = new zz4G();
        zz4g.setFill(new zz54());
        Border border = (Border) zzz8t.zzYW8().getDirectShapeAttr(4107);
        if (border != null && !com.aspose.words.internal.zzAN.zzf(border.zz8S())) {
            zz4g.setWeight(border.zz8S());
            zz4g.zzHo(zzrX(border.getLineStyle()));
            com.aspose.words.internal.zzPV zzpvZz8Q = border.zz8Q();
            zz4g.setFill(new zz1C(zzBW.zzZ(1.0d, zzpvZz8Q.zzPC(), zzpvZz8Q.zzPB(), zzpvZz8Q.zzPA())));
            zz4g.getFill().zzZ((zzZAV) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class));
            zz4g.zzHn(1);
            zz4g.zzXJ(8.0d);
            zz4g.zzZ(new zz6T());
            zz4g.zzZ(new zz12());
        }
        return zz4g;
    }

    public static zz4G zzY(zzZ8T zzz8t, ShapeBase shapeBase) throws Exception {
        ShapeBase shapeBaseZzYW8 = zzz8t.zzYW8();
        if (shapeBaseZzYW8.isImage() && shapeBaseZzYW8.isInline()) {
            return zzX(zzz8t, shapeBase);
        }
        zz4G zz4g = new zz4G();
        zz7X zz54Var = new zz54();
        if (zzz8t.zzYW7() || !shapeBaseZzYW8.isImage() || ((Boolean) zzz8t.zzYW8().fetchShapeAttr(508)).booleanValue()) {
            zz54Var = zzW(zzz8t, shapeBase);
            zz4g.zzXK(((Integer) shapeBaseZzYW8.fetchShapeAttr(459)).intValue());
            zz4g.zzHo(((Integer) shapeBaseZzYW8.fetchShapeAttr(461)).intValue());
            zz4g.zzWX(((Boolean) shapeBaseZzYW8.fetchShapeAttr(505)).booleanValue());
            zz4g.zzY2(((Integer) shapeBaseZzYW8.fetchShapeAttr(471)).intValue());
            if (!zzz8t.isWordArt()) {
                zzZ(zzz8t, zz4g);
            }
            zz4g.zzHn(((Integer) shapeBaseZzYW8.fetchShapeAttr(470)).intValue());
            int shapeType = shapeBaseZzYW8.getShapeType();
            if (!shapeBaseZzYW8.zzYvW().contains(460) && (shapeType == 2 || shapeType == 3 || shapeType == 20)) {
                zz4g.zzHn(2);
            }
            if (zz4g.zzZxC() == 1) {
                zz4g.zzXJ(shapeBaseZzYW8.zzYvW().contains(460) ? ((double) ((Integer) shapeBaseZzYW8.zzYvW().get(460)).intValue()) / 65536.0d : 8.0d);
            }
            zz3G zz3g = new zz3G();
            zz3g.zzHa(((Integer) shapeBaseZzYW8.fetchShapeAttr(462)).intValue());
            zz4g.zzZ(zz3g);
        }
        zz4g.setFill(zz54Var);
        return zz4g;
    }

    private static void zzZ(zzZCH zzzch, zz4G zz4g) {
        zz82 zz82Var = new zz82("{91240B29-F687-4F45-9708-019B960494DF}", null);
        zz82Var.zzY(zz4g);
        zzY2V.zzZ((zzZC0) zzzch, zz82Var);
    }

    private static int zzrX(int i) {
        if (i == 3) {
            return 1;
        }
        if (i == 10) {
            return 4;
        }
        if (i == 21) {
            return 1;
        }
        switch (i) {
            case 14:
                return 3;
            case 15:
                return 2;
            case 16:
                return 4;
            default:
                return 0;
        }
    }

    public static void zzZ(zz4G zz4g, ShapeBase shapeBase, zzZ8T zzz8t) {
        zz2O zz2o;
        if ((zzz8t.zzYW7() || !zzz8t.zzYW8().isImage()) && !((Boolean) zzz8t.zzYW8().fetchShapeAttr(508)).booleanValue()) {
            zzZ(shapeBase.zzY9i(), zz4g);
            zz4g = new zz4G();
            zz4g.setFill(new zz54());
        } else if (zzz8t.zzZic() && (zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz2O.class)) != null) {
            zzZ(zz2o, zz2o.getOutline());
        }
        zzZ(zz4g, shapeBase);
    }

    public static void zzZ(zz4G zz4g, ShapeBase shapeBase) {
        if (shapeBase.isGroup() && ((GroupShape) shapeBase).zzZ57() == 0) {
            ((zz5H) shapeBase.zzY9i()).setOutline(zz4g);
        }
        if (shapeBase.isGroup()) {
            return;
        }
        ((zz2J) shapeBase.zzY9i()).setOutline(zz4g);
    }

    private static void zzZ(zzZ8T zzz8t, zz4G zz4g) {
        zz6T zz6t = new zz6T();
        zz12 zz12Var = new zz12();
        ShapeBase shapeBaseZzYW8 = zzz8t.zzYW8();
        int iIntValue = ((Integer) shapeBaseZzYW8.fetchShapeAttr(464)).intValue();
        int iIntValue2 = ((Integer) shapeBaseZzYW8.fetchShapeAttr(467)).intValue();
        int iIntValue3 = ((Integer) shapeBaseZzYW8.fetchShapeAttr(466)).intValue();
        int iIntValue4 = ((Integer) shapeBaseZzYW8.fetchShapeAttr(465)).intValue();
        int iIntValue5 = ((Integer) shapeBaseZzYW8.fetchShapeAttr(469)).intValue();
        int iIntValue6 = ((Integer) shapeBaseZzYW8.fetchShapeAttr(468)).intValue();
        int shapeType = shapeBaseZzYW8.getShapeType();
        if (shapeBaseZzYW8.zzY9w() && shapeType != 178 && shapeType != 179 && shapeType != 180 && shapeType != 181) {
            zz6t.setType(iIntValue4);
            zz6t.setLength(iIntValue5);
            zz6t.setWidth(iIntValue6);
            zz12Var.setType(iIntValue);
            zz12Var.setLength(iIntValue2);
            zz12Var.setWidth(iIntValue3);
        } else {
            zz6t.setType(iIntValue);
            zz6t.setLength(iIntValue2);
            zz6t.setWidth(iIntValue3);
            zz12Var.setType(iIntValue4);
            zz12Var.setLength(iIntValue5);
            zz12Var.setWidth(iIntValue6);
        }
        zz4g.zzZ(zz6t);
        zz4g.zzZ(zz12Var);
    }
}
