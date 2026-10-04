package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataSet;
import java.util.ArrayList;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZSV implements zzH8 {
    private Object zzu3;

    public zzZSV(String str, zzZSW zzzsw) throws Exception {
        this(str, null, null, null, zzzsw);
    }

    private static void zzX(zzZOP zzzop, long j) throws Exception {
        if (zzzop == null) {
            return;
        }
        if (!zzzop.zzRG()) {
            throw new IllegalStateException("The stream does not support changing position.");
        }
        zzzop.zzU(j, 0);
    }

    private static Object zzZ(String str, String str2, zzZOP zzzop, zzZOP zzzop2, zzZSW zzzsw) throws Exception {
        DataSet dataSetZzZ;
        Document documentZzX;
        if (zzzsw == null) {
            zzzsw = zzZSW.zz6j;
        }
        zzZSW zzzsw2 = zzzsw;
        zzZOP zzzopZzX = zzX(str, zzzop);
        try {
            long position = zzzopZzX.zzRG() ? zzzopZzX.getPosition() : -1L;
            if (zzZYD.zzXk(str2) || zzzop2 != null) {
                dataSetZzZ = zzZ(zzzopZzX, str2, zzzop2);
                documentZzX = null;
            } else {
                documentZzX = zzZSN.zzX(zzzopZzX, false);
                dataSetZzZ = zzR6.zzZ(documentZzX);
                zzR4.zzZ(dataSetZzZ);
            }
            Object objZzZ = zzZ(dataSetZzZ, zzzopZzX, position, documentZzX, zzzsw2);
            if (zzzopZzX != zzzop) {
                zzzopZzX.close();
            }
            return objZzZ;
        } finally {
        }
    }

    @Override // com.aspose.words.internal.zzH8
    public final Object zzRt() {
        return this.zzu3;
    }

    public zzZSV(zzZOP zzzop, zzZSW zzzsw) throws Exception {
        this(null, null, zzzop, null, zzzsw);
    }

    public zzZSV(String str, String str2, zzZSW zzzsw) throws Exception {
        this(str, str2, null, null, zzzsw);
    }

    public zzZSV(zzZOP zzzop, zzZOP zzzop2, zzZSW zzzsw) throws Exception {
        this(null, null, zzzop, zzzop2, zzzsw);
    }

    private static zzZOP zzX(String str, zzZOP zzzop) throws Exception {
        return !zzZKN.zzU3(str) ? zzZOU.zzVj(str) : zzzop;
    }

    private zzZSV(String str, String str2, zzZOP zzzop, zzZOP zzzop2, zzZSW zzzsw) throws Exception {
        zzZKN.zzU3(str);
        this.zzu3 = zzZ(str, str2, zzzop, zzzop2, zzzsw);
    }

    private static Object zzZ(DataSet dataSet, zzZOP zzzop, long j, Document document, zzZSW zzzsw) throws Exception {
        if (dataSet.getTables().getCount() == 0) {
            return new ArrayList();
        }
        if (!zzzsw.getAlwaysGenerateRootObject() && dataSet.getTables().get(0).getRows().getCount() != 1) {
            return dataSet.getTables().get(0);
        }
        zzX(zzzop, j);
        if (document == null) {
            document = zzZSN.zzX(zzzop, false);
        }
        return zzR6.zzZ(dataSet, document, zzzsw.getAlwaysGenerateRootObject(), true);
    }

    private static DataSet zzZ(zzZOP zzzop, String str, zzZOP zzzop2) throws Exception {
        zzZOP zzzopZzX = zzX(str, zzzop2);
        try {
            DataSet dataSet = new DataSet();
            dataSet.readXmlSchema(zzzopZzX);
            dataSet.readXml(zzzop);
            dataSet.setDataSetName(dataSet.getDataSetName() + "_320fb408a82d4bb28501c84241f52bab");
            return dataSet;
        } finally {
            if (zzzopZzX != zzzop2) {
                zzzopZzX.close();
            }
        }
    }
}
