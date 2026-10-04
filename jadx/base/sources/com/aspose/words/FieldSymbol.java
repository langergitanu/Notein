package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldSymbol extends Field implements zzZBA {
    private static com.aspose.words.internal.zzZO0 zzYBM = com.aspose.words.internal.zzZO0.zzQz(1252);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\a", "\\h", "\\j", "\\u", "\\f", "\\s");

    private double zzZc5() {
        return zzZgq().zzMb("\\s");
    }

    private boolean zzZc6() {
        String characterCode = getCharacterCode();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzS(characterCode, "0x", i) || com.aspose.words.internal.zzZKN.zzS(getCharacterCode(), "0X", i);
    }

    private int zzZc7() {
        return zzZc6() ? com.aspose.words.internal.zzJB.zzZc(getCharacterCode().substring(2)) : com.aspose.words.internal.zzJB.zzZo(getCharacterCode());
    }

    private Inline zzZc8() {
        Iterator<Node> it = zzZgG().iterator();
        while (it.hasNext()) {
            Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
            if (inline != null) {
                return inline;
            }
        }
        return null;
    }

    private String zzZc9() {
        int iZzZc7;
        return (zzZgq().zzDI(0) && (iZzZc7 = zzZc7()) > 0) ? !isUnicode() ? iZzZc7 > 255 ? "###" : new String(zzYBM.zzYO(new byte[]{(byte) iZzZc7})) : Character.toString((char) iZzZc7) : "###";
    }

    public String getCharacterCode() {
        return zzZgq().zzDG(0);
    }

    public boolean getDontAffectsLineSpacing() {
        return zzZgq().zzMj("\\h");
    }

    public String getFontName() {
        return zzZgq().zzt("\\f", false);
    }

    public String getFontSize() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3) {
            return 1;
        }
        return (iZzTP == 4 || iZzTP == 5) ? 2 : 0;
    }

    public boolean isAnsi() {
        return zzZgq().zzMj("\\a");
    }

    public boolean isShiftJis() {
        return zzZgq().zzMj("\\j");
    }

    public boolean isUnicode() {
        return zzZgq().zzMj("\\u");
    }

    public void setCharacterCode(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setDontAffectsLineSpacing(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setFontName(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setFontSize(String str) throws Exception {
        zzZgq().zzZd("\\s", str);
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() {
        Inline inlineZzZc8 = zzZc8();
        zzYMX zzymx = null;
        zzYEF zzyef = inlineZzZc8 != null ? (zzYEF) inlineZzZc8.zzZYh().zzbn() : null;
        if (inlineZzZc8 != null && inlineZzZc8.getParentParagraph() != null) {
            zzymx = (zzYMX) inlineZzZc8.getParentParagraph().zzZYj().zzbn();
        }
        Run run = new Run(getStart().getDocument(), zzZc9(), zzyef);
        new Paragraph(getStart().getDocument(), zzymx, new zzYEF()).appendChild(run);
        if (com.aspose.words.internal.zzZYD.zzXk(getFontName())) {
            run.getFont().setName(getFontName());
        }
        if (zzZc5() > 0.0d) {
            run.getFont().setSize(zzZc5());
        }
        return new zzYWB(run, run);
    }

    public void isAnsi(boolean z) throws Exception {
        zzZgq().zzs("\\a", z);
    }

    public void isShiftJis(boolean z) throws Exception {
        zzZgq().zzs("\\j", z);
    }

    public void isUnicode(boolean z) throws Exception {
        zzZgq().zzs("\\u", z);
    }
}
