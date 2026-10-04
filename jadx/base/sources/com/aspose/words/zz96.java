package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz96 {
    private static String zzXW(double d) {
        return d == Double.POSITIVE_INFINITY ? "INF" : d == Double.NEGATIVE_INFINITY ? "-INF" : Double.isNaN(d) ? "NaN" : com.aspose.words.internal.zzJB.zzZT(d);
    }

    private static void zzY(zzBE zzbe, zzZYD zzzyd) {
        zzzyd.zzA("refType", zz9Z.zzJ4(zzbe.getType()), "none");
        zzzyd.zzA("refFor", zz9Z.zzJf(zzbe.zzZF7()), "self");
        zzzyd.zz0("refForName", zzbe.zzZF6());
        zzzyd.zzA("refPtType", zz9Z.zzJh(zzbe.zzZF5()), "all");
    }

    public static void zzZ(zz9L zz9l, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzZ("dgm:layoutDef");
        zzzydZzZlV.zz0("xmlns:dgm", zzZX5.zz9(8, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        zzzydZzZlV.zz0("uniqueId", zz9l.getUniqueId());
        zzzydZzZlV.zz0("minVer", zz9l.zzZEN());
        zzzydZzZlV.zz0("defStyle", zz9l.zzZE9());
        zzAO.zzZ("dgm:title", zz9l.zzZEK(), zzzxr);
        zzAO.zzZ("dgm:desc", zz9l.zzZEJ(), zzzxr);
        zzAO.zzZ(zz9l.zzZEL(), zzzxr);
        zzA4.zzZ("dgm:sampData", zz9l.zzZE7(), zzzxr);
        zzA4.zzZ("dgm:styleData", zz9l.zzZE5(), zzzxr);
        zzA4.zzZ("dgm:clrData", zz9l.zzZE6(), zzzxr);
        zzZ(zz9l.zzZE8(), zzzxr);
        zz7Z.zzZ("dgm", zz9l.getExtensions(), zzzxr);
        zzzydZzZlV.endDocument();
    }

    private static void zzZ(zz99 zz99Var, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:layoutNode");
        zzzydZzZlV.zz0("name", zz99Var.getName());
        zzzydZzZlV.zz0("styleLbl", zz99Var.zzZDV());
        if (zz99Var.zzZDk() != 0) {
            zzzydZzZlV.zz0("chOrder", zz9Z.zzJk(zz99Var.zzZDk()));
        }
        zzzydZzZlV.zz0("moveWith", zz99Var.zzZDj());
        Iterator<zz98> it = zz99Var.zzAy().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr);
        }
        zz7Z.zzZ("dgm", zz99Var.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz98 zz98Var, zzZXR zzzxr) throws Exception {
        switch (zz98Var.zzZSn()) {
            case 0:
                zzZ((zzJG) zz98Var, zzzxr);
                return;
            case 1:
                zzZ((zzC5) zz98Var, zzzxr);
                return;
            case 2:
                zzZ((zzBD) zz98Var, zzzxr);
                return;
            case 3:
                zzZ((zz99) zz98Var, zzzxr);
                return;
            case 4:
                zzZ((zz8X) zz98Var, zzzxr);
                return;
            case 5:
                zzZ((zz7N) zz98Var, zzzxr);
                return;
            case 6:
                zzAO.zzZ("dgm:varLst", (zz60) zz98Var, zzzxr);
                return;
            case 7:
                zzZ((zz4U) zz98Var, zzzxr);
                return;
            case 8:
                zzZ((zz3J) zz98Var, zzzxr);
                return;
            default:
                throw new IllegalArgumentException("Unexpected Diagram Layout Node Content Item Type");
        }
    }

    private static void zzZ(zzJG zzjg, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:alg");
        zzzydZzZlV.zz0(C18437z2.f56754h, zz9Z.zzJj(zzjg.getType()));
        zzzydZzZlV.zzZh("rev", zzjg.getRevision());
        Iterator<Map.Entry<K, V>> it = zzjg.zzZSm().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzzydZzZlV.zzX("dgm:param", C18437z2.f56754h, entry.getKey(), "val", entry.getValue());
        }
        zz7Z.zzZ("dgm", zzjg.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzC5 zzc5, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:choose");
        zzzydZzZlV.zz0("name", zzc5.getName());
        zzZ(zzc5.zzZFQ(), zzzxr);
        zzZ(zzc5.zzZFP(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(Iterable<zzZZV> iterable, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (zzZZV zzzzv : iterable) {
            zzzydZzZlV.zzY("dgm:if");
            zzzydZzZlV.zz0("name", zzzzv.getName());
            zzZ(zzzzv.zzZAS(), zzzydZzZlV);
            zzzydZzZlV.zz0("func", zz9Z.zzJ9(zzzzv.zzZrY()));
            zzzydZzZlV.zz0("arg", zz9Z.zzJ8(zzzzv.zzZrX()));
            zzzydZzZlV.zz0("op", zz9Z.zzJ7(zzzzv.zzNi()));
            zzzydZzZlV.zz0("val", zzzzv.getValue());
            Iterator<zz98> it = zzzzv.zzAy().iterator();
            while (it.hasNext()) {
                zzZ(it.next(), zzzxr);
            }
            zz7Z.zzZ("dgm", zzzzv.getExtensions(), zzzxr);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(zz4H zz4h, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:else");
        zzzydZzZlV.zz0("name", zz4h.getName());
        Iterator<zz98> it = zz4h.zzAy().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr);
        }
        zz7Z.zzZ("dgm", zz4h.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzBD zzbd, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:constrLst");
        for (zzBF zzbf : zzbd.zzl9()) {
            zzzydZzZlV.zzY("dgm:constr");
            zzZ(zzbf.zzZF9(), zzzydZzZlV);
            zzY(zzbf.zzZF8(), zzzydZzZlV);
            zzzydZzZlV.zzA("op", zz9Z.zzJg(zzbf.zzNi()), "none");
            if (!com.aspose.words.internal.zzAN.zzL(zzbf.getValue(), 0.0d)) {
                zzzydZzZlV.zz0("val", zzXW(zzbf.getValue()));
            }
            if (!com.aspose.words.internal.zzAN.zzL(zzbf.zzZFa(), 1.0d)) {
                zzzydZzZlV.zz0("fact", zzXW(zzbf.zzZFa()));
            }
            zzzydZzZlV.zzo();
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz8X zz8x, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:shape");
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzN("rot", zz8x.zzZCC().zzZQQ());
        zzzydZzZlV.zzA(C18437z2.f56754h, zz8x.getType(), "none");
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        zzzydZzZlV.zzX("r:blip", zz8x.zzZCB());
        zzzydZzZlV.zzZh("zOrderOff", zz8x.getZOrder());
        zzzydZzZlV.zzw("hideGeom", zz8x.zzZCz());
        zzzydZzZlV.zzw("lkTxEntry", zz8x.zzZCy());
        zzzydZzZlV.zzw("blipPhldr", zz8x.zzZCx());
        if (zz8x.zzZCw() != null) {
            zzzydZzZlV.zzY("dgm:adjLst");
            for (zz2M zz2m : zz8x.zzZCw()) {
                zzzydZzZlV.zzX("dgm:adj", "idx", Integer.valueOf(zz2m.zzZvl()), "val", Double.valueOf(zz2m.getValue()));
            }
            zzzydZzZlV.zzo();
        }
        zz7Z.zzZ("dgm", zz8x.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz7N zz7n, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:forEach");
        zzzydZzZlV.zz0("name", zz7n.getName());
        zzzydZzZlV.zz0("ref", zz7n.zzZAT());
        zzZ(zz7n.zzZAS(), zzzydZzZlV);
        Iterator<zz98> it = zz7n.zzAy().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr);
        }
        zz7Z.zzZ("dgm", zz7n.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz4U zz4u, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:ruleLst");
        for (zz4V zz4v : zz4u.zzl9()) {
            zzzydZzZlV.zzY("dgm:rule");
            zzZ(zz4v.zzZF9(), zzzydZzZlV);
            zzzydZzZlV.zz0("val", zzXW(zz4v.getValue()));
            zzzydZzZlV.zz0("fact", zzXW(zz4v.zzZFa()));
            zzzydZzZlV.zz0("max", zzXW(zz4v.getMax()));
            zzzydZzZlV.zzo();
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz3J zz3j, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:presOf");
        zzZ(zz3j.zzZAS(), zzzydZzZlV);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz6C zz6c, zzZYD zzzyd) {
        zzzyd.zzA("axis", zz9Z.zzy(zz6c.zzZzI()), "none");
        zzzyd.zzA("ptType", zz9Z.zzx(zz6c.zzZzH()), "all");
        zzzyd.zzA("hideLastTrans", zz9Z.zzY(zz6c.zzZzG()), TelemetryEventStrings.Value.TRUE);
        zzzyd.zzA("st", zz9Z.zzz(zz6c.zzZzF()), "1");
        zzzyd.zzA("cnt", zz9Z.zzz(zz6c.zzZzE()), "0");
        zzzyd.zzA("step", zz9Z.zzz(zz6c.zzZzD()), "1");
    }

    private static void zzZ(zzBE zzbe, zzZYD zzzyd) {
        zzzyd.zz0(C18437z2.f56754h, zz9Z.zzJ4(zzbe.getType()));
        zzzyd.zzA("for", zz9Z.zzJf(zzbe.zzZF7()), "self");
        zzzyd.zz0("forName", zzbe.zzZF6());
        zzzyd.zzA("ptType", zz9Z.zzJh(zzbe.zzZF5()), "all");
    }
}
