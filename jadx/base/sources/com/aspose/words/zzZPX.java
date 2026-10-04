package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPX {
    private static void zzU(List list) {
        zzZ(list, 0, 0, "\u0000.");
        zzZ(list, 1, 0, "\u0000.\u0001.");
        zzZ(list, 2, 0, "\u0000.\u0001.\u0002.");
        zzZ(list, 3, 0, "\u0000.\u0001.\u0002.\u0003.");
        zzZ(list, 4, 0, "\u0000.\u0001.\u0002.\u0003.\u0004.");
        zzZ(list, 5, 0, "\u0000.\u0001.\u0002.\u0003.\u0004.\u0005.");
        zzZ(list, 6, 0, "\u0000.\u0001.\u0002.\u0003.\u0004.\u0005.\u0006.");
        zzZ(list, 7, 0, "\u0000.\u0001.\u0002.\u0003.\u0004.\u0005.\u0006.\u0007.");
        zzZ(list, 8, 0, "\u0000.\u0001.\u0002.\u0003.\u0004.\u0005.\u0006.\u0007.\b.");
    }

    private static void zzV(List list) {
        zzZ(list, 0, 0, "\u0000)");
        zzZ(list, 1, 4, "\u0001)");
        zzZ(list, 2, 2, "\u0002)");
        zzZ(list, 3, 0, "(\u0003)");
        zzZ(list, 4, 4, "(\u0004)");
        zzZ(list, 5, 2, "(\u0005)");
        zzZ(list, 6, 0, "\u0006.");
        zzZ(list, 7, 4, "\u0007.");
        zzZ(list, 8, 2, "\b.");
    }

    private static List zzY(DocumentBase documentBase, zzZ4J zzz4j, int i) {
        if (zzz4j != null) {
            return new List(zzz4j, i);
        }
        List list = new List(new zzZ4J(documentBase, -1, 1, 0), i);
        zzZ(list, 0, 1, "\u0000.", false);
        zzZ(list, 1, 3, "\u0001.", false);
        zzZ(list, 2, 0, "\u0002.", false);
        zzZ(list, 3, 4, "\u0003)", false);
        zzZ(list, 4, 0, "(\u0004)", false);
        zzZ(list, 5, 4, "(\u0005)", false);
        zzZ(list, 6, 2, "(\u0006)", false);
        zzZ(list, 7, 4, "(\u0007)", false);
        zzZ(list, 8, 2, "(\b)", false);
        return list;
    }

    public static List zzZ(DocumentBase documentBase, zzZ4J zzz4j, int i) {
        List listZzY = zzY(documentBase, zzz4j, 0);
        if (i == 1) {
            zzV(listZzY);
            return listZzY;
        }
        if (i == 2) {
            return listZzY;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: listType");
        }
        zzU(listZzY);
        return listZzY;
    }

    public static List zzZ(DocumentBase documentBase, zzZ4J zzz4j, int i, char c, boolean z, int i2) {
        List listZzY = zzY(documentBase, zzz4j, 1);
        if (i == 1) {
            zzZ(listZzY, c, i2);
            return listZzY;
        }
        if (i == 2) {
            return listZzY;
        }
        if (i == 3) {
            zzZ(listZzY, c, z, i2);
            return listZzY;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: listType");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Class, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Class, java.lang.String] */
    private static void zzZ(List list, char c, int i) {
        zzZ(list, 0, i, (String) Class.forName("\u0000"));
        zzZ(list, 1, i, (String) Class.forName("\u0001"));
        zzZ(list, 2, i, (String) Class.forName("\u0002"));
        zzZ(list, 3, i, (String) Class.forName("\u0003"));
        zzZ(list, 4, i, (String) Class.forName("\u0004"));
        zzZ(list, 5, i, (String) Class.forName("\u0005"));
        zzZ(list, 6, i, (String) Class.forName("\u0006"));
        zzZ(list, 7, i, (String) Class.forName("\u0007"));
        zzZ(list, 8, i, (String) Class.forName("\b"));
    }

    private static void zzZ(List list, char c, boolean z, int i) {
        Character chValueOf = Character.valueOf(c);
        Character ch = z ? chValueOf : null;
        zzZ(list, 0, i, com.aspose.words.internal.zzZKN.format("\u0000{0}", ch));
        zzZ(list, 1, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{1}", chValueOf, ch));
        zzZ(list, 2, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{1}", chValueOf, ch));
        zzZ(list, 3, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{0}\u0003{1}", chValueOf, ch));
        zzZ(list, 4, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{0}\u0003{0}\u0004{1}", chValueOf, ch));
        zzZ(list, 5, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{0}\u0003{0}\u0004{0}\u0005{1}", chValueOf, ch));
        zzZ(list, 6, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{0}\u0003{0}\u0004{0}\u0005{0}\u0006{1}", chValueOf, ch));
        zzZ(list, 7, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{0}\u0003{0}\u0004{0}\u0005{0}\u0006{0}\u0007{1}", chValueOf, ch));
        zzZ(list, 8, i, com.aspose.words.internal.zzZKN.format("\u0000{0}\u0001{0}\u0002{0}\u0003{0}\u0004{0}\u0005{0}\u0006{0}\u0007{0}\b{1}", chValueOf, ch));
    }

    private static void zzZ(List list, int i, int i2, String str) {
        zzZ(list, i, i2, str, true);
    }

    private static void zzZ(List list, int i, int i2, String str, boolean z) {
        ListLevel listLevel;
        if (z) {
            zzZ4B zzz4b = new zzZ4B(list.getDocument(), i);
            zzz4b.zzYbW = true;
            list.zzYPb().zzZ(zzz4b);
            listLevel = zzz4b.getListLevel();
        } else {
            listLevel = list.getListLevels().get(i);
        }
        zzZ4C.zzZ(listLevel, i, i2, str, 0, 0, 0, 0, StyleIdentifier.NIL, 2);
    }
}
