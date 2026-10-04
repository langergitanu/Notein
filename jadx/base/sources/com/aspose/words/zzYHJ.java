package com.aspose.words;

import android.os.Bundle;
import com.orion.notein.domain.models.transactions.TransactionsConstants;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHJ {
    private static String zzF(short s) {
        return new String(com.aspose.words.internal.zzZYD.zzD((byte) (s >> 8))).concat(new String(com.aspose.words.internal.zzZYD.zzD((byte) (s & 255))));
    }

    public static void zzV(zzYEM zzyem) throws Exception {
        zzYLV zzylvZzYgu = zzyem.zzYgu();
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (zzylvZzYgu.getCount() <= 0) {
            return;
        }
        zzyhzZzYfW.zzFg();
        zzyhzZzYfW.zzCC("\\*\\protusertbl");
        for (int i = 0; i < zzylvZzYgu.getCount(); i++) {
            zzyhzZzYfW.zzYj5();
            zzyhzZzYfW.zzYV(zzylvZzYgu.get(i));
            zzyhzZzYfW.zzYj4();
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String zzY(zzYEM zzyem, EditableRangeStart editableRangeStart) {
        return OooO0O0.OooO00o.OooO0O0(com.aspose.words.internal.zzZYD.zzXk(editableRangeStart.getSingleUser()) ? Bundle.getInt(zzj((byte) (zzyem.zzYgu().add(editableRangeStart.getSingleUser()) + 1))) : zzYHN.zzoX(editableRangeStart.getEditorGroup()), "0100", zzF((short) editableRangeStart.getId()), TransactionsConstants.API_RESULT_SUCCESS);
    }

    public static void zzZ(zzYEM zzyem, EditableRangeStart editableRangeStart) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzYj5();
        zzyhzZzYfW.zzCD("\\*\\protstart");
        zzyhzZzYfW.zzYV(zzY(zzyem, editableRangeStart));
        if (editableRangeStart.isColumn()) {
            zzyhzZzYfW.zzZ5("\\bkmkcolf", editableRangeStart.getFirstColumn());
            zzyhzZzYfW.zzZ5("\\bkmkcoll", editableRangeStart.getLastColumn() + 1);
        }
        zzyhzZzYfW.zzYj4();
    }

    private static String zzj(byte b) {
        return new String(com.aspose.words.internal.zzZYD.zzD((byte) (b & 255)));
    }

    public static void zzZ(zzYEM zzyem, EditableRangeEnd editableRangeEnd) throws Exception {
        EditableRangeStart editableRangeStart = editableRangeEnd.getEditableRangeStart();
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (editableRangeStart != null) {
            zzyhzZzYfW.zzYj5();
            zzyhzZzYfW.zzCD("\\*\\protend");
            zzyhzZzYfW.zzYV(zzY(zzyem, editableRangeStart));
            zzyhzZzYfW.zzYj4();
        }
    }
}
