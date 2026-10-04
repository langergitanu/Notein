package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ67 extends zzZ6C {
    public zzZ67(zzYMD zzymd) throws Exception {
        super(zzymd);
        if (zzymd instanceof zzY9Y) {
            ((zzY9Y) zzymd).zzY5a();
        }
    }

    private StructuredDocumentTag zzYRv() {
        return ((zzY9Y) this.zzYgm).zzYRv();
    }

    @Override // com.aspose.words.zzZ6C
    public final int getMaxLength() {
        return 0;
    }

    @Override // com.aspose.words.zzZ6C
    public final String getName() {
        return Integer.toString(zzYRv().getId());
    }

    @Override // com.aspose.words.zzZ6C
    public final int getSelectedIndex() throws Exception {
        if (zzYRH() == 2) {
            return zzYRv().getListItems().getSelectedIndex();
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ6C
    public final long getSize() throws Exception {
        int iZzYRH = zzYRH();
        if (iZzYRH != 0) {
            if (iZzYRH == 1) {
                int size = ((zzYAU) (zz14().zzZ1s() == 2 ? zz14() : zz14().zzY7o()).zz5Z()).zzY6N().getSize();
                return com.aspose.words.internal.zzSA.zzE(com.aspose.words.internal.zzZPX.zzZm(size, size));
            }
            if (iZzYRH != 2) {
                throw new IllegalStateException("Unknown control type.");
            }
        }
        zzZ55 zzz55 = (zzZ55) zz14().zzZZJ();
        zzYAU zzyauZz14 = zz14().zzZ1s() == 2 ? zz14() : zz14().zzY7o();
        zzYAU zzyauZz142 = zz14().zzZ1s() == 3 ? zz14() : zz14().zzY7o();
        return com.aspose.words.internal.zzSA.zzE(com.aspose.words.internal.zzZPX.zzZm((((zzZ55) zzyauZz142.zzZZJ()) != ((zzZ55) zzyauZz14.zzZZJ()) ? ((zzZ55) zzyauZz14.zzZZJ()).getWidth() : zzyauZz142.getRight()) - zzyauZz14.getX(), zzz55.getContentHeight()));
    }

    @Override // com.aspose.words.zzZ6C
    public final boolean isEnabled() {
        return !zzYRv().getLockContents();
    }

    @Override // com.aspose.words.zzZ6C
    public final String zzYQ() {
        return "";
    }

    @Override // com.aspose.words.zzZ6C
    public final String zzYR() throws Exception {
        return zzYRH() == 0 ? zzYRv().getText().replace(ControlChar.LINE_BREAK, ControlChar.PARAGRAPH_BREAK) : "";
    }

    @Override // com.aspose.words.zzZ6C
    public final int zzYRH() throws Exception {
        return ((zzY9Y) this.zzYgm).zzYRH();
    }

    @Override // com.aspose.words.zzZ6H
    public final com.aspose.words.internal.zzZQ4 zzYTP() throws Exception {
        return new com.aspose.words.internal.zzZQ4(super.zzYTP().getX(), super.zzYTP().getY(), Float.intBitsToFloat((int) getSize()), super.zzYTP().getHeight());
    }

    @Override // com.aspose.words.zzZ6C
    public final ArrayList<String> zzZA() throws Exception {
        if (zzYRH() != 2) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < zzYRv().getListItems().getCount(); i++) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzYRv().getListItems().get(i).getDisplayText());
        }
        return arrayList;
    }
}
