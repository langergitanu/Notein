package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOP {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\o", "\\d");

    public static int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return iZzTP != 1 ? 0 : 2;
        }
        return 1;
    }

    public static void zzT(Field field, boolean z) throws Exception {
        field.zzZgq().zzs("\\o", z);
    }

    public static void zzU(Field field, String str) throws Exception {
        field.zzZgq().zzZf("\\d", str);
    }

    public static void zzV(Field field, String str) throws Exception {
        field.zzZgq().zzB(zzm(field), str);
    }

    private static zzZP6 zzW(Field field, String str) {
        if (str == null) {
            return new zzZP4(field);
        }
        int type = field.getType();
        if (type == 38) {
            return new zzZOZ(field, ((FieldAsk) field).getBookmarkName(), str);
        }
        if (type == 39) {
            return new zzZP5(field, str);
        }
        throw zzZas();
    }

    private static IllegalStateException zzZas() {
        return new IllegalStateException("Wrong field type for this operation.");
    }

    public static String zzk(Field field) {
        return field.zzZgq().zzt("\\d", false);
    }

    public static boolean zzl(Field field) {
        return field.zzZgq().zzMj("\\o");
    }

    private static int zzm(Field field) {
        int type = field.getType();
        if (type == 38) {
            return 1;
        }
        if (type == 39) {
            return 0;
        }
        throw zzZas();
    }

    public static String zzn(Field field) {
        return field.zzZgq().zzDG(zzm(field));
    }

    public static zzZP6 zzo(Field field) {
        Document documentZzYBb = field.getStart().zzYBb();
        IFieldUserPromptRespondent userPromptRespondent = documentZzYBb.getFieldOptions().getUserPromptRespondent();
        if (userPromptRespondent == null) {
            return new zzZP4(field);
        }
        boolean z = zzl(field) && documentZzYBb.getMailMerge().zzYKf();
        if (z) {
            Ref<String> ref = new Ref<>(null);
            boolean zZzZ = documentZzYBb.getMailMerge().zzZ(field.getStart(), ref);
            String str = ref.get();
            if (zZzZ) {
                return zzW(field, str);
            }
        }
        String strRespond = userPromptRespondent.respond(zzn(field), zzk(field));
        if (z) {
            documentZzYBb.getMailMerge().zzT(field.getStart(), strRespond);
        }
        return zzW(field, strRespond);
    }
}
