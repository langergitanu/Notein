package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW7 {
    private static boolean zzA(Document document) {
        return document.zzZqB() != 0;
    }

    private static boolean zzB(Document document) {
        ArrayList<String> arrayListZzXWD;
        return (document.getVbaProject() == null || (arrayListZzXWD = document.getVbaProject().zzXWD()) == null || arrayListZzXWD.size() <= 0) ? false : true;
    }

    private static com.aspose.words.internal.zz77 zzY(zzZXS zzzxs) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxs.zzZmf().zzZ(zzzxs.zzZme(), "vbaProject.bin", "application/vnd.ms-office.vbaProject", zzzxs.zzZmp().zzZkz());
        new com.aspose.words.internal.zzKD(zzzxs.getDocument().getVbaProject().zzXU3()).zzL(zz77VarZzZ.zzR1());
        return zz77VarZzZ;
    }

    public static void zzZ(zzZXS zzzxs) throws Exception {
        if (zzzxs.getDocument().hasMacros()) {
            com.aspose.words.internal.zz77 zz77VarZzY = zzY(zzzxs);
            zzZ(zzzxs, zz77VarZzY);
            zzY(zzzxs, zz77VarZzY);
        }
    }

    private static void zzZ(zzZXS zzzxs, com.aspose.words.internal.zz77 zz77Var) throws Exception {
        byte[] signature;
        Document document = zzzxs.getDocument();
        if (document.getVbaProject() == null || (signature = document.getVbaProject().getSignature()) == null) {
            return;
        }
        zzzxs.zzZmf().zzZ(zz77Var, "vbaProjectSignature.bin", "application/vnd.ms-office.vbaProjectSignature", zzzxs.zzZmp().zzZku()).zzR1().write(signature, 8, signature.length - 8);
    }

    private static void zzY(zzZXS zzzxs, com.aspose.words.internal.zz77 zz77Var) throws Exception {
        Document document = zzzxs.getDocument();
        if (zzA(document) || zzB(document)) {
            Ref<String> ref = new Ref<>(null);
            zzZYD zzzydZzY = zzzxs.zzY(zz77Var, "vbaData.xml", "application/vnd.ms-word.vbaData+xml", zzzxs.zzZmp().zzZkv(), ref);
            ref.get();
            zzzydZzY.zzNU("wne:vbaSuppData");
            zzZ(zzzxs.getDocument(), (com.aspose.words.internal.zzP) zzzydZzY);
            zzZ(zzzxs.getDocument(), (zzYU6) zzzydZzY);
            zzzydZzY.endDocument();
        }
    }

    private static void zzZ(Document document, com.aspose.words.internal.zzP zzp) {
        if (zzA(document)) {
            zzp.zzY("wne:docEvents");
            int iZzZqB = document.zzZqB();
            zzZ(iZzZqB, 1, "wne:eventDocNew", zzp);
            zzZ(iZzZqB, 2, "wne:eventDocOpen", zzp);
            zzZ(iZzZqB, 4, "wne:eventDocClose", zzp);
            zzZ(iZzZqB, 8, "wne:eventDocSync", zzp);
            zzZ(iZzZqB, 16, "wne:eventDocXmlAfterInsert", zzp);
            zzZ(iZzZqB, 32, "wne:eventDocXmlBeforeDelete", zzp);
            zzZ(iZzZqB, 256, "wne:eventDocContentControlAfterInsert", zzp);
            zzZ(iZzZqB, 512, "wne:eventDocContentControlBeforeDelete", zzp);
            zzZ(iZzZqB, 1024, "wne:eventDocContentControlOnExit", zzp);
            zzZ(iZzZqB, 2048, "wne:eventDocContentControlOnEnter", zzp);
            zzZ(iZzZqB, 4096, "wne:eventDocStoreUpdate", zzp);
            zzZ(iZzZqB, 8192, "wne:eventDocContentControlContentUpdate", zzp);
            zzZ(iZzZqB, 16384, "wne:eventDocBuildingBlockAfterInsert", zzp);
            zzp.zzp();
        }
    }

    private static void zzZ(Document document, zzYU6 zzyu6) {
        if (zzB(document)) {
            ArrayList<String> arrayListZzXWD = document.getVbaProject().zzXWD();
            zzyu6.zzY("wne:mcds");
            for (String str : arrayListZzXWD) {
                zzyu6.zzY("wne:mcd");
                zzyu6.zz0("wne:macroName", str.toUpperCase());
                zzyu6.zz0("wne:name", str);
                zzyu6.zz0("wne:bEncrypt", "00");
                zzyu6.zz0("wne:cmg", "56");
                zzyu6.zzp();
            }
            zzyu6.zzp();
        }
    }

    private static void zzZ(int i, int i2, String str, com.aspose.words.internal.zzP zzp) {
        if ((i & i2) != 0) {
            zzp.zzZ(str, (String) null);
        }
    }
}
