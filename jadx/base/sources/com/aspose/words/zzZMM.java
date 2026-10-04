package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMM extends zzZS {
    private static zzZMM zzYwh = zzZ6D();

    private static String zzF(String str, int i) {
        return str.length() > i ? str.substring(0, i) : str;
    }

    private static zzZMM zzZ6D() {
        zzZMM zzzmm = new zzZMM();
        Boolean bool = Boolean.FALSE;
        zzzmm.add(21000, bool);
        zzzmm.add(21010, bool);
        zzzmm.add(21020, bool);
        zzzmm.add(21030, 20);
        Boolean bool2 = Boolean.TRUE;
        zzzmm.add(21040, bool2);
        zzzmm.add(21050, 0);
        zzzmm.add(21060, null);
        zzzmm.add(21070, 0);
        zzzmm.add(21080, bool2);
        zzzmm.add(21090, "");
        zzzmm.add(21100, "");
        zzzmm.add(21110, "");
        zzzmm.add(21112, bool);
        zzzmm.add(21120, "");
        zzzmm.add(21130, "");
        zzzmm.add(21132, bool);
        zzzmm.add(21140, "");
        zzzmm.add(21150, "");
        zzzmm.add(21160, 0);
        zzzmm.add(21170, 0);
        return zzzmm;
    }

    public final DropDownItemCollection getDropDownItems() {
        DropDownItemCollection dropDownItemCollection = (DropDownItemCollection) zzPj(21060);
        if (dropDownItemCollection != null) {
            return dropDownItemCollection;
        }
        DropDownItemCollection dropDownItemCollection2 = new DropDownItemCollection();
        zzQ(21060, dropDownItemCollection2);
        return dropDownItemCollection2;
    }

    public final boolean getEnabled() {
        return ((Boolean) zzPj(21080)).booleanValue();
    }

    public final String getEntryMacro() {
        return (String) zzPj(21090);
    }

    public final String getExitMacro() {
        return (String) zzPj(21100);
    }

    public final String getHelpText() {
        return (String) zzPj(21110);
    }

    public final String getName() {
        return (String) zzPj(21120);
    }

    public final String getStatusText() {
        return (String) zzPj(21130);
    }

    public final String getTextInputDefault() {
        return (String) zzPj(21140);
    }

    public final String getTextInputFormat() {
        return (String) zzPj(21150);
    }

    public final int getTextInputType() {
        return ((Integer) zzPj(21170)).intValue();
    }

    public final void setEnabled(boolean z) {
        zzQ(21080, Boolean.valueOf(z));
    }

    public final void setEntryMacro(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21090, zzF(str, 32));
    }

    public final void setExitMacro(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21100, zzF(str, 32));
    }

    public final void setHelpText(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21110, zzF(str, 255));
    }

    public final void setName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21120, zzF(str, 20));
    }

    public final void setStatusText(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21130, zzF(str, 138));
    }

    public final void setTextInputDefault(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21140, zzF(str, 255));
    }

    public final void setTextInputFormat(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(21150, zzF(str, 64));
    }

    public final void setTextInputType(int i) {
        zzQ(21170, Integer.valueOf(i));
    }

    public final void zzAV(int i) {
        zzQ(21070, Integer.valueOf(i));
    }

    public final void zzAW(int i) {
        zzQ(21050, Integer.valueOf(i));
    }

    public final void zzAX(int i) {
        zzQ(21030, Integer.valueOf(i));
    }

    public final void zzAY(int i) {
        zzQ(21160, Integer.valueOf(i));
    }

    public final void zzVA(boolean z) {
        zzQ(21020, Boolean.valueOf(z));
    }

    public final void zzVB(boolean z) {
        zzQ(21040, Boolean.valueOf(z));
    }

    public final void zzVC(boolean z) {
        zzQ(21132, Boolean.valueOf(z));
    }

    public final void zzVD(boolean z) {
        zzQ(21112, Boolean.valueOf(z));
    }

    public final void zzVE(boolean z) {
        zzQ(21000, Boolean.valueOf(z));
    }

    public final void zzVz(boolean z) {
        zzQ(21010, Boolean.valueOf(z));
    }

    public final int zzZ6E() {
        return ((Integer) zzPj(21070)).intValue();
    }

    public final int zzZ6F() {
        return ((Integer) zzPj(21050)).intValue();
    }

    public final boolean zzZ6G() {
        return ((Boolean) zzPj(21010)).booleanValue();
    }

    public final boolean zzZ6H() {
        return ((Boolean) zzPj(21020)).booleanValue();
    }

    public final int zzZ6I() {
        return ((Integer) zzPj(21030)).intValue();
    }

    public final boolean zzZ6J() {
        return ((Boolean) zzPj(21040)).booleanValue();
    }

    public final int zzZ6K() {
        return ((Integer) zzPj(21160)).intValue();
    }

    public final boolean zzZ6L() {
        return ((Boolean) zzPj(21132)).booleanValue();
    }

    public final boolean zzZ6M() {
        return ((Boolean) zzPj(21112)).booleanValue();
    }

    public final boolean zzZ6N() {
        return ((Boolean) zzPj(21000)).booleanValue();
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzYwh;
    }
}
